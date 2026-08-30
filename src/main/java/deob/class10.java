package deob;

@ObfuscatedName("CGPATBOH")
public final class class10 {

	@ObfuscatedName("CGPATBOH.a")
	public static final class72 field162 = new class72();

	@ObfuscatedName("CGPATBOH.a([BI[BII)I")
	public static int method36(byte[] arg0, int arg1, byte[] arg2, int arg3, int arg4) {
		class72 var5 = field162;
		synchronized (field162) {
			field162.field1690 = arg2;
			field162.field1691 = arg4;
			field162.field1695 = arg0;
			field162.field1696 = 0;
			field162.field1692 = arg3;
			field162.field1697 = arg1;
			field162.field1704 = 0;
			field162.field1703 = 0;
			field162.field1693 = 0;
			field162.field1694 = 0;
			field162.field1698 = 0;
			field162.field1699 = 0;
			field162.field1706 = 0;
			method38(field162);
			return arg1 - field162.field1697;
		}
	}

	@ObfuscatedName("CGPATBOH.a(LYZXSAOBR;)V")
	public static void method37(class72 arg0) {
		byte var1 = arg0.field1700;
		int var2 = arg0.field1701;
		int var3 = arg0.field1711;
		int var4 = arg0.field1709;
		int[] var5 = class72.field1714;
		int var6 = arg0.field1708;
		byte[] var7 = arg0.field1695;
		int var8 = arg0.field1696;
		int var9 = arg0.field1697;
		int var10 = var9;
		int var11 = arg0.field1728 + 1;
		label67: while (true) {
			if (var2 > 0) {
				while (true) {
					if (var9 == 0) {
						break label67;
					}
					if (var2 == 1) {
						if (var9 == 0) {
							var2 = 1;
							break label67;
						}
						var7[var8] = var1;
						var8++;
						var9--;
						break;
					}
					var7[var8] = var1;
					var2--;
					var8++;
					var9--;
				}
			}
			boolean var12 = true;
			while (var12) {
				var12 = false;
				if (var3 == var11) {
					var2 = 0;
					break label67;
				}
				var1 = (byte) var4;
				int var13 = var5[var6];
				byte var14 = (byte) (var13 & 0xFF);
				var6 = var13 >> 8;
				var3++;
				if (var14 != var4) {
					var4 = var14;
					if (var9 == 0) {
						var2 = 1;
						break label67;
					}
					var7[var8] = var1;
					var8++;
					var9--;
					var12 = true;
				} else if (var3 == var11) {
					if (var9 == 0) {
						var2 = 1;
						break label67;
					}
					var7[var8] = var1;
					var8++;
					var9--;
					var12 = true;
				}
			}
			var2 = 2;
			int var15 = var5[var6];
			byte var16 = (byte) (var15 & 0xFF);
			var6 = var15 >> 8;
			var3++;
			if (var3 != var11) {
				if (var16 == var4) {
					var2 = 3;
					int var17 = var5[var6];
					byte var18 = (byte) (var17 & 0xFF);
					var6 = var17 >> 8;
					var3++;
					if (var3 != var11) {
						if (var18 == var4) {
							int var19 = var5[var6];
							byte var20 = (byte) (var19 & 0xFF);
							int var21 = var19 >> 8;
							var3++;
							var2 = (var20 & 0xFF) + 4;
							int var22 = var5[var21];
							var4 = (byte) (var22 & 0xFF);
							var6 = var22 >> 8;
							var3++;
						} else {
							var4 = var18;
						}
					}
				} else {
					var4 = var16;
				}
			}
		}
		int var23 = arg0.field1698;
		arg0.field1698 += var10 - var9;
		if (arg0.field1698 < var23) {
			arg0.field1699++;
		}
		arg0.field1700 = var1;
		arg0.field1701 = var2;
		arg0.field1711 = var3;
		arg0.field1709 = var4;
		class72.field1714 = var5;
		arg0.field1708 = var6;
		arg0.field1695 = var7;
		arg0.field1696 = var8;
		arg0.field1697 = var9;
	}

