package deob;

import java.awt.Component;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;
import sign.signlink;

@ObfuscatedName("ODBDSPMH")
public final class class40 extends class26 {

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

	@ObfuscatedName("ODBDSPMH.C")
	public int[] field1175;

	@ObfuscatedName("ODBDSPMH.H")
	public int field1180;

	@ObfuscatedName("ODBDSPMH.D")
	public int field1176;

	@ObfuscatedName("ODBDSPMH.I")
	public int field1181;

	@ObfuscatedName("ODBDSPMH.E")
	public int field1177;

	@ObfuscatedName("ODBDSPMH.G")
	public int field1179;

	@ObfuscatedName("ODBDSPMH.F")
	public int field1178;

	public class40(int arg0, int arg1) {
		this.field1175 = new int[arg0 * arg1];
		this.field1176 = this.field1180 = arg0;
		this.field1177 = this.field1181 = arg1;
		this.field1178 = this.field1179 = 0;
	}

	public class40(byte[] arg0, Component arg1) {
		try {
			Image var3 = Toolkit.getDefaultToolkit().createImage(arg0);
			MediaTracker var4 = new MediaTracker(arg1);
			var4.addImage(var3, 0);
			var4.waitForAll();
			this.field1176 = var3.getWidth(arg1);
			this.field1177 = var3.getHeight(arg1);
			this.field1180 = this.field1176;
			this.field1181 = this.field1177;
			this.field1178 = 0;
			this.field1179 = 0;
			this.field1175 = new int[this.field1176 * this.field1177];
			PixelGrabber var5 = new PixelGrabber(var3, 0, 0, this.field1176, this.field1177, this.field1175, 0, this.field1176);
			var5.grabPixels();
		} catch (Exception var6) {
			System.out.println("Error converting jpg");
		}
	}

	public class40(class6 arg0, String arg1, int arg2) {
		class17 var4 = new class17(arg0.method30(arg1 + ".dat", null), -26583);
		class17 var5 = new class17(arg0.method30("index.dat", null), -26583);
		var5.field779 = var4.method226();
		this.field1180 = var5.method226();
		this.field1181 = var5.method226();
		int var6 = var5.method224();
		int[] var7 = new int[var6];
		for (int var8 = 0; var8 < var6 - 1; var8++) {
			var7[var8 + 1] = var5.method228();
			if (var7[var8 + 1] == 0) {
				var7[var8 + 1] = 1;
			}
		}
		for (int var9 = 0; var9 < arg2; var9++) {
			var5.field779 += 2;
			var4.field779 += var5.method226() * var5.method226();
			var5.field779++;
		}
		this.field1178 = var5.method224();
		this.field1179 = var5.method224();
		this.field1176 = var5.method226();
		this.field1177 = var5.method226();
		int var10 = var5.method224();
		int var11 = this.field1176 * this.field1177;
		this.field1175 = new int[var11];
		if (var10 == 0) {
			for (int var12 = 0; var12 < var11; var12++) {
				this.field1175[var12] = var7[var4.method224()];
			}
		} else if (var10 == 1) {
			for (int var13 = 0; var13 < this.field1176; var13++) {
				for (int var14 = 0; var14 < this.field1177; var14++) {
					this.field1175[var13 + var14 * this.field1176] = var7[var4.method224()];
				}
			}
		}
	}

