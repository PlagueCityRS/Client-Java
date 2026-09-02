package jagex2.dash3d;

import deob.ObfuscatedName;
import jagex2.io.Packet;
import deob.client.Client;
import jagex2.config.*;
import jagex2.datastruct.JString;
import jagex2.datastruct.LruCache;
import sign.signlink;

@ObfuscatedName("AWOZVMFS")
public final class ClientPlayer extends ClientEntity {

	@ObfuscatedName("AWOZVMFS.Qb")
	public static LruCache modelCache = new LruCache((byte) 7, 260);

	@ObfuscatedName("AWOZVMFS.sb")
	public int field109 = -1;

	@ObfuscatedName("AWOZVMFS.ub")
	public final boolean field111 = true;

	@ObfuscatedName("AWOZVMFS.vb")
	public final int[] field112 = new int[5];

	@ObfuscatedName("AWOZVMFS.wb")
	public boolean field113 = false;

	@ObfuscatedName("AWOZVMFS.Fb")
	public final int[] appearance = new int[12];

	@ObfuscatedName("AWOZVMFS.Lb")
	public final byte field128 = 29;

	@ObfuscatedName("AWOZVMFS.Ob")
	public long field131 = -1L;

	@ObfuscatedName("AWOZVMFS.Pb")
	public boolean ready = false;

	@ObfuscatedName("AWOZVMFS.Rb")
	public int field134 = -1;

	@ObfuscatedName("AWOZVMFS.qb")
	public int locStartCycle;

	@ObfuscatedName("AWOZVMFS.rb")
	public int locStopCycle;

	@ObfuscatedName("AWOZVMFS.xb")
	public int skillLevel;

	@ObfuscatedName("AWOZVMFS.yb")
	public int field115;

	@ObfuscatedName("AWOZVMFS.zb")
	public int field116;

	@ObfuscatedName("AWOZVMFS.Ab")
	public int field117;

	@ObfuscatedName("AWOZVMFS.Bb")
	public int field118;

	@ObfuscatedName("AWOZVMFS.Cb")
	public int field119;

	@ObfuscatedName("AWOZVMFS.Db")
	public int y;

	@ObfuscatedName("AWOZVMFS.Eb")
	public int combatLevel;

	@ObfuscatedName("AWOZVMFS.Gb")
	public int field123;

	@ObfuscatedName("AWOZVMFS.Hb")
	public int field124;

	@ObfuscatedName("AWOZVMFS.Ib")
	public int field125;

	@ObfuscatedName("AWOZVMFS.Nb")
	public int field130;

	@ObfuscatedName("AWOZVMFS.tb")
	public long baseId;

	@ObfuscatedName("AWOZVMFS.Jb")
	public Model locModel;

	@ObfuscatedName("AWOZVMFS.Kb")
	public NpcType transmog;

	@ObfuscatedName("AWOZVMFS.Mb")
	public String name;