	@ObfuscatedName("CGPATBOH.b(LYZXSAOBR;)V")
	public static void method38(class72 arg0) {
		arg0.field1705 = 1;
		if (class72.field1714 == null) {
			class72.field1714 = new int[arg0.field1705 * 100000];
		}
		boolean var1 = true;
		while (true) {
			while (var1) {
				byte var2 = method39(arg0);
				if (var2 == 23) {
					return;
				}
				byte var3 = method39(arg0);
				byte var4 = method39(arg0);
				byte var5 = method39(arg0);
				byte var6 = method39(arg0);
				byte var7 = method39(arg0);
				arg0.field1706++;
				byte var8 = method39(arg0);
				byte var9 = method39(arg0);
				byte var10 = method39(arg0);
				byte var11 = method39(arg0);
				byte var12 = method40(arg0);
				if (var12 == 0) {
					arg0.field1702 = false;
				} else {
					arg0.field1702 = true;
				}
				if (arg0.field1702) {
					System.out.println("PANIC! RANDOMISED BLOCK!");
				}
				arg0.field1707 = 0;
				byte var13 = method39(arg0);
				arg0.field1707 = arg0.field1707 << 8 | var13 & 0xFF;
				byte var14 = method39(arg0);
				arg0.field1707 = arg0.field1707 << 8 | var14 & 0xFF;
				byte var15 = method39(arg0);
				arg0.field1707 = arg0.field1707 << 8 | var15 & 0xFF;
				for (int var16 = 0; var16 < 16; var16++) {
					byte var17 = method40(arg0);
					if (var17 == 1) {
						arg0.field1717[var16] = true;
					} else {
						arg0.field1717[var16] = false;
					}
				}
				for (int var18 = 0; var18 < 256; var18++) {
					arg0.field1716[var18] = false;
				}
				for (int var19 = 0; var19 < 16; var19++) {
					if (arg0.field1717[var19]) {
						for (int var20 = 0; var20 < 16; var20++) {
							byte var21 = method40(arg0);
							if (var21 == 1) {
								arg0.field1716[var19 * 16 + var20] = true;
							}
						}
					}
				}
				method42(arg0);
				int var22 = arg0.field1715 + 2;
				int var23 = method41(3, arg0);
				int var24 = method41(15, arg0);
				for (int var25 = 0; var25 < var24; var25++) {
					int var26 = 0;
					while (true) {
						byte var27 = method40(arg0);
						if (var27 == 0) {
							arg0.field1722[var25] = (byte) var26;
							break;
						}
						var26++;
					}
				}
				byte[] var28 = new byte[6];
				byte var29 = 0;
				while (var29 < var23) {
					var28[var29] = var29++;
				}
				for (int var30 = 0; var30 < var24; var30++) {
					byte var31 = arg0.field1722[var30];
					byte var32 = var28[var31];
					while (var31 > 0) {
						var28[var31] = var28[var31 - 1];
						var31--;
					}
					var28[0] = var32;
					arg0.field1721[var30] = var32;
				}
				for (int var33 = 0; var33 < var23; var33++) {
					int var34 = method41(5, arg0);
					for (int var35 = 0; var35 < var22; var35++) {
						while (true) {
							byte var36 = method40(arg0);
							if (var36 == 0) {
								arg0.field1723[var33][var35] = (byte) var34;
								break;
							}
							byte var37 = method40(arg0);
							if (var37 == 0) {
								var34++;
							} else {
								var34--;
							}
						}
					}
				}
				for (int var38 = 0; var38 < var23; var38++) {
					byte var39 = 32;
					byte var40 = 0;
					for (int var41 = 0; var41 < var22; var41++) {
						if (arg0.field1723[var38][var41] > var40) {
							var40 = arg0.field1723[var38][var41];
						}
						if (arg0.field1723[var38][var41] < var39) {
							var39 = arg0.field1723[var38][var41];
						}
					}
					method43(arg0.field1724[var38], arg0.field1725[var38], arg0.field1726[var38], arg0.field1723[var38], var39, var40, var22);
					arg0.field1727[var38] = var39;
				}
				int var42 = arg0.field1715 + 1;
				int var43 = arg0.field1705 * 100000;
				byte var44 = -1;
				for (int var45 = 0; var45 <= 255; var45++) {
					arg0.field1710[var45] = 0;
				}
				int var46 = 4095;
				for (int var47 = 15; var47 >= 0; var47--) {
					for (int var48 = 15; var48 >= 0; var48--) {
						arg0.field1719[var46] = (byte) (var47 * 16 + var48);
						var46--;
					}
					arg0.field1720[var47] = var46 + 1;
				}
				int var49 = 0;
				int var85 = var44 + 1;
				byte var50 = 50;
				byte var51 = arg0.field1721[0];
				int var52 = arg0.field1727[var51];
				int[] var53 = arg0.field1724[var51];
				int[] var54 = arg0.field1726[var51];
				int[] var55 = arg0.field1725[var51];
				int var86 = var50 - 1;
				int var56 = var52;
				int var57;
				byte var58;
				for (var57 = method41(var52, arg0); var57 > var53[var56]; var57 = var57 << 1 | var58) {
					var56++;
					var58 = method40(arg0);
				}
				int var59 = var54[var57 - var55[var56]];
				while (true) {
					while (var59 != var42) {
						if (var59 == 0 || var59 == 1) {
							int var60 = -1;
							int var61 = 1;
							do {
								if (var59 == 0) {
									var60 += var61;
								} else if (var59 == 1) {
									var60 += var61 * 2;
								}
								var61 *= 2;
								if (var86 == 0) {
									var85++;
									var86 = 50;
									byte var62 = arg0.field1721[var85];
									var52 = arg0.field1727[var62];
									var53 = arg0.field1724[var62];
									var54 = arg0.field1726[var62];
									var55 = arg0.field1725[var62];
								}
								var86--;
								int var63 = var52;
								int var64;
								byte var65;
								for (var64 = method41(var52, arg0); var64 > var53[var63]; var64 = var64 << 1 | var65) {
									var63++;
									var65 = method40(arg0);
								}
								var59 = var54[var64 - var55[var63]];
							} while (var59 == 0 || var59 == 1);
							var60++;
							byte var66 = arg0.field1718[arg0.field1719[arg0.field1720[0]] & 0xFF];
							arg0.field1710[var66 & 0xFF] += var60;
							while (var60 > 0) {
								class72.field1714[var49] = var66 & 0xFF;
								var49++;
								var60--;
							}
						} else {
							int var67 = var59 - 1;
							byte var69;
							if (var67 < 16) {
								int var68 = arg0.field1720[0];
								var69 = arg0.field1719[var68 + var67];
								while (var67 > 3) {
									int var70 = var68 + var67;
									arg0.field1719[var70] = arg0.field1719[var70 - 1];
									arg0.field1719[var70 - 1] = arg0.field1719[var70 - 2];
									arg0.field1719[var70 - 2] = arg0.field1719[var70 - 3];
									arg0.field1719[var70 - 3] = arg0.field1719[var70 - 4];
									var67 -= 4;
								}
								while (var67 > 0) {
									arg0.field1719[var68 + var67] = arg0.field1719[var68 + var67 - 1];
									var67--;
								}
								arg0.field1719[var68] = var69;
							} else {
								int var71 = var67 / 16;
								int var72 = var67 % 16;
								int var73 = arg0.field1720[var71] + var72;
								var69 = arg0.field1719[var73];
								while (var73 > arg0.field1720[var71]) {
									arg0.field1719[var73] = arg0.field1719[var73 - 1];
									var73--;
								}
								int var10002 = arg0.field1720[var71]++;
								while (var71 > 0) {
									var10002 = arg0.field1720[var71]--;
									arg0.field1719[arg0.field1720[var71]] = arg0.field1719[arg0.field1720[var71 - 1] + 16 - 1];
									var71--;
								}
								var10002 = arg0.field1720[0]--;
								arg0.field1719[arg0.field1720[0]] = var69;
								if (arg0.field1720[0] == 0) {
									int var74 = 4095;
									for (int var75 = 15; var75 >= 0; var75--) {
										for (int var76 = 15; var76 >= 0; var76--) {
											arg0.field1719[var74] = arg0.field1719[arg0.field1720[var75] + var76];
											var74--;
										}
										arg0.field1720[var75] = var74 + 1;
									}
								}
							}
							arg0.field1710[arg0.field1718[var69 & 0xFF] & 0xFF]++;
							class72.field1714[var49] = arg0.field1718[var69 & 0xFF] & 0xFF;
							var49++;
							if (var86 == 0) {
								var85++;
								var86 = 50;
								byte var77 = arg0.field1721[var85];
								var52 = arg0.field1727[var77];
								var53 = arg0.field1724[var77];
								var54 = arg0.field1726[var77];
								var55 = arg0.field1725[var77];
							}
							var86--;
							int var78 = var52;
							int var79;
							byte var80;
							for (var79 = method41(var52, arg0); var79 > var53[var78]; var79 = var79 << 1 | var80) {
								var78++;
								var80 = method40(arg0);
							}
							var59 = var54[var79 - var55[var78]];
						}
					}
					arg0.field1701 = 0;
					arg0.field1700 = 0;
					arg0.field1712[0] = 0;
					for (int var81 = 1; var81 <= 256; var81++) {
						arg0.field1712[var81] = arg0.field1710[var81 - 1];
					}
					for (int var82 = 1; var82 <= 256; var82++) {
						arg0.field1712[var82] += arg0.field1712[var82 - 1];
					}
					for (int var83 = 0; var83 < var49; var83++) {
						byte var84 = (byte) (class72.field1714[var83] & 0xFF);
						class72.field1714[arg0.field1712[var84 & 0xFF]] |= var83 << 8;
						arg0.field1712[var84 & 0xFF]++;
					}
					arg0.field1708 = class72.field1714[arg0.field1707] >> 8;
					arg0.field1711 = 0;
					arg0.field1708 = class72.field1714[arg0.field1708];
					arg0.field1709 = (byte) (arg0.field1708 & 0xFF);
					arg0.field1708 >>= 0x8;
					arg0.field1711++;
					arg0.field1728 = var49;
					method37(arg0);
					if (arg0.field1711 == arg0.field1728 + 1 && arg0.field1701 == 0) {
						var1 = true;
						break;
					}
					var1 = false;
					break;
				}
			}
			return;
		}
	}

