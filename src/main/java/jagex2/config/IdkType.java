package jagex2.config;

import jagex2.io.JagFile;
import deob.ObfuscatedName;
import jagex2.io.Packet;
import jagex2.dash3d.Model;
import sign.signlink;

@ObfuscatedName("TFKCMRVE")
public final class IdkType {

	@ObfuscatedName("TFKCMRVE.d")
	public static int numDefinitions;

	@ObfuscatedName("TFKCMRVE.g")
	public int[] model;

	@ObfuscatedName("TFKCMRVE.h")
	public final int[] recol_s = new int[6];

	@ObfuscatedName("TFKCMRVE.i")
	public final int[] recol_d = new int[6];

	@ObfuscatedName("TFKCMRVE.j")
	public final int[] head = new int[] { -1, -1, -1, -1, -1 };

	@ObfuscatedName("TFKCMRVE.k")
	public boolean disable = false;

	@ObfuscatedName("TFKCMRVE.e")
	public static IdkType[] list;

	@ObfuscatedName("TFKCMRVE.b")
	public final boolean field1354 = true;

	@ObfuscatedName("TFKCMRVE.c")
	public final boolean field1355 = true;

	@ObfuscatedName("TFKCMRVE.a")
	public static boolean field1353;

	@ObfuscatedName("TFKCMRVE.f")
	public int part = -1;

	@ObfuscatedName("TFKCMRVE.a(ILBBMKAXRK;)V")
	public static void init(JagFile arg0) {
		try {
			Packet var1 = new Packet(arg0.read("idk.dat", null), -26583);
			numDefinitions = var1.g2();
			if (list == null) {
				list = new IdkType[numDefinitions];
			}
			for (int var2 = 0; var2 < numDefinitions; var2++) {
				if (list[var2] == null) {
					list[var2] = new IdkType();
				}
				list[var2].decode(var1);
			}
		} catch (RuntimeException var4) {
			signlink.reporterror("89473, " + -768 + ", " + arg0 + ", " + var4.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("TFKCMRVE.a(LEILHLJCE;B)V")
	public void decode(Packet arg0) {
		try {
			while (true) {
				int var2 = arg0.g1();
				if (var2 == 0) {
					return;
				}
				if (var2 == 1) {
					this.part = arg0.g1();
				} else if (var2 == 2) {
					int var3 = arg0.g1();
					this.model = new int[var3];
					for (int var4 = 0; var4 < var3; var4++) {
						this.model[var4] = arg0.g2();
					}
				} else if (var2 == 3) {
					this.disable = true;
				} else if (var2 >= 40 && var2 < 50) {
					this.recol_s[var2 - 40] = arg0.g2();
				} else if (var2 >= 50 && var2 < 60) {
					this.recol_d[var2 - 50] = arg0.g2();
				} else if (var2 >= 60 && var2 < 70) {
					this.head[var2 - 60] = arg0.g2();
				} else {
					System.out.println("Error unrecognised config code: " + var2);
				}
			}
		} catch (RuntimeException var6) {
			signlink.reporterror("45113, " + arg0 + ", " + -50 + ", " + var6.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("TFKCMRVE.a(Z)Z")
	public boolean checkModel() {
		try {
			if (this.model == null) {
				return true;
			}
			boolean var1 = true;
			for (int var2 = 0; var2 < this.model.length; var2++) {
				if (!Model.requestDownload(this.model[var2])) {
					var1 = false;
				}
			}
			return var1;
		} catch (RuntimeException var4) {
			signlink.reporterror("40417, " + false + ", " + var4.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("TFKCMRVE.a(B)LKBEXSZSN;")
	public Model getModelNoCheck() {
		try {
			if (this.model == null) {
				return null;
			}
			Model[] var1 = new Model[this.model.length];
			for (int var2 = 0; var2 < this.model.length; var2++) {
				var1[var2] = Model.load(this.model[var2]);
			}
			Model var3;
			if (var1.length == 1) {
				var3 = var1[0];
			} else {
				var3 = new Model(var1.length, var1, 5);
			}
			for (int var4 = 0; var4 < 6 && this.recol_s[var4] != 0; var4++) {
				var3.recolour(this.recol_s[var4], this.recol_d[var4]);
			}
			return var3;
		} catch (RuntimeException var6) {
			signlink.reporterror("56495, " + 9 + ", " + var6.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("TFKCMRVE.a(I)Z")
	public boolean checkHead() {
		try {
			boolean var1 = true;
			for (int var2 = 0; var2 < 5; var2++) {
				if (this.head[var2] != -1 && !Model.requestDownload(this.head[var2])) {
					var1 = false;
				}
			}
			return var1;
		} catch (RuntimeException var4) {
			signlink.reporterror("64373, " + 4732 + ", " + var4.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("TFKCMRVE.b(I)LKBEXSZSN;")
	public Model getHeadNoCheck() {
		try {
			Model[] var1 = new Model[5];
			int var2 = 0;
			for (int var3 = 0; var3 < 5; var3++) {
				if (this.head[var3] != -1) {
					var1[var2++] = Model.load(this.head[var3]);
				}
			}
			Model var4 = new Model(var2, var1, 5);
			for (int var5 = 0; var5 < 6 && this.recol_s[var5] != 0; var5++) {
				var4.recolour(this.recol_s[var5], this.recol_d[var5]);
			}
			return var4;
		} catch (RuntimeException var7) {
			signlink.reporterror("52878, " + -732 + ", " + var7.toString());
			throw new RuntimeException();
		}
	}
}
