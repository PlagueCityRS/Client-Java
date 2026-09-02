package jagex2.sound;

import deob.ObfuscatedName;
import jagex2.io.Packet;
import sign.signlink;

@ObfuscatedName("CYFJILLF")
public final class Tone {

	@ObfuscatedName("CYFJILLF.b")
	public Envelope frequencyBase;

	@ObfuscatedName("CYFJILLF.c")
	public Envelope amplitudeBase;

	@ObfuscatedName("CYFJILLF.d")
	public Envelope frequencyModRate;

	@ObfuscatedName("CYFJILLF.e")
	public Envelope frequencyModRange;

	@ObfuscatedName("CYFJILLF.f")
	public Envelope amplitudeModRate;

	@ObfuscatedName("CYFJILLF.g")
	public Envelope ampllitudeModRange;

	@ObfuscatedName("CYFJILLF.h")
	public Envelope release;

	@ObfuscatedName("CYFJILLF.i")
	public Envelope attack;

	@ObfuscatedName("CYFJILLF.j")
	public final int[] harmonicVolume = new int[5];

	@ObfuscatedName("CYFJILLF.k")
	public final int[] harmonicSemitone = new int[5];

	@ObfuscatedName("CYFJILLF.l")
	public final int[] harmonicDelay = new int[5];

	@ObfuscatedName("CYFJILLF.m")
	public int reverbDelay;

	@ObfuscatedName("CYFJILLF.n")
	public int reverbVolume = 100;

	@ObfuscatedName("CYFJILLF.o")
	public Filter filter;

	@ObfuscatedName("CYFJILLF.p")
	public Envelope filterRange;

	@ObfuscatedName("CYFJILLF.q")
	public int length = 500;

	@ObfuscatedName("CYFJILLF.r")
	public int start;

	@ObfuscatedName("CYFJILLF.s")
	public static int[] buf;

	@ObfuscatedName("CYFJILLF.t")
	public static int[] noise;

	@ObfuscatedName("CYFJILLF.u")
	public static int[] sine;

	@ObfuscatedName("CYFJILLF.v")
	public static final int[] fPos = new int[5];

	@ObfuscatedName("CYFJILLF.w")
	public static final int[] fDel = new int[5];

	@ObfuscatedName("CYFJILLF.x")
	public static final int[] fAmp = new int[5];

	@ObfuscatedName("CYFJILLF.y")
	public static final int[] fMulti = new int[5];

	@ObfuscatedName("CYFJILLF.z")
	public static final int[] fOffset = new int[5];

	@ObfuscatedName("CYFJILLF.a")
	public final boolean field651 = true;

