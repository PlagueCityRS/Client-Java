package deob;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.zip.CRC32;
import java.util.zip.GZIPInputStream;
import sign.signlink;

@ObfuscatedName("YSAVREBH")
public final class class71 extends class18 implements Runnable {

	@ObfuscatedName("YSAVREBH.b")
	public boolean field1634 = true;

	@ObfuscatedName("YSAVREBH.e")
	public final boolean field1637 = true;

	@ObfuscatedName("YSAVREBH.g")
	public final byte[][] field1639 = new byte[4][];

	@ObfuscatedName("YSAVREBH.k")
	public final int field1643 = -376;

	@ObfuscatedName("YSAVREBH.l")
	public final class20 field1644 = new class20(807);

	@ObfuscatedName("YSAVREBH.o")
	public final boolean field1647 = false;

	@ObfuscatedName("YSAVREBH.s")
	public final class20 field1651 = new class20(807);

	@ObfuscatedName("YSAVREBH.u")
	public final int field1653 = -548;

	@ObfuscatedName("YSAVREBH.z")
	public boolean field1658 = false;

	@ObfuscatedName("YSAVREBH.A")
	public final byte[] field1659 = new byte[500];

	@ObfuscatedName("YSAVREBH.B")
	public final class20 field1660 = new class20(807);

	@ObfuscatedName("YSAVREBH.F")
	public String field1664 = "";

	@ObfuscatedName("YSAVREBH.G")
	public final class20 field1665 = new class20(807);

	@ObfuscatedName("YSAVREBH.H")
	public final int[][] field1666 = new int[4][];

	@ObfuscatedName("YSAVREBH.I")
	public final int[][] field1667 = new int[4][];

	@ObfuscatedName("YSAVREBH.J")
	public final boolean field1668 = true;

	@ObfuscatedName("YSAVREBH.K")
	public final class60 field1669 = new class60((byte) 6);

	@ObfuscatedName("YSAVREBH.L")
	public final byte[] field1670 = new byte[65000];

	@ObfuscatedName("YSAVREBH.N")
	public final boolean field1672 = true;

	@ObfuscatedName("YSAVREBH.O")
	public final int field1673 = 6;

	@ObfuscatedName("YSAVREBH.U")
	public final class20 field1679 = new class20(807);

	@ObfuscatedName("YSAVREBH.V")
	public final CRC32 field1680 = new CRC32();

	@ObfuscatedName("YSAVREBH.c")
	public int field1635;

	@ObfuscatedName("YSAVREBH.d")
	public int field1636;

	@ObfuscatedName("YSAVREBH.f")
	public int field1638;

	@ObfuscatedName("YSAVREBH.i")
	public int field1641;

	@ObfuscatedName("YSAVREBH.q")
	public int field1649;

	@ObfuscatedName("YSAVREBH.r")
	public int field1650;

	@ObfuscatedName("YSAVREBH.w")
	public int field1655;

	@ObfuscatedName("YSAVREBH.C")
	public int field1661;

	@ObfuscatedName("YSAVREBH.M")
	public int field1671;

	@ObfuscatedName("YSAVREBH.P")
	public int field1674;

	@ObfuscatedName("YSAVREBH.R")
	public int field1676;

	@ObfuscatedName("YSAVREBH.S")
	public int field1677;

	@ObfuscatedName("YSAVREBH.m")
	public long field1645;

	@ObfuscatedName("YSAVREBH.n")
	public class12 field1646;

	@ObfuscatedName("YSAVREBH.x")
	public client field1656;

	@ObfuscatedName("YSAVREBH.y")
	public InputStream field1657;

	@ObfuscatedName("YSAVREBH.v")
	public OutputStream field1654;

	@ObfuscatedName("YSAVREBH.E")
	public Socket field1663;

	@ObfuscatedName("YSAVREBH.j")
	public byte[] field1642;

	@ObfuscatedName("YSAVREBH.h")
	public int[] field1640;

	@ObfuscatedName("YSAVREBH.p")
	public int[] field1648;

	@ObfuscatedName("YSAVREBH.t")
	public int[] field1652;

	@ObfuscatedName("YSAVREBH.D")
	public int[] field1662;

	@ObfuscatedName("YSAVREBH.Q")
	public int[] field1675;

