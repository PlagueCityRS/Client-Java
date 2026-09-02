package jagex2.dash3d;

import deob.ObfuscatedName;
import jagex2.config.SeqType;
import sign.signlink;

@ObfuscatedName("APSQOGBV")
public abstract class ClientEntity extends ModelSource {

	@ObfuscatedName("APSQOGBV.k")
	public int field14 = -1000;

	@ObfuscatedName("APSQOGBV.o")
	public int field18 = -1;

	@ObfuscatedName("APSQOGBV.q")
	public int field20 = -1;

	@ObfuscatedName("APSQOGBV.r")
	public int field21 = -1;

	@ObfuscatedName("APSQOGBV.s")
	public int field22 = -1;

	@ObfuscatedName("APSQOGBV.t")
	public int field23 = -1;

	@ObfuscatedName("APSQOGBV.w")
	public int chatTimer = 100;

	@ObfuscatedName("APSQOGBV.x")
	public int spotanimId = -1;

	@ObfuscatedName("APSQOGBV.D")
	public final int[] damageValues = new int[4];

	@ObfuscatedName("APSQOGBV.E")
	public final int[] damageTypes = new int[4];

	@ObfuscatedName("APSQOGBV.F")
	public final int[] damageCycles = new int[4];

	@ObfuscatedName("APSQOGBV.G")
	public int height = 200;

	@ObfuscatedName("APSQOGBV.H")
	public final int[] routeX = new int[10];

	@ObfuscatedName("APSQOGBV.I")
	public final int[] routeZ = new int[10];

	@ObfuscatedName("APSQOGBV.J")
	public boolean field39 = false;

	@ObfuscatedName("APSQOGBV.K")
	public int field40 = 32;

	@ObfuscatedName("APSQOGBV.N")
	public int secondaryAnim = -1;

	@ObfuscatedName("APSQOGBV.R")
	public int primaryAnim = -1;

	@ObfuscatedName("APSQOGBV.W")
	public int field52 = -1;

	@ObfuscatedName("APSQOGBV.X")
	public final boolean[] routeRun = new boolean[10];

	@ObfuscatedName("APSQOGBV.Y")
	public int field54 = 1;

	@ObfuscatedName("APSQOGBV.Z")
	public final boolean field55 = true;

	@ObfuscatedName("APSQOGBV.ib")
	public final int field64 = -23379;

	@ObfuscatedName("APSQOGBV.ob")
	public int readyAnim = -1;

	@ObfuscatedName("APSQOGBV.pb")
	public int field71 = -1;

	@ObfuscatedName("APSQOGBV.l")
	public int field15;

	@ObfuscatedName("APSQOGBV.m")
	public int field16;

	@ObfuscatedName("APSQOGBV.n")
	public int routeLength;

	@ObfuscatedName("APSQOGBV.p")
	public int field19;

	@ObfuscatedName("APSQOGBV.u")
	public int chatEffect;

	@ObfuscatedName("APSQOGBV.v")
	public int field25;

	@ObfuscatedName("APSQOGBV.y")
	public int spotanimFrame;

	@ObfuscatedName("APSQOGBV.z")
	public int field29;

	@ObfuscatedName("APSQOGBV.A")
	public int field30;

	@ObfuscatedName("APSQOGBV.B")
	public int field31;

	@ObfuscatedName("APSQOGBV.C")
	public int cycle;

	@ObfuscatedName("APSQOGBV.L")
	public int field41;

	@ObfuscatedName("APSQOGBV.M")
	public int field42;

	@ObfuscatedName("APSQOGBV.O")
	public int secondaryFrame;

	@ObfuscatedName("APSQOGBV.P")
	public int field45;

	@ObfuscatedName("APSQOGBV.S")
	public int primaryFrame;

	@ObfuscatedName("APSQOGBV.T")
	public int field49;

	@ObfuscatedName("APSQOGBV.U")
	public int primaryAnimDelay;

	@ObfuscatedName("APSQOGBV.V")
	public int field51;

	@ObfuscatedName("APSQOGBV.ab")
	public int chatColour;

	@ObfuscatedName("APSQOGBV.bb")
	public int field57;

	@ObfuscatedName("APSQOGBV.cb")
	public int field58;

	@ObfuscatedName("APSQOGBV.db")
	public int field59;

	@ObfuscatedName("APSQOGBV.eb")
	public int field60;

	@ObfuscatedName("APSQOGBV.fb")
	public int field61;

	@ObfuscatedName("APSQOGBV.gb")
	public int field62;

