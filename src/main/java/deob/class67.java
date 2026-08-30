package deob;

import sign.signlink;

@ObfuscatedName("XLZQSPZS")
public final class class67 {

	@ObfuscatedName("XLZQSPZS.k")
	public static boolean field1501 = true;

	@ObfuscatedName("XLZQSPZS.r")
	public static final int field1508 = 6821;

	@ObfuscatedName("XLZQSPZS.D")
	public static final int field1520 = 665;

	@ObfuscatedName("XLZQSPZS.F")
	public static class15 field1522 = new class15((byte) 7, 100);

	@ObfuscatedName("XLZQSPZS.P")
	public static class15 field1532 = new class15((byte) 7, 50);

	@ObfuscatedName("XLZQSPZS.d")
	public final boolean field1494 = true;

	@ObfuscatedName("XLZQSPZS.e")
	public int field1495 = -1;

	@ObfuscatedName("XLZQSPZS.B")
	public final byte field1518 = 29;

	@ObfuscatedName("XLZQSPZS.i")
	public byte field1499;

	@ObfuscatedName("XLZQSPZS.v")
	public byte field1512;

	@ObfuscatedName("XLZQSPZS.a")
	public static int field1491;

	@ObfuscatedName("XLZQSPZS.c")
	public int field1493;

	@ObfuscatedName("XLZQSPZS.g")
	public int field1497;

	@ObfuscatedName("XLZQSPZS.h")
	public int field1498;

	@ObfuscatedName("XLZQSPZS.j")
	public int field1500;

	@ObfuscatedName("XLZQSPZS.m")
	public int field1503;

	@ObfuscatedName("XLZQSPZS.o")
	public int field1505;

	@ObfuscatedName("XLZQSPZS.s")
	public int field1509;

	@ObfuscatedName("XLZQSPZS.t")
	public int field1510;

	@ObfuscatedName("XLZQSPZS.u")
	public int field1511;

	@ObfuscatedName("XLZQSPZS.w")
	public int field1513;

	@ObfuscatedName("XLZQSPZS.x")
	public int field1514;

	@ObfuscatedName("XLZQSPZS.y")
	public int field1515;

	@ObfuscatedName("XLZQSPZS.z")
	public int field1516;

	@ObfuscatedName("XLZQSPZS.A")
	public int field1517;

	@ObfuscatedName("XLZQSPZS.C")
	public int field1519;

	@ObfuscatedName("XLZQSPZS.E")
	public int field1521;

	@ObfuscatedName("XLZQSPZS.G")
	public int field1523;

	@ObfuscatedName("XLZQSPZS.I")
	public int field1525;

	@ObfuscatedName("XLZQSPZS.K")
	public int field1527;

	@ObfuscatedName("XLZQSPZS.M")
	public int field1529;

	@ObfuscatedName("XLZQSPZS.O")
	public int field1531;

	@ObfuscatedName("XLZQSPZS.R")
	public static int field1534;

	@ObfuscatedName("XLZQSPZS.T")
	public int field1536;

	@ObfuscatedName("XLZQSPZS.V")
	public int field1538;

	@ObfuscatedName("XLZQSPZS.W")
	public int field1539;

	@ObfuscatedName("XLZQSPZS.X")
	public int field1540;

	@ObfuscatedName("XLZQSPZS.Y")
	public static int field1541;

	@ObfuscatedName("XLZQSPZS.Z")
	public int field1542;

	@ObfuscatedName("XLZQSPZS.ab")
	public int field1543;

	@ObfuscatedName("XLZQSPZS.H")
	public static class17 field1524;

	@ObfuscatedName("XLZQSPZS.Q")
	public String field1533;

	@ObfuscatedName("XLZQSPZS.q")
	public boolean field1507;

	@ObfuscatedName("XLZQSPZS.J")
	public boolean field1526;

	@ObfuscatedName("XLZQSPZS.L")
	public byte[] field1528;

	@ObfuscatedName("XLZQSPZS.b")
	public int[] field1492;

	@ObfuscatedName("XLZQSPZS.f")
	public int[] field1496;

