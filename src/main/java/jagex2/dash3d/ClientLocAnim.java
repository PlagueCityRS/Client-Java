package jagex2.dash3d;

import deob.ObfuscatedName;
import deob.client.Client;
import jagex2.config.LocType;
import jagex2.config.SeqType;
import jagex2.config.VarbitType;
import sign.signlink;

@ObfuscatedName("TUJJLJTQ")
public final class ClientLocAnim extends ModelSource {

	@ObfuscatedName("TUJJLJTQ.s")
	public final int field1392 = 31;

	@ObfuscatedName("TUJJLJTQ.w")
	public final boolean field1396 = true;

	@ObfuscatedName("TUJJLJTQ.k")
	public final int field1384;

	@ObfuscatedName("TUJJLJTQ.l")
	public final int field1385;

	@ObfuscatedName("TUJJLJTQ.m")
	public final int field1386;

	@ObfuscatedName("TUJJLJTQ.o")
	public final int field1388;

	@ObfuscatedName("TUJJLJTQ.p")
	public final int field1389;

	@ObfuscatedName("TUJJLJTQ.q")
	public final int field1390;

	@ObfuscatedName("TUJJLJTQ.r")
	public final int field1391;

	@ObfuscatedName("TUJJLJTQ.t")
	public SeqType anim;

	@ObfuscatedName("TUJJLJTQ.x")
	public int animFrame;

	@ObfuscatedName("TUJJLJTQ.n")
	public int animCycle;

	@ObfuscatedName("TUJJLJTQ.y")
	public final int multivarbit;

	@ObfuscatedName("TUJJLJTQ.z")
	public final int multivarp;

	@ObfuscatedName("TUJJLJTQ.u")
	public final int[] multiloc;

	@ObfuscatedName("TUJJLJTQ.v")
	public static Client field1395;

	public ClientLocAnim(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7, byte arg8, int arg9) {
		try {
			this.field1384 = arg0;
			this.field1385 = arg1;
			this.field1386 = arg6;
			this.field1388 = arg9;
			this.field1389 = arg2;
			this.field1390 = arg7;
			this.field1391 = arg4;
			if (arg3 != -1) {
				this.anim = SeqType.list[arg3];
				this.animFrame = 0;
				this.animCycle = Client.loopCycle;
				if (arg5 && this.anim.loops != -1) {
					this.animFrame = (int) (Math.random() * (double) this.anim.numFrames);
					this.animCycle -= (int) (Math.random() * (double) this.anim.getDelay(this.animFrame));
				}
			}
			LocType var11 = LocType.list(this.field1384);
			this.multivarbit = var11.multivarbit;
			this.multivarp = var11.multivarp;
			this.multiloc = var11.multiloc;
		} catch (RuntimeException var13) {
			signlink.reporterror("47582, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + -59 + ", " + arg9 + ", " + var13.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("TUJJLJTQ.b(I)LDQLJXYPC;")
	public LocType getModel(int arg0) {
		try {
			int var10 = 54 / arg0;
			int var2 = -1;
			if (this.multivarbit != -1) {
				VarbitType var3 = VarbitType.list[this.multivarbit];
				int var4 = var3.basevar;
				int var5 = var3.startbit;
				int var6 = var3.endbit;
				int var7 = Client.readbit[var6 - var5];
				var2 = field1395.var[var4] >> var5 & var7;
			} else if (this.multivarp != -1) {
				var2 = field1395.var[this.multivarp];
			}
			return var2 < 0 || var2 >= this.multiloc.length || this.multiloc[var2] == -1 ? null : LocType.list(this.multiloc[var2]);
		} catch (RuntimeException var9) {
			signlink.reporterror("16570, " + arg0 + ", " + var9.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("TUJJLJTQ.a(I)LKBEXSZSN;")
	@Override
	public Model getTempModel() {
		try {
			int var1 = -1;
			if (this.anim != null) {
				int var2 = Client.loopCycle - this.animCycle;
				if (var2 > 100 && this.anim.loops > 0) {
					var2 = 100;
				}
				label43: {
					do {
						do {
							if (var2 <= this.anim.getDelay(this.animFrame)) {
								break label43;
							}
							var2 -= this.anim.getDelay(this.animFrame);
							this.animFrame++;
						} while (this.animFrame < this.anim.numFrames);
						this.animFrame -= this.anim.loops;
					} while (this.animFrame >= 0 && this.animFrame < this.anim.numFrames);
					this.anim = null;
				}
				this.animCycle = Client.loopCycle - var2;
				if (this.anim != null) {
					var1 = this.anim.frames[this.animFrame];
				}
			}
			LocType var3;
			if (this.multiloc == null) {
				var3 = LocType.list(this.field1384);
			} else {
				var3 = this.getModel(this.field1392);
			}
			return var3 == null ? null : var3.getModel(this.field1385, this.field1386, this.field1388, this.field1389, this.field1390, this.field1391, var1);
		} catch (RuntimeException var6) {
			signlink.reporterror("10231, " + ", " + var6.toString());
			throw new RuntimeException();
		}
	}
}
