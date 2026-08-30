package deob;

import sign.signlink;

@ObfuscatedName("OZIFXWPH")
public final class class44 {

	@ObfuscatedName("OZIFXWPH.k")
	public static int field1224 = (int) (Math.random() * 33.0D) - 16;

	@ObfuscatedName("OZIFXWPH.l")
	public static final int[] field1225 = new int[] { 1, 2, 4, 8 };

	@ObfuscatedName("OZIFXWPH.n")
	public static final int field1227 = 514;

	@ObfuscatedName("OZIFXWPH.o")
	public static boolean field1228 = true;

	@ObfuscatedName("OZIFXWPH.p")
	public static final int[] field1229 = new int[] { 1, 0, -1, 0 };

	@ObfuscatedName("OZIFXWPH.q")
	public static final int field1230 = -44;

	@ObfuscatedName("OZIFXWPH.u")
	public static final int[] field1234 = new int[] { 16, 32, 64, 128 };

	@ObfuscatedName("OZIFXWPH.v")
	public static int field1235 = (int) (Math.random() * 17.0D) - 8;

	@ObfuscatedName("OZIFXWPH.y")
	public static final int[] field1238 = new int[] { 0, -1, 0, 1 };

	@ObfuscatedName("OZIFXWPH.z")
	public static int field1239 = 99;

	@ObfuscatedName("OZIFXWPH.a")
	public final boolean field1214 = true;

	@ObfuscatedName("OZIFXWPH.b")
	public final int field1215 = 534;

	@ObfuscatedName("OZIFXWPH.m")
	public final boolean field1226 = true;

	@ObfuscatedName("OZIFXWPH.A")
	public final int field1240;

	@ObfuscatedName("OZIFXWPH.B")
	public final int field1241;

	@ObfuscatedName("OZIFXWPH.E")
	public final int[][][] field1244;

	@ObfuscatedName("OZIFXWPH.i")
	public final byte[][][] field1222;

	@ObfuscatedName("OZIFXWPH.w")
	public final byte[][][] field1236;

	@ObfuscatedName("OZIFXWPH.D")
	public final byte[][][] field1243;

	@ObfuscatedName("OZIFXWPH.j")
	public final byte[][][] field1223;

	@ObfuscatedName("OZIFXWPH.r")
	public final byte[][][] field1231;

	@ObfuscatedName("OZIFXWPH.x")
	public final int[][][] field1237;

	@ObfuscatedName("OZIFXWPH.c")
	public final byte[][][] field1216;

	@ObfuscatedName("OZIFXWPH.t")
	public final int[][] field1233;

	@ObfuscatedName("OZIFXWPH.d")
	public final int[] field1217;

	@ObfuscatedName("OZIFXWPH.e")
	public final int[] field1218;

	@ObfuscatedName("OZIFXWPH.f")
	public final int[] field1219;

	@ObfuscatedName("OZIFXWPH.g")
	public final int[] field1220;

	@ObfuscatedName("OZIFXWPH.h")
	public final int[] field1221;

	@ObfuscatedName("OZIFXWPH.s")
	public static int field1232;

	@ObfuscatedName("OZIFXWPH.C")
	public int field1242;

