package jagex2.datastruct;

import deob.ObfuscatedName;
import sign.signlink;

@ObfuscatedName("DSMCVRKW")
public final class LruCache {

	@ObfuscatedName("DSMCVRKW.e")
	public final int capacity;

	@ObfuscatedName("DSMCVRKW.f")
	public int available;

	@ObfuscatedName("DSMCVRKW.g")
	public final HashTable cache;

	@ObfuscatedName("DSMCVRKW.h")
	public final LinkList2 order = new LinkList2((byte) 6);

	@ObfuscatedName("DSMCVRKW.a")
	public final boolean field740 = true;

	@ObfuscatedName("DSMCVRKW.b")
	public int field741;

	@ObfuscatedName("DSMCVRKW.c")
	public int field742;

	@ObfuscatedName("DSMCVRKW.d")
	public final Linkable2 field743 = new Linkable2();

	public LruCache(byte arg0, int arg1) {
		try {
			this.capacity = 50000;
			this.available = 50000;
			this.cache = new HashTable(1024, 564);
		} catch (RuntimeException var4) {
			signlink.reporterror("57687, " + 7 + ", " + 50000 + ", " + var4.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("DSMCVRKW.a(J)LBIJRHVKA;")
	public Linkable2 find(long arg0) {
		Linkable2 var3 = (Linkable2) this.cache.find(arg0);
		if (var3 == null) {
			this.field741++;
		} else {
			this.order.push(var3);
			this.field742++;
		}
		return var3;
	}

	@ObfuscatedName("DSMCVRKW.a(BJLBIJRHVKA;)V")
	public void put(byte arg0, long arg1, Linkable2 arg2) {
		try {
			boolean var9 = false;
			if (this.available == 0) {
				Linkable2 var5 = this.order.popFront();
				var5.unlink();
				var5.unlink2();
				if (var5 == this.field743) {
					Linkable2 var6 = this.order.popFront();
					var6.unlink();
					var6.unlink2();
				}
			} else {
				this.available--;
			}
			this.cache.put(arg2, arg1);
			this.order.push(arg2);
		} catch (RuntimeException var8) {
			signlink.reporterror("29685, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + var8.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("DSMCVRKW.a()V")
	public void clear() {
		while (true) {
			Linkable2 var1 = this.order.popFront();
			if (var1 == null) {
				this.available = this.capacity;
				return;
			}
			var1.unlink();
			var1.unlink2();
		}
	}
}
