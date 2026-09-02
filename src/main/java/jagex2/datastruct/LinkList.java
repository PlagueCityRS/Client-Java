package jagex2.datastruct;

import deob.ObfuscatedName;
import sign.signlink;

@ObfuscatedName("FLJWGVEY")
public final class LinkList {

	@ObfuscatedName("FLJWGVEY.b")
	public final Linkable sentinel = new Linkable();

	@ObfuscatedName("FLJWGVEY.c")
	public Linkable cursor;

	@ObfuscatedName("FLJWGVEY.a")
	public final byte field806 = 1;

	public LinkList(int arg0) {
		try {
			this.sentinel.next = this.sentinel;
			this.sentinel.prev = this.sentinel;
		} catch (RuntimeException var3) {
			signlink.reporterror("2756, " + 807 + ", " + var3.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("FLJWGVEY.c()V")
	public void clear() {
		if (this.sentinel.next == this.sentinel) {
			return;
		}
		while (true) {
			Linkable var1 = this.sentinel.next;
			if (var1 == this.sentinel) {
				return;
			}
			var1.unlink();
		}
	}

	@ObfuscatedName("FLJWGVEY.a(LJJVWTXNE;)V")
	public void push(Linkable arg0) {
		if (arg0.prev != null) {
			arg0.unlink();
		}
		arg0.prev = this.sentinel.prev;
		arg0.next = this.sentinel;
		arg0.prev.next = arg0;
		arg0.next.prev = arg0;
	}

	@ObfuscatedName("FLJWGVEY.a(ILJJVWTXNE;)V")
	public void pushFront(Linkable arg0) {
		try {
			if (arg0.prev != null) {
				arg0.unlink();
			}
			arg0.prev = this.sentinel;
			arg0.next = this.sentinel.next;
			arg0.prev.next = arg0;
			arg0.next.prev = arg0;
		} catch (RuntimeException var3) {
			signlink.reporterror("186, " + -24824 + ", " + arg0 + ", " + var3.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("FLJWGVEY.a()LJJVWTXNE;")
	public Linkable popFront() {
		Linkable var1 = this.sentinel.next;
		if (var1 == this.sentinel) {
			return null;
		} else {
			var1.unlink();
			return var1;
		}
	}

	@ObfuscatedName("FLJWGVEY.b()LJJVWTXNE;")
	public Linkable head() {
		Linkable var1 = this.sentinel.next;
		if (var1 == this.sentinel) {
			this.cursor = null;
			return null;
		} else {
			this.cursor = var1.next;
			return var1;
		}
	}

	@ObfuscatedName("FLJWGVEY.a(I)LJJVWTXNE;")
	public Linkable tail() {
		try {
			Linkable var1 = this.sentinel.prev;
			if (var1 == this.sentinel) {
				this.cursor = null;
				return null;
			} else {
				this.cursor = var1.prev;
				return var1;
			}
		} catch (RuntimeException var3) {
			signlink.reporterror("5521, " + ", " + var3.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("FLJWGVEY.b(I)LJJVWTXNE;")
	public Linkable next() {
		try {
			Linkable var1 = this.cursor;
			if (var1 == this.sentinel) {
				this.cursor = null;
				return null;
			} else {
				this.cursor = var1.next;
				return var1;
			}
		} catch (RuntimeException var3) {
			signlink.reporterror("15397, " + 4 + ", " + var3.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("FLJWGVEY.a(B)LJJVWTXNE;")
	public Linkable prev(byte arg0) {
		try {
			Linkable var2 = this.cursor;
			if (var2 == this.sentinel) {
				this.cursor = null;
				return null;
			} else {
				this.cursor = var2.prev;
				boolean var5 = false;
				return var2;
			}
		} catch (RuntimeException var4) {
			signlink.reporterror("50610, " + arg0 + ", " + var4.toString());
			throw new RuntimeException();
		}
	}
}