	@ObfuscatedName("CYFJILLF.a(II)[I")
	public int[] generate(int arg0, int arg1) {
		for (int var3 = 0; var3 < arg0; var3++) {
			buf[var3] = 0;
		}
		if (arg1 < 10) {
			return buf;
		}
		double var4 = (double) arg0 / ((double) arg1 + 0.0D);
		this.frequencyBase.genInit();
		this.amplitudeBase.genInit();
		int var6 = 0;
		int var7 = 0;
		int var8 = 0;
		if (this.frequencyModRate != null) {
			this.frequencyModRate.genInit();
			this.frequencyModRange.genInit();
			var6 = (int) ((double) (this.frequencyModRate.end - this.frequencyModRate.start) * 32.768D / var4);
			var7 = (int) ((double) this.frequencyModRate.start * 32.768D / var4);
		}
		int var9 = 0;
		int var10 = 0;
		int var11 = 0;
		if (this.amplitudeModRate != null) {
			this.amplitudeModRate.genInit();
			this.ampllitudeModRange.genInit();
			var9 = (int) ((double) (this.amplitudeModRate.end - this.amplitudeModRate.start) * 32.768D / var4);
			var10 = (int) ((double) this.amplitudeModRate.start * 32.768D / var4);
		}
		for (int var12 = 0; var12 < 5; var12++) {
			if (this.harmonicVolume[var12] != 0) {
				fPos[var12] = 0;
				fDel[var12] = (int) ((double) this.harmonicDelay[var12] * var4);
				fAmp[var12] = (this.harmonicVolume[var12] << 14) / 100;
				fMulti[var12] = (int) ((double) (this.frequencyBase.end - this.frequencyBase.start) * 32.768D * Math.pow(1.0057929410678534D, (double) this.harmonicSemitone[var12]) / var4);
				fOffset[var12] = (int) ((double) this.frequencyBase.start * 32.768D / var4);
			}
		}
		for (int var13 = 0; var13 < arg0; var13++) {
			int var14 = this.frequencyBase.genNext(arg0);
			int var15 = this.amplitudeBase.genNext(arg0);
			if (this.frequencyModRate != null) {
				int var16 = this.frequencyModRate.genNext(arg0);
				int var17 = this.frequencyModRange.genNext(arg0);
				var14 += this.waveFunc(var8, var17, this.frequencyModRate.form) >> 1;
				var8 += (var16 * var6 >> 16) + var7;
			}
			if (this.amplitudeModRate != null) {
				int var18 = this.amplitudeModRate.genNext(arg0);
				int var19 = this.ampllitudeModRange.genNext(arg0);
				var15 = var15 * ((this.waveFunc(var11, var19, this.amplitudeModRate.form) >> 1) + 32768) >> 15;
				var11 += (var18 * var9 >> 16) + var10;
			}
			for (int var20 = 0; var20 < 5; var20++) {
				if (this.harmonicVolume[var20] != 0) {
					int var21 = var13 + fDel[var20];
					if (var21 < arg0) {
						buf[var21] += this.waveFunc(fPos[var20], var15 * fAmp[var20] >> 15, this.frequencyBase.form);
						fPos[var20] += (var14 * fMulti[var20] >> 16) + fOffset[var20];
					}
				}
			}
		}
		if (this.release != null) {
			this.release.genInit();
			this.attack.genInit();
			int var22 = 0;
			boolean var23 = true;
			for (int var24 = 0; var24 < arg0; var24++) {
				int var25 = this.release.genNext(arg0);
				int var26 = this.attack.genNext(arg0);
				int var27;
				if (var23) {
					var27 = this.release.start + ((this.release.end - this.release.start) * var25 >> 8);
				} else {
					var27 = this.release.start + ((this.release.end - this.release.start) * var26 >> 8);
				}
				var22 += 256;
				if (var22 >= var27) {
					var22 = 0;
					var23 = !var23;
				}
				if (var23) {
					buf[var24] = 0;
				}
			}
		}
		if (this.reverbDelay > 0 && this.reverbVolume > 0) {
			int var28 = (int) ((double) this.reverbDelay * var4);
			for (int var29 = var28; var29 < arg0; var29++) {
				buf[var29] += buf[var29 - var28] * this.reverbVolume / 100;
			}
		}
		if (this.filter.pairs[0] > 0 || this.filter.pairs[1] > 0) {
			this.filterRange.genInit();
			int var30 = this.filterRange.genNext(arg0 + 1);
			int var31 = this.filter.calculateCoeffs((float) var30 / 65536.0F, 0);
			int var32 = this.filter.calculateCoeffs((float) var30 / 65536.0F, 1);
			if (arg0 >= var31 + var32) {
				int var33 = 0;
				int var34 = var32;
				if (var32 > arg0 - var31) {
					var34 = arg0 - var31;
				}
				while (var33 < var34) {
					int var35 = (int) ((long) buf[var33 + var31] * (long) Filter.reduceCoeffInt >> 16);
					for (int var36 = 0; var36 < var31; var36++) {
						var35 += (int) ((long) buf[var33 + var31 - var36 - 1] * (long) Filter.coeffInt[0][var36] >> 16);
					}
					for (int var37 = 0; var37 < var33; var37++) {
						var35 -= (int) ((long) buf[var33 - var37 - 1] * (long) Filter.coeffInt[1][var37] >> 16);
					}
					buf[var33] = var35;
					var30 = this.filterRange.genNext(arg0 + 1);
					var33++;
				}
				int var38 = 128;
				while (true) {
					if (var38 > arg0 - var31) {
						var38 = arg0 - var31;
					}
					while (var33 < var38) {
						int var39 = (int) ((long) buf[var33 + var31] * (long) Filter.reduceCoeffInt >> 16);
						for (int var40 = 0; var40 < var31; var40++) {
							var39 += (int) ((long) buf[var33 + var31 - var40 - 1] * (long) Filter.coeffInt[0][var40] >> 16);
						}
						for (int var41 = 0; var41 < var32; var41++) {
							var39 -= (int) ((long) buf[var33 - var41 - 1] * (long) Filter.coeffInt[1][var41] >> 16);
						}
						buf[var33] = var39;
						var30 = this.filterRange.genNext(arg0 + 1);
						var33++;
					}
					if (var33 >= arg0 - var31) {
						while (var33 < arg0) {
							int var42 = 0;
							for (int var43 = var33 + var31 - arg0; var43 < var31; var43++) {
								var42 += (int) ((long) buf[var33 + var31 - var43 - 1] * (long) Filter.coeffInt[0][var43] >> 16);
							}
							for (int var44 = 0; var44 < var32; var44++) {
								var42 -= (int) ((long) buf[var33 - var44 - 1] * (long) Filter.coeffInt[1][var44] >> 16);
							}
							buf[var33] = var42;
							this.filterRange.genNext(arg0 + 1);
							var33++;
						}
						break;
					}
					var31 = this.filter.calculateCoeffs((float) var30 / 65536.0F, 0);
					var32 = this.filter.calculateCoeffs((float) var30 / 65536.0F, 1);
					var38 += 128;
				}
			}
		}
		for (int var46 = 0; var46 < arg0; var46++) {
			if (buf[var46] < -32768) {
				buf[var46] = -32768;
			}
			if (buf[var46] > 32767) {
				buf[var46] = 32767;
			}
		}
		return buf;
	}

