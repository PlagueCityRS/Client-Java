package deob;

import sign.signlink;

@ObfuscatedName("ONCZAQCQ")
public final class class43 extends class3 {

	@ObfuscatedName("ONCZAQCQ.qb")
	public final boolean field1209 = false;

	@ObfuscatedName("ONCZAQCQ.rb")
	public final byte field1210 = 29;

	@ObfuscatedName("ONCZAQCQ.sb")
	public final boolean field1211 = true;

	@ObfuscatedName("ONCZAQCQ.tb")
	public final int field1212 = 947;

	@ObfuscatedName("ONCZAQCQ.ub")
	public class37 field1213;

	@ObfuscatedName("ONCZAQCQ.a(I)LKBEXSZSN;")
	@Override
	public class31 method28() {
		try {
			if (this.field1213 == null) {
				return null;
			}
			class31 var1 = this.method415();
			if (var1 == null) {
				return null;
			}
			super.field36 = var1.field1489;
			if (super.field27 != -1 && super.field28 != -1) {
				class55 var2 = class55.field1367[super.field27];
				class31 var3 = var2.method461();
				if (var3 != null) {
					int var4 = var2.field1371.field1186[super.field28];
					class31 var5 = new class31(false, 777, class25.method309(var4), var3, true);
					var5.method352(-super.field31, 0, 0);
					var5.method346(311);
					var5.method347(var4);
					var5.field1032 = null;
					var5.field1031 = null;
					if (var2.field1374 != 128 || var2.field1375 != 128) {
						var5.method355(this.field1210, var2.field1374, var2.field1375, var2.field1374);
					}
					var5.method356(var2.field1377 + 64, var2.field1378 + 850, -30, -50, -30, true);
					class31[] var6 = new class31[] { var1, var5 };
					var1 = new class31(var6, 2, true, false);
				}
			}
			if (this.field1213.field1127 == 1) {
				var1.field1033 = true;
			}
			return var1;
		} catch (RuntimeException var8) {
			signlink.reporterror("59596, " + ", " + var8.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("ONCZAQCQ.b(B)LKBEXSZSN;")
	public class31 method415() {
		try {
			if (super.field47 < 0 || super.field50 != 0) {
				int var3 = -1;
				if (super.field43 >= 0) {
					var3 = class41.field1184[super.field43].field1186[super.field44];
				}
				return this.field1213.method388(var3, -1, null);
			}
			int var1 = class41.field1184[super.field47].field1186[super.field48];
			int var2 = -1;
			if (super.field43 >= 0 && super.field43 != super.field70) {
				var2 = class41.field1184[super.field43].field1186[super.field44];
			}
			return this.field1213.method388(var1, var2, class41.field1184[super.field47].field1190);
		} catch (RuntimeException var5) {
			signlink.reporterror("31326, " + 9 + ", " + var5.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("ONCZAQCQ.a(Z)Z")
	@Override
	public boolean method10() {
		try {
			return this.field1213 != null;
		} catch (RuntimeException var2) {
			signlink.reporterror("81071, " + true + ", " + var2.toString());
			throw new RuntimeException();
		}
	}
}
