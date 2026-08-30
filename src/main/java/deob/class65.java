package deob;

import sign.signlink;

@ObfuscatedName("WOWCAPIK")
public final class class65 {

	@ObfuscatedName("WOWCAPIK.a")
	public static final int field1471 = -23379;

	@ObfuscatedName("WOWCAPIK.d")
	public static final boolean field1474 = true;

	@ObfuscatedName("WOWCAPIK.e")
	public static final int field1475 = -34969;

	@ObfuscatedName("WOWCAPIK.f")
	public static final byte field1476 = 6;

	@ObfuscatedName("WOWCAPIK.g")
	public static final int field1477 = -33391;

	@ObfuscatedName("WOWCAPIK.h")
	public static final boolean field1478 = true;

	@ObfuscatedName("WOWCAPIK.p")
	public static final String[] field1486 = new String[] { "cook", "cook's", "cooks", "seeks", "sheet", "woop", "woops", "faq", "noob", "noobs" };

	@ObfuscatedName("WOWCAPIK.b")
	public static int field1472;

	@ObfuscatedName("WOWCAPIK.i")
	public static int field1479;

	@ObfuscatedName("WOWCAPIK.c")
	public static boolean field1473;

	@ObfuscatedName("WOWCAPIK.j")
	public static int[] field1480;

	@ObfuscatedName("WOWCAPIK.o")
	public static int[] field1485;

	@ObfuscatedName("WOWCAPIK.k")
	public static char[][] field1481;

	@ObfuscatedName("WOWCAPIK.m")
	public static char[][] field1483;

	@ObfuscatedName("WOWCAPIK.n")
	public static char[][] field1484;

	@ObfuscatedName("WOWCAPIK.l")
	public static byte[][][] field1482;

	@ObfuscatedName("WOWCAPIK.a(LBBMKAXRK;)V")
	public static void method476(class6 arg0) {
		class17 var1 = new class17(arg0.method30("fragmentsenc.txt", null), -26583);
		class17 var2 = new class17(arg0.method30("badenc.txt", null), -26583);
		class17 var3 = new class17(arg0.method30("domainenc.txt", null), -26583);
		class17 var4 = new class17(arg0.method30("tldlist.txt", null), -26583);
		method477(var1, var2, var3, var4);
	}

	@ObfuscatedName("WOWCAPIK.a(LEILHLJCE;LEILHLJCE;LEILHLJCE;LEILHLJCE;)V")
	public static void method477(class17 arg0, class17 arg1, class17 arg2, class17 arg3) {
		method479(arg1);
		method480(arg2);
		method481(arg0);
		method478(arg3);
	}

