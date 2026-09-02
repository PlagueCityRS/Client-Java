package deob.client;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import deob.ObfuscatedName;
import jagex2.graphics.Pix32;
import jagex2.graphics.PixMap;
import sign.signlink;

@ObfuscatedName("AUOBNYCU")
public class GameShell extends Applet implements Runnable, MouseListener, MouseMotionListener, KeyListener, FocusListener, WindowListener {

	@ObfuscatedName("AUOBNYCU.f")
	public int deltaTime = 20;

	@ObfuscatedName("AUOBNYCU.g")
	public int mindel = 1;

	@ObfuscatedName("AUOBNYCU.i")
	public int fps;

	@ObfuscatedName("AUOBNYCU.l")
	public int sWid;

	@ObfuscatedName("AUOBNYCU.k")
	public int sHei;

	@ObfuscatedName("AUOBNYCU.n")
	public PixMap drawArea;

	@ObfuscatedName("AUOBNYCU.p")
	public ViewBox frame;

	@ObfuscatedName("AUOBNYCU.q")
	public boolean fullredraw = true;

	@ObfuscatedName("AUOBNYCU.r")
	public boolean focus = true;

	@ObfuscatedName("AUOBNYCU.d")
	public final boolean field75 = false;

	@ObfuscatedName("AUOBNYCU.b")
	public int field73;

	@ObfuscatedName("AUOBNYCU.e")
	public int state;

	@ObfuscatedName("AUOBNYCU.h")
	public final long[] otim = new long[10];

	@ObfuscatedName("AUOBNYCU.j")
	public boolean debug = false;

	@ObfuscatedName("AUOBNYCU.m")
	public Graphics graphics;

	@ObfuscatedName("AUOBNYCU.o")
	public final Pix32[] drawAreas = new Pix32[6];

	@ObfuscatedName("AUOBNYCU.s")
	public int idleTimer;

	@ObfuscatedName("AUOBNYCU.t")
	public int mouseButton;

	@ObfuscatedName("AUOBNYCU.u")
	public int mouseX;

	@ObfuscatedName("AUOBNYCU.v")
	public int mouseY;

	@ObfuscatedName("AUOBNYCU.w")
	public int nextMouseClickButton;

	@ObfuscatedName("AUOBNYCU.x")
	public int nextMouseClickX;

	@ObfuscatedName("AUOBNYCU.y")
	public int nextMouseClickY;

	@ObfuscatedName("AUOBNYCU.z")
	public long nextMouseClickTime;

	@ObfuscatedName("AUOBNYCU.E")
	public final int[] keyHeld = new int[128];

	@ObfuscatedName("AUOBNYCU.F")
	public final int[] keyQueue = new int[128];

	@ObfuscatedName("AUOBNYCU.A")
	public int mouseClickButton;

	@ObfuscatedName("AUOBNYCU.B")
	public int mouseClickX;

	@ObfuscatedName("AUOBNYCU.C")
	public int mouseClickY;

	@ObfuscatedName("AUOBNYCU.G")
	public int keyQueueReadPos;

	@ObfuscatedName("AUOBNYCU.H")
	public int keyQueueWritePos;

	@ObfuscatedName("AUOBNYCU.D")
	public long mouseClickTime;

	@ObfuscatedName("AUOBNYCU.a")
	public final int field72 = -26684;

	@ObfuscatedName("AUOBNYCU.c")
	public boolean field74 = true;

