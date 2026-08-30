package deob;

import sign.signlink;

@ObfuscatedName("DYTTVJNT")
public final class class16 {

	@ObfuscatedName("DYTTVJNT.a")
	public final boolean field748 = false;

	@ObfuscatedName("DYTTVJNT.b")
	public int field749 = 334;

	@ObfuscatedName("DYTTVJNT.c")
	public final boolean field750 = true;

	@ObfuscatedName("DYTTVJNT.d")
	public final int field751 = 27473;

	@ObfuscatedName("DYTTVJNT.e")
	public final boolean field752 = false;

	@ObfuscatedName("DYTTVJNT.f")
	public final byte field753 = 2;

	@ObfuscatedName("DYTTVJNT.g")
	public final int field754 = 4;

	@ObfuscatedName("DYTTVJNT.h")
	public final boolean field755 = true;

	@ObfuscatedName("DYTTVJNT.i")
	public int field756 = 1;

	@ObfuscatedName("DYTTVJNT.j")
	public final int field757;

	@ObfuscatedName("DYTTVJNT.k")
	public final int field758;

	@ObfuscatedName("DYTTVJNT.l")
	public final int field759;

	@ObfuscatedName("DYTTVJNT.m")
	public final int field760;

	@ObfuscatedName("DYTTVJNT.n")
	public final int[][] field761;