	@ObfuscatedName("CGPATBOH.c(LYZXSAOBR;)B")
	public static byte method39(class72 arg0) {
		return (byte) method41(8, arg0);
	}

	@ObfuscatedName("CGPATBOH.d(LYZXSAOBR;)B")
	public static byte method40(class72 arg0) {
		return (byte) method41(1, arg0);
	}

	@ObfuscatedName("CGPATBOH.a(ILYZXSAOBR;)I")
	public static int method41(int arg0, class72 arg1) {
		while (arg1.field1704 < arg0) {
			arg1.field1703 = arg1.field1703 << 8 | arg1.field1690[arg1.field1691] & 0xFF;
			arg1.field1704 += 8;
			arg1.field1691++;
			arg1.field1692--;
			arg1.field1693++;
			if (arg1.field1693 == 0) {
				arg1.field1694++;
			}
		}
		int var2 = arg1.field1703 >> arg1.field1704 - arg0 & (0x1 << arg0) - 1;
		arg1.field1704 -= arg0;
		return var2;
	}

	@ObfuscatedName("CGPATBOH.e(LYZXSAOBR;)V")
	public static void method42(class72 arg0) {
		arg0.field1715 = 0;
		for (int var1 = 0; var1 < 256; var1++) {
			if (arg0.field1716[var1]) {
				arg0.field1718[arg0.field1715] = (byte) var1;
				arg0.field1715++;
			}
		}
	}

