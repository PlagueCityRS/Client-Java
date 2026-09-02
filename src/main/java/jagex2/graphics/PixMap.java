package jagex2.graphics;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ColorModel;
import java.awt.image.DirectColorModel;
import java.awt.image.ImageConsumer;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;

import deob.ObfuscatedName;
import sign.signlink;

@ObfuscatedName("UKPRFGXO")
public final class PixMap implements ImageProducer, ImageObserver {

	@ObfuscatedName("UKPRFGXO.c")
	public final int[] data;

	@ObfuscatedName("UKPRFGXO.d")
	public final int width;

	@ObfuscatedName("UKPRFGXO.e")
	public final int height;

	@ObfuscatedName("UKPRFGXO.h")
	public final Image image;

	@ObfuscatedName("UKPRFGXO.a")
	public final int field1400 = 6821;

	@ObfuscatedName("UKPRFGXO.b")
	public int field1401;

	@ObfuscatedName("UKPRFGXO.f")
	public final ColorModel colorModel;

	@ObfuscatedName("UKPRFGXO.g")
	public ImageConsumer imageConsumer;

	public PixMap(int arg0, boolean arg1, Component arg2, int arg3) {
		try {
			this.width = arg0;
			this.height = arg3;
			this.data = new int[arg0 * arg3];
			this.colorModel = new DirectColorModel(32, 16711680, 65280, 255);
			this.image = arg2.createImage(this);
			this.consumerSetPixels();
			arg2.prepareImage(this.image, this);
			this.consumerSetPixels();
			arg2.prepareImage(this.image, this);
			this.consumerSetPixels();
			arg2.prepareImage(this.image, this);
			this.setPixels();
		} catch (RuntimeException var6) {
			signlink.reporterror("68104, " + arg0 + ", " + false + ", " + arg2 + ", " + arg3 + ", " + var6.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("UKPRFGXO.a(ZILjava/awt/Graphics;I)V")
	public void draw(int arg0, Graphics arg1, int arg2) {
		try {
			this.consumerSetPixels();
			arg1.drawImage(this.image, arg2, arg0, this);
		} catch (RuntimeException var5) {
			signlink.reporterror("93465, " + false + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + var5.toString());
			throw new RuntimeException();
		}
	}

	@Override
	public synchronized void addConsumer(ImageConsumer arg0) {
		this.imageConsumer = arg0;
		arg0.setDimensions(this.width, this.height);
		arg0.setProperties(null);
		arg0.setColorModel(this.colorModel);
		arg0.setHints(14);
	}

	@ObfuscatedName("UKPRFGXO.a(B)V")
	public void setPixels() {
		try {
			Pix2D.setPixels(this.height, this.data, this.field1400, this.width);
		} catch (RuntimeException var2) {
			signlink.reporterror("60324, " + 58 + ", " + var2.toString());
			throw new RuntimeException();
		}
	}

	@Override
	public synchronized boolean isConsumer(ImageConsumer arg0) {
		return this.imageConsumer == arg0;
	}

	@Override
	public synchronized void removeConsumer(ImageConsumer arg0) {
		if (this.imageConsumer == arg0) {
			this.imageConsumer = null;
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
	public synchronized void consumerSetPixels() {
		if (this.imageConsumer != null) {
			this.imageConsumer.setPixels(0, 0, this.width, this.height, this.colorModel, this.data, 0, this.width);
			this.imageConsumer.imageComplete(2);
		}
	}

	@Override
	public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		return true;
	}
}
