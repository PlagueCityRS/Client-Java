package jagex2.io;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.zip.CRC32;
import java.util.zip.GZIPInputStream;

import deob.ObfuscatedName;
import deob.client.Client;
import jagex2.datastruct.LinkList;
import jagex2.datastruct.LinkList2;
import sign.signlink;

@ObfuscatedName("YSAVREBH")
public final class OnDemand extends OnDemandProvider implements Runnable {

	@ObfuscatedName("YSAVREBH.b")
	public boolean running = true;

	@ObfuscatedName("YSAVREBH.e")
	public final boolean field1637 = true;

	@ObfuscatedName("YSAVREBH.g")
	public final byte[][] priorities = new byte[4][];

	@ObfuscatedName("YSAVREBH.k")
	public final int field1643 = -376;

	@ObfuscatedName("YSAVREBH.l")
	public final LinkList field1644 = new LinkList(807);

	@ObfuscatedName("YSAVREBH.o")
	public final boolean field1647 = false;

	@ObfuscatedName("YSAVREBH.s")
	public final LinkList prefetches = new LinkList(807);

	@ObfuscatedName("YSAVREBH.u")
	public final int field1653 = -548;

	@ObfuscatedName("YSAVREBH.z")
	public boolean field1658 = false;

	@ObfuscatedName("YSAVREBH.A")
	public final byte[] buf = new byte[500];

	@ObfuscatedName("YSAVREBH.B")
	public final LinkList completed = new LinkList(807);

	@ObfuscatedName("YSAVREBH.F")
	public String field1664 = "";

	@ObfuscatedName("YSAVREBH.G")
	public final LinkList field1665 = new LinkList(807);

	@ObfuscatedName("YSAVREBH.H")
	public final int[][] crcs = new int[4][];

	@ObfuscatedName("YSAVREBH.I")
	public final int[][] versions = new int[4][];

	@ObfuscatedName("YSAVREBH.J")
	public final boolean field1668 = true;

	@ObfuscatedName("YSAVREBH.K")
	public final LinkList2 requests = new LinkList2((byte) 6);

	@ObfuscatedName("YSAVREBH.L")
	public final byte[] field1670 = new byte[65000];

	@ObfuscatedName("YSAVREBH.N")
	public final boolean field1672 = true;

	@ObfuscatedName("YSAVREBH.O")
	public final int field1673 = 6;

	@ObfuscatedName("YSAVREBH.U")
	public final LinkList field1679 = new LinkList(807);

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
	public int topPriority;

	@ObfuscatedName("YSAVREBH.M")
	public int failCount;

	@ObfuscatedName("YSAVREBH.P")
	public int field1674;

	@ObfuscatedName("YSAVREBH.R")
	public int field1676;

	@ObfuscatedName("YSAVREBH.S")
	public int field1677;

	@ObfuscatedName("YSAVREBH.m")
	public long field1645;

	@ObfuscatedName("YSAVREBH.n")
	public OnDemandRequest field1646;

	@ObfuscatedName("YSAVREBH.x")
	public Client app;

	@ObfuscatedName("YSAVREBH.y")
	public InputStream in;

	@ObfuscatedName("YSAVREBH.v")
	public OutputStream out;

	@ObfuscatedName("YSAVREBH.E")
	public Socket socket;

	@ObfuscatedName("YSAVREBH.j")
	public byte[] modeluse;

	@ObfuscatedName("YSAVREBH.h")
	public int[] mapLoc;

	@ObfuscatedName("YSAVREBH.p")
	public int[] mapIndex;

	@ObfuscatedName("YSAVREBH.t")
	public int[] midiJingle;

	@ObfuscatedName("YSAVREBH.D")
	public int[] mapFree;

	@ObfuscatedName("YSAVREBH.Q")
	public int[] mapLand;

	@ObfuscatedName("YSAVREBH.T")
	public int[] animFrameIndex;

