package deob;

import java.io.IOException;
import java.io.RandomAccessFile;
import sign.signlink;

@ObfuscatedName("BDNJGDVN")
public final class class7 {

	@ObfuscatedName("BDNJGDVN.b")
	public static final byte[] field144 = new byte[520];

	@ObfuscatedName("BDNJGDVN.a")
	public final boolean field143 = true;

	@ObfuscatedName("BDNJGDVN.f")
	public int field148 = 65000;

	@ObfuscatedName("BDNJGDVN.e")
	public final int field147;

	@ObfuscatedName("BDNJGDVN.c")
	public final RandomAccessFile field145;

	@ObfuscatedName("BDNJGDVN.d")
	public final RandomAccessFile field146;

	public class7(RandomAccessFile arg0, byte arg1, RandomAccessFile arg2, int arg3, int arg4) {
		try {
			this.field147 = arg3;
			this.field145 = arg0;
			this.field146 = arg2;
			this.field148 = 500000;
		} catch (RuntimeException var7) {
			signlink.reporterror("39067, " + arg0 + ", " + 6 + ", " + arg2 + ", " + arg3 + ", " + 500000 + ", " + var7.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("BDNJGDVN.a(IB)[B")
	public synchronized byte[] method31(int arg0) {
		try {
			try {
				this.method34(arg0 * 6, this.field146);
				int var3;
				for (int var2 = 0; var2 < 6; var2 += var3) {
					var3 = this.field146.read(field144, var2, 6 - var2);
					if (var3 == -1) {
						return null;
					}
				}
				int var4 = ((field144[0] & 0xFF) << 16) + ((field144[1] & 0xFF) << 8) + (field144[2] & 0xFF);
				int var5 = ((field144[3] & 0xFF) << 16) + ((field144[4] & 0xFF) << 8) + (field144[5] & 0xFF);
				if (var4 < 0 || var4 > this.field148) {
					return null;
				} else if (var5 > 0 && (long) var5 <= this.field145.length() / 520L) {
					byte[] var6 = new byte[var4];
					int var7 = 0;
					int var8 = 0;
					while (var7 < var4) {
						if (var5 == 0) {
							return null;
						}
						this.method34(var5 * 520, this.field145);
						int var9 = 0;
						int var10 = var4 - var7;
						if (var10 > 512) {
							var10 = 512;
						}
						while (var9 < var10 + 8) {
							int var11 = this.field145.read(field144, var9, var10 + 8 - var9);
							if (var11 == -1) {
								return null;
							}
							var9 += var11;
						}
						int var12 = ((field144[0] & 0xFF) << 8) + (field144[1] & 0xFF);
						int var13 = ((field144[2] & 0xFF) << 8) + (field144[3] & 0xFF);
						int var14 = ((field144[4] & 0xFF) << 16) + ((field144[5] & 0xFF) << 8) + (field144[6] & 0xFF);
						int var15 = field144[7] & 0xFF;
						if (var12 == arg0 && var13 == var8 && var15 == this.field147) {
							if (var14 >= 0 && (long) var14 <= this.field145.length() / 520L) {
								for (int var16 = 0; var16 < var10; var16++) {
									var6[var7++] = field144[var16 + 8];
								}
								var5 = var14;
								var8++;
								continue;
							}
							return null;
						}
						return null;
					}
					return var6;
				} else {
					return null;
				}
			} catch (IOException var18) {
				return null;
			}
		} catch (RuntimeException var19) {
			signlink.reporterror("43317, " + arg0 + ", " + -50 + ", " + var19.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("BDNJGDVN.a(I[BBI)Z")
	public synchronized boolean method32(int arg0, byte[] arg1, int arg2) {
		try {
			boolean var4 = this.method33(arg2, arg1, true, arg0);
			if (!var4) {
				var4 = this.method33(arg2, arg1, false, arg0);
			}
			return var4;
		} catch (RuntimeException var6) {
			signlink.reporterror("23130, " + arg0 + ", " + arg1 + ", " + -5 + ", " + arg2 + ", " + var6.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("BDNJGDVN.a(ZI[BZI)Z")
	public synchronized boolean method33(int arg0, byte[] arg1, boolean arg2, int arg3) {
		try {
			try {
				int var7;
				if (arg2) {
					this.method34(arg0 * 6, this.field146);
					int var6;
					for (int var5 = 0; var5 < 6; var5 += var6) {
						var6 = this.field146.read(field144, var5, 6 - var5);
						if (var6 == -1) {
							return false;
						}
					}
					var7 = ((field144[3] & 0xFF) << 16) + ((field144[4] & 0xFF) << 8) + (field144[5] & 0xFF);
					if (var7 <= 0 || (long) var7 > this.field145.length() / 520L) {
						return false;
					}
				} else {
					var7 = (int) ((this.field145.length() + 519L) / 520L);
					if (var7 == 0) {
						var7 = 1;
					}
				}
				field144[0] = (byte) (arg3 >> 16);
				field144[1] = (byte) (arg3 >> 8);
				field144[2] = (byte) arg3;
				field144[3] = (byte) (var7 >> 16);
				field144[4] = (byte) (var7 >> 8);
				field144[5] = (byte) var7;
				this.method34(arg0 * 6, this.field146);
				this.field146.write(field144, 0, 6);
				int var8 = 0;
				int var9 = 0;
				while (var8 < arg3) {
					int var10 = 0;
					if (arg2) {
						this.method34(var7 * 520, this.field145);
						int var11;
						int var12;
						for (var11 = 0; var11 < 8; var11 += var12) {
							var12 = this.field145.read(field144, var11, 8 - var11);
							if (var12 == -1) {
								break;
							}
						}
						if (var11 == 8) {
							int var13 = ((field144[0] & 0xFF) << 8) + (field144[1] & 0xFF);
							int var14 = ((field144[2] & 0xFF) << 8) + (field144[3] & 0xFF);
							var10 = ((field144[4] & 0xFF) << 16) + ((field144[5] & 0xFF) << 8) + (field144[6] & 0xFF);
							int var15 = field144[7] & 0xFF;
							if (var13 != arg0 || var14 != var9 || var15 != this.field147) {
								return false;
							}
							if (var10 < 0 || (long) var10 > this.field145.length() / 520L) {
								return false;
							}
						}
					}
					if (var10 == 0) {
						arg2 = false;
						var10 = (int) ((this.field145.length() + 519L) / 520L);
						if (var10 == 0) {
							var10++;
						}
						if (var10 == var7) {
							var10++;
						}
					}
					if (arg3 - var8 <= 512) {
						var10 = 0;
					}
					field144[0] = (byte) (arg0 >> 8);
					field144[1] = (byte) arg0;
					field144[2] = (byte) (var9 >> 8);
					field144[3] = (byte) var9;
					field144[4] = (byte) (var10 >> 16);
					field144[5] = (byte) (var10 >> 8);
					field144[6] = (byte) var10;
					field144[7] = (byte) this.field147;
					this.method34(var7 * 520, this.field145);
					this.field145.write(field144, 0, 8);
					int var16 = arg3 - var8;
					if (var16 > 512) {
						var16 = 512;
					}
					this.field145.write(arg1, var8, var16);
					var8 += var16;
					var7 = var10;
					var9++;
				}
				return true;
			} catch (IOException var18) {
				return false;
			}
		} catch (RuntimeException var19) {
			signlink.reporterror("7921, " + true + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + var19.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("BDNJGDVN.a(IILjava/io/RandomAccessFile;)V")
	public synchronized void method34(int arg0, RandomAccessFile arg1) throws IOException {
		try {
			if (arg0 < 0 || arg0 > 62914560) {
				System.out.println("Badseek - pos:" + arg0 + " len:" + arg1.length());
				arg0 = 62914560;
				try {
					Thread.sleep(1000L);
				} catch (Exception var4) {
				}
			}
			arg1.seek((long) arg0);
		} catch (RuntimeException var5) {
			signlink.reporterror("64834, " + arg0 + ", " + -206 + ", " + arg1 + ", " + var5.toString());
			throw new RuntimeException();
		}
	}
}
