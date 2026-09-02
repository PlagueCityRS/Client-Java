package jagex2.io;

import deob.ObfuscatedName;
import sign.signlink;

@ObfuscatedName("BBMKAXRK")
public final class JagFile {

	@ObfuscatedName("BBMKAXRK.a")
	public int field135;

	@ObfuscatedName("BBMKAXRK.b")
	public byte[] data;

	@ObfuscatedName("BBMKAXRK.c")
	public int fileCount;

	@ObfuscatedName("BBMKAXRK.d")
	public int[] fileHash;

	@ObfuscatedName("BBMKAXRK.e")
	public int[] fileUnpackedSize;

	@ObfuscatedName("BBMKAXRK.f")
	public int[] filePackedSize;

	@ObfuscatedName("BBMKAXRK.g")
	public int[] fileOffset;

	@ObfuscatedName("BBMKAXRK.h")
	public boolean unpacked;

	public JagFile(byte arg0, byte[] arg1) {
		try {
			this.unpack((byte) 8, arg1);
		} catch (RuntimeException var4) {
			signlink.reporterror("36748, " + 70 + ", " + arg1 + ", " + var4.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("BBMKAXRK.a(B[B)V")
	public void unpack(byte arg0, byte[] arg1) {
		try {
			Packet var3 = new Packet(arg1, -26583);
			int var4 = var3.g3();
			int var5 = var3.g3();
			if (var5 == var4) {
				this.data = arg1;
				this.unpacked = false;
			} else {
				byte[] var6 = new byte[var4];
				BZip2.decompress(var6, var4, arg1, var5, 6);
				this.data = var6;
				var3 = new Packet(this.data, -26583);
				this.unpacked = true;
			}
			this.fileCount = var3.g2();
			this.fileHash = new int[this.fileCount];
			this.fileUnpackedSize = new int[this.fileCount];
			this.filePackedSize = new int[this.fileCount];
			this.fileOffset = new int[this.fileCount];
			boolean var11 = false;
			int var7 = var3.pos + this.fileCount * 10;
			for (int var8 = 0; var8 < this.fileCount; var8++) {
				this.fileHash[var8] = var3.g4();
				this.fileUnpackedSize[var8] = var3.g3();
				this.filePackedSize[var8] = var3.g3();
				this.fileOffset[var8] = var7;
				var7 += this.filePackedSize[var8];
			}
		} catch (RuntimeException var10) {
			signlink.reporterror("28146, " + arg0 + ", " + arg1 + ", " + var10.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("BBMKAXRK.a(Ljava/lang/String;[B)[B")
	public byte[] read(String arg0, byte[] arg1) {
		int var3 = 0;
		String var4 = arg0.toUpperCase();
		for (int var5 = 0; var5 < var4.length(); var5++) {
			var3 = var3 * 61 + var4.charAt(var5) - 32;
		}
		for (int var6 = 0; var6 < this.fileCount; var6++) {
			if (this.fileHash[var6] == var3) {
				if (arg1 == null) {
					arg1 = new byte[this.fileUnpackedSize[var6]];
				}
				if (this.unpacked) {
					for (int var7 = 0; var7 < this.fileUnpackedSize[var6]; var7++) {
						arg1[var7] = this.data[this.fileOffset[var6] + var7];
					}
				} else {
					BZip2.decompress(arg1, this.fileUnpackedSize[var6], this.data, this.filePackedSize[var6], this.fileOffset[var6]);
				}
				return arg1;
			}
		}
		return null;
	}
}
