package jagex2.dash3d;

import deob.*;
import jagex2.graphics.Pix2D;
import jagex2.io.OnDemandProvider;
import jagex2.io.Packet;
import sign.signlink;

@ObfuscatedName("KBEXSZSN")
public final class Model extends ModelSource {

	@ObfuscatedName("KBEXSZSN.k")
	public static final boolean field988 = true;

	@ObfuscatedName("KBEXSZSN.s")
	public static final Model field996 = new Model(-977);

	@ObfuscatedName("KBEXSZSN.t")
	public static int[] tmpVertexX = new int[2000];

	@ObfuscatedName("KBEXSZSN.u")
	public static int[] tmpVertexY = new int[2000];

	@ObfuscatedName("KBEXSZSN.v")
	public static int[] tempVertexZ = new int[2000];

	@ObfuscatedName("KBEXSZSN.w")
	public static int[] field1000 = new int[2000];

	@ObfuscatedName("KBEXSZSN.hb")
	public static boolean[] faceClippedX = new boolean[4096];

	@ObfuscatedName("KBEXSZSN.ib")
	public static boolean[] faceNearClipped = new boolean[4096];

	@ObfuscatedName("KBEXSZSN.jb")
	public static int[] vertexScreenX = new int[4096];

	@ObfuscatedName("KBEXSZSN.kb")
	public static int[] vertexScreenY = new int[4096];

	@ObfuscatedName("KBEXSZSN.lb")
	public static int[] field1041 = new int[4096];

	@ObfuscatedName("KBEXSZSN.mb")
	public static int[] vertexViewSpaceX = new int[4096];

	@ObfuscatedName("KBEXSZSN.nb")
	public static int[] vertexViewSpaceY = new int[4096];

	@ObfuscatedName("KBEXSZSN.ob")
	public static int[] vertexViewSpaceZ = new int[4096];

	@ObfuscatedName("KBEXSZSN.pb")
	public static int[] tmpDepthFaceCount = new int[1500];

	@ObfuscatedName("KBEXSZSN.qb")
	public static int[][] tmpDepthFaces = new int[1500][512];

	@ObfuscatedName("KBEXSZSN.rb")
	public static int[] tmpPriorityFaceCount = new int[12];

	@ObfuscatedName("KBEXSZSN.sb")
	public static int[][] tmpPriorityFaces = new int[12][2000];

	@ObfuscatedName("KBEXSZSN.tb")
	public static int[] tmpPriority10FaceDepth = new int[2000];

	@ObfuscatedName("KBEXSZSN.ub")
	public static int[] tmpPriority11FaceDepth = new int[2000];

	@ObfuscatedName("KBEXSZSN.vb")
	public static int[] tmpPriorityDepthSum = new int[12];

	@ObfuscatedName("KBEXSZSN.wb")
	public static final int[] clippedX = new int[10];

	@ObfuscatedName("KBEXSZSN.xb")
	public static final int[] clippedY = new int[10];

	@ObfuscatedName("KBEXSZSN.yb")
	public static final int[] clippedColour = new int[10];

	@ObfuscatedName("KBEXSZSN.Gb")
	public static final int[] pickedEntityTypecode = new int[1000];

	@ObfuscatedName("KBEXSZSN.Hb")
	public static int[] sinTable = Pix3D.sinTable;

	@ObfuscatedName("KBEXSZSN.Ib")
	public static int[] cosTable = Pix3D.cosTable;

	@ObfuscatedName("KBEXSZSN.Jb")
	public static int[] field1065 = Pix3D.colourTable;

	@ObfuscatedName("KBEXSZSN.Kb")
	public static int[] field1066 = Pix3D.divTable2;

	@ObfuscatedName("KBEXSZSN.l")
	public int field989 = 7;

	@ObfuscatedName("KBEXSZSN.m")
	public final int field990 = 8;

	@ObfuscatedName("KBEXSZSN.n")
	public final byte field991 = 29;

	@ObfuscatedName("KBEXSZSN.o")
	public final int field992 = -548;

	@ObfuscatedName("KBEXSZSN.q")
	public final boolean field994 = false;

	@ObfuscatedName("KBEXSZSN.db")
	public boolean useAABBMouseCheck = false;

	@ObfuscatedName("KBEXSZSN.x")
	public int numPoints;

	@ObfuscatedName("KBEXSZSN.B")
	public int numFaces;

	@ObfuscatedName("KBEXSZSN.N")
	public int numT;

	@ObfuscatedName("KBEXSZSN.y")
	public int[] pointX;

	@ObfuscatedName("KBEXSZSN.z")
	public int[] pointY;

	@ObfuscatedName("KBEXSZSN.A")
	public int[] pointZ;

	@ObfuscatedName("KBEXSZSN.C")
	public int[] faceVertexA;

	@ObfuscatedName("KBEXSZSN.D")
	public int[] faceVertexB;

	@ObfuscatedName("KBEXSZSN.E")
	public int[] faceVertexC;

	@ObfuscatedName("KBEXSZSN.O")
	public int[] faceTextureP;

	@ObfuscatedName("KBEXSZSN.P")
	public int[] faceTextureM;

	@ObfuscatedName("KBEXSZSN.Q")
	public int[] faceTextureN;

	@ObfuscatedName("KBEXSZSN.Z")
	public int[] vertexLabel;

	@ObfuscatedName("KBEXSZSN.I")
	public int[] faceRenderType;

	@ObfuscatedName("KBEXSZSN.J")
	public int[] facePriority;

	@ObfuscatedName("KBEXSZSN.M")
	public int field1016;

	@ObfuscatedName("KBEXSZSN.K")
	public int[] faceAlpha;

	@ObfuscatedName("KBEXSZSN.ab")
	public int[] faceLabel;

	@ObfuscatedName("KBEXSZSN.L")
	public int[] faceColour;

	@ObfuscatedName("KBEXSZSN.F")
	public int[] faceColourA;

	@ObfuscatedName("KBEXSZSN.G")
	public int[] faceColorB;

	@ObfuscatedName("KBEXSZSN.H")
	public int[] faceColourC;

	@ObfuscatedName("KBEXSZSN.eb")
	public PointNormal[] sharedPointNormal;

	@ObfuscatedName("KBEXSZSN.V")
	public int maxY;

	@ObfuscatedName("KBEXSZSN.U")
	public int radius;

	@ObfuscatedName("KBEXSZSN.X")
	public int minDepth;

	@ObfuscatedName("KBEXSZSN.W")
	public int maxDepth;

	@ObfuscatedName("KBEXSZSN.S")
	public int field1022;

	@ObfuscatedName("KBEXSZSN.T")
	public int field1023;

	@ObfuscatedName("KBEXSZSN.R")
	public int field1021;

	@ObfuscatedName("KBEXSZSN.Y")
	public int objRaise;

	@ObfuscatedName("KBEXSZSN.zb")
	public static int oX;

	@ObfuscatedName("KBEXSZSN.Ab")
	public static int oY;

	@ObfuscatedName("KBEXSZSN.Bb")
	public static int oZ;

	@ObfuscatedName("KBEXSZSN.Db")
	public static int mouseX;

	@ObfuscatedName("KBEXSZSN.Eb")
	public static int mouseY;

	@ObfuscatedName("KBEXSZSN.Fb")
	public static int pickedCount;

	@ObfuscatedName("KBEXSZSN.p")
	public static int field993;

	@ObfuscatedName("KBEXSZSN.r")
	public static int field995;

	@ObfuscatedName("KBEXSZSN.gb")
	public static OnDemandProvider provider;

	@ObfuscatedName("KBEXSZSN.Cb")
	public static boolean mouseCheck;

	@ObfuscatedName("KBEXSZSN.fb")
	public static Metadata[] meta;

	@ObfuscatedName("KBEXSZSN.bb")
	public int[][] labelVertices;

	@ObfuscatedName("KBEXSZSN.cb")
	public int[][] labelFaces;

