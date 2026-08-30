package deob;

import sign.signlink;

@ObfuscatedName("BBMKAXRK")
public final class class6 {

	@ObfuscatedName("BBMKAXRK.a")
	public int field135;

	@ObfuscatedName("BBMKAXRK.c")
	public int field137;

	@ObfuscatedName("BBMKAXRK.h")
	public boolean field142;

	@ObfuscatedName("BBMKAXRK.b")
	public byte[] field136;

	@ObfuscatedName("BBMKAXRK.d")
	public int[] field138;

	@ObfuscatedName("BBMKAXRK.e")
	public int[] field139;

	@ObfuscatedName("BBMKAXRK.f")
	public int[] field140;

	@ObfuscatedName("BBMKAXRK.g")
	public int[] field141;

	public class6(byte arg0, byte[] arg1) {
		try {
			this.method29((byte) 8, arg1);
		} catch (RuntimeException var4) {
			signlink.reporterror("36748, " + 70 + ", " + arg1 + ", " + var4.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("BBMKAXRK.a(B[B)V")
	public void method29(byte arg0, byte[] arg1) {
		try {
			class17 var3 = new class17(arg1, -26583);
			int var4 = var3.method228();
			int var5 = var3.method228();
			if (var5 == var4) {
				this.field136 = arg1;
				this.field142 = false;
			} else {
				byte[] var6 = new byte[var4];
				class10.method36(var6, var4, arg1, var5, 6);
				this.field136 = var6;
				var3 = new class17(this.field136, -26583);
				this.field142 = true;
			}
			this.field137 = var3.method226();
			this.field138 = new int[this.field137];
			this.field139 = new int[this.field137];
			this.field140 = new int[this.field137];
			this.field141 = new int[this.field137];
			boolean var11 = false;
			int var7 = var3.field779 + this.field137 * 10;
			for (int var8 = 0; var8 < this.field137; var8++) {
				this.field138[var8] = var3.method229();
				this.field139[var8] = var3.method228();
				this.field140[var8] = var3.method228();
				this.field141[var8] = var7;
				var7 += this.field140[var8];
			}
		} catch (RuntimeException var10) {
			signlink.reporterror("28146, " + arg0 + ", " + arg1 + ", " + var10.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("BBMKAXRK.a(Ljava/lang/String;[B)[B")
	public byte[] method30(String arg0, byte[] arg1) {
		int var3 = 0;
		String var4 = arg0.toUpperCase();
		for (int var5 = 0; var5 < var4.length(); var5++) {
			var3 = var3 * 61 + var4.charAt(var5) - 32;
		}
		for (int var6 = 0; var6 < this.field137; var6++) {
			if (this.field138[var6] == var3) {
				if (arg1 == null) {
					arg1 = new byte[this.field139[var6]];
				}
				if (this.field142) {
					for (int var7 = 0; var7 < this.field139[var6]; var7++) {
						arg1[var7] = this.field136[this.field141[var6] + var7];
					}
				} else {
					class10.method36(arg1, this.field139[var6], this.field136, this.field140[var6], this.field141[var6]);
				}
				return arg1;
			}
		}
		return null;
	}
}
