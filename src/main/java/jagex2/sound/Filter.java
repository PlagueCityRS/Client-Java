package jagex2.sound;

import deob.ObfuscatedName;
import jagex2.io.Packet;
import sign.signlink;

@ObfuscatedName("UVAKRMXV")
public final class Filter {

	@ObfuscatedName("UVAKRMXV.b")
	public final int[] pairs = new int[2];

	@ObfuscatedName("UVAKRMXV.c")
	public final int[][][] frequences = new int[2][2][4];

	@ObfuscatedName("UVAKRMXV.d")
	public final int[][][] ranges = new int[2][2][4];

	@ObfuscatedName("UVAKRMXV.e")
	public final int[] unities = new int[2];

	@ObfuscatedName("UVAKRMXV.f")
	public static final float[][] coeff = new float[2][8];

	@ObfuscatedName("UVAKRMXV.g")
	public static final int[][] coeffInt = new int[2][8];

	@ObfuscatedName("UVAKRMXV.h")
	public static float reduceCoeff;

	@ObfuscatedName("UVAKRMXV.i")
	public static int reduceCoeffInt;

	@ObfuscatedName("UVAKRMXV.a")
	public final boolean field1418 = true;

	@ObfuscatedName("UVAKRMXV.a(FIII)F")
	public float radius(float arg0, int arg1, int arg2, int arg3) {
		try {
			float var5 = (float) this.ranges[arg2][0][arg3] + arg0 * (float) (this.ranges[arg2][1][arg3] - this.ranges[arg2][0][arg3]);
			boolean var9 = false;
			float var6 = var5 * 0.0015258789F;
			return 1.0F - (float) Math.pow(10.0D, (double) (-var6 / 20.0F));
		} catch (RuntimeException var8) {
			signlink.reporterror("99110, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + var8.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("UVAKRMXV.a(FI)F")
	public float frequency(float arg0) {
		try {
			float var2 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
			return var2 * 3.1415927F / 11025.0F;
		} catch (RuntimeException var4) {
			signlink.reporterror("42859, " + arg0 + ", " + ", " + var4.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("UVAKRMXV.a(IFII)F")
	public float frequency(int arg0, float arg1, int arg2) {
		try {
			float var4 = (float) this.frequences[arg0][0][arg2] + arg1 * (float) (this.frequences[arg0][1][arg2] - this.frequences[arg0][0][arg2]);
			float var5 = var4 * 1.2207031E-4F;
			return this.frequency(var5);
		} catch (RuntimeException var7) {
			signlink.reporterror("23596, " + arg0 + ", " + arg1 + ", " + ", " + arg2 + ", " + var7.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("UVAKRMXV.a(ZFI)I")
	public int calculateCoeffs(float arg0, int arg1) {
		try {
			if (arg1 == 0) {
				float var3 = (float) this.unities[0] + (float) (this.unities[1] - this.unities[0]) * arg0;
				float var4 = var3 * 0.0030517578F;
				reduceCoeff = (float) Math.pow(0.1D, (double) (var4 / 20.0F));
				reduceCoeffInt = (int) (reduceCoeff * 65536.0F);
			}
			if (this.pairs[arg1] == 0) {
				return 0;
			}
			float var5 = this.radius(arg0, 785, arg1, 0);
			coeff[arg1][0] = -2.0F * var5 * (float) Math.cos((double) this.frequency(arg1, arg0, 0));
			coeff[arg1][1] = var5 * var5;
			for (int var6 = 1; var6 < this.pairs[arg1]; var6++) {
				float var7 = this.radius(arg0, 785, arg1, var6);
				float var8 = -2.0F * var7 * (float) Math.cos((double) this.frequency(arg1, arg0, var6));
				float var9 = var7 * var7;
				coeff[arg1][var6 * 2 + 1] = coeff[arg1][var6 * 2 - 1] * var9;
				coeff[arg1][var6 * 2] = coeff[arg1][var6 * 2 - 1] * var8 + coeff[arg1][var6 * 2 - 2] * var9;
				for (int var10 = var6 * 2 - 1; var10 >= 2; var10--) {
					coeff[arg1][var10] += coeff[arg1][var10 - 1] * var8 + coeff[arg1][var10 - 2] * var9;
				}
				coeff[arg1][1] += coeff[arg1][0] * var8 + var9;
				coeff[arg1][0] += var8;
			}
			if (arg1 == 0) {
				for (int var11 = 0; var11 < this.pairs[0] * 2; var11++) {
					coeff[0][var11] *= reduceCoeff;
				}
			}
			for (int var12 = 0; var12 < this.pairs[arg1] * 2; var12++) {
				coeffInt[arg1][var12] = (int) (coeff[arg1][var12] * 65536.0F);
			}
			return this.pairs[arg1] * 2;
		} catch (RuntimeException var14) {
			signlink.reporterror("1740, " + false + ", " + arg0 + ", " + arg1 + ", " + var14.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("UVAKRMXV.a(LRRWCTNMK;LEILHLJCE;I)V")
	public void load(Envelope arg0, Packet arg1) {
		try {
			int var3 = arg1.g1();
			this.pairs[0] = var3 >> 4;
			this.pairs[1] = var3 & 0xF;
			if (var3 == 0) {
				this.unities[0] = this.unities[1] = 0;
			} else {
				this.unities[0] = arg1.g2();
				this.unities[1] = arg1.g2();
				int var4 = arg1.g1();
				for (int var5 = 0; var5 < 2; var5++) {
					for (int var6 = 0; var6 < this.pairs[var5]; var6++) {
						this.frequences[var5][0][var6] = arg1.g2();
						this.ranges[var5][0][var6] = arg1.g2();
					}
				}
				for (int var7 = 0; var7 < 2; var7++) {
					for (int var8 = 0; var8 < this.pairs[var7]; var8++) {
						if ((var4 & 0x1 << var7 * 4 << var8) == 0) {
							this.frequences[var7][1][var8] = this.frequences[var7][0][var8];
							this.ranges[var7][1][var8] = this.ranges[var7][0][var8];
						} else {
							this.frequences[var7][1][var8] = arg1.g2();
							this.ranges[var7][1][var8] = arg1.g2();
						}
					}
				}
				if (var4 != 0 || this.unities[1] != this.unities[0]) {
					arg0.loadPoints(arg1);
				}
			}
		} catch (RuntimeException var10) {
			signlink.reporterror("31340, " + arg0 + ", " + arg1 + ", " + ", " + var10.toString());
			throw new RuntimeException();
		}
	}
}
