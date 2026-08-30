package deob;

import java.math.BigInteger;
import sign.signlink;

@ObfuscatedName("EILHLJCE")
public final class class17 extends class8 {

	@ObfuscatedName("EILHLJCE.A")
	public static final int[] field781 = new int[256];

	@ObfuscatedName("EILHLJCE.B")
	public static final int[] field782;

	@ObfuscatedName("EILHLJCE.G")
	public static final class20 field787;

	@ObfuscatedName("EILHLJCE.H")
	public static final class20 field788;

	@ObfuscatedName("EILHLJCE.I")
	public static final class20 field789;

	@ObfuscatedName("EILHLJCE.J")
	public static final char[] field790;

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

	@ObfuscatedName("EILHLJCE.x")
	public byte[] field778;

	@ObfuscatedName("EILHLJCE.y")
	public int field779;

	@ObfuscatedName("EILHLJCE.k")
	public int field765;

	@ObfuscatedName("EILHLJCE.z")
	public int field780;

	@ObfuscatedName("EILHLJCE.D")
	public static int field784;

	@ObfuscatedName("EILHLJCE.E")
	public static int field785;

	@ObfuscatedName("EILHLJCE.F")
	public static int field786;

	@ObfuscatedName("EILHLJCE.C")
	public class70 field783;

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
			field781[var0] = var1;
		}
		field782 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };
		field787 = new class20(807);
		field788 = new class20(807);
		field789 = new class20(807);
		field790 = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/' };
	}

	@ObfuscatedName("EILHLJCE.a(IB)LEILHLJCE;")
	public static class17 method212(int arg0, byte arg1) {
		try {
			if (arg1 != 9) {
				throw new NullPointerException();
			}
			class20 var2 = field788;
			synchronized (field788) {
				class17 var3 = null;
				if (arg0 == 0 && field784 > 0) {
					field784--;
					var3 = (class17) field787.method274();
				} else if (arg0 == 1 && field785 > 0) {
					field785--;
					var3 = (class17) field788.method274();
				} else if (arg0 == 2 && field786 > 0) {
					field786--;
					var3 = (class17) field789.method274();
				}
				if (var3 != null) {
					var3.field779 = 0;
					return var3;
				}
			}
			class17 var4 = new class17(0);
			var4.field779 = 0;
			if (arg0 == 0) {
				var4.field778 = new byte[100];
			} else if (arg0 == 1) {
				var4.field778 = new byte[5000];
			} else {
				var4.field778 = new byte[30000];
			}
			return var4;
		} catch (RuntimeException var7) {
			signlink.reporterror("33657, " + arg0 + ", " + arg1 + ", " + var7.toString());
			throw new RuntimeException();
		}
	}

	public class17(int arg0) {
		try {
			if (arg0 != 0) {
				this.field773 = !this.field773;
			}
		} catch (RuntimeException var3) {
			signlink.reporterror("64859, " + arg0 + ", " + var3.toString());
			throw new RuntimeException();
		}
	}

	public class17(byte[] arg0, int arg1) {
		try {
			this.field778 = arg0;
			this.field779 = 0;
		} catch (RuntimeException var4) {
			signlink.reporterror("9332, " + arg0 + ", " + -26583 + ", " + var4.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("EILHLJCE.a(II)V")
	public void method213(int arg0) {
		try {
			this.field778[this.field779++] = (byte) (arg0 + this.field783.method580());
		} catch (RuntimeException var3) {
			signlink.reporterror("19083, " + -164 + ", " + arg0 + ", " + var3.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("EILHLJCE.a(I)V")
	public void method214(int arg0) {
		this.field778[this.field779++] = (byte) arg0;
	}

	@ObfuscatedName("EILHLJCE.b(I)V")
	public void method215(int arg0) {
		this.field778[this.field779++] = (byte) (arg0 >> 8);
		this.field778[this.field779++] = (byte) arg0;
	}

	@ObfuscatedName("EILHLJCE.b(IB)V")
	public void method216(int arg0, byte arg1) {
		try {
			if (arg1 != -77) {
				this.field776 = 122;
			}
			this.field778[this.field779++] = (byte) arg0;
			this.field778[this.field779++] = 0;
		} catch (RuntimeException var4) {
			signlink.reporterror("69978, " + arg0 + ", " + arg1 + ", " + var4.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("EILHLJCE.c(I)V")
	public void method217(int arg0) {
		this.field778[this.field779++] = (byte) (arg0 >> 16);
		this.field778[this.field779++] = (byte) (arg0 >> 8);
		this.field778[this.field779++] = (byte) arg0;
	}

	@ObfuscatedName("EILHLJCE.d(I)V")
	public void method218(int arg0) {
		this.field778[this.field779++] = (byte) (arg0 >> 24);
		this.field778[this.field779++] = (byte) (arg0 >> 16);
		this.field778[this.field779++] = (byte) (arg0 >> 8);
		this.field778[this.field779++] = (byte) arg0;
	}

	@ObfuscatedName("EILHLJCE.b(II)V")
	public void method219(int arg0) {
		try {
			this.field778[this.field779++] = (byte) arg0;
			this.field778[this.field779++] = (byte) (arg0 >> 8);
			this.field778[this.field779++] = (byte) (arg0 >> 16);
			this.field778[this.field779++] = (byte) (arg0 >> 24);
		} catch (RuntimeException var3) {
			signlink.reporterror("8189, " + arg0 + ", " + 303 + ", " + var3.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("EILHLJCE.a(JZ)V")
	public void method220(long arg0) {
		try {
			this.field778[this.field779++] = (byte) (arg0 >> 56);
			this.field778[this.field779++] = (byte) (arg0 >> 48);
			this.field778[this.field779++] = (byte) (arg0 >> 40);
			this.field778[this.field779++] = (byte) (arg0 >> 32);
			this.field778[this.field779++] = (byte) (arg0 >> 24);
			this.field778[this.field779++] = (byte) (arg0 >> 16);
			this.field778[this.field779++] = (byte) (arg0 >> 8);
			this.field778[this.field779++] = (byte) arg0;
		} catch (RuntimeException var4) {
			signlink.reporterror("40495, " + arg0 + ", " + false + ", " + var4.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("EILHLJCE.a(Ljava/lang/String;)V")
	public void method221(String arg0) {
		arg0.getBytes(0, arg0.length(), this.field778, this.field779);
		this.field779 += arg0.length();
		this.field778[this.field779++] = 10;
	}

	@ObfuscatedName("EILHLJCE.a(I[BIB)V")
	public void method222(int arg0, byte[] arg1) {
		try {
			for (int var3 = 0; var3 < arg0; var3++) {
				this.field778[this.field779++] = arg1[var3];
			}
		} catch (RuntimeException var5) {
			signlink.reporterror("80965, " + arg0 + ", " + arg1 + ", " + ", " + 44 + ", " + var5.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("EILHLJCE.c(IB)V")
	public void method223(int arg0, byte arg1) {
		try {
			this.field778[this.field779 - arg0 - 1] = (byte) arg0;
			if (arg1 != 1) {
				this.field773 = !this.field773;
			}
		} catch (RuntimeException var4) {
			signlink.reporterror("44559, " + arg0 + ", " + arg1 + ", " + var4.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("EILHLJCE.c()I")
	public int method224() {
		return this.field778[this.field779++] & 0xFF;
	}

	@ObfuscatedName("EILHLJCE.d()B")
	public byte method225() {
		return this.field778[this.field779++];
	}

	@ObfuscatedName("EILHLJCE.e()I")
	public int method226() {
		this.field779 += 2;
		return ((this.field778[this.field779 - 2] & 0xFF) << 8) + (this.field778[this.field779 - 1] & 0xFF);
	}

	@ObfuscatedName("EILHLJCE.f()I")
	public int method227() {
		this.field779 += 2;
		int var1 = ((this.field778[this.field779 - 2] & 0xFF) << 8) + (this.field778[this.field779 - 1] & 0xFF);
		if (var1 > 32767) {
			var1 -= 65536;
		}
		return var1;
	}

	@ObfuscatedName("EILHLJCE.g()I")
	public int method228() {
		this.field779 += 3;
		return ((this.field778[this.field779 - 3] & 0xFF) << 16) + ((this.field778[this.field779 - 2] & 0xFF) << 8) + (this.field778[this.field779 - 1] & 0xFF);
	}

	@ObfuscatedName("EILHLJCE.h()I")
	public int method229() {
		this.field779 += 4;
		return ((this.field778[this.field779 - 4] & 0xFF) << 24) + ((this.field778[this.field779 - 3] & 0xFF) << 16) + ((this.field778[this.field779 - 2] & 0xFF) << 8) + (this.field778[this.field779 - 1] & 0xFF);
	}

	@ObfuscatedName("EILHLJCE.a(Z)J")
	public long method230() {
		try {
			long var1 = (long) this.method229() & 0xFFFFFFFFL;
			long var3 = (long) this.method229() & 0xFFFFFFFFL;
			return (var1 << 32) + var3;
		} catch (RuntimeException var6) {
			signlink.reporterror("79098, " + true + ", " + var6.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("EILHLJCE.i()Ljava/lang/String;")
	public String method231() {
		int var1 = this.field779;
		while (this.field778[this.field779++] != 10) {
		}
		return new String(this.field778, var1, this.field779 - var1 - 1);
	}

	@ObfuscatedName("EILHLJCE.e(I)[B")
	public byte[] method232() {
		try {
			int var1 = this.field779;
			while (this.field778[this.field779++] != 10) {
			}
			byte[] var2 = new byte[this.field779 - var1 - 1];
			for (int var3 = var1; var3 < this.field779 - 1; var3++) {
				var2[var3 - var1] = this.field778[var3];
			}
			return var2;
		} catch (RuntimeException var5) {
			signlink.reporterror("11381, " + -40217 + ", " + var5.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("EILHLJCE.a([BIII)V")
	public void method233(byte[] arg0, int arg1) {
		try {
			for (int var3 = 0; var3 < arg1; var3++) {
				arg0[var3] = this.field778[this.field779++];
			}
		} catch (RuntimeException var5) {
			signlink.reporterror("17844, " + arg0 + ", " + 8 + ", " + arg1 + ", " + ", " + var5.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("EILHLJCE.b(Z)V")
	public void method234() {
		try {
			this.field780 = this.field779 * 8;
		} catch (RuntimeException var2) {
			signlink.reporterror("37361, " + true + ", " + var2.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("EILHLJCE.c(II)I")
	public int method235(int arg0) {
		try {
			int var2 = this.field780 >> 3;
			int var3 = 8 - (this.field780 & 0x7);
			int var4 = 0;
			this.field780 += arg0;
			while (arg0 > var3) {
				var4 += (this.field778[var2++] & field782[var3]) << arg0 - var3;
				arg0 -= var3;
				var3 = 8;
			}
			int var5;
			if (arg0 == var3) {
				var5 = var4 + (this.field778[var2] & field782[var3]);
			} else {
				var5 = var4 + (this.field778[var2] >> var3 - arg0 & field782[arg0]);
			}
			return var5;
		} catch (RuntimeException var7) {
			signlink.reporterror("30907, " + arg0 + ", " + 24335 + ", " + var7.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("EILHLJCE.c(Z)V")
	public void method236() {
		try {
			this.field779 = (this.field780 + 7) / 8;
		} catch (RuntimeException var2) {
			signlink.reporterror("57044, " + false + ", " + var2.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("EILHLJCE.j()I")
	public int method237() {
		int var1 = this.field778[this.field779] & 0xFF;
		return var1 < 128 ? this.method224() - 64 : this.method226() - 49152;
	}

	@ObfuscatedName("EILHLJCE.k()I")
	public int method238() {
		int var1 = this.field778[this.field779] & 0xFF;
		return var1 < 128 ? this.method224() : this.method226() - 32768;
	}

	@ObfuscatedName("EILHLJCE.a(ZLjava/math/BigInteger;Ljava/math/BigInteger;)V")
	public void method239(boolean arg0, BigInteger arg1, BigInteger arg2) {
		try {
			int var4 = this.field779;
			this.field779 = 0;
			if (!arg0) {
				this.field774 = 110;
			}
			byte[] var5 = new byte[var4];
			this.method233(var5, var4);
			BigInteger var6 = new BigInteger(var5);
			BigInteger var7 = var6.modPow(arg2, arg1);
			byte[] var8 = var7.toByteArray();
			this.field779 = 0;
			this.method214(var8.length);
			this.method222(var8.length, var8);
		} catch (RuntimeException var10) {
			signlink.reporterror("79863, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + var10.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("EILHLJCE.d(II)V")
	public void method240(int arg0) {
		try {
			this.field778[this.field779++] = (byte) (arg0 + 128);
		} catch (RuntimeException var3) {
			signlink.reporterror("549, " + -8063 + ", " + arg0 + ", " + var3.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("EILHLJCE.e(II)V")
	public void method241(int arg0) {
		try {
			this.field778[this.field779++] = (byte) -arg0;
		} catch (RuntimeException var3) {
			signlink.reporterror("90133, " + ", " + arg0 + ", " + var3.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("EILHLJCE.a(ZI)V")
	public void method242(int arg0) {
		try {
			this.field778[this.field779++] = (byte) (128 - arg0);
		} catch (RuntimeException var3) {
			signlink.reporterror("16739, " + true + ", " + arg0 + ", " + var3.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("EILHLJCE.d(Z)I")
	public int method243() {
		try {
			return this.field778[this.field779++] - 128 & 0xFF;
		} catch (RuntimeException var2) {
			signlink.reporterror("84265, " + true + ", " + var2.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("EILHLJCE.f(I)I")
	public int method244() {
		try {
			return -this.field778[this.field779++] & 0xFF;
		} catch (RuntimeException var2) {
			signlink.reporterror("13196, " + 6335 + ", " + var2.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("EILHLJCE.g(I)I")
	public int method245() {
		try {
			return 128 - this.field778[this.field779++] & 0xFF;
		} catch (RuntimeException var2) {
			signlink.reporterror("16361, " + 2 + ", " + var2.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("EILHLJCE.a(B)B")
	public byte method246() {
		try {
			return (byte) (this.field778[this.field779++] - 128);
		} catch (RuntimeException var2) {
			signlink.reporterror("90327, " + -55 + ", " + var2.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("EILHLJCE.b(B)B")
	public byte method247() {
		try {
			return (byte) -this.field778[this.field779++];
		} catch (RuntimeException var2) {
			signlink.reporterror("83676, " + 4 + ", " + var2.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("EILHLJCE.h(I)B")
	public byte method248() {
		try {
			return (byte) (128 - this.field778[this.field779++]);
		} catch (RuntimeException var2) {
			signlink.reporterror("67960, " + 30392 + ", " + var2.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("EILHLJCE.f(II)V")
	public void method249(int arg0) {
		try {
			this.field778[this.field779++] = (byte) arg0;
			this.field778[this.field779++] = (byte) (arg0 >> 8);
		} catch (RuntimeException var3) {
			signlink.reporterror("73426, " + -133 + ", " + arg0 + ", " + var3.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("EILHLJCE.d(IB)V")
	public void method250(int arg0) {
		try {
			if (this.field766 == 0) {
				this.field778[this.field779++] = (byte) (arg0 >> 8);
				this.field778[this.field779++] = (byte) (arg0 + 128);
			}
		} catch (RuntimeException var3) {
			signlink.reporterror("2481, " + arg0 + ", " + ", " + var3.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("EILHLJCE.g(II)V")
	public void method251(int arg0) {
		try {
			this.field778[this.field779++] = (byte) (arg0 + 128);
			this.field778[this.field779++] = (byte) (arg0 >> 8);
		} catch (RuntimeException var3) {
			signlink.reporterror("31008, " + -302 + ", " + arg0 + ", " + var3.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("EILHLJCE.i(I)I")
	public int method252() {
		try {
			this.field779 += 2;
			return ((this.field778[this.field779 - 1] & 0xFF) << 8) + (this.field778[this.field779 - 2] & 0xFF);
		} catch (RuntimeException var2) {
			signlink.reporterror("14828, " + ", " + var2.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("EILHLJCE.j(I)I")
	public int method253() {
		try {
			this.field779 += 2;
			return ((this.field778[this.field779 - 2] & 0xFF) << 8) + (this.field778[this.field779 - 1] - 128 & 0xFF);
		} catch (RuntimeException var2) {
			signlink.reporterror("7332, " + 394 + ", " + var2.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("EILHLJCE.k(I)I")
	public int method254() {
		try {
			this.field779 += 2;
			return ((this.field778[this.field779 - 1] & 0xFF) << 8) + (this.field778[this.field779 - 2] - 128 & 0xFF);
		} catch (RuntimeException var2) {
			signlink.reporterror("63807, " + ", " + var2.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("EILHLJCE.l(I)I")
	public int method255() {
		try {
			this.field779 += 2;
			int var1 = ((this.field778[this.field779 - 1] & 0xFF) << 8) + (this.field778[this.field779 - 2] & 0xFF);
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
	public int method256() {
		try {
			this.field779 += 2;
			int var1 = ((this.field778[this.field779 - 2] & 0xFF) << 8) + (this.field778[this.field779 - 1] - 128 & 0xFF);
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
	public int method257() {
		try {
			this.field779 += 2;
			int var1 = ((this.field778[this.field779 - 1] & 0xFF) << 8) + (this.field778[this.field779 - 2] - 128 & 0xFF);
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
	public int method258() {
		try {
			this.field779 += 3;
			return ((this.field778[this.field779 - 2] & 0xFF) << 16) + ((this.field778[this.field779 - 3] & 0xFF) << 8) + (this.field778[this.field779 - 1] & 0xFF);
		} catch (RuntimeException var2) {
			signlink.reporterror("84937, " + true + ", " + var2.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("EILHLJCE.m(I)I")
	public int method259() {
		try {
			this.field779 += 4;
			return ((this.field778[this.field779 - 1] & 0xFF) << 24) + ((this.field778[this.field779 - 2] & 0xFF) << 16) + ((this.field778[this.field779 - 3] & 0xFF) << 8) + (this.field778[this.field779 - 4] & 0xFF);
		} catch (RuntimeException var2) {
			signlink.reporterror("17042, " + -148 + ", " + var2.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("EILHLJCE.d(B)I")
	public int method260() {
		try {
			this.field779 += 4;
			return ((this.field778[this.field779 - 2] & 0xFF) << 24) + ((this.field778[this.field779 - 1] & 0xFF) << 16) + ((this.field778[this.field779 - 4] & 0xFF) << 8) + (this.field778[this.field779 - 3] & 0xFF);
		} catch (RuntimeException var2) {
			signlink.reporterror("38069, " + 54 + ", " + var2.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("EILHLJCE.n(I)I")
	public int method261(int arg0) {
		try {
			if (arg0 >= 0) {
				this.field762 = !this.field762;
			}
			this.field779 += 4;
			return ((this.field778[this.field779 - 3] & 0xFF) << 24) + ((this.field778[this.field779 - 4] & 0xFF) << 16) + ((this.field778[this.field779 - 1] & 0xFF) << 8) + (this.field778[this.field779 - 2] & 0xFF);
		} catch (RuntimeException var3) {
			signlink.reporterror("98539, " + arg0 + ", " + var3.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("EILHLJCE.b([BIII)V")
	public void method262(byte[] arg0, int arg1) {
		try {
			for (int var3 = 0; var3 < arg1; var3++) {
				this.field778[this.field779++] = (byte) (arg0[var3] + 128);
			}
		} catch (RuntimeException var5) {
			signlink.reporterror("52280, " + arg0 + ", " + arg1 + ", " + -459 + ", " + ", " + var5.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("EILHLJCE.a(III[B)V")
	public void method263(int arg0, byte[] arg1) {
		try {
			for (int var3 = arg0 - 1; var3 >= 0; var3--) {
				arg1[var3] = (byte) (this.field778[this.field779++] - 128);
			}
		} catch (RuntimeException var5) {
			signlink.reporterror("79873, " + ", " + arg0 + ", " + ", " + arg1 + ", " + var5.toString());
			throw new RuntimeException();
		}
	}
}
