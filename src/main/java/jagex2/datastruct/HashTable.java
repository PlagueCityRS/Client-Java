package jagex2.datastruct;

import deob.ObfuscatedName;
import sign.signlink;

@ObfuscatedName("HWTUYSNT")
public final class HashTable {

	@ObfuscatedName("HWTUYSNT.c")
	public final int bucketCount;

	@ObfuscatedName("HWTUYSNT.d")
	public final Linkable[] buckets;

	@ObfuscatedName("HWTUYSNT.a")
	public final int field857 = 1914;

	@ObfuscatedName("HWTUYSNT.b")
	public final boolean field858 = false;

	public HashTable(int arg0, int arg1) {
		try {
			this.bucketCount = 1024;
			this.buckets = new Linkable[1024];
			for (int var3 = 0; var3 < 1024; var3++) {
				Linkable var4 = this.buckets[var3] = new Linkable();
				var4.next = var4;
				var4.prev = var4;
			}
		} catch (RuntimeException var6) {
			signlink.reporterror("57649, " + 1024 + ", " + 564 + ", " + var6.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("HWTUYSNT.a(J)LJJVWTXNE;")
	public Linkable find(long arg0) {
		Linkable var3 = this.buckets[(int) (arg0 & (long) (this.bucketCount - 1))];
		for (Linkable var4 = var3.next; var4 != var3; var4 = var4.next) {
			if (var4.key == arg0) {
				return var4;
			}
		}
		return null;
	}

	@ObfuscatedName("HWTUYSNT.a(IJLJJVWTXNE;)V")
	public void put(Linkable arg1, long arg0) {
		try {
			if (arg1.prev != null) {
				arg1.unlink();
			}
			Linkable var4 = this.buckets[(int) (arg0 & (long) (this.bucketCount - 1))];
			arg1.prev = var4.prev;
			arg1.next = var4;
			arg1.prev.next = arg1;
			arg1.next.prev = arg1;
			arg1.key = arg0;
		} catch (RuntimeException var6) {
			signlink.reporterror("45753, " + -782 + ", " + arg0 + ", " + arg1 + ", " + var6.toString());
			throw new RuntimeException();
		}
	}
}
