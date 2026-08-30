package deob;

import java.util.Random;
import sign.signlink;

@ObfuscatedName("MCYRKBJU")
public final class class34 extends class26 {

	@ObfuscatedName("MCYRKBJU.x")
	public final int field1092 = -118;

	@ObfuscatedName("MCYRKBJU.y")
	public final boolean field1093 = false;

	@ObfuscatedName("MCYRKBJU.z")
	public final int field1094 = 4;

	@ObfuscatedName("MCYRKBJU.A")
	public final boolean field1095 = true;

	@ObfuscatedName("MCYRKBJU.C")
	public final byte[][] field1097 = new byte[256][];

	@ObfuscatedName("MCYRKBJU.D")
	public final int[] field1098 = new int[256];

	@ObfuscatedName("MCYRKBJU.E")
	public final int[] field1099 = new int[256];

	@ObfuscatedName("MCYRKBJU.F")
	public final int[] field1100 = new int[256];

	@ObfuscatedName("MCYRKBJU.G")
	public final int[] field1101 = new int[256];

	@ObfuscatedName("MCYRKBJU.H")
	public final int[] field1102 = new int[256];

	@ObfuscatedName("MCYRKBJU.J")
	public final Random field1104 = new Random();

	@ObfuscatedName("MCYRKBJU.K")
	public boolean field1105 = false;

	@ObfuscatedName("MCYRKBJU.I")
	public int field1103;

	@ObfuscatedName("MCYRKBJU.B")
	public int field1096;

