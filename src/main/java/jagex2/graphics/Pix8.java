package jagex2.graphics;

import jagex2.io.JagFile;
import deob.ObfuscatedName;
import jagex2.io.Packet;
import sign.signlink;

@ObfuscatedName("FCRLGSQA")
public final class Pix8 extends Pix2D {

	@ObfuscatedName("FCRLGSQA.C")
	public byte[] data;

	@ObfuscatedName("FCRLGSQA.D")
	public final int[] bpal;

	@ObfuscatedName("FCRLGSQA.E")
	public int wi;

	@ObfuscatedName("FCRLGSQA.F")
	public int hi;

	@ObfuscatedName("FCRLGSQA.G")
	public int xof;

	@ObfuscatedName("FCRLGSQA.H")
	public int yof;

	@ObfuscatedName("FCRLGSQA.I")
	public int owi;

	@ObfuscatedName("FCRLGSQA.J")
	public int ohi;

	@ObfuscatedName("FCRLGSQA.x")
	public final boolean field793 = false;

	@ObfuscatedName("FCRLGSQA.y")
	public final int field794 = 1914;

	@ObfuscatedName("FCRLGSQA.z")
	public final int field795 = 9;

	@ObfuscatedName("FCRLGSQA.A")
	public final int field796 = 9;

	@ObfuscatedName("FCRLGSQA.B")
	public final boolean field797 = true;

	public Pix8(JagFile arg0, String arg1, int arg2) {
		Packet var4 = new Packet(arg0.read(arg1 + ".dat", null), -26583);
		Packet var5 = new Packet(arg0.read("index.dat", null), -26583);
		var5.pos = var4.g2();
		this.owi = var5.g2();
		this.ohi = var5.g2();
		int var6 = var5.g1();
		this.bpal = new int[var6];
		for (int var7 = 0; var7 < var6 - 1; var7++) {
			this.bpal[var7 + 1] = var5.g3();
		}
		for (int var8 = 0; var8 < arg2; var8++) {
			var5.pos += 2;
			var4.pos += var5.g2() * var5.g2();
			var5.pos++;
		}
		this.xof = var5.g1();
		this.yof = var5.g1();
		this.wi = var5.g2();
		this.hi = var5.g2();
		int var9 = var5.g1();
		int var10 = this.wi * this.hi;
		this.data = new byte[var10];
		if (var9 == 0) {
			for (int var11 = 0; var11 < var10; var11++) {
				this.data[var11] = var4.g1b();
			}
		} else if (var9 == 1) {
			for (int var12 = 0; var12 < this.wi; var12++) {
				for (int var13 = 0; var13 < this.hi; var13++) {
					this.data[var12 + var13 * this.wi] = var4.g1b();
				}
			}
		}
	}

