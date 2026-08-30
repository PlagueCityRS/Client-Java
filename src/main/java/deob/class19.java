package deob;

import sign.signlink;

@ObfuscatedName("FCRLGSQA")
public final class class19 extends class26 {

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

	@ObfuscatedName("FCRLGSQA.I")
	public int field804;

	@ObfuscatedName("FCRLGSQA.J")
	public int field805;

	@ObfuscatedName("FCRLGSQA.D")
	public final int[] field799;

	@ObfuscatedName("FCRLGSQA.G")
	public int field802;

	@ObfuscatedName("FCRLGSQA.H")
	public int field803;

	@ObfuscatedName("FCRLGSQA.E")
	public int field800;

	@ObfuscatedName("FCRLGSQA.F")
	public int field801;

	@ObfuscatedName("FCRLGSQA.C")
	public byte[] field798;

	public class19(class6 arg0, String arg1, int arg2) {
		class17 var4 = new class17(arg0.method30(arg1 + ".dat", null), -26583);
		class17 var5 = new class17(arg0.method30("index.dat", null), -26583);
		var5.field779 = var4.method226();
		this.field804 = var5.method226();
		this.field805 = var5.method226();
		int var6 = var5.method224();
		this.field799 = new int[var6];
		for (int var7 = 0; var7 < var6 - 1; var7++) {
			this.field799[var7 + 1] = var5.method228();
		}
		for (int var8 = 0; var8 < arg2; var8++) {
			var5.field779 += 2;
			var4.field779 += var5.method226() * var5.method226();
			var5.field779++;
		}
		this.field802 = var5.method224();
		this.field803 = var5.method224();
		this.field800 = var5.method226();
		this.field801 = var5.method226();
		int var9 = var5.method224();
		int var10 = this.field800 * this.field801;
		this.field798 = new byte[var10];
		if (var9 == 0) {
			for (int var11 = 0; var11 < var10; var11++) {
				this.field798[var11] = var4.method225();
			}
		} else if (var9 == 1) {
			for (int var12 = 0; var12 < this.field800; var12++) {
				for (int var13 = 0; var13 < this.field801; var13++) {
					this.field798[var12 + var13 * this.field800] = var4.method225();
				}
			}
		}
	}

	@ObfuscatedName("FCRLGSQA.a(Z)V")
	public void method265() {
		try {
			this.field804 /= 2;
			this.field805 /= 2;
			byte[] var1 = new byte[this.field804 * this.field805];
			int var2 = 0;
			for (int var3 = 0; var3 < this.field801; var3++) {
				for (int var4 = 0; var4 < this.field800; var4++) {
					var1[(var4 + this.field802 >> 1) + (var3 + this.field803 >> 1) * this.field804] = this.field798[var2++];
				}
			}
			this.field798 = var1;
			this.field800 = this.field804;
			this.field801 = this.field805;
			this.field802 = 0;
			this.field803 = 0;
		} catch (RuntimeException var6) {
			signlink.reporterror("79581, " + true + ", " + var6.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("FCRLGSQA.b(B)V")
	public void method266() {
		try {
			if (this.field800 != this.field804 || this.field801 != this.field805) {
				byte[] var1 = new byte[this.field804 * this.field805];
				int var2 = 0;
				for (int var3 = 0; var3 < this.field801; var3++) {
					for (int var4 = 0; var4 < this.field800; var4++) {
						var1[var4 + this.field802 + (var3 + this.field803) * this.field804] = this.field798[var2++];
					}
				}
				this.field798 = var1;
				this.field800 = this.field804;
				this.field801 = this.field805;
				this.field802 = 0;
				this.field803 = 0;
			}
		} catch (RuntimeException var6) {
			signlink.reporterror("16415, " + 1 + ", " + var6.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("FCRLGSQA.b(I)V")
	public void method267() {
		try {
			byte[] var1 = new byte[this.field800 * this.field801];
			int var2 = 0;
			for (int var3 = 0; var3 < this.field801; var3++) {
				for (int var4 = this.field800 - 1; var4 >= 0; var4--) {
					var1[var2++] = this.field798[var4 + var3 * this.field800];
				}
			}
			this.field798 = var1;
			this.field802 = this.field804 - this.field800 - this.field802;
		} catch (RuntimeException var6) {
			signlink.reporterror("88521, " + 804 + ", " + var6.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("FCRLGSQA.c(I)V")
	public void method268() {
		try {
			byte[] var1 = new byte[this.field800 * this.field801];
			int var2 = 0;
			for (int var3 = this.field801 - 1; var3 >= 0; var3--) {
				for (int var4 = 0; var4 < this.field800; var4++) {
					var1[var2++] = this.field798[var4 + var3 * this.field800];
				}
			}
			this.field798 = var1;
			this.field803 = this.field805 - this.field801 - this.field803;
		} catch (RuntimeException var6) {
			signlink.reporterror("81954, " + ", " + var6.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("FCRLGSQA.a(IIII)V")
	public void method269(int arg0, int arg1, int arg2) {
		try {
			for (int var4 = 0; var4 < this.field799.length; var4++) {
				int var5 = this.field799[var4] >> 16 & 0xFF;
				int var6 = var5 + arg1;
				if (var6 < 0) {
					var6 = 0;
				} else if (var6 > 255) {
					var6 = 255;
				}
				int var7 = this.field799[var4] >> 8 & 0xFF;
				int var8 = var7 + arg2;
				if (var8 < 0) {
					var8 = 0;
				} else if (var8 > 255) {
					var8 = 255;
				}
				int var9 = this.field799[var4] & 0xFF;
				int var10 = var9 + arg0;
				if (var10 < 0) {
					var10 = 0;
				} else if (var10 > 255) {
					var10 = 255;
				}
				this.field799[var4] = (var6 << 16) + (var8 << 8) + var10;
			}
		} catch (RuntimeException var12) {
			signlink.reporterror("85683, " + arg0 + ", " + arg1 + ", " + -35373 + ", " + arg2 + ", " + var12.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("FCRLGSQA.a(III)V")
	public void method270(int arg0, int arg1, int arg2) {
		try {
			arg0 += this.field802;
			arg2 += this.field803;
			if (arg1 > 0) {
				int var4 = arg0 + arg2 * class26.field877;
				int var5 = 0;
				int var6 = this.field801;
				int var7 = this.field800;
				int var8 = class26.field877 - var7;
				int var9 = 0;
				if (arg2 < class26.field879) {
					int var10 = class26.field879 - arg2;
					var6 -= var10;
					arg2 = class26.field879;
					var5 = var10 * var7;
					var4 += var10 * class26.field877;
				}
				if (arg2 + var6 > class26.field880) {
					var6 -= arg2 + var6 - class26.field880;
				}
				if (arg0 < class26.field881) {
					int var11 = class26.field881 - arg0;
					var7 -= var11;
					arg0 = class26.field881;
					var5 += var11;
					var4 += var11;
					var9 = var11;
					var8 += var11;
				}
				if (arg0 + var7 > class26.field882) {
					int var12 = arg0 + var7 - class26.field882;
					var7 -= var12;
					var9 += var12;
					var8 += var12;
				}
				if (var7 > 0 && var6 > 0) {
					this.method271(853, class26.field876, var4, var6, this.field798, var5, var8, var7, this.field799, var9);
				}
			}
		} catch (RuntimeException var14) {
			signlink.reporterror("54269, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + var14.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("FCRLGSQA.a(I[III[BIII[II)V")
	public void method271(int arg0, int[] arg1, int arg2, int arg3, byte[] arg4, int arg5, int arg6, int arg7, int[] arg8, int arg9) {
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
}
