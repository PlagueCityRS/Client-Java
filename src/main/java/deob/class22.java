package deob;

import sign.signlink;

@ObfuscatedName("GTYZUNUD")
public final class class22 {

	@ObfuscatedName("GTYZUNUD.e")
	public static final class22[] field838 = new class22[5000];

	@ObfuscatedName("GTYZUNUD.f")
	public static final int[] field839 = new int[5000];

	@ObfuscatedName("GTYZUNUD.a")
	public final byte field834 = -77;

	@ObfuscatedName("GTYZUNUD.c")
	public final int field836 = -44;

	@ObfuscatedName("GTYZUNUD.i")
	public final class11[] field842 = new class11[10];

	@ObfuscatedName("GTYZUNUD.j")
	public int field843;

	@ObfuscatedName("GTYZUNUD.k")
	public int field844;

	@ObfuscatedName("GTYZUNUD.h")
	public static class17 field841;

	@ObfuscatedName("GTYZUNUD.d")
	public static boolean field837;

	@ObfuscatedName("GTYZUNUD.g")
	public static byte[] field840;

	@ObfuscatedName("GTYZUNUD.a(ILEILHLJCE;)V")
	public static void method297(class17 arg0) {
		try {
			field840 = new byte[441000];
			field841 = new class17(field840, -26583);
			class11.method182();
			while (true) {
				int var1 = arg0.method226();
				if (var1 == 65535) {
					return;
				}
				field838[var1] = new class22(field837);
				field838[var1].method299(arg0);
				field839[var1] = field838[var1].method300();
			}
		} catch (RuntimeException var3) {
			signlink.reporterror("89383, " + -768 + ", " + arg0 + ", " + var3.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("GTYZUNUD.a(BII)LEILHLJCE;")
	public static class17 method298(int arg0, int arg1) {
		try {
			if (field838[arg1] == null) {
				return null;
			} else {
				class22 var2 = field838[arg1];
				return var2.method301(arg0);
			}
		} catch (RuntimeException var4) {
			signlink.reporterror("60631, " + 37 + ", " + arg0 + ", " + arg1 + ", " + var4.toString());
			throw new RuntimeException();
		}
	}

	public class22(boolean arg0) {
		try {
			if (!arg0) {
				;
			}
		} catch (RuntimeException var3) {
			signlink.reporterror("5161, " + arg0 + ", " + var3.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("GTYZUNUD.a(LEILHLJCE;B)V")
	public void method299(class17 arg0) {
		try {
			for (int var2 = 0; var2 < 10; var2++) {
				int var3 = arg0.method224();
				if (var3 != 0) {
					arg0.field779--;
					this.field842[var2] = new class11();
					this.field842[var2].method185(arg0);
				}
			}
			this.field843 = arg0.method226();
			this.field844 = arg0.method226();
		} catch (RuntimeException var5) {
			signlink.reporterror("94034, " + arg0 + ", " + -50 + ", " + var5.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("GTYZUNUD.a(I)I")
	public int method300() {
		try {
			int var1 = 9999999;
			for (int var2 = 0; var2 < 10; var2++) {
				if (this.field842[var2] != null && this.field842[var2].field668 / 20 < var1) {
					var1 = this.field842[var2].field668 / 20;
				}
			}
			if (this.field843 < this.field844 && this.field843 / 20 < var1) {
				var1 = this.field843 / 20;
			}
			if (var1 == 9999999 || var1 == 0) {
				return 0;
			}
			for (int var3 = 0; var3 < 10; var3++) {
				if (this.field842[var3] != null) {
					this.field842[var3].field668 -= var1 * 20;
				}
			}
			if (this.field843 < this.field844) {
				this.field843 -= var1 * 20;
				this.field844 -= var1 * 20;
			}
			return var1;
		} catch (RuntimeException var5) {
			signlink.reporterror("46190, " + ", " + var5.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("GTYZUNUD.a(II)LEILHLJCE;")
	public class17 method301(int arg0) {
		try {
			int var2 = this.method302(arg0);
			field841.field779 = 0;
			field841.method218(1380533830);
			field841.method219(var2 + 36);
			field841.method218(1463899717);
			field841.method218(1718449184);
			field841.method219(16);
			field841.method216(1, this.field834);
			field841.method216(1, this.field834);
			field841.method219(22050);
			field841.method219(22050);
			field841.method216(1, this.field834);
			field841.method216(8, this.field834);
			field841.method218(1684108385);
			field841.method219(var2);
			field841.field779 += var2;
			return field841;
		} catch (RuntimeException var4) {
			signlink.reporterror("62152, " + 9 + ", " + arg0 + ", " + var4.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("GTYZUNUD.b(I)I")
	public int method302(int arg0) {
		int var2 = 0;
		for (int var3 = 0; var3 < 10; var3++) {
			if (this.field842[var3] != null && this.field842[var3].field667 + this.field842[var3].field668 > var2) {
				var2 = this.field842[var3].field667 + this.field842[var3].field668;
			}
		}
		if (var2 == 0) {
			return 0;
		}
		int var4 = var2 * 22050 / 1000;
		int var5 = this.field843 * 22050 / 1000;
		int var6 = this.field844 * 22050 / 1000;
		if (var5 < 0 || var5 > var4 || var6 < 0 || var6 > var4 || var5 >= var6) {
			arg0 = 0;
		}
		int var7 = var4 + (var6 - var5) * (arg0 - 1);
		for (int var8 = 44; var8 < var7 + 44; var8++) {
			field840[var8] = -128;
		}
		for (int var9 = 0; var9 < 10; var9++) {
			if (this.field842[var9] != null) {
				int var10 = this.field842[var9].field667 * 22050 / 1000;
				int var11 = this.field842[var9].field668 * 22050 / 1000;
				int[] var12 = this.field842[var9].method183(var10, this.field842[var9].field667);
				for (int var13 = 0; var13 < var10; var13++) {
					field840[var13 + var11 + 44] += (byte) (var12[var13] >> 8);
				}
			}
		}
		if (arg0 > 1) {
			var5 += 44;
			var6 += 44;
			var4 += 44;
			var7 += 44;
			int var14 = var7 - var4;
			for (int var15 = var4 - 1; var15 >= var6; var15--) {
				field840[var15 + var14] = field840[var15];
			}
			for (int var16 = 1; var16 < arg0; var16++) {
				int var17 = (var6 - var5) * var16;
				for (int var18 = var5; var18 < var6; var18++) {
					field840[var18 + var17] = field840[var18];
				}
			}
			var7 -= 44;
		}
		return var7;
	}
}
