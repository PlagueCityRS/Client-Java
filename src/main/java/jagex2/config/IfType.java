package jagex2.config;

import deob.*;
import deob.client.Client;
import jagex2.dash3d.AnimFrame;
import jagex2.dash3d.Model;
import jagex2.datastruct.JString;
import jagex2.datastruct.LruCache;
import jagex2.graphics.Pix32;
import jagex2.graphics.PixFont;
import jagex2.io.JagFile;
import jagex2.io.Packet;
import sign.signlink;

@ObfuscatedName("IRYXZZFE")
public final class IfType {

	@ObfuscatedName("IRYXZZFE.Q")
	public static IfType[] list;

	@ObfuscatedName("IRYXZZFE.ib")
	public int[] linkObjType;

	@ObfuscatedName("IRYXZZFE.w")
	public int[] linkObjNumber;

	@ObfuscatedName("IRYXZZFE.jb")
	public int animFrame;

	@ObfuscatedName("IRYXZZFE.ub")
	public int animCycle;

	@ObfuscatedName("IRYXZZFE.B")
	public int id;

	@ObfuscatedName("IRYXZZFE.i")
	public int layerId;

	@ObfuscatedName("IRYXZZFE.J")
	public int type;

	@ObfuscatedName("IRYXZZFE.V")
	public int buttonType;

	@ObfuscatedName("IRYXZZFE.e")
	public int clientCode;

	@ObfuscatedName("IRYXZZFE.T")
	public int width;

	@ObfuscatedName("IRYXZZFE.x")
	public int height;

	@ObfuscatedName("IRYXZZFE.A")
	public byte trans;

	@ObfuscatedName("IRYXZZFE.Y")
	public int field937;

	@ObfuscatedName("IRYXZZFE.u")
	public int field907;

	@ObfuscatedName("IRYXZZFE.eb")
	public int[][] scripts;

	@ObfuscatedName("IRYXZZFE.q")
	public int[] scriptComparator;

	@ObfuscatedName("IRYXZZFE.o")
	public int[] scriptOperand;

	@ObfuscatedName("IRYXZZFE.G")
	public int overlayId;

	@ObfuscatedName("IRYXZZFE.I")
	public int scrollheight;

	@ObfuscatedName("IRYXZZFE.P")
	public int scrollPos;

	@ObfuscatedName("IRYXZZFE.E")
	public boolean hide;

	@ObfuscatedName("IRYXZZFE.y")
	public int[] children;

	@ObfuscatedName("IRYXZZFE.U")
	public int[] childX;

	@ObfuscatedName("IRYXZZFE.M")
	public int model1Id;

	@ObfuscatedName("IRYXZZFE.fb")
	public int model2Type;

	@ObfuscatedName("IRYXZZFE.gb")
	public int model2Id;

	@ObfuscatedName("IRYXZZFE.l")
	public int modelAnim;

	@ObfuscatedName("IRYXZZFE.m")
	public int modelAnim2;

	@ObfuscatedName("IRYXZZFE.kb")
	public int modelZoom;

	@ObfuscatedName("IRYXZZFE.lb")
	public int modelXAn;

	@ObfuscatedName("IRYXZZFE.mb")
	public int modelYAn;

	@ObfuscatedName("IRYXZZFE.ab")
	public String targetVerb;

	@ObfuscatedName("IRYXZZFE.k")
	public String targetBase;

	@ObfuscatedName("IRYXZZFE.Z")
	public int targetMask;

	@ObfuscatedName("IRYXZZFE.t")
	public String buttonText;

	@ObfuscatedName("IRYXZZFE.r")
	public static final LruCache modelCache = new LruCache((byte) 7, 30);

	@ObfuscatedName("IRYXZZFE.N")
	public static LruCache spritecache;

	@ObfuscatedName("IRYXZZFE.f")
	public int colour;

	@ObfuscatedName("IRYXZZFE.n")
	public int colour2;

	@ObfuscatedName("IRYXZZFE.d")
	public int colourOver;

	@ObfuscatedName("IRYXZZFE.bb")
	public int colour2Over;

	@ObfuscatedName("IRYXZZFE.L")
	public int model1Type;

