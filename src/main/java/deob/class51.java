package deob;

import sign.signlink;

@ObfuscatedName("SRLFLGUY")
public final class class51 {

	@ObfuscatedName("SRLFLGUY.a")
	public static final int field1326 = -23379;

	@ObfuscatedName("SRLFLGUY.h")
	public boolean field1333 = false;

	@ObfuscatedName("SRLFLGUY.i")
	public int field1334 = -1;

	@ObfuscatedName("SRLFLGUY.k")
	public boolean field1336 = true;

	@ObfuscatedName("SRLFLGUY.b")
	public static int field1327;

	@ObfuscatedName("SRLFLGUY.e")
	public int field1330;

	@ObfuscatedName("SRLFLGUY.f")
	public int field1331;

	@ObfuscatedName("SRLFLGUY.g")
	public int field1332;

	@ObfuscatedName("SRLFLGUY.j")
	public int field1335;

	@ObfuscatedName("SRLFLGUY.d")
	public String field1329;

	@ObfuscatedName("SRLFLGUY.c")
	public static class51[] field1328;

	@ObfuscatedName("SRLFLGUY.a(ILBBMKAXRK;)V")
	public static void method447(class6 arg0) {
		try {
			class17 var1 = new class17(arg0.method30("varbit.dat", null), -26583);
			field1327 = var1.method226();
			if (field1328 == null) {
				field1328 = new class51[field1327];
			}
			for (int var2 = 0; var2 < field1327; var2++) {
				if (field1328[var2] == null) {
					field1328[var2] = new class51();
				}
				field1328[var2].method448(var2, var1);
				if (field1328[var2].field1333) {
					class28.field963[field1328[var2].field1330].field975 = true;
				}
			}
			if (var1.field779 != var1.field778.length) {
				System.out.println("varbit load mismatch");
			}
		} catch (RuntimeException var4) {
			signlink.reporterror("2656, " + -768 + ", " + arg0 + ", " + var4.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("SRLFLGUY.a(ILEILHLJCE;I)V")
	public void method448(int arg0, class17 arg1) {
		try {
			while (true) {
				int var3 = arg1.method224();
				if (var3 == 0) {
					return;
				}
				if (var3 == 1) {
					this.field1330 = arg1.method226();
					this.field1331 = arg1.method224();
					this.field1332 = arg1.method224();
				} else if (var3 == 10) {
					this.field1329 = arg1.method231();
				} else if (var3 == 2) {
					this.field1333 = true;
				} else if (var3 == 3) {
					this.field1334 = arg1.method229();
				} else if (var3 == 4) {
					this.field1335 = arg1.method229();
				} else if (var3 == 5) {
					this.field1336 = false;
				} else {
					System.out.println("Error unrecognised config code: " + var3);
				}
			}
		} catch (RuntimeException var5) {
			signlink.reporterror("65729, " + arg0 + ", " + arg1 + ", " + ", " + var5.toString());
			throw new RuntimeException();
		}
	}
}
