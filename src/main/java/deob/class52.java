package deob;

import sign.signlink;

@ObfuscatedName("SYTONBKT")
public final class class52 {

	@ObfuscatedName("SYTONBKT.e")
	public int field1341 = -1;

	@ObfuscatedName("SYTONBKT.f")
	public boolean field1342 = false;

	@ObfuscatedName("SYTONBKT.g")
	public boolean field1343 = true;

	@ObfuscatedName("SYTONBKT.a")
	public static int field1337;

	@ObfuscatedName("SYTONBKT.d")
	public int field1340;

	@ObfuscatedName("SYTONBKT.h")
	public int field1344;

	@ObfuscatedName("SYTONBKT.i")
	public int field1345;

	@ObfuscatedName("SYTONBKT.j")
	public int field1346;

	@ObfuscatedName("SYTONBKT.k")
	public int field1347;

	@ObfuscatedName("SYTONBKT.l")
	public int field1348;

	@ObfuscatedName("SYTONBKT.m")
	public int field1349;

	@ObfuscatedName("SYTONBKT.c")
	public String field1339;

	@ObfuscatedName("SYTONBKT.b")
	public static class52[] field1338;

	@ObfuscatedName("SYTONBKT.a(ILBBMKAXRK;)V")
	public static void method449(class6 arg0) {
		try {
			class17 var1 = new class17(arg0.method30("flo.dat", null), -26583);
			field1337 = var1.method226();
			if (field1338 == null) {
				field1338 = new class52[field1337];
			}
			for (int var2 = 0; var2 < field1337; var2++) {
				if (field1338[var2] == null) {
					field1338[var2] = new class52();
				}
				field1338[var2].method450(var1);
			}
		} catch (RuntimeException var4) {
			signlink.reporterror("84471, " + -768 + ", " + arg0 + ", " + var4.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("SYTONBKT.a(LEILHLJCE;B)V")
	public void method450(class17 arg0) {
		try {
			while (true) {
				int var2 = arg0.method224();
				if (var2 == 0) {
					return;
				}
				if (var2 == 1) {
					this.field1340 = arg0.method228();
					this.method451(this.field1340);
				} else if (var2 == 2) {
					this.field1341 = arg0.method224();
				} else if (var2 == 3) {
					this.field1342 = true;
				} else if (var2 == 5) {
					this.field1343 = false;
				} else if (var2 == 6) {
					this.field1339 = arg0.method231();
				} else if (var2 == 7) {
					int var3 = this.field1344;
					int var4 = this.field1345;
					int var5 = this.field1346;
					int var6 = this.field1347;
					int var7 = arg0.method228();
					this.method451(var7);
					this.field1344 = var3;
					this.field1345 = var4;
					this.field1346 = var5;
					this.field1347 = var6;
					this.field1348 = var6;
				} else {
					System.out.println("Error unrecognised config code: " + var2);
				}
			}
		} catch (RuntimeException var9) {
			signlink.reporterror("19440, " + arg0 + ", " + -50 + ", " + var9.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("SYTONBKT.a(II)V")
	public void method451(int arg0) {
		try {
			double var2 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
			double var4 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
			double var6 = (double) (arg0 & 0xFF) / 256.0D;
			double var8 = var2;
			if (var4 < var2) {
				var8 = var4;
			}
			if (var6 < var8) {
				var8 = var6;
			}
			double var10 = var2;
			if (var4 > var2) {
				var10 = var4;
			}
			if (var6 > var10) {
				var10 = var6;
			}
			double var12 = 0.0D;
			double var14 = 0.0D;
			double var16 = (var8 + var10) / 2.0D;
			if (var8 != var10) {
				if (var16 < 0.5D) {
					var14 = (var10 - var8) / (var10 + var8);
				}
				if (var16 >= 0.5D) {
					var14 = (var10 - var8) / (2.0D - var10 - var8);
				}
				if (var2 == var10) {
					var12 = (var4 - var6) / (var10 - var8);
				} else if (var4 == var10) {
					var12 = (var6 - var2) / (var10 - var8) + 2.0D;
				} else if (var6 == var10) {
					var12 = (var2 - var4) / (var10 - var8) + 4.0D;
				}
			}
			double var18 = var12 / 6.0D;
			this.field1344 = (int) (var18 * 256.0D);
			this.field1345 = (int) (var14 * 256.0D);
			this.field1346 = (int) (var16 * 256.0D);
			if (this.field1345 < 0) {
				this.field1345 = 0;
			} else if (this.field1345 > 255) {
				this.field1345 = 255;
			}
			if (this.field1346 < 0) {
				this.field1346 = 0;
			} else if (this.field1346 > 255) {
				this.field1346 = 255;
			}
			if (var16 > 0.5D) {
				this.field1348 = (int) ((1.0D - var16) * var14 * 512.0D);
			} else {
				this.field1348 = (int) (var16 * var14 * 512.0D);
			}
			if (this.field1348 < 1) {
				this.field1348 = 1;
			}
			this.field1347 = (int) (var18 * (double) this.field1348);
			int var20 = this.field1344 + (int) (Math.random() * 16.0D) - 8;
			if (var20 < 0) {
				var20 = 0;
			} else if (var20 > 255) {
				var20 = 255;
			}
			int var21 = this.field1345 + (int) (Math.random() * 48.0D) - 24;
			if (var21 < 0) {
				var21 = 0;
			} else if (var21 > 255) {
				var21 = 255;
			}
			int var22 = this.field1346 + (int) (Math.random() * 48.0D) - 24;
			if (var22 < 0) {
				var22 = 0;
			} else if (var22 > 255) {
				var22 = 255;
			}
			this.field1349 = this.method452(var20, var21, var22);
		} catch (RuntimeException var24) {
			signlink.reporterror("67100, " + 7 + ", " + arg0 + ", " + var24.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("SYTONBKT.a(III)I")
	public int method452(int arg0, int arg1, int arg2) {
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
}
