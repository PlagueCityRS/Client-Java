package deob;

import sign.signlink;

@ObfuscatedName("IFHRXNFO")
public class class26 extends class8 {

	@ObfuscatedName("IFHRXNFO.j")
	public static final int field873 = -548;

	@ObfuscatedName("IFHRXNFO.k")
	public static final int field874 = 745;

	@ObfuscatedName("IFHRXNFO.i")
	public static int field872;

	@ObfuscatedName("IFHRXNFO.n")
	public static int field877;

	@ObfuscatedName("IFHRXNFO.o")
	public static int field878;

	@ObfuscatedName("IFHRXNFO.p")
	public static int field879;

	@ObfuscatedName("IFHRXNFO.q")
	public static int field880;

	@ObfuscatedName("IFHRXNFO.r")
	public static int field881;

	@ObfuscatedName("IFHRXNFO.s")
	public static int field882;

	@ObfuscatedName("IFHRXNFO.t")
	public static int field883;

	@ObfuscatedName("IFHRXNFO.u")
	public static int field884;

	@ObfuscatedName("IFHRXNFO.v")
	public static int field885;

	@ObfuscatedName("IFHRXNFO.h")
	public static boolean field871;

	@ObfuscatedName("IFHRXNFO.m")
	public static int[] field876;

