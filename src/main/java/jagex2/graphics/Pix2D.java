package jagex2.graphics;

import deob.ObfuscatedName;
import jagex2.datastruct.Linkable2;
import sign.signlink;

@ObfuscatedName("IFHRXNFO")
public class Pix2D extends Linkable2 {

	@ObfuscatedName("IFHRXNFO.m")
	public static int[] pixels;

	@ObfuscatedName("IFHRXNFO.n")
	public static int width;

	@ObfuscatedName("IFHRXNFO.o")
	public static int height;

	@ObfuscatedName("IFHRXNFO.p")
	public static int clipMinY;

	@ObfuscatedName("IFHRXNFO.q")
	public static int clipMaxY;

	@ObfuscatedName("IFHRXNFO.r")
	public static int clipMinX;

	@ObfuscatedName("IFHRXNFO.s")
	public static int clipMaxX;

	@ObfuscatedName("IFHRXNFO.h")
	public static boolean field871;

	@ObfuscatedName("IFHRXNFO.j")
	public static final int field873 = -548;

	@ObfuscatedName("IFHRXNFO.k")
	public static final int field874 = 745;

	@ObfuscatedName("IFHRXNFO.i")
	public static int field872;

	@ObfuscatedName("IFHRXNFO.t")
	public static int sizeX;

	@ObfuscatedName("IFHRXNFO.u")
	public static int maxX;

	@ObfuscatedName("IFHRXNFO.v")
	public static int maxY;