	@ObfuscatedName("ODBDSPMH.b(B)V")
	public void method399() {
		try {
			class26.method310(this.field1177, this.field1175, this.field1171, this.field1176);
		} catch (RuntimeException var2) {
			signlink.reporterror("94710, " + 58 + ", " + var2.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("ODBDSPMH.a(IIII)V")
	public void method400(int arg0, int arg1, int arg2) {
		try {
			for (int var4 = 0; var4 < this.field1175.length; var4++) {
				int var5 = this.field1175[var4];
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
					this.field1175[var4] = (var7 << 16) + (var9 << 8) + var11;
				}
			}
		} catch (RuntimeException var13) {
			signlink.reporterror("84134, " + arg0 + ", " + arg1 + ", " + -35373 + ", " + arg2 + ", " + var13.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("ODBDSPMH.b(I)V")
	public void method401() {
		try {
			int[] var1 = new int[this.field1180 * this.field1181];
			for (int var2 = 0; var2 < this.field1177; var2++) {
				for (int var3 = 0; var3 < this.field1176; var3++) {
					var1[(var2 + this.field1179) * this.field1180 + var3 + this.field1178] = this.field1175[var2 * this.field1176 + var3];
				}
			}
			this.field1175 = var1;
			this.field1176 = this.field1180;
			this.field1177 = this.field1181;
			this.field1178 = 0;
			this.field1179 = 0;
		} catch (RuntimeException var5) {
			signlink.reporterror("98644, " + -200 + ", " + var5.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("ODBDSPMH.a(III)V")
	public void method402(int arg0, int arg1) {
		try {
			arg1 += this.field1178;
			arg0 += this.field1179;
			int var3 = arg1 + arg0 * class26.field877;
			int var4 = 0;
			int var5 = this.field1177;
			int var6 = this.field1176;
			int var7 = class26.field877 - var6;
			int var8 = 0;
			if (arg0 < class26.field879) {
				int var9 = class26.field879 - arg0;
				var5 -= var9;
				arg0 = class26.field879;
				var4 = var9 * var6;
				var3 += var9 * class26.field877;
			}
			if (arg0 + var5 > class26.field880) {
				var5 -= arg0 + var5 - class26.field880;
			}
			if (arg1 < class26.field881) {
				int var10 = class26.field881 - arg1;
				var6 -= var10;
				arg1 = class26.field881;
				var4 += var10;
				var3 += var10;
				var8 = var10;
				var7 += var10;
			}
			if (arg1 + var6 > class26.field882) {
				int var11 = arg1 + var6 - class26.field882;
				var6 -= var11;
				var8 += var11;
				var7 += var11;
			}
			if (var6 > 0 && var5 > 0) {
				this.method403(this.field1175, var5, this.field1170, class26.field876, var3, var7, var4, var8, var6);
			}
		} catch (RuntimeException var13) {
			signlink.reporterror("14084, " + arg0 + ", " + arg1 + ", " + 261 + ", " + var13.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("ODBDSPMH.a([IIZ[IIIIII)V")
	public void method403(int[] arg0, int arg1, boolean arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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
	public void method404(int arg0, int arg1, int arg2) {
		try {
			arg0 += this.field1178;
			arg2 += this.field1179;
			int var15 = 13 / arg1;
			int var4 = arg0 + arg2 * class26.field877;
			int var5 = 0;
			int var6 = this.field1177;
			int var7 = this.field1176;
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
				this.method405(class26.field876, this.field1175, var5, var4, var7, var6, var8, var9);
			}
		} catch (RuntimeException var14) {
			signlink.reporterror("99882, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + var14.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("ODBDSPMH.a([I[IIIIIIII)V")
	public void method405(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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

	@ObfuscatedName("ODBDSPMH.b(IIII)V")
	public void method406(int arg0, int arg1, int arg2) {
		try {
			arg0 += this.field1178;
			arg1 += this.field1179;
			if (arg2 >= 3 && arg2 <= 3) {
				int var4 = arg0 + arg1 * class26.field877;
				int var5 = 0;
				int var6 = this.field1177;
				int var7 = this.field1176;
				int var8 = class26.field877 - var7;
				int var9 = 0;
				if (arg1 < class26.field879) {
					int var10 = class26.field879 - arg1;
					var6 -= var10;
					arg1 = class26.field879;
					var5 = var10 * var7;
					var4 += var10 * class26.field877;
				}
				if (arg1 + var6 > class26.field880) {
					var6 -= arg1 + var6 - class26.field880;
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
					this.method407(var9, (byte) 2, var4, 0, class26.field876, this.field1175, var7, var8, var6, var5);
				}
			}
		} catch (RuntimeException var14) {
			signlink.reporterror("20702, " + 128 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + var14.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("ODBDSPMH.a(IBII[II[IIIII)V")
	public void method407(int arg0, byte arg1, int arg2, int arg3, int[] arg4, int[] arg5, int arg6, int arg7, int arg8, int arg9) {
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
	public void method408(int arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5, int arg6, int[] arg7, int arg8, int arg9) {
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
				int var19 = arg8 + arg6 * class26.field877;
				for (int var27 = 0; var27 < arg3; var27++) {
					int var20 = arg5[var27];
					int var21 = var19 + var20;
					int var22 = var17 + var16 * var20;
					int var23 = var18 - var15 * var20;
					for (int var28 = -arg7[var27]; var28 < 0; var28++) {
						class26.field876[var21++] = this.field1175[(var22 >> 16) + (var23 >> 16) * this.field1176];
						var22 += var16;
						var23 -= var15;
					}
					var17 += var15;
					var18 += var16;
					var19 += class26.field877;
				}
			} catch (Exception var25) {
			}
		} catch (RuntimeException var26) {
			signlink.reporterror("54035, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + ", " + arg8 + ", " + arg9 + ", " + var26.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("ODBDSPMH.a(IIIDIIIII)V")
	public void method409(int arg0, double arg1, int arg2) {
		try {
			try {
				int var5 = (int) (Math.sin(arg1) * 65536.0D);
				int var6 = (int) (Math.cos(arg1) * 65536.0D);
				int var7 = var5 * 256 >> 8;
				int var8 = var6 * 256 >> 8;
				int var9 = var7 * -10 + var8 * -10 + 983040;
				int var10 = var8 * -10 + 983040 - var7 * -10;
				int var11 = arg0 + arg2 * class26.field877;
				for (int var20 = 0; var20 < 20; var20++) {
					int var12 = var11;
					int var13 = var9;
					int var14 = var10;
					for (int var19 = -20; var19 < 0; var19++) {
						int var15 = this.field1175[(var13 >> 16) + (var14 >> 16) * this.field1176];
						if (var15 == 0) {
							var12++;
						} else {
							class26.field876[var12++] = var15;
						}
						var13 += var8;
						var14 -= var7;
					}
					var9 += var7;
					var10 += var8;
					var11 += class26.field877;
				}
			} catch (Exception var17) {
			}
		} catch (RuntimeException var18) {
			signlink.reporterror("55943, " + arg0 + ", " + 15 + ", " + 20 + ", " + arg1 + ", " + ", " + 15 + ", " + arg2 + ", " + 256 + ", " + 20 + ", " + var18.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("ODBDSPMH.a(IILFCRLGSQA;I)V")
	public void method410(int arg0, class19 arg1, int arg2) {
		try {
			arg0 += this.field1178;
			arg2 += this.field1179;
			int var4 = arg0 + arg2 * class26.field877;
			int var5 = 0;
			int var6 = this.field1177;
			int var7 = this.field1176;
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
				this.method411(var5, 0, var6, var4, arg1.field798, var8, var9, class26.field876, var7, this.field1175);
			}
		} catch (RuntimeException var14) {
			signlink.reporterror("28443, " + 41457 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + var14.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("ODBDSPMH.a(IIIII[BII[II[I)V")
	public void method411(int arg0, int arg1, int arg2, int arg3, byte[] arg4, int arg5, int arg6, int[] arg7, int arg8, int[] arg9) {
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
}