	@ObfuscatedName("CGPATBOH.a([I[I[I[BIII)V")
	public static void method43(int[] arg0, int[] arg1, int[] arg2, byte[] arg3, int arg4, int arg5, int arg6) {
		int var7 = 0;
		for (int var8 = arg4; var8 <= arg5; var8++) {
			for (int var9 = 0; var9 < arg6; var9++) {
				if (arg3[var9] == var8) {
					arg2[var7] = var9;
					var7++;
				}
			}
		}
		for (int var10 = 0; var10 < 23; var10++) {
			arg1[var10] = 0;
		}
		for (int var11 = 0; var11 < arg6; var11++) {
			arg1[arg3[var11] + 1]++;
		}
		for (int var12 = 1; var12 < 23; var12++) {
			arg1[var12] += arg1[var12 - 1];
		}
		for (int var13 = 0; var13 < 23; var13++) {
			arg0[var13] = 0;
		}
		int var14 = 0;
		for (int var15 = arg4; var15 <= arg5; var15++) {
			int var16 = var14 + arg1[var15 + 1] - arg1[var15];
			arg0[var15] = var16 - 1;
			var14 = var16 << 1;
		}
		for (int var17 = arg4 + 1; var17 <= arg5; var17++) {
			arg1[var17] = (arg0[var17 - 1] + 1 << 1) - arg1[var17];
		}
	}
}
