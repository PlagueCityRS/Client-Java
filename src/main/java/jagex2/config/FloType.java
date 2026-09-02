package jagex2.config;

import jagex2.io.JagFile;
import deob.ObfuscatedName;
import jagex2.io.Packet;
import sign.signlink;

@ObfuscatedName("SYTONBKT")
public final class FloType {

	@ObfuscatedName("SYTONBKT.d")
	public int colour;

	@ObfuscatedName("SYTONBKT.e")
	public int texture = -1;

	@ObfuscatedName("SYTONBKT.g")
	public boolean occlude = true;

	@ObfuscatedName("SYTONBKT.h")
	public int hue;

	@ObfuscatedName("SYTONBKT.i")
	public int saturation;

	@ObfuscatedName("SYTONBKT.j")
	public int lightness;

	@ObfuscatedName("SYTONBKT.b")
	public static FloType[] list;

	@ObfuscatedName("SYTONBKT.a")
	public static int numDefinitions;

	@ObfuscatedName("SYTONBKT.c")
	public String debugname;

	@ObfuscatedName("SYTONBKT.f")
	public boolean overlay = false;

	@ObfuscatedName("SYTONBKT.k")
	public int underlayHue;

	@ObfuscatedName("SYTONBKT.l")
	public int chroma;

	@ObfuscatedName("SYTONBKT.m")
	public int underlayHsl;

	@ObfuscatedName("SYTONBKT.a(LEILHLJCE;B)V")
	public void decode(Packet arg0) {
		try {
			while (true) {
				int var2 = arg0.g1();
				if (var2 == 0) {
					return;
				}
				if (var2 == 1) {
					this.colour = arg0.g3();
					this.getHsl(this.colour);
				} else if (var2 == 2) {
					this.texture = arg0.g1();
				} else if (var2 == 3) {
					this.overlay = true;
				} else if (var2 == 5) {
					this.occlude = false;
				} else if (var2 == 6) {
					this.debugname = arg0.gstr();
				} else if (var2 == 7) {
					int var3 = this.hue;
					int var4 = this.saturation;
					int var5 = this.lightness;
					int var6 = this.underlayHue;
					int var7 = arg0.g3();
					this.getHsl(var7);
					this.hue = var3;
					this.saturation = var4;
					this.lightness = var5;
					this.underlayHue = var6;
					this.chroma = var6;
				} else {
					System.out.println("Error unrecognised config code: " + var2);
				}
			}
		} catch (RuntimeException var9) {
			signlink.reporterror("19440, " + arg0 + ", " + -50 + ", " + var9.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("SYTONBKT.a(II)V")
	public void getHsl(int arg0) {
		try {
			double var2 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
			double var4 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
			double var6 = (double) (arg0 & 0xFF) / 256.0D;
			double var8 = var2;
			if (var4 < var2) {
				var8 = var4;
			}
			if (var6 < var8) {
				var8 = var6;
			}
			double var10 = var2;
			if (var4 > var2) {
				var10 = var4;
			}
			if (var6 > var10) {
				var10 = var6;
			}
			double var12 = 0.0D;
			double var14 = 0.0D;
			double var16 = (var8 + var10) / 2.0D;
			if (var8 != var10) {
				if (var16 < 0.5D) {
					var14 = (var10 - var8) / (var10 + var8);
				}
				if (var16 >= 0.5D) {
					var14 = (var10 - var8) / (2.0D - var10 - var8);
				}
				if (var2 == var10) {
					var12 = (var4 - var6) / (var10 - var8);
				} else if (var4 == var10) {
					var12 = (var6 - var2) / (var10 - var8) + 2.0D;
				} else if (var6 == var10) {
					var12 = (var2 - var4) / (var10 - var8) + 4.0D;
				}
			}
			double var18 = var12 / 6.0D;
			this.hue = (int) (var18 * 256.0D);
			this.saturation = (int) (var14 * 256.0D);
			this.lightness = (int) (var16 * 256.0D);
			if (this.saturation < 0) {
				this.saturation = 0;
			} else if (this.saturation > 255) {
				this.saturation = 255;
			}
			if (this.lightness < 0) {
				this.lightness = 0;
			} else if (this.lightness > 255) {
				this.lightness = 255;
			}
			if (var16 > 0.5D) {
				this.chroma = (int) ((1.0D - var16) * var14 * 512.0D);
			} else {
				this.chroma = (int) (var16 * var14 * 512.0D);
			}
			if (this.chroma < 1) {
				this.chroma = 1;
			}
			this.underlayHue = (int) (var18 * (double) this.chroma);
			int var20 = this.hue + (int) (Math.random() * 16.0D) - 8;
			if (var20 < 0) {
				var20 = 0;
			} else if (var20 > 255) {
				var20 = 255;
			}
			int var21 = this.saturation + (int) (Math.random() * 48.0D) - 24;
			if (var21 < 0) {
				var21 = 0;
			} else if (var21 > 255) {
				var21 = 255;
			}
			int var22 = this.lightness + (int) (Math.random() * 48.0D) - 24;
			if (var22 < 0) {
				var22 = 0;
			} else if (var22 > 255) {
				var22 = 255;
			}
			this.underlayHsl = this.getTable(var20, var21, var22);
		} catch (RuntimeException var24) {
			signlink.reporterror("67100, " + 7 + ", " + arg0 + ", " + var24.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("SYTONBKT.a(ILBBMKAXRK;)V")
	public static void init(JagFile arg0) {
		try {
			Packet var1 = new Packet(arg0.read("flo.dat", null), -26583);
			numDefinitions = var1.g2();
			if (list == null) {
				list = new FloType[numDefinitions];
			}
			for (int var2 = 0; var2 < numDefinitions; var2++) {
				if (list[var2] == null) {
					list[var2] = new FloType();
				}
				list[var2].decode(var1);
			}
		} catch (RuntimeException var4) {
			signlink.reporterror("84471, " + -768 + ", " + arg0 + ", " + var4.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("SYTONBKT.a(III)I")
	public int getTable(int arg0, int arg1, int arg2) {
		if (arg2 > 179) {
			arg1 /= 2;
		}
		if (arg2 > 192) {
			arg1 /= 2;
		}
		if (arg2 > 217) {
			arg1 /= 2;
		}
		if (arg2 > 243) {
			arg1 /= 2;
		}
		return (arg0 / 4 << 10) + (arg1 / 32 << 7) + arg2 / 2;
	}
}
