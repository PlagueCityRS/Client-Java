package deob;

import sign.signlink;

@ObfuscatedName("NPWLDXJE")
public final class class37 {

	@ObfuscatedName("NPWLDXJE.a")
	public static class15 field1118 = new class15((byte) 7, 30);

	@ObfuscatedName("NPWLDXJE.e")
	public long field1122 = -1L;

	@ObfuscatedName("NPWLDXJE.f")
	public int field1123 = -1;

	@ObfuscatedName("NPWLDXJE.g")
	public int field1124 = 128;

	@ObfuscatedName("NPWLDXJE.j")
	public byte field1127 = 1;

	@ObfuscatedName("NPWLDXJE.k")
	public boolean field1128 = true;

	@ObfuscatedName("NPWLDXJE.m")
	public int field1130 = -1;

	@ObfuscatedName("NPWLDXJE.n")
	public int field1131 = -1;

	@ObfuscatedName("NPWLDXJE.o")
	public boolean field1132 = true;

	@ObfuscatedName("NPWLDXJE.q")
	public int field1134 = 128;

	@ObfuscatedName("NPWLDXJE.r")
	public final byte field1135 = 29;

	@ObfuscatedName("NPWLDXJE.s")
	public int field1136 = -1;

	@ObfuscatedName("NPWLDXJE.t")
	public int field1137 = -1;

	@ObfuscatedName("NPWLDXJE.u")
	public int field1138 = -1;

	@ObfuscatedName("NPWLDXJE.v")
	public int field1139 = -1;

	@ObfuscatedName("NPWLDXJE.w")
	public int field1140 = 32;

	@ObfuscatedName("NPWLDXJE.x")
	public int field1141 = -1;

	@ObfuscatedName("NPWLDXJE.A")
	public int field1144 = -1;

	@ObfuscatedName("NPWLDXJE.B")
	public boolean field1145 = false;

	@ObfuscatedName("NPWLDXJE.F")
	public int field1149 = -1;

	@ObfuscatedName("NPWLDXJE.H")
	public int field1151 = -1;

	@ObfuscatedName("NPWLDXJE.I")
	public int field1152 = -1;

	@ObfuscatedName("NPWLDXJE.h")
	public int field1125;

	@ObfuscatedName("NPWLDXJE.z")
	public static int field1143;

	@ObfuscatedName("NPWLDXJE.E")
	public static int field1148;

	@ObfuscatedName("NPWLDXJE.J")
	public int field1153;

	@ObfuscatedName("NPWLDXJE.C")
	public static class17 field1146;

	@ObfuscatedName("NPWLDXJE.d")
	public static client field1121;

	@ObfuscatedName("NPWLDXJE.y")
	public String field1142;

	@ObfuscatedName("NPWLDXJE.D")
	public byte[] field1147;

	@ObfuscatedName("NPWLDXJE.b")
	public int[] field1119;

	@ObfuscatedName("NPWLDXJE.c")
	public int[] field1120;

	@ObfuscatedName("NPWLDXJE.i")
	public static int[] field1126;

	@ObfuscatedName("NPWLDXJE.l")
	public int[] field1129;

	@ObfuscatedName("NPWLDXJE.K")
	public int[] field1154;

	@ObfuscatedName("NPWLDXJE.L")
	public int[] field1155;

	@ObfuscatedName("NPWLDXJE.G")
	public static class37[] field1150;

	@ObfuscatedName("NPWLDXJE.p")
	public String[] field1133;

	@ObfuscatedName("NPWLDXJE.a(LBBMKAXRK;)V")
	public static void method391(class6 arg0) {
		field1146 = new class17(arg0.method30("npc.dat", null), -26583);
		class17 var1 = new class17(arg0.method30("npc.idx", null), -26583);
		field1143 = var1.method226();
		field1126 = new int[field1143];
		int var2 = 2;
		for (int var3 = 0; var3 < field1143; var3++) {
			field1126[var3] = var2;
			var2 += var1.method226();
		}
		field1150 = new class37[20];
		for (int var4 = 0; var4 < 20; var4++) {
			field1150[var4] = new class37();
		}
	}

	@ObfuscatedName("NPWLDXJE.b(I)LNPWLDXJE;")
	public static class37 method393(int arg0) {
		for (int var1 = 0; var1 < 20; var1++) {
			if (field1150[var1].field1122 == (long) arg0) {
				return field1150[var1];
			}
		}
		field1148 = (field1148 + 1) % 20;
		class37 var2 = field1150[field1148] = new class37();
		field1146.field779 = field1126[arg0];
		var2.field1122 = arg0;
		var2.method395(field1146);
		return var2;
	}

