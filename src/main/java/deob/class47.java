package deob;

import sign.signlink;

@ObfuscatedName("QGPCEBJK")
public final class class47 extends class66 {

	@ObfuscatedName("QGPCEBJK.v")
	public final boolean field1283 = false;

	@ObfuscatedName("QGPCEBJK.w")
	public final byte field1284 = 29;

	@ObfuscatedName("QGPCEBJK.x")
	public boolean field1285 = false;

	@ObfuscatedName("QGPCEBJK.H")
	public final class55 field1295;

	@ObfuscatedName("QGPCEBJK.t")
	public final int field1281;

	@ObfuscatedName("QGPCEBJK.m")
	public final int field1274;

	@ObfuscatedName("QGPCEBJK.n")
	public final int field1275;

	@ObfuscatedName("QGPCEBJK.o")
	public final int field1276;

	@ObfuscatedName("QGPCEBJK.I")
	public final int field1296;

	@ObfuscatedName("QGPCEBJK.J")
	public final int field1297;

	@ObfuscatedName("QGPCEBJK.y")
	public final int field1286;

	@ObfuscatedName("QGPCEBJK.z")
	public final int field1287;

	@ObfuscatedName("QGPCEBJK.A")
	public final int field1288;

	@ObfuscatedName("QGPCEBJK.p")
	public final int field1277;

	@ObfuscatedName("QGPCEBJK.q")
	public double field1278;

	@ObfuscatedName("QGPCEBJK.r")
	public double field1279;

	@ObfuscatedName("QGPCEBJK.s")
	public double field1280;

	@ObfuscatedName("QGPCEBJK.u")
	public double field1282;

	@ObfuscatedName("QGPCEBJK.B")
	public double field1289;

	@ObfuscatedName("QGPCEBJK.C")
	public double field1290;

	@ObfuscatedName("QGPCEBJK.D")
	public double field1291;

	@ObfuscatedName("QGPCEBJK.E")
	public double field1292;

	@ObfuscatedName("QGPCEBJK.k")
	public int field1272;

	@ObfuscatedName("QGPCEBJK.l")
	public int field1273;

	@ObfuscatedName("QGPCEBJK.F")
	public int field1293;

	@ObfuscatedName("QGPCEBJK.G")
	public int field1294;

	public class47(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
		try {
			this.field1295 = class55.field1367[arg11];
			this.field1281 = arg5;
			this.field1274 = arg7;
			this.field1275 = arg10;
			this.field1276 = arg9;
			this.field1296 = arg8;
			this.field1297 = arg1;
			this.field1286 = arg2;
			this.field1287 = arg4;
			this.field1288 = arg3;
			this.field1277 = arg0;
			this.field1285 = false;
			boolean var15 = false;
		} catch (RuntimeException var14) {
			signlink.reporterror("99383, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + arg10 + ", " + arg11 + ", " + var14.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("QGPCEBJK.a(I)LKBEXSZSN;")
	@Override
	public class31 method28() {
		try {
			class31 var1 = this.field1295.method461();
			if (var1 == null) {
				return null;
			}
			int var2 = -1;
			if (this.field1295.field1371 != null) {
				var2 = this.field1295.field1371.field1186[this.field1272];
			}
			class31 var3 = new class31(false, 777, class25.method309(var2), var1, true);
			if (var2 != -1) {
				var3.method346(311);
				var3.method347(var2);
				var3.field1032 = null;
				var3.field1031 = null;
			}
			if (this.field1295.field1374 != 128 || this.field1295.field1375 != 128) {
				var3.method355(this.field1284, this.field1295.field1374, this.field1295.field1375, this.field1295.field1374);
			}
			var3.method351(this.field1294);
			var3.method356(this.field1295.field1377 + 64, this.field1295.field1378 + 850, -30, -50, -30, true);
			return var3;
		} catch (RuntimeException var5) {
			signlink.reporterror("19285, " + ", " + var5.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("QGPCEBJK.a(IIZII)V")
	public void method437(int arg0, int arg1, int arg2, int arg3) {
		try {
			if (!this.field1285) {
				double var5 = (double) (arg2 - this.field1274);
				double var7 = (double) (arg0 - this.field1275);
				double var9 = Math.sqrt(var5 * var5 + var7 * var7);
				this.field1278 = (double) this.field1274 + var5 * (double) this.field1287 / var9;
				this.field1279 = (double) this.field1275 + var7 * (double) this.field1287 / var9;
				this.field1280 = this.field1276;
			}
			double var11 = (double) (this.field1297 + 1 - arg1);
			this.field1289 = ((double) arg2 - this.field1278) / var11;
			this.field1290 = ((double) arg0 - this.field1279) / var11;
			this.field1291 = Math.sqrt(this.field1289 * this.field1289 + this.field1290 * this.field1290);
			if (!this.field1285) {
				this.field1292 = -this.field1291 * Math.tan((double) this.field1286 * 0.02454369D);
			}
			this.field1282 = ((double) arg3 - this.field1280 - this.field1292 * var11) * 2.0D / (var11 * var11);
		} catch (RuntimeException var14) {
			signlink.reporterror("71411, " + arg0 + ", " + arg1 + ", " + false + ", " + arg2 + ", " + arg3 + ", " + var14.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("QGPCEBJK.a(II)V")
	public void method438(int arg0) {
		try {
			this.field1285 = true;
			this.field1278 += this.field1289 * (double) arg0;
			this.field1279 += this.field1290 * (double) arg0;
			this.field1280 += this.field1292 * (double) arg0 + this.field1282 * 0.5D * (double) arg0 * (double) arg0;
			this.field1292 += this.field1282 * (double) arg0;
			this.field1293 = (int) (Math.atan2(this.field1289, this.field1290) * 325.949D) + 1024 & 0x7FF;
			this.field1294 = (int) (Math.atan2(this.field1292, this.field1291) * 325.949D) & 0x7FF;
			if (this.field1295.field1371 != null) {
				this.field1273 += arg0;
				while (this.field1273 > this.field1295.field1371.method413(this.field1272)) {
					this.field1273 -= this.field1295.field1371.method413(this.field1272) + 1;
					this.field1272++;
					if (this.field1272 >= this.field1295.field1371.field1185) {
						this.field1272 = 0;
					}
				}
			}
		} catch (RuntimeException var3) {
			signlink.reporterror("67629, " + ", " + arg0 + ", " + var3.toString());
			throw new RuntimeException();
		}
	}
}
