package deob;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ColorModel;
import java.awt.image.DirectColorModel;
import java.awt.image.ImageConsumer;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.util.Hashtable;
import sign.signlink;

@ObfuscatedName("UKPRFGXO")
public final class class58 implements ImageProducer, ImageObserver {

	@ObfuscatedName("UKPRFGXO.a")
	public final int field1400 = 6821;

	@ObfuscatedName("UKPRFGXO.d")
	public final int field1403;

	@ObfuscatedName("UKPRFGXO.e")
	public final int field1404;

	@ObfuscatedName("UKPRFGXO.c")
	public final int[] field1402;

	@ObfuscatedName("UKPRFGXO.f")
	public final ColorModel field1405;

	@ObfuscatedName("UKPRFGXO.h")
	public final Image field1407;

	@ObfuscatedName("UKPRFGXO.b")
	public int field1401;

	@ObfuscatedName("UKPRFGXO.g")
	public ImageConsumer field1406;

	public class58(int arg0, boolean arg1, Component arg2, int arg3) {
		try {
			this.field1403 = arg0;
			this.field1404 = arg3;
			this.field1402 = new int[arg0 * arg3];
			this.field1405 = new DirectColorModel(32, 16711680, 65280, 255);
			this.field1407 = arg2.createImage(this);
			this.method465();
			arg2.prepareImage(this.field1407, this);
			this.method465();
			arg2.prepareImage(this.field1407, this);
			this.method465();
			arg2.prepareImage(this.field1407, this);
			this.method463();
		} catch (RuntimeException var6) {
			signlink.reporterror("68104, " + arg0 + ", " + false + ", " + arg2 + ", " + arg3 + ", " + var6.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("UKPRFGXO.a(B)V")
	public void method463() {
		try {
			class26.method310(this.field1404, this.field1402, this.field1400, this.field1403);
		} catch (RuntimeException var2) {
			signlink.reporterror("60324, " + 58 + ", " + var2.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("UKPRFGXO.a(ZILjava/awt/Graphics;I)V")
	public void method464(int arg0, Graphics arg1, int arg2) {
		try {
			this.method465();
			arg1.drawImage(this.field1407, arg2, arg0, this);
		} catch (RuntimeException var5) {
			signlink.reporterror("93465, " + false + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + var5.toString());
			throw new RuntimeException();
		}
	}

	@Override
	public synchronized void addConsumer(ImageConsumer arg0) {
		this.field1406 = arg0;
		arg0.setDimensions(this.field1403, this.field1404);
		arg0.setProperties(null);
		arg0.setColorModel(this.field1405);
		arg0.setHints(14);
	}

	@Override
	public synchronized boolean isConsumer(ImageConsumer arg0) {
		return this.field1406 == arg0;
	}

	@Override
	public synchronized void removeConsumer(ImageConsumer arg0) {
		if (this.field1406 == arg0) {
			this.field1406 = null;
		}
	}

	@Override
	public void startProduction(ImageConsumer arg0) {
		this.addConsumer(arg0);
	}

	@Override
	public void requestTopDownLeftRightResend(ImageConsumer arg0) {
		System.out.println("TDLR");
	}

	@ObfuscatedName("UKPRFGXO.a()V")
	public synchronized void method465() {
		if (this.field1406 != null) {
			this.field1406.setPixels(0, 0, this.field1403, this.field1404, this.field1405, this.field1402, 0, this.field1403);
			this.field1406.imageComplete(2);
		}
	}

	@Override
	public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		return true;
	}
}