	@ObfuscatedName("YSAVREBH.T")
	public int[] field1678;

	@ObfuscatedName("YSAVREBH.a(Z)V")
	public void method583() {
		try {
			this.field1649 = 0;
			this.field1650 = 0;
			for (class12 var1 = (class12) this.field1665.method275(); var1 != null; var1 = (class12) this.field1665.method277()) {
				if (var1.field677) {
					this.field1649++;
				} else {
					this.field1650++;
				}
			}
			while (this.field1649 < 10) {
				class12 var2 = (class12) this.field1644.method274();
				if (var2 == null) {
					break;
				}
				if (this.field1639[var2.field679][var2.field680] != 0) {
					this.field1655++;
				}
				this.field1639[var2.field679][var2.field680] = 0;
				this.field1665.method272(var2);
				this.field1649++;
				this.method589(var2);
				this.field1658 = true;
			}
		} catch (RuntimeException var4) {
			signlink.reporterror("44587, " + false + ", " + var4.toString());
			throw new RuntimeException();
		}
	}

	@Override
	public void run() {
		try {
			while (this.field1634) {
				this.field1638++;
				byte var1 = 20;
				if (this.field1661 == 0 && this.field1656.field554[0] != null) {
					var1 = 50;
				}
				try {
					Thread.sleep((long) var1);
				} catch (Exception var9) {
				}
				this.field1658 = true;
				for (int var2 = 0; var2 < 100 && this.field1658; var2++) {
					this.field1658 = false;
					this.method602();
					this.method583();
					if (this.field1649 == 0 && var2 >= 5) {
						break;
					}
					this.method587(418);
					if (this.field1657 != null) {
						this.method596();
					}
				}
				boolean var3 = false;
				for (class12 var4 = (class12) this.field1665.method275(); var4 != null; var4 = (class12) this.field1665.method277()) {
					if (var4.field677) {
						var3 = true;
						var4.field681++;
						if (var4.field681 > 50) {
							var4.field681 = 0;
							this.method589(var4);
						}
					}
				}
				if (!var3) {
					for (class12 var5 = (class12) this.field1665.method275(); var5 != null; var5 = (class12) this.field1665.method277()) {
						var3 = true;
						var5.field681++;
						if (var5.field681 > 50) {
							var5.field681 = 0;
							this.method589(var5);
						}
					}
				}
				if (var3) {
					this.field1636++;
					if (this.field1636 > 750) {
						try {
							this.field1663.close();
						} catch (Exception var8) {
						}
						this.field1663 = null;
						this.field1657 = null;
						this.field1654 = null;
						this.field1677 = 0;
					}
				} else {
					this.field1636 = 0;
					this.field1664 = "";
				}
				if (this.field1656.field578 && this.field1663 != null && this.field1654 != null && (this.field1661 > 0 || this.field1656.field554[0] == null)) {
					this.field1641++;
					if (this.field1641 > 500) {
						this.field1641 = 0;
						this.field1659[0] = 0;
						this.field1659[1] = 0;
						this.field1659[2] = 0;
						this.field1659[3] = 10;
						try {
							this.field1654.write(this.field1659, 0, 4);
						} catch (IOException var7) {
							this.field1636 = 5000;
						}
					}
				}
			}
		} catch (Exception var10) {
			signlink.reporterror("od_ex " + var10.getMessage());
		}
	}

