package deob;

import sign.signlink;

@ObfuscatedName("MXTMAEWO")
public final class class36 {

	@ObfuscatedName("MXTMAEWO.b")
	public final int field1115;

	@ObfuscatedName("MXTMAEWO.c")
	public final int[] field1116;

	@ObfuscatedName("MXTMAEWO.d")
	public final int[][] field1117;

	@ObfuscatedName("MXTMAEWO.a")
	public int field1114;

	public class36(byte arg0, class17 arg1) {
		try {
			this.field1115 = arg1.method224();
			this.field1116 = new int[this.field1115];
			this.field1117 = new int[this.field1115][];
			for (int var3 = 0; var3 < this.field1115; var3++) {
				this.field1116[var3] = arg1.method224();
			}
			for (int var4 = 0; var4 < this.field1115; var4++) {
				int var5 = arg1.method224();
				this.field1117[var4] = new int[var5];
				for (int var6 = 0; var6 < var5; var6++) {
					this.field1117[var4][var6] = arg1.method224();
				}
			}
		} catch (RuntimeException var8) {
			signlink.reporterror("36046, " + -89 + ", " + arg1 + ", " + var8.toString());
			throw new RuntimeException();
		}
	}
}
