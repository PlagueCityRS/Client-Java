package jagex2.dash3d;

import deob.*;
import jagex2.datastruct.LinkList;
import jagex2.graphics.Pix2D;
import sign.signlink;

@ObfuscatedName("XOHMKFIT")
public final class World {

	@ObfuscatedName("XOHMKFIT.j")
	public static boolean field1553 = true;

	@ObfuscatedName("XOHMKFIT.J")
	public static Sprite[] field1579 = new Sprite[100];

	@ObfuscatedName("XOHMKFIT.K")
	public static final int[] field1580 = new int[] { 53, -53, -53, 53 };

	@ObfuscatedName("XOHMKFIT.L")
	public static final int[] field1581 = new int[] { -53, -53, 53, 53 };

	@ObfuscatedName("XOHMKFIT.M")
	public static final int[] field1582 = new int[] { -45, 45, 45, -45 };

	@ObfuscatedName("XOHMKFIT.N")
	public static final int[] field1583 = new int[] { 45, 45, -45, -45 };

	@ObfuscatedName("XOHMKFIT.R")
	public static int field1587 = -1;

	@ObfuscatedName("XOHMKFIT.S")
	public static int field1588 = -1;

	@ObfuscatedName("XOHMKFIT.T")
	public static final int field1589 = 4;

	@ObfuscatedName("XOHMKFIT.U")
	public static int[] field1590 = new int[field1589];

	@ObfuscatedName("XOHMKFIT.V")
	public static Occlude[][] field1591 = new Occlude[field1589][500];

	@ObfuscatedName("XOHMKFIT.X")
	public static final Occlude[] field1593 = new Occlude[500];

	@ObfuscatedName("XOHMKFIT.Y")
	public static LinkList field1594 = new LinkList(807);

	@ObfuscatedName("XOHMKFIT.Z")
	public static final int[] field1595 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

	@ObfuscatedName("XOHMKFIT.ab")
	public static final int[] field1596 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

