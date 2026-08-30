package deob;

import sign.signlink;

@ObfuscatedName("YHTUMUXE")
public final class class69 extends class66 {

	@ObfuscatedName("YHTUMUXE.o")
	public boolean field1620 = false;

	@ObfuscatedName("YHTUMUXE.s")
	public final int field1624 = 8;

	@ObfuscatedName("YHTUMUXE.t")
	public final byte field1625 = 29;

	@ObfuscatedName("YHTUMUXE.u")
	public int field1626 = -503;

	@ObfuscatedName("YHTUMUXE.r")
	public final class55 field1623;

	@ObfuscatedName("YHTUMUXE.k")
	public final int field1616;

	@ObfuscatedName("YHTUMUXE.l")
	public final int field1617;

	@ObfuscatedName("YHTUMUXE.m")
	public final int field1618;

	@ObfuscatedName("YHTUMUXE.n")
	public final int field1619;

	@ObfuscatedName("YHTUMUXE.v")
	public final int field1627;

	@ObfuscatedName("YHTUMUXE.p")
	public int field1621;

	@ObfuscatedName("YHTUMUXE.q")
	public int field1622;

	public class69(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7) {
		try {
			if (!arg3) {
				this.field1626 = -13;
			}
			this.field1623 = class55.field1367[arg2];
			this.field1616 = arg5;
			this.field1617 = arg7;
			this.field1618 = arg0;
			this.field1619 = arg1;
			this.field1627 = arg4 + arg6;
			this.field1620 = false;
		} catch (RuntimeException var10) {
			signlink.reporterror("48084, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + var10.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("YHTUMUXE.a(I)LKBEXSZSN;")
	@Override
	public class31 method28() {
		try {
			class31 var1 = this.field1623.method461();
			if (var1 == null) {
				return null;
			}
			int var2 = this.field1623.field1371.field1186[this.field1621];
			class31 var3 = new class31(false, 777, class25.method309(var2), var1, true);
			if (!this.field1620) {
				var3.method346(311);
				var3.method347(var2);
				var3.field1032 = null;
				var3.field1031 = null;
			}
			if (this.field1623.field1374 != 128 || this.field1623.field1375 != 128) {
				var3.method355(this.field1625, this.field1623.field1374, this.field1623.field1375, this.field1623.field1374);
			}
			if (this.field1623.field1376 != 0) {
				if (this.field1623.field1376 == 90) {
					var3.method350();
				}
				if (this.field1623.field1376 == 180) {
					var3.method350();
					var3.method350();
				}
				if (this.field1623.field1376 == 270) {
					var3.method350();
					var3.method350();
					var3.method350();
				}
			}
			var3.method356(this.field1623.field1377 + 64, this.field1623.field1378 + 850, -30, -50, -30, true);
			return var3;
		} catch (RuntimeException var5) {
			signlink.reporterror("87099, " + ", " + var5.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("YHTUMUXE.a(II)V")
	public void method579(int arg0) {
		try {
			this.field1622 += arg0;
			if (this.field1624 > 8 || this.field1624 < 8) {
				this.field1626 = 397;
			}
			while (true) {
				do {
					do {
						if (this.field1622 <= this.field1623.field1371.method413(this.field1621)) {
							return;
						}
						this.field1622 -= this.field1623.field1371.method413(this.field1621) + 1;
						this.field1621++;
					} while (this.field1621 < this.field1623.field1371.field1185);
				} while (this.field1621 >= 0 && this.field1621 < this.field1623.field1371.field1185);
				this.field1621 = 0;
				this.field1620 = true;
			}
		} catch (RuntimeException var3) {
			signlink.reporterror("75832, " + arg0 + ", " + 8 + ", " + var3.toString());
			throw new RuntimeException();
		}
	}
}