	@ObfuscatedName("YSAVREBH.a(IIIB)V")
	public void method584(int arg0, int arg1, byte arg2) {
		try {
			if (this.field1656.field554[0] != null && this.field1667[arg1][arg0] != 0) {
				byte[] var4 = this.field1656.field554[arg1 + 1].method31(arg0);
				if (!this.method591(this.field1667[arg1][arg0], var4, this.field1666[arg1][arg0])) {
					this.field1639[arg1][arg0] = arg2;
					if (arg2 > this.field1661) {
						this.field1661 = arg2;
					}
					this.field1635++;
				}
			}
		} catch (RuntimeException var6) {
			signlink.reporterror("53210, " + arg0 + ", " + -235 + ", " + arg1 + ", " + arg2 + ", " + var6.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("YSAVREBH.a(II)V")
	public void method585(int arg0, int arg1) {
		if (arg0 > this.field1667.length || arg1 < 0 || arg1 > this.field1667[arg0].length || this.field1667[arg0][arg1] == 0) {
			return;
		}
		class60 var3 = this.field1669;
		synchronized (this.field1669) {
			for (class12 var4 = (class12) this.field1669.method468(); var4 != null; var4 = (class12) this.field1669.method469()) {
				if (var4.field679 == arg0 && var4.field680 == arg1) {
					return;
				}
			}
			class12 var5 = new class12();
			var5.field679 = arg0;
			var5.field680 = arg1;
			var5.field677 = true;
			class20 var6 = this.field1679;
			synchronized (this.field1679) {
				this.field1679.method272(var5);
			}
			this.field1669.method466(var5);
		}
	}

	@ObfuscatedName("YSAVREBH.a(I)V")
	@Override
	public void method264(int arg0) {
		this.method585(0, arg0);
	}

	@ObfuscatedName("YSAVREBH.a(IZ)Z")
	public boolean method586(int arg0) {
		try {
			return this.field1652[arg0] == 1;
		} catch (RuntimeException var3) {
			signlink.reporterror("58910, " + arg0 + ", " + true + ", " + var3.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("YSAVREBH.b(I)V")
	public void method587(int arg0) {
		try {
			boolean var14 = false;
			while (this.field1649 == 0) {
				if (this.field1650 >= 10 || this.field1661 == 0) {
					return;
				}
				class20 var2 = this.field1651;
				class12 var3;
				synchronized (this.field1651) {
					var3 = (class12) this.field1651.method274();
				}
				while (var3 != null) {
					if (this.field1639[var3.field679][var3.field680] != 0) {
						this.field1639[var3.field679][var3.field680] = 0;
						this.field1665.method272(var3);
						this.method589(var3);
						this.field1658 = true;
						if (this.field1655 < this.field1635) {
							this.field1655++;
						}
						this.field1664 = "Loading extra files - " + this.field1655 * 100 / this.field1635 + "%";
						this.field1650++;
						if (this.field1650 == 10) {
							return;
						}
					}
					class20 var4 = this.field1651;
					synchronized (this.field1651) {
						var3 = (class12) this.field1651.method274();
					}
				}
				for (int var5 = 0; var5 < 4; var5++) {
					byte[] var6 = this.field1639[var5];
					int var7 = var6.length;
					for (int var8 = 0; var8 < var7; var8++) {
						if (var6[var8] == this.field1661) {
							var6[var8] = 0;
							class12 var9 = new class12();
							var9.field679 = var5;
							var9.field680 = var8;
							var9.field677 = false;
							this.field1665.method272(var9);
							this.method589(var9);
							this.field1658 = true;
							if (this.field1655 < this.field1635) {
								this.field1655++;
							}
							this.field1664 = "Loading extra files - " + this.field1655 * 100 / this.field1635 + "%";
							this.field1650++;
							if (this.field1650 == 10) {
								return;
							}
						}
					}
				}
				this.field1661--;
			}
		} catch (RuntimeException var13) {
			signlink.reporterror("68571, " + arg0 + ", " + var13.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("YSAVREBH.b(II)I")
	public int method588(int arg0) {
		try {
			return this.field1667[arg0].length;
		} catch (RuntimeException var3) {
			signlink.reporterror("14330, " + 2 + ", " + arg0 + ", " + var3.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("YSAVREBH.a(ZLCZKZHBFI;)V")
	public void method589(class12 arg0) {
		try {
			try {
				if (this.field1663 == null) {
					long var2 = System.currentTimeMillis();
					if (var2 - this.field1645 < 4000L) {
						return;
					}
					this.field1645 = var2;
					this.field1663 = this.field1656.method85(client.field235 + 43594);
					this.field1657 = this.field1663.getInputStream();
					this.field1654 = this.field1663.getOutputStream();
					this.field1654.write(15);
					for (int var4 = 0; var4 < 8; var4++) {
						this.field1657.read();
					}
					this.field1636 = 0;
				}
				this.field1659[0] = (byte) arg0.field679;
				this.field1659[1] = (byte) (arg0.field680 >> 8);
				this.field1659[2] = (byte) arg0.field680;
				if (arg0.field677) {
					this.field1659[3] = 2;
				} else if (this.field1656.field578) {
					this.field1659[3] = 0;
				} else {
					this.field1659[3] = 1;
				}
				this.field1654.write(this.field1659, 0, 4);
				this.field1641 = 0;
				this.field1671 = -10000;
			} catch (IOException var8) {
				try {
					this.field1663.close();
				} catch (Exception var7) {
				}
				this.field1663 = null;
				this.field1657 = null;
				this.field1654 = null;
				this.field1677 = 0;
				this.field1671++;
			}
		} catch (RuntimeException var9) {
			signlink.reporterror("34751, " + false + ", " + arg0 + ", " + var9.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("YSAVREBH.a(BI)Z")
	public boolean method590(int arg0) {
		try {
			for (int var2 = 0; var2 < this.field1648.length; var2++) {
				if (this.field1640[var2] == arg0) {
					return true;
				}
			}
			return false;
		} catch (RuntimeException var4) {
			signlink.reporterror("87972, " + -75 + ", " + arg0 + ", " + var4.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("YSAVREBH.a(II[BI)Z")
	public boolean method591(int arg0, byte[] arg1, int arg2) {
		try {
			if (arg1 == null || arg1.length < 2) {
				return false;
			}
			int var4 = arg1.length - 2;
			int var5 = ((arg1[var4] & 0xFF) << 8) + (arg1[var4 + 1] & 0xFF);
			this.field1680.reset();
			this.field1680.update(arg1, 0, var4);
			int var6 = (int) this.field1680.getValue();
			if (var5 == arg0) {
				return var6 == arg2;
			} else {
				return false;
			}
		} catch (RuntimeException var8) {
			signlink.reporterror("63306, " + arg0 + ", " + 6 + ", " + arg1 + ", " + arg2 + ", " + var8.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("YSAVREBH.c(II)I")
	public int method592(int arg0) {
		try {
			return this.field1642[arg0] & 0xFF;
		} catch (RuntimeException var3) {
			signlink.reporterror("284, " + ", " + arg0 + ", " + var3.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("YSAVREBH.a(LBBMKAXRK;Lclient;)V")
	public void method593(class6 arg0, client arg1) {
		String[] var3 = new String[] { "model_version", "anim_version", "midi_version", "map_version" };
		for (int var4 = 0; var4 < 4; var4++) {
			byte[] var5 = arg0.method30(var3[var4], null);
			int var6 = var5.length / 2;
			class17 var7 = new class17(var5, -26583);
			this.field1667[var4] = new int[var6];
			this.field1639[var4] = new byte[var6];
			for (int var8 = 0; var8 < var6; var8++) {
				this.field1667[var4][var8] = var7.method226();
			}
		}
		String[] var9 = new String[] { "model_crc", "anim_crc", "midi_crc", "map_crc" };
		for (int var10 = 0; var10 < 4; var10++) {
			byte[] var11 = arg0.method30(var9[var10], null);
			int var12 = var11.length / 4;
			class17 var13 = new class17(var11, -26583);
			this.field1666[var10] = new int[var12];
			for (int var14 = 0; var14 < var12; var14++) {
				this.field1666[var10][var14] = var13.method229();
			}
		}
		byte[] var15 = arg0.method30("model_index", null);
		int var16 = this.field1667[0].length;
		this.field1642 = new byte[var16];
		for (int var17 = 0; var17 < var16; var17++) {
			if (var17 < var15.length) {
				this.field1642[var17] = var15[var17];
			} else {
				this.field1642[var17] = 0;
			}
		}
		byte[] var18 = arg0.method30("map_index", null);
		class17 var19 = new class17(var18, -26583);
		int var20 = var18.length / 7;
		this.field1648 = new int[var20];
		this.field1675 = new int[var20];
		this.field1640 = new int[var20];
		this.field1662 = new int[var20];
		for (int var21 = 0; var21 < var20; var21++) {
			this.field1648[var21] = var19.method226();
			this.field1675[var21] = var19.method226();
			this.field1640[var21] = var19.method226();
			this.field1662[var21] = var19.method224();
		}
		byte[] var22 = arg0.method30("anim_index", null);
		class17 var23 = new class17(var22, -26583);
		int var24 = var22.length / 2;
		this.field1678 = new int[var24];
		for (int var25 = 0; var25 < var24; var25++) {
			this.field1678[var25] = var23.method226();
		}
		byte[] var26 = arg0.method30("midi_index", null);
		class17 var27 = new class17(var26, -26583);
		int var28 = var26.length;
		this.field1652 = new int[var28];
		for (int var29 = 0; var29 < var28; var29++) {
			this.field1652[var29] = var27.method224();
		}
		this.field1656 = arg1;
		this.field1634 = true;
		this.field1656.method23(this, 2);
	}

	@ObfuscatedName("YSAVREBH.a()I")
	public int method594() {
		class60 var1 = this.field1669;
		synchronized (this.field1669) {
			return this.field1669.method470();
		}
	}

	@ObfuscatedName("YSAVREBH.a(BZ)V")
	public void method595(boolean arg0) {
		try {
			int var2 = this.field1648.length;
			for (int var3 = 0; var3 < var2; var3++) {
				if (arg0 || this.field1662[var3] != 0) {
					this.method584(this.field1640[var3], 3, (byte) 2);
					this.method584(this.field1675[var3], 3, (byte) 2);
				}
			}
		} catch (RuntimeException var5) {
			signlink.reporterror("58337, " + 14 + ", " + arg0 + ", " + var5.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("YSAVREBH.b(Z)V")
	public void method596() {
		try {
			try {
				int var1 = this.field1657.available();
				if (this.field1677 == 0 && var1 >= 6) {
					this.field1658 = true;
					for (int var2 = 0; var2 < 6; var2 += this.field1657.read(this.field1659, var2, 6 - var2)) {
					}
					int var3 = this.field1659[0] & 0xFF;
					int var4 = ((this.field1659[1] & 0xFF) << 8) + (this.field1659[2] & 0xFF);
					int var5 = ((this.field1659[3] & 0xFF) << 8) + (this.field1659[4] & 0xFF);
					int var6 = this.field1659[5] & 0xFF;
					this.field1646 = null;
					for (class12 var7 = (class12) this.field1665.method275(); var7 != null; var7 = (class12) this.field1665.method277()) {
						if (var7.field679 == var3 && var7.field680 == var4) {
							this.field1646 = var7;
						}
						if (this.field1646 != null) {
							var7.field681 = 0;
						}
					}
					if (this.field1646 != null) {
						this.field1636 = 0;
						if (var5 == 0) {
							signlink.reporterror("Rej: " + var3 + "," + var4);
							this.field1646.field678 = null;
							if (this.field1646.field677) {
								class20 var8 = this.field1660;
								synchronized (this.field1660) {
									this.field1660.method272(this.field1646);
								}
							} else {
								this.field1646.method334();
							}
							this.field1646 = null;
						} else {
							if (this.field1646.field678 == null && var6 == 0) {
								this.field1646.field678 = new byte[var5];
							}
							if (this.field1646.field678 == null && var6 != 0) {
								throw new IOException("missing start of file");
							}
						}
					}
					this.field1676 = var6 * 500;
					this.field1677 = 500;
					if (this.field1677 > var5 - var6 * 500) {
						this.field1677 = var5 - var6 * 500;
					}
				}
				if (this.field1677 > 0 && var1 >= this.field1677) {
					this.field1658 = true;
					byte[] var9 = this.field1659;
					int var10 = 0;
					if (this.field1646 != null) {
						var9 = this.field1646.field678;
						var10 = this.field1676;
					}
					for (int var11 = 0; var11 < this.field1677; var11 += this.field1657.read(var9, var11 + var10, this.field1677 - var11)) {
					}
					if (this.field1677 + this.field1676 >= var9.length && this.field1646 != null) {
						if (this.field1656.field554[0] != null) {
							this.field1656.field554[this.field1646.field679 + 1].method32(var9.length, var9, this.field1646.field680);
						}
						if (!this.field1646.field677 && this.field1646.field679 == 3) {
							this.field1646.field677 = true;
							this.field1646.field679 = 93;
						}
						if (this.field1646.field677) {
							class20 var12 = this.field1660;
							synchronized (this.field1660) {
								this.field1660.method272(this.field1646);
							}
						} else {
							this.field1646.method334();
						}
					}
					this.field1677 = 0;
				}
			} catch (IOException var18) {
				try {
					this.field1663.close();
				} catch (Exception var15) {
				}
				this.field1663 = null;
				this.field1657 = null;
				this.field1654 = null;
				this.field1677 = 0;
			}
		} catch (RuntimeException var19) {
			signlink.reporterror("15558, " + false + ", " + var19.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("YSAVREBH.c(I)I")
	public int method597() {
		try {
			return this.field1678.length;
		} catch (RuntimeException var2) {
			signlink.reporterror("12962, " + ", " + var2.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("YSAVREBH.a(BII)V")
	public void method598(int arg0, int arg1) {
		try {
			if (this.field1656.field554[0] != null && (this.field1667[arg1][arg0] != 0 && (this.field1639[arg1][arg0] != 0 && this.field1661 != 0))) {
				class12 var3 = new class12();
				var3.field679 = arg1;
				var3.field680 = arg0;
				var3.field677 = false;
				class20 var4 = this.field1651;
				synchronized (this.field1651) {
					this.field1651.method272(var3);
				}
			}
		} catch (RuntimeException var7) {
			signlink.reporterror("16857, " + 40 + ", " + arg0 + ", " + arg1 + ", " + var7.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("YSAVREBH.b()LCZKZHBFI;")
	public class12 method599() {
		class20 var1 = this.field1660;
		class12 var2;
		synchronized (this.field1660) {
			var2 = (class12) this.field1660.method274();
		}
		if (var2 == null) {
			return null;
		}
		class60 var3 = this.field1669;
		synchronized (this.field1669) {
			var2.method35();
		}
		if (var2.field678 == null) {
			return var2;
		}
		int var4 = 0;
		try {
			GZIPInputStream var5 = new GZIPInputStream(new ByteArrayInputStream(var2.field678));
			while (true) {
				if (var4 == this.field1670.length) {
					throw new RuntimeException("buffer overflow!");
				}
				int var6 = var5.read(this.field1670, var4, this.field1670.length - var4);
				if (var6 == -1) {
					break;
				}
				var4 += var6;
			}
		} catch (IOException var10) {
			throw new RuntimeException("error unzipping");
		}
		var2.field678 = new byte[var4];
		for (int var7 = 0; var7 < var4; var7++) {
			var2.field678[var7] = this.field1670[var7];
		}
		return var2;
	}

	@ObfuscatedName("YSAVREBH.d(I)V")
	public void method600() {
		try {
			class20 var1 = this.field1651;
			synchronized (this.field1651) {
				this.field1651.method279();
			}
		} catch (RuntimeException var4) {
			signlink.reporterror("58402, " + -376 + ", " + var4.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("YSAVREBH.a(IIIZ)I")
	public int method601(int arg0, int arg1, int arg2) {
		try {
			int var4 = (arg1 << 8) + arg0;
			for (int var5 = 0; var5 < this.field1648.length; var5++) {
				if (this.field1648[var5] == var4) {
					if (arg2 == 0) {
						return this.field1675[var5];
					}
					return this.field1640[var5];
				}
			}
			return -1;
		} catch (RuntimeException var7) {
			signlink.reporterror("50745, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + false + ", " + var7.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("YSAVREBH.e(I)V")
	public void method602() {
		try {
			class20 var1 = this.field1679;
			class12 var2;
			synchronized (this.field1679) {
				var2 = (class12) this.field1679.method274();
			}
			if (this.field1673 > 6 || this.field1673 < 6) {
				for (int var3 = 1; var3 > 0; var3++) {
				}
			}
			while (var2 != null) {
				this.field1658 = true;
				byte[] var4 = null;
				if (this.field1656.field554[0] != null) {
					var4 = this.field1656.field554[var2.field679 + 1].method31(var2.field680);
				}
				if (!this.method591(this.field1667[var2.field679][var2.field680], var4, this.field1666[var2.field679][var2.field680])) {
					var4 = null;
				}
				class20 var5 = this.field1679;
				synchronized (this.field1679) {
					if (var4 == null) {
						this.field1644.method272(var2);
					} else {
						var2.field678 = var4;
						class20 var6 = this.field1660;
						synchronized (this.field1660) {
							this.field1660.method272(var2);
						}
					}
					var2 = (class12) this.field1679.method274();
				}
			}
		} catch (RuntimeException var11) {
			signlink.reporterror("95483, " + 6 + ", " + var11.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("YSAVREBH.c()V")
	public void method603() {
		this.field1634 = false;
	}
}
