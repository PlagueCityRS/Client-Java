package deob.client;

import deob.*;
import jagex2.config.FloType;
import jagex2.config.LocType;
import jagex2.dash3d.*;
import jagex2.io.OnDemand;
import jagex2.io.Packet;
import sign.signlink;

@ObfuscatedName("OZIFXWPH")
public final class ClientBuild {

	@ObfuscatedName("OZIFXWPH.E")
	public final int[][][] groundh;

	@ObfuscatedName("OZIFXWPH.i")
	public final byte[][][] mapl;

	@ObfuscatedName("OZIFXWPH.s")
	public static int minusedLevel;

	@ObfuscatedName("OZIFXWPH.w")
	public final byte[][][] floort1;

	@ObfuscatedName("OZIFXWPH.D")
	public final byte[][][] floort2;

	@ObfuscatedName("OZIFXWPH.j")
	public final byte[][][] floors;

	@ObfuscatedName("OZIFXWPH.r")
	public final byte[][][] floorr;

	@ObfuscatedName("OZIFXWPH.c")
	public final byte[][][] shadow;

	@ObfuscatedName("OZIFXWPH.t")
	public final int[][] lightmap;

	@ObfuscatedName("OZIFXWPH.d")
	public final int[] huetot;

	@ObfuscatedName("OZIFXWPH.e")
	public final int[] sattot;

	@ObfuscatedName("OZIFXWPH.f")
	public final int[] ligtot;

	@ObfuscatedName("OZIFXWPH.g")
	public final int[] comtot;

	@ObfuscatedName("OZIFXWPH.h")
	public final int[] tot;

	@ObfuscatedName("OZIFXWPH.x")
	public final int[][][] mapo;

	@ObfuscatedName("OZIFXWPH.l")
	public static final int[] WSHAPE0 = new int[] { 1, 2, 4, 8 };

	@ObfuscatedName("OZIFXWPH.u")
	public static final int[] WSHAPE1 = new int[] { 16, 32, 64, 128 };

	@ObfuscatedName("OZIFXWPH.p")
	public static final int[] DECORXOF = new int[] { 1, 0, -1, 0 };

	@ObfuscatedName("OZIFXWPH.y")
	public static final int[] DECORZOF = new int[] { 0, -1, 0, 1 };

	@ObfuscatedName("OZIFXWPH.v")
	public static int hueOff = (int) (Math.random() * 17.0D) - 8;

	@ObfuscatedName("OZIFXWPH.k")
	public static int ligOff = (int) (Math.random() * 33.0D) - 16;

	@ObfuscatedName("OZIFXWPH.n")
	public static final int field1227 = 514;

	@ObfuscatedName("OZIFXWPH.q")
	public static final int field1230 = -44;

	@ObfuscatedName("OZIFXWPH.z")
	public static int field1239 = 99;

	@ObfuscatedName("OZIFXWPH.b")
	public final int field1215 = 534;

	@ObfuscatedName("OZIFXWPH.C")
	public int field1242;

	@ObfuscatedName("OZIFXWPH.a")
	public final boolean field1214 = true;

	@ObfuscatedName("OZIFXWPH.m")
	public final boolean field1226 = true;

	@ObfuscatedName("OZIFXWPH.o")
	public static boolean lowMem = true;

	@ObfuscatedName("OZIFXWPH.A")
	public final int maxTileX;

	@ObfuscatedName("OZIFXWPH.B")
	public final int maxTileZ;

