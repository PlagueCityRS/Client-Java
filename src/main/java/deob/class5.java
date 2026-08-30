package deob;

import sign.signlink;

@ObfuscatedName("AWOZVMFS")
public final class class5 extends class3 {

	@ObfuscatedName("AWOZVMFS.Qb")
	public static class15 field133 = new class15((byte) 7, 260);

	@ObfuscatedName("AWOZVMFS.sb")
	public int field109 = -1;

	@ObfuscatedName("AWOZVMFS.ub")
	public final boolean field111 = true;

	@ObfuscatedName("AWOZVMFS.vb")
	public final int[] field112 = new int[5];

	@ObfuscatedName("AWOZVMFS.wb")
	public boolean field113 = false;

	@ObfuscatedName("AWOZVMFS.Fb")
	public final int[] field122 = new int[12];

	@ObfuscatedName("AWOZVMFS.Lb")
	public final byte field128 = 29;

	@ObfuscatedName("AWOZVMFS.Ob")
	public long field131 = -1L;

	@ObfuscatedName("AWOZVMFS.Pb")
	public boolean field132 = false;

	@ObfuscatedName("AWOZVMFS.Rb")
	public int field134 = -1;

	@ObfuscatedName("AWOZVMFS.qb")
	public int field107;

	@ObfuscatedName("AWOZVMFS.rb")
	public int field108;

	@ObfuscatedName("AWOZVMFS.xb")
	public int field114;

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
	public int field120;

	@ObfuscatedName("AWOZVMFS.Eb")
	public int field121;

	@ObfuscatedName("AWOZVMFS.Gb")
	public int field123;

	@ObfuscatedName("AWOZVMFS.Hb")
	public int field124;

	@ObfuscatedName("AWOZVMFS.Ib")
	public int field125;

	@ObfuscatedName("AWOZVMFS.Nb")
	public int field130;

	@ObfuscatedName("AWOZVMFS.tb")
	public long field110;

	@ObfuscatedName("AWOZVMFS.Jb")
	public class31 field126;

	@ObfuscatedName("AWOZVMFS.Kb")
	public class37 field127;

	@ObfuscatedName("AWOZVMFS.Mb")
	public String field129;

