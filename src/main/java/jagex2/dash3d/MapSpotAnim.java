package jagex2.dash3d;

import deob.ObfuscatedName;
import jagex2.config.SpotType;
import sign.signlink;

@ObfuscatedName("YHTUMUXE")
public final class MapSpotAnim extends ModelSource {

	@ObfuscatedName("YHTUMUXE.o")
	public boolean animComplete = false;

	@ObfuscatedName("YHTUMUXE.s")
	public final int field1624 = 8;

	@ObfuscatedName("YHTUMUXE.t")
	public final byte field1625 = 29;

	@ObfuscatedName("YHTUMUXE.u")
	public int field1626 = -503;

	@ObfuscatedName("YHTUMUXE.r")
	public final SpotType type;

	@ObfuscatedName("YHTUMUXE.k")
	public final int field1616;

	@ObfuscatedName("YHTUMUXE.l")
	public final int field1617;

	@ObfuscatedName("YHTUMUXE.m")
	public final int field1618;

	@ObfuscatedName("YHTUMUXE.n")
	public final int field1619;

	@ObfuscatedName("YHTUMUXE.v")
	public final int startCycle;

	@ObfuscatedName("YHTUMUXE.p")
	public int animFrame;

	@ObfuscatedName("YHTUMUXE.q")
	public int animCycle;

	public MapSpotAnim(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7) {
		try {
			if (!arg3) {
				this.field1626 = -13;
			}
			this.type = SpotType.list[arg2];
			this.field1616 = arg5;
			this.field1617 = arg7;
			this.field1618 = arg0;
			this.field1619 = arg1;
			this.startCycle = arg4 + arg6;
			this.animComplete = false;
		} catch (RuntimeException var10) {
			signlink.reporterror("48084, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + var10.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("YHTUMUXE.a(I)LKBEXSZSN;")
	@Override
	public Model getTempModel() {
		try {
			Model var1 = this.type.getTempModel2();
			if (var1 == null) {
				return null;
			}
			int var2 = this.type.seq.frames[this.animFrame];
			Model var3 = new Model(false, 777, AnimFrame.animateTransparencies(var2), var1, true);
			if (!this.animComplete) {
				var3.prepareAnim(311);
				var3.animate(var2);
				var3.labelFaces = null;
				var3.labelVertices = null;
			}
			if (this.type.resizeh != 128 || this.type.resizev != 128) {
				var3.resize(this.field1625, this.type.resizeh, this.type.resizev, this.type.resizeh);
			}
			if (this.type.angle != 0) {
				if (this.type.angle == 90) {
					var3.rotate90();
				}
				if (this.type.angle == 180) {
					var3.rotate90();
					var3.rotate90();
				}
				if (this.type.angle == 270) {
					var3.rotate90();
					var3.rotate90();
					var3.rotate90();
				}
			}
			var3.calculateNormals(this.type.ambient + 64, this.type.contrast + 850, -30, -50, -30, true);
			return var3;
		} catch (RuntimeException var5) {
			signlink.reporterror("87099, " + ", " + var5.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("YHTUMUXE.a(II)V")
	public void method579(int arg0) {
		try {
			this.animCycle += arg0;
			if (this.field1624 > 8 || this.field1624 < 8) {
				this.field1626 = 397;
			}
			while (true) {
				do {
					do {
						if (this.animCycle <= this.type.seq.getDelay(this.animFrame)) {
							return;
						}
						this.animCycle -= this.type.seq.getDelay(this.animFrame) + 1;
						this.animFrame++;
					} while (this.animFrame < this.type.seq.numFrames);
				} while (this.animFrame >= 0 && this.animFrame < this.type.seq.numFrames);
				this.animFrame = 0;
				this.animComplete = true;
			}
		} catch (RuntimeException var3) {
			signlink.reporterror("75832, " + arg0 + ", " + 8 + ", " + var3.toString());
			throw new RuntimeException();
		}
	}
}
