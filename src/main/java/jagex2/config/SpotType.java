package jagex2.config;

import jagex2.io.JagFile;
import deob.ObfuscatedName;
import jagex2.io.Packet;
import jagex2.dash3d.Model;
import jagex2.datastruct.LruCache;
import sign.signlink;

@ObfuscatedName("TGIKVGNH")
public final class SpotType {

	@ObfuscatedName("TGIKVGNH.b")
	public static final int field1365 = 868;

	@ObfuscatedName("TGIKVGNH.p")
	public static LruCache modelCache = new LruCache((byte) 7, 30);

	@ObfuscatedName("TGIKVGNH.a")
	public final boolean field1364 = true;

	@ObfuscatedName("TGIKVGNH.g")
	public int anim = -1;

	@ObfuscatedName("TGIKVGNH.i")
	public final int[] recol_s = new int[6];

	@ObfuscatedName("TGIKVGNH.j")
	public final int[] recol_d = new int[6];

	@ObfuscatedName("TGIKVGNH.k")
	public int resizeh = 128;

	@ObfuscatedName("TGIKVGNH.l")
	public int resizev = 128;

	@ObfuscatedName("TGIKVGNH.c")
	public static int numdefinitions;

	@ObfuscatedName("TGIKVGNH.e")
	public int id;

	@ObfuscatedName("TGIKVGNH.f")
	public int model;

	@ObfuscatedName("TGIKVGNH.m")
	public int angle;

	@ObfuscatedName("TGIKVGNH.n")
	public int ambient;

	@ObfuscatedName("TGIKVGNH.o")
	public int contrast;

	@ObfuscatedName("TGIKVGNH.h")
	public SeqType seq;

	@ObfuscatedName("TGIKVGNH.d")
	public static SpotType[] list;

	@ObfuscatedName("TGIKVGNH.a(ILBBMKAXRK;)V")
	public static void init(JagFile arg0) {
		try {
			Packet var1 = new Packet(arg0.read("spotanim.dat", null), -26583);
			numdefinitions = var1.g2();
			if (list == null) {
				list = new SpotType[numdefinitions];
			}
			for (int var2 = 0; var2 < numdefinitions; var2++) {
				if (list[var2] == null) {
					list[var2] = new SpotType();
				}
				list[var2].id = var2;
				list[var2].decode(var1);
			}
		} catch (RuntimeException var4) {
			signlink.reporterror("42102, " + -768 + ", " + arg0 + ", " + var4.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("TGIKVGNH.a(LEILHLJCE;B)V")
	public void decode(Packet arg0) {
		try {
			while (true) {
				int var2 = arg0.g1();
				if (var2 == 0) {
					return;
				}
				if (var2 == 1) {
					this.model = arg0.g2();
				} else if (var2 == 2) {
					this.anim = arg0.g2();
					if (SeqType.list != null) {
						this.seq = SeqType.list[this.anim];
					}
				} else if (var2 == 4) {
					this.resizeh = arg0.g2();
				} else if (var2 == 5) {
					this.resizev = arg0.g2();
				} else if (var2 == 6) {
					this.angle = arg0.g2();
				} else if (var2 == 7) {
					this.ambient = arg0.g1();
				} else if (var2 == 8) {
					this.contrast = arg0.g1();
				} else if (var2 >= 40 && var2 < 50) {
					this.recol_s[var2 - 40] = arg0.g2();
				} else if (var2 >= 50 && var2 < 60) {
					this.recol_d[var2 - 50] = arg0.g2();
				} else {
					System.out.println("Error unrecognised spotanim config code: " + var2);
				}
			}
		} catch (RuntimeException var4) {
			signlink.reporterror("54595, " + arg0 + ", " + -50 + ", " + var4.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("TGIKVGNH.a()LKBEXSZSN;")
	public Model getTempModel2() {
		Model var1 = (Model) modelCache.find((long) this.id);
		if (var1 != null) {
			return var1;
		}
		Model var2 = Model.load(this.model);
		if (var2 == null) {
			return null;
		}
		for (int var3 = 0; var3 < 6; var3++) {
			if (this.recol_s[0] != 0) {
				var2.recolour(this.recol_s[var3], this.recol_d[var3]);
			}
		}
		modelCache.put((byte) 7, (long) this.id, var2);
		return var2;
	}
}