	@ObfuscatedName("AWOZVMFS.a(Z)Z")
	@Override
	public boolean method10() {
		try {
			return this.field132;
		} catch (RuntimeException var2) {
			signlink.reporterror("8192, " + true + ", " + var2.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("AWOZVMFS.b(B)LKBEXSZSN;")
	public class31 method25() {
		try {
			if (this.field127 != null) {
				int var1 = -1;
				if (super.field47 >= 0 && super.field50 == 0) {
					var1 = class41.field1184[super.field47].field1186[super.field48];
				} else if (super.field43 >= 0) {
					var1 = class41.field1184[super.field43].field1186[super.field44];
				}
				return this.field127.method388(var1, -1, null);
			}
			long var3 = this.field110;
			int var5 = -1;
			int var6 = -1;
			int var7 = -1;
			int var8 = -1;
			if (super.field47 >= 0 && super.field50 == 0) {
				class41 var9 = class41.field1184[super.field47];
				var5 = var9.field1186[super.field48];
				if (super.field43 >= 0 && super.field43 != super.field70) {
					var6 = class41.field1184[super.field43].field1186[super.field44];
				}
				if (var9.field1193 >= 0) {
					var7 = var9.field1193;
					var3 += var7 - this.field122[5] << 8;
				}
				if (var9.field1194 >= 0) {
					var8 = var9.field1194;
					var3 += var8 - this.field122[3] << 16;
				}
			} else if (super.field43 >= 0) {
				var5 = class41.field1184[super.field43].field1186[super.field44];
			}
			class31 var10 = (class31) field133.method197(var3);
			if (var10 == null) {
				boolean var11 = false;
				for (int var12 = 0; var12 < 12; var12++) {
					int var13 = this.field122[var12];
					if (var8 >= 0 && var12 == 3) {
						var13 = var8;
					}
					if (var7 >= 0 && var12 == 5) {
						var13 = var7;
					}
					if (var13 >= 256 && var13 < 512 && !class54.field1357[var13 - 256].method455()) {
						var11 = true;
					}
					if (var13 >= 512 && !class67.method526(var13 - 512).method517(this.field119)) {
						var11 = true;
					}
				}
				if (var11) {
					if (this.field131 != -1L) {
						var10 = (class31) field133.method197(this.field131);
					}
					if (var10 == null) {
						return null;
					}
				}
			}
			if (var10 == null) {
				class31[] var14 = new class31[12];
				int var15 = 0;
				for (int var16 = 0; var16 < 12; var16++) {
					int var17 = this.field122[var16];
					if (var8 >= 0 && var16 == 3) {
						var17 = var8;
					}
					if (var7 >= 0 && var16 == 5) {
						var17 = var7;
					}
					if (var17 >= 256 && var17 < 512) {
						class31 var18 = class54.field1357[var17 - 256].method456();
						if (var18 != null) {
							var14[var15++] = var18;
						}
					}
					if (var17 >= 512) {
						class31 var19 = class67.method526(var17 - 512).method522(this.field119);
						if (var19 != null) {
							var14[var15++] = var19;
						}
					}
				}
				var10 = new class31(var15, var14, 5);
				for (int var20 = 0; var20 < 5; var20++) {
					if (this.field112[var20] != 0) {
						var10.method353(client.field457[var20][0], client.field457[var20][this.field112[var20]]);
						if (var20 == 1) {
							var10.method353(client.field603[0], client.field603[this.field112[var20]]);
						}
					}
				}
				var10.method346(311);
				var10.method356(64, 850, -30, -50, -30, true);
				field133.method198((byte) 7, var3, var10);
				this.field131 = var3;
			}
			if (this.field113) {
				return var10;
			}
			class31 var21 = class31.field996;
			var21.method341(var10, class25.method309(var5) & class25.method309(var6));
			if (var5 != -1 && var6 != -1) {
				var21.method348(class41.field1184[super.field47].field1190, var6, var5);
			} else if (var5 != -1) {
				var21.method347(var5);
			}
			var21.method343();
			var21.field1032 = null;
			var21.field1031 = null;
			return var21;
		} catch (RuntimeException var23) {
			signlink.reporterror("88317, " + 9 + ", " + var23.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("AWOZVMFS.b(I)LKBEXSZSN;")
	public class31 method26() {
		try {
			if (!this.field132) {
				return null;
			} else if (this.field127 == null) {
				boolean var1 = false;
				for (int var2 = 0; var2 < 12; var2++) {
					int var3 = this.field122[var2];
					if (var3 >= 256 && var3 < 512 && !class54.field1357[var3 - 256].method457()) {
						var1 = true;
					}
					if (var3 >= 512 && !class67.method526(var3 - 512).method515(this.field119)) {
						var1 = true;
					}
				}
				if (var1) {
					return null;
				}
				class31[] var4 = new class31[12];
				int var5 = 0;
				for (int var6 = 0; var6 < 12; var6++) {
					int var7 = this.field122[var6];
					if (var7 >= 256 && var7 < 512) {
						class31 var8 = class54.field1357[var7 - 256].method458();
						if (var8 != null) {
							var4[var5++] = var8;
						}
					}
					if (var7 >= 512) {
						class31 var9 = class67.method526(var7 - 512).method525(this.field119);
						if (var9 != null) {
							var4[var5++] = var9;
						}
					}
				}
				class31 var10 = new class31(var5, var4, 5);
				for (int var11 = 0; var11 < 5; var11++) {
					if (this.field112[var11] != 0) {
						var10.method353(client.field457[var11][0], client.field457[var11][this.field112[var11]]);
						if (var11 == 1) {
							var10.method353(client.field603[0], client.field603[this.field112[var11]]);
						}
					}
				}
				return var10;
			} else {
				return this.field127.method390();
			}
		} catch (RuntimeException var13) {
			signlink.reporterror("40693, " + ", " + var13.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("AWOZVMFS.a(LEILHLJCE;I)V")
	public void method27(class17 arg0, int arg1) {
		try {
			arg0.field779 = 0;
			this.field119 = arg0.method224();
			this.field134 = arg0.method225();
			this.field109 = arg0.method225();
			this.field127 = null;
			this.field130 = 0;
			for (int var3 = 0; var3 < 12; var3++) {
				int var4 = arg0.method224();
				if (var4 == 0) {
					this.field122[var3] = 0;
				} else {
					int var5 = arg0.method224();
					this.field122[var3] = (var4 << 8) + var5;
					if (var3 == 0 && this.field122[0] == 65535) {
						this.field127 = class37.method393(arg0.method226());
						break;
					}
					if (this.field122[var3] >= 512 && this.field122[var3] - 512 < class67.field1534) {
						int var6 = class67.method526(this.field122[var3] - 512).field1500;
						if (var6 != 0) {
							this.field130 = var6;
						}
					}
				}
			}
			for (int var7 = 0; var7 < 5; var7++) {
				int var8 = arg0.method224();
				if (var8 < 0 || var8 >= client.field457[var7].length) {
					var8 = 0;
				}
				this.field112[var7] = var8;
			}
			super.field70 = arg0.method226();
			if (super.field70 == 65535) {
				super.field70 = -1;
			}
			super.field71 = arg0.method226();
			if (super.field71 == 65535) {
				super.field71 = -1;
			}
			super.field20 = arg0.method226();
			if (super.field20 == 65535) {
				super.field20 = -1;
			}
			super.field21 = arg0.method226();
			if (super.field21 == 65535) {
				super.field21 = -1;
			}
			super.field22 = arg0.method226();
			if (super.field22 == 65535) {
				super.field22 = -1;
			}
			super.field23 = arg0.method226();
			if (super.field23 == 65535) {
				super.field23 = -1;
			}
			super.field18 = arg0.method226();
			if (super.field18 == 65535) {
				super.field18 = -1;
			}
			this.field129 = class33.method370(class33.method367(arg0.method230()));
			this.field121 = arg0.method224();
			this.field114 = arg0.method226();
			this.field132 = true;
			this.field110 = 0L;
			int var9 = this.field122[5];
			int var10 = this.field122[9];
			this.field122[5] = var10;
			this.field122[9] = var9;
			for (int var11 = 0; var11 < 12; var11++) {
				this.field110 <<= 0x4;
				if (this.field122[var11] >= 256) {
					this.field110 += this.field122[var11] - 256;
				}
			}
			if (this.field122[0] >= 256) {
				this.field110 += this.field122[0] - 256 >> 4;
			}
			if (this.field122[1] >= 256) {
				this.field110 += this.field122[1] - 256 >> 8;
			}
			this.field122[5] = var9;
			this.field122[9] = var10;
			for (int var12 = 0; var12 < 5; var12++) {
				this.field110 <<= 0x3;
				this.field110 += this.field112[var12];
			}
			this.field110 <<= 0x1;
			int var15 = 36 / arg1;
			this.field110 += this.field119;
		} catch (RuntimeException var14) {
			signlink.reporterror("49178, " + arg0 + ", " + arg1 + ", " + var14.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("AWOZVMFS.a(I)LKBEXSZSN;")
	@Override
	public class31 method28() {
		try {
			if (!this.field132) {
				return null;
			}
			class31 var1 = this.method25();
			if (var1 == null) {
				return null;
			}
			super.field36 = var1.field1489;
			var1.field1033 = true;
			if (this.field113) {
				return var1;
			}
			if (super.field27 != -1 && super.field28 != -1) {
				class55 var2 = class55.field1367[super.field27];
				class31 var3 = var2.method461();
				if (var3 != null) {
					class31 var4 = new class31(false, 777, class25.method309(super.field28), var3, true);
					var4.method352(-super.field31, 0, 0);
					var4.method346(311);
					var4.method347(var2.field1371.field1186[super.field28]);
					var4.field1032 = null;
					var4.field1031 = null;
					if (var2.field1374 != 128 || var2.field1375 != 128) {
						var4.method355(this.field128, var2.field1374, var2.field1375, var2.field1374);
					}
					var4.method356(var2.field1377 + 64, var2.field1378 + 850, -30, -50, -30, true);
					class31[] var5 = new class31[] { var1, var4 };
					var1 = new class31(var5, 2, true, false);
				}
			}
			if (this.field126 != null) {
				if (client.field553 >= this.field108) {
					this.field126 = null;
				}
				if (client.field553 >= this.field107 && client.field553 < this.field108) {
					class31 var6 = this.field126;
					var6.method352(this.field124 - this.field120, this.field123 - super.field67, this.field125 - super.field68);
					if (super.field66 == 512) {
						var6.method350();
						var6.method350();
						var6.method350();
					} else if (super.field66 == 1024) {
						var6.method350();
						var6.method350();
					} else if (super.field66 == 1536) {
						var6.method350();
					}
					class31[] var7 = new class31[] { var1, var6 };
					var1 = new class31(var7, 2, true, false);
					if (super.field66 == 512) {
						var6.method350();
					} else if (super.field66 == 1024) {
						var6.method350();
						var6.method350();
					} else if (super.field66 == 1536) {
						var6.method350();
						var6.method350();
						var6.method350();
					}
					var6.method352(this.field120 - this.field124, super.field67 - this.field123, super.field68 - this.field125);
				}
			}
			var1.field1033 = true;
			return var1;
		} catch (RuntimeException var9) {
			signlink.reporterror("65366, " + ", " + var9.toString());
			throw new RuntimeException();
		}
	}
}
