package deob;

import sign.signlink;

@ObfuscatedName("UMTLOYSA")
public final class class60 {

	@ObfuscatedName("UMTLOYSA.a")
	public final boolean field1414 = false;

	@ObfuscatedName("UMTLOYSA.b")
	public final int field1415 = 534;

	@ObfuscatedName("UMTLOYSA.c")
	public final class8 field1416 = new class8();

	@ObfuscatedName("UMTLOYSA.d")
	public class8 field1417;

	public class60(byte arg0) {
		try {
			this.field1416.field149 = this.field1416;
			this.field1416.field150 = this.field1416;
		} catch (RuntimeException var3) {
			signlink.reporterror("62318, " + 6 + ", " + var3.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("UMTLOYSA.a(LBIJRHVKA;)V")
	public void method466(class8 arg0) {
		if (arg0.field150 != null) {
			arg0.method35();
		}
		arg0.field150 = this.field1416.field150;
		arg0.field149 = this.field1416;
		arg0.field150.field149 = arg0;
		arg0.field149.field150 = arg0;
	}

	@ObfuscatedName("UMTLOYSA.a()LBIJRHVKA;")
	public class8 method467() {
		class8 var1 = this.field1416.field149;
		if (var1 == this.field1416) {
			return null;
		} else {
			var1.method35();
			return var1;
		}
	}

	@ObfuscatedName("UMTLOYSA.b()LBIJRHVKA;")
	public class8 method468() {
		class8 var1 = this.field1416.field149;
		if (var1 == this.field1416) {
			this.field1417 = null;
			return null;
		} else {
			this.field1417 = var1.field149;
			return var1;
		}
	}

	@ObfuscatedName("UMTLOYSA.a(I)LBIJRHVKA;")
	public class8 method469() {
		try {
			class8 var1 = this.field1417;
			if (var1 == this.field1416) {
				this.field1417 = null;
				return null;
			} else {
				this.field1417 = var1.field149;
				return var1;
			}
		} catch (RuntimeException var3) {
			signlink.reporterror("57694, " + 4 + ", " + var3.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("UMTLOYSA.c()I")
	public int method470() {
		int var1 = 0;
		for (class8 var2 = this.field1416.field149; var2 != this.field1416; var2 = var2.field149) {
			var1++;
		}
		return var1;
	}
}
