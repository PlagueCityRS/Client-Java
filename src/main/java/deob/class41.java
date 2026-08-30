package deob;

import sign.signlink;

@ObfuscatedName("ODMBIHRM")
public final class class41 {

	@ObfuscatedName("ODMBIHRM.h")
	public int field1189 = -1;

	@ObfuscatedName("ODMBIHRM.j")
	public boolean field1191 = false;

	@ObfuscatedName("ODMBIHRM.k")
	public int field1192 = 5;

	@ObfuscatedName("ODMBIHRM.l")
	public int field1193 = -1;

	@ObfuscatedName("ODMBIHRM.m")
	public int field1194 = -1;

	@ObfuscatedName("ODMBIHRM.n")
	public int field1195 = 99;

	@ObfuscatedName("ODMBIHRM.o")
	public int field1196 = -1;

	@ObfuscatedName("ODMBIHRM.p")
	public int field1197 = -1;

	@ObfuscatedName("ODMBIHRM.q")
	public int field1198 = 2;

	@ObfuscatedName("ODMBIHRM.b")
	public static int field1183;

	@ObfuscatedName("ODMBIHRM.d")
	public int field1185;

	@ObfuscatedName("ODMBIHRM.r")
	public int field1199;

	@ObfuscatedName("ODMBIHRM.e")
	public int[] field1186;

	@ObfuscatedName("ODMBIHRM.f")
	public int[] field1187;

	@ObfuscatedName("ODMBIHRM.g")
	public int[] field1188;

	@ObfuscatedName("ODMBIHRM.i")
	public int[] field1190;

	@ObfuscatedName("ODMBIHRM.c")
	public static class41[] field1184;

	@ObfuscatedName("ODMBIHRM.a(ILBBMKAXRK;)V")
	public static void method412(class6 arg0) {
		try {
			class17 var1 = new class17(arg0.method30("seq.dat", null), -26583);
			field1183 = var1.method226();
			if (field1184 == null) {
				field1184 = new class41[field1183];
			}
			for (int var2 = 0; var2 < field1183; var2++) {
				if (field1184[var2] == null) {
					field1184[var2] = new class41();
				}
				field1184[var2].method414(var1);
			}
		} catch (RuntimeException var4) {
			signlink.reporterror("88281, " + -768 + ", " + arg0 + ", " + var4.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("ODMBIHRM.a(IZ)I")
	public int method413(int arg0) {
		try {
			int var2 = this.field1188[arg0];
			if (var2 == 0) {
				class25 var3 = class25.method308(this.field1186[arg0]);
				if (var3 != null) {
					var2 = this.field1188[arg0] = var3.field863;
				}
			}
			if (var2 == 0) {
				var2 = 1;
			}
			return var2;
		} catch (RuntimeException var5) {
			signlink.reporterror("95358, " + arg0 + ", " + false + ", " + var5.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("ODMBIHRM.a(LEILHLJCE;B)V")
	public void method414(class17 arg0) {
		try {
			while (true) {
				int var2 = arg0.method224();
				if (var2 == 0) {
					if (this.field1185 == 0) {
						this.field1185 = 1;
						this.field1186 = new int[1];
						this.field1186[0] = -1;
						this.field1187 = new int[1];
						this.field1187[0] = -1;
						this.field1188 = new int[1];
						this.field1188[0] = -1;
					}
					if (this.field1196 == -1) {
						if (this.field1190 == null) {
							this.field1196 = 0;
						} else {
							this.field1196 = 2;
						}
					}
					if (this.field1197 == -1) {
						if (this.field1190 != null) {
							this.field1197 = 2;
							return;
						}
						this.field1197 = 0;
						return;
					}
					return;
				}
				if (var2 == 1) {
					this.field1185 = arg0.method224();
					this.field1186 = new int[this.field1185];
					this.field1187 = new int[this.field1185];
					this.field1188 = new int[this.field1185];
					for (int var3 = 0; var3 < this.field1185; var3++) {
						this.field1186[var3] = arg0.method226();
						this.field1187[var3] = arg0.method226();
						if (this.field1187[var3] == 65535) {
							this.field1187[var3] = -1;
						}
						this.field1188[var3] = arg0.method226();
					}
				} else if (var2 == 2) {
					this.field1189 = arg0.method226();
				} else if (var2 == 3) {
					int var4 = arg0.method224();
					this.field1190 = new int[var4 + 1];
					for (int var5 = 0; var5 < var4; var5++) {
						this.field1190[var5] = arg0.method224();
					}
					this.field1190[var4] = 9999999;
				} else if (var2 == 4) {
					this.field1191 = true;
				} else if (var2 == 5) {
					this.field1192 = arg0.method224();
				} else if (var2 == 6) {
					this.field1193 = arg0.method226();
				} else if (var2 == 7) {
					this.field1194 = arg0.method226();
				} else if (var2 == 8) {
					this.field1195 = arg0.method224();
				} else if (var2 == 9) {
					this.field1196 = arg0.method224();
				} else if (var2 == 10) {
					this.field1197 = arg0.method224();
				} else if (var2 == 11) {
					this.field1198 = arg0.method224();
				} else if (var2 == 12) {
					this.field1199 = arg0.method229();
				} else {
					System.out.println("Error unrecognised seq config code: " + var2);
				}
			}
		} catch (RuntimeException var7) {
			signlink.reporterror("74550, " + arg0 + ", " + -50 + ", " + var7.toString());
			throw new RuntimeException();
		}
	}
}
