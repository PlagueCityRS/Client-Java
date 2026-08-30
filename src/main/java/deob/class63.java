package deob;

import sign.signlink;

@ObfuscatedName("VQCXWNRE")
public final class class63 extends class66 {

	@ObfuscatedName("VQCXWNRE.k")
	public int field1444;

	@ObfuscatedName("VQCXWNRE.l")
	public int field1445;

	@ObfuscatedName("VQCXWNRE.a(I)LKBEXSZSN;")
	@Override
	public class31 method28() {
		try {
			class67 var1 = class67.method526(this.field1444);
			return var1.method514(this.field1445);
		} catch (RuntimeException var3) {
			signlink.reporterror("49276, " + ", " + var3.toString());
			throw new RuntimeException();
		}
	}
}
