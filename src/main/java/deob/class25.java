package deob;

import sign.signlink;

@ObfuscatedName("IBCKUTPD")
public final class class25 {

	@ObfuscatedName("IBCKUTPD.a")
	public static final int field861 = 3;

	@ObfuscatedName("IBCKUTPD.c")
	public int field863;

	@ObfuscatedName("IBCKUTPD.e")
	public int field865;

	@ObfuscatedName("IBCKUTPD.d")
	public class36 field864;

	@ObfuscatedName("IBCKUTPD.f")
	public int[] field866;

	@ObfuscatedName("IBCKUTPD.g")
	public int[] field867;

	@ObfuscatedName("IBCKUTPD.h")
	public int[] field868;

	@ObfuscatedName("IBCKUTPD.i")
	public int[] field869;

	@ObfuscatedName("IBCKUTPD.b")
	public static class25[] field862;

	@ObfuscatedName("IBCKUTPD.j")
	public static boolean[] field870;

	@ObfuscatedName("IBCKUTPD.a(I)V")
	public static void method305(int arg0) {
		field862 = new class25[arg0 + 1];
		field870 = new boolean[arg0 + 1];
		for (int var1 = 0; var1 < arg0 + 1; var1++) {
			field870[var1] = true;
		}
	}

	@ObfuscatedName("IBCKUTPD.a(B[B)V")
	public static void method306(byte[] arg0) {
		try {
			class17 var1 = new class17(arg0, -26583);
			var1.field779 = arg0.length - 8;
			int var2 = var1.method226();
			int var3 = var1.method226();
			int var4 = var1.method226();
			int var5 = var1.method226();
			class17 var6 = new class17(arg0, -26583);
			var6.field779 = 0;
			int var7 = var2 + 2;
			class17 var8 = new class17(arg0, -26583);
			var8.field779 = var7;
			int var9 = var7 + var3;
			class17 var10 = new class17(arg0, -26583);
			var10.field779 = var9;
			int var11 = var9 + var4;
			class17 var12 = new class17(arg0, -26583);
			var12.field779 = var11;
			int var13 = var11 + var5;
			class17 var14 = new class17(arg0, -26583);
			var14.field779 = var13;
			class36 var15 = new class36((byte) -89, var14);
			int var16 = var6.method226();
			int[] var17 = new int[500];
			int[] var18 = new int[500];
			int[] var19 = new int[500];
			int[] var20 = new int[500];
			for (int var21 = 0; var21 < var16; var21++) {
				int var22 = var6.method226();
				class25 var23 = field862[var22] = new class25();
				var23.field863 = var12.method224();
				var23.field864 = var15;
				int var24 = var6.method224();
				int var25 = -1;
				int var26 = 0;
				for (int var27 = 0; var27 < var24; var27++) {
					int var28 = var8.method224();
					if (var28 > 0) {
						if (var15.field1116[var27] != 0) {
							for (int var29 = var27 - 1; var29 > var25; var29--) {
								if (var15.field1116[var29] == 0) {
									var17[var26] = var29;
									var18[var26] = 0;
									var19[var26] = 0;
									var20[var26] = 0;
									var26++;
									break;
								}
							}
						}
						var17[var26] = var27;
						short var30 = 0;
						if (var15.field1116[var27] == 3) {
							var30 = 128;
						}
						if ((var28 & 0x1) == 0) {
							var18[var26] = var30;
						} else {
							var18[var26] = var10.method237();
						}
						if ((var28 & 0x2) == 0) {
							var19[var26] = var30;
						} else {
							var19[var26] = var10.method237();
						}
						if ((var28 & 0x4) == 0) {
							var20[var26] = var30;
						} else {
							var20[var26] = var10.method237();
						}
						var25 = var27;
						var26++;
						if (var15.field1116[var27] == 5) {
							field870[var22] = false;
						}
					}
				}
				var23.field865 = var26;
				var23.field866 = new int[var26];
				var23.field867 = new int[var26];
				var23.field868 = new int[var26];
				var23.field869 = new int[var26];
				for (int var31 = 0; var31 < var26; var31++) {
					var23.field866[var31] = var17[var31];
					var23.field867[var31] = var18[var31];
					var23.field868[var31] = var19[var31];
					var23.field869[var31] = var20[var31];
				}
			}
		} catch (RuntimeException var33) {
			signlink.reporterror("8324, " + 4 + ", " + arg0 + ", " + var33.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("IBCKUTPD.b(I)V")
	public static void method307() {
		try {
			field862 = null;
		} catch (RuntimeException var1) {
			signlink.reporterror("48214, " + ", " + var1.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("IBCKUTPD.c(I)LIBCKUTPD;")
	public static class25 method308(int arg0) {
		return field862 == null ? null : field862[arg0];
	}

	@ObfuscatedName("IBCKUTPD.a(IZ)Z")
	public static boolean method309(int arg0) {
		try {
			return arg0 == -1;
		} catch (RuntimeException var2) {
			signlink.reporterror("23295, " + arg0 + ", " + false + ", " + var2.toString());
			throw new RuntimeException();
		}
	}
}