	@ObfuscatedName("IRYXZZFE.S")
	public int field931;

	@ObfuscatedName("IRYXZZFE.db")
	public int marginX;

	@ObfuscatedName("IRYXZZFE.C")
	public int marginY;

	@ObfuscatedName("IRYXZZFE.O")
	public Pix32 graphic;

	@ObfuscatedName("IRYXZZFE.R")
	public Pix32 graphic2;

	@ObfuscatedName("IRYXZZFE.ob")
	public PixFont font;

	@ObfuscatedName("IRYXZZFE.F")
	public String text;

	@ObfuscatedName("IRYXZZFE.pb")
	public String text2;

	@ObfuscatedName("IRYXZZFE.v")
	public boolean fill;

	@ObfuscatedName("IRYXZZFE.X")
	public boolean centre;

	@ObfuscatedName("IRYXZZFE.h")
	public boolean shadow;

	@ObfuscatedName("IRYXZZFE.qb")
	public boolean field955;

	@ObfuscatedName("IRYXZZFE.cb")
	public boolean objSwap;

	@ObfuscatedName("IRYXZZFE.s")
	public boolean objOps;

	@ObfuscatedName("IRYXZZFE.hb")
	public boolean objUse;

	@ObfuscatedName("IRYXZZFE.j")
	public boolean objReplace;

	@ObfuscatedName("IRYXZZFE.W")
	public int[] invBackgroundX;

	@ObfuscatedName("IRYXZZFE.g")
	public int[] invBackgroundY;

	@ObfuscatedName("IRYXZZFE.vb")
	public int[] childY;

	@ObfuscatedName("IRYXZZFE.sb")
	public Pix32[] invBackground;

	@ObfuscatedName("IRYXZZFE.p")
	public String[] iop;

	@ObfuscatedName("IRYXZZFE.nb")
	public static boolean field952 = true;

	@ObfuscatedName("IRYXZZFE.rb")
	public static int field956 = -1;

	@ObfuscatedName("IRYXZZFE.b")
	public static int field888;

	@ObfuscatedName("IRYXZZFE.tb")
	public static int field958;

	@ObfuscatedName("IRYXZZFE.a")
	public static int errrrrIdk = -1;

	@ObfuscatedName("IRYXZZFE.z")
	public int field912;

	@ObfuscatedName("IRYXZZFE.c")
	public static int field889 = -1;

	@ObfuscatedName("IRYXZZFE.H")
	public static JagFile interfaces;

	@ObfuscatedName("IRYXZZFE.D")
	public static PixFont[] fonts;

	@ObfuscatedName("IRYXZZFE.K")
	public static byte[][] data;

