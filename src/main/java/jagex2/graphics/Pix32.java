package jagex2.graphics;

import java.awt.Component;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;

import jagex2.io.JagFile;
import deob.ObfuscatedName;
import jagex2.io.Packet;
import sign.signlink;

@ObfuscatedName("ODBDSPMH")
public final class Pix32 extends Pix2D {

	@ObfuscatedName("ODBDSPMH.C")
	public int[] data;

	@ObfuscatedName("ODBDSPMH.D")
	public int wi;

	@ObfuscatedName("ODBDSPMH.E")
	public int hi;

	@ObfuscatedName("ODBDSPMH.F")
	public int xof;

	@ObfuscatedName("ODBDSPMH.G")
	public int yof;

	@ObfuscatedName("ODBDSPMH.H")
	public int owi;

	@ObfuscatedName("ODBDSPMH.I")
	public int ohi;

	@ObfuscatedName("ODBDSPMH.x")
	public final boolean field1170 = true;

	@ObfuscatedName("ODBDSPMH.y")
	public final int field1171 = 6821;

	@ObfuscatedName("ODBDSPMH.z")
	public final boolean field1172 = true;

	@ObfuscatedName("ODBDSPMH.A")
	public final boolean field1173 = true;

	@ObfuscatedName("ODBDSPMH.B")
	public final boolean field1174 = false;

	public Pix32(int arg0, int arg1) {
		this.data = new int[arg0 * arg1];
		this.wi = this.owi = arg0;
		this.hi = this.ohi = arg1;
		this.xof = this.yof = 0;
	}

	public Pix32(byte[] arg0, Component arg1) {
		try {
			Image var3 = Toolkit.getDefaultToolkit().createImage(arg0);
			MediaTracker var4 = new MediaTracker(arg1);
			var4.addImage(var3, 0);
			var4.waitForAll();
			this.wi = var3.getWidth(arg1);
			this.hi = var3.getHeight(arg1);
			this.owi = this.wi;
			this.ohi = this.hi;
			this.xof = 0;
			this.yof = 0;
			this.data = new int[this.wi * this.hi];
			PixelGrabber var5 = new PixelGrabber(var3, 0, 0, this.wi, this.hi, this.data, 0, this.wi);
			var5.grabPixels();
		} catch (Exception var6) {
			System.out.println("Error converting jpg");
		}
	}

	public Pix32(JagFile arg0, String arg1, int arg2) {
		Packet var4 = new Packet(arg0.read(arg1 + ".dat", null), -26583);
		Packet var5 = new Packet(arg0.read("index.dat", null), -26583);
		var5.pos = var4.g2();
		this.owi = var5.g2();
		this.ohi = var5.g2();
		int var6 = var5.g1();
		int[] var7 = new int[var6];
		for (int var8 = 0; var8 < var6 - 1; var8++) {
			var7[var8 + 1] = var5.g3();
			if (var7[var8 + 1] == 0) {
				var7[var8 + 1] = 1;
			}
		}
		for (int var9 = 0; var9 < arg2; var9++) {
			var5.pos += 2;
			var4.pos += var5.g2() * var5.g2();
			var5.pos++;
		}
		this.xof = var5.g1();
		this.yof = var5.g1();
		this.wi = var5.g2();
		this.hi = var5.g2();
		int var10 = var5.g1();
		int var11 = this.wi * this.hi;
		this.data = new int[var11];
		if (var10 == 0) {
			for (int var12 = 0; var12 < var11; var12++) {
				this.data[var12] = var7[var4.g1()];
			}
		} else if (var10 == 1) {
			for (int var13 = 0; var13 < this.wi; var13++) {
				for (int var14 = 0; var14 < this.hi; var14++) {
					this.data[var13 + var14 * this.wi] = var7[var4.g1()];
				}
			}
		}
	}

