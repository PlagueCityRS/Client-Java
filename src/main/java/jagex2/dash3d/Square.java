package jagex2.dash3d;

import deob.*;
import jagex2.datastruct.Linkable;

@ObfuscatedName("QEIUYHTV")
public final class Square extends Linkable {

	@ObfuscatedName("QEIUYHTV.e")
	public final boolean field1247 = false;

	@ObfuscatedName("QEIUYHTV.f")
	public final boolean field1248 = false;

	@ObfuscatedName("QEIUYHTV.r")
	public final Sprite[] sprites = new Sprite[5];

	@ObfuscatedName("QEIUYHTV.s")
	public final int[] spriteSpan = new int[5];

	@ObfuscatedName("QEIUYHTV.g")
	public int level;

	@ObfuscatedName("QEIUYHTV.j")
	public final int originalLevel;

	@ObfuscatedName("QEIUYHTV.h")
	public final int field1250;

	@ObfuscatedName("QEIUYHTV.i")
	public final int field1251;

	@ObfuscatedName("QEIUYHTV.q")
	public int field1259;

	@ObfuscatedName("QEIUYHTV.t")
	public int field1262;

	@ObfuscatedName("QEIUYHTV.u")
	public int field1263;

	@ObfuscatedName("QEIUYHTV.y")
	public int field1267;

	@ObfuscatedName("QEIUYHTV.z")
	public int field1268;

	@ObfuscatedName("QEIUYHTV.A")
	public int field1269;

	@ObfuscatedName("QEIUYHTV.B")
	public int field1270;

	@ObfuscatedName("QEIUYHTV.k")
	public QuickGround field1253;

	@ObfuscatedName("QEIUYHTV.o")
	public GroundDecor groundDecor;

	@ObfuscatedName("QEIUYHTV.n")
	public Decor decor;

	@ObfuscatedName("QEIUYHTV.m")
	public Wall wall;

	@ObfuscatedName("QEIUYHTV.p")
	public GroundObject field1258;

	@ObfuscatedName("QEIUYHTV.C")
	public Square field1271;

	@ObfuscatedName("QEIUYHTV.l")
	public Ground field1254;

	@ObfuscatedName("QEIUYHTV.v")
	public boolean field1264;

	@ObfuscatedName("QEIUYHTV.w")
	public boolean field1265;

	@ObfuscatedName("QEIUYHTV.x")
	public boolean field1266;

	public Square(int arg0, int arg1, int arg2) {
		this.originalLevel = this.level = arg0;
		this.field1250 = arg1;
		this.field1251 = arg2;
	}
}
