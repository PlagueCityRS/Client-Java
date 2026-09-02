package jagex2.config;

import jagex2.io.JagFile;
import deob.ObfuscatedName;
import jagex2.io.Packet;
import sign.signlink;

@ObfuscatedName("ISZVQSTL")
public final class VarType {

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
	public static int numDefinitions;

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
	public static VarType[] list;

	@ObfuscatedName("ISZVQSTL.a(ILBBMKAXRK;)V")
	public static void init(JagFile arg0) {
		try {
			Packet var1 = new Packet(arg0.read("varp.dat", null), -26583);
			field964 = 0;
			numDefinitions = var1.g2();
			if (list == null) {
				list = new VarType[numDefinitions];
			}
			if (field965 == null) {
				field965 = new int[numDefinitions];
			}
			for (int var2 = 0; var2 < numDefinitions; var2++) {
				if (list[var2] == null) {
					list[var2] = new VarType();
				}
				list[var2].decode(var2, var1);
			}
			if (var1.pos != var1.data.length) {
				System.out.println("varptype load mismatch");
			}
		} catch (RuntimeException var4) {
			signlink.reporterror("27165, " + -768 + ", " + arg0 + ", " + var4.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("ISZVQSTL.a(ILEILHLJCE;I)V")
	public void decode(int arg0, Packet arg1) {
		try {
			while (true) {
				int var3 = arg1.g1();
				if (var3 == 0) {
					return;
				}
				if (var3 == 1) {
					this.field967 = arg1.g1();
				} else if (var3 == 2) {
					this.field968 = arg1.g1();
				} else if (var3 == 3) {
					this.field969 = true;
					field965[field964++] = arg0;
				} else if (var3 == 4) {
					this.field970 = false;
				} else if (var3 == 5) {
					this.field971 = arg1.g2();
				} else if (var3 == 6) {
					this.field972 = true;
				} else if (var3 == 7) {
					this.field973 = arg1.g4();
				} else if (var3 == 8) {
					this.field974 = 1;
					this.field975 = true;
				} else if (var3 == 10) {
					this.field966 = arg1.gstr();
				} else if (var3 == 11) {
					this.field975 = true;
				} else if (var3 == 12) {
					this.field976 = arg1.g4();
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
