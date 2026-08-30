package deob;

import sign.signlink;

@ObfuscatedName("TGIKVGNH")
public final class class55 {

	@ObfuscatedName("TGIKVGNH.b")
	public static final int field1365 = 868;

	@ObfuscatedName("TGIKVGNH.p")
	public static class15 field1379 = new class15((byte) 7, 30);

	@ObfuscatedName("TGIKVGNH.a")
	public final boolean field1364 = true;

	@ObfuscatedName("TGIKVGNH.g")
	public int field1370 = -1;

	@ObfuscatedName("TGIKVGNH.i")
	public final int[] field1372 = new int[6];

	@ObfuscatedName("TGIKVGNH.j")
	public final int[] field1373 = new int[6];

	@ObfuscatedName("TGIKVGNH.k")
	public int field1374 = 128;

	@ObfuscatedName("TGIKVGNH.l")
	public int field1375 = 128;

	@ObfuscatedName("TGIKVGNH.c")
	public static int field1366;

	@ObfuscatedName("TGIKVGNH.e")
	public int field1368;

	@ObfuscatedName("TGIKVGNH.f")
	public int field1369;

	@ObfuscatedName("TGIKVGNH.m")
	public int field1376;

	@ObfuscatedName("TGIKVGNH.n")
	public int field1377;

	@ObfuscatedName("TGIKVGNH.o")
	public int field1378;

	@ObfuscatedName("TGIKVGNH.h")
	public class41 field1371;

	@ObfuscatedName("TGIKVGNH.d")
	public static class55[] field1367;

	@ObfuscatedName("TGIKVGNH.a(ILBBMKAXRK;)V")
	public static void method459(class6 arg0) {
		try {
			class17 var1 = new class17(arg0.method30("spotanim.dat", null), -26583);
			field1366 = var1.method226();
			if (field1367 == null) {
				field1367 = new class55[field1366];
			}
			for (int var2 = 0; var2 < field1366; var2++) {
				if (field1367[var2] == null) {
					field1367[var2] = new class55();
				}
				field1367[var2].field1368 = var2;
				field1367[var2].method460(var1);
			}
		} catch (RuntimeException var4) {
			signlink.reporterror("42102, " + -768 + ", " + arg0 + ", " + var4.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("TGIKVGNH.a(LEILHLJCE;B)V")
	public void method460(class17 arg0) {
		try {
			while (true) {
				int var2 = arg0.method224();
				if (var2 == 0) {
					return;
				}
				if (var2 == 1) {
					this.field1369 = arg0.method226();
				} else if (var2 == 2) {
					this.field1370 = arg0.method226();
					if (class41.field1184 != null) {
						this.field1371 = class41.field1184[this.field1370];
					}
				} else if (var2 == 4) {
					this.field1374 = arg0.method226();
				} else if (var2 == 5) {
					this.field1375 = arg0.method226();
				} else if (var2 == 6) {
					this.field1376 = arg0.method226();
				} else if (var2 == 7) {
					this.field1377 = arg0.method224();
				} else if (var2 == 8) {
					this.field1378 = arg0.method224();
				} else if (var2 >= 40 && var2 < 50) {
					this.field1372[var2 - 40] = arg0.method226();
				} else if (var2 >= 50 && var2 < 60) {
					this.field1373[var2 - 50] = arg0.method226();
				} else {
					System.out.println("Error unrecognised spotanim config code: " + var2);
				}
			}
		} catch (RuntimeException var4) {
			signlink.reporterror("54595, " + arg0 + ", " + -50 + ", " + var4.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("TGIKVGNH.a()LKBEXSZSN;")
	public class31 method461() {
		class31 var1 = (class31) field1379.method197((long) this.field1368);
		if (var1 != null) {
			return var1;
		}
		class31 var2 = class31.method339(this.field1369);
		if (var2 == null) {
			return null;
		}
		for (int var3 = 0; var3 < 6; var3++) {
			if (this.field1372[0] != 0) {
				var2.method353(this.field1372[var3], this.field1373[var3]);
			}
		}
		field1379.method198((byte) 7, (long) this.field1368, var2);
		return var2;
	}
}
