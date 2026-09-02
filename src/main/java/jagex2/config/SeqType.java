package jagex2.config;

import jagex2.dash3d.AnimFrame;
import jagex2.io.JagFile;
import deob.ObfuscatedName;
import jagex2.io.Packet;
import sign.signlink;

@ObfuscatedName("ODMBIHRM")
public final class SeqType {

	@ObfuscatedName("ODMBIHRM.h")
	public int loops = -1;

	@ObfuscatedName("ODMBIHRM.j")
	public boolean reachforward = false;

	@ObfuscatedName("ODMBIHRM.k")
	public int priority = 5;

	@ObfuscatedName("ODMBIHRM.l")
	public int replaceheldleft = -1;

	@ObfuscatedName("ODMBIHRM.m")
	public int replaceheldright = -1;

	@ObfuscatedName("ODMBIHRM.n")
	public int maxloops = 99;

	@ObfuscatedName("ODMBIHRM.o")
	public int preanim_move = -1;

	@ObfuscatedName("ODMBIHRM.p")
	public int postanim_move = -1;

	@ObfuscatedName("ODMBIHRM.q")
	public int duplicatebehavior = 2;

	@ObfuscatedName("ODMBIHRM.b")
	public static int field1183;

	@ObfuscatedName("ODMBIHRM.d")
	public int numFrames;

	@ObfuscatedName("ODMBIHRM.r")
	public int field1199;

	@ObfuscatedName("ODMBIHRM.e")
	public int[] frames;

	@ObfuscatedName("ODMBIHRM.f")
	public int[] iframes;

	@ObfuscatedName("ODMBIHRM.g")
	public int[] delay;

	@ObfuscatedName("ODMBIHRM.i")
	public int[] walkmerge;

	@ObfuscatedName("ODMBIHRM.c")
	public static SeqType[] list;

	@ObfuscatedName("ODMBIHRM.a(ILBBMKAXRK;)V")
	public static void init(JagFile arg0) {
		try {
			Packet var1 = new Packet(arg0.read("seq.dat", null), -26583);
			field1183 = var1.g2();
			if (list == null) {
				list = new SeqType[field1183];
			}
			for (int var2 = 0; var2 < field1183; var2++) {
				if (list[var2] == null) {
					list[var2] = new SeqType();
				}
				list[var2].decode(var1);
			}
		} catch (RuntimeException var4) {
			signlink.reporterror("88281, " + -768 + ", " + arg0 + ", " + var4.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("ODMBIHRM.a(IZ)I")
	public int getDelay(int arg0) {
		try {
			int var2 = this.delay[arg0];
			if (var2 == 0) {
				AnimFrame var3 = AnimFrame.get(this.frames[arg0]);
				if (var3 != null) {
					var2 = this.delay[arg0] = var3.field863;
				}
			}
			if (var2 == 0) {
				var2 = 1;
			}
			return var2;
		} catch (RuntimeException var5) {
			signlink.reporterror("95358, " + arg0 + ", " + false + ", " + var5.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("ODMBIHRM.a(LEILHLJCE;B)V")
	public void decode(Packet arg0) {
		try {
			while (true) {
				int var2 = arg0.g1();
				if (var2 == 0) {
					if (this.numFrames == 0) {
						this.numFrames = 1;
						this.frames = new int[1];
						this.frames[0] = -1;
						this.iframes = new int[1];
						this.iframes[0] = -1;
						this.delay = new int[1];
						this.delay[0] = -1;
					}
					if (this.preanim_move == -1) {
						if (this.walkmerge == null) {
							this.preanim_move = 0;
						} else {
							this.preanim_move = 2;
						}
					}
					if (this.postanim_move == -1) {
						if (this.walkmerge != null) {
							this.postanim_move = 2;
							return;
						}
						this.postanim_move = 0;
						return;
					}
					return;
				}
				if (var2 == 1) {
					this.numFrames = arg0.g1();
					this.frames = new int[this.numFrames];
					this.iframes = new int[this.numFrames];
					this.delay = new int[this.numFrames];
					for (int var3 = 0; var3 < this.numFrames; var3++) {
						this.frames[var3] = arg0.g2();
						this.iframes[var3] = arg0.g2();
						if (this.iframes[var3] == 65535) {
							this.iframes[var3] = -1;
						}
						this.delay[var3] = arg0.g2();
					}
				} else if (var2 == 2) {
					this.loops = arg0.g2();
				} else if (var2 == 3) {
					int var4 = arg0.g1();
					this.walkmerge = new int[var4 + 1];
					for (int var5 = 0; var5 < var4; var5++) {
						this.walkmerge[var5] = arg0.g1();
					}
					this.walkmerge[var4] = 9999999;
				} else if (var2 == 4) {
					this.reachforward = true;
				} else if (var2 == 5) {
					this.priority = arg0.g1();
				} else if (var2 == 6) {
					this.replaceheldleft = arg0.g2();
				} else if (var2 == 7) {
					this.replaceheldright = arg0.g2();
				} else if (var2 == 8) {
					this.maxloops = arg0.g1();
				} else if (var2 == 9) {
					this.preanim_move = arg0.g1();
				} else if (var2 == 10) {
					this.postanim_move = arg0.g1();
				} else if (var2 == 11) {
					this.duplicatebehavior = arg0.g1();
				} else if (var2 == 12) {
					this.field1199 = arg0.g4();
				} else {
					System.out.println("Error unrecognised seq config code: " + var2);
				}
			}
		} catch (RuntimeException var7) {
			signlink.reporterror("74550, " + arg0 + ", " + -50 + ", " + var7.toString());
			throw new RuntimeException();
		}
	}
}