	@ObfuscatedName("XLZQSPZS.n")
	public int[] field1504;

	@ObfuscatedName("XLZQSPZS.S")
	public static int[] field1535;

	@ObfuscatedName("XLZQSPZS.U")
	public int[] field1537;

	@ObfuscatedName("XLZQSPZS.p")
	public static class67[] field1506;

	@ObfuscatedName("XLZQSPZS.l")
	public String[] field1502;

	@ObfuscatedName("XLZQSPZS.N")
	public String[] field1530;

	@ObfuscatedName("XLZQSPZS.a(LBBMKAXRK;)V")
	public static void method518(class6 arg0) {
		field1524 = new class17(arg0.method30("obj.dat", null), -26583);
		class17 var1 = new class17(arg0.method30("obj.idx", null), -26583);
		field1534 = var1.method226();
		field1535 = new int[field1534];
		int var2 = 2;
		for (int var3 = 0; var3 < field1534; var3++) {
			field1535[var3] = var2;
			var2 += var1.method226();
		}
		field1506 = new class67[10];
		for (int var4 = 0; var4 < 10; var4++) {
			field1506[var4] = new class67();
		}
	}

	@ObfuscatedName("XLZQSPZS.c(I)V")
	public static void method519() {
		try {
			field1532 = null;
			field1522 = null;
			field1535 = null;
			field1506 = null;
			field1524 = null;
		} catch (RuntimeException var1) {
			signlink.reporterror("13890, " + ", " + var1.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("XLZQSPZS.a(IBII)LODBDSPMH;")
	public static class40 method524(int arg0, int arg1, int arg2) {
		try {
			if (arg1 == 0) {
				class40 var3 = (class40) field1522.method197((long) arg0);
				if (var3 != null && var3.field1181 != arg2 && var3.field1181 != -1) {
					var3.method334();
					var3 = null;
				}
				if (var3 != null) {
					return var3;
				}
			}
			class67 var4 = method526(arg0);
			if (var4.field1492 == null) {
				arg2 = -1;
			}
			if (arg2 > 1) {
				int var5 = -1;
				for (int var6 = 0; var6 < 10; var6++) {
					if (arg2 >= var4.field1504[var6] && var4.field1504[var6] != 0) {
						var5 = var4.field1492[var6];
					}
				}
				if (var5 != -1) {
					var4 = method526(var5);
				}
			}
			class31 var7 = var4.method514(1);
			if (var7 == null) {
				return null;
			}
			class40 var8 = null;
			if (var4.field1517 != -1) {
				var8 = method524(var4.field1525, -1, 10);
				if (var8 == null) {
					return null;
				}
			}
			class40 var9 = new class40(32, 32);
			int var10 = class21.field816;
			int var11 = class21.field817;
			int[] var12 = class21.field822;
			int[] var13 = class26.field876;
			int var14 = class26.field877;
			int var15 = class26.field878;
			int var16 = class26.field881;
			int var17 = class26.field882;
			int var18 = class26.field879;
			int var19 = class26.field880;
			class21.field814 = false;
			class26.method310(32, var9.field1175, field1508, 32);
			class26.method315(0, 0, 99, 32, 32, 0);
			class21.method281();
			int var20 = var4.field1515;
			if (arg1 == -1) {
				var20 = (int) ((double) var20 * 1.5D);
			}
			if (arg1 > 0) {
				var20 = (int) ((double) var20 * 1.04D);
			}
			int var21 = class21.field820[var4.field1531] * var20 >> 16;
			int var22 = class21.field821[var4.field1531] * var20 >> 16;
			var7.method360(var4.field1511, var4.field1523, var4.field1531, var4.field1527, var21 + var7.field1489 / 2 + var4.field1513, var22 + var4.field1513);
			for (int var23 = 31; var23 >= 0; var23--) {
				for (int var24 = 31; var24 >= 0; var24--) {
					if (var9.field1175[var23 + var24 * 32] == 0) {
						if (var23 > 0 && var9.field1175[var23 + var24 * 32 - 1] > 1) {
							var9.field1175[var23 + var24 * 32] = 1;
						} else if (var24 > 0 && var9.field1175[var23 + (var24 - 1) * 32] > 1) {
							var9.field1175[var23 + var24 * 32] = 1;
						} else if (var23 < 31 && var9.field1175[var23 + var24 * 32 + 1] > 1) {
							var9.field1175[var23 + var24 * 32] = 1;
						} else if (var24 < 31 && var9.field1175[var23 + (var24 + 1) * 32] > 1) {
							var9.field1175[var23 + var24 * 32] = 1;
						}
					}
				}
			}
			if (arg1 > 0) {
				for (int var25 = 31; var25 >= 0; var25--) {
					for (int var26 = 31; var26 >= 0; var26--) {
						if (var9.field1175[var25 + var26 * 32] == 0) {
							if (var25 > 0 && var9.field1175[var25 + var26 * 32 - 1] == 1) {
								var9.field1175[var25 + var26 * 32] = arg1;
							} else if (var26 > 0 && var9.field1175[var25 + (var26 - 1) * 32] == 1) {
								var9.field1175[var25 + var26 * 32] = arg1;
							} else if (var25 < 31 && var9.field1175[var25 + var26 * 32 + 1] == 1) {
								var9.field1175[var25 + var26 * 32] = arg1;
							} else if (var26 < 31 && var9.field1175[var25 + (var26 + 1) * 32] == 1) {
								var9.field1175[var25 + var26 * 32] = arg1;
							}
						}
					}
				}
			} else if (arg1 == 0) {
				for (int var27 = 31; var27 >= 0; var27--) {
					for (int var28 = 31; var28 >= 0; var28--) {
						if (var9.field1175[var27 + var28 * 32] == 0 && var27 > 0 && var28 > 0 && var9.field1175[var27 + (var28 - 1) * 32 - 1] > 0) {
							var9.field1175[var27 + var28 * 32] = 3153952;
						}
					}
				}
			}
			if (var4.field1517 != -1) {
				int var29 = var8.field1180;
				int var30 = var8.field1181;
				var8.field1180 = 32;
				var8.field1181 = 32;
				var8.method404(0, field1520, 0);
				var8.field1180 = var29;
				var8.field1181 = var30;
			}
			if (arg1 == 0) {
				field1522.method198((byte) 7, (long) arg0, var9);
			}
			class26.method310(var15, var13, field1508, var14);
			class26.method312(var17, var19, var16, field1541, var18);
			class21.field816 = var10;
			class21.field817 = var11;
			class21.field822 = var12;
			class21.field814 = true;
			if (var4.field1526) {
				var9.field1180 = 33;
			} else {
				var9.field1180 = 32;
			}
			var9.field1181 = arg2;
			return var9;
		} catch (RuntimeException var32) {
			signlink.reporterror("25563, " + arg0 + ", " + -123 + ", " + arg1 + ", " + arg2 + ", " + var32.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("XLZQSPZS.d(I)LXLZQSPZS;")
	public static class67 method526(int arg0) {
		for (int var1 = 0; var1 < 10; var1++) {
			if (field1506[var1].field1495 == arg0) {
				return field1506[var1];
			}
		}
		field1491 = (field1491 + 1) % 10;
		class67 var2 = field1506[field1491];
		field1524.field779 = field1535[arg0];
		var2.field1495 = arg0;
		var2.method521();
		var2.method523(field1524);
		if (var2.field1517 != -1) {
			var2.method516();
		}
		if (!field1501 && var2.field1507) {
			var2.field1533 = "Members Object";
			var2.field1528 = "Login to a members' server to use this object.".getBytes();
			var2.field1502 = null;
			var2.field1530 = null;
			var2.field1500 = 0;
		}
		return var2;
	}

	@ObfuscatedName("XLZQSPZS.a(I)LKBEXSZSN;")
	public class31 method514(int arg0) {
		if (this.field1492 != null && arg0 > 1) {
			int var2 = -1;
			for (int var3 = 0; var3 < 10; var3++) {
				if (arg0 >= this.field1504[var3] && this.field1504[var3] != 0) {
					var2 = this.field1492[var3];
				}
			}
			if (var2 != -1) {
				return method526(var2).method514(1);
			}
		}
		class31 var4 = (class31) field1532.method197((long) this.field1495);
		if (var4 != null) {
			return var4;
		}
		class31 var5 = class31.method339(this.field1536);
		if (var5 == null) {
			return null;
		}
		if (this.field1540 != 128 || this.field1542 != 128 || this.field1519 != 128) {
			var5.method355(this.field1518, this.field1519, this.field1542, this.field1540);
		}
		if (this.field1496 != null) {
			for (int var6 = 0; var6 < this.field1496.length; var6++) {
				var5.method353(this.field1496[var6], this.field1537[var6]);
			}
		}
		var5.method356(this.field1529 + 64, this.field1497 + 768, -50, -10, -50, true);
		var5.field1033 = true;
		field1532.method198((byte) 7, (long) this.field1495, var5);
		return var5;
	}

	@ObfuscatedName("XLZQSPZS.a(II)Z")
	public boolean method515(int arg0) {
		try {
			int var2 = this.field1510;
			int var3 = this.field1505;
			if (arg0 == 1) {
				var2 = this.field1503;
				var3 = this.field1514;
			}
			if (var2 == -1) {
				return true;
			}
			boolean var4 = true;
			if (!class31.method340(var2)) {
				var4 = false;
			}
			if (var3 != -1 && !class31.method340(var3)) {
				var4 = false;
			}
			return var4;
		} catch (RuntimeException var6) {
			signlink.reporterror("32440, " + arg0 + ", " + -11073 + ", " + var6.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("XLZQSPZS.b(I)V")
	public void method516() {
		try {
			class67 var1 = method526(this.field1517);
			this.field1536 = var1.field1536;
			this.field1515 = var1.field1515;
			this.field1531 = var1.field1531;
			this.field1511 = var1.field1511;
			this.field1523 = var1.field1523;
			this.field1527 = var1.field1527;
			this.field1513 = var1.field1513;
			this.field1496 = var1.field1496;
			this.field1537 = var1.field1537;
			class67 var2 = method526(this.field1525);
			this.field1533 = var2.field1533;
			this.field1507 = var2.field1507;
			this.field1509 = var2.field1509;
			String var3 = "a";
			char var4 = var2.field1533.charAt(0);
			if (var4 == 'A' || var4 == 'E' || var4 == 'I' || var4 == 'O' || var4 == 'U') {
				var3 = "an";
			}
			this.field1528 = ("Swap this note at any bank for " + var3 + " " + var2.field1533 + ".").getBytes();
			this.field1526 = true;
		} catch (RuntimeException var6) {
			signlink.reporterror("40854, " + 48830 + ", " + var6.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("XLZQSPZS.a(ZI)Z")
	public boolean method517(int arg0) {
		try {
			int var2 = this.field1538;
			int var3 = this.field1493;
			int var4 = this.field1516;
			if (arg0 == 1) {
				var2 = this.field1521;
				var3 = this.field1498;
				var4 = this.field1543;
			}
			if (var2 == -1) {
				return true;
			}
			boolean var5 = true;
			if (!class31.method340(var2)) {
				var5 = false;
			}
			if (var3 != -1 && !class31.method340(var3)) {
				var5 = false;
			}
			if (var4 != -1 && !class31.method340(var4)) {
				var5 = false;
			}
			return var5;
		} catch (RuntimeException var7) {
			signlink.reporterror("3880, " + true + ", " + arg0 + ", " + var7.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("XLZQSPZS.b(II)LKBEXSZSN;")
	public class31 method520(int arg0) {
		try {
			if (this.field1492 != null && arg0 > 1) {
				int var2 = -1;
				for (int var3 = 0; var3 < 10; var3++) {
					if (arg0 >= this.field1504[var3] && this.field1504[var3] != 0) {
						var2 = this.field1492[var3];
					}
				}
				if (var2 != -1) {
					return method526(var2).method520(1);
				}
			}
			class31 var4 = class31.method339(this.field1536);
			if (var4 == null) {
				return null;
			}
			if (this.field1496 != null) {
				for (int var5 = 0; var5 < this.field1496.length; var5++) {
					var4.method353(this.field1496[var5], this.field1537[var5]);
				}
			}
			return var4;
		} catch (RuntimeException var7) {
			signlink.reporterror("75586, " + arg0 + ", " + 9 + ", " + var7.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("XLZQSPZS.a()V")
	public void method521() {
		this.field1536 = 0;
		this.field1533 = null;
		this.field1528 = null;
		this.field1496 = null;
		this.field1537 = null;
		this.field1515 = 2000;
		this.field1531 = 0;
		this.field1511 = 0;
		this.field1523 = 0;
		this.field1527 = 0;
		this.field1513 = 0;
		this.field1539 = -1;
		this.field1526 = false;
		this.field1509 = 1;
		this.field1507 = false;
		this.field1502 = null;
		this.field1530 = null;
		this.field1538 = -1;
		this.field1493 = -1;
		this.field1512 = 0;
		this.field1521 = -1;
		this.field1498 = -1;
		this.field1499 = 0;
		this.field1516 = -1;
		this.field1543 = -1;
		this.field1510 = -1;
		this.field1505 = -1;
		this.field1503 = -1;
		this.field1514 = -1;
		this.field1492 = null;
		this.field1504 = null;
		this.field1525 = -1;
		this.field1517 = -1;
		this.field1540 = 128;
		this.field1542 = 128;
		this.field1519 = 128;
		this.field1529 = 0;
		this.field1497 = 0;
		this.field1500 = 0;
	}

	@ObfuscatedName("XLZQSPZS.c(II)LKBEXSZSN;")
	public class31 method522(int arg0) {
		try {
			int var2 = this.field1538;
			int var3 = this.field1493;
			int var4 = this.field1516;
			if (arg0 == 1) {
				var2 = this.field1521;
				var3 = this.field1498;
				var4 = this.field1543;
			}
			if (var2 == -1) {
				return null;
			}
			class31 var5 = class31.method339(var2);
			if (var3 != -1) {
				if (var4 == -1) {
					class31 var9 = class31.method339(var3);
					class31[] var10 = new class31[] { var5, var9 };
					var5 = new class31(2, var10, 5);
				} else {
					class31 var6 = class31.method339(var3);
					class31 var7 = class31.method339(var4);
					class31[] var8 = new class31[] { var5, var6, var7 };
					var5 = new class31(3, var8, 5);
				}
			}
			if (arg0 == 0 && this.field1512 != 0) {
				var5.method352(this.field1512, 0, 0);
			}
			if (arg0 == 1 && this.field1499 != 0) {
				var5.method352(this.field1499, 0, 0);
			}
			if (this.field1496 != null) {
				for (int var11 = 0; var11 < this.field1496.length; var11++) {
					var5.method353(this.field1496[var11], this.field1537[var11]);
				}
			}
			return var5;
		} catch (RuntimeException var13) {
			signlink.reporterror("56000, " + ", " + arg0 + ", " + var13.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("XLZQSPZS.a(LEILHLJCE;B)V")
	public void method523(class17 arg0) {
		try {
			while (true) {
				int var2 = arg0.method224();
				if (var2 == 0) {
					return;
				}
				if (var2 == 1) {
					this.field1536 = arg0.method226();
				} else if (var2 == 2) {
					this.field1533 = arg0.method231();
				} else if (var2 == 3) {
					this.field1528 = arg0.method232();
				} else if (var2 == 4) {
					this.field1515 = arg0.method226();
				} else if (var2 == 5) {
					this.field1531 = arg0.method226();
				} else if (var2 == 6) {
					this.field1511 = arg0.method226();
				} else if (var2 == 7) {
					this.field1527 = arg0.method226();
					if (this.field1527 > 32767) {
						this.field1527 -= 65536;
					}
				} else if (var2 == 8) {
					this.field1513 = arg0.method226();
					if (this.field1513 > 32767) {
						this.field1513 -= 65536;
					}
				} else if (var2 == 10) {
					this.field1539 = arg0.method226();
				} else if (var2 == 11) {
					this.field1526 = true;
				} else if (var2 == 12) {
					this.field1509 = arg0.method229();
				} else if (var2 == 16) {
					this.field1507 = true;
				} else if (var2 == 23) {
					this.field1538 = arg0.method226();
					this.field1512 = arg0.method225();
				} else if (var2 == 24) {
					this.field1493 = arg0.method226();
				} else if (var2 == 25) {
					this.field1521 = arg0.method226();
					this.field1499 = arg0.method225();
				} else if (var2 == 26) {
					this.field1498 = arg0.method226();
				} else if (var2 >= 30 && var2 < 35) {
					if (this.field1502 == null) {
						this.field1502 = new String[5];
					}
					this.field1502[var2 - 30] = arg0.method231();
					if (this.field1502[var2 - 30].equalsIgnoreCase("hidden")) {
						this.field1502[var2 - 30] = null;
					}
				} else if (var2 >= 35 && var2 < 40) {
					if (this.field1530 == null) {
						this.field1530 = new String[5];
					}
					this.field1530[var2 - 35] = arg0.method231();
				} else if (var2 == 40) {
					int var3 = arg0.method224();
					this.field1496 = new int[var3];
					this.field1537 = new int[var3];
					for (int var4 = 0; var4 < var3; var4++) {
						this.field1496[var4] = arg0.method226();
						this.field1537[var4] = arg0.method226();
					}
				} else if (var2 == 78) {
					this.field1516 = arg0.method226();
				} else if (var2 == 79) {
					this.field1543 = arg0.method226();
				} else if (var2 == 90) {
					this.field1510 = arg0.method226();
				} else if (var2 == 91) {
					this.field1503 = arg0.method226();
				} else if (var2 == 92) {
					this.field1505 = arg0.method226();
				} else if (var2 == 93) {
					this.field1514 = arg0.method226();
				} else if (var2 == 95) {
					this.field1523 = arg0.method226();
				} else if (var2 == 97) {
					this.field1525 = arg0.method226();
				} else if (var2 == 98) {
					this.field1517 = arg0.method226();
				} else if (var2 >= 100 && var2 < 110) {
					if (this.field1492 == null) {
						this.field1492 = new int[10];
						this.field1504 = new int[10];
					}
					this.field1492[var2 - 100] = arg0.method226();
					this.field1504[var2 - 100] = arg0.method226();
				} else if (var2 == 110) {
					this.field1540 = arg0.method226();
				} else if (var2 == 111) {
					this.field1542 = arg0.method226();
				} else if (var2 == 112) {
					this.field1519 = arg0.method226();
				} else if (var2 == 113) {
					this.field1529 = arg0.method225();
				} else if (var2 == 114) {
					this.field1497 = arg0.method225() * 5;
				} else if (var2 == 115) {
					this.field1500 = arg0.method224();
				}
			}
		} catch (RuntimeException var6) {
			signlink.reporterror("29940, " + arg0 + ", " + -50 + ", " + var6.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("XLZQSPZS.d(II)LKBEXSZSN;")
	public class31 method525(int arg0) {
		try {
			int var2 = this.field1510;
			int var3 = this.field1505;
			if (arg0 == 1) {
				var2 = this.field1503;
				var3 = this.field1514;
			}
			if (var2 == -1) {
				return null;
			}
			class31 var4 = class31.method339(var2);
			if (var3 != -1) {
				class31 var5 = class31.method339(var3);
				class31[] var6 = new class31[] { var4, var5 };
				var4 = new class31(2, var6, 5);
			}
			if (this.field1496 != null) {
				for (int var7 = 0; var7 < this.field1496.length; var7++) {
					var4.method353(this.field1496[var7], this.field1537[var7]);
				}
			}
			return var4;
		} catch (RuntimeException var9) {
			signlink.reporterror("47692, " + 8 + ", " + arg0 + ", " + var9.toString());
			throw new RuntimeException();
		}
	}
}