	public class16(byte arg0, int arg1, int arg2) {
		try {
			this.field757 = 0;
			this.field758 = 0;
			this.field759 = 104;
			this.field760 = 104;
			this.field761 = new int[this.field759][this.field760];
			this.method200();
		} catch (RuntimeException var5) {
			signlink.reporterror("21511, " + 6 + ", " + 104 + ", " + 104 + ", " + var5.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("DYTTVJNT.a()V")
	public void method200() {
		for (int var1 = 0; var1 < this.field759; var1++) {
			for (int var2 = 0; var2 < this.field760; var2++) {
				if (var1 == 0 || var2 == 0 || var1 == this.field759 - 1 || var2 == this.field760 - 1) {
					this.field761[var1][var2] = 16777215;
				} else {
					this.field761[var1][var2] = 16777216;
				}
			}
		}
	}

	@ObfuscatedName("DYTTVJNT.a(ZIIZII)V")
	public void method201(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
		try {
			int var8 = arg1 - this.field757;
			int var9 = arg4 - this.field758;
			if (arg0 == 0) {
				if (arg3 == 0) {
					this.method204(var8, var9, 128);
					this.method204(var8 - 1, var9, 8);
				}
				if (arg3 == 1) {
					this.method204(var8, var9, 2);
					this.method204(var8, var9 + 1, 32);
				}
				if (arg3 == 2) {
					this.method204(var8, var9, 8);
					this.method204(var8 + 1, var9, 128);
				}
				if (arg3 == 3) {
					this.method204(var8, var9, 32);
					this.method204(var8, var9 - 1, 2);
				}
			}
			if (arg0 == 1 || arg0 == 3) {
				if (arg3 == 0) {
					this.method204(var8, var9, 1);
					this.method204(var8 - 1, var9 + 1, 16);
				}
				if (arg3 == 1) {
					this.method204(var8, var9, 4);
					this.method204(var8 + 1, var9 + 1, 64);
				}
				if (arg3 == 2) {
					this.method204(var8, var9, 16);
					this.method204(var8 + 1, var9 - 1, 1);
				}
				if (arg3 == 3) {
					this.method204(var8, var9, 64);
					this.method204(var8 - 1, var9 - 1, 4);
				}
			}
			if (arg0 == 2) {
				if (arg3 == 0) {
					this.method204(var8, var9, 130);
					this.method204(var8 - 1, var9, 8);
					this.method204(var8, var9 + 1, 32);
				}
				if (arg3 == 1) {
					this.method204(var8, var9, 10);
					this.method204(var8, var9 + 1, 32);
					this.method204(var8 + 1, var9, 128);
				}
				if (arg3 == 2) {
					this.method204(var8, var9, 40);
					this.method204(var8 + 1, var9, 128);
					this.method204(var8, var9 - 1, 2);
				}
				if (arg3 == 3) {
					this.method204(var8, var9, 160);
					this.method204(var8, var9 - 1, 2);
					this.method204(var8 - 1, var9, 8);
				}
			}
			if (arg2) {
				if (arg0 == 0) {
					if (arg3 == 0) {
						this.method204(var8, var9, 65536);
						this.method204(var8 - 1, var9, 4096);
					}
					if (arg3 == 1) {
						this.method204(var8, var9, 1024);
						this.method204(var8, var9 + 1, 16384);
					}
					if (arg3 == 2) {
						this.method204(var8, var9, 4096);
						this.method204(var8 + 1, var9, 65536);
					}
					if (arg3 == 3) {
						this.method204(var8, var9, 16384);
						this.method204(var8, var9 - 1, 1024);
					}
				}
				if (arg0 == 1 || arg0 == 3) {
					if (arg3 == 0) {
						this.method204(var8, var9, 512);
						this.method204(var8 - 1, var9 + 1, 8192);
					}
					if (arg3 == 1) {
						this.method204(var8, var9, 2048);
						this.method204(var8 + 1, var9 + 1, 32768);
					}
					if (arg3 == 2) {
						this.method204(var8, var9, 8192);
						this.method204(var8 + 1, var9 - 1, 512);
					}
					if (arg3 == 3) {
						this.method204(var8, var9, 32768);
						this.method204(var8 - 1, var9 - 1, 2048);
					}
				}
				if (arg0 == 2) {
					if (arg3 == 0) {
						this.method204(var8, var9, 66560);
						this.method204(var8 - 1, var9, 4096);
						this.method204(var8, var9 + 1, 16384);
					}
					if (arg3 == 1) {
						this.method204(var8, var9, 5120);
						this.method204(var8, var9 + 1, 16384);
						this.method204(var8 + 1, var9, 65536);
					}
					if (arg3 == 2) {
						this.method204(var8, var9, 20480);
						this.method204(var8 + 1, var9, 65536);
						this.method204(var8, var9 - 1, 1024);
					}
					if (arg3 == 3) {
						this.method204(var8, var9, 81920);
						this.method204(var8, var9 - 1, 1024);
						this.method204(var8 - 1, var9, 4096);
						return;
					}
				}
			}
		} catch (RuntimeException var7) {
			signlink.reporterror("87057, " + false + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + var7.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("DYTTVJNT.a(IIZZIII)V")
	public void method202(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
		try {
			int var7 = 256;
			if (arg2) {
				var7 = 131328;
			}
			int var13 = arg3 - this.field757;
			int var14 = arg5 - this.field758;
			if (arg4 == 1 || arg4 == 3) {
				int var8 = arg0;
				arg0 = arg1;
				arg1 = var8;
			}
			for (int var9 = var13; var9 < var13 + arg0; var9++) {
				if (var9 >= 0 && var9 < this.field759) {
					for (int var10 = var14; var10 < var14 + arg1; var10++) {
						if (var10 >= 0 && var10 < this.field760) {
							this.method204(var9, var10, var7);
						}
					}
				}
			}
		} catch (RuntimeException var12) {
			signlink.reporterror("30170, " + arg0 + ", " + arg1 + ", " + false + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + var12.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("DYTTVJNT.a(III)V")
	public void method203(int arg0, int arg1) {
		try {
			int var5 = arg0 - this.field757;
			int var6 = arg1 - this.field758;
			this.field761[var5][var6] |= 0x200000;
		} catch (RuntimeException var4) {
			signlink.reporterror("10564, " + 209 + ", " + arg0 + ", " + arg1 + ", " + var4.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("DYTTVJNT.b(III)V")
	public void method204(int arg0, int arg1, int arg2) {
		this.field761[arg0][arg1] |= arg2;
	}

	@ObfuscatedName("DYTTVJNT.a(IIZIII)V")
	public void method205(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
		try {
			int var8 = arg1 - this.field757;
			int var9 = arg4 - this.field758;
			if (arg0 == 0) {
				if (arg3 == 0) {
					this.method207(128, var8, var9);
					this.method207(8, var8 - 1, var9);
				}
				if (arg3 == 1) {
					this.method207(2, var8, var9);
					this.method207(32, var8, var9 + 1);
				}
				if (arg3 == 2) {
					this.method207(8, var8, var9);
					this.method207(128, var8 + 1, var9);
				}
				if (arg3 == 3) {
					this.method207(32, var8, var9);
					this.method207(2, var8, var9 - 1);
				}
			}
			if (arg0 == 1 || arg0 == 3) {
				if (arg3 == 0) {
					this.method207(1, var8, var9);
					this.method207(16, var8 - 1, var9 + 1);
				}
				if (arg3 == 1) {
					this.method207(4, var8, var9);
					this.method207(64, var8 + 1, var9 + 1);
				}
				if (arg3 == 2) {
					this.method207(16, var8, var9);
					this.method207(1, var8 + 1, var9 - 1);
				}
				if (arg3 == 3) {
					this.method207(64, var8, var9);
					this.method207(4, var8 - 1, var9 - 1);
				}
			}
			if (arg0 == 2) {
				if (arg3 == 0) {
					this.method207(130, var8, var9);
					this.method207(8, var8 - 1, var9);
					this.method207(32, var8, var9 + 1);
				}
				if (arg3 == 1) {
					this.method207(10, var8, var9);
					this.method207(32, var8, var9 + 1);
					this.method207(128, var8 + 1, var9);
				}
				if (arg3 == 2) {
					this.method207(40, var8, var9);
					this.method207(128, var8 + 1, var9);
					this.method207(2, var8, var9 - 1);
				}
				if (arg3 == 3) {
					this.method207(160, var8, var9);
					this.method207(2, var8, var9 - 1);
					this.method207(8, var8 - 1, var9);
				}
			}
			if (arg2) {
				if (arg0 == 0) {
					if (arg3 == 0) {
						this.method207(65536, var8, var9);
						this.method207(4096, var8 - 1, var9);
					}
					if (arg3 == 1) {
						this.method207(1024, var8, var9);
						this.method207(16384, var8, var9 + 1);
					}
					if (arg3 == 2) {
						this.method207(4096, var8, var9);
						this.method207(65536, var8 + 1, var9);
					}
					if (arg3 == 3) {
						this.method207(16384, var8, var9);
						this.method207(1024, var8, var9 - 1);
					}
				}
				if (arg0 == 1 || arg0 == 3) {
					if (arg3 == 0) {
						this.method207(512, var8, var9);
						this.method207(8192, var8 - 1, var9 + 1);
					}
					if (arg3 == 1) {
						this.method207(2048, var8, var9);
						this.method207(32768, var8 + 1, var9 + 1);
					}
					if (arg3 == 2) {
						this.method207(8192, var8, var9);
						this.method207(512, var8 + 1, var9 - 1);
					}
					if (arg3 == 3) {
						this.method207(32768, var8, var9);
						this.method207(2048, var8 - 1, var9 - 1);
					}
				}
				if (arg0 == 2) {
					if (arg3 == 0) {
						this.method207(66560, var8, var9);
						this.method207(4096, var8 - 1, var9);
						this.method207(16384, var8, var9 + 1);
					}
					if (arg3 == 1) {
						this.method207(5120, var8, var9);
						this.method207(16384, var8, var9 + 1);
						this.method207(65536, var8 + 1, var9);
					}
					if (arg3 == 2) {
						this.method207(20480, var8, var9);
						this.method207(65536, var8 + 1, var9);
						this.method207(1024, var8, var9 - 1);
					}
					if (arg3 == 3) {
						this.method207(81920, var8, var9);
						this.method207(1024, var8, var9 - 1);
						this.method207(4096, var8 - 1, var9);
						return;
					}
				}
			}
		} catch (RuntimeException var7) {
			signlink.reporterror("6945, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 4 + ", " + arg3 + ", " + arg4 + ", " + var7.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("DYTTVJNT.a(IIIIIIZ)V")
	public void method206(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
		try {
			if (arg1 != 0) {
				this.field749 = -441;
			}
			int var8 = 256;
			if (arg6) {
				var8 = 131328;
			}
			int var15 = arg5 - this.field757;
			int var14 = arg0 - this.field758;
			if (arg4 == 1 || arg4 == 3) {
				int var9 = arg2;
				arg2 = arg3;
				arg3 = var9;
			}
			for (int var10 = var15; var10 < var15 + arg2; var10++) {
				if (var10 >= 0 && var10 < this.field759) {
					for (int var11 = var14; var11 < var14 + arg3; var11++) {
						if (var11 >= 0 && var11 < this.field760) {
							this.method207(var8, var10, var11);
						}
					}
				}
			}
		} catch (RuntimeException var13) {
			signlink.reporterror("23928, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + var13.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("DYTTVJNT.a(IZII)V")
	public void method207(int arg0, int arg1, int arg2) {
		try {
			this.field761[arg1][arg2] &= 16777215 - arg0;
		} catch (RuntimeException var5) {
			signlink.reporterror("22242, " + arg0 + ", " + false + ", " + arg1 + ", " + arg2 + ", " + var5.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("DYTTVJNT.a(IZI)V")
	public void method208(int arg0, int arg1) {
		try {
			int var5 = arg0 - this.field757;
			int var6 = arg1 - this.field758;
			this.field761[var5][var6] &= 0xDFFFFF;
		} catch (RuntimeException var4) {
			signlink.reporterror("33700, " + arg0 + ", " + false + ", " + arg1 + ", " + var4.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("DYTTVJNT.a(IIIZIII)Z")
	public boolean method209(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		try {
			if (arg0 == arg1 && arg4 == arg3) {
				return true;
			}
			int var9 = arg0 - this.field757;
			int var12 = arg4 - this.field758;
			int var10 = arg1 - this.field757;
			int var11 = arg3 - this.field758;
			if (arg2 == 0) {
				if (arg5 == 0) {
					if (var9 == var10 - 1 && var12 == var11) {
						return true;
					}
					if (var9 == var10 && var12 == var11 + 1 && (this.field761[var9][var12] & 0x1280120) == 0) {
						return true;
					}
					if (var9 == var10 && var12 == var11 - 1 && (this.field761[var9][var12] & 0x1280102) == 0) {
						return true;
					}
				} else if (arg5 == 1) {
					if (var9 == var10 && var12 == var11 + 1) {
						return true;
					}
					if (var9 == var10 - 1 && var12 == var11 && (this.field761[var9][var12] & 0x1280108) == 0) {
						return true;
					}
					if (var9 == var10 + 1 && var12 == var11 && (this.field761[var9][var12] & 0x1280180) == 0) {
						return true;
					}
				} else if (arg5 == 2) {
					if (var9 == var10 + 1 && var12 == var11) {
						return true;
					}
					if (var9 == var10 && var12 == var11 + 1 && (this.field761[var9][var12] & 0x1280120) == 0) {
						return true;
					}
					if (var9 == var10 && var12 == var11 - 1 && (this.field761[var9][var12] & 0x1280102) == 0) {
						return true;
					}
				} else if (arg5 == 3) {
					if (var9 == var10 && var12 == var11 - 1) {
						return true;
					}
					if (var9 == var10 - 1 && var12 == var11 && (this.field761[var9][var12] & 0x1280108) == 0) {
						return true;
					}
					if (var9 == var10 + 1 && var12 == var11 && (this.field761[var9][var12] & 0x1280180) == 0) {
						return true;
					}
				}
			}
			if (arg2 == 2) {
				if (arg5 == 0) {
					if (var9 == var10 - 1 && var12 == var11) {
						return true;
					}
					if (var9 == var10 && var12 == var11 + 1) {
						return true;
					}
					if (var9 == var10 + 1 && var12 == var11 && (this.field761[var9][var12] & 0x1280180) == 0) {
						return true;
					}
					if (var9 == var10 && var12 == var11 - 1 && (this.field761[var9][var12] & 0x1280102) == 0) {
						return true;
					}
				} else if (arg5 == 1) {
					if (var9 == var10 - 1 && var12 == var11 && (this.field761[var9][var12] & 0x1280108) == 0) {
						return true;
					}
					if (var9 == var10 && var12 == var11 + 1) {
						return true;
					}
					if (var9 == var10 + 1 && var12 == var11) {
						return true;
					}
					if (var9 == var10 && var12 == var11 - 1 && (this.field761[var9][var12] & 0x1280102) == 0) {
						return true;
					}
				} else if (arg5 == 2) {
					if (var9 == var10 - 1 && var12 == var11 && (this.field761[var9][var12] & 0x1280108) == 0) {
						return true;
					}
					if (var9 == var10 && var12 == var11 + 1 && (this.field761[var9][var12] & 0x1280120) == 0) {
						return true;
					}
					if (var9 == var10 + 1 && var12 == var11) {
						return true;
					}
					if (var9 == var10 && var12 == var11 - 1) {
						return true;
					}
				} else if (arg5 == 3) {
					if (var9 == var10 - 1 && var12 == var11) {
						return true;
					}
					if (var9 == var10 && var12 == var11 + 1 && (this.field761[var9][var12] & 0x1280120) == 0) {
						return true;
					}
					if (var9 == var10 + 1 && var12 == var11 && (this.field761[var9][var12] & 0x1280180) == 0) {
						return true;
					}
					if (var9 == var10 && var12 == var11 - 1) {
						return true;
					}
				}
			}
			if (arg2 == 9) {
				if (var9 == var10 && var12 == var11 + 1 && (this.field761[var9][var12] & 0x20) == 0) {
					return true;
				}
				if (var9 == var10 && var12 == var11 - 1 && (this.field761[var9][var12] & 0x2) == 0) {
					return true;
				}
				if (var9 == var10 - 1 && var12 == var11 && (this.field761[var9][var12] & 0x8) == 0) {
					return true;
				}
				if (var9 == var10 + 1 && var12 == var11 && (this.field761[var9][var12] & 0x80) == 0) {
					return true;
				}
			}
			return false;
		} catch (RuntimeException var8) {
			signlink.reporterror("59754, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + true + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + var8.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("DYTTVJNT.a(IIIIIII)Z")
	public boolean method210(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		try {
			if (arg6 == arg3 && arg5 == arg1) {
				return true;
			}
			int var13 = arg6 - this.field757;
			if (arg4 != this.field751) {
				this.field756 = -393;
			}
			int var12 = arg5 - this.field758;
			int var11 = arg3 - this.field757;
			int var10 = arg1 - this.field758;
			if (arg2 == 6 || arg2 == 7) {
				if (arg2 == 7) {
					arg0 = arg0 + 2 & 0x3;
				}
				if (arg0 == 0) {
					if (var13 == var11 + 1 && var12 == var10 && (this.field761[var13][var12] & 0x80) == 0) {
						return true;
					}
					if (var13 == var11 && var12 == var10 - 1 && (this.field761[var13][var12] & 0x2) == 0) {
						return true;
					}
				} else if (arg0 == 1) {
					if (var13 == var11 - 1 && var12 == var10 && (this.field761[var13][var12] & 0x8) == 0) {
						return true;
					}
					if (var13 == var11 && var12 == var10 - 1 && (this.field761[var13][var12] & 0x2) == 0) {
						return true;
					}
				} else if (arg0 == 2) {
					if (var13 == var11 - 1 && var12 == var10 && (this.field761[var13][var12] & 0x8) == 0) {
						return true;
					}
					if (var13 == var11 && var12 == var10 + 1 && (this.field761[var13][var12] & 0x20) == 0) {
						return true;
					}
				} else if (arg0 == 3) {
					if (var13 == var11 + 1 && var12 == var10 && (this.field761[var13][var12] & 0x80) == 0) {
						return true;
					}
					if (var13 == var11 && var12 == var10 + 1 && (this.field761[var13][var12] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg2 == 8) {
				if (var13 == var11 && var12 == var10 + 1 && (this.field761[var13][var12] & 0x20) == 0) {
					return true;
				}
				if (var13 == var11 && var12 == var10 - 1 && (this.field761[var13][var12] & 0x2) == 0) {
					return true;
				}
				if (var13 == var11 - 1 && var12 == var10 && (this.field761[var13][var12] & 0x8) == 0) {
					return true;
				}
				if (var13 == var11 + 1 && var12 == var10 && (this.field761[var13][var12] & 0x80) == 0) {
					return true;
				}
			}
			return false;
		} catch (RuntimeException var9) {
			signlink.reporterror("12907, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + var9.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("DYTTVJNT.a(ZIIIIIII)Z")
	public boolean method211(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		try {
			int var8 = arg0 + arg3 - 1;
			int var9 = arg2 + arg5 - 1;
			if (arg4 >= arg0 && arg4 <= var8 && arg1 >= arg2 && arg1 <= var9) {
				return true;
			} else if (arg4 == arg0 - 1 && arg1 >= arg2 && arg1 <= var9 && (this.field761[arg4 - this.field757][arg1 - this.field758] & 0x8) == 0 && (arg6 & 0x8) == 0) {
				return true;
			} else if (arg4 == var8 + 1 && arg1 >= arg2 && arg1 <= var9 && (this.field761[arg4 - this.field757][arg1 - this.field758] & 0x80) == 0 && (arg6 & 0x2) == 0) {
				return true;
			} else if (arg1 == arg2 - 1 && arg4 >= arg0 && arg4 <= var8 && (this.field761[arg4 - this.field757][arg1 - this.field758] & 0x2) == 0 && (arg6 & 0x4) == 0) {
				return true;
			} else {
				return arg1 == var9 + 1 && arg4 >= arg0 && arg4 <= var8 && (this.field761[arg4 - this.field757][arg1 - this.field758] & 0x20) == 0 && (arg6 & 0x1) == 0;
			}
		} catch (RuntimeException var11) {
			signlink.reporterror("89536, " + false + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + var11.toString());
			throw new RuntimeException();
		}
	}
}