	@ObfuscatedName("IRYXZZFE.a(BLBBMKAXRK;LBBMKAXRK;[LMCYRKBJU;)V")
	public static void unpack(JagFile arg0, JagFile arg1, PixFont[] arg2) {
		try {
			spritecache = new LruCache((byte) 7, 50000);
			interfaces = arg0;
			fonts = arg2;
			int var3 = -1;
			Packet var4 = new Packet(arg1.read("data", null), -26583);
			int var5 = var4.g2();
			list = new IfType[var5];
			data = new byte[var5][];
			while (var4.pos < var4.data.length) {
				int var6 = var4.g2();
				if (var6 == 65535) {
					var3 = var4.g2();
					var6 = var4.g2();
				}
				int var7 = var4.pos;
				IfType var8 = decode(var6, 782, var3, var4);
				byte[] var9 = data[var8.id] = new byte[var4.pos + 2 - var7];
				for (int var10 = var7; var10 < var4.pos; var10++) {
					var9[var10 + 2 - var7] = var4.data[var10];
				}
				var9[0] = (byte) (var3 >> 8);
				var9[1] = (byte) var3;
			}
			interfaces = null;
		} catch (RuntimeException var12) {
			signlink.reporterror("8130, " + 6 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + var12.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("IRYXZZFE.a(IIILEILHLJCE;)LIRYXZZFE;")
	public static IfType decode(int arg0, int arg1, int arg2, Packet arg3) {
		try {
			boolean var28 = false;
			IfType var4 = new IfType();
			var4.id = arg0;
			var4.layerId = arg2;
			var4.type = arg3.g1();
			var4.buttonType = arg3.g1();
			var4.clientCode = arg3.g2();
			var4.width = arg3.g2();
			var4.height = arg3.g2();
			var4.trans = (byte) arg3.g1();
			var4.overlayId = arg3.g1();
			if (var4.overlayId == 0) {
				var4.overlayId = -1;
			} else {
				var4.overlayId = (var4.overlayId - 1 << 8) + arg3.g1();
			}
			if (var4.clientCode == 600) {
				errrrrIdk = arg2;
			}
			if (var4.clientCode == 650) {
				field956 = arg2;
			}
			if (var4.clientCode == 655) {
				field889 = arg2;
			}
			int var5 = arg3.g1();
			if (var5 > 0) {
				var4.scriptComparator = new int[var5];
				var4.scriptOperand = new int[var5];
				for (int var6 = 0; var6 < var5; var6++) {
					var4.scriptComparator[var6] = arg3.g1();
					var4.scriptOperand[var6] = arg3.g2();
				}
			}
			int var7 = arg3.g1();
			if (var7 > 0) {
				var4.scripts = new int[var7][];
				for (int var8 = 0; var8 < var7; var8++) {
					int var9 = arg3.g2();
					var4.scripts[var8] = new int[var9];
					for (int var10 = 0; var10 < var9; var10++) {
						var4.scripts[var8][var10] = arg3.g2();
					}
				}
			}
			if (var4.type == 0) {
				var4.scrollheight = arg3.g2();
				var4.hide = arg3.g1() == 1;
				int var11 = arg3.g2();
				var4.children = new int[var11];
				var4.childX = new int[var11];
				var4.childY = new int[var11];
				for (int var12 = 0; var12 < var11; var12++) {
					var4.children[var12] = arg3.g2();
					var4.childX[var12] = arg3.g2b();
					var4.childY[var12] = arg3.g2b();
				}
			}
			if (var4.type == 1) {
				var4.field931 = arg3.g2();
				var4.field955 = arg3.g1() == 1;
			}
			if (var4.type == 2) {
				var4.linkObjType = new int[var4.width * var4.height];
				var4.linkObjNumber = new int[var4.width * var4.height];
				var4.objSwap = arg3.g1() == 1;
				var4.objOps = arg3.g1() == 1;
				var4.objUse = arg3.g1() == 1;
				var4.objReplace = arg3.g1() == 1;
				var4.marginX = arg3.g1();
				var4.marginY = arg3.g1();
				var4.invBackgroundX = new int[20];
				var4.invBackgroundY = new int[20];
				var4.invBackground = new Pix32[20];
				for (int var13 = 0; var13 < 20; var13++) {
					int var14 = arg3.g1();
					if (var14 == 1) {
						var4.invBackgroundX[var13] = arg3.g2b();
						var4.invBackgroundY[var13] = arg3.g2b();
						String var15 = arg3.gstr();
						if (var15.length() > 0) {
							int var16 = var15.lastIndexOf(",");
							var4.invBackground[var13] = getSprite(Integer.parseInt(var15.substring(var16 + 1)), var15.substring(0, var16));
						}
					}
				}
				var4.iop = new String[5];
				for (int var17 = 0; var17 < 5; var17++) {
					var4.iop[var17] = arg3.gstr();
					if (var4.iop[var17].length() == 0) {
						var4.iop[var17] = null;
					}
				}
			}
			if (var4.type == 3) {
				var4.fill = arg3.g1() == 1;
			}
			if (var4.type == 4 || var4.type == 1) {
				var4.centre = arg3.g1() == 1;
				int var18 = arg3.g1();
				if (fonts != null) {
					var4.font = fonts[var18];
				}
				var4.shadow = arg3.g1() == 1;
			}
			if (var4.type == 4) {
				var4.text = arg3.gstr();
				var4.text2 = arg3.gstr();
			}
			if (var4.type == 1 || var4.type == 3 || var4.type == 4) {
				var4.colour = arg3.g4();
			}
			if (var4.type == 3 || var4.type == 4) {
				var4.colour2 = arg3.g4();
				var4.colourOver = arg3.g4();
				var4.colour2Over = arg3.g4();
			}
			if (var4.type == 5) {
				String var19 = arg3.gstr();
				if (var19.length() > 0) {
					int var20 = var19.lastIndexOf(",");
					var4.graphic = getSprite(Integer.parseInt(var19.substring(var20 + 1)), var19.substring(0, var20));
				}
				String var21 = arg3.gstr();
				if (var21.length() > 0) {
					int var22 = var21.lastIndexOf(",");
					var4.graphic2 = getSprite(Integer.parseInt(var21.substring(var22 + 1)), var21.substring(0, var22));
				}
			}
			if (var4.type == 6) {
				int var27 = arg3.g1();
				if (var27 != 0) {
					var4.model1Type = 1;
					var4.model1Id = (var27 - 1 << 8) + arg3.g1();
				}
				var27 = arg3.g1();
				if (var27 != 0) {
					var4.model2Type = 1;
					var4.model2Id = (var27 - 1 << 8) + arg3.g1();
				}
				var27 = arg3.g1();
				if (var27 == 0) {
					var4.modelAnim = -1;
				} else {
					var4.modelAnim = (var27 - 1 << 8) + arg3.g1();
				}
				var27 = arg3.g1();
				if (var27 == 0) {
					var4.modelAnim2 = -1;
				} else {
					var4.modelAnim2 = (var27 - 1 << 8) + arg3.g1();
				}
				var4.modelZoom = arg3.g2();
				var4.modelXAn = arg3.g2();
				var4.modelYAn = arg3.g2();
			}
			if (var4.type == 7) {
				var4.linkObjType = new int[var4.width * var4.height];
				var4.linkObjNumber = new int[var4.width * var4.height];
				var4.centre = arg3.g1() == 1;
				int var23 = arg3.g1();
				if (fonts != null) {
					var4.font = fonts[var23];
				}
				var4.shadow = arg3.g1() == 1;
				var4.colour = arg3.g4();
				var4.marginX = arg3.g2b();
				var4.marginY = arg3.g2b();
				var4.objOps = arg3.g1() == 1;
				var4.iop = new String[5];
				for (int var24 = 0; var24 < 5; var24++) {
					var4.iop[var24] = arg3.gstr();
					if (var4.iop[var24].length() == 0) {
						var4.iop[var24] = null;
					}
				}
			}
			if (var4.type == 8) {
				var4.text = arg3.gstr();
			}
			if (var4.buttonType == 2 || var4.type == 2) {
				var4.targetVerb = arg3.gstr();
				var4.targetBase = arg3.gstr();
				var4.targetMask = arg3.g2();
			}
			if (var4.buttonType == 1 || var4.buttonType == 4 || var4.buttonType == 5 || var4.buttonType == 6) {
				var4.buttonText = arg3.gstr();
				if (var4.buttonText.length() == 0) {
					if (var4.buttonType == 1) {
						var4.buttonText = "Ok";
					}
					if (var4.buttonType == 4) {
						var4.buttonText = "Select";
					}
					if (var4.buttonType == 5) {
						var4.buttonText = "Select";
					}
					if (var4.buttonType == 6) {
						var4.buttonText = "Continue";
					}
				}
			}
			return var4;
		} catch (RuntimeException var26) {
			signlink.reporterror("94367, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + var26.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("IRYXZZFE.a(LKBEXSZSN;IIZ)V")
	public static void cacheModel(Model arg0, boolean arg1) {
		try {
			if (!arg1) {
				field952 = !field952;
			}
			modelCache.clear();
			if (arg0 != null) {
				modelCache.put((byte) 7, (long) 327680, arg0);
			}
		} catch (RuntimeException var3) {
			signlink.reporterror("12409, " + arg0 + ", " + ", " + 5 + ", " + arg1 + ", " + var3.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("IRYXZZFE.a(IILjava/lang/String;)LODBDSPMH;")
	public static Pix32 getSprite(int arg0, String arg1) {
		try {
			long var2 = (JString.hashCode(arg1) << 8) + (long) arg0;
			Pix32 var4 = (Pix32) spritecache.find(var2);
			if (var4 != null) {
				return var4;
			} else if (interfaces == null) {
				return null;
			} else {
				try {
					Pix32 var5 = new Pix32(interfaces, arg1, arg0);
					spritecache.put((byte) 7, var2, var5);
					return var5;
				} catch (Exception var7) {
					return null;
				}
			}
		} catch (RuntimeException var8) {
			signlink.reporterror("91594, " + arg0 + ", " + -93 + ", " + arg1 + ", " + var8.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("IRYXZZFE.a(III)V")
	public void swapSlots(int arg0, int arg1) {
		try {
			int var3 = this.linkObjType[arg1];
			this.linkObjType[arg1] = this.linkObjType[arg0];
			this.linkObjType[arg0] = var3;
			int var4 = this.linkObjNumber[arg1];
			this.linkObjNumber[arg1] = this.linkObjNumber[arg0];
			this.linkObjNumber[arg0] = var4;
		} catch (RuntimeException var6) {
			signlink.reporterror("41583, " + 1 + ", " + arg0 + ", " + arg1 + ", " + var6.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("IRYXZZFE.a(IIZZ)LKBEXSZSN;")
	public Model getTempModel(int arg0, int arg1, boolean arg2) {
		try {
			field958 = 64;
			field888 = 768;
			Model var4;
			if (arg2) {
				var4 = this.getModel(this.model2Type, this.model2Id);
			} else {
				var4 = this.getModel(this.model1Type, this.model1Id);
			}
			if (var4 == null) {
				return null;
			} else if (arg0 == -1 && arg1 == -1 && var4.faceColour == null) {
				return var4;
			} else {
				Model var5 = new Model(false, 777, AnimFrame.animateTransparencies(arg0) & AnimFrame.animateTransparencies(arg1), var4, true);
				if (arg0 != -1 || arg1 != -1) {
					var5.prepareAnim(311);
				}
				if (arg0 != -1) {
					var5.animate(arg0);
				}
				if (arg1 != -1) {
					var5.animate(arg1);
				}
				var5.calculateNormals(field958, field888, -50, -10, -50, true);
				return var5;
			}
		} catch (RuntimeException var7) {
			signlink.reporterror("70485, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + true + ", " + var7.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("IRYXZZFE.a(II)LKBEXSZSN;")
	public Model getModel(int arg0, int arg1) {
		ObjType var3 = null;
		if (arg0 == 4) {
			var3 = ObjType.list(arg1);
			field958 += var3.ambient;
			field888 += var3.contrast;
		}
		Model var4 = (Model) modelCache.find((long) ((arg0 << 16) + arg1));
		if (var4 != null) {
			return var4;
		}
		if (arg0 == 1) {
			var4 = Model.load(arg1);
		}
		if (arg0 == 2) {
			var4 = NpcType.list(arg1).getHeadModel();
		}
		if (arg0 == 3) {
			var4 = Client.localPlayer.getHeadModel();
		}
		if (arg0 == 4) {
			var4 = var3.getModelUnlit(50);
		}
		if (arg0 == 5) {
			var4 = null;
		}
		if (var4 != null) {
			modelCache.put((byte) 7, (long) ((arg0 << 16) + arg1), var4);
		}
		return var4;
	}

	@ObfuscatedName("IRYXZZFE.a(IZ)V")
	public static void unloadIf(int arg0) {
		try {
			if (arg0 != -1) {
				for (int var1 = 0; var1 < list.length; var1++) {
					if (list[var1] != null && list[var1].layerId == arg0 && list[var1].type != 2) {
						list[var1] = null;
					}
				}
			}
		} catch (RuntimeException var3) {
			signlink.reporterror("51424, " + arg0 + ", " + true + ", " + var3.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("IRYXZZFE.a(I)V")
	public static void unload() {
		try {
			list = null;
			interfaces = null;
			spritecache = null;
			fonts = null;
			data = null;
		} catch (RuntimeException var1) {
			signlink.reporterror("64298, " + ", " + var1.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("IRYXZZFE.b(I)LIRYXZZFE;")
	public static IfType list(int arg0) {
		if (list[arg0] == null) {
			Packet var1 = new Packet(data[arg0], -26583);
			int var2 = var1.g2();
			list[arg0] = decode(arg0, 782, var2, var1);
		}
		return list[arg0];
	}
}