	@ObfuscatedName("NPWLDXJE.c(I)V")
	public static void method394() {
		try {
			field1118 = null;
			field1126 = null;
			field1150 = null;
			field1146 = null;
		} catch (RuntimeException var1) {
			signlink.reporterror("26436, " + ", " + var1.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("NPWLDXJE.a(II[IZ)LKBEXSZSN;")
	public class31 method388(int arg0, int arg1, int[] arg2) {
		try {
			if (this.field1119 != null) {
				class37 var4 = this.method389();
				return var4 == null ? null : var4.method388(arg0, arg1, arg2);
			}
			class31 var5 = (class31) field1118.method197(this.field1122);
			if (var5 == null) {
				boolean var6 = false;
				for (int var7 = 0; var7 < this.field1154.length; var7++) {
					if (!class31.method340(this.field1154[var7])) {
						var6 = true;
					}
				}
				if (var6) {
					return null;
				}
				class31[] var8 = new class31[this.field1154.length];
				for (int var9 = 0; var9 < this.field1154.length; var9++) {
					var8[var9] = class31.method339(this.field1154[var9]);
				}
				if (var8.length == 1) {
					var5 = var8[0];
				} else {
					var5 = new class31(var8.length, var8, 5);
				}
				if (this.field1155 != null) {
					for (int var10 = 0; var10 < this.field1155.length; var10++) {
						var5.method353(this.field1155[var10], this.field1120[var10]);
					}
				}
				var5.method346(311);
				var5.method356(this.field1125 + 64, this.field1153 + 850, -30, -50, -30, true);
				field1118.method198((byte) 7, this.field1122, var5);
			}
			class31 var11 = class31.field996;
			var11.method341(var5, class25.method309(arg0) & class25.method309(arg1));
			if (arg0 != -1 && arg1 != -1) {
				var11.method348(arg2, arg1, arg0);
			} else if (arg0 != -1) {
				var11.method347(arg0);
			}
			if (this.field1124 != 128 || this.field1134 != 128) {
				var11.method355(this.field1135, this.field1124, this.field1134, this.field1124);
			}
			var11.method343();
			var11.field1032 = null;
			var11.field1031 = null;
			if (this.field1127 == 1) {
				var11.field1033 = true;
			}
			return var11;
		} catch (RuntimeException var13) {
			signlink.reporterror("17351, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + true + ", " + var13.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("NPWLDXJE.a(B)LNPWLDXJE;")
	public class37 method389() {
		try {
			int var1 = -1;
			if (this.field1131 != -1) {
				class51 var2 = class51.field1328[this.field1131];
				int var3 = var2.field1330;
				int var4 = var2.field1331;
				int var5 = var2.field1332;
				int var6 = client.field528[var5 - var4];
				var1 = field1121.field643[var3] >> var4 & var6;
			} else if (this.field1152 != -1) {
				var1 = field1121.field643[this.field1152];
			}
			return var1 < 0 || var1 >= this.field1119.length || this.field1119[var1] == -1 ? null : method393(this.field1119[var1]);
		} catch (RuntimeException var8) {
			signlink.reporterror("50665, " + 108 + ", " + var8.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("NPWLDXJE.a(Z)LKBEXSZSN;")
	public class31 method390() {
		try {
			if (this.field1119 != null) {
				class37 var1 = this.method389();
				return var1 == null ? null : var1.method390();
			} else if (this.field1129 == null) {
				return null;
			} else {
				boolean var2 = false;
				for (int var3 = 0; var3 < this.field1129.length; var3++) {
					if (!class31.method340(this.field1129[var3])) {
						var2 = true;
					}
				}
				if (var2) {
					return null;
				}
				class31[] var4 = new class31[this.field1129.length];
				for (int var5 = 0; var5 < this.field1129.length; var5++) {
					var4[var5] = class31.method339(this.field1129[var5]);
				}
				class31 var6;
				if (var4.length == 1) {
					var6 = var4[0];
				} else {
					var6 = new class31(var4.length, var4, 5);
				}
				if (this.field1155 != null) {
					for (int var7 = 0; var7 < this.field1155.length; var7++) {
						var6.method353(this.field1155[var7], this.field1120[var7]);
					}
				}
				return var6;
			}
		} catch (RuntimeException var9) {
			signlink.reporterror("79583, " + false + ", " + var9.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("NPWLDXJE.a(I)Z")
	public boolean method392() {
		try {
			if (this.field1119 == null) {
				return true;
			}
			int var1 = -1;
			if (this.field1131 != -1) {
				class51 var2 = class51.field1328[this.field1131];
				int var3 = var2.field1330;
				int var4 = var2.field1331;
				int var5 = var2.field1332;
				int var6 = client.field528[var5 - var4];
				var1 = field1121.field643[var3] >> var4 & var6;
			} else if (this.field1152 != -1) {
				var1 = field1121.field643[this.field1152];
			}
			return var1 >= 0 && var1 < this.field1119.length && this.field1119[var1] != -1;
		} catch (RuntimeException var8) {
			signlink.reporterror("16817, " + ", " + var8.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("NPWLDXJE.a(LEILHLJCE;B)V")
	public void method395(class17 arg0) {
		try {
			while (true) {
				int var2 = arg0.method224();
				if (var2 == 0) {
					return;
				}
				if (var2 == 1) {
					int var3 = arg0.method224();
					this.field1154 = new int[var3];
					for (int var4 = 0; var4 < var3; var4++) {
						this.field1154[var4] = arg0.method226();
					}
				} else if (var2 == 2) {
					this.field1142 = arg0.method231();
				} else if (var2 == 3) {
					this.field1147 = arg0.method232();
				} else if (var2 == 12) {
					this.field1127 = arg0.method225();
				} else if (var2 == 13) {
					this.field1141 = arg0.method226();
				} else if (var2 == 14) {
					this.field1151 = arg0.method226();
				} else if (var2 == 17) {
					this.field1151 = arg0.method226();
					this.field1136 = arg0.method226();
					this.field1123 = arg0.method226();
					this.field1149 = arg0.method226();
				} else if (var2 >= 30 && var2 < 40) {
					if (this.field1133 == null) {
						this.field1133 = new String[5];
					}
					this.field1133[var2 - 30] = arg0.method231();
					if (this.field1133[var2 - 30].equalsIgnoreCase("hidden")) {
						this.field1133[var2 - 30] = null;
					}
				} else if (var2 == 40) {
					int var5 = arg0.method224();
					this.field1155 = new int[var5];
					this.field1120 = new int[var5];
					for (int var6 = 0; var6 < var5; var6++) {
						this.field1155[var6] = arg0.method226();
						this.field1120[var6] = arg0.method226();
					}
				} else if (var2 == 60) {
					int var7 = arg0.method224();
					this.field1129 = new int[var7];
					for (int var8 = 0; var8 < var7; var8++) {
						this.field1129[var8] = arg0.method226();
					}
				} else if (var2 == 90) {
					this.field1130 = arg0.method226();
				} else if (var2 == 91) {
					this.field1144 = arg0.method226();
				} else if (var2 == 92) {
					this.field1139 = arg0.method226();
				} else if (var2 == 93) {
					this.field1132 = false;
				} else if (var2 == 95) {
					this.field1137 = arg0.method226();
				} else if (var2 == 97) {
					this.field1124 = arg0.method226();
				} else if (var2 == 98) {
					this.field1134 = arg0.method226();
				} else if (var2 == 99) {
					this.field1145 = true;
				} else if (var2 == 100) {
					this.field1125 = arg0.method225();
				} else if (var2 == 101) {
					this.field1153 = arg0.method225() * 5;
				} else if (var2 == 102) {
					this.field1138 = arg0.method226();
				} else if (var2 == 103) {
					this.field1140 = arg0.method226();
				} else if (var2 == 106) {
					this.field1131 = arg0.method226();
					if (this.field1131 == 65535) {
						this.field1131 = -1;
					}
					this.field1152 = arg0.method226();
					if (this.field1152 == 65535) {
						this.field1152 = -1;
					}
					int var9 = arg0.method224();
					this.field1119 = new int[var9 + 1];
					for (int var10 = 0; var10 <= var9; var10++) {
						this.field1119[var10] = arg0.method226();
						if (this.field1119[var10] == 65535) {
							this.field1119[var10] = -1;
						}
					}
				} else if (var2 == 107) {
					this.field1128 = false;
				}
			}
		} catch (RuntimeException var12) {
			signlink.reporterror("88035, " + arg0 + ", " + -50 + ", " + var12.toString());
			throw new RuntimeException();
		}
	}
}
