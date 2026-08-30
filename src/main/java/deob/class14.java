package deob;

import sign.signlink;

@ObfuscatedName("DQLJXYPC")
public final class class14 {

	@ObfuscatedName("DQLJXYPC.d")
	public static final class31[] field692 = new class31[4];

	@ObfuscatedName("DQLJXYPC.K")
	public static class15 field725 = new class15((byte) 7, 40);

	@ObfuscatedName("DQLJXYPC.U")
	public static class15 field735 = new class15((byte) 7, 500);

	@ObfuscatedName("DQLJXYPC.Y")
	public static final boolean field739 = true;

	@ObfuscatedName("DQLJXYPC.c")
	public final byte field691 = 29;

	@ObfuscatedName("DQLJXYPC.h")
	public final int field696 = 31;

	@ObfuscatedName("DQLJXYPC.z")
	public int field714 = -1;

	@ObfuscatedName("DQLJXYPC.V")
	public boolean field736 = false;

	@ObfuscatedName("DQLJXYPC.e")
	public byte field693;

	@ObfuscatedName("DQLJXYPC.P")
	public byte field730;

	@ObfuscatedName("DQLJXYPC.f")
	public int field694;

	@ObfuscatedName("DQLJXYPC.g")
	public int field695;

	@ObfuscatedName("DQLJXYPC.i")
	public static int field697;

	@ObfuscatedName("DQLJXYPC.o")
	public int field703;

	@ObfuscatedName("DQLJXYPC.t")
	public int field708;

	@ObfuscatedName("DQLJXYPC.u")
	public int field709;

	@ObfuscatedName("DQLJXYPC.w")
	public int field711;

	@ObfuscatedName("DQLJXYPC.y")
	public int field713;

	@ObfuscatedName("DQLJXYPC.G")
	public int field721;

	@ObfuscatedName("DQLJXYPC.I")
	public int field723;

	@ObfuscatedName("DQLJXYPC.J")
	public static int field724;

	@ObfuscatedName("DQLJXYPC.M")
	public int field727;

	@ObfuscatedName("DQLJXYPC.Q")
	public int field731;

	@ObfuscatedName("DQLJXYPC.R")
	public int field732;

	@ObfuscatedName("DQLJXYPC.S")
	public int field733;

	@ObfuscatedName("DQLJXYPC.T")
	public int field734;

	@ObfuscatedName("DQLJXYPC.W")
	public int field737;

	@ObfuscatedName("DQLJXYPC.X")
	public int field738;

	@ObfuscatedName("DQLJXYPC.r")
	public static class17 field706;

	@ObfuscatedName("DQLJXYPC.l")
	public static client field700;

	@ObfuscatedName("DQLJXYPC.O")
	public String field729;

	@ObfuscatedName("DQLJXYPC.j")
	public boolean field698;

	@ObfuscatedName("DQLJXYPC.k")
	public boolean field699;

	@ObfuscatedName("DQLJXYPC.m")
	public boolean field701;

	@ObfuscatedName("DQLJXYPC.n")
	public boolean field702;

	@ObfuscatedName("DQLJXYPC.q")
	public boolean field705;

	@ObfuscatedName("DQLJXYPC.s")
	public boolean field707;

	@ObfuscatedName("DQLJXYPC.B")
	public boolean field716;

	@ObfuscatedName("DQLJXYPC.E")
	public boolean field719;

	@ObfuscatedName("DQLJXYPC.F")
	public boolean field720;

	@ObfuscatedName("DQLJXYPC.H")
	public static boolean field722;

	@ObfuscatedName("DQLJXYPC.N")
	public boolean field728;

	@ObfuscatedName("DQLJXYPC.a")
	public byte[] field689;

	@ObfuscatedName("DQLJXYPC.b")
	public static int[] field690;

	@ObfuscatedName("DQLJXYPC.v")
	public int[] field710;

	@ObfuscatedName("DQLJXYPC.x")
	public int[] field712;

	@ObfuscatedName("DQLJXYPC.A")
	public int[] field715;

	@ObfuscatedName("DQLJXYPC.C")
	public int[] field717;

	@ObfuscatedName("DQLJXYPC.L")
	public int[] field726;

	@ObfuscatedName("DQLJXYPC.p")
	public static class14[] field704;

	@ObfuscatedName("DQLJXYPC.D")
	public String[] field718;

	@ObfuscatedName("DQLJXYPC.a(LBBMKAXRK;)V")
	public static void method187(class6 arg0) {
		field706 = new class17(arg0.method30("loc.dat", null), -26583);
		class17 var1 = new class17(arg0.method30("loc.idx", null), -26583);
		field724 = var1.method226();
		field690 = new int[field724];
		int var2 = 2;
		for (int var3 = 0; var3 < field724; var3++) {
			field690[var3] = var2;
			var2 += var1.method226();
		}
		field704 = new class14[20];
		for (int var4 = 0; var4 < 20; var4++) {
			field704[var4] = new class14();
		}
	}

