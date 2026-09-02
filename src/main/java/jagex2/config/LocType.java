package jagex2.config;

import deob.*;
import deob.client.Client;
import jagex2.dash3d.AnimFrame;
import jagex2.dash3d.Model;
import jagex2.datastruct.LruCache;
import jagex2.io.JagFile;
import jagex2.io.OnDemand;
import jagex2.io.Packet;
import sign.signlink;

@ObfuscatedName("DQLJXYPC")
public final class LocType {

	@ObfuscatedName("DQLJXYPC.d")
	public static final Model[] field692 = new Model[4];

	@ObfuscatedName("DQLJXYPC.K")
	public static LruCache mc2 = new LruCache((byte) 7, 40);

	@ObfuscatedName("DQLJXYPC.U")
	public static LruCache mc1 = new LruCache((byte) 7, 500);

	@ObfuscatedName("DQLJXYPC.Y")
	public static final boolean field739 = true;

	@ObfuscatedName("DQLJXYPC.c")
	public final byte field691 = 29;

	@ObfuscatedName("DQLJXYPC.h")
	public final int field696 = 31;

	@ObfuscatedName("DQLJXYPC.z")
	public int id = -1;

	@ObfuscatedName("DQLJXYPC.V")
	public boolean field736 = false;

	@ObfuscatedName("DQLJXYPC.e")
	public byte ambient;

	@ObfuscatedName("DQLJXYPC.P")
	public byte contrast;

	@ObfuscatedName("DQLJXYPC.f")
	public int anim;

	@ObfuscatedName("DQLJXYPC.g")
	public int resizez;

	@ObfuscatedName("DQLJXYPC.i")
	public static int recentPos;

	@ObfuscatedName("DQLJXYPC.o")
	public int length;

	@ObfuscatedName("DQLJXYPC.t")
	public int width;

	@ObfuscatedName("DQLJXYPC.u")
	public int multivarp;

	@ObfuscatedName("DQLJXYPC.w")
	public int raiseobject;

	@ObfuscatedName("DQLJXYPC.y")
	public int resizex;

	@ObfuscatedName("DQLJXYPC.G")
	public int mapfunction;

	@ObfuscatedName("DQLJXYPC.I")
	public int offsetz;

	@ObfuscatedName("DQLJXYPC.J")
	public static int numDefinitions;

	@ObfuscatedName("DQLJXYPC.M")
	public int resizey;

	@ObfuscatedName("DQLJXYPC.Q")
	public int wallWidth;

	@ObfuscatedName("DQLJXYPC.R")
	public int multivarbit;

	@ObfuscatedName("DQLJXYPC.S")
	public int mapscene;

	@ObfuscatedName("DQLJXYPC.T")
	public int offsety;

	@ObfuscatedName("DQLJXYPC.W")
	public int forceapproach;

	@ObfuscatedName("DQLJXYPC.X")
	public int offsetx;

	@ObfuscatedName("DQLJXYPC.r")
	public static Packet dat;

	@ObfuscatedName("DQLJXYPC.l")
	public static Client field700;

	@ObfuscatedName("DQLJXYPC.O")
	public String name;

	@ObfuscatedName("DQLJXYPC.j")
	public boolean blockwalk;

	@ObfuscatedName("DQLJXYPC.k")
	public boolean active;

	@ObfuscatedName("DQLJXYPC.m")
	public boolean forcedecor;

	@ObfuscatedName("DQLJXYPC.n")
	public boolean breakroutefinding;

	@ObfuscatedName("DQLJXYPC.q")
	public boolean blockrange;

	@ObfuscatedName("DQLJXYPC.s")
	public boolean occlude;

	@ObfuscatedName("DQLJXYPC.B")
	public boolean sharelight;

	@ObfuscatedName("DQLJXYPC.E")
	public boolean shadow;

	@ObfuscatedName("DQLJXYPC.F")
	public boolean mirror;

	@ObfuscatedName("DQLJXYPC.H")
	public static boolean field722;

