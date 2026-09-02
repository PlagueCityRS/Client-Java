package jagex2.io;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

import deob.ObfuscatedName;
import deob.client.GameShell;
import sign.signlink;

@ObfuscatedName("ABBBHPCA")
public final class ClientStream implements Runnable {

	@ObfuscatedName("ABBBHPCA.c")
	public final InputStream in;

	@ObfuscatedName("ABBBHPCA.d")
	public final OutputStream out;

	@ObfuscatedName("ABBBHPCA.e")
	public final Socket socket;

	@ObfuscatedName("ABBBHPCA.f")
	public boolean dummy = false;

	@ObfuscatedName("ABBBHPCA.k")
	public boolean writer = false;

	@ObfuscatedName("ABBBHPCA.j")
	public int tnum;

	@ObfuscatedName("ABBBHPCA.l")
	public boolean ioerror = false;

	@ObfuscatedName("ABBBHPCA.a")
	public final byte field1 = 1;

	@ObfuscatedName("ABBBHPCA.b")
	public boolean field2 = false;

	@ObfuscatedName("ABBBHPCA.g")
	public final GameShell shell;

	@ObfuscatedName("ABBBHPCA.h")
	public byte[] data;

	@ObfuscatedName("ABBBHPCA.i")
	public int tcycl;

	public ClientStream(int arg0, GameShell arg1, Socket arg2) throws IOException {
		try {
			this.shell = arg1;
			this.socket = arg2;
			this.socket.setSoTimeout(30000);
			this.socket.setTcpNoDelay(true);
			this.in = this.socket.getInputStream();
			this.out = this.socket.getOutputStream();
		} catch (RuntimeException var5) {
			signlink.reporterror("457, " + ", " + arg1 + ", " + arg2 + ", " + var5.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("ABBBHPCA.a()V")
	public void close() {
		this.dummy = true;
		try {
			if (this.in != null) {
				this.in.close();
			}
			if (this.out != null) {
				this.out.close();
			}
			if (this.socket != null) {
				this.socket.close();
			}
		} catch (IOException var3) {
			System.out.println("Error closing stream");
		}
		this.writer = false;
		synchronized (this) {
			this.notify();
		}
		this.data = null;
	}

	@ObfuscatedName("ABBBHPCA.b()I")
	public int read() throws IOException {
		return this.dummy ? 0 : this.in.read();
	}

	@ObfuscatedName("ABBBHPCA.c()I")
	public int available() throws IOException {
		return this.dummy ? 0 : this.in.available();
	}

	@ObfuscatedName("ABBBHPCA.a([BII)V")
	public void read(byte[] arg0, int arg1, int arg2) throws IOException {
		if (this.dummy) {
			return;
		}
		while (arg2 > 0) {
			int var4 = this.in.read(arg0, arg1, arg2);
			if (var4 <= 0) {
				throw new IOException("EOF");
			}
			arg1 += var4;
			arg2 -= var4;
		}
	}

	@ObfuscatedName("ABBBHPCA.a(I[BIB)V")
	public void write(byte[] arg0, int arg1, byte arg2) throws IOException {
		try {
			if (this.field1 == 1) {
				boolean var9 = false;
			} else {
				this.field2 = !this.field2;
			}
			if (!this.dummy) {
				if (this.ioerror) {
					this.ioerror = false;
					throw new IOException("Error in writer thread");
				}
				if (this.data == null) {
					this.data = new byte[5000];
				}
				synchronized (this) {
					for (int var5 = 0; var5 < arg1; var5++) {
						this.data[this.tnum] = arg0[var5];
						this.tnum = (this.tnum + 1) % 5000;
						if (this.tnum == (this.tcycl + 4900) % 5000) {
							throw new IOException("buffer overflow");
						}
					}
					if (!this.writer) {
						this.writer = true;
						this.shell.startThread(this, 3);
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
		while (this.writer) {
			int var2;
			int var3;
			synchronized (this) {
				if (this.tnum == this.tcycl) {
					try {
						this.wait();
					} catch (InterruptedException var6) {
					}
				}
				if (!this.writer) {
					return;
				}
				var2 = this.tcycl;
				if (this.tnum >= this.tcycl) {
					var3 = this.tnum - this.tcycl;
				} else {
					var3 = 5000 - this.tcycl;
				}
			}
			if (var3 > 0) {
				try {
					this.out.write(this.data, var2, var3);
				} catch (IOException var5) {
					this.ioerror = true;
				}
				this.tcycl = (this.tcycl + var3) % 5000;
				try {
					if (this.tnum == this.tcycl) {
						this.out.flush();
					}
				} catch (IOException var4) {
					this.ioerror = true;
				}
			}
		}
	}

	@ObfuscatedName("ABBBHPCA.a(B)V")
	public void debug() {
		try {
			System.out.println("dummy:" + this.dummy);
			System.out.println("tcycl:" + this.tcycl);
			System.out.println("tnum:" + this.tnum);
			System.out.println("writer:" + this.writer);
			System.out.println("ioerror:" + this.ioerror);
			try {
				System.out.println("available:" + this.available());
			} catch (IOException var2) {
			}
		} catch (RuntimeException var3) {
			signlink.reporterror("10855, " + -34 + ", " + var3.toString());
			throw new RuntimeException();
		}
	}
}
