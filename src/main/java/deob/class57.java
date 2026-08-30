package deob;

import sign.signlink;

@ObfuscatedName("TUJJLJTQ")
public final class class57 extends class66 {

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
	public class41 field1393;

	@ObfuscatedName("TUJJLJTQ.x")
	public int field1397;

	@ObfuscatedName("TUJJLJTQ.n")
	public int field1387;

	@ObfuscatedName("TUJJLJTQ.y")
	public final int field1398;

	@ObfuscatedName("TUJJLJTQ.z")
	public final int field1399;

	@ObfuscatedName("TUJJLJTQ.u")
	public final int[] field1394;

	@ObfuscatedName("TUJJLJTQ.v")
	public static client field1395;

	public class57(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7, byte arg8, int arg9) {
		try {
			this.field1384 = arg0;
			this.field1385 = arg1;
			this.field1386 = arg6;
			this.field1388 = arg9;
			this.field1389 = arg2;
			this.field1390 = arg7;
			this.field1391 = arg4;
			if (arg3 != -1) {
				this.field1393 = class41.field1184[arg3];
				this.field1397 = 0;
				this.field1387 = client.field553;
				if (arg5 && this.field1393.field1189 != -1) {
					this.field1397 = (int) (Math.random() * (double) this.field1393.field1185);
					this.field1387 -= (int) (Math.random() * (double) this.field1393.method413(this.field1397));
				}
			}
			class14 var11 = class14.method192(this.field1384);
			this.field1398 = var11.field732;
			this.field1399 = var11.field709;
			this.field1394 = var11.field726;
		} catch (RuntimeException var13) {
			signlink.reporterror("47582, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + -59 + ", " + arg9 + ", " + var13.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("TUJJLJTQ.b(I)LDQLJXYPC;")
	public class14 method462(int arg0) {
		try {
			int var10 = 54 / arg0;
			int var2 = -1;
			if (this.field1398 != -1) {
				class51 var3 = class51.field1328[this.field1398];
				int var4 = var3.field1330;
				int var5 = var3.field1331;
				int var6 = var3.field1332;
				int var7 = client.field528[var6 - var5];
				var2 = field1395.field643[var4] >> var5 & var7;
			} else if (this.field1399 != -1) {
				var2 = field1395.field643[this.field1399];
			}
			return var2 < 0 || var2 >= this.field1394.length || this.field1394[var2] == -1 ? null : class14.method192(this.field1394[var2]);
		} catch (RuntimeException var9) {
			signlink.reporterror("16570, " + arg0 + ", " + var9.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("TUJJLJTQ.a(I)LKBEXSZSN;")
	@Override
	public class31 method28() {
		try {
			int var1 = -1;
			if (this.field1393 != null) {
				int var2 = client.field553 - this.field1387;
				if (var2 > 100 && this.field1393.field1189 > 0) {
					var2 = 100;
				}
				label43: {
					do {
						do {
							if (var2 <= this.field1393.method413(this.field1397)) {
								break label43;
							}
							var2 -= this.field1393.method413(this.field1397);
							this.field1397++;
						} while (this.field1397 < this.field1393.field1185);
						this.field1397 -= this.field1393.field1189;
					} while (this.field1397 >= 0 && this.field1397 < this.field1393.field1185);
					this.field1393 = null;
				}
				this.field1387 = client.field553 - var2;
				if (this.field1393 != null) {
					var1 = this.field1393.field1186[this.field1397];
				}
			}
			class14 var3;
			if (this.field1394 == null) {
				var3 = class14.method192(this.field1384);
			} else {
				var3 = this.method462(this.field1392);
			}
			return var3 == null ? null : var3.method189(this.field1385, this.field1386, this.field1388, this.field1389, this.field1390, this.field1391, var1);
		} catch (RuntimeException var6) {
			signlink.reporterror("10231, " + ", " + var6.toString());
			throw new RuntimeException();
		}
	}
}