	@ObfuscatedName("IFHRXNFO.a(I[III)V")
	public static void method310(int arg0, int[] arg1, int arg2, int arg3) {
		try {
			field876 = arg1;
			field877 = arg3;
			field878 = arg0;
			method312(arg3, arg0, 0, field872, 0);
			if (arg2 != 6821) {
				field872 = 209;
			}
		} catch (RuntimeException var5) {
			signlink.reporterror("69509, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + var5.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("IFHRXNFO.a(B)V")
	public static void method311() {
		try {
			field881 = 0;
			field879 = 0;
			field882 = field877;
			field880 = field878;
			field883 = field882 - 1;
			field884 = field882 / 2;
		} catch (RuntimeException var1) {
			signlink.reporterror("37251, " + 2 + ", " + var1.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("IFHRXNFO.a(IIIII)V")
	public static void method312(int arg0, int arg1, int arg2, int arg3, int arg4) {
		try {
			if (arg2 < 0) {
				arg2 = 0;
			}
			if (arg4 < 0) {
				arg4 = 0;
			}
			if (arg0 > field877) {
				arg0 = field877;
			}
			if (arg1 > field878) {
				arg1 = field878;
			}
			field881 = arg2;
			field879 = arg4;
			field882 = arg0;
			if (arg3 != 0) {
			}
			field880 = arg1;
			field883 = field882 - 1;
			field884 = field882 / 2;
			field885 = field880 / 2;
		} catch (RuntimeException var6) {
			signlink.reporterror("52987, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + var6.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("IFHRXNFO.a(I)V")
	public static void method313() {
		try {
			int var0 = field877 * field878;
			for (int var1 = 0; var1 < var0; var1++) {
				field876[var1] = 0;
			}
		} catch (RuntimeException var3) {
			signlink.reporterror("79189, " + 805 + ", " + var3.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("IFHRXNFO.a(IZIIIII)V")
	public static void method314(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		try {
			if (arg1 < field881) {
				arg4 -= field881 - arg1;
				arg1 = field881;
			}
			if (arg3 < field879) {
				arg0 -= field879 - arg3;
				arg3 = field879;
			}
			if (arg1 + arg4 > field882) {
				arg4 = field882 - arg1;
			}
			if (arg3 + arg0 > field880) {
				arg0 = field880 - arg3;
			}
			int var6 = 256 - arg2;
			int var7 = (arg5 >> 16 & 0xFF) * arg2;
			int var8 = (arg5 >> 8 & 0xFF) * arg2;
			int var9 = (arg5 & 0xFF) * arg2;
			int var10 = field877 - arg4;
			int var11 = arg1 + arg3 * field877;
			for (int var12 = 0; var12 < arg0; var12++) {
				for (int var13 = -arg4; var13 < 0; var13++) {
					int var14 = (field876[var11] >> 16 & 0xFF) * var6;
					int var15 = (field876[var11] >> 8 & 0xFF) * var6;
					int var16 = (field876[var11] & 0xFF) * var6;
					int var17 = (var7 + var14 >> 8 << 16) + (var8 + var15 >> 8 << 8) + (var9 + var16 >> 8);
					field876[var11++] = var17;
				}
				var11 += var10;
			}
		} catch (RuntimeException var19) {
			signlink.reporterror("19631, " + arg0 + ", " + false + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + var19.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("IFHRXNFO.a(IIIIII)V")
	public static void method315(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		try {
			boolean var12 = false;
			if (arg1 < field881) {
				arg3 -= field881 - arg1;
				arg1 = field881;
			}
			if (arg5 < field879) {
				arg4 -= field879 - arg5;
				arg5 = field879;
			}
			if (arg1 + arg3 > field882) {
				arg3 = field882 - arg1;
			}
			if (arg5 + arg4 > field880) {
				arg4 = field880 - arg5;
			}
			int var6 = field877 - arg3;
			int var7 = arg1 + arg5 * field877;
			for (int var8 = -arg4; var8 < 0; var8++) {
				for (int var9 = -arg3; var9 < 0; var9++) {
					field876[var7++] = arg0;
				}
				var7 += var6;
			}
		} catch (RuntimeException var11) {
			signlink.reporterror("94734, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + var11.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("IFHRXNFO.b(IIIIII)V")
	public static void method316(int arg0, int arg1, int arg2, int arg3, int arg4) {
		try {
			method318(arg1, arg0, arg2, arg4);
			method318(arg1, arg0 + arg3 - 1, arg2, arg4);
			method320(arg2, arg4, arg0, arg3);
			method320(arg2 + arg1 - 1, arg4, arg0, arg3);
		} catch (RuntimeException var6) {
			signlink.reporterror("73787, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + -110 + ", " + arg3 + ", " + arg4 + ", " + var6.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("IFHRXNFO.a(IIIIIII)V")
	public static void method317(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		try {
			method319(arg4, arg1, arg3, arg2, arg0);
			method319(arg4, arg1, arg3 + arg5 - 1, arg2, arg0);
			if (arg5 >= 3) {
				method321((byte) 5, arg4, arg2, arg5 - 2, arg1, arg3 + 1);
				method321((byte) 5, arg4, arg2 + arg0 - 1, arg5 - 2, arg1, arg3 + 1);
			}
		} catch (RuntimeException var7) {
			signlink.reporterror("72089, " + arg0 + ", " + arg1 + ", " + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + var7.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("IFHRXNFO.b(IIIII)V")
	public static void method318(int arg0, int arg1, int arg2, int arg3) {
		try {
			if (arg1 >= field879 && arg1 < field880) {
				if (arg2 < field881) {
					arg0 -= field881 - arg2;
					arg2 = field881;
				}
				if (arg2 + arg0 > field882) {
					arg0 = field882 - arg2;
				}
				int var4 = arg2 + arg1 * field877;
				for (int var5 = 0; var5 < arg0; var5++) {
					field876[var4 + var5] = arg3;
				}
			}
		} catch (RuntimeException var7) {
			signlink.reporterror("90092, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + -548 + ", " + arg3 + ", " + var7.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("IFHRXNFO.a(IIBIII)V")
	public static void method319(int arg0, int arg1, int arg2, int arg3, int arg4) {
		try {
			if (arg2 >= field879 && arg2 < field880) {
				if (arg3 < field881) {
					arg4 -= field881 - arg3;
					arg3 = field881;
				}
				if (arg3 + arg4 > field882) {
					arg4 = field882 - arg3;
				}
				int var5 = 256 - arg0;
				int var6 = (arg1 >> 16 & 0xFF) * arg0;
				int var7 = (arg1 >> 8 & 0xFF) * arg0;
				int var8 = (arg1 & 0xFF) * arg0;
				int var9 = arg3 + arg2 * field877;
				for (int var10 = 0; var10 < arg4; var10++) {
					int var11 = (field876[var9] >> 16 & 0xFF) * var5;
					int var12 = (field876[var9] >> 8 & 0xFF) * var5;
					int var13 = (field876[var9] & 0xFF) * var5;
					int var14 = (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8) + (var8 + var13 >> 8);
					field876[var9++] = var14;
				}
			}
		} catch (RuntimeException var16) {
			signlink.reporterror("41791, " + arg0 + ", " + arg1 + ", " + -12 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + var16.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("IFHRXNFO.c(IIIII)V")
	public static void method320(int arg0, int arg1, int arg2, int arg3) {
		try {
			if (arg0 >= field881 && arg0 < field882) {
				if (arg2 < field879) {
					arg3 -= field879 - arg2;
					arg2 = field879;
				}
				if (arg2 + arg3 > field880) {
					arg3 = field880 - arg2;
				}
				int var4 = arg0 + arg2 * field877;
				for (int var5 = 0; var5 < arg3; var5++) {
					field876[var4 + var5 * field877] = arg1;
				}
			}
		} catch (RuntimeException var7) {
			signlink.reporterror("50399, " + arg0 + ", " + -83 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + var7.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("IFHRXNFO.a(BIIIII)V")
	public static void method321(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		try {
			if (arg2 >= field881 && arg2 < field882) {
				if (arg5 < field879) {
					arg3 -= field879 - arg5;
					arg5 = field879;
				}
				if (arg5 + arg3 > field880) {
					arg3 = field880 - arg5;
				}
				int var6 = 256 - arg1;
				int var7 = (arg4 >> 16 & 0xFF) * arg1;
				int var8 = (arg4 >> 8 & 0xFF) * arg1;
				int var9 = (arg4 & 0xFF) * arg1;
				int var10 = arg2 + arg5 * field877;
				for (int var11 = 0; var11 < arg3; var11++) {
					int var12 = (field876[var10] >> 16 & 0xFF) * var6;
					int var13 = (field876[var10] >> 8 & 0xFF) * var6;
					int var14 = (field876[var10] & 0xFF) * var6;
					int var15 = (var7 + var12 >> 8 << 16) + (var8 + var13 >> 8 << 8) + (var9 + var14 >> 8);
					field876[var10] = var15;
					var10 += field877;
				}
				boolean var18 = false;
			}
		} catch (RuntimeException var17) {
			signlink.reporterror("65274, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + var17.toString());
			throw new RuntimeException();
		}
	}
}