	@Override
	public void run() {
		this.getBaseComponent().addMouseListener(this);
		this.getBaseComponent().addMouseMotionListener(this);
		this.getBaseComponent().addKeyListener(this);
		this.getBaseComponent().addFocusListener(this);
		if (this.frame != null) {
			this.frame.addWindowListener(this);
		}
		this.drawProgress("Loading...", (byte) 8, 0);
		this.maininit();
		int var1 = 0;
		int var2 = 256;
		int var3 = 1;
		int var4 = 0;
		int var5 = 0;
		for (int var6 = 0; var6 < 10; var6++) {
			this.otim[var6] = System.currentTimeMillis();
		}
		long var7 = System.currentTimeMillis();
		while (true) {
			long var11;
			do {
				if (this.state < 0) {
					if (this.state == -1) {
						this.shutdown();
					}
					return;
				}
				if (this.state > 0) {
					this.state--;
					if (this.state == 0) {
						this.shutdown();
						return;
					}
				}
				int var9 = var2;
				int var10 = var3;
				var2 = 300;
				var3 = 1;
				var11 = System.currentTimeMillis();
				if (this.otim[var1] == 0L) {
					var2 = var9;
					var3 = var10;
				} else if (var11 > this.otim[var1]) {
					var2 = (int) ((long) (this.deltaTime * 2560) / (var11 - this.otim[var1]));
				}
				if (var2 < 25) {
					var2 = 25;
				}
				if (var2 > 256) {
					var2 = 256;
					var3 = (int) ((long) this.deltaTime - (var11 - this.otim[var1]) / 10L);
				}
				if (var3 > this.deltaTime) {
					var3 = this.deltaTime;
				}
				this.otim[var1] = var11;
				var1 = (var1 + 1) % 10;
				if (var3 > 1) {
					for (int var13 = 0; var13 < 10; var13++) {
						if (this.otim[var13] != 0L) {
							this.otim[var13] += var3;
						}
					}
				}
				if (var3 < this.mindel) {
					var3 = this.mindel;
				}
				try {
					Thread.sleep((long) var3);
				} catch (InterruptedException var16) {
					var5++;
				}
				while (var4 < 256) {
					this.mouseClickButton = this.nextMouseClickButton;
					this.mouseClickX = this.nextMouseClickX;
					this.mouseClickY = this.nextMouseClickY;
					this.mouseClickTime = this.nextMouseClickTime;
					this.nextMouseClickButton = 0;
					this.mainloop();
					this.keyQueueReadPos = this.keyQueueWritePos;
					var4 += var2;
				}
				var4 &= 0xFF;
				if (this.deltaTime > 0) {
					this.fps = var2 * 1000 / (this.deltaTime * 256);
				}
				this.mainredraw(this.field72);
			} while (!this.debug);
			System.out.println("ntime:" + var11);
			for (int var14 = 0; var14 < 10; var14++) {
				int var15 = (var1 + 20 - var14 - 1) % 10;
				System.out.println("otim" + var15 + ":" + this.otim[var15]);
			}
			System.out.println("fps:" + this.fps + " ratio:" + var2 + " count:" + var4);
			System.out.println("del:" + var3 + " deltime:" + this.deltaTime + " mindel:" + this.mindel);
			System.out.println("intex:" + var5 + " opos:" + var1);
			this.debug = false;
			var5 = 0;
		}
	}

	@ObfuscatedName("AUOBNYCU.a(I)V")
	public void shutdown() {
		try {
			this.state = -2;
			this.mainquit(957);
			if (this.frame != null) {
				try {
					Thread.sleep(1000L);
				} catch (Exception var3) {
				}
				try {
					System.exit(0);
				} catch (Throwable var2) {
				}
			}
		} catch (RuntimeException var4) {
			signlink.reporterror("40687, " + -870 + ", " + var4.toString());
			throw new RuntimeException();
		}
	}

	@Override
	public final void start() {
		if (this.state >= 0) {
			this.state = 0;
		}
	}

	@Override
	public final void stop() {
		if (this.state >= 0) {
			this.state = 4000 / this.deltaTime;
		}
	}

	@Override
	public final void destroy() {
		this.state = -1;
		try {
			Thread.sleep(5000L);
		} catch (Exception var1) {
		}
		if (this.state == -1) {
			this.shutdown();
		}
	}

	@Override
	public final void update(Graphics arg0) {
		if (this.graphics == null) {
			this.graphics = arg0;
		}
		this.fullredraw = true;
		this.refresh((byte) 6);
	}

	@Override
	public final void paint(Graphics arg0) {
		if (this.graphics == null) {
			this.graphics = arg0;
		}
		this.fullredraw = true;
		this.refresh((byte) 6);
	}

	@Override
	public final void focusGained(FocusEvent arg0) {
		this.focus = true;
		this.fullredraw = true;
		this.refresh((byte) 6);
	}

	@Override
	public final void focusLost(FocusEvent arg0) {
		this.focus = false;
		for (int var2 = 0; var2 < 128; var2++) {
			this.keyHeld[var2] = 0;
		}
	}

	@Override
	public final void windowActivated(WindowEvent arg0) {
	}

	@Override
	public final void windowClosed(WindowEvent arg0) {
	}

	@Override
	public final void windowClosing(WindowEvent arg0) {
		this.destroy();
	}

	@Override
	public final void windowDeactivated(WindowEvent arg0) {
	}

	@Override
	public final void windowDeiconified(WindowEvent arg0) {
	}

	@Override
	public final void windowIconified(WindowEvent arg0) {
	}

	@Override
	public final void windowOpened(WindowEvent arg0) {
	}