	@ObfuscatedName("DQLJXYPC.N")
	public boolean hillskew;

	@ObfuscatedName("DQLJXYPC.a")
	public byte[] desc;

	@ObfuscatedName("DQLJXYPC.b")
	public static int[] idx;

	@ObfuscatedName("DQLJXYPC.v")
	public int[] model;

	@ObfuscatedName("DQLJXYPC.x")
	public int[] recol_d;

	@ObfuscatedName("DQLJXYPC.A")
	public int[] shape;

	@ObfuscatedName("DQLJXYPC.C")
	public int[] recol_s;

	@ObfuscatedName("DQLJXYPC.L")
	public int[] multiloc;

	@ObfuscatedName("DQLJXYPC.p")
	public static LocType[] recent;

	@ObfuscatedName("DQLJXYPC.D")
	public String[] op;

	@ObfuscatedName("DQLJXYPC.a(LBBMKAXRK;)V")
	public static void init(JagFile arg0) {
		dat = new Packet(arg0.read("loc.dat", null), -26583);
		Packet var1 = new Packet(arg0.read("loc.idx", null), -26583);
		numDefinitions = var1.g2();
		idx = new int[numDefinitions];
		int var2 = 2;
		for (int var3 = 0; var3 < numDefinitions; var3++) {
			idx[var3] = var2;
			var2 += var1.g2();
		}
		recent = new LocType[20];
		for (int var4 = 0; var4 < 20; var4++) {
			recent[var4] = new LocType();
		}
	}

	@ObfuscatedName("DQLJXYPC.a(I)LDQLJXYPC;")
	public static LocType list(int arg0) {
		for (int var1 = 0; var1 < 20; var1++) {
			if (recent[var1].id == arg0) {
				return recent[var1];
			}
		}
		recentPos = (recentPos + 1) % 20;
		LocType var2 = recent[recentPos];
		dat.pos = idx[arg0];
		var2.id = arg0;
		var2.reset();
		var2.decode(dat);
		return var2;
	}