	public ClientBuild(int[][][] arg0, int arg1, int arg2, byte[][][] arg3, int arg4) {
		try {
			field1239 = 99;
			this.maxTileX = 104;
			if (arg2 != 8) {
				throw new NullPointerException();
			}
			this.maxTileZ = 104;
			this.groundh = arg0;
			this.mapl = arg3;
			this.floort1 = new byte[4][this.maxTileX][this.maxTileZ];
			this.floort2 = new byte[4][this.maxTileX][this.maxTileZ];
			this.floors = new byte[4][this.maxTileX][this.maxTileZ];
			this.floorr = new byte[4][this.maxTileX][this.maxTileZ];
			this.mapo = new int[4][this.maxTileX + 1][this.maxTileZ + 1];
			this.shadow = new byte[4][this.maxTileX + 1][this.maxTileZ + 1];
			this.lightmap = new int[this.maxTileX + 1][this.maxTileZ + 1];
			this.huetot = new int[this.maxTileZ];
			this.sattot = new int[this.maxTileZ];
			this.ligtot = new int[this.maxTileZ];
			this.comtot = new int[this.maxTileZ];
			this.tot = new int[this.maxTileZ];
		} catch (RuntimeException var7) {
			signlink.reporterror("38021, " + arg0 + ", " + 104 + ", " + arg2 + ", " + arg3 + ", " + 104 + ", " + var7.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("OZIFXWPH.a(IIIIB)V")
	public void fadeAdjacent(int arg0, int arg1, int arg2, int arg3) {
		try {
			for (int var5 = arg0; var5 <= arg0 + arg2; var5++) {
				for (int var6 = arg3; var6 <= arg3 + arg1; var6++) {
					if (var6 >= 0 && var6 < this.maxTileX && var5 >= 0 && var5 < this.maxTileZ) {
						this.shadow[0][var6][var5] = 127;
						if (var6 == arg3 && var6 > 0) {
							this.groundh[0][var6][var5] = this.groundh[0][var6 - 1][var5];
						}
						if (var6 == arg3 + arg1 && var6 < this.maxTileX - 1) {
							this.groundh[0][var6][var5] = this.groundh[0][var6 + 1][var5];
						}
						if (var5 == arg0 && var5 > 0) {
							this.groundh[0][var6][var5] = this.groundh[0][var6][var5 - 1];
						}
						if (var5 == arg0 + arg2 && var5 < this.maxTileZ - 1) {
							this.groundh[0][var6][var5] = this.groundh[0][var6][var5 + 1];
						}
					}
				}
			}
		} catch (RuntimeException var8) {
			signlink.reporterror("33423, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 9 + ", " + var8.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("OZIFXWPH.a(BIIILEILHLJCE;III)V")
	public void loadGround(byte arg0, int arg1, int arg2, int arg3, Packet arg4, int arg5, int arg6, int arg7) {
		try {
			boolean var14 = false;
			if (arg2 >= 0 && arg2 < 104 && arg1 >= 0 && arg1 < 104) {
				this.mapl[arg5][arg2][arg1] = 0;
				while (true) {
					int var9 = arg4.g1();
					if (var9 == 0) {
						if (arg5 == 0) {
							this.groundh[0][arg2][arg1] = -perlinNoise(arg2 + arg6 + 932731, arg1 + 556238 + arg3) * 8;
							return;
						} else {
							this.groundh[arg5][arg2][arg1] = this.groundh[arg5 - 1][arg2][arg1] - 240;
							return;
						}
					}
					if (var9 == 1) {
						int var10 = arg4.g1();
						if (var10 == 1) {
							var10 = 0;
						}
						if (arg5 == 0) {
							this.groundh[0][arg2][arg1] = -var10 * 8;
							return;
						}
						this.groundh[arg5][arg2][arg1] = this.groundh[arg5 - 1][arg2][arg1] - var10 * 8;
						return;
					}
					if (var9 <= 49) {
						this.floort2[arg5][arg2][arg1] = arg4.g1b();
						this.floors[arg5][arg2][arg1] = (byte) ((var9 - 2) / 4);
						this.floorr[arg5][arg2][arg1] = (byte) (var9 + arg7 - 2 & 0x3);
					} else if (var9 <= 81) {
						this.mapl[arg5][arg2][arg1] = (byte) (var9 - 49);
					} else {
						this.floort1[arg5][arg2][arg1] = (byte) (var9 - 81);
					}
				}
			} else {
				while (true) {
					int var11 = arg4.g1();
					if (var11 == 0) {
						return;
					}
					if (var11 == 1) {
						arg4.g1();
						return;
					}
					if (var11 <= 49) {
						arg4.g1();
					}
				}
			}
		} catch (RuntimeException var13) {
			signlink.reporterror("13845, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + var13.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("OZIFXWPH.a(I[BII)Z")
	public static boolean checkLocations(byte[] arg0, int arg1, int arg2) {
		try {
			boolean var3 = true;
			Packet var4 = new Packet(arg0, -26583);
			int var5 = -1;
			label53: while (true) {
				int var6 = var4.gsmart();
				if (var6 == 0) {
					return var3;
				}
				var5 += var6;
				int var7 = 0;
				boolean var8 = false;
				while (true) {
					while (!var8) {
						int var10 = var4.gsmart();
						if (var10 == 0) {
							continue label53;
						}
						var7 += var10 - 1;
						int var11 = var7 & 0x3F;
						int var12 = var7 >> 6 & 0x3F;
						int var13 = var4.g1() >> 2;
						int var14 = var12 + arg1;
						int var15 = var11 + arg2;
						if (var14 > 0 && var15 > 0 && var14 < 103 && var15 < 103) {
							LocType var16 = LocType.list(var5);
							if (var13 != 22 || !lowMem || var16.active || var16.forcedecor) {
								var3 &= var16.method188();
								var8 = true;
							}
						}
					}
					int var9 = var4.gsmart();
					if (var9 == 0) {
						break;
					}
					var4.g1();
				}
			}
		} catch (RuntimeException var18) {
			signlink.reporterror("16156, " + 514 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + var18.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("OZIFXWPH.a(IZI[BLXOHMKFIT;[LDYTTVJNT;)V")
	public void loadLocations(int arg0, int arg1, byte[] arg2, World arg3, CollisionMap[] arg4) {
		try {
			Packet var6 = new Packet(arg2, -26583);
			int var7 = -1;
			while (true) {
				int var8 = var6.gsmart();
				if (var8 == 0) {
					return;
				}
				var7 += var8;
				int var9 = 0;
				while (true) {
					int var10 = var6.gsmart();
					if (var10 == 0) {
						break;
					}
					var9 += var10 - 1;
					int var11 = var9 & 0x3F;
					int var12 = var9 >> 6 & 0x3F;
					int var13 = var9 >> 12;
					int var14 = var6.g1();
					int var15 = var14 >> 2;
					int var16 = var14 & 0x3;
					int var17 = var12 + arg0;
					int var18 = var11 + arg1;
					if (var17 > 0 && var18 > 0 && var17 < 103 && var18 < 103) {
						int var19 = var13;
						if ((this.mapl[1][var17][var18] & 0x2) == 2) {
							var19 = var13 - 1;
						}
						CollisionMap var20 = null;
						if (var19 >= 0) {
							var20 = arg4[var19];
						}
						this.addLoc(var13, var18, var17, var15, var7, var16, arg3, var20, this.field1215);
					}
				}
			}
		} catch (RuntimeException var22) {
			signlink.reporterror("92332, " + arg0 + ", " + true + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + var22.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("OZIFXWPH.a(ILDYTTVJNT;LXOHMKFIT;III[[[IIIII)V")
	public static void addLoc(CollisionMap arg0, World arg1, int arg2, int arg3, int arg4, int[][][] arg5, int arg6, int arg7, int arg8, int arg9) {
		try {
			int var10 = arg5[arg6][arg3][arg7];
			int var11 = arg5[arg6][arg3 + 1][arg7];
			int var12 = arg5[arg6][arg3 + 1][arg7 + 1];
			int var13 = arg5[arg6][arg3][arg7 + 1];
			int var14 = var10 + var11 + var12 + var13 >> 2;
			LocType var15 = LocType.list(arg2);
			int var16 = arg3 + (arg7 << 7) + (arg2 << 14) + 1073741824;
			if (!var15.active) {
				var16 += Integer.MIN_VALUE;
			}
			byte var17 = (byte) ((arg8 << 6) + arg4);
			if (arg4 == 22) {
				ModelSource var18;
				if (var15.anim == -1 && var15.multiloc == null) {
					var18 = var15.getModel(22, arg8, var10, var11, var12, var13, -1);
				} else {
					var18 = new ClientLocAnim(arg2, 22, var11, var15.anim, var13, true, arg8, var12, (byte) -59, var10);
				}
				arg1.setGroundDecor(var17, (byte) 6, arg7, arg3, var14, arg9, var18, var16);
				if (var15.blockwalk && var15.active) {
					arg0.blockGround(arg3, arg7);
				}
			} else if (arg4 == 10 || arg4 == 11) {
				ModelSource var19;
				if (var15.anim == -1 && var15.multiloc == null) {
					var19 = var15.getModel(10, arg8, var10, var11, var12, var13, -1);
				} else {
					var19 = new ClientLocAnim(arg2, 10, var11, var15.anim, var13, true, arg8, var12, (byte) -59, var10);
				}
				if (var19 != null) {
					int var20 = 0;
					if (arg4 == 11) {
						var20 += 256;
					}
					int var21;
					int var22;
					if (arg8 == 1 || arg8 == 3) {
						var21 = var15.length;
						var22 = var15.width;
					} else {
						var21 = var15.width;
						var22 = var15.length;
					}
					arg1.addScenery(arg9, var22, var21, var17, arg3, var14, var16, var20, var19, arg7);
				}
				if (var15.blockwalk) {
					arg0.addLoc(var15.width, var15.length, var15.blockrange, arg3, arg8, arg7);
				}
			} else if (arg4 >= 12) {
				ModelSource var23;
				if (var15.anim == -1 && var15.multiloc == null) {
					var23 = var15.getModel(arg4, arg8, var10, var11, var12, var13, -1);
				} else {
					var23 = new ClientLocAnim(arg2, arg4, var11, var15.anim, var13, true, arg8, var12, (byte) -59, var10);
				}
				arg1.addScenery(arg9, 1, 1, var17, arg3, var14, var16, 0, var23, arg7);
				if (var15.blockwalk) {
					arg0.addLoc(var15.width, var15.length, var15.blockrange, arg3, arg8, arg7);
				}
			} else if (arg4 == 0) {
				ModelSource var24;
				if (var15.anim == -1 && var15.multiloc == null) {
					var24 = var15.getModel(0, arg8, var10, var11, var12, var13, -1);
				} else {
					var24 = new ClientLocAnim(arg2, 0, var11, var15.anim, var13, true, arg8, var12, (byte) -59, var10);
				}
				arg1.setWall(WSHAPE0[arg8], arg7, null, var24, var16, 0, arg9, var14, var17, arg3);
				if (var15.blockwalk) {
					arg0.addWall(arg4, arg3, var15.blockrange, arg8, arg7);
				}
			} else if (arg4 == 1) {
				ModelSource var25;
				if (var15.anim == -1 && var15.multiloc == null) {
					var25 = var15.getModel(1, arg8, var10, var11, var12, var13, -1);
				} else {
					var25 = new ClientLocAnim(arg2, 1, var11, var15.anim, var13, true, arg8, var12, (byte) -59, var10);
				}
				arg1.setWall(WSHAPE1[arg8], arg7, null, var25, var16, 0, arg9, var14, var17, arg3);
				if (var15.blockwalk) {
					arg0.addWall(arg4, arg3, var15.blockrange, arg8, arg7);
				}
			} else if (arg4 == 2) {
				int var26 = arg8 + 1 & 0x3;
				ModelSource var27;
				ModelSource var28;
				if (var15.anim == -1 && var15.multiloc == null) {
					var27 = var15.getModel(2, arg8 + 4, var10, var11, var12, var13, -1);
					var28 = var15.getModel(2, var26, var10, var11, var12, var13, -1);
				} else {
					var27 = new ClientLocAnim(arg2, 2, var11, var15.anim, var13, true, arg8 + 4, var12, (byte) -59, var10);
					var28 = new ClientLocAnim(arg2, 2, var11, var15.anim, var13, true, var26, var12, (byte) -59, var10);
				}
				arg1.setWall(WSHAPE0[arg8], arg7, var28, var27, var16, WSHAPE0[var26], arg9, var14, var17, arg3);
				if (var15.blockwalk) {
					arg0.addWall(arg4, arg3, var15.blockrange, arg8, arg7);
				}
			} else if (arg4 == 3) {
				ModelSource var29;
				if (var15.anim == -1 && var15.multiloc == null) {
					var29 = var15.getModel(3, arg8, var10, var11, var12, var13, -1);
				} else {
					var29 = new ClientLocAnim(arg2, 3, var11, var15.anim, var13, true, arg8, var12, (byte) -59, var10);
				}
				arg1.setWall(WSHAPE1[arg8], arg7, null, var29, var16, 0, arg9, var14, var17, arg3);
				if (var15.blockwalk) {
					arg0.addWall(arg4, arg3, var15.blockrange, arg8, arg7);
				}
			} else if (arg4 == 9) {
				ModelSource var30;
				if (var15.anim == -1 && var15.multiloc == null) {
					var30 = var15.getModel(arg4, arg8, var10, var11, var12, var13, -1);
				} else {
					var30 = new ClientLocAnim(arg2, arg4, var11, var15.anim, var13, true, arg8, var12, (byte) -59, var10);
				}
				arg1.addScenery(arg9, 1, 1, var17, arg3, var14, var16, 0, var30, arg7);
				if (var15.blockwalk) {
					arg0.addLoc(var15.width, var15.length, var15.blockrange, arg3, arg8, arg7);
				}
			} else {
				if (var15.hillskew) {
					if (arg8 == 1) {
						int var31 = var13;
						var13 = var12;
						var12 = var11;
						var11 = var10;
						var10 = var31;
					} else if (arg8 == 2) {
						int var32 = var13;
						var13 = var11;
						var11 = var32;
						int var33 = var12;
						var12 = var10;
						var10 = var33;
					} else if (arg8 == 3) {
						int var34 = var13;
						var13 = var10;
						var10 = var11;
						var11 = var12;
						var12 = var34;
					}
				}
				if (arg4 == 4) {
					ModelSource var35;
					if (var15.anim == -1 && var15.multiloc == null) {
						var35 = var15.getModel(4, 0, var10, var11, var12, var13, -1);
					} else {
						var35 = new ClientLocAnim(arg2, 4, var11, var15.anim, var13, true, 0, var12, (byte) -59, var10);
					}
					arg1.setDecor(0, var14, arg7, WSHAPE0[arg8], var16, 0, arg8 * 512, var35, arg3, var17, arg9);
				} else if (arg4 == 5) {
					int var36 = 16;
					int var37 = arg1.wallType(arg9, arg3, arg7);
					if (var37 > 0) {
						var36 = LocType.list(var37 >> 14 & 0x7FFF).wallWidth;
					}
					ModelSource var38;
					if (var15.anim == -1 && var15.multiloc == null) {
						var38 = var15.getModel(4, 0, var10, var11, var12, var13, -1);
					} else {
						var38 = new ClientLocAnim(arg2, 4, var11, var15.anim, var13, true, 0, var12, (byte) -59, var10);
					}
					arg1.setDecor(DECORXOF[arg8] * var36, var14, arg7, WSHAPE0[arg8], var16, DECORZOF[arg8] * var36, arg8 * 512, var38, arg3, var17, arg9);
				} else if (arg4 == 6) {
					ModelSource var39;
					if (var15.anim == -1 && var15.multiloc == null) {
						var39 = var15.getModel(4, 0, var10, var11, var12, var13, -1);
					} else {
						var39 = new ClientLocAnim(arg2, 4, var11, var15.anim, var13, true, 0, var12, (byte) -59, var10);
					}
					arg1.setDecor(0, var14, arg7, 256, var16, 0, arg8, var39, arg3, var17, arg9);
				} else if (arg4 == 7) {
					ModelSource var40;
					if (var15.anim == -1 && var15.multiloc == null) {
						var40 = var15.getModel(4, 0, var10, var11, var12, var13, -1);
					} else {
						var40 = new ClientLocAnim(arg2, 4, var11, var15.anim, var13, true, 0, var12, (byte) -59, var10);
					}
					arg1.setDecor(0, var14, arg7, 512, var16, 0, arg8, var40, arg3, var17, arg9);
				} else if (arg4 == 8) {
					ModelSource var41;
					if (var15.anim == -1 && var15.multiloc == null) {
						var41 = var15.getModel(4, 0, var10, var11, var12, var13, -1);
					} else {
						var41 = new ClientLocAnim(arg2, 4, var11, var15.anim, var13, true, 0, var12, (byte) -59, var10);
					}
					arg1.setDecor(0, var14, arg7, 768, var16, 0, arg8, var41, arg3, var17, arg9);
				}
			}
		} catch (RuntimeException var43) {
			signlink.reporterror("8157, " + 863 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + var43.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("OZIFXWPH.a(IIIIIILXOHMKFIT;LDYTTVJNT;I)V")
	public void addLoc(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, World arg6, CollisionMap arg7, int arg8) {
		try {
			if (lowMem && (this.mapl[0][arg2][arg1] & 0x2) == 0) {
				if ((this.mapl[arg0][arg2][arg1] & 0x10) != 0) {
					return;
				}
				if (this.getVisBelowLevel(arg2, arg1, arg0) != minusedLevel) {
					return;
				}
			}
			if (arg0 < field1239) {
				field1239 = arg0;
			}
			int var10 = this.groundh[arg0][arg2][arg1];
			int var11 = this.groundh[arg0][arg2 + 1][arg1];
			int var12 = this.groundh[arg0][arg2 + 1][arg1 + 1];
			int var13 = this.groundh[arg0][arg2][arg1 + 1];
			int var14 = var10 + var11 + var12 + var13 >> 2;
			LocType var15 = LocType.list(arg4);
			int var48 = 92 / arg8;
			int var16 = arg2 + (arg1 << 7) + (arg4 << 14) + 1073741824;
			if (!var15.active) {
				var16 += Integer.MIN_VALUE;
			}
			byte var17 = (byte) ((arg5 << 6) + arg3);
			if (arg3 == 22) {
				if (!lowMem || var15.active || var15.forcedecor) {
					ModelSource var18;
					if (var15.anim == -1 && var15.multiloc == null) {
						var18 = var15.getModel(22, arg5, var10, var11, var12, var13, -1);
					} else {
						var18 = new ClientLocAnim(arg4, 22, var11, var15.anim, var13, true, arg5, var12, (byte) -59, var10);
					}
					arg6.setGroundDecor(var17, (byte) 6, arg1, arg2, var14, arg0, var18, var16);
					if (var15.blockwalk && var15.active && arg7 != null) {
						arg7.blockGround(arg2, arg1);
					}
				}
			} else if (arg3 == 10 || arg3 == 11) {
				ModelSource var19;
				if (var15.anim == -1 && var15.multiloc == null) {
					var19 = var15.getModel(10, arg5, var10, var11, var12, var13, -1);
				} else {
					var19 = new ClientLocAnim(arg4, 10, var11, var15.anim, var13, true, arg5, var12, (byte) -59, var10);
				}
				if (var19 != null) {
					int var20 = 0;
					if (arg3 == 11) {
						var20 += 256;
					}
					int var21;
					int var22;
					if (arg5 == 1 || arg5 == 3) {
						var21 = var15.length;
						var22 = var15.width;
					} else {
						var21 = var15.width;
						var22 = var15.length;
					}
					if (arg6.addScenery(arg0, var22, var21, var17, arg2, var14, var16, var20, var19, arg1) && var15.shadow) {
						Model var23;
						if (var19 instanceof Model) {
							var23 = (Model) var19;
						} else {
							var23 = var15.getModel(10, arg5, var10, var11, var12, var13, -1);
						}
						if (var23 != null) {
							for (int var24 = 0; var24 <= var21; var24++) {
								for (int var25 = 0; var25 <= var22; var25++) {
									int var26 = var23.radius / 4;
									if (var26 > 30) {
										var26 = 30;
									}
									if (var26 > this.shadow[arg0][arg2 + var24][arg1 + var25]) {
										this.shadow[arg0][arg2 + var24][arg1 + var25] = (byte) var26;
									}
								}
							}
						}
					}
				}
				if (var15.blockwalk && arg7 != null) {
					arg7.addLoc(var15.width, var15.length, var15.blockrange, arg2, arg5, arg1);
				}
			} else if (arg3 >= 12) {
				ModelSource var27;
				if (var15.anim == -1 && var15.multiloc == null) {
					var27 = var15.getModel(arg3, arg5, var10, var11, var12, var13, -1);
				} else {
					var27 = new ClientLocAnim(arg4, arg3, var11, var15.anim, var13, true, arg5, var12, (byte) -59, var10);
				}
				arg6.addScenery(arg0, 1, 1, var17, arg2, var14, var16, 0, var27, arg1);
				if (arg3 >= 12 && arg3 <= 17 && arg3 != 13 && arg0 > 0) {
					this.mapo[arg0][arg2][arg1] |= 0x924;
				}
				if (var15.blockwalk && arg7 != null) {
					arg7.addLoc(var15.width, var15.length, var15.blockrange, arg2, arg5, arg1);
				}
			} else if (arg3 == 0) {
				ModelSource var28;
				if (var15.anim == -1 && var15.multiloc == null) {
					var28 = var15.getModel(0, arg5, var10, var11, var12, var13, -1);
				} else {
					var28 = new ClientLocAnim(arg4, 0, var11, var15.anim, var13, true, arg5, var12, (byte) -59, var10);
				}
				arg6.setWall(WSHAPE0[arg5], arg1, null, var28, var16, 0, arg0, var14, var17, arg2);
				if (arg5 == 0) {
					if (var15.shadow) {
						this.shadow[arg0][arg2][arg1] = 50;
						this.shadow[arg0][arg2][arg1 + 1] = 50;
					}
					if (var15.occlude) {
						this.mapo[arg0][arg2][arg1] |= 0x249;
					}
				} else if (arg5 == 1) {
					if (var15.shadow) {
						this.shadow[arg0][arg2][arg1 + 1] = 50;
						this.shadow[arg0][arg2 + 1][arg1 + 1] = 50;
					}
					if (var15.occlude) {
						this.mapo[arg0][arg2][arg1 + 1] |= 0x492;
					}
				} else if (arg5 == 2) {
					if (var15.shadow) {
						this.shadow[arg0][arg2 + 1][arg1] = 50;
						this.shadow[arg0][arg2 + 1][arg1 + 1] = 50;
					}
					if (var15.occlude) {
						this.mapo[arg0][arg2 + 1][arg1] |= 0x249;
					}
				} else if (arg5 == 3) {
					if (var15.shadow) {
						this.shadow[arg0][arg2][arg1] = 50;
						this.shadow[arg0][arg2 + 1][arg1] = 50;
					}
					if (var15.occlude) {
						this.mapo[arg0][arg2][arg1] |= 0x492;
					}
				}
				if (var15.blockwalk && arg7 != null) {
					arg7.addWall(arg3, arg2, var15.blockrange, arg5, arg1);
				}
				if (var15.wallWidth != 16) {
					arg6.moveDecor(arg0, arg1, arg2, var15.wallWidth);
				}
			} else if (arg3 == 1) {
				ModelSource var29;
				if (var15.anim == -1 && var15.multiloc == null) {
					var29 = var15.getModel(1, arg5, var10, var11, var12, var13, -1);
				} else {
					var29 = new ClientLocAnim(arg4, 1, var11, var15.anim, var13, true, arg5, var12, (byte) -59, var10);
				}
				arg6.setWall(WSHAPE1[arg5], arg1, null, var29, var16, 0, arg0, var14, var17, arg2);
				if (var15.shadow) {
					if (arg5 == 0) {
						this.shadow[arg0][arg2][arg1 + 1] = 50;
					} else if (arg5 == 1) {
						this.shadow[arg0][arg2 + 1][arg1 + 1] = 50;
					} else if (arg5 == 2) {
						this.shadow[arg0][arg2 + 1][arg1] = 50;
					} else if (arg5 == 3) {
						this.shadow[arg0][arg2][arg1] = 50;
					}
				}
				if (var15.blockwalk && arg7 != null) {
					arg7.addWall(arg3, arg2, var15.blockrange, arg5, arg1);
				}
			} else if (arg3 == 2) {
				int var30 = arg5 + 1 & 0x3;
				ModelSource var31;
				ModelSource var32;
				if (var15.anim == -1 && var15.multiloc == null) {
					var31 = var15.getModel(2, arg5 + 4, var10, var11, var12, var13, -1);
					var32 = var15.getModel(2, var30, var10, var11, var12, var13, -1);
				} else {
					var31 = new ClientLocAnim(arg4, 2, var11, var15.anim, var13, true, arg5 + 4, var12, (byte) -59, var10);
					var32 = new ClientLocAnim(arg4, 2, var11, var15.anim, var13, true, var30, var12, (byte) -59, var10);
				}
				arg6.setWall(WSHAPE0[arg5], arg1, var32, var31, var16, WSHAPE0[var30], arg0, var14, var17, arg2);
				if (var15.occlude) {
					if (arg5 == 0) {
						this.mapo[arg0][arg2][arg1] |= 0x249;
						this.mapo[arg0][arg2][arg1 + 1] |= 0x492;
					} else if (arg5 == 1) {
						this.mapo[arg0][arg2][arg1 + 1] |= 0x492;
						this.mapo[arg0][arg2 + 1][arg1] |= 0x249;
					} else if (arg5 == 2) {
						this.mapo[arg0][arg2 + 1][arg1] |= 0x249;
						this.mapo[arg0][arg2][arg1] |= 0x492;
					} else if (arg5 == 3) {
						this.mapo[arg0][arg2][arg1] |= 0x492;
						this.mapo[arg0][arg2][arg1] |= 0x249;
					}
				}
				if (var15.blockwalk && arg7 != null) {
					arg7.addWall(arg3, arg2, var15.blockrange, arg5, arg1);
				}
				if (var15.wallWidth != 16) {
					arg6.moveDecor(arg0, arg1, arg2, var15.wallWidth);
				}
			} else if (arg3 == 3) {
				ModelSource var33;
				if (var15.anim == -1 && var15.multiloc == null) {
					var33 = var15.getModel(3, arg5, var10, var11, var12, var13, -1);
				} else {
					var33 = new ClientLocAnim(arg4, 3, var11, var15.anim, var13, true, arg5, var12, (byte) -59, var10);
				}
				arg6.setWall(WSHAPE1[arg5], arg1, null, var33, var16, 0, arg0, var14, var17, arg2);
				if (var15.shadow) {
					if (arg5 == 0) {
						this.shadow[arg0][arg2][arg1 + 1] = 50;
					} else if (arg5 == 1) {
						this.shadow[arg0][arg2 + 1][arg1 + 1] = 50;
					} else if (arg5 == 2) {
						this.shadow[arg0][arg2 + 1][arg1] = 50;
					} else if (arg5 == 3) {
						this.shadow[arg0][arg2][arg1] = 50;
					}
				}
				if (var15.blockwalk && arg7 != null) {
					arg7.addWall(arg3, arg2, var15.blockrange, arg5, arg1);
				}
			} else if (arg3 == 9) {
				ModelSource var34;
				if (var15.anim == -1 && var15.multiloc == null) {
					var34 = var15.getModel(arg3, arg5, var10, var11, var12, var13, -1);
				} else {
					var34 = new ClientLocAnim(arg4, arg3, var11, var15.anim, var13, true, arg5, var12, (byte) -59, var10);
				}
				arg6.addScenery(arg0, 1, 1, var17, arg2, var14, var16, 0, var34, arg1);
				if (var15.blockwalk && arg7 != null) {
					arg7.addLoc(var15.width, var15.length, var15.blockrange, arg2, arg5, arg1);
				}
			} else {
				if (var15.hillskew) {
					if (arg5 == 1) {
						int var35 = var13;
						var13 = var12;
						var12 = var11;
						var11 = var10;
						var10 = var35;
					} else if (arg5 == 2) {
						int var36 = var13;
						var13 = var11;
						var11 = var36;
						int var37 = var12;
						var12 = var10;
						var10 = var37;
					} else if (arg5 == 3) {
						int var38 = var13;
						var13 = var10;
						var10 = var11;
						var11 = var12;
						var12 = var38;
					}
				}
				if (arg3 == 4) {
					ModelSource var39;
					if (var15.anim == -1 && var15.multiloc == null) {
						var39 = var15.getModel(4, 0, var10, var11, var12, var13, -1);
					} else {
						var39 = new ClientLocAnim(arg4, 4, var11, var15.anim, var13, true, 0, var12, (byte) -59, var10);
					}
					arg6.setDecor(0, var14, arg1, WSHAPE0[arg5], var16, 0, arg5 * 512, var39, arg2, var17, arg0);
				} else if (arg3 == 5) {
					int var40 = 16;
					int var41 = arg6.wallType(arg0, arg2, arg1);
					if (var41 > 0) {
						var40 = LocType.list(var41 >> 14 & 0x7FFF).wallWidth;
					}
					ModelSource var42;
					if (var15.anim == -1 && var15.multiloc == null) {
						var42 = var15.getModel(4, 0, var10, var11, var12, var13, -1);
					} else {
						var42 = new ClientLocAnim(arg4, 4, var11, var15.anim, var13, true, 0, var12, (byte) -59, var10);
					}
					arg6.setDecor(DECORXOF[arg5] * var40, var14, arg1, WSHAPE0[arg5], var16, DECORZOF[arg5] * var40, arg5 * 512, var42, arg2, var17, arg0);
				} else if (arg3 == 6) {
					ModelSource var43;
					if (var15.anim == -1 && var15.multiloc == null) {
						var43 = var15.getModel(4, 0, var10, var11, var12, var13, -1);
					} else {
						var43 = new ClientLocAnim(arg4, 4, var11, var15.anim, var13, true, 0, var12, (byte) -59, var10);
					}
					arg6.setDecor(0, var14, arg1, 256, var16, 0, arg5, var43, arg2, var17, arg0);
				} else if (arg3 == 7) {
					ModelSource var44;
					if (var15.anim == -1 && var15.multiloc == null) {
						var44 = var15.getModel(4, 0, var10, var11, var12, var13, -1);
					} else {
						var44 = new ClientLocAnim(arg4, 4, var11, var15.anim, var13, true, 0, var12, (byte) -59, var10);
					}
					arg6.setDecor(0, var14, arg1, 512, var16, 0, arg5, var44, arg2, var17, arg0);
				} else if (arg3 == 8) {
					ModelSource var45;
					if (var15.anim == -1 && var15.multiloc == null) {
						var45 = var15.getModel(4, 0, var10, var11, var12, var13, -1);
					} else {
						var45 = new ClientLocAnim(arg4, 4, var11, var15.anim, var13, true, 0, var12, (byte) -59, var10);
					}
					arg6.setDecor(0, var14, arg1, 768, var16, 0, arg5, var45, arg2, var17, arg0);
				}
			}
		} catch (RuntimeException var47) {
			signlink.reporterror("54363, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + var47.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("OZIFXWPH.a([LDYTTVJNT;ZLXOHMKFIT;)V")
	public void finishBuild(CollisionMap[] arg0, World arg1) {
		try {
			for (int var3 = 0; var3 < 4; var3++) {
				for (int var4 = 0; var4 < 104; var4++) {
					for (int var5 = 0; var5 < 104; var5++) {
						if ((this.mapl[var3][var4][var5] & 0x1) == 1) {
							int var6 = var3;
							if ((this.mapl[1][var4][var5] & 0x2) == 2) {
								var6 = var3 - 1;
							}
							if (var6 >= 0) {
								arg0[var6].blockGround(var4, var5);
							}
						}
					}
				}
			}
			hueOff += (int) (Math.random() * 5.0D) - 2;
			if (hueOff < -8) {
				hueOff = -8;
			}
			if (hueOff > 8) {
				hueOff = 8;
			}
			ligOff += (int) (Math.random() * 5.0D) - 2;
			if (ligOff < -16) {
				ligOff = -16;
			}
			if (ligOff > 16) {
				ligOff = 16;
			}
			for (int var7 = 0; var7 < 4; var7++) {
				byte[][] var8 = this.shadow[var7];
				int var9 = (int) Math.sqrt((double) 5100);
				int var10 = var9 * 768 >> 8;
				for (int var11 = 1; var11 < this.maxTileZ - 1; var11++) {
					for (int var12 = 1; var12 < this.maxTileX - 1; var12++) {
						int var13 = this.groundh[var7][var12 + 1][var11] - this.groundh[var7][var12 - 1][var11];
						int var14 = this.groundh[var7][var12][var11 + 1] - this.groundh[var7][var12][var11 - 1];
						int var15 = (int) Math.sqrt((double) (var13 * var13 + var14 * var14 + 65536));
						int var16 = (var13 << 8) / var15;
						int var17 = 65536 / var15;
						int var18 = (var14 << 8) / var15;
						int var19 = (var16 * -50 + var17 * -10 + var18 * -50) / var10 + 96;
						int var20 = (var8[var12 - 1][var11] >> 2) + (var8[var12 + 1][var11] >> 3) + (var8[var12][var11 - 1] >> 2) + (var8[var12][var11 + 1] >> 3) + (var8[var12][var11] >> 1);
						this.lightmap[var12][var11] = var19 - var20;
					}
				}
				for (int var21 = 0; var21 < this.maxTileZ; var21++) {
					this.huetot[var21] = 0;
					this.sattot[var21] = 0;
					this.ligtot[var21] = 0;
					this.comtot[var21] = 0;
					this.tot[var21] = 0;
				}
				for (int var22 = -5; var22 < this.maxTileX + 5; var22++) {
					for (int var23 = 0; var23 < this.maxTileZ; var23++) {
						int var24 = var22 + 5;
						int var10002;
						if (var24 >= 0 && var24 < this.maxTileX) {
							int var25 = this.floort1[var7][var24][var23] & 0xFF;
							if (var25 > 0) {
								FloType var26 = FloType.list[var25 - 1];
								this.huetot[var23] += var26.underlayHue;
								this.sattot[var23] += var26.saturation;
								this.ligtot[var23] += var26.lightness;
								this.comtot[var23] += var26.chroma;
								var10002 = this.tot[var23]++;
							}
						}
						int var27 = var22 - 5;
						if (var27 >= 0 && var27 < this.maxTileX) {
							int var28 = this.floort1[var7][var27][var23] & 0xFF;
							if (var28 > 0) {
								FloType var29 = FloType.list[var28 - 1];
								this.huetot[var23] -= var29.underlayHue;
								this.sattot[var23] -= var29.saturation;
								this.ligtot[var23] -= var29.lightness;
								this.comtot[var23] -= var29.chroma;
								var10002 = this.tot[var23]--;
							}
						}
					}
					if (var22 >= 1 && var22 < this.maxTileX - 1) {
						int var30 = 0;
						int var31 = 0;
						int var32 = 0;
						int var33 = 0;
						int var34 = 0;
						for (int var35 = -5; var35 < this.maxTileZ + 5; var35++) {
							int var36 = var35 + 5;
							if (var36 >= 0 && var36 < this.maxTileZ) {
								var30 += this.huetot[var36];
								var31 += this.sattot[var36];
								var32 += this.ligtot[var36];
								var33 += this.comtot[var36];
								var34 += this.tot[var36];
							}
							int var37 = var35 - 5;
							if (var37 >= 0 && var37 < this.maxTileZ) {
								var30 -= this.huetot[var37];
								var31 -= this.sattot[var37];
								var32 -= this.ligtot[var37];
								var33 -= this.comtot[var37];
								var34 -= this.tot[var37];
							}
							if (var35 >= 1 && var35 < this.maxTileZ - 1 && (!lowMem || (this.mapl[0][var22][var35] & 0x2) != 0 || (this.mapl[var7][var22][var35] & 0x10) == 0 && this.getVisBelowLevel(var22, var35, var7) == minusedLevel)) {
								if (var7 < field1239) {
									field1239 = var7;
								}
								int var38 = this.floort1[var7][var22][var35] & 0xFF;
								int var39 = this.floort2[var7][var22][var35] & 0xFF;
								if (var38 > 0 || var39 > 0) {
									int var40 = this.groundh[var7][var22][var35];
									int var41 = this.groundh[var7][var22 + 1][var35];
									int var42 = this.groundh[var7][var22 + 1][var35 + 1];
									int var43 = this.groundh[var7][var22][var35 + 1];
									int var44 = this.lightmap[var22][var35];
									int var45 = this.lightmap[var22 + 1][var35];
									int var46 = this.lightmap[var22 + 1][var35 + 1];
									int var47 = this.lightmap[var22][var35 + 1];
									int var48 = -1;
									int var49 = -1;
									if (var38 > 0) {
										int var50 = var30 * 256 / var33;
										int var51 = var31 / var34;
										int var52 = var32 / var34;
										var48 = this.getTable(var50, var51, var52);
										int var53 = var50 + hueOff & 0xFF;
										int var54 = var52 + ligOff;
										if (var54 < 0) {
											var54 = 0;
										} else if (var54 > 255) {
											var54 = 255;
										}
										var49 = this.getTable(var53, var51, var54);
									}
									if (var7 > 0) {
										boolean var55 = true;
										if (var38 == 0 && this.floors[var7][var22][var35] != 0) {
											var55 = false;
										}
										if (var39 > 0 && !FloType.list[var39 - 1].occlude) {
											var55 = false;
										}
										if (var55 && var40 == var41 && var40 == var42 && var40 == var43) {
											this.mapo[var7][var22][var35] |= 0x924;
										}
									}
									int var56 = 0;
									if (var48 != -1) {
										var56 = Pix3D.colourTable[getUCol(var49, 96)];
									}
									if (var39 == 0) {
										arg1.method533(var7, var22, var35, 0, 0, -1, var40, var41, var42, var43, getUCol(var48, var44), getUCol(var48, var45), getUCol(var48, var46), getUCol(var48, var47), 0, 0, 0, 0, var56, 0);
									} else {
										int var57 = this.floors[var7][var22][var35] + 1;
										byte var58 = this.floorr[var7][var22][var35];
										FloType var59 = FloType.list[var39 - 1];
										int var60 = var59.texture;
										int var61;
										int var62;
										if (var60 >= 0) {
											var61 = Pix3D.getTextureAverage(this.field1242, var60);
											var62 = -1;
										} else if (var59.colour == 16711935) {
											var61 = 0;
											var62 = -2;
											var60 = -1;
										} else {
											var62 = this.getTable(var59.hue, var59.saturation, var59.lightness);
											var61 = Pix3D.colourTable[this.getOCol(var59.underlayHsl, 96)];
										}
										arg1.method533(var7, var22, var35, var57, var58, var60, var40, var41, var42, var43, getUCol(var48, var44), getUCol(var48, var45), getUCol(var48, var46), getUCol(var48, var47), this.getOCol(var62, var44), this.getOCol(var62, var45), this.getOCol(var62, var46), this.getOCol(var62, var47), var56, var61);
									}
								}
							}
						}
					}
				}
				for (int var63 = 1; var63 < this.maxTileZ - 1; var63++) {
					for (int var64 = 1; var64 < this.maxTileX - 1; var64++) {
						arg1.method532(var7, var64, var63, this.getVisBelowLevel(var64, var63, var7));
					}
				}
			}
			arg1.method559();
			for (int var65 = 0; var65 < this.maxTileX; var65++) {
				for (int var66 = 0; var66 < this.maxTileZ; var66++) {
					if ((this.mapl[1][var65][var66] & 0x2) == 2) {
						arg1.method530(var66, var65);
					}
				}
			}
			int var67 = 1;
			int var68 = 2;
			int var69 = 4;
			for (int var70 = 0; var70 < 4; var70++) {
				if (var70 > 0) {
					var67 <<= 0x3;
					var68 <<= 0x3;
					var69 <<= 0x3;
				}
				for (int var71 = 0; var71 <= var70; var71++) {
					for (int var72 = 0; var72 <= this.maxTileZ; var72++) {
						for (int var73 = 0; var73 <= this.maxTileX; var73++) {
							if ((this.mapo[var71][var73][var72] & var67) != 0) {
								int var74 = var72;
								int var75 = var72;
								int var76 = var71;
								int var77 = var71;
								while (var74 > 0 && (this.mapo[var71][var73][var74 - 1] & var67) != 0) {
									var74--;
								}
								while (var75 < this.maxTileZ && (this.mapo[var71][var73][var75 + 1] & var67) != 0) {
									var75++;
								}
								label328: while (var76 > 0) {
									for (int var78 = var74; var78 <= var75; var78++) {
										if ((this.mapo[var76 - 1][var73][var78] & var67) == 0) {
											break label328;
										}
									}
									var76--;
								}
								label317: while (var77 < var70) {
									for (int var79 = var74; var79 <= var75; var79++) {
										if ((this.mapo[var77 + 1][var73][var79] & var67) == 0) {
											break label317;
										}
									}
									var77++;
								}
								int var80 = (var77 + 1 - var76) * (var75 + 1 - var74);
								if (var80 >= 8) {
									int var81 = this.groundh[var77][var73][var74] - 240;
									int var82 = this.groundh[var76][var73][var74];
									World.setOcclude(var75 * 128 + 128, var81, 1, var73 * 128, var82, var74 * 128, (byte) 5, var73 * 128, var70);
									for (int var83 = var76; var83 <= var77; var83++) {
										for (int var84 = var74; var84 <= var75; var84++) {
											this.mapo[var83][var73][var84] &= ~var67;
										}
									}
								}
							}
							if ((this.mapo[var71][var73][var72] & var68) != 0) {
								int var85 = var73;
								int var86 = var73;
								int var87 = var71;
								int var88 = var71;
								while (var85 > 0 && (this.mapo[var71][var85 - 1][var72] & var68) != 0) {
									var85--;
								}
								while (var86 < this.maxTileX && (this.mapo[var71][var86 + 1][var72] & var68) != 0) {
									var86++;
								}
								label381: while (var87 > 0) {
									for (int var89 = var85; var89 <= var86; var89++) {
										if ((this.mapo[var87 - 1][var89][var72] & var68) == 0) {
											break label381;
										}
									}
									var87--;
								}
								label370: while (var88 < var70) {
									for (int var90 = var85; var90 <= var86; var90++) {
										if ((this.mapo[var88 + 1][var90][var72] & var68) == 0) {
											break label370;
										}
									}
									var88++;
								}
								int var91 = (var88 + 1 - var87) * (var86 + 1 - var85);
								if (var91 >= 8) {
									int var92 = this.groundh[var88][var85][var72] - 240;
									int var93 = this.groundh[var87][var85][var72];
									World.setOcclude(var72 * 128, var92, 2, var86 * 128 + 128, var93, var72 * 128, (byte) 5, var85 * 128, var70);
									for (int var94 = var87; var94 <= var88; var94++) {
										for (int var95 = var85; var95 <= var86; var95++) {
											this.mapo[var94][var95][var72] &= ~var68;
										}
									}
								}
							}
							if ((this.mapo[var71][var73][var72] & var69) != 0) {
								int var96 = var73;
								int var97 = var73;
								int var98 = var72;
								int var99 = var72;
								while (var98 > 0 && (this.mapo[var71][var73][var98 - 1] & var69) != 0) {
									var98--;
								}
								while (var99 < this.maxTileZ && (this.mapo[var71][var73][var99 + 1] & var69) != 0) {
									var99++;
								}
								label434: while (var96 > 0) {
									for (int var100 = var98; var100 <= var99; var100++) {
										if ((this.mapo[var71][var96 - 1][var100] & var69) == 0) {
											break label434;
										}
									}
									var96--;
								}
								label423: while (var97 < this.maxTileX) {
									for (int var101 = var98; var101 <= var99; var101++) {
										if ((this.mapo[var71][var97 + 1][var101] & var69) == 0) {
											break label423;
										}
									}
									var97++;
								}
								if ((var97 + 1 - var96) * (var99 + 1 - var98) >= 4) {
									int var102 = this.groundh[var71][var96][var98];
									World.setOcclude(var99 * 128 + 128, var102, 4, var97 * 128 + 128, var102, var98 * 128, (byte) 5, var96 * 128, var70);
									for (int var103 = var96; var103 <= var97; var103++) {
										for (int var104 = var98; var104 <= var99; var104++) {
											this.mapo[var71][var103][var104] &= ~var69;
										}
									}
								}
							}
						}
					}
				}
			}
		} catch (RuntimeException var106) {
			signlink.reporterror("79814, " + arg0 + ", " + false + ", " + arg1 + ", " + var106.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("OZIFXWPH.a(II)I")
	public static int perlinNoise(int arg0, int arg1) {
		int var2 = interpolatedNoise(arg0 + 45365, arg1 + 91923, 4) + (interpolatedNoise(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (interpolatedNoise(arg0, arg1, 1) - 128 >> 2) - 128;
		int var3 = (int) ((double) var2 * 0.3D) + 35;
		if (var3 < 10) {
			var3 = 10;
		} else if (var3 > 60) {
			var3 = 60;
		}
		return var3;
	}

	@ObfuscatedName("OZIFXWPH.b(III)I")
	public static int interpolatedNoise(int arg0, int arg1, int arg2) {
		int var3 = arg0 / arg2;
		int var4 = arg0 & arg2 - 1;
		int var5 = arg1 / arg2;
		int var6 = arg1 & arg2 - 1;
		int var7 = smoothNoise(var3, var5);
		int var8 = smoothNoise(var3 + 1, var5);
		int var9 = smoothNoise(var3, var5 + 1);
		int var10 = smoothNoise(var3 + 1, var5 + 1);
		int var11 = interpolate(var7, var8, var4, arg2);
		int var12 = interpolate(var9, var10, var4, arg2);
		return interpolate(var11, var12, var6, arg2);
	}

	@ObfuscatedName("OZIFXWPH.b(II)I")
	public static int smoothNoise(int arg0, int arg1) {
		int var2 = noise(arg0 - 1, arg1 - 1) + noise(arg0 + 1, arg1 - 1) + noise(arg0 - 1, arg1 + 1) + noise(arg0 + 1, arg1 + 1);
		int var3 = noise(arg0 - 1, arg1) + noise(arg0 + 1, arg1) + noise(arg0, arg1 - 1) + noise(arg0, arg1 + 1);
		int var4 = noise(arg0, arg1);
		return var2 / 16 + var3 / 8 + var4 / 4;
	}

	@ObfuscatedName("OZIFXWPH.e(II)I")
	public static int noise(int arg0, int arg1) {
		int var2 = arg0 + arg1 * 57;
		int var3 = var2 << 13 ^ var2;
		int var4 = var3 * (var3 * var3 * 15731 + 789221) + 1376312589 & Integer.MAX_VALUE;
		return var4 >> 19 & 0xFF;
	}

	@ObfuscatedName("OZIFXWPH.c(II)I")
	public static int getUCol(int arg0, int arg1) {
		if (arg0 == -1) {
			return 12345678;
		}
		int var2 = arg1 * (arg0 & 0x7F) / 128;
		if (var2 < 2) {
			var2 = 2;
		} else if (var2 > 126) {
			var2 = 126;
		}
		return (arg0 & 0xFF80) + var2;
	}

	@ObfuscatedName("OZIFXWPH.d(II)I")
	public int getOCol(int arg0, int arg1) {
		if (arg0 == -2) {
			return 12345678;
		} else if (arg0 == -1) {
			if (arg1 < 0) {
				arg1 = 0;
			} else if (arg1 > 127) {
				arg1 = 127;
			}
			return 127 - arg1;
		} else {
			int var4 = arg1 * (arg0 & 0x7F) / 128;
			if (var4 < 2) {
				var4 = 2;
			} else if (var4 > 126) {
				var4 = 126;
			}
			return (arg0 & 0xFF80) + var4;
		}
	}

	@ObfuscatedName("OZIFXWPH.a(III)I")
	public int getTable(int arg0, int arg1, int arg2) {
		if (arg2 > 179) {
			arg1 /= 2;
		}
		if (arg2 > 192) {
			arg1 /= 2;
		}
		if (arg2 > 217) {
			arg1 /= 2;
		}
		if (arg2 > 243) {
			arg1 /= 2;
		}
		return (arg0 / 4 << 10) + (arg1 / 32 << 7) + arg2 / 2;
	}

	@ObfuscatedName("OZIFXWPH.c(III)Z")
	public static boolean changeLocAvailable(int arg0, int arg1) {
		try {
			LocType var2 = LocType.list(arg1);
			if (arg0 == 11) {
				arg0 = 10;
			}
			if (arg0 >= 5 && arg0 <= 8) {
				arg0 = 4;
			}
			return var2.checkModel(arg0);
		} catch (RuntimeException var4) {
			signlink.reporterror("19202, " + arg0 + ", " + -11550 + ", " + arg1 + ", " + var4.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("OZIFXWPH.a(ILEILHLJCE;LYSAVREBH;)V")
	public static void prefectLocations(Packet arg0, OnDemand arg1) {
		try {
			int var2 = -1;
			while (true) {
				int var3 = arg0.gsmart();
				if (var3 == 0) {
					return;
				}
				var2 += var3;
				LocType var4 = LocType.list(var2);
				var4.prefetchModelAll(arg1);
				while (true) {
					int var5 = arg0.gsmart();
					if (var5 == 0) {
						break;
					}
					arg0.g1();
				}
			}
		} catch (RuntimeException var7) {
			signlink.reporterror("14250, " + ", " + arg0 + ", " + arg1 + ", " + var7.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("OZIFXWPH.a(IIII)I")
	public static int interpolate(int arg0, int arg1, int arg2, int arg3) {
		int var4 = 65536 - Pix3D.cosTable[arg2 * 1024 / arg3] >> 1;
		return (arg0 * (65536 - var4) >> 16) + (arg1 * var4 >> 16);
	}

	@ObfuscatedName("OZIFXWPH.a(IIIZ)I")
	public int getVisBelowLevel(int arg0, int arg1, int arg2) {
		try {
			if ((this.mapl[arg2][arg0][arg1] & 0x8) == 0) {
				return arg2 <= 0 || (this.mapl[1][arg0][arg1] & 0x2) == 0 ? arg2 : arg2 - 1;
			} else {
				return 0;
			}
		} catch (RuntimeException var5) {
			signlink.reporterror("68178, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + false + ", " + var5.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("OZIFXWPH.a(IIILXOHMKFIT;II[B[LDYTTVJNT;ZII)V")
	public void loadLocations(int arg0, int arg1, int arg2, World arg3, int arg4, int arg5, byte[] arg6, CollisionMap[] arg7, int arg8, int arg9) {
		try {
			Packet var11 = new Packet(arg6, -26583);
			int var12 = -1;
			while (true) {
				int var13 = var11.gsmart();
				if (var13 == 0) {
					return;
				}
				var12 += var13;
				int var14 = 0;
				while (true) {
					int var15 = var11.gsmart();
					if (var15 == 0) {
						break;
					}
					var14 += var15 - 1;
					int var16 = var14 & 0x3F;
					int var17 = var14 >> 6 & 0x3F;
					int var18 = var14 >> 12;
					int var19 = var11.g1();
					int var20 = var19 >> 2;
					int var21 = var19 & 0x3;
					if (var18 == arg2 && var17 >= arg5 && var17 < arg5 + 8 && var16 >= arg4 && var16 < arg4 + 8) {
						LocType var22 = LocType.list(var12);
						int var23 = arg0 + RegionRotate.DX(arg9, var16 & 0x7, var17 & 0x7, var21, var22.length, var22.width);
						int var24 = arg8 + RegionRotate.DZ(var22.length, var21, arg9, var17 & 0x7, var22.width, var16 & 0x7, 825);
						if (var23 > 0 && var24 > 0 && var23 < 103 && var24 < 103) {
							int var25 = arg1;
							if ((this.mapl[1][var23][var24] & 0x2) == 2) {
								var25 = arg1 - 1;
							}
							CollisionMap var26 = null;
							if (var25 >= 0) {
								var26 = arg7[var25];
							}
							this.addLoc(arg1, var24, var23, var20, var12, var21 + arg9 & 0x3, arg3, var26, this.field1215);
						}
					}
				}
			}
		} catch (RuntimeException var28) {
			signlink.reporterror("51697, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + false + ", " + arg8 + ", " + arg9 + ", " + var28.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("OZIFXWPH.a(IIII[LDYTTVJNT;I[BZII)V")
	public void method434(int arg0, int arg1, int arg2, int arg3, CollisionMap[] arg4, int arg5, byte[] arg6, int arg7, int arg8) {
		try {
			for (int var10 = 0; var10 < 8; var10++) {
				for (int var11 = 0; var11 < 8; var11++) {
					if (arg7 + var10 > 0 && arg7 + var10 < 103 && arg8 + var11 > 0 && arg8 + var11 < 103) {
						arg4[arg3].flags[arg7 + var10][arg8 + var11] &= 0xFEFFFFFF;
					}
				}
			}
			Packet var12 = new Packet(arg6, -26583);
			for (int var13 = 0; var13 < 4; var13++) {
				for (int var14 = 0; var14 < 64; var14++) {
					for (int var15 = 0; var15 < 64; var15++) {
						if (var13 == arg0 && var14 >= arg1 && var14 < arg1 + 8 && var15 >= arg5 && var15 < arg5 + 8) {
							this.loadGround((byte) 3, arg8 + RegionRotate.DZ(var14 & 0x7, var15 & 0x7, arg2), arg7 + RegionRotate.DX(var15 & 0x7, var14 & 0x7, arg2), 0, var12, arg3, 0, arg2);
						} else {
							this.loadGround((byte) 3, -1, -1, 0, var12, 0, 0, 0);
						}
					}
				}
			}
		} catch (RuntimeException var17) {
			signlink.reporterror("36785, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + false + ", " + arg7 + ", " + arg8 + ", " + var17.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("OZIFXWPH.a(I[BIZ[LDYTTVJNT;II)V")
	public void method435(int arg0, byte[] arg1, int arg2, CollisionMap[] arg3, int arg4, int arg5) {
		try {
			for (int var7 = 0; var7 < 4; var7++) {
				for (int var8 = 0; var8 < 64; var8++) {
					for (int var9 = 0; var9 < 64; var9++) {
						if (arg5 + var8 > 0 && arg5 + var8 < 103 && arg0 + var9 > 0 && arg0 + var9 < 103) {
							arg3[var7].flags[arg5 + var8][arg0 + var9] &= 0xFEFFFFFF;
						}
					}
				}
			}
			Packet var10 = new Packet(arg1, -26583);
			for (int var11 = 0; var11 < 4; var11++) {
				for (int var12 = 0; var12 < 64; var12++) {
					for (int var13 = 0; var13 < 64; var13++) {
						this.loadGround((byte) 3, var13 + arg0, var12 + arg5, arg4, var10, var11, arg2, 0);
					}
				}
			}
		} catch (RuntimeException var15) {
			signlink.reporterror("64134, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + true + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + var15.toString());
			throw new RuntimeException();
		}
	}
}