	@ObfuscatedName("WOWCAPIK.a(ILEILHLJCE;)V")
	public static void method478(class17 arg0) {
		try {
			int var1 = arg0.method229();
			field1484 = new char[var1][];
			field1485 = new int[var1];
			for (int var2 = 0; var2 < var1; var2++) {
				field1485[var2] = arg0.method224();
				char[] var3 = new char[arg0.method224()];
				for (int var4 = 0; var4 < var3.length; var4++) {
					var3[var4] = (char) arg0.method224();
				}
				field1484[var2] = var3;
			}
		} catch (RuntimeException var6) {
			signlink.reporterror("41225, " + 48575 + ", " + arg0 + ", " + var6.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("WOWCAPIK.a(BLEILHLJCE;)V")
	public static void method479(class17 arg0) {
		try {
			int var1 = arg0.method229();
			field1481 = new char[var1][];
			field1482 = new byte[var1][][];
			method482(field1481, arg0, field1482);
		} catch (RuntimeException var3) {
			signlink.reporterror("25218, " + -61 + ", " + arg0 + ", " + var3.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("WOWCAPIK.b(ILEILHLJCE;)V")
	public static void method480(class17 arg0) {
		try {
			int var1 = arg0.method229();
			field1483 = new char[var1][];
			method483(arg0, field1483, field1473);
		} catch (RuntimeException var3) {
			signlink.reporterror("86455, " + ", " + arg0 + ", " + var3.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("WOWCAPIK.b(BLEILHLJCE;)V")
	public static void method481(class17 arg0) {
		try {
			field1480 = new int[arg0.method229()];
			for (int var1 = 0; var1 < field1480.length; var1++) {
				field1480[var1] = arg0.method226();
			}
		} catch (RuntimeException var3) {
			signlink.reporterror("74385, " + 50 + ", " + arg0 + ", " + var3.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("WOWCAPIK.a([[CBLEILHLJCE;[[[B)V")
	public static void method482(char[][] arg0, class17 arg1, byte[][][] arg2) {
		try {
			for (int var3 = 0; var3 < arg0.length; var3++) {
				char[] var4 = new char[arg1.method224()];
				for (int var5 = 0; var5 < var4.length; var5++) {
					var4[var5] = (char) arg1.method224();
				}
				arg0[var3] = var4;
				byte[][] var6 = new byte[arg1.method224()][2];
				for (int var7 = 0; var7 < var6.length; var7++) {
					var6[var7][0] = (byte) arg1.method224();
					var6[var7][1] = (byte) arg1.method224();
				}
				if (var6.length > 0) {
					arg2[var3] = var6;
				}
			}
		} catch (RuntimeException var9) {
			signlink.reporterror("13316, " + arg0 + ", " + -36 + ", " + arg1 + ", " + arg2 + ", " + var9.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("WOWCAPIK.a(LEILHLJCE;[[CZ)V")
	public static void method483(class17 arg0, char[][] arg1, boolean arg2) {
		try {
			for (int var3 = 0; var3 < arg1.length; var3++) {
				char[] var4 = new char[arg0.method224()];
				for (int var5 = 0; var5 < var4.length; var5++) {
					var4[var5] = (char) arg0.method224();
				}
				arg1[var3] = var4;
			}
			if (!arg2) {
				;
			}
		} catch (RuntimeException var7) {
			signlink.reporterror("19388, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + var7.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("WOWCAPIK.a(Z[C)V")
	public static void method484(char[] arg0) {
		try {
			int var1 = 0;
			for (int var2 = 0; var2 < arg0.length; var2++) {
				if (method485(arg0[var2])) {
					arg0[var1] = arg0[var2];
				} else {
					arg0[var1] = ' ';
				}
				if (var1 == 0 || arg0[var1] != ' ' || arg0[var1 - 1] != ' ') {
					var1++;
				}
			}
			for (int var3 = var1; var3 < arg0.length; var3++) {
				arg0[var3] = ' ';
			}
		} catch (RuntimeException var5) {
			signlink.reporterror("76643, " + false + ", " + arg0 + ", " + var5.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("WOWCAPIK.a(CB)Z")
	public static boolean method485(char arg0) {
		try {
			return arg0 >= ' ' && arg0 <= '\u007F' || arg0 == ' ' || arg0 == '\n' || arg0 == '\t' || arg0 == '£' || arg0 == '€';
		} catch (RuntimeException var2) {
			signlink.reporterror("66433, " + arg0 + ", " + -46 + ", " + var2.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("WOWCAPIK.a(ILjava/lang/String;)Ljava/lang/String;")
	public static String method486(int arg0, String arg1) {
		try {
			long var2 = System.currentTimeMillis();
			char[] var4 = arg1.toCharArray();
			method484(var4);
			String var5 = (new String(var4)).trim();
			char[] var6 = var5.toLowerCase().toCharArray();
			String var7 = var5.toLowerCase();
			method494(var6);
			if (arg0 != -23379) {
				throw new NullPointerException();
			}
			method489(var6);
			method490((byte) 4, var6);
			method503(var6);
			for (int var8 = 0; var8 < field1486.length; var8++) {
				int var9 = -1;
				while ((var9 = var7.indexOf(field1486[var8], var9 + 1)) != -1) {
					char[] var10 = field1486[var8].toCharArray();
					for (int var11 = 0; var11 < var10.length; var11++) {
						var6[var11 + var9] = var10[var11];
					}
				}
			}
			method487(69, var6, var5.toCharArray());
			method488(99, var6);
			long var12 = System.currentTimeMillis();
			return (new String(var6)).trim();
		} catch (RuntimeException var15) {
			signlink.reporterror("69237, " + arg0 + ", " + arg1 + ", " + var15.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("WOWCAPIK.a(I[C[C)V")
	public static void method487(int arg0, char[] arg1, char[] arg2) {
		try {
			for (int var3 = 0; var3 < arg2.length; var3++) {
				if (arg1[var3] != '*' && method511(arg2[var3])) {
					arg1[var3] = arg2[var3];
				}
			}
			boolean var6 = false;
		} catch (RuntimeException var5) {
			signlink.reporterror("62992, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + var5.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("WOWCAPIK.a(I[C)V")
	public static void method488(int arg0, char[] arg1) {
		try {
			boolean var7 = false;
			boolean var2 = true;
			for (int var3 = 0; var3 < arg1.length; var3++) {
				char var4 = arg1[var3];
				if (!method508(var4)) {
					var2 = true;
				} else if (var2) {
					if (method510(var4)) {
						var2 = false;
					}
				} else if (method511(var4)) {
					arg1[var3] = (char) (var4 + 'a' - 65);
				}
			}
		} catch (RuntimeException var6) {
			signlink.reporterror("86851, " + arg0 + ", " + arg1 + ", " + var6.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("WOWCAPIK.b(Z[C)V")
	public static void method489(char[] arg0) {
		try {
			for (int var1 = 0; var1 < 2; var1++) {
				for (int var2 = field1481.length - 1; var2 >= 0; var2--) {
					method498(field1481[var2], field1482[var2], arg0);
				}
			}
		} catch (RuntimeException var4) {
			signlink.reporterror("45317, " + true + ", " + arg0 + ", " + var4.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("WOWCAPIK.a(B[C)V")
	public static void method490(byte arg0, char[] arg1) {
		try {
			boolean var9 = false;
			char[] var2 = (char[]) arg1.clone();
			char[] var3 = new char[] { '(', 'a', ')' };
			method498(var3, null, var2);
			char[] var4 = (char[]) arg1.clone();
			char[] var5 = new char[] { 'd', 'o', 't' };
			method498(var5, null, var4);
			for (int var6 = field1483.length - 1; var6 >= 0; var6--) {
				method491(var2, var4, arg1, field1483[var6]);
			}
		} catch (RuntimeException var8) {
			signlink.reporterror("30312, " + arg0 + ", " + arg1 + ", " + var8.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("WOWCAPIK.a([C[C[CI[C)V")
	public static void method491(char[] arg0, char[] arg1, char[] arg2, char[] arg3) {
		try {
			if (arg3.length <= arg2.length) {
				int var7;
				for (int var4 = 0; var4 <= arg2.length - arg3.length; var4 += var7) {
					int var5 = var4;
					int var6 = 0;
					var7 = 1;
					label59: while (true) {
						while (true) {
							if (var5 >= arg2.length) {
								break label59;
							}
							char var8 = arg2[var5];
							char var9 = 0;
							if (var5 + 1 < arg2.length) {
								var9 = arg2[var5 + 1];
							}
							int var10;
							if (var6 < arg3.length && (var10 = method500(var9, var8, arg3[var6])) > 0) {
								var5 += var10;
								var6++;
							} else {
								if (var6 == 0) {
									break label59;
								}
								int var11;
								if ((var11 = method500(var9, var8, arg3[var6 - 1])) > 0) {
									var5 += var11;
									if (var6 == 1) {
										var7++;
									}
								} else {
									if (var6 >= arg3.length || !method506(var8)) {
										break label59;
									}
									var5++;
								}
							}
						}
					}
					if (var6 >= arg3.length) {
						boolean var12 = false;
						int var13 = method492(arg2, var4, arg0);
						int var14 = method493(arg1, arg2, var5 - 1);
						if (var13 > 2 || var14 > 2) {
							var12 = true;
						}
						if (var12) {
							for (int var15 = var4; var15 < var5; var15++) {
								arg2[var15] = '*';
							}
						}
					}
				}
			}
		} catch (RuntimeException var17) {
			signlink.reporterror("74171, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 731 + ", " + arg3 + ", " + var17.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("WOWCAPIK.a([CBI[C)I")
	public static int method492(char[] arg0, int arg1, char[] arg2) {
		try {
			if (arg1 == 0) {
				return 2;
			}
			for (int var3 = arg1 - 1; var3 >= 0 && method506(arg0[var3]); var3--) {
				if (arg0[var3] == '@') {
					return 3;
				}
			}
			int var4 = 0;
			for (int var5 = arg1 - 1; var5 >= 0 && method506(arg2[var5]); var5--) {
				if (arg2[var5] == '*') {
					var4++;
				}
			}
			if (var4 >= 3) {
				return 4;
			} else if (method506(arg0[arg1 - 1])) {
				return 1;
			} else {
				return 0;
			}
		} catch (RuntimeException var7) {
			signlink.reporterror("86683, " + arg0 + ", " + 6 + ", " + arg1 + ", " + arg2 + ", " + var7.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("WOWCAPIK.a([C[CII)I")
	public static int method493(char[] arg0, char[] arg1, int arg2) {
		try {
			if (arg2 + 1 == arg1.length) {
				return 2;
			}
			int var3 = arg2 + 1;
			while (true) {
				if (var3 < arg1.length && method506(arg1[var3])) {
					if (arg1[var3] != '.' && arg1[var3] != ',') {
						var3++;
						continue;
					}
					return 3;
				}
				int var4 = 0;
				for (int var5 = arg2 + 1; var5 < arg1.length && method506(arg0[var5]); var5++) {
					if (arg0[var5] == '*') {
						var4++;
					}
				}
				if (field1475 != -34969) {
					field1472 = 237;
				}
				if (var4 >= 3) {
					return 4;
				}
				if (method506(arg1[arg2 + 1])) {
					return 1;
				}
				return 0;
			}
		} catch (RuntimeException var7) {
			signlink.reporterror("43384, " + arg0 + ", " + arg1 + ", " + -34969 + ", " + arg2 + ", " + var7.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("WOWCAPIK.b(I[C)V")
	public static void method494(char[] arg0) {
		try {
			char[] var1 = (char[]) arg0.clone();
			char[] var2 = new char[] { 'd', 'o', 't' };
			method498(var2, null, var1);
			char[] var3 = (char[]) arg0.clone();
			char[] var4 = new char[] { 's', 'l', 'a', 's', 'h' };
			method498(var4, null, var3);
			for (int var5 = 0; var5 < field1484.length; var5++) {
				method495(field1484[var5], arg0, field1485[var5], var1, var3);
			}
		} catch (RuntimeException var7) {
			signlink.reporterror("2827, " + 221 + ", " + arg0 + ", " + var7.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("WOWCAPIK.a(Z[C[CI[C[C)V")
	public static void method495(char[] arg0, char[] arg1, int arg2, char[] arg3, char[] arg4) {
		try {
			if (arg0.length <= arg1.length) {
				int var8;
				for (int var5 = 0; var5 <= arg1.length - arg0.length; var5 += var8) {
					int var6 = var5;
					int var7 = 0;
					var8 = 1;
					label121: while (true) {
						while (true) {
							if (var6 >= arg1.length) {
								break label121;
							}
							char var9 = arg1[var6];
							char var10 = 0;
							if (var6 + 1 < arg1.length) {
								var10 = arg1[var6 + 1];
							}
							int var11;
							if (var7 < arg0.length && (var11 = method500(var10, var9, arg0[var7])) > 0) {
								var6 += var11;
								var7++;
							} else {
								if (var7 == 0) {
									break label121;
								}
								int var12;
								if ((var12 = method500(var10, var9, arg0[var7 - 1])) > 0) {
									var6 += var12;
									if (var7 == 1) {
										var8++;
									}
								} else {
									if (var7 >= arg0.length || !method506(var9)) {
										break label121;
									}
									var6++;
								}
							}
						}
					}
					if (var7 >= arg0.length) {
						boolean var13 = false;
						int var14 = method496(var5, arg1, arg3);
						int var15 = method497(arg1, var6 - 1, arg4);
						if (arg2 == 1 && var14 > 0 && var15 > 0) {
							var13 = true;
						}
						if (arg2 == 2 && (var14 > 2 && var15 > 0 || var14 > 0 && var15 > 2)) {
							var13 = true;
						}
						if (arg2 == 3 && var14 > 0 && var15 > 2) {
							var13 = true;
						}
						boolean var10000;
						if (arg2 == 3 && var14 > 2 && var15 > 0) {
							var10000 = true;
						} else {
							var10000 = false;
						}
						if (var13) {
							int var16 = var5;
							int var17 = var6 - 1;
							if (var14 > 2) {
								if (var14 == 4) {
									boolean var18 = false;
									for (int var19 = var5 - 1; var19 >= 0; var19--) {
										if (var18) {
											if (arg3[var19] != '*') {
												break;
											}
											var16 = var19;
										} else if (arg3[var19] == '*') {
											var16 = var19;
											var18 = true;
										}
									}
								}
								boolean var20 = false;
								for (int var21 = var16 - 1; var21 >= 0; var21--) {
									if (var20) {
										if (method506(arg1[var21])) {
											break;
										}
										var16 = var21;
									} else if (!method506(arg1[var21])) {
										var20 = true;
										var16 = var21;
									}
								}
							}
							if (var15 > 2) {
								if (var15 == 4) {
									boolean var22 = false;
									for (int var23 = var17 + 1; var23 < arg1.length; var23++) {
										if (var22) {
											if (arg4[var23] != '*') {
												break;
											}
											var17 = var23;
										} else if (arg4[var23] == '*') {
											var17 = var23;
											var22 = true;
										}
									}
								}
								boolean var24 = false;
								for (int var25 = var17 + 1; var25 < arg1.length; var25++) {
									if (var24) {
										if (method506(arg1[var25])) {
											break;
										}
										var17 = var25;
									} else if (!method506(arg1[var25])) {
										var24 = true;
										var17 = var25;
									}
								}
							}
							for (int var26 = var16; var26 <= var17; var26++) {
								arg1[var26] = '*';
							}
						}
					}
				}
			}
		} catch (RuntimeException var28) {
			signlink.reporterror("5711, " + false + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + var28.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("WOWCAPIK.a(BI[C[C)I")
	public static int method496(int arg0, char[] arg1, char[] arg2) {
		try {
			if (arg0 == 0) {
				return 2;
			}
			int var3 = arg0 - 1;
			while (true) {
				if (var3 >= 0 && method506(arg1[var3])) {
					if (arg1[var3] != ',' && arg1[var3] != '.') {
						var3--;
						continue;
					}
					return 3;
				}
				int var4 = 0;
				for (int var5 = arg0 - 1; var5 >= 0 && method506(arg2[var5]); var5--) {
					if (arg2[var5] == '*') {
						var4++;
					}
				}
				if (var4 >= 3) {
					return 4;
				}
				if (method506(arg1[arg0 - 1])) {
					return 1;
				}
				return 0;
			}
		} catch (RuntimeException var7) {
			signlink.reporterror("812, " + 9 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + var7.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("WOWCAPIK.a(I[CI[C)I")
	public static int method497(char[] arg0, int arg1, char[] arg2) {
		try {
			if (arg1 + 1 == arg0.length) {
				return 2;
			}
			int var3 = arg1 + 1;
			while (true) {
				if (var3 < arg0.length && method506(arg0[var3])) {
					if (arg0[var3] != '\\' && arg0[var3] != '/') {
						var3++;
						continue;
					}
					return 3;
				}
				int var4 = 0;
				for (int var5 = arg1 + 1; var5 < arg0.length && method506(arg2[var5]); var5++) {
					if (arg2[var5] == '*') {
						var4++;
					}
				}
				if (var4 >= 5) {
					return 4;
				}
				if (method506(arg0[arg1 + 1])) {
					return 1;
				}
				return 0;
			}
		} catch (RuntimeException var7) {
			signlink.reporterror("14187, " + 2 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + var7.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("WOWCAPIK.a(I[C[[B[C)V")
	public static void method498(char[] arg0, byte[][] arg1, char[] arg2) {
		try {
			if (arg0.length <= arg2.length) {
				int var7;
				for (int var3 = 0; var3 <= arg2.length - arg0.length; var3 += var7) {
					int var4 = var3;
					int var5 = 0;
					int var6 = 0;
					var7 = 1;
					boolean var8 = false;
					boolean var9 = false;
					boolean var10 = false;
					label164: while (true) {
						while (true) {
							if (var4 >= arg2.length || var9 && var10) {
								break label164;
							}
							char var11 = arg2[var4];
							char var12 = 0;
							if (var4 + 1 < arg2.length) {
								var12 = arg2[var4 + 1];
							}
							int var13;
							if (var5 < arg0.length && (var13 = method501(arg0[var5], var12, var11)) > 0) {
								if (var13 == 1 && method509(field1476, var11)) {
									var9 = true;
								}
								if (var13 == 2 && (method509(field1476, var11) || method509(field1476, var12))) {
									var9 = true;
								}
								var4 += var13;
								var5++;
							} else {
								if (var5 == 0) {
									break label164;
								}
								int var14;
								if ((var14 = method501(arg0[var5 - 1], var12, var11)) > 0) {
									var4 += var14;
									if (var5 == 1) {
										var7++;
									}
								} else {
									if (var5 >= arg0.length || !method507(var11)) {
										break label164;
									}
									if (method506(var11) && var11 != '\'') {
										var8 = true;
									}
									if (method509(field1476, var11)) {
										var10 = true;
									}
									var4++;
									var6++;
									if (var6 * 100 / (var4 - var3) > 90) {
										break label164;
									}
								}
							}
						}
					}
					if (var5 >= arg0.length && (!var9 || !var10)) {
						boolean var15 = true;
						if (var8) {
							boolean var20 = false;
							boolean var21 = false;
							if (var3 - 1 < 0 || method506(arg2[var3 - 1]) && arg2[var3 - 1] != '\'') {
								var20 = true;
							}
							if (var4 >= arg2.length || method506(arg2[var4]) && arg2[var4] != '\'') {
								var21 = true;
							}
							if (!var20 || !var21) {
								boolean var22 = false;
								int var23 = var3 - 2;
								if (var20) {
									var23 = var3;
								}
								while (!var22 && var23 < var4) {
									if (var23 >= 0 && (!method506(arg2[var23]) || arg2[var23] == '\'')) {
										char[] var24 = new char[3];
										int var25;
										for (var25 = 0; var25 < 3 && var23 + var25 < arg2.length && (!method506(arg2[var23 + var25]) || arg2[var23 + var25] == '\''); var25++) {
											var24[var25] = arg2[var23 + var25];
										}
										boolean var26 = true;
										if (var25 == 0) {
											var26 = false;
										}
										if (var25 < 3 && var23 - 1 >= 0 && (!method506(arg2[var23 - 1]) || arg2[var23 - 1] == '\'')) {
											var26 = false;
										}
										if (var26 && !method512(var24, field1477)) {
											var22 = true;
										}
									}
									var23++;
								}
								if (!var22) {
									var15 = false;
								}
							}
						} else {
							char var16 = ' ';
							if (var3 - 1 >= 0) {
								var16 = arg2[var3 - 1];
							}
							char var17 = ' ';
							if (var4 < arg2.length) {
								var17 = arg2[var4];
							}
							byte var18 = method502(var16);
							byte var19 = method502(var17);
							if (arg1 != null && method499(var18, arg1, var19)) {
								var15 = false;
							}
						}
						if (var15) {
							int var27 = 0;
							int var28 = 0;
							int var29 = -1;
							for (int var30 = var3; var30 < var4; var30++) {
								if (method509(field1476, arg2[var30])) {
									var27++;
								} else if (method508(arg2[var30])) {
									var28++;
									var29 = var30;
								}
							}
							if (var29 > -1) {
								var27 -= var4 - var29 - 1;
							}
							if (var27 <= var28) {
								for (int var31 = var3; var31 < var4; var31++) {
									arg2[var31] = '*';
								}
							} else {
								var7 = 1;
							}
						}
					}
				}
			}
		} catch (RuntimeException var33) {
			signlink.reporterror("72624, " + 359 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + var33.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("WOWCAPIK.a(B[[BIB)Z")
	public static boolean method499(byte arg0, byte[][] arg1, byte arg2) {
		try {
			int var3 = 0;
			if (arg1[0][0] == arg0 && arg1[0][1] == arg2) {
				return true;
			}
			int var4 = arg1.length - 1;
			if (arg1[var4][0] == arg0 && arg1[var4][1] == arg2) {
				return true;
			}
			do {
				int var5 = (var3 + var4) / 2;
				if (arg1[var5][0] == arg0 && arg1[var5][1] == arg2) {
					return true;
				}
				if (arg0 < arg1[var5][0] || arg0 == arg1[var5][0] && arg2 < arg1[var5][1]) {
					var4 = var5;
				} else {
					var3 = var5;
				}
			} while (var3 != var4 && var3 + 1 != var4);
			return false;
		} catch (RuntimeException var7) {
			signlink.reporterror("38263, " + arg0 + ", " + arg1 + ", " + -12775 + ", " + arg2 + ", " + var7.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("WOWCAPIK.a(CCIC)I")
	public static int method500(char arg0, char arg1, char arg2) {
		try {
			if (arg2 == arg1) {
				return 1;
			} else if (arg2 == 'o' && arg1 == '0') {
				return 1;
			} else if (arg2 == 'o' && arg1 == '(' && arg0 == ')') {
				return 2;
			} else if (arg2 == 'c' && (arg1 == '(' || arg1 == '<' || arg1 == '[')) {
				return 1;
			} else if (arg2 == 'e' && arg1 == '€') {
				return 1;
			} else if (arg2 == 's' && arg1 == '$') {
				return 1;
			} else if (arg2 == 'l' && arg1 == 'i') {
				return 1;
			} else {
				return 0;
			}
		} catch (RuntimeException var4) {
			signlink.reporterror("48145, " + arg0 + ", " + arg1 + ", " + ", " + arg2 + ", " + var4.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("WOWCAPIK.a(CBCC)I")
	public static int method501(char arg0, char arg1, char arg2) {
		try {
			if (arg0 == arg2) {
				return 1;
			}
			if (arg0 >= 'a' && arg0 <= 'm') {
				if (arg0 == 'a') {
					if (arg2 != '4' && arg2 != '@' && arg2 != '^') {
						if (arg2 == '/' && arg1 == '\\') {
							return 2;
						}
						return 0;
					}
					return 1;
				}
				if (arg0 == 'b') {
					if (arg2 != '6' && arg2 != '8') {
						if ((arg2 != '1' || arg1 != '3') && (arg2 != 'i' || arg1 != '3')) {
							return 0;
						}
						return 2;
					}
					return 1;
				}
				if (arg0 == 'c') {
					if (arg2 != '(' && arg2 != '<' && arg2 != '{' && arg2 != '[') {
						return 0;
					}
					return 1;
				}
				if (arg0 == 'd') {
					if ((arg2 != '[' || arg1 != ')') && (arg2 != 'i' || arg1 != ')')) {
						return 0;
					}
					return 2;
				}
				if (arg0 == 'e') {
					if (arg2 != '3' && arg2 != '€') {
						return 0;
					}
					return 1;
				}
				if (arg0 == 'f') {
					if (arg2 == 'p' && arg1 == 'h') {
						return 2;
					}
					if (arg2 == '£') {
						return 1;
					}
					return 0;
				}
				if (arg0 == 'g') {
					if (arg2 != '9' && arg2 != '6' && arg2 != 'q') {
						return 0;
					}
					return 1;
				}
				if (arg0 == 'h') {
					if (arg2 == '#') {
						return 1;
					}
					return 0;
				}
				if (arg0 == 'i') {
					if (arg2 != 'y' && arg2 != 'l' && arg2 != 'j' && arg2 != '1' && arg2 != '!' && arg2 != ':' && arg2 != ';' && arg2 != '|') {
						return 0;
					}
					return 1;
				}
				if (arg0 == 'j') {
					return 0;
				}
				if (arg0 == 'k') {
					return 0;
				}
				if (arg0 == 'l') {
					if (arg2 != '1' && arg2 != '|' && arg2 != 'i') {
						return 0;
					}
					return 1;
				}
				if (arg0 == 'm') {
					return 0;
				}
			}
			if (arg0 >= 'n' && arg0 <= 'z') {
				if (arg0 == 'n') {
					return 0;
				}
				if (arg0 == 'o') {
					if (arg2 != '0' && arg2 != '*') {
						if ((arg2 != '(' || arg1 != ')') && (arg2 != '[' || arg1 != ']') && (arg2 != '{' || arg1 != '}') && (arg2 != '<' || arg1 != '>')) {
							return 0;
						}
						return 2;
					}
					return 1;
				}
				if (arg0 == 'p') {
					return 0;
				}
				if (arg0 == 'q') {
					return 0;
				}
				if (arg0 == 'r') {
					return 0;
				}
				if (arg0 == 's') {
					if (arg2 != '5' && arg2 != 'z' && arg2 != '$' && arg2 != '2') {
						return 0;
					}
					return 1;
				}
				if (arg0 == 't') {
					if (arg2 != '7' && arg2 != '+') {
						return 0;
					}
					return 1;
				}
				if (arg0 == 'u') {
					if (arg2 == 'v') {
						return 1;
					}
					if ((arg2 != '\\' || arg1 != '/') && (arg2 != '\\' || arg1 != '|') && (arg2 != '|' || arg1 != '/')) {
						return 0;
					}
					return 2;
				}
				if (arg0 == 'v') {
					if ((arg2 != '\\' || arg1 != '/') && (arg2 != '\\' || arg1 != '|') && (arg2 != '|' || arg1 != '/')) {
						return 0;
					}
					return 2;
				}
				if (arg0 == 'w') {
					if (arg2 == 'v' && arg1 == 'v') {
						return 2;
					}
					return 0;
				}
				if (arg0 == 'x') {
					if ((arg2 != ')' || arg1 != '(') && (arg2 != '}' || arg1 != '{') && (arg2 != ']' || arg1 != '[') && (arg2 != '>' || arg1 != '<')) {
						return 0;
					}
					return 2;
				}
				if (arg0 == 'y') {
					return 0;
				}
				if (arg0 == 'z') {
					return 0;
				}
			}
			if (arg0 >= '0' && arg0 <= '9') {
				if (arg0 == '0') {
					if (arg2 == 'o' || arg2 == 'O') {
						return 1;
					} else if ((arg2 != '(' || arg1 != ')') && (arg2 != '{' || arg1 != '}') && (arg2 != '[' || arg1 != ']')) {
						return 0;
					} else {
						return 2;
					}
				} else if (arg0 == '1') {
					return arg2 == 'l' ? 1 : 0;
				} else {
					return 0;
				}
			} else if (arg0 == ',') {
				return arg2 == '.' ? 1 : 0;
			} else if (arg0 == '.') {
				return arg2 == ',' ? 1 : 0;
			} else if (arg0 == '!') {
				return arg2 == 'i' ? 1 : 0;
			} else {
				return 0;
			}
		} catch (RuntimeException var4) {
			signlink.reporterror("98755, " + arg0 + ", " + 102 + ", " + arg1 + ", " + arg2 + ", " + var4.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("WOWCAPIK.a(CZ)B")
	public static byte method502(char arg0) {
		try {
			if (arg0 >= 'a' && arg0 <= 'z') {
				return (byte) (arg0 + 1 - 'a');
			} else if (arg0 == '\'') {
				return 28;
			} else if (arg0 >= '0' && arg0 <= '9') {
				return (byte) (arg0 + 29 - '0');
			} else {
				return 27;
			}
		} catch (RuntimeException var2) {
			signlink.reporterror("95970, " + arg0 + ", " + true + ", " + var2.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("WOWCAPIK.a([CI)V")
	public static void method503(char[] arg0) {
		try {
			int var1 = 0;
			int var2 = 0;
			int var3 = 0;
			while (true) {
				do {
					int var6;
					if ((var6 = method504(arg0, var1)) == -1) {
						return;
					}
					boolean var4 = false;
					for (int var5 = var1; var5 >= 0 && var5 < var6 && !var4; var5++) {
						if (!method506(arg0[var5]) && !method507(arg0[var5])) {
							var4 = true;
						}
					}
					if (var4) {
						var2 = 0;
					}
					if (var2 == 0) {
						var3 = var6;
					}
					var1 = method505(arg0, var6);
					int var7 = 0;
					for (int var8 = var6; var8 < var1; var8++) {
						var7 = var7 * 10 + arg0[var8] - 48;
					}
					if (var7 <= 255 && var1 - var6 <= 8) {
						var2++;
					} else {
						var2 = 0;
					}
				} while (var2 != 4);
				for (int var9 = var3; var9 < var1; var9++) {
					arg0[var9] = '*';
				}
				var2 = 0;
			}
		} catch (RuntimeException var11) {
			signlink.reporterror("63957, " + arg0 + ", " + ", " + var11.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("WOWCAPIK.a(Z[CI)I")
	public static int method504(char[] arg0, int arg1) {
		try {
			for (int var2 = arg1; var2 < arg0.length && var2 >= 0; var2++) {
				if (arg0[var2] >= '0' && arg0[var2] <= '9') {
					return var2;
				}
			}
			return -1;
		} catch (RuntimeException var4) {
			signlink.reporterror("87254, " + true + ", " + arg0 + ", " + arg1 + ", " + var4.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("WOWCAPIK.a([CII)I")
	public static int method505(char[] arg0, int arg1) {
		try {
			int var2 = arg1;
			while (true) {
				if (var2 < arg0.length && var2 >= 0) {
					if (arg0[var2] >= '0' && arg0[var2] <= '9') {
						var2++;
						continue;
					}
					return var2;
				}
				return arg0.length;
			}
		} catch (RuntimeException var4) {
			signlink.reporterror("50997, " + arg0 + ", " + arg1 + ", " + 3 + ", " + var4.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("WOWCAPIK.a(ZC)Z")
	public static boolean method506(char arg0) {
		try {
			return !method508(arg0) && !method509(field1476, arg0);
		} catch (RuntimeException var2) {
			signlink.reporterror("96800, " + false + ", " + arg0 + ", " + var2.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("WOWCAPIK.a(IC)Z")
	public static boolean method507(char arg0) {
		try {
			if (arg0 >= 'a' && arg0 <= 'z') {
				return arg0 == 'v' || arg0 == 'x' || arg0 == 'j' || arg0 == 'q' || arg0 == 'z';
			} else {
				return true;
			}
		} catch (RuntimeException var2) {
			signlink.reporterror("89105, " + 557 + ", " + arg0 + ", " + var2.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("WOWCAPIK.a(BC)Z")
	public static boolean method508(char arg0) {
		try {
			return arg0 >= 'a' && arg0 <= 'z' || arg0 >= 'A' && arg0 <= 'Z';
		} catch (RuntimeException var2) {
			signlink.reporterror("33297, " + 1 + ", " + arg0 + ", " + var2.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("WOWCAPIK.b(BC)Z")
	public static boolean method509(byte arg0, char arg1) {
		try {
			if (arg0 == field1476) {
				boolean var4 = false;
			} else {
				field1479 = -4;
			}
			return arg1 >= '0' && arg1 <= '9';
		} catch (RuntimeException var3) {
			signlink.reporterror("76094, " + arg0 + ", " + arg1 + ", " + var3.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("WOWCAPIK.a(CI)Z")
	public static boolean method510(char arg0) {
		try {
			return arg0 >= 'a' && arg0 <= 'z';
		} catch (RuntimeException var2) {
			signlink.reporterror("76081, " + arg0 + ", " + -40151 + ", " + var2.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("WOWCAPIK.c(BC)Z")
	public static boolean method511(char arg0) {
		try {
			return arg0 >= 'A' && arg0 <= 'Z';
		} catch (RuntimeException var2) {
			signlink.reporterror("88363, " + 1 + ", " + arg0 + ", " + var2.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("WOWCAPIK.b([CI)Z")
	public static boolean method512(char[] arg0, int arg1) {
		try {
			boolean var2 = true;
			for (int var3 = 0; var3 < arg0.length; var3++) {
				if (!method509(field1476, arg0[var3]) && arg0[var3] != '\u0000') {
					var2 = false;
				}
			}
			if (var2) {
				return true;
			}
			int var4 = method513(716, arg0);
			int var5 = 0;
			int var6 = field1480.length - 1;
			if (arg1 != -33391) {
				throw new NullPointerException();
			} else if (var4 == field1480[0] || var4 == field1480[var6]) {
				return true;
			} else {
				do {
					int var7 = (var5 + var6) / 2;
					if (var4 == field1480[var7]) {
						return true;
					}
					if (var4 < field1480[var7]) {
						var6 = var7;
					} else {
						var5 = var7;
					}
				} while (var5 != var6 && var5 + 1 != var6);
				return false;
			}
		} catch (RuntimeException var9) {
			signlink.reporterror("47733, " + arg0 + ", " + arg1 + ", " + var9.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("WOWCAPIK.c(I[C)I")
	public static int method513(int arg0, char[] arg1) {
		try {
			boolean var7 = false;
			if (arg1.length > 6) {
				return 0;
			}
			int var2 = 0;
			for (int var3 = 0; var3 < arg1.length; var3++) {
				char var4 = arg1[arg1.length - var3 - 1];
				if (var4 >= 'a' && var4 <= 'z') {
					var2 = var2 * 38 + var4 + 1 - 'a';
				} else if (var4 == '\'') {
					var2 = var2 * 38 + 27;
				} else if (var4 >= '0' && var4 <= '9') {
					var2 = var2 * 38 + var4 + 28 - '0';
				} else if (var4 != '\u0000') {
					return 0;
				}
			}
			return var2;
		} catch (RuntimeException var6) {
			signlink.reporterror("41046, " + arg0 + ", " + arg1 + ", " + var6.toString());
			throw new RuntimeException();
		}
	}
}
