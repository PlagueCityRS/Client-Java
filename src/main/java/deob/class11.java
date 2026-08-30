package deob;

import sign.signlink;

@ObfuscatedName("CYFJILLF")
public final class class11 {

	@ObfuscatedName("CYFJILLF.v")
	public static final int[] field672 = new int[5];

	@ObfuscatedName("CYFJILLF.w")
	public static final int[] field673 = new int[5];

	@ObfuscatedName("CYFJILLF.x")
	public static final int[] field674 = new int[5];

	@ObfuscatedName("CYFJILLF.y")
	public static final int[] field675 = new int[5];

	@ObfuscatedName("CYFJILLF.z")
	public static final int[] field676 = new int[5];

	@ObfuscatedName("CYFJILLF.a")
	public final boolean field651 = true;

	@ObfuscatedName("CYFJILLF.j")
	public final int[] field660 = new int[5];

	@ObfuscatedName("CYFJILLF.k")
	public final int[] field661 = new int[5];

	@ObfuscatedName("CYFJILLF.l")
	public final int[] field662 = new int[5];

	@ObfuscatedName("CYFJILLF.n")
	public int field664 = 100;

	@ObfuscatedName("CYFJILLF.q")
	public int field667 = 500;

	@ObfuscatedName("CYFJILLF.m")
	public int field663;

	@ObfuscatedName("CYFJILLF.r")
	public int field668;

	@ObfuscatedName("CYFJILLF.b")
	public class50 field652;

	@ObfuscatedName("CYFJILLF.c")
	public class50 field653;

	@ObfuscatedName("CYFJILLF.d")
	public class50 field654;

	@ObfuscatedName("CYFJILLF.e")
	public class50 field655;

	@ObfuscatedName("CYFJILLF.f")
	public class50 field656;

	@ObfuscatedName("CYFJILLF.g")
	public class50 field657;

	@ObfuscatedName("CYFJILLF.h")
	public class50 field658;

	@ObfuscatedName("CYFJILLF.i")
	public class50 field659;

	@ObfuscatedName("CYFJILLF.p")
	public class50 field666;

	@ObfuscatedName("CYFJILLF.o")
	public class61 field665;

	@ObfuscatedName("CYFJILLF.s")
	public static int[] field669;

	@ObfuscatedName("CYFJILLF.t")
	public static int[] field670;

	@ObfuscatedName("CYFJILLF.u")
	public static int[] field671;

	@ObfuscatedName("CYFJILLF.a()V")
	public static void method182() {
		field670 = new int[32768];
		for (int var0 = 0; var0 < 32768; var0++) {
			if (Math.random() > 0.5D) {
				field670[var0] = 1;
			} else {
				field670[var0] = -1;
			}
		}
		field671 = new int[32768];
		for (int var1 = 0; var1 < 32768; var1++) {
			field671[var1] = (int) (Math.sin((double) var1 / 5215.1903D) * 16384.0D);
		}
		field669 = new int[220500];
	}