	@ObfuscatedName("KBEXSZSN.b(I)V")
	public static void unload() {
		try {
			meta = null;
			faceClippedX = null;
			faceNearClipped = null;
			vertexScreenX = null;
			vertexScreenY = null;
			field1041 = null;
			vertexViewSpaceX = null;
			vertexViewSpaceY = null;
			vertexViewSpaceZ = null;
			tmpDepthFaceCount = null;
			tmpDepthFaces = null;
			tmpPriorityFaceCount = null;
			tmpPriorityFaces = null;
			tmpPriority10FaceDepth = null;
			tmpPriority11FaceDepth = null;
			tmpPriorityDepthSum = null;
			sinTable = null;
			cosTable = null;
			field1065 = null;
			field1066 = null;
		} catch (RuntimeException var1) {
			signlink.reporterror("32744, " + ", " + var1.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("KBEXSZSN.a(ILETIUBBOA;)V")
	public static void init(int arg0, OnDemandProvider arg1) {
		meta = new Metadata[arg0];
		provider = arg1;
	}

	@ObfuscatedName("KBEXSZSN.a(ZI[B)V")
	public static void unpack(int arg0, byte[] arg1) {
		try {
			if (arg1 == null) {
				Metadata var2 = meta[arg0] = new Metadata();
				var2.field1428 = 0;
				var2.field1429 = 0;
				var2.field1430 = 0;
			} else {
				Packet var3 = new Packet(arg1, -26583);
				var3.pos = arg1.length - 18;
				Metadata var4 = meta[arg0] = new Metadata();
				var4.src = arg1;
				var4.field1428 = var3.g2();
				var4.field1429 = var3.g2();
				var4.field1430 = var3.g1();
				int var5 = var3.g1();
				int var6 = var3.g1();
				int var7 = var3.g1();
				int var8 = var3.g1();
				int var9 = var3.g1();
				int var10 = var3.g2();
				int var11 = var3.g2();
				int var12 = var3.g2();
				int var13 = var3.g2();
				var4.field1431 = 0;
				int var14 = var4.field1428;
				var4.field1437 = var14;
				int var15 = var14 + var4.field1429;
				var4.field1440 = var15;
				if (var6 == 255) {
					var15 += var4.field1429;
				} else {
					var4.field1440 = -var6 - 1;
				}
				var4.field1442 = var15;
				if (var8 == 1) {
					var15 += var4.field1429;
				} else {
					var4.field1442 = -1;
				}
				var4.field1439 = var15;
				if (var5 == 1) {
					var15 += var4.field1429;
				} else {
					var4.field1439 = -1;
				}
				var4.field1435 = var15;
				if (var9 == 1) {
					var15 += var4.field1428;
				} else {
					var4.field1435 = -1;
				}
				var4.field1441 = var15;
				if (var7 == 1) {
					var15 += var4.field1429;
				} else {
					var4.field1441 = -1;
				}
				var4.field1436 = var15;
				int var16 = var15 + var13;
				var4.field1438 = var16;
				int var17 = var16 + var4.field1429 * 2;
				var4.field1443 = var17;
				int var18 = var17 + var4.field1430 * 6;
				var4.field1432 = var18;
				int var19 = var18 + var10;
				var4.field1433 = var19;
				int var20 = var19 + var11;
				var4.field1434 = var20;
			}
		} catch (RuntimeException var22) {
			signlink.reporterror("5456, " + true + ", " + arg0 + ", " + arg1 + ", " + var22.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("KBEXSZSN.a(II)V")
	public static void unload(int arg0, int arg1) {
		try {
			meta[arg1] = null;
			boolean var4 = false;
		} catch (RuntimeException var3) {
			signlink.reporterror("1814, " + arg0 + ", " + arg1 + ", " + var3.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("KBEXSZSN.c(I)LKBEXSZSN;")
	public static Model load(int arg0) {
		if (meta == null) {
			return null;
		}
		Metadata var1 = meta[arg0];
		if (var1 == null) {
			provider.requestModel(arg0);
			return null;
		} else {
			return new Model((byte) 7, arg0);
		}
	}

	@ObfuscatedName("KBEXSZSN.d(I)Z")
	public static boolean requestDownload(int arg0) {
		if (meta == null) {
			return false;
		}
		Metadata var1 = meta[arg0];
		if (var1 == null) {
			provider.requestModel(arg0);
			return false;
		} else {
			return true;
		}
	}

	@ObfuscatedName("KBEXSZSN.a(III)I")
	public static int getColour(int arg0, int arg1, int arg2) {
		if ((arg2 & 0x2) == 2) {
			if (arg1 < 0) {
				arg1 = 0;
			} else if (arg1 > 127) {
				arg1 = 127;
			}
			return 127 - arg1;
		}
		int var4 = arg1 * (arg0 & 0x7F) >> 7;
		if (var4 < 2) {
			var4 = 2;
		} else if (var4 > 126) {
			var4 = 126;
		}
		return (arg0 & 0xFF80) + var4;
	}

	public Model(int arg0) {
		try {
			if (arg0 >= 0) {
				throw new NullPointerException();
			}
		} catch (RuntimeException var3) {
			signlink.reporterror("82819, " + arg0 + ", " + var3.toString());
			throw new RuntimeException();
		}
	}

	public Model(byte arg0, int arg1) {
		try {
			field995++;
			Metadata var3 = meta[arg1];
			this.numPoints = var3.field1428;
			this.numFaces = var3.field1429;
			this.numT = var3.field1430;
			this.pointX = new int[this.numPoints];
			this.pointY = new int[this.numPoints];
			this.pointZ = new int[this.numPoints];
			this.faceVertexA = new int[this.numFaces];
			this.faceVertexB = new int[this.numFaces];
			this.faceVertexC = new int[this.numFaces];
			this.faceTextureP = new int[this.numT];
			this.faceTextureM = new int[this.numT];
			this.faceTextureN = new int[this.numT];
			if (var3.field1435 >= 0) {
				this.vertexLabel = new int[this.numPoints];
			}
			if (var3.field1439 >= 0) {
				this.faceRenderType = new int[this.numFaces];
			}
			if (var3.field1440 >= 0) {
				this.facePriority = new int[this.numFaces];
			} else {
				this.field1016 = -var3.field1440 - 1;
			}
			if (var3.field1441 >= 0) {
				this.faceAlpha = new int[this.numFaces];
			}
			if (var3.field1442 >= 0) {
				this.faceLabel = new int[this.numFaces];
			}
			this.faceColour = new int[this.numFaces];
			Packet var4 = new Packet(var3.src, -26583);
			var4.pos = var3.field1431;
			Packet var5 = new Packet(var3.src, -26583);
			var5.pos = var3.field1432;
			Packet var6 = new Packet(var3.src, -26583);
			var6.pos = var3.field1433;
			Packet var7 = new Packet(var3.src, -26583);
			var7.pos = var3.field1434;
			Packet var8 = new Packet(var3.src, -26583);
			var8.pos = var3.field1435;
			int var9 = 0;
			int var10 = 0;
			int var11 = 0;
			for (int var12 = 0; var12 < this.numPoints; var12++) {
				int var13 = var4.g1();
				int var14 = 0;
				if ((var13 & 0x1) != 0) {
					var14 = var5.gsmarts();
				}
				int var15 = 0;
				if ((var13 & 0x2) != 0) {
					var15 = var6.gsmarts();
				}
				int var16 = 0;
				if ((var13 & 0x4) != 0) {
					var16 = var7.gsmarts();
				}
				this.pointX[var12] = var9 + var14;
				this.pointY[var12] = var10 + var15;
				this.pointZ[var12] = var11 + var16;
				var9 = this.pointX[var12];
				var10 = this.pointY[var12];
				var11 = this.pointZ[var12];
				if (this.vertexLabel != null) {
					this.vertexLabel[var12] = var8.g1();
				}
			}
			var4.pos = var3.field1438;
			var5.pos = var3.field1439;
			var6.pos = var3.field1440;
			var7.pos = var3.field1441;
			var8.pos = var3.field1442;
			for (int var17 = 0; var17 < this.numFaces; var17++) {
				this.faceColour[var17] = var4.g2();
				if (this.faceRenderType != null) {
					this.faceRenderType[var17] = var5.g1();
				}
				if (this.facePriority != null) {
					this.facePriority[var17] = var6.g1();
				}
				if (this.faceAlpha != null) {
					this.faceAlpha[var17] = var7.g1();
				}
				if (this.faceLabel != null) {
					this.faceLabel[var17] = var8.g1();
				}
			}
			var4.pos = var3.field1436;
			var5.pos = var3.field1437;
			int var18 = 0;
			int var19 = 0;
			int var20 = 0;
			int var21 = 0;
			for (int var22 = 0; var22 < this.numFaces; var22++) {
				int var23 = var5.g1();
				if (var23 == 1) {
					var18 = var4.gsmarts() + var21;
					var19 = var4.gsmarts() + var18;
					var20 = var4.gsmarts() + var19;
					var21 = var20;
					this.faceVertexA[var22] = var18;
					this.faceVertexB[var22] = var19;
					this.faceVertexC[var22] = var20;
				}
				if (var23 == 2) {
					var18 = var18;
					var19 = var20;
					var20 = var4.gsmarts() + var21;
					var21 = var20;
					this.faceVertexA[var22] = var18;
					this.faceVertexB[var22] = var19;
					this.faceVertexC[var22] = var20;
				}
				if (var23 == 3) {
					var18 = var20;
					var19 = var19;
					var20 = var4.gsmarts() + var21;
					var21 = var20;
					this.faceVertexA[var22] = var18;
					this.faceVertexB[var22] = var19;
					this.faceVertexC[var22] = var20;
				}
				if (var23 == 4) {
					int var24 = var18;
					var18 = var19;
					var19 = var24;
					var20 = var4.gsmarts() + var21;
					var21 = var20;
					this.faceVertexA[var22] = var18;
					this.faceVertexB[var22] = var24;
					this.faceVertexC[var22] = var20;
				}
			}
			var4.pos = var3.field1443;
			for (int var25 = 0; var25 < this.numT; var25++) {
				this.faceTextureP[var25] = var4.g2();
				this.faceTextureM[var25] = var4.g2();
				this.faceTextureN[var25] = var4.g2();
			}
		} catch (RuntimeException var27) {
			signlink.reporterror("54453, " + 7 + ", " + arg1 + ", " + var27.toString());
			throw new RuntimeException();
		}
	}

	public Model(int arg0, Model[] arg1, int arg2) {
		try {
			field995++;
			boolean var4 = false;
			boolean var5 = false;
			boolean var6 = false;
			boolean var7 = false;
			this.numPoints = 0;
			this.numFaces = 0;
			this.numT = 0;
			this.field1016 = -1;
			for (int var8 = 0; var8 < arg0; var8++) {
				Model var9 = arg1[var8];
				if (var9 != null) {
					this.numPoints += var9.numPoints;
					this.numFaces += var9.numFaces;
					this.numT += var9.numT;
					var4 |= var9.faceRenderType != null;
					if (var9.facePriority == null) {
						if (this.field1016 == -1) {
							this.field1016 = var9.field1016;
						}
						if (this.field1016 != var9.field1016) {
							var5 = true;
						}
					} else {
						var5 = true;
					}
					var6 |= var9.faceAlpha != null;
					var7 |= var9.faceLabel != null;
				}
			}
			this.pointX = new int[this.numPoints];
			this.pointY = new int[this.numPoints];
			this.pointZ = new int[this.numPoints];
			this.vertexLabel = new int[this.numPoints];
			this.faceVertexA = new int[this.numFaces];
			this.faceVertexB = new int[this.numFaces];
			this.faceVertexC = new int[this.numFaces];
			this.faceTextureP = new int[this.numT];
			this.faceTextureM = new int[this.numT];
			this.faceTextureN = new int[this.numT];
			if (var4) {
				this.faceRenderType = new int[this.numFaces];
			}
			if (var5) {
				this.facePriority = new int[this.numFaces];
			}
			if (var6) {
				this.faceAlpha = new int[this.numFaces];
			}
			if (var7) {
				this.faceLabel = new int[this.numFaces];
			}
			this.faceColour = new int[this.numFaces];
			this.numPoints = 0;
			this.numFaces = 0;
			this.numT = 0;
			int var10 = 0;
			for (int var11 = 0; var11 < arg0; var11++) {
				Model var12 = arg1[var11];
				if (var12 != null) {
					for (int var13 = 0; var13 < var12.numFaces; var13++) {
						if (var4) {
							if (var12.faceRenderType == null) {
								this.faceRenderType[this.numFaces] = 0;
							} else {
								int var14 = var12.faceRenderType[var13];
								if ((var14 & 0x2) == 2) {
									var14 += var10 << 2;
								}
								this.faceRenderType[this.numFaces] = var14;
							}
						}
						if (var5) {
							if (var12.facePriority == null) {
								this.facePriority[this.numFaces] = var12.field1016;
							} else {
								this.facePriority[this.numFaces] = var12.facePriority[var13];
							}
						}
						if (var6) {
							if (var12.faceAlpha == null) {
								this.faceAlpha[this.numFaces] = 0;
							} else {
								this.faceAlpha[this.numFaces] = var12.faceAlpha[var13];
							}
						}
						if (var7 && var12.faceLabel != null) {
							this.faceLabel[this.numFaces] = var12.faceLabel[var13];
						}
						this.faceColour[this.numFaces] = var12.faceColour[var13];
						this.faceVertexA[this.numFaces] = this.addPoint(var12, var12.faceVertexA[var13]);
						this.faceVertexB[this.numFaces] = this.addPoint(var12, var12.faceVertexB[var13]);
						this.faceVertexC[this.numFaces] = this.addPoint(var12, var12.faceVertexC[var13]);
						this.numFaces++;
					}
					for (int var15 = 0; var15 < var12.numT; var15++) {
						this.faceTextureP[this.numT] = this.addPoint(var12, var12.faceTextureP[var15]);
						this.faceTextureM[this.numT] = this.addPoint(var12, var12.faceTextureM[var15]);
						this.faceTextureN[this.numT] = this.addPoint(var12, var12.faceTextureN[var15]);
						this.numT++;
					}
					var10 += var12.numT;
				}
			}
		} catch (RuntimeException var17) {
			signlink.reporterror("7352, " + arg0 + ", " + arg1 + ", " + 5 + ", " + var17.toString());
			throw new RuntimeException();
		}
	}

	public Model(Model[] arg0, int arg1, boolean arg2, boolean arg3) {
		try {
			field995++;
			boolean var5 = false;
			boolean var6 = false;
			boolean var7 = false;
			boolean var8 = false;
			this.numPoints = 0;
			this.numFaces = 0;
			this.numT = 0;
			this.field1016 = -1;
			for (int var9 = 0; var9 < 2; var9++) {
				Model var10 = arg0[var9];
				if (var10 != null) {
					this.numPoints += var10.numPoints;
					this.numFaces += var10.numFaces;
					this.numT += var10.numT;
					var5 |= var10.faceRenderType != null;
					if (var10.facePriority == null) {
						if (this.field1016 == -1) {
							this.field1016 = var10.field1016;
						}
						if (this.field1016 != var10.field1016) {
							var6 = true;
						}
					} else {
						var6 = true;
					}
					var7 |= var10.faceAlpha != null;
					var8 |= var10.faceColour != null;
				}
			}
			this.pointX = new int[this.numPoints];
			this.pointY = new int[this.numPoints];
			this.pointZ = new int[this.numPoints];
			this.faceVertexA = new int[this.numFaces];
			this.faceVertexB = new int[this.numFaces];
			this.faceVertexC = new int[this.numFaces];
			this.faceColourA = new int[this.numFaces];
			this.faceColorB = new int[this.numFaces];
			this.faceColourC = new int[this.numFaces];
			this.faceTextureP = new int[this.numT];
			this.faceTextureM = new int[this.numT];
			this.faceTextureN = new int[this.numT];
			if (var5) {
				this.faceRenderType = new int[this.numFaces];
			}
			if (var6) {
				this.facePriority = new int[this.numFaces];
			}
			if (var7) {
				this.faceAlpha = new int[this.numFaces];
			}
			if (var8) {
				this.faceColour = new int[this.numFaces];
			}
			this.numPoints = 0;
			this.numFaces = 0;
			this.numT = 0;
			int var11 = 0;
			for (int var12 = 0; var12 < 2; var12++) {
				Model var13 = arg0[var12];
				if (var13 != null) {
					int var14 = this.numPoints;
					for (int var15 = 0; var15 < var13.numPoints; var15++) {
						this.pointX[this.numPoints] = var13.pointX[var15];
						this.pointY[this.numPoints] = var13.pointY[var15];
						this.pointZ[this.numPoints] = var13.pointZ[var15];
						this.numPoints++;
					}
					for (int var16 = 0; var16 < var13.numFaces; var16++) {
						this.faceVertexA[this.numFaces] = var13.faceVertexA[var16] + var14;
						this.faceVertexB[this.numFaces] = var13.faceVertexB[var16] + var14;
						this.faceVertexC[this.numFaces] = var13.faceVertexC[var16] + var14;
						this.faceColourA[this.numFaces] = var13.faceColourA[var16];
						this.faceColorB[this.numFaces] = var13.faceColorB[var16];
						this.faceColourC[this.numFaces] = var13.faceColourC[var16];
						if (var5) {
							if (var13.faceRenderType == null) {
								this.faceRenderType[this.numFaces] = 0;
							} else {
								int var17 = var13.faceRenderType[var16];
								if ((var17 & 0x2) == 2) {
									var17 += var11 << 2;
								}
								this.faceRenderType[this.numFaces] = var17;
							}
						}
						if (var6) {
							if (var13.facePriority == null) {
								this.facePriority[this.numFaces] = var13.field1016;
							} else {
								this.facePriority[this.numFaces] = var13.facePriority[var16];
							}
						}
						if (var7) {
							if (var13.faceAlpha == null) {
								this.faceAlpha[this.numFaces] = 0;
							} else {
								this.faceAlpha[this.numFaces] = var13.faceAlpha[var16];
							}
						}
						if (var8 && var13.faceColour != null) {
							this.faceColour[this.numFaces] = var13.faceColour[var16];
						}
						this.numFaces++;
					}
					for (int var18 = 0; var18 < var13.numT; var18++) {
						this.faceTextureP[this.numT] = var13.faceTextureP[var18] + var14;
						this.faceTextureM[this.numT] = var13.faceTextureM[var18] + var14;
						this.faceTextureN[this.numT] = var13.faceTextureN[var18] + var14;
						this.numT++;
					}
					var11 += var13.numT;
				}
			}
			this.calcBoundingCylinder();
		} catch (RuntimeException var20) {
			signlink.reporterror("24018, " + arg0 + ", " + 2 + ", " + true + ", " + false + ", " + var20.toString());
			throw new RuntimeException();
		}
	}

	public Model(boolean arg0, int arg1, boolean arg2, Model arg3, boolean arg4) {
		try {
			field995++;
			this.numPoints = arg3.numPoints;
			this.numFaces = arg3.numFaces;
			this.numT = arg3.numT;
			if (arg0) {
				this.pointX = arg3.pointX;
				this.pointY = arg3.pointY;
				this.pointZ = arg3.pointZ;
			} else {
				this.pointX = new int[this.numPoints];
				this.pointY = new int[this.numPoints];
				this.pointZ = new int[this.numPoints];
				for (int var6 = 0; var6 < this.numPoints; var6++) {
					this.pointX[var6] = arg3.pointX[var6];
					this.pointY[var6] = arg3.pointY[var6];
					this.pointZ[var6] = arg3.pointZ[var6];
				}
			}
			if (arg4) {
				this.faceColour = arg3.faceColour;
			} else {
				this.faceColour = new int[this.numFaces];
				for (int var7 = 0; var7 < this.numFaces; var7++) {
					this.faceColour[var7] = arg3.faceColour[var7];
				}
			}
			if (arg2) {
				this.faceAlpha = arg3.faceAlpha;
			} else {
				this.faceAlpha = new int[this.numFaces];
				if (arg3.faceAlpha == null) {
					for (int var8 = 0; var8 < this.numFaces; var8++) {
						this.faceAlpha[var8] = 0;
					}
				} else {
					for (int var9 = 0; var9 < this.numFaces; var9++) {
						this.faceAlpha[var9] = arg3.faceAlpha[var9];
					}
				}
			}
			this.vertexLabel = arg3.vertexLabel;
			this.faceLabel = arg3.faceLabel;
			this.faceRenderType = arg3.faceRenderType;
			this.faceVertexA = arg3.faceVertexA;
			this.faceVertexB = arg3.faceVertexB;
			this.faceVertexC = arg3.faceVertexC;
			this.facePriority = arg3.facePriority;
			this.field1016 = arg3.field1016;
			this.faceTextureP = arg3.faceTextureP;
			this.faceTextureM = arg3.faceTextureM;
			this.faceTextureN = arg3.faceTextureN;
		} catch (RuntimeException var11) {
			signlink.reporterror("21522, " + arg0 + ", " + 777 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + var11.toString());
			throw new RuntimeException();
		}
	}

	public Model(Model arg0, boolean arg1, boolean arg2, boolean arg3) {
		try {
			field995++;
			this.numPoints = arg0.numPoints;
			this.numFaces = arg0.numFaces;
			this.numT = arg0.numT;
			if (arg1) {
				this.pointY = new int[this.numPoints];
				for (int var5 = 0; var5 < this.numPoints; var5++) {
					this.pointY[var5] = arg0.pointY[var5];
				}
			} else {
				this.pointY = arg0.pointY;
			}
			if (arg2) {
				this.faceColourA = new int[this.numFaces];
				this.faceColorB = new int[this.numFaces];
				this.faceColourC = new int[this.numFaces];
				for (int var6 = 0; var6 < this.numFaces; var6++) {
					this.faceColourA[var6] = arg0.faceColourA[var6];
					this.faceColorB[var6] = arg0.faceColorB[var6];
					this.faceColourC[var6] = arg0.faceColourC[var6];
				}
				this.faceRenderType = new int[this.numFaces];
				if (arg0.faceRenderType == null) {
					for (int var7 = 0; var7 < this.numFaces; var7++) {
						this.faceRenderType[var7] = 0;
					}
				} else {
					for (int var8 = 0; var8 < this.numFaces; var8++) {
						this.faceRenderType[var8] = arg0.faceRenderType[var8];
					}
				}
				super.pointNormal = new PointNormal[this.numPoints];
				for (int var9 = 0; var9 < this.numPoints; var9++) {
					PointNormal var10 = super.pointNormal[var9] = new PointNormal();
					PointNormal var11 = arg0.pointNormal[var9];
					var10.field1380 = var11.field1380;
					var10.field1381 = var11.field1381;
					var10.field1382 = var11.field1382;
					var10.field1383 = var11.field1383;
				}
				this.sharedPointNormal = arg0.sharedPointNormal;
			} else {
				this.faceColourA = arg0.faceColourA;
				this.faceColorB = arg0.faceColorB;
				this.faceColourC = arg0.faceColourC;
				this.faceRenderType = arg0.faceRenderType;
			}
			this.pointX = arg0.pointX;
			this.pointZ = arg0.pointZ;
			this.faceColour = arg0.faceColour;
			this.faceAlpha = arg0.faceAlpha;
			this.facePriority = arg0.facePriority;
			this.field1016 = arg0.field1016;
			this.faceVertexA = arg0.faceVertexA;
			this.faceVertexB = arg0.faceVertexB;
			this.faceVertexC = arg0.faceVertexC;
			this.faceTextureP = arg0.faceTextureP;
			this.faceTextureM = arg0.faceTextureM;
			this.faceTextureN = arg0.faceTextureN;
			super.minY = arg0.minY;
			this.maxY = arg0.maxY;
			this.radius = arg0.radius;
			this.minDepth = arg0.minDepth;
			this.maxDepth = arg0.maxDepth;
			this.field1022 = arg0.field1022;
			this.field1023 = arg0.field1023;
			this.field1021 = arg0.field1021;
		} catch (RuntimeException var13) {
			signlink.reporterror("18482, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + false + ", " + var13.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("KBEXSZSN.a(ZLKBEXSZSN;Z)V")
	public void set(Model arg0, boolean arg1) {
		try {
			this.numPoints = arg0.numPoints;
			this.numFaces = arg0.numFaces;
			this.numT = arg0.numT;
			if (tmpVertexX.length < this.numPoints) {
				tmpVertexX = new int[this.numPoints + 100];
				tmpVertexY = new int[this.numPoints + 100];
				tempVertexZ = new int[this.numPoints + 100];
			}
			this.pointX = tmpVertexX;
			this.pointY = tmpVertexY;
			this.pointZ = tempVertexZ;
			for (int var3 = 0; var3 < this.numPoints; var3++) {
				this.pointX[var3] = arg0.pointX[var3];
				this.pointY[var3] = arg0.pointY[var3];
				this.pointZ[var3] = arg0.pointZ[var3];
			}
			if (arg1) {
				this.faceAlpha = arg0.faceAlpha;
			} else {
				if (field1000.length < this.numFaces) {
					field1000 = new int[this.numFaces + 100];
				}
				this.faceAlpha = field1000;
				if (arg0.faceAlpha == null) {
					for (int var4 = 0; var4 < this.numFaces; var4++) {
						this.faceAlpha[var4] = 0;
					}
				} else {
					for (int var5 = 0; var5 < this.numFaces; var5++) {
						this.faceAlpha[var5] = arg0.faceAlpha[var5];
					}
				}
			}
			this.faceRenderType = arg0.faceRenderType;
			this.faceColour = arg0.faceColour;
			this.facePriority = arg0.facePriority;
			this.field1016 = arg0.field1016;
			this.labelFaces = arg0.labelFaces;
			this.labelVertices = arg0.labelVertices;
			this.faceVertexA = arg0.faceVertexA;
			this.faceVertexB = arg0.faceVertexB;
			this.faceVertexC = arg0.faceVertexC;
			this.faceColourA = arg0.faceColourA;
			this.faceColorB = arg0.faceColorB;
			this.faceColourC = arg0.faceColourC;
			this.faceTextureP = arg0.faceTextureP;
			this.faceTextureM = arg0.faceTextureM;
			this.faceTextureN = arg0.faceTextureN;
		} catch (RuntimeException var7) {
			signlink.reporterror("11420, " + true + ", " + arg0 + ", " + arg1 + ", " + var7.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("KBEXSZSN.a(LKBEXSZSN;I)I")
	public int addPoint(Model arg0, int arg1) {
		int var3 = -1;
		int var4 = arg0.pointX[arg1];
		int var5 = arg0.pointY[arg1];
		int var6 = arg0.pointZ[arg1];
		for (int var7 = 0; var7 < this.numPoints; var7++) {
			if (var4 == this.pointX[var7] && var5 == this.pointY[var7] && var6 == this.pointZ[var7]) {
				var3 = var7;
				break;
			}
		}
		if (var3 == -1) {
			this.pointX[this.numPoints] = var4;
			this.pointY[this.numPoints] = var5;
			this.pointZ[this.numPoints] = var6;
			if (arg0.vertexLabel != null) {
				this.vertexLabel[this.numPoints] = arg0.vertexLabel[arg1];
			}
			var3 = this.numPoints++;
		}
		return var3;
	}

	@ObfuscatedName("KBEXSZSN.e(I)V")
	public void calcBoundingCylinder() {
		try {
			super.minY = 0;
			this.radius = 0;
			this.maxY = 0;
			for (int var1 = 0; var1 < this.numPoints; var1++) {
				int var2 = this.pointX[var1];
				int var3 = this.pointY[var1];
				int var4 = this.pointZ[var1];
				if (-var3 > super.minY) {
					super.minY = -var3;
				}
				if (var3 > this.maxY) {
					this.maxY = var3;
				}
				int var5 = var2 * var2 + var4 * var4;
				if (var5 > this.radius) {
					this.radius = var5;
				}
			}
			this.radius = (int) (Math.sqrt((double) this.radius) + 0.99D);
			this.minDepth = (int) (Math.sqrt((double) (this.radius * this.radius + super.minY * super.minY)) + 0.99D);
			this.maxDepth = this.minDepth + (int) (Math.sqrt((double) (this.radius * this.radius + this.maxY * this.maxY)) + 0.99D);
		} catch (RuntimeException var7) {
			signlink.reporterror("19497, " + ", " + var7.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("KBEXSZSN.a(Z)V")
	public void recalcBoundingCylinder() {
		try {
			super.minY = 0;
			this.maxY = 0;
			for (int var1 = 0; var1 < this.numPoints; var1++) {
				int var2 = this.pointY[var1];
				if (-var2 > super.minY) {
					super.minY = -var2;
				}
				if (var2 > this.maxY) {
					this.maxY = var2;
				}
			}
			this.minDepth = (int) (Math.sqrt((double) (this.radius * this.radius + super.minY * super.minY)) + 0.99D);
			this.maxDepth = this.minDepth + (int) (Math.sqrt((double) (this.radius * this.radius + this.maxY * this.maxY)) + 0.99D);
		} catch (RuntimeException var4) {
			signlink.reporterror("89908, " + false + ", " + var4.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("KBEXSZSN.a(B)V")
	public void calcBoundingCube() {
		try {
			super.minY = 0;
			this.radius = 0;
			this.maxY = 0;
			int var1 = 32767;
			int var2 = -32767;
			int var3 = -32767;
			int var4 = 32767;
			for (int var5 = 0; var5 < this.numPoints; var5++) {
				int var6 = this.pointX[var5];
				int var7 = this.pointY[var5];
				int var8 = this.pointZ[var5];
				if (var6 < var1) {
					var1 = var6;
				}
				if (var6 > var2) {
					var2 = var6;
				}
				if (var8 < var4) {
					var4 = var8;
				}
				if (var8 > var3) {
					var3 = var8;
				}
				if (-var7 > super.minY) {
					super.minY = -var7;
				}
				if (var7 > this.maxY) {
					this.maxY = var7;
				}
				int var9 = var6 * var6 + var8 * var8;
				if (var9 > this.radius) {
					this.radius = var9;
				}
			}
			this.radius = (int) Math.sqrt((double) this.radius);
			this.minDepth = (int) Math.sqrt((double) (this.radius * this.radius + super.minY * super.minY));
			this.maxDepth = this.minDepth + (int) Math.sqrt((double) (this.radius * this.radius + this.maxY * this.maxY));
			this.field1022 = (var1 << 16) + (var2 & 0xFFFF);
			this.field1023 = (var3 << 16) + (var4 & 0xFFFF);
		} catch (RuntimeException var11) {
			signlink.reporterror("57024, " + 106 + ", " + var11.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("KBEXSZSN.f(I)V")
	public void prepareAnim(int arg0) {
		try {
			boolean var18 = false;
			int var10002;
			if (this.vertexLabel != null) {
				int[] var2 = new int[256];
				int var3 = 0;
				for (int var4 = 0; var4 < this.numPoints; var4++) {
					int var5 = this.vertexLabel[var4];
					var10002 = var2[var5]++;
					if (var5 > var3) {
						var3 = var5;
					}
				}
				this.labelVertices = new int[var3 + 1][];
				for (int var6 = 0; var6 <= var3; var6++) {
					this.labelVertices[var6] = new int[var2[var6]];
					var2[var6] = 0;
				}
				int var7 = 0;
				while (var7 < this.numPoints) {
					int var8 = this.vertexLabel[var7];
					this.labelVertices[var8][var2[var8]++] = var7++;
				}
				this.vertexLabel = null;
			}
			if (this.faceLabel != null) {
				int[] var9 = new int[256];
				int var10 = 0;
				for (int var11 = 0; var11 < this.numFaces; var11++) {
					int var12 = this.faceLabel[var11];
					var10002 = var9[var12]++;
					if (var12 > var10) {
						var10 = var12;
					}
				}
				this.labelFaces = new int[var10 + 1][];
				for (int var13 = 0; var13 <= var10; var13++) {
					this.labelFaces[var13] = new int[var9[var13]];
					var9[var13] = 0;
				}
				int var14 = 0;
				while (var14 < this.numFaces) {
					int var15 = this.faceLabel[var14];
					this.labelFaces[var15][var9[var15]++] = var14++;
				}
				this.faceLabel = null;
			}
		} catch (RuntimeException var17) {
			signlink.reporterror("14287, " + arg0 + ", " + var17.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("KBEXSZSN.b(II)V")
	public void animate(int arg0) {
		try {
			if (this.labelVertices != null && arg0 != -1) {
				AnimFrame var2 = AnimFrame.get(arg0);
				if (var2 != null) {
					AnimBase var3 = var2.base;
					oX = 0;
					oY = 0;
					oZ = 0;
					for (int var4 = 0; var4 < var2.field865; var4++) {
						int var5 = var2.ti[var4];
						this.animate2(var3.type[var5], var3.labels[var5], var2.field867[var4], var2.field868[var4], var2.field869[var4]);
					}
				}
			}
		} catch (RuntimeException var7) {
			signlink.reporterror("9810, " + -486 + ", " + arg0 + ", " + var7.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("KBEXSZSN.a(I[III)V")
	public void maskAnimate(int[] arg0, int arg1, int arg2) {
		try {
			if (arg2 != -1) {
				if (arg0 == null || arg1 == -1) {
					this.animate(arg2);
				} else {
					AnimFrame var4 = AnimFrame.get(arg2);
					if (var4 != null) {
						AnimFrame var5 = AnimFrame.get(arg1);
						if (var5 == null) {
							this.animate(arg2);
						} else {
							AnimBase var6 = var4.base;
							oX = 0;
							oY = 0;
							oZ = 0;
							byte var7 = 0;
							int var17 = var7 + 1;
							int var8 = arg0[0];
							for (int var9 = 0; var9 < var4.field865; var9++) {
								int var10 = var4.ti[var9];
								while (var10 > var8) {
									var8 = arg0[var17++];
								}
								if (var10 != var8 || var6.type[var10] == 0) {
									this.animate2(var6.type[var10], var6.labels[var10], var4.field867[var9], var4.field868[var9], var4.field869[var9]);
								}
							}
							oX = 0;
							oY = 0;
							oZ = 0;
							byte var11 = 0;
							int var18 = var11 + 1;
							int var12 = arg0[0];
							for (int var13 = 0; var13 < var5.field865; var13++) {
								int var14 = var5.ti[var13];
								while (var14 > var12) {
									var12 = arg0[var18++];
								}
								if (var14 == var12 || var6.type[var14] == 0) {
									this.animate2(var6.type[var14], var6.labels[var14], var5.field867[var13], var5.field868[var13], var5.field869[var13]);
								}
							}
						}
					}
				}
			}
		} catch (RuntimeException var16) {
			signlink.reporterror("25374, " + 18849 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + var16.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("KBEXSZSN.a(I[IIII)V")
	public void animate2(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
		int var6 = arg1.length;
		if (arg0 == 0) {
			int var7 = 0;
			oX = 0;
			oY = 0;
			oZ = 0;
			for (int var8 = 0; var8 < var6; var8++) {
				int var9 = arg1[var8];
				if (var9 < this.labelVertices.length) {
					int[] var10 = this.labelVertices[var9];
					for (int var11 = 0; var11 < var10.length; var11++) {
						int var12 = var10[var11];
						oX += this.pointX[var12];
						oY += this.pointY[var12];
						oZ += this.pointZ[var12];
						var7++;
					}
				}
			}
			if (var7 > 0) {
				oX = oX / var7 + arg2;
				oY = oY / var7 + arg3;
				oZ = oZ / var7 + arg4;
			} else {
				oX = arg2;
				oY = arg3;
				oZ = arg4;
			}
		} else if (arg0 == 1) {
			for (int var13 = 0; var13 < var6; var13++) {
				int var14 = arg1[var13];
				if (var14 < this.labelVertices.length) {
					int[] var15 = this.labelVertices[var14];
					for (int var16 = 0; var16 < var15.length; var16++) {
						int var17 = var15[var16];
						this.pointX[var17] += arg2;
						this.pointY[var17] += arg3;
						this.pointZ[var17] += arg4;
					}
				}
			}
		} else if (arg0 == 2) {
			for (int var18 = 0; var18 < var6; var18++) {
				int var19 = arg1[var18];
				if (var19 < this.labelVertices.length) {
					int[] var20 = this.labelVertices[var19];
					for (int var21 = 0; var21 < var20.length; var21++) {
						int var22 = var20[var21];
						this.pointX[var22] -= oX;
						this.pointY[var22] -= oY;
						this.pointZ[var22] -= oZ;
						int var23 = (arg2 & 0xFF) * 8;
						int var24 = (arg3 & 0xFF) * 8;
						int var25 = (arg4 & 0xFF) * 8;
						if (var25 != 0) {
							int var26 = sinTable[var25];
							int var27 = cosTable[var25];
							int var28 = this.pointY[var22] * var26 + this.pointX[var22] * var27 >> 16;
							this.pointY[var22] = this.pointY[var22] * var27 - this.pointX[var22] * var26 >> 16;
							this.pointX[var22] = var28;
						}
						if (var23 != 0) {
							int var29 = sinTable[var23];
							int var30 = cosTable[var23];
							int var31 = this.pointY[var22] * var30 - this.pointZ[var22] * var29 >> 16;
							this.pointZ[var22] = this.pointY[var22] * var29 + this.pointZ[var22] * var30 >> 16;
							this.pointY[var22] = var31;
						}
						if (var24 != 0) {
							int var32 = sinTable[var24];
							int var33 = cosTable[var24];
							int var34 = this.pointZ[var22] * var32 + this.pointX[var22] * var33 >> 16;
							this.pointZ[var22] = this.pointZ[var22] * var33 - this.pointX[var22] * var32 >> 16;
							this.pointX[var22] = var34;
						}
						this.pointX[var22] += oX;
						this.pointY[var22] += oY;
						this.pointZ[var22] += oZ;
					}
				}
			}
		} else if (arg0 == 3) {
			for (int var35 = 0; var35 < var6; var35++) {
				int var36 = arg1[var35];
				if (var36 < this.labelVertices.length) {
					int[] var37 = this.labelVertices[var36];
					for (int var38 = 0; var38 < var37.length; var38++) {
						int var39 = var37[var38];
						this.pointX[var39] -= oX;
						this.pointY[var39] -= oY;
						this.pointZ[var39] -= oZ;
						this.pointX[var39] = this.pointX[var39] * arg2 / 128;
						this.pointY[var39] = this.pointY[var39] * arg3 / 128;
						this.pointZ[var39] = this.pointZ[var39] * arg4 / 128;
						this.pointX[var39] += oX;
						this.pointY[var39] += oY;
						this.pointZ[var39] += oZ;
					}
				}
			}
		} else if (arg0 == 5 && (this.labelFaces != null && this.faceAlpha != null)) {
			for (int var40 = 0; var40 < var6; var40++) {
				int var41 = arg1[var40];
				if (var41 < this.labelFaces.length) {
					int[] var42 = this.labelFaces[var41];
					for (int var43 = 0; var43 < var42.length; var43++) {
						int var44 = var42[var43];
						this.faceAlpha[var44] += arg2 * 8;
						if (this.faceAlpha[var44] < 0) {
							this.faceAlpha[var44] = 0;
						}
						if (this.faceAlpha[var44] > 255) {
							this.faceAlpha[var44] = 255;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("KBEXSZSN.g(I)V")
	public void rotate90() {
		try {
			for (int var1 = 0; var1 < this.numPoints; var1++) {
				int var2 = this.pointX[var1];
				this.pointX[var1] = this.pointZ[var1];
				this.pointZ[var1] = -var2;
			}
		} catch (RuntimeException var4) {
			signlink.reporterror("69727, " + 25816 + ", " + var4.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("KBEXSZSN.c(II)V")
	public void rotateXAxis(int arg0) {
		try {
			int var2 = sinTable[arg0];
			int var3 = cosTable[arg0];
			for (int var4 = 0; var4 < this.numPoints; var4++) {
				int var5 = this.pointY[var4] * var3 - this.pointZ[var4] * var2 >> 16;
				this.pointZ[var4] = this.pointY[var4] * var2 + this.pointZ[var4] * var3 >> 16;
				this.pointY[var4] = var5;
			}
		} catch (RuntimeException var7) {
			signlink.reporterror("91124, " + arg0 + ", " + -336 + ", " + var7.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("KBEXSZSN.a(IIII)V")
	public void translate(int arg0, int arg1, int arg2) {
		try {
			for (int var4 = 0; var4 < this.numPoints; var4++) {
				this.pointX[var4] += arg1;
				this.pointY[var4] += arg0;
				this.pointZ[var4] += arg2;
			}
			if (this.field990 > 8 || this.field990 < 8) {
				;
			}
		} catch (RuntimeException var6) {
			signlink.reporterror("74262, " + arg0 + ", " + arg1 + ", " + 8 + ", " + arg2 + ", " + var6.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("KBEXSZSN.d(II)V")
	public void recolour(int arg0, int arg1) {
		for (int var3 = 0; var3 < this.numFaces; var3++) {
			if (this.faceColour[var3] == arg0) {
				this.faceColour[var3] = arg1;
			}
		}
	}

	@ObfuscatedName("KBEXSZSN.h(I)V")
	public void mirror(int arg0) {
		try {
			boolean var7 = false;
			for (int var2 = 0; var2 < this.numPoints; var2++) {
				this.pointZ[var2] = -this.pointZ[var2];
			}
			for (int var3 = 0; var3 < this.numFaces; var3++) {
				int var4 = this.faceVertexA[var3];
				this.faceVertexA[var3] = this.faceVertexC[var3];
				this.faceVertexC[var3] = var4;
			}
		} catch (RuntimeException var6) {
			signlink.reporterror("68102, " + arg0 + ", " + var6.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("KBEXSZSN.a(BIII)V")
	public void resize(byte arg0, int arg1, int arg2, int arg3) {
		try {
			for (int var5 = 0; var5 < this.numPoints; var5++) {
				this.pointX[var5] = this.pointX[var5] * arg3 / 128;
				this.pointY[var5] = this.pointY[var5] * arg2 / 128;
				this.pointZ[var5] = this.pointZ[var5] * arg1 / 128;
			}
			if (arg0 == this.field991) {
				;
			}
		} catch (RuntimeException var7) {
			signlink.reporterror("92113, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + var7.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("KBEXSZSN.a(IIIIIZ)V")
	public void calculateNormals(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
		int var7 = (int) Math.sqrt((double) (arg2 * arg2 + arg3 * arg3 + arg4 * arg4));
		int var8 = arg1 * var7 >> 8;
		if (this.faceColourA == null) {
			this.faceColourA = new int[this.numFaces];
			this.faceColorB = new int[this.numFaces];
			this.faceColourC = new int[this.numFaces];
		}
		if (super.pointNormal == null) {
			super.pointNormal = new PointNormal[this.numPoints];
			for (int var9 = 0; var9 < this.numPoints; var9++) {
				super.pointNormal[var9] = new PointNormal();
			}
		}
		for (int var10 = 0; var10 < this.numFaces; var10++) {
			int var11 = this.faceVertexA[var10];
			int var12 = this.faceVertexB[var10];
			int var13 = this.faceVertexC[var10];
			int var14 = this.pointX[var12] - this.pointX[var11];
			int var15 = this.pointY[var12] - this.pointY[var11];
			int var16 = this.pointZ[var12] - this.pointZ[var11];
			int var17 = this.pointX[var13] - this.pointX[var11];
			int var18 = this.pointY[var13] - this.pointY[var11];
			int var19 = this.pointZ[var13] - this.pointZ[var11];
			int var20 = var15 * var19 - var18 * var16;
			int var21 = var16 * var17 - var19 * var14;
			int var22;
			for (var22 = var14 * var18 - var17 * var15; var20 > 8192 || var21 > 8192 || var22 > 8192 || var20 < -8192 || var21 < -8192 || var22 < -8192; var22 >>= 0x1) {
				var20 >>= 0x1;
				var21 >>= 0x1;
			}
			int var23 = (int) Math.sqrt((double) (var20 * var20 + var21 * var21 + var22 * var22));
			if (var23 <= 0) {
				var23 = 1;
			}
			int var24 = var20 * 256 / var23;
			int var25 = var21 * 256 / var23;
			int var26 = var22 * 256 / var23;
			if (this.faceRenderType == null || (this.faceRenderType[var10] & 0x1) == 0) {
				PointNormal var27 = super.pointNormal[var11];
				var27.field1380 += var24;
				var27.field1381 += var25;
				var27.field1382 += var26;
				var27.field1383++;
				PointNormal var28 = super.pointNormal[var12];
				var28.field1380 += var24;
				var28.field1381 += var25;
				var28.field1382 += var26;
				var28.field1383++;
				PointNormal var29 = super.pointNormal[var13];
				var29.field1380 += var24;
				var29.field1381 += var25;
				var29.field1382 += var26;
				var29.field1383++;
			} else {
				int var30 = arg0 + (arg2 * var24 + arg3 * var25 + arg4 * var26) / (var8 + var8 / 2);
				this.faceColourA[var10] = getColour(this.faceColour[var10], var30, this.faceRenderType[var10]);
			}
		}
		if (arg5) {
			this.light(arg0, var8, arg2, arg3, arg4);
		} else {
			this.sharedPointNormal = new PointNormal[this.numPoints];
			for (int var31 = 0; var31 < this.numPoints; var31++) {
				PointNormal var32 = super.pointNormal[var31];
				PointNormal var33 = this.sharedPointNormal[var31] = new PointNormal();
				var33.field1380 = var32.field1380;
				var33.field1381 = var32.field1381;
				var33.field1382 = var32.field1382;
				var33.field1383 = var32.field1383;
			}
			this.field1021 = (arg0 << 16) + (var8 & 0xFFFF);
		}
		if (arg5) {
			this.calcBoundingCylinder();
		} else {
			this.calcBoundingCube();
		}
	}

	@ObfuscatedName("KBEXSZSN.a(IIIB)V")
	public void method357(byte arg0) {
		try {
			if (arg0 != 80) {
				this.field989 = 36;
			}
			int var2 = this.field1021 >> 16;
			int var3 = this.field1021 << 16 >> 16;
			this.light(var2, var3, -50, -10, -50);
		} catch (RuntimeException var5) {
			signlink.reporterror("39216, " + -10 + ", " + -50 + ", " + -50 + ", " + arg0 + ", " + var5.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("KBEXSZSN.a(IIIII)V")
	public void light(int arg0, int arg1, int arg2, int arg3, int arg4) {
		for (int var6 = 0; var6 < this.numFaces; var6++) {
			int var7 = this.faceVertexA[var6];
			int var8 = this.faceVertexB[var6];
			int var9 = this.faceVertexC[var6];
			if (this.faceRenderType == null) {
				int var10 = this.faceColour[var6];
				PointNormal var11 = super.pointNormal[var7];
				int var12 = arg0 + (arg2 * var11.field1380 + arg3 * var11.field1381 + arg4 * var11.field1382) / (arg1 * var11.field1383);
				this.faceColourA[var6] = getColour(var10, var12, 0);
				PointNormal var13 = super.pointNormal[var8];
				int var14 = arg0 + (arg2 * var13.field1380 + arg3 * var13.field1381 + arg4 * var13.field1382) / (arg1 * var13.field1383);
				this.faceColorB[var6] = getColour(var10, var14, 0);
				PointNormal var15 = super.pointNormal[var9];
				int var16 = arg0 + (arg2 * var15.field1380 + arg3 * var15.field1381 + arg4 * var15.field1382) / (arg1 * var15.field1383);
				this.faceColourC[var6] = getColour(var10, var16, 0);
			} else if ((this.faceRenderType[var6] & 0x1) == 0) {
				int var17 = this.faceColour[var6];
				int var18 = this.faceRenderType[var6];
				PointNormal var19 = super.pointNormal[var7];
				int var20 = arg0 + (arg2 * var19.field1380 + arg3 * var19.field1381 + arg4 * var19.field1382) / (arg1 * var19.field1383);
				this.faceColourA[var6] = getColour(var17, var20, var18);
				PointNormal var21 = super.pointNormal[var8];
				int var22 = arg0 + (arg2 * var21.field1380 + arg3 * var21.field1381 + arg4 * var21.field1382) / (arg1 * var21.field1383);
				this.faceColorB[var6] = getColour(var17, var22, var18);
				PointNormal var23 = super.pointNormal[var9];
				int var24 = arg0 + (arg2 * var23.field1380 + arg3 * var23.field1381 + arg4 * var23.field1382) / (arg1 * var23.field1383);
				this.faceColourC[var6] = getColour(var17, var24, var18);
			}
		}
		super.pointNormal = null;
		this.sharedPointNormal = null;
		this.vertexLabel = null;
		this.faceLabel = null;
		if (this.faceRenderType != null) {
			for (int var25 = 0; var25 < this.numFaces; var25++) {
				if ((this.faceRenderType[var25] & 0x2) == 2) {
					return;
				}
			}
		}
		this.faceColour = null;
	}

	@ObfuscatedName("KBEXSZSN.a(IIIIIII)V")
	public void objRender(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = Pix3D.originX;
		int var8 = Pix3D.originY;
		int var9 = sinTable[0];
		int var10 = cosTable[0];
		int var11 = sinTable[arg0];
		int var12 = cosTable[arg0];
		int var13 = sinTable[arg1];
		int var14 = cosTable[arg1];
		int var15 = sinTable[arg2];
		int var16 = cosTable[arg2];
		int var17 = arg4 * var15 + arg5 * var16 >> 16;
		for (int var18 = 0; var18 < this.numPoints; var18++) {
			int var19 = this.pointX[var18];
			int var20 = this.pointY[var18];
			int var21 = this.pointZ[var18];
			if (arg1 != 0) {
				int var22 = var20 * var13 + var19 * var14 >> 16;
				var20 = var20 * var14 - var19 * var13 >> 16;
				var19 = var22;
			}
			if (arg0 != 0) {
				int var23 = var21 * var11 + var19 * var12 >> 16;
				var21 = var21 * var12 - var19 * var11 >> 16;
				var19 = var23;
			}
			int var24 = var19 + arg3;
			int var25 = var20 + arg4;
			int var26 = var21 + arg5;
			int var27 = var25 * var16 - var26 * var15 >> 16;
			int var28 = var25 * var15 + var26 * var16 >> 16;
			field1041[var18] = var28 - var17;
			vertexScreenX[var18] = var7 + (var24 << 9) / var28;
			vertexScreenY[var18] = var8 + (var27 << 9) / var28;
			if (this.numT > 0) {
				vertexViewSpaceX[var18] = var24;
				vertexViewSpaceY[var18] = var27;
				vertexViewSpaceZ[var18] = var28;
			}
		}
		try {
			this.render2(false, false, 0);
		} catch (Exception var29) {
		}
	}

	@ObfuscatedName("KBEXSZSN.a(IIIIIIIII)V")
	@Override
	public void worldRender(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		int var10 = arg7 * arg4 - arg5 * arg3 >> 16;
		int var11 = arg6 * arg1 + var10 * arg2 >> 16;
		int var12 = this.radius * arg2 >> 16;
		int var13 = var11 + var12;
		if (var13 <= 50 || var11 >= 3500) {
			return;
		}
		int var14 = arg7 * arg3 + arg5 * arg4 >> 16;
		int var15 = var14 - this.radius << 9;
		if (var15 / var13 >= Pix2D.maxX) {
			return;
		}
		int var16 = var14 + this.radius << 9;
		if (var16 / var13 <= -Pix2D.maxX) {
			return;
		}
		int var17 = arg6 * arg2 - var10 * arg1 >> 16;
		int var18 = this.radius * arg1 >> 16;
		int var19 = var17 + var18 << 9;
		if (var19 / var13 <= -Pix2D.maxY) {
			return;
		}
		int var20 = var18 + (super.minY * arg2 >> 16);
		int var21 = var17 - var20 << 9;
		if (var21 / var13 >= Pix2D.maxY) {
			return;
		}
		int var22 = var12 + (super.minY * arg1 >> 16);
		boolean var23 = false;
		if (var11 - var22 <= 50) {
			var23 = true;
		}
		boolean var24 = false;
		if (arg8 > 0 && mouseCheck) {
			int var25 = var11 - var12;
			if (var25 <= 50) {
				var25 = 50;
			}
			int var26;
			int var27;
			if (var14 > 0) {
				var26 = var15 / var13;
				var27 = var16 / var25;
			} else {
				var27 = var16 / var13;
				var26 = var15 / var25;
			}
			int var28;
			int var29;
			if (var17 > 0) {
				var28 = var21 / var13;
				var29 = var19 / var25;
			} else {
				var29 = var19 / var13;
				var28 = var21 / var25;
			}
			int var30 = mouseX - Pix3D.originX;
			int var31 = mouseY - Pix3D.originY;
			if (var30 > var26 && var30 < var27 && var31 > var28 && var31 < var29) {
				if (this.useAABBMouseCheck) {
					pickedEntityTypecode[pickedCount++] = arg8;
				} else {
					var24 = true;
				}
			}
		}
		int var32 = Pix3D.originX;
		int var33 = Pix3D.originY;
		int var34 = 0;
		int var35 = 0;
		if (arg0 != 0) {
			var34 = sinTable[arg0];
			var35 = cosTable[arg0];
		}
		for (int var36 = 0; var36 < this.numPoints; var36++) {
			int var37 = this.pointX[var36];
			int var38 = this.pointY[var36];
			int var39 = this.pointZ[var36];
			if (arg0 != 0) {
				int var40 = var39 * var34 + var37 * var35 >> 16;
				var39 = var39 * var35 - var37 * var34 >> 16;
				var37 = var40;
			}
			int var41 = var37 + arg5;
			int var42 = var38 + arg6;
			int var43 = var39 + arg7;
			int var44 = var43 * arg3 + var41 * arg4 >> 16;
			int var45 = var43 * arg4 - var41 * arg3 >> 16;
			int var47 = var42 * arg2 - var45 * arg1 >> 16;
			int var48 = var42 * arg1 + var45 * arg2 >> 16;
			field1041[var36] = var48 - var11;
			if (var48 >= 50) {
				vertexScreenX[var36] = var32 + (var44 << 9) / var48;
				vertexScreenY[var36] = var33 + (var47 << 9) / var48;
			} else {
				vertexScreenX[var36] = -5000;
				var23 = true;
			}
			if (var23 || this.numT > 0) {
				vertexViewSpaceX[var36] = var44;
				vertexViewSpaceY[var36] = var47;
				vertexViewSpaceZ[var36] = var48;
			}
		}
		try {
			this.render2(var23, var24, arg8);
		} catch (Exception var49) {
		}
	}

	@ObfuscatedName("KBEXSZSN.a(ZZI)V")
	public void render2(boolean arg0, boolean arg1, int arg2) {
		for (int var4 = 0; var4 < this.maxDepth; var4++) {
			tmpDepthFaceCount[var4] = 0;
		}
		for (int var5 = 0; var5 < this.numFaces; var5++) {
			if (this.faceRenderType == null || this.faceRenderType[var5] != -1) {
				int var6 = this.faceVertexA[var5];
				int var7 = this.faceVertexB[var5];
				int var8 = this.faceVertexC[var5];
				int var9 = vertexScreenX[var6];
				int var10 = vertexScreenX[var7];
				int var11 = vertexScreenX[var8];
				if (arg0 && (var9 == -5000 || var10 == -5000 || var11 == -5000)) {
					faceNearClipped[var5] = true;
					int var12 = (field1041[var6] + field1041[var7] + field1041[var8]) / 3 + this.minDepth;
					tmpDepthFaces[var12][tmpDepthFaceCount[var12]++] = var5;
				} else {
					if (arg1 && this.isMouseRoughlyInsideTriangle(mouseX, mouseY, vertexScreenY[var6], vertexScreenY[var7], vertexScreenY[var8], var9, var10, var11)) {
						pickedEntityTypecode[pickedCount++] = arg2;
						arg1 = false;
					}
					if ((var9 - var10) * (vertexScreenY[var8] - vertexScreenY[var7]) - (vertexScreenY[var6] - vertexScreenY[var7]) * (var11 - var10) > 0) {
						faceNearClipped[var5] = false;
						if (var9 >= 0 && var10 >= 0 && var11 >= 0 && var9 <= Pix2D.sizeX && var10 <= Pix2D.sizeX && var11 <= Pix2D.sizeX) {
							faceClippedX[var5] = false;
						} else {
							faceClippedX[var5] = true;
						}
						int var13 = (field1041[var6] + field1041[var7] + field1041[var8]) / 3 + this.minDepth;
						tmpDepthFaces[var13][tmpDepthFaceCount[var13]++] = var5;
					}
				}
			}
		}
		if (this.facePriority == null) {
			for (int var14 = this.maxDepth - 1; var14 >= 0; var14--) {
				int var15 = tmpDepthFaceCount[var14];
				if (var15 > 0) {
					int[] var16 = tmpDepthFaces[var14];
					for (int var17 = 0; var17 < var15; var17++) {
						this.render3(var16[var17]);
					}
				}
			}
			return;
		}
		for (int var18 = 0; var18 < 12; var18++) {
			tmpPriorityFaceCount[var18] = 0;
			tmpPriorityDepthSum[var18] = 0;
		}
		for (int var19 = this.maxDepth - 1; var19 >= 0; var19--) {
			int var20 = tmpDepthFaceCount[var19];
			if (var20 > 0) {
				int[] var21 = tmpDepthFaces[var19];
				for (int var22 = 0; var22 < var20; var22++) {
					int var23 = var21[var22];
					int var24 = this.facePriority[var23];
					int var25 = tmpPriorityFaceCount[var24]++;
					tmpPriorityFaces[var24][var25] = var23;
					if (var24 < 10) {
						tmpPriorityDepthSum[var24] += var19;
					} else if (var24 == 10) {
						tmpPriority10FaceDepth[var25] = var19;
					} else {
						tmpPriority11FaceDepth[var25] = var19;
					}
				}
			}
		}
		int var26 = 0;
		if (tmpPriorityFaceCount[1] > 0 || tmpPriorityFaceCount[2] > 0) {
			var26 = (tmpPriorityDepthSum[1] + tmpPriorityDepthSum[2]) / (tmpPriorityFaceCount[1] + tmpPriorityFaceCount[2]);
		}
		int var27 = 0;
		if (tmpPriorityFaceCount[3] > 0 || tmpPriorityFaceCount[4] > 0) {
			var27 = (tmpPriorityDepthSum[3] + tmpPriorityDepthSum[4]) / (tmpPriorityFaceCount[3] + tmpPriorityFaceCount[4]);
		}
		int var28 = 0;
		if (tmpPriorityFaceCount[6] > 0 || tmpPriorityFaceCount[8] > 0) {
			var28 = (tmpPriorityDepthSum[6] + tmpPriorityDepthSum[8]) / (tmpPriorityFaceCount[6] + tmpPriorityFaceCount[8]);
		}
		int var29 = 0;
		int var30 = tmpPriorityFaceCount[10];
		int[] var31 = tmpPriorityFaces[10];
		int[] var32 = tmpPriority10FaceDepth;
		if (var30 == 0) {
			var29 = 0;
			var30 = tmpPriorityFaceCount[11];
			var31 = tmpPriorityFaces[11];
			var32 = tmpPriority11FaceDepth;
		}
		int var33;
		if (var30 > 0) {
			var33 = var32[0];
		} else {
			var33 = -1000;
		}
		for (int var34 = 0; var34 < 10; var34++) {
			while (var34 == 0 && var33 > var26) {
				this.render3(var31[var29++]);
				if (var29 == var30 && var31 != tmpPriorityFaces[11]) {
					var29 = 0;
					var30 = tmpPriorityFaceCount[11];
					var31 = tmpPriorityFaces[11];
					var32 = tmpPriority11FaceDepth;
				}
				if (var29 < var30) {
					var33 = var32[var29];
				} else {
					var33 = -1000;
				}
			}
			while (var34 == 3 && var33 > var27) {
				this.render3(var31[var29++]);
				if (var29 == var30 && var31 != tmpPriorityFaces[11]) {
					var29 = 0;
					var30 = tmpPriorityFaceCount[11];
					var31 = tmpPriorityFaces[11];
					var32 = tmpPriority11FaceDepth;
				}
				if (var29 < var30) {
					var33 = var32[var29];
				} else {
					var33 = -1000;
				}
			}
			while (var34 == 5 && var33 > var28) {
				this.render3(var31[var29++]);
				if (var29 == var30 && var31 != tmpPriorityFaces[11]) {
					var29 = 0;
					var30 = tmpPriorityFaceCount[11];
					var31 = tmpPriorityFaces[11];
					var32 = tmpPriority11FaceDepth;
				}
				if (var29 < var30) {
					var33 = var32[var29];
				} else {
					var33 = -1000;
				}
			}
			int var35 = tmpPriorityFaceCount[var34];
			int[] var36 = tmpPriorityFaces[var34];
			for (int var37 = 0; var37 < var35; var37++) {
				this.render3(var36[var37]);
			}
		}
		while (var33 != -1000) {
			this.render3(var31[var29++]);
			if (var29 == var30 && var31 != tmpPriorityFaces[11]) {
				var29 = 0;
				var31 = tmpPriorityFaces[11];
				var30 = tmpPriorityFaceCount[11];
				var32 = tmpPriority11FaceDepth;
			}
			if (var29 < var30) {
				var33 = var32[var29];
			} else {
				var33 = -1000;
			}
		}
	}

	@ObfuscatedName("KBEXSZSN.i(I)V")
	public void render3(int arg0) {
		if (faceNearClipped[arg0]) {
			this.render3ZClip(arg0);
			return;
		}
		int var2 = this.faceVertexA[arg0];
		int var3 = this.faceVertexB[arg0];
		int var4 = this.faceVertexC[arg0];
		Pix3D.hclip = faceClippedX[arg0];
		if (this.faceAlpha == null) {
			Pix3D.trans = 0;
		} else {
			Pix3D.trans = this.faceAlpha[arg0];
		}
		int var5;
		if (this.faceRenderType == null) {
			var5 = 0;
		} else {
			var5 = this.faceRenderType[arg0] & 0x3;
		}
		if (var5 == 0) {
			Pix3D.gouraudTriangle(vertexScreenY[var2], vertexScreenY[var3], vertexScreenY[var4], vertexScreenX[var2], vertexScreenX[var3], vertexScreenX[var4], this.faceColourA[arg0], this.faceColorB[arg0], this.faceColourC[arg0]);
		} else if (var5 == 1) {
			Pix3D.flatTriangle(vertexScreenY[var2], vertexScreenY[var3], vertexScreenY[var4], vertexScreenX[var2], vertexScreenX[var3], vertexScreenX[var4], field1065[this.faceColourA[arg0]]);
		} else if (var5 == 2) {
			int var6 = this.faceRenderType[arg0] >> 2;
			int var7 = this.faceTextureP[var6];
			int var8 = this.faceTextureM[var6];
			int var9 = this.faceTextureN[var6];
			Pix3D.textureTriangle(vertexScreenY[var2], vertexScreenY[var3], vertexScreenY[var4], vertexScreenX[var2], vertexScreenX[var3], vertexScreenX[var4], this.faceColourA[arg0], this.faceColorB[arg0], this.faceColourC[arg0], vertexViewSpaceX[var7], vertexViewSpaceX[var8], vertexViewSpaceX[var9], vertexViewSpaceY[var7], vertexViewSpaceY[var8], vertexViewSpaceY[var9], vertexViewSpaceZ[var7], vertexViewSpaceZ[var8], vertexViewSpaceZ[var9], this.faceColour[arg0]);
		} else if (var5 == 3) {
			int var10 = this.faceRenderType[arg0] >> 2;
			int var11 = this.faceTextureP[var10];
			int var12 = this.faceTextureM[var10];
			int var13 = this.faceTextureN[var10];
			Pix3D.textureTriangle(vertexScreenY[var2], vertexScreenY[var3], vertexScreenY[var4], vertexScreenX[var2], vertexScreenX[var3], vertexScreenX[var4], this.faceColourA[arg0], this.faceColourA[arg0], this.faceColourA[arg0], vertexViewSpaceX[var11], vertexViewSpaceX[var12], vertexViewSpaceX[var13], vertexViewSpaceY[var11], vertexViewSpaceY[var12], vertexViewSpaceY[var13], vertexViewSpaceZ[var11], vertexViewSpaceZ[var12], vertexViewSpaceZ[var13], this.faceColour[arg0]);
		}
	}

	@ObfuscatedName("KBEXSZSN.j(I)V")
	public void render3ZClip(int arg0) {
		int var2 = Pix3D.originX;
		int var3 = Pix3D.originY;
		int var4 = 0;
		int var5 = this.faceVertexA[arg0];
		int var6 = this.faceVertexB[arg0];
		int var7 = this.faceVertexC[arg0];
		int var8 = vertexViewSpaceZ[var5];
		int var9 = vertexViewSpaceZ[var6];
		int var10 = vertexViewSpaceZ[var7];
		if (var8 >= 50) {
			clippedX[0] = vertexScreenX[var5];
			clippedY[0] = vertexScreenY[var5];
			var4++;
			clippedColour[0] = this.faceColourA[arg0];
		} else {
			int var11 = vertexViewSpaceX[var5];
			int var12 = vertexViewSpaceY[var5];
			int var13 = this.faceColourA[arg0];
			if (var10 >= 50) {
				int var14 = (50 - var8) * field1066[var10 - var8];
				clippedX[0] = var2 + (var11 + ((vertexViewSpaceX[var7] - var11) * var14 >> 16) << 9) / 50;
				clippedY[0] = var3 + (var12 + ((vertexViewSpaceY[var7] - var12) * var14 >> 16) << 9) / 50;
				var4++;
				clippedColour[0] = var13 + ((this.faceColourC[arg0] - var13) * var14 >> 16);
			}
			if (var9 >= 50) {
				int var15 = (50 - var8) * field1066[var9 - var8];
				clippedX[var4] = var2 + (var11 + ((vertexViewSpaceX[var6] - var11) * var15 >> 16) << 9) / 50;
				clippedY[var4] = var3 + (var12 + ((vertexViewSpaceY[var6] - var12) * var15 >> 16) << 9) / 50;
				clippedColour[var4++] = var13 + ((this.faceColorB[arg0] - var13) * var15 >> 16);
			}
		}
		if (var9 >= 50) {
			clippedX[var4] = vertexScreenX[var6];
			clippedY[var4] = vertexScreenY[var6];
			clippedColour[var4++] = this.faceColorB[arg0];
		} else {
			int var16 = vertexViewSpaceX[var6];
			int var17 = vertexViewSpaceY[var6];
			int var18 = this.faceColorB[arg0];
			if (var8 >= 50) {
				int var19 = (50 - var9) * field1066[var8 - var9];
				clippedX[var4] = var2 + (var16 + ((vertexViewSpaceX[var5] - var16) * var19 >> 16) << 9) / 50;
				clippedY[var4] = var3 + (var17 + ((vertexViewSpaceY[var5] - var17) * var19 >> 16) << 9) / 50;
				clippedColour[var4++] = var18 + ((this.faceColourA[arg0] - var18) * var19 >> 16);
			}
			if (var10 >= 50) {
				int var20 = (50 - var9) * field1066[var10 - var9];
				clippedX[var4] = var2 + (var16 + ((vertexViewSpaceX[var7] - var16) * var20 >> 16) << 9) / 50;
				clippedY[var4] = var3 + (var17 + ((vertexViewSpaceY[var7] - var17) * var20 >> 16) << 9) / 50;
				clippedColour[var4++] = var18 + ((this.faceColourC[arg0] - var18) * var20 >> 16);
			}
		}
		if (var10 >= 50) {
			clippedX[var4] = vertexScreenX[var7];
			clippedY[var4] = vertexScreenY[var7];
			clippedColour[var4++] = this.faceColourC[arg0];
		} else {
			int var21 = vertexViewSpaceX[var7];
			int var22 = vertexViewSpaceY[var7];
			int var23 = this.faceColourC[arg0];
			if (var9 >= 50) {
				int var24 = (50 - var10) * field1066[var9 - var10];
				clippedX[var4] = var2 + (var21 + ((vertexViewSpaceX[var6] - var21) * var24 >> 16) << 9) / 50;
				clippedY[var4] = var3 + (var22 + ((vertexViewSpaceY[var6] - var22) * var24 >> 16) << 9) / 50;
				clippedColour[var4++] = var23 + ((this.faceColorB[arg0] - var23) * var24 >> 16);
			}
			if (var8 >= 50) {
				int var25 = (50 - var10) * field1066[var8 - var10];
				clippedX[var4] = var2 + (var21 + ((vertexViewSpaceX[var5] - var21) * var25 >> 16) << 9) / 50;
				clippedY[var4] = var3 + (var22 + ((vertexViewSpaceY[var5] - var22) * var25 >> 16) << 9) / 50;
				clippedColour[var4++] = var23 + ((this.faceColourA[arg0] - var23) * var25 >> 16);
			}
		}
		int var26 = clippedX[0];
		int var27 = clippedX[1];
		int var28 = clippedX[2];
		int var29 = clippedY[0];
		int var30 = clippedY[1];
		int var31 = clippedY[2];
		if ((var26 - var27) * (var31 - var30) - (var29 - var30) * (var28 - var27) <= 0) {
			return;
		}
		Pix3D.hclip = false;
		if (var4 == 3) {
			if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Pix2D.sizeX || var27 > Pix2D.sizeX || var28 > Pix2D.sizeX) {
				Pix3D.hclip = true;
			}
			int var32;
			if (this.faceRenderType == null) {
				var32 = 0;
			} else {
				var32 = this.faceRenderType[arg0] & 0x3;
			}
			if (var32 == 0) {
				Pix3D.gouraudTriangle(var29, var30, var31, var26, var27, var28, clippedColour[0], clippedColour[1], clippedColour[2]);
			} else if (var32 == 1) {
				Pix3D.flatTriangle(var29, var30, var31, var26, var27, var28, field1065[this.faceColourA[arg0]]);
			} else if (var32 == 2) {
				int var33 = this.faceRenderType[arg0] >> 2;
				int var34 = this.faceTextureP[var33];
				int var35 = this.faceTextureM[var33];
				int var36 = this.faceTextureN[var33];
				Pix3D.textureTriangle(var29, var30, var31, var26, var27, var28, clippedColour[0], clippedColour[1], clippedColour[2], vertexViewSpaceX[var34], vertexViewSpaceX[var35], vertexViewSpaceX[var36], vertexViewSpaceY[var34], vertexViewSpaceY[var35], vertexViewSpaceY[var36], vertexViewSpaceZ[var34], vertexViewSpaceZ[var35], vertexViewSpaceZ[var36], this.faceColour[arg0]);
			} else if (var32 == 3) {
				int var37 = this.faceRenderType[arg0] >> 2;
				int var38 = this.faceTextureP[var37];
				int var39 = this.faceTextureM[var37];
				int var40 = this.faceTextureN[var37];
				Pix3D.textureTriangle(var29, var30, var31, var26, var27, var28, this.faceColourA[arg0], this.faceColourA[arg0], this.faceColourA[arg0], vertexViewSpaceX[var38], vertexViewSpaceX[var39], vertexViewSpaceX[var40], vertexViewSpaceY[var38], vertexViewSpaceY[var39], vertexViewSpaceY[var40], vertexViewSpaceZ[var38], vertexViewSpaceZ[var39], vertexViewSpaceZ[var40], this.faceColour[arg0]);
			}
		}
		if (var4 != 4) {
			return;
		}
		if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Pix2D.sizeX || var27 > Pix2D.sizeX || var28 > Pix2D.sizeX || clippedX[3] < 0 || clippedX[3] > Pix2D.sizeX) {
			Pix3D.hclip = true;
		}
		int var41;
		if (this.faceRenderType == null) {
			var41 = 0;
		} else {
			var41 = this.faceRenderType[arg0] & 0x3;
		}
		if (var41 == 0) {
			Pix3D.gouraudTriangle(var29, var30, var31, var26, var27, var28, clippedColour[0], clippedColour[1], clippedColour[2]);
			Pix3D.gouraudTriangle(var29, var31, clippedY[3], var26, var28, clippedX[3], clippedColour[0], clippedColour[2], clippedColour[3]);
			return;
		}
		if (var41 == 1) {
			int var42 = field1065[this.faceColourA[arg0]];
			Pix3D.flatTriangle(var29, var30, var31, var26, var27, var28, var42);
			Pix3D.flatTriangle(var29, var31, clippedY[3], var26, var28, clippedX[3], var42);
			return;
		}
		if (var41 == 2) {
			int var43 = this.faceRenderType[arg0] >> 2;
			int var44 = this.faceTextureP[var43];
			int var45 = this.faceTextureM[var43];
			int var46 = this.faceTextureN[var43];
			Pix3D.textureTriangle(var29, var30, var31, var26, var27, var28, clippedColour[0], clippedColour[1], clippedColour[2], vertexViewSpaceX[var44], vertexViewSpaceX[var45], vertexViewSpaceX[var46], vertexViewSpaceY[var44], vertexViewSpaceY[var45], vertexViewSpaceY[var46], vertexViewSpaceZ[var44], vertexViewSpaceZ[var45], vertexViewSpaceZ[var46], this.faceColour[arg0]);
			Pix3D.textureTriangle(var29, var31, clippedY[3], var26, var28, clippedX[3], clippedColour[0], clippedColour[2], clippedColour[3], vertexViewSpaceX[var44], vertexViewSpaceX[var45], vertexViewSpaceX[var46], vertexViewSpaceY[var44], vertexViewSpaceY[var45], vertexViewSpaceY[var46], vertexViewSpaceZ[var44], vertexViewSpaceZ[var45], vertexViewSpaceZ[var46], this.faceColour[arg0]);
			return;
		}
		if (var41 != 3) {
			return;
		}
		int var47 = this.faceRenderType[arg0] >> 2;
		int var48 = this.faceTextureP[var47];
		int var49 = this.faceTextureM[var47];
		int var50 = this.faceTextureN[var47];
		Pix3D.textureTriangle(var29, var30, var31, var26, var27, var28, this.faceColourA[arg0], this.faceColourA[arg0], this.faceColourA[arg0], vertexViewSpaceX[var48], vertexViewSpaceX[var49], vertexViewSpaceX[var50], vertexViewSpaceY[var48], vertexViewSpaceY[var49], vertexViewSpaceY[var50], vertexViewSpaceZ[var48], vertexViewSpaceZ[var49], vertexViewSpaceZ[var50], this.faceColour[arg0]);
		Pix3D.textureTriangle(var29, var31, clippedY[3], var26, var28, clippedX[3], this.faceColourA[arg0], this.faceColourA[arg0], this.faceColourA[arg0], vertexViewSpaceX[var48], vertexViewSpaceX[var49], vertexViewSpaceX[var50], vertexViewSpaceY[var48], vertexViewSpaceY[var49], vertexViewSpaceY[var50], vertexViewSpaceZ[var48], vertexViewSpaceZ[var49], vertexViewSpaceZ[var50], this.faceColour[arg0]);
	}

	@ObfuscatedName("KBEXSZSN.a(IIIIIIII)Z")
	public boolean isMouseRoughlyInsideTriangle(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
			return false;
		} else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
			return false;
		} else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
			return false;
		} else {
			return arg0 <= arg5 || arg0 <= arg6 || arg0 <= arg7;
		}
	}
}