	@ObfuscatedName("FCRLGSQA.b(B)V")
	public void trim() {
		try {
			if (this.wi != this.owi || this.hi != this.ohi) {
				byte[] var1 = new byte[this.owi * this.ohi];
				int var2 = 0;
				for (int var3 = 0; var3 < this.hi; var3++) {
					for (int var4 = 0; var4 < this.wi; var4++) {
						var1[var4 + this.xof + (var3 + this.yof) * this.owi] = this.data[var2++];
					}
				}
				this.data = var1;
				this.wi = this.owi;
				this.hi = this.ohi;
				this.xof = 0;
				this.yof = 0;
			}
		} catch (RuntimeException var6) {
			signlink.reporterror("16415, " + 1 + ", " + var6.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("FCRLGSQA.a(IIII)V")
	public void rgbAdjust(int arg0, int arg1, int arg2) {
		try {
			for (int var4 = 0; var4 < this.bpal.length; var4++) {
				int var5 = this.bpal[var4] >> 16 & 0xFF;
				int var6 = var5 + arg1;
				if (var6 < 0) {
					var6 = 0;
				} else if (var6 > 255) {
					var6 = 255;
				}
				int var7 = this.bpal[var4] >> 8 & 0xFF;
				int var8 = var7 + arg2;
				if (var8 < 0) {
					var8 = 0;
				} else if (var8 > 255) {
					var8 = 255;
				}
				int var9 = this.bpal[var4] & 0xFF;
				int var10 = var9 + arg0;
				if (var10 < 0) {
					var10 = 0;
				} else if (var10 > 255) {
					var10 = 255;
				}
				this.bpal[var4] = (var6 << 16) + (var8 << 8) + var10;
			}
		} catch (RuntimeException var12) {
			signlink.reporterror("85683, " + arg0 + ", " + arg1 + ", " + -35373 + ", " + arg2 + ", " + var12.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("FCRLGSQA.a(III)V")
	public void plotSprite(int arg0, int arg1, int arg2) {
		try {
			arg0 += this.xof;
			arg2 += this.yof;
			if (arg1 > 0) {
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
					this.plotSprite(853, Pix2D.pixels, var4, var6, this.data, var5, var8, var7, this.bpal, var9);
				}
			}
		} catch (RuntimeException var14) {
			signlink.reporterror("54269, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + var14.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("FCRLGSQA.a(I[III[BIII[II)V")
	public void plotSprite(int arg0, int[] arg1, int arg2, int arg3, byte[] arg4, int arg5, int arg6, int arg7, int[] arg8, int arg9) {
		try {
			int var11 = -(arg7 >> 2);
			boolean var22 = false;
			int var23 = -(arg7 & 0x3);
			for (int var12 = -arg3; var12 < 0; var12++) {
				for (int var13 = var11; var13 < 0; var13++) {
					byte var14 = arg4[arg5++];
					if (var14 == 0) {
						arg2++;
					} else {
						arg1[arg2++] = arg8[var14 & 0xFF];
					}
					byte var15 = arg4[arg5++];
					if (var15 == 0) {
						arg2++;
					} else {
						arg1[arg2++] = arg8[var15 & 0xFF];
					}
					byte var16 = arg4[arg5++];
					if (var16 == 0) {
						arg2++;
					} else {
						arg1[arg2++] = arg8[var16 & 0xFF];
					}
					byte var17 = arg4[arg5++];
					if (var17 == 0) {
						arg2++;
					} else {
						arg1[arg2++] = arg8[var17 & 0xFF];
					}
				}
				for (int var18 = var23; var18 < 0; var18++) {
					byte var19 = arg4[arg5++];
					if (var19 == 0) {
						arg2++;
					} else {
						arg1[arg2++] = arg8[var19 & 0xFF];
					}
				}
				arg2 += arg6;
				arg5 += arg9;
			}
		} catch (RuntimeException var21) {
			signlink.reporterror("19612, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + var21.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("FCRLGSQA.a(Z)V")
	public void halveSize() {
		try {
			this.owi /= 2;
			this.ohi /= 2;
			byte[] var1 = new byte[this.owi * this.ohi];
			int var2 = 0;
			for (int var3 = 0; var3 < this.hi; var3++) {
				for (int var4 = 0; var4 < this.wi; var4++) {
					var1[(var4 + this.xof >> 1) + (var3 + this.yof >> 1) * this.owi] = this.data[var2++];
				}
			}
			this.data = var1;
			this.wi = this.owi;
			this.hi = this.ohi;
			this.xof = 0;
			this.yof = 0;
		} catch (RuntimeException var6) {
			signlink.reporterror("79581, " + true + ", " + var6.toString());
			throw new RuntimeException();
		}
	}


	@ObfuscatedName("FCRLGSQA.b(I)V")
	public void hflip() {
		try {
			byte[] var1 = new byte[this.wi * this.hi];
			int var2 = 0;
			for (int var3 = 0; var3 < this.hi; var3++) {
				for (int var4 = this.wi - 1; var4 >= 0; var4--) {
					var1[var2++] = this.data[var4 + var3 * this.wi];
				}
			}
			this.data = var1;
			this.xof = this.owi - this.wi - this.xof;
		} catch (RuntimeException var6) {
			signlink.reporterror("88521, " + 804 + ", " + var6.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("FCRLGSQA.c(I)V")
	public void vflip() {
		try {
			byte[] var1 = new byte[this.wi * this.hi];
			int var2 = 0;
			for (int var3 = this.hi - 1; var3 >= 0; var3--) {
				for (int var4 = 0; var4 < this.wi; var4++) {
					var1[var2++] = this.data[var4 + var3 * this.wi];
				}
			}
			this.data = var1;
			this.yof = this.ohi - this.hi - this.yof;
		} catch (RuntimeException var6) {
			signlink.reporterror("81954, " + ", " + var6.toString());
			throw new RuntimeException();
		}
	}
}
