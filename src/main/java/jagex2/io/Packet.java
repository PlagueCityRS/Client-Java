package jagex2.io;

import java.math.BigInteger;

import deob.ObfuscatedName;
import jagex2.datastruct.LinkList;
import jagex2.datastruct.Linkable2;
import sign.signlink;

@ObfuscatedName("EILHLJCE")
public final class Packet extends Linkable2 {

	@ObfuscatedName("EILHLJCE.x")
	public byte[] data;

	@ObfuscatedName("EILHLJCE.y")
	public int pos;

	@ObfuscatedName("EILHLJCE.A")
	public static final int[] crcTable = new int[256];

	@ObfuscatedName("EILHLJCE.C")
	public Isaac random;

	@ObfuscatedName("EILHLJCE.z")
	public int bitpos;

	@ObfuscatedName("EILHLJCE.B")
	public static final int[] bitmask;

	@ObfuscatedName("EILHLJCE.G")
	public static final LinkList cacheMin;

	@ObfuscatedName("EILHLJCE.H")
	public static final LinkList cacheMid;

	@ObfuscatedName("EILHLJCE.I")
	public static final LinkList cacheMax;

	@ObfuscatedName("EILHLJCE.J")
	public static final char[] base64enctab;

	@ObfuscatedName("EILHLJCE.D")
	public static int cacheMinCount;

	@ObfuscatedName("EILHLJCE.E")
	public static int cacheMidCount;

	@ObfuscatedName("EILHLJCE.F")
	public static int cacheMaxCount;

	@ObfuscatedName("EILHLJCE.h")
	public boolean field762 = false;

	@ObfuscatedName("EILHLJCE.i")
	public final boolean field763 = true;

	@ObfuscatedName("EILHLJCE.j")
	public final byte field764 = 5;

	@ObfuscatedName("EILHLJCE.l")
	public final byte field766 = 0;

	@ObfuscatedName("EILHLJCE.m")
	public final int field767 = 394;

	@ObfuscatedName("EILHLJCE.n")
	public final byte field768 = 6;

	@ObfuscatedName("EILHLJCE.o")
	public final int field769 = -36736;

	@ObfuscatedName("EILHLJCE.p")
	public final int field770 = 9;

	@ObfuscatedName("EILHLJCE.q")
	public final int field771 = -118;

	@ObfuscatedName("EILHLJCE.r")
	public final int field772 = 20;

	@ObfuscatedName("EILHLJCE.s")
	public boolean field773 = false;

	@ObfuscatedName("EILHLJCE.t")
	public int field774 = 9;

	@ObfuscatedName("EILHLJCE.u")
	public final boolean field775 = false;

	@ObfuscatedName("EILHLJCE.v")
	public int field776 = 4;

	@ObfuscatedName("EILHLJCE.w")
	public final int field777 = 534;

	@ObfuscatedName("EILHLJCE.k")
	public int field765;

