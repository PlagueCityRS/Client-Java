package deob;

import sign.signlink;

@ObfuscatedName("FLJWGVEY")
public final class class20 {

	@ObfuscatedName("FLJWGVEY.a")
	public final byte field806 = 1;

	@ObfuscatedName("FLJWGVEY.b")
	public final class30 field807 = new class30();

	@ObfuscatedName("FLJWGVEY.c")
	public class30 field808;

	public class20(int arg0) {
		try {
			this.field807.field985 = this.field807;
			this.field807.field986 = this.field807;
		} catch (RuntimeException var3) {
			signlink.reporterror("2756, " + 807 + ", " + var3.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("FLJWGVEY.a(LJJVWTXNE;)V")
	public void method272(class30 arg0) {
		if (arg0.field986 != null) {
			arg0.method334();
		}
		arg0.field986 = this.field807.field986;
		arg0.field985 = this.field807;
		arg0.field986.field985 = arg0;
		arg0.field985.field986 = arg0;
	}

	@ObfuscatedName("FLJWGVEY.a(ILJJVWTXNE;)V")
	public void method273(class30 arg0) {
		try {
			if (arg0.field986 != null) {
				arg0.method334();
			}
			arg0.field986 = this.field807;
			arg0.field985 = this.field807.field985;
			arg0.field986.field985 = arg0;
			arg0.field985.field986 = arg0;
		} catch (RuntimeException var3) {
			signlink.reporterror("186, " + -24824 + ", " + arg0 + ", " + var3.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("FLJWGVEY.a()LJJVWTXNE;")
	public class30 method274() {
		class30 var1 = this.field807.field985;
		if (var1 == this.field807) {
			return null;
		} else {
			var1.method334();
			return var1;
		}
	}

	@ObfuscatedName("FLJWGVEY.b()LJJVWTXNE;")
	public class30 method275() {
		class30 var1 = this.field807.field985;
		if (var1 == this.field807) {
			this.field808 = null;
			return null;
		} else {
			this.field808 = var1.field985;
			return var1;
		}
	}

	@ObfuscatedName("FLJWGVEY.a(I)LJJVWTXNE;")
	public class30 method276() {
		try {
			class30 var1 = this.field807.field986;
			if (var1 == this.field807) {
				this.field808 = null;
				return null;
			} else {
				this.field808 = var1.field986;
				return var1;
			}
		} catch (RuntimeException var3) {
			signlink.reporterror("5521, " + ", " + var3.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("FLJWGVEY.b(I)LJJVWTXNE;")
	public class30 method277() {
		try {
			class30 var1 = this.field808;
			if (var1 == this.field807) {
				this.field808 = null;
				return null;
			} else {
				this.field808 = var1.field985;
				return var1;
			}
		} catch (RuntimeException var3) {
			signlink.reporterror("15397, " + 4 + ", " + var3.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("FLJWGVEY.a(B)LJJVWTXNE;")
	public class30 method278(byte arg0) {
		try {
			class30 var2 = this.field808;
			if (var2 == this.field807) {
				this.field808 = null;
				return null;
			} else {
				this.field808 = var2.field986;
				boolean var5 = false;
				return var2;
			}
		} catch (RuntimeException var4) {
			signlink.reporterror("50610, " + arg0 + ", " + var4.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("FLJWGVEY.c()V")
	public void method279() {
		if (this.field807.field985 == this.field807) {
			return;
		}
		while (true) {
			class30 var1 = this.field807.field985;
			if (var1 == this.field807) {
				return;
			}
			var1.method334();
		}
	}
}