	@ObfuscatedName("XOHMKFIT.bb")
	public static final int[] field1597 = new int[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

	@ObfuscatedName("XOHMKFIT.cb")
	public static final int[] field1598 = new int[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

	@ObfuscatedName("XOHMKFIT.db")
	public static final int[] field1599 = new int[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

	@ObfuscatedName("XOHMKFIT.eb")
	public static final int[] field1600 = new int[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

	@ObfuscatedName("XOHMKFIT.fb")
	public static final int[] field1601 = new int[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

	@ObfuscatedName("XOHMKFIT.gb")
	public static final int[] field1602 = new int[] { 41, 39248, 41, 4643, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 43086, 41, 41, 41, 41, 41, 41, 41, 8602, 41, 28992, 41, 41, 41, 41, 41, 5056, 41, 41, 41, 7079, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 3131, 41, 41, 41 };

	@ObfuscatedName("XOHMKFIT.mb")
	public static boolean[][][][] field1608 = new boolean[8][32][51][51];

	@ObfuscatedName("XOHMKFIT.a")
	public final byte field1544 = 80;

	@ObfuscatedName("XOHMKFIT.c")
	public final byte field1546 = -32;

	@ObfuscatedName("XOHMKFIT.d")
	public final int field1547 = -89;

	@ObfuscatedName("XOHMKFIT.e")
	public final int field1548 = 642;

	@ObfuscatedName("XOHMKFIT.f")
	public final byte field1549 = 2;

	@ObfuscatedName("XOHMKFIT.g")
	public boolean field1550 = true;

	@ObfuscatedName("XOHMKFIT.h")
	public final int field1551 = 868;

	@ObfuscatedName("XOHMKFIT.i")
	public boolean field1552 = true;

	@ObfuscatedName("XOHMKFIT.r")
	public final Sprite[] field1561 = new Sprite[5000];

	@ObfuscatedName("XOHMKFIT.hb")
	public final int[] field1603 = new int[10000];

	@ObfuscatedName("XOHMKFIT.ib")
	public final int[] field1604 = new int[10000];

	@ObfuscatedName("XOHMKFIT.kb")
	public final int[][] field1606 = new int[][] { new int[16], { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 }, { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };

	@ObfuscatedName("XOHMKFIT.lb")
	public final int[][] field1607 = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };

	@ObfuscatedName("XOHMKFIT.k")
	public final int field1554;

	@ObfuscatedName("XOHMKFIT.l")
	public final int field1555;

	@ObfuscatedName("XOHMKFIT.m")
	public final int field1556;

	@ObfuscatedName("XOHMKFIT.o")
	public final Square[][][] squares;

	@ObfuscatedName("XOHMKFIT.s")
	public final int[][][] field1562;

	@ObfuscatedName("XOHMKFIT.n")
	public final int[][][] field1557;

	@ObfuscatedName("XOHMKFIT.b")
	public int field1545;

	@ObfuscatedName("XOHMKFIT.p")
	public int field1559;

	@ObfuscatedName("XOHMKFIT.q")
	public int field1560;

	@ObfuscatedName("XOHMKFIT.t")
	public static int field1563;

	@ObfuscatedName("XOHMKFIT.u")
	public static int field1564;

	@ObfuscatedName("XOHMKFIT.v")
	public static int field1565;

	@ObfuscatedName("XOHMKFIT.w")
	public static int field1566;

	@ObfuscatedName("XOHMKFIT.x")
	public static int field1567;

	@ObfuscatedName("XOHMKFIT.y")
	public static int field1568;

	@ObfuscatedName("XOHMKFIT.z")
	public static int field1569;

	@ObfuscatedName("XOHMKFIT.A")
	public static int field1570;

	@ObfuscatedName("XOHMKFIT.B")
	public static int field1571;

	@ObfuscatedName("XOHMKFIT.C")
	public static int field1572;

	@ObfuscatedName("XOHMKFIT.D")
	public static int field1573;

	@ObfuscatedName("XOHMKFIT.E")
	public static int field1574;

	@ObfuscatedName("XOHMKFIT.F")
	public static int field1575;

	@ObfuscatedName("XOHMKFIT.G")
	public static int field1576;

	@ObfuscatedName("XOHMKFIT.H")
	public static int field1577;

	@ObfuscatedName("XOHMKFIT.I")
	public static int field1578;

	@ObfuscatedName("XOHMKFIT.P")
	public static int field1585;

	@ObfuscatedName("XOHMKFIT.Q")
	public static int field1586;

	@ObfuscatedName("XOHMKFIT.W")
	public static int field1592;

	@ObfuscatedName("XOHMKFIT.jb")
	public int field1605;

	@ObfuscatedName("XOHMKFIT.ob")
	public static int field1610;

	@ObfuscatedName("XOHMKFIT.pb")
	public static int field1611;

	@ObfuscatedName("XOHMKFIT.qb")
	public static int field1612;

	@ObfuscatedName("XOHMKFIT.rb")
	public static int field1613;

	@ObfuscatedName("XOHMKFIT.sb")
	public static int field1614;

	@ObfuscatedName("XOHMKFIT.tb")
	public static int field1615;

	@ObfuscatedName("XOHMKFIT.O")
	public static boolean field1584;

	@ObfuscatedName("XOHMKFIT.nb")
	public static boolean[][] field1609;

	@ObfuscatedName("XOHMKFIT.a(I)V")
	public static void method527() {
		try {
			field1579 = null;
			field1590 = null;
			field1591 = null;
			field1594 = null;
			field1608 = null;
			field1609 = null;
		} catch (RuntimeException var1) {
			signlink.reporterror("56769, " + ", " + var1.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("XOHMKFIT.a(IIIIIIBII)V")
	public static void setOcclude(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7, int arg8) {
		try {
			Occlude var9 = new Occlude();
			var9.field1067 = arg7 / 128;
			var9.field1068 = arg3 / 128;
			var9.field1069 = arg5 / 128;
			var9.field1070 = arg0 / 128;
			var9.field1071 = arg2;
			var9.field1072 = arg7;
			var9.field1073 = arg3;
			var9.field1074 = arg5;
			var9.field1075 = arg0;
			var9.field1076 = arg1;
			boolean var12 = false;
			var9.field1077 = arg4;
			field1591[arg8][field1590[arg8]++] = var9;
		} catch (RuntimeException var11) {
			signlink.reporterror("59890, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + var11.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("XOHMKFIT.a(IZII[II)V")
	public static void resetVisCalc(int[] arg0) {
		try {
			field1612 = 0;
			field1613 = 0;
			field1614 = 512;
			field1615 = 334;
			field1610 = 256;
			field1611 = 167;
			boolean[][][][] var1 = new boolean[9][32][53][53];
			for (int var2 = 128; var2 <= 384; var2 += 32) {
				for (int var3 = 0; var3 < 2048; var3 += 64) {
					field1575 = Model.sinTable[var2];
					field1576 = Model.cosTable[var2];
					field1577 = Model.sinTable[var3];
					field1578 = Model.cosTable[var3];
					int var4 = (var2 - 128) / 32;
					int var5 = var3 / 64;
					for (int var6 = -26; var6 <= 26; var6++) {
						for (int var7 = -26; var7 <= 26; var7++) {
							int var8 = var6 * 128;
							int var9 = var7 * 128;
							boolean var10 = false;
							for (int var11 = -500; var11 <= 800; var11 += 128) {
								if (method565(568, arg0[var4] + var11, var9, var8)) {
									var10 = true;
									break;
								}
							}
							var1[var4][var5][var6 + 25 + 1][var7 + 25 + 1] = var10;
						}
					}
				}
			}
			for (int var12 = 0; var12 < 8; var12++) {
				for (int var13 = 0; var13 < 32; var13++) {
					for (int var14 = -25; var14 < 25; var14++) {
						for (int var15 = -25; var15 < 25; var15++) {
							boolean var16 = false;
							label79: for (int var17 = -1; var17 <= 1; var17++) {
								for (int var18 = -1; var18 <= 1; var18++) {
									if (var1[var12][var13][var14 + var17 + 25 + 1][var15 + var18 + 25 + 1]) {
										var16 = true;
										break label79;
									}
									if (var1[var12][(var13 + 1) % 31][var14 + var17 + 25 + 1][var15 + var18 + 25 + 1]) {
										var16 = true;
										break label79;
									}
									if (var1[var12 + 1][var13][var14 + var17 + 25 + 1][var15 + var18 + 25 + 1]) {
										var16 = true;
										break label79;
									}
									if (var1[var12 + 1][(var13 + 1) % 31][var14 + var17 + 25 + 1][var15 + var18 + 25 + 1]) {
										var16 = true;
										break label79;
									}
								}
							}
							field1608[var12][var13][var14 + 25][var15 + 25] = var16;
						}
					}
				}
			}
		} catch (RuntimeException var20) {
			signlink.reporterror("52530, " + 800 + ", " + true + ", " + 500 + ", " + 512 + ", " + arg0 + ", " + 334 + ", " + var20.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("XOHMKFIT.l(IIII)Z")
	public static boolean method565(int arg0, int arg1, int arg2, int arg3) {
		try {
			int var4 = arg2 * field1577 + arg3 * field1578 >> 16;
			int var5 = arg2 * field1578 - arg3 * field1577 >> 16;
			int var6 = arg1 * field1575 + var5 * field1576 >> 16;
			int var7 = arg1 * field1576 - var5 * field1575 >> 16;
			boolean var12 = false;
			if (var6 >= 50 && var6 <= 3500) {
				int var8 = field1610 + (var4 << 9) / var6;
				int var9 = field1611 + (var7 << 9) / var6;
				return var8 >= field1612 && var8 <= field1614 && var9 >= field1613 && var9 <= field1615;
			} else {
				return false;
			}
		} catch (RuntimeException var11) {
			signlink.reporterror("392, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + var11.toString());
			throw new RuntimeException();
		}
	}

	public World(int arg0, int arg1, int[][][] arg2, int arg3, int arg4) {
		try {
			this.field1554 = 4;
			this.field1555 = 104;
			this.field1556 = 104;
			this.squares = new Square[4][104][104];
			this.field1562 = new int[4][105][105];
			this.field1557 = arg2;
			this.resetMap((byte) 9);
		} catch (RuntimeException var7) {
			signlink.reporterror("96234, " + 104 + ", " + 104 + ", " + arg2 + ", " + 4 + ", " + -160 + ", " + var7.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("XOHMKFIT.a(B)V")
	public void resetMap(byte arg0) {
		try {
			for (int var2 = 0; var2 < this.field1554; var2++) {
				for (int var3 = 0; var3 < this.field1555; var3++) {
					for (int var4 = 0; var4 < this.field1556; var4++) {
						this.squares[var2][var3][var4] = null;
					}
				}
			}
			for (int var5 = 0; var5 < field1589; var5++) {
				for (int var6 = 0; var6 < field1590[var5]; var6++) {
					field1591[var5][var6] = null;
				}
				field1590[var5] = 0;
			}
			boolean var11 = false;
			for (int var7 = 0; var7 < this.field1560; var7++) {
				this.field1561[var7] = null;
			}
			this.field1560 = 0;
			for (int var8 = 0; var8 < field1579.length; var8++) {
				field1579[var8] = null;
			}
		} catch (RuntimeException var10) {
			signlink.reporterror("38076, " + arg0 + ", " + var10.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("XOHMKFIT.a(BI)V")
	public void method529(byte arg0, int arg1) {
		try {
			if (arg0 != 7) {
				this.field1552 = !this.field1552;
			}
			this.field1559 = arg1;
			for (int var3 = 0; var3 < this.field1555; var3++) {
				for (int var4 = 0; var4 < this.field1556; var4++) {
					if (this.squares[arg1][var3][var4] == null) {
						this.squares[arg1][var3][var4] = new Square(arg1, var3, var4);
					}
				}
			}
		} catch (RuntimeException var6) {
			signlink.reporterror("51866, " + arg0 + ", " + arg1 + ", " + var6.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("XOHMKFIT.a(III)V")
	public void method530(int arg0, int arg1) {
		try {
			Square var3 = this.squares[0][arg1][arg0];
			for (int var4 = 0; var4 < 3; var4++) {
				Square var5 = this.squares[var4][arg1][arg0] = this.squares[var4 + 1][arg1][arg0];
				if (var5 != null) {
					var5.level--;
					for (int var6 = 0; var6 < var5.field1259; var6++) {
						Sprite var7 = var5.sprites[var6];
						if ((var7.field1311 >> 29 & 0x3) == 2 && var7.field1305 == arg1 && var7.field1307 == arg0) {
							var7.field1299--;
						}
					}
				}
			}
			if (this.squares[0][arg1][arg0] == null) {
				this.squares[0][arg1][arg0] = new Square(0, arg1, arg0);
			}
			this.squares[0][arg1][arg0].field1271 = var3;
			this.squares[3][arg1][arg0] = null;
		} catch (RuntimeException var9) {
			signlink.reporterror("30189, " + arg0 + ", " + arg1 + ", " + ", " + var9.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("XOHMKFIT.a(IIII)V")
	public void method532(int arg0, int arg1, int arg2, int arg3) {
		Square var5 = this.squares[arg0][arg1][arg2];
		if (var5 != null) {
			this.squares[arg0][arg1][arg2].field1263 = arg3;
		}
	}

	@ObfuscatedName("XOHMKFIT.a(IIIIIIIIIIIIIIIIIIII)V")
	public void method533(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19) {
		if (arg3 == 0) {
			QuickGround var21 = new QuickGround(arg10, arg11, arg12, arg13, -1, arg18, false);
			for (int var22 = arg0; var22 >= 0; var22--) {
				if (this.squares[var22][arg1][arg2] == null) {
					this.squares[var22][arg1][arg2] = new Square(var22, arg1, arg2);
				}
			}
			this.squares[arg0][arg1][arg2].field1253 = var21;
		} else if (arg3 == 1) {
			QuickGround var23 = new QuickGround(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
			for (int var24 = arg0; var24 >= 0; var24--) {
				if (this.squares[var24][arg1][arg2] == null) {
					this.squares[var24][arg1][arg2] = new Square(var24, arg1, arg2);
				}
			}
			this.squares[arg0][arg1][arg2].field1253 = var23;
		} else {
			Ground var25 = new Ground(arg16, arg3, arg10, arg15, arg14, arg17, arg4, arg18, arg13, arg2, 6, arg19, arg9, arg8, arg5, arg12, arg11, arg1, arg6, arg7);
			for (int var26 = arg0; var26 >= 0; var26--) {
				if (this.squares[var26][arg1][arg2] == null) {
					this.squares[var26][arg1][arg2] = new Square(var26, arg1, arg2);
				}
			}
			this.squares[arg0][arg1][arg2].field1254 = var25;
		}
	}

	@ObfuscatedName("XOHMKFIT.a(BBIIIILXHDBBLMT;I)V")
	public void setGroundDecor(byte arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, ModelSource arg6, int arg7) {
		try {
			if (arg6 != null) {
				GroundDecor var9 = new GroundDecor();
				var9.model = arg6;
				var9.field979 = arg3 * 128 + 64;
				var9.field980 = arg2 * 128 + 64;
				boolean var12 = false;
				var9.field978 = arg4;
				var9.field982 = arg7;
				var9.field983 = arg0;
				if (this.squares[arg5][arg3][arg2] == null) {
					this.squares[arg5][arg3][arg2] = new Square(arg5, arg3, arg2);
				}
				this.squares[arg5][arg3][arg2].groundDecor = var9;
			}
		} catch (RuntimeException var11) {
			signlink.reporterror("20699, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + var11.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("XOHMKFIT.a(LXHDBBLMT;IIIIILXHDBBLMT;LXHDBBLMT;I)V")
	public void method535(ModelSource arg0, int arg1, int arg2, int arg3, int arg4, ModelSource arg5, ModelSource arg6, int arg7) {
		try {
			GroundObject var9 = new GroundObject();
			var9.field1204 = arg6;
			var9.field1202 = arg4 * 128 + 64;
			var9.field1203 = arg3 * 128 + 64;
			var9.field1201 = arg2;
			var9.field1207 = arg7;
			var9.field1205 = arg5;
			var9.field1206 = arg0;
			int var10 = 0;
			Square var11 = this.squares[arg1][arg4][arg3];
			if (var11 != null) {
				for (int var12 = 0; var12 < var11.field1259; var12++) {
					if (var11.sprites[var12].model instanceof Model) {
						int var13 = ((Model) var11.sprites[var12].model).objRaise;
						if (var13 > var10) {
							var10 = var13;
						}
					}
				}
			}
			var9.field1208 = var10;
			if (this.squares[arg1][arg4][arg3] == null) {
				this.squares[arg1][arg4][arg3] = new Square(arg1, arg4, arg3);
			}
			this.squares[arg1][arg4][arg3].field1258 = var9;
		} catch (RuntimeException var15) {
			signlink.reporterror("5796, " + arg0 + ", " + 5 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + var15.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("XOHMKFIT.a(IILXHDBBLMT;LXHDBBLMT;IIIIIBI)V")
	public void setWall(int arg0, int arg1, ModelSource arg2, ModelSource arg3, int arg4, int arg5, int arg6, int arg7, byte arg8, int arg9) {
		try {
			if (arg3 != null || arg2 != null) {
				Wall var11 = new Wall();
				var11.field1163 = arg4;
				var11.field1164 = arg8;
				var11.field1157 = arg9 * 128 + 64;
				var11.field1158 = arg1 * 128 + 64;
				var11.field1156 = arg7;
				var11.field1161 = arg3;
				var11.field1162 = arg2;
				var11.field1159 = arg0;
				var11.field1160 = arg5;
				for (int var12 = arg6; var12 >= 0; var12--) {
					if (this.squares[var12][arg9][arg1] == null) {
						this.squares[var12][arg9][arg1] = new Square(var12, arg9, arg1);
					}
				}
				this.squares[arg6][arg9][arg1].wall = var11;
			}
		} catch (RuntimeException var14) {
			signlink.reporterror("99946, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + 742 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + var14.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("XOHMKFIT.a(IIIIIIIILXHDBBLMT;IBI)V")
	public void setDecor(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, ModelSource arg7, int arg8, byte arg9, int arg10) {
		try {
			if (arg7 != null) {
				Decor var12 = new Decor();
				var12.field1112 = arg4;
				var12.field1113 = arg9;
				var12.field1107 = arg8 * 128 + arg0 + 64;
				var12.field1108 = arg2 * 128 + arg5 + 64;
				var12.field1106 = arg1;
				var12.model = arg7;
				var12.field1109 = arg3;
				var12.field1110 = arg6;
				for (int var13 = arg10; var13 >= 0; var13--) {
					if (this.squares[var13][arg8][arg2] == null) {
						this.squares[var13][arg8][arg2] = new Square(var13, arg8, arg2);
					}
				}
				this.squares[arg10][arg8][arg2].decor = var12;
			}
		} catch (RuntimeException var15) {
			signlink.reporterror("2735, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + -691 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + arg10 + ", " + var15.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("XOHMKFIT.a(IIIIBIIIILXHDBBLMT;I)Z")
	public boolean addScenery(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7, ModelSource arg8, int arg9) {
		try {
			if (arg8 == null) {
				return true;
			} else {
				int var11 = arg4 * 128 + arg2 * 64;
				int var12 = arg9 * 128 + arg1 * 64;
				return this.setSprite(arg0, arg4, arg9, arg2, arg1, var11, var12, arg5, arg8, arg7, false, arg6, arg3);
			}
		} catch (RuntimeException var14) {
			signlink.reporterror("61338, " + arg0 + ", " + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + var14.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("XOHMKFIT.a(IIIIZILXHDBBLMT;IZI)Z")
	public boolean addDynamic(int arg0, int arg1, int arg2, int arg3, int arg4, ModelSource arg5, int arg6, boolean arg7, int arg8) {
		try {
			if (arg5 == null) {
				return true;
			}
			int var10 = arg0 - arg4;
			int var11 = arg3 - arg4;
			int var12 = arg0 + arg4;
			int var13 = arg3 + arg4;
			if (arg7) {
				if (arg1 > 640 && arg1 < 1408) {
					var13 += 128;
				}
				if (arg1 > 1152 && arg1 < 1920) {
					var12 += 128;
				}
				if (arg1 > 1664 || arg1 < 384) {
					var11 -= 128;
				}
				if (arg1 > 128 && arg1 < 896) {
					var10 -= 128;
				}
			}
			int var14 = var10 / 128;
			int var15 = var11 / 128;
			int var16 = var12 / 128;
			int var17 = var13 / 128;
			return this.setSprite(arg2, var14, var15, var16 + 1 - var14, var17 - var15 + 1, arg0, arg3, arg6, arg5, arg1, true, arg8, (byte) 0);
		} catch (RuntimeException var19) {
			signlink.reporterror("25243, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + true + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + var19.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("XOHMKFIT.a(IIIIIIIIILXHDBBLMT;III)Z")
	public boolean addDynamic2(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, ModelSource arg8, int arg9, int arg10, int arg11) {
		try {
			if (arg10 <= 0) {
				throw new NullPointerException();
			} else if (arg8 == null) {
				return true;
			} else {
				return this.setSprite(arg6, arg11, arg9, arg7 + 1 - arg11, arg4 - arg9 + 1, arg0, arg5, arg2, arg8, arg1, true, arg3, (byte) 0);
			}
		} catch (RuntimeException var14) {
			signlink.reporterror("52645, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + 60 + ", " + arg8 + ", " + arg9 + ", " + arg10 + ", " + arg11 + ", " + var14.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("XOHMKFIT.a(IIIIIIIILXHDBBLMT;IZIB)Z")
	public boolean setSprite(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, ModelSource arg8, int arg9, boolean arg10, int arg11, byte arg12) {
		for (int var14 = arg1; var14 < arg1 + arg3; var14++) {
			for (int var15 = arg2; var15 < arg2 + arg4; var15++) {
				if (var14 < 0 || var15 < 0 || var14 >= this.field1555 || var15 >= this.field1556) {
					return false;
				}
				Square var16 = this.squares[arg0][var14][var15];
				if (var16 != null && var16.field1259 >= 5) {
					return false;
				}
			}
		}
		Sprite var17 = new Sprite();
		var17.field1311 = arg11;
		var17.field1312 = arg12;
		var17.field1299 = arg0;
		var17.field1301 = arg5;
		var17.field1302 = arg6;
		var17.field1300 = arg7;
		var17.model = arg8;
		var17.field1304 = arg9;
		var17.field1305 = arg1;
		var17.field1307 = arg2;
		var17.field1306 = arg1 + arg3 - 1;
		var17.field1308 = arg2 + arg4 - 1;
		for (int var18 = arg1; var18 < arg1 + arg3; var18++) {
			for (int var19 = arg2; var19 < arg2 + arg4; var19++) {
				int var20 = 0;
				if (var18 > arg1) {
					var20++;
				}
				if (var18 < arg1 + arg3 - 1) {
					var20 += 4;
				}
				if (var19 > arg2) {
					var20 += 8;
				}
				if (var19 < arg2 + arg4 - 1) {
					var20 += 2;
				}
				for (int var21 = arg0; var21 >= 0; var21--) {
					if (this.squares[var21][var18][var19] == null) {
						this.squares[var21][var18][var19] = new Square(var21, var18, var19);
					}
				}
				Square var22 = this.squares[arg0][var18][var19];
				var22.sprites[var22.field1259] = var17;
				var22.spriteSpan[var22.field1259] = var20;
				var22.field1262 |= var20;
				var22.field1259++;
			}
		}
		if (arg10) {
			this.field1561[this.field1560++] = var17;
		}
		return true;
	}

	@ObfuscatedName("XOHMKFIT.b(B)V")
	public void removeSprites() {
		try {
			for (int var1 = 0; var1 < this.field1560; var1++) {
				Sprite var2 = this.field1561[var1];
				this.method543(var2);
				this.field1561[var1] = null;
			}
			this.field1560 = 0;
		} catch (RuntimeException var4) {
			signlink.reporterror("49571, " + -22 + ", " + var4.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("XOHMKFIT.a(LRJJKHPFX;B)V")
	public void method543(Sprite arg0) {
		try {
			for (int var2 = arg0.field1305; var2 <= arg0.field1306; var2++) {
				for (int var3 = arg0.field1307; var3 <= arg0.field1308; var3++) {
					Square var4 = this.squares[arg0.field1299][var2][var3];
					if (var4 != null) {
						for (int var5 = 0; var5 < var4.field1259; var5++) {
							if (var4.sprites[var5] == arg0) {
								var4.field1259--;
								for (int var6 = var5; var6 < var4.field1259; var6++) {
									var4.sprites[var6] = var4.sprites[var6 + 1];
									var4.spriteSpan[var6] = var4.spriteSpan[var6 + 1];
								}
								var4.sprites[var4.field1259] = null;
								break;
							}
						}
						var4.field1262 = 0;
						for (int var7 = 0; var7 < var4.field1259; var7++) {
							var4.field1262 |= var4.spriteSpan[var7];
						}
					}
				}
			}
			if (this.field1546 == -32) {
				;
			}
		} catch (RuntimeException var9) {
			signlink.reporterror("50341, " + arg0 + ", " + -32 + ", " + var9.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("XOHMKFIT.a(IIIBI)V")
	public void moveDecor(int arg0, int arg1, int arg2, int arg3) {
		try {
			Square var5 = this.squares[arg0][arg2][arg1];
			if (var5 != null) {
				Decor var6 = var5.decor;
				if (var6 != null) {
					int var7 = arg2 * 128 + 64;
					int var8 = arg1 * 128 + 64;
					var6.field1107 = var7 + (var6.field1107 - var7) * arg3 / 16;
					var6.field1108 = var8 + (var6.field1108 - var8) * arg3 / 16;
				}
			}
		} catch (RuntimeException var10) {
			signlink.reporterror("69425, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 51 + ", " + arg3 + ", " + var10.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("XOHMKFIT.a(ZIII)V")
	public void method545(int arg0, int arg1, int arg2) {
		try {
			Square var4 = this.squares[arg1][arg0][arg2];
			if (var4 != null) {
				var4.wall = null;
			}
		} catch (RuntimeException var6) {
			signlink.reporterror("82166, " + false + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + var6.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("XOHMKFIT.b(IIII)V")
	public void method546(int arg0, int arg1, int arg2) {
		try {
			Square var4 = this.squares[arg0][arg2][arg1];
			if (var4 != null) {
				var4.decor = null;
			}
		} catch (RuntimeException var6) {
			signlink.reporterror("37565, " + arg0 + ", " + arg1 + ", " + 392 + ", " + arg2 + ", " + var6.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("XOHMKFIT.c(IIII)V")
	public void method547(int arg0, int arg1, int arg2) {
		try {
			Square var4 = this.squares[arg2][arg1][arg0];
			if (var4 != null) {
				for (int var5 = 0; var5 < var4.field1259; var5++) {
					Sprite var6 = var4.sprites[var5];
					if ((var6.field1311 >> 29 & 0x3) == 2 && var6.field1305 == arg1 && var6.field1307 == arg0) {
						this.method543(var6);
						return;
					}
				}
			}
		} catch (RuntimeException var8) {
			signlink.reporterror("93928, " + arg0 + ", " + -89 + ", " + arg1 + ", " + arg2 + ", " + var8.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("XOHMKFIT.d(IIII)V")
	public void delGroundDecor(int arg0, int arg1, int arg2) {
		try {
			Square var4 = this.squares[arg2][arg1][arg0];
			if (var4 != null) {
				var4.groundDecor = null;
			}
		} catch (RuntimeException var6) {
			signlink.reporterror("73496, " + arg0 + ", " + arg1 + ", " + 2 + ", " + arg2 + ", " + var6.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("XOHMKFIT.b(III)V")
	public void delObj(int arg0, int arg1, int arg2) {
		Square var4 = this.squares[arg0][arg1][arg2];
		if (var4 != null) {
			var4.field1258 = null;
		}
	}

	@ObfuscatedName("XOHMKFIT.e(IIII)LNZICAUCM;")
	public Wall method550(int arg0, int arg1, int arg2) {
		try {
			Square var4 = this.squares[arg0][arg1][arg2];
			return var4 == null ? null : var4.wall;
		} catch (RuntimeException var6) {
			signlink.reporterror("85920, " + arg0 + ", " + arg1 + ", " + ", " + arg2 + ", " + var6.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("XOHMKFIT.f(IIII)LMIRXZWXX;")
	public Decor method551(int arg0, int arg1, int arg2) {
		try {
			Square var4 = this.squares[arg1][arg2][arg0];
			return var4 == null ? null : var4.decor;
		} catch (RuntimeException var6) {
			signlink.reporterror("38249, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + -2944 + ", " + var6.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("XOHMKFIT.g(IIII)LRJJKHPFX;")
	public Sprite method552(int arg0, int arg1, int arg2) {
		try {
			Square var4 = this.squares[arg0][arg1][arg2];
			if (var4 == null) {
				return null;
			}
			for (int var5 = 0; var5 < var4.field1259; var5++) {
				Sprite var6 = var4.sprites[var5];
				if ((var6.field1311 >> 29 & 0x3) == 2 && var6.field1305 == arg1 && var6.field1307 == arg2) {
					return var6;
				}
			}
			return null;
		} catch (RuntimeException var8) {
			signlink.reporterror("99884, " + arg0 + ", " + 6 + ", " + arg1 + ", " + arg2 + ", " + var8.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("XOHMKFIT.h(IIII)LJIDWLPIO;")
	public GroundDecor method553(int arg0, int arg1, int arg2, int arg3) {
		try {
			if (arg2 != 1914) {
				throw new NullPointerException();
			}
			Square var5 = this.squares[arg1][arg3][arg0];
			return var5 == null || var5.groundDecor == null ? null : var5.groundDecor;
		} catch (RuntimeException var7) {
			signlink.reporterror("79085, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + var7.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("XOHMKFIT.c(III)I")
	public int wallType(int arg0, int arg1, int arg2) {
		Square var4 = this.squares[arg0][arg1][arg2];
		return var4 == null || var4.wall == null ? 0 : var4.wall.field1163;
	}

	@ObfuscatedName("XOHMKFIT.i(IIII)I")
	public int decorType(int arg0, int arg1, int arg2, int arg3) {
		try {
			boolean var8 = false;
			Square var5 = this.squares[arg1][arg3][arg2];
			return var5 == null || var5.decor == null ? 0 : var5.decor.field1112;
		} catch (RuntimeException var7) {
			signlink.reporterror("1668, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + var7.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("XOHMKFIT.d(III)I")
	public int sceneType(int arg0, int arg1, int arg2) {
		Square var4 = this.squares[arg0][arg1][arg2];
		if (var4 == null) {
			return 0;
		}
		for (int var5 = 0; var5 < var4.field1259; var5++) {
			Sprite var6 = var4.sprites[var5];
			if ((var6.field1311 >> 29 & 0x3) == 2 && var6.field1305 == arg1 && var6.field1307 == arg2) {
				return var6.field1311;
			}
		}
		return 0;
	}

	@ObfuscatedName("XOHMKFIT.e(III)I")
	public int gdType(int arg0, int arg1, int arg2) {
		Square var4 = this.squares[arg0][arg1][arg2];
		return var4 == null || var4.groundDecor == null ? 0 : var4.groundDecor.field982;
	}

	@ObfuscatedName("XOHMKFIT.j(IIII)I")
	public int typeCode2(int arg0, int arg1, int arg2, int arg3) {
		Square var5 = this.squares[arg0][arg1][arg2];
		if (var5 == null) {
			return -1;
		} else if (var5.wall != null && var5.wall.field1163 == arg3) {
			return var5.wall.field1164 & 0xFF;
		} else if (var5.decor != null && var5.decor.field1112 == arg3) {
			return var5.decor.field1113 & 0xFF;
		} else if (var5.groundDecor != null && var5.groundDecor.field982 == arg3) {
			return var5.groundDecor.field983 & 0xFF;
		} else {
			for (int var6 = 0; var6 < var5.field1259; var6++) {
				if (var5.sprites[var6].field1311 == arg3) {
					return var5.sprites[var6].field1312 & 0xFF;
				}
			}
			return -1;
		}
	}

	@ObfuscatedName("XOHMKFIT.k(IIII)V")
	public void method559() {
		try {
			for (int var1 = 0; var1 < this.field1554; var1++) {
				for (int var2 = 0; var2 < this.field1555; var2++) {
					for (int var3 = 0; var3 < this.field1556; var3++) {
						Square var4 = this.squares[var1][var2][var3];
						if (var4 != null) {
							Wall var5 = var4.wall;
							if (var5 != null && var5.field1161 != null && var5.field1161.pointNormal != null) {
								this.method561(var3, var2, var1, this.field1549, 1, 1, (Model) var5.field1161);
								if (var5.field1162 != null && var5.field1162.pointNormal != null) {
									this.method561(var3, var2, var1, this.field1549, 1, 1, (Model) var5.field1162);
									this.method562((Model) var5.field1161, (Model) var5.field1162, 0, 0, 0, false);
									((Model) var5.field1162).method357(this.field1544);
								}
								((Model) var5.field1161).method357(this.field1544);
							}
							for (int var6 = 0; var6 < var4.field1259; var6++) {
								Sprite var7 = var4.sprites[var6];
								if (var7 != null && var7.model != null && var7.model.pointNormal != null) {
									this.method561(var3, var2, var1, this.field1549, var7.field1308 + 1 - var7.field1307, var7.field1306 - var7.field1305 + 1, (Model) var7.model);
									((Model) var7.model).method357(this.field1544);
								}
							}
							GroundDecor var8 = var4.groundDecor;
							if (var8 != null && var8.model.pointNormal != null) {
								this.method560(var3, (Model) var8.model, var1, var2);
								((Model) var8.model).method357(this.field1544);
							}
						}
					}
				}
			}
		} catch (RuntimeException var10) {
			signlink.reporterror("79622, " + 126 + ", " + -50 + ", " + -50 + ", " + -10 + ", " + var10.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("XOHMKFIT.a(IILKBEXSZSN;II)V")
	public void method560(int arg0, Model arg1, int arg2, int arg3) {
		try {
			if (arg3 < this.field1555) {
				Square var5 = this.squares[arg2][arg3 + 1][arg0];
				if (var5 != null && var5.groundDecor != null && var5.groundDecor.model.pointNormal != null) {
					this.method562(arg1, (Model) var5.groundDecor.model, 128, 0, 0, true);
				}
			}
			if (arg0 < this.field1555) {
				Square var6 = this.squares[arg2][arg3][arg0 + 1];
				if (var6 != null && var6.groundDecor != null && var6.groundDecor.model.pointNormal != null) {
					this.method562(arg1, (Model) var6.groundDecor.model, 0, 0, 128, true);
				}
			}
			if (arg3 < this.field1555 && arg0 < this.field1556) {
				Square var7 = this.squares[arg2][arg3 + 1][arg0 + 1];
				if (var7 != null && var7.groundDecor != null && var7.groundDecor.model.pointNormal != null) {
					this.method562(arg1, (Model) var7.groundDecor.model, 128, 0, 128, true);
				}
			}
			if (arg3 < this.field1555 && arg0 > 0) {
				Square var8 = this.squares[arg2][arg3 + 1][arg0 - 1];
				if (var8 != null && var8.groundDecor != null && var8.groundDecor.model.pointNormal != null) {
					this.method562(arg1, (Model) var8.groundDecor.model, 128, 0, -128, true);
					return;
				}
			}
		} catch (RuntimeException var10) {
			signlink.reporterror("382, " + 5 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + var10.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("XOHMKFIT.a(IIIBIILKBEXSZSN;)V")
	public void method561(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, Model arg6) {
		try {
			if (arg3 == 2) {
				boolean var25 = false;
			} else {
				this.field1550 = !this.field1550;
			}
			boolean var8 = true;
			int var9 = arg1;
			int var10 = arg1 + arg5;
			int var11 = arg0 - 1;
			int var12 = arg0 + arg4;
			for (int var13 = arg2; var13 <= arg2 + 1; var13++) {
				if (var13 != this.field1554) {
					for (int var14 = var9; var14 <= var10; var14++) {
						if (var14 >= 0 && var14 < this.field1555) {
							for (int var15 = var11; var15 <= var12; var15++) {
								if (var15 >= 0 && var15 < this.field1556 && (!var8 || var14 >= var10 || var15 >= var12 || var15 < arg0 && var14 != arg1)) {
									Square var16 = this.squares[var13][var14][var15];
									if (var16 != null) {
										int var17 = (this.field1557[var13][var14][var15] + this.field1557[var13][var14 + 1][var15] + this.field1557[var13][var14][var15 + 1] + this.field1557[var13][var14 + 1][var15 + 1]) / 4 - (this.field1557[arg2][arg1][arg0] + this.field1557[arg2][arg1 + 1][arg0] + this.field1557[arg2][arg1][arg0 + 1] + this.field1557[arg2][arg1 + 1][arg0 + 1]) / 4;
										Wall var18 = var16.wall;
										if (var18 != null && var18.field1161 != null && var18.field1161.pointNormal != null) {
											this.method562(arg6, (Model) var18.field1161, (var14 - arg1) * 128 + (1 - arg5) * 64, var17, (var15 - arg0) * 128 + (1 - arg4) * 64, var8);
										}
										if (var18 != null && var18.field1162 != null && var18.field1162.pointNormal != null) {
											this.method562(arg6, (Model) var18.field1162, (var14 - arg1) * 128 + (1 - arg5) * 64, var17, (var15 - arg0) * 128 + (1 - arg4) * 64, var8);
										}
										for (int var19 = 0; var19 < var16.field1259; var19++) {
											Sprite var20 = var16.sprites[var19];
											if (var20 != null && var20.model != null && var20.model.pointNormal != null) {
												int var21 = var20.field1306 + 1 - var20.field1305;
												int var22 = var20.field1308 + 1 - var20.field1307;
												this.method562(arg6, (Model) var20.model, (var20.field1305 - arg1) * 128 + (var21 - arg5) * 64, var17, (var20.field1307 - arg0) * 128 + (var22 - arg4) * 64, var8);
											}
										}
									}
								}
							}
						}
					}
					var9--;
					var8 = false;
				}
			}
		} catch (RuntimeException var24) {
			signlink.reporterror("7377, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + var24.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("XOHMKFIT.a(LKBEXSZSN;LKBEXSZSN;IIIZ)V")
	public void method562(Model arg0, Model arg1, int arg2, int arg3, int arg4, boolean arg5) {
		this.field1605++;
		int var7 = 0;
		int[] var8 = arg1.pointX;
		int var9 = arg1.numPoints;
		int var10 = arg1.field1022 >> 16;
		int var11 = arg1.field1022 << 16 >> 16;
		int var12 = arg1.field1023 >> 16;
		int var13 = arg1.field1023 << 16 >> 16;
		for (int var14 = 0; var14 < arg0.numPoints; var14++) {
			PointNormal var15 = arg0.pointNormal[var14];
			PointNormal var16 = arg0.sharedPointNormal[var14];
			if (var16.field1383 != 0) {
				int var17 = arg0.pointY[var14] - arg3;
				if (var17 <= arg1.maxY) {
					int var18 = arg0.pointX[var14] - arg2;
					if (var18 >= var10 && var18 <= var11) {
						int var19 = arg0.pointZ[var14] - arg4;
						if (var19 >= var13 && var19 <= var12) {
							for (int var20 = 0; var20 < var9; var20++) {
								PointNormal var21 = arg1.pointNormal[var20];
								PointNormal var22 = arg1.sharedPointNormal[var20];
								if (var18 == var8[var20] && var19 == arg1.pointZ[var20] && var17 == arg1.pointY[var20] && var22.field1383 != 0) {
									var15.field1380 += var22.field1380;
									var15.field1381 += var22.field1381;
									var15.field1382 += var22.field1382;
									var15.field1383 += var22.field1383;
									var21.field1380 += var16.field1380;
									var21.field1381 += var16.field1381;
									var21.field1382 += var16.field1382;
									var21.field1383 += var16.field1383;
									var7++;
									this.field1603[var14] = this.field1605;
									this.field1604[var20] = this.field1605;
								}
							}
						}
					}
				}
			}
		}
		if (var7 < 3 || !arg5) {
			return;
		}
		for (int var23 = 0; var23 < arg0.numFaces; var23++) {
			if (this.field1603[arg0.faceVertexA[var23]] == this.field1605 && this.field1603[arg0.faceVertexB[var23]] == this.field1605 && this.field1603[arg0.faceVertexC[var23]] == this.field1605) {
				arg0.faceRenderType[var23] = -1;
			}
		}
		for (int var24 = 0; var24 < arg1.numFaces; var24++) {
			if (this.field1604[arg1.faceVertexA[var24]] == this.field1605 && this.field1604[arg1.faceVertexB[var24]] == this.field1605 && this.field1604[arg1.faceVertexC[var24]] == this.field1605) {
				arg1.faceRenderType[var24] = -1;
			}
		}
	}

	@ObfuscatedName("XOHMKFIT.a([IIIIII)V")
	public void render2DGround(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
		Square var6 = this.squares[arg2][arg3][arg4];
		if (var6 == null) {
			return;
		}
		QuickGround var7 = var6.field1253;
		if (var7 != null) {
			int var8 = var7.field688;
			if (var8 != 0) {
				for (int var9 = 0; var9 < 4; var9++) {
					arg0[arg1] = var8;
					arg0[arg1 + 1] = var8;
					arg0[arg1 + 2] = var8;
					arg0[arg1 + 3] = var8;
					arg1 += 512;
				}
			}
			return;
		}
		Ground var10 = var6.field1254;
		if (var10 == null) {
			return;
		}
		int var11 = var10.field1457;
		int var12 = var10.field1458;
		int var13 = var10.field1459;
		int var14 = var10.field1460;
		int[] var15 = this.field1606[var11];
		int[] var16 = this.field1607[var12];
		int var17 = 0;
		if (var13 != 0) {
			for (int var18 = 0; var18 < 4; var18++) {
				arg0[arg1] = var15[var16[var17++]] == 0 ? var13 : var14;
				arg0[arg1 + 1] = var15[var16[var17++]] == 0 ? var13 : var14;
				arg0[arg1 + 2] = var15[var16[var17++]] == 0 ? var13 : var14;
				arg0[arg1 + 3] = var15[var16[var17++]] == 0 ? var13 : var14;
				arg1 += 512;
			}
			return;
		}
		for (int var19 = 0; var19 < 4; var19++) {
			if (var15[var16[var17++]] != 0) {
				arg0[arg1] = var14;
			}
			if (var15[var16[var17++]] != 0) {
				arg0[arg1 + 1] = var14;
			}
			if (var15[var16[var17++]] != 0) {
				arg0[arg1 + 2] = var14;
			}
			if (var15[var16[var17++]] != 0) {
				arg0[arg1 + 3] = var14;
			}
			arg1 += 512;
		}
	}

	@ObfuscatedName("XOHMKFIT.f(III)V")
	public void method566(int arg0, int arg1) {
		try {
			field1584 = true;
			field1585 = arg0;
			field1586 = arg1;
			field1587 = -1;
			field1588 = -1;
		} catch (RuntimeException var4) {
			signlink.reporterror("80887, " + arg0 + ", " + arg1 + ", " + 7 + ", " + var4.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("XOHMKFIT.a(IIIIIII)V")
	public void renderAll(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		try {
			if (arg1 < 0) {
				arg1 = 0;
			} else if (arg1 >= this.field1555 * 128) {
				arg1 = this.field1555 * 128 - 1;
			}
			if (arg2 < 0) {
				arg2 = 0;
			} else if (arg2 >= this.field1556 * 128) {
				arg2 = this.field1556 * 128 - 1;
			}
			field1565++;
			field1575 = Model.sinTable[arg4];
			field1576 = Model.cosTable[arg4];
			field1577 = Model.sinTable[arg5];
			field1578 = Model.cosTable[arg5];
			field1609 = field1608[(arg4 - 128) / 32][arg5 / 64];
			field1572 = arg1;
			field1573 = arg0;
			field1574 = arg2;
			field1570 = arg1 / 128;
			field1571 = arg2 / 128;
			field1564 = arg3;
			field1566 = field1570 - 25;
			if (field1566 < 0) {
				field1566 = 0;
			}
			field1568 = field1571 - 25;
			if (field1568 < 0) {
				field1568 = 0;
			}
			field1567 = field1570 + 25;
			if (field1567 > this.field1555) {
				field1567 = this.field1555;
			}
			field1569 = field1571 + 25;
			if (field1569 > this.field1556) {
				field1569 = this.field1556;
			}
			this.method573(427);
			field1563 = 0;
			for (int var7 = this.field1559; var7 < this.field1554; var7++) {
				Square[][] var8 = this.squares[var7];
				for (int var9 = field1566; var9 < field1567; var9++) {
					for (int var10 = field1568; var10 < field1569; var10++) {
						Square var11 = var8[var9][var10];
						if (var11 != null) {
							if (var11.field1263 <= arg3 && (field1609[var9 + 25 - field1570][var10 + 25 - field1571] || this.field1557[var7][var9][var10] - arg0 >= 2000)) {
								var11.field1264 = true;
								var11.field1265 = true;
								if (var11.field1259 > 0) {
									var11.field1266 = true;
								} else {
									var11.field1266 = false;
								}
								field1563++;
							} else {
								var11.field1264 = false;
								var11.field1265 = false;
								var11.field1267 = 0;
							}
						}
					}
				}
			}
			for (int var12 = this.field1559; var12 < this.field1554; var12++) {
				Square[][] var13 = this.squares[var12];
				for (int var14 = -25; var14 <= 0; var14++) {
					int var15 = field1570 + var14;
					int var16 = field1570 - var14;
					if (var15 >= field1566 || var16 < field1567) {
						for (int var17 = -25; var17 <= 0; var17++) {
							int var18 = field1571 + var17;
							int var19 = field1571 - var17;
							if (var15 >= field1566) {
								if (var18 >= field1568) {
									Square var20 = var13[var15][var18];
									if (var20 != null && var20.field1264) {
										this.method568(var20, true);
									}
								}
								if (var19 < field1569) {
									Square var21 = var13[var15][var19];
									if (var21 != null && var21.field1264) {
										this.method568(var21, true);
									}
								}
							}
							if (var16 < field1567) {
								if (var18 >= field1568) {
									Square var22 = var13[var16][var18];
									if (var22 != null && var22.field1264) {
										this.method568(var22, true);
									}
								}
								if (var19 < field1569) {
									Square var23 = var13[var16][var19];
									if (var23 != null && var23.field1264) {
										this.method568(var23, true);
									}
								}
							}
							if (field1563 == 0) {
								field1584 = false;
								return;
							}
						}
					}
				}
			}
			for (int var24 = this.field1559; var24 < this.field1554; var24++) {
				Square[][] var25 = this.squares[var24];
				for (int var26 = -25; var26 <= 0; var26++) {
					int var27 = field1570 + var26;
					int var28 = field1570 - var26;
					if (var27 >= field1566 || var28 < field1567) {
						for (int var29 = -25; var29 <= 0; var29++) {
							int var30 = field1571 + var29;
							int var31 = field1571 - var29;
							if (var27 >= field1566) {
								if (var30 >= field1568) {
									Square var32 = var25[var27][var30];
									if (var32 != null && var32.field1264) {
										this.method568(var32, false);
									}
								}
								if (var31 < field1569) {
									Square var33 = var25[var27][var31];
									if (var33 != null && var33.field1264) {
										this.method568(var33, false);
									}
								}
							}
							if (var28 < field1567) {
								if (var30 >= field1568) {
									Square var34 = var25[var28][var30];
									if (var34 != null && var34.field1264) {
										this.method568(var34, false);
									}
								}
								if (var31 < field1569) {
									Square var35 = var25[var28][var31];
									if (var35 != null && var35.field1264) {
										this.method568(var35, false);
									}
								}
							}
							if (field1563 == 0) {
								field1584 = false;
								return;
							}
						}
					}
				}
			}
			field1584 = false;
		} catch (RuntimeException var37) {
			signlink.reporterror("236, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 5696 + ", " + arg4 + ", " + arg5 + ", " + var37.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("XOHMKFIT.a(LQEIUYHTV;Z)V")
	public void method568(Square arg0, boolean arg1) {
		field1594.push(arg0);
		while (true) {
			Square var3;
			int var4;
			int var5;
			int var6;
			int var7;
			Square[][] var8;
			Square var70;
			do {
				Square var69;
				do {
					Square var68;
					do {
						Square var67;
						do {
							do {
								do {
									while (true) {
										while (true) {
											do {
												var3 = (Square) field1594.popFront();
												if (var3 == null) {
													return;
												}
											} while (!var3.field1265);
											var4 = var3.field1250;
											var5 = var3.field1251;
											var6 = var3.level;
											var7 = var3.originalLevel;
											var8 = this.squares[var6];
											if (!var3.field1264) {
												break;
											}
											if (arg1) {
												if (var6 > 0) {
													Square var9 = this.squares[var6 - 1][var4][var5];
													if (var9 != null && var9.field1265) {
														continue;
													}
												}
												if (var4 <= field1570 && var4 > field1566) {
													Square var10 = var8[var4 - 1][var5];
													if (var10 != null && var10.field1265 && (var10.field1264 || (var3.field1262 & 0x1) == 0)) {
														continue;
													}
												}
												if (var4 >= field1570 && var4 < field1567 - 1) {
													Square var11 = var8[var4 + 1][var5];
													if (var11 != null && var11.field1265 && (var11.field1264 || (var3.field1262 & 0x4) == 0)) {
														continue;
													}
												}
												if (var5 <= field1571 && var5 > field1568) {
													Square var12 = var8[var4][var5 - 1];
													if (var12 != null && var12.field1265 && (var12.field1264 || (var3.field1262 & 0x8) == 0)) {
														continue;
													}
												}
												if (var5 >= field1571 && var5 < field1569 - 1) {
													Square var13 = var8[var4][var5 + 1];
													if (var13 != null && var13.field1265 && (var13.field1264 || (var3.field1262 & 0x2) == 0)) {
														continue;
													}
												}
											} else {
												arg1 = true;
											}
											var3.field1264 = false;
											if (var3.field1271 != null) {
												Square var14 = var3.field1271;
												if (var14.field1253 == null) {
													if (var14.field1254 != null && !this.method574(0, var4, var5)) {
														this.method570(field1576, var5, var4, var14.field1254, field1578, field1575, field1577);
													}
												} else if (!this.method574(0, var4, var5)) {
													this.renderQuickGround(var14.field1253, 0, field1575, field1576, field1577, field1578, var4, var5);
												}
												Wall var15 = var14.wall;
												if (var15 != null) {
													var15.field1161.worldRender(0, field1575, field1576, field1577, field1578, var15.field1157 - field1572, var15.field1156 - field1573, var15.field1158 - field1574, var15.field1163);
												}
												for (int var16 = 0; var16 < var14.field1259; var16++) {
													Sprite var17 = var14.sprites[var16];
													if (var17 != null) {
														var17.model.worldRender(var17.field1304, field1575, field1576, field1577, field1578, var17.field1301 - field1572, var17.field1300 - field1573, var17.field1302 - field1574, var17.field1311);
													}
												}
											}
											boolean var18 = false;
											if (var3.field1253 == null) {
												if (var3.field1254 != null && !this.method574(var7, var4, var5)) {
													var18 = true;
													this.method570(field1576, var5, var4, var3.field1254, field1578, field1575, field1577);
												}
											} else if (!this.method574(var7, var4, var5)) {
												var18 = true;
												this.renderQuickGround(var3.field1253, var7, field1575, field1576, field1577, field1578, var4, var5);
											}
											int var19 = 0;
											int var20 = 0;
											Wall var21 = var3.wall;
											Decor var22 = var3.decor;
											if (var21 != null || var22 != null) {
												if (field1570 == var4) {
													var19++;
												} else if (field1570 < var4) {
													var19 += 2;
												}
												if (field1571 == var5) {
													var19 += 3;
												} else if (field1571 > var5) {
													var19 += 6;
												}
												var20 = field1595[var19];
												var3.field1270 = field1597[var19];
											}
											if (var21 != null) {
												if ((var21.field1159 & field1596[var19]) == 0) {
													var3.field1267 = 0;
												} else if (var21.field1159 == 16) {
													var3.field1267 = 3;
													var3.field1268 = field1598[var19];
													var3.field1269 = 3 - var3.field1268;
												} else if (var21.field1159 == 32) {
													var3.field1267 = 6;
													var3.field1268 = field1599[var19];
													var3.field1269 = 6 - var3.field1268;
												} else if (var21.field1159 == 64) {
													var3.field1267 = 12;
													var3.field1268 = field1600[var19];
													var3.field1269 = 12 - var3.field1268;
												} else {
													var3.field1267 = 9;
													var3.field1268 = field1601[var19];
													var3.field1269 = 9 - var3.field1268;
												}
												if ((var21.field1159 & var20) != 0 && !this.method575(var7, var4, var5, var21.field1159)) {
													var21.field1161.worldRender(0, field1575, field1576, field1577, field1578, var21.field1157 - field1572, var21.field1156 - field1573, var21.field1158 - field1574, var21.field1163);
												}
												if ((var21.field1160 & var20) != 0 && !this.method575(var7, var4, var5, var21.field1160)) {
													var21.field1162.worldRender(0, field1575, field1576, field1577, field1578, var21.field1157 - field1572, var21.field1156 - field1573, var21.field1158 - field1574, var21.field1163);
												}
											}
											if (var22 != null && !this.method576(var7, var4, var5, var22.model.minY)) {
												if ((var22.field1109 & var20) != 0) {
													var22.model.worldRender(var22.field1110, field1575, field1576, field1577, field1578, var22.field1107 - field1572, var22.field1106 - field1573, var22.field1108 - field1574, var22.field1112);
												} else if ((var22.field1109 & 0x300) != 0) {
													int var23 = var22.field1107 - field1572;
													int var24 = var22.field1106 - field1573;
													int var25 = var22.field1108 - field1574;
													int var26 = var22.field1110;
													int var27;
													if (var26 == 1 || var26 == 2) {
														var27 = -var23;
													} else {
														var27 = var23;
													}
													int var28;
													if (var26 == 2 || var26 == 3) {
														var28 = -var25;
													} else {
														var28 = var25;
													}
													if ((var22.field1109 & 0x100) != 0 && var28 < var27) {
														int var29 = var23 + field1580[var26];
														int var30 = var25 + field1581[var26];
														var22.model.worldRender(var26 * 512 + 256, field1575, field1576, field1577, field1578, var29, var24, var30, var22.field1112);
													}
													if ((var22.field1109 & 0x200) != 0 && var28 > var27) {
														int var31 = var23 + field1582[var26];
														int var32 = var25 + field1583[var26];
														var22.model.worldRender(var26 * 512 + 1280 & 0x7FF, field1575, field1576, field1577, field1578, var31, var24, var32, var22.field1112);
													}
												}
											}
											if (var18) {
												GroundDecor var33 = var3.groundDecor;
												if (var33 != null) {
													var33.model.worldRender(0, field1575, field1576, field1577, field1578, var33.field979 - field1572, var33.field978 - field1573, var33.field980 - field1574, var33.field982);
												}
												GroundObject var34 = var3.field1258;
												if (var34 != null && var34.field1208 == 0) {
													if (var34.field1205 != null) {
														var34.field1205.worldRender(0, field1575, field1576, field1577, field1578, var34.field1202 - field1572, var34.field1201 - field1573, var34.field1203 - field1574, var34.field1207);
													}
													if (var34.field1206 != null) {
														var34.field1206.worldRender(0, field1575, field1576, field1577, field1578, var34.field1202 - field1572, var34.field1201 - field1573, var34.field1203 - field1574, var34.field1207);
													}
													if (var34.field1204 != null) {
														var34.field1204.worldRender(0, field1575, field1576, field1577, field1578, var34.field1202 - field1572, var34.field1201 - field1573, var34.field1203 - field1574, var34.field1207);
													}
												}
											}
											int var35 = var3.field1262;
											if (var35 != 0) {
												if (var4 < field1570 && (var35 & 0x4) != 0) {
													Square var36 = var8[var4 + 1][var5];
													if (var36 != null && var36.field1265) {
														field1594.push(var36);
													}
												}
												if (var5 < field1571 && (var35 & 0x2) != 0) {
													Square var37 = var8[var4][var5 + 1];
													if (var37 != null && var37.field1265) {
														field1594.push(var37);
													}
												}
												if (var4 > field1570 && (var35 & 0x1) != 0) {
													Square var38 = var8[var4 - 1][var5];
													if (var38 != null && var38.field1265) {
														field1594.push(var38);
													}
												}
												if (var5 > field1571 && (var35 & 0x8) != 0) {
													Square var39 = var8[var4][var5 - 1];
													if (var39 != null && var39.field1265) {
														field1594.push(var39);
													}
												}
											}
											break;
										}
										if (var3.field1267 != 0) {
											boolean var40 = true;
											for (int var41 = 0; var41 < var3.field1259; var41++) {
												if (var3.sprites[var41].field1310 != field1565 && (var3.spriteSpan[var41] & var3.field1267) == var3.field1268) {
													var40 = false;
													break;
												}
											}
											if (var40) {
												Wall var42 = var3.wall;
												if (!this.method575(var7, var4, var5, var42.field1159)) {
													var42.field1161.worldRender(0, field1575, field1576, field1577, field1578, var42.field1157 - field1572, var42.field1156 - field1573, var42.field1158 - field1574, var42.field1163);
												}
												var3.field1267 = 0;
											}
										}
										if (!var3.field1266) {
											break;
										}
										try {
											int var43 = var3.field1259;
											var3.field1266 = false;
											int var44 = 0;
											label559: for (int var45 = 0; var45 < var43; var45++) {
												Sprite var46 = var3.sprites[var45];
												if (var46.field1310 != field1565) {
													for (int var47 = var46.field1305; var47 <= var46.field1306; var47++) {
														for (int var48 = var46.field1307; var48 <= var46.field1308; var48++) {
															Square var49 = var8[var47][var48];
															if (var49.field1264) {
																var3.field1266 = true;
																continue label559;
															}
															if (var49.field1267 != 0) {
																int var50 = 0;
																if (var47 > var46.field1305) {
																	var50++;
																}
																if (var47 < var46.field1306) {
																	var50 += 4;
																}
																if (var48 > var46.field1307) {
																	var50 += 8;
																}
																if (var48 < var46.field1308) {
																	var50 += 2;
																}
																if ((var50 & var49.field1267) == var3.field1269) {
																	var3.field1266 = true;
																	continue label559;
																}
															}
														}
													}
													field1579[var44++] = var46;
													int var51 = field1570 - var46.field1305;
													int var52 = var46.field1306 - field1570;
													if (var52 > var51) {
														var51 = var52;
													}
													int var53 = field1571 - var46.field1307;
													int var54 = var46.field1308 - field1571;
													if (var54 > var53) {
														var46.field1309 = var51 + var54;
													} else {
														var46.field1309 = var51 + var53;
													}
												}
											}
											while (var44 > 0) {
												int var55 = -50;
												int var56 = -1;
												for (int var57 = 0; var57 < var44; var57++) {
													Sprite var58 = field1579[var57];
													if (var58.field1310 != field1565) {
														if (var58.field1309 > var55) {
															var55 = var58.field1309;
															var56 = var57;
														} else if (var58.field1309 == var55) {
															int var59 = var58.field1301 - field1572;
															int var60 = var58.field1302 - field1574;
															int var61 = field1579[var56].field1301 - field1572;
															int var62 = field1579[var56].field1302 - field1574;
															if (var59 * var59 + var60 * var60 > var61 * var61 + var62 * var62) {
																var56 = var57;
															}
														}
													}
												}
												if (var56 == -1) {
													break;
												}
												Sprite var63 = field1579[var56];
												var63.field1310 = field1565;
												if (!this.method577(var7, var63.field1305, var63.field1306, var63.field1307, var63.field1308, var63.model.minY)) {
													var63.model.worldRender(var63.field1304, field1575, field1576, field1577, field1578, var63.field1301 - field1572, var63.field1300 - field1573, var63.field1302 - field1574, var63.field1311);
												}
												for (int var64 = var63.field1305; var64 <= var63.field1306; var64++) {
													for (int var65 = var63.field1307; var65 <= var63.field1308; var65++) {
														Square var66 = var8[var64][var65];
														if (var66.field1267 != 0) {
															field1594.push(var66);
														} else if ((var64 != var4 || var65 != var5) && var66.field1265) {
															field1594.push(var66);
														}
													}
												}
											}
											if (!var3.field1266) {
												break;
											}
										} catch (Exception var89) {
											var3.field1266 = false;
											break;
										}
									}
								} while (!var3.field1265);
							} while (var3.field1267 != 0);
							if (var4 > field1570 || var4 <= field1566) {
								break;
							}
							var67 = var8[var4 - 1][var5];
						} while (var67 != null && var67.field1265);
						if (var4 < field1570 || var4 >= field1567 - 1) {
							break;
						}
						var68 = var8[var4 + 1][var5];
					} while (var68 != null && var68.field1265);
					if (var5 > field1571 || var5 <= field1568) {
						break;
					}
					var69 = var8[var4][var5 - 1];
				} while (var69 != null && var69.field1265);
				if (var5 < field1571 || var5 >= field1569 - 1) {
					break;
				}
				var70 = var8[var4][var5 + 1];
			} while (var70 != null && var70.field1265);
			var3.field1265 = false;
			field1563--;
			GroundObject var71 = var3.field1258;
			if (var71 != null && var71.field1208 != 0) {
				if (var71.field1205 != null) {
					var71.field1205.worldRender(0, field1575, field1576, field1577, field1578, var71.field1202 - field1572, var71.field1201 - field1573 - var71.field1208, var71.field1203 - field1574, var71.field1207);
				}
				if (var71.field1206 != null) {
					var71.field1206.worldRender(0, field1575, field1576, field1577, field1578, var71.field1202 - field1572, var71.field1201 - field1573 - var71.field1208, var71.field1203 - field1574, var71.field1207);
				}
				if (var71.field1204 != null) {
					var71.field1204.worldRender(0, field1575, field1576, field1577, field1578, var71.field1202 - field1572, var71.field1201 - field1573 - var71.field1208, var71.field1203 - field1574, var71.field1207);
				}
			}
			if (var3.field1270 != 0) {
				Decor var72 = var3.decor;
				if (var72 != null && !this.method576(var7, var4, var5, var72.model.minY)) {
					if ((var72.field1109 & var3.field1270) != 0) {
						var72.model.worldRender(var72.field1110, field1575, field1576, field1577, field1578, var72.field1107 - field1572, var72.field1106 - field1573, var72.field1108 - field1574, var72.field1112);
					} else if ((var72.field1109 & 0x300) != 0) {
						int var73 = var72.field1107 - field1572;
						int var74 = var72.field1106 - field1573;
						int var75 = var72.field1108 - field1574;
						int var76 = var72.field1110;
						int var77;
						if (var76 == 1 || var76 == 2) {
							var77 = -var73;
						} else {
							var77 = var73;
						}
						int var78;
						if (var76 == 2 || var76 == 3) {
							var78 = -var75;
						} else {
							var78 = var75;
						}
						if ((var72.field1109 & 0x100) != 0 && var78 >= var77) {
							int var79 = var73 + field1580[var76];
							int var80 = var75 + field1581[var76];
							var72.model.worldRender(var76 * 512 + 256, field1575, field1576, field1577, field1578, var79, var74, var80, var72.field1112);
						}
						if ((var72.field1109 & 0x200) != 0 && var78 <= var77) {
							int var81 = var73 + field1582[var76];
							int var82 = var75 + field1583[var76];
							var72.model.worldRender(var76 * 512 + 1280 & 0x7FF, field1575, field1576, field1577, field1578, var81, var74, var82, var72.field1112);
						}
					}
				}
				Wall var83 = var3.wall;
				if (var83 != null) {
					if ((var83.field1160 & var3.field1270) != 0 && !this.method575(var7, var4, var5, var83.field1160)) {
						var83.field1162.worldRender(0, field1575, field1576, field1577, field1578, var83.field1157 - field1572, var83.field1156 - field1573, var83.field1158 - field1574, var83.field1163);
					}
					if ((var83.field1159 & var3.field1270) != 0 && !this.method575(var7, var4, var5, var83.field1159)) {
						var83.field1161.worldRender(0, field1575, field1576, field1577, field1578, var83.field1157 - field1572, var83.field1156 - field1573, var83.field1158 - field1574, var83.field1163);
					}
				}
			}
			if (var6 < this.field1554 - 1) {
				Square var84 = this.squares[var6 + 1][var4][var5];
				if (var84 != null && var84.field1265) {
					field1594.push(var84);
				}
			}
			if (var4 < field1570) {
				Square var85 = var8[var4 + 1][var5];
				if (var85 != null && var85.field1265) {
					field1594.push(var85);
				}
			}
			if (var5 < field1571) {
				Square var86 = var8[var4][var5 + 1];
				if (var86 != null && var86.field1265) {
					field1594.push(var86);
				}
			}
			if (var4 > field1570) {
				Square var87 = var8[var4 - 1][var5];
				if (var87 != null && var87.field1265) {
					field1594.push(var87);
				}
			}
			if (var5 > field1571) {
				Square var88 = var8[var4][var5 - 1];
				if (var88 != null && var88.field1265) {
					field1594.push(var88);
				}
			}
		}
	}

	@ObfuscatedName("XOHMKFIT.a(LDAKAERDX;IIIIIII)V")
	public void renderQuickGround(QuickGround arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		int var9;
		int var10 = var9 = (arg6 << 7) - field1572;
		int var11;
		int var12 = var11 = (arg7 << 7) - field1574;
		int var13;
		int var14 = var13 = var10 + 128;
		int var15;
		int var16 = var15 = var12 + 128;
		int var17 = this.field1557[arg1][arg6][arg7] - field1573;
		int var18 = this.field1557[arg1][arg6 + 1][arg7] - field1573;
		int var19 = this.field1557[arg1][arg6 + 1][arg7 + 1] - field1573;
		int var20 = this.field1557[arg1][arg6][arg7 + 1] - field1573;
		int var21 = var12 * arg4 + var10 * arg5 >> 16;
		int var22 = var12 * arg5 - var10 * arg4 >> 16;
		int var24 = var17 * arg3 - var22 * arg2 >> 16;
		int var25 = var17 * arg2 + var22 * arg3 >> 16;
		if (var25 < 50) {
			return;
		}
		int var27 = var11 * arg4 + var14 * arg5 >> 16;
		int var28 = var11 * arg5 - var14 * arg4 >> 16;
		int var30 = var18 * arg3 - var28 * arg2 >> 16;
		int var31 = var18 * arg2 + var28 * arg3 >> 16;
		if (var31 < 50) {
			return;
		}
		int var33 = var16 * arg4 + var13 * arg5 >> 16;
		int var34 = var16 * arg5 - var13 * arg4 >> 16;
		int var36 = var19 * arg3 - var34 * arg2 >> 16;
		int var37 = var19 * arg2 + var34 * arg3 >> 16;
		if (var37 < 50) {
			return;
		}
		int var39 = var15 * arg4 + var9 * arg5 >> 16;
		int var40 = var15 * arg5 - var9 * arg4 >> 16;
		int var42 = var20 * arg3 - var40 * arg2 >> 16;
		int var43 = var20 * arg2 + var40 * arg3 >> 16;
		if (var43 < 50) {
			return;
		}
		int var44 = Pix3D.originX + (var21 << 9) / var25;
		int var45 = Pix3D.originY + (var24 << 9) / var25;
		int var46 = Pix3D.originX + (var27 << 9) / var31;
		int var47 = Pix3D.originY + (var30 << 9) / var31;
		int var48 = Pix3D.originX + (var33 << 9) / var37;
		int var49 = Pix3D.originY + (var36 << 9) / var37;
		int var50 = Pix3D.originX + (var39 << 9) / var43;
		int var51 = Pix3D.originY + (var42 << 9) / var43;
		Pix3D.trans = 0;
		if ((var48 - var50) * (var47 - var51) - (var49 - var51) * (var46 - var50) > 0) {
			Pix3D.hclip = false;
			if (var48 < 0 || var50 < 0 || var46 < 0 || var48 > Pix2D.sizeX || var50 > Pix2D.sizeX || var46 > Pix2D.sizeX) {
				Pix3D.hclip = true;
			}
			if (field1584 && this.method572(field1585, field1586, var49, var51, var47, var48, var50, var46)) {
				field1587 = arg6;
				field1588 = arg7;
			}
			if (arg0.field686 == -1) {
				if (arg0.field684 != 12345678) {
					Pix3D.gouraudTriangle(var49, var51, var47, var48, var50, var46, arg0.field684, arg0.field685, arg0.field683);
				}
			} else if (field1553) {
				int var52 = field1602[arg0.field686];
				Pix3D.gouraudTriangle(var49, var51, var47, var48, var50, var46, this.method571(var52, arg0.field684), this.method571(var52, arg0.field685), this.method571(var52, arg0.field683));
			} else if (arg0.field687) {
				Pix3D.textureTriangle(var49, var51, var47, var48, var50, var46, arg0.field684, arg0.field685, arg0.field683, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field686);
			} else {
				Pix3D.textureTriangle(var49, var51, var47, var48, var50, var46, arg0.field684, arg0.field685, arg0.field683, var33, var39, var27, var36, var42, var30, var37, var43, var31, arg0.field686);
			}
		}
		if ((var44 - var46) * (var51 - var47) - (var45 - var47) * (var50 - var46) <= 0) {
			return;
		}
		Pix3D.hclip = false;
		if (var44 < 0 || var46 < 0 || var50 < 0 || var44 > Pix2D.sizeX || var46 > Pix2D.sizeX || var50 > Pix2D.sizeX) {
			Pix3D.hclip = true;
		}
		if (field1584 && this.method572(field1585, field1586, var45, var47, var51, var44, var46, var50)) {
			field1587 = arg6;
			field1588 = arg7;
		}
		if (arg0.field686 != -1) {
			if (!field1553) {
				Pix3D.textureTriangle(var45, var47, var51, var44, var46, var50, arg0.field682, arg0.field683, arg0.field685, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field686);
				return;
			}
			int var53 = field1602[arg0.field686];
			Pix3D.gouraudTriangle(var45, var47, var51, var44, var46, var50, this.method571(var53, arg0.field682), this.method571(var53, arg0.field683), this.method571(var53, arg0.field685));
		} else if (arg0.field682 != 12345678) {
			Pix3D.gouraudTriangle(var45, var47, var51, var44, var46, var50, arg0.field682, arg0.field683, arg0.field685);
			return;
		}
	}

	@ObfuscatedName("XOHMKFIT.a(IIILVWODEXFW;IIII)V")
	public void method570(int arg0, int arg1, int arg2, Ground arg3, int arg4, int arg5, int arg6) {
		try {
			int var8 = arg3.field1446.length;
			for (int var9 = 0; var9 < var8; var9++) {
				int var10 = arg3.field1446[var9] - field1572;
				int var11 = arg3.field1447[var9] - field1573;
				int var12 = arg3.field1448[var9] - field1574;
				int var13 = var12 * arg6 + var10 * arg4 >> 16;
				int var14 = var12 * arg4 - var10 * arg6 >> 16;
				int var16 = var11 * arg0 - var14 * arg5 >> 16;
				int var17 = var11 * arg5 + var14 * arg0 >> 16;
				if (var17 < 50) {
					return;
				}
				if (arg3.faceTexture != null) {
					Ground.field1463[var9] = var13;
					Ground.field1464[var9] = var16;
					Ground.field1465[var9] = var17;
				}
				Ground.field1461[var9] = Pix3D.originX + (var13 << 9) / var17;
				Ground.field1462[var9] = Pix3D.originY + (var16 << 9) / var17;
			}
			Pix3D.trans = 0;
			int var18 = arg3.faceVertexA.length;
			for (int var19 = 0; var19 < var18; var19++) {
				int var20 = arg3.faceVertexA[var19];
				int var21 = arg3.faceVertexB[var19];
				int var22 = arg3.faceVertexC[var19];
				int var23 = Ground.field1461[var20];
				int var24 = Ground.field1461[var21];
				int var25 = Ground.field1461[var22];
				int var26 = Ground.field1462[var20];
				int var27 = Ground.field1462[var21];
				int var28 = Ground.field1462[var22];
				if ((var23 - var24) * (var28 - var27) - (var26 - var27) * (var25 - var24) > 0) {
					Pix3D.hclip = false;
					if (var23 < 0 || var24 < 0 || var25 < 0 || var23 > Pix2D.sizeX || var24 > Pix2D.sizeX || var25 > Pix2D.sizeX) {
						Pix3D.hclip = true;
					}
					if (field1584 && this.method572(field1585, field1586, var26, var27, var28, var23, var24, var25)) {
						field1587 = arg2;
						field1588 = arg1;
					}
					if (arg3.faceTexture == null || arg3.faceTexture[var19] == -1) {
						if (arg3.faceColourA[var19] != 12345678) {
							Pix3D.gouraudTriangle(var26, var27, var28, var23, var24, var25, arg3.faceColourA[var19], arg3.faceColourB[var19], arg3.faceColourC[var19]);
						}
					} else if (field1553) {
						int var29 = field1602[arg3.faceTexture[var19]];
						Pix3D.gouraudTriangle(var26, var27, var28, var23, var24, var25, this.method571(var29, arg3.faceColourA[var19]), this.method571(var29, arg3.faceColourB[var19]), this.method571(var29, arg3.faceColourC[var19]));
					} else if (arg3.field1456) {
						Pix3D.textureTriangle(var26, var27, var28, var23, var24, var25, arg3.faceColourA[var19], arg3.faceColourB[var19], arg3.faceColourC[var19], Ground.field1463[0], Ground.field1463[1], Ground.field1463[3], Ground.field1464[0], Ground.field1464[1], Ground.field1464[3], Ground.field1465[0], Ground.field1465[1], Ground.field1465[3], arg3.faceTexture[var19]);
					} else {
						Pix3D.textureTriangle(var26, var27, var28, var23, var24, var25, arg3.faceColourA[var19], arg3.faceColourB[var19], arg3.faceColourC[var19], Ground.field1463[var20], Ground.field1463[var21], Ground.field1463[var22], Ground.field1464[var20], Ground.field1464[var21], Ground.field1464[var22], Ground.field1465[var20], Ground.field1465[var21], Ground.field1465[var22], arg3.faceTexture[var19]);
					}
				}
			}
		} catch (RuntimeException var31) {
			signlink.reporterror("64681, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + -14 + ", " + arg6 + ", " + var31.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("XOHMKFIT.g(III)I")
	public int method571(int arg0, int arg1) {
		try {
			int var5 = 127 - arg1;
			arg1 = var5 * (arg0 & 0x7F) / 160;
			if (arg1 < 2) {
				arg1 = 2;
			} else if (arg1 > 126) {
				arg1 = 126;
			}
			return (arg0 & 0xFF80) + arg1;
		} catch (RuntimeException var4) {
			signlink.reporterror("95020, " + arg0 + ", " + 983 + ", " + arg1 + ", " + var4.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("XOHMKFIT.a(IIIIIIII)Z")
	public boolean method572(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
			return false;
		} else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
			return false;
		} else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
			return false;
		} else if (arg0 > arg5 && arg0 > arg6 && arg0 > arg7) {
			return false;
		} else {
			int var9 = (arg1 - arg2) * (arg6 - arg5) - (arg0 - arg5) * (arg3 - arg2);
			int var10 = (arg1 - arg4) * (arg5 - arg7) - (arg0 - arg7) * (arg2 - arg4);
			int var11 = (arg1 - arg3) * (arg7 - arg6) - (arg0 - arg6) * (arg4 - arg3);
			return var9 * var11 > 0 && var11 * var10 > 0;
		}
	}

	@ObfuscatedName("XOHMKFIT.b(I)V")
	public void method573(int arg0) {
		try {
			int var2 = field1590[field1564];
			Occlude[] var3 = field1591[field1564];
			boolean var26 = false;
			field1592 = 0;
			for (int var4 = 0; var4 < var2; var4++) {
				Occlude var5 = var3[var4];
				if (var5.field1071 == 1) {
					int var6 = var5.field1067 + 25 - field1570;
					if (var6 >= 0 && var6 <= 50) {
						int var7 = var5.field1069 + 25 - field1571;
						if (var7 < 0) {
							var7 = 0;
						}
						int var8 = var5.field1070 + 25 - field1571;
						if (var8 > 50) {
							var8 = 50;
						}
						boolean var9 = false;
						while (var7 <= var8) {
							if (field1609[var6][var7++]) {
								var9 = true;
								break;
							}
						}
						if (var9) {
							int var10 = field1572 - var5.field1072;
							if (var10 > 32) {
								var5.field1078 = 1;
							} else {
								if (var10 >= -32) {
									continue;
								}
								var5.field1078 = 2;
								var10 = -var10;
							}
							var5.field1081 = (var5.field1074 - field1574 << 8) / var10;
							var5.field1082 = (var5.field1075 - field1574 << 8) / var10;
							var5.field1083 = (var5.field1076 - field1573 << 8) / var10;
							var5.field1084 = (var5.field1077 - field1573 << 8) / var10;
							field1593[field1592++] = var5;
						}
					}
				} else if (var5.field1071 == 2) {
					int var11 = var5.field1069 + 25 - field1571;
					if (var11 >= 0 && var11 <= 50) {
						int var12 = var5.field1067 + 25 - field1570;
						if (var12 < 0) {
							var12 = 0;
						}
						int var13 = var5.field1068 + 25 - field1570;
						if (var13 > 50) {
							var13 = 50;
						}
						boolean var14 = false;
						while (var12 <= var13) {
							if (field1609[var12++][var11]) {
								var14 = true;
								break;
							}
						}
						if (var14) {
							int var15 = field1574 - var5.field1074;
							if (var15 > 32) {
								var5.field1078 = 3;
							} else {
								if (var15 >= -32) {
									continue;
								}
								var5.field1078 = 4;
								var15 = -var15;
							}
							var5.field1079 = (var5.field1072 - field1572 << 8) / var15;
							var5.field1080 = (var5.field1073 - field1572 << 8) / var15;
							var5.field1083 = (var5.field1076 - field1573 << 8) / var15;
							var5.field1084 = (var5.field1077 - field1573 << 8) / var15;
							field1593[field1592++] = var5;
						}
					}
				} else if (var5.field1071 == 4) {
					int var16 = var5.field1076 - field1573;
					if (var16 > 128) {
						int var17 = var5.field1069 + 25 - field1571;
						if (var17 < 0) {
							var17 = 0;
						}
						int var18 = var5.field1070 + 25 - field1571;
						if (var18 > 50) {
							var18 = 50;
						}
						if (var17 <= var18) {
							int var19 = var5.field1067 + 25 - field1570;
							if (var19 < 0) {
								var19 = 0;
							}
							int var20 = var5.field1068 + 25 - field1570;
							if (var20 > 50) {
								var20 = 50;
							}
							boolean var21 = false;
							label145: for (int var22 = var19; var22 <= var20; var22++) {
								for (int var23 = var17; var23 <= var18; var23++) {
									if (field1609[var22][var23]) {
										var21 = true;
										break label145;
									}
								}
							}
							if (var21) {
								var5.field1078 = 5;
								var5.field1079 = (var5.field1072 - field1572 << 8) / var16;
								var5.field1080 = (var5.field1073 - field1572 << 8) / var16;
								var5.field1081 = (var5.field1074 - field1574 << 8) / var16;
								var5.field1082 = (var5.field1075 - field1574 << 8) / var16;
								field1593[field1592++] = var5;
							}
						}
					}
				}
			}
		} catch (RuntimeException var25) {
			signlink.reporterror("37570, " + arg0 + ", " + var25.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("XOHMKFIT.h(III)Z")
	public boolean method574(int arg0, int arg1, int arg2) {
		int var4 = this.field1562[arg0][arg1][arg2];
		if (var4 == -field1565) {
			return false;
		} else if (var4 == field1565) {
			return true;
		} else {
			int var5 = arg1 << 7;
			int var6 = arg2 << 7;
			if (this.method578(var5 + 1, this.field1557[arg0][arg1][arg2], var6 + 1) && this.method578(var5 + 128 - 1, this.field1557[arg0][arg1 + 1][arg2], var6 + 1) && this.method578(var5 + 128 - 1, this.field1557[arg0][arg1 + 1][arg2 + 1], var6 + 128 - 1) && this.method578(var5 + 1, this.field1557[arg0][arg1][arg2 + 1], var6 + 128 - 1)) {
				this.field1562[arg0][arg1][arg2] = field1565;
				return true;
			} else {
				this.field1562[arg0][arg1][arg2] = -field1565;
				return false;
			}
		}
	}

	@ObfuscatedName("XOHMKFIT.m(IIII)Z")
	public boolean method575(int arg0, int arg1, int arg2, int arg3) {
		if (!this.method574(arg0, arg1, arg2)) {
			return false;
		}
		int var5 = arg1 << 7;
		int var6 = arg2 << 7;
		int var7 = this.field1557[arg0][arg1][arg2] - 1;
		int var8 = var7 - 120;
		int var9 = var7 - 230;
		int var10 = var7 - 238;
		if (arg3 < 16) {
			if (arg3 == 1) {
				if (var5 > field1572) {
					if (!this.method578(var5, var7, var6)) {
						return false;
					}
					if (!this.method578(var5, var7, var6 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!this.method578(var5, var8, var6)) {
						return false;
					}
					if (!this.method578(var5, var8, var6 + 128)) {
						return false;
					}
				}
				if (!this.method578(var5, var9, var6)) {
					return false;
				}
				if (!this.method578(var5, var9, var6 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 2) {
				if (var6 < field1574) {
					if (!this.method578(var5, var7, var6 + 128)) {
						return false;
					}
					if (!this.method578(var5 + 128, var7, var6 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!this.method578(var5, var8, var6 + 128)) {
						return false;
					}
					if (!this.method578(var5 + 128, var8, var6 + 128)) {
						return false;
					}
				}
				if (!this.method578(var5, var9, var6 + 128)) {
					return false;
				}
				if (!this.method578(var5 + 128, var9, var6 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 4) {
				if (var5 < field1572) {
					if (!this.method578(var5 + 128, var7, var6)) {
						return false;
					}
					if (!this.method578(var5 + 128, var7, var6 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!this.method578(var5 + 128, var8, var6)) {
						return false;
					}
					if (!this.method578(var5 + 128, var8, var6 + 128)) {
						return false;
					}
				}
				if (!this.method578(var5 + 128, var9, var6)) {
					return false;
				}
				if (!this.method578(var5 + 128, var9, var6 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 8) {
				if (var6 > field1574) {
					if (!this.method578(var5, var7, var6)) {
						return false;
					}
					if (!this.method578(var5 + 128, var7, var6)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!this.method578(var5, var8, var6)) {
						return false;
					}
					if (!this.method578(var5 + 128, var8, var6)) {
						return false;
					}
				}
				if (!this.method578(var5, var9, var6)) {
					return false;
				}
				if (!this.method578(var5 + 128, var9, var6)) {
					return false;
				}
				return true;
			}
		}
		if (!this.method578(var5 + 64, var10, var6 + 64)) {
			return false;
		} else if (arg3 == 16) {
			return this.method578(var5, var9, var6 + 128);
		} else if (arg3 == 32) {
			return this.method578(var5 + 128, var9, var6 + 128);
		} else if (arg3 == 64) {
			return this.method578(var5 + 128, var9, var6);
		} else if (arg3 == 128) {
			return this.method578(var5, var9, var6);
		} else {
			System.out.println("Warning unsupported wall type");
			return true;
		}
	}

	@ObfuscatedName("XOHMKFIT.n(IIII)Z")
	public boolean method576(int arg0, int arg1, int arg2, int arg3) {
		if (this.method574(arg0, arg1, arg2)) {
			int var5 = arg1 << 7;
			int var6 = arg2 << 7;
			return this.method578(var5 + 1, this.field1557[arg0][arg1][arg2] - arg3, var6 + 1) && this.method578(var5 + 128 - 1, this.field1557[arg0][arg1 + 1][arg2] - arg3, var6 + 1) && this.method578(var5 + 128 - 1, this.field1557[arg0][arg1 + 1][arg2 + 1] - arg3, var6 + 128 - 1) && this.method578(var5 + 1, this.field1557[arg0][arg1][arg2 + 1] - arg3, var6 + 128 - 1);
		} else {
			return false;
		}
	}

	@ObfuscatedName("XOHMKFIT.a(IIIIII)Z")
	public boolean method577(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg1 != arg2 || arg3 != arg4) {
			for (int var9 = arg1; var9 <= arg2; var9++) {
				for (int var10 = arg3; var10 <= arg4; var10++) {
					if (this.field1562[arg0][var9][var10] == -field1565) {
						return false;
					}
				}
			}
			int var11 = (arg1 << 7) + 1;
			int var12 = (arg3 << 7) + 2;
			int var13 = this.field1557[arg0][arg1][arg3] - arg5;
			if (!this.method578(var11, var13, var12)) {
				return false;
			}
			int var14 = (arg2 << 7) - 1;
			if (!this.method578(var14, var13, var12)) {
				return false;
			}
			int var15 = (arg4 << 7) - 1;
			if (!this.method578(var11, var13, var15)) {
				return false;
			} else if (this.method578(var14, var13, var15)) {
				return true;
			} else {
				return false;
			}
		} else if (this.method574(arg0, arg1, arg3)) {
			int var7 = arg1 << 7;
			int var8 = arg3 << 7;
			return this.method578(var7 + 1, this.field1557[arg0][arg1][arg3] - arg5, var8 + 1) && this.method578(var7 + 128 - 1, this.field1557[arg0][arg1 + 1][arg3] - arg5, var8 + 1) && this.method578(var7 + 128 - 1, this.field1557[arg0][arg1 + 1][arg3 + 1] - arg5, var8 + 128 - 1) && this.method578(var7 + 1, this.field1557[arg0][arg1][arg3 + 1] - arg5, var8 + 128 - 1);
		} else {
			return false;
		}
	}

	@ObfuscatedName("XOHMKFIT.i(III)Z")
	public boolean method578(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < field1592; var4++) {
			Occlude var5 = field1593[var4];
			if (var5.field1078 == 1) {
				int var6 = var5.field1072 - arg0;
				if (var6 > 0) {
					int var7 = var5.field1074 + (var5.field1081 * var6 >> 8);
					int var8 = var5.field1075 + (var5.field1082 * var6 >> 8);
					int var9 = var5.field1076 + (var5.field1083 * var6 >> 8);
					int var10 = var5.field1077 + (var5.field1084 * var6 >> 8);
					if (arg2 >= var7 && arg2 <= var8 && arg1 >= var9 && arg1 <= var10) {
						return true;
					}
				}
			} else if (var5.field1078 == 2) {
				int var11 = arg0 - var5.field1072;
				if (var11 > 0) {
					int var12 = var5.field1074 + (var5.field1081 * var11 >> 8);
					int var13 = var5.field1075 + (var5.field1082 * var11 >> 8);
					int var14 = var5.field1076 + (var5.field1083 * var11 >> 8);
					int var15 = var5.field1077 + (var5.field1084 * var11 >> 8);
					if (arg2 >= var12 && arg2 <= var13 && arg1 >= var14 && arg1 <= var15) {
						return true;
					}
				}
			} else if (var5.field1078 == 3) {
				int var16 = var5.field1074 - arg2;
				if (var16 > 0) {
					int var17 = var5.field1072 + (var5.field1079 * var16 >> 8);
					int var18 = var5.field1073 + (var5.field1080 * var16 >> 8);
					int var19 = var5.field1076 + (var5.field1083 * var16 >> 8);
					int var20 = var5.field1077 + (var5.field1084 * var16 >> 8);
					if (arg0 >= var17 && arg0 <= var18 && arg1 >= var19 && arg1 <= var20) {
						return true;
					}
				}
			} else if (var5.field1078 == 4) {
				int var21 = arg2 - var5.field1074;
				if (var21 > 0) {
					int var22 = var5.field1072 + (var5.field1079 * var21 >> 8);
					int var23 = var5.field1073 + (var5.field1080 * var21 >> 8);
					int var24 = var5.field1076 + (var5.field1083 * var21 >> 8);
					int var25 = var5.field1077 + (var5.field1084 * var21 >> 8);
					if (arg0 >= var22 && arg0 <= var23 && arg1 >= var24 && arg1 <= var25) {
						return true;
					}
				}
			} else if (var5.field1078 == 5) {
				int var26 = arg1 - var5.field1076;
				if (var26 > 0) {
					int var27 = var5.field1072 + (var5.field1079 * var26 >> 8);
					int var28 = var5.field1073 + (var5.field1080 * var26 >> 8);
					int var29 = var5.field1074 + (var5.field1081 * var26 >> 8);
					int var30 = var5.field1075 + (var5.field1082 * var26 >> 8);
					if (arg0 >= var27 && arg0 <= var28 && arg2 >= var29 && arg2 <= var30) {
						return true;
					}
				}
			}
		}
		return false;
	}
}
