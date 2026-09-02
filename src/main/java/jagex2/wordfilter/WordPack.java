package jagex2.wordfilter;

import deob.ObfuscatedName;
import jagex2.io.Packet;
import sign.signlink;

@ObfuscatedName("OAEWGOIP")
public final class WordPack {

	@ObfuscatedName("OAEWGOIP.a")
	public static boolean field1165 = true;

	@ObfuscatedName("OAEWGOIP.b")
	public static final int field1166 = -118;

	@ObfuscatedName("OAEWGOIP.c")
	public static final char[] builder = new char[100];

	@ObfuscatedName("OAEWGOIP.d")
	public static final Packet temp = new Packet(new byte[100], -26583);

	@ObfuscatedName("OAEWGOIP.e")
	public static final char[] TABLE = new char[] { ' ', 'e', 't', 'a', 'o', 'i', 'h', 'n', 's', 'r', 'd', 'l', 'u', 'm', 'w', 'c', 'y', 'f', 'g', 'p', 'b', 'v', 'k', 'x', 'j', 'q', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', ' ', '!', '?', '.', ',', ':', ';', '(', ')', '-', '&', '*', '\\', '\'', '@', '#', '+', '=', '£', '$', '%', '"', '[', ']' };

	@ObfuscatedName("OAEWGOIP.a(LEILHLJCE;II)Ljava/lang/String;")
	public static String unpack(Packet arg0, int arg1) {
		try {
			int var2 = 0;
			int var3 = -1;
			for (int var4 = 0; var4 < arg1; var4++) {
				int var5 = arg0.g1();
				int var6 = var5 >> 4 & 0xF;
				if (var3 != -1) {
					builder[var2++] = TABLE[(var3 << 4) + var6 - 195];
					var3 = -1;
				} else if (var6 < 13) {
					builder[var2++] = TABLE[var6];
				} else {
					var3 = var6;
				}
				int var7 = var5 & 0xF;
				if (var3 != -1) {
					builder[var2++] = TABLE[(var3 << 4) + var7 - 195];
					var3 = -1;
				} else if (var7 < 13) {
					builder[var2++] = TABLE[var7];
				} else {
					var3 = var7;
				}
			}
			boolean var8 = true;
			for (int var9 = 0; var9 < var2; var9++) {
				char var10 = builder[var9];
				if (var8 && var10 >= 'a' && var10 <= 'z') {
					builder[var9] = (char) (builder[var9] - 32);
					var8 = false;
				}
				if (var10 == '.' || var10 == '!' || var10 == '?') {
					var8 = true;
				}
			}
			return new String(builder, 0, var2);
		} catch (RuntimeException var12) {
			signlink.reporterror("89047, " + arg0 + ", " + arg1 + ", " + -260 + ", " + var12.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("OAEWGOIP.a(LEILHLJCE;Ljava/lang/String;Z)V")
	public static void pack(Packet arg0, String arg1) {
		try {
			if (arg1.length() > 80) {
				arg1 = arg1.substring(0, 80);
			}
			arg1 = arg1.toLowerCase();
			int var2 = -1;
			for (int var3 = 0; var3 < arg1.length(); var3++) {
				char var4 = arg1.charAt(var3);
				int var5 = 0;
				for (int var6 = 0; var6 < TABLE.length; var6++) {
					if (var4 == TABLE[var6]) {
						var5 = var6;
						break;
					}
				}
				if (var5 > 12) {
					var5 += 195;
				}
				if (var2 == -1) {
					if (var5 < 13) {
						var2 = var5;
					} else {
						arg0.p1(var5);
					}
				} else if (var5 < 13) {
					arg0.p1((var2 << 4) + var5);
					var2 = -1;
				} else {
					arg0.p1((var2 << 4) + (var5 >> 4));
					var2 = var5 & 0xF;
				}
			}
			if (var2 != -1) {
				arg0.p1(var2 << 4);
			}
		} catch (RuntimeException var8) {
			signlink.reporterror("70763, " + arg0 + ", " + arg1 + ", " + true + ", " + var8.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("OAEWGOIP.a(ILjava/lang/String;)Ljava/lang/String;")
	public static String method398(int arg0, String arg1) {
		try {
			temp.pos = 0;
			pack(temp, arg1);
			int var2 = temp.pos;
			temp.pos = 0;
			String var3 = unpack(temp, var2);
			if (arg0 != -23379) {
				field1165 = !field1165;
			}
			return var3;
		} catch (RuntimeException var5) {
			signlink.reporterror("25465, " + arg0 + ", " + arg1 + ", " + var5.toString());
			throw new RuntimeException();
		}
	}
}
