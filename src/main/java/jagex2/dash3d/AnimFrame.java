package jagex2.dash3d;

import deob.ObfuscatedName;
import jagex2.io.Packet;
import sign.signlink;

@ObfuscatedName("IBCKUTPD")
public final class AnimFrame {

	@ObfuscatedName("IBCKUTPD.a")
	public static final int field861 = 3;

	@ObfuscatedName("IBCKUTPD.c")
	public int field863;

	@ObfuscatedName("IBCKUTPD.e")
	public int field865;

	@ObfuscatedName("IBCKUTPD.d")
	public AnimBase base;

	@ObfuscatedName("IBCKUTPD.f")
	public int[] ti;

	@ObfuscatedName("IBCKUTPD.g")
	public int[] field867;

	@ObfuscatedName("IBCKUTPD.h")
	public int[] field868;

	@ObfuscatedName("IBCKUTPD.i")
	public int[] field869;

	@ObfuscatedName("IBCKUTPD.b")
	public static AnimFrame[] list;

	@ObfuscatedName("IBCKUTPD.j")
	public static boolean[] opaque;

	@ObfuscatedName("IBCKUTPD.a(I)V")
	public static void init(int arg0) {
		list = new AnimFrame[arg0 + 1];
		opaque = new boolean[arg0 + 1];
		for (int var1 = 0; var1 < arg0 + 1; var1++) {
			opaque[var1] = true;
		}
	}

	@ObfuscatedName("IBCKUTPD.a(B[B)V")
	public static void unpack(byte[] arg0) {
		try {
			Packet var1 = new Packet(arg0, -26583);
			var1.pos = arg0.length - 8;
			int var2 = var1.g2();
			int var3 = var1.g2();
			int var4 = var1.g2();
			int var5 = var1.g2();
			Packet var6 = new Packet(arg0, -26583);
			var6.pos = 0;
			int var7 = var2 + 2;
			Packet var8 = new Packet(arg0, -26583);
			var8.pos = var7;
			int var9 = var7 + var3;
			Packet var10 = new Packet(arg0, -26583);
			var10.pos = var9;
			int var11 = var9 + var4;
			Packet var12 = new Packet(arg0, -26583);
			var12.pos = var11;
			int var13 = var11 + var5;
			Packet var14 = new Packet(arg0, -26583);
			var14.pos = var13;
			AnimBase var15 = new AnimBase((byte) -89, var14);
			int var16 = var6.g2();
			int[] var17 = new int[500];
			int[] var18 = new int[500];
			int[] var19 = new int[500];
			int[] var20 = new int[500];
			for (int var21 = 0; var21 < var16; var21++) {
				int var22 = var6.g2();
				AnimFrame var23 = list[var22] = new AnimFrame();
				var23.field863 = var12.g1();
				var23.base = var15;
				int var24 = var6.g1();
				int var25 = -1;
				int var26 = 0;
				for (int var27 = 0; var27 < var24; var27++) {
					int var28 = var8.g1();
					if (var28 > 0) {
						if (var15.type[var27] != 0) {
							for (int var29 = var27 - 1; var29 > var25; var29--) {
								if (var15.type[var29] == 0) {
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
						if (var15.type[var27] == 3) {
							var30 = 128;
						}
						if ((var28 & 0x1) == 0) {
							var18[var26] = var30;
						} else {
							var18[var26] = var10.gsmarts();
						}
						if ((var28 & 0x2) == 0) {
							var19[var26] = var30;
						} else {
							var19[var26] = var10.gsmarts();
						}
						if ((var28 & 0x4) == 0) {
							var20[var26] = var30;
						} else {
							var20[var26] = var10.gsmarts();
						}
						var25 = var27;
						var26++;
						if (var15.type[var27] == 5) {
							opaque[var22] = false;
						}
					}
				}
				var23.field865 = var26;
				var23.ti = new int[var26];
				var23.field867 = new int[var26];
				var23.field868 = new int[var26];
				var23.field869 = new int[var26];
				for (int var31 = 0; var31 < var26; var31++) {
					var23.ti[var31] = var17[var31];
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
			list = null;
		} catch (RuntimeException var1) {
			signlink.reporterror("48214, " + ", " + var1.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("IBCKUTPD.c(I)LIBCKUTPD;")
	public static AnimFrame get(int arg0) {
		return list == null ? null : list[arg0];
	}

	@ObfuscatedName("IBCKUTPD.a(IZ)Z")
	public static boolean animateTransparencies(int arg0) {
		try {
			return arg0 == -1;
		} catch (RuntimeException var2) {
			signlink.reporterror("23295, " + arg0 + ", " + false + ", " + var2.toString());
			throw new RuntimeException();
		}
	}
}
