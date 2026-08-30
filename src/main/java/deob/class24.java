package deob;

import sign.signlink;

@ObfuscatedName("HWTUYSNT")
public final class class24 {

	@ObfuscatedName("HWTUYSNT.a")
	public final int field857 = 1914;

	@ObfuscatedName("HWTUYSNT.b")
	public final boolean field858 = false;

	@ObfuscatedName("HWTUYSNT.c")
	public final int field859;

	@ObfuscatedName("HWTUYSNT.d")
	public final class30[] field860;

	public class24(int arg0, int arg1) {
		try {
			this.field859 = 1024;
			this.field860 = new class30[1024];
			for (int var3 = 0; var3 < 1024; var3++) {
				class30 var4 = this.field860[var3] = new class30();
				var4.field985 = var4;
				var4.field986 = var4;
			}
		} catch (RuntimeException var6) {
			signlink.reporterror("57649, " + 1024 + ", " + 564 + ", " + var6.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("HWTUYSNT.a(J)LJJVWTXNE;")
	public class30 method303(long arg0) {
		class30 var3 = this.field860[(int) (arg0 & (long) (this.field859 - 1))];
		for (class30 var4 = var3.field985; var4 != var3; var4 = var4.field985) {
			if (var4.field984 == arg0) {
				return var4;
			}
		}
		return null;
	}

	@ObfuscatedName("HWTUYSNT.a(IJLJJVWTXNE;)V")
	public void method304(long arg0, class30 arg1) {
		try {
			if (arg1.field986 != null) {
				arg1.method334();
			}
			class30 var4 = this.field860[(int) (arg0 & (long) (this.field859 - 1))];
			arg1.field986 = var4.field986;
			arg1.field985 = var4;
			arg1.field986.field985 = arg1;
			arg1.field985.field986 = arg1;
			arg1.field984 = arg0;
		} catch (RuntimeException var6) {
			signlink.reporterror("45753, " + -782 + ", " + arg0 + ", " + arg1 + ", " + var6.toString());
			throw new RuntimeException();
		}
	}
}
