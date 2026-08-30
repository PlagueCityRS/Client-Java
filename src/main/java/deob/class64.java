package deob;

import sign.signlink;

@ObfuscatedName("VWODEXFW")
public final class class64 {

	@ObfuscatedName("VWODEXFW.p")
	public static final int[] field1461 = new int[6];

	@ObfuscatedName("VWODEXFW.q")
	public static final int[] field1462 = new int[6];

	@ObfuscatedName("VWODEXFW.r")
	public static final int[] field1463 = new int[6];

	@ObfuscatedName("VWODEXFW.s")
	public static final int[] field1464 = new int[6];

	@ObfuscatedName("VWODEXFW.t")
	public static final int[] field1465 = new int[6];

	@ObfuscatedName("VWODEXFW.u")
	public static final int[] field1466 = new int[] { 1, 0 };

	@ObfuscatedName("VWODEXFW.v")
	public static final int[] field1467 = new int[] { 2, 1 };

	@ObfuscatedName("VWODEXFW.w")
	public static final int[] field1468 = new int[] { 3, 3 };

	@ObfuscatedName("VWODEXFW.x")
	public static final int[][] field1469 = new int[][] { { 1, 3, 5, 7 }, { 1, 3, 5, 7 }, { 1, 3, 5, 7 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 2, 6 }, { 1, 3, 5, 7, 2, 8 }, { 1, 3, 5, 7, 2, 8 }, { 1, 3, 5, 7, 11, 12 }, { 1, 3, 5, 7, 11, 12 }, { 1, 3, 5, 7, 13, 14 } };

	@ObfuscatedName("VWODEXFW.y")
	public static final int[][] field1470 = new int[][] { { 0, 1, 2, 3, 0, 0, 1, 3 }, { 1, 1, 2, 3, 1, 0, 1, 3 }, { 0, 1, 2, 3, 1, 0, 1, 3 }, { 0, 0, 1, 2, 0, 0, 2, 4, 1, 0, 4, 3 }, { 0, 0, 1, 4, 0, 0, 4, 3, 1, 1, 2, 4 }, { 0, 0, 4, 3, 1, 0, 1, 2, 1, 0, 2, 4 }, { 0, 1, 2, 4, 1, 0, 1, 4, 1, 0, 4, 3 }, { 0, 4, 1, 2, 0, 4, 2, 5, 1, 0, 4, 5, 1, 0, 5, 3 }, { 0, 4, 1, 2, 0, 4, 2, 3, 0, 4, 3, 5, 1, 0, 4, 5 }, { 0, 0, 4, 5, 1, 4, 1, 2, 1, 4, 2, 3, 1, 4, 3, 5 }, { 0, 0, 1, 5, 0, 1, 4, 5, 0, 1, 2, 4, 1, 0, 5, 3, 1, 5, 4, 3, 1, 4, 2, 3 }, { 1, 0, 1, 5, 1, 1, 4, 5, 1, 1, 2, 4, 0, 0, 5, 3, 0, 5, 4, 3, 0, 4, 2, 3 }, { 1, 0, 5, 4, 1, 0, 1, 5, 0, 0, 4, 3, 0, 4, 5, 3, 0, 5, 2, 3, 0, 1, 2, 5 } };

	@ObfuscatedName("VWODEXFW.k")
	public boolean field1456 = true;

	@ObfuscatedName("VWODEXFW.l")
	public final int field1457;

	@ObfuscatedName("VWODEXFW.m")
	public final int field1458;

	@ObfuscatedName("VWODEXFW.n")
	public final int field1459;

	@ObfuscatedName("VWODEXFW.o")
	public final int field1460;

	@ObfuscatedName("VWODEXFW.a")
	public final int[] field1446;

	@ObfuscatedName("VWODEXFW.b")
	public final int[] field1447;

	@ObfuscatedName("VWODEXFW.c")
	public final int[] field1448;

	@ObfuscatedName("VWODEXFW.g")
	public final int[] field1452;

	@ObfuscatedName("VWODEXFW.h")
	public final int[] field1453;

	@ObfuscatedName("VWODEXFW.i")
	public final int[] field1454;

	@ObfuscatedName("VWODEXFW.d")
	public final int[] field1449;

	@ObfuscatedName("VWODEXFW.e")
	public final int[] field1450;

	@ObfuscatedName("VWODEXFW.f")
	public final int[] field1451;

	@ObfuscatedName("VWODEXFW.j")
	public int[] field1455;

