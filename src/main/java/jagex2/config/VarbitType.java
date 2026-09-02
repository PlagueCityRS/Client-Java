package jagex2.config;

import jagex2.io.JagFile;
import deob.ObfuscatedName;
import jagex2.io.Packet;
import sign.signlink;

@ObfuscatedName("SRLFLGUY")
public final class VarbitType {

	@ObfuscatedName("SRLFLGUY.a")
	public static final int field1326 = -23379;

	@ObfuscatedName("SRLFLGUY.h")
	public boolean field1333 = false;

	@ObfuscatedName("SRLFLGUY.i")
	public int field1334 = -1;

	@ObfuscatedName("SRLFLGUY.k")
	public boolean field1336 = true;

	@ObfuscatedName("SRLFLGUY.b")
	public static int field1327;

	@ObfuscatedName("SRLFLGUY.e")
	public int basevar;

	@ObfuscatedName("SRLFLGUY.f")
	public int startbit;

	@ObfuscatedName("SRLFLGUY.g")
	public int endbit;

	@ObfuscatedName("SRLFLGUY.j")
	public int field1335;

	@ObfuscatedName("SRLFLGUY.d")
	public String debugname;

	@ObfuscatedName("SRLFLGUY.c")
	public static VarbitType[] list;

	@ObfuscatedName("SRLFLGUY.a(ILBBMKAXRK;)V")
	public static void init(JagFile arg0) {
		try {
			Packet var1 = new Packet(arg0.read("varbit.dat", null), -26583);
			field1327 = var1.g2();
			if (list == null) {
				list = new VarbitType[field1327];
			}
			for (int var2 = 0; var2 < field1327; var2++) {
				if (list[var2] == null) {
					list[var2] = new VarbitType();
				}
				list[var2].decode(var2, var1);
				if (list[var2].field1333) {
					VarType.list[list[var2].basevar].field975 = true;
				}
			}
			if (var1.pos != var1.data.length) {
				System.out.println("varbit load mismatch");
			}
		} catch (RuntimeException var4) {
			signlink.reporterror("2656, " + -768 + ", " + arg0 + ", " + var4.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("SRLFLGUY.a(ILEILHLJCE;I)V")
	public void decode(int arg0, Packet arg1) {
		try {
			while (true) {
				int var3 = arg1.g1();
				if (var3 == 0) {
					return;
				}
				if (var3 == 1) {
					this.basevar = arg1.g2();
					this.startbit = arg1.g1();
					this.endbit = arg1.g1();
				} else if (var3 == 10) {
					this.debugname = arg1.gstr();
				} else if (var3 == 2) {
					this.field1333 = true;
				} else if (var3 == 3) {
					this.field1334 = arg1.g4();
				} else if (var3 == 4) {
					this.field1335 = arg1.g4();
				} else if (var3 == 5) {
					this.field1336 = false;
				} else {
					System.out.println("Error unrecognised config code: " + var3);
				}
			}
		} catch (RuntimeException var5) {
			signlink.reporterror("65729, " + arg0 + ", " + arg1 + ", " + ", " + var5.toString());
			throw new RuntimeException();
		}
	}
}