	@ObfuscatedName("AWOZVMFS.a(Z)Z")
	@Override
	public boolean isReady() {
		try {
			return this.ready;
		} catch (RuntimeException var2) {
			signlink.reporterror("8192, " + true + ", " + var2.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("AWOZVMFS.b(B)LKBEXSZSN;")
	public Model getTempModel2() {
		try {
			if (this.transmog != null) {
				int var1 = -1;
				if (super.primaryAnim >= 0 && super.primaryAnimDelay == 0) {
					var1 = SeqType.list[super.primaryAnim].frames[super.primaryFrame];
				} else if (super.secondaryAnim >= 0) {
					var1 = SeqType.list[super.secondaryAnim].frames[super.secondaryFrame];
				}
				return this.transmog.getTempModel(var1, -1, null);
			}
			long var3 = this.baseId;
			int var5 = -1;
			int var6 = -1;
			int var7 = -1;
			int var8 = -1;
			if (super.primaryAnim >= 0 && super.primaryAnimDelay == 0) {
				SeqType var9 = SeqType.list[super.primaryAnim];
				var5 = var9.frames[super.primaryFrame];
				if (super.secondaryAnim >= 0 && super.secondaryAnim != super.readyAnim) {
					var6 = SeqType.list[super.secondaryAnim].frames[super.secondaryFrame];
				}
				if (var9.replaceheldleft >= 0) {
					var7 = var9.replaceheldleft;
					var3 += var7 - this.appearance[5] << 8;
				}
				if (var9.replaceheldright >= 0) {
					var8 = var9.replaceheldright;
					var3 += var8 - this.appearance[3] << 16;
				}
			} else if (super.secondaryAnim >= 0) {
				var5 = SeqType.list[super.secondaryAnim].frames[super.secondaryFrame];
			}
			Model var10 = (Model) modelCache.find(var3);
			if (var10 == null) {
				boolean var11 = false;
				for (int var12 = 0; var12 < 12; var12++) {
					int var13 = this.appearance[var12];
					if (var8 >= 0 && var12 == 3) {
						var13 = var8;
					}
					if (var7 >= 0 && var12 == 5) {
						var13 = var7;
					}
					if (var13 >= 256 && var13 < 512 && !IdkType.list[var13 - 256].checkModel()) {
						var11 = true;
					}
					if (var13 >= 512 && !ObjType.list(var13 - 512).checkWearModel(this.field119)) {
						var11 = true;
					}
				}
				if (var11) {
					if (this.field131 != -1L) {
						var10 = (Model) modelCache.find(this.field131);
					}
					if (var10 == null) {
						return null;
					}
				}
			}
			if (var10 == null) {
				Model[] var14 = new Model[12];
				int var15 = 0;
				for (int var16 = 0; var16 < 12; var16++) {
					int var17 = this.appearance[var16];
					if (var8 >= 0 && var16 == 3) {
						var17 = var8;
					}
					if (var7 >= 0 && var16 == 5) {
						var17 = var7;
					}
					if (var17 >= 256 && var17 < 512) {
						Model var18 = IdkType.list[var17 - 256].getModelNoCheck();
						if (var18 != null) {
							var14[var15++] = var18;
						}
					}
					if (var17 >= 512) {
						Model var19 = ObjType.list(var17 - 512).getWearModelNoCheck(this.field119);
						if (var19 != null) {
							var14[var15++] = var19;
						}
					}
				}
				var10 = new Model(var15, var14, 5);
				for (int var20 = 0; var20 < 5; var20++) {
					if (this.field112[var20] != 0) {
						var10.recolour(Client.recol1d[var20][0], Client.recol1d[var20][this.field112[var20]]);
						if (var20 == 1) {
							var10.recolour(Client.recol2d[0], Client.recol2d[this.field112[var20]]);
						}
					}
				}
				var10.prepareAnim(311);
				var10.calculateNormals(64, 850, -30, -50, -30, true);
				modelCache.put((byte) 7, var3, var10);
				this.field131 = var3;
			}
			if (this.field113) {
				return var10;
			}
			Model var21 = Model.field996;
			var21.set(var10, AnimFrame.animateTransparencies(var5) & AnimFrame.animateTransparencies(var6));
			if (var5 != -1 && var6 != -1) {
				var21.maskAnimate(SeqType.list[super.primaryAnim].walkmerge, var6, var5);
			} else if (var5 != -1) {
				var21.animate(var5);
			}
			var21.calcBoundingCylinder();
			var21.labelFaces = null;
			var21.labelVertices = null;
			return var21;
		} catch (RuntimeException var23) {
			signlink.reporterror("88317, " + 9 + ", " + var23.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("AWOZVMFS.b(I)LKBEXSZSN;")
	public Model getHeadModel() {
		try {
			if (!this.ready) {
				return null;
			} else if (this.transmog == null) {
				boolean var1 = false;
				for (int var2 = 0; var2 < 12; var2++) {
					int var3 = this.appearance[var2];
					if (var3 >= 256 && var3 < 512 && !IdkType.list[var3 - 256].checkHead()) {
						var1 = true;
					}
					if (var3 >= 512 && !ObjType.list(var3 - 512).checkHeadModel(this.field119)) {
						var1 = true;
					}
				}
				if (var1) {
					return null;
				}
				Model[] var4 = new Model[12];
				int var5 = 0;
				for (int var6 = 0; var6 < 12; var6++) {
					int var7 = this.appearance[var6];
					if (var7 >= 256 && var7 < 512) {
						Model var8 = IdkType.list[var7 - 256].getHeadNoCheck();
						if (var8 != null) {
							var4[var5++] = var8;
						}
					}
					if (var7 >= 512) {
						Model var9 = ObjType.list(var7 - 512).getHeadModelNoCheck(this.field119);
						if (var9 != null) {
							var4[var5++] = var9;
						}
					}
				}
				Model var10 = new Model(var5, var4, 5);
				for (int var11 = 0; var11 < 5; var11++) {
					if (this.field112[var11] != 0) {
						var10.recolour(Client.recol1d[var11][0], Client.recol1d[var11][this.field112[var11]]);
						if (var11 == 1) {
							var10.recolour(Client.recol2d[0], Client.recol2d[this.field112[var11]]);
						}
					}
				}
				return var10;
			} else {
				return this.transmog.getHeadModel();
			}
		} catch (RuntimeException var13) {
			signlink.reporterror("40693, " + ", " + var13.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("AWOZVMFS.a(LEILHLJCE;I)V")
	public void setAppearance(Packet arg0, int arg1) {
		try {
			arg0.pos = 0;
			this.field119 = arg0.g1();
			this.field134 = arg0.g1b();
			this.field109 = arg0.g1b();
			this.transmog = null;
			this.field130 = 0;
			for (int var3 = 0; var3 < 12; var3++) {
				int var4 = arg0.g1();
				if (var4 == 0) {
					this.appearance[var3] = 0;
				} else {
					int var5 = arg0.g1();
					this.appearance[var3] = (var4 << 8) + var5;
					if (var3 == 0 && this.appearance[0] == 65535) {
						this.transmog = NpcType.list(arg0.g2());
						break;
					}
					if (this.appearance[var3] >= 512 && this.appearance[var3] - 512 < ObjType.numDefinitions) {
						int var6 = ObjType.list(this.appearance[var3] - 512).team;
						if (var6 != 0) {
							this.field130 = var6;
						}
					}
				}
			}
			for (int var7 = 0; var7 < 5; var7++) {
				int var8 = arg0.g1();
				if (var8 < 0 || var8 >= Client.recol1d[var7].length) {
					var8 = 0;
				}
				this.field112[var7] = var8;
			}
			super.readyAnim = arg0.g2();
			if (super.readyAnim == 65535) {
				super.readyAnim = -1;
			}
			super.field71 = arg0.g2();
			if (super.field71 == 65535) {
				super.field71 = -1;
			}
			super.field20 = arg0.g2();
			if (super.field20 == 65535) {
				super.field20 = -1;
			}
			super.field21 = arg0.g2();
			if (super.field21 == 65535) {
				super.field21 = -1;
			}
			super.field22 = arg0.g2();
			if (super.field22 == 65535) {
				super.field22 = -1;
			}
			super.field23 = arg0.g2();
			if (super.field23 == 65535) {
				super.field23 = -1;
			}
			super.field18 = arg0.g2();
			if (super.field18 == 65535) {
				super.field18 = -1;
			}
			this.name = JString.toSentenceCase(JString.toRawUsername(arg0.g8()));
			this.combatLevel = arg0.g1();
			this.skillLevel = arg0.g2();
			this.ready = true;
			this.baseId = 0L;
			int var9 = this.appearance[5];
			int var10 = this.appearance[9];
			this.appearance[5] = var10;
			this.appearance[9] = var9;
			for (int var11 = 0; var11 < 12; var11++) {
				this.baseId <<= 0x4;
				if (this.appearance[var11] >= 256) {
					this.baseId += this.appearance[var11] - 256;
				}
			}
			if (this.appearance[0] >= 256) {
				this.baseId += this.appearance[0] - 256 >> 4;
			}
			if (this.appearance[1] >= 256) {
				this.baseId += this.appearance[1] - 256 >> 8;
			}
			this.appearance[5] = var9;
			this.appearance[9] = var10;
			for (int var12 = 0; var12 < 5; var12++) {
				this.baseId <<= 0x3;
				this.baseId += this.field112[var12];
			}
			this.baseId <<= 0x1;
			int var15 = 36 / arg1;
			this.baseId += this.field119;
		} catch (RuntimeException var14) {
			signlink.reporterror("49178, " + arg0 + ", " + arg1 + ", " + var14.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("AWOZVMFS.a(I)LKBEXSZSN;")
	@Override
	public Model getTempModel() {
		try {
			if (!this.ready) {
				return null;
			}
			Model var1 = this.getTempModel2();
			if (var1 == null) {
				return null;
			}
			super.height = var1.minY;
			var1.useAABBMouseCheck = true;
			if (this.field113) {
				return var1;
			}
			if (super.spotanimId != -1 && super.spotanimFrame != -1) {
				SpotType var2 = SpotType.list[super.spotanimId];
				Model var3 = var2.getTempModel2();
				if (var3 != null) {
					Model var4 = new Model(false, 777, AnimFrame.animateTransparencies(super.spotanimFrame), var3, true);
					var4.translate(-super.field31, 0, 0);
					var4.prepareAnim(311);
					var4.animate(var2.seq.frames[super.spotanimFrame]);
					var4.labelFaces = null;
					var4.labelVertices = null;
					if (var2.resizeh != 128 || var2.resizev != 128) {
						var4.resize(this.field128, var2.resizeh, var2.resizev, var2.resizeh);
					}
					var4.calculateNormals(var2.ambient + 64, var2.contrast + 850, -30, -50, -30, true);
					Model[] var5 = new Model[] { var1, var4 };
					var1 = new Model(var5, 2, true, false);
				}
			}
			if (this.locModel != null) {
				if (Client.loopCycle >= this.locStopCycle) {
					this.locModel = null;
				}
				if (Client.loopCycle >= this.locStartCycle && Client.loopCycle < this.locStopCycle) {
					Model var6 = this.locModel;
					var6.translate(this.field124 - this.y, this.field123 - super.x, this.field125 - super.z);
					if (super.dstYaw == 512) {
						var6.rotate90();
						var6.rotate90();
						var6.rotate90();
					} else if (super.dstYaw == 1024) {
						var6.rotate90();
						var6.rotate90();
					} else if (super.dstYaw == 1536) {
						var6.rotate90();
					}
					Model[] var7 = new Model[] { var1, var6 };
					var1 = new Model(var7, 2, true, false);
					if (super.dstYaw == 512) {
						var6.rotate90();
					} else if (super.dstYaw == 1024) {
						var6.rotate90();
						var6.rotate90();
					} else if (super.dstYaw == 1536) {
						var6.rotate90();
						var6.rotate90();
						var6.rotate90();
					}
					var6.translate(this.y - this.field124, super.x - this.field123, super.z - this.field125);
				}
			}
			var1.useAABBMouseCheck = true;
			return var1;
		} catch (RuntimeException var9) {
			signlink.reporterror("65366, " + ", " + var9.toString());
			throw new RuntimeException();
		}
	}
}
