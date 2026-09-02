package jagex2.datastruct;

import deob.ObfuscatedName;
import sign.signlink;

@ObfuscatedName("UMTLOYSA")
public final class LinkList2 {

	@ObfuscatedName("UMTLOYSA.c")
	public final Linkable2 sentinel = new Linkable2();

	@ObfuscatedName("UMTLOYSA.a")
	public final boolean field1414 = false;

	@ObfuscatedName("UMTLOYSA.d")
	public Linkable2 cursor;

	@ObfuscatedName("UMTLOYSA.b")
	public final int field1415 = 534;

	public LinkList2(byte arg0) {
		try {
			this.sentinel.next2 = this.sentinel;
			this.sentinel.prev2 = this.sentinel;
		} catch (RuntimeException var3) {
			signlink.reporterror("62318, " + 6 + ", " + var3.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("UMTLOYSA.a(LBIJRHVKA;)V")
	public void push(Linkable2 arg0) {
		if (arg0.prev2 != null) {
			arg0.unlink2();
		}
		arg0.prev2 = this.sentinel.prev2;
		arg0.next2 = this.sentinel;
		arg0.prev2.next2 = arg0;
		arg0.next2.prev2 = arg0;
	}

	@ObfuscatedName("UMTLOYSA.a()LBIJRHVKA;")
	public Linkable2 popFront() {
		Linkable2 var1 = this.sentinel.next2;
		if (var1 == this.sentinel) {
			return null;
		} else {
			var1.unlink2();
			return var1;
		}
	}

	@ObfuscatedName("UMTLOYSA.a(I)LBIJRHVKA;")
	public Linkable2 next() {
		try {
			Linkable2 var1 = this.cursor;
			if (var1 == this.sentinel) {
				this.cursor = null;
				return null;
			} else {
				this.cursor = var1.next2;
				return var1;
			}
		} catch (RuntimeException var3) {
			signlink.reporterror("57694, " + 4 + ", " + var3.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("UMTLOYSA.b()LBIJRHVKA;")
	public Linkable2 head() {
		Linkable2 var1 = this.sentinel.next2;
		if (var1 == this.sentinel) {
			this.cursor = null;
			return null;
		} else {
			this.cursor = var1.next2;
			return var1;
		}
	}

	@ObfuscatedName("UMTLOYSA.c()I")
	public int size() {
		int var1 = 0;
		for (Linkable2 var2 = this.sentinel.next2; var2 != this.sentinel; var2 = var2.next2) {
			var1++;
		}
		return var1;
	}
}
