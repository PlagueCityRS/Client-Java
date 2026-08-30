package deob;

import sign.signlink;

@ObfuscatedName("UVAKRMXV")
public final class class61 {

	@ObfuscatedName("UVAKRMXV.f")
	public static final float[][] field1423 = new float[2][8];

	@ObfuscatedName("UVAKRMXV.g")
	public static final int[][] field1424 = new int[2][8];

	@ObfuscatedName("UVAKRMXV.a")
	public final boolean field1418 = true;

	@ObfuscatedName("UVAKRMXV.b")
	public final int[] field1419 = new int[2];

	@ObfuscatedName("UVAKRMXV.c")
	public final int[][][] field1420 = new int[2][2][4];

	@ObfuscatedName("UVAKRMXV.d")
	public final int[][][] field1421 = new int[2][2][4];

	@ObfuscatedName("UVAKRMXV.e")
	public final int[] field1422 = new int[2];

	@ObfuscatedName("UVAKRMXV.h")
	public static float field1425;

	@ObfuscatedName("UVAKRMXV.i")
	public static int field1426;

	@ObfuscatedName("UVAKRMXV.a(FIII)F")
	public float method471(float arg0, int arg1, int arg2, int arg3) {
		try {
			float var5 = (float) this.field1421[arg2][0][arg3] + arg0 * (float) (this.field1421[arg2][1][arg3] - this.field1421[arg2][0][arg3]);
			boolean var9 = false;
			float var6 = var5 * 0.0015258789F;
			return 1.0F - (float) Math.pow(10.0D, (double) (-var6 / 20.0F));
		} catch (RuntimeException var8) {
			signlink.reporterror("99110, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + var8.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("UVAKRMXV.a(FI)F")
	public float method472(float arg0) {
		try {
			float var2 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
			return var2 * 3.1415927F / 11025.0F;
		} catch (RuntimeException var4) {
			signlink.reporterror("42859, " + arg0 + ", " + ", " + var4.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("UVAKRMXV.a(IFII)F")
	public float method473(int arg0, float arg1, int arg2) {
		try {
			float var4 = (float) this.field1420[arg0][0][arg2] + arg1 * (float) (this.field1420[arg0][1][arg2] - this.field1420[arg0][0][arg2]);
			float var5 = var4 * 1.2207031E-4F;
			return this.method472(var5);
		} catch (RuntimeException var7) {
			signlink.reporterror("23596, " + arg0 + ", " + arg1 + ", " + ", " + arg2 + ", " + var7.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("UVAKRMXV.a(ZFI)I")
	public int method474(float arg0, int arg1) {
		try {
			if (arg1 == 0) {
				float var3 = (float) this.field1422[0] + (float) (this.field1422[1] - this.field1422[0]) * arg0;
				float var4 = var3 * 0.0030517578F;
				field1425 = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
				field1426 = (int) (field1425 * 65536.0F);
			}
			if (this.field1419[arg1] == 0) {
				return 0;
			}
			float var5 = this.method471(arg0, 785, arg1, 0);
			field1423[arg1][0] = -2.0F * var5 * (float) Math.cos((double) this.method473(arg1, arg0, 0));
			field1423[arg1][1] = var5 * var5;
			for (int var6 = 1; var6 < this.field1419[arg1]; var6++) {
				float var7 = this.method471(arg0, 785, arg1, var6);
				float var8 = -2.0F * var7 * (float) Math.cos((double) this.method473(arg1, arg0, var6));
				float var9 = var7 * var7;
				field1423[arg1][var6 * 2 + 1] = field1423[arg1][var6 * 2 - 1] * var9;
				field1423[arg1][var6 * 2] = field1423[arg1][var6 * 2 - 1] * var8 + field1423[arg1][var6 * 2 - 2] * var9;
				for (int var10 = var6 * 2 - 1; var10 >= 2; var10--) {
					field1423[arg1][var10] += field1423[arg1][var10 - 1] * var8 + field1423[arg1][var10 - 2] * var9;
				}
				field1423[arg1][1] += field1423[arg1][0] * var8 + var9;
				field1423[arg1][0] += var8;
			}
			if (arg1 == 0) {
				for (int var11 = 0; var11 < this.field1419[0] * 2; var11++) {
					field1423[0][var11] *= field1425;
				}
			}
			for (int var12 = 0; var12 < this.field1419[arg1] * 2; var12++) {
				field1424[arg1][var12] = (int) (field1423[arg1][var12] * 65536.0F);
			}
			return this.field1419[arg1] * 2;
		} catch (RuntimeException var14) {
			signlink.reporterror("1740, " + false + ", " + arg0 + ", " + arg1 + ", " + var14.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("UVAKRMXV.a(LRRWCTNMK;LEILHLJCE;I)V")
	public void method475(class50 arg0, class17 arg1) {
		try {
			int var3 = arg1.method224();
			this.field1419[0] = var3 >> 4;
			this.field1419[1] = var3 & 0xF;
			if (var3 == 0) {
				this.field1422[0] = this.field1422[1] = 0;
			} else {
				this.field1422[0] = arg1.method226();
				this.field1422[1] = arg1.method226();
				int var4 = arg1.method224();
				for (int var5 = 0; var5 < 2; var5++) {
					for (int var6 = 0; var6 < this.field1419[var5]; var6++) {
						this.field1420[var5][0][var6] = arg1.method226();
						this.field1421[var5][0][var6] = arg1.method226();
					}
				}
				for (int var7 = 0; var7 < 2; var7++) {
					for (int var8 = 0; var8 < this.field1419[var7]; var8++) {
						if ((var4 & 0x1 << var7 * 4 << var8) == 0) {
							this.field1420[var7][1][var8] = this.field1420[var7][0][var8];
							this.field1421[var7][1][var8] = this.field1421[var7][0][var8];
						} else {
							this.field1420[var7][1][var8] = arg1.method226();
							this.field1421[var7][1][var8] = arg1.method226();
						}
					}
				}
				if (var4 != 0 || this.field1422[1] != this.field1422[0]) {
					arg0.method444(arg1);
				}
			}
		} catch (RuntimeException var10) {
			signlink.reporterror("31340, " + arg0 + ", " + arg1 + ", " + ", " + var10.toString());
			throw new RuntimeException();
		}
	}
}