	@ObfuscatedName("CYFJILLF.a(II)[I")
	public int[] method183(int arg0, int arg1) {
		for (int var3 = 0; var3 < arg0; var3++) {
			field669[var3] = 0;
		}
		if (arg1 < 10) {
			return field669;
		}
		double var4 = (double) arg0 / ((double) arg1 + 0.0D);
		this.field652.method445();
		this.field653.method445();
		int var6 = 0;
		int var7 = 0;
		int var8 = 0;
		if (this.field654 != null) {
			this.field654.method445();
			this.field655.method445();
			var6 = (int) ((double) (this.field654.field1318 - this.field654.field1317) * 32.768D / var4);
			var7 = (int) ((double) this.field654.field1317 * 32.768D / var4);
		}
		int var9 = 0;
		int var10 = 0;
		int var11 = 0;
		if (this.field656 != null) {
			this.field656.method445();
			this.field657.method445();
			var9 = (int) ((double) (this.field656.field1318 - this.field656.field1317) * 32.768D / var4);
			var10 = (int) ((double) this.field656.field1317 * 32.768D / var4);
		}
		for (int var12 = 0; var12 < 5; var12++) {
			if (this.field660[var12] != 0) {
				field672[var12] = 0;
				field673[var12] = (int) ((double) this.field662[var12] * var4);
				field674[var12] = (this.field660[var12] << 14) / 100;
				field675[var12] = (int) ((double) (this.field652.field1318 - this.field652.field1317) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field661[var12]) / var4);
				field676[var12] = (int) ((double) this.field652.field1317 * 32.768D / var4);
			}
		}
		for (int var13 = 0; var13 < arg0; var13++) {
			int var14 = this.field652.method446(arg0);
			int var15 = this.field653.method446(arg0);
			if (this.field654 != null) {
				int var16 = this.field654.method446(arg0);
				int var17 = this.field655.method446(arg0);
				var14 += this.method184(var8, var17, this.field654.field1319) >> 1;
				var8 += (var16 * var6 >> 16) + var7;
			}
			if (this.field656 != null) {
				int var18 = this.field656.method446(arg0);
				int var19 = this.field657.method446(arg0);
				var15 = var15 * ((this.method184(var11, var19, this.field656.field1319) >> 1) + 32768) >> 15;
				var11 += (var18 * var9 >> 16) + var10;
			}
			for (int var20 = 0; var20 < 5; var20++) {
				if (this.field660[var20] != 0) {
					int var21 = var13 + field673[var20];
					if (var21 < arg0) {
						field669[var21] += this.method184(field672[var20], var15 * field674[var20] >> 15, this.field652.field1319);
						field672[var20] += (var14 * field675[var20] >> 16) + field676[var20];
					}
				}
			}
		}
		if (this.field658 != null) {
			this.field658.method445();
			this.field659.method445();
			int var22 = 0;
			boolean var23 = true;
			for (int var24 = 0; var24 < arg0; var24++) {
				int var25 = this.field658.method446(arg0);
				int var26 = this.field659.method446(arg0);
				int var27;
				if (var23) {
					var27 = this.field658.field1317 + ((this.field658.field1318 - this.field658.field1317) * var25 >> 8);
				} else {
					var27 = this.field658.field1317 + ((this.field658.field1318 - this.field658.field1317) * var26 >> 8);
				}
				var22 += 256;
				if (var22 >= var27) {
					var22 = 0;
					var23 = !var23;
				}
				if (var23) {
					field669[var24] = 0;
				}
			}
		}
		if (this.field663 > 0 && this.field664 > 0) {
			int var28 = (int) ((double) this.field663 * var4);
			for (int var29 = var28; var29 < arg0; var29++) {
				field669[var29] += field669[var29 - var28] * this.field664 / 100;
			}
		}
		if (this.field665.field1419[0] > 0 || this.field665.field1419[1] > 0) {
			this.field666.method445();
			int var30 = this.field666.method446(arg0 + 1);
			int var31 = this.field665.method474((float) var30 / 65536.0F, 0);
			int var32 = this.field665.method474((float) var30 / 65536.0F, 1);
			if (arg0 >= var31 + var32) {
				int var33 = 0;
				int var34 = var32;
				if (var32 > arg0 - var31) {
					var34 = arg0 - var31;
				}
				while (var33 < var34) {
					int var35 = (int) ((long) field669[var33 + var31] * (long) class61.field1426 >> 16);
					for (int var36 = 0; var36 < var31; var36++) {
						var35 += (int) ((long) field669[var33 + var31 - var36 - 1] * (long) class61.field1424[0][var36] >> 16);
					}
					for (int var37 = 0; var37 < var33; var37++) {
						var35 -= (int) ((long) field669[var33 - var37 - 1] * (long) class61.field1424[1][var37] >> 16);
					}
					field669[var33] = var35;
					var30 = this.field666.method446(arg0 + 1);
					var33++;
				}
				int var38 = 128;
				while (true) {
					if (var38 > arg0 - var31) {
						var38 = arg0 - var31;
					}
					while (var33 < var38) {
						int var39 = (int) ((long) field669[var33 + var31] * (long) class61.field1426 >> 16);
						for (int var40 = 0; var40 < var31; var40++) {
							var39 += (int) ((long) field669[var33 + var31 - var40 - 1] * (long) class61.field1424[0][var40] >> 16);
						}
						for (int var41 = 0; var41 < var32; var41++) {
							var39 -= (int) ((long) field669[var33 - var41 - 1] * (long) class61.field1424[1][var41] >> 16);
						}
						field669[var33] = var39;
						var30 = this.field666.method446(arg0 + 1);
						var33++;
					}
					if (var33 >= arg0 - var31) {
						while (var33 < arg0) {
							int var42 = 0;
							for (int var43 = var33 + var31 - arg0; var43 < var31; var43++) {
								var42 += (int) ((long) field669[var33 + var31 - var43 - 1] * (long) class61.field1424[0][var43] >> 16);
							}
							for (int var44 = 0; var44 < var32; var44++) {
								var42 -= (int) ((long) field669[var33 - var44 - 1] * (long) class61.field1424[1][var44] >> 16);
							}
							field669[var33] = var42;
							this.field666.method446(arg0 + 1);
							var33++;
						}
						break;
					}
					var31 = this.field665.method474((float) var30 / 65536.0F, 0);
					var32 = this.field665.method474((float) var30 / 65536.0F, 1);
					var38 += 128;
				}
			}
		}
		for (int var46 = 0; var46 < arg0; var46++) {
			if (field669[var46] < -32768) {
				field669[var46] = -32768;
			}
			if (field669[var46] > 32767) {
				field669[var46] = 32767;
			}
		}
		return field669;
	}

	@ObfuscatedName("CYFJILLF.a(IIII)I")
	public int method184(int arg0, int arg1, int arg2) {
		try {
			if (arg2 == 1) {
				return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
			} else if (arg2 == 2) {
				return field671[arg0 & 0x7FFF] * arg1 >> 14;
			} else if (arg2 == 3) {
				return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
			} else if (arg2 == 4) {
				return field670[arg0 / 2607 & 0x7FFF] * arg1;
			} else {
				return 0;
			}
		} catch (RuntimeException var5) {
			signlink.reporterror("30307, " + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + var5.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("CYFJILLF.a(LEILHLJCE;B)V")
	public void method185(class17 arg0) {
		try {
			this.field652 = new class50();
			this.field652.method443(arg0);
			this.field653 = new class50();
			this.field653.method443(arg0);
			int var2 = arg0.method224();
			if (var2 != 0) {
				arg0.field779--;
				this.field654 = new class50();
				this.field654.method443(arg0);
				this.field655 = new class50();
				this.field655.method443(arg0);
			}
			int var3 = arg0.method224();
			if (var3 != 0) {
				arg0.field779--;
				this.field656 = new class50();
				this.field656.method443(arg0);
				this.field657 = new class50();
				this.field657.method443(arg0);
			}
			int var4 = arg0.method224();
			if (var4 != 0) {
				arg0.field779--;
				this.field658 = new class50();
				this.field658.method443(arg0);
				this.field659 = new class50();
				this.field659.method443(arg0);
			}
			for (int var5 = 0; var5 < 10; var5++) {
				int var6 = arg0.method238();
				if (var6 == 0) {
					break;
				}
				this.field660[var5] = var6;
				this.field661[var5] = arg0.method237();
				this.field662[var5] = arg0.method238();
			}
			this.field663 = arg0.method238();
			this.field664 = arg0.method238();
			this.field667 = arg0.method226();
			this.field668 = arg0.method226();
			this.field665 = new class61();
			this.field666 = new class50();
			this.field665.method475(this.field666, arg0);
		} catch (RuntimeException var8) {
			signlink.reporterror("70950, " + arg0 + ", " + -50 + ", " + var8.toString());
			throw new RuntimeException();
		}
	}
}