	@ObfuscatedName("APSQOGBV.hb")
	public int field63;

	@ObfuscatedName("APSQOGBV.jb")
	public int preanimRouteLength;

	@ObfuscatedName("APSQOGBV.kb")
	public int dstYaw;

	@ObfuscatedName("APSQOGBV.lb")
	public int x;

	@ObfuscatedName("APSQOGBV.mb")
	public int z;

	@ObfuscatedName("APSQOGBV.nb")
	public int field69;

	@ObfuscatedName("APSQOGBV.Q")
	public String chatMessage;

	@ObfuscatedName("APSQOGBV.a(B)V")
	public final void method7(byte arg0) {
		try {
			this.routeLength = 0;
			this.preanimRouteLength = 0;
		} catch (RuntimeException var3) {
			signlink.reporterror("42238, " + arg0 + ", " + var3.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("APSQOGBV.a(IZZ)V")
	public final void method8(int arg0, boolean arg1) {
		try {
			int var3 = this.routeX[0];
			int var4 = this.routeZ[0];
			if (arg0 == 0) {
				var3--;
				var4++;
			}
			if (arg0 == 1) {
				var4++;
			}
			if (arg0 == 2) {
				var3++;
				var4++;
			}
			if (arg0 == 3) {
				var3--;
			}
			if (arg0 == 4) {
				var3++;
			}
			if (arg0 == 5) {
				var3--;
				var4--;
			}
			if (arg0 == 6) {
				var4--;
			}
			if (arg0 == 7) {
				var3++;
				var4--;
			}
			if (this.primaryAnim != -1 && SeqType.list[this.primaryAnim].postanim_move == 1) {
				this.primaryAnim = -1;
			}
			if (this.routeLength < 9) {
				this.routeLength++;
			}
			for (int var5 = this.routeLength; var5 > 0; var5--) {
				this.routeX[var5] = this.routeX[var5 - 1];
				this.routeZ[var5] = this.routeZ[var5 - 1];
				this.routeRun[var5] = this.routeRun[var5 - 1];
			}
			this.routeX[0] = var3;
			this.routeZ[0] = var4;
			this.routeRun[0] = arg1;
		} catch (RuntimeException var7) {
			signlink.reporterror("79960, " + arg0 + ", " + arg1 + ", " + true + ", " + var7.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("APSQOGBV.a(IIII)V")
	public final void addHitMark(int arg0, int arg1, int arg2) {
		try {
			for (int var4 = 0; var4 < 4; var4++) {
				if (this.damageCycles[var4] <= arg0) {
					this.damageValues[var4] = arg2;
					this.damageTypes[var4] = arg1;
					this.damageCycles[var4] = arg0 + 70;
					return;
				}
			}
		} catch (RuntimeException var6) {
			signlink.reporterror("69589, " + arg0 + ", " + 951 + ", " + arg1 + ", " + arg2 + ", " + var6.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("APSQOGBV.a(Z)Z")
	public boolean isReady() {
		try {
			return false;
		} catch (RuntimeException var2) {
			signlink.reporterror("94784, " + true + ", " + var2.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("APSQOGBV.a(ZIIZ)V")
	public final void teleport(int arg0, int arg1, boolean arg2) {
		try {
			if (this.primaryAnim != -1 && SeqType.list[this.primaryAnim].postanim_move == 1) {
				this.primaryAnim = -1;
			}
			if (!arg2) {
				int var4 = arg0 - this.routeX[0];
				int var5 = arg1 - this.routeZ[0];
				if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
					if (this.routeLength < 9) {
						this.routeLength++;
					}
					for (int var6 = this.routeLength; var6 > 0; var6--) {
						this.routeX[var6] = this.routeX[var6 - 1];
						this.routeZ[var6] = this.routeZ[var6 - 1];
						this.routeRun[var6] = this.routeRun[var6 - 1];
					}
					this.routeX[0] = arg0;
					this.routeZ[0] = arg1;
					this.routeRun[0] = false;
					return;
				}
			}
			this.routeLength = 0;
			this.preanimRouteLength = 0;
			this.field19 = 0;
			this.routeX[0] = arg0;
			this.routeZ[0] = arg1;
			this.x = this.routeX[0] * 128 + this.field54 * 64;
			this.z = this.routeZ[0] * 128 + this.field54 * 64;
		} catch (RuntimeException var8) {
			signlink.reporterror("71085, " + false + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + var8.toString());
			throw new RuntimeException();
		}
	}
}