	@ObfuscatedName("CYFJILLF.a(IIII)I")
	public int waveFunc(int arg0, int arg1, int arg2) {
		try {
			if (arg2 == 1) {
				return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
			} else if (arg2 == 2) {
				return sine[arg0 & 0x7FFF] * arg1 >> 14;
			} else if (arg2 == 3) {
				return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
			} else if (arg2 == 4) {
				return noise[arg0 / 2607 & 0x7FFF] * arg1;
			} else {
				return 0;
			}
		} catch (RuntimeException var5) {
			signlink.reporterror("30307, " + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + var5.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("CYFJILLF.a(LEILHLJCE;B)V")
	public void load(Packet arg0) {
		try {
			this.frequencyBase = new Envelope();
			this.frequencyBase.load(arg0);
			this.amplitudeBase = new Envelope();
			this.amplitudeBase.load(arg0);
			int var2 = arg0.g1();
			if (var2 != 0) {
				arg0.pos--;
				this.frequencyModRate = new Envelope();
				this.frequencyModRate.load(arg0);
				this.frequencyModRange = new Envelope();
				this.frequencyModRange.load(arg0);
			}
			int var3 = arg0.g1();
			if (var3 != 0) {
				arg0.pos--;
				this.amplitudeModRate = new Envelope();
				this.amplitudeModRate.load(arg0);
				this.ampllitudeModRange = new Envelope();
				this.ampllitudeModRange.load(arg0);
			}
			int var4 = arg0.g1();
			if (var4 != 0) {
				arg0.pos--;
				this.release = new Envelope();
				this.release.load(arg0);
				this.attack = new Envelope();
				this.attack.load(arg0);
			}
			for (int var5 = 0; var5 < 10; var5++) {
				int var6 = arg0.gsmart();
				if (var6 == 0) {
					break;
				}
				this.harmonicVolume[var5] = var6;
				this.harmonicSemitone[var5] = arg0.gsmarts();
				this.harmonicDelay[var5] = arg0.gsmart();
			}
			this.reverbDelay = arg0.gsmart();
			this.reverbVolume = arg0.gsmart();
			this.length = arg0.g2();
			this.start = arg0.g2();
			this.filter = new Filter();
			this.filterRange = new Envelope();
			this.filter.load(this.filterRange, arg0);
		} catch (RuntimeException var8) {
			signlink.reporterror("70950, " + arg0 + ", " + -50 + ", " + var8.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("CYFJILLF.a()V")
	public static void init() {
		noise = new int[32768];
		for (int var0 = 0; var0 < 32768; var0++) {
			if (Math.random() > 0.5D) {
				noise[var0] = 1;
			} else {
				noise[var0] = -1;
			}
		}
		sine = new int[32768];
		for (int var1 = 0; var1 < 32768; var1++) {
			sine[var1] = (int) (Math.sin((double) var1 / 5215.1903D) * 16384.0D);
		}
		buf = new int[220500];
	}
}