	@ObfuscatedName("DQLJXYPC.a(I)LDQLJXYPC;")
	public static class14 method192(int arg0) {
		for (int var1 = 0; var1 < 20; var1++) {
			if (field704[var1].field714 == arg0) {
				return field704[var1];
			}
		}
		field697 = (field697 + 1) % 20;
		class14 var2 = field704[field697];
		field706.field779 = field690[arg0];
		var2.field714 = arg0;
		var2.method196();
		var2.method195(field706);
		return var2;
	}

	@ObfuscatedName("DQLJXYPC.b(I)V")
	public static void method193() {
		try {
			field735 = null;
			field725 = null;
			field690 = null;
			field704 = null;
			field706 = null;
		} catch (RuntimeException var1) {
			signlink.reporterror("61766, " + ", " + var1.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("DQLJXYPC.a(IIII)LKBEXSZSN;")
	public class31 method186(int arg0, int arg1, int arg2) {
		try {
			class31 var4 = null;
			long var5;
			if (this.field715 == null) {
				if (arg0 != 10) {
					return null;
				}
				var5 = (long) ((this.field714 << 6) + arg1) + ((long) (arg2 + 1) << 32);
				class31 var7 = (class31) field725.method197(var5);
				if (var7 != null) {
					return var7;
				}
				if (this.field710 == null) {
					return null;
				}
				boolean var8 = this.field720 ^ arg1 > 3;
				int var9 = this.field710.length;
				for (int var10 = 0; var10 < var9; var10++) {
					int var11 = this.field710[var10];
					if (var8) {
						var11 += 65536;
					}
					var4 = (class31) field735.method197((long) var11);
					if (var4 == null) {
						var4 = class31.method339(var11 & 0xFFFF);
						if (var4 == null) {
							return null;
						}
						if (var8) {
							var4.method354(804);
						}
						field735.method198((byte) 7, (long) var11, var4);
					}
					if (var9 > 1) {
						field692[var10] = var4;
					}
				}
				if (var9 > 1) {
					var4 = new class31(var9, field692, 5);
				}
			} else {
				int var12 = -1;
				for (int var13 = 0; var13 < this.field715.length; var13++) {
					if (this.field715[var13] == arg0) {
						var12 = var13;
						break;
					}
				}
				if (var12 == -1) {
					return null;
				}
				var5 = (long) ((this.field714 << 6) + (var12 << 3) + arg1) + ((long) (arg2 + 1) << 32);
				class31 var14 = (class31) field725.method197(var5);
				if (var14 != null) {
					return var14;
				}
				int var15 = this.field710[var12];
				boolean var16 = this.field720 ^ arg1 > 3;
				if (var16) {
					var15 += 65536;
				}
				var4 = (class31) field735.method197((long) var15);
				if (var4 == null) {
					var4 = class31.method339(var15 & 0xFFFF);
					if (var4 == null) {
						return null;
					}
					if (var16) {
						var4.method354(804);
					}
					field735.method198((byte) 7, (long) var15, var4);
				}
			}
			boolean var17;
			if (this.field713 == 128 && this.field727 == 128 && this.field695 == 128) {
				var17 = false;
			} else {
				var17 = true;
			}
			boolean var18;
			if (this.field738 == 0 && this.field734 == 0 && this.field723 == 0) {
				var18 = false;
			} else {
				var18 = true;
			}
			class31 var19 = new class31(arg1 == 0 && arg2 == -1 && !var17 && !var18, 777, class25.method309(arg2), var4, this.field717 == null);
			if (arg2 != -1) {
				var19.method346(311);
				var19.method347(arg2);
				var19.field1032 = null;
				var19.field1031 = null;
			}
			while (arg1-- > 0) {
				var19.method350();
			}
			if (this.field717 != null) {
				for (int var20 = 0; var20 < this.field717.length; var20++) {
					var19.method353(this.field717[var20], this.field712[var20]);
				}
			}
			if (var17) {
				var19.method355(this.field691, this.field695, this.field727, this.field713);
			}
			if (var18) {
				var19.method352(this.field734, this.field738, this.field723);
			}
			var19.method356(this.field693 + 64, this.field730 * 5 + 768, -50, -10, -50, !this.field716);
			if (this.field711 == 1) {
				var19.field1028 = var19.field1489;
			}
			field725.method198((byte) 7, var5, var19);
			return var19;
		} catch (RuntimeException var22) {
			signlink.reporterror("83654, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + -39484 + ", " + var22.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("DQLJXYPC.a(Z)Z")
	public boolean method188() {
		try {
			if (this.field710 == null) {
				return true;
			}
			boolean var1 = true;
			for (int var2 = 0; var2 < this.field710.length; var2++) {
				var1 &= class31.method340(this.field710[var2] & 0xFFFF);
			}
			return var1;
		} catch (RuntimeException var4) {
			signlink.reporterror("52026, " + false + ", " + var4.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("DQLJXYPC.a(IIIIIII)LKBEXSZSN;")
	public class31 method189(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		class31 var8 = this.method186(arg0, arg1, arg6);
		if (var8 == null) {
			return null;
		}
		if (this.field728 || this.field716) {
			var8 = new class31(var8, this.field728, this.field716, false);
		}
		if (this.field728) {
			int var9 = (arg2 + arg3 + arg4 + arg5) / 4;
			for (int var10 = 0; var10 < var8.field1001; var10++) {
				int var11 = var8.field1002[var10];
				int var12 = var8.field1004[var10];
				int var13 = arg2 + (arg3 - arg2) * (var11 + 64) / 128;
				int var14 = arg5 + (arg4 - arg5) * (var11 + 64) / 128;
				int var15 = var13 + (var14 - var13) * (var12 + 64) / 128;
				var8.field1003[var10] += var15 - var9;
			}
			var8.method344();
		}
		return var8;
	}

	@ObfuscatedName("DQLJXYPC.a(II)Z")
	public boolean method190(int arg0) {
		try {
			if (this.field715 != null) {
				for (int var4 = 0; var4 < this.field715.length; var4++) {
					if (this.field715[var4] == arg0) {
						return class31.method340(this.field710[var4] & 0xFFFF);
					}
				}
				return true;
			} else if (this.field710 == null) {
				return true;
			} else if (arg0 == 10) {
				boolean var2 = true;
				for (int var3 = 0; var3 < this.field710.length; var3++) {
					var2 &= class31.method340(this.field710[var3] & 0xFFFF);
				}
				return var2;
			} else {
				return true;
			}
		} catch (RuntimeException var6) {
			signlink.reporterror("69699, " + 401 + ", " + arg0 + ", " + var6.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("DQLJXYPC.a(LYSAVREBH;I)V")
	public void method191(class71 arg0) {
		try {
			if (this.field710 != null) {
				for (int var2 = 0; var2 < this.field710.length; var2++) {
					arg0.method598(this.field710[var2] & 0xFFFF, 0);
				}
			}
		} catch (RuntimeException var4) {
			signlink.reporterror("93606, " + arg0 + ", " + ", " + var4.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("DQLJXYPC.c(I)LDQLJXYPC;")
	public class14 method194(int arg0) {
		try {
			int var2 = -1;
			if (arg0 <= 0) {
				this.field736 = !this.field736;
			}
			if (this.field732 != -1) {
				class51 var3 = class51.field1328[this.field732];
				int var4 = var3.field1330;
				int var5 = var3.field1331;
				int var6 = var3.field1332;
				int var7 = client.field528[var6 - var5];
				var2 = field700.field643[var4] >> var5 & var7;
			} else if (this.field709 != -1) {
				var2 = field700.field643[this.field709];
			}
			return var2 < 0 || var2 >= this.field726.length || this.field726[var2] == -1 ? null : method192(this.field726[var2]);
		} catch (RuntimeException var9) {
			signlink.reporterror("87467, " + arg0 + ", " + var9.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("DQLJXYPC.a(LEILHLJCE;B)V")
	public void method195(class17 arg0) {
		try {
			int var2 = -1;
			while (true) {
				while (true) {
					int var4;
					do {
						while (true) {
							int var3 = arg0.method224();
							if (var3 == 0) {
								if (var2 == -1) {
									this.field699 = false;
									if (this.field710 != null && (this.field715 == null || this.field715[0] == 10)) {
										this.field699 = true;
									}
									if (this.field718 != null) {
										this.field699 = true;
									}
								}
								if (this.field702) {
									this.field698 = false;
									this.field705 = false;
								}
								if (this.field711 == -1) {
									this.field711 = this.field698 ? 1 : 0;
									return;
								}
								return;
							}
							if (var3 == 1) {
								var4 = arg0.method224();
								break;
							}
							if (var3 == 2) {
								this.field729 = arg0.method231();
							} else if (var3 == 3) {
								this.field689 = arg0.method232();
							} else if (var3 == 5) {
								int var6 = arg0.method224();
								if (var6 > 0) {
									if (this.field710 == null || field722) {
										this.field715 = null;
										this.field710 = new int[var6];
										for (int var7 = 0; var7 < var6; var7++) {
											this.field710[var7] = arg0.method226();
										}
									} else {
										arg0.field779 += var6 * 2;
									}
								}
							} else if (var3 == 14) {
								this.field708 = arg0.method224();
							} else if (var3 == 15) {
								this.field703 = arg0.method224();
							} else if (var3 == 17) {
								this.field698 = false;
							} else if (var3 == 18) {
								this.field705 = false;
							} else if (var3 == 19) {
								var2 = arg0.method224();
								if (var2 == 1) {
									this.field699 = true;
								}
							} else if (var3 == 21) {
								this.field728 = true;
							} else if (var3 == 22) {
								this.field716 = true;
							} else if (var3 == 23) {
								this.field707 = true;
							} else if (var3 == 24) {
								this.field694 = arg0.method226();
								if (this.field694 == 65535) {
									this.field694 = -1;
								}
							} else if (var3 == 28) {
								this.field731 = arg0.method224();
							} else if (var3 == 29) {
								this.field693 = arg0.method225();
							} else if (var3 == 39) {
								this.field730 = arg0.method225();
							} else if (var3 >= 30 && var3 < 39) {
								if (this.field718 == null) {
									this.field718 = new String[5];
								}
								this.field718[var3 - 30] = arg0.method231();
								if (this.field718[var3 - 30].equalsIgnoreCase("hidden")) {
									this.field718[var3 - 30] = null;
								}
							} else if (var3 == 40) {
								int var8 = arg0.method224();
								this.field717 = new int[var8];
								this.field712 = new int[var8];
								for (int var9 = 0; var9 < var8; var9++) {
									this.field717[var9] = arg0.method226();
									this.field712[var9] = arg0.method226();
								}
							} else if (var3 == 60) {
								this.field721 = arg0.method226();
							} else if (var3 == 62) {
								this.field720 = true;
							} else if (var3 == 64) {
								this.field719 = false;
							} else if (var3 == 65) {
								this.field713 = arg0.method226();
							} else if (var3 == 66) {
								this.field727 = arg0.method226();
							} else if (var3 == 67) {
								this.field695 = arg0.method226();
							} else if (var3 == 68) {
								this.field733 = arg0.method226();
							} else if (var3 == 69) {
								this.field737 = arg0.method224();
							} else if (var3 == 70) {
								this.field738 = arg0.method227();
							} else if (var3 == 71) {
								this.field734 = arg0.method227();
							} else if (var3 == 72) {
								this.field723 = arg0.method227();
							} else if (var3 == 73) {
								this.field701 = true;
							} else if (var3 == 74) {
								this.field702 = true;
							} else if (var3 == 75) {
								this.field711 = arg0.method224();
							} else if (var3 == 77) {
								this.field732 = arg0.method226();
								if (this.field732 == 65535) {
									this.field732 = -1;
								}
								this.field709 = arg0.method226();
								if (this.field709 == 65535) {
									this.field709 = -1;
								}
								int var10 = arg0.method224();
								this.field726 = new int[var10 + 1];
								for (int var11 = 0; var11 <= var10; var11++) {
									this.field726[var11] = arg0.method226();
									if (this.field726[var11] == 65535) {
										this.field726[var11] = -1;
									}
								}
							}
						}
					} while (var4 <= 0);
					if (this.field710 == null || field722) {
						this.field715 = new int[var4];
						this.field710 = new int[var4];
						for (int var5 = 0; var5 < var4; var5++) {
							this.field710[var5] = arg0.method226();
							this.field715[var5] = arg0.method224();
						}
					} else {
						arg0.field779 += var4 * 3;
					}
				}
			}
		} catch (RuntimeException var13) {
			signlink.reporterror("23534, " + arg0 + ", " + -50 + ", " + var13.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("DQLJXYPC.a()V")
	public void method196() {
		this.field710 = null;
		this.field715 = null;
		this.field729 = null;
		this.field689 = null;
		this.field717 = null;
		this.field712 = null;
		this.field708 = 1;
		this.field703 = 1;
		this.field698 = true;
		this.field705 = true;
		this.field699 = false;
		this.field728 = false;
		this.field716 = false;
		this.field707 = false;
		this.field694 = -1;
		this.field731 = 16;
		this.field693 = 0;
		this.field730 = 0;
		this.field718 = null;
		this.field721 = -1;
		this.field733 = -1;
		this.field720 = false;
		this.field719 = true;
		this.field713 = 128;
		this.field727 = 128;
		this.field695 = 128;
		this.field737 = 0;
		this.field738 = 0;
		this.field734 = 0;
		this.field723 = 0;
		this.field701 = false;
		this.field702 = false;
		this.field711 = -1;
		this.field732 = -1;
		this.field709 = -1;
		this.field726 = null;
	}
}