	public class34(class6 arg0, int arg1, String arg2, boolean arg3) {
		try {
			class17 var5 = new class17(arg0.method30(arg2 + ".dat", null), -26583);
			class17 var6 = new class17(arg0.method30("index.dat", null), -26583);
			var6.field779 = var5.method226() + 4;
			int var7 = var6.method224();
			if (var7 > 0) {
				var6.field779 += (var7 - 1) * 3;
			}
			for (int var8 = 0; var8 < 256; var8++) {
				this.field1100[var8] = var6.method224();
				this.field1101[var8] = var6.method224();
				int var9 = this.field1098[var8] = var6.method226();
				int var10 = this.field1099[var8] = var6.method226();
				int var11 = var6.method224();
				int var12 = var9 * var10;
				this.field1097[var8] = new byte[var12];
				if (var11 == 0) {
					for (int var13 = 0; var13 < var12; var13++) {
						this.field1097[var8][var13] = var5.method225();
					}
				} else if (var11 == 1) {
					for (int var14 = 0; var14 < var9; var14++) {
						for (int var15 = 0; var15 < var10; var15++) {
							this.field1097[var8][var14 + var15 * var9] = var5.method225();
						}
					}
				}
				if (var10 > this.field1103 && var8 < 128) {
					this.field1103 = var10;
				}
				this.field1100[var8] = 1;
				this.field1102[var8] = var9 + 2;
				int var16 = 0;
				for (int var17 = var10 / 7; var17 < var10; var17++) {
					var16 += this.field1097[var8][var17 * var9];
				}
				int var10002;
				if (var16 <= var10 / 7) {
					var10002 = this.field1102[var8]--;
					this.field1100[var8] = 0;
				}
				int var18 = 0;
				for (int var19 = var10 / 7; var19 < var10; var19++) {
					var18 += this.field1097[var8][var9 + var19 * var9 - 1];
				}
				if (var18 <= var10 / 7) {
					var10002 = this.field1102[var8]--;
				}
			}
			if (arg3) {
				this.field1102[32] = this.field1102[73];
			} else {
				this.field1102[32] = this.field1102[105];
			}
		} catch (RuntimeException var21) {
			signlink.reporterror("69804, " + arg0 + ", " + 2 + ", " + arg2 + ", " + arg3 + ", " + var21.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("MCYRKBJU.a(IIIILjava/lang/String;)V")
	public void method372(int arg0, int arg1, int arg2, String arg3) {
		try {
			this.method377(arg3, arg1, 507 - this.method376(arg3), arg2);
			boolean var7 = false;
		} catch (RuntimeException var6) {
			signlink.reporterror("9568, " + arg0 + ", " + arg1 + ", " + 507 + ", " + arg2 + ", " + arg3 + ", " + var6.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("MCYRKBJU.a(ILjava/lang/String;III)V")
	public void method373(int arg0, String arg1, int arg2, int arg3) {
		try {
			this.method377(arg1, arg3, arg2 - this.method376(arg1) / 2, arg0);
		} catch (RuntimeException var6) {
			signlink.reporterror("69287, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 48419 + ", " + var6.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("MCYRKBJU.a(IILjava/lang/String;IZI)V")
	public void method374(int arg0, String arg1, int arg2, boolean arg3, int arg4) {
		try {
			this.method381(arg0 - this.method375(arg1) / 2, arg2, arg3, arg4, arg1);
		} catch (RuntimeException var7) {
			signlink.reporterror("67139, " + -8 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + var7.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("MCYRKBJU.a(Ljava/lang/String;Z)I")
	public int method375(String arg0) {
		try {
			if (arg0 == null) {
				return 0;
			}
			int var2 = 0;
			for (int var3 = 0; var3 < arg0.length(); var3++) {
				if (arg0.charAt(var3) == '@' && var3 + 4 < arg0.length() && arg0.charAt(var3 + 4) == '@') {
					var3 += 4;
				} else {
					var2 += this.field1102[arg0.charAt(var3)];
				}
			}
			return var2;
		} catch (RuntimeException var5) {
			signlink.reporterror("98119, " + arg0 + ", " + true + ", " + var5.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("MCYRKBJU.a(Ljava/lang/String;I)I")
	public int method376(String arg0) {
		try {
			if (arg0 == null) {
				return 0;
			}
			int var2 = 0;
			for (int var3 = 0; var3 < arg0.length(); var3++) {
				var2 += this.field1102[arg0.charAt(var3)];
			}
			return var2;
		} catch (RuntimeException var5) {
			signlink.reporterror("46226, " + arg0 + ", " + -980 + ", " + var5.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("MCYRKBJU.a(Ljava/lang/String;IIII)V")
	public void method377(String arg0, int arg1, int arg2, int arg3) {
		try {
			if (arg0 != null) {
				int var9 = arg1 - this.field1103;
				for (int var5 = 0; var5 < arg0.length(); var5++) {
					char var6 = arg0.charAt(var5);
					if (var6 != ' ') {
						this.method384(this.field1097[var6], arg2 + this.field1100[var6], var9 + this.field1101[var6], this.field1098[var6], this.field1099[var6], arg3);
					}
					arg2 += this.field1102[var6];
				}
			}
		} catch (RuntimeException var8) {
			signlink.reporterror("36336, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + ", " + arg3 + ", " + var8.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("MCYRKBJU.a(IIIIILjava/lang/String;)V")
	public void method378(int arg0, int arg1, int arg2, int arg3, String arg4) {
		try {
			if (arg4 != null) {
				arg1 -= this.method376(arg4) / 2;
				int var10 = arg0 - this.field1103;
				for (int var6 = 0; var6 < arg4.length(); var6++) {
					char var7 = arg4.charAt(var6);
					if (var7 != ' ') {
						this.method384(this.field1097[var7], arg1 + this.field1100[var7], var10 + this.field1101[var7] + (int) (Math.sin((double) var6 / 2.0D + (double) arg2 / 5.0D) * 5.0D), this.field1098[var7], this.field1099[var7], arg3);
					}
					arg1 += this.field1102[var7];
				}
			}
		} catch (RuntimeException var9) {
			signlink.reporterror("97960, " + arg0 + ", " + -31425 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + var9.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("MCYRKBJU.a(IIILjava/lang/String;ZI)V")
	public void method379(int arg0, int arg1, int arg2, String arg3, int arg4) {
		try {
			if (arg3 != null) {
				arg1 -= this.method376(arg3) / 2;
				int var10 = arg0 - this.field1103;
				for (int var6 = 0; var6 < arg3.length(); var6++) {
					char var7 = arg3.charAt(var6);
					if (var7 != ' ') {
						this.method384(this.field1097[var7], arg1 + this.field1100[var7] + (int) (Math.sin((double) var6 / 5.0D + (double) arg4 / 5.0D) * 5.0D), var10 + this.field1101[var7] + (int) (Math.sin((double) var6 / 3.0D + (double) arg4 / 5.0D) * 5.0D), this.field1098[var7], this.field1099[var7], arg2);
					}
					arg1 += this.field1102[var7];
				}
			}
		} catch (RuntimeException var9) {
			signlink.reporterror("78704, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + true + ", " + arg4 + ", " + var9.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("MCYRKBJU.a(IBLjava/lang/String;IIII)V")
	public void method380(int arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
		try {
			if (arg1 != null) {
				double var7 = 7.0D - (double) arg0 / 8.0D;
				if (var7 < 0.0D) {
					var7 = 0.0D;
				}
				arg4 -= this.method376(arg1) / 2;
				int var13 = arg2 - this.field1103;
				for (int var9 = 0; var9 < arg1.length(); var9++) {
					char var10 = arg1.charAt(var9);
					if (var10 != ' ') {
						this.method384(this.field1097[var10], arg4 + this.field1100[var10], var13 + this.field1101[var10] + (int) (Math.sin((double) var9 / 1.5D + (double) arg5) * var7), this.field1098[var10], this.field1099[var10], arg3);
					}
					arg4 += this.field1102[var10];
				}
			}
		} catch (RuntimeException var12) {
			signlink.reporterror("65671, " + arg0 + ", " + 9 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + var12.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("MCYRKBJU.a(IIZILjava/lang/String;I)V")
	public void method381(int arg0, int arg1, boolean arg2, int arg3, String arg4) {
		try {
			this.field1105 = false;
			int var6 = arg0;
			if (arg4 != null) {
				int var12 = arg1 - this.field1103;
				for (int var7 = 0; var7 < arg4.length(); var7++) {
					if (arg4.charAt(var7) == '@' && var7 + 4 < arg4.length() && arg4.charAt(var7 + 4) == '@') {
						int var8 = this.method383(arg4.substring(var7 + 1, var7 + 4));
						if (var8 != -1) {
							arg3 = var8;
						}
						var7 += 4;
					} else {
						char var9 = arg4.charAt(var7);
						if (var9 != ' ') {
							if (arg2) {
								this.method384(this.field1097[var9], arg0 + this.field1100[var9] + 1, var12 + this.field1101[var9] + 1, this.field1098[var9], this.field1099[var9], 0);
							}
							this.method384(this.field1097[var9], arg0 + this.field1100[var9], var12 + this.field1101[var9], this.field1098[var9], this.field1099[var9], arg3);
						}
						arg0 += this.field1102[var9];
					}
				}
				if (this.field1105) {
					class26.method318(arg0 - var6, var12 + (int) ((double) this.field1103 * 0.7D), var6, 8388608);
				}
			}
		} catch (RuntimeException var11) {
			signlink.reporterror("61873, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + -98 + ", " + var11.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("MCYRKBJU.a(IZLjava/lang/String;IIII)V")
	public void method382(int arg0, String arg1, int arg2, int arg3, int arg4) {
		try {
			if (arg1 != null) {
				this.field1104.setSeed((long) arg3);
				int var6 = (this.field1104.nextInt() & 0x1F) + 192;
				int var12 = 15 - this.field1103;
				for (int var7 = 0; var7 < arg1.length(); var7++) {
					if (arg1.charAt(var7) == '@' && var7 + 4 < arg1.length() && arg1.charAt(var7 + 4) == '@') {
						int var8 = this.method383(arg1.substring(var7 + 1, var7 + 4));
						if (var8 != -1) {
							arg0 = var8;
						}
						var7 += 4;
					} else {
						char var9 = arg1.charAt(var7);
						if (var9 != ' ') {
							this.method386(var12 + this.field1101[var9] + 1, arg4 + this.field1100[var9] + 1, this.field1097[var9], 0, 192, this.field1099[var9], this.field1098[var9]);
							this.method386(var12 + this.field1101[var9], arg4 + this.field1100[var9], this.field1097[var9], arg0, var6, this.field1099[var9], this.field1098[var9]);
						}
						arg4 += this.field1102[var9];
						if ((this.field1104.nextInt() & 0x3) == 0) {
							arg4++;
						}
					}
				}
			}
		} catch (RuntimeException var11) {
			signlink.reporterror("25101, " + arg0 + ", " + true + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + 8 + ", " + var11.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("MCYRKBJU.a(ILjava/lang/String;)I")
	public int method383(String arg0) {
		try {
			if (arg0.equals("red")) {
				return 16711680;
			} else if (arg0.equals("gre")) {
				return 65280;
			} else if (arg0.equals("blu")) {
				return 255;
			} else if (arg0.equals("yel")) {
				return 16776960;
			} else if (arg0.equals("cya")) {
				return 65535;
			} else if (arg0.equals("mag")) {
				return 16711935;
			} else if (arg0.equals("whi")) {
				return 16777215;
			} else if (arg0.equals("bla")) {
				return 0;
			} else if (arg0.equals("lre")) {
				return 16748608;
			} else if (arg0.equals("dre")) {
				return 8388608;
			} else if (arg0.equals("dbl")) {
				return 128;
			} else if (arg0.equals("or1")) {
				return 16756736;
			} else if (arg0.equals("or2")) {
				return 16740352;
			} else if (arg0.equals("or3")) {
				return 16723968;
			} else if (arg0.equals("gr1")) {
				return 12648192;
			} else if (arg0.equals("gr2")) {
				return 8453888;
			} else if (arg0.equals("gr3")) {
				return 4259584;
			} else {
				if (arg0.equals("str")) {
					this.field1105 = true;
				}
				if (arg0.equals("end")) {
					this.field1105 = false;
				}
				return -1;
			}
		} catch (RuntimeException var3) {
			signlink.reporterror("34551, " + ", " + arg0 + ", " + var3.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("MCYRKBJU.a([BIIIII)V")
	public void method384(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = arg1 + arg2 * class26.field877;
		int var8 = class26.field877 - arg3;
		int var9 = 0;
		int var10 = 0;
		if (arg2 < class26.field879) {
			int var11 = class26.field879 - arg2;
			arg4 -= var11;
			arg2 = class26.field879;
			var10 = var11 * arg3;
			var7 += var11 * class26.field877;
		}
		if (arg2 + arg4 >= class26.field880) {
			arg4 -= arg2 + arg4 + 1 - class26.field880;
		}
		if (arg1 < class26.field881) {
			int var12 = class26.field881 - arg1;
			arg3 -= var12;
			arg1 = class26.field881;
			var10 += var12;
			var7 += var12;
			var9 = var12;
			var8 += var12;
		}
		if (arg1 + arg3 >= class26.field882) {
			int var13 = arg1 + arg3 + 1 - class26.field882;
			arg3 -= var13;
			var9 += var13;
			var8 += var13;
		}
		if (arg3 > 0 && arg4 > 0) {
			this.method385(class26.field876, arg0, arg5, var10, var7, arg3, arg4, var8, var9);
		}
	}

	@ObfuscatedName("MCYRKBJU.a([I[BIIIIIII)V")
	public void method385(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		int var10 = -(arg5 >> 2);
		int var11 = -(arg5 & 0x3);
		for (int var12 = -arg6; var12 < 0; var12++) {
			for (int var13 = var10; var13 < 0; var13++) {
				if (arg1[arg3++] == 0) {
					arg4++;
				} else {
					arg0[arg4++] = arg2;
				}
				if (arg1[arg3++] == 0) {
					arg4++;
				} else {
					arg0[arg4++] = arg2;
				}
				if (arg1[arg3++] == 0) {
					arg4++;
				} else {
					arg0[arg4++] = arg2;
				}
				if (arg1[arg3++] == 0) {
					arg4++;
				} else {
					arg0[arg4++] = arg2;
				}
			}
			for (int var14 = var11; var14 < 0; var14++) {
				if (arg1[arg3++] == 0) {
					arg4++;
				} else {
					arg0[arg4++] = arg2;
				}
			}
			arg4 += arg7;
			arg3 += arg8;
		}
	}

	@ObfuscatedName("MCYRKBJU.a(II[BIIIII)V")
	public void method386(int arg0, int arg1, byte[] arg2, int arg3, int arg4, int arg5, int arg6) {
		try {
			int var8 = arg1 + arg0 * class26.field877;
			int var9 = class26.field877 - arg6;
			int var10 = 0;
			int var11 = 0;
			if (arg0 < class26.field879) {
				int var12 = class26.field879 - arg0;
				arg5 -= var12;
				arg0 = class26.field879;
				var11 = var12 * arg6;
				var8 += var12 * class26.field877;
			}
			if (arg0 + arg5 >= class26.field880) {
				arg5 -= arg0 + arg5 + 1 - class26.field880;
			}
			if (arg1 < class26.field881) {
				int var13 = class26.field881 - arg1;
				arg6 -= var13;
				arg1 = class26.field881;
				var11 += var13;
				var8 += var13;
				var10 = var13;
				var9 += var13;
			}
			if (arg1 + arg6 >= class26.field882) {
				int var14 = arg1 + arg6 + 1 - class26.field882;
				arg6 -= var14;
				var10 += var14;
				var9 += var14;
			}
			if (arg6 > 0 && arg5 > 0) {
				this.method387(var11, var10, arg6, arg5, var8, arg2, class26.field876, arg3, arg4, var9);
			}
		} catch (RuntimeException var16) {
			signlink.reporterror("19821, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + 769 + ", " + arg5 + ", " + arg6 + ", " + var16.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("MCYRKBJU.a(IIIII[BZ[IIII)V")
	public void method387(int arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, int[] arg6, int arg7, int arg8, int arg9) {
		try {
			int var16 = ((arg7 & 0xFF00FF) * arg8 & 0xFF00FF00) + ((arg7 & 0xFF00) * arg8 & 0xFF0000) >> 8;
			int var17 = 256 - arg8;
			for (int var11 = -arg3; var11 < 0; var11++) {
				for (int var12 = -arg2; var12 < 0; var12++) {
					if (arg5[arg0++] == 0) {
						arg4++;
					} else {
						int var13 = arg6[arg4];
						arg6[arg4++] = (((var13 & 0xFF00FF) * var17 & 0xFF00FF00) + ((var13 & 0xFF00) * var17 & 0xFF0000) >> 8) + var16;
					}
				}
				arg4 += arg9;
				arg0 += arg1;
			}
		} catch (RuntimeException var15) {
			signlink.reporterror("35312, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + true + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + var15.toString());
			throw new RuntimeException();
		}
	}
}
