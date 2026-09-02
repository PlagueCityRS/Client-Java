package jagex2.dash3d;

import deob.ObfuscatedName;
import jagex2.config.NpcType;
import jagex2.config.SeqType;
import jagex2.config.SpotType;
import sign.signlink;

@ObfuscatedName("ONCZAQCQ")
public final class ClientNpc extends ClientEntity {

	@ObfuscatedName("ONCZAQCQ.qb")
	public final boolean field1209 = false;

	@ObfuscatedName("ONCZAQCQ.rb")
	public final byte field1210 = 29;

	@ObfuscatedName("ONCZAQCQ.sb")
	public final boolean field1211 = true;

	@ObfuscatedName("ONCZAQCQ.tb")
	public final int field1212 = 947;

	@ObfuscatedName("ONCZAQCQ.ub")
	public NpcType type;

	@ObfuscatedName("ONCZAQCQ.a(I)LKBEXSZSN;")
	@Override
	public Model getTempModel() {
		try {
			if (this.type == null) {
				return null;
			}
			Model var1 = this.getTempModel2();
			if (var1 == null) {
				return null;
			}
			super.height = var1.minY;
			if (super.spotanimId != -1 && super.spotanimFrame != -1) {
				SpotType var2 = SpotType.list[super.spotanimId];
				Model var3 = var2.getTempModel2();
				if (var3 != null) {
					int var4 = var2.seq.frames[super.spotanimFrame];
					Model var5 = new Model(false, 777, AnimFrame.animateTransparencies(var4), var3, true);
					var5.translate(-super.field31, 0, 0);
					var5.prepareAnim(311);
					var5.animate(var4);
					var5.labelFaces = null;
					var5.labelVertices = null;
					if (var2.resizeh != 128 || var2.resizev != 128) {
						var5.resize(this.field1210, var2.resizeh, var2.resizev, var2.resizeh);
					}
					var5.calculateNormals(var2.ambient + 64, var2.contrast + 850, -30, -50, -30, true);
					Model[] var6 = new Model[] { var1, var5 };
					var1 = new Model(var6, 2, true, false);
				}
			}
			if (this.type.size == 1) {
				var1.useAABBMouseCheck = true;
			}
			return var1;
		} catch (RuntimeException var8) {
			signlink.reporterror("59596, " + ", " + var8.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("ONCZAQCQ.b(B)LKBEXSZSN;")
	public Model getTempModel2() {
		try {
			if (super.primaryAnim < 0 || super.primaryAnimDelay != 0) {
				int var3 = -1;
				if (super.secondaryAnim >= 0) {
					var3 = SeqType.list[super.secondaryAnim].frames[super.secondaryFrame];
				}
				return this.type.getTempModel(var3, -1, null);
			}
			int var1 = SeqType.list[super.primaryAnim].frames[super.primaryFrame];
			int var2 = -1;
			if (super.secondaryAnim >= 0 && super.secondaryAnim != super.readyAnim) {
				var2 = SeqType.list[super.secondaryAnim].frames[super.secondaryFrame];
			}
			return this.type.getTempModel(var1, var2, SeqType.list[super.primaryAnim].walkmerge);
		} catch (RuntimeException var5) {
			signlink.reporterror("31326, " + 9 + ", " + var5.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("ONCZAQCQ.a(Z)Z")
	@Override
	public boolean isReady() {
		try {
			return this.type != null;
		} catch (RuntimeException var2) {
			signlink.reporterror("81071, " + true + ", " + var2.toString());
			throw new RuntimeException();
		}
	}
}
