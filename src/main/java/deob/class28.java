package deob;

import sign.signlink;

@ObfuscatedName("ISZVQSTL")
public final class class28 {

	@ObfuscatedName("ISZVQSTL.i")
	public boolean field969 = false;

	@ObfuscatedName("ISZVQSTL.j")
	public boolean field970 = true;

	@ObfuscatedName("ISZVQSTL.l")
	public boolean field972 = false;

	@ObfuscatedName("ISZVQSTL.o")
	public boolean field975 = false;

	@ObfuscatedName("ISZVQSTL.p")
	public int field976 = -1;

	@ObfuscatedName("ISZVQSTL.q")
	public boolean field977 = true;

	@ObfuscatedName("ISZVQSTL.b")
	public static int field962;

	@ObfuscatedName("ISZVQSTL.d")
	public static int field964;

	@ObfuscatedName("ISZVQSTL.g")
	public int field967;

	@ObfuscatedName("ISZVQSTL.h")
	public int field968;

	@ObfuscatedName("ISZVQSTL.k")
	public int field971;

	@ObfuscatedName("ISZVQSTL.m")
	public int field973;

	@ObfuscatedName("ISZVQSTL.n")
	public int field974;

	@ObfuscatedName("ISZVQSTL.f")
	public String field966;

	@ObfuscatedName("ISZVQSTL.e")
	public static int[] field965;

	@ObfuscatedName("ISZVQSTL.c")
	public static class28[] field963;

	@ObfuscatedName("ISZVQSTL.a(ILBBMKAXRK;)V")
	public static void method332(class6 arg0) {
		try {
			class17 var1 = new class17(arg0.method30("varp.dat", null), -26583);
			field964 = 0;
			field962 = var1.method226();
			if (field963 == null) {
				field963 = new class28[field962];
			}
			if (field965 == null) {
				field965 = new int[field962];
			}
			for (int var2 = 0; var2 < field962; var2++) {
				if (field963[var2] == null) {
					field963[var2] = new class28();
				}
				field963[var2].method333(var2, var1);
			}
			if (var1.field779 != var1.field778.length) {
				System.out.println("varptype load mismatch");
			}
		} catch (RuntimeException var4) {
			signlink.reporterror("27165, " + -768 + ", " + arg0 + ", " + var4.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("ISZVQSTL.a(ILEILHLJCE;I)V")
	public void method333(int arg0, class17 arg1) {
		try {
			while (true) {
				int var3 = arg1.method224();
				if (var3 == 0) {
					return;
				}
				if (var3 == 1) {
					this.field967 = arg1.method224();
				} else if (var3 == 2) {
					this.field968 = arg1.method224();
				} else if (var3 == 3) {
					this.field969 = true;
					field965[field964++] = arg0;
				} else if (var3 == 4) {
					this.field970 = false;
				} else if (var3 == 5) {
					this.field971 = arg1.method226();
				} else if (var3 == 6) {
					this.field972 = true;
				} else if (var3 == 7) {
					this.field973 = arg1.method229();
				} else if (var3 == 8) {
					this.field974 = 1;
					this.field975 = true;
				} else if (var3 == 10) {
					this.field966 = arg1.method231();
				} else if (var3 == 11) {
					this.field975 = true;
				} else if (var3 == 12) {
					this.field976 = arg1.method229();
				} else if (var3 == 13) {
					this.field974 = 2;
					this.field975 = true;
				} else if (var3 == 14) {
					this.field977 = false;
				} else {
					System.out.println("Error unrecognised config code: " + var3);
				}
			}
		} catch (RuntimeException var5) {
			signlink.reporterror("53907, " + arg0 + ", " + arg1 + ", " + ", " + var5.toString());
			throw new RuntimeException();
		}
	}
}