	@ObfuscatedName("YSAVREBH.a(LBBMKAXRK;Lclient;)V")
	public void init(JagFile arg0, Client arg1) {
		String[] var3 = new String[] { "model_version", "anim_version", "midi_version", "map_version" };
		for (int var4 = 0; var4 < 4; var4++) {
			byte[] var5 = arg0.read(var3[var4], null);
			int var6 = var5.length / 2;
			Packet var7 = new Packet(var5, -26583);
			this.versions[var4] = new int[var6];
			this.priorities[var4] = new byte[var6];
			for (int var8 = 0; var8 < var6; var8++) {
				this.versions[var4][var8] = var7.g2();
			}
		}
		String[] var9 = new String[] { "model_crc", "anim_crc", "midi_crc", "map_crc" };
		for (int var10 = 0; var10 < 4; var10++) {
			byte[] var11 = arg0.read(var9[var10], null);
			int var12 = var11.length / 4;
			Packet var13 = new Packet(var11, -26583);
			this.crcs[var10] = new int[var12];
			for (int var14 = 0; var14 < var12; var14++) {
				this.crcs[var10][var14] = var13.g4();
			}
		}
		byte[] var15 = arg0.read("model_index", null);
		int var16 = this.versions[0].length;
		this.modeluse = new byte[var16];
		for (int var17 = 0; var17 < var16; var17++) {
			if (var17 < var15.length) {
				this.modeluse[var17] = var15[var17];
			} else {
				this.modeluse[var17] = 0;
			}
		}
		byte[] var18 = arg0.read("map_index", null);
		Packet var19 = new Packet(var18, -26583);
		int var20 = var18.length / 7;
		this.mapIndex = new int[var20];
		this.mapLand = new int[var20];
		this.mapLoc = new int[var20];
		this.mapFree = new int[var20];
		for (int var21 = 0; var21 < var20; var21++) {
			this.mapIndex[var21] = var19.g2();
			this.mapLand[var21] = var19.g2();
			this.mapLoc[var21] = var19.g2();
			this.mapFree[var21] = var19.g1();
		}
		byte[] var22 = arg0.read("anim_index", null);
		Packet var23 = new Packet(var22, -26583);
		int var24 = var22.length / 2;
		this.animFrameIndex = new int[var24];
		for (int var25 = 0; var25 < var24; var25++) {
			this.animFrameIndex[var25] = var23.g2();
		}
		byte[] var26 = arg0.read("midi_index", null);
		Packet var27 = new Packet(var26, -26583);
		int var28 = var26.length;
		this.midiJingle = new int[var28];
		for (int var29 = 0; var29 < var28; var29++) {
			this.midiJingle[var29] = var27.g1();
		}
		this.app = arg1;
		this.running = true;
		this.app.startThread(this, 2);
	}

	@ObfuscatedName("YSAVREBH.c()V")
	public void stop() {
		this.running = false;
	}

