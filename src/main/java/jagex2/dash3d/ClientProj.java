package jagex2.dash3d;

import deob.ObfuscatedName;
import jagex2.config.SpotType;
import sign.signlink;

@ObfuscatedName("QGPCEBJK")
public final class ClientProj extends ModelSource {

	@ObfuscatedName("QGPCEBJK.v")
	public final boolean field1283 = false;

	@ObfuscatedName("QGPCEBJK.w")
	public final byte field1284 = 29;

	@ObfuscatedName("QGPCEBJK.x")
	public boolean mobile = false;

	@ObfuscatedName("QGPCEBJK.H")
	public final SpotType spotanim;

	@ObfuscatedName("QGPCEBJK.t")
	public final int level;

	@ObfuscatedName("QGPCEBJK.m")
	public final int field1274;

	@ObfuscatedName("QGPCEBJK.n")
	public final int field1275;

	@ObfuscatedName("QGPCEBJK.o")
	public final int h1;

	@ObfuscatedName("QGPCEBJK.I")
	public final int t1;

	@ObfuscatedName("QGPCEBJK.J")
	public final int t2;

	@ObfuscatedName("QGPCEBJK.y")
	public final int angle;

	@ObfuscatedName("QGPCEBJK.z")
	public final int field1287;

	@ObfuscatedName("QGPCEBJK.A")
	public final int target;

	@ObfuscatedName("QGPCEBJK.p")
	public final int h2;

	@ObfuscatedName("QGPCEBJK.q")
	public double field1278;

	@ObfuscatedName("QGPCEBJK.r")
	public double field1279;

	@ObfuscatedName("QGPCEBJK.s")
	public double field1280;

	@ObfuscatedName("QGPCEBJK.u")
	public double accelerationY;

	@ObfuscatedName("QGPCEBJK.B")
	public double field1289;

	@ObfuscatedName("QGPCEBJK.C")
	public double field1290;

	@ObfuscatedName("QGPCEBJK.D")
	public double velocity;

	@ObfuscatedName("QGPCEBJK.E")
	public double velocitY;

	@ObfuscatedName("QGPCEBJK.k")
	public int animFrame;

	@ObfuscatedName("QGPCEBJK.l")
	public int animCycle;

	@ObfuscatedName("QGPCEBJK.F")
	public int yaw;

	@ObfuscatedName("QGPCEBJK.G")
	public int pitch;

	public ClientProj(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
		try {
			this.spotanim = SpotType.list[arg11];
			this.level = arg5;
			this.field1274 = arg7;
			this.field1275 = arg10;
			this.h1 = arg9;
			this.t1 = arg8;
			this.t2 = arg1;
			this.angle = arg2;
			this.field1287 = arg4;
			this.target = arg3;
			this.h2 = arg0;
			this.mobile = false;
			boolean var15 = false;
		} catch (RuntimeException var14) {
			signlink.reporterror("99383, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + arg10 + ", " + arg11 + ", " + var14.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("QGPCEBJK.a(I)LKBEXSZSN;")
	@Override
	public Model getTempModel() {
		try {
			Model var1 = this.spotanim.getTempModel2();
			if (var1 == null) {
				return null;
			}
			int var2 = -1;
			if (this.spotanim.seq != null) {
				var2 = this.spotanim.seq.frames[this.animFrame];
			}
			Model var3 = new Model(false, 777, AnimFrame.animateTransparencies(var2), var1, true);
			if (var2 != -1) {
				var3.prepareAnim(311);
				var3.animate(var2);
				var3.labelFaces = null;
				var3.labelVertices = null;
			}
			if (this.spotanim.resizeh != 128 || this.spotanim.resizev != 128) {
				var3.resize(this.field1284, this.spotanim.resizeh, this.spotanim.resizev, this.spotanim.resizeh);
			}
			var3.rotateXAxis(this.pitch);
			var3.calculateNormals(this.spotanim.ambient + 64, this.spotanim.contrast + 850, -30, -50, -30, true);
			return var3;
		} catch (RuntimeException var5) {
			signlink.reporterror("19285, " + ", " + var5.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("QGPCEBJK.a(IIZII)V")
	public void setTarget(int arg0, int arg1, int arg2, int arg3) {
		try {
			if (!this.mobile) {
				double var5 = (double) (arg2 - this.field1274);
				double var7 = (double) (arg0 - this.field1275);
				double var9 = Math.sqrt(var5 * var5 + var7 * var7);
				this.field1278 = (double) this.field1274 + var5 * (double) this.field1287 / var9;
				this.field1279 = (double) this.field1275 + var7 * (double) this.field1287 / var9;
				this.field1280 = this.h1;
			}
			double var11 = (double) (this.t2 + 1 - arg1);
			this.field1289 = ((double) arg2 - this.field1278) / var11;
			this.field1290 = ((double) arg0 - this.field1279) / var11;
			this.velocity = Math.sqrt(this.field1289 * this.field1289 + this.field1290 * this.field1290);
			if (!this.mobile) {
				this.velocitY = -this.velocity * Math.tan((double) this.angle * 0.02454369D);
			}
			this.accelerationY = ((double) arg3 - this.field1280 - this.velocitY * var11) * 2.0D / (var11 * var11);
		} catch (RuntimeException var14) {
			signlink.reporterror("71411, " + arg0 + ", " + arg1 + ", " + false + ", " + arg2 + ", " + arg3 + ", " + var14.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("QGPCEBJK.a(II)V")
	public void move(int arg0) {
		try {
			this.mobile = true;
			this.field1278 += this.field1289 * (double) arg0;
			this.field1279 += this.field1290 * (double) arg0;
			this.field1280 += this.velocitY * (double) arg0 + this.accelerationY * 0.5D * (double) arg0 * (double) arg0;
			this.velocitY += this.accelerationY * (double) arg0;
			this.yaw = (int) (Math.atan2(this.field1289, this.field1290) * 325.949D) + 1024 & 0x7FF;
			this.pitch = (int) (Math.atan2(this.velocitY, this.velocity) * 325.949D) & 0x7FF;
			if (this.spotanim.seq != null) {
				this.animCycle += arg0;
				while (this.animCycle > this.spotanim.seq.getDelay(this.animFrame)) {
					this.animCycle -= this.spotanim.seq.getDelay(this.animFrame) + 1;
					this.animFrame++;
					if (this.animFrame >= this.spotanim.seq.numFrames) {
						this.animFrame = 0;
					}
				}
			}
		} catch (RuntimeException var3) {
			signlink.reporterror("67629, " + ", " + arg0 + ", " + var3.toString());
			throw new RuntimeException();
		}
	}
}