	@ObfuscatedName("AUOBNYCU.d(I)V")
	public void mainquit(int arg0) {
		try {
			boolean var4 = false;
		} catch (RuntimeException var3) {
			signlink.reporterror("87652, " + arg0 + ", " + var3.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("AUOBNYCU.a()V")
	public void maininit() {
	}

	@ObfuscatedName("AUOBNYCU.c(I)V")
	public void mainloop() {
	}

	@ObfuscatedName("AUOBNYCU.e(I)V")
	public void mainredraw(int arg0) {
		try {
			if (arg0 != -26684) {
				this.field74 = !this.field74;
			}
		} catch (RuntimeException var3) {
			signlink.reporterror("90428, " + arg0 + ", " + var3.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("AUOBNYCU.a(Ljava/lang/String;BI)V")
	public void drawProgress(String arg0, byte arg1, int arg2) {
		try {
			while (this.graphics == null) {
				this.graphics = this.getBaseComponent().getGraphics();
				try {
					this.getBaseComponent().repaint();
				} catch (Exception var11) {
				}
				try {
					Thread.sleep(1000L);
				} catch (Exception var10) {
				}
			}
			Font var4 = new Font("Helvetica", 1, 13);
			FontMetrics var5 = this.getBaseComponent().getFontMetrics(var4);
			Font var6 = new Font("Helvetica", 0, 13);
			boolean var13 = false;
			this.getBaseComponent().getFontMetrics(var6);
			if (this.fullredraw) {
				this.graphics.setColor(Color.black);
				this.graphics.fillRect(0, 0, this.sHei, this.sWid);
				this.fullredraw = false;
			}
			Color var7 = new Color(140, 17, 17);
			int var8 = this.sWid / 2 - 18;
			this.graphics.setColor(var7);
			this.graphics.drawRect(this.sHei / 2 - 152, var8, 304, 34);
			this.graphics.fillRect(this.sHei / 2 - 150, var8 + 2, arg2 * 3, 30);
			this.graphics.setColor(Color.black);
			this.graphics.fillRect(this.sHei / 2 + arg2 * 3 - 150, var8 + 2, 300 - arg2 * 3, 30);
			this.graphics.setFont(var4);
			this.graphics.setColor(Color.white);
			this.graphics.drawString(arg0, (this.sHei - var5.stringWidth(arg0)) / 2, var8 + 22);
		} catch (RuntimeException var12) {
			signlink.reporterror("25201, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + var12.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("AUOBNYCU.a(IBI)V")
	public final void initApplication(int arg0, byte arg1, int arg2) {
		try {
			this.sHei = arg0;
			this.sWid = arg2;
			this.frame = new ViewBox(this.sWid, this, this.sHei, 15);
			this.graphics = this.getBaseComponent().getGraphics();
			this.drawArea = new PixMap(this.sHei, false, this.getBaseComponent(), this.sWid);
			this.startThread(this, 1);
			if (arg1 == 9) {
				boolean var6 = false;
			}
		} catch (RuntimeException var5) {
			signlink.reporterror("10470, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + var5.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("AUOBNYCU.a(III)V")
	public final void initApplet() {
		try {
			this.sHei = 765;
			this.sWid = 503;
			this.graphics = this.getBaseComponent().getGraphics();
			this.drawArea = new PixMap(this.sHei, false, this.getBaseComponent(), this.sWid);
			this.startThread(this, 1);
		} catch (RuntimeException var2) {
			signlink.reporterror("35781, " + 765 + ", " + -893 + ", " + 503 + ", " + var2.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("AUOBNYCU.a(ZI)V")
	public final void setFramerate() {
		try {
			this.deltaTime = 1000;
		} catch (RuntimeException var2) {
			signlink.reporterror("56272, " + false + ", " + 1 + ", " + var2.toString());
			throw new RuntimeException();
		}
	}

	@Override
	public final void mousePressed(MouseEvent arg0) {
		int var2 = arg0.getX();
		int var3 = arg0.getY();
		if (this.frame != null) {
			var2 -= 4;
			var3 -= 22;
		}
		this.idleTimer = 0;
		this.nextMouseClickX = var2;
		this.nextMouseClickY = var3;
		this.nextMouseClickTime = System.currentTimeMillis();
		if (arg0.isMetaDown()) {
			this.nextMouseClickButton = 2;
			this.mouseButton = 2;
		} else {
			this.nextMouseClickButton = 1;
			this.mouseButton = 1;
		}
	}

	@Override
	public final void mouseReleased(MouseEvent arg0) {
		this.idleTimer = 0;
		this.mouseButton = 0;
	}

	@Override
	public final void mouseClicked(MouseEvent arg0) {
	}

	@Override
	public final void mouseEntered(MouseEvent arg0) {
	}

	@Override
	public final void mouseExited(MouseEvent arg0) {
		this.idleTimer = 0;
		this.mouseX = -1;
		this.mouseY = -1;
	}

	@Override
	public final void mouseDragged(MouseEvent arg0) {
		int var2 = arg0.getX();
		int var3 = arg0.getY();
		if (this.frame != null) {
			var2 -= 4;
			var3 -= 22;
		}
		this.idleTimer = 0;
		this.mouseX = var2;
		this.mouseY = var3;
	}

	@Override
	public final void mouseMoved(MouseEvent arg0) {
		int var2 = arg0.getX();
		int var3 = arg0.getY();
		if (this.frame != null) {
			var2 -= 4;
			var3 -= 22;
		}
		this.idleTimer = 0;
		this.mouseX = var2;
		this.mouseY = var3;
	}

	@Override
	public final void keyPressed(KeyEvent arg0) {
		this.idleTimer = 0;
		int var2 = arg0.getKeyCode();
		int var3 = arg0.getKeyChar();
		if (var3 < 30) {
			var3 = 0;
		}
		if (var2 == 37) {
			var3 = 1;
		}
		if (var2 == 39) {
			var3 = 2;
		}
		if (var2 == 38) {
			var3 = 3;
		}
		if (var2 == 40) {
			var3 = 4;
		}
		if (var2 == 17) {
			var3 = 5;
		}
		if (var2 == 8) {
			var3 = 8;
		}
		if (var2 == 127) {
			var3 = 8;
		}
		if (var2 == 9) {
			var3 = 9;
		}
		if (var2 == 10) {
			var3 = 10;
		}
		if (var2 >= 112 && var2 <= 123) {
			var3 = var2 + 1008 - 112;
		}
		if (var2 == 36) {
			var3 = 1000;
		}
		if (var2 == 35) {
			var3 = 1001;
		}
		if (var2 == 33) {
			var3 = 1002;
		}
		if (var2 == 34) {
			var3 = 1003;
		}
		if (var3 > 0 && var3 < 128) {
			this.keyHeld[var3] = 1;
		}
		if (var3 > 4) {
			this.keyQueue[this.keyQueueWritePos] = var3;
			this.keyQueueWritePos = this.keyQueueWritePos + 1 & 0x7F;
		}
	}

	@Override
	public final void keyReleased(KeyEvent arg0) {
		this.idleTimer = 0;
		int var2 = arg0.getKeyCode();
		char var3 = arg0.getKeyChar();
		if (var3 < '\u001E') {
			var3 = '\u0000';
		}
		if (var2 == 37) {
			var3 = '\u0001';
		}
		if (var2 == 39) {
			var3 = '\u0002';
		}
		if (var2 == 38) {
			var3 = '\u0003';
		}
		if (var2 == 40) {
			var3 = '\u0004';
		}
		if (var2 == 17) {
			var3 = '\u0005';
		}
		if (var2 == 8) {
			var3 = '\b';
		}
		if (var2 == 127) {
			var3 = '\b';
		}
		if (var2 == 9) {
			var3 = '\t';
		}
		if (var2 == 10) {
			var3 = '\n';
		}
		if (var3 > '\u0000' && var3 < '\u0080') {
			this.keyHeld[var3] = 0;
		}
	}

	@Override
	public final void keyTyped(KeyEvent arg0) {
	}

	@ObfuscatedName("AUOBNYCU.b(I)I")
	public final int pollKey() {
		try {
			int var1 = -1;
			if (this.keyQueueWritePos != this.keyQueueReadPos) {
				var1 = this.keyQueue[this.keyQueueReadPos];
				this.keyQueueReadPos = this.keyQueueReadPos + 1 & 0x7F;
			}
			return var1;
		} catch (RuntimeException var3) {
			signlink.reporterror("41740, " + ", " + var3.toString());
			throw new RuntimeException();
		}
	}



	@ObfuscatedName("AUOBNYCU.a(B)V")
	public void refresh(byte arg0) {
		try {
			boolean var4 = false;
		} catch (RuntimeException var3) {
			signlink.reporterror("96417, " + arg0 + ", " + var3.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("AUOBNYCU.a(Z)Ljava/awt/Component;")
	public Component getBaseComponent() {
		try {
			return this.frame == null ? this : this.frame;
		} catch (RuntimeException var2) {
			signlink.reporterror("31320, " + true + ", " + var2.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("AUOBNYCU.a(Ljava/lang/Runnable;I)V")
	public void startThread(Runnable arg0, int arg1) {
		Thread var3 = new Thread(arg0);
		var3.start();
		var3.setPriority(arg1);
	}
}
