package deob;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import sign.signlink;

@ObfuscatedName("ABBBHPCA")
public final class class1 implements Runnable {

	@ObfuscatedName("ABBBHPCA.a")
	public final byte field1 = 1;

	@ObfuscatedName("ABBBHPCA.b")
	public boolean field2 = false;

	@ObfuscatedName("ABBBHPCA.f")
	public boolean field6 = false;

	@ObfuscatedName("ABBBHPCA.k")
	public boolean field11 = false;

	@ObfuscatedName("ABBBHPCA.l")
	public boolean field12 = false;

	@ObfuscatedName("ABBBHPCA.g")
	public final class4 field7;

	@ObfuscatedName("ABBBHPCA.e")
	public final Socket field5;

	@ObfuscatedName("ABBBHPCA.c")
	public final InputStream field3;

	@ObfuscatedName("ABBBHPCA.d")
	public final OutputStream field4;

	@ObfuscatedName("ABBBHPCA.j")
	public int field10;

	@ObfuscatedName("ABBBHPCA.i")
	public int field9;

	@ObfuscatedName("ABBBHPCA.h")
	public byte[] field8;

	public class1(int arg0, class4 arg1, Socket arg2) throws IOException {
		try {
			this.field7 = arg1;
			this.field5 = arg2;
			this.field5.setSoTimeout(30000);
			this.field5.setTcpNoDelay(true);
			this.field3 = this.field5.getInputStream();
			this.field4 = this.field5.getOutputStream();
		} catch (RuntimeException var5) {
			signlink.reporterror("457, " + ", " + arg1 + ", " + arg2 + ", " + var5.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("ABBBHPCA.a()V")
	public void method1() {
		this.field6 = true;
		try {
			if (this.field3 != null) {
				this.field3.close();
			}
			if (this.field4 != null) {
				this.field4.close();
			}
			if (this.field5 != null) {
				this.field5.close();
			}
		} catch (IOException var3) {
			System.out.println("Error closing stream");
		}
		this.field11 = false;
		synchronized (this) {
			this.notify();
		}
		this.field8 = null;
	}

	@ObfuscatedName("ABBBHPCA.b()I")
	public int method2() throws IOException {
		return this.field6 ? 0 : this.field3.read();
	}

	@ObfuscatedName("ABBBHPCA.c()I")
	public int method3() throws IOException {
		return this.field6 ? 0 : this.field3.available();
	}

	@ObfuscatedName("ABBBHPCA.a([BII)V")
	public void method4(byte[] arg0, int arg1, int arg2) throws IOException {
		if (this.field6) {
			return;
		}
		while (arg2 > 0) {
			int var4 = this.field3.read(arg0, arg1, arg2);
			if (var4 <= 0) {
				throw new IOException("EOF");
			}
			arg1 += var4;
			arg2 -= var4;
		}
	}

	@ObfuscatedName("ABBBHPCA.a(I[BIB)V")
	public void method5(byte[] arg0, int arg1, byte arg2) throws IOException {
		try {
			if (this.field1 == 1) {
				boolean var9 = false;
			} else {
				this.field2 = !this.field2;
			}
			if (!this.field6) {
				if (this.field12) {
					this.field12 = false;
					throw new IOException("Error in writer thread");
				}
				if (this.field8 == null) {
					this.field8 = new byte[5000];
				}
				synchronized (this) {
					for (int var5 = 0; var5 < arg1; var5++) {
						this.field8[this.field10] = arg0[var5];
						this.field10 = (this.field10 + 1) % 5000;
						if (this.field10 == (this.field9 + 4900) % 5000) {
							throw new IOException("buffer overflow");
						}
					}
					if (!this.field11) {
						this.field11 = true;
						this.field7.method23(this, 3);
					}
					this.notify();
				}
			}
		} catch (RuntimeException var8) {
			signlink.reporterror("65660, " + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + var8.toString());
			throw new RuntimeException();
		}
	}

	@Override
	public void run() {
		while (this.field11) {
			int var2;
			int var3;
			synchronized (this) {
				if (this.field10 == this.field9) {
					try {
						this.wait();
					} catch (InterruptedException var6) {
					}
				}
				if (!this.field11) {
					return;
				}
				var2 = this.field9;
				if (this.field10 >= this.field9) {
					var3 = this.field10 - this.field9;
				} else {
					var3 = 5000 - this.field9;
				}
			}
			if (var3 > 0) {
				try {
					this.field4.write(this.field8, var2, var3);
				} catch (IOException var5) {
					this.field12 = true;
				}
				this.field9 = (this.field9 + var3) % 5000;
				try {
					if (this.field10 == this.field9) {
						this.field4.flush();
					}
				} catch (IOException var4) {
					this.field12 = true;
				}
			}
		}
	}

	@ObfuscatedName("ABBBHPCA.a(B)V")
	public void method6() {
		try {
			System.out.println("dummy:" + this.field6);
			System.out.println("tcycl:" + this.field9);
			System.out.println("tnum:" + this.field10);
			System.out.println("writer:" + this.field11);
			System.out.println("ioerror:" + this.field12);
			try {
				System.out.println("available:" + this.method3());
			} catch (IOException var2) {
			}
		} catch (RuntimeException var3) {
			signlink.reporterror("10855, " + -34 + ", " + var3.toString());
			throw new RuntimeException();
		}
	}
}
