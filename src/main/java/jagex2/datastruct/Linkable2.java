package jagex2.datastruct;

import deob.ObfuscatedName;

@ObfuscatedName("BIJRHVKA")
public class Linkable2 extends Linkable {

	@ObfuscatedName("BIJRHVKA.e")
	public Linkable2 next2;

	@ObfuscatedName("BIJRHVKA.f")
	public Linkable2 prev2;

	@ObfuscatedName("BIJRHVKA.b()V")
	public final void unlink2() {
		if (this.prev2 != null) {
			this.prev2.next2 = this.next2;
			this.next2.prev2 = this.prev2;
			this.next2 = null;
			this.prev2 = null;
		}
	}
}
