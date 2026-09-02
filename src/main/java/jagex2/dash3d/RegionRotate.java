package jagex2.dash3d;

import deob.ObfuscatedName;
import sign.signlink;

@ObfuscatedName("RHHZDAUG")
public final class RegionRotate {

	@ObfuscatedName("RHHZDAUG.a")
	public static final int field1298 = -454;

	@ObfuscatedName("RHHZDAUG.a(IIII)I")
	public static int DX(int arg0, int arg1, int arg2) {
		try {
			int rotation = arg2 & 0x3;
			if (rotation == 0) {
				return arg1;
			} else if (rotation == 1) {
				return arg0;
			} else if (rotation == 2) {
				return 7 - arg1;
			} else {
				return 7 - arg0;
			}
		} catch (RuntimeException var4) {
			signlink.reporterror("21628, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + -100 + ", " + var4.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("RHHZDAUG.b(IIII)I")
	public static int DZ(int arg0, int arg1, int arg2) {
		try {
			int rotation = arg2 & 0x3;
			if (rotation == 0) {
				return arg1;
			} else if (rotation == 1) {
				return 7 - arg0;
			} else if (rotation == 2) {
				return 7 - arg1;
			} else {
				return arg0;
			}
		} catch (RuntimeException var4) {
			signlink.reporterror("50836, " + -454 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + var4.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("RHHZDAUG.a(IIIIIZI)I")
	public static int DX(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		try {
			if ((arg3 & 0x1) == 1) {
				int var6 = arg5;
				arg5 = arg4;
				arg4 = var6;
			}
			int var9 = arg0 & 0x3;
			if (var9 == 0) {
				return arg2;
			} else if (var9 == 1) {
				return arg1;
			} else if (var9 == 2) {
				return 7 + 1 - arg2 - arg5;
			} else {
				return 7 + 1 - arg1 - arg4;
			}
		} catch (RuntimeException var8) {
			signlink.reporterror("48428, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + false + ", " + arg5 + ", " + var8.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("RHHZDAUG.a(IIIIIII)I")
	public static int DZ(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		try {
			boolean var11 = false;
			if ((arg1 & 0x1) == 1) {
				int var7 = arg4;
				arg4 = arg0;
				arg0 = var7;
			}
			int var10 = arg2 & 0x3;
			if (var10 == 0) {
				return arg5;
			} else if (var10 == 1) {
				return 7 + 1 - arg3 - arg4;
			} else if (var10 == 2) {
				return 7 + 1 - arg5 - arg0;
			} else {
				return arg3;
			}
		} catch (RuntimeException var9) {
			signlink.reporterror("342, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + var9.toString());
			throw new RuntimeException();
		}
	}
}
