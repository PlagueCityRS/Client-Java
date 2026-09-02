package jagex2.sound;

import deob.ObfuscatedName;
import jagex2.io.Packet;
import sign.signlink;

@ObfuscatedName("RRWCTNMK")
public final class Envelope {

	@ObfuscatedName("RRWCTNMK.b")
	public int length;

	@ObfuscatedName("RRWCTNMK.c")
	public int[] shapeDelta;

	@ObfuscatedName("RRWCTNMK.d")
	public int[] shapePeak;

	@ObfuscatedName("RRWCTNMK.e")
	public int start;

	@ObfuscatedName("RRWCTNMK.f")
	public int end;

	@ObfuscatedName("RRWCTNMK.g")
	public int form;

	@ObfuscatedName("RRWCTNMK.h")
	public int threshold;

	@ObfuscatedName("RRWCTNMK.i")
	public int position;

	@ObfuscatedName("RRWCTNMK.j")
	public int delta;

	@ObfuscatedName("RRWCTNMK.k")
	public int amplitude;

	@ObfuscatedName("RRWCTNMK.l")
	public int ticks;

	@ObfuscatedName("RRWCTNMK.a")
	public int field1313;

	@ObfuscatedName("RRWCTNMK.a(LEILHLJCE;B)V")
	public void load(Packet arg0) {
		try {
			this.form = arg0.g1();
			this.start = arg0.g4();
			this.end = arg0.g4();
			this.loadPoints(arg0);
		} catch (RuntimeException var3) {
			signlink.reporterror("72146, " + arg0 + ", " + -50 + ", " + var3.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("RRWCTNMK.a(LEILHLJCE;I)V")
	public void loadPoints(Packet arg0) {
		try {
			this.length = arg0.g1();
			this.shapeDelta = new int[this.length];
			this.shapePeak = new int[this.length];
			for (int var2 = 0; var2 < this.length; var2++) {
				this.shapeDelta[var2] = arg0.g2();
				this.shapePeak[var2] = arg0.g2();
			}
		} catch (RuntimeException var4) {
			signlink.reporterror("528, " + arg0 + ", " + ", " + var4.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("RRWCTNMK.a(I)V")
	public void genInit() {
		try {
			this.threshold = 0;
			this.position = 0;
			this.delta = 0;
			this.amplitude = 0;
			this.ticks = 0;
		} catch (RuntimeException var2) {
			signlink.reporterror("1928, " + 9 + ", " + var2.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("RRWCTNMK.a(II)I")
	public int genNext(int arg0) {
		try {
			if (this.ticks >= this.threshold) {
				this.amplitude = this.shapePeak[this.position++] << 15;
				if (this.position >= this.length) {
					this.position = this.length - 1;
				}
				this.threshold = (int) ((double) this.shapeDelta[this.position] / 65536.0D * (double) arg0);
				if (this.threshold > this.ticks) {
					this.delta = ((this.shapePeak[this.position] << 15) - this.amplitude) / (this.threshold - this.ticks);
				}
			}
			this.amplitude += this.delta;
			this.ticks++;
			return this.amplitude - this.delta >> 15;
		} catch (RuntimeException var3) {
			signlink.reporterror("48174, " + ", " + arg0 + ", " + var3.toString());
			throw new RuntimeException();
		}
	}
}
