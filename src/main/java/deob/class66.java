package deob;

import sign.signlink;

@ObfuscatedName("XHDBBLMT")
public class class66 extends class8 {

	@ObfuscatedName("XHDBBLMT.i")
	public int field1489 = 1000;

	@ObfuscatedName("XHDBBLMT.h")
	public class56[] field1488;

	@ObfuscatedName("XHDBBLMT.a(IIIIIIIII)V")
	public void method361(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		class31 var10 = this.method28();
		if (var10 != null) {
			this.field1489 = var10.field1489;
			var10.method361(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		}
	}

	@ObfuscatedName("XHDBBLMT.a(I)LKBEXSZSN;")
	public class31 method28() {
		try {
			return null;
		} catch (RuntimeException var2) {
			signlink.reporterror("61881, " + ", " + var2.toString());
			throw new RuntimeException();
		}
	}
}
