package deob;

import sign.signlink;

@ObfuscatedName("RRWCTNMK")
public final class class50 {

	@ObfuscatedName("RRWCTNMK.a")
	public int field1313;

	@ObfuscatedName("RRWCTNMK.b")
	public int field1314;

	@ObfuscatedName("RRWCTNMK.e")
	public int field1317;

	@ObfuscatedName("RRWCTNMK.f")
	public int field1318;

	@ObfuscatedName("RRWCTNMK.g")
	public int field1319;

	@ObfuscatedName("RRWCTNMK.h")
	public int field1320;

	@ObfuscatedName("RRWCTNMK.i")
	public int field1321;

	@ObfuscatedName("RRWCTNMK.j")
	public int field1322;

	@ObfuscatedName("RRWCTNMK.k")
	public int field1323;

	@ObfuscatedName("RRWCTNMK.l")
	public int field1324;

	@ObfuscatedName("RRWCTNMK.c")
	public int[] field1315;

	@ObfuscatedName("RRWCTNMK.d")
	public int[] field1316;

	@ObfuscatedName("RRWCTNMK.a(LEILHLJCE;B)V")
	public void method443(class17 arg0) {
		try {
			this.field1319 = arg0.method224();
			this.field1317 = arg0.method229();
			this.field1318 = arg0.method229();
			this.method444(arg0);
		} catch (RuntimeException var3) {
			signlink.reporterror("72146, " + arg0 + ", " + -50 + ", " + var3.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("RRWCTNMK.a(LEILHLJCE;I)V")
	public void method444(class17 arg0) {
		try {
			this.field1314 = arg0.method224();
			this.field1315 = new int[this.field1314];
			this.field1316 = new int[this.field1314];
			for (int var2 = 0; var2 < this.field1314; var2++) {
				this.field1315[var2] = arg0.method226();
				this.field1316[var2] = arg0.method226();
			}
		} catch (RuntimeException var4) {
			signlink.reporterror("528, " + arg0 + ", " + ", " + var4.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("RRWCTNMK.a(I)V")
	public void method445() {
		try {
			this.field1320 = 0;
			this.field1321 = 0;
			this.field1322 = 0;
			this.field1323 = 0;
			this.field1324 = 0;
		} catch (RuntimeException var2) {
			signlink.reporterror("1928, " + 9 + ", " + var2.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("RRWCTNMK.a(II)I")
	public int method446(int arg0) {
		try {
			if (this.field1324 >= this.field1320) {
				this.field1323 = this.field1316[this.field1321++] << 15;
				if (this.field1321 >= this.field1314) {
					this.field1321 = this.field1314 - 1;
				}
				this.field1320 = (int) ((double) this.field1315[this.field1321] / 65536.0D * (double) arg0);
				if (this.field1320 > this.field1324) {
					this.field1322 = ((this.field1316[this.field1321] << 15) - this.field1323) / (this.field1320 - this.field1324);
				}
			}
			this.field1323 += this.field1322;
			this.field1324++;
			return this.field1323 - this.field1322 >> 15;
		} catch (RuntimeException var3) {
			signlink.reporterror("48174, " + ", " + arg0 + ", " + var3.toString());
			throw new RuntimeException();
		}
	}
}
