package deob;

import sign.signlink;

@ObfuscatedName("DSMCVRKW")
public final class class15 {

	@ObfuscatedName("DSMCVRKW.a")
	public final boolean field740 = true;

	@ObfuscatedName("DSMCVRKW.d")
	public final class8 field743 = new class8();

	@ObfuscatedName("DSMCVRKW.h")
	public final class60 field747 = new class60((byte) 6);

	@ObfuscatedName("DSMCVRKW.e")
	public final int field744;

	@ObfuscatedName("DSMCVRKW.f")
	public int field745;

	@ObfuscatedName("DSMCVRKW.g")
	public final class24 field746;

	@ObfuscatedName("DSMCVRKW.b")
	public int field741;

	@ObfuscatedName("DSMCVRKW.c")
	public int field742;

	public class15(byte arg0, int arg1) {
		try {
			this.field744 = 50000;
			this.field745 = 50000;
			this.field746 = new class24(1024, 564);
		} catch (RuntimeException var4) {
			signlink.reporterror("57687, " + 7 + ", " + 50000 + ", " + var4.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("DSMCVRKW.a(J)LBIJRHVKA;")
	public class8 method197(long arg0) {
		class8 var3 = (class8) this.field746.method303(arg0);
		if (var3 == null) {
			this.field741++;
		} else {
			this.field747.method466(var3);
			this.field742++;
		}
		return var3;
	}

	@ObfuscatedName("DSMCVRKW.a(BJLBIJRHVKA;)V")
	public void method198(byte arg0, long arg1, class8 arg2) {
		try {
			boolean var9 = false;
			if (this.field745 == 0) {
				class8 var5 = this.field747.method467();
				var5.method334();
				var5.method35();
				if (var5 == this.field743) {
					class8 var6 = this.field747.method467();
					var6.method334();
					var6.method35();
				}
			} else {
				this.field745--;
			}
			this.field746.method304(arg1, arg2);
			this.field747.method466(arg2);
		} catch (RuntimeException var8) {
			signlink.reporterror("29685, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + var8.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("DSMCVRKW.a()V")
	public void method199() {
		while (true) {
			class8 var1 = this.field747.method467();
			if (var1 == null) {
				this.field745 = this.field744;
				return;
			}
			var1.method334();
			var1.method35();
		}
	}
}
