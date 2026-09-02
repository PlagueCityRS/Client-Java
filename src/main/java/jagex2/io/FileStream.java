package jagex2.io;

import java.io.IOException;
import java.io.RandomAccessFile;

import deob.ObfuscatedName;
import sign.signlink;

@ObfuscatedName("BDNJGDVN")
public final class FileStream {

	@ObfuscatedName("BDNJGDVN.a")
	public final boolean field143 = true;

	@ObfuscatedName("BDNJGDVN.b")
	public static final byte[] temp = new byte[520];

	@ObfuscatedName("BDNJGDVN.c")
	public final RandomAccessFile dat;

	@ObfuscatedName("BDNJGDVN.d")
	public final RandomAccessFile idx;

	@ObfuscatedName("BDNJGDVN.e")
	public final int archive;

	@ObfuscatedName("BDNJGDVN.f")
	public int maxFileSize = 65000;


	public FileStream(RandomAccessFile arg0, byte arg1, RandomAccessFile arg2, int arg3, int arg4) {
		try {
			this.archive = arg3;
			this.dat = arg0;
			this.idx = arg2;
			this.maxFileSize = 500000;
		} catch (RuntimeException var7) {
			signlink.reporterror("39067, " + arg0 + ", " + 6 + ", " + arg2 + ", " + arg3 + ", " + 500000 + ", " + var7.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("BDNJGDVN.a(IB)[B")
	public synchronized byte[] readFromFile(int arg0) {
		try {
			try {
				this.seek(arg0 * 6, this.idx);
				int var3;
				for (int var2 = 0; var2 < 6; var2 += var3) {
					var3 = this.idx.read(temp, var2, 6 - var2);
					if (var3 == -1) {
						return null;
					}
				}
				int var4 = ((temp[0] & 0xFF) << 16) + ((temp[1] & 0xFF) << 8) + (temp[2] & 0xFF);
				int var5 = ((temp[3] & 0xFF) << 16) + ((temp[4] & 0xFF) << 8) + (temp[5] & 0xFF);
				if (var4 < 0 || var4 > this.maxFileSize) {
					return null;
				} else if (var5 > 0 && (long) var5 <= this.dat.length() / 520L) {
					byte[] var6 = new byte[var4];
					int var7 = 0;
					int var8 = 0;
					while (var7 < var4) {
						if (var5 == 0) {
							return null;
						}
						this.seek(var5 * 520, this.dat);
						int var9 = 0;
						int var10 = var4 - var7;
						if (var10 > 512) {
							var10 = 512;
						}
						while (var9 < var10 + 8) {
							int var11 = this.dat.read(temp, var9, var10 + 8 - var9);
							if (var11 == -1) {
								return null;
							}
							var9 += var11;
						}
						int var12 = ((temp[0] & 0xFF) << 8) + (temp[1] & 0xFF);
						int var13 = ((temp[2] & 0xFF) << 8) + (temp[3] & 0xFF);
						int var14 = ((temp[4] & 0xFF) << 16) + ((temp[5] & 0xFF) << 8) + (temp[6] & 0xFF);
						int var15 = temp[7] & 0xFF;
						if (var12 == arg0 && var13 == var8 && var15 == this.archive) {
							if (var14 >= 0 && (long) var14 <= this.dat.length() / 520L) {
								for (int var16 = 0; var16 < var10; var16++) {
									var6[var7++] = temp[var16 + 8];
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
	public synchronized boolean writeToFile(int arg0, byte[] arg1, int arg2) {
		try {
			boolean var4 = this.writeToFile(arg2, arg1, true, arg0);
			if (!var4) {
				var4 = this.writeToFile(arg2, arg1, false, arg0);
			}
			return var4;
		} catch (RuntimeException var6) {
			signlink.reporterror("23130, " + arg0 + ", " + arg1 + ", " + -5 + ", " + arg2 + ", " + var6.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("BDNJGDVN.a(ZI[BZI)Z")
	public synchronized boolean writeToFile(int arg0, byte[] arg1, boolean arg2, int arg3) {
		try {
			try {
				int var7;
				if (arg2) {
					this.seek(arg0 * 6, this.idx);
					int var6;
					for (int var5 = 0; var5 < 6; var5 += var6) {
						var6 = this.idx.read(temp, var5, 6 - var5);
						if (var6 == -1) {
							return false;
						}
					}
					var7 = ((temp[3] & 0xFF) << 16) + ((temp[4] & 0xFF) << 8) + (temp[5] & 0xFF);
					if (var7 <= 0 || (long) var7 > this.dat.length() / 520L) {
						return false;
					}
				} else {
					var7 = (int) ((this.dat.length() + 519L) / 520L);
					if (var7 == 0) {
						var7 = 1;
					}
				}
				temp[0] = (byte) (arg3 >> 16);
				temp[1] = (byte) (arg3 >> 8);
				temp[2] = (byte) arg3;
				temp[3] = (byte) (var7 >> 16);
				temp[4] = (byte) (var7 >> 8);
				temp[5] = (byte) var7;
				this.seek(arg0 * 6, this.idx);
				this.idx.write(temp, 0, 6);
				int var8 = 0;
				int var9 = 0;
				while (var8 < arg3) {
					int var10 = 0;
					if (arg2) {
						this.seek(var7 * 520, this.dat);
						int var11;
						int var12;
						for (var11 = 0; var11 < 8; var11 += var12) {
							var12 = this.dat.read(temp, var11, 8 - var11);
							if (var12 == -1) {
								break;
							}
						}
						if (var11 == 8) {
							int var13 = ((temp[0] & 0xFF) << 8) + (temp[1] & 0xFF);
							int var14 = ((temp[2] & 0xFF) << 8) + (temp[3] & 0xFF);
							var10 = ((temp[4] & 0xFF) << 16) + ((temp[5] & 0xFF) << 8) + (temp[6] & 0xFF);
							int var15 = temp[7] & 0xFF;
							if (var13 != arg0 || var14 != var9 || var15 != this.archive) {
								return false;
							}
							if (var10 < 0 || (long) var10 > this.dat.length() / 520L) {
								return false;
							}
						}
					}
					if (var10 == 0) {
						arg2 = false;
						var10 = (int) ((this.dat.length() + 519L) / 520L);
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
					temp[0] = (byte) (arg0 >> 8);
					temp[1] = (byte) arg0;
					temp[2] = (byte) (var9 >> 8);
					temp[3] = (byte) var9;
					temp[4] = (byte) (var10 >> 16);
					temp[5] = (byte) (var10 >> 8);
					temp[6] = (byte) var10;
					temp[7] = (byte) this.archive;
					this.seek(var7 * 520, this.dat);
					this.dat.write(temp, 0, 8);
					int var16 = arg3 - var8;
					if (var16 > 512) {
						var16 = 512;
					}
					this.dat.write(arg1, var8, var16);
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
	public synchronized void seek(int arg0, RandomAccessFile arg1) throws IOException {
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
