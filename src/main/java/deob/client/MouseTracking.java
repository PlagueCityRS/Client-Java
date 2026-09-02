package deob.client;

import deob.ObfuscatedName;
import sign.signlink;

@ObfuscatedName("ULPROSHL")
public final class MouseTracking implements Runnable {

	@ObfuscatedName("ULPROSHL.e")
	public boolean active = true;

	@ObfuscatedName("ULPROSHL.a")
	public final Object lock = new Object();

	@ObfuscatedName("ULPROSHL.c")
	public int length;

	@ObfuscatedName("ULPROSHL.f")
	public final int[] x = new int[500];

	@ObfuscatedName("ULPROSHL.d")
	public final int[] y = new int[500];

	@ObfuscatedName("ULPROSHL.b")
	public final Client app;

	public MouseTracking(int arg0, Client arg1) {
		try {
			this.app = arg1;
		} catch (RuntimeException var4) {
			signlink.reporterror("6840, " + ", " + arg1 + ", " + var4.toString());
			throw new RuntimeException();
		}
	}

	@Override
	public void run() {
		while (this.active) {
			Object var1 = this.lock;
			synchronized (this.lock) {
				if (this.length < 500) {
					this.x[this.length] = this.app.mouseX;
					this.y[this.length] = this.app.mouseY;
					this.length++;
				}
			}
			try {
				Thread.sleep(50L);
			} catch (Exception var2) {
			}
		}
	}
}
