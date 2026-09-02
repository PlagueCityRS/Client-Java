package jagex2.datastruct;

import deob.ObfuscatedName;

@ObfuscatedName("JJVWTXNE")
public class Linkable {

	@ObfuscatedName("JJVWTXNE.a")
	public long key;

	@ObfuscatedName("JJVWTXNE.b")
	public Linkable next;

	@ObfuscatedName("JJVWTXNE.c")
	public Linkable prev;

	@ObfuscatedName("JJVWTXNE.a()V")
	public final void unlink() {
		if (this.prev != null) {
			this.prev.next = this.next;
			this.next.prev = this.prev;
			this.next = null;
			this.prev = null;
		}
	}
}