	@ObfuscatedName("DQLJXYPC.b(I)V")
	public static void method193() {
		try {
			mc1 = null;
			mc2 = null;
			idx = null;
			recent = null;
			dat = null;
		} catch (RuntimeException var1) {
			signlink.reporterror("61766, " + ", " + var1.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("DQLJXYPC.a(IIII)LKBEXSZSN;")
	public Model buildModel(int arg0, int arg1, int arg2) {
		try {
			Model var4 = null;
			long var5;
			if (this.shape == null) {
				if (arg0 != 10) {
					return null;
				}
				var5 = (long) ((this.id << 6) + arg1) + ((long) (arg2 + 1) << 32);
				Model var7 = (Model) mc2.find(var5);
				if (var7 != null) {
					return var7;
				}
				if (this.model == null) {
					return null;
				}
				boolean var8 = this.mirror ^ arg1 > 3;
				int var9 = this.model.length;
				for (int var10 = 0; var10 < var9; var10++) {
					int var11 = this.model[var10];
					if (var8) {
						var11 += 65536;
					}
					var4 = (Model) mc1.find((long) var11);
					if (var4 == null) {
						var4 = Model.load(var11 & 0xFFFF);
						if (var4 == null) {
							return null;
						}
						if (var8) {
							var4.mirror(804);
						}
						mc1.put((byte) 7, (long) var11, var4);
					}
					if (var9 > 1) {
						field692[var10] = var4;
					}
				}
				if (var9 > 1) {
					var4 = new Model(var9, field692, 5);
				}
			} else {
				int var12 = -1;
				for (int var13 = 0; var13 < this.shape.length; var13++) {
					if (this.shape[var13] == arg0) {
						var12 = var13;
						break;
					}
				}
				if (var12 == -1) {
					return null;
				}
				var5 = (long) ((this.id << 6) + (var12 << 3) + arg1) + ((long) (arg2 + 1) << 32);
				Model var14 = (Model) mc2.find(var5);
				if (var14 != null) {
					return var14;
				}
				int var15 = this.model[var12];
				boolean var16 = this.mirror ^ arg1 > 3;
				if (var16) {
					var15 += 65536;
				}
				var4 = (Model) mc1.find((long) var15);
				if (var4 == null) {
					var4 = Model.load(var15 & 0xFFFF);
					if (var4 == null) {
						return null;
					}
					if (var16) {
						var4.mirror(804);
					}
					mc1.put((byte) 7, (long) var15, var4);
				}
			}
			boolean var17;
			if (this.resizex == 128 && this.resizey == 128 && this.resizez == 128) {
				var17 = false;
			} else {
				var17 = true;
			}
			boolean var18;
			if (this.offsetx == 0 && this.offsety == 0 && this.offsetz == 0) {
				var18 = false;
			} else {
				var18 = true;
			}
			Model var19 = new Model(arg1 == 0 && arg2 == -1 && !var17 && !var18, 777, AnimFrame.animateTransparencies(arg2), var4, this.recol_s == null);
			if (arg2 != -1) {
				var19.prepareAnim(311);
				var19.animate(arg2);
				var19.labelFaces = null;
				var19.labelVertices = null;
			}
			while (arg1-- > 0) {
				var19.rotate90();
			}
			if (this.recol_s != null) {
				for (int var20 = 0; var20 < this.recol_s.length; var20++) {
					var19.recolour(this.recol_s[var20], this.recol_d[var20]);
				}
			}
			if (var17) {
				var19.resize(this.field691, this.resizez, this.resizey, this.resizex);
			}
			if (var18) {
				var19.translate(this.offsety, this.offsetx, this.offsetz);
			}
			var19.calculateNormals(this.ambient + 64, this.contrast * 5 + 768, -50, -10, -50, !this.sharelight);
			if (this.raiseobject == 1) {
				var19.objRaise = var19.minY;
			}
			mc2.put((byte) 7, var5, var19);
			return var19;
		} catch (RuntimeException var22) {
			signlink.reporterror("83654, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + -39484 + ", " + var22.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("DQLJXYPC.a(Z)Z")
	public boolean method188() {
		try {
			if (this.model == null) {
				return true;
			}
			boolean var1 = true;
			for (int var2 = 0; var2 < this.model.length; var2++) {
				var1 &= Model.requestDownload(this.model[var2] & 0xFFFF);
			}
			return var1;
		} catch (RuntimeException var4) {
			signlink.reporterror("52026, " + false + ", " + var4.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("DQLJXYPC.a(IIIIIII)LKBEXSZSN;")
	public Model getModel(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		Model var8 = this.buildModel(arg0, arg1, arg6);
		if (var8 == null) {
			return null;
		}
		if (this.hillskew || this.sharelight) {
			var8 = new Model(var8, this.hillskew, this.sharelight, false);
		}
		if (this.hillskew) {
			int var9 = (arg2 + arg3 + arg4 + arg5) / 4;
			for (int var10 = 0; var10 < var8.numPoints; var10++) {
				int var11 = var8.pointX[var10];
				int var12 = var8.pointZ[var10];
				int var13 = arg2 + (arg3 - arg2) * (var11 + 64) / 128;
				int var14 = arg5 + (arg4 - arg5) * (var11 + 64) / 128;
				int var15 = var13 + (var14 - var13) * (var12 + 64) / 128;
				var8.pointY[var10] += var15 - var9;
			}
			var8.recalcBoundingCylinder();
		}
		return var8;
	}

	@ObfuscatedName("DQLJXYPC.a(II)Z")
	public boolean checkModel(int arg0) {
		try {
			if (this.shape != null) {
				for (int var4 = 0; var4 < this.shape.length; var4++) {
					if (this.shape[var4] == arg0) {
						return Model.requestDownload(this.model[var4] & 0xFFFF);
					}
				}
				return true;
			} else if (this.model == null) {
				return true;
			} else if (arg0 == 10) {
				boolean var2 = true;
				for (int var3 = 0; var3 < this.model.length; var3++) {
					var2 &= Model.requestDownload(this.model[var3] & 0xFFFF);
				}
				return var2;
			} else {
				return true;
			}
		} catch (RuntimeException var6) {
			signlink.reporterror("69699, " + 401 + ", " + arg0 + ", " + var6.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("DQLJXYPC.a(LYSAVREBH;I)V")
	public void prefetchModelAll(OnDemand arg0) {
		try {
			if (this.model != null) {
				for (int var2 = 0; var2 < this.model.length; var2++) {
					arg0.prefetch(this.model[var2] & 0xFFFF, 0);
				}
			}
		} catch (RuntimeException var4) {
			signlink.reporterror("93606, " + arg0 + ", " + ", " + var4.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("DQLJXYPC.c(I)LDQLJXYPC;")
	public LocType method194(int arg0) {
		try {
			int var2 = -1;
			if (arg0 <= 0) {
				this.field736 = !this.field736;
			}
			if (this.multivarbit != -1) {
				VarbitType var3 = VarbitType.list[this.multivarbit];
				int var4 = var3.basevar;
				int var5 = var3.startbit;
				int var6 = var3.endbit;
				int var7 = Client.readbit[var6 - var5];
				var2 = field700.var[var4] >> var5 & var7;
			} else if (this.multivarp != -1) {
				var2 = field700.var[this.multivarp];
			}
			return var2 < 0 || var2 >= this.multiloc.length || this.multiloc[var2] == -1 ? null : list(this.multiloc[var2]);
		} catch (RuntimeException var9) {
			signlink.reporterror("87467, " + arg0 + ", " + var9.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("DQLJXYPC.a(LEILHLJCE;B)V")
	public void decode(Packet arg0) {
		try {
			int var2 = -1;
			while (true) {
				while (true) {
					int var4;
					do {
						while (true) {
							int var3 = arg0.g1();
							if (var3 == 0) {
								if (var2 == -1) {
									this.active = false;
									if (this.model != null && (this.shape == null || this.shape[0] == 10)) {
										this.active = true;
									}
									if (this.op != null) {
										this.active = true;
									}
								}
								if (this.breakroutefinding) {
									this.blockwalk = false;
									this.blockrange = false;
								}
								if (this.raiseobject == -1) {
									this.raiseobject = this.blockwalk ? 1 : 0;
									return;
								}
								return;
							}
							if (var3 == 1) {
								var4 = arg0.g1();
								break;
							}
							if (var3 == 2) {
								this.name = arg0.gstr();
							} else if (var3 == 3) {
								this.desc = arg0.gstrbyte();
							} else if (var3 == 5) {
								int var6 = arg0.g1();
								if (var6 > 0) {
									if (this.model == null || field722) {
										this.shape = null;
										this.model = new int[var6];
										for (int var7 = 0; var7 < var6; var7++) {
											this.model[var7] = arg0.g2();
										}
									} else {
										arg0.pos += var6 * 2;
									}
								}
							} else if (var3 == 14) {
								this.width = arg0.g1();
							} else if (var3 == 15) {
								this.length = arg0.g1();
							} else if (var3 == 17) {
								this.blockwalk = false;
							} else if (var3 == 18) {
								this.blockrange = false;
							} else if (var3 == 19) {
								var2 = arg0.g1();
								if (var2 == 1) {
									this.active = true;
								}
							} else if (var3 == 21) {
								this.hillskew = true;
							} else if (var3 == 22) {
								this.sharelight = true;
							} else if (var3 == 23) {
								this.occlude = true;
							} else if (var3 == 24) {
								this.anim = arg0.g2();
								if (this.anim == 65535) {
									this.anim = -1;
								}
							} else if (var3 == 28) {
								this.wallWidth = arg0.g1();
							} else if (var3 == 29) {
								this.ambient = arg0.g1b();
							} else if (var3 == 39) {
								this.contrast = arg0.g1b();
							} else if (var3 >= 30 && var3 < 39) {
								if (this.op == null) {
									this.op = new String[5];
								}
								this.op[var3 - 30] = arg0.gstr();
								if (this.op[var3 - 30].equalsIgnoreCase("hidden")) {
									this.op[var3 - 30] = null;
								}
							} else if (var3 == 40) {
								int var8 = arg0.g1();
								this.recol_s = new int[var8];
								this.recol_d = new int[var8];
								for (int var9 = 0; var9 < var8; var9++) {
									this.recol_s[var9] = arg0.g2();
									this.recol_d[var9] = arg0.g2();
								}
							} else if (var3 == 60) {
								this.mapfunction = arg0.g2();
							} else if (var3 == 62) {
								this.mirror = true;
							} else if (var3 == 64) {
								this.shadow = false;
							} else if (var3 == 65) {
								this.resizex = arg0.g2();
							} else if (var3 == 66) {
								this.resizey = arg0.g2();
							} else if (var3 == 67) {
								this.resizez = arg0.g2();
							} else if (var3 == 68) {
								this.mapscene = arg0.g2();
							} else if (var3 == 69) {
								this.forceapproach = arg0.g1();
							} else if (var3 == 70) {
								this.offsetx = arg0.g2b();
							} else if (var3 == 71) {
								this.offsety = arg0.g2b();
							} else if (var3 == 72) {
								this.offsetz = arg0.g2b();
							} else if (var3 == 73) {
								this.forcedecor = true;
							} else if (var3 == 74) {
								this.breakroutefinding = true;
							} else if (var3 == 75) {
								this.raiseobject = arg0.g1();
							} else if (var3 == 77) {
								this.multivarbit = arg0.g2();
								if (this.multivarbit == 65535) {
									this.multivarbit = -1;
								}
								this.multivarp = arg0.g2();
								if (this.multivarp == 65535) {
									this.multivarp = -1;
								}
								int var10 = arg0.g1();
								this.multiloc = new int[var10 + 1];
								for (int var11 = 0; var11 <= var10; var11++) {
									this.multiloc[var11] = arg0.g2();
									if (this.multiloc[var11] == 65535) {
										this.multiloc[var11] = -1;
									}
								}
							}
						}
					} while (var4 <= 0);
					if (this.model == null || field722) {
						this.shape = new int[var4];
						this.model = new int[var4];
						for (int var5 = 0; var5 < var4; var5++) {
							this.model[var5] = arg0.g2();
							this.shape[var5] = arg0.g1();
						}
					} else {
						arg0.pos += var4 * 3;
					}
				}
			}
		} catch (RuntimeException var13) {
			signlink.reporterror("23534, " + arg0 + ", " + -50 + ", " + var13.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("DQLJXYPC.a()V")
	public void reset() {
		this.model = null;
		this.shape = null;
		this.name = null;
		this.desc = null;
		this.recol_s = null;
		this.recol_d = null;
		this.width = 1;
		this.length = 1;
		this.blockwalk = true;
		this.blockrange = true;
		this.active = false;
		this.hillskew = false;
		this.sharelight = false;
		this.occlude = false;
		this.anim = -1;
		this.wallWidth = 16;
		this.ambient = 0;
		this.contrast = 0;
		this.op = null;
		this.mapfunction = -1;
		this.mapscene = -1;
		this.mirror = false;
		this.shadow = true;
		this.resizex = 128;
		this.resizey = 128;
		this.resizez = 128;
		this.forceapproach = 0;
		this.offsetx = 0;
		this.offsety = 0;
		this.offsetz = 0;
		this.forcedecor = false;
		this.breakroutefinding = false;
		this.raiseobject = -1;
		this.multivarbit = -1;
		this.multivarp = -1;
		this.multiloc = null;
	}
}