	@ObfuscatedName("OZIFXWPH.a(II)I")
	public static int method416(int arg0, int arg1) {
		int var2 = method431(arg0 + 45365, arg1 + 91923, 4) + (method431(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method431(arg0, arg1, 1) - 128 >> 2) - 128;
		int var3 = (int) ((double) var2 * 0.3D) + 35;
		if (var3 < 10) {
			var3 = 10;
		} else if (var3 > 60) {
			var3 = 60;
		}
		return var3;
	}

	@ObfuscatedName("OZIFXWPH.a(ILEILHLJCE;LYSAVREBH;)V")
	public static void method417(class17 arg0, class71 arg1) {
		try {
			int var2 = -1;
			while (true) {
				int var3 = arg0.method238();
				if (var3 == 0) {
					return;
				}
				var2 += var3;
				class14 var4 = class14.method192(var2);
				var4.method191(arg1);
				while (true) {
					int var5 = arg0.method238();
					if (var5 == 0) {
						break;
					}
					arg0.method224();
				}
			}
		} catch (RuntimeException var7) {
			signlink.reporterror("14250, " + ", " + arg0 + ", " + arg1 + ", " + var7.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("OZIFXWPH.b(II)I")
	public static int method418(int arg0, int arg1) {
		int var2 = method429(arg0 - 1, arg1 - 1) + method429(arg0 + 1, arg1 - 1) + method429(arg0 - 1, arg1 + 1) + method429(arg0 + 1, arg1 + 1);
		int var3 = method429(arg0 - 1, arg1) + method429(arg0 + 1, arg1) + method429(arg0, arg1 - 1) + method429(arg0, arg1 + 1);
		int var4 = method429(arg0, arg1);
		return var2 / 16 + var3 / 8 + var4 / 4;
	}

	@ObfuscatedName("OZIFXWPH.c(II)I")
	public static int method419(int arg0, int arg1) {
		if (arg0 == -1) {
			return 12345678;
		}
		int var2 = arg1 * (arg0 & 0x7F) / 128;
		if (var2 < 2) {
			var2 = 2;
		} else if (var2 > 126) {
			var2 = 126;
		}
		return (arg0 & 0xFF80) + var2;
	}

	@ObfuscatedName("OZIFXWPH.a(IIII)I")
	public static int method421(int arg0, int arg1, int arg2, int arg3) {
		int var4 = 65536 - class21.field821[arg2 * 1024 / arg3] >> 1;
		return (arg0 * (65536 - var4) >> 16) + (arg1 * var4 >> 16);
	}

	@ObfuscatedName("OZIFXWPH.a(ILDYTTVJNT;LXOHMKFIT;III[[[IIIII)V")
	public static void method424(class16 arg0, class68 arg1, int arg2, int arg3, int arg4, int[][][] arg5, int arg6, int arg7, int arg8, int arg9) {
		try {
			int var10 = arg5[arg6][arg3][arg7];
			int var11 = arg5[arg6][arg3 + 1][arg7];
			int var12 = arg5[arg6][arg3 + 1][arg7 + 1];
			int var13 = arg5[arg6][arg3][arg7 + 1];
			int var14 = var10 + var11 + var12 + var13 >> 2;
			class14 var15 = class14.method192(arg2);
			int var16 = arg3 + (arg7 << 7) + (arg2 << 14) + 1073741824;
			if (!var15.field699) {
				var16 += Integer.MIN_VALUE;
			}
			byte var17 = (byte) ((arg8 << 6) + arg4);
			if (arg4 == 22) {
				class66 var18;
				if (var15.field694 == -1 && var15.field726 == null) {
					var18 = var15.method189(22, arg8, var10, var11, var12, var13, -1);
				} else {
					var18 = new class57(arg2, 22, var11, var15.field694, var13, true, arg8, var12, (byte) -59, var10);
				}
				arg1.method534(var17, (byte) 6, arg7, arg3, var14, arg9, var18, var16);
				if (var15.field698 && var15.field699) {
					arg0.method203(arg3, arg7);
				}
			} else if (arg4 == 10 || arg4 == 11) {
				class66 var19;
				if (var15.field694 == -1 && var15.field726 == null) {
					var19 = var15.method189(10, arg8, var10, var11, var12, var13, -1);
				} else {
					var19 = new class57(arg2, 10, var11, var15.field694, var13, true, arg8, var12, (byte) -59, var10);
				}
				if (var19 != null) {
					int var20 = 0;
					if (arg4 == 11) {
						var20 += 256;
					}
					int var21;
					int var22;
					if (arg8 == 1 || arg8 == 3) {
						var21 = var15.field703;
						var22 = var15.field708;
					} else {
						var21 = var15.field708;
						var22 = var15.field703;
					}
					arg1.method538(arg9, var22, var21, var17, arg3, var14, var16, var20, var19, arg7);
				}
				if (var15.field698) {
					arg0.method202(var15.field708, var15.field703, var15.field705, arg3, arg8, arg7);
				}
			} else if (arg4 >= 12) {
				class66 var23;
				if (var15.field694 == -1 && var15.field726 == null) {
					var23 = var15.method189(arg4, arg8, var10, var11, var12, var13, -1);
				} else {
					var23 = new class57(arg2, arg4, var11, var15.field694, var13, true, arg8, var12, (byte) -59, var10);
				}
				arg1.method538(arg9, 1, 1, var17, arg3, var14, var16, 0, var23, arg7);
				if (var15.field698) {
					arg0.method202(var15.field708, var15.field703, var15.field705, arg3, arg8, arg7);
				}
			} else if (arg4 == 0) {
				class66 var24;
				if (var15.field694 == -1 && var15.field726 == null) {
					var24 = var15.method189(0, arg8, var10, var11, var12, var13, -1);
				} else {
					var24 = new class57(arg2, 0, var11, var15.field694, var13, true, arg8, var12, (byte) -59, var10);
				}
				arg1.method536(field1225[arg8], arg7, null, var24, var16, 0, arg9, var14, var17, arg3);
				if (var15.field698) {
					arg0.method201(arg4, arg3, var15.field705, arg8, arg7);
				}
			} else if (arg4 == 1) {
				class66 var25;
				if (var15.field694 == -1 && var15.field726 == null) {
					var25 = var15.method189(1, arg8, var10, var11, var12, var13, -1);
				} else {
					var25 = new class57(arg2, 1, var11, var15.field694, var13, true, arg8, var12, (byte) -59, var10);
				}
				arg1.method536(field1234[arg8], arg7, null, var25, var16, 0, arg9, var14, var17, arg3);
				if (var15.field698) {
					arg0.method201(arg4, arg3, var15.field705, arg8, arg7);
				}
			} else if (arg4 == 2) {
				int var26 = arg8 + 1 & 0x3;
				class66 var27;
				class66 var28;
				if (var15.field694 == -1 && var15.field726 == null) {
					var27 = var15.method189(2, arg8 + 4, var10, var11, var12, var13, -1);
					var28 = var15.method189(2, var26, var10, var11, var12, var13, -1);
				} else {
					var27 = new class57(arg2, 2, var11, var15.field694, var13, true, arg8 + 4, var12, (byte) -59, var10);
					var28 = new class57(arg2, 2, var11, var15.field694, var13, true, var26, var12, (byte) -59, var10);
				}
				arg1.method536(field1225[arg8], arg7, var28, var27, var16, field1225[var26], arg9, var14, var17, arg3);
				if (var15.field698) {
					arg0.method201(arg4, arg3, var15.field705, arg8, arg7);
				}
			} else if (arg4 == 3) {
				class66 var29;
				if (var15.field694 == -1 && var15.field726 == null) {
					var29 = var15.method189(3, arg8, var10, var11, var12, var13, -1);
				} else {
					var29 = new class57(arg2, 3, var11, var15.field694, var13, true, arg8, var12, (byte) -59, var10);
				}
				arg1.method536(field1234[arg8], arg7, null, var29, var16, 0, arg9, var14, var17, arg3);
				if (var15.field698) {
					arg0.method201(arg4, arg3, var15.field705, arg8, arg7);
				}
			} else if (arg4 == 9) {
				class66 var30;
				if (var15.field694 == -1 && var15.field726 == null) {
					var30 = var15.method189(arg4, arg8, var10, var11, var12, var13, -1);
				} else {
					var30 = new class57(arg2, arg4, var11, var15.field694, var13, true, arg8, var12, (byte) -59, var10);
				}
				arg1.method538(arg9, 1, 1, var17, arg3, var14, var16, 0, var30, arg7);
				if (var15.field698) {
					arg0.method202(var15.field708, var15.field703, var15.field705, arg3, arg8, arg7);
				}
			} else {
				if (var15.field728) {
					if (arg8 == 1) {
						int var31 = var13;
						var13 = var12;
						var12 = var11;
						var11 = var10;
						var10 = var31;
					} else if (arg8 == 2) {
						int var32 = var13;
						var13 = var11;
						var11 = var32;
						int var33 = var12;
						var12 = var10;
						var10 = var33;
					} else if (arg8 == 3) {
						int var34 = var13;
						var13 = var10;
						var10 = var11;
						var11 = var12;
						var12 = var34;
					}
				}
				if (arg4 == 4) {
					class66 var35;
					if (var15.field694 == -1 && var15.field726 == null) {
						var35 = var15.method189(4, 0, var10, var11, var12, var13, -1);
					} else {
						var35 = new class57(arg2, 4, var11, var15.field694, var13, true, 0, var12, (byte) -59, var10);
					}
					arg1.method537(0, var14, arg7, field1225[arg8], var16, 0, arg8 * 512, var35, arg3, var17, arg9);
				} else if (arg4 == 5) {
					int var36 = 16;
					int var37 = arg1.method554(arg9, arg3, arg7);
					if (var37 > 0) {
						var36 = class14.method192(var37 >> 14 & 0x7FFF).field731;
					}
					class66 var38;
					if (var15.field694 == -1 && var15.field726 == null) {
						var38 = var15.method189(4, 0, var10, var11, var12, var13, -1);
					} else {
						var38 = new class57(arg2, 4, var11, var15.field694, var13, true, 0, var12, (byte) -59, var10);
					}
					arg1.method537(field1229[arg8] * var36, var14, arg7, field1225[arg8], var16, field1238[arg8] * var36, arg8 * 512, var38, arg3, var17, arg9);
				} else if (arg4 == 6) {
					class66 var39;
					if (var15.field694 == -1 && var15.field726 == null) {
						var39 = var15.method189(4, 0, var10, var11, var12, var13, -1);
					} else {
						var39 = new class57(arg2, 4, var11, var15.field694, var13, true, 0, var12, (byte) -59, var10);
					}
					arg1.method537(0, var14, arg7, 256, var16, 0, arg8, var39, arg3, var17, arg9);
				} else if (arg4 == 7) {
					class66 var40;
					if (var15.field694 == -1 && var15.field726 == null) {
						var40 = var15.method189(4, 0, var10, var11, var12, var13, -1);
					} else {
						var40 = new class57(arg2, 4, var11, var15.field694, var13, true, 0, var12, (byte) -59, var10);
					}
					arg1.method537(0, var14, arg7, 512, var16, 0, arg8, var40, arg3, var17, arg9);
				} else if (arg4 == 8) {
					class66 var41;
					if (var15.field694 == -1 && var15.field726 == null) {
						var41 = var15.method189(4, 0, var10, var11, var12, var13, -1);
					} else {
						var41 = new class57(arg2, 4, var11, var15.field694, var13, true, 0, var12, (byte) -59, var10);
					}
					arg1.method537(0, var14, arg7, 768, var16, 0, arg8, var41, arg3, var17, arg9);
				}
			}
		} catch (RuntimeException var43) {
			signlink.reporterror("8157, " + 863 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + var43.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("OZIFXWPH.e(II)I")
	public static int method429(int arg0, int arg1) {
		int var2 = arg0 + arg1 * 57;
		int var3 = var2 << 13 ^ var2;
		int var4 = var3 * (var3 * var3 * 15731 + 789221) + 1376312589 & Integer.MAX_VALUE;
		return var4 >> 19 & 0xFF;
	}

	@ObfuscatedName("OZIFXWPH.b(III)I")
	public static int method431(int arg0, int arg1, int arg2) {
		int var3 = arg0 / arg2;
		int var4 = arg0 & arg2 - 1;
		int var5 = arg1 / arg2;
		int var6 = arg1 & arg2 - 1;
		int var7 = method418(var3, var5);
		int var8 = method418(var3 + 1, var5);
		int var9 = method418(var3, var5 + 1);
		int var10 = method418(var3 + 1, var5 + 1);
		int var11 = method421(var7, var8, var4, arg2);
		int var12 = method421(var9, var10, var4, arg2);
		return method421(var11, var12, var6, arg2);
	}

	@ObfuscatedName("OZIFXWPH.a(I[BII)Z")
	public static boolean method433(byte[] arg0, int arg1, int arg2) {
		try {
			boolean var3 = true;
			class17 var4 = new class17(arg0, -26583);
			int var5 = -1;
			label53: while (true) {
				int var6 = var4.method238();
				if (var6 == 0) {
					return var3;
				}
				var5 += var6;
				int var7 = 0;
				boolean var8 = false;
				while (true) {
					while (!var8) {
						int var10 = var4.method238();
						if (var10 == 0) {
							continue label53;
						}
						var7 += var10 - 1;
						int var11 = var7 & 0x3F;
						int var12 = var7 >> 6 & 0x3F;
						int var13 = var4.method224() >> 2;
						int var14 = var12 + arg1;
						int var15 = var11 + arg2;
						if (var14 > 0 && var15 > 0 && var14 < 103 && var15 < 103) {
							class14 var16 = class14.method192(var5);
							if (var13 != 22 || !field1228 || var16.field699 || var16.field701) {
								var3 &= var16.method188();
								var8 = true;
							}
						}
					}
					int var9 = var4.method238();
					if (var9 == 0) {
						break;
					}
					var4.method224();
				}
			}
		} catch (RuntimeException var18) {
			signlink.reporterror("16156, " + 514 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + var18.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("OZIFXWPH.c(III)Z")
	public static boolean method436(int arg0, int arg1) {
		try {
			class14 var2 = class14.method192(arg1);
			if (arg0 == 11) {
				arg0 = 10;
			}
			if (arg0 >= 5 && arg0 <= 8) {
				arg0 = 4;
			}
			return var2.method190(arg0);
		} catch (RuntimeException var4) {
			signlink.reporterror("19202, " + arg0 + ", " + -11550 + ", " + arg1 + ", " + var4.toString());
			throw new RuntimeException();
		}
	}

	public class44(int[][][] arg0, int arg1, int arg2, byte[][][] arg3, int arg4) {
		try {
			field1239 = 99;
			this.field1240 = 104;
			if (arg2 != 8) {
				throw new NullPointerException();
			}
			this.field1241 = 104;
			this.field1244 = arg0;
			this.field1222 = arg3;
			this.field1236 = new byte[4][this.field1240][this.field1241];
			this.field1243 = new byte[4][this.field1240][this.field1241];
			this.field1223 = new byte[4][this.field1240][this.field1241];
			this.field1231 = new byte[4][this.field1240][this.field1241];
			this.field1237 = new int[4][this.field1240 + 1][this.field1241 + 1];
			this.field1216 = new byte[4][this.field1240 + 1][this.field1241 + 1];
			this.field1233 = new int[this.field1240 + 1][this.field1241 + 1];
			this.field1217 = new int[this.field1241];
			this.field1218 = new int[this.field1241];
			this.field1219 = new int[this.field1241];
			this.field1220 = new int[this.field1241];
			this.field1221 = new int[this.field1241];
		} catch (RuntimeException var7) {
			signlink.reporterror("38021, " + arg0 + ", " + 104 + ", " + arg2 + ", " + arg3 + ", " + 104 + ", " + var7.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("OZIFXWPH.a(IIIZ)I")
	public int method420(int arg0, int arg1, int arg2) {
		try {
			if ((this.field1222[arg2][arg0][arg1] & 0x8) == 0) {
				return arg2 <= 0 || (this.field1222[1][arg0][arg1] & 0x2) == 0 ? arg2 : arg2 - 1;
			} else {
				return 0;
			}
		} catch (RuntimeException var5) {
			signlink.reporterror("68178, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + false + ", " + var5.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("OZIFXWPH.d(II)I")
	public int method422(int arg0, int arg1) {
		if (arg0 == -2) {
			return 12345678;
		} else if (arg0 == -1) {
			if (arg1 < 0) {
				arg1 = 0;
			} else if (arg1 > 127) {
				arg1 = 127;
			}
			return 127 - arg1;
		} else {
			int var4 = arg1 * (arg0 & 0x7F) / 128;
			if (var4 < 2) {
				var4 = 2;
			} else if (var4 > 126) {
				var4 = 126;
			}
			return (arg0 & 0xFF80) + var4;
		}
	}

	@ObfuscatedName("OZIFXWPH.a(IIIIB)V")
	public void method423(int arg0, int arg1, int arg2, int arg3) {
		try {
			for (int var5 = arg0; var5 <= arg0 + arg2; var5++) {
				for (int var6 = arg3; var6 <= arg3 + arg1; var6++) {
					if (var6 >= 0 && var6 < this.field1240 && var5 >= 0 && var5 < this.field1241) {
						this.field1216[0][var6][var5] = 127;
						if (var6 == arg3 && var6 > 0) {
							this.field1244[0][var6][var5] = this.field1244[0][var6 - 1][var5];
						}
						if (var6 == arg3 + arg1 && var6 < this.field1240 - 1) {
							this.field1244[0][var6][var5] = this.field1244[0][var6 + 1][var5];
						}
						if (var5 == arg0 && var5 > 0) {
							this.field1244[0][var6][var5] = this.field1244[0][var6][var5 - 1];
						}
						if (var5 == arg0 + arg2 && var5 < this.field1241 - 1) {
							this.field1244[0][var6][var5] = this.field1244[0][var6][var5 + 1];
						}
					}
				}
			}
		} catch (RuntimeException var8) {
			signlink.reporterror("33423, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 9 + ", " + var8.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("OZIFXWPH.a(III)I")
	public int method425(int arg0, int arg1, int arg2) {
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

	@ObfuscatedName("OZIFXWPH.a(IIILXOHMKFIT;II[B[LDYTTVJNT;ZII)V")
	public void method426(int arg0, int arg1, int arg2, class68 arg3, int arg4, int arg5, byte[] arg6, class16[] arg7, int arg8, int arg9) {
		try {
			class17 var11 = new class17(arg6, -26583);
			int var12 = -1;
			while (true) {
				int var13 = var11.method238();
				if (var13 == 0) {
					return;
				}
				var12 += var13;
				int var14 = 0;
				while (true) {
					int var15 = var11.method238();
					if (var15 == 0) {
						break;
					}
					var14 += var15 - 1;
					int var16 = var14 & 0x3F;
					int var17 = var14 >> 6 & 0x3F;
					int var18 = var14 >> 12;
					int var19 = var11.method224();
					int var20 = var19 >> 2;
					int var21 = var19 & 0x3;
					if (var18 == arg2 && var17 >= arg5 && var17 < arg5 + 8 && var16 >= arg4 && var16 < arg4 + 8) {
						class14 var22 = class14.method192(var12);
						int var23 = arg0 + class48.method441(arg9, var16 & 0x7, var17 & 0x7, var21, var22.field703, var22.field708);
						int var24 = arg8 + class48.method442(var22.field703, var21, arg9, var17 & 0x7, var22.field708, var16 & 0x7, 825);
						if (var23 > 0 && var24 > 0 && var23 < 103 && var24 < 103) {
							int var25 = arg1;
							if ((this.field1222[1][var23][var24] & 0x2) == 2) {
								var25 = arg1 - 1;
							}
							class16 var26 = null;
							if (var25 >= 0) {
								var26 = arg7[var25];
							}
							this.method432(arg1, var24, var23, var20, var12, var21 + arg9 & 0x3, arg3, var26, this.field1215);
						}
					}
				}
			}
		} catch (RuntimeException var28) {
			signlink.reporterror("51697, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + false + ", " + arg8 + ", " + arg9 + ", " + var28.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("OZIFXWPH.a(BIIILEILHLJCE;III)V")
	public void method427(byte arg0, int arg1, int arg2, int arg3, class17 arg4, int arg5, int arg6, int arg7) {
		try {
			boolean var14 = false;
			if (arg2 >= 0 && arg2 < 104 && arg1 >= 0 && arg1 < 104) {
				this.field1222[arg5][arg2][arg1] = 0;
				while (true) {
					int var9 = arg4.method224();
					if (var9 == 0) {
						if (arg5 == 0) {
							this.field1244[0][arg2][arg1] = -method416(arg2 + arg6 + 932731, arg1 + 556238 + arg3) * 8;
							return;
						} else {
							this.field1244[arg5][arg2][arg1] = this.field1244[arg5 - 1][arg2][arg1] - 240;
							return;
						}
					}
					if (var9 == 1) {
						int var10 = arg4.method224();
						if (var10 == 1) {
							var10 = 0;
						}
						if (arg5 == 0) {
							this.field1244[0][arg2][arg1] = -var10 * 8;
							return;
						}
						this.field1244[arg5][arg2][arg1] = this.field1244[arg5 - 1][arg2][arg1] - var10 * 8;
						return;
					}
					if (var9 <= 49) {
						this.field1243[arg5][arg2][arg1] = arg4.method225();
						this.field1223[arg5][arg2][arg1] = (byte) ((var9 - 2) / 4);
						this.field1231[arg5][arg2][arg1] = (byte) (var9 + arg7 - 2 & 0x3);
					} else if (var9 <= 81) {
						this.field1222[arg5][arg2][arg1] = (byte) (var9 - 49);
					} else {
						this.field1236[arg5][arg2][arg1] = (byte) (var9 - 81);
					}
				}
			} else {
				while (true) {
					int var11 = arg4.method224();
					if (var11 == 0) {
						return;
					}
					if (var11 == 1) {
						arg4.method224();
						return;
					}
					if (var11 <= 49) {
						arg4.method224();
					}
				}
			}
		} catch (RuntimeException var13) {
			signlink.reporterror("13845, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + var13.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("OZIFXWPH.a(IZI[BLXOHMKFIT;[LDYTTVJNT;)V")
	public void method428(int arg0, int arg1, byte[] arg2, class68 arg3, class16[] arg4) {
		try {
			class17 var6 = new class17(arg2, -26583);
			int var7 = -1;
			while (true) {
				int var8 = var6.method238();
				if (var8 == 0) {
					return;
				}
				var7 += var8;
				int var9 = 0;
				while (true) {
					int var10 = var6.method238();
					if (var10 == 0) {
						break;
					}
					var9 += var10 - 1;
					int var11 = var9 & 0x3F;
					int var12 = var9 >> 6 & 0x3F;
					int var13 = var9 >> 12;
					int var14 = var6.method224();
					int var15 = var14 >> 2;
					int var16 = var14 & 0x3;
					int var17 = var12 + arg0;
					int var18 = var11 + arg1;
					if (var17 > 0 && var18 > 0 && var17 < 103 && var18 < 103) {
						int var19 = var13;
						if ((this.field1222[1][var17][var18] & 0x2) == 2) {
							var19 = var13 - 1;
						}
						class16 var20 = null;
						if (var19 >= 0) {
							var20 = arg4[var19];
						}
						this.method432(var13, var18, var17, var15, var7, var16, arg3, var20, this.field1215);
					}
				}
			}
		} catch (RuntimeException var22) {
			signlink.reporterror("92332, " + arg0 + ", " + true + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + var22.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("OZIFXWPH.a([LDYTTVJNT;ZLXOHMKFIT;)V")
	public void method430(class16[] arg0, class68 arg1) {
		try {
			for (int var3 = 0; var3 < 4; var3++) {
				for (int var4 = 0; var4 < 104; var4++) {
					for (int var5 = 0; var5 < 104; var5++) {
						if ((this.field1222[var3][var4][var5] & 0x1) == 1) {
							int var6 = var3;
							if ((this.field1222[1][var4][var5] & 0x2) == 2) {
								var6 = var3 - 1;
							}
							if (var6 >= 0) {
								arg0[var6].method203(var4, var5);
							}
						}
					}
				}
			}
			field1235 += (int) (Math.random() * 5.0D) - 2;
			if (field1235 < -8) {
				field1235 = -8;
			}
			if (field1235 > 8) {
				field1235 = 8;
			}
			field1224 += (int) (Math.random() * 5.0D) - 2;
			if (field1224 < -16) {
				field1224 = -16;
			}
			if (field1224 > 16) {
				field1224 = 16;
			}
			for (int var7 = 0; var7 < 4; var7++) {
				byte[][] var8 = this.field1216[var7];
				int var9 = (int) Math.sqrt((double) 5100);
				int var10 = var9 * 768 >> 8;
				for (int var11 = 1; var11 < this.field1241 - 1; var11++) {
					for (int var12 = 1; var12 < this.field1240 - 1; var12++) {
						int var13 = this.field1244[var7][var12 + 1][var11] - this.field1244[var7][var12 - 1][var11];
						int var14 = this.field1244[var7][var12][var11 + 1] - this.field1244[var7][var12][var11 - 1];
						int var15 = (int) Math.sqrt((double) (var13 * var13 + var14 * var14 + 65536));
						int var16 = (var13 << 8) / var15;
						int var17 = 65536 / var15;
						int var18 = (var14 << 8) / var15;
						int var19 = (var16 * -50 + var17 * -10 + var18 * -50) / var10 + 96;
						int var20 = (var8[var12 - 1][var11] >> 2) + (var8[var12 + 1][var11] >> 3) + (var8[var12][var11 - 1] >> 2) + (var8[var12][var11 + 1] >> 3) + (var8[var12][var11] >> 1);
						this.field1233[var12][var11] = var19 - var20;
					}
				}
				for (int var21 = 0; var21 < this.field1241; var21++) {
					this.field1217[var21] = 0;
					this.field1218[var21] = 0;
					this.field1219[var21] = 0;
					this.field1220[var21] = 0;
					this.field1221[var21] = 0;
				}
				for (int var22 = -5; var22 < this.field1240 + 5; var22++) {
					for (int var23 = 0; var23 < this.field1241; var23++) {
						int var24 = var22 + 5;
						int var10002;
						if (var24 >= 0 && var24 < this.field1240) {
							int var25 = this.field1236[var7][var24][var23] & 0xFF;
							if (var25 > 0) {
								class52 var26 = class52.field1338[var25 - 1];
								this.field1217[var23] += var26.field1347;
								this.field1218[var23] += var26.field1345;
								this.field1219[var23] += var26.field1346;
								this.field1220[var23] += var26.field1348;
								var10002 = this.field1221[var23]++;
							}
						}
						int var27 = var22 - 5;
						if (var27 >= 0 && var27 < this.field1240) {
							int var28 = this.field1236[var7][var27][var23] & 0xFF;
							if (var28 > 0) {
								class52 var29 = class52.field1338[var28 - 1];
								this.field1217[var23] -= var29.field1347;
								this.field1218[var23] -= var29.field1345;
								this.field1219[var23] -= var29.field1346;
								this.field1220[var23] -= var29.field1348;
								var10002 = this.field1221[var23]--;
							}
						}
					}
					if (var22 >= 1 && var22 < this.field1240 - 1) {
						int var30 = 0;
						int var31 = 0;
						int var32 = 0;
						int var33 = 0;
						int var34 = 0;
						for (int var35 = -5; var35 < this.field1241 + 5; var35++) {
							int var36 = var35 + 5;
							if (var36 >= 0 && var36 < this.field1241) {
								var30 += this.field1217[var36];
								var31 += this.field1218[var36];
								var32 += this.field1219[var36];
								var33 += this.field1220[var36];
								var34 += this.field1221[var36];
							}
							int var37 = var35 - 5;
							if (var37 >= 0 && var37 < this.field1241) {
								var30 -= this.field1217[var37];
								var31 -= this.field1218[var37];
								var32 -= this.field1219[var37];
								var33 -= this.field1220[var37];
								var34 -= this.field1221[var37];
							}
							if (var35 >= 1 && var35 < this.field1241 - 1 && (!field1228 || (this.field1222[0][var22][var35] & 0x2) != 0 || (this.field1222[var7][var22][var35] & 0x10) == 0 && this.method420(var22, var35, var7) == field1232)) {
								if (var7 < field1239) {
									field1239 = var7;
								}
								int var38 = this.field1236[var7][var22][var35] & 0xFF;
								int var39 = this.field1243[var7][var22][var35] & 0xFF;
								if (var38 > 0 || var39 > 0) {
									int var40 = this.field1244[var7][var22][var35];
									int var41 = this.field1244[var7][var22 + 1][var35];
									int var42 = this.field1244[var7][var22 + 1][var35 + 1];
									int var43 = this.field1244[var7][var22][var35 + 1];
									int var44 = this.field1233[var22][var35];
									int var45 = this.field1233[var22 + 1][var35];
									int var46 = this.field1233[var22 + 1][var35 + 1];
									int var47 = this.field1233[var22][var35 + 1];
									int var48 = -1;
									int var49 = -1;
									if (var38 > 0) {
										int var50 = var30 * 256 / var33;
										int var51 = var31 / var34;
										int var52 = var32 / var34;
										var48 = this.method425(var50, var51, var52);
										int var53 = var50 + field1235 & 0xFF;
										int var54 = var52 + field1224;
										if (var54 < 0) {
											var54 = 0;
										} else if (var54 > 255) {
											var54 = 255;
										}
										var49 = this.method425(var53, var51, var54);
									}
									if (var7 > 0) {
										boolean var55 = true;
										if (var38 == 0 && this.field1223[var7][var22][var35] != 0) {
											var55 = false;
										}
										if (var39 > 0 && !class52.field1338[var39 - 1].field1343) {
											var55 = false;
										}
										if (var55 && var40 == var41 && var40 == var42 && var40 == var43) {
											this.field1237[var7][var22][var35] |= 0x924;
										}
									}
									int var56 = 0;
									if (var48 != -1) {
										var56 = class21.field832[method419(var49, 96)];
									}
									if (var39 == 0) {
										arg1.method533(var7, var22, var35, 0, 0, -1, var40, var41, var42, var43, method419(var48, var44), method419(var48, var45), method419(var48, var46), method419(var48, var47), 0, 0, 0, 0, var56, 0);
									} else {
										int var57 = this.field1223[var7][var22][var35] + 1;
										byte var58 = this.field1231[var7][var22][var35];
										class52 var59 = class52.field1338[var39 - 1];
										int var60 = var59.field1341;
										int var61;
										int var62;
										if (var60 >= 0) {
											var61 = class21.method286(this.field1242, var60);
											var62 = -1;
										} else if (var59.field1340 == 16711935) {
											var61 = 0;
											var62 = -2;
											var60 = -1;
										} else {
											var62 = this.method425(var59.field1344, var59.field1345, var59.field1346);
											var61 = class21.field832[this.method422(var59.field1349, 96)];
										}
										arg1.method533(var7, var22, var35, var57, var58, var60, var40, var41, var42, var43, method419(var48, var44), method419(var48, var45), method419(var48, var46), method419(var48, var47), this.method422(var62, var44), this.method422(var62, var45), this.method422(var62, var46), this.method422(var62, var47), var56, var61);
									}
								}
							}
						}
					}
				}
				for (int var63 = 1; var63 < this.field1241 - 1; var63++) {
					for (int var64 = 1; var64 < this.field1240 - 1; var64++) {
						arg1.method532(var7, var64, var63, this.method420(var64, var63, var7));
					}
				}
			}
			arg1.method559();
			for (int var65 = 0; var65 < this.field1240; var65++) {
				for (int var66 = 0; var66 < this.field1241; var66++) {
					if ((this.field1222[1][var65][var66] & 0x2) == 2) {
						arg1.method530(var66, var65);
					}
				}
			}
			int var67 = 1;
			int var68 = 2;
			int var69 = 4;
			for (int var70 = 0; var70 < 4; var70++) {
				if (var70 > 0) {
					var67 <<= 0x3;
					var68 <<= 0x3;
					var69 <<= 0x3;
				}
				for (int var71 = 0; var71 <= var70; var71++) {
					for (int var72 = 0; var72 <= this.field1241; var72++) {
						for (int var73 = 0; var73 <= this.field1240; var73++) {
							if ((this.field1237[var71][var73][var72] & var67) != 0) {
								int var74 = var72;
								int var75 = var72;
								int var76 = var71;
								int var77 = var71;
								while (var74 > 0 && (this.field1237[var71][var73][var74 - 1] & var67) != 0) {
									var74--;
								}
								while (var75 < this.field1241 && (this.field1237[var71][var73][var75 + 1] & var67) != 0) {
									var75++;
								}
								label328: while (var76 > 0) {
									for (int var78 = var74; var78 <= var75; var78++) {
										if ((this.field1237[var76 - 1][var73][var78] & var67) == 0) {
											break label328;
										}
									}
									var76--;
								}
								label317: while (var77 < var70) {
									for (int var79 = var74; var79 <= var75; var79++) {
										if ((this.field1237[var77 + 1][var73][var79] & var67) == 0) {
											break label317;
										}
									}
									var77++;
								}
								int var80 = (var77 + 1 - var76) * (var75 + 1 - var74);
								if (var80 >= 8) {
									int var81 = this.field1244[var77][var73][var74] - 240;
									int var82 = this.field1244[var76][var73][var74];
									class68.method531(var75 * 128 + 128, var81, 1, var73 * 128, var82, var74 * 128, (byte) 5, var73 * 128, var70);
									for (int var83 = var76; var83 <= var77; var83++) {
										for (int var84 = var74; var84 <= var75; var84++) {
											this.field1237[var83][var73][var84] &= ~var67;
										}
									}
								}
							}
							if ((this.field1237[var71][var73][var72] & var68) != 0) {
								int var85 = var73;
								int var86 = var73;
								int var87 = var71;
								int var88 = var71;
								while (var85 > 0 && (this.field1237[var71][var85 - 1][var72] & var68) != 0) {
									var85--;
								}
								while (var86 < this.field1240 && (this.field1237[var71][var86 + 1][var72] & var68) != 0) {
									var86++;
								}
								label381: while (var87 > 0) {
									for (int var89 = var85; var89 <= var86; var89++) {
										if ((this.field1237[var87 - 1][var89][var72] & var68) == 0) {
											break label381;
										}
									}
									var87--;
								}
								label370: while (var88 < var70) {
									for (int var90 = var85; var90 <= var86; var90++) {
										if ((this.field1237[var88 + 1][var90][var72] & var68) == 0) {
											break label370;
										}
									}
									var88++;
								}
								int var91 = (var88 + 1 - var87) * (var86 + 1 - var85);
								if (var91 >= 8) {
									int var92 = this.field1244[var88][var85][var72] - 240;
									int var93 = this.field1244[var87][var85][var72];
									class68.method531(var72 * 128, var92, 2, var86 * 128 + 128, var93, var72 * 128, (byte) 5, var85 * 128, var70);
									for (int var94 = var87; var94 <= var88; var94++) {
										for (int var95 = var85; var95 <= var86; var95++) {
											this.field1237[var94][var95][var72] &= ~var68;
										}
									}
								}
							}
							if ((this.field1237[var71][var73][var72] & var69) != 0) {
								int var96 = var73;
								int var97 = var73;
								int var98 = var72;
								int var99 = var72;
								while (var98 > 0 && (this.field1237[var71][var73][var98 - 1] & var69) != 0) {
									var98--;
								}
								while (var99 < this.field1241 && (this.field1237[var71][var73][var99 + 1] & var69) != 0) {
									var99++;
								}
								label434: while (var96 > 0) {
									for (int var100 = var98; var100 <= var99; var100++) {
										if ((this.field1237[var71][var96 - 1][var100] & var69) == 0) {
											break label434;
										}
									}
									var96--;
								}
								label423: while (var97 < this.field1240) {
									for (int var101 = var98; var101 <= var99; var101++) {
										if ((this.field1237[var71][var97 + 1][var101] & var69) == 0) {
											break label423;
										}
									}
									var97++;
								}
								if ((var97 + 1 - var96) * (var99 + 1 - var98) >= 4) {
									int var102 = this.field1244[var71][var96][var98];
									class68.method531(var99 * 128 + 128, var102, 4, var97 * 128 + 128, var102, var98 * 128, (byte) 5, var96 * 128, var70);
									for (int var103 = var96; var103 <= var97; var103++) {
										for (int var104 = var98; var104 <= var99; var104++) {
											this.field1237[var71][var103][var104] &= ~var69;
										}
									}
								}
							}
						}
					}
				}
			}
		} catch (RuntimeException var106) {
			signlink.reporterror("79814, " + arg0 + ", " + false + ", " + arg1 + ", " + var106.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("OZIFXWPH.a(IIIIIILXOHMKFIT;LDYTTVJNT;I)V")
	public void method432(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class68 arg6, class16 arg7, int arg8) {
		try {
			if (field1228 && (this.field1222[0][arg2][arg1] & 0x2) == 0) {
				if ((this.field1222[arg0][arg2][arg1] & 0x10) != 0) {
					return;
				}
				if (this.method420(arg2, arg1, arg0) != field1232) {
					return;
				}
			}
			if (arg0 < field1239) {
				field1239 = arg0;
			}
			int var10 = this.field1244[arg0][arg2][arg1];
			int var11 = this.field1244[arg0][arg2 + 1][arg1];
			int var12 = this.field1244[arg0][arg2 + 1][arg1 + 1];
			int var13 = this.field1244[arg0][arg2][arg1 + 1];
			int var14 = var10 + var11 + var12 + var13 >> 2;
			class14 var15 = class14.method192(arg4);
			int var48 = 92 / arg8;
			int var16 = arg2 + (arg1 << 7) + (arg4 << 14) + 1073741824;
			if (!var15.field699) {
				var16 += Integer.MIN_VALUE;
			}
			byte var17 = (byte) ((arg5 << 6) + arg3);
			if (arg3 == 22) {
				if (!field1228 || var15.field699 || var15.field701) {
					class66 var18;
					if (var15.field694 == -1 && var15.field726 == null) {
						var18 = var15.method189(22, arg5, var10, var11, var12, var13, -1);
					} else {
						var18 = new class57(arg4, 22, var11, var15.field694, var13, true, arg5, var12, (byte) -59, var10);
					}
					arg6.method534(var17, (byte) 6, arg1, arg2, var14, arg0, var18, var16);
					if (var15.field698 && var15.field699 && arg7 != null) {
						arg7.method203(arg2, arg1);
					}
				}
			} else if (arg3 == 10 || arg3 == 11) {
				class66 var19;
				if (var15.field694 == -1 && var15.field726 == null) {
					var19 = var15.method189(10, arg5, var10, var11, var12, var13, -1);
				} else {
					var19 = new class57(arg4, 10, var11, var15.field694, var13, true, arg5, var12, (byte) -59, var10);
				}
				if (var19 != null) {
					int var20 = 0;
					if (arg3 == 11) {
						var20 += 256;
					}
					int var21;
					int var22;
					if (arg5 == 1 || arg5 == 3) {
						var21 = var15.field703;
						var22 = var15.field708;
					} else {
						var21 = var15.field708;
						var22 = var15.field703;
					}
					if (arg6.method538(arg0, var22, var21, var17, arg2, var14, var16, var20, var19, arg1) && var15.field719) {
						class31 var23;
						if (var19 instanceof class31) {
							var23 = (class31) var19;
						} else {
							var23 = var15.method189(10, arg5, var10, var11, var12, var13, -1);
						}
						if (var23 != null) {
							for (int var24 = 0; var24 <= var21; var24++) {
								for (int var25 = 0; var25 <= var22; var25++) {
									int var26 = var23.field1024 / 4;
									if (var26 > 30) {
										var26 = 30;
									}
									if (var26 > this.field1216[arg0][arg2 + var24][arg1 + var25]) {
										this.field1216[arg0][arg2 + var24][arg1 + var25] = (byte) var26;
									}
								}
							}
						}
					}
				}
				if (var15.field698 && arg7 != null) {
					arg7.method202(var15.field708, var15.field703, var15.field705, arg2, arg5, arg1);
				}
			} else if (arg3 >= 12) {
				class66 var27;
				if (var15.field694 == -1 && var15.field726 == null) {
					var27 = var15.method189(arg3, arg5, var10, var11, var12, var13, -1);
				} else {
					var27 = new class57(arg4, arg3, var11, var15.field694, var13, true, arg5, var12, (byte) -59, var10);
				}
				arg6.method538(arg0, 1, 1, var17, arg2, var14, var16, 0, var27, arg1);
				if (arg3 >= 12 && arg3 <= 17 && arg3 != 13 && arg0 > 0) {
					this.field1237[arg0][arg2][arg1] |= 0x924;
				}
				if (var15.field698 && arg7 != null) {
					arg7.method202(var15.field708, var15.field703, var15.field705, arg2, arg5, arg1);
				}
			} else if (arg3 == 0) {
				class66 var28;
				if (var15.field694 == -1 && var15.field726 == null) {
					var28 = var15.method189(0, arg5, var10, var11, var12, var13, -1);
				} else {
					var28 = new class57(arg4, 0, var11, var15.field694, var13, true, arg5, var12, (byte) -59, var10);
				}
				arg6.method536(field1225[arg5], arg1, null, var28, var16, 0, arg0, var14, var17, arg2);
				if (arg5 == 0) {
					if (var15.field719) {
						this.field1216[arg0][arg2][arg1] = 50;
						this.field1216[arg0][arg2][arg1 + 1] = 50;
					}
					if (var15.field707) {
						this.field1237[arg0][arg2][arg1] |= 0x249;
					}
				} else if (arg5 == 1) {
					if (var15.field719) {
						this.field1216[arg0][arg2][arg1 + 1] = 50;
						this.field1216[arg0][arg2 + 1][arg1 + 1] = 50;
					}
					if (var15.field707) {
						this.field1237[arg0][arg2][arg1 + 1] |= 0x492;
					}
				} else if (arg5 == 2) {
					if (var15.field719) {
						this.field1216[arg0][arg2 + 1][arg1] = 50;
						this.field1216[arg0][arg2 + 1][arg1 + 1] = 50;
					}
					if (var15.field707) {
						this.field1237[arg0][arg2 + 1][arg1] |= 0x249;
					}
				} else if (arg5 == 3) {
					if (var15.field719) {
						this.field1216[arg0][arg2][arg1] = 50;
						this.field1216[arg0][arg2 + 1][arg1] = 50;
					}
					if (var15.field707) {
						this.field1237[arg0][arg2][arg1] |= 0x492;
					}
				}
				if (var15.field698 && arg7 != null) {
					arg7.method201(arg3, arg2, var15.field705, arg5, arg1);
				}
				if (var15.field731 != 16) {
					arg6.method544(arg0, arg1, arg2, var15.field731);
				}
			} else if (arg3 == 1) {
				class66 var29;
				if (var15.field694 == -1 && var15.field726 == null) {
					var29 = var15.method189(1, arg5, var10, var11, var12, var13, -1);
				} else {
					var29 = new class57(arg4, 1, var11, var15.field694, var13, true, arg5, var12, (byte) -59, var10);
				}
				arg6.method536(field1234[arg5], arg1, null, var29, var16, 0, arg0, var14, var17, arg2);
				if (var15.field719) {
					if (arg5 == 0) {
						this.field1216[arg0][arg2][arg1 + 1] = 50;
					} else if (arg5 == 1) {
						this.field1216[arg0][arg2 + 1][arg1 + 1] = 50;
					} else if (arg5 == 2) {
						this.field1216[arg0][arg2 + 1][arg1] = 50;
					} else if (arg5 == 3) {
						this.field1216[arg0][arg2][arg1] = 50;
					}
				}
				if (var15.field698 && arg7 != null) {
					arg7.method201(arg3, arg2, var15.field705, arg5, arg1);
				}
			} else if (arg3 == 2) {
				int var30 = arg5 + 1 & 0x3;
				class66 var31;
				class66 var32;
				if (var15.field694 == -1 && var15.field726 == null) {
					var31 = var15.method189(2, arg5 + 4, var10, var11, var12, var13, -1);
					var32 = var15.method189(2, var30, var10, var11, var12, var13, -1);
				} else {
					var31 = new class57(arg4, 2, var11, var15.field694, var13, true, arg5 + 4, var12, (byte) -59, var10);
					var32 = new class57(arg4, 2, var11, var15.field694, var13, true, var30, var12, (byte) -59, var10);
				}
				arg6.method536(field1225[arg5], arg1, var32, var31, var16, field1225[var30], arg0, var14, var17, arg2);
				if (var15.field707) {
					if (arg5 == 0) {
						this.field1237[arg0][arg2][arg1] |= 0x249;
						this.field1237[arg0][arg2][arg1 + 1] |= 0x492;
					} else if (arg5 == 1) {
						this.field1237[arg0][arg2][arg1 + 1] |= 0x492;
						this.field1237[arg0][arg2 + 1][arg1] |= 0x249;
					} else if (arg5 == 2) {
						this.field1237[arg0][arg2 + 1][arg1] |= 0x249;
						this.field1237[arg0][arg2][arg1] |= 0x492;
					} else if (arg5 == 3) {
						this.field1237[arg0][arg2][arg1] |= 0x492;
						this.field1237[arg0][arg2][arg1] |= 0x249;
					}
				}
				if (var15.field698 && arg7 != null) {
					arg7.method201(arg3, arg2, var15.field705, arg5, arg1);
				}
				if (var15.field731 != 16) {
					arg6.method544(arg0, arg1, arg2, var15.field731);
				}
			} else if (arg3 == 3) {
				class66 var33;
				if (var15.field694 == -1 && var15.field726 == null) {
					var33 = var15.method189(3, arg5, var10, var11, var12, var13, -1);
				} else {
					var33 = new class57(arg4, 3, var11, var15.field694, var13, true, arg5, var12, (byte) -59, var10);
				}
				arg6.method536(field1234[arg5], arg1, null, var33, var16, 0, arg0, var14, var17, arg2);
				if (var15.field719) {
					if (arg5 == 0) {
						this.field1216[arg0][arg2][arg1 + 1] = 50;
					} else if (arg5 == 1) {
						this.field1216[arg0][arg2 + 1][arg1 + 1] = 50;
					} else if (arg5 == 2) {
						this.field1216[arg0][arg2 + 1][arg1] = 50;
					} else if (arg5 == 3) {
						this.field1216[arg0][arg2][arg1] = 50;
					}
				}
				if (var15.field698 && arg7 != null) {
					arg7.method201(arg3, arg2, var15.field705, arg5, arg1);
				}
			} else if (arg3 == 9) {
				class66 var34;
				if (var15.field694 == -1 && var15.field726 == null) {
					var34 = var15.method189(arg3, arg5, var10, var11, var12, var13, -1);
				} else {
					var34 = new class57(arg4, arg3, var11, var15.field694, var13, true, arg5, var12, (byte) -59, var10);
				}
				arg6.method538(arg0, 1, 1, var17, arg2, var14, var16, 0, var34, arg1);
				if (var15.field698 && arg7 != null) {
					arg7.method202(var15.field708, var15.field703, var15.field705, arg2, arg5, arg1);
				}
			} else {
				if (var15.field728) {
					if (arg5 == 1) {
						int var35 = var13;
						var13 = var12;
						var12 = var11;
						var11 = var10;
						var10 = var35;
					} else if (arg5 == 2) {
						int var36 = var13;
						var13 = var11;
						var11 = var36;
						int var37 = var12;
						var12 = var10;
						var10 = var37;
					} else if (arg5 == 3) {
						int var38 = var13;
						var13 = var10;
						var10 = var11;
						var11 = var12;
						var12 = var38;
					}
				}
				if (arg3 == 4) {
					class66 var39;
					if (var15.field694 == -1 && var15.field726 == null) {
						var39 = var15.method189(4, 0, var10, var11, var12, var13, -1);
					} else {
						var39 = new class57(arg4, 4, var11, var15.field694, var13, true, 0, var12, (byte) -59, var10);
					}
					arg6.method537(0, var14, arg1, field1225[arg5], var16, 0, arg5 * 512, var39, arg2, var17, arg0);
				} else if (arg3 == 5) {
					int var40 = 16;
					int var41 = arg6.method554(arg0, arg2, arg1);
					if (var41 > 0) {
						var40 = class14.method192(var41 >> 14 & 0x7FFF).field731;
					}
					class66 var42;
					if (var15.field694 == -1 && var15.field726 == null) {
						var42 = var15.method189(4, 0, var10, var11, var12, var13, -1);
					} else {
						var42 = new class57(arg4, 4, var11, var15.field694, var13, true, 0, var12, (byte) -59, var10);
					}
					arg6.method537(field1229[arg5] * var40, var14, arg1, field1225[arg5], var16, field1238[arg5] * var40, arg5 * 512, var42, arg2, var17, arg0);
				} else if (arg3 == 6) {
					class66 var43;
					if (var15.field694 == -1 && var15.field726 == null) {
						var43 = var15.method189(4, 0, var10, var11, var12, var13, -1);
					} else {
						var43 = new class57(arg4, 4, var11, var15.field694, var13, true, 0, var12, (byte) -59, var10);
					}
					arg6.method537(0, var14, arg1, 256, var16, 0, arg5, var43, arg2, var17, arg0);
				} else if (arg3 == 7) {
					class66 var44;
					if (var15.field694 == -1 && var15.field726 == null) {
						var44 = var15.method189(4, 0, var10, var11, var12, var13, -1);
					} else {
						var44 = new class57(arg4, 4, var11, var15.field694, var13, true, 0, var12, (byte) -59, var10);
					}
					arg6.method537(0, var14, arg1, 512, var16, 0, arg5, var44, arg2, var17, arg0);
				} else if (arg3 == 8) {
					class66 var45;
					if (var15.field694 == -1 && var15.field726 == null) {
						var45 = var15.method189(4, 0, var10, var11, var12, var13, -1);
					} else {
						var45 = new class57(arg4, 4, var11, var15.field694, var13, true, 0, var12, (byte) -59, var10);
					}
					arg6.method537(0, var14, arg1, 768, var16, 0, arg5, var45, arg2, var17, arg0);
				}
			}
		} catch (RuntimeException var47) {
			signlink.reporterror("54363, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + var47.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("OZIFXWPH.a(IIII[LDYTTVJNT;I[BZII)V")
	public void method434(int arg0, int arg1, int arg2, int arg3, class16[] arg4, int arg5, byte[] arg6, int arg7, int arg8) {
		try {
			for (int var10 = 0; var10 < 8; var10++) {
				for (int var11 = 0; var11 < 8; var11++) {
					if (arg7 + var10 > 0 && arg7 + var10 < 103 && arg8 + var11 > 0 && arg8 + var11 < 103) {
						arg4[arg3].field761[arg7 + var10][arg8 + var11] &= 0xFEFFFFFF;
					}
				}
			}
			class17 var12 = new class17(arg6, -26583);
			for (int var13 = 0; var13 < 4; var13++) {
				for (int var14 = 0; var14 < 64; var14++) {
					for (int var15 = 0; var15 < 64; var15++) {
						if (var13 == arg0 && var14 >= arg1 && var14 < arg1 + 8 && var15 >= arg5 && var15 < arg5 + 8) {
							this.method427((byte) 3, arg8 + class48.method440(var14 & 0x7, var15 & 0x7, arg2), arg7 + class48.method439(var15 & 0x7, var14 & 0x7, arg2), 0, var12, arg3, 0, arg2);
						} else {
							this.method427((byte) 3, -1, -1, 0, var12, 0, 0, 0);
						}
					}
				}
			}
		} catch (RuntimeException var17) {
			signlink.reporterror("36785, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + false + ", " + arg7 + ", " + arg8 + ", " + var17.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("OZIFXWPH.a(I[BIZ[LDYTTVJNT;II)V")
	public void method435(int arg0, byte[] arg1, int arg2, class16[] arg3, int arg4, int arg5) {
		try {
			for (int var7 = 0; var7 < 4; var7++) {
				for (int var8 = 0; var8 < 64; var8++) {
					for (int var9 = 0; var9 < 64; var9++) {
						if (arg5 + var8 > 0 && arg5 + var8 < 103 && arg0 + var9 > 0 && arg0 + var9 < 103) {
							arg3[var7].field761[arg5 + var8][arg0 + var9] &= 0xFEFFFFFF;
						}
					}
				}
			}
			class17 var10 = new class17(arg1, -26583);
			for (int var11 = 0; var11 < 4; var11++) {
				for (int var12 = 0; var12 < 64; var12++) {
					for (int var13 = 0; var13 < 64; var13++) {
						this.method427((byte) 3, var13 + arg0, var12 + arg5, arg4, var10, var11, arg2, 0);
					}
				}
			}
		} catch (RuntimeException var15) {
			signlink.reporterror("64134, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + true + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + var15.toString());
			throw new RuntimeException();
		}
	}
}