	@ObfuscatedName("IFHRXNFO.a(I[III)V")
	public static void setPixels(int arg0, int[] arg1, int arg2, int arg3) {
		try {
			pixels = arg1;
			width = arg3;
			height = arg0;
			setClipping(arg3, arg0, 0, field872, 0);
			if (arg2 != 6821) {
				field872 = 209;
			}
		} catch (RuntimeException var5) {
			signlink.reporterror("69509, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + var5.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("IFHRXNFO.a(B)V")
	public static void resetClipping() {
		try {
			clipMinX = 0;
			clipMinY = 0;
			clipMaxX = width;
			clipMaxY = height;
			sizeX = clipMaxX - 1;
			maxX = clipMaxX / 2;
		} catch (RuntimeException var1) {
			signlink.reporterror("37251, " + 2 + ", " + var1.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("IFHRXNFO.a(IIIII)V")
	public static void setClipping(int arg0, int arg1, int arg2, int arg3, int arg4) {
		try {
			if (arg2 < 0) {
				arg2 = 0;
			}
			if (arg4 < 0) {
				arg4 = 0;
			}
			if (arg0 > width) {
				arg0 = width;
			}
			if (arg1 > height) {
				arg1 = height;
			}
			clipMinX = arg2;
			clipMinY = arg4;
			clipMaxX = arg0;
			if (arg3 != 0) {
			}
			clipMaxY = arg1;
			sizeX = clipMaxX - 1;
			maxX = clipMaxX / 2;
			maxY = clipMaxY / 2;
		} catch (RuntimeException var6) {
			signlink.reporterror("52987, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + var6.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("IFHRXNFO.a(I)V")
	public static void cls() {
		try {
			int var0 = width * height;
			for (int var1 = 0; var1 < var0; var1++) {
				pixels[var1] = 0;
			}
		} catch (RuntimeException var3) {
			signlink.reporterror("79189, " + 805 + ", " + var3.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("IFHRXNFO.a(IZIIIII)V")
	public static void fillRectTrans(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		try {
			if (arg1 < clipMinX) {
				arg4 -= clipMinX - arg1;
				arg1 = clipMinX;
			}
			if (arg3 < clipMinY) {
				arg0 -= clipMinY - arg3;
				arg3 = clipMinY;
			}
			if (arg1 + arg4 > clipMaxX) {
				arg4 = clipMaxX - arg1;
			}
			if (arg3 + arg0 > clipMaxY) {
				arg0 = clipMaxY - arg3;
			}
			int var6 = 256 - arg2;
			int var7 = (arg5 >> 16 & 0xFF) * arg2;
			int var8 = (arg5 >> 8 & 0xFF) * arg2;
			int var9 = (arg5 & 0xFF) * arg2;
			int var10 = width - arg4;
			int var11 = arg1 + arg3 * width;
			for (int var12 = 0; var12 < arg0; var12++) {
				for (int var13 = -arg4; var13 < 0; var13++) {
					int var14 = (pixels[var11] >> 16 & 0xFF) * var6;
					int var15 = (pixels[var11] >> 8 & 0xFF) * var6;
					int var16 = (pixels[var11] & 0xFF) * var6;
					int var17 = (var7 + var14 >> 8 << 16) + (var8 + var15 >> 8 << 8) + (var9 + var16 >> 8);
					pixels[var11++] = var17;
				}
				var11 += var10;
			}
		} catch (RuntimeException var19) {
			signlink.reporterror("19631, " + arg0 + ", " + false + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + var19.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("IFHRXNFO.a(IIIIII)V")
	public static void fillrect(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		try {
			boolean var12 = false;
			if (arg1 < clipMinX) {
				arg3 -= clipMinX - arg1;
				arg1 = clipMinX;
			}
			if (arg5 < clipMinY) {
				arg4 -= clipMinY - arg5;
				arg5 = clipMinY;
			}
			if (arg1 + arg3 > clipMaxX) {
				arg3 = clipMaxX - arg1;
			}
			if (arg5 + arg4 > clipMaxY) {
				arg4 = clipMaxY - arg5;
			}
			int var6 = width - arg3;
			int var7 = arg1 + arg5 * width;
			for (int var8 = -arg4; var8 < 0; var8++) {
				for (int var9 = -arg3; var9 < 0; var9++) {
					pixels[var7++] = arg0;
				}
				var7 += var6;
			}
		} catch (RuntimeException var11) {
			signlink.reporterror("94734, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + var11.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("IFHRXNFO.b(IIIIII)V")
	public static void drawRect(int arg0, int arg1, int arg2, int arg3, int arg4) {
		try {
			hline(arg1, arg0, arg2, arg4);
			hline(arg1, arg0 + arg3 - 1, arg2, arg4);
			vline(arg2, arg4, arg0, arg3);
			vline(arg2 + arg1 - 1, arg4, arg0, arg3);
		} catch (RuntimeException var6) {
			signlink.reporterror("73787, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + -110 + ", " + arg3 + ", " + arg4 + ", " + var6.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("IFHRXNFO.a(IIIIIII)V")
	public static void drawRectTrans(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		try {
			hlineTrans(arg4, arg1, arg3, arg2, arg0);
			hlineTrans(arg4, arg1, arg3 + arg5 - 1, arg2, arg0);
			if (arg5 >= 3) {
				vlineTrans((byte) 5, arg4, arg2, arg5 - 2, arg1, arg3 + 1);
				vlineTrans((byte) 5, arg4, arg2 + arg0 - 1, arg5 - 2, arg1, arg3 + 1);
			}
		} catch (RuntimeException var7) {
			signlink.reporterror("72089, " + arg0 + ", " + arg1 + ", " + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + var7.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("IFHRXNFO.b(IIIII)V")
	public static void hline(int arg0, int arg1, int arg2, int arg3) {
		try {
			if (arg1 >= clipMinY && arg1 < clipMaxY) {
				if (arg2 < clipMinX) {
					arg0 -= clipMinX - arg2;
					arg2 = clipMinX;
				}
				if (arg2 + arg0 > clipMaxX) {
					arg0 = clipMaxX - arg2;
				}
				int var4 = arg2 + arg1 * width;
				for (int var5 = 0; var5 < arg0; var5++) {
					pixels[var4 + var5] = arg3;
				}
			}
		} catch (RuntimeException var7) {
			signlink.reporterror("90092, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + -548 + ", " + arg3 + ", " + var7.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("IFHRXNFO.a(IIBIII)V")
	public static void hlineTrans(int arg0, int arg1, int arg2, int arg3, int arg4) {
		try {
			if (arg2 >= clipMinY && arg2 < clipMaxY) {
				if (arg3 < clipMinX) {
					arg4 -= clipMinX - arg3;
					arg3 = clipMinX;
				}
				if (arg3 + arg4 > clipMaxX) {
					arg4 = clipMaxX - arg3;
				}
				int var5 = 256 - arg0;
				int var6 = (arg1 >> 16 & 0xFF) * arg0;
				int var7 = (arg1 >> 8 & 0xFF) * arg0;
				int var8 = (arg1 & 0xFF) * arg0;
				int var9 = arg3 + arg2 * width;
				for (int var10 = 0; var10 < arg4; var10++) {
					int var11 = (pixels[var9] >> 16 & 0xFF) * var5;
					int var12 = (pixels[var9] >> 8 & 0xFF) * var5;
					int var13 = (pixels[var9] & 0xFF) * var5;
					int var14 = (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8) + (var8 + var13 >> 8);
					pixels[var9++] = var14;
				}
			}
		} catch (RuntimeException var16) {
			signlink.reporterror("41791, " + arg0 + ", " + arg1 + ", " + -12 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + var16.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("IFHRXNFO.c(IIIII)V")
	public static void vline(int arg0, int arg1, int arg2, int arg3) {
		try {
			if (arg0 >= clipMinX && arg0 < clipMaxX) {
				if (arg2 < clipMinY) {
					arg3 -= clipMinY - arg2;
					arg2 = clipMinY;
				}
				if (arg2 + arg3 > clipMaxY) {
					arg3 = clipMaxY - arg2;
				}
				int var4 = arg0 + arg2 * width;
				for (int var5 = 0; var5 < arg3; var5++) {
					pixels[var4 + var5 * width] = arg1;
				}
			}
		} catch (RuntimeException var7) {
			signlink.reporterror("50399, " + arg0 + ", " + -83 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + var7.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("IFHRXNFO.a(BIIIII)V")
	public static void vlineTrans(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		try {
			if (arg2 >= clipMinX && arg2 < clipMaxX) {
				if (arg5 < clipMinY) {
					arg3 -= clipMinY - arg5;
					arg5 = clipMinY;
				}
				if (arg5 + arg3 > clipMaxY) {
					arg3 = clipMaxY - arg5;
				}
				int var6 = 256 - arg1;
				int var7 = (arg4 >> 16 & 0xFF) * arg1;
				int var8 = (arg4 >> 8 & 0xFF) * arg1;
				int var9 = (arg4 & 0xFF) * arg1;
				int var10 = arg2 + arg5 * width;
				for (int var11 = 0; var11 < arg3; var11++) {
					int var12 = (pixels[var10] >> 16 & 0xFF) * var6;
					int var13 = (pixels[var10] >> 8 & 0xFF) * var6;
					int var14 = (pixels[var10] & 0xFF) * var6;
					int var15 = (var7 + var12 >> 8 << 16) + (var8 + var13 >> 8 << 8) + (var9 + var14 >> 8);
					pixels[var10] = var15;
					var10 += width;
				}
				boolean var18 = false;
			}
		} catch (RuntimeException var17) {
			signlink.reporterror("65274, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + var17.toString());
			throw new RuntimeException();
		}
	}
}