	@ObfuscatedName("ODBDSPMH.b(B)V")
	public void setPixels() {
		try {
			Pix2D.setPixels(this.hi, this.data, this.field1171, this.wi);
		} catch (RuntimeException var2) {
			signlink.reporterror("94710, " + 58 + ", " + var2.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("ODBDSPMH.a(IIII)V")
	public void rgbAdjust(int arg0, int arg1, int arg2) {
		try {
			for (int var4 = 0; var4 < this.data.length; var4++) {
				int var5 = this.data[var4];
				if (var5 != 0) {
					int var6 = var5 >> 16 & 0xFF;
					int var7 = var6 + arg1;
					if (var7 < 1) {
						var7 = 1;
					} else if (var7 > 255) {
						var7 = 255;
					}
					int var8 = var5 >> 8 & 0xFF;
					int var9 = var8 + arg2;
					if (var9 < 1) {
						var9 = 1;
					} else if (var9 > 255) {
						var9 = 255;
					}
					int var10 = var5 & 0xFF;
					int var11 = var10 + arg0;
					if (var11 < 1) {
						var11 = 1;
					} else if (var11 > 255) {
						var11 = 255;
					}
					this.data[var4] = (var7 << 16) + (var9 << 8) + var11;
				}
			}
		} catch (RuntimeException var13) {
			signlink.reporterror("84134, " + arg0 + ", " + arg1 + ", " + -35373 + ", " + arg2 + ", " + var13.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("ODBDSPMH.b(I)V")
	public void trim() {
		try {
			int[] var1 = new int[this.owi * this.ohi];
			for (int var2 = 0; var2 < this.hi; var2++) {
				for (int var3 = 0; var3 < this.wi; var3++) {
					var1[(var2 + this.yof) * this.owi + var3 + this.xof] = this.data[var2 * this.wi + var3];
				}
			}
			this.data = var1;
			this.wi = this.owi;
			this.hi = this.ohi;
			this.xof = 0;
			this.yof = 0;
		} catch (RuntimeException var5) {
			signlink.reporterror("98644, " + -200 + ", " + var5.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("ODBDSPMH.a(III)V")
	public void quickPlotSprite(int arg0, int arg1) {
		try {
			arg1 += this.xof;
			arg0 += this.yof;
			int var3 = arg1 + arg0 * Pix2D.width;
			int var4 = 0;
			int var5 = this.hi;
			int var6 = this.wi;
			int var7 = Pix2D.width - var6;
			int var8 = 0;
			if (arg0 < Pix2D.clipMinY) {
				int var9 = Pix2D.clipMinY - arg0;
				var5 -= var9;
				arg0 = Pix2D.clipMinY;
				var4 = var9 * var6;
				var3 += var9 * Pix2D.width;
			}
			if (arg0 + var5 > Pix2D.clipMaxY) {
				var5 -= arg0 + var5 - Pix2D.clipMaxY;
			}
			if (arg1 < Pix2D.clipMinX) {
				int var10 = Pix2D.clipMinX - arg1;
				var6 -= var10;
				arg1 = Pix2D.clipMinX;
				var4 += var10;
				var3 += var10;
				var8 = var10;
				var7 += var10;
			}
			if (arg1 + var6 > Pix2D.clipMaxX) {
				int var11 = arg1 + var6 - Pix2D.clipMaxX;
				var6 -= var11;
				var8 += var11;
				var7 += var11;
			}
			if (var6 > 0 && var5 > 0) {
				this.plotQuick(this.data, var5, this.field1170, Pix2D.pixels, var3, var7, var4, var8, var6);
			}
		} catch (RuntimeException var13) {
			signlink.reporterror("14084, " + arg0 + ", " + arg1 + ", " + 261 + ", " + var13.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("ODBDSPMH.a([IIZ[IIIIII)V")
	public void plotQuick(int[] arg0, int arg1, boolean arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		try {
			if (arg2) {
				int var10 = -(arg8 >> 2);
				int var16 = -(arg8 & 0x3);
				for (int var11 = -arg1; var11 < 0; var11++) {
					for (int var12 = var10; var12 < 0; var12++) {
						arg3[arg4++] = arg0[arg6++];
						arg3[arg4++] = arg0[arg6++];
						arg3[arg4++] = arg0[arg6++];
						arg3[arg4++] = arg0[arg6++];
					}
					for (int var13 = var16; var13 < 0; var13++) {
						arg3[arg4++] = arg0[arg6++];
					}
					arg4 += arg5;
					arg6 += arg7;
				}
			}
		} catch (RuntimeException var15) {
			signlink.reporterror("54221, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + var15.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("ODBDSPMH.b(III)V")
	public void plotSprite(int arg0, int arg1, int arg2) {
		try {
			arg0 += this.xof;
			arg2 += this.yof;
			int var15 = 13 / arg1;
			int var4 = arg0 + arg2 * Pix2D.width;
			int var5 = 0;
			int var6 = this.hi;
			int var7 = this.wi;
			int var8 = Pix2D.width - var7;
			int var9 = 0;
			if (arg2 < Pix2D.clipMinY) {
				int var10 = Pix2D.clipMinY - arg2;
				var6 -= var10;
				arg2 = Pix2D.clipMinY;
				var5 = var10 * var7;
				var4 += var10 * Pix2D.width;
			}
			if (arg2 + var6 > Pix2D.clipMaxY) {
				var6 -= arg2 + var6 - Pix2D.clipMaxY;
			}
			if (arg0 < Pix2D.clipMinX) {
				int var11 = Pix2D.clipMinX - arg0;
				var7 -= var11;
				arg0 = Pix2D.clipMinX;
				var5 += var11;
				var4 += var11;
				var9 = var11;
				var8 += var11;
			}
			if (arg0 + var7 > Pix2D.clipMaxX) {
				int var12 = arg0 + var7 - Pix2D.clipMaxX;
				var7 -= var12;
				var9 += var12;
				var8 += var12;
			}
			if (var7 > 0 && var6 > 0) {
				this.plot(Pix2D.pixels, this.data, var5, var4, var7, var6, var8, var9);
			}
		} catch (RuntimeException var14) {
			signlink.reporterror("99882, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + var14.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("ODBDSPMH.b(IIII)V")
	public void transPlotSprite(int arg0, int arg1, int arg2) {
		try {
			arg0 += this.xof;
			arg1 += this.yof;
			if (arg2 >= 3 && arg2 <= 3) {
				int var4 = arg0 + arg1 * Pix2D.width;
				int var5 = 0;
				int var6 = this.hi;
				int var7 = this.wi;
				int var8 = Pix2D.width - var7;
				int var9 = 0;
				if (arg1 < Pix2D.clipMinY) {
					int var10 = Pix2D.clipMinY - arg1;
					var6 -= var10;
					arg1 = Pix2D.clipMinY;
					var5 = var10 * var7;
					var4 += var10 * Pix2D.width;
				}
				if (arg1 + var6 > Pix2D.clipMaxY) {
					var6 -= arg1 + var6 - Pix2D.clipMaxY;
				}
				if (arg0 < Pix2D.clipMinX) {
					int var11 = Pix2D.clipMinX - arg0;
					var7 -= var11;
					arg0 = Pix2D.clipMinX;
					var5 += var11;
					var4 += var11;
					var9 = var11;
					var8 += var11;
				}
				if (arg0 + var7 > Pix2D.clipMaxX) {
					int var12 = arg0 + var7 - Pix2D.clipMaxX;
					var7 -= var12;
					var9 += var12;
					var8 += var12;
				}
				if (var7 > 0 && var6 > 0) {
					this.tranSprite(var9, (byte) 2, var4, 0, Pix2D.pixels, this.data, var7, var8, var6, var5);
				}
			}
		} catch (RuntimeException var14) {
			signlink.reporterror("20702, " + 128 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + var14.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("ODBDSPMH.a(IBII[II[IIIII)V")
	public void tranSprite(int arg0, byte arg1, int arg2, int arg3, int[] arg4, int[] arg5, int arg6, int arg7, int arg8, int arg9) {
		try {
			boolean var16 = false;
			for (int var11 = -arg8; var11 < 0; var11++) {
				for (int var12 = -arg6; var12 < 0; var12++) {
					int var17 = arg5[arg9++];
					if (var17 == 0) {
						arg2++;
					} else {
						int var13 = arg4[arg2];
						arg4[arg2++] = ((var17 & 0xFF00FF) * 128 + (var13 & 0xFF00FF) * 128 & 0xFF00FF00) + ((var17 & 0xFF00) * 128 + (var13 & 0xFF00) * 128 & 0xFF0000) >> 8;
					}
				}
				arg2 += arg7;
				arg9 += arg0;
			}
		} catch (RuntimeException var15) {
			signlink.reporterror("96072, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + 128 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + var15.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("ODBDSPMH.a(IIIII[II[IIII)V")
	public void scanlineRotatePlotSprite(int arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5, int arg6, int[] arg7, int arg8, int arg9) {
		try {
			try {
				int var11 = -arg1 / 2;
				int var12 = -arg3 / 2;
				int var13 = (int) (Math.sin((double) arg2 / 326.11D) * 65536.0D);
				int var14 = (int) (Math.cos((double) arg2 / 326.11D) * 65536.0D);
				int var15 = var13 * arg0 >> 8;
				int var16 = var14 * arg0 >> 8;
				int var17 = (arg4 << 16) + var12 * var15 + var11 * var16;
				int var18 = (arg9 << 16) + (var12 * var16 - var11 * var15);
				int var19 = arg8 + arg6 * Pix2D.width;
				for (int var27 = 0; var27 < arg3; var27++) {
					int var20 = arg5[var27];
					int var21 = var19 + var20;
					int var22 = var17 + var16 * var20;
					int var23 = var18 - var15 * var20;
					for (int var28 = -arg7[var27]; var28 < 0; var28++) {
						Pix2D.pixels[var21++] = this.data[(var22 >> 16) + (var23 >> 16) * this.wi];
						var22 += var16;
						var23 -= var15;
					}
					var17 += var15;
					var18 += var16;
					var19 += Pix2D.width;
				}
			} catch (Exception var25) {
			}
		} catch (RuntimeException var26) {
			signlink.reporterror("54035, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + ", " + arg8 + ", " + arg9 + ", " + var26.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("ODBDSPMH.a(IILFCRLGSQA;I)V")
	public void scanlinePlotSprite(int arg0, Pix8 arg1, int arg2) {
		try {
			arg0 += this.xof;
			arg2 += this.yof;
			int var4 = arg0 + arg2 * Pix2D.width;
			int var5 = 0;
			int var6 = this.hi;
			int var7 = this.wi;
			int var8 = Pix2D.width - var7;
			int var9 = 0;
			if (arg2 < Pix2D.clipMinY) {
				int var10 = Pix2D.clipMinY - arg2;
				var6 -= var10;
				arg2 = Pix2D.clipMinY;
				var5 = var10 * var7;
				var4 += var10 * Pix2D.width;
			}
			if (arg2 + var6 > Pix2D.clipMaxY) {
				var6 -= arg2 + var6 - Pix2D.clipMaxY;
			}
			if (arg0 < Pix2D.clipMinX) {
				int var11 = Pix2D.clipMinX - arg0;
				var7 -= var11;
				arg0 = Pix2D.clipMinX;
				var5 += var11;
				var4 += var11;
				var9 = var11;
				var8 += var11;
			}
			if (arg0 + var7 > Pix2D.clipMaxX) {
				int var12 = arg0 + var7 - Pix2D.clipMaxX;
				var7 -= var12;
				var9 += var12;
				var8 += var12;
			}
			if (var7 > 0 && var6 > 0) {
				this.plotScanline(var5, 0, var6, var4, arg1.data, var8, var9, Pix2D.pixels, var7, this.data);
			}
		} catch (RuntimeException var14) {
			signlink.reporterror("28443, " + 41457 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + var14.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("ODBDSPMH.a(IIIII[BII[II[I)V")
	public void plotScanline(int arg0, int arg1, int arg2, int arg3, byte[] arg4, int arg5, int arg6, int[] arg7, int arg8, int[] arg9) {
		try {
			int var11 = -(arg8 >> 2);
			int var18 = -(arg8 & 0x3);
			for (int var12 = -arg2; var12 < 0; var12++) {
				int var17;
				for (int var13 = var11; var13 < 0; var13++) {
					var17 = arg9[arg0++];
					if (var17 != 0 && arg4[arg3] == 0) {
						arg7[arg3++] = var17;
					} else {
						arg3++;
					}
					var17 = arg9[arg0++];
					if (var17 != 0 && arg4[arg3] == 0) {
						arg7[arg3++] = var17;
					} else {
						arg3++;
					}
					var17 = arg9[arg0++];
					if (var17 != 0 && arg4[arg3] == 0) {
						arg7[arg3++] = var17;
					} else {
						arg3++;
					}
					var17 = arg9[arg0++];
					if (var17 != 0 && arg4[arg3] == 0) {
						arg7[arg3++] = var17;
					} else {
						arg3++;
					}
				}
				for (int var14 = var18; var14 < 0; var14++) {
					var17 = arg9[arg0++];
					if (var17 != 0 && arg4[arg3] == 0) {
						arg7[arg3++] = var17;
					} else {
						arg3++;
					}
				}
				arg3 += arg5;
				arg0 += arg6;
			}
		} catch (RuntimeException var16) {
			signlink.reporterror("10158, " + arg0 + ", " + arg1 + ", " + -528 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + var16.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("ODBDSPMH.a([I[IIIIIIII)V")
	public void plot(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		int var9 = -(arg4 >> 2);
		int var10 = -(arg4 & 0x3);
		for (int var11 = -arg5; var11 < 0; var11++) {
			for (int var12 = var9; var12 < 0; var12++) {
				int var13 = arg1[arg2++];
				if (var13 == 0) {
					arg3++;
				} else {
					arg0[arg3++] = var13;
				}
				int var14 = arg1[arg2++];
				if (var14 == 0) {
					arg3++;
				} else {
					arg0[arg3++] = var14;
				}
				int var15 = arg1[arg2++];
				if (var15 == 0) {
					arg3++;
				} else {
					arg0[arg3++] = var15;
				}
				int var16 = arg1[arg2++];
				if (var16 == 0) {
					arg3++;
				} else {
					arg0[arg3++] = var16;
				}
			}
			for (int var17 = var10; var17 < 0; var17++) {
				int var18 = arg1[arg2++];
				if (var18 == 0) {
					arg3++;
				} else {
					arg0[arg3++] = var18;
				}
			}
			arg3 += arg6;
			arg2 += arg7;
		}
	}

	@ObfuscatedName("ODBDSPMH.a(IIIDIIIII)V")
	public void rotatePlotSprite(int arg0, double arg1, int arg2) {
		try {
			try {
				int var5 = (int) (Math.sin(arg1) * 65536.0D);
				int var6 = (int) (Math.cos(arg1) * 65536.0D);
				int var7 = var5 * 256 >> 8;
				int var8 = var6 * 256 >> 8;
				int var9 = var7 * -10 + var8 * -10 + 983040;
				int var10 = var8 * -10 + 983040 - var7 * -10;
				int var11 = arg0 + arg2 * Pix2D.width;
				for (int var20 = 0; var20 < 20; var20++) {
					int var12 = var11;
					int var13 = var9;
					int var14 = var10;
					for (int var19 = -20; var19 < 0; var19++) {
						int var15 = this.data[(var13 >> 16) + (var14 >> 16) * this.wi];
						if (var15 == 0) {
							var12++;
						} else {
							Pix2D.pixels[var12++] = var15;
						}
						var13 += var8;
						var14 -= var7;
					}
					var9 += var7;
					var10 += var8;
					var11 += Pix2D.width;
				}
			} catch (Exception var17) {
			}
		} catch (RuntimeException var18) {
			signlink.reporterror("55943, " + arg0 + ", " + 15 + ", " + 20 + ", " + arg1 + ", " + ", " + 15 + ", " + arg2 + ", " + 256 + ", " + 20 + ", " + var18.toString());
			throw new RuntimeException();
		}
	}



}