	static {
		for (int var0 = 0; var0 < 256; var0++) {
			int var1 = var0;
			for (int var2 = 0; var2 < 8; var2++) {
				if ((var1 & 0x1) == 1) {
					var1 = var1 >>> 1 ^ 0xEDB88320;
				} else {
					var1 >>>= 0x1;
				}
			}
			crcTable[var0] = var1;
		}
		bitmask = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };
		cacheMin = new LinkList(807);
		cacheMid = new LinkList(807);
		cacheMax = new LinkList(807);
		base64enctab = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/' };
	}

	public Packet(int arg0) {
		try {
			if (arg0 != 0) {
				this.field773 = !this.field773;
			}
		} catch (RuntimeException var3) {
			signlink.reporterror("64859, " + arg0 + ", " + var3.toString());
			throw new RuntimeException();
		}
	}

	public Packet(byte[] arg0, int arg1) {
		try {
			this.data = arg0;
			this.pos = 0;
		} catch (RuntimeException var4) {
			signlink.reporterror("9332, " + arg0 + ", " + -26583 + ", " + var4.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("EILHLJCE.a(I)V")
	public void p1(int arg0) {
		this.data[this.pos++] = (byte) arg0;
	}

	@ObfuscatedName("EILHLJCE.b(I)V")
	public void p2(int arg0) {
		this.data[this.pos++] = (byte) (arg0 >> 8);
		this.data[this.pos++] = (byte) arg0;
	}

	@ObfuscatedName("EILHLJCE.c(I)V")
	public void p3(int arg0) {
		this.data[this.pos++] = (byte) (arg0 >> 16);
		this.data[this.pos++] = (byte) (arg0 >> 8);
		this.data[this.pos++] = (byte) arg0;
	}

	@ObfuscatedName("EILHLJCE.d(I)V")
	public void p4(int arg0) {
		this.data[this.pos++] = (byte) (arg0 >> 24);
		this.data[this.pos++] = (byte) (arg0 >> 16);
		this.data[this.pos++] = (byte) (arg0 >> 8);
		this.data[this.pos++] = (byte) arg0;
	}

	@ObfuscatedName("EILHLJCE.a(JZ)V")
	public void p8(long arg0) {
		try {
			this.data[this.pos++] = (byte) (arg0 >> 56);
			this.data[this.pos++] = (byte) (arg0 >> 48);
			this.data[this.pos++] = (byte) (arg0 >> 40);
			this.data[this.pos++] = (byte) (arg0 >> 32);
			this.data[this.pos++] = (byte) (arg0 >> 24);
			this.data[this.pos++] = (byte) (arg0 >> 16);
			this.data[this.pos++] = (byte) (arg0 >> 8);
			this.data[this.pos++] = (byte) arg0;
		} catch (RuntimeException var4) {
			signlink.reporterror("40495, " + arg0 + ", " + false + ", " + var4.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("EILHLJCE.a(Ljava/lang/String;)V")
	public void pjstr(String arg0) {
		arg0.getBytes(0, arg0.length(), this.data, this.pos);
		this.pos += arg0.length();
		this.data[this.pos++] = 10;
	}

	@ObfuscatedName("EILHLJCE.a(I[BIB)V")
	public void pdata(int arg0, byte[] arg1) {
		try {
			for (int var3 = 0; var3 < arg0; var3++) {
				this.data[this.pos++] = arg1[var3];
			}
		} catch (RuntimeException var5) {
			signlink.reporterror("80965, " + arg0 + ", " + arg1 + ", " + ", " + 44 + ", " + var5.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("EILHLJCE.c(IB)V")
	public void psize1(int arg0, byte arg1) {
		try {
			this.data[this.pos - arg0 - 1] = (byte) arg0;
			if (arg1 != 1) {
				this.field773 = !this.field773;
			}
		} catch (RuntimeException var4) {
			signlink.reporterror("44559, " + arg0 + ", " + arg1 + ", " + var4.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("EILHLJCE.c()I")
	public int g1() {
		return this.data[this.pos++] & 0xFF;
	}

	@ObfuscatedName("EILHLJCE.d()B")
	public byte g1b() {
		return this.data[this.pos++];
	}

	@ObfuscatedName("EILHLJCE.e()I")
	public int g2() {
		this.pos += 2;
		return ((this.data[this.pos - 2] & 0xFF) << 8) + (this.data[this.pos - 1] & 0xFF);
	}

	@ObfuscatedName("EILHLJCE.f()I")
	public int g2b() {
		this.pos += 2;
		int var1 = ((this.data[this.pos - 2] & 0xFF) << 8) + (this.data[this.pos - 1] & 0xFF);
		if (var1 > 32767) {
			var1 -= 65536;
		}
		return var1;
	}

	@ObfuscatedName("EILHLJCE.g()I")
	public int g3() {
		this.pos += 3;
		return ((this.data[this.pos - 3] & 0xFF) << 16) + ((this.data[this.pos - 2] & 0xFF) << 8) + (this.data[this.pos - 1] & 0xFF);
	}

	@ObfuscatedName("EILHLJCE.h()I")
	public int g4() {
		this.pos += 4;
		return ((this.data[this.pos - 4] & 0xFF) << 24) + ((this.data[this.pos - 3] & 0xFF) << 16) + ((this.data[this.pos - 2] & 0xFF) << 8) + (this.data[this.pos - 1] & 0xFF);
	}

	@ObfuscatedName("EILHLJCE.a(Z)J")
	public long g8() {
		try {
			long var1 = (long) this.g4() & 0xFFFFFFFFL;
			long var3 = (long) this.g4() & 0xFFFFFFFFL;
			return (var1 << 32) + var3;
		} catch (RuntimeException var6) {
			signlink.reporterror("79098, " + true + ", " + var6.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("EILHLJCE.a([BIII)V")
	public void gdata(byte[] arg0, int arg1) {
		try {
			for (int var3 = 0; var3 < arg1; var3++) {
				arg0[var3] = this.data[this.pos++];
			}
		} catch (RuntimeException var5) {
			signlink.reporterror("17844, " + arg0 + ", " + 8 + ", " + arg1 + ", " + ", " + var5.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("EILHLJCE.j()I")
	public int gsmarts() {
		int var1 = this.data[this.pos] & 0xFF;
		return var1 < 128 ? this.g1() - 64 : this.g2() - 49152;
	}

	@ObfuscatedName("EILHLJCE.k()I")
	public int gsmart() {
		int var1 = this.data[this.pos] & 0xFF;
		return var1 < 128 ? this.g1() : this.g2() - 32768;
	}

	@ObfuscatedName("EILHLJCE.a(ZLjava/math/BigInteger;Ljava/math/BigInteger;)V")
	public void rsaenc(boolean arg0, BigInteger arg1, BigInteger arg2) {
		try {
			int var4 = this.pos;
			this.pos = 0;
			if (!arg0) {
				this.field774 = 110;
			}
			byte[] var5 = new byte[var4];
			this.gdata(var5, var4);
			BigInteger var6 = new BigInteger(var5);
			BigInteger var7 = var6.modPow(arg2, arg1);
			byte[] var8 = var7.toByteArray();
			this.pos = 0;
			this.p1(var8.length);
			this.pdata(var8.length, var8);
		} catch (RuntimeException var10) {
			signlink.reporterror("79863, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + var10.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("EILHLJCE.a(IB)LEILHLJCE;")
	public static Packet alloc(int arg0, byte arg1) {
		try {
			if (arg1 != 9) {
				throw new NullPointerException();
			}
			LinkList var2 = cacheMid;
			synchronized (cacheMid) {
				Packet var3 = null;
				if (arg0 == 0 && cacheMinCount > 0) {
					cacheMinCount--;
					var3 = (Packet) cacheMin.popFront();
				} else if (arg0 == 1 && cacheMidCount > 0) {
					cacheMidCount--;
					var3 = (Packet) cacheMid.popFront();
				} else if (arg0 == 2 && cacheMaxCount > 0) {
					cacheMaxCount--;
					var3 = (Packet) cacheMax.popFront();
				}
				if (var3 != null) {
					var3.pos = 0;
					return var3;
				}
			}
			Packet var4 = new Packet(0);
			var4.pos = 0;
			if (arg0 == 0) {
				var4.data = new byte[100];
			} else if (arg0 == 1) {
				var4.data = new byte[5000];
			} else {
				var4.data = new byte[30000];
			}
			return var4;
		} catch (RuntimeException var7) {
			signlink.reporterror("33657, " + arg0 + ", " + arg1 + ", " + var7.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("EILHLJCE.a(II)V")
	public void p1enc(int arg0) {
		try {
			this.data[this.pos++] = (byte) (arg0 + this.random.takeNextValue());
		} catch (RuntimeException var3) {
			signlink.reporterror("19083, " + -164 + ", " + arg0 + ", " + var3.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("EILHLJCE.b(IB)V")
	public void ip2(int arg0, byte arg1) {
		try {
			if (arg1 != -77) {
				this.field776 = 122;
			}
			this.data[this.pos++] = (byte) arg0;
			this.data[this.pos++] = 0;
		} catch (RuntimeException var4) {
			signlink.reporterror("69978, " + arg0 + ", " + arg1 + ", " + var4.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("EILHLJCE.b(II)V")
	public void ip4(int arg0) {
		try {
			this.data[this.pos++] = (byte) arg0;
			this.data[this.pos++] = (byte) (arg0 >> 8);
			this.data[this.pos++] = (byte) (arg0 >> 16);
			this.data[this.pos++] = (byte) (arg0 >> 24);
		} catch (RuntimeException var3) {
			signlink.reporterror("8189, " + arg0 + ", " + 303 + ", " + var3.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("EILHLJCE.i()Ljava/lang/String;")
	public String gstr() {
		int var1 = this.pos;
		while (this.data[this.pos++] != 10) {
		}
		return new String(this.data, var1, this.pos - var1 - 1);
	}

	@ObfuscatedName("EILHLJCE.e(I)[B")
	public byte[] gstrbyte() {
		try {
			int var1 = this.pos;
			while (this.data[this.pos++] != 10) {
			}
			byte[] var2 = new byte[this.pos - var1 - 1];
			for (int var3 = var1; var3 < this.pos - 1; var3++) {
				var2[var3 - var1] = this.data[var3];
			}
			return var2;
		} catch (RuntimeException var5) {
			signlink.reporterror("11381, " + -40217 + ", " + var5.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("EILHLJCE.b(Z)V")
	public void gbitstart() {
		try {
			this.bitpos = this.pos * 8;
		} catch (RuntimeException var2) {
			signlink.reporterror("37361, " + true + ", " + var2.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("EILHLJCE.c(II)I")
	public int gbit(int arg0) {
		try {
			int var2 = this.bitpos >> 3;
			int var3 = 8 - (this.bitpos & 0x7);
			int var4 = 0;
			this.bitpos += arg0;
			while (arg0 > var3) {
				var4 += (this.data[var2++] & bitmask[var3]) << arg0 - var3;
				arg0 -= var3;
				var3 = 8;
			}
			int var5;
			if (arg0 == var3) {
				var5 = var4 + (this.data[var2] & bitmask[var3]);
			} else {
				var5 = var4 + (this.data[var2] >> var3 - arg0 & bitmask[arg0]);
			}
			return var5;
		} catch (RuntimeException var7) {
			signlink.reporterror("30907, " + arg0 + ", " + 24335 + ", " + var7.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("EILHLJCE.c(Z)V")
	public void gbitend() {
		try {
			this.pos = (this.bitpos + 7) / 8;
		} catch (RuntimeException var2) {
			signlink.reporterror("57044, " + false + ", " + var2.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("EILHLJCE.d(II)V")
	public void p1_alt1(int arg0) {
		try {
			this.data[this.pos++] = (byte) (arg0 + 128);
		} catch (RuntimeException var3) {
			signlink.reporterror("549, " + -8063 + ", " + arg0 + ", " + var3.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("EILHLJCE.e(II)V")
	public void p1_alt2(int arg0) {
		try {
			this.data[this.pos++] = (byte) -arg0;
		} catch (RuntimeException var3) {
			signlink.reporterror("90133, " + ", " + arg0 + ", " + var3.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("EILHLJCE.a(ZI)V")
	public void p1_alt3(int arg0) {
		try {
			this.data[this.pos++] = (byte) (128 - arg0);
		} catch (RuntimeException var3) {
			signlink.reporterror("16739, " + true + ", " + arg0 + ", " + var3.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("EILHLJCE.d(Z)I")
	public int g1_alt1() {
		try {
			return this.data[this.pos++] - 128 & 0xFF;
		} catch (RuntimeException var2) {
			signlink.reporterror("84265, " + true + ", " + var2.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("EILHLJCE.f(I)I")
	public int g1_alt2() {
		try {
			return -this.data[this.pos++] & 0xFF;
		} catch (RuntimeException var2) {
			signlink.reporterror("13196, " + 6335 + ", " + var2.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("EILHLJCE.g(I)I")
	public int g1_alt3() {
		try {
			return 128 - this.data[this.pos++] & 0xFF;
		} catch (RuntimeException var2) {
			signlink.reporterror("16361, " + 2 + ", " + var2.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("EILHLJCE.a(B)B")
	public byte g1b_alt1() {
		try {
			return (byte) (this.data[this.pos++] - 128);
		} catch (RuntimeException var2) {
			signlink.reporterror("90327, " + -55 + ", " + var2.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("EILHLJCE.b(B)B")
	public byte g1b_alt2() {
		try {
			return (byte) -this.data[this.pos++];
		} catch (RuntimeException var2) {
			signlink.reporterror("83676, " + 4 + ", " + var2.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("EILHLJCE.h(I)B")
	public byte g1b_alt3() {
		try {
			return (byte) (128 - this.data[this.pos++]);
		} catch (RuntimeException var2) {
			signlink.reporterror("67960, " + 30392 + ", " + var2.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("EILHLJCE.f(II)V")
	public void p2_alt1(int arg0) {
		try {
			this.data[this.pos++] = (byte) arg0;
			this.data[this.pos++] = (byte) (arg0 >> 8);
		} catch (RuntimeException var3) {
			signlink.reporterror("73426, " + -133 + ", " + arg0 + ", " + var3.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("EILHLJCE.d(IB)V")
	public void p2_alt2(int arg0) {
		try {
			if (this.field766 == 0) {
				this.data[this.pos++] = (byte) (arg0 >> 8);
				this.data[this.pos++] = (byte) (arg0 + 128);
			}
		} catch (RuntimeException var3) {
			signlink.reporterror("2481, " + arg0 + ", " + ", " + var3.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("EILHLJCE.g(II)V")
	public void p2_alt3(int arg0) {
		try {
			this.data[this.pos++] = (byte) (arg0 + 128);
			this.data[this.pos++] = (byte) (arg0 >> 8);
		} catch (RuntimeException var3) {
			signlink.reporterror("31008, " + -302 + ", " + arg0 + ", " + var3.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("EILHLJCE.i(I)I")
	public int g2_alt1() {
		try {
			this.pos += 2;
			return ((this.data[this.pos - 1] & 0xFF) << 8) + (this.data[this.pos - 2] & 0xFF);
		} catch (RuntimeException var2) {
			signlink.reporterror("14828, " + ", " + var2.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("EILHLJCE.j(I)I")
	public int g2_alt2() {
		try {
			this.pos += 2;
			return ((this.data[this.pos - 2] & 0xFF) << 8) + (this.data[this.pos - 1] - 128 & 0xFF);
		} catch (RuntimeException var2) {
			signlink.reporterror("7332, " + 394 + ", " + var2.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("EILHLJCE.k(I)I")
	public int g2_alt3() {
		try {
			this.pos += 2;
			return ((this.data[this.pos - 1] & 0xFF) << 8) + (this.data[this.pos - 2] - 128 & 0xFF);
		} catch (RuntimeException var2) {
			signlink.reporterror("63807, " + ", " + var2.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("EILHLJCE.l(I)I")
	public int g2b_alt1() {
		try {
			this.pos += 2;
			int var1 = ((this.data[this.pos - 1] & 0xFF) << 8) + (this.data[this.pos - 2] & 0xFF);
			if (var1 > 32767) {
				var1 -= 65536;
			}
			return var1;
		} catch (RuntimeException var3) {
			signlink.reporterror("70868, " + 47979 + ", " + var3.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("EILHLJCE.c(B)I")
	public int g2b_alt2() {
		try {
			this.pos += 2;
			int var1 = ((this.data[this.pos - 2] & 0xFF) << 8) + (this.data[this.pos - 1] - 128 & 0xFF);
			if (this.field768 == 6) {
				if (var1 > 32767) {
					var1 -= 65536;
				}
				return var1;
			} else {
				return 1;
			}
		} catch (RuntimeException var3) {
			signlink.reporterror("47454, " + 6 + ", " + var3.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("EILHLJCE.e(Z)I")
	public int g2b_alt3() {
		try {
			this.pos += 2;
			int var1 = ((this.data[this.pos - 1] & 0xFF) << 8) + (this.data[this.pos - 2] - 128 & 0xFF);
			if (var1 > 32767) {
				var1 -= 65536;
			}
			return var1;
		} catch (RuntimeException var3) {
			signlink.reporterror("70424, " + false + ", " + var3.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("EILHLJCE.f(Z)I")
	public int g3_alt3() {
		try {
			this.pos += 3;
			return ((this.data[this.pos - 2] & 0xFF) << 16) + ((this.data[this.pos - 3] & 0xFF) << 8) + (this.data[this.pos - 1] & 0xFF);
		} catch (RuntimeException var2) {
			signlink.reporterror("84937, " + true + ", " + var2.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("EILHLJCE.m(I)I")
	public int g4_alt1() {
		try {
			this.pos += 4;
			return ((this.data[this.pos - 1] & 0xFF) << 24) + ((this.data[this.pos - 2] & 0xFF) << 16) + ((this.data[this.pos - 3] & 0xFF) << 8) + (this.data[this.pos - 4] & 0xFF);
		} catch (RuntimeException var2) {
			signlink.reporterror("17042, " + -148 + ", " + var2.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("EILHLJCE.d(B)I")
	public int g4_alt2() {
		try {
			this.pos += 4;
			return ((this.data[this.pos - 2] & 0xFF) << 24) + ((this.data[this.pos - 1] & 0xFF) << 16) + ((this.data[this.pos - 4] & 0xFF) << 8) + (this.data[this.pos - 3] & 0xFF);
		} catch (RuntimeException var2) {
			signlink.reporterror("38069, " + 54 + ", " + var2.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("EILHLJCE.n(I)I")
	public int g4_alt3(int arg0) {
		try {
			if (arg0 >= 0) {
				this.field762 = !this.field762;
			}
			this.pos += 4;
			return ((this.data[this.pos - 3] & 0xFF) << 24) + ((this.data[this.pos - 4] & 0xFF) << 16) + ((this.data[this.pos - 1] & 0xFF) << 8) + (this.data[this.pos - 2] & 0xFF);
		} catch (RuntimeException var3) {
			signlink.reporterror("98539, " + arg0 + ", " + var3.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("EILHLJCE.b([BIII)V")
	public void gdata_alt1(byte[] arg0, int arg1) {
		try {
			for (int var3 = 0; var3 < arg1; var3++) {
				this.data[this.pos++] = (byte) (arg0[var3] + 128);
			}
		} catch (RuntimeException var5) {
			signlink.reporterror("52280, " + arg0 + ", " + arg1 + ", " + -459 + ", " + ", " + var5.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("EILHLJCE.a(III[B)V")
	public void gdata_alt2(int arg0, byte[] arg1) {
		try {
			for (int var3 = arg0 - 1; var3 >= 0; var3--) {
				arg1[var3] = (byte) (this.data[this.pos++] - 128);
			}
		} catch (RuntimeException var5) {
			signlink.reporterror("79873, " + ", " + arg0 + ", " + ", " + arg1 + ", " + var5.toString());
			throw new RuntimeException();
		}
	}
}
