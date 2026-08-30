package deob;

import sign.signlink;

@ObfuscatedName("TFKCMRVE")
public final class class54 {

	@ObfuscatedName("TFKCMRVE.b")
	public final boolean field1354 = true;

	@ObfuscatedName("TFKCMRVE.c")
	public final boolean field1355 = true;

	@ObfuscatedName("TFKCMRVE.f")
	public int field1358 = -1;

	@ObfuscatedName("TFKCMRVE.h")
	public final int[] field1360 = new int[6];

	@ObfuscatedName("TFKCMRVE.i")
	public final int[] field1361 = new int[6];

	@ObfuscatedName("TFKCMRVE.j")
	public final int[] field1362 = new int[] { -1, -1, -1, -1, -1 };

	@ObfuscatedName("TFKCMRVE.k")
	public boolean field1363 = false;

	@ObfuscatedName("TFKCMRVE.d")
	public static int field1356;

	@ObfuscatedName("TFKCMRVE.a")
	public static boolean field1353;

	@ObfuscatedName("TFKCMRVE.g")
	public int[] field1359;

	@ObfuscatedName("TFKCMRVE.e")
	public static class54[] field1357;

	@ObfuscatedName("TFKCMRVE.a(ILBBMKAXRK;)V")
	public static void method453(class6 arg0) {
		try {
			class17 var1 = new class17(arg0.method30("idk.dat", null), -26583);
			field1356 = var1.method226();
			if (field1357 == null) {
				field1357 = new class54[field1356];
			}
			for (int var2 = 0; var2 < field1356; var2++) {
				if (field1357[var2] == null) {
					field1357[var2] = new class54();
				}
				field1357[var2].method454(var1);
			}
		} catch (RuntimeException var4) {
			signlink.reporterror("89473, " + -768 + ", " + arg0 + ", " + var4.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("TFKCMRVE.a(LEILHLJCE;B)V")
	public void method454(class17 arg0) {
		try {
			while (true) {
				int var2 = arg0.method224();
				if (var2 == 0) {
					return;
				}
				if (var2 == 1) {
					this.field1358 = arg0.method224();
				} else if (var2 == 2) {
					int var3 = arg0.method224();
					this.field1359 = new int[var3];
					for (int var4 = 0; var4 < var3; var4++) {
						this.field1359[var4] = arg0.method226();
					}
				} else if (var2 == 3) {
					this.field1363 = true;
				} else if (var2 >= 40 && var2 < 50) {
					this.field1360[var2 - 40] = arg0.method226();
				} else if (var2 >= 50 && var2 < 60) {
					this.field1361[var2 - 50] = arg0.method226();
				} else if (var2 >= 60 && var2 < 70) {
					this.field1362[var2 - 60] = arg0.method226();
				} else {
					System.out.println("Error unrecognised config code: " + var2);
				}
			}
		} catch (RuntimeException var6) {
			signlink.reporterror("45113, " + arg0 + ", " + -50 + ", " + var6.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("TFKCMRVE.a(Z)Z")
	public boolean method455() {
		try {
			if (this.field1359 == null) {
				return true;
			}
			boolean var1 = true;
			for (int var2 = 0; var2 < this.field1359.length; var2++) {
				if (!class31.method340(this.field1359[var2])) {
					var1 = false;
				}
			}
			return var1;
		} catch (RuntimeException var4) {
			signlink.reporterror("40417, " + false + ", " + var4.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("TFKCMRVE.a(B)LKBEXSZSN;")
	public class31 method456() {
		try {
			if (this.field1359 == null) {
				return null;
			}
			class31[] var1 = new class31[this.field1359.length];
			for (int var2 = 0; var2 < this.field1359.length; var2++) {
				var1[var2] = class31.method339(this.field1359[var2]);
			}
			class31 var3;
			if (var1.length == 1) {
				var3 = var1[0];
			} else {
				var3 = new class31(var1.length, var1, 5);
			}
			for (int var4 = 0; var4 < 6 && this.field1360[var4] != 0; var4++) {
				var3.method353(this.field1360[var4], this.field1361[var4]);
			}
			return var3;
		} catch (RuntimeException var6) {
			signlink.reporterror("56495, " + 9 + ", " + var6.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("TFKCMRVE.a(I)Z")
	public boolean method457() {
		try {
			boolean var1 = true;
			for (int var2 = 0; var2 < 5; var2++) {
				if (this.field1362[var2] != -1 && !class31.method340(this.field1362[var2])) {
					var1 = false;
				}
			}
			return var1;
		} catch (RuntimeException var4) {
			signlink.reporterror("64373, " + 4732 + ", " + var4.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("TFKCMRVE.b(I)LKBEXSZSN;")
	public class31 method458() {
		try {
			class31[] var1 = new class31[5];
			int var2 = 0;
			for (int var3 = 0; var3 < 5; var3++) {
				if (this.field1362[var3] != -1) {
					var1[var2++] = class31.method339(this.field1362[var3]);
				}
			}
			class31 var4 = new class31(var2, var1, 5);
			for (int var5 = 0; var5 < 6 && this.field1360[var5] != 0; var5++) {
				var4.method353(this.field1360[var5], this.field1361[var5]);
			}
			return var4;
		} catch (RuntimeException var7) {
			signlink.reporterror("52878, " + -732 + ", " + var7.toString());
			throw new RuntimeException();
		}
	}
}
