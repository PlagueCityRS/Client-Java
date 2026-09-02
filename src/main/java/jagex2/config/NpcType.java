package jagex2.config;

import jagex2.dash3d.AnimFrame;
import jagex2.io.JagFile;
import deob.ObfuscatedName;
import jagex2.io.Packet;
import deob.client.Client;
import jagex2.dash3d.Model;
import jagex2.datastruct.LruCache;
import sign.signlink;

@ObfuscatedName("NPWLDXJE")
public final class NpcType {

	@ObfuscatedName("NPWLDXJE.a")
	public static LruCache modelCache = new LruCache((byte) 7, 30);

	@ObfuscatedName("NPWLDXJE.e")
	public long id = -1L;

	@ObfuscatedName("NPWLDXJE.f")
	public int walkanim_r = -1;

	@ObfuscatedName("NPWLDXJE.g")
	public int resizeh = 128;

	@ObfuscatedName("NPWLDXJE.j")
	public byte size = 1;

	@ObfuscatedName("NPWLDXJE.k")
	public boolean active = true;

	@ObfuscatedName("NPWLDXJE.m")
	public int field1130 = -1;

	@ObfuscatedName("NPWLDXJE.n")
	public int multivarabit = -1;

	@ObfuscatedName("NPWLDXJE.o")
	public boolean minimap = true;

	@ObfuscatedName("NPWLDXJE.q")
	public int resizev = 128;

	@ObfuscatedName("NPWLDXJE.r")
	public final byte field1135 = 29;

	@ObfuscatedName("NPWLDXJE.s")
	public int walkanim_b = -1;

	@ObfuscatedName("NPWLDXJE.t")
	public int vislevel = -1;

	@ObfuscatedName("NPWLDXJE.u")
	public int headicon = -1;

	@ObfuscatedName("NPWLDXJE.v")
	public int field1139 = -1;

	@ObfuscatedName("NPWLDXJE.w")
	public int turnspeed = 32;

	@ObfuscatedName("NPWLDXJE.x")
	public int readyanim = -1;

	@ObfuscatedName("NPWLDXJE.A")
	public int field1144 = -1;

	@ObfuscatedName("NPWLDXJE.B")
	public boolean alwaysontop = false;

	@ObfuscatedName("NPWLDXJE.F")
	public int walkanim_l = -1;

	@ObfuscatedName("NPWLDXJE.H")
	public int walkanim = -1;

	@ObfuscatedName("NPWLDXJE.I")
	public int multivarp = -1;

	@ObfuscatedName("NPWLDXJE.h")
	public int ambient;

	@ObfuscatedName("NPWLDXJE.z")
	public static int numDefinitions;

	@ObfuscatedName("NPWLDXJE.E")
	public static int recentPos;

	@ObfuscatedName("NPWLDXJE.J")
	public int contrast;

	@ObfuscatedName("NPWLDXJE.C")
	public static Packet dat;

	@ObfuscatedName("NPWLDXJE.d")
	public static Client varCache;

	@ObfuscatedName("NPWLDXJE.y")
	public String name;

	@ObfuscatedName("NPWLDXJE.D")
	public byte[] desc;

	@ObfuscatedName("NPWLDXJE.b")
	public int[] multinpc;

	@ObfuscatedName("NPWLDXJE.c")
	public int[] recol_d;

	@ObfuscatedName("NPWLDXJE.i")
	public static int[] idx;

	@ObfuscatedName("NPWLDXJE.l")
	public int[] head;

	@ObfuscatedName("NPWLDXJE.K")
	public int[] model;

	@ObfuscatedName("NPWLDXJE.L")
	public int[] recol_s;

	@ObfuscatedName("NPWLDXJE.G")
	public static NpcType[] recent;

	@ObfuscatedName("NPWLDXJE.p")
	public String[] op;

	@ObfuscatedName("NPWLDXJE.a(LBBMKAXRK;)V")
	public static void init(JagFile arg0) {
		dat = new Packet(arg0.read("npc.dat", null), -26583);
		Packet var1 = new Packet(arg0.read("npc.idx", null), -26583);
		numDefinitions = var1.g2();
		idx = new int[numDefinitions];
		int var2 = 2;
		for (int var3 = 0; var3 < numDefinitions; var3++) {
			idx[var3] = var2;
			var2 += var1.g2();
		}
		recent = new NpcType[20];
		for (int var4 = 0; var4 < 20; var4++) {
			recent[var4] = new NpcType();
		}
	}

