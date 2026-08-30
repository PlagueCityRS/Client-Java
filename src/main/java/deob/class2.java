package deob;

import java.awt.Frame;
import java.awt.Graphics;
import sign.signlink;

@ObfuscatedName("ALUUBUWO")
public final class class2 extends Frame {

	@ObfuscatedName("ALUUBUWO.a")
	public final class4 field13;

	public class2(int arg0, class4 arg1, int arg2, int arg3) {
		try {
			this.field13 = arg1;
			this.setTitle("Jagex");
			if (arg3 <= 0) {
				throw new NullPointerException();
			}
			this.setResizable(false);
			this.show();
			this.toFront();
			this.resize(arg2 + 8, arg0 + 28);
		} catch (RuntimeException var6) {
			signlink.reporterror("86727, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + var6.toString());
			throw new RuntimeException();
		}
	}

	@Override
	public Graphics getGraphics() {
		Graphics var1 = super.getGraphics();
		var1.translate(4, 24);
		return var1;
	}

	@Override
	public void update(Graphics arg0) {
		this.field13.update(arg0);
	}

	@Override
	public void paint(Graphics arg0) {
		this.field13.paint(arg0);
	}
}
