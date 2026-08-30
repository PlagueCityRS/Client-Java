package deob;

import sign.signlink;

@ObfuscatedName("ULPROSHL")
public final class class59 implements Runnable {

	@ObfuscatedName("ULPROSHL.a")
	public final Object field1408 = new Object();

	@ObfuscatedName("ULPROSHL.d")
	public final int[] field1411 = new int[500];

	@ObfuscatedName("ULPROSHL.e")
	public boolean field1412 = true;

	@ObfuscatedName("ULPROSHL.f")
	public final int[] field1413 = new int[500];

	@ObfuscatedName("ULPROSHL.b")
	public final client field1409;

	@ObfuscatedName("ULPROSHL.c")
	public int field1410;

	public class59(int arg0, client arg1) {
		try {
			this.field1409 = arg1;
		} catch (RuntimeException var4) {
			signlink.reporterror("6840, " + ", " + arg1 + ", " + var4.toString());
			throw new RuntimeException();
		}
	}

	@Override
	public void run() {
		while (this.field1412) {
			Object var1 = this.field1408;
			synchronized (this.field1408) {
				if (this.field1410 < 500) {
					this.field1413[this.field1410] = this.field1409.field92;
					this.field1411[this.field1410] = this.field1409.field93;
					this.field1410++;
				}
			}
			try {
				Thread.sleep(50L);
			} catch (Exception var2) {
			}
		}
	}
}