	public class64(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19) {
		try {
			if (arg18 != arg19 || arg18 != arg13 || arg18 != arg12) {
				this.field1456 = false;
			}
			this.field1457 = arg1;
			this.field1458 = arg6;
			this.field1459 = arg7;
			this.field1460 = arg11;
			int[] var21 = field1469[arg1];
			int var22 = var21.length;
			this.field1446 = new int[var22];
			this.field1447 = new int[var22];
			this.field1448 = new int[var22];
			int[] var23 = new int[var22];
			int[] var24 = new int[var22];
			int var25 = arg17 * 128;
			int var26 = arg9 * 128;
			for (int var27 = 0; var27 < var22; var27++) {
				int var28 = var21[var27];
				if ((var28 & 0x1) == 0 && var28 <= 8) {
					var28 = (var28 - arg6 - arg6 - 1 & 0x7) + 1;
				}
				if (var28 > 8 && var28 <= 12) {
					var28 = (var28 - arg6 - 9 & 0x3) + 9;
				}
				if (var28 > 12 && var28 <= 16) {
					var28 = (var28 - arg6 - 13 & 0x3) + 13;
				}
				int var29;
				int var30;
				int var31;
				int var32;
				int var33;
				if (var28 == 1) {
					var29 = var25;
					var30 = var26;
					var31 = arg18;
					var32 = arg2;
					var33 = arg4;
				} else if (var28 == 2) {
					var29 = var25 + 64;
					var30 = var26;
					var31 = arg18 + arg19 >> 1;
					var32 = arg2 + arg16 >> 1;
					var33 = arg4 + arg3 >> 1;
				} else if (var28 == 3) {
					var29 = var25 + 128;
					var30 = var26;
					var31 = arg19;
					var32 = arg16;
					var33 = arg3;
				} else if (var28 == 4) {
					var29 = var25 + 128;
					var30 = var26 + 64;
					var31 = arg19 + arg13 >> 1;
					var32 = arg16 + arg15 >> 1;
					var33 = arg3 + arg0 >> 1;
				} else if (var28 == 5) {
					var29 = var25 + 128;
					var30 = var26 + 128;
					var31 = arg13;
					var32 = arg15;
					var33 = arg0;
				} else if (var28 == 6) {
					var29 = var25 + 64;
					var30 = var26 + 128;
					var31 = arg13 + arg12 >> 1;
					var32 = arg15 + arg8 >> 1;
					var33 = arg0 + arg5 >> 1;
				} else if (var28 == 7) {
					var29 = var25;
					var30 = var26 + 128;
					var31 = arg12;
					var32 = arg8;
					var33 = arg5;
				} else if (var28 == 8) {
					var29 = var25;
					var30 = var26 + 64;
					var31 = arg12 + arg18 >> 1;
					var32 = arg8 + arg2 >> 1;
					var33 = arg5 + arg4 >> 1;
				} else if (var28 == 9) {
					var29 = var25 + 64;
					var30 = var26 + 32;
					var31 = arg18 + arg19 >> 1;
					var32 = arg2 + arg16 >> 1;
					var33 = arg4 + arg3 >> 1;
				} else if (var28 == 10) {
					var29 = var25 + 96;
					var30 = var26 + 64;
					var31 = arg19 + arg13 >> 1;
					var32 = arg16 + arg15 >> 1;
					var33 = arg3 + arg0 >> 1;
				} else if (var28 == 11) {
					var29 = var25 + 64;
					var30 = var26 + 96;
					var31 = arg13 + arg12 >> 1;
					var32 = arg15 + arg8 >> 1;
					var33 = arg0 + arg5 >> 1;
				} else if (var28 == 12) {
					var29 = var25 + 32;
					var30 = var26 + 64;
					var31 = arg12 + arg18 >> 1;
					var32 = arg8 + arg2 >> 1;
					var33 = arg5 + arg4 >> 1;
				} else if (var28 == 13) {
					var29 = var25 + 32;
					var30 = var26 + 32;
					var31 = arg18;
					var32 = arg2;
					var33 = arg4;
				} else if (var28 == 14) {
					var29 = var25 + 96;
					var30 = var26 + 32;
					var31 = arg19;
					var32 = arg16;
					var33 = arg3;
				} else if (var28 == 15) {
					var29 = var25 + 96;
					var30 = var26 + 96;
					var31 = arg13;
					var32 = arg15;
					var33 = arg0;
				} else {
					var29 = var25 + 32;
					var30 = var26 + 96;
					var31 = arg12;
					var32 = arg8;
					var33 = arg5;
				}
				this.field1446[var27] = var29;
				this.field1447[var27] = var31;
				this.field1448[var27] = var30;
				var23[var27] = var32;
				var24[var27] = var33;
			}
			int[] var34 = field1470[arg1];
			int var35 = var34.length / 4;
			this.field1452 = new int[var35];
			this.field1453 = new int[var35];
			this.field1454 = new int[var35];
			this.field1449 = new int[var35];
			this.field1450 = new int[var35];
			this.field1451 = new int[var35];
			if (arg14 != -1) {
				this.field1455 = new int[var35];
			}
			int var36 = 0;
			for (int var37 = 0; var37 < var35; var37++) {
				int var38 = var34[var36];
				int var39 = var34[var36 + 1];
				int var40 = var34[var36 + 2];
				int var41 = var34[var36 + 3];
				var36 += 4;
				if (var39 < 4) {
					var39 = var39 - arg6 & 0x3;
				}
				if (var40 < 4) {
					var40 = var40 - arg6 & 0x3;
				}
				if (var41 < 4) {
					var41 = var41 - arg6 & 0x3;
				}
				this.field1452[var37] = var39;
				this.field1453[var37] = var40;
				this.field1454[var37] = var41;
				if (var38 == 0) {
					this.field1449[var37] = var23[var39];
					this.field1450[var37] = var23[var40];
					this.field1451[var37] = var23[var41];
					if (this.field1455 != null) {
						this.field1455[var37] = -1;
					}
				} else {
					this.field1449[var37] = var24[var39];
					this.field1450[var37] = var24[var40];
					this.field1451[var37] = var24[var41];
					if (this.field1455 != null) {
						this.field1455[var37] = arg14;
					}
				}
			}
			int var42 = arg18;
			int var43 = arg19;
			if (arg19 < arg18) {
				var42 = arg19;
			}
			if (arg19 > arg19) {
				var43 = arg19;
			}
			if (arg13 < var42) {
				var42 = arg13;
			}
			if (arg13 > arg19) {
				var43 = arg13;
			}
			if (arg12 < var42) {
				;
			}
			if (arg12 > var43) {
				;
			}
		} catch (RuntimeException var47) {
			signlink.reporterror("63795, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + 6 + ", " + arg11 + ", " + arg12 + ", " + arg13 + ", " + arg14 + ", " + arg15 + ", " + arg16 + ", " + arg17 + ", " + arg18 + ", " + arg19 + ", " + var47.toString());
			throw new RuntimeException();
		}
	}
}