	@ObfuscatedName("NPWLDXJE.b(I)LNPWLDXJE;")
	public static NpcType list(int arg0) {
		for (int var1 = 0; var1 < 20; var1++) {
			if (recent[var1].id == (long) arg0) {
				return recent[var1];
			}
		}
		recentPos = (recentPos + 1) % 20;
		NpcType var2 = recent[recentPos] = new NpcType();
		dat.pos = idx[arg0];
		var2.id = arg0;
		var2.decode(dat);
		return var2;
	}

	@ObfuscatedName("NPWLDXJE.c(I)V")
	public static void method394() {
		try {
			modelCache = null;
			idx = null;
			recent = null;
			dat = null;
		} catch (RuntimeException var1) {
			signlink.reporterror("26436, " + ", " + var1.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("NPWLDXJE.a(II[IZ)LKBEXSZSN;")
	public Model getTempModel(int arg0, int arg1, int[] arg2) {
		try {
			if (this.multinpc != null) {
				NpcType var4 = this.method389();
				return var4 == null ? null : var4.getTempModel(arg0, arg1, arg2);
			}
			Model var5 = (Model) modelCache.find(this.id);
			if (var5 == null) {
				boolean var6 = false;
				for (int var7 = 0; var7 < this.model.length; var7++) {
					if (!Model.requestDownload(this.model[var7])) {
						var6 = true;
					}
				}
				if (var6) {
					return null;
				}
				Model[] var8 = new Model[this.model.length];
				for (int var9 = 0; var9 < this.model.length; var9++) {
					var8[var9] = Model.load(this.model[var9]);
				}
				if (var8.length == 1) {
					var5 = var8[0];
				} else {
					var5 = new Model(var8.length, var8, 5);
				}
				if (this.recol_s != null) {
					for (int var10 = 0; var10 < this.recol_s.length; var10++) {
						var5.recolour(this.recol_s[var10], this.recol_d[var10]);
					}
				}
				var5.prepareAnim(311);
				var5.calculateNormals(this.ambient + 64, this.contrast + 850, -30, -50, -30, true);
				modelCache.put((byte) 7, this.id, var5);
			}
			Model var11 = Model.field996;
			var11.set(var5, AnimFrame.animateTransparencies(arg0) & AnimFrame.animateTransparencies(arg1));
			if (arg0 != -1 && arg1 != -1) {
				var11.maskAnimate(arg2, arg1, arg0);
			} else if (arg0 != -1) {
				var11.animate(arg0);
			}
			if (this.resizeh != 128 || this.resizev != 128) {
				var11.resize(this.field1135, this.resizeh, this.resizev, this.resizeh);
			}
			var11.calcBoundingCylinder();
			var11.labelFaces = null;
			var11.labelVertices = null;
			if (this.size == 1) {
				var11.useAABBMouseCheck = true;
			}
			return var11;
		} catch (RuntimeException var13) {
			signlink.reporterror("17351, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + true + ", " + var13.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("NPWLDXJE.a(B)LNPWLDXJE;")
	public NpcType method389() {
		try {
			int var1 = -1;
			if (this.multivarabit != -1) {
				VarbitType var2 = VarbitType.list[this.multivarabit];
				int var3 = var2.basevar;
				int var4 = var2.startbit;
				int var5 = var2.endbit;
				int var6 = Client.readbit[var5 - var4];
				var1 = varCache.var[var3] >> var4 & var6;
			} else if (this.multivarp != -1) {
				var1 = varCache.var[this.multivarp];
			}
			return var1 < 0 || var1 >= this.multinpc.length || this.multinpc[var1] == -1 ? null : list(this.multinpc[var1]);
		} catch (RuntimeException var8) {
			signlink.reporterror("50665, " + 108 + ", " + var8.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("NPWLDXJE.a(Z)LKBEXSZSN;")
	public Model getHeadModel() {
		try {
			if (this.multinpc != null) {
				NpcType var1 = this.method389();
				return var1 == null ? null : var1.getHeadModel();
			} else if (this.head == null) {
				return null;
			} else {
				boolean var2 = false;
				for (int var3 = 0; var3 < this.head.length; var3++) {
					if (!Model.requestDownload(this.head[var3])) {
						var2 = true;
					}
				}
				if (var2) {
					return null;
				}
				Model[] var4 = new Model[this.head.length];
				for (int var5 = 0; var5 < this.head.length; var5++) {
					var4[var5] = Model.load(this.head[var5]);
				}
				Model var6;
				if (var4.length == 1) {
					var6 = var4[0];
				} else {
					var6 = new Model(var4.length, var4, 5);
				}
				if (this.recol_s != null) {
					for (int var7 = 0; var7 < this.recol_s.length; var7++) {
						var6.recolour(this.recol_s[var7], this.recol_d[var7]);
					}
				}
				return var6;
			}
		} catch (RuntimeException var9) {
			signlink.reporterror("79583, " + false + ", " + var9.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("NPWLDXJE.a(I)Z")
	public boolean method392() {
		try {
			if (this.multinpc == null) {
				return true;
			}
			int var1 = -1;
			if (this.multivarabit != -1) {
				VarbitType var2 = VarbitType.list[this.multivarabit];
				int var3 = var2.basevar;
				int var4 = var2.startbit;
				int var5 = var2.endbit;
				int var6 = Client.readbit[var5 - var4];
				var1 = varCache.var[var3] >> var4 & var6;
			} else if (this.multivarp != -1) {
				var1 = varCache.var[this.multivarp];
			}
			return var1 >= 0 && var1 < this.multinpc.length && this.multinpc[var1] != -1;
		} catch (RuntimeException var8) {
			signlink.reporterror("16817, " + ", " + var8.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("NPWLDXJE.a(LEILHLJCE;B)V")
	public void decode(Packet arg0) {
		try {
			while (true) {
				int var2 = arg0.g1();
				if (var2 == 0) {
					return;
				}
				if (var2 == 1) {
					int var3 = arg0.g1();
					this.model = new int[var3];
					for (int var4 = 0; var4 < var3; var4++) {
						this.model[var4] = arg0.g2();
					}
				} else if (var2 == 2) {
					this.name = arg0.gstr();
				} else if (var2 == 3) {
					this.desc = arg0.gstrbyte();
				} else if (var2 == 12) {
					this.size = arg0.g1b();
				} else if (var2 == 13) {
					this.readyanim = arg0.g2();
				} else if (var2 == 14) {
					this.walkanim = arg0.g2();
				} else if (var2 == 17) {
					this.walkanim = arg0.g2();
					this.walkanim_b = arg0.g2();
					this.walkanim_r = arg0.g2();
					this.walkanim_l = arg0.g2();
				} else if (var2 >= 30 && var2 < 40) {
					if (this.op == null) {
						this.op = new String[5];
					}
					this.op[var2 - 30] = arg0.gstr();
					if (this.op[var2 - 30].equalsIgnoreCase("hidden")) {
						this.op[var2 - 30] = null;
					}
				} else if (var2 == 40) {
					int var5 = arg0.g1();
					this.recol_s = new int[var5];
					this.recol_d = new int[var5];
					for (int var6 = 0; var6 < var5; var6++) {
						this.recol_s[var6] = arg0.g2();
						this.recol_d[var6] = arg0.g2();
					}
				} else if (var2 == 60) {
					int var7 = arg0.g1();
					this.head = new int[var7];
					for (int var8 = 0; var8 < var7; var8++) {
						this.head[var8] = arg0.g2();
					}
				} else if (var2 == 90) {
					this.field1130 = arg0.g2();
				} else if (var2 == 91) {
					this.field1144 = arg0.g2();
				} else if (var2 == 92) {
					this.field1139 = arg0.g2();
				} else if (var2 == 93) {
					this.minimap = false;
				} else if (var2 == 95) {
					this.vislevel = arg0.g2();
				} else if (var2 == 97) {
					this.resizeh = arg0.g2();
				} else if (var2 == 98) {
					this.resizev = arg0.g2();
				} else if (var2 == 99) {
					this.alwaysontop = true;
				} else if (var2 == 100) {
					this.ambient = arg0.g1b();
				} else if (var2 == 101) {
					this.contrast = arg0.g1b() * 5;
				} else if (var2 == 102) {
					this.headicon = arg0.g2();
				} else if (var2 == 103) {
					this.turnspeed = arg0.g2();
				} else if (var2 == 106) {
					this.multivarabit = arg0.g2();
					if (this.multivarabit == 65535) {
						this.multivarabit = -1;
					}
					this.multivarp = arg0.g2();
					if (this.multivarp == 65535) {
						this.multivarp = -1;
					}
					int var9 = arg0.g1();
					this.multinpc = new int[var9 + 1];
					for (int var10 = 0; var10 <= var9; var10++) {
						this.multinpc[var10] = arg0.g2();
						if (this.multinpc[var10] == 65535) {
							this.multinpc[var10] = -1;
						}
					}
				} else if (var2 == 107) {
					this.active = false;
				}
			}
		} catch (RuntimeException var12) {
			signlink.reporterror("88035, " + arg0 + ", " + -50 + ", " + var12.toString());
			throw new RuntimeException();
		}
	}
}