	@ObfuscatedName("YSAVREBH.b(II)I")
	public int getFileCount(int arg0) {
		try {
			return this.versions[arg0].length;
		} catch (RuntimeException var3) {
			signlink.reporterror("14330, " + 2 + ", " + arg0 + ", " + var3.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("YSAVREBH.c(I)I")
	public int getAnimFrameCount() {
		try {
			return this.animFrameIndex.length;
		} catch (RuntimeException var2) {
			signlink.reporterror("12962, " + ", " + var2.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("YSAVREBH.a(IIIZ)I")
	public int getMapFile(int arg0, int arg1, int arg2) {
		try {
			int var4 = (arg1 << 8) + arg0;
			for (int var5 = 0; var5 < this.mapIndex.length; var5++) {
				if (this.mapIndex[var5] == var4) {
					if (arg2 == 0) {
						return this.mapLand[var5];
					}
					return this.mapLoc[var5];
				}
			}
			return -1;
		} catch (RuntimeException var7) {
			signlink.reporterror("50745, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + false + ", " + var7.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("YSAVREBH.a(BZ)V")
	public void prefetchMaps(boolean arg0) {
		try {
			int var2 = this.mapIndex.length;
			for (int var3 = 0; var3 < var2; var3++) {
				if (arg0 || this.mapFree[var3] != 0) {
					this.prefetchPriority(this.mapLoc[var3], 3, (byte) 2);
					this.prefetchPriority(this.mapLand[var3], 3, (byte) 2);
				}
			}
		} catch (RuntimeException var5) {
			signlink.reporterror("58337, " + 14 + ", " + arg0 + ", " + var5.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("YSAVREBH.a(BI)Z")
	public boolean hasMapLocFile(int arg0) {
		try {
			for (int var2 = 0; var2 < this.mapIndex.length; var2++) {
				if (this.mapLoc[var2] == arg0) {
					return true;
				}
			}
			return false;
		} catch (RuntimeException var4) {
			signlink.reporterror("87972, " + -75 + ", " + arg0 + ", " + var4.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("YSAVREBH.c(II)I")
	public int getModelUse(int arg0) {
		try {
			return this.modeluse[arg0] & 0xFF;
		} catch (RuntimeException var3) {
			signlink.reporterror("284, " + ", " + arg0 + ", " + var3.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("YSAVREBH.a(IZ)Z")
	public boolean hasMidiJingle(int arg0) {
		try {
			return this.midiJingle[arg0] == 1;
		} catch (RuntimeException var3) {
			signlink.reporterror("58910, " + arg0 + ", " + true + ", " + var3.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("YSAVREBH.a(I)V")
	@Override
	public void requestModel(int arg0) {
		this.request(0, arg0);
	}

	@ObfuscatedName("YSAVREBH.a(II)V")
	public void request(int arg0, int arg1) {
		if (arg0 > this.versions.length || arg1 < 0 || arg1 > this.versions[arg0].length || this.versions[arg0][arg1] == 0) {
			return;
		}
		LinkList2 var3 = this.requests;
		synchronized (this.requests) {
			for (OnDemandRequest var4 = (OnDemandRequest) this.requests.head(); var4 != null; var4 = (OnDemandRequest) this.requests.next()) {
				if (var4.archive == arg0 && var4.file == arg1) {
					return;
				}
			}
			OnDemandRequest var5 = new OnDemandRequest();
			var5.archive = arg0;
			var5.file = arg1;
			var5.field677 = true;
			LinkList var6 = this.field1679;
			synchronized (this.field1679) {
				this.field1679.push(var5);
			}
			this.requests.push(var5);
		}
	}

	@ObfuscatedName("YSAVREBH.a()I")
	public int remaining() {
		LinkList2 var1 = this.requests;
		synchronized (this.requests) {
			return this.requests.size();
		}
	}

	@ObfuscatedName("YSAVREBH.b()LCZKZHBFI;")
	public OnDemandRequest loop() {
		LinkList var1 = this.completed;
		OnDemandRequest var2;
		synchronized (this.completed) {
			var2 = (OnDemandRequest) this.completed.popFront();
		}
		if (var2 == null) {
			return null;
		}
		LinkList2 var3 = this.requests;
		synchronized (this.requests) {
			var2.unlink2();
		}
		if (var2.data == null) {
			return var2;
		}
		int var4 = 0;
		try {
			GZIPInputStream var5 = new GZIPInputStream(new ByteArrayInputStream(var2.data));
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
		var2.data = new byte[var4];
		for (int var7 = 0; var7 < var4; var7++) {
			var2.data[var7] = this.field1670[var7];
		}
		return var2;
	}

	@ObfuscatedName("YSAVREBH.a(IIIB)V")
	public void prefetchPriority(int arg0, int arg1, byte arg2) {
		try {
			if (this.app.fileStreams[0] != null && this.versions[arg1][arg0] != 0) {
				byte[] var4 = this.app.fileStreams[arg1 + 1].readFromFile(arg0);
				if (!this.validate(this.versions[arg1][arg0], var4, this.crcs[arg1][arg0])) {
					this.priorities[arg1][arg0] = arg2;
					if (arg2 > this.topPriority) {
						this.topPriority = arg2;
					}
					this.field1635++;
				}
			}
		} catch (RuntimeException var6) {
			signlink.reporterror("53210, " + arg0 + ", " + -235 + ", " + arg1 + ", " + arg2 + ", " + var6.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("YSAVREBH.d(I)V")
	public void clearPrefetches() {
		try {
			LinkList var1 = this.prefetches;
			synchronized (this.prefetches) {
				this.prefetches.clear();
			}
		} catch (RuntimeException var4) {
			signlink.reporterror("58402, " + -376 + ", " + var4.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("YSAVREBH.a(BII)V")
	public void prefetch(int arg0, int arg1) {
		try {
			if (this.app.fileStreams[0] != null && (this.versions[arg1][arg0] != 0 && (this.priorities[arg1][arg0] != 0 && this.topPriority != 0))) {
				OnDemandRequest var3 = new OnDemandRequest();
				var3.archive = arg1;
				var3.file = arg0;
				var3.field677 = false;
				LinkList var4 = this.prefetches;
				synchronized (this.prefetches) {
					this.prefetches.push(var3);
				}
			}
		} catch (RuntimeException var7) {
			signlink.reporterror("16857, " + 40 + ", " + arg0 + ", " + arg1 + ", " + var7.toString());
			throw new RuntimeException();
		}
	}

	@Override
	public void run() {
		try {
			while (this.running) {
				this.field1638++;
				byte var1 = 20;
				if (this.topPriority == 0 && this.app.fileStreams[0] != null) {
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
					if (this.in != null) {
						this.method596();
					}
				}
				boolean var3 = false;
				for (OnDemandRequest var4 = (OnDemandRequest) this.field1665.head(); var4 != null; var4 = (OnDemandRequest) this.field1665.next()) {
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
					for (OnDemandRequest var5 = (OnDemandRequest) this.field1665.head(); var5 != null; var5 = (OnDemandRequest) this.field1665.next()) {
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
							this.socket.close();
						} catch (Exception var8) {
						}
						this.socket = null;
						this.in = null;
						this.out = null;
						this.field1677 = 0;
					}
				} else {
					this.field1636 = 0;
					this.field1664 = "";
				}
				if (this.app.ingame && this.socket != null && this.out != null && (this.topPriority > 0 || this.app.fileStreams[0] == null)) {
					this.field1641++;
					if (this.field1641 > 500) {
						this.field1641 = 0;
						this.buf[0] = 0;
						this.buf[1] = 0;
						this.buf[2] = 0;
						this.buf[3] = 10;
						try {
							this.out.write(this.buf, 0, 4);
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

	@ObfuscatedName("YSAVREBH.e(I)V")
	public void method602() {
		try {
			LinkList var1 = this.field1679;
			OnDemandRequest var2;
			synchronized (this.field1679) {
				var2 = (OnDemandRequest) this.field1679.popFront();
			}
			if (this.field1673 > 6 || this.field1673 < 6) {
				for (int var3 = 1; var3 > 0; var3++) {
				}
			}
			while (var2 != null) {
				this.field1658 = true;
				byte[] var4 = null;
				if (this.app.fileStreams[0] != null) {
					var4 = this.app.fileStreams[var2.archive + 1].readFromFile(var2.file);
				}
				if (!this.validate(this.versions[var2.archive][var2.file], var4, this.crcs[var2.archive][var2.file])) {
					var4 = null;
				}
				LinkList var5 = this.field1679;
				synchronized (this.field1679) {
					if (var4 == null) {
						this.field1644.push(var2);
					} else {
						var2.data = var4;
						LinkList var6 = this.completed;
						synchronized (this.completed) {
							this.completed.push(var2);
						}
					}
					var2 = (OnDemandRequest) this.field1679.popFront();
				}
			}
		} catch (RuntimeException var11) {
			signlink.reporterror("95483, " + 6 + ", " + var11.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("YSAVREBH.a(Z)V")
	public void method583() {
		try {
			this.field1649 = 0;
			this.field1650 = 0;
			for (OnDemandRequest var1 = (OnDemandRequest) this.field1665.head(); var1 != null; var1 = (OnDemandRequest) this.field1665.next()) {
				if (var1.field677) {
					this.field1649++;
				} else {
					this.field1650++;
				}
			}
			while (this.field1649 < 10) {
				OnDemandRequest var2 = (OnDemandRequest) this.field1644.popFront();
				if (var2 == null) {
					break;
				}
				if (this.priorities[var2.archive][var2.file] != 0) {
					this.field1655++;
				}
				this.priorities[var2.archive][var2.file] = 0;
				this.field1665.push(var2);
				this.field1649++;
				this.method589(var2);
				this.field1658 = true;
			}
		} catch (RuntimeException var4) {
			signlink.reporterror("44587, " + false + ", " + var4.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("YSAVREBH.b(I)V")
	public void method587(int arg0) {
		try {
			boolean var14 = false;
			while (this.field1649 == 0) {
				if (this.field1650 >= 10 || this.topPriority == 0) {
					return;
				}
				LinkList var2 = this.prefetches;
				OnDemandRequest var3;
				synchronized (this.prefetches) {
					var3 = (OnDemandRequest) this.prefetches.popFront();
				}
				while (var3 != null) {
					if (this.priorities[var3.archive][var3.file] != 0) {
						this.priorities[var3.archive][var3.file] = 0;
						this.field1665.push(var3);
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
					LinkList var4 = this.prefetches;
					synchronized (this.prefetches) {
						var3 = (OnDemandRequest) this.prefetches.popFront();
					}
				}
				for (int var5 = 0; var5 < 4; var5++) {
					byte[] var6 = this.priorities[var5];
					int var7 = var6.length;
					for (int var8 = 0; var8 < var7; var8++) {
						if (var6[var8] == this.topPriority) {
							var6[var8] = 0;
							OnDemandRequest var9 = new OnDemandRequest();
							var9.archive = var5;
							var9.file = var8;
							var9.field677 = false;
							this.field1665.push(var9);
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
				this.topPriority--;
			}
		} catch (RuntimeException var13) {
			signlink.reporterror("68571, " + arg0 + ", " + var13.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("YSAVREBH.b(Z)V")
	public void method596() {
		try {
			try {
				int var1 = this.in.available();
				if (this.field1677 == 0 && var1 >= 6) {
					this.field1658 = true;
					for (int var2 = 0; var2 < 6; var2 += this.in.read(this.buf, var2, 6 - var2)) {
					}
					int var3 = this.buf[0] & 0xFF;
					int var4 = ((this.buf[1] & 0xFF) << 8) + (this.buf[2] & 0xFF);
					int var5 = ((this.buf[3] & 0xFF) << 8) + (this.buf[4] & 0xFF);
					int var6 = this.buf[5] & 0xFF;
					this.field1646 = null;
					for (OnDemandRequest var7 = (OnDemandRequest) this.field1665.head(); var7 != null; var7 = (OnDemandRequest) this.field1665.next()) {
						if (var7.archive == var3 && var7.file == var4) {
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
							this.field1646.data = null;
							if (this.field1646.field677) {
								LinkList var8 = this.completed;
								synchronized (this.completed) {
									this.completed.push(this.field1646);
								}
							} else {
								this.field1646.unlink();
							}
							this.field1646 = null;
						} else {
							if (this.field1646.data == null && var6 == 0) {
								this.field1646.data = new byte[var5];
							}
							if (this.field1646.data == null && var6 != 0) {
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
					byte[] var9 = this.buf;
					int var10 = 0;
					if (this.field1646 != null) {
						var9 = this.field1646.data;
						var10 = this.field1676;
					}
					for (int var11 = 0; var11 < this.field1677; var11 += this.in.read(var9, var11 + var10, this.field1677 - var11)) {
					}
					if (this.field1677 + this.field1676 >= var9.length && this.field1646 != null) {
						if (this.app.fileStreams[0] != null) {
							this.app.fileStreams[this.field1646.archive + 1].writeToFile(var9.length, var9, this.field1646.file);
						}
						if (!this.field1646.field677 && this.field1646.archive == 3) {
							this.field1646.field677 = true;
							this.field1646.archive = 93;
						}
						if (this.field1646.field677) {
							LinkList var12 = this.completed;
							synchronized (this.completed) {
								this.completed.push(this.field1646);
							}
						} else {
							this.field1646.unlink();
						}
					}
					this.field1677 = 0;
				}
			} catch (IOException var18) {
				try {
					this.socket.close();
				} catch (Exception var15) {
				}
				this.socket = null;
				this.in = null;
				this.out = null;
				this.field1677 = 0;
			}
		} catch (RuntimeException var19) {
			signlink.reporterror("15558, " + false + ", " + var19.toString());
			throw new RuntimeException();
		}
	}


	@ObfuscatedName("YSAVREBH.a(II[BI)Z")
	public boolean validate(int arg0, byte[] arg1, int arg2) {
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

	@ObfuscatedName("YSAVREBH.a(ZLCZKZHBFI;)V")
	public void method589(OnDemandRequest arg0) {
		try {
			try {
				if (this.socket == null) {
					long var2 = System.currentTimeMillis();
					if (var2 - this.field1645 < 4000L) {
						return;
					}
					this.field1645 = var2;
					this.socket = this.app.openSocket(Client.portOffset + 43594);
					this.in = this.socket.getInputStream();
					this.out = this.socket.getOutputStream();
					this.out.write(15);
					for (int var4 = 0; var4 < 8; var4++) {
						this.in.read();
					}
					this.field1636 = 0;
				}
				this.buf[0] = (byte) arg0.archive;
				this.buf[1] = (byte) (arg0.file >> 8);
				this.buf[2] = (byte) arg0.file;
				if (arg0.field677) {
					this.buf[3] = 2;
				} else if (this.app.ingame) {
					this.buf[3] = 0;
				} else {
					this.buf[3] = 1;
				}
				this.out.write(this.buf, 0, 4);
				this.field1641 = 0;
				this.failCount = -10000;
			} catch (IOException var8) {
				try {
					this.socket.close();
				} catch (Exception var7) {
				}
				this.socket = null;
				this.in = null;
				this.out = null;
				this.field1677 = 0;
				this.failCount++;
			}
		} catch (RuntimeException var9) {
			signlink.reporterror("34751, " + false + ", " + arg0 + ", " + var9.toString());
			throw new RuntimeException();
		}
	}
}
