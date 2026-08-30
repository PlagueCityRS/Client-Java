package deob;

import java.applet.AppletContext;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import java.util.Calendar;
import java.util.Date;
import java.util.zip.CRC32;
import sign.signlink;

@ObfuscatedName("client")
public final class client extends class4 {

	@ObfuscatedName("client.Jb")
	public static final byte field215 = 28;

	@ObfuscatedName("client.cc")
	public static int field234 = 10;

	@ObfuscatedName("client.ec")
	public static boolean field236 = true;

	@ObfuscatedName("client.md")
	public static final BigInteger field296 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

	@ObfuscatedName("client.of")
	public static final BigInteger field401 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@ObfuscatedName("client.sf")
	public static final byte field405 = 71;

	@ObfuscatedName("client.sg")
	public static final int[][] field457 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

	@ObfuscatedName("client.Lh")
	public static final int[] field528 = new int[32];

	@ObfuscatedName("client.ij")
	public static final int[] field603;

	@ObfuscatedName("client.ak")
	public static final int[] field647;

	@ObfuscatedName("client.ck")
	public static final String field649;

	@ObfuscatedName("client.P")
	public String field169 = "";

	@ObfuscatedName("client.Q")
	public String field170 = "";

	@ObfuscatedName("client.S")
	public final CRC32 field172 = new CRC32();

	@ObfuscatedName("client.V")
	public int[] field175 = new int[4000];

	@ObfuscatedName("client.W")
	public int[] field176 = new int[4000];

	@ObfuscatedName("client.db")
	public final int[] field183 = new int[5];

	@ObfuscatedName("client.pb")
	public String field195 = "";

	@ObfuscatedName("client.Hb")
	public final int[] field213 = new int[class53.field1350];

	@ObfuscatedName("client.Nb")
	public final boolean field219 = false;

	@ObfuscatedName("client.Ob")
	public final int field220 = -905;

	@ObfuscatedName("client.Qb")
	public class17 field222 = class17.method212(1, (byte) 9);

	@ObfuscatedName("client.Rb")
	public int field223 = -1;

	@ObfuscatedName("client.Yb")
	public class17 field230 = new class17(new byte[5000], -26583);

	@ObfuscatedName("client.Zb")
	public class43[] field231 = new class43[16384];

	@ObfuscatedName("client.bc")
	public int[] field233 = new int[16384];

	@ObfuscatedName("client.jc")
	public final byte field241 = 1;

	@ObfuscatedName("client.mc")
	public String field244 = "";

	@ObfuscatedName("client.uc")
	public int field252 = -1;

	@ObfuscatedName("client.zc")
	public boolean field257 = false;

	@ObfuscatedName("client.Ac")
	public final int[] field258 = new int[] { 17, 24, 34, 40 };

	@ObfuscatedName("client.Bc")
	public final byte field259 = 4;

	@ObfuscatedName("client.Cc")
	public class20 field260 = new class20(807);

	@ObfuscatedName("client.Ec")
	public volatile boolean field262 = false;

	@ObfuscatedName("client.Fc")
	public final int field263 = 1;

	@ObfuscatedName("client.Gc")
	public boolean field264 = false;

	@ObfuscatedName("client.Hc")
	public int field265 = -1;

	@ObfuscatedName("client.Ic")
	public boolean field266 = false;

	@ObfuscatedName("client.Jc")
	public final int[] field267 = new int[50];

	@ObfuscatedName("client.Kc")
	public volatile boolean field268 = false;

	@ObfuscatedName("client.Mc")
	public boolean field270 = true;

	@ObfuscatedName("client.Oc")
	public final int field272 = 1914;

	@ObfuscatedName("client.Pc")
	public String[] field273 = new String[500];

	@ObfuscatedName("client.Qc")
	public final boolean field274 = false;

	@ObfuscatedName("client.Rc")
	public int field275 = -1;

	@ObfuscatedName("client.Tc")
	public final int field277 = 31;

	@ObfuscatedName("client.Yc")
	public boolean field282 = true;

	@ObfuscatedName("client.Zc")
	public final byte field283 = 7;

	@ObfuscatedName("client.cd")
	public final int field286 = 27473;

	@ObfuscatedName("client.ed")
	public int field288 = 2;

	@ObfuscatedName("client.gd")
	public final boolean field290 = true;

	@ObfuscatedName("client.id")
	public final int field292 = 3353893;

	@ObfuscatedName("client.jd")
	public int field293 = -1;

	@ObfuscatedName("client.ld")
	public boolean field295 = false;

	@ObfuscatedName("client.qd")
	public final int field300 = 5063219;

	@ObfuscatedName("client.rd")
	public class40[] field301 = new class40[32];

	@ObfuscatedName("client.td")
	public final int[] field303 = new int[50];

	@ObfuscatedName("client.ud")
	public class19[] field304 = new class19[100];

	@ObfuscatedName("client.wd")
	public final int[] field306 = new int[9];

	@ObfuscatedName("client.xd")
	public final int[] field307 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@ObfuscatedName("client.yd")
	public class20 field308 = new class20(807);

	@ObfuscatedName("client.zd")
	public final byte field309 = -24;

	@ObfuscatedName("client.Cd")
	public final int[] field312 = new int[2000];

	@ObfuscatedName("client.Od")
	public int field324 = 2;

	@ObfuscatedName("client.Qd")
	public final int field326 = -118;

	@ObfuscatedName("client.ce")
	public final int field338 = 100;

	@ObfuscatedName("client.de")
	public final int[] field339 = new int[100];

	@ObfuscatedName("client.fe")
	public final int[] field341 = new int[256];

	@ObfuscatedName("client.ge")
	public final int field342 = 947;

	@ObfuscatedName("client.he")
	public final int[] field343 = new int[33];

	@ObfuscatedName("client.je")
	public final boolean[] field345 = new boolean[5];

	@ObfuscatedName("client.ke")
	public int[] field346 = new int[500];

	@ObfuscatedName("client.le")
	public int[] field347 = new int[500];

	@ObfuscatedName("client.me")
	public int[] field348 = new int[500];

	@ObfuscatedName("client.ne")
	public int[] field349 = new int[500];

	@ObfuscatedName("client.oe")
	public final int field350 = 8;

	@ObfuscatedName("client.pe")
	public class40[] field351 = new class40[32];

	@ObfuscatedName("client.re")
	public volatile boolean field353 = false;

	@ObfuscatedName("client.se")
	public final int[] field354 = new int[151];

	@ObfuscatedName("client.we")
	public int[] field358 = new int[1000];

	@ObfuscatedName("client.xe")
	public final int field359 = 586;

	@ObfuscatedName("client.ye")
	public final int field360 = 2301979;

	@ObfuscatedName("client.Ae")
	public int[] field362 = new int[1000];

	@ObfuscatedName("client.Be")
	public int[] field363 = new int[1000];

	@ObfuscatedName("client.Ce")
	public class40[] field364 = new class40[8];

	@ObfuscatedName("client.De")
	public int field365 = 3;

	@ObfuscatedName("client.Ee")
	public class40[] field366 = new class40[32];

	@ObfuscatedName("client.Ke")
	public final class27 field372 = new class27();

	@ObfuscatedName("client.Le")
	public class40[] field373 = new class40[1000];

	@ObfuscatedName("client.Me")
	public final int field374 = 3;

	@ObfuscatedName("client.Ne")
	public final boolean field375 = true;

	@ObfuscatedName("client.Qe")
	public int field378 = -1;

	@ObfuscatedName("client.Re")
	public boolean field379 = true;

	@ObfuscatedName("client.Se")
	public int field380 = 78;

	@ObfuscatedName("client.We")
	public class40[] field384 = new class40[100];

	@ObfuscatedName("client.Xe")
	public class16[] field385 = new class16[4];

	@ObfuscatedName("client.bf")
	public final int[] field389 = new int[7];

	@ObfuscatedName("client.cf")
	public int field390 = -1;

	@ObfuscatedName("client.df")
	public int field391 = -1;

	@ObfuscatedName("client.ef")
	public boolean field392 = false;

	@ObfuscatedName("client.ff")
	public final int[] field393 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@ObfuscatedName("client.mf")
	public boolean field399 = false;

	@ObfuscatedName("client.nf")
	public final int[] field400 = new int[5];

	@ObfuscatedName("client.rf")
	public final int[] field404 = new int[33];

	@ObfuscatedName("client.tf")
	public class20[][][] field406 = new class20[4][104][104];

	@ObfuscatedName("client.vf")
	public boolean field408 = false;

	@ObfuscatedName("client.wf")
	public int[][] field409 = new int[104][104];

	@ObfuscatedName("client.cg")
	public String field441 = "";

	@ObfuscatedName("client.eg")
	public final int field443 = 435;

	@ObfuscatedName("client.gg")
	public final boolean field445 = true;

	@ObfuscatedName("client.hg")
	public boolean field446 = false;

	@ObfuscatedName("client.og")
	public boolean field453 = true;

	@ObfuscatedName("client.pg")
	public final boolean field454 = false;

	@ObfuscatedName("client.qg")
	public final byte field455 = 4;

	@ObfuscatedName("client.rg")
	public int[] field456 = new int[200];

	@ObfuscatedName("client.wg")
	public final int field461 = 50;

	@ObfuscatedName("client.xg")
	public final int[] field462 = new int[this.field461];

	@ObfuscatedName("client.yg")
	public final int[] field463 = new int[this.field461];

	@ObfuscatedName("client.zg")
	public final int[] field464 = new int[this.field461];

	@ObfuscatedName("client.Ag")
	public final int[] field465 = new int[this.field461];

	@ObfuscatedName("client.Bg")
	public final int[] field466 = new int[this.field461];

	@ObfuscatedName("client.Cg")
	public final int[] field467 = new int[this.field461];

	@ObfuscatedName("client.Dg")
	public final int[] field468 = new int[this.field461];

	@ObfuscatedName("client.Eg")
	public final String[] field469 = new String[this.field461];

	@ObfuscatedName("client.Gg")
	public byte[] field471 = new byte[16384];

	@ObfuscatedName("client.Jg")
	public boolean field474 = false;

	@ObfuscatedName("client.Sg")
	public boolean field483 = false;

	@ObfuscatedName("client.Vg")
	public boolean field486 = true;

	@ObfuscatedName("client.Wg")
	public boolean field487 = false;

	@ObfuscatedName("client.bh")
	public boolean field492 = false;

	@ObfuscatedName("client.ch")
	public final class19[] field493 = new class19[2];

	@ObfuscatedName("client.dh")
	public final int[][][] field494 = new int[4][13][13];

	@ObfuscatedName("client.eh")
	public class19[] field495 = new class19[13];

	@ObfuscatedName("client.fh")
	public final boolean field496 = false;

	@ObfuscatedName("client.ih")
	public int field499 = -1;

	@ObfuscatedName("client.ph")
	public final byte field506 = 7;

	@ObfuscatedName("client.qh")
	public final boolean field507 = true;

	@ObfuscatedName("client.rh")
	public boolean field508 = false;

	@ObfuscatedName("client.sh")
	public boolean field509 = false;

	@ObfuscatedName("client.uh")
	public boolean field511 = false;

	@ObfuscatedName("client.vh")
	public String field512 = "";

	@ObfuscatedName("client.wh")
	public String field513 = "";

	@ObfuscatedName("client.Bh")
	public long[] field518 = new long[200];

	@ObfuscatedName("client.Ch")
	public int field519 = -1;

	@ObfuscatedName("client.Dh")
	public int[][] field520 = new int[104][104];

	@ObfuscatedName("client.Eh")
	public final int field521 = 7759444;

	@ObfuscatedName("client.Gh")
	public String[] field523 = new String[200];

	@ObfuscatedName("client.Ih")
	public class20 field525 = new class20(807);

	@ObfuscatedName("client.Kh")
	public final int field527 = 665;

	@ObfuscatedName("client.Mh")
	public boolean field529 = true;

	@ObfuscatedName("client.Qh")
	public int field533 = -1;

	@ObfuscatedName("client.Rh")
	public final int[] field534 = new int[5];

	@ObfuscatedName("client.Xh")
	public final int[] field540 = new int[151];

	@ObfuscatedName("client.Yh")
	public boolean field541 = false;

	@ObfuscatedName("client.Zh")
	public int[][] field542 = new int[104][104];

	@ObfuscatedName("client.ai")
	public boolean field543 = false;

	@ObfuscatedName("client.bi")
	public boolean field544 = false;

	@ObfuscatedName("client.ji")
	public final int field552 = -23379;

	@ObfuscatedName("client.li")
	public final class7[] field554 = new class7[5];

	@ObfuscatedName("client.mi")
	public final int[] field555 = new int[50];

	@ObfuscatedName("client.ni")
	public int field556 = -1;

	@ObfuscatedName("client.pi")
	public final int[] field558 = new int[100];

	@ObfuscatedName("client.qi")
	public final String[] field559 = new String[100];

	@ObfuscatedName("client.ri")
	public final String[] field560 = new String[100];

	@ObfuscatedName("client.ti")
	public final int field562 = 2048;

	@ObfuscatedName("client.ui")
	public final int field563 = 2047;

	@ObfuscatedName("client.vi")
	public class5[] field564 = new class5[this.field562];

	@ObfuscatedName("client.xi")
	public int[] field566 = new int[this.field562];

	@ObfuscatedName("client.zi")
	public int[] field568 = new int[this.field562];

	@ObfuscatedName("client.Ai")
	public class17[] field569 = new class17[this.field562];

	@ObfuscatedName("client.Ci")
	public final int[] field571 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

	@ObfuscatedName("client.Di")
	public final byte field572 = 5;

	@ObfuscatedName("client.Gi")
	public int field575 = 2;

	@ObfuscatedName("client.Ii")
	public final long[] field577 = new long[100];

	@ObfuscatedName("client.Ji")
	public boolean field578 = false;

	@ObfuscatedName("client.Wi")
	public final int field591 = -618;

	@ObfuscatedName("client.Xi")
	public final int[] field592 = new int[5];

	@ObfuscatedName("client.Yi")
	public final int field593 = -347;

	@ObfuscatedName("client.aj")
	public final String[] field595 = new String[5];

	@ObfuscatedName("client.bj")
	public final boolean[] field596 = new boolean[5];

	@ObfuscatedName("client.cj")
	public String field597 = "";

	@ObfuscatedName("client.fj")
	public int field600 = 1;

	@ObfuscatedName("client.gj")
	public final int[] field601 = new int[class53.field1350];

	@ObfuscatedName("client.kj")
	public int field605 = 292;

	@ObfuscatedName("client.lj")
	public int field606 = -1;

	@ObfuscatedName("client.mj")
	public final byte field607 = 9;

	@ObfuscatedName("client.nj")
	public int field608 = -1;

	@ObfuscatedName("client.sj")
	public boolean field613 = true;

	@ObfuscatedName("client.tj")
	public boolean field614 = false;

	@ObfuscatedName("client.wj")
	public int field617 = 1;

	@ObfuscatedName("client.zj")
	public final boolean field620 = false;

	@ObfuscatedName("client.Aj")
	public class17 field621 = class17.method212(1, (byte) 9);

	@ObfuscatedName("client.Cj")
	public class17 field623 = class17.method212(1, (byte) 9);

	@ObfuscatedName("client.Hj")
	public boolean field628 = false;

	@ObfuscatedName("client.Ij")
	public int field629 = -1;

	@ObfuscatedName("client.Kj")
	public int field631 = -1;

	@ObfuscatedName("client.Lj")
	public int field632 = 128;

	@ObfuscatedName("client.Uj")
	public final int[] field641 = new int[class53.field1350];

	@ObfuscatedName("client.Vj")
	public boolean field642 = false;

	@ObfuscatedName("client.Wj")
	public int[] field643 = new int[2000];

	@ObfuscatedName("client.Yj")
	public class40[] field645 = new class40[20];

	@ObfuscatedName("client.Zj")
	public final int[] field646 = new int[5];

	@ObfuscatedName("client.bk")
	public String field648 = "";

	@ObfuscatedName("client.K")
	public int field164;

	@ObfuscatedName("client.L")
	public int field165;

	@ObfuscatedName("client.M")
	public int field166;

	@ObfuscatedName("client.N")
	public int field167;

	@ObfuscatedName("client.O")
	public int field168;

	@ObfuscatedName("client.R")
	public int field171;

	@ObfuscatedName("client.T")
	public int field173;

	@ObfuscatedName("client.U")
	public int field174;

	@ObfuscatedName("client.Y")
	public int field178;

	@ObfuscatedName("client.Z")
	public int field179;

	@ObfuscatedName("client.ab")
	public int field180;

	@ObfuscatedName("client.bb")
	public int field181;

	@ObfuscatedName("client.cb")
	public int field182;

	@ObfuscatedName("client.eb")
	public int field184;

	@ObfuscatedName("client.fb")
	public int field185;

	@ObfuscatedName("client.gb")
	public int field186;

	@ObfuscatedName("client.hb")
	public int field187;

	@ObfuscatedName("client.ib")
	public int field188;

	@ObfuscatedName("client.mb")
	public int field192;

	@ObfuscatedName("client.vb")
	public static int field201;

	@ObfuscatedName("client.wb")
	public int field202;

	@ObfuscatedName("client.xb")
	public int field203;

	@ObfuscatedName("client.Ib")
	public int field214;

	@ObfuscatedName("client.Mb")
	public int field218;

	@ObfuscatedName("client.Pb")
	public int field221;

	@ObfuscatedName("client.Sb")
	public int field224;

	@ObfuscatedName("client.Tb")
	public int field225;

	@ObfuscatedName("client.Ub")
	public int field226;

	@ObfuscatedName("client.Vb")
	public int field227;

	@ObfuscatedName("client.Wb")
	public int field228;

	@ObfuscatedName("client.Xb")
	public int field229;

	@ObfuscatedName("client.ac")
	public int field232;

	@ObfuscatedName("client.dc")
	public static int field235;

	@ObfuscatedName("client.hc")
	public int field239;

	@ObfuscatedName("client.lc")
	public int field243;

	@ObfuscatedName("client.nc")
	public int field245;

	@ObfuscatedName("client.oc")
	public static int field246;

	@ObfuscatedName("client.pc")
	public int field247;

	@ObfuscatedName("client.qc")
	public int field248;

	@ObfuscatedName("client.rc")
	public int field249;

	@ObfuscatedName("client.sc")
	public int field250;

	@ObfuscatedName("client.tc")
	public int field251;

	@ObfuscatedName("client.xc")
	public int field255;

	@ObfuscatedName("client.yc")
	public int field256;

	@ObfuscatedName("client.Dc")
	public int field261;

	@ObfuscatedName("client.Lc")
	public static int field269;

	@ObfuscatedName("client.Nc")
	public int field271;

	@ObfuscatedName("client.Sc")
	public int field276;

	@ObfuscatedName("client.Uc")
	public int field278;

	@ObfuscatedName("client.Vc")
	public static int field279;

	@ObfuscatedName("client.Xc")
	public int field281;

	@ObfuscatedName("client.bd")
	public int field285;

	@ObfuscatedName("client.dd")
	public int field287;

	@ObfuscatedName("client.fd")
	public int field289;

	@ObfuscatedName("client.hd")
	public int field291;

	@ObfuscatedName("client.kd")
	public static int field294;

	@ObfuscatedName("client.nd")
	public int field297;

	@ObfuscatedName("client.sd")
	public int field302;

	@ObfuscatedName("client.Dd")
	public int field313;

	@ObfuscatedName("client.Ed")
	public int field314;

	@ObfuscatedName("client.Fd")
	public int field315;

	@ObfuscatedName("client.Gd")
	public int field316;

	@ObfuscatedName("client.Hd")
	public int field317;

	@ObfuscatedName("client.Nd")
	public int field323;

	@ObfuscatedName("client.Pd")
	public int field325;

	@ObfuscatedName("client.be")
	public static int field337;

	@ObfuscatedName("client.ee")
	public static int field340;

	@ObfuscatedName("client.ie")
	public int field344;

	@ObfuscatedName("client.qe")
	public int field352;

	@ObfuscatedName("client.te")
	public int field355;

	@ObfuscatedName("client.ue")
	public int field356;

	@ObfuscatedName("client.ve")
	public int field357;

	@ObfuscatedName("client.ze")
	public int field361;

	@ObfuscatedName("client.Fe")
	public int field367;

	@ObfuscatedName("client.Ge")
	public int field368;

	@ObfuscatedName("client.He")
	public int field369;

	@ObfuscatedName("client.Ie")
	public int field370;

	@ObfuscatedName("client.Je")
	public int field371;

	@ObfuscatedName("client.Oe")
	public int field376;

	@ObfuscatedName("client.Ye")
	public int field386;

	@ObfuscatedName("client.Ze")
	public static int field387;

	@ObfuscatedName("client.af")
	public int field388;

	@ObfuscatedName("client.gf")
	public int field394;

	@ObfuscatedName("client.hf")
	public static int field395;

	@ObfuscatedName("client.jf")
	public int field396;

	@ObfuscatedName("client.kf")
	public int field397;

	@ObfuscatedName("client.lf")
	public int field398;

	@ObfuscatedName("client.pf")
	public int field402;

	@ObfuscatedName("client.qf")
	public int field403;

	@ObfuscatedName("client.xf")
	public int field410;

	@ObfuscatedName("client.zf")
	public int field412;

	@ObfuscatedName("client.Af")
	public int field413;

	@ObfuscatedName("client.Bf")
	public int field414;

	@ObfuscatedName("client.Cf")
	public int field415;

	@ObfuscatedName("client.Uf")
	public int field433;

	@ObfuscatedName("client.Vf")
	public int field434;

	@ObfuscatedName("client.Wf")
	public int field435;

	@ObfuscatedName("client.Xf")
	public int field436;

	@ObfuscatedName("client.Yf")
	public int field437;

	@ObfuscatedName("client.Zf")
	public int field438;

	@ObfuscatedName("client.ag")
	public int field439;

	@ObfuscatedName("client.dg")
	public int field442;

	@ObfuscatedName("client.fg")
	public int field444;

	@ObfuscatedName("client.ig")
	public int field447;

	@ObfuscatedName("client.ng")
	public int field452;

	@ObfuscatedName("client.vg")
	public int field460;

	@ObfuscatedName("client.Fg")
	public int field470;

	@ObfuscatedName("client.Hg")
	public int field472;

	@ObfuscatedName("client.Ig")
	public int field473;

	@ObfuscatedName("client.Pg")
	public int field480;

	@ObfuscatedName("client.Qg")
	public int field481;

	@ObfuscatedName("client.Rg")
	public int field482;

	@ObfuscatedName("client.Tg")
	public int field484;

	@ObfuscatedName("client.Ug")
	public int field485;

	@ObfuscatedName("client.gh")
	public int field497;

	@ObfuscatedName("client.hh")
	public int field498;

	@ObfuscatedName("client.jh")
	public int field500;

	@ObfuscatedName("client.kh")
	public int field501;

	@ObfuscatedName("client.lh")
	public int field502;

	@ObfuscatedName("client.mh")
	public int field503;

	@ObfuscatedName("client.nh")
	public int field504;

	@ObfuscatedName("client.oh")
	public static int field505;

	@ObfuscatedName("client.th")
	public int field510;

	@ObfuscatedName("client.yh")
	public static int field515;

	@ObfuscatedName("client.zh")
	public int field516;

	@ObfuscatedName("client.Fh")
	public int field522;

	@ObfuscatedName("client.Hh")
	public int field524;

	@ObfuscatedName("client.Jh")
	public static int field526;

	@ObfuscatedName("client.Nh")
	public int field530;

	@ObfuscatedName("client.Oh")
	public int field531;

	@ObfuscatedName("client.Ph")
	public int field532;

	@ObfuscatedName("client.ci")
	public int field545;

	@ObfuscatedName("client.di")
	public int field546;

	@ObfuscatedName("client.ei")
	public int field547;

	@ObfuscatedName("client.fi")
	public int field548;

	@ObfuscatedName("client.hi")
	public int field550;

	@ObfuscatedName("client.ii")
	public int field551;

	@ObfuscatedName("client.ki")
	public static int field553;

	@ObfuscatedName("client.oi")
	public int field557;

	@ObfuscatedName("client.si")
	public int field561;

	@ObfuscatedName("client.wi")
	public int field565;

	@ObfuscatedName("client.yi")
	public int field567;

	@ObfuscatedName("client.Bi")
	public int field570;

	@ObfuscatedName("client.Ei")
	public static int field573;

	@ObfuscatedName("client.Fi")
	public int field574;

	@ObfuscatedName("client.Hi")
	public int field576;

	@ObfuscatedName("client.Li")
	public int field580;

	@ObfuscatedName("client.Mi")
	public int field581;

	@ObfuscatedName("client.Ni")
	public int field582;

	@ObfuscatedName("client.Oi")
	public int field583;

	@ObfuscatedName("client.Pi")
	public int field584;

	@ObfuscatedName("client.Qi")
	public int field585;

	@ObfuscatedName("client.Ri")
	public int field586;

	@ObfuscatedName("client.Si")
	public int field587;

	@ObfuscatedName("client.Ti")
	public int field588;

	@ObfuscatedName("client.Ui")
	public int field589;

	@ObfuscatedName("client.Vi")
	public static int field590;

	@ObfuscatedName("client.Zi")
	public int field594;

	@ObfuscatedName("client.dj")
	public int field598;

	@ObfuscatedName("client.ej")
	public int field599;

	@ObfuscatedName("client.oj")
	public int field609;

	@ObfuscatedName("client.pj")
	public int field610;

	@ObfuscatedName("client.qj")
	public int field611;

	@ObfuscatedName("client.rj")
	public int field612;

	@ObfuscatedName("client.uj")
	public int field615;

	@ObfuscatedName("client.vj")
	public int field616;

	@ObfuscatedName("client.xj")
	public int field618;

	@ObfuscatedName("client.Dj")
	public int field624;

	@ObfuscatedName("client.Jj")
	public int field630;

	@ObfuscatedName("client.Mj")
	public int field633;

	@ObfuscatedName("client.Nj")
	public int field634;

	@ObfuscatedName("client.Oj")
	public int field635;

	@ObfuscatedName("client.Pj")
	public int field636;

	@ObfuscatedName("client.Qj")
	public int field637;

	@ObfuscatedName("client.Rj")
	public int field638;

	@ObfuscatedName("client.Tj")
	public int field640;

	@ObfuscatedName("client.nb")
	public long field193;

	@ObfuscatedName("client.ic")
	public long field240;

	@ObfuscatedName("client.od")
	public long field298;

	@ObfuscatedName("client.yf")
	public long field411;

	@ObfuscatedName("client.Ah")
	public long field517;

	@ObfuscatedName("client.Ki")
	public class1 field579;

	@ObfuscatedName("client.pd")
	public static class5 field299;

	@ObfuscatedName("client.Md")
	public class6 field322;

	@ObfuscatedName("client.vc")
	public class19 field253;

	@ObfuscatedName("client.wc")
	public class19 field254;

	@ObfuscatedName("client.Ef")
	public class19 field417;

	@ObfuscatedName("client.Ff")
	public class19 field418;

	@ObfuscatedName("client.Gf")
	public class19 field419;

	@ObfuscatedName("client.Hf")
	public class19 field420;

	@ObfuscatedName("client.If")
	public class19 field421;

	@ObfuscatedName("client.Rf")
	public class19 field430;

	@ObfuscatedName("client.Sf")
	public class19 field431;

	@ObfuscatedName("client.Tf")
	public class19 field432;

	@ObfuscatedName("client.Kg")
	public class19 field475;

	@ObfuscatedName("client.Lg")
	public class19 field476;

	@ObfuscatedName("client.Mg")
	public class19 field477;

	@ObfuscatedName("client.Ng")
	public class19 field478;

	@ObfuscatedName("client.Og")
	public class19 field479;

	@ObfuscatedName("client.Sh")
	public class19 field535;

	@ObfuscatedName("client.Th")
	public class19 field536;

	@ObfuscatedName("client.Uh")
	public class19 field537;

	@ObfuscatedName("client.Vh")
	public class19 field538;

	@ObfuscatedName("client.Wh")
	public class19 field539;

	@ObfuscatedName("client.Jf")
	public class34 field422;

	@ObfuscatedName("client.Kf")
	public class34 field423;

	@ObfuscatedName("client.Lf")
	public class34 field424;

	@ObfuscatedName("client.Mf")
	public class34 field425;

	@ObfuscatedName("client.J")
	public class40 field163;

	@ObfuscatedName("client.qb")
	public class40 field196;

	@ObfuscatedName("client.rb")
	public class40 field197;

	@ObfuscatedName("client.sb")
	public class40 field198;

	@ObfuscatedName("client.tb")
	public class40 field199;

	@ObfuscatedName("client.ub")
	public class40 field200;

	@ObfuscatedName("client.Wc")
	public class40 field280;

	@ObfuscatedName("client.Ad")
	public class40 field310;

	@ObfuscatedName("client.Bd")
	public class40 field311;

	@ObfuscatedName("client.Te")
	public class40 field381;

	@ObfuscatedName("client.Ue")
	public class40 field382;

	@ObfuscatedName("client.bg")
	public class40 field440;

	@ObfuscatedName("client.Fj")
	public class40 field626;

	@ObfuscatedName("client.Gj")
	public class40 field627;

	@ObfuscatedName("client.Xj")
	public class40 field644;

	@ObfuscatedName("client.yb")
	public class58 field204;

	@ObfuscatedName("client.zb")
	public class58 field205;

	@ObfuscatedName("client.Ab")
	public class58 field206;

	@ObfuscatedName("client.Bb")
	public class58 field207;

	@ObfuscatedName("client.Cb")
	public class58 field208;

	@ObfuscatedName("client.Db")
	public class58 field209;

	@ObfuscatedName("client.Eb")
	public class58 field210;

	@ObfuscatedName("client.Fb")
	public class58 field211;

	@ObfuscatedName("client.Gb")
	public class58 field212;

	@ObfuscatedName("client.Id")
	public class58 field318;

	@ObfuscatedName("client.Jd")
	public class58 field319;

	@ObfuscatedName("client.Kd")
	public class58 field320;

	@ObfuscatedName("client.Sd")
	public class58 field328;

	@ObfuscatedName("client.Td")
	public class58 field329;

	@ObfuscatedName("client.Ud")
	public class58 field330;

	@ObfuscatedName("client.Vd")
	public class58 field331;

	@ObfuscatedName("client.Wd")
	public class58 field332;

	@ObfuscatedName("client.Xd")
	public class58 field333;

	@ObfuscatedName("client.Yd")
	public class58 field334;

	@ObfuscatedName("client.Zd")
	public class58 field335;

	@ObfuscatedName("client.ae")
	public class58 field336;

	@ObfuscatedName("client.Xg")
	public class58 field488;

	@ObfuscatedName("client.Yg")
	public class58 field489;

	@ObfuscatedName("client.Zg")
	public class58 field490;

	@ObfuscatedName("client.ah")
	public class58 field491;

	@ObfuscatedName("client.kc")
	public class59 field242;

	@ObfuscatedName("client.uf")
	public class68 field407;

	@ObfuscatedName("client.Ej")
	public class70 field625;

	@ObfuscatedName("client.hj")
	public class71 field602;

	@ObfuscatedName("client.Ld")
	public String field321;

	@ObfuscatedName("client.gi")
	public String field549;

	@ObfuscatedName("client.jj")
	public String field604;

	@ObfuscatedName("client.Sj")
	public String field639;

	@ObfuscatedName("client.X")
	public Socket field177;

	@ObfuscatedName("client.fc")
	public static boolean field237;

	@ObfuscatedName("client.ad")
	public static boolean field284;

	@ObfuscatedName("client.Pe")
	public static boolean field377;

	@ObfuscatedName("client.xh")
	public static boolean field514;

	@ObfuscatedName("client.jb")
	public int[] field189;

	@ObfuscatedName("client.kb")
	public int[] field190;

	@ObfuscatedName("client.lb")
	public int[] field191;

	@ObfuscatedName("client.Kb")
	public int[] field216;

	@ObfuscatedName("client.Lb")
	public int[] field217;

	@ObfuscatedName("client.Nf")
	public int[] field426;

	@ObfuscatedName("client.Of")
	public int[] field427;

	@ObfuscatedName("client.Pf")
	public int[] field428;

	@ObfuscatedName("client.Qf")
	public int[] field429;

	@ObfuscatedName("client.jg")
	public int[] field448;

	@ObfuscatedName("client.kg")
	public int[] field449;

	@ObfuscatedName("client.lg")
	public int[] field450;

	@ObfuscatedName("client.mg")
	public int[] field451;

	@ObfuscatedName("client.tg")
	public int[] field458;

	@ObfuscatedName("client.ug")
	public int[] field459;

	@ObfuscatedName("client.Ve")
	public class19[] field383;

	@ObfuscatedName("client.vd")
	public byte[][] field305;

	@ObfuscatedName("client.Df")
	public byte[][] field416;

	@ObfuscatedName("client.gc")
	public byte[][][] field238;

	@ObfuscatedName("client.Bj")
	public int[][][] field622;

	static {
		int var0 = 2;
		for (int var1 = 0; var1 < 32; var1++) {
			field528[var1] = var0 - 1;
			var0 += var0;
		}
		field603 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };
		field647 = new int[99];
		int var2 = 0;
		for (int var3 = 0; var3 < 99; var3++) {
			int var4 = var3 + 1;
			int var5 = (int) ((double) var4 + Math.pow(2.0D, (double) var4 / 7.0D) * 300.0D);
			var2 += var5;
			field647[var3] = var2 / 4;
		}
		field649 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";
	}

	@ObfuscatedName("client.a(BI)Ljava/lang/String;")
	public static String method53(int arg0) {
		try {
			String var1 = String.valueOf(arg0);
			for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
				var1 = var1.substring(0, var2) + "," + var1.substring(var2);
			}
			if (field405 != 71) {
				for (int var3 = 1; var3 > 0; var3++) {
				}
			}
			if (var1.length() > 8) {
				var1 = "@gre@" + var1.substring(0, var1.length() - 8) + " million @whi@(" + var1 + ")";
			} else if (var1.length() > 4) {
				var1 = "@cya@" + var1.substring(0, var1.length() - 4) + "K @whi@(" + var1 + ")";
			}
			return " " + var1;
		} catch (RuntimeException var5) {
			signlink.reporterror("24389, " + 71 + ", " + arg0 + ", " + var5.toString());
			throw new RuntimeException();
		}
	}

	public static void main(String[] arg0) {
		try {
			System.out.println("RS2 user client - release #" + 349);
			if (arg0.length == 5) {
				field234 = Integer.parseInt(arg0[0]);
				field235 = Integer.parseInt(arg0[1]);
				if (arg0[2].equals("lowmem")) {
					method130();
				} else if (arg0[2].equals("highmem")) {
					method171();
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}
				if (arg0[3].equals("free")) {
					field236 = false;
				} else if (arg0[3].equals("members")) {
					field236 = true;
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}
				signlink.storeid = Integer.parseInt(arg0[4]);
				signlink.startpriv(InetAddress.getLocalHost());
				client var1 = new client();
				var1.method12(765, (byte) 9, 503);
			} else {
				System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
			}
		} catch (Exception var3) {
		}
	}

	@ObfuscatedName("client.b(IBI)Ljava/lang/String;")
	public static String method104(int arg0, int arg1) {
		try {
			if (field215 != 28) {
				throw new NullPointerException();
			}
			int var2 = arg1 - arg0;
			if (var2 < -9) {
				return "@red@";
			} else if (var2 < -6) {
				return "@or3@";
			} else if (var2 < -3) {
				return "@or2@";
			} else if (var2 < 0) {
				return "@or1@";
			} else if (var2 > 9) {
				return "@gre@";
			} else if (var2 > 6) {
				return "@gr3@";
			} else if (var2 > 3) {
				return "@gr2@";
			} else if (var2 > 0) {
				return "@gr1@";
			} else {
				return "@yel@";
			}
		} catch (RuntimeException var4) {
			signlink.reporterror("15821, " + arg0 + ", " + 28 + ", " + arg1 + ", " + var4.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.G(I)V")
	public static void method130() {
		try {
			class68.field1553 = true;
			class21.field811 = true;
			field237 = true;
			class44.field1228 = true;
			class14.field722 = true;
		} catch (RuntimeException var1) {
			signlink.reporterror("42903, " + 15665 + ", " + var1.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.f(II)Ljava/lang/String;")
	public static String method167(int arg0) {
		try {
			if (arg0 < 100000) {
				return String.valueOf(arg0);
			} else if (arg0 < 10000000) {
				return arg0 / 1000 + "K";
			} else {
				return arg0 / 1000000 + "M";
			}
		} catch (RuntimeException var2) {
			signlink.reporterror("95928, " + arg0 + ", " + -8 + ", " + var2.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.P(I)V")
	public static void method171() {
		try {
			class68.field1553 = false;
			class21.field811 = false;
			field237 = false;
			class44.field1228 = false;
			class14.field722 = false;
		} catch (RuntimeException var1) {
			signlink.reporterror("93535, " + -229 + ", " + var1.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.a(LIRYXZZFE;II)I")
	public int method44(class27 arg0, int arg1) {
		try {
			if (arg0.field943 == null || arg1 >= arg0.field943.length) {
				return -2;
			}
			try {
				int[] var3 = arg0.field943[arg1];
				int var4 = 0;
				int var5 = 0;
				byte var6 = 0;
				while (true) {
					int var7 = var3[var5++];
					int var8 = 0;
					byte var9 = 0;
					if (var7 == 0) {
						return var4;
					}
					if (var7 == 1) {
						var8 = this.field601[var3[var5++]];
					}
					if (var7 == 2) {
						var8 = this.field641[var3[var5++]];
					}
					if (var7 == 3) {
						var8 = this.field213[var3[var5++]];
					}
					if (var7 == 4) {
						class27 var10 = class27.method329(var3[var5++]);
						int var11 = var3[var5++];
						if (var11 >= 0 && var11 < class67.field1534 && (!class67.method526(var11).field1507 || field236)) {
							for (int var12 = 0; var12 < var10.field947.length; var12++) {
								if (var10.field947[var12] == var11 + 1) {
									var8 += var10.field909[var12];
								}
							}
						}
					}
					if (var7 == 5) {
						var8 = this.field643[var3[var5++]];
					}
					if (var7 == 6) {
						var8 = field647[this.field641[var3[var5++]] - 1];
					}
					if (var7 == 7) {
						var8 = this.field643[var3[var5++]] * 100 / 46875;
					}
					if (var7 == 8) {
						var8 = field299.field121;
					}
					if (var7 == 9) {
						for (int var13 = 0; var13 < class53.field1350; var13++) {
							if (class53.field1352[var13]) {
								var8 += this.field641[var13];
							}
						}
					}
					if (var7 == 10) {
						class27 var14 = class27.method329(var3[var5++]);
						int var15 = var3[var5++] + 1;
						if (var15 >= 0 && var15 < class67.field1534 && (!class67.method526(var15).field1507 || field236)) {
							for (int var16 = 0; var16 < var14.field947.length; var16++) {
								if (var14.field947[var16] == var15) {
									var8 = 999999999;
									break;
								}
							}
						}
					}
					if (var7 == 11) {
						var8 = this.field239;
					}
					if (var7 == 12) {
						var8 = this.field171;
					}
					if (var7 == 13) {
						int var17 = this.field643[var3[var5++]];
						int var18 = var3[var5++];
						var8 = (var17 & 0x1 << var18) == 0 ? 0 : 1;
					}
					if (var7 == 14) {
						int var19 = var3[var5++];
						class51 var20 = class51.field1328[var19];
						int var21 = var20.field1330;
						int var22 = var20.field1331;
						int var23 = var20.field1332;
						int var24 = field528[var23 - var22];
						var8 = this.field643[var21] >> var22 & var24;
					}
					if (var7 == 15) {
						var9 = 1;
					}
					if (var7 == 16) {
						var9 = 2;
					}
					if (var7 == 17) {
						var9 = 3;
					}
					if (var7 == 18) {
						var8 = (field299.field67 >> 7) + this.field609;
					}
					if (var7 == 19) {
						var8 = (field299.field68 >> 7) + this.field610;
					}
					if (var7 == 20) {
						var8 = var3[var5++];
					}
					if (var9 == 0) {
						if (var6 == 0) {
							var4 += var8;
						}
						if (var6 == 1) {
							var4 -= var8;
						}
						if (var6 == 2 && var8 != 0) {
							var4 /= var8;
						}
						if (var6 == 3) {
							var4 *= var8;
						}
						var6 = 0;
					} else {
						var6 = var9;
					}
				}
			} catch (Exception var26) {
				return -1;
			}
		} catch (RuntimeException var27) {
			signlink.reporterror("41559, " + arg0 + ", " + -29344 + ", " + arg1 + ", " + var27.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.a(LIRYXZZFE;B)Z")
	public boolean method45(class27 arg0) {
		try {
			if (arg0.field903 == null) {
				return false;
			}
			for (int var2 = 0; var2 < arg0.field903.length; var2++) {
				int var3 = this.method44(arg0, var2);
				int var4 = arg0.field901[var2];
				if (arg0.field903[var2] == 2) {
					if (var3 >= var4) {
						return false;
					}
				} else if (arg0.field903[var2] == 3) {
					if (var3 <= var4) {
						return false;
					}
				} else if (arg0.field903[var2] == 4) {
					if (var3 == var4) {
						return false;
					}
				} else if (var3 != var4) {
					return false;
				}
			}
			return true;
		} catch (RuntimeException var6) {
			signlink.reporterror("92674, " + arg0 + ", " + 21 + ", " + var6.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.a(Ljava/lang/String;)V")
	public void method46(String arg0) {
		System.out.println(arg0);
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "loaderror_" + arg0 + ".html"));
		} catch (Exception var3) {
			var3.printStackTrace();
		}
		while (true) {
			while (true) {
				try {
					Thread.sleep(1000L);
				} catch (Exception var4) {
				}
			}
		}
	}

	@ObfuscatedName("client.b(Z)V")
	public void method47() {
		try {
			if (this.field243 != 0) {
				int var1 = 0;
				if (this.field470 != 0) {
					var1 = 1;
				}
				for (int var2 = 0; var2 < 100; var2++) {
					if (this.field560[var2] != null) {
						int var3 = this.field558[var2];
						String var4 = this.field559[var2];
						if (var4 != null && var4.startsWith("@cr1@")) {
							var4 = var4.substring(5);
						}
						if (var4 != null && var4.startsWith("@cr2@")) {
							var4 = var4.substring(5);
						}
						if ((var3 == 3 || var3 == 7) && (var3 == 7 || this.field355 == 0 || this.field355 == 1 && this.method179(var4))) {
							int var5 = 329 - var1 * 13;
							if (super.field92 > 4 && super.field93 - 4 > var5 - 10 && super.field93 - 4 <= var5 + 3) {
								int var6 = this.field423.method375("From:  " + var4 + this.field560[var2]) + 25;
								if (var6 > 450) {
									var6 = 450;
								}
								if (super.field92 < var6 + 4) {
									if (this.field181 >= 1) {
										this.field273[this.field412] = "Report abuse @whi@" + var4;
										this.field348[this.field412] = 2787;
										this.field412++;
									}
									this.field273[this.field412] = "Add ignore @whi@" + var4;
									this.field348[this.field412] = 2379;
									this.field412++;
									this.field273[this.field412] = "Add friend @whi@" + var4;
									this.field348[this.field412] = 2696;
									this.field412++;
								}
							}
							var1++;
							if (var1 >= 5) {
								return;
							}
						}
						if ((var3 == 5 || var3 == 6) && this.field355 < 2) {
							var1++;
							if (var1 >= 5) {
								return;
							}
						}
					}
				}
			}
		} catch (RuntimeException var8) {
			signlink.reporterror("96089, " + false + ", " + var8.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.c(Z)V")
	public void method48() {
		try {
			this.field489.method463();
			if (this.field594 == 2) {
				byte[] var1 = this.field431.field798;
				int[] var2 = class26.field876;
				int var3 = var1.length;
				for (int var4 = 0; var4 < var3; var4++) {
					if (var1[var4] == 0) {
						var2[var4] = 0;
					}
				}
				this.field644.method408(256, 33, this.field633, 33, 25, this.field404, 0, this.field343, 0, 25);
				this.field490.method463();
				class21.field822 = this.field428;
			} else {
				int var5 = this.field633 + this.field323 & 0x7FF;
				int var6 = field299.field67 / 32 + 48;
				int var7 = 464 - field299.field68 / 32;
				this.field440.method408(this.field599 + 256, 146, var5, 151, var6, this.field354, 5, this.field540, 25, var7);
				this.field644.method408(256, 33, this.field633, 33, 25, this.field404, 0, this.field343, 0, 25);
				for (int var8 = 0; var8 < this.field361; var8++) {
					int var9 = this.field362[var8] * 4 + 2 - field299.field67 / 32;
					int var10 = this.field363[var8] * 4 + 2 - field299.field68 / 32;
					this.method178(this.field373[var8], var10, var9);
				}
				for (int var11 = 0; var11 < 104; var11++) {
					for (int var12 = 0; var12 < 104; var12++) {
						class20 var13 = this.field406[this.field180][var11][var12];
						if (var13 != null) {
							int var14 = var11 * 4 + 2 - field299.field67 / 32;
							int var15 = var12 * 4 + 2 - field299.field68 / 32;
							this.method178(this.field196, var15, var14);
						}
					}
				}
				for (int var16 = 0; var16 < this.field232; var16++) {
					class43 var17 = this.field231[this.field233[var16]];
					if (var17 != null && var17.method10()) {
						class37 var18 = var17.field1213;
						if (var18.field1119 != null) {
							var18 = var18.method389();
						}
						if (var18 != null && var18.field1132 && var18.field1128) {
							int var19 = var17.field67 / 32 - field299.field67 / 32;
							int var20 = var17.field68 / 32 - field299.field68 / 32;
							this.method178(this.field197, var20, var19);
						}
					}
				}
				for (int var21 = 0; var21 < this.field565; var21++) {
					class5 var22 = this.field564[this.field566[var21]];
					if (var22 != null && var22.method10()) {
						int var23 = var22.field67 / 32 - field299.field67 / 32;
						int var24 = var22.field68 / 32 - field299.field68 / 32;
						boolean var25 = false;
						long var26 = class33.method366(var22.field129);
						for (int var28 = 0; var28 < this.field173; var28++) {
							if (var26 == this.field518[var28] && this.field456[var28] != 0) {
								var25 = true;
								break;
							}
						}
						boolean var29 = false;
						if (field299.field130 != 0 && var22.field130 != 0 && field299.field130 == var22.field130) {
							var29 = true;
						}
						if (var25) {
							this.method178(this.field199, var24, var23);
						} else if (var29) {
							this.method178(this.field200, var24, var23);
						} else {
							this.method178(this.field198, var24, var23);
						}
					}
				}
				if (this.field281 != 0 && field553 % 20 < 10) {
					if (this.field281 == 1 && this.field570 >= 0 && this.field570 < this.field231.length) {
						class43 var30 = this.field231[this.field570];
						if (var30 != null) {
							int var31 = var30.field67 / 32 - field299.field67 / 32;
							int var32 = var30.field68 / 32 - field299.field68 / 32;
							this.method115(this.field311, this.field496, var32, var31);
						}
					}
					if (this.field281 == 2) {
						int var33 = (this.field164 - this.field609) * 4 + 2 - field299.field67 / 32;
						int var34 = (this.field165 - this.field610) * 4 + 2 - field299.field68 / 32;
						this.method115(this.field311, this.field496, var34, var33);
					}
					if (this.field281 == 10 && this.field245 >= 0 && this.field245 < this.field564.length) {
						class5 var35 = this.field564[this.field245];
						if (var35 != null) {
							int var36 = var35.field67 / 32 - field299.field67 / 32;
							int var37 = var35.field68 / 32 - field299.field68 / 32;
							this.method115(this.field311, this.field496, var37, var36);
						}
					}
				}
				if (this.field438 != 0) {
					int var38 = this.field438 * 4 + 2 - field299.field67 / 32;
					int var39 = this.field439 * 4 + 2 - field299.field68 / 32;
					this.method178(this.field310, var39, var38);
				}
				class26.method315(16777215, 97, 99, 3, 3, 78);
				this.field490.method463();
				class21.field822 = this.field428;
			}
		} catch (RuntimeException var41) {
			signlink.reporterror("48319, " + false + ", " + var41.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.f(I)V")
	public void method49() {
		try {
			int var1 = this.field314;
			int var2 = this.field315;
			int var3 = this.field316;
			int var4 = this.field317;
			class26.method315(6116423, var1, 99, var3, var4, var2);
			class26.method315(0, var1 + 1, 99, var3 - 2, 16, var2 + 1);
			class26.method316(var2 + 18, var3 - 2, var1 + 1, var4 - 19, 0);
			this.field424.method377("Choose Option", var2 + 14, var1 + 3, 6116423);
			int var5 = super.field92;
			int var6 = super.field93;
			if (this.field313 == 0) {
				var5 -= 4;
				var6 -= 4;
			}
			if (this.field313 == 1) {
				var5 -= 553;
				var6 -= 205;
			}
			if (this.field313 == 2) {
				var5 -= 17;
				var6 -= 357;
			}
			for (int var7 = 0; var7 < this.field412; var7++) {
				int var8 = var2 + (this.field412 - 1 - var7) * 15 + 31;
				int var9 = 16777215;
				if (var5 > var1 && var5 < var1 + var3 && var6 > var8 - 13 && var6 < var8 + 3) {
					var9 = 16776960;
				}
				this.field424.method381(var1 + 3, var8, true, var9, this.field273[var7]);
			}
		} catch (RuntimeException var11) {
			signlink.reporterror("46965, " + 6 + ", " + var11.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.b(III)V")
	public void method50(int arg0, int arg1) {
		try {
			int var3 = 0;
			for (int var4 = 0; var4 < 100; var4++) {
				if (this.field560[var4] != null) {
					int var5 = this.field558[var4];
					int var6 = this.field356 + 70 + 4 - var3 * 14;
					if (var6 < -20) {
						break;
					}
					String var7 = this.field559[var4];
					if (var7 != null && var7.startsWith("@cr1@")) {
						var7 = var7.substring(5);
					}
					if (var7 != null && var7.startsWith("@cr2@")) {
						var7 = var7.substring(5);
					}
					if (var5 == 0) {
						var3++;
					}
					if ((var5 == 1 || var5 == 2) && (var5 == 1 || this.field498 == 0 || this.field498 == 1 && this.method179(var7))) {
						if (arg0 > var6 - 14 && arg0 <= var6 && !var7.equals(field299.field129)) {
							if (this.field181 >= 1) {
								this.field273[this.field412] = "Report abuse @whi@" + var7;
								this.field348[this.field412] = 787;
								this.field412++;
							}
							this.field273[this.field412] = "Add ignore @whi@" + var7;
							this.field348[this.field412] = 379;
							this.field412++;
							this.field273[this.field412] = "Add friend @whi@" + var7;
							this.field348[this.field412] = 696;
							this.field412++;
						}
						var3++;
					}
					if ((var5 == 3 || var5 == 7) && this.field243 == 0 && (var5 == 7 || this.field355 == 0 || this.field355 == 1 && this.method179(var7))) {
						if (arg0 > var6 - 14 && arg0 <= var6) {
							if (this.field181 >= 1) {
								this.field273[this.field412] = "Report abuse @whi@" + var7;
								this.field348[this.field412] = 787;
								this.field412++;
							}
							this.field273[this.field412] = "Add ignore @whi@" + var7;
							this.field348[this.field412] = 379;
							this.field412++;
							this.field273[this.field412] = "Add friend @whi@" + var7;
							this.field348[this.field412] = 696;
							this.field412++;
						}
						var3++;
					}
					if (var5 == 4 && (this.field386 == 0 || this.field386 == 1 && this.method179(var7))) {
						if (arg0 > var6 - 14 && arg0 <= var6) {
							this.field273[this.field412] = "Accept trade @whi@" + var7;
							this.field348[this.field412] = 940;
							this.field412++;
						}
						var3++;
					}
					if ((var5 == 5 || var5 == 6) && this.field243 == 0 && this.field355 < 2) {
						var3++;
					}
					if (var5 == 8 && (this.field386 == 0 || this.field386 == 1 && this.method179(var7))) {
						if (arg0 > var6 - 14 && arg0 <= var6) {
							this.field273[this.field412] = "Accept challenge @whi@" + var7;
							this.field348[this.field412] = 113;
							this.field412++;
						}
						var3++;
					}
				}
			}
		} catch (RuntimeException var9) {
			signlink.reporterror("21619, " + arg0 + ", " + -435 + ", " + arg1 + ", " + var9.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.a(II)V")
	public void method51(int arg0) {
		try {
			if (arg0 >= 0) {
				if (this.field630 != 0) {
					this.field630 = 0;
					this.field642 = true;
				}
				int var2 = this.field346[arg0];
				int var3 = this.field347[arg0];
				int var4 = this.field348[arg0];
				int var5 = this.field349[arg0];
				if (var4 >= 2000) {
					var4 -= 2000;
				}
				if (var4 == 281) {
					field395 += var3;
					if (field395 >= 82) {
						this.field623.method213(182);
						field395 = 0;
					}
					this.field623.method213(255);
					this.field623.method215(var2);
					this.field623.method250(var5);
					this.field623.method250(var3);
					this.field500 = 0;
					this.field501 = var3;
					this.field502 = var2;
					this.field503 = 2;
					if (class27.method329(var3).field895 == this.field265) {
						this.field503 = 1;
					}
					if (class27.method329(var3).field895 == this.field499) {
						this.field503 = 3;
					}
				}
				if (var4 == 946) {
					this.field623.method213(17);
					this.field623.method250(var2);
					this.field623.method250(var5);
					this.field623.method215(var3);
					this.field500 = 0;
					this.field501 = var3;
					this.field502 = var2;
					this.field503 = 2;
					if (class27.method329(var3).field895 == this.field265) {
						this.field503 = 1;
					}
					if (class27.method329(var3).field895 == this.field499) {
						this.field503 = 3;
					}
				}
				if (var4 == 1335) {
					class43 var6 = this.field231[var5];
					if (var6 != null) {
						class37 var7 = var6.field1213;
						if (var7.field1119 != null) {
							var7 = var7.method389();
						}
						if (var7 != null) {
							String var8;
							if (var7.field1147 == null) {
								var8 = "It's a " + var7.field1142 + ".";
							} else {
								var8 = new String(var7.field1147);
							}
							this.method126(0, var8, "");
						}
					}
				}
				if (var4 == 426) {
					class27 var9 = class27.method329(var3);
					boolean var10 = true;
					if (var9.field891 > 0) {
						var10 = this.method56(var9);
					}
					if (var10) {
						this.field623.method213(208);
						this.field623.method215(var3);
					}
				}
				if (var4 == 377) {
					this.field623.method213(226);
					this.field623.method251(var2);
					this.field623.method215(var5);
					this.field623.method249(var3);
					this.field500 = 0;
					this.field501 = var3;
					this.field502 = var2;
					this.field503 = 2;
					if (class27.method329(var3).field895 == this.field265) {
						this.field503 = 1;
					}
					if (class27.method329(var3).field895 == this.field499) {
						this.field503 = 3;
					}
				}
				if (var4 == 405 && !this.field446) {
					this.field623.method213(154);
					this.field623.method215(var3);
					this.field446 = true;
				}
				if (var4 == 275) {
					boolean var11 = this.method155(var2, (byte) 6, var3, 2, 0, field299.field38[0], false, 0, field299.field37[0], 0, 0, 0);
					if (!var11) {
						this.method155(var2, (byte) 6, var3, 2, 1, field299.field38[0], false, 0, field299.field37[0], 0, 1, 0);
					}
					this.field247 = super.field99;
					this.field248 = super.field100;
					this.field250 = 2;
					this.field249 = 0;
					this.field623.method213(143);
					this.field623.method249(var3 + this.field610);
					this.field623.method250(var5);
					this.field623.method249(var2 + this.field609);
				}
				if (var4 == 515) {
					class43 var13 = this.field231[var5];
					if (var13 != null) {
						this.method155(var13.field37[0], (byte) 6, var13.field38[0], 2, 1, field299.field38[0], false, 0, field299.field37[0], 0, 1, 0);
						this.field247 = super.field99;
						this.field248 = super.field100;
						this.field250 = 2;
						this.field249 = 0;
						this.field623.method213(16);
						this.field623.method250(var5);
					}
				}
				if (var4 == 951) {
					this.field623.method213(208);
					this.field623.method215(var3);
					class27 var14 = class27.method329(var3);
					if (var14.field943 != null && var14.field943[0][0] == 5) {
						int var15 = var14.field943[0][1];
						if (this.field643[var15] != var14.field901[0]) {
							this.field643[var15] = var14.field901[0];
							this.method132(var15);
							this.field541 = true;
						}
					}
				}
				if (var4 == 983) {
					class43 var16 = this.field231[var5];
					if (var16 != null) {
						this.method155(var16.field37[0], (byte) 6, var16.field38[0], 2, 1, field299.field38[0], false, 0, field299.field37[0], 0, 1, 0);
						this.field247 = super.field99;
						this.field248 = super.field100;
						this.field250 = 2;
						this.field249 = 0;
						this.field623.method213(158);
						this.field623.method249(var5);
					}
				}
				if (var4 == 646) {
					class43 var17 = this.field231[var5];
					if (var17 != null) {
						this.method155(var17.field37[0], (byte) 6, var17.field38[0], 2, 1, field299.field38[0], false, 0, field299.field37[0], 0, 1, 0);
						this.field247 = super.field99;
						this.field248 = super.field100;
						this.field250 = 2;
						this.field249 = 0;
						this.field623.method213(48);
						this.field623.method215(this.field547);
						this.field623.method249(this.field548);
						this.field623.method249(var5);
						this.field623.method249(this.field546);
					}
				}
				if (var4 == 1) {
					this.field623.method213(73);
					this.field623.method250(var3);
					this.field623.method250(var5);
					this.field623.method215(var2);
					this.field500 = 0;
					this.field501 = var3;
					this.field502 = var2;
					this.field503 = 2;
					if (class27.method329(var3).field895 == this.field265) {
						this.field503 = 1;
					}
					if (class27.method329(var3).field895 == this.field499) {
						this.field503 = 3;
					}
				}
				if (var4 == 98) {
					boolean var18 = this.method155(var2, (byte) 6, var3, 2, 0, field299.field38[0], false, 0, field299.field37[0], 0, 0, 0);
					if (!var18) {
						this.method155(var2, (byte) 6, var3, 2, 1, field299.field38[0], false, 0, field299.field37[0], 0, 1, 0);
					}
					this.field247 = super.field99;
					this.field248 = super.field100;
					this.field250 = 2;
					this.field249 = 0;
					this.field623.method213(105);
					this.field623.method251(var3 + this.field610);
					this.field623.method249(var5);
					this.field623.method250(var2 + this.field609);
				}
				if (var4 == 582) {
					class27 var20 = class27.method329(var3);
					this.field636 = 1;
					this.field637 = var3;
					this.field638 = var20.field938;
					this.field545 = 0;
					this.field541 = true;
					String var21 = var20.field939;
					if (var21.indexOf(" ") != -1) {
						var21 = var21.substring(0, var21.indexOf(" "));
					}
					String var22 = var20.field939;
					if (var22.indexOf(" ") != -1) {
						var22 = var22.substring(var22.indexOf(" ") + 1);
					}
					this.field639 = var21 + " " + var20.field897 + " " + var22;
					if (this.field638 == 16) {
						this.field541 = true;
						this.field365 = 3;
						this.field264 = true;
					}
				} else {
					if (var4 == 403) {
						class43 var23 = this.field231[var5];
						if (var23 != null) {
							this.method155(var23.field37[0], (byte) 6, var23.field38[0], 2, 1, field299.field38[0], false, 0, field299.field37[0], 0, 1, 0);
							this.field247 = super.field99;
							this.field248 = super.field100;
							this.field250 = 2;
							this.field249 = 0;
							this.field623.method213(21);
							this.field623.method249(var5);
							this.field623.method249(this.field637);
						}
					}
					if (var4 == 703) {
						class5 var24 = this.field564[var5];
						if (var24 != null) {
							this.method155(var24.field37[0], (byte) 6, var24.field38[0], 2, 1, field299.field38[0], false, 0, field299.field37[0], 0, 1, 0);
							this.field247 = super.field99;
							this.field248 = super.field100;
							this.field250 = 2;
							this.field249 = 0;
							this.field623.method213(189);
							this.field623.method250(var5);
							this.field623.method215(this.field547);
							this.field623.method250(this.field546);
							this.field623.method249(this.field548);
						}
					}
					if (var4 == 419 && this.method101(var2, var5, var3)) {
						this.field623.method213(18);
						this.field623.method251(this.field548);
						this.field623.method250(var5 >> 14 & 0x7FFF);
						this.field623.method215(this.field546);
						this.field623.method249(var2 + this.field609);
						this.field623.method251(this.field547);
						this.field623.method215(var3 + this.field610);
					}
					if (var4 == 621) {
						class5 var25 = this.field564[var5];
						if (var25 != null) {
							this.method155(var25.field37[0], (byte) 6, var25.field38[0], 2, 1, field299.field38[0], false, 0, field299.field37[0], 0, 1, 0);
							this.field247 = super.field99;
							this.field248 = super.field100;
							this.field250 = 2;
							this.field249 = 0;
							this.field623.method213(170);
							this.field623.method250(this.field637);
							this.field623.method215(var5);
						}
					}
					if (var4 == 184) {
						boolean var26 = this.method155(var2, (byte) 6, var3, 2, 0, field299.field38[0], false, 0, field299.field37[0], 0, 0, 0);
						if (!var26) {
							this.method155(var2, (byte) 6, var3, 2, 1, field299.field38[0], false, 0, field299.field37[0], 0, 1, 0);
						}
						this.field247 = super.field99;
						this.field248 = super.field100;
						this.field250 = 2;
						this.field249 = 0;
						this.field623.method213(41);
						this.field623.method215(var5);
						this.field623.method251(var3 + this.field610);
						this.field623.method215(var2 + this.field609);
					}
					if (var4 == 985) {
						field337 += var3;
						if (field337 >= 145) {
							this.field623.method213(100);
							field337 = 0;
						}
						this.method101(var2, var5, var3);
						this.field623.method213(59);
						this.field623.method215(var5 >> 14 & 0x7FFF);
						this.field623.method249(var3 + this.field610);
						this.field623.method250(var2 + this.field609);
					}
					if (var4 == 883) {
						class5 var28 = this.field564[var5];
						if (var28 != null) {
							this.method155(var28.field37[0], (byte) 6, var28.field38[0], 2, 1, field299.field38[0], false, 0, field299.field37[0], 0, 1, 0);
							this.field247 = super.field99;
							this.field248 = super.field100;
							this.field250 = 2;
							this.field249 = 0;
							this.field623.method213(99);
							this.field623.method251(var5);
						}
					}
					if (var4 == 16) {
						if (this.field392) {
							this.field407.method566(var2 - 4, var3 - 4);
						} else {
							this.field407.method566(super.field99 - 4, super.field100 - 4);
						}
					}
					if (var4 == 208) {
						this.method88();
					}
					if (var4 == 1577) {
						this.method101(var2, var5, var3);
						this.field623.method213(206);
						this.field623.method251(var2 + this.field609);
						this.field623.method249(var3 + this.field610);
						this.field623.method215(var5 >> 14 & 0x7FFF);
					}
					if (var4 == 787) {
						String var29 = this.field273[arg0];
						int var30 = var29.indexOf("@whi@");
						if (var30 != -1) {
							if (this.field265 == -1) {
								this.method88();
								this.field597 = var29.substring(var30 + 5).trim();
								this.field487 = false;
								this.field608 = this.field265 = class27.field887;
							} else {
								this.method126(0, "Please close the interface you have open before using 'report abuse'", "");
							}
						}
					}
					if (var4 == 157 && this.method101(var2, var5, var3)) {
						this.field623.method213(90);
						this.field623.method215(var3 + this.field610);
						this.field623.method250(var5 >> 14 & 0x7FFF);
						this.field623.method215(var2 + this.field609);
						this.field623.method251(this.field637);
					}
					if (var4 == 62) {
						boolean var31 = this.method155(var2, (byte) 6, var3, 2, 0, field299.field38[0], false, 0, field299.field37[0], 0, 0, 0);
						if (!var31) {
							this.method155(var2, (byte) 6, var3, 2, 1, field299.field38[0], false, 0, field299.field37[0], 0, 1, 0);
						}
						this.field247 = super.field99;
						this.field248 = super.field100;
						this.field250 = 2;
						this.field249 = 0;
						this.field623.method213(113);
						this.field623.method250(this.field546);
						this.field623.method249(var3 + this.field610);
						this.field623.method250(this.field548);
						this.field623.method251(this.field547);
						this.field623.method215(var2 + this.field609);
						this.field623.method215(var5);
					}
					if (var4 == 391) {
						this.field623.method213(174);
						this.field623.method250(var2);
						this.field623.method251(var5);
						this.field623.method249(var3);
						this.field500 = 0;
						this.field501 = var3;
						this.field502 = var2;
						this.field503 = 2;
						if (class27.method329(var3).field895 == this.field265) {
							this.field503 = 1;
						}
						if (class27.method329(var3).field895 == this.field499) {
							this.field503 = 3;
						}
					}
					if (var4 == 233) {
						class5 var33 = this.field564[var5];
						if (var33 != null) {
							this.method155(var33.field37[0], (byte) 6, var33.field38[0], 2, 1, field299.field38[0], false, 0, field299.field37[0], 0, 1, 0);
							this.field247 = super.field99;
							this.field248 = super.field100;
							this.field250 = 2;
							this.field249 = 0;
							this.field623.method213(190);
							this.field623.method215(var5);
						}
					}
					if (var4 == 81) {
						boolean var34 = this.method155(var2, (byte) 6, var3, 2, 0, field299.field38[0], false, 0, field299.field37[0], 0, 0, 0);
						if (!var34) {
							this.method155(var2, (byte) 6, var3, 2, 1, field299.field38[0], false, 0, field299.field37[0], 0, 1, 0);
						}
						this.field247 = super.field99;
						this.field248 = super.field100;
						this.field250 = 2;
						this.field249 = 0;
						this.field623.method213(12);
						this.field623.method250(var5);
						this.field623.method215(var3 + this.field610);
						this.field623.method251(var2 + this.field609);
					}
					if (var4 == 696 || var4 == 379 || var4 == 526 || var4 == 212) {
						String var36 = this.field273[arg0];
						int var37 = var36.indexOf("@whi@");
						if (var37 != -1) {
							long var38 = class33.method366(var36.substring(var37 + 5).trim());
							if (var4 == 696) {
								this.method68(var38);
							}
							if (var4 == 379) {
								this.method57(var38);
							}
							if (var4 == 526) {
								this.method61(var38);
							}
							if (var4 == 212) {
								this.method114(var38, this.field557);
							}
						}
					}
					if (var4 == 1184) {
						class67 var40 = class67.method526(var5);
						String var41;
						if (var40.field1528 == null) {
							var41 = "It's a " + var40.field1533 + ".";
						} else {
							var41 = new String(var40.field1528);
						}
						this.method126(0, var41, "");
					}
					if (var4 == 963) {
						this.field545 = 1;
						this.field546 = var2;
						this.field547 = var3;
						this.field548 = var5;
						this.field549 = class67.method526(var5).field1533;
						this.field636 = 0;
						this.field541 = true;
					} else {
						if (var4 == 447) {
							class43 var42 = this.field231[var5];
							if (var42 != null) {
								this.method155(var42.field37[0], (byte) 6, var42.field38[0], 2, 1, field299.field38[0], false, 0, field299.field37[0], 0, 1, 0);
								this.field247 = super.field99;
								this.field248 = super.field100;
								this.field250 = 2;
								this.field249 = 0;
								this.field623.method213(163);
								this.field623.method250(var5);
							}
						}
						if (var4 == 940 || var4 == 113) {
							String var43 = this.field273[arg0];
							int var44 = var43.indexOf("@whi@");
							if (var44 != -1) {
								String var45 = var43.substring(var44 + 5).trim();
								String var46 = class33.method370(class33.method367(class33.method366(var45)));
								boolean var47 = false;
								for (int var48 = 0; var48 < this.field565; var48++) {
									class5 var49 = this.field564[this.field566[var48]];
									if (var49 != null && var49.field129 != null && var49.field129.equalsIgnoreCase(var46)) {
										this.method155(var49.field37[0], (byte) 6, var49.field38[0], 2, 1, field299.field38[0], false, 0, field299.field37[0], 0, 1, 0);
										if (var4 == 940) {
											this.field623.method213(162);
											this.field623.method215(this.field566[var48]);
										}
										if (var4 == 113) {
											this.field623.method213(99);
											this.field623.method251(this.field566[var48]);
										}
										var47 = true;
										break;
									}
								}
								if (!var47) {
									this.method126(0, "Unable to find " + var46, "");
								}
							}
						}
						if (var4 == 482) {
							this.method146(this.field629);
							this.field629 = -1;
							this.field642 = true;
						}
						if (var4 == 896) {
							class5 var50 = this.field564[var5];
							if (var50 != null) {
								this.method155(var50.field37[0], (byte) 6, var50.field38[0], 2, 1, field299.field38[0], false, 0, field299.field37[0], 0, 1, 0);
								this.field247 = super.field99;
								this.field248 = super.field100;
								this.field250 = 2;
								this.field249 = 0;
								this.field623.method213(162);
								this.field623.method215(var5);
							}
						}
						if (var4 == 789) {
							this.field623.method213(14);
							this.field623.method251(this.field637);
							this.field623.method215(var5);
							this.field623.method249(var3);
							this.field623.method250(var2);
							this.field500 = 0;
							this.field501 = var3;
							this.field502 = var2;
							this.field503 = 2;
							if (class27.method329(var3).field895 == this.field265) {
								this.field503 = 1;
							}
							if (class27.method329(var3).field895 == this.field499) {
								this.field503 = 3;
							}
						}
						if (var4 == 766) {
							this.method101(var2, var5, var3);
							this.field623.method213(217);
							this.field623.method251(var2 + this.field609);
							this.field623.method249(var3 + this.field610);
							this.field623.method249(var5 >> 14 & 0x7FFF);
						}
						if (var4 == 247) {
							String var51 = this.field273[arg0];
							int var52 = var51.indexOf("@whi@");
							if (var52 != -1) {
								long var53 = class33.method366(var51.substring(var52 + 5).trim());
								int var55 = -1;
								for (int var56 = 0; var56 < this.field173; var56++) {
									if (this.field518[var56] == var53) {
										var55 = var56;
										break;
									}
								}
								if (var55 != -1 && this.field456[var55] > 0) {
									this.field642 = true;
									this.field630 = 0;
									this.field614 = true;
									this.field244 = "";
									this.field516 = 3;
									this.field193 = this.field518[var55];
									this.field648 = "Enter message to send to " + this.field523[var55];
								}
							}
						}
						if (var4 == 277) {
							field201++;
							if (field201 >= 132) {
								this.field623.method213(95);
								this.field623.method218(0);
								field201 = 0;
							}
							this.field623.method213(93);
							this.field623.method250(var3);
							this.field623.method250(var2);
							this.field623.method215(var5);
							this.field500 = 0;
							this.field501 = var3;
							this.field502 = var2;
							this.field503 = 2;
							if (class27.method329(var3).field895 == this.field265) {
								this.field503 = 1;
							}
							if (class27.method329(var3).field895 == this.field499) {
								this.field503 = 3;
							}
						}
						if (var4 == 359) {
							class5 var57 = this.field564[var5];
							if (var57 != null) {
								this.method155(var57.field37[0], (byte) 6, var57.field38[0], 2, 1, field299.field38[0], false, 0, field299.field37[0], 0, 1, 0);
								this.field247 = super.field99;
								this.field248 = super.field100;
								this.field250 = 2;
								this.field249 = 0;
								this.field623.method213(134);
								this.field623.method249(var5);
							}
						}
						if (var4 == 530) {
							this.field623.method213(19);
							this.field623.method249(var3);
							this.field623.method249(var2);
							this.field623.method251(var5);
							this.field500 = 0;
							this.field501 = var3;
							this.field502 = var2;
							this.field503 = 2;
							if (class27.method329(var3).field895 == this.field265) {
								this.field503 = 1;
							}
							if (class27.method329(var3).field895 == this.field499) {
								this.field503 = 3;
							}
						}
						if (var4 == 485) {
							this.field623.method213(117);
							this.field623.method251(var5);
							this.field623.method249(var2);
							this.field623.method251(var3);
							this.field500 = 0;
							this.field501 = var3;
							this.field502 = var2;
							this.field503 = 2;
							if (class27.method329(var3).field895 == this.field265) {
								this.field503 = 1;
							}
							if (class27.method329(var3).field895 == this.field499) {
								this.field503 = 3;
							}
						}
						if (var4 == 538) {
							boolean var58 = this.method155(var2, (byte) 6, var3, 2, 0, field299.field38[0], false, 0, field299.field37[0], 0, 0, 0);
							if (!var58) {
								this.method155(var2, (byte) 6, var3, 2, 1, field299.field38[0], false, 0, field299.field37[0], 0, 1, 0);
							}
							this.field247 = super.field99;
							this.field248 = super.field100;
							this.field250 = 2;
							this.field249 = 0;
							this.field623.method213(104);
							this.field623.method250(var2 + this.field609);
							this.field623.method215(var3 + this.field610);
							this.field623.method249(this.field637);
							this.field623.method215(var5);
						}
						if (var4 == 689) {
							boolean var60 = this.method155(var2, (byte) 6, var3, 2, 0, field299.field38[0], false, 0, field299.field37[0], 0, 0, 0);
							if (!var60) {
								this.method155(var2, (byte) 6, var3, 2, 1, field299.field38[0], false, 0, field299.field37[0], 0, 1, 0);
							}
							this.field247 = super.field99;
							this.field248 = super.field100;
							this.field250 = 2;
							this.field249 = 0;
							field246 += var3;
							if (field246 >= 102) {
								this.field623.method213(30);
								this.field623.method218(0);
								field246 = 0;
							}
							this.field623.method213(57);
							this.field623.method215(var5);
							this.field623.method215(var2 + this.field609);
							this.field623.method250(var3 + this.field610);
						}
						if (var4 == 790) {
							this.field623.method213(208);
							this.field623.method215(var3);
							class27 var62 = class27.method329(var3);
							if (var62.field943 != null && var62.field943[0][0] == 5) {
								int var63 = var62.field943[0][1];
								this.field643[var63] = 1 - this.field643[var63];
								this.method132(var63);
								this.field541 = true;
							}
						}
						if (var4 == 1870) {
							class67 var64 = class67.method526(var5);
							class27 var65 = class27.method329(var3);
							String var66;
							if (var65 != null && var65.field909[var2] >= 100000) {
								var66 = var65.field909[var2] + " x " + var64.field1533;
							} else if (var64.field1528 == null) {
								var66 = "It's a " + var64.field1533 + ".";
							} else {
								var66 = new String(var64.field1528);
							}
							this.method126(0, var66, "");
						}
						if (var4 == 256) {
							this.method101(var2, var5, var3);
							this.field623.method213(102);
							this.field623.method249(var2 + this.field609);
							this.field623.method250(var3 + this.field610);
							this.field623.method250(var5 >> 14 & 0x7FFF);
						}
						if (var4 == 588) {
							this.method101(var2, var5, var3);
							this.field623.method213(9);
							this.field623.method249(var3 + this.field610);
							this.field623.method250(var5 >> 14 & 0x7FFF);
							this.field623.method251(var2 + this.field609);
						}
						if (var4 == 152) {
							if ((var2 & 0x3) == 0) {
								field526++;
							}
							if (field526 >= 129) {
								this.field623.method213(87);
								this.field623.method215(37562);
								field526 = 0;
							}
							this.field623.method213(176);
							this.field623.method215(var3);
							this.field623.method215(var2);
							this.field623.method215(var5);
							this.field500 = 0;
							this.field501 = var3;
							this.field502 = var2;
							this.field503 = 2;
							if (class27.method329(var3).field895 == this.field265) {
								this.field503 = 1;
							}
							if (class27.method329(var3).field895 == this.field499) {
								this.field503 = 3;
							}
						}
						if (var4 == 145) {
							class5 var67 = this.field564[var5];
							if (var67 != null) {
								this.method155(var67.field37[0], (byte) 6, var67.field38[0], 2, 1, field299.field38[0], false, 0, field299.field37[0], 0, 1, 0);
								this.field247 = super.field99;
								this.field248 = super.field100;
								this.field250 = 2;
								this.field249 = 0;
								field294 += var5;
								if (field294 >= 50) {
									this.field623.method213(164);
									this.field623.method217(3839761);
									field294 = 0;
								}
								this.field623.method213(54);
								this.field623.method250(var5);
							}
						}
						if (var4 == 1327) {
							int var68 = var5 >> 14 & 0x7FFF;
							class14 var69 = class14.method192(var68);
							String var70;
							if (var69.field689 == null) {
								var70 = "It's a " + var69.field729 + ".";
							} else {
								var70 = new String(var69.field689);
							}
							this.method126(0, var70, "");
						}
						if (var4 == 24) {
							class43 var71 = this.field231[var5];
							if (var71 != null) {
								this.method155(var71.field37[0], (byte) 6, var71.field38[0], 2, 1, field299.field38[0], false, 0, field299.field37[0], 0, 1, 0);
								this.field247 = super.field99;
								this.field248 = super.field100;
								this.field250 = 2;
								this.field249 = 0;
								this.field623.method213(76);
								this.field623.method251(var5);
							}
						}
						if (var4 == 851) {
							class43 var72 = this.field231[var5];
							if (var72 != null) {
								this.method155(var72.field37[0], (byte) 6, var72.field38[0], 2, 1, field299.field38[0], false, 0, field299.field37[0], 0, 1, 0);
								this.field247 = super.field99;
								this.field248 = super.field100;
								this.field250 = 2;
								this.field249 = 0;
								if ((var5 & 0x3) == 0) {
									field279++;
								}
								if (field279 >= 111) {
									this.field623.method213(199);
									this.field623.method218(0);
									field279 = 0;
								}
								this.field623.method213(37);
								this.field623.method215(var5);
							}
						}
						if (var4 == 395) {
							this.field623.method213(137);
							this.field623.method249(var3);
							this.field623.method215(this.field547);
							this.field623.method249(this.field548);
							this.field623.method250(this.field546);
							this.field623.method250(var2);
							this.field623.method249(var5);
							this.field500 = 0;
							this.field501 = var3;
							this.field502 = var2;
							this.field503 = 2;
							if (class27.method329(var3).field895 == this.field265) {
								this.field503 = 1;
							}
							if (class27.method329(var3).field895 == this.field499) {
								this.field503 = 3;
							}
						}
						if (var4 == 181) {
							this.field623.method213(140);
							this.field623.method249(var2);
							this.field623.method250(var3);
							this.field623.method251(var5);
							this.field500 = 0;
							this.field501 = var3;
							this.field502 = var2;
							this.field503 = 2;
							if (class27.method329(var3).field895 == this.field265) {
								this.field503 = 1;
							}
							if (class27.method329(var3).field895 == this.field499) {
								this.field503 = 3;
							}
						}
						this.field545 = 0;
						this.field636 = 0;
						this.field541 = true;
					}
				}
			}
		} catch (RuntimeException var74) {
			signlink.reporterror("34192, " + arg0 + ", " + -44 + ", " + var74.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.c(III)Z")
	public boolean method52(int arg0, int arg1) {
		try {
			boolean var3 = false;
			class27 var4 = class27.method329(arg0);
			for (int var5 = 0; var5 < var4.field911.length && var4.field911[var5] != -1; var5++) {
				class27 var6 = class27.method329(var4.field911[var5]);
				if (var6.field922 == 1) {
					var3 |= this.method52(var6.field914, arg1);
				}
				if (var6.field922 == 6 && (var6.field898 != -1 || var6.field899 != -1)) {
					boolean var7 = this.method45(var6);
					int var8;
					if (var7) {
						var8 = var6.field899;
					} else {
						var8 = var6.field898;
					}
					if (var8 != -1) {
						class41 var9 = class41.field1184[var8];
						var6.field959 += arg1;
						while (var6.field959 > var9.method413(var6.field948)) {
							var6.field959 -= var9.method413(var6.field948) + 1;
							var6.field948++;
							if (var6.field948 >= var9.field1185) {
								var6.field948 -= var9.field1189;
								if (var6.field948 < 0 || var6.field948 >= var9.field1185) {
									var6.field948 = 0;
								}
							}
							var3 = true;
						}
					}
				}
				if (var6.field922 == 6 && var6.field912 != 0) {
					int var10 = var6.field912 >> 16;
					int var11 = var6.field912 << 16 >> 16;
					int var12 = var10 * arg1;
					int var13 = var11 * arg1;
					var6.field950 = var6.field950 + var12 & 0x7FF;
					var6.field951 = var6.field951 + var13 & 0x7FF;
					var3 = true;
				}
			}
			return var3;
		} catch (RuntimeException var15) {
			signlink.reporterror("98044, " + arg0 + ", " + 1 + ", " + arg1 + ", " + var15.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.b(BI)V")
	public void method54(byte arg0, int arg1) {
		try {
			if (this.field506 == 7) {
				boolean var13 = false;
			} else {
				this.method17();
			}
			if (!field237) {
				for (int var3 = 0; var3 < this.field258.length; var3++) {
					int var4 = this.field258[var3];
					if (class21.field830[var4] >= arg1) {
						class19 var5 = class21.field824[var4];
						int var6 = var5.field800 * var5.field801 - 1;
						int var7 = var5.field800 * this.field447 * 2;
						byte[] var8 = var5.field798;
						byte[] var9 = this.field471;
						for (int var10 = 0; var10 <= var6; var10++) {
							var9[var10] = var8[var10 - var7 & var6];
						}
						var5.field798 = var9;
						this.field471 = var8;
						class21.method287(var4);
					}
				}
			}
		} catch (RuntimeException var12) {
			signlink.reporterror("18603, " + arg0 + ", " + arg1 + ", " + var12.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.a(IIIIZI)V")
	public void method55(int arg0, int arg1, int arg2, int arg3, int arg4) {
		try {
			this.field478.method270(arg3, this.field527, arg4);
			this.field479.method270(arg3, this.field527, arg4 + arg1 - 16);
			class26.method315(this.field360, arg3, 99, 16, arg1 - 32, arg4 + 16);
			int var6 = (arg1 - 32) * arg1 / arg2;
			if (var6 < 8) {
				var6 = 8;
			}
			int var7 = (arg1 - var6 - 32) * arg0 / (arg2 - arg1);
			class26.method315(this.field300, arg3, 99, 16, var6, arg4 + var7 + 16);
			class26.method320(arg3, this.field521, arg4 + var7 + 16, var6);
			class26.method320(arg3 + 1, this.field521, arg4 + var7 + 16, var6);
			class26.method318(16, arg4 + var7 + 16, arg3, this.field521);
			class26.method318(16, arg4 + var7 + 17, arg3, this.field521);
			class26.method320(arg3 + 15, this.field292, arg4 + var7 + 16, var6);
			class26.method320(arg3 + 14, this.field292, arg4 + var7 + 17, var6 - 1);
			class26.method318(16, arg4 + var7 + var6 + 15, arg3, this.field292);
			class26.method318(15, arg4 + var7 + var6 + 14, arg3 + 1, this.field292);
		} catch (RuntimeException var9) {
			signlink.reporterror("96836, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + false + ", " + arg4 + ", " + var9.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.a(BLIRYXZZFE;)Z")
	public boolean method56(class27 arg0) {
		try {
			int var2 = arg0.field891;
			if (this.field174 == 2) {
				if (var2 == 201) {
					this.field642 = true;
					this.field630 = 0;
					this.field614 = true;
					this.field244 = "";
					this.field516 = 1;
					this.field648 = "Enter name of friend to add to list";
				}
				if (var2 == 202) {
					this.field642 = true;
					this.field630 = 0;
					this.field614 = true;
					this.field244 = "";
					this.field516 = 2;
					this.field648 = "Enter name of friend to delete from list";
				}
			}
			if (var2 == 205) {
				this.field437 = 250;
				return true;
			}
			if (var2 == 501) {
				this.field642 = true;
				this.field630 = 0;
				this.field614 = true;
				this.field244 = "";
				this.field516 = 4;
				this.field648 = "Enter name of player to add to list";
			}
			if (var2 == 502) {
				this.field642 = true;
				this.field630 = 0;
				this.field614 = true;
				this.field244 = "";
				this.field516 = 5;
				this.field648 = "Enter name of player to delete from list";
			}
			if (var2 >= 300 && var2 <= 313) {
				int var3 = (var2 - 300) / 2;
				int var4 = var2 & 0x1;
				int var5 = this.field389[var3];
				if (var5 != -1) {
					while (true) {
						if (var4 == 0) {
							var5--;
							if (var5 < 0) {
								var5 = class54.field1356 - 1;
							}
						}
						if (var4 == 1) {
							var5++;
							if (var5 >= class54.field1356) {
								var5 = 0;
							}
						}
						if (!class54.field1357[var5].field1363 && class54.field1357[var5].field1358 == var3 + (this.field613 ? 0 : 7)) {
							this.field389[var3] = var5;
							this.field257 = true;
							break;
						}
					}
				}
			}
			if (var2 >= 314 && var2 <= 323) {
				int var6 = (var2 - 314) / 2;
				int var7 = var2 & 0x1;
				int var8 = this.field646[var6];
				if (var7 == 0) {
					var8--;
					if (var8 < 0) {
						var8 = field457[var6].length - 1;
					}
				}
				if (var7 == 1) {
					var8++;
					if (var8 >= field457[var6].length) {
						var8 = 0;
					}
				}
				this.field646[var6] = var8;
				this.field257 = true;
			}
			if (var2 == 324 && !this.field613) {
				this.field613 = true;
				this.method80();
			}
			if (var2 == 325 && this.field613) {
				this.field613 = false;
				this.method80();
			}
			if (var2 == 326) {
				this.field623.method213(205);
				this.field623.method214(this.field613 ? 0 : 1);
				for (int var9 = 0; var9 < 7; var9++) {
					this.field623.method214(this.field389[var9]);
				}
				for (int var10 = 0; var10 < 5; var10++) {
					this.field623.method214(this.field646[var10]);
				}
				return true;
			}
			if (var2 == 620) {
				this.field487 = !this.field487;
			}
			if (var2 >= 601 && var2 <= 613) {
				this.method88();
				if (this.field597.length() > 0) {
					this.field623.method213(3);
					this.field623.method220(class33.method366(this.field597));
					this.field623.method214(var2 - 601);
					this.field623.method214(this.field487 ? 1 : 0);
				}
			}
			return false;
		} catch (RuntimeException var12) {
			signlink.reporterror("88209, " + 53 + ", " + arg0 + ", " + var12.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.a(ZJ)V")
	public void method57(long arg0) {
		try {
			if (arg0 != 0L) {
				if (this.field225 >= 100) {
					this.method126(0, "Your ignore list is full. Max of 100 hit", "");
				} else {
					String var3 = class33.method370(class33.method367(arg0));
					for (int var4 = 0; var4 < this.field225; var4++) {
						if (this.field577[var4] == arg0) {
							this.method126(0, var3 + " is already on your ignore list", "");
							return;
						}
					}
					for (int var5 = 0; var5 < this.field173; var5++) {
						if (this.field518[var5] == arg0) {
							this.method126(0, "Please remove " + var3 + " from your friend list first", "");
							return;
						}
					}
					this.field577[this.field225++] = arg0;
					this.field541 = true;
					this.field623.method213(71);
					this.field623.method220(arg0);
				}
			}
		} catch (RuntimeException var7) {
			signlink.reporterror("37193, " + false + ", " + arg0 + ", " + var7.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.g(I)Ljava/lang/String;")
	public String method58(int arg0) {
		try {
			boolean var4 = false;
			if (signlink.mainapp == null) {
				return super.field87 == null ? super.getDocumentBase().getHost().toLowerCase() : "runescape.com";
			} else {
				return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
			}
		} catch (RuntimeException var3) {
			signlink.reporterror("4597, " + arg0 + ", " + var3.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.h(I)Z")
	public boolean method59() {
		try {
			if (this.field579 == null) {
				return false;
			}
			try {
				int var1 = this.field579.method3();
				if (var1 == 0) {
					return false;
				}
				if (this.field434 == -1) {
					this.field579.method4(this.field222.field778, 0, 1);
					this.field434 = this.field222.field778[0] & 0xFF;
					if (this.field625 != null) {
						this.field434 = this.field434 - this.field625.method580() & 0xFF;
					}
					this.field433 = class45.field1246[this.field434];
					var1--;
				}
				if (this.field433 == -1) {
					if (var1 <= 0) {
						return false;
					}
					this.field579.method4(this.field222.field778, 0, 1);
					this.field433 = this.field222.field778[0] & 0xFF;
					var1--;
				}
				if (this.field433 == -2) {
					if (var1 <= 1) {
						return false;
					}
					this.field579.method4(this.field222.field778, 0, 2);
					this.field222.field779 = 0;
					this.field433 = this.field222.method226();
					var1 -= 2;
				}
				if (var1 < this.field433) {
					return false;
				}
				this.field222.field779 = 0;
				this.field579.method4(this.field222.field778, 0, this.field433);
				this.field435 = 0;
				this.field229 = this.field228;
				this.field228 = this.field227;
				this.field227 = this.field434;
				if (this.field434 == 46) {
					int var2 = this.field222.method226();
					int var3 = this.field222.method252();
					int var4 = var2 >> 10 & 0x1F;
					int var5 = var2 >> 5 & 0x1F;
					int var6 = var2 & 0x1F;
					class27.method329(var3).field892 = (var4 << 19) + (var5 << 11) + (var6 << 3);
					this.field434 = -1;
					return true;
				}
				if (this.field434 == 152 || this.field434 == 20) {
					int var7 = this.field472;
					int var8 = this.field473;
					if (this.field434 == 152) {
						var8 = this.field222.method254();
						var7 = this.field222.method254();
						this.field509 = false;
					}
					if (this.field434 == 20) {
						this.field222.method234();
						int var9 = 0;
						while (true) {
							if (var9 >= 4) {
								this.field222.method236();
								var7 = this.field222.method226();
								var8 = this.field222.method252();
								this.field509 = true;
								break;
							}
							for (int var10 = 0; var10 < 13; var10++) {
								for (int var11 = 0; var11 < 13; var11++) {
									int var12 = this.field222.method235(1);
									if (var12 == 1) {
										this.field494[var9][var10][var11] = this.field222.method235(26);
									} else {
										this.field494[var9][var10][var11] = -1;
									}
								}
							}
							var9++;
						}
					}
					if (this.field472 == var7 && this.field473 == var8 && this.field179 == 2) {
						this.field434 = -1;
						return true;
					}
					this.field472 = var7;
					this.field473 = var8;
					this.field609 = (this.field472 - 6) * 8;
					this.field610 = (this.field473 - 6) * 8;
					this.field628 = false;
					if ((this.field472 / 8 == 48 || this.field472 / 8 == 49) && this.field473 / 8 == 48) {
						this.field628 = true;
					}
					if (this.field472 / 8 == 48 && this.field473 / 8 == 148) {
						this.field628 = true;
					}
					this.field179 = 1;
					this.field240 = System.currentTimeMillis();
					this.method72(this.field607, "Loading - please wait.", null);
					if (this.field434 == 152) {
						int var13 = 0;
						int var14 = (this.field472 - 6) / 8;
						label1241: while (true) {
							if (var14 > (this.field472 + 6) / 8) {
								this.field416 = new byte[var13][];
								this.field305 = new byte[var13][];
								this.field189 = new int[var13];
								this.field190 = new int[var13];
								this.field191 = new int[var13];
								int var16 = 0;
								int var17 = (this.field472 - 6) / 8;
								while (true) {
									if (var17 > (this.field472 + 6) / 8) {
										break label1241;
									}
									for (int var18 = (this.field473 - 6) / 8; var18 <= (this.field473 + 6) / 8; var18++) {
										this.field189[var16] = (var17 << 8) + var18;
										if (this.field628 && (var18 == 49 || var18 == 149 || var18 == 147 || var17 == 50 || var17 == 49 && var18 == 47)) {
											this.field190[var16] = -1;
											this.field191[var16] = -1;
											var16++;
										} else {
											int var19 = this.field190[var16] = this.field602.method601(var18, var17, 0);
											if (var19 != -1) {
												this.field602.method585(3, var19);
											}
											int var20 = this.field191[var16] = this.field602.method601(var18, var17, 1);
											if (var20 != -1) {
												this.field602.method585(3, var20);
											}
											var16++;
										}
									}
									var17++;
								}
							}
							for (int var15 = (this.field473 - 6) / 8; var15 <= (this.field473 + 6) / 8; var15++) {
								var13++;
							}
							var14++;
						}
					}
					if (this.field434 == 20) {
						int var21 = 0;
						int[] var22 = new int[676];
						int var23 = 0;
						label1200: while (true) {
							if (var23 >= 4) {
								this.field416 = new byte[var21][];
								this.field305 = new byte[var21][];
								this.field189 = new int[var21];
								this.field190 = new int[var21];
								this.field191 = new int[var21];
								int var31 = 0;
								while (true) {
									if (var31 >= var21) {
										break label1200;
									}
									int var32 = this.field189[var31] = var22[var31];
									int var33 = var32 >> 8 & 0xFF;
									int var34 = var32 & 0xFF;
									int var35 = this.field190[var31] = this.field602.method601(var34, var33, 0);
									if (var35 != -1) {
										this.field602.method585(3, var35);
									}
									int var36 = this.field191[var31] = this.field602.method601(var34, var33, 1);
									if (var36 != -1) {
										this.field602.method585(3, var36);
									}
									var31++;
								}
							}
							for (int var24 = 0; var24 < 13; var24++) {
								for (int var25 = 0; var25 < 13; var25++) {
									int var26 = this.field494[var23][var24][var25];
									if (var26 != -1) {
										int var27 = var26 >> 14 & 0x3FF;
										int var28 = var26 >> 3 & 0x7FF;
										int var29 = (var27 / 8 << 8) + var28 / 8;
										for (int var30 = 0; var30 < var21; var30++) {
											if (var22[var30] == var29) {
												var29 = -1;
												break;
											}
										}
										if (var29 != -1) {
											var22[var21++] = var29;
										}
									}
								}
							}
							var23++;
						}
					}
					int var37 = this.field609 - this.field611;
					int var38 = this.field610 - this.field612;
					this.field611 = this.field609;
					this.field612 = this.field610;
					for (int var39 = 0; var39 < 16384; var39++) {
						class43 var40 = this.field231[var39];
						if (var40 != null) {
							for (int var41 = 0; var41 < 10; var41++) {
								var40.field37[var41] -= var37;
								var40.field38[var41] -= var38;
							}
							var40.field67 -= var37 * 128;
							var40.field68 -= var38 * 128;
						}
					}
					for (int var42 = 0; var42 < this.field562; var42++) {
						class5 var43 = this.field564[var42];
						if (var43 != null) {
							for (int var44 = 0; var44 < 10; var44++) {
								var43.field37[var44] -= var37;
								var43.field38[var44] -= var38;
							}
							var43.field67 -= var37 * 128;
							var43.field68 -= var38 * 128;
						}
					}
					this.field266 = true;
					byte var45 = 0;
					byte var46 = 104;
					byte var47 = 1;
					if (var37 < 0) {
						var45 = 103;
						var46 = -1;
						var47 = -1;
					}
					byte var48 = 0;
					byte var49 = 104;
					byte var50 = 1;
					if (var38 < 0) {
						var48 = 103;
						var49 = -1;
						var50 = -1;
					}
					for (int var51 = var45; var51 != var46; var51 += var47) {
						for (int var52 = var48; var52 != var49; var52 += var50) {
							int var53 = var51 + var37;
							int var54 = var52 + var38;
							for (int var55 = 0; var55 < 4; var55++) {
								if (var53 >= 0 && var54 >= 0 && var53 < 104 && var54 < 104) {
									this.field406[var55][var51][var52] = this.field406[var55][var53][var54];
								} else {
									this.field406[var55][var51][var52] = null;
								}
							}
						}
					}
					for (class23 var56 = (class23) this.field525.method275(); var56 != null; var56 = (class23) this.field525.method277()) {
						var56.field854 -= var37;
						var56.field855 -= var38;
						if (var56.field854 < 0 || var56.field855 < 0 || var56.field854 >= 104 || var56.field855 >= 104) {
							var56.method334();
						}
					}
					if (this.field438 != 0) {
						this.field438 -= var37;
						this.field439 -= var38;
					}
					this.field295 = false;
					this.field434 = -1;
					return true;
				}
				if (this.field434 == 5) {
					this.method71();
					this.field434 = -1;
					return false;
				}
				if (this.field434 == 106) {
					int var57 = this.field222.method252();
					int var58 = this.field222.method226();
					int var59 = this.field222.method226();
					if (var57 == 65535) {
						class27.method329(var58).field924 = 0;
						this.field434 = -1;
						return true;
					}
					class67 var60 = class67.method526(var57);
					class27.method329(var58).field924 = 4;
					class27.method329(var58).field925 = var57;
					class27.method329(var58).field950 = var60.field1531;
					class27.method329(var58).field951 = var60.field1511;
					class27.method329(var58).field949 = var60.field1515 * 100 / var59;
					this.field434 = -1;
					return true;
				}
				if (this.field434 == 53) {
					int var61 = this.field222.method254();
					int var62 = this.field222.method252();
					class27.method329(var62).field924 = 2;
					class27.method329(var62).field925 = var61;
					this.field434 = -1;
					return true;
				}
				if (this.field434 == 192) {
					for (int var63 = 0; var63 < this.field643.length; var63++) {
						if (this.field643[var63] != this.field312[var63]) {
							this.field643[var63] = this.field312[var63];
							this.method132(var63);
							this.field541 = true;
						}
					}
					this.field434 = -1;
					return true;
				}
				if (this.field434 == 16) {
					this.field485 = this.field222.method243();
					this.field484 = this.field222.method245();
					while (this.field222.field779 < this.field433) {
						int var64 = this.field222.method224();
						this.method131(398, var64, this.field222);
					}
					this.field434 = -1;
					return true;
				}
				if (this.field434 == 128) {
					this.field541 = true;
					int var65 = this.field222.method259();
					int var66 = this.field222.method243();
					int var67 = this.field222.method245();
					this.field213[var67] = var65;
					this.field601[var67] = var66;
					this.field641[var67] = 1;
					for (int var68 = 0; var68 < 98; var68++) {
						if (var65 >= field647[var68]) {
							this.field641[var67] = var68 + 2;
						}
					}
					this.field434 = -1;
					return true;
				}
				if (this.field434 == 205) {
					this.field352 = this.field222.method259();
					this.field504 = this.field222.method226();
					this.field510 = this.field222.method252();
					this.field251 = this.field222.method226();
					this.field221 = this.field222.method254();
					this.field344 = this.field222.method243();
					this.field402 = this.field222.method252();
					this.field376 = this.field222.method226();
					this.field224 = this.field222.method254();
					this.field413 = this.field222.method253();
					this.field285 = this.field222.method226();
					signlink.dnslookup(class33.method369(this.field352));
					this.field434 = -1;
					return true;
				}
				if (this.field434 == 125) {
					this.field365 = this.field222.method243();
					this.field541 = true;
					this.field264 = true;
					this.field434 = -1;
					return true;
				}
				if (this.field434 == 14) {
					int var69 = this.field222.method226();
					this.method93(var69);
					if (this.field519 != -1) {
						this.method146(this.field519);
						this.field519 = -1;
						this.field541 = true;
						this.field264 = true;
					}
					if (this.field499 != -1) {
						this.method146(this.field499);
						this.field499 = -1;
						this.field642 = true;
					}
					if (this.field631 != -1) {
						this.method146(this.field631);
						this.field631 = -1;
						this.field399 = true;
					}
					if (this.field275 != -1) {
						this.method146(this.field275);
						this.field275 = -1;
					}
					if (this.field265 != var69) {
						this.method146(this.field265);
						this.field265 = var69;
					}
					if (this.field630 != 0) {
						this.field630 = 0;
						this.field642 = true;
					}
					this.field446 = false;
					this.field434 = -1;
					return true;
				}
				if (this.field434 == 129) {
					this.field533 = this.field222.method224();
					if (this.field533 == this.field365) {
						if (this.field533 == 3) {
							this.field365 = 1;
						} else {
							this.field365 = 3;
						}
						this.field541 = true;
					}
					this.field434 = -1;
					return true;
				}
				if (this.field434 == 136) {
					boolean var70 = this.field222.method245() == 1;
					int var71 = this.field222.method226();
					class27.method329(var71).field917 = var70;
					this.field434 = -1;
					return true;
				}
				if (this.field434 == 15) {
					int var72 = this.field222.method226();
					int var73 = this.field222.method253();
					this.method93(var72);
					if (var73 != -1) {
						this.method93(var73);
					}
					if (this.field265 != -1) {
						this.method146(this.field265);
						this.field265 = -1;
					}
					if (this.field519 != -1) {
						this.method146(this.field519);
						this.field519 = -1;
					}
					if (this.field499 != -1) {
						this.method146(this.field499);
						this.field499 = -1;
					}
					if (this.field631 != var72) {
						this.method146(this.field631);
						this.field631 = var72;
					}
					if (this.field275 != var72) {
						this.method146(this.field275);
						this.field275 = var73;
					}
					this.field630 = 0;
					this.field446 = false;
					this.field434 = -1;
					return true;
				}
				if (this.field434 == 104) {
					int var74 = this.field222.method226();
					int var75 = this.field222.method224();
					int var76 = this.field222.method226();
					if (this.field282 && !field237 && this.field615 < 50) {
						this.field555[this.field615] = var74;
						this.field303[this.field615] = var75;
						this.field267[this.field615] = var76 + class22.field839[var74];
						this.field615++;
					}
					this.field434 = -1;
					return true;
				}
				if (this.field434 == 181) {
					this.field295 = true;
					this.field367 = this.field222.method224();
					this.field368 = this.field222.method224();
					this.field369 = this.field222.method226();
					this.field370 = this.field222.method224();
					this.field371 = this.field222.method224();
					if (this.field371 >= 100) {
						this.field184 = this.field367 * 128 + 64;
						this.field186 = this.field368 * 128 + 64;
						this.field185 = this.method129(this.field184, this.field186, this.field180) - this.field369;
					}
					this.field434 = -1;
					return true;
				}
				if (this.field434 == 56) {
					int var77 = this.field222.method253();
					int var78 = this.field222.method252();
					int var79 = this.field222.method226();
					int var80 = this.field222.method254();
					class27.method329(var79).field950 = var78;
					class27.method329(var79).field951 = var77;
					class27.method329(var79).field949 = var80;
					this.field434 = -1;
					return true;
				}
				if (this.field434 == 40 || this.field434 == 2 || this.field434 == 255 || this.field434 == 65 || this.field434 == 175 || this.field434 == 146 || this.field434 == 121 || this.field434 == 250 || this.field434 == 126 || this.field434 == 164 || this.field434 == 198) {
					this.method131(398, this.field434, this.field222);
					this.field434 = -1;
					return true;
				}
				if (this.field434 == 158) {
					int var81 = this.field222.method226();
					int var82 = this.field222.method254();
					int var83 = this.field222.method252();
					class27.method329(var81).field912 = (var83 << 16) + var82;
					this.field434 = -1;
					return true;
				}
				if (this.field434 == 114) {
					this.field614 = false;
					this.field630 = 1;
					this.field195 = "";
					this.field642 = true;
					this.field434 = -1;
					return true;
				}
				if (this.field434 == 251) {
					this.field556 = this.field222.method252();
					this.field403 = this.field222.method245();
					this.field434 = -1;
					return true;
				}
				if (this.field434 == 150) {
					byte var84 = this.field222.method225();
					int var85 = this.field222.method226();
					this.field312[var85] = var84;
					if (this.field643[var85] != var84) {
						this.field643[var85] = var84;
						this.method132(var85);
						this.field541 = true;
						if (this.field629 != -1) {
							this.field642 = true;
						}
					}
					this.field434 = -1;
					return true;
				}
				if (this.field434 == 216) {
					int var86 = this.field222.method224();
					int var87 = this.field222.method245();
					String var88 = this.field222.method231();
					if (var86 >= 1 && var86 <= 5) {
						if (var88.equalsIgnoreCase("null")) {
							var88 = null;
						}
						this.field595[var86 - 1] = var88;
						this.field596[var86 - 1] = var87 == 0;
					}
					this.field434 = -1;
					return true;
				}
				if (this.field434 == 179) {
					if (this.field365 == 12) {
						this.field541 = true;
					}
					this.field171 = this.field222.method227();
					this.field434 = -1;
					return true;
				}
				if (this.field434 == 35) {
					int var89 = this.field222.method253();
					int var90 = this.field222.method226();
					class27 var91 = class27.method329(var90);
					if (var91 != null && var91.field922 == 0) {
						if (var89 < 0) {
							var89 = 0;
						}
						if (var89 > var91.field921 - var91.field910) {
							var89 = var91.field921 - var91.field910;
						}
						var91.field928 = var89;
					}
					this.field434 = -1;
					return true;
				}
				if (this.field434 == 137) {
					this.field295 = false;
					for (int var92 = 0; var92 < 5; var92++) {
						this.field345[var92] = false;
					}
					this.field434 = -1;
					return true;
				}
				if (this.field434 == 124) {
					this.field614 = false;
					this.field630 = 2;
					this.field195 = "";
					this.field642 = true;
					this.field434 = -1;
					return true;
				}
				if (this.field434 == 253) {
					if (this.field519 != -1) {
						this.method146(this.field519);
						this.field519 = -1;
						this.field541 = true;
						this.field264 = true;
					}
					if (this.field499 != -1) {
						this.method146(this.field499);
						this.field499 = -1;
						this.field642 = true;
					}
					if (this.field631 != -1) {
						this.method146(this.field631);
						this.field631 = -1;
						this.field399 = true;
					}
					if (this.field275 != -1) {
						this.method146(this.field275);
						this.field275 = -1;
					}
					if (this.field265 != -1) {
						this.method146(this.field265);
						this.field265 = -1;
					}
					if (this.field630 != 0) {
						this.field630 = 0;
						this.field642 = true;
					}
					this.field446 = false;
					this.field434 = -1;
					return true;
				}
				if (this.field434 == 100) {
					this.field618 = this.field222.method224();
					this.field434 = -1;
					return true;
				}
				if (this.field434 == 241) {
					this.field484 = this.field222.method244();
					this.field485 = this.field222.method244();
					for (int var93 = this.field484; var93 < this.field484 + 8; var93++) {
						for (int var94 = this.field485; var94 < this.field485 + 8; var94++) {
							if (this.field406[this.field180][var93][var94] != null) {
								this.field406[this.field180][var93][var94] = null;
								this.method133(var93, var94);
							}
						}
					}
					for (class23 var95 = (class23) this.field525.method275(); var95 != null; var95 = (class23) this.field525.method277()) {
						if (var95.field854 >= this.field484 && var95.field854 < this.field484 + 8 && var95.field855 >= this.field485 && var95.field855 < this.field485 + 8 && var95.field852 == this.field180) {
							var95.field851 = 0;
						}
					}
					this.field434 = -1;
					return true;
				}
				if (this.field434 == 172) {
					this.method69(this.field433, this.field222);
					this.field434 = -1;
					return true;
				}
				if (this.field434 == 219) {
					this.field594 = this.field222.method224();
					this.field434 = -1;
					return true;
				}
				if (this.field434 == 148) {
					this.field498 = this.field222.method224();
					this.field355 = this.field222.method224();
					this.field386 = this.field222.method224();
					this.field474 = true;
					this.field642 = true;
					this.field434 = -1;
					return true;
				}
				if (this.field434 == 49) {
					int var96 = this.field222.method243();
					int var97 = this.field222.method226();
					if (var97 == 65535) {
						var97 = -1;
					}
					if (this.field571[var96] != var97) {
						this.method146(this.field571[var96]);
						this.field571[var96] = var97;
					}
					this.field541 = true;
					this.field264 = true;
					this.field434 = -1;
					return true;
				}
				if (this.field434 == 52) {
					this.field438 = 0;
					this.field434 = -1;
					return true;
				}
				if (this.field434 == 223) {
					String var98 = this.field222.method231();
					int var99 = this.field222.method252();
					class27.method329(var99).field918 = var98;
					int var10001 = this.field571[this.field365];
					if (class27.method329(var99).field895 == var10001) {
						this.field541 = true;
					}
					this.field434 = -1;
					return true;
				}
				if (this.field434 == 206) {
					this.field541 = true;
					int var100 = this.field222.method226();
					class27 var101 = class27.method329(var100);
					int var102 = this.field222.method226();
					for (int var103 = 0; var103 < var102; var103++) {
						var101.field947[var103] = this.field222.method226();
						int var104 = this.field222.method243();
						if (var104 == 255) {
							var104 = this.field222.method229();
						}
						var101.field909[var103] = var104;
					}
					for (int var105 = var102; var105 < var101.field947.length; var105++) {
						var101.field947[var105] = 0;
						var101.field909[var105] = 0;
					}
					this.field434 = -1;
					return true;
				}
				if (this.field434 == 84) {
					int var106 = this.field222.method253();
					int var107 = this.field222.method226();
					class27.method329(var107).field924 = 1;
					class27.method329(var107).field925 = var106;
					this.field434 = -1;
					return true;
				}
				if (this.field434 == 96) {
					this.field295 = true;
					this.field585 = this.field222.method224();
					this.field586 = this.field222.method224();
					this.field587 = this.field222.method226();
					this.field588 = this.field222.method224();
					this.field589 = this.field222.method224();
					if (this.field589 >= 100) {
						int var108 = this.field585 * 128 + 64;
						int var109 = this.field586 * 128 + 64;
						int var110 = this.method129(var108, var109, this.field180) - this.field587;
						int var111 = var108 - this.field184;
						int var112 = var110 - this.field185;
						int var113 = var109 - this.field186;
						int var114 = (int) Math.sqrt((double) (var111 * var111 + var113 * var113));
						this.field187 = (int) (Math.atan2((double) var112, (double) var114) * 325.949D) & 0x7FF;
						this.field188 = (int) (Math.atan2((double) var111, (double) var113) * -325.949D) & 0x7FF;
						if (this.field187 < 128) {
							this.field187 = 128;
						}
						if (this.field187 > 383) {
							this.field187 = 383;
						}
					}
					this.field434 = -1;
					return true;
				}
				if (this.field434 == 86) {
					int var115 = this.field222.method224();
					int var116 = this.field222.method224();
					int var117 = this.field222.method224();
					int var118 = this.field222.method224();
					this.field345[var115] = true;
					this.field592[var115] = var116;
					this.field534[var115] = var117;
					this.field183[var115] = var118;
					this.field400[var115] = 0;
					this.field434 = -1;
					return true;
				}
				if (this.field434 == 32) {
					int var119 = this.field222.method226();
					int var120 = this.field222.method261(this.field326);
					this.field312[var119] = var120;
					if (this.field643[var119] != var120) {
						this.field643[var119] = var120;
						this.method132(var119);
						this.field541 = true;
						if (this.field629 != -1) {
							this.field642 = true;
						}
					}
					this.field434 = -1;
					return true;
				}
				if (this.field434 == 197) {
					long var121 = this.field222.method230();
					int var123 = this.field222.method224();
					String var124 = class33.method370(class33.method367(var121));
					for (int var125 = 0; var125 < this.field173; var125++) {
						if (var121 == this.field518[var125]) {
							if (this.field456[var125] != var123) {
								this.field456[var125] = var123;
								this.field541 = true;
								if (var123 > 0) {
									this.method126(5, var124 + " has logged in.", "");
								}
								if (var123 == 0) {
									this.method126(5, var124 + " has logged out.", "");
								}
							}
							var124 = null;
							break;
						}
					}
					if (var124 != null && this.field173 < 200) {
						this.field518[this.field173] = var121;
						this.field523[this.field173] = var124;
						this.field456[this.field173] = var123;
						this.field173++;
						this.field541 = true;
					}
					boolean var126 = false;
					while (!var126) {
						var126 = true;
						for (int var127 = 0; var127 < this.field173 - 1; var127++) {
							if (this.field456[var127] != field234 && this.field456[var127 + 1] == field234 || this.field456[var127] == 0 && this.field456[var127 + 1] != 0) {
								int var128 = this.field456[var127];
								this.field456[var127] = this.field456[var127 + 1];
								this.field456[var127 + 1] = var128;
								String var129 = this.field523[var127];
								this.field523[var127] = this.field523[var127 + 1];
								this.field523[var127 + 1] = var129;
								long var130 = this.field518[var127];
								this.field518[var127] = this.field518[var127 + 1];
								this.field518[var127 + 1] = var130;
								this.field541 = true;
								var126 = false;
							}
						}
					}
					this.field434 = -1;
					return true;
				}
				if (this.field434 == 71) {
					int var132 = this.field222.method252();
					this.method93(var132);
					if (this.field499 != -1) {
						this.method146(this.field499);
						this.field499 = -1;
						this.field642 = true;
					}
					if (this.field631 != -1) {
						this.method146(this.field631);
						this.field631 = -1;
						this.field399 = true;
					}
					if (this.field275 != -1) {
						this.method146(this.field275);
						this.field275 = -1;
					}
					if (this.field265 != -1) {
						this.method146(this.field265);
						this.field265 = -1;
					}
					if (this.field519 != var132) {
						this.method146(this.field519);
						this.field519 = var132;
					}
					if (this.field630 != 0) {
						this.field630 = 0;
						this.field642 = true;
					}
					this.field541 = true;
					this.field264 = true;
					this.field446 = false;
					this.field434 = -1;
					return true;
				}
				if (this.field434 == 229) {
					int var133 = this.field222.method226();
					if (var133 == 65535) {
						var133 = -1;
					}
					if (var133 != this.field223 && this.field379 && !field237 && this.field522 == 0) {
						this.field452 = var133;
						this.field453 = true;
						this.field602.method585(2, this.field452);
					}
					this.field223 = var133;
					this.field434 = -1;
					return true;
				}
				if (this.field434 == 22) {
					int var134 = this.field222.method258();
					int var135 = this.field222.method252();
					if (this.field379 && !field237) {
						this.field452 = var135;
						this.field453 = false;
						this.field602.method585(2, this.field452);
						this.field522 = var134;
					}
					this.field434 = -1;
					return true;
				}
				if (this.field434 == 66) {
					int var136 = this.field222.method226();
					class27 var137 = class27.method329(var136);
					for (int var138 = 0; var138 < var137.field947.length; var138++) {
						var137.field947[var138] = -1;
						var137.field947[var138] = 0;
					}
					this.field434 = -1;
					return true;
				}
				if (this.field434 == 165) {
					if (this.field365 == 12) {
						this.field541 = true;
					}
					this.field239 = this.field222.method224();
					this.field434 = -1;
					return true;
				}
				if (this.field434 == 118) {
					int var139 = this.field222.method253();
					this.method93(var139);
					if (this.field519 != -1) {
						this.method146(this.field519);
						this.field519 = -1;
						this.field541 = true;
						this.field264 = true;
					}
					if (this.field631 != -1) {
						this.method146(this.field631);
						this.field631 = -1;
						this.field399 = true;
					}
					if (this.field275 != -1) {
						this.method146(this.field275);
						this.field275 = -1;
					}
					if (this.field265 != -1) {
						this.method146(this.field265);
						this.field265 = -1;
					}
					if (this.field499 != var139) {
						this.method146(this.field499);
						this.field499 = var139;
					}
					this.field446 = false;
					this.field642 = true;
					this.field434 = -1;
					return true;
				}
				if (this.field434 == 168) {
					for (int var140 = 0; var140 < this.field564.length; var140++) {
						if (this.field564[var140] != null) {
							this.field564[var140].field47 = -1;
						}
					}
					for (int var141 = 0; var141 < this.field231.length; var141++) {
						if (this.field231[var141] != null) {
							this.field231[var141].field47 = -1;
						}
					}
					this.field434 = -1;
					return true;
				}
				if (this.field434 == 25) {
					this.field174 = this.field222.method224();
					this.field541 = true;
					this.field434 = -1;
					return true;
				}
				if (this.field434 == 242) {
					String var142 = this.field222.method231();
					if (var142.endsWith(":tradereq:")) {
						String var143 = var142.substring(0, var142.indexOf(":"));
						long var144 = class33.method366(var143);
						boolean var146 = false;
						for (int var147 = 0; var147 < this.field225; var147++) {
							if (this.field577[var147] == var144) {
								var146 = true;
								break;
							}
						}
						if (!var146 && this.field640 == 0) {
							this.method126(4, "wishes to trade with you.", var143);
						}
					} else if (var142.endsWith(":duelreq:")) {
						String var148 = var142.substring(0, var142.indexOf(":"));
						long var149 = class33.method366(var148);
						boolean var151 = false;
						for (int var152 = 0; var152 < this.field225; var152++) {
							if (this.field577[var152] == var149) {
								var151 = true;
								break;
							}
						}
						if (!var151 && this.field640 == 0) {
							this.method126(8, "wishes to duel with you.", var148);
						}
					} else if (var142.endsWith(":chalreq:")) {
						String var153 = var142.substring(0, var142.indexOf(":"));
						long var154 = class33.method366(var153);
						boolean var156 = false;
						for (int var157 = 0; var157 < this.field225; var157++) {
							if (this.field577[var157] == var154) {
								var156 = true;
								break;
							}
						}
						if (!var156 && this.field640 == 0) {
							String var158 = var142.substring(var142.indexOf(":") + 1, var142.length() - 9);
							this.method126(8, var158, var153);
						}
					} else {
						this.method126(0, var142, "");
					}
					this.field434 = -1;
					return true;
				}
				if (this.field434 == 62) {
					int var159 = this.field222.method226();
					int var160 = this.field222.method253();
					if (this.field499 != -1) {
						this.method146(this.field499);
						this.field499 = -1;
						this.field642 = true;
					}
					if (this.field631 != -1) {
						this.method146(this.field631);
						this.field631 = -1;
						this.field399 = true;
					}
					if (this.field275 != -1) {
						this.method146(this.field275);
						this.field275 = -1;
					}
					if (this.field265 != var160) {
						this.method146(this.field265);
						this.field265 = var160;
					}
					if (this.field519 != var159) {
						this.method146(this.field519);
						this.field519 = var159;
					}
					if (this.field630 != 0) {
						this.field630 = 0;
						this.field642 = true;
					}
					this.field541 = true;
					this.field264 = true;
					this.field446 = false;
					this.field434 = -1;
					return true;
				}
				if (this.field434 == 190) {
					this.field470 = this.field222.method254() * 30;
					this.field434 = -1;
					return true;
				}
				if (this.field434 == 30) {
					int var161 = this.field222.method253();
					class27.method329(var161).field924 = 3;
					if (field299.field127 == null) {
						class27.method329(var161).field925 = (field299.field112[0] << 25) + (field299.field112[4] << 20) + (field299.field122[0] << 15) + (field299.field122[8] << 10) + (field299.field122[11] << 5) + field299.field122[1];
					} else {
						class27.method329(var161).field925 = (int) (field299.field127.field1122 + 305419896L);
					}
					this.field434 = -1;
					return true;
				}
				if (this.field434 == 144) {
					int var162 = this.field222.method255();
					if (var162 != this.field629) {
						this.method146(this.field629);
						this.field629 = var162;
					}
					this.field642 = true;
					this.field434 = -1;
					return true;
				}
				if (this.field434 == 60) {
					int var163 = this.field222.method256();
					if (var163 >= 0) {
						this.method93(var163);
					}
					if (var163 != this.field378) {
						this.method146(this.field378);
						this.field378 = var163;
					}
					this.field434 = -1;
					return true;
				}
				if (this.field434 == 58) {
					this.field225 = this.field433 / 8;
					for (int var164 = 0; var164 < this.field225; var164++) {
						this.field577[var164] = this.field222.method230();
					}
					this.field434 = -1;
					return true;
				}
				if (this.field434 == 37) {
					this.method92(this.field222, this.field433);
					this.field266 = false;
					this.field434 = -1;
					return true;
				}
				if (this.field434 == 64) {
					int var165 = this.field222.method226();
					int var166 = this.field222.method255();
					int var167 = this.field222.method257();
					class27 var168 = class27.method329(var165);
					var168.field937 = var166;
					var168.field907 = var167;
					this.field434 = -1;
					return true;
				}
				if (this.field434 == 153) {
					this.field281 = this.field222.method224();
					if (this.field281 == 1) {
						this.field570 = this.field222.method226();
					}
					if (this.field281 >= 2 && this.field281 <= 6) {
						if (this.field281 == 2) {
							this.field167 = 64;
							this.field168 = 64;
						}
						if (this.field281 == 3) {
							this.field167 = 0;
							this.field168 = 64;
						}
						if (this.field281 == 4) {
							this.field167 = 128;
							this.field168 = 64;
						}
						if (this.field281 == 5) {
							this.field167 = 64;
							this.field168 = 0;
						}
						if (this.field281 == 6) {
							this.field167 = 64;
							this.field168 = 128;
						}
						this.field281 = 2;
						this.field164 = this.field222.method226();
						this.field165 = this.field222.method226();
						this.field166 = this.field222.method224();
					}
					if (this.field281 == 10) {
						this.field245 = this.field222.method226();
					}
					this.field434 = -1;
					return true;
				}
				if (this.field434 == 1) {
					int var169 = this.field222.method255();
					int var170 = this.field222.method252();
					class27 var171 = class27.method329(var170);
					if (var171.field898 != var169 || var169 == -1) {
						var171.field898 = var169;
						var171.field948 = 0;
						var171.field959 = 0;
					}
					this.field434 = -1;
					return true;
				}
				if (this.field434 == 243) {
					this.field485 = this.field222.method224();
					this.field484 = this.field222.method243();
					this.field434 = -1;
					return true;
				}
				if (this.field434 == 176) {
					long var172 = this.field222.method230();
					int var174 = this.field222.method229();
					int var175 = this.field222.method224();
					boolean var176 = false;
					for (int var177 = 0; var177 < 100; var177++) {
						if (this.field339[var177] == var174) {
							var176 = true;
							break;
						}
					}
					if (var175 <= 1) {
						for (int var178 = 0; var178 < this.field225; var178++) {
							if (this.field577[var178] == var172) {
								var176 = true;
								break;
							}
						}
					}
					if (!var176 && this.field640 == 0) {
						try {
							this.field339[this.field497] = var174;
							this.field497 = (this.field497 + 1) % 100;
							String var179 = class39.method396(this.field222, this.field433 - 13);
							if (var175 != 3) {
								var179 = class65.method486(this.field552, var179);
							}
							if (var175 == 2 || var175 == 3) {
								this.method126(7, var179, "@cr2@" + class33.method370(class33.method367(var172)));
							} else if (var175 == 1) {
								this.method126(7, var179, "@cr1@" + class33.method370(class33.method367(var172)));
							} else {
								this.method126(3, var179, class33.method370(class33.method367(var172)));
							}
						} catch (Exception var190) {
							signlink.reporterror("cde1");
						}
					}
					this.field434 = -1;
					return true;
				}
				if (this.field434 == 89) {
					this.field541 = true;
					int var181 = this.field222.method226();
					class27 var182 = class27.method329(var181);
					while (this.field222.field779 < this.field433) {
						int var183 = this.field222.method238();
						int var184 = this.field222.method226();
						int var185 = this.field222.method224();
						if (var185 == 255) {
							var185 = this.field222.method229();
						}
						if (var183 >= 0 && var183 < var182.field947.length) {
							var182.field947[var183] = var184;
							var182.field909[var183] = var185;
						}
					}
					this.field434 = -1;
					return true;
				}
				signlink.reporterror("T1 - " + this.field434 + "," + this.field433 + " - " + this.field228 + "," + this.field229);
				this.method71();
			} catch (IOException var191) {
				this.method125();
			} catch (Exception var192) {
				String var187 = "T2 - " + this.field434 + "," + this.field228 + "," + this.field229 + " - " + this.field433 + "," + (this.field609 + field299.field37[0]) + "," + (this.field610 + field299.field38[0]) + " - ";
				for (int var188 = 0; var188 < this.field433 && var188 < 50; var188++) {
					var187 = var187 + this.field222.field778[var188] + ",";
				}
				signlink.reporterror(var187);
				this.method71();
			}
			return true;
		} catch (RuntimeException var193) {
			signlink.reporterror("43573, " + ", " + var193.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.i(I)V")
	public void method60() {
		try {
			this.field353 = false;
			while (this.field268) {
				this.field353 = false;
				try {
					Thread.sleep(50L);
				} catch (Exception var2) {
				}
			}
			this.field253 = null;
			this.field254 = null;
			this.field383 = null;
			this.field448 = null;
			this.field449 = null;
			this.field450 = null;
			this.field451 = null;
			this.field216 = null;
			this.field217 = null;
			this.field458 = null;
			this.field459 = null;
			this.field381 = null;
			this.field382 = null;
		} catch (RuntimeException var3) {
			signlink.reporterror("1444, " + 978 + ", " + var3.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.a(JZ)V")
	public void method61(long arg0) {
		try {
			if (arg0 != 0L) {
				for (int var3 = 0; var3 < this.field173; var3++) {
					if (this.field518[var3] == arg0) {
						this.field173--;
						this.field541 = true;
						for (int var4 = var3; var4 < this.field173; var4++) {
							this.field523[var4] = this.field523[var4 + 1];
							this.field456[var4] = this.field456[var4 + 1];
							this.field518[var4] = this.field518[var4 + 1];
						}
						this.field623.method213(223);
						this.field623.method220(arg0);
						return;
					}
				}
			}
		} catch (RuntimeException var6) {
			signlink.reporterror("72079, " + arg0 + ", " + true + ", " + var6.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.a(ILIRYXZZFE;IIIIIII)V")
	public void method62(class27 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		try {
			if (this.field492) {
				this.field442 = 32;
			} else {
				this.field442 = 0;
			}
			this.field492 = false;
			if (arg3 >= arg4 && arg3 < arg4 + 16 && arg5 >= arg7 && arg5 < arg7 + 16) {
				arg0.field928 -= this.field415 * 4;
				if (arg1 == 1) {
					this.field541 = true;
				}
				if (arg1 == 2 || arg1 == 3) {
					this.field642 = true;
				}
			} else if (arg3 >= arg4 && arg3 < arg4 + 16 && arg5 >= arg7 + arg6 - 16 && arg5 < arg7 + arg6) {
				arg0.field928 += this.field415 * 4;
				if (arg1 == 1) {
					this.field541 = true;
				}
				if (arg1 == 2 || arg1 == 3) {
					this.field642 = true;
				}
			} else if (arg3 >= arg4 - this.field442 && arg3 < arg4 + this.field442 + 16 && arg5 >= arg7 + 16 && arg5 < arg7 + arg6 - 16 && this.field415 > 0) {
				int var9 = (arg6 - 32) * arg6 / arg2;
				if (var9 < 8) {
					var9 = 8;
				}
				int var10 = arg5 - arg7 - var9 / 2 - 16;
				int var11 = arg6 - var9 - 32;
				arg0.field928 = (arg2 - arg6) * var10 / var11;
				if (arg1 == 1) {
					this.field541 = true;
				}
				if (arg1 == 2 || arg1 == 3) {
					this.field642 = true;
				}
				this.field492 = true;
			}
		} catch (RuntimeException var13) {
			signlink.reporterror("67196, " + 1456 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + var13.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.a(ZII)V")
	public void method63(boolean arg0, int arg1, int arg2) {
		try {
			if (arg1 != 0) {
				for (int var4 = 1; var4 > 0; var4++) {
				}
			}
			signlink.midivol = arg2;
			if (arg0) {
				signlink.midi = "voladjust";
			}
		} catch (RuntimeException var6) {
			signlink.reporterror("73005, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + var6.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.a(II[B)Z")
	public boolean method64(int arg0, byte[] arg1) {
		try {
			return arg1 == null ? true : signlink.wavesave(arg1, arg0);
		} catch (RuntimeException var4) {
			signlink.reporterror("99173, " + -275 + ", " + arg0 + ", " + arg1 + ", " + var4.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.a(ILFCRLGSQA;)V")
	public void method65(class19 arg0) {
		try {
			for (int var2 = 0; var2 < this.field216.length; var2++) {
				this.field216[var2] = 0;
			}
			for (int var3 = 0; var3 < 5000; var3++) {
				int var4 = (int) (Math.random() * 128.0D * (double) 256);
				this.field216[var4] = (int) (Math.random() * 256.0D);
			}
			for (int var5 = 0; var5 < 20; var5++) {
				for (int var6 = 1; var6 < 255; var6++) {
					for (int var7 = 1; var7 < 127; var7++) {
						int var8 = var7 + (var6 << 7);
						this.field217[var8] = (this.field216[var8 - 1] + this.field216[var8 + 1] + this.field216[var8 - 128] + this.field216[var8 + 128]) / 4;
					}
				}
				int[] var9 = this.field216;
				this.field216 = this.field217;
				this.field217 = var9;
			}
			if (arg0 != null) {
				int var10 = 0;
				for (int var11 = 0; var11 < arg0.field801; var11++) {
					for (int var12 = 0; var12 < arg0.field800; var12++) {
						if (arg0.field798[var10++] != 0) {
							int var13 = var12 + arg0.field802 + 16;
							int var14 = var11 + arg0.field803 + 16;
							int var15 = var13 + (var14 << 7);
							this.field216[var15] = 0;
						}
					}
				}
			}
		} catch (RuntimeException var17) {
			signlink.reporterror("2212, " + ", " + arg0 + ", " + var17.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.j(I)V")
	public void method66(int arg0) {
		try {
			int var2 = this.field424.method375("Choose Option");
			for (int var3 = 0; var3 < this.field412; var3++) {
				int var4 = this.field424.method375(this.field273[var3]);
				if (var4 > var2) {
					var2 = var4;
				}
			}
			var2 += 8;
			boolean var14 = false;
			int var5 = this.field412 * 15 + 21;
			if (super.field99 > 4 && super.field100 > 4 && super.field99 < 516 && super.field100 < 338) {
				int var6 = super.field99 - var2 / 2 - 4;
				if (var6 + var2 > 512) {
					var6 = 512 - var2;
				}
				if (var6 < 0) {
					var6 = 0;
				}
				int var7 = super.field100 - 4;
				if (var7 + var5 > 334) {
					var7 = 334 - var5;
				}
				if (var7 < 0) {
					var7 = 0;
				}
				this.field392 = true;
				this.field313 = 0;
				this.field314 = var6;
				this.field315 = var7;
				this.field316 = var2;
				this.field317 = this.field412 * 15 + 22;
			}
			if (super.field99 > 553 && super.field100 > 205 && super.field99 < 743 && super.field100 < 466) {
				int var8 = super.field99 - var2 / 2 - 553;
				if (var8 < 0) {
					var8 = 0;
				} else if (var8 + var2 > 190) {
					var8 = 190 - var2;
				}
				int var9 = super.field100 - 205;
				if (var9 < 0) {
					var9 = 0;
				} else if (var9 + var5 > 261) {
					var9 = 261 - var5;
				}
				this.field392 = true;
				this.field313 = 1;
				this.field314 = var8;
				this.field315 = var9;
				this.field316 = var2;
				this.field317 = this.field412 * 15 + 22;
			}
			if (super.field99 > 17 && super.field100 > 357 && super.field99 < 496 && super.field100 < 453) {
				int var10 = super.field99 - var2 / 2 - 17;
				if (var10 < 0) {
					var10 = 0;
				} else if (var10 + var2 > 479) {
					var10 = 479 - var2;
				}
				int var11 = super.field100 - 357;
				if (var11 < 0) {
					var11 = 0;
				} else if (var11 + var5 > 96) {
					var11 = 96 - var5;
				}
				this.field392 = true;
				this.field313 = 2;
				this.field314 = var10;
				this.field315 = var11;
				this.field316 = var2;
				this.field317 = this.field412 * 15 + 22;
			}
		} catch (RuntimeException var13) {
			signlink.reporterror("58819, " + arg0 + ", " + var13.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.b(ZI)V")
	public void method67(boolean arg0) {
		try {
			if (field299.field67 >> 7 == this.field438 && field299.field68 >> 7 == this.field439) {
				this.field438 = 0;
				field340++;
				if (field340 > 96) {
					field340 = 0;
					this.field623.method213(35);
				}
			}
			int var2 = this.field565;
			if (arg0) {
				var2 = 1;
			}
			for (int var3 = 0; var3 < var2; var3++) {
				class5 var4;
				int var5;
				if (arg0) {
					var4 = field299;
					var5 = this.field563 << 14;
				} else {
					var4 = this.field564[this.field566[var3]];
					var5 = this.field566[var3] << 14;
				}
				if (var4 != null && var4.method10()) {
					var4.field113 = false;
					if ((field237 && this.field565 > 50 || this.field565 > 200) && !arg0 && var4.field43 == var4.field70) {
						var4.field113 = true;
					}
					int var6 = var4.field67 >> 7;
					int var7 = var4.field68 >> 7;
					if (var6 >= 0 && var6 < 104 && var7 >= 0 && var7 < 104) {
						if (var4.field126 == null || field553 < var4.field107 || field553 >= var4.field108) {
							if ((var4.field67 & 0x7F) == 64 && (var4.field68 & 0x7F) == 64) {
								if (this.field409[var6][var7] == this.field297) {
									continue;
								}
								this.field409[var6][var7] = this.field297;
							}
							var4.field120 = this.method129(var4.field67, var4.field68, this.field180);
							this.field407.method539(var4.field67, var4.field69, this.field180, var4.field68, 60, var4, var4.field120, var4.field39, var5);
						} else {
							var4.field113 = false;
							var4.field120 = this.method129(var4.field67, var4.field68, this.field180);
							this.field407.method540(var4.field67, var4.field69, var4.field120, var5, var4.field118, var4.field68, this.field180, var4.field117, var4, var4.field116, this.field443, var4.field115);
						}
					}
				}
			}
		} catch (RuntimeException var9) {
			signlink.reporterror("87461, " + arg0 + ", " + 1 + ", " + var9.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.a(JI)V")
	public void method68(long arg0) {
		try {
			if (arg0 != 0L) {
				if (this.field173 >= 100 && this.field403 != 1) {
					this.method126(0, "Your friendlist is full. Max of 100 for free users, and 200 for members", "");
				} else if (this.field173 >= 200) {
					this.method126(0, "Your friendlist is full. Max of 100 for free users, and 200 for members", "");
				} else {
					String var3 = class33.method370(class33.method367(arg0));
					for (int var4 = 0; var4 < this.field173; var4++) {
						if (this.field518[var4] == arg0) {
							this.method126(0, var3 + " is already on your friend list", "");
							return;
						}
					}
					for (int var5 = 0; var5 < this.field225; var5++) {
						if (this.field577[var5] == arg0) {
							this.method126(0, "Please remove " + var3 + " from your ignore list first", "");
							return;
						}
					}
					if (!var3.equals(field299.field129)) {
						this.field523[this.field173] = var3;
						this.field518[this.field173] = arg0;
						this.field456[this.field173] = 0;
						this.field173++;
						this.field541 = true;
						this.field623.method213(167);
						this.field623.method220(arg0);
					}
				}
			}
		} catch (RuntimeException var7) {
			signlink.reporterror("35870, " + arg0 + ", " + -20952 + ", " + var7.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.a(ILEILHLJCE;B)V")
	public void method69(int arg0, class17 arg1) {
		try {
			this.field357 = 0;
			this.field567 = 0;
			this.method86(arg0, arg1);
			this.method111(arg0, arg1);
			this.method143(arg0, arg1);
			for (int var3 = 0; var3 < this.field357; var3++) {
				int var4 = this.field358[var3];
				if (this.field231[var4].field32 != field553) {
					this.field231[var4].field1213 = null;
					this.field231[var4] = null;
				}
			}
			if (arg1.field779 != arg0) {
				signlink.reporterror(this.field169 + " size mismatch in getnpcpos - pos:" + arg1.field779 + " psize:" + arg0);
				throw new RuntimeException("eek");
			}
			for (int var5 = 0; var5 < this.field232; var5++) {
				if (this.field231[this.field233[var5]] == null) {
					signlink.reporterror(this.field169 + " null entry in npc list - pos:" + var5 + " size:" + this.field232);
					throw new RuntimeException("eek");
				}
			}
		} catch (RuntimeException var7) {
			signlink.reporterror("12694, " + arg0 + ", " + arg1 + ", " + ", " + var7.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.k(I)V")
	public void method70() {
		try {
			if (this.field396 > 0) {
				for (int var1 = 0; var1 < 256; var1++) {
					if (this.field396 > 768) {
						this.field448[var1] = this.method159(this.field450[var1], 1024 - this.field396, this.field449[var1]);
					} else if (this.field396 > 256) {
						this.field448[var1] = this.field450[var1];
					} else {
						this.field448[var1] = this.method159(this.field449[var1], 256 - this.field396, this.field450[var1]);
					}
				}
			} else if (this.field397 > 0) {
				for (int var2 = 0; var2 < 256; var2++) {
					if (this.field397 > 768) {
						this.field448[var2] = this.method159(this.field451[var2], 1024 - this.field397, this.field449[var2]);
					} else if (this.field397 > 256) {
						this.field448[var2] = this.field451[var2];
					} else {
						this.field448[var2] = this.method159(this.field449[var2], 256 - this.field397, this.field451[var2]);
					}
				}
			} else {
				for (int var3 = 0; var3 < 256; var3++) {
					this.field448[var3] = this.field449[var3];
				}
			}
			for (int var4 = 0; var4 < 33920; var4++) {
				this.field331.field1402[var4] = this.field381.field1175[var4];
			}
			int var5 = 0;
			int var6 = 1152;
			for (int var7 = 1; var7 < 255; var7++) {
				int var8 = this.field341[var7] * (256 - var7) / 256;
				int var9 = var8 + 22;
				if (var9 < 0) {
					var9 = 0;
				}
				var5 += var9;
				for (int var10 = var9; var10 < 128; var10++) {
					int var11 = this.field458[var5++];
					if (var11 == 0) {
						var6++;
					} else {
						int var13 = 256 - var11;
						int var14 = this.field448[var11];
						int var15 = this.field331.field1402[var6];
						this.field331.field1402[var6++] = ((var14 & 0xFF00FF) * var11 + (var15 & 0xFF00FF) * var13 & 0xFF00FF00) + ((var14 & 0xFF00) * var11 + (var15 & 0xFF00) * var13 & 0xFF0000) >> 8;
					}
				}
				var6 += var9;
			}
			this.field331.method464(0, super.field84, 0);
			for (int var16 = 0; var16 < 33920; var16++) {
				this.field332.field1402[var16] = this.field382.field1175[var16];
			}
			int var17 = 0;
			int var18 = 1176;
			for (int var19 = 1; var19 < 255; var19++) {
				int var20 = this.field341[var19] * (256 - var19) / 256;
				int var21 = 103 - var20;
				int var22 = var18 + var20;
				for (int var23 = 0; var23 < var21; var23++) {
					int var24 = this.field458[var17++];
					if (var24 == 0) {
						var22++;
					} else {
						int var26 = 256 - var24;
						int var27 = this.field448[var24];
						int var28 = this.field332.field1402[var22];
						this.field332.field1402[var22++] = ((var27 & 0xFF00FF) * var24 + (var28 & 0xFF00FF) * var26 & 0xFF00FF00) + ((var27 & 0xFF00) * var24 + (var28 & 0xFF00) * var26 & 0xFF0000) >> 8;
					}
				}
				var17 += 128 - var21;
				var18 = var22 + 128 - var21 - var20;
			}
			this.field332.method464(0, super.field84, 637);
		} catch (RuntimeException var30) {
			signlink.reporterror("42725, " + 4 + ", " + var30.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.l(I)V")
	public void method71() {
		try {
			try {
				if (this.field579 != null) {
					this.field579.method1();
				}
			} catch (Exception var3) {
			}
			this.field579 = null;
			this.field578 = false;
			this.field178 = 0;
			this.field169 = "";
			this.field170 = "";
			this.method76();
			this.field407.method528((byte) 9);
			for (int var1 = 0; var1 < 4; var1++) {
				this.field385[var1].method200();
			}
			System.gc();
			this.method180(this.field263);
			this.field223 = -1;
			this.field452 = -1;
			this.field522 = 0;
		} catch (RuntimeException var4) {
			signlink.reporterror("10013, " + 37121 + ", " + var4.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.a(BLjava/lang/String;Ljava/lang/String;)V")
	public void method72(byte arg0, String arg1, String arg2) {
		try {
			if (arg0 == 9) {
				boolean var8 = false;
			} else {
				this.field434 = this.field222.method224();
			}
			if (this.field490 != null) {
				this.field490.method463();
				class21.field822 = this.field428;
				int var4 = 151;
				if (arg2 != null) {
					var4 -= 7;
				}
				this.field423.method373(0, arg1, 257, var4);
				this.field423.method373(16777215, arg1, 256, var4 - 1);
				var4 += 15;
				if (arg2 != null) {
					this.field423.method373(0, arg2, 257, var4);
					this.field423.method373(16777215, arg2, 256, var4 - 1);
				}
				this.field490.method464(4, super.field84, 4);
			} else if (super.field85 != null) {
				super.field85.method463();
				class21.field822 = this.field429;
				int var5 = 251;
				class26.method315(0, 233, 99, 300, 50, 221);
				class26.method316(221, 300, 233, 50, 16777215);
				if (arg2 != null) {
					var5 -= 7;
				}
				this.field423.method373(0, arg1, 383, var5);
				this.field423.method373(16777215, arg1, 382, var5 - 1);
				var5 += 15;
				if (arg2 != null) {
					this.field423.method373(0, arg2, 383, var5);
					this.field423.method373(16777215, arg2, 382, var5 - 1);
				}
				super.field85.method464(0, super.field84, 0);
			}
		} catch (RuntimeException var7) {
			signlink.reporterror("78163, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + var7.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.b(B)V")
	public void method73() {
		try {
			if (this.field470 > 1) {
				this.field470--;
			}
			if (this.field437 > 0) {
				this.field437--;
			}
			for (int var1 = 0; var1 < 5 && this.method59(); var1++) {
			}
			if (this.field578) {
				Object var2 = this.field242.field1408;
				synchronized (this.field242.field1408) {
					if (!field377) {
						this.field242.field1410 = 0;
					} else if (super.field98 != 0 || this.field242.field1410 >= 40) {
						this.field623.method213(224);
						this.field623.method214(0);
						int var3 = this.field623.field779;
						int var4 = 0;
						for (int var5 = 0; var5 < this.field242.field1410 && var3 - this.field623.field779 < 240; var5++) {
							var4++;
							int var6 = this.field242.field1411[var5];
							if (var6 < 0) {
								var6 = 0;
							} else if (var6 > 502) {
								var6 = 502;
							}
							int var7 = this.field242.field1413[var5];
							if (var7 < 0) {
								var7 = 0;
							} else if (var7 > 764) {
								var7 = 764;
							}
							int var8 = var6 * 765 + var7;
							if (this.field242.field1411[var5] == -1 && this.field242.field1413[var5] == -1) {
								var7 = -1;
								var6 = -1;
								var8 = 524287;
							}
							if (var7 != this.field550 || var6 != this.field551) {
								int var9 = var7 - this.field550;
								this.field550 = var7;
								int var10 = var6 - this.field551;
								this.field551 = var6;
								if (this.field218 < 8 && var9 >= -32 && var9 <= 31 && var10 >= -32 && var10 <= 31) {
									var9 += 32;
									var10 += 32;
									this.field623.method215((this.field218 << 12) + (var9 << 6) + var10);
									this.field218 = 0;
								} else if (this.field218 < 8) {
									this.field623.method217((this.field218 << 19) + var8 + 8388608);
									this.field218 = 0;
								} else {
									this.field623.method218((this.field218 << 19) + var8 - 1073741824);
									this.field218 = 0;
								}
							} else if (this.field218 < 2047) {
								this.field218++;
							}
						}
						this.field623.method223(this.field623.field779 - var3, this.field241);
						if (var4 >= this.field242.field1410) {
							this.field242.field1410 = 0;
						} else {
							this.field242.field1410 -= var4;
							for (int var11 = 0; var11 < this.field242.field1410; var11++) {
								this.field242.field1413[var11] = this.field242.field1413[var11 + var4];
								this.field242.field1411[var11] = this.field242.field1411[var11 + var4];
							}
						}
					}
				}
				if (super.field98 != 0) {
					long var12 = (super.field101 - this.field298) / 50L;
					if (var12 > 4095L) {
						var12 = 4095L;
					}
					this.field298 = super.field101;
					int var14 = super.field100;
					if (var14 < 0) {
						var14 = 0;
					} else if (var14 > 502) {
						var14 = 502;
					}
					int var15 = super.field99;
					if (var15 < 0) {
						var15 = 0;
					} else if (var15 > 764) {
						var15 = 764;
					}
					int var16 = var14 * 765 + var15;
					byte var17 = 0;
					if (super.field98 == 2) {
						var17 = 1;
					}
					int var18 = (int) var12;
					this.field623.method213(150);
					this.field623.method218((var18 << 20) + (var17 << 19) + var16);
				}
				if (this.field482 > 0) {
					this.field482--;
				}
				if (super.field102[1] == 1 || super.field102[2] == 1 || super.field102[3] == 1 || super.field102[4] == 1) {
					this.field483 = true;
				}
				if (this.field483 && this.field482 <= 0) {
					this.field482 = 20;
					this.field483 = false;
					this.field623.method213(130);
					this.field623.method251(this.field632);
					this.field623.method215(this.field633);
				}
				if (super.field89 && !this.field486) {
					this.field486 = true;
					this.field623.method213(139);
					this.field623.method214(1);
				}
				if (!super.field89 && this.field486) {
					this.field486 = false;
					this.field623.method213(139);
					this.field623.method214(0);
				}
				this.method123();
				this.method164((byte) 4);
				this.method122();
				this.field435++;
				if (this.field435 > 750) {
					this.method125();
				}
				this.method110();
				this.method135();
				this.method144(this.field259);
				this.field447++;
				if (this.field250 != 0) {
					this.field249 += 20;
					if (this.field249 >= 400) {
						this.field250 = 0;
					}
				}
				if (this.field503 != 0) {
					this.field500++;
					if (this.field500 >= 15) {
						if (this.field503 == 2) {
							this.field541 = true;
						}
						if (this.field503 == 3) {
							this.field642 = true;
						}
						this.field503 = 0;
					}
				}
				if (this.field582 != 0) {
					this.field444++;
					if (super.field92 > this.field583 + 5 || super.field92 < this.field583 - 5 || super.field93 > this.field584 + 5 || super.field93 < this.field584 - 5) {
						this.field544 = true;
					}
					if (super.field91 == 0) {
						if (this.field582 == 2) {
							this.field541 = true;
						}
						if (this.field582 == 3) {
							this.field642 = true;
						}
						this.field582 = 0;
						if (this.field544 && this.field444 >= 5) {
							this.field532 = -1;
							this.method158();
							if (this.field532 == this.field580 && this.field531 != this.field581) {
								class27 var19 = class27.method329(this.field580);
								byte var20 = 0;
								if (this.field410 == 1 && var19.field891 == 206) {
									var20 = 1;
								}
								if (var19.field947[this.field531] <= 0) {
									var20 = 0;
								}
								if (var19.field896) {
									int var21 = this.field581;
									int var22 = this.field531;
									var19.field947[var22] = var19.field947[var21];
									var19.field909[var22] = var19.field909[var21];
									var19.field947[var21] = -1;
									var19.field909[var21] = 0;
								} else if (var20 == 1) {
									int var23 = this.field581;
									int var24 = this.field531;
									while (var23 != var24) {
										if (var23 > var24) {
											var19.method323(var23 - 1, var23);
											var23--;
										} else if (var23 < var24) {
											var19.method323(var23 + 1, var23);
											var23++;
										}
									}
								} else {
									var19.method323(this.field531, this.field581);
								}
								this.field623.method213(109);
								this.field623.method214(var20);
								this.field623.method250(this.field580);
								this.field623.method250(this.field531);
								this.field623.method249(this.field581);
							}
						} else if ((this.field182 == 1 || this.method77(this.field412 - 1)) && this.field412 > 2) {
							this.method66(543);
						} else if (this.field412 > 0) {
							this.method51(this.field412 - 1);
						}
						this.field500 = 10;
						super.field98 = 0;
					}
				}
				if (class68.field1587 != -1) {
					int var25 = class68.field1587;
					int var26 = class68.field1588;
					boolean var27 = this.method155(var25, (byte) 6, var26, 0, 0, field299.field38[0], true, 0, field299.field37[0], 0, 0, 0);
					class68.field1587 = -1;
					if (var27) {
						this.field247 = super.field99;
						this.field248 = super.field100;
						this.field250 = 1;
						this.field249 = 0;
					}
				}
				if (super.field98 == 1 && this.field321 != null) {
					this.field321 = null;
					this.field642 = true;
					super.field98 = 0;
				}
				this.method127();
				if (this.field631 == -1) {
					this.method81((byte) 7);
					this.method181();
					this.method166();
				}
				if (super.field91 == 1 || super.field98 == 1) {
					this.field415++;
				}
				if (this.field530 == 0 && this.field203 == 0 && this.field302 == 0) {
					if (this.field278 > 0) {
						this.field278--;
					}
				} else if (this.field278 < 100) {
					this.field278++;
					if (this.field278 == 100) {
						if (this.field530 != 0) {
							this.field642 = true;
						}
						if (this.field203 != 0) {
							this.field541 = true;
						}
					}
				}
				if (this.field179 == 2) {
					this.method96();
				}
				if (this.field179 == 2 && this.field295) {
					this.method154();
				}
				for (int var28 = 0; var28 < 5; var28++) {
					int var10002 = this.field400[var28]++;
				}
				this.method152();
				field269++;
				if (field269 > 153) {
					field269 = 0;
					this.field623.method213(1);
					this.field623.method215(26173);
				}
				super.field90++;
				if (super.field90 > 4500) {
					this.field437 = 250;
					super.field90 -= 500;
					this.field623.method213(63);
				}
				this.field276++;
				if (this.field276 > 500) {
					this.field276 = 0;
					int var29 = (int) (Math.random() * 8.0D);
					if ((var29 & 0x1) == 1) {
						this.field287 += this.field288;
					}
					if ((var29 & 0x2) == 2) {
						this.field574 += this.field575;
					}
					if ((var29 & 0x4) == 4) {
						this.field616 += this.field617;
					}
				}
				if (this.field287 < -50) {
					this.field288 = 2;
				}
				if (this.field287 > 50) {
					this.field288 = -2;
				}
				if (this.field574 < -55) {
					this.field575 = 2;
				}
				if (this.field574 > 55) {
					this.field575 = -2;
				}
				if (this.field616 < -40) {
					this.field617 = 1;
				}
				if (this.field616 > 40) {
					this.field617 = -1;
				}
				this.field398++;
				if (this.field398 > 500) {
					this.field398 = 0;
					int var30 = (int) (Math.random() * 8.0D);
					if ((var30 & 0x1) == 1) {
						this.field323 += this.field324;
					}
					if ((var30 & 0x2) == 2) {
						this.field599 += this.field600;
					}
				}
				if (this.field323 < -60) {
					this.field324 = 2;
				}
				if (this.field323 > 60) {
					this.field324 = -2;
				}
				if (this.field599 < -20) {
					this.field600 = 1;
				}
				if (this.field599 > 10) {
					this.field600 = -1;
				}
				this.field436++;
				if (this.field436 > 50) {
					this.field623.method213(58);
				}
				try {
					if (this.field579 != null && this.field623.field779 > 0) {
						this.field579.method5(this.field623.field778, this.field623.field779, (byte) 1);
						this.field623.field779 = 0;
						this.field436 = 0;
					}
				} catch (IOException var33) {
					this.method125();
				} catch (Exception var34) {
					this.method71();
				}
			}
		} catch (RuntimeException var36) {
			signlink.reporterror("49448, " + 4 + ", " + var36.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.a(BLEILHLJCE;I)V")
	public void method74(class17 arg0, int arg1) {
		try {
			while (true) {
				if (arg0.field780 + 10 < arg1 * 8) {
					int var3 = arg0.method235(11);
					if (var3 != 2047) {
						if (this.field564[var3] == null) {
							this.field564[var3] = new class5();
							if (this.field569[var3] != null) {
								this.field564[var3].method27(this.field569[var3], this.field342);
							}
						}
						this.field566[this.field565++] = var3;
						class5 var4 = this.field564[var3];
						var4.field32 = field553;
						int var5 = arg0.method235(5);
						if (var5 > 15) {
							var5 -= 32;
						}
						int var6 = arg0.method235(1);
						if (var6 == 1) {
							this.field568[this.field567++] = var3;
						}
						int var7 = arg0.method235(5);
						if (var7 > 15) {
							var7 -= 32;
						}
						int var8 = arg0.method235(1);
						var4.method11(field299.field37[0] + var7, field299.field38[0] + var5, var8 == 1);
						continue;
					}
				}
				arg0.method236();
				return;
			}
		} catch (RuntimeException var10) {
			signlink.reporterror("95535, " + 103 + ", " + arg0 + ", " + arg1 + ", " + var10.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.c(B)V")
	public void method75() {
		try {
			this.field268 = true;
			try {
				long var1 = System.currentTimeMillis();
				int var3 = 0;
				int var4 = 20;
				while (this.field353) {
					this.field226++;
					this.method79();
					this.method79();
					this.method70();
					var3++;
					if (var3 > 10) {
						long var5 = System.currentTimeMillis();
						int var7 = (int) (var5 - var1) / 10 - var4;
						var4 = 40 - var7;
						if (var4 < 5) {
							var4 = 5;
						}
						var3 = 0;
						var1 = var5;
					}
					try {
						Thread.sleep((long) var4);
					} catch (Exception var9) {
					}
				}
			} catch (Exception var10) {
			}
			this.field268 = false;
		} catch (RuntimeException var11) {
			signlink.reporterror("78651, " + -31 + ", " + var11.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.m(I)V")
	public void method76() {
		try {
			class14.field735.method199();
			class14.field725.method199();
			class37.field1118.method199();
			class67.field1532.method199();
			class67.field1522.method199();
			class5.field133.method199();
			class55.field1379.method199();
		} catch (RuntimeException var2) {
			signlink.reporterror("76175, " + ", " + var2.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.b(II)Z")
	public boolean method77(int arg0) {
		try {
			if (arg0 < 0) {
				return false;
			}
			int var2 = this.field348[arg0];
			if (var2 >= 2000) {
				var2 -= 2000;
			}
			return var2 == 696;
		} catch (RuntimeException var4) {
			signlink.reporterror("68055, " + ", " + arg0 + ", " + var4.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.d(B)V")
	public void method78() {
		try {
			System.out.println("============");
			System.out.println("flame-cycle:" + this.field226);
			if (this.field602 != null) {
				System.out.println("Od-cycle:" + this.field602.field1638);
			}
			System.out.println("loop-cycle:" + field553);
			System.out.println("draw-cycle:" + field505);
			System.out.println("ptype:" + this.field434);
			System.out.println("psize:" + this.field433);
			if (this.field579 != null) {
				this.field579.method6();
			}
			super.field81 = true;
		} catch (RuntimeException var2) {
			signlink.reporterror("42651, " + -34 + ", " + var2.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.a(Z)Ljava/awt/Component;")
	@Override
	public Component method22() {
		try {
			if (signlink.mainapp == null) {
				return super.field87 == null ? this : super.field87;
			} else {
				return signlink.mainapp;
			}
		} catch (RuntimeException var2) {
			signlink.reporterror("83026, " + true + ", " + var2.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.e(B)V")
	public void method79() {
		try {
			for (int var1 = 10; var1 < 117; var1++) {
				int var2 = (int) (Math.random() * 100.0D);
				if (var2 < 50) {
					this.field458[var1 + 32512] = 255;
				}
			}
			for (int var3 = 0; var3 < 100; var3++) {
				int var4 = (int) (Math.random() * 124.0D) + 2;
				int var5 = (int) (Math.random() * 128.0D) + 128;
				int var6 = var4 + (var5 << 7);
				this.field458[var6] = 192;
			}
			for (int var7 = 1; var7 < 255; var7++) {
				for (int var8 = 1; var8 < 127; var8++) {
					int var9 = var8 + (var7 << 7);
					this.field459[var9] = (this.field458[var9 - 1] + this.field458[var9 + 1] + this.field458[var9 - 128] + this.field458[var9 + 128]) / 4;
				}
			}
			this.field561 += 128;
			if (this.field561 > this.field216.length) {
				this.field561 -= this.field216.length;
				int var10 = (int) (Math.random() * 12.0D);
				this.method65(this.field383[var10]);
			}
			for (int var11 = 1; var11 < 255; var11++) {
				for (int var12 = 1; var12 < 127; var12++) {
					int var13 = var12 + (var11 << 7);
					int var14 = this.field459[var13 + 128] - this.field216[var13 + this.field561 & this.field216.length - 1] / 5;
					if (var14 < 0) {
						var14 = 0;
					}
					this.field458[var13] = var14;
				}
			}
			for (int var15 = 0; var15 < 255; var15++) {
				this.field341[var15] = this.field341[var15 + 1];
			}
			this.field341[255] = (int) (Math.sin((double) field553 / 14.0D) * 16.0D + Math.sin((double) field553 / 15.0D) * 14.0D + Math.sin((double) field553 / 16.0D) * 12.0D);
			if (this.field396 > 0) {
				this.field396 -= 4;
			}
			if (this.field397 > 0) {
				this.field397 -= 4;
			}
			if (this.field396 == 0 && this.field397 == 0) {
				int var16 = (int) (Math.random() * 2000.0D);
				if (var16 == 0) {
					this.field396 = 1024;
				}
				if (var16 == 1) {
					this.field397 = 1024;
					return;
				}
			}
		} catch (RuntimeException var18) {
			signlink.reporterror("37793, " + 8 + ", " + var18.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.n(I)V")
	public void method80() {
		try {
			this.field257 = true;
			for (int var1 = 0; var1 < 7; var1++) {
				this.field389[var1] = -1;
				for (int var2 = 0; var2 < class54.field1356; var2++) {
					if (!class54.field1357[var2].field1363 && class54.field1357[var2].field1358 == var1 + (this.field613 ? 0 : 7)) {
						this.field389[var1] = var2;
						break;
					}
				}
			}
		} catch (RuntimeException var4) {
			signlink.reporterror("59, " + -279 + ", " + var4.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.f(B)V")
	public void method81(byte arg0) {
		try {
			boolean var16 = false;
			if (this.field594 == 0 && super.field98 == 1) {
				int var2 = super.field99 - 25 - 550;
				int var3 = super.field100 - 5 - 4;
				if (var2 >= 0 && var3 >= 0 && var2 < 146 && var3 < 151) {
					var2 -= 73;
					var3 -= 75;
					int var4 = this.field633 + this.field323 & 0x7FF;
					int var5 = class21.field820[var4];
					int var6 = class21.field821[var4];
					int var7 = var5 * (this.field599 + 256) >> 8;
					int var8 = var6 * (this.field599 + 256) >> 8;
					int var9 = var3 * var7 + var2 * var8 >> 11;
					int var10 = var3 * var8 - var2 * var7 >> 11;
					int var11 = field299.field67 + var9 >> 7;
					int var12 = field299.field68 - var10 >> 7;
					boolean var13 = this.method155(var11, (byte) 6, var12, 1, 0, field299.field38[0], true, 0, field299.field37[0], 0, 0, 0);
					if (var13) {
						this.field623.method214(var2);
						this.field623.method214(var3);
						this.field623.method215(this.field633);
						this.field623.method214(57);
						this.field623.method214(this.field323);
						this.field623.method214(this.field599);
						this.field623.method214(89);
						this.field623.method215(field299.field67);
						this.field623.method215(field299.field68);
						this.field623.method214(this.field414);
						this.field623.method214(63);
						return;
					}
				}
			}
		} catch (RuntimeException var15) {
			signlink.reporterror("11851, " + arg0 + ", " + var15.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.a(IBIIIIIIII)V")
	public void method82(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		try {
			class23 var10 = null;
			for (class23 var11 = (class23) this.field525.method275(); var11 != null; var11 = (class23) this.field525.method277()) {
				if (var11.field852 == arg2 && var11.field854 == arg1 && var11.field855 == arg0 && var11.field853 == arg3) {
					var10 = var11;
					break;
				}
			}
			if (var10 == null) {
				var10 = new class23();
				var10.field852 = arg2;
				var10.field853 = arg3;
				var10.field854 = arg1;
				var10.field855 = arg0;
				this.method160(var10);
				this.field525.method272(var10);
			}
			var10.field845 = arg4;
			var10.field847 = arg8;
			var10.field846 = arg5;
			var10.field856 = arg7;
			var10.field851 = arg6;
		} catch (RuntimeException var13) {
			signlink.reporterror("25554, " + arg0 + ", " + 1 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + var13.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.g(B)I")
	public int method83() {
		try {
			if (this.field455 != 4) {
				this.field289 = 101;
			}
			int var1 = 3;
			if (this.field187 < 310) {
				int var2 = this.field184 >> 7;
				int var3 = this.field186 >> 7;
				int var4 = field299.field67 >> 7;
				int var5 = field299.field68 >> 7;
				if ((this.field238[this.field180][var2][var3] & 0x4) != 0) {
					var1 = this.field180;
				}
				int var6;
				if (var4 > var2) {
					var6 = var4 - var2;
				} else {
					var6 = var2 - var4;
				}
				int var7;
				if (var5 > var3) {
					var7 = var5 - var3;
				} else {
					var7 = var3 - var5;
				}
				if (var6 > var7) {
					int var8 = var7 * 65536 / var6;
					int var9 = 32768;
					while (var2 != var4) {
						if (var2 < var4) {
							var2++;
						} else if (var2 > var4) {
							var2--;
						}
						if ((this.field238[this.field180][var2][var3] & 0x4) != 0) {
							var1 = this.field180;
						}
						var9 += var8;
						if (var9 >= 65536) {
							var9 -= 65536;
							if (var3 < var5) {
								var3++;
							} else if (var3 > var5) {
								var3--;
							}
							if ((this.field238[this.field180][var2][var3] & 0x4) != 0) {
								var1 = this.field180;
							}
						}
					}
				} else {
					int var10 = var6 * 65536 / var7;
					int var11 = 32768;
					while (var3 != var5) {
						if (var3 < var5) {
							var3++;
						} else if (var3 > var5) {
							var3--;
						}
						if ((this.field238[this.field180][var2][var3] & 0x4) != 0) {
							var1 = this.field180;
						}
						var11 += var10;
						if (var11 >= 65536) {
							var11 -= 65536;
							if (var2 < var4) {
								var2++;
							} else if (var2 > var4) {
								var2--;
							}
							if ((this.field238[this.field180][var2][var3] & 0x4) != 0) {
								var1 = this.field180;
							}
						}
					}
				}
			}
			if ((this.field238[this.field180][field299.field67 >> 7][field299.field68 >> 7] & 0x4) != 0) {
				var1 = this.field180;
			}
			return var1;
		} catch (RuntimeException var13) {
			signlink.reporterror("55441, " + 4 + ", " + var13.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.d(Z)I")
	public int method84() {
		try {
			int var1 = this.method129(this.field184, this.field186, this.field180);
			return var1 - this.field185 >= 800 || (this.field238[this.field180][this.field184 >> 7][this.field186 >> 7] & 0x4) == 0 ? 3 : this.field180;
		} catch (RuntimeException var3) {
			signlink.reporterror("93689, " + true + ", " + var3.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.o(I)Ljava/net/Socket;")
	public Socket method85(int arg0) throws IOException {
		return signlink.mainapp == null ? new Socket(InetAddress.getByName(this.getCodeBase().getHost()), arg0) : signlink.opensocket(arg0);
	}

	@ObfuscatedName("client.a(IILEILHLJCE;)V")
	public void method86(int arg0, class17 arg1) {
		try {
			arg1.method234();
			int var3 = arg1.method235(8);
			if (var3 < this.field232) {
				for (int var4 = var3; var4 < this.field232; var4++) {
					this.field358[this.field357++] = this.field233[var4];
				}
			}
			if (var3 > this.field232) {
				signlink.reporterror(this.field169 + " Too many npcs");
				throw new RuntimeException("eek");
			}
			this.field232 = 0;
			for (int var5 = 0; var5 < var3; var5++) {
				int var6 = this.field233[var5];
				class43 var7 = this.field231[var6];
				int var8 = arg1.method235(1);
				if (var8 == 0) {
					this.field233[this.field232++] = var6;
					var7.field32 = field553;
				} else {
					int var9 = arg1.method235(2);
					if (var9 == 0) {
						this.field233[this.field232++] = var6;
						var7.field32 = field553;
						this.field568[this.field567++] = var6;
					} else if (var9 == 1) {
						this.field233[this.field232++] = var6;
						var7.field32 = field553;
						int var10 = arg1.method235(3);
						var7.method8(var10, false);
						int var11 = arg1.method235(1);
						if (var11 == 1) {
							this.field568[this.field567++] = var6;
						}
					} else if (var9 == 2) {
						this.field233[this.field232++] = var6;
						var7.field32 = field553;
						int var12 = arg1.method235(3);
						var7.method8(var12, true);
						int var13 = arg1.method235(3);
						var7.method8(var13, true);
						int var14 = arg1.method235(1);
						if (var14 == 1) {
							this.field568[this.field567++] = var6;
						}
					} else if (var9 == 3) {
						this.field358[this.field357++] = var6;
					}
				}
			}
		} catch (RuntimeException var16) {
			signlink.reporterror("59473, " + arg0 + ", " + 9848 + ", " + arg1 + ", " + var16.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.c(II)V")
	public void method87(int arg0) {
		try {
			int[] var2 = this.field440.field1175;
			int var3 = var2.length;
			for (int var4 = 0; var4 < var3; var4++) {
				var2[var4] = 0;
			}
			for (int var5 = 1; var5 < 103; var5++) {
				int var6 = (103 - var5) * 512 * 4 + 24628;
				for (int var7 = 1; var7 < 103; var7++) {
					if ((this.field238[arg0][var7][var5] & 0x18) == 0) {
						this.field407.method563(var2, var6, arg0, var7, var5);
					}
					if (arg0 < 3 && (this.field238[arg0 + 1][var7][var5] & 0x8) != 0) {
						this.field407.method563(var2, var6, arg0 + 1, var7, var5);
					}
					var6 += 4;
				}
			}
			int var8 = ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + (int) (Math.random() * 20.0D) + 238 - 10;
			int var9 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
			this.field440.method399();
			for (int var10 = 1; var10 < 103; var10++) {
				for (int var11 = 1; var11 < 103; var11++) {
					if ((this.field238[arg0][var11][var10] & 0x18) == 0) {
						this.method97(var8, arg0, var10, var11, var9);
					}
					if (arg0 < 3 && (this.field238[arg0 + 1][var11][var10] & 0x8) != 0) {
						this.method97(var8, arg0 + 1, var10, var11, var9);
					}
				}
			}
			if (this.field490 != null) {
				this.field490.method463();
				class21.field822 = this.field428;
			}
			this.field361 = 0;
			for (int var12 = 0; var12 < 104; var12++) {
				for (int var13 = 0; var13 < 104; var13++) {
					int var14 = this.field407.method557(this.field180, var12, var13);
					if (var14 != 0) {
						int var15 = var14 >> 14 & 0x7FFF;
						int var16 = class14.method192(var15).field721;
						if (var16 >= 0) {
							int var17 = var12;
							int var18 = var13;
							if (var16 != 22 && var16 != 29 && var16 != 34 && var16 != 36 && var16 != 46 && var16 != 47 && var16 != 48) {
								int[][] var19 = this.field385[this.field180].field761;
								for (int var20 = 0; var20 < 10; var20++) {
									int var21 = (int) (Math.random() * 4.0D);
									if (var21 == 0 && var17 > 0 && var17 > var12 - 3 && (var19[var17 - 1][var18] & 0x1280108) == 0) {
										var17--;
									}
									if (var21 == 1 && var17 < 103 && var17 < var12 + 3 && (var19[var17 + 1][var18] & 0x1280180) == 0) {
										var17++;
									}
									if (var21 == 2 && var18 > 0 && var18 > var13 - 3 && (var19[var17][var18 - 1] & 0x1280102) == 0) {
										var18--;
									}
									if (var21 == 3 && var18 < 103 && var18 < var13 + 3 && (var19[var17][var18 + 1] & 0x1280120) == 0) {
										var18++;
									}
								}
							}
							this.field373[this.field361] = this.field384[var16];
							this.field362[this.field361] = var17;
							this.field363[this.field361] = var18;
							this.field361++;
						}
					}
				}
			}
		} catch (RuntimeException var23) {
			signlink.reporterror("56552, " + 737 + ", " + arg0 + ", " + var23.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.p(I)V")
	public void method88() {
		try {
			this.field623.method213(211);
			if (this.field519 != -1) {
				this.method146(this.field519);
				this.field519 = -1;
				this.field541 = true;
				this.field446 = false;
				this.field264 = true;
			}
			if (this.field499 != -1) {
				this.method146(this.field499);
				this.field499 = -1;
				this.field642 = true;
				this.field446 = false;
			}
			if (this.field631 != -1) {
				this.method146(this.field631);
				this.field631 = -1;
				this.field399 = true;
			}
			if (this.field275 != -1) {
				this.method146(this.field275);
				this.field275 = -1;
			}
			if (this.field265 != -1) {
				this.method146(this.field265);
				this.field265 = -1;
			}
		} catch (RuntimeException var2) {
			signlink.reporterror("90701, " + ", " + var2.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.d(I)V")
	@Override
	public void method19(int arg0) {
		try {
			signlink.reporterror = false;
			try {
				if (this.field579 != null) {
					this.field579.method1();
				}
			} catch (Exception var3) {
			}
			this.field579 = null;
			this.method180(this.field263);
			if (this.field242 != null) {
				this.field242.field1412 = false;
			}
			this.field242 = null;
			this.field602.method603();
			this.field602 = null;
			this.field230 = null;
			this.field623 = null;
			this.field621 = null;
			this.field222 = null;
			this.field189 = null;
			this.field416 = null;
			this.field305 = null;
			this.field190 = null;
			this.field191 = null;
			this.field622 = null;
			this.field238 = null;
			this.field407 = null;
			this.field385 = null;
			this.field520 = null;
			this.field542 = null;
			this.field175 = null;
			this.field176 = null;
			this.field471 = null;
			this.field488 = null;
			this.field489 = null;
			this.field490 = null;
			this.field491 = null;
			this.field318 = null;
			this.field319 = null;
			this.field320 = null;
			this.field204 = null;
			this.field205 = null;
			this.field206 = null;
			this.field207 = null;
			this.field208 = null;
			this.field209 = null;
			this.field210 = null;
			this.field211 = null;
			this.field212 = null;
			this.field430 = null;
			this.field431 = null;
			this.field432 = null;
			this.field475 = null;
			this.field476 = null;
			this.field477 = null;
			this.field495 = null;
			this.field535 = null;
			this.field536 = null;
			this.field537 = null;
			this.field538 = null;
			this.field539 = null;
			this.field417 = null;
			this.field418 = null;
			this.field419 = null;
			this.field420 = null;
			this.field421 = null;
			this.field644 = null;
			this.field645 = null;
			this.field301 = null;
			this.field366 = null;
			this.field351 = null;
			this.field364 = null;
			this.field163 = null;
			this.field196 = null;
			this.field197 = null;
			this.field198 = null;
			this.field199 = null;
			this.field200 = null;
			this.field304 = null;
			this.field384 = null;
			this.field409 = null;
			this.field564 = null;
			this.field566 = null;
			this.field568 = null;
			this.field569 = null;
			this.field358 = null;
			this.field231 = null;
			this.field233 = null;
			this.field406 = null;
			this.field525 = null;
			this.field260 = null;
			this.field308 = null;
			this.field346 = null;
			this.field347 = null;
			this.field348 = null;
			this.field349 = null;
			this.field273 = null;
			this.field643 = null;
			this.field362 = null;
			this.field363 = null;
			this.field373 = null;
			this.field440 = null;
			this.field523 = null;
			this.field518 = null;
			this.field456 = null;
			this.field331 = null;
			this.field332 = null;
			this.field328 = null;
			this.field329 = null;
			this.field330 = null;
			this.field333 = null;
			this.field334 = null;
			this.field335 = null;
			this.field336 = null;
			this.method60();
			class14.method193();
			class37.method394();
			class67.method519();
			class27.method327();
			class52.field1338 = null;
			class54.field1357 = null;
			class9.field152 = null;
			class41.field1184 = null;
			class55.field1367 = null;
			class55.field1379 = null;
			class28.field963 = null;
			super.field85 = null;
			class5.field133 = null;
			class21.method280();
			class68.method527();
			class31.method335();
			class25.method307();
			System.gc();
			boolean var5 = false;
		} catch (RuntimeException var4) {
			signlink.reporterror("1923, " + arg0 + ", " + var4.toString());
			throw new RuntimeException();
		}
	}

	@Override
	public AppletContext getAppletContext() {
		return signlink.mainapp == null ? super.getAppletContext() : signlink.mainapp.getAppletContext();
	}

	@ObfuscatedName("client.q(I)V")
	public void method89() {
		try {
			Graphics var1 = this.method22().getGraphics();
			var1.setColor(Color.black);
			var1.fillRect(0, 0, 765, 503);
			this.method15();
			if (this.field508) {
				this.field353 = false;
				var1.setFont(new Font("Helvetica", 1, 16));
				var1.setColor(Color.yellow);
				byte var2 = 35;
				var1.drawString("Sorry, an error has occured whilst loading RuneScape", 30, 35);
				int var6 = var2 + 50;
				var1.setColor(Color.white);
				var1.drawString("To fix this try the following (in order):", 30, 85);
				int var7 = var6 + 50;
				var1.setColor(Color.white);
				var1.setFont(new Font("Helvetica", 1, 12));
				var1.drawString("1: Try closing ALL open web-browser windows, and reloading", 30, 135);
				int var8 = var7 + 30;
				var1.drawString("2: Try clearing your web-browsers cache from tools->internet options", 30, 165);
				int var9 = var8 + 30;
				var1.drawString("3: Try using a different game-world", 30, 195);
				int var11 = var9 + 30;
				var1.drawString("4: Try rebooting your computer", 30, 225);
				int var13 = var11 + 30;
				var1.drawString("5: Try selecting a different version of Java from the play-game menu", 30, 255);
			}
			if (this.field408) {
				this.field353 = false;
				var1.setFont(new Font("Helvetica", 1, 20));
				var1.setColor(Color.white);
				var1.drawString("Error - unable to load game!", 50, 50);
				var1.drawString("To play RuneScape make sure you play from", 50, 100);
				var1.drawString("http://www.runescape.com", 50, 150);
			}
			if (this.field543) {
				this.field353 = false;
				var1.setColor(Color.yellow);
				byte var3 = 35;
				var1.drawString("Error a copy of RuneScape already appears to be loaded", 30, 35);
				int var10 = var3 + 50;
				var1.setColor(Color.white);
				var1.drawString("To fix this try the following (in order):", 30, 85);
				int var12 = var10 + 50;
				var1.setColor(Color.white);
				var1.setFont(new Font("Helvetica", 1, 12));
				var1.drawString("1: Try closing ALL open web-browser windows, and reloading", 30, 135);
				int var14 = var12 + 30;
				var1.drawString("2: Try rebooting your computer, and reloading", 30, 165);
				int var15 = var14 + 30;
			}
		} catch (RuntimeException var5) {
			signlink.reporterror("64163, " + -453 + ", " + var5.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.a(IIIIIII)V")
	public void method90(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		try {
			int var7 = 2048 - arg1 & 0x7FF;
			int var8 = 2048 - arg2 & 0x7FF;
			int var9 = 0;
			int var10 = 0;
			int var11 = arg3;
			if (var7 != 0) {
				int var12 = class31.field1063[var7];
				int var13 = class31.field1064[var7];
				int var14 = var13 * 0 - arg3 * var12 >> 16;
				var11 = var12 * 0 + arg3 * var13 >> 16;
				var10 = var14;
			}
			if (var8 != 0) {
				int var15 = class31.field1063[var8];
				int var16 = class31.field1064[var8];
				int var17 = var11 * var15 + var16 * 0 >> 16;
				var11 = var11 * var16 - var15 * 0 >> 16;
				var9 = var17;
			}
			this.field184 = arg0 - var9;
			this.field185 = arg5 - var10;
			this.field186 = arg4 - var11;
			this.field187 = arg1;
			this.field188 = arg2;
		} catch (RuntimeException var19) {
			signlink.reporterror("67404, " + arg0 + ", " + arg1 + ", " + 8 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + var19.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.r(I)V")
	public void method91() {
		try {
			for (class47 var1 = (class47) this.field260.method275(); var1 != null; var1 = (class47) this.field260.method277()) {
				if (var1.field1281 != this.field180 || field553 > var1.field1297) {
					var1.method334();
				} else if (field553 >= var1.field1296) {
					if (var1.field1288 > 0) {
						class43 var2 = this.field231[var1.field1288 - 1];
						if (var2 != null && var2.field67 >= 0 && var2.field67 < 13312 && var2.field68 >= 0 && var2.field68 < 13312) {
							var1.method437(var2.field68, field553, var2.field67, this.method129(var2.field67, var2.field68, var1.field1281) - var1.field1277);
						}
					}
					if (var1.field1288 < 0) {
						int var3 = -var1.field1288 - 1;
						class5 var4;
						if (var3 == this.field556) {
							var4 = field299;
						} else {
							var4 = this.field564[var3];
						}
						if (var4 != null && var4.field67 >= 0 && var4.field67 < 13312 && var4.field68 >= 0 && var4.field68 < 13312) {
							var1.method437(var4.field68, field553, var4.field67, this.method129(var4.field67, var4.field68, var1.field1281) - var1.field1277);
						}
					}
					var1.method438(this.field447);
					this.field407.method539((int) var1.field1278, var1.field1293, this.field180, (int) var1.field1279, 60, var1, (int) var1.field1280, false, -1);
				}
			}
		} catch (RuntimeException var6) {
			signlink.reporterror("50208, " + 623 + ", " + var6.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.a(ILEILHLJCE;I)V")
	public void method92(class17 arg0, int arg1) {
		try {
			this.field357 = 0;
			this.field567 = 0;
			this.method165(arg0, arg1);
			this.method150(arg1, arg0);
			this.method74(arg0, arg1);
			this.method172(arg0, arg1);
			for (int var3 = 0; var3 < this.field357; var3++) {
				int var4 = this.field358[var3];
				if (this.field564[var4].field32 != field553) {
					this.field564[var4] = null;
				}
			}
			if (arg0.field779 != arg1) {
				signlink.reporterror("Error packet size mismatch in getplayer pos:" + arg0.field779 + " psize:" + arg1);
				throw new RuntimeException("eek");
			}
			for (int var5 = 0; var5 < this.field565; var5++) {
				if (this.field564[this.field566[var5]] == null) {
					signlink.reporterror(this.field169 + " null entry in pl list - pos:" + var5 + " size:" + this.field565);
					throw new RuntimeException("eek");
				}
			}
		} catch (RuntimeException var7) {
			signlink.reporterror("85573, " + -938 + ", " + arg0 + ", " + arg1 + ", " + var7.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.a(IB)V")
	public void method93(int arg0) {
		try {
			class27 var2 = class27.method329(arg0);
			for (int var3 = 0; var3 < var2.field911.length && var2.field911[var3] != -1; var3++) {
				class27 var4 = class27.method329(var2.field911[var3]);
				if (var4.field922 == 1) {
					this.method93(var4.field914);
				}
				var4.field948 = 0;
				var4.field959 = 0;
			}
		} catch (RuntimeException var6) {
			signlink.reporterror("19367, " + arg0 + ", " + 5 + ", " + var6.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.s(I)V")
	public void method94(int arg0) {
		try {
			this.field297++;
			this.method67(true);
			this.method163(true);
			this.method67(false);
			this.method163(false);
			this.method91();
			this.method168();
			if (!this.field295) {
				int var2 = this.field632;
				if (this.field325 / 256 > var2) {
					var2 = this.field325 / 256;
				}
				if (this.field345[4] && this.field534[4] + 128 > var2) {
					var2 = this.field534[4] + 128;
				}
				int var3 = this.field633 + this.field616 & 0x7FF;
				this.method90(this.field480, var2, var3, var2 * 3 + 600, this.field481, this.method129(field299.field67, field299.field68, this.field180) - 50);
			}
			int var4;
			if (this.field295) {
				var4 = this.method84();
			} else {
				var4 = this.method83();
			}
			int var5 = this.field184;
			int var6 = this.field185;
			int var7 = this.field186;
			int var8 = this.field187;
			int var9 = this.field188;
			for (int var10 = 0; var10 < 5; var10++) {
				if (this.field345[var10]) {
					int var11 = (int) (Math.random() * (double) (this.field592[var10] * 2 + 1) + Math.sin((double) this.field400[var10] * ((double) this.field183[var10] / 100.0D)) * (double) this.field534[var10] - (double) this.field592[var10]);
					if (var10 == 0) {
						this.field184 += var11;
					}
					if (var10 == 1) {
						this.field185 += var11;
					}
					if (var10 == 2) {
						this.field186 += var11;
					}
					if (var10 == 3) {
						this.field188 = this.field188 + var11 & 0x7FF;
					}
					if (var10 == 4) {
						this.field187 += var11;
						if (this.field187 < 128) {
							this.field187 = 128;
						}
						if (this.field187 > 383) {
							this.field187 = 383;
						}
					}
				}
			}
			int var12 = class21.field831;
			class31.field1058 = true;
			class31.field1061 = 0;
			class31.field1059 = super.field92 - 4;
			class31.field1060 = super.field93 - 4;
			class26.method313();
			this.field407.method567(this.field185, this.field184, this.field186, var4, this.field187, this.field188);
			this.field407.method542();
			this.method147();
			this.method169();
			this.method54((byte) 7, var12);
			this.method153(this.field359);
			this.field490.method464(4, super.field84, 4);
			this.field184 = var5;
			this.field185 = var6;
			this.field186 = var7;
			this.field187 = var8;
			while (arg0 >= 0) {
				this.field605 = this.field625.method580();
			}
			this.field188 = var9;
		} catch (RuntimeException var14) {
			signlink.reporterror("61951, " + arg0 + ", " + var14.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.t(I)V")
	public void method95() {
		try {
			this.field253 = new class19(this.field322, "titlebox", 0);
			this.field254 = new class19(this.field322, "titlebutton", 0);
			this.field383 = new class19[12];
			for (int var1 = 0; var1 < 12; var1++) {
				this.field383[var1] = new class19(this.field322, "runes", var1);
			}
			this.field381 = new class40(128, 265);
			this.field382 = new class40(128, 265);
			for (int var2 = 0; var2 < 33920; var2++) {
				this.field381.field1175[var2] = this.field331.field1402[var2];
			}
			for (int var3 = 0; var3 < 33920; var3++) {
				this.field382.field1175[var3] = this.field332.field1402[var3];
			}
			this.field449 = new int[256];
			for (int var4 = 0; var4 < 64; var4++) {
				this.field449[var4] = var4 * 262144;
			}
			for (int var5 = 0; var5 < 64; var5++) {
				this.field449[var5 + 64] = var5 * 1024 + 16711680;
			}
			for (int var6 = 0; var6 < 64; var6++) {
				this.field449[var6 + 128] = var6 * 4 + 16776960;
			}
			for (int var7 = 0; var7 < 64; var7++) {
				this.field449[var7 + 192] = 16777215;
			}
			this.field450 = new int[256];
			for (int var8 = 0; var8 < 64; var8++) {
				this.field450[var8] = var8 * 1024;
			}
			for (int var9 = 0; var9 < 64; var9++) {
				this.field450[var9 + 64] = var9 * 4 + 65280;
			}
			for (int var10 = 0; var10 < 64; var10++) {
				this.field450[var10 + 128] = var10 * 262144 + 65535;
			}
			for (int var11 = 0; var11 < 64; var11++) {
				this.field450[var11 + 192] = 16777215;
			}
			this.field451 = new int[256];
			for (int var12 = 0; var12 < 64; var12++) {
				this.field451[var12] = var12 * 4;
			}
			for (int var13 = 0; var13 < 64; var13++) {
				this.field451[var13 + 64] = var13 * 262144 + 255;
			}
			for (int var14 = 0; var14 < 64; var14++) {
				this.field451[var14 + 128] = var14 * 1024 + 16711935;
			}
			for (int var15 = 0; var15 < 64; var15++) {
				this.field451[var15 + 192] = 16777215;
			}
			this.field448 = new int[256];
			this.field216 = new int[32768];
			this.field217 = new int[32768];
			this.method65(null);
			this.field458 = new int[32768];
			this.field459 = new int[32768];
			this.method24("Connecting to fileserver", (byte) 8, 10);
			if (!this.field353) {
				this.field262 = true;
				this.field353 = true;
				this.method23(this, 2);
			}
		} catch (RuntimeException var17) {
			signlink.reporterror("6714, " + -909 + ", " + var17.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.u(I)V")
	public void method96() {
		try {
			try {
				int var1 = field299.field67 + this.field287;
				int var2 = field299.field68 + this.field574;
				if (this.field480 - var1 < -500 || this.field480 - var1 > 500 || this.field481 - var2 < -500 || this.field481 - var2 > 500) {
					this.field480 = var1;
					this.field481 = var2;
				}
				if (this.field480 != var1) {
					this.field480 += (var1 - this.field480) / 16;
				}
				if (this.field481 != var2) {
					this.field481 += (var2 - this.field481) / 16;
				}
				if (super.field102[1] == 1) {
					this.field634 += (-this.field634 - 24) / 2;
				} else if (super.field102[2] == 1) {
					this.field634 += (24 - this.field634) / 2;
				} else {
					this.field634 /= 2;
				}
				if (super.field102[3] == 1) {
					this.field635 += (12 - this.field635) / 2;
				} else if (super.field102[4] == 1) {
					this.field635 += (-this.field635 - 12) / 2;
				} else {
					this.field635 /= 2;
				}
				this.field633 = this.field633 + this.field634 / 2 & 0x7FF;
				this.field632 += this.field635 / 2;
				if (this.field632 < 128) {
					this.field632 = 128;
				}
				if (this.field632 > 383) {
					this.field632 = 383;
				}
				int var3 = this.field480 >> 7;
				int var4 = this.field481 >> 7;
				int var5 = this.method129(this.field480, this.field481, this.field180);
				int var6 = 0;
				if (var3 > 3 && var4 > 3 && var3 < 100 && var4 < 100) {
					for (int var7 = var3 - 4; var7 <= var3 + 4; var7++) {
						for (int var8 = var4 - 4; var8 <= var4 + 4; var8++) {
							int var9 = this.field180;
							if (var9 < 3 && (this.field238[1][var7][var8] & 0x2) == 2) {
								var9++;
							}
							int var10 = var5 - this.field622[var9][var7][var8];
							if (var10 > var6) {
								var6 = var10;
							}
						}
					}
				}
				int var11 = var6 * 192;
				if (var11 > 98048) {
					var11 = 98048;
				}
				if (var11 < 32768) {
					var11 = 32768;
				}
				if (var11 > this.field325) {
					this.field325 += (var11 - this.field325) / 24;
				} else if (var11 < this.field325) {
					this.field325 += (var11 - this.field325) / 80;
				}
			} catch (Exception var13) {
				signlink.reporterror("glfc_ex " + field299.field67 + "," + field299.field68 + "," + this.field480 + "," + this.field481 + "," + this.field472 + "," + this.field473 + "," + this.field609 + "," + this.field610);
				throw new RuntimeException("eek");
			}
		} catch (RuntimeException var14) {
			signlink.reporterror("53989, " + ", " + var14.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.a(IBIIII)V")
	public void method97(int arg0, int arg1, int arg2, int arg3, int arg4) {
		try {
			int var6 = this.field407.method554(arg1, arg3, arg2);
			if (var6 != 0) {
				int var7 = this.field407.method558(arg1, arg3, arg2, var6);
				int var8 = var7 >> 6 & 0x3;
				int var9 = var7 & 0x1F;
				int var10 = arg0;
				if (var6 > 0) {
					var10 = arg4;
				}
				int[] var11 = this.field440.field1175;
				int var12 = arg3 * 4 + (103 - arg2) * 512 * 4 + 24624;
				int var13 = var6 >> 14 & 0x7FFF;
				class14 var14 = class14.method192(var13);
				if (var14.field733 == -1) {
					if (var9 == 0 || var9 == 2) {
						if (var8 == 0) {
							var11[var12] = var10;
							var11[var12 + 512] = var10;
							var11[var12 + 1024] = var10;
							var11[var12 + 1536] = var10;
						} else if (var8 == 1) {
							var11[var12] = var10;
							var11[var12 + 1] = var10;
							var11[var12 + 2] = var10;
							var11[var12 + 3] = var10;
						} else if (var8 == 2) {
							var11[var12 + 3] = var10;
							var11[var12 + 3 + 512] = var10;
							var11[var12 + 3 + 1024] = var10;
							var11[var12 + 3 + 1536] = var10;
						} else if (var8 == 3) {
							var11[var12 + 1536] = var10;
							var11[var12 + 1536 + 1] = var10;
							var11[var12 + 1536 + 2] = var10;
							var11[var12 + 1536 + 3] = var10;
						}
					}
					if (var9 == 3) {
						if (var8 == 0) {
							var11[var12] = var10;
						} else if (var8 == 1) {
							var11[var12 + 3] = var10;
						} else if (var8 == 2) {
							var11[var12 + 3 + 1536] = var10;
						} else if (var8 == 3) {
							var11[var12 + 1536] = var10;
						}
					}
					if (var9 == 2) {
						if (var8 == 3) {
							var11[var12] = var10;
							var11[var12 + 512] = var10;
							var11[var12 + 1024] = var10;
							var11[var12 + 1536] = var10;
						} else if (var8 == 0) {
							var11[var12] = var10;
							var11[var12 + 1] = var10;
							var11[var12 + 2] = var10;
							var11[var12 + 3] = var10;
						} else if (var8 == 1) {
							var11[var12 + 3] = var10;
							var11[var12 + 3 + 512] = var10;
							var11[var12 + 3 + 1024] = var10;
							var11[var12 + 3 + 1536] = var10;
						} else if (var8 == 2) {
							var11[var12 + 1536] = var10;
							var11[var12 + 1536 + 1] = var10;
							var11[var12 + 1536 + 2] = var10;
							var11[var12 + 1536 + 3] = var10;
						}
					}
				} else {
					class19 var15 = this.field304[var14.field733];
					if (var15 != null) {
						int var16 = (var14.field708 * 4 - var15.field800) / 2;
						int var17 = (var14.field703 * 4 - var15.field801) / 2;
						var15.method270(arg3 * 4 + var16 + 48, this.field527, (104 - arg2 - var14.field703) * 4 + var17 + 48);
					}
				}
			}
			int var18 = this.field407.method556(arg1, arg3, arg2);
			if (var18 != 0) {
				int var19 = this.field407.method558(arg1, arg3, arg2, var18);
				int var20 = var19 >> 6 & 0x3;
				int var21 = var19 & 0x1F;
				int var22 = var18 >> 14 & 0x7FFF;
				class14 var23 = class14.method192(var22);
				if (var23.field733 != -1) {
					class19 var24 = this.field304[var23.field733];
					if (var24 != null) {
						int var25 = (var23.field708 * 4 - var24.field800) / 2;
						int var26 = (var23.field703 * 4 - var24.field801) / 2;
						var24.method270(arg3 * 4 + var25 + 48, this.field527, (104 - arg2 - var23.field703) * 4 + var26 + 48);
					}
				} else if (var21 == 9) {
					int var27 = 15658734;
					if (var18 > 0) {
						var27 = 15597568;
					}
					int[] var28 = this.field440.field1175;
					int var29 = arg3 * 4 + (103 - arg2) * 512 * 4 + 24624;
					if (var20 == 0 || var20 == 2) {
						var28[var29 + 1536] = var27;
						var28[var29 + 1024 + 1] = var27;
						var28[var29 + 512 + 2] = var27;
						var28[var29 + 3] = var27;
					} else {
						var28[var29] = var27;
						var28[var29 + 512 + 1] = var27;
						var28[var29 + 1024 + 2] = var27;
						var28[var29 + 1536 + 3] = var27;
					}
				}
			}
			int var30 = this.field407.method557(arg1, arg3, arg2);
			if (var30 != 0) {
				int var31 = var30 >> 14 & 0x7FFF;
				class14 var32 = class14.method192(var31);
				if (var32.field733 != -1) {
					class19 var33 = this.field304[var32.field733];
					if (var33 != null) {
						int var34 = (var32.field708 * 4 - var33.field800) / 2;
						int var35 = (var32.field703 * 4 - var33.field801) / 2;
						var33.method270(arg3 * 4 + var34 + 48, this.field527, (104 - arg2 - var32.field703) * 4 + var35 + 48);
						return;
					}
				}
			}
		} catch (RuntimeException var37) {
			signlink.reporterror("69809, " + arg0 + ", " + 30 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + var37.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.e(I)V")
	@Override
	public void method20(int arg0) {
		try {
			if (this.field543 || this.field508 || this.field408) {
				this.method89();
			} else {
				field505++;
				if (this.field578) {
					this.method142();
				} else {
					this.method149(false);
				}
				this.field415 = 0;
				if (arg0 != -26684) {
					this.field434 = this.field222.method224();
				}
			}
		} catch (RuntimeException var3) {
			signlink.reporterror("22595, " + arg0 + ", " + var3.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.a(IIILAWOZVMFS;I)V")
	public void method98(int arg0, int arg1, int arg2, class5 arg3) {
		try {
			if (arg3 != field299 && this.field412 < 400) {
				String var5;
				if (arg3.field114 == 0) {
					var5 = arg3.field129 + method104(arg3.field121, field299.field121) + " (level-" + arg3.field121 + ")";
				} else {
					var5 = arg3.field129 + " (skill-" + arg3.field114 + ")";
				}
				if (this.field545 == 1) {
					this.field273[this.field412] = "Use " + this.field549 + " with @whi@" + var5;
					this.field348[this.field412] = 703;
					this.field349[this.field412] = arg1;
					this.field346[this.field412] = arg0;
					this.field347[this.field412] = arg2;
					this.field412++;
				} else if (this.field636 != 1) {
					for (int var6 = 4; var6 >= 0; var6--) {
						if (this.field595[var6] != null) {
							this.field273[this.field412] = this.field595[var6] + " @whi@" + var5;
							short var7 = 0;
							if (this.field595[var6].equalsIgnoreCase("attack")) {
								if (arg3.field121 > field299.field121) {
									var7 = 2000;
								}
								if (field299.field130 != 0 && arg3.field130 != 0) {
									if (field299.field130 == arg3.field130) {
										var7 = 2000;
									} else {
										var7 = 0;
									}
								}
							} else if (this.field596[var6]) {
								var7 = 2000;
							}
							if (var6 == 0) {
								this.field348[this.field412] = var7 + 883;
							}
							if (var6 == 1) {
								this.field348[this.field412] = var7 + 145;
							}
							if (var6 == 2) {
								this.field348[this.field412] = var7 + 359;
							}
							if (var6 == 3) {
								this.field348[this.field412] = var7 + 896;
							}
							if (var6 == 4) {
								this.field348[this.field412] = var7 + 233;
							}
							this.field349[this.field412] = arg1;
							this.field346[this.field412] = arg0;
							this.field347[this.field412] = arg2;
							this.field412++;
						}
					}
				} else if ((this.field638 & 0x8) == 8) {
					this.field273[this.field412] = this.field639 + " @whi@" + var5;
					this.field348[this.field412] = 621;
					this.field349[this.field412] = arg1;
					this.field346[this.field412] = arg0;
					this.field347[this.field412] = arg2;
					this.field412++;
				}
				for (int var8 = 0; var8 < this.field412; var8++) {
					if (this.field348[var8] == 16) {
						this.field273[var8] = "Walk here @whi@" + var5;
						return;
					}
				}
			}
		} catch (RuntimeException var10) {
			signlink.reporterror("64356, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 3 + ", " + var10.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.a(LIRYXZZFE;Z)Z")
	public boolean method99(class27 arg0) {
		try {
			int var2 = arg0.field891;
			if (var2 >= 1 && var2 <= 200 || !(var2 < 701 || var2 > 900)) {
				if (var2 >= 801) {
					var2 -= 701;
				} else if (var2 >= 701) {
					var2 -= 601;
				} else if (var2 >= 101) {
					var2 -= 101;
				} else {
					var2--;
				}
				this.field273[this.field412] = "Remove @whi@" + this.field523[var2];
				this.field348[this.field412] = 526;
				this.field412++;
				this.field273[this.field412] = "Message @whi@" + this.field523[var2];
				this.field348[this.field412] = 247;
				this.field412++;
				return true;
			} else if (var2 >= 401 && var2 <= 500) {
				this.field273[this.field412] = "Remove @whi@" + arg0.field918;
				this.field348[this.field412] = 212;
				this.field412++;
				return true;
			} else {
				return false;
			}
		} catch (RuntimeException var4) {
			signlink.reporterror("47613, " + arg0 + ", " + false + ", " + var4.toString());
			throw new RuntimeException();
		}
	}

	@Override
	public URL getCodeBase() {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getCodeBase();
		}
		try {
			if (super.field87 != null) {
				return new URL("http://127.0.0.1:" + (field235 + 80));
			}
		} catch (Exception var1) {
		}
		return super.getCodeBase();
	}

	@ObfuscatedName("client.v(I)V")
	public void method100() {
		try {
			if (this.field243 != 0) {
				class34 var1 = this.field423;
				int var2 = 0;
				if (this.field470 != 0) {
					var2 = 1;
				}
				for (int var3 = 0; var3 < 100; var3++) {
					if (this.field560[var3] != null) {
						int var4 = this.field558[var3];
						String var5 = this.field559[var3];
						byte var6 = 0;
						if (var5 != null && var5.startsWith("@cr1@")) {
							var5 = var5.substring(5);
							var6 = 1;
						}
						if (var5 != null && var5.startsWith("@cr2@")) {
							var5 = var5.substring(5);
							var6 = 2;
						}
						if ((var4 == 3 || var4 == 7) && (var4 == 7 || this.field355 == 0 || this.field355 == 1 && this.method179(var5))) {
							int var7 = 329 - var2 * 13;
							var1.method377("From", var7, 4, 0);
							var1.method377("From", var7 - 1, 4, 65535);
							int var8 = var1.method375("From ") + 4;
							if (var6 == 1) {
								this.field493[0].method270(var8, this.field527, var7 - 12);
								var8 += 14;
							}
							if (var6 == 2) {
								this.field493[1].method270(var8, this.field527, var7 - 12);
								var8 += 14;
							}
							var1.method377(var5 + ": " + this.field560[var3], var7, var8, 0);
							var1.method377(var5 + ": " + this.field560[var3], var7 - 1, var8, 65535);
							var2++;
							if (var2 >= 5) {
								return;
							}
						}
						if (var4 == 5 && this.field355 < 2) {
							int var9 = 329 - var2 * 13;
							var1.method377(this.field560[var3], var9, 4, 0);
							var1.method377(this.field560[var3], var9 - 1, 4, 65535);
							var2++;
							if (var2 >= 5) {
								return;
							}
						}
						if (var4 == 6 && this.field355 < 2) {
							int var10 = 329 - var2 * 13;
							var1.method377("To " + var5 + ": " + this.field560[var3], var10, 4, 0);
							var1.method377("To " + var5 + ": " + this.field560[var3], var10 - 1, 4, 65535);
							var2++;
							if (var2 >= 5) {
								return;
							}
						}
					}
				}
			}
		} catch (RuntimeException var12) {
			signlink.reporterror("24944, " + 33 + ", " + var12.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.a(IIII)Z")
	public boolean method101(int arg0, int arg1, int arg2) {
		try {
			int var4 = arg1 >> 14 & 0x7FFF;
			int var5 = this.field407.method558(this.field180, arg0, arg2, arg1);
			if (var5 == -1) {
				return false;
			}
			int var6 = var5 & 0x1F;
			int var7 = var5 >> 6 & 0x3;
			field590++;
			if (field590 > 1184) {
				field590 = 0;
				this.field623.method213(127);
				this.field623.method214(0);
				int var8 = this.field623.field779;
				this.field623.method215(8709);
				this.field623.method215(18795);
				if ((int) (Math.random() * 2.0D) == 0) {
					this.field623.method214(235);
				}
				this.field623.method214(38);
				if ((int) (Math.random() * 2.0D) == 0) {
					this.field623.method215(55800);
				}
				if ((int) (Math.random() * 2.0D) == 0) {
					this.field623.method215(42667);
				}
				if ((int) (Math.random() * 2.0D) == 0) {
					this.field623.method214(1);
				}
				this.field623.method214(163);
				this.field623.method215(42960);
				if ((int) (Math.random() * 2.0D) == 0) {
					this.field623.method214(194);
				}
				this.field623.method223(this.field623.field779 - var8, this.field241);
			}
			if (var6 == 10 || var6 == 11 || var6 == 22) {
				class14 var9 = class14.method192(var4);
				int var10;
				int var11;
				if (var7 == 0 || var7 == 2) {
					var10 = var9.field708;
					var11 = var9.field703;
				} else {
					var10 = var9.field703;
					var11 = var9.field708;
				}
				int var12 = var9.field737;
				if (var7 != 0) {
					var12 = (var12 << var7 & 0xF) + (var12 >> 4 - var7);
				}
				this.method155(arg0, (byte) 6, arg2, 2, var11, field299.field38[0], false, var12, field299.field37[0], 0, var10, 0);
			} else {
				this.method155(arg0, (byte) 6, arg2, 2, 0, field299.field38[0], false, 0, field299.field37[0], var7, 0, var6 + 1);
			}
			this.field247 = super.field99;
			this.field248 = super.field100;
			this.field250 = 2;
			this.field249 = 0;
			return true;
		} catch (RuntimeException var14) {
			signlink.reporterror("93382, " + 1 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + var14.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.a(IILAPSQOGBV;)V")
	public void method102(int arg0, class3 arg1) {
		try {
			this.method103(arg1.field68, arg0, arg1.field67);
		} catch (RuntimeException var4) {
			signlink.reporterror("10202, " + -14612 + ", " + arg0 + ", " + arg1 + ", " + var4.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.b(IIII)V")
	public void method103(int arg0, int arg1, int arg2) {
		try {
			if (arg2 >= 128 && arg0 >= 128 && arg2 <= 13056 && arg0 <= 13056) {
				int var4 = this.method129(arg2, arg0, this.field180) - arg1;
				int var17 = arg2 - this.field184;
				int var5 = var4 - this.field185;
				int var14 = arg0 - this.field186;
				int var6 = class31.field1063[this.field187];
				int var7 = class31.field1064[this.field187];
				int var8 = class31.field1063[this.field188];
				int var9 = class31.field1064[this.field188];
				int var10 = var14 * var8 + var17 * var9 >> 16;
				int var15 = var14 * var9 - var17 * var8 >> 16;
				int var11 = var5 * var7 - var15 * var6 >> 16;
				int var16 = var5 * var6 + var15 * var7 >> 16;
				if (var16 >= 50) {
					this.field390 = class21.field816 + (var10 << 9) / var16;
					this.field391 = class21.field817 + (var11 << 9) / var16;
				} else {
					this.field390 = -1;
					this.field391 = -1;
				}
			} else {
				this.field390 = -1;
				this.field391 = -1;
			}
		} catch (RuntimeException var13) {
			signlink.reporterror("97586, " + 4 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + var13.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.w(I)V")
	public void method105(int arg0) {
		try {
			if (this.field491 == null) {
				this.method60();
				super.field85 = null;
				this.field328 = null;
				this.field329 = null;
				this.field330 = null;
				this.field331 = null;
				this.field332 = null;
				this.field333 = null;
				this.field334 = null;
				this.field335 = null;
				if (arg0 != 0) {
					this.field406 = null;
				}
				this.field336 = null;
				this.field491 = new class58(479, false, this.method22(), 96);
				this.field489 = new class58(172, false, this.method22(), 156);
				class26.method313();
				this.field431.method270(0, this.field527, 0);
				this.field488 = new class58(190, false, this.method22(), 261);
				this.field490 = new class58(512, false, this.method22(), 334);
				class26.method313();
				this.field318 = new class58(496, false, this.method22(), 50);
				this.field319 = new class58(269, false, this.method22(), 37);
				this.field320 = new class58(249, false, this.method22(), 45);
				this.field399 = true;
				this.field490.method463();
				class21.field822 = this.field428;
			}
		} catch (RuntimeException var3) {
			signlink.reporterror("87295, " + arg0 + ", " + var3.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.a(ZILNPWLDXJE;II)V")
	public void method106(int arg0, class37 arg1, int arg2, int arg3) {
		try {
			if (this.field412 < 400) {
				if (arg1.field1119 != null) {
					arg1 = arg1.method389();
				}
				if (arg1 != null && arg1.field1128) {
					String var5 = arg1.field1142;
					if (arg1.field1137 != 0) {
						var5 = var5 + method104(arg1.field1137, field299.field121) + " (level-" + arg1.field1137 + ")";
					}
					if (this.field545 == 1) {
						this.field273[this.field412] = "Use " + this.field549 + " with @yel@" + var5;
						this.field348[this.field412] = 646;
						this.field349[this.field412] = arg0;
						this.field346[this.field412] = arg3;
						this.field347[this.field412] = arg2;
						this.field412++;
					} else if (this.field636 != 1) {
						if (arg1.field1133 != null) {
							for (int var6 = 4; var6 >= 0; var6--) {
								if (arg1.field1133[var6] != null && !arg1.field1133[var6].equalsIgnoreCase("attack")) {
									this.field273[this.field412] = arg1.field1133[var6] + " @yel@" + var5;
									if (var6 == 0) {
										this.field348[this.field412] = 447;
									}
									if (var6 == 1) {
										this.field348[this.field412] = 24;
									}
									if (var6 == 2) {
										this.field348[this.field412] = 851;
									}
									if (var6 == 3) {
										this.field348[this.field412] = 515;
									}
									if (var6 == 4) {
										this.field348[this.field412] = 983;
									}
									this.field349[this.field412] = arg0;
									this.field346[this.field412] = arg3;
									this.field347[this.field412] = arg2;
									this.field412++;
								}
							}
						}
						if (arg1.field1133 != null) {
							for (int var7 = 4; var7 >= 0; var7--) {
								if (arg1.field1133[var7] != null && arg1.field1133[var7].equalsIgnoreCase("attack")) {
									short var8 = 0;
									if (arg1.field1137 > field299.field121) {
										var8 = 2000;
									}
									this.field273[this.field412] = arg1.field1133[var7] + " @yel@" + var5;
									if (var7 == 0) {
										this.field348[this.field412] = var8 + 447;
									}
									if (var7 == 1) {
										this.field348[this.field412] = var8 + 24;
									}
									if (var7 == 2) {
										this.field348[this.field412] = var8 + 851;
									}
									if (var7 == 3) {
										this.field348[this.field412] = var8 + 515;
									}
									if (var7 == 4) {
										this.field348[this.field412] = var8 + 983;
									}
									this.field349[this.field412] = arg0;
									this.field346[this.field412] = arg3;
									this.field347[this.field412] = arg2;
									this.field412++;
								}
							}
						}
						this.field273[this.field412] = "Examine @yel@" + var5;
						this.field348[this.field412] = 1335;
						this.field349[this.field412] = arg0;
						this.field346[this.field412] = arg3;
						this.field347[this.field412] = arg2;
						this.field412++;
					} else if ((this.field638 & 0x2) == 2) {
						this.field273[this.field412] = this.field639 + " @yel@" + var5;
						this.field348[this.field412] = 403;
						this.field349[this.field412] = arg0;
						this.field346[this.field412] = arg3;
						this.field347[this.field412] = arg2;
						this.field412++;
						return;
					}
				}
			}
		} catch (RuntimeException var10) {
			signlink.reporterror("49426, " + true + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + var10.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.b(IB)Ljava/lang/String;")
	public String method107(int arg0) {
		try {
			return arg0 < 999999999 ? String.valueOf(arg0) : "*";
		} catch (RuntimeException var3) {
			signlink.reporterror("90576, " + arg0 + ", " + 93 + ", " + var3.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.a(Ljava/lang/String;ILjava/lang/String;IBI)LBBMKAXRK;")
	public class6 method108(String arg0, int arg1, String arg2, int arg3, int arg4) {
		try {
			byte[] var6 = null;
			int var7 = 5;
			try {
				if (this.field554[0] != null) {
					var6 = this.field554[0].method31(arg4);
				}
			} catch (Exception var29) {
			}
			if (var6 != null) {
				this.field172.reset();
				this.field172.update(var6);
				int var8 = (int) this.field172.getValue();
				if (var8 != arg1) {
					var6 = null;
				}
			}
			if (var6 != null) {
				return new class6((byte) 70, var6);
			}
			int var10 = 0;
			while (var6 == null) {
				String var11 = "Unknown error";
				this.method24("Requesting " + arg0, (byte) 8, arg3);
				try {
					int var12 = 0;
					DataInputStream var13 = this.method121(arg2 + arg1);
					byte[] var14 = new byte[6];
					var13.readFully(var14, 0, 6);
					class17 var15 = new class17(var14, -26583);
					var15.field779 = 3;
					int var16 = var15.method228() + 6;
					int var17 = 6;
					var6 = new byte[var16];
					for (int var18 = 0; var18 < 6; var18++) {
						var6[var18] = var14[var18];
					}
					while (var17 < var16) {
						int var19 = var16 - var17;
						if (var19 > 1000) {
							var19 = 1000;
						}
						int var20 = var13.read(var6, var17, var19);
						if (var20 < 0) {
							(new StringBuffer("Length error: ")).append(var17).append("/").append(var16).toString();
							throw new IOException("EOF");
						}
						var17 += var20;
						int var21 = var17 * 100 / var16;
						if (var21 != var12) {
							this.method24("Loading " + arg0 + " - " + var21 + "%", (byte) 8, arg3);
						}
						var12 = var21;
					}
					var13.close();
					try {
						if (this.field554[0] != null) {
							this.field554[0].method32(var6.length, var6, arg4);
						}
					} catch (Exception var28) {
						this.field554[0] = null;
					}
					if (var6 != null) {
						this.field172.reset();
						this.field172.update(var6);
						int var22 = (int) this.field172.getValue();
						if (var22 != arg1) {
							var6 = null;
							var10++;
							var11 = "Checksum error: " + var22;
						}
					}
				} catch (IOException var30) {
					if (var11.equals("Unknown error")) {
						var11 = "Connection error";
					}
					var6 = null;
				} catch (NullPointerException var31) {
					var11 = "Null error";
					var6 = null;
					if (!signlink.reporterror) {
						return null;
					}
				} catch (ArrayIndexOutOfBoundsException var32) {
					var11 = "Bounds error";
					var6 = null;
					if (!signlink.reporterror) {
						return null;
					}
				} catch (Exception var33) {
					var11 = "Unexpected error";
					var6 = null;
					if (!signlink.reporterror) {
						return null;
					}
				}
				if (var6 == null) {
					for (int var24 = var7; var24 > 0; var24--) {
						if (var10 >= 3) {
							this.method24("Game updated - please reload page", (byte) 8, arg3);
							var24 = 10;
						} else {
							this.method24(var11 + " - Retrying in " + var24, (byte) 8, arg3);
						}
						try {
							Thread.sleep(1000L);
						} catch (Exception var27) {
						}
					}
					var7 *= 2;
					if (var7 > 60) {
						var7 = 60;
					}
					this.field511 = !this.field511;
				}
			}
			return new class6((byte) 70, var6);
		} catch (RuntimeException var34) {
			signlink.reporterror("59950, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + -64 + ", " + arg4 + ", " + var34.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.x(I)V")
	public void method109() {
		try {
			if (this.field328 == null) {
				super.field85 = null;
				this.field491 = null;
				this.field489 = null;
				this.field488 = null;
				this.field490 = null;
				this.field318 = null;
				this.field319 = null;
				this.field320 = null;
				this.field331 = new class58(128, false, this.method22(), 265);
				class26.method313();
				this.field332 = new class58(128, false, this.method22(), 265);
				class26.method313();
				this.field328 = new class58(509, false, this.method22(), 171);
				class26.method313();
				this.field329 = new class58(360, false, this.method22(), 132);
				class26.method313();
				this.field330 = new class58(360, false, this.method22(), 200);
				class26.method313();
				this.field333 = new class58(202, false, this.method22(), 238);
				class26.method313();
				this.field334 = new class58(203, false, this.method22(), 238);
				class26.method313();
				this.field335 = new class58(74, false, this.method22(), 94);
				class26.method313();
				this.field336 = new class58(75, false, this.method22(), 94);
				class26.method313();
				if (this.field322 != null) {
					this.method120();
					this.method95();
				}
				this.field399 = true;
			}
		} catch (RuntimeException var2) {
			signlink.reporterror("39265, " + 740 + ", " + var2.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.y(I)V")
	public void method110() {
		try {
			for (int var1 = -1; var1 < this.field565; var1++) {
				int var2;
				if (var1 == -1) {
					var2 = this.field563;
				} else {
					var2 = this.field566[var1];
				}
				class5 var3 = this.field564[var2];
				if (var3 != null) {
					this.method136(var3, 1);
				}
			}
		} catch (RuntimeException var5) {
			signlink.reporterror("70999, " + 3 + ", " + var5.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.a(IZLEILHLJCE;)V")
	public void method111(int arg0, class17 arg1) {
		try {
			while (true) {
				if (arg1.field780 + 21 < arg0 * 8) {
					int var3 = arg1.method235(14);
					if (var3 != 16383) {
						if (this.field231[var3] == null) {
							this.field231[var3] = new class43();
						}
						class43 var4 = this.field231[var3];
						this.field233[this.field232++] = var3;
						var4.field32 = field553;
						int var5 = arg1.method235(1);
						var4.field1213 = class37.method393(arg1.method235(13));
						int var6 = arg1.method235(1);
						if (var6 == 1) {
							this.field568[this.field567++] = var3;
						}
						int var7 = arg1.method235(5);
						if (var7 > 15) {
							var7 -= 32;
						}
						int var8 = arg1.method235(5);
						if (var8 > 15) {
							var8 -= 32;
						}
						var4.field54 = var4.field1213.field1127;
						var4.field40 = var4.field1213.field1140;
						var4.field20 = var4.field1213.field1151;
						var4.field21 = var4.field1213.field1136;
						var4.field22 = var4.field1213.field1123;
						var4.field23 = var4.field1213.field1149;
						var4.field70 = var4.field1213.field1141;
						var4.method11(field299.field37[0] + var8, field299.field38[0] + var7, var5 == 1);
						continue;
					}
				}
				arg1.method236();
				return;
			}
		} catch (RuntimeException var10) {
			signlink.reporterror("60000, " + arg0 + ", " + true + ", " + arg1 + ", " + var10.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.b(LIRYXZZFE;Z)V")
	public void method112(class27 arg0, boolean arg1) {
		try {
			int var3 = arg0.field891;
			if (arg1) {
				this.field529 = !this.field529;
			}
			if ((var3 < 1 || var3 > 100) && (var3 < 701 || var3 > 800)) {
				if (var3 >= 101 && var3 <= 200 || var3 >= 801 && var3 <= 900) {
					int var5 = this.field173;
					if (this.field174 != 2) {
						var5 = 0;
					}
					if (var3 > 800) {
						var3 -= 701;
					} else {
						var3 -= 101;
					}
					if (var3 >= var5) {
						arg0.field918 = "";
						arg0.field934 = 0;
					} else {
						if (this.field456[var3] == 0) {
							arg0.field918 = "@red@Offline";
						} else if (this.field456[var3] < 200) {
							if (this.field456[var3] == field234) {
								arg0.field918 = "@gre@World" + (this.field456[var3] - 9);
							} else {
								arg0.field918 = "@yel@World" + (this.field456[var3] - 9);
							}
						} else if (this.field456[var3] == field234) {
							arg0.field918 = "@gre@Classic" + (this.field456[var3] - 219);
						} else {
							arg0.field918 = "@yel@Classic" + (this.field456[var3] - 219);
						}
						arg0.field934 = 1;
					}
				} else if (var3 == 203) {
					int var6 = this.field173;
					if (this.field174 != 2) {
						var6 = 0;
					}
					arg0.field921 = var6 * 15 + 20;
					if (arg0.field921 <= arg0.field910) {
						arg0.field921 = arg0.field910 + 1;
					}
				} else if (var3 >= 401 && var3 <= 500) {
					var3 -= 401;
					if (var3 == 0 && this.field174 == 0) {
						arg0.field918 = "Loading ignore list";
						arg0.field934 = 0;
					} else if (var3 == 1 && this.field174 == 0) {
						arg0.field918 = "Please wait...";
						arg0.field934 = 0;
					} else {
						int var7 = this.field225;
						if (this.field174 == 0) {
							var7 = 0;
						}
						if (var3 >= var7) {
							arg0.field918 = "";
							arg0.field934 = 0;
						} else {
							arg0.field918 = class33.method370(class33.method367(this.field577[var3]));
							arg0.field934 = 1;
						}
					}
				} else if (var3 == 503) {
					arg0.field921 = this.field225 * 15 + 20;
					if (arg0.field921 <= arg0.field910) {
						arg0.field921 = arg0.field910 + 1;
					}
				} else if (var3 == 327) {
					arg0.field950 = 150;
					arg0.field951 = (int) (Math.sin((double) field553 / 40.0D) * 256.0D) & 0x7FF;
					if (this.field257) {
						for (int var8 = 0; var8 < 7; var8++) {
							int var9 = this.field389[var8];
							if (var9 >= 0 && !class54.field1357[var9].method455()) {
								return;
							}
						}
						this.field257 = false;
						class31[] var10 = new class31[7];
						int var11 = 0;
						for (int var12 = 0; var12 < 7; var12++) {
							int var13 = this.field389[var12];
							if (var13 >= 0) {
								var10[var11++] = class54.field1357[var13].method456();
							}
						}
						class31 var14 = new class31(var11, var10, 5);
						for (int var15 = 0; var15 < 5; var15++) {
							if (this.field646[var15] != 0) {
								var14.method353(field457[var15][0], field457[var15][this.field646[var15]]);
								if (var15 == 1) {
									var14.method353(field603[0], field603[this.field646[var15]]);
								}
							}
						}
						var14.method346(311);
						var14.method347(class41.field1184[field299.field70].field1186[0]);
						var14.method356(64, 850, -30, -50, -30, true);
						arg0.field924 = 5;
						arg0.field925 = 0;
						class27.method331(var14, this.field445);
					}
				} else if (var3 == 324) {
					if (this.field626 == null) {
						this.field626 = arg0.field927;
						this.field627 = arg0.field930;
					}
					if (this.field613) {
						arg0.field927 = this.field627;
					} else {
						arg0.field927 = this.field626;
					}
				} else if (var3 == 325) {
					if (this.field626 == null) {
						this.field626 = arg0.field927;
						this.field627 = arg0.field930;
					}
					if (this.field613) {
						arg0.field927 = this.field626;
					} else {
						arg0.field927 = this.field627;
					}
				} else if (var3 == 600) {
					arg0.field918 = this.field597;
					if (field553 % 20 < 10) {
						arg0.field918 = arg0.field918 + "|";
					} else {
						arg0.field918 = arg0.field918 + " ";
					}
				} else {
					if (var3 == 620) {
						if (this.field181 < 1) {
							arg0.field918 = "";
						} else if (this.field487) {
							arg0.field892 = 16711680;
							arg0.field918 = "Moderator option: Mute player for 48 hours: <ON>";
						} else {
							arg0.field892 = 16777215;
							arg0.field918 = "Moderator option: Mute player for 48 hours: <OFF>";
						}
					}
					if (var3 == 660) {
						int var16 = this.field510 - this.field504;
						String var17;
						if (var16 <= 0) {
							var17 = "earlier today";
						} else if (var16 == 1) {
							var17 = "yesterday";
						} else {
							var17 = var16 + " days ago";
						}
						arg0.field918 = "You last logged in @red@" + var17 + "@bla@ from: @red@" + signlink.dns;
					}
					if (var3 == 661) {
						if (this.field413 == 0) {
							arg0.field918 = "\\nYou have not yet set any recovery questions.\\nIt is @lre@strongly@yel@ recommended that you do so.\\n\\nIf you don't you will be @lre@unable to recover your\\n@lre@password@yel@ if you forget it, or it is stolen.";
						} else if (this.field413 <= this.field510) {
							arg0.field918 = "\\n\\nRecovery Questions Last Set:\\n@gre@" + this.method113(this.field413);
						} else {
							int var18 = this.field510 + 14 - this.field413;
							String var19;
							if (var18 <= 0) {
								var19 = "Earlier today";
							} else if (var18 == 1) {
								var19 = "Yesterday";
							} else {
								var19 = var18 + " days ago";
							}
							arg0.field918 = var19 + " you requested@lre@ new recovery\\n@lre@questions.@yel@ The requested change will occur\\non: @lre@" + this.method113(this.field413) + "\\n\\nIf you do not remember making this request\\ncancel it immediately, and change your password.";
						}
					}
					if (var3 == 662) {
						String var20;
						if (this.field251 == 0) {
							var20 = "@yel@0 unread messages";
						} else if (this.field251 == 1) {
							var20 = "@gre@1 unread message";
						} else {
							var20 = "@gre@" + this.field251 + " unread messages";
						}
						arg0.field918 = "You have " + var20 + "\\nin your message centre.";
					}
					if (var3 == 663) {
						if (this.field402 > 0 && this.field402 <= this.field510 + 10) {
							arg0.field918 = "Last password change:\\n@gre@" + this.method113(this.field402);
						} else {
							arg0.field918 = "Last password change:\\n@gre@Never changed";
						}
					}
					if (var3 == 664) {
						if (this.field344 == 0) {
							arg0.field918 = "You have not yet set\\nany contact details.";
						}
						if (this.field344 == 1) {
							arg0.field918 = "Contact Details Last Set:\\n@gre@" + this.method113(this.field376);
						}
						if (this.field344 == 2) {
							arg0.field918 = "You need to set\\nnew contact details.";
						}
					}
					if (var3 == 665) {
						if (this.field224 > 2 && !field236) {
							arg0.field918 = "This is a non-members\\nworld. To enjoy your\\nmembers benefits we\\nrecommend you play on a\\nmembers world instead.";
						} else if (this.field224 > 2) {
							arg0.field918 = "\\n\\nYou have @gre@" + this.field224 + "@yel@ days of\\nmember credit remaining.";
						} else if (this.field224 > 0) {
							arg0.field918 = "You have @gre@" + this.field224 + "@yel@ days of\\nmember credit remaining.\\n\\n@lre@Credit low! Renew now\\n@lre@to avoid losing members.";
						} else {
							arg0.field918 = "You are not a member.\\n\\nChoose to subscribe and\\nyou'll get loads of extra\\nbenefits and features.";
						}
					}
					if (var3 == 667) {
						if (this.field224 > 2 && !field236) {
							arg0.field918 = "To switch to a members-only world:\\n1) Logout and return to the world selection page.\\n2) Choose one of the members world with a gold star next to it's name.\\n\\nIf you prefer you can continue to use this world,\\nbut members only features will be unavailable here.";
						} else if (this.field224 > 0) {
							arg0.field918 = "To extend or cancel a subscription:\\n1) Logout and return to the frontpage of this website.\\n2)Choose the relevant option from the 'membership' section.\\n\\nNote: If you are a credit card subscriber a top-up payment will\\nautomatically be taken when 3 days credit remain.\\n(unless you cancel your subscription, which can be done at any time.)";
						} else {
							arg0.field918 = "To start a subscripton:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Start a new subscription'";
						}
					}
					if (var3 == 668) {
						if (this.field413 > this.field510) {
							arg0.field918 = "To cancel this request:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Cancel recovery questions'.";
						} else {
							arg0.field918 = "To change your recovery questions:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Set new recovery questions'.";
						}
					}
				}
			} else if (var3 == 1 && this.field174 == 0) {
				arg0.field918 = "Loading friend list";
				arg0.field934 = 0;
			} else if (var3 == 1 && this.field174 == 1) {
				arg0.field918 = "Connecting to friendserver";
				arg0.field934 = 0;
			} else if (var3 == 2 && this.field174 != 2) {
				arg0.field918 = "Please wait...";
				arg0.field934 = 0;
			} else {
				int var4 = this.field173;
				if (this.field174 != 2) {
					var4 = 0;
				}
				if (var3 > 700) {
					var3 -= 601;
				} else {
					var3--;
				}
				if (var3 >= var4) {
					arg0.field918 = "";
					arg0.field934 = 0;
				} else {
					arg0.field918 = this.field523[var3];
					arg0.field934 = 1;
				}
			}
		} catch (RuntimeException var22) {
			signlink.reporterror("72466, " + arg0 + ", " + arg1 + ", " + var22.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.c(BI)Ljava/lang/String;")
	public String method113(int arg0) {
		try {
			if (arg0 > this.field510 + 10) {
				return "Unknown";
			}
			long var2 = ((long) arg0 + 11745L) * 86400000L;
			Calendar var4 = Calendar.getInstance();
			var4.setTime(new Date(var2));
			int var5 = var4.get(5);
			int var6 = var4.get(2);
			int var7 = var4.get(1);
			String[] var8 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
			return var5 + "-" + var8[var6] + "-" + var7;
		} catch (RuntimeException var10) {
			signlink.reporterror("41270, " + 8 + ", " + arg0 + ", " + var10.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.a(Ljava/lang/String;BI)V")
	@Override
	public void method24(String arg0, byte arg1, int arg2) {
		try {
			this.field256 = arg2;
			this.field604 = arg0;
			this.method109();
			if (this.field322 == null) {
				super.method24(arg0, (byte) 8, arg2);
			} else {
				this.field330.method463();
				this.field424.method373(16777215, "RuneScape is loading - please wait...", 180, 54);
				boolean var6 = false;
				class26.method316(62, 304, 28, 34, 9179409);
				class26.method316(63, 302, 29, 32, 0);
				class26.method315(9179409, 30, 99, arg2 * 3, 30, 64);
				class26.method315(0, arg2 * 3 + 30, 99, 300 - arg2 * 3, 30, 64);
				this.field424.method373(16777215, arg0, 180, 85);
				this.field330.method464(171, super.field84, 202);
				if (this.field399) {
					this.field399 = false;
					if (!this.field353) {
						this.field331.method464(0, super.field84, 0);
						this.field332.method464(0, super.field84, 637);
					}
					this.field328.method464(0, super.field84, 128);
					this.field329.method464(371, super.field84, 202);
					this.field333.method464(265, super.field84, 0);
					this.field334.method464(265, super.field84, 562);
					this.field335.method464(171, super.field84, 128);
					this.field336.method464(171, super.field84, 562);
				}
			}
		} catch (RuntimeException var5) {
			signlink.reporterror("44943, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + var5.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.b(JI)V")
	public void method114(long arg0, int arg1) {
		try {
			if (arg1 != 0) {
				this.field406 = null;
			}
			if (arg0 != 0L) {
				for (int var4 = 0; var4 < this.field225; var4++) {
					if (this.field577[var4] == arg0) {
						this.field225--;
						this.field541 = true;
						for (int var5 = var4; var5 < this.field225; var5++) {
							this.field577[var5] = this.field577[var5 + 1];
						}
						this.field623.method213(146);
						this.field623.method220(arg0);
						return;
					}
				}
			}
		} catch (RuntimeException var7) {
			signlink.reporterror("92832, " + arg0 + ", " + arg1 + ", " + var7.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.a(LODBDSPMH;ZII)V")
	public void method115(class40 arg0, boolean arg1, int arg2, int arg3) {
		try {
			int var5 = arg3 * arg3 + arg2 * arg2;
			if (arg1) {
				this.method17();
			}
			if (var5 > 4225 && var5 < 90000) {
				int var6 = this.field633 + this.field323 & 0x7FF;
				int var7 = class31.field1063[var6];
				int var8 = class31.field1064[var6];
				int var9 = var7 * 256 / (this.field599 + 256);
				int var10 = var8 * 256 / (this.field599 + 256);
				int var11 = arg2 * var9 + arg3 * var10 >> 16;
				int var12 = arg2 * var10 - arg3 * var9 >> 16;
				double var13 = Math.atan2((double) var11, (double) var12);
				int var15 = (int) (Math.sin(var13) * 63.0D);
				int var16 = (int) (Math.cos(var13) * 57.0D);
				this.field280.method409(var15 + 94 + 4 - 10, var13, 83 - var16 - 20);
			} else {
				this.method178(arg0, arg2, arg3);
			}
		} catch (RuntimeException var18) {
			signlink.reporterror("27897, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + var18.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.z(I)V")
	public void method116() {
		try {
			if (super.field85 == null) {
				this.method60();
				this.field328 = null;
				this.field329 = null;
				this.field330 = null;
				this.field331 = null;
				this.field332 = null;
				this.field333 = null;
				this.field334 = null;
				this.field335 = null;
				this.field336 = null;
				this.field491 = null;
				this.field489 = null;
				this.field488 = null;
				this.field490 = null;
				this.field318 = null;
				this.field319 = null;
				this.field320 = null;
				super.field85 = new class58(765, false, this.method22(), 503);
				this.field399 = true;
			}
		} catch (RuntimeException var2) {
			signlink.reporterror("87483, " + 5 + ", " + var2.toString());
			throw new RuntimeException();
		}
	}

	@Override
	public void run() {
		if (this.field262) {
			this.method75();
		} else {
			super.run();
		}
	}

	@ObfuscatedName("client.e(Z)Z")
	public boolean method117() {
		try {
			return signlink.wavereplay();
		} catch (RuntimeException var2) {
			signlink.reporterror("26925, " + true + ", " + var2.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.A(I)V")
	public void method118() {
		try {
			for (class23 var1 = (class23) this.field525.method275(); var1 != null; var1 = (class23) this.field525.method277()) {
				if (var1.field851 == -1) {
					var1.field856 = 0;
					this.method160(var1);
				} else {
					var1.method334();
				}
			}
		} catch (RuntimeException var3) {
			signlink.reporterror("79592, " + 159 + ", " + var3.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.a()V")
	@Override
	public void method17() {
		this.method24("Starting up", (byte) 8, 20);
		if (signlink.sunjava) {
			super.field78 = 5;
		}
		if (field284) {
			this.field543 = true;
			return;
		}
		field284 = true;
		boolean var1 = false;
		String var2 = this.method58(267);
		if (var2.endsWith("jagex.com")) {
			var1 = true;
		}
		if (var2.endsWith("runescape.com")) {
			var1 = true;
		}
		if (var2.endsWith("192.168.1.2")) {
			var1 = true;
		}
		if (var2.endsWith("192.168.1.231")) {
			var1 = true;
		}
		if (var2.endsWith("192.168.1.229")) {
			var1 = true;
		}
		if (var2.endsWith("192.168.1.228")) {
			var1 = true;
		}
		if (var2.endsWith("192.168.1.227")) {
			var1 = true;
		}
		if (var2.endsWith("192.168.1.226")) {
			var1 = true;
		}
		if (var2.endsWith("192.168.1.224")) {
			var1 = true;
		}
		if (var2.endsWith("192.168.1.223")) {
			var1 = true;
		}
		if (var2.endsWith("127.0.0.1")) {
			var1 = true;
		}
		if (!var1) {
			this.field408 = true;
			return;
		}
		if (signlink.cache_dat != null) {
			for (int var3 = 0; var3 < 5; var3++) {
				this.field554[var3] = new class7(signlink.cache_dat, (byte) 6, signlink.cache_idx[var3], var3 + 1, 500000);
			}
		}
		try {
			this.method134();
			this.field322 = this.method108("title screen", this.field306[1], "title", 25, 1);
			this.field422 = new class34(this.field322, 2, "p11_full", false);
			this.field423 = new class34(this.field322, 2, "p12_full", false);
			this.field424 = new class34(this.field322, 2, "b12_full", false);
			this.field425 = new class34(this.field322, 2, "q8_full", true);
			this.method120();
			this.method95();
			class6 var4 = this.method108("config", this.field306[2], "config", 30, 2);
			class6 var5 = this.method108("interface", this.field306[3], "interface", 35, 3);
			class6 var6 = this.method108("2d graphics", this.field306[4], "media", 40, 4);
			class6 var7 = this.method108("textures", this.field306[6], "textures", 45, 6);
			class6 var8 = this.method108("chat system", this.field306[7], "wordenc", 50, 7);
			class6 var9 = this.method108("sound effects", this.field306[8], "sounds", 55, 8);
			this.field238 = new byte[4][104][104];
			this.field622 = new int[4][105][105];
			this.field407 = new class68(104, 104, this.field622, 4, -160);
			for (int var10 = 0; var10 < 4; var10++) {
				this.field385[var10] = new class16((byte) 6, 104, 104);
			}
			this.field440 = new class40(512, 512);
			class6 var11 = this.method108("update list", this.field306[5], "versionlist", 60, 5);
			this.method24("Connecting to update server", (byte) 8, 60);
			this.field602 = new class71();
			this.field602.method593(var11, this);
			class25.method305(this.field602.method597());
			class31.method336(this.field602.method588(0), this.field602);
			if (!field237) {
				this.field452 = 0;
				this.field453 = true;
				this.field602.method585(2, this.field452);
				while (this.field602.method594() > 0) {
					this.method177();
					try {
						Thread.sleep(100L);
					} catch (Exception var71) {
					}
					if (this.field602.field1671 > 3) {
						this.method46("ondemand");
						return;
					}
				}
			}
			this.method24("Requesting animations", (byte) 8, 65);
			int var12 = this.field602.method588(1);
			for (int var13 = 0; var13 < var12; var13++) {
				this.field602.method585(1, var13);
			}
			while (this.field602.method594() > 0) {
				int var14 = var12 - this.field602.method594();
				if (var14 > 0) {
					this.method24("Loading animations - " + var14 * 100 / var12 + "%", (byte) 8, 65);
				}
				this.method177();
				try {
					Thread.sleep(100L);
				} catch (Exception var70) {
				}
				if (this.field602.field1671 > 3) {
					this.method46("ondemand");
					return;
				}
			}
			this.method24("Requesting models", (byte) 8, 70);
			int var15 = this.field602.method588(0);
			for (int var16 = 0; var16 < var15; var16++) {
				int var17 = this.field602.method592(var16);
				if ((var17 & 0x1) != 0) {
					this.field602.method585(0, var16);
				}
			}
			int var18 = this.field602.method594();
			while (this.field602.method594() > 0) {
				int var19 = var18 - this.field602.method594();
				if (var19 > 0) {
					this.method24("Loading models - " + var19 * 100 / var18 + "%", (byte) 8, 70);
				}
				this.method177();
				try {
					Thread.sleep(100L);
				} catch (Exception var69) {
				}
			}
			if (this.field554[0] != null) {
				this.method24("Requesting maps", (byte) 8, 75);
				this.field602.method585(3, this.field602.method601(48, 47, 0));
				this.field602.method585(3, this.field602.method601(48, 47, 1));
				this.field602.method585(3, this.field602.method601(48, 48, 0));
				this.field602.method585(3, this.field602.method601(48, 48, 1));
				this.field602.method585(3, this.field602.method601(48, 49, 0));
				this.field602.method585(3, this.field602.method601(48, 49, 1));
				this.field602.method585(3, this.field602.method601(47, 47, 0));
				this.field602.method585(3, this.field602.method601(47, 47, 1));
				this.field602.method585(3, this.field602.method601(47, 48, 0));
				this.field602.method585(3, this.field602.method601(47, 48, 1));
				this.field602.method585(3, this.field602.method601(148, 48, 0));
				this.field602.method585(3, this.field602.method601(148, 48, 1));
				int var20 = this.field602.method594();
				while (this.field602.method594() > 0) {
					int var21 = var20 - this.field602.method594();
					if (var21 > 0) {
						this.method24("Loading maps - " + var21 * 100 / var20 + "%", (byte) 8, 75);
					}
					this.method177();
					try {
						Thread.sleep(100L);
					} catch (Exception var68) {
					}
				}
			}
			int var22 = this.field602.method588(0);
			for (int var23 = 0; var23 < var22; var23++) {
				int var24 = this.field602.method592(var23);
				byte var25 = 0;
				if ((var24 & 0x8) != 0) {
					var25 = 10;
				} else if ((var24 & 0x20) != 0) {
					var25 = 9;
				} else if ((var24 & 0x10) != 0) {
					var25 = 8;
				} else if ((var24 & 0x40) != 0) {
					var25 = 7;
				} else if ((var24 & 0x80) != 0) {
					var25 = 6;
				} else if ((var24 & 0x2) != 0) {
					var25 = 5;
				} else if ((var24 & 0x4) != 0) {
					var25 = 4;
				}
				if ((var24 & 0x1) != 0) {
					var25 = 3;
				}
				if (var25 != 0) {
					this.field602.method584(var23, 0, var25);
				}
			}
			this.field602.method595(field236);
			if (!field237) {
				int var26 = this.field602.method588(2);
				for (int var27 = 1; var27 < var26; var27++) {
					if (this.field602.method586(var27)) {
						this.field602.method584(var27, 2, (byte) 1);
					}
				}
			}
			this.method24("Unpacking media", (byte) 8, 80);
			this.field430 = new class19(var6, "invback", 0);
			this.field432 = new class19(var6, "chatback", 0);
			this.field431 = new class19(var6, "mapback", 0);
			this.field475 = new class19(var6, "backbase1", 0);
			this.field476 = new class19(var6, "backbase2", 0);
			this.field477 = new class19(var6, "backhmid1", 0);
			for (int var28 = 0; var28 < 13; var28++) {
				this.field495[var28] = new class19(var6, "sideicons", var28);
			}
			this.field644 = new class40(var6, "compass", 0);
			this.field280 = new class40(var6, "mapedge", 0);
			this.field280.method401();
			for (int var29 = 0; var29 < 72; var29++) {
				this.field304[var29] = new class19(var6, "mapscene", var29);
			}
			for (int var30 = 0; var30 < 63; var30++) {
				this.field384[var30] = new class40(var6, "mapfunction", var30);
			}
			for (int var31 = 0; var31 < 5; var31++) {
				this.field645[var31] = new class40(var6, "hitmarks", var31);
			}
			for (int var32 = 0; var32 < 6; var32++) {
				this.field301[var32] = new class40(var6, "headicons_pk", var32);
			}
			for (int var33 = 0; var33 < 9; var33++) {
				this.field366[var33] = new class40(var6, "headicons_prayer", var33);
			}
			for (int var34 = 0; var34 < 6; var34++) {
				this.field351[var34] = new class40(var6, "headicons_hint", var34);
			}
			this.field163 = new class40(var6, "overlay_multiway", 0);
			this.field310 = new class40(var6, "mapmarker", 0);
			this.field311 = new class40(var6, "mapmarker", 1);
			for (int var35 = 0; var35 < 8; var35++) {
				this.field364[var35] = new class40(var6, "cross", var35);
			}
			this.field196 = new class40(var6, "mapdots", 0);
			this.field197 = new class40(var6, "mapdots", 1);
			this.field198 = new class40(var6, "mapdots", 2);
			this.field199 = new class40(var6, "mapdots", 3);
			this.field200 = new class40(var6, "mapdots", 4);
			this.field478 = new class19(var6, "scrollbar", 0);
			this.field479 = new class19(var6, "scrollbar", 1);
			this.field535 = new class19(var6, "redstone1", 0);
			this.field536 = new class19(var6, "redstone2", 0);
			this.field537 = new class19(var6, "redstone3", 0);
			this.field538 = new class19(var6, "redstone1", 0);
			this.field538.method267();
			this.field539 = new class19(var6, "redstone2", 0);
			this.field539.method267();
			this.field417 = new class19(var6, "redstone1", 0);
			this.field417.method268();
			this.field418 = new class19(var6, "redstone2", 0);
			this.field418.method268();
			this.field419 = new class19(var6, "redstone3", 0);
			this.field419.method268();
			this.field420 = new class19(var6, "redstone1", 0);
			this.field420.method267();
			this.field420.method268();
			this.field421 = new class19(var6, "redstone2", 0);
			this.field421.method267();
			this.field421.method268();
			for (int var36 = 0; var36 < 2; var36++) {
				this.field493[var36] = new class19(var6, "mod_icons", var36);
			}
			class40 var37 = new class40(var6, "backleft1", 0);
			this.field204 = new class58(var37.field1176, false, this.method22(), var37.field1177);
			var37.method402(0, 0);
			class40 var38 = new class40(var6, "backleft2", 0);
			this.field205 = new class58(var38.field1176, false, this.method22(), var38.field1177);
			var38.method402(0, 0);
			class40 var39 = new class40(var6, "backright1", 0);
			this.field206 = new class58(var39.field1176, false, this.method22(), var39.field1177);
			var39.method402(0, 0);
			class40 var40 = new class40(var6, "backright2", 0);
			this.field207 = new class58(var40.field1176, false, this.method22(), var40.field1177);
			var40.method402(0, 0);
			class40 var41 = new class40(var6, "backtop1", 0);
			this.field208 = new class58(var41.field1176, false, this.method22(), var41.field1177);
			var41.method402(0, 0);
			class40 var42 = new class40(var6, "backvmid1", 0);
			this.field209 = new class58(var42.field1176, false, this.method22(), var42.field1177);
			var42.method402(0, 0);
			class40 var43 = new class40(var6, "backvmid2", 0);
			this.field210 = new class58(var43.field1176, false, this.method22(), var43.field1177);
			var43.method402(0, 0);
			class40 var44 = new class40(var6, "backvmid3", 0);
			this.field211 = new class58(var44.field1176, false, this.method22(), var44.field1177);
			var44.method402(0, 0);
			class40 var45 = new class40(var6, "backhmid2", 0);
			this.field212 = new class58(var45.field1176, false, this.method22(), var45.field1177);
			var45.method402(0, 0);
			int var46 = (int) (Math.random() * 21.0D) - 10;
			int var47 = (int) (Math.random() * 21.0D) - 10;
			int var48 = (int) (Math.random() * 21.0D) - 10;
			int var49 = (int) (Math.random() * 41.0D) - 20;
			for (int var50 = 0; var50 < 100; var50++) {
				if (this.field384[var50] != null) {
					this.field384[var50].method400(var48 + var49, var46 + var49, var47 + var49);
				}
				if (this.field304[var50] != null) {
					this.field304[var50].method269(var48 + var49, var46 + var49, var47 + var49);
				}
			}
			this.method24("Unpacking textures", (byte) 8, 83);
			class21.method285(var7);
			class21.method289(0.8D);
			class21.method284();
			this.method24("Unpacking config", (byte) 8, 86);
			class41.method412(var4);
			class14.method187(var4);
			class52.method449(var4);
			class67.method518(var4);
			class37.method391(var4);
			class54.method453(var4);
			class55.method459(var4);
			class28.method332(var4);
			class51.method447(var4);
			class67.field1501 = field236;
			if (!field237) {
				this.method24("Unpacking sounds", (byte) 8, 90);
				byte[] var51 = var9.method30("sounds.dat", null);
				class17 var52 = new class17(var51, -26583);
				class22.method297(var52);
			}
			this.method24("Unpacking interfaces", (byte) 8, 95);
			class34[] var53 = new class34[] { this.field422, this.field423, this.field424, this.field425 };
			class27.method322(var6, var5, var53);
			this.method24("Preparing game engine", (byte) 8, 100);
			for (int var54 = 0; var54 < 33; var54++) {
				int var55 = 999;
				int var56 = 0;
				for (int var57 = 0; var57 < 34; var57++) {
					if (this.field431.field798[var57 + var54 * this.field431.field800] == 0) {
						if (var55 == 999) {
							var55 = var57;
						}
					} else if (var55 != 999) {
						var56 = var57;
						break;
					}
				}
				this.field404[var54] = var55;
				this.field343[var54] = var56 - var55;
			}
			for (int var58 = 5; var58 < 156; var58++) {
				int var59 = 999;
				int var60 = 0;
				for (int var61 = 25; var61 < 172; var61++) {
					if (this.field431.field798[var61 + var58 * this.field431.field800] == 0 && (var61 > 34 || var58 > 34)) {
						if (var59 == 999) {
							var59 = var61;
						}
					} else if (var59 != 999) {
						var60 = var61;
						break;
					}
				}
				this.field354[var58 - 5] = var59 - 25;
				this.field540[var58 - 5] = var60 - var59;
			}
			class21.method282(477, 503, 765);
			this.field429 = class21.field822;
			class21.method282(477, 96, 479);
			this.field426 = class21.field822;
			class21.method282(477, 261, 190);
			this.field427 = class21.field822;
			class21.method282(477, 334, 512);
			this.field428 = class21.field822;
			int[] var62 = new int[9];
			for (int var63 = 0; var63 < 9; var63++) {
				int var64 = var63 * 32 + 128 + 15;
				int var65 = var64 * 3 + 600;
				int var66 = class21.field820[var64];
				var62[var63] = var65 * var66 >> 16;
			}
			class68.method564(var62);
			class65.method476(var8);
			this.field242 = new class59(0, this);
			this.method23(this.field242, 10);
			class57.field1395 = this;
			class14.field700 = this;
			class37.field1121 = this;
		} catch (Exception var72) {
			signlink.reporterror("loaderror " + this.field604 + " " + this.field256);
			this.field508 = true;
		}
	}

	@Override
	public String getParameter(String arg0) {
		return signlink.mainapp == null ? super.getParameter(arg0) : signlink.mainapp.getParameter(arg0);
	}

	@ObfuscatedName("client.B(I)V")
	public void method119() {
		try {
			if (this.field412 >= 2 || this.field545 != 0 || this.field636 != 0) {
				String var1;
				if (this.field545 == 1 && this.field412 < 2) {
					var1 = "Use " + this.field549 + " with...";
				} else if (this.field636 == 1 && this.field412 < 2) {
					var1 = this.field639 + "...";
				} else {
					var1 = this.field273[this.field412 - 1];
				}
				if (this.field412 > 2) {
					var1 = var1 + "@whi@ / " + (this.field412 - 2) + " more options";
				}
				this.field424.method382(16777215, var1, 15, field553 / 1000, 4);
			}
		} catch (RuntimeException var3) {
			signlink.reporterror("48009, " + 5 + ", " + var3.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.C(I)V")
	public void method120() {
		try {
			byte[] var1 = this.field322.method30("title.dat", null);
			class40 var2 = new class40(var1, this);
			this.field331.method463();
			var2.method402(0, 0);
			this.field332.method463();
			var2.method402(0, -637);
			this.field328.method463();
			var2.method402(0, -128);
			this.field329.method463();
			var2.method402(-371, -202);
			this.field330.method463();
			var2.method402(-171, -202);
			this.field333.method463();
			var2.method402(-265, 0);
			this.field334.method463();
			var2.method402(-265, -562);
			this.field335.method463();
			var2.method402(-171, -128);
			this.field336.method463();
			var2.method402(-171, -562);
			int[] var3 = new int[var2.field1176];
			for (int var4 = 0; var4 < var2.field1177; var4++) {
				for (int var5 = 0; var5 < var2.field1176; var5++) {
					var3[var5] = var2.field1175[var2.field1176 + var2.field1176 * var4 - var5 - 1];
				}
				for (int var6 = 0; var6 < var2.field1176; var6++) {
					var2.field1175[var6 + var2.field1176 * var4] = var3[var6];
				}
			}
			this.field331.method463();
			var2.method402(0, 382);
			this.field332.method463();
			var2.method402(0, -255);
			this.field328.method463();
			var2.method402(0, 254);
			this.field329.method463();
			var2.method402(-371, 180);
			this.field330.method463();
			var2.method402(-171, 180);
			this.field333.method463();
			var2.method402(-265, 382);
			this.field334.method463();
			var2.method402(-265, -180);
			this.field335.method463();
			var2.method402(-171, 254);
			this.field336.method463();
			var2.method402(-171, -180);
			class40 var7 = new class40(this.field322, "logo", 0);
			this.field328.method463();
			var7.method404(382 - var7.field1176 / 2 - 128, this.field527, 18);
			System.gc();
		} catch (RuntimeException var9) {
			signlink.reporterror("11391, " + -324 + ", " + var9.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.b(Ljava/lang/String;)Ljava/io/DataInputStream;")
	public DataInputStream method121(String arg0) throws IOException {
		if (this.field511) {
			if (this.field177 != null) {
				try {
					this.field177.close();
				} catch (Exception var4) {
				}
				this.field177 = null;
			}
			this.field177 = this.method85(43595);
			this.field177.setSoTimeout(10000);
			InputStream var2 = this.field177.getInputStream();
			OutputStream var3 = this.field177.getOutputStream();
			var3.write(("JAGGRAB /" + arg0 + "\n\n").getBytes());
			return new DataInputStream(var2);
		} else if (signlink.mainapp == null) {
			return new DataInputStream((new URL(this.getCodeBase(), arg0)).openStream());
		} else {
			return signlink.openurl(arg0);
		}
	}

	@ObfuscatedName("client.h(B)V")
	public void method122() {
		try {
			for (int var1 = 0; var1 < this.field615; var1++) {
				if (this.field267[var1] <= 0) {
					boolean var2 = false;
					try {
						if (this.field555[var1] != this.field606 || this.field303[var1] != this.field293) {
							class17 var3 = class22.method298(this.field303[var1], this.field555[var1]);
							if (System.currentTimeMillis() + (long) (var3.field779 / 22) > this.field411 + (long) (this.field202 / 22)) {
								this.field202 = var3.field779;
								this.field411 = System.currentTimeMillis();
								if (this.method64(var3.field779, var3.field778)) {
									this.field606 = this.field555[var1];
									this.field293 = this.field303[var1];
								} else {
									var2 = true;
								}
							}
						} else if (!this.method117()) {
							var2 = true;
						}
					} catch (Exception var7) {
					}
					if (var2 && this.field267[var1] != -5) {
						this.field267[var1] = -5;
					} else {
						this.field615--;
						for (int var5 = var1; var5 < this.field615; var5++) {
							this.field555[var5] = this.field555[var5 + 1];
							this.field303[var5] = this.field303[var5 + 1];
							this.field267[var5] = this.field267[var5 + 1];
						}
						var1--;
					}
				} else {
					int var10002 = this.field267[var1]--;
				}
			}
			if (this.field522 > 0) {
				this.field522 -= 20;
				if (this.field522 < 0) {
					this.field522 = 0;
				}
				if (this.field522 == 0 && this.field379 && !field237) {
					this.field452 = this.field223;
					this.field453 = true;
					this.field602.method585(2, this.field452);
					return;
				}
			}
		} catch (RuntimeException var8) {
			signlink.reporterror("67142, " + 8 + ", " + var8.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.i(B)V")
	public void method123() {
		try {
			if (field237 && this.field179 == 2 && class44.field1232 != this.field180) {
				this.method72(this.field607, "Loading - please wait.", null);
				this.field179 = 1;
				this.field240 = System.currentTimeMillis();
			}
			if (this.field179 == 1) {
				int var1 = this.method124();
				if (var1 != 0 && System.currentTimeMillis() - this.field240 > 360000L) {
					signlink.reporterror(this.field169 + " glcfb " + this.field517 + "," + var1 + "," + field237 + "," + this.field554[0] + "," + this.field602.method594() + "," + this.field180 + "," + this.field472 + "," + this.field473);
					this.field240 = System.currentTimeMillis();
				}
			}
			if (this.field179 == 2 && this.field180 != this.field252) {
				this.field252 = this.field180;
				this.method87(this.field180);
			}
		} catch (RuntimeException var3) {
			signlink.reporterror("50214, " + 16 + ", " + var3.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.D(I)I")
	public int method124() {
		try {
			for (int var1 = 0; var1 < this.field416.length; var1++) {
				if (this.field416[var1] == null && this.field190[var1] != -1) {
					return -1;
				}
				if (this.field305[var1] == null && this.field191[var1] != -1) {
					return -2;
				}
			}
			boolean var2 = true;
			for (int var3 = 0; var3 < this.field416.length; var3++) {
				byte[] var4 = this.field305[var3];
				if (var4 != null) {
					int var5 = (this.field189[var3] >> 8) * 64 - this.field609;
					int var6 = (this.field189[var3] & 0xFF) * 64 - this.field610;
					if (this.field509) {
						var5 = 10;
						var6 = 10;
					}
					var2 &= class44.method433(var4, var5, var6);
				}
			}
			if (!var2) {
				return -3;
			} else if (this.field266) {
				return -4;
			} else {
				this.field179 = 2;
				class44.field1232 = this.field180;
				this.method145(this.field605);
				this.field623.method213(210);
				return 0;
			}
		} catch (RuntimeException var8) {
			signlink.reporterror("60186, " + -417 + ", " + var8.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.E(I)V")
	public void method125() {
		try {
			if (this.field437 > 0) {
				this.method71();
			} else {
				this.method72(this.field607, "Connection lost", "Please wait - attempting to reestablish");
				this.field594 = 0;
				this.field438 = 0;
				class1 var1 = this.field579;
				this.field578 = false;
				this.field598 = 0;
				this.method161(this.field169, this.field170, true);
				if (!this.field578) {
					this.method71();
				}
				try {
					var1.method1();
				} catch (Exception var3) {
				}
			}
		} catch (RuntimeException var4) {
			signlink.reporterror("24858, " + 38851 + ", " + var4.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.a(ILjava/lang/String;Ljava/lang/String;I)V")
	public void method126(int arg0, String arg1, String arg2) {
		try {
			if (arg0 == 0 && this.field629 != -1) {
				this.field321 = arg1;
				super.field98 = 0;
			}
			if (this.field499 == -1) {
				this.field642 = true;
			}
			for (int var4 = 99; var4 > 0; var4--) {
				this.field558[var4] = this.field558[var4 - 1];
				this.field559[var4] = this.field559[var4 - 1];
				this.field560[var4] = this.field560[var4 - 1];
			}
			this.field558[0] = arg0;
			this.field559[0] = arg2;
			this.field560[0] = arg1;
		} catch (RuntimeException var6) {
			signlink.reporterror("69775, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + ", " + var6.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.F(I)V")
	public void method127() {
		try {
			if (this.field582 == 0) {
				int var1 = super.field98;
				if (this.field636 == 1 && super.field99 >= 516 && super.field100 >= 160 && super.field99 <= 765 && super.field100 <= 205) {
					var1 = 0;
				}
				if (this.field392) {
					if (var1 != 1) {
						int var2 = super.field92;
						int var3 = super.field93;
						if (this.field313 == 0) {
							var2 -= 4;
							var3 -= 4;
						}
						if (this.field313 == 1) {
							var2 -= 553;
							var3 -= 205;
						}
						if (this.field313 == 2) {
							var2 -= 17;
							var3 -= 357;
						}
						if (var2 < this.field314 - 10 || var2 > this.field314 + this.field316 + 10 || var3 < this.field315 - 10 || var3 > this.field315 + this.field317 + 10) {
							this.field392 = false;
							if (this.field313 == 1) {
								this.field541 = true;
							}
							if (this.field313 == 2) {
								this.field642 = true;
							}
						}
					}
					if (var1 == 1) {
						int var4 = this.field314;
						int var5 = this.field315;
						int var6 = this.field316;
						int var7 = super.field99;
						int var8 = super.field100;
						if (this.field313 == 0) {
							var7 -= 4;
							var8 -= 4;
						}
						if (this.field313 == 1) {
							var7 -= 553;
							var8 -= 205;
						}
						if (this.field313 == 2) {
							var7 -= 17;
							var8 -= 357;
						}
						int var9 = -1;
						for (int var10 = 0; var10 < this.field412; var10++) {
							int var11 = var5 + (this.field412 - 1 - var10) * 15 + 31;
							if (var7 > var4 && var7 < var4 + var6 && var8 > var11 - 13 && var8 < var11 + 3) {
								var9 = var10;
							}
						}
						if (var9 != -1) {
							this.method51(var9);
						}
						this.field392 = false;
						if (this.field313 == 1) {
							this.field541 = true;
						}
						if (this.field313 == 2) {
							this.field642 = true;
							return;
						}
					}
				} else {
					if (var1 == 1 && this.field412 > 0) {
						int var12 = this.field348[this.field412 - 1];
						if (var12 == 391 || var12 == 377 || var12 == 277 || var12 == 281 || var12 == 485 || var12 == 181 || var12 == 946 || var12 == 152 || var12 == 1 || var12 == 530 || var12 == 963 || var12 == 1870) {
							int var13 = this.field346[this.field412 - 1];
							int var14 = this.field347[this.field412 - 1];
							class27 var15 = class27.method329(var14);
							if (var15.field941 || var15.field896) {
								this.field544 = false;
								this.field444 = 0;
								this.field580 = var14;
								this.field581 = var13;
								this.field582 = 2;
								this.field583 = super.field99;
								this.field584 = super.field100;
								if (class27.method329(var14).field895 == this.field265) {
									this.field582 = 1;
								}
								if (class27.method329(var14).field895 == this.field499) {
									this.field582 = 3;
								}
								return;
							}
						}
					}
					if (var1 == 1 && (this.field182 == 1 || this.method77(this.field412 - 1)) && this.field412 > 2) {
						var1 = 2;
					}
					if (var1 == 1 && this.field412 > 0) {
						this.method51(this.field412 - 1);
					}
					if (var1 != 2 || this.field412 <= 0) {
						return;
					}
					this.method66(543);
				}
			}
		} catch (RuntimeException var17) {
			signlink.reporterror("94924, " + -813 + ", " + var17.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.a(ILIRYXZZFE;IIIIII)V")
	public void method128(int arg0, class27 arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		try {
			if (arg1.field922 == 0 && arg1.field911 != null && !arg1.field917 && (arg4 >= arg6 && arg3 >= arg5 && arg4 <= arg6 + arg1.field932 && arg3 <= arg5 + arg1.field910)) {
				int var8 = arg1.field911.length;
				for (int var9 = 0; var9 < var8; var9++) {
					int var10 = arg1.field933[var9] + arg6;
					int var11 = arg1.field960[var9] + arg5 - arg0;
					class27 var12 = class27.method329(arg1.field911[var9]);
					int var13 = var10 + var12.field937;
					int var14 = var11 + var12.field907;
					if ((var12.field919 >= 0 || var12.field890 != 0) && arg4 >= var13 && arg3 >= var14 && arg4 < var13 + var12.field932 && arg3 < var14 + var12.field910) {
						if (var12.field919 >= 0) {
							this.field524 = var12.field919;
						} else {
							this.field524 = var12.field914;
						}
					}
					if (var12.field922 == 8 && arg4 >= var13 && arg3 >= var14 && arg4 < var13 + var12.field932 && arg3 < var14 + var12.field910) {
						this.field394 = var12.field914;
					}
					if (var12.field922 == 0) {
						this.method128(var12.field928, var12, arg2, arg3, arg4, var14, var13);
						if (var12.field921 > var12.field910) {
							this.method62(var12, arg2, var12.field921, arg4, var13 + var12.field932, arg3, var12.field910, var14);
						}
					} else {
						if (var12.field934 == 1 && arg4 >= var13 && arg3 >= var14 && arg4 < var13 + var12.field932 && arg3 < var14 + var12.field910) {
							boolean var15 = false;
							if (var12.field891 != 0) {
								var15 = this.method99(var12);
							}
							if (!var15) {
								this.field273[this.field412] = var12.field906;
								this.field348[this.field412] = 426;
								this.field347[this.field412] = var12.field914;
								this.field412++;
							}
						}
						if (var12.field934 == 2 && this.field636 == 0 && arg4 >= var13 && arg3 >= var14 && arg4 < var13 + var12.field932 && arg3 < var14 + var12.field910) {
							String var16 = var12.field939;
							if (var16.indexOf(" ") != -1) {
								var16 = var16.substring(0, var16.indexOf(" "));
							}
							this.field273[this.field412] = var16 + " @gre@" + var12.field897;
							this.field348[this.field412] = 582;
							this.field347[this.field412] = var12.field914;
							this.field412++;
						}
						if (var12.field934 == 3 && arg4 >= var13 && arg3 >= var14 && arg4 < var13 + var12.field932 && arg3 < var14 + var12.field910) {
							this.field273[this.field412] = "Close";
							if (arg2 == 3) {
								this.field348[this.field412] = 482;
							} else {
								this.field348[this.field412] = 208;
							}
							this.field347[this.field412] = var12.field914;
							this.field412++;
						}
						if (var12.field934 == 4 && arg4 >= var13 && arg3 >= var14 && arg4 < var13 + var12.field932 && arg3 < var14 + var12.field910) {
							this.field273[this.field412] = var12.field906;
							this.field348[this.field412] = 790;
							this.field347[this.field412] = var12.field914;
							this.field412++;
						}
						if (var12.field934 == 5 && arg4 >= var13 && arg3 >= var14 && arg4 < var13 + var12.field932 && arg3 < var14 + var12.field910) {
							this.field273[this.field412] = var12.field906;
							this.field348[this.field412] = 951;
							this.field347[this.field412] = var12.field914;
							this.field412++;
						}
						if (var12.field934 == 6 && !this.field446 && arg4 >= var13 && arg3 >= var14 && arg4 < var13 + var12.field932 && arg3 < var14 + var12.field910) {
							this.field273[this.field412] = var12.field906;
							this.field348[this.field412] = 405;
							this.field347[this.field412] = var12.field914;
							this.field412++;
						}
						if (var12.field922 == 2) {
							int var17 = 0;
							for (int var18 = 0; var18 < var12.field910; var18++) {
								for (int var19 = 0; var19 < var12.field932; var19++) {
									int var20 = var13 + var19 * (var12.field942 + 32);
									int var21 = var14 + var18 * (var12.field915 + 32);
									if (var17 < 20) {
										var20 += var12.field935[var17];
										var21 += var12.field893[var17];
									}
									if (arg4 >= var20 && arg3 >= var21 && arg4 < var20 + 32 && arg3 < var21 + 32) {
										this.field531 = var17;
										this.field532 = var12.field914;
										if (var12.field947[var17] > 0) {
											class67 var22 = class67.method526(var12.field947[var17] - 1);
											if (this.field545 == 1 && var12.field905) {
												if (var12.field914 != this.field547 || var17 != this.field546) {
													this.field273[this.field412] = "Use " + this.field549 + " with @lre@" + var22.field1533;
													this.field348[this.field412] = 395;
													this.field349[this.field412] = var22.field1495;
													this.field346[this.field412] = var17;
													this.field347[this.field412] = var12.field914;
													this.field412++;
												}
											} else if (this.field636 != 1 || !var12.field905) {
												if (var12.field905) {
													for (int var23 = 4; var23 >= 3; var23--) {
														if (var22.field1530 != null && var22.field1530[var23] != null) {
															this.field273[this.field412] = var22.field1530[var23] + " @lre@" + var22.field1533;
															if (var23 == 3) {
																this.field348[this.field412] = 1;
															}
															if (var23 == 4) {
																this.field348[this.field412] = 530;
															}
															this.field349[this.field412] = var22.field1495;
															this.field346[this.field412] = var17;
															this.field347[this.field412] = var12.field914;
															this.field412++;
														} else if (var23 == 4) {
															this.field273[this.field412] = "Drop @lre@" + var22.field1533;
															this.field348[this.field412] = 530;
															this.field349[this.field412] = var22.field1495;
															this.field346[this.field412] = var17;
															this.field347[this.field412] = var12.field914;
															this.field412++;
														}
													}
												}
												if (var12.field946) {
													this.field273[this.field412] = "Use @lre@" + var22.field1533;
													this.field348[this.field412] = 963;
													this.field349[this.field412] = var22.field1495;
													this.field346[this.field412] = var17;
													this.field347[this.field412] = var12.field914;
													this.field412++;
												}
												if (var12.field905 && var22.field1530 != null) {
													for (int var24 = 2; var24 >= 0; var24--) {
														if (var22.field1530[var24] != null) {
															this.field273[this.field412] = var22.field1530[var24] + " @lre@" + var22.field1533;
															if (var24 == 0) {
																this.field348[this.field412] = 181;
															}
															if (var24 == 1) {
																this.field348[this.field412] = 946;
															}
															if (var24 == 2) {
																this.field348[this.field412] = 152;
															}
															this.field349[this.field412] = var22.field1495;
															this.field346[this.field412] = var17;
															this.field347[this.field412] = var12.field914;
															this.field412++;
														}
													}
												}
												if (var12.field902 != null) {
													for (int var25 = 4; var25 >= 0; var25--) {
														if (var12.field902[var25] != null) {
															this.field273[this.field412] = var12.field902[var25] + " @lre@" + var22.field1533;
															if (var25 == 0) {
																this.field348[this.field412] = 391;
															}
															if (var25 == 1) {
																this.field348[this.field412] = 377;
															}
															if (var25 == 2) {
																this.field348[this.field412] = 277;
															}
															if (var25 == 3) {
																this.field348[this.field412] = 281;
															}
															if (var25 == 4) {
																this.field348[this.field412] = 485;
															}
															this.field349[this.field412] = var22.field1495;
															this.field346[this.field412] = var17;
															this.field347[this.field412] = var12.field914;
															this.field412++;
														}
													}
												}
												this.field273[this.field412] = "Examine @lre@" + var22.field1533;
												this.field348[this.field412] = 1870;
												this.field349[this.field412] = var22.field1495;
												this.field346[this.field412] = var17;
												this.field347[this.field412] = var12.field914;
												this.field412++;
											} else if ((this.field638 & 0x10) == 16) {
												this.field273[this.field412] = this.field639 + " @lre@" + var22.field1533;
												this.field348[this.field412] = 789;
												this.field349[this.field412] = var22.field1495;
												this.field346[this.field412] = var17;
												this.field347[this.field412] = var12.field914;
												this.field412++;
											}
										}
									}
									var17++;
								}
							}
						}
					}
				}
			}
		} catch (RuntimeException var27) {
			signlink.reporterror("12689, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + -618 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + var27.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.a(IIBI)I")
	public int method129(int arg0, int arg1, int arg2) {
		try {
			int var4 = arg0 >> 7;
			int var5 = arg1 >> 7;
			if (var4 < 0 || var5 < 0 || var4 > 103 || var5 > 103) {
				return 0;
			}
			int var6 = arg2;
			if (arg2 < 3 && (this.field238[1][var4][var5] & 0x2) == 2) {
				var6 = arg2 + 1;
			}
			int var7 = arg0 & 0x7F;
			int var8 = arg1 & 0x7F;
			int var9 = this.field622[var6][var4][var5] * (128 - var7) + this.field622[var6][var4 + 1][var5] * var7 >> 7;
			int var10 = this.field622[var6][var4][var5 + 1] * (128 - var7) + this.field622[var6][var4 + 1][var5 + 1] * var7 >> 7;
			return var9 * (128 - var8) + var10 * var8 >> 7;
		} catch (RuntimeException var12) {
			signlink.reporterror("84376, " + arg0 + ", " + arg1 + ", " + 111 + ", " + arg2 + ", " + var12.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.b(IILEILHLJCE;)V")
	public void method131(int arg0, int arg1, class17 arg2) {
		try {
			boolean var125 = false;
			if (arg1 == 126) {
				int var4 = arg2.method226();
				int var5 = arg2.method244();
				int var6 = var5 >> 2;
				int var7 = var5 & 0x3;
				int var8 = this.field307[var6];
				int var9 = arg2.method243();
				int var10 = this.field484 + (var9 >> 4 & 0x7);
				int var11 = this.field485 + (var9 & 0x7);
				if (var10 >= 0 && var11 >= 0 && var10 < 103 && var11 < 103) {
					int var12 = this.field622[this.field180][var10][var11];
					int var13 = this.field622[this.field180][var10 + 1][var11];
					int var14 = this.field622[this.field180][var10 + 1][var11 + 1];
					int var15 = this.field622[this.field180][var10][var11 + 1];
					if (var8 == 0) {
						class38 var16 = this.field407.method550(this.field180, var10, var11);
						if (var16 != null) {
							int var17 = var16.field1163 >> 14 & 0x7FFF;
							if (var6 == 2) {
								var16.field1161 = new class57(var17, 2, var13, var4, var15, false, var7 + 4, var14, (byte) -59, var12);
								var16.field1162 = new class57(var17, 2, var13, var4, var15, false, var7 + 1 & 0x3, var14, (byte) -59, var12);
							} else {
								var16.field1161 = new class57(var17, var6, var13, var4, var15, false, var7, var14, (byte) -59, var12);
							}
						}
					}
					if (var8 == 1) {
						class35 var18 = this.field407.method551(var11, this.field180, var10);
						if (var18 != null) {
							var18.field1111 = new class57(var18.field1112 >> 14 & 0x7FFF, 4, var13, var4, var15, false, 0, var14, (byte) -59, var12);
						}
					}
					if (var8 == 2) {
						class49 var19 = this.field407.method552(this.field180, var10, var11);
						if (var6 == 11) {
							var6 = 10;
						}
						if (var19 != null) {
							var19.field1303 = new class57(var19.field1311 >> 14 & 0x7FFF, var6, var13, var4, var15, false, var7, var14, (byte) -59, var12);
						}
					}
					if (var8 == 3) {
						class29 var20 = this.field407.method553(var11, this.field180, this.field272, var10);
						if (var20 != null) {
							var20.field981 = new class57(var20.field982 >> 14 & 0x7FFF, 22, var13, var4, var15, false, var7, var14, (byte) -59, var12);
						}
					}
				}
			} else if (arg1 == 121) {
				int var21 = arg2.method245();
				int var22 = this.field484 + (var21 >> 4 & 0x7);
				int var23 = this.field485 + (var21 & 0x7);
				int var24 = arg2.method254();
				if (var22 >= 0 && var23 >= 0 && var22 < 104 && var23 < 104) {
					class20 var25 = this.field406[this.field180][var22][var23];
					if (var25 != null) {
						for (class63 var26 = (class63) var25.method275(); var26 != null; var26 = (class63) var25.method277()) {
							if (var26.field1444 == (var24 & 0x7FFF)) {
								var26.method334();
								break;
							}
						}
						if (var25.method275() == null) {
							this.field406[this.field180][var22][var23] = null;
						}
						this.method133(var22, var23);
					}
				}
			} else if (arg1 == 2) {
				int var27 = arg2.method224();
				int var28 = this.field484 + (var27 >> 4 & 0x7);
				int var29 = this.field485 + (var27 & 0x7);
				int var30 = arg2.method226();
				int var31 = arg2.method226();
				int var32 = arg2.method226();
				if (var28 >= 0 && var29 >= 0 && var28 < 104 && var29 < 104) {
					class20 var33 = this.field406[this.field180][var28][var29];
					if (var33 != null) {
						for (class63 var34 = (class63) var33.method275(); var34 != null; var34 = (class63) var33.method277()) {
							if (var34.field1444 == (var30 & 0x7FFF) && var34.field1445 == var31) {
								var34.field1445 = var32;
								break;
							}
						}
						this.method133(var28, var29);
					}
				}
			} else if (arg1 == 198) {
				int var35 = arg2.method245();
				int var36 = this.field484 + (var35 >> 4 & 0x7);
				int var37 = this.field485 + (var35 & 0x7);
				int var38 = arg2.method226();
				int var39 = arg2.method244();
				int var40 = var39 >> 2;
				int var41 = var39 & 0x3;
				int var42 = this.field307[var40];
				if (var36 >= 0 && var37 >= 0 && var36 < 104 && var37 < 104) {
					this.method82(var37, var36, this.field180, var42, var38, var41, -1, 0, var40);
				}
			} else if (arg1 == 146) {
				int var43 = arg2.method224();
				int var44 = this.field484 + (var43 >> 4 & 0x7);
				int var45 = this.field485 + (var43 & 0x7);
				int var46 = var44 + arg2.method225();
				int var47 = var45 + arg2.method225();
				int var48 = arg2.method227();
				int var49 = arg2.method226();
				int var50 = arg2.method224() * 4;
				int var51 = arg2.method224() * 4;
				int var52 = arg2.method226();
				int var53 = arg2.method226();
				int var54 = arg2.method224();
				int var55 = arg2.method224();
				if (var44 >= 0 && var45 >= 0 && var44 < 104 && var45 < 104 && var46 >= 0 && var47 >= 0 && var46 < 104 && var47 < 104 && var49 != 65535) {
					int var56 = var44 * 128 + 64;
					int var57 = var45 * 128 + 64;
					int var58 = var46 * 128 + 64;
					int var59 = var47 * 128 + 64;
					class47 var60 = new class47(var51, var53 + field553, var54, var48, var55, this.field180, 922, var56, var52 + field553, this.method129(var56, var57, this.field180) - var50, var57, var49);
					var60.method437(var59, var52 + field553, var58, this.method129(var58, var59, this.field180) - var51);
					this.field260.method272(var60);
				}
			} else {
				if (arg1 == 255) {
					int var61 = arg2.method252();
					byte var62 = arg2.method247();
					int var63 = arg2.method253();
					byte var64 = arg2.method248();
					byte var65 = arg2.method248();
					int var66 = arg2.method224();
					int var67 = this.field484 + (var66 >> 4 & 0x7);
					int var68 = this.field485 + (var66 & 0x7);
					int var69 = arg2.method254();
					int var70 = arg2.method245();
					int var71 = var70 >> 2;
					int var72 = var70 & 0x3;
					int var73 = this.field307[var71];
					byte var74 = arg2.method246();
					int var75 = arg2.method254();
					class5 var76;
					if (var61 == this.field556) {
						var76 = field299;
					} else {
						var76 = this.field564[var61];
					}
					if (var76 != null) {
						class14 var77 = class14.method192(var75);
						int var78 = this.field622[this.field180][var67][var68];
						int var79 = this.field622[this.field180][var67 + 1][var68];
						int var80 = this.field622[this.field180][var67 + 1][var68 + 1];
						int var81 = this.field622[this.field180][var67][var68 + 1];
						class31 var82 = var77.method189(var71, var72, var78, var79, var80, var81, -1);
						if (var82 != null) {
							this.method82(var68, var67, this.field180, var73, -1, 0, var69 + 1, var63 + 1, 0);
							var76.field107 = var63 + field553;
							var76.field108 = var69 + field553;
							var76.field126 = var82;
							int var83 = var77.field708;
							int var84 = var77.field703;
							if (var72 == 1 || var72 == 3) {
								var83 = var77.field703;
								var84 = var77.field708;
							}
							var76.field123 = var67 * 128 + var83 * 64;
							var76.field125 = var68 * 128 + var84 * 64;
							var76.field124 = this.method129(var76.field123, var76.field125, this.field180);
							if (var65 > var64) {
								byte var85 = var65;
								var65 = var64;
								var64 = var85;
							}
							if (var74 > var62) {
								byte var86 = var74;
								var74 = var62;
								var62 = var86;
							}
							var76.field115 = var67 + var65;
							var76.field117 = var67 + var64;
							var76.field116 = var68 + var74;
							var76.field118 = var68 + var62;
						}
					}
				}
				if (arg1 == 164) {
					int var87 = arg2.method244();
					int var88 = this.field484 + (var87 >> 4 & 0x7);
					int var89 = this.field485 + (var87 & 0x7);
					int var90 = arg2.method224();
					int var91 = var90 >> 2;
					int var92 = var90 & 0x3;
					int var93 = this.field307[var91];
					if (var88 >= 0 && var89 >= 0 && var88 < 104 && var89 < 104) {
						this.method82(var89, var88, this.field180, var93, -1, var92, -1, 0, var91);
					}
				} else if (arg1 == 250) {
					int var94 = arg2.method224();
					int var95 = this.field484 + (var94 >> 4 & 0x7);
					int var96 = this.field485 + (var94 & 0x7);
					int var97 = arg2.method253();
					int var98 = arg2.method254();
					if (var95 >= 0 && var96 >= 0 && var95 < 104 && var96 < 104) {
						class63 var99 = new class63();
						var99.field1444 = var97;
						var99.field1445 = var98;
						if (this.field406[this.field180][var95][var96] == null) {
							this.field406[this.field180][var95][var96] = new class20(807);
						}
						this.field406[this.field180][var95][var96].method272(var99);
						this.method133(var95, var96);
					}
				} else {
					if (arg1 == 40) {
						int var100 = arg2.method224();
						int var101 = this.field484 + (var100 >> 4 & 0x7);
						int var102 = this.field485 + (var100 & 0x7);
						int var103 = arg2.method226();
						int var104 = arg2.method224();
						int var105 = var104 >> 4 & 0xF;
						int var106 = var104 & 0x7;
						if (field299.field37[0] >= var101 - var105 && field299.field37[0] <= var101 + var105 && field299.field38[0] >= var102 - var105 && field299.field38[0] <= var102 + var105 && this.field282 && !field237 && this.field615 < 50) {
							this.field555[this.field615] = var103;
							this.field303[this.field615] = var106;
							this.field267[this.field615] = class22.field839[var103];
							this.field615++;
						}
					}
					if (arg1 == 65) {
						int var107 = arg2.method224();
						int var108 = this.field484 + (var107 >> 4 & 0x7);
						int var109 = this.field485 + (var107 & 0x7);
						int var110 = arg2.method253();
						int var111 = arg2.method226();
						int var112 = arg2.method226();
						if (var108 >= 0 && var109 >= 0 && var108 < 104 && var109 < 104 && var111 != this.field556) {
							class63 var113 = new class63();
							var113.field1444 = var112;
							var113.field1445 = var110;
							if (this.field406[this.field180][var108][var109] == null) {
								this.field406[this.field180][var108][var109] = new class20(807);
							}
							this.field406[this.field180][var108][var109].method272(var113);
							this.method133(var108, var109);
						}
					} else if (arg1 == 175) {
						int var114 = arg2.method224();
						int var115 = this.field484 + (var114 >> 4 & 0x7);
						int var116 = this.field485 + (var114 & 0x7);
						int var117 = arg2.method226();
						int var118 = arg2.method224();
						int var119 = arg2.method226();
						if (var115 >= 0 && var116 >= 0 && var115 < 104 && var116 < 104) {
							int var120 = var115 * 128 + 64;
							int var121 = var116 * 128 + 64;
							class69 var122 = new class69(var121, this.method129(var120, var121, this.field180) - var118, var117, this.field529, field553, this.field180, var119, var120);
							this.field308.method272(var122);
						}
					}
				}
			}
		} catch (RuntimeException var124) {
			signlink.reporterror("74758, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + var124.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.c(ZI)V")
	public void method132(int arg0) {
		try {
			int var2 = class28.field963[arg0].field971;
			if (var2 != 0) {
				int var3 = this.field643[arg0];
				if (var2 == 1) {
					if (var3 == 1) {
						class21.method289(0.9D);
					}
					if (var3 == 2) {
						class21.method289(0.8D);
					}
					if (var3 == 3) {
						class21.method289(0.7D);
					}
					if (var3 == 4) {
						class21.method289(0.6D);
					}
					class67.field1522.method199();
					this.field399 = true;
				}
				if (var2 == 3) {
					boolean var4 = this.field379;
					if (var3 == 0) {
						this.method63(this.field379, this.field576, 0);
						this.field379 = true;
					}
					if (var3 == 1) {
						this.method63(this.field379, this.field576, -400);
						this.field379 = true;
					}
					if (var3 == 2) {
						this.method63(this.field379, this.field576, -800);
						this.field379 = true;
					}
					if (var3 == 3) {
						this.method63(this.field379, this.field576, -1200);
						this.field379 = true;
					}
					if (var3 == 4) {
						this.field379 = false;
					}
					if (this.field379 != var4 && !field237) {
						if (this.field379) {
							this.field452 = this.field223;
							this.field453 = true;
							this.field602.method585(2, this.field452);
						} else {
							this.method180(this.field263);
						}
						this.field522 = 0;
					}
				}
				if (var2 == 4) {
					if (var3 == 0) {
						this.field282 = true;
						this.method156(0);
					}
					if (var3 == 1) {
						this.field282 = true;
						this.method156(-400);
					}
					if (var3 == 2) {
						this.field282 = true;
						this.method156(-800);
					}
					if (var3 == 3) {
						this.field282 = true;
						this.method156(-1200);
					}
					if (var3 == 4) {
						this.field282 = false;
					}
				}
				if (var2 == 5) {
					this.field182 = var3;
				}
				if (var2 == 6) {
					this.field624 = var3;
				}
				if (var2 == 8) {
					this.field243 = var3;
					this.field642 = true;
				}
				if (var2 == 9) {
					this.field410 = var3;
				}
			}
		} catch (RuntimeException var6) {
			signlink.reporterror("90987, " + false + ", " + arg0 + ", " + var6.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.d(II)V")
	public void method133(int arg0, int arg1) {
		class20 var3 = this.field406[this.field180][arg0][arg1];
		if (var3 == null) {
			this.field407.method549(this.field180, arg0, arg1);
			return;
		}
		int var4 = -99999999;
		class63 var5 = null;
		for (class63 var6 = (class63) var3.method275(); var6 != null; var6 = (class63) var3.method277()) {
			class67 var7 = class67.method526(var6.field1444);
			int var8 = var7.field1509;
			if (var7.field1526) {
				var8 *= var6.field1445 + 1;
			}
			if (var8 > var4) {
				var4 = var8;
				var5 = var6;
			}
		}
		var3.method273(var5);
		class63 var9 = null;
		class63 var10 = null;
		for (class63 var11 = (class63) var3.method275(); var11 != null; var11 = (class63) var3.method277()) {
			if (var11.field1444 != var5.field1444 && var9 == null) {
				var9 = var11;
			}
			if (var11.field1444 != var5.field1444 && var11.field1444 != var9.field1444 && var10 == null) {
				var10 = var11;
			}
		}
		int var12 = arg0 + (arg1 << 7) + 1610612736;
		this.field407.method535(var10, this.field180, this.method129(arg0 * 128 + 64, arg1 * 128 + 64, this.field180), arg1, arg0, var9, var5, var12);
	}

	@ObfuscatedName("client.j(B)V")
	public void method134() {
		try {
			int var1 = 5;
			this.field306[8] = 0;
			int var2 = 0;
			while (this.field306[8] == 0) {
				String var3 = "Unknown problem";
				this.method24("Connecting to web server", (byte) 8, 20);
				try {
					DataInputStream var4 = this.method121("crc" + (int) (Math.random() * 9.9999999E7D) + "-" + 349);
					class17 var5 = new class17(new byte[40], -26583);
					var4.readFully(var5.field778, 0, 40);
					var4.close();
					for (int var6 = 0; var6 < 9; var6++) {
						this.field306[var6] = var5.method229();
					}
					int var7 = var5.method229();
					int var8 = 1234;
					for (int var9 = 0; var9 < 9; var9++) {
						var8 = (var8 << 1) + this.field306[var9];
					}
					if (var7 != var8) {
						var3 = "checksum problem";
						this.field306[8] = 0;
					}
				} catch (EOFException var13) {
					var3 = "EOF problem";
					this.field306[8] = 0;
				} catch (IOException var14) {
					var3 = "connection problem";
					this.field306[8] = 0;
				} catch (Exception var15) {
					var3 = "logic problem";
					this.field306[8] = 0;
					if (!signlink.reporterror) {
						return;
					}
				}
				if (this.field306[8] == 0) {
					var2++;
					for (int var10 = var1; var10 > 0; var10--) {
						if (var2 >= 10) {
							this.method24("Game updated - please reload page", (byte) 8, 10);
							var10 = 10;
						} else {
							this.method24(var3 + " - Will retry in " + var10 + " secs.", (byte) 8, 10);
						}
						try {
							Thread.sleep(1000L);
						} catch (Exception var12) {
						}
					}
					var1 *= 2;
					if (var1 > 60) {
						var1 = 60;
					}
					this.field511 = !this.field511;
				}
			}
		} catch (RuntimeException var16) {
			signlink.reporterror("32016, " + 8 + ", " + var16.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.k(B)V")
	public void method135() {
		try {
			field573++;
			if (field573 > 179) {
				field573 = 0;
				this.field623.method213(193);
				this.field623.method218(0);
			}
			for (int var1 = 0; var1 < this.field232; var1++) {
				int var2 = this.field233[var1];
				class43 var3 = this.field231[var2];
				if (var3 != null) {
					this.method136(var3, var3.field1213.field1127);
				}
			}
		} catch (RuntimeException var5) {
			signlink.reporterror("16972, " + 65 + ", " + var5.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.a(LAPSQOGBV;II)V")
	public void method136(class3 arg0, int arg1) {
		try {
			if (arg0.field67 < 128 || arg0.field68 < 128 || arg0.field67 >= 13184 || arg0.field68 >= 13184) {
				arg0.field47 = -1;
				arg0.field27 = -1;
				arg0.field61 = 0;
				arg0.field62 = 0;
				arg0.field67 = arg0.field37[0] * 128 + arg0.field54 * 64;
				arg0.field68 = arg0.field38[0] * 128 + arg0.field54 * 64;
				arg0.method7((byte) 4);
			}
			if (arg0 == field299 && (arg0.field67 < 1536 || arg0.field68 < 1536 || arg0.field67 >= 11776 || arg0.field68 >= 11776)) {
				arg0.field47 = -1;
				arg0.field27 = -1;
				arg0.field61 = 0;
				arg0.field62 = 0;
				arg0.field67 = arg0.field37[0] * 128 + arg0.field54 * 64;
				arg0.field68 = arg0.field38[0] * 128 + arg0.field54 * 64;
				arg0.method7((byte) 4);
			}
			if (arg0.field61 > field553) {
				this.method137(arg0);
			} else if (arg0.field62 >= field553) {
				this.method138(arg0);
			} else {
				this.method139(arg0);
			}
			this.method140(arg0);
			this.method141((byte) 5, arg0);
		} catch (RuntimeException var4) {
			signlink.reporterror("38054, " + arg0 + ", " + arg1 + ", " + -718 + ", " + var4.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.a(ZLAPSQOGBV;)V")
	public void method137(class3 arg0) {
		try {
			int var2 = arg0.field61 - field553;
			int var3 = arg0.field57 * 128 + arg0.field54 * 64;
			int var4 = arg0.field59 * 128 + arg0.field54 * 64;
			arg0.field67 += (var3 - arg0.field67) / var2;
			arg0.field68 += (var4 - arg0.field68) / var2;
			arg0.field19 = 0;
			if (arg0.field63 == 0) {
				arg0.field66 = 1024;
			}
			if (arg0.field63 == 1) {
				arg0.field66 = 1536;
			}
			if (arg0.field63 == 2) {
				arg0.field66 = 0;
			}
			if (arg0.field63 == 3) {
				arg0.field66 = 512;
			}
		} catch (RuntimeException var6) {
			signlink.reporterror("72123, " + true + ", " + arg0 + ", " + var6.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.a(LAPSQOGBV;B)V")
	public void method138(class3 arg0) {
		try {
			if (arg0.field62 == field553 || arg0.field47 == -1 || arg0.field50 != 0 || arg0.field49 + 1 > class41.field1184[arg0.field47].method413(arg0.field48)) {
				int var2 = arg0.field62 - arg0.field61;
				int var3 = field553 - arg0.field61;
				int var4 = arg0.field57 * 128 + arg0.field54 * 64;
				int var5 = arg0.field59 * 128 + arg0.field54 * 64;
				int var6 = arg0.field58 * 128 + arg0.field54 * 64;
				int var7 = arg0.field60 * 128 + arg0.field54 * 64;
				arg0.field67 = (var4 * (var2 - var3) + var6 * var3) / var2;
				arg0.field68 = (var5 * (var2 - var3) + var7 * var3) / var2;
			}
			arg0.field19 = 0;
			if (arg0.field63 == 0) {
				arg0.field66 = 1024;
			}
			if (arg0.field63 == 1) {
				arg0.field66 = 1536;
			}
			if (arg0.field63 == 2) {
				arg0.field66 = 0;
			}
			if (arg0.field63 == 3) {
				arg0.field66 = 512;
			}
			arg0.field69 = arg0.field66;
		} catch (RuntimeException var9) {
			signlink.reporterror("43642, " + arg0 + ", " + 113 + ", " + var9.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.a(ILAPSQOGBV;)V")
	public void method139(class3 arg0) {
		try {
			arg0.field43 = arg0.field70;
			if (arg0.field17 == 0) {
				arg0.field19 = 0;
			} else {
				if (arg0.field47 != -1 && arg0.field50 == 0) {
					class41 var2 = class41.field1184[arg0.field47];
					if (arg0.field65 > 0 && var2.field1196 == 0) {
						arg0.field19++;
						return;
					}
					if (arg0.field65 <= 0 && var2.field1197 == 0) {
						arg0.field19++;
						return;
					}
				}
				int var3 = arg0.field67;
				int var4 = arg0.field68;
				int var5 = arg0.field37[arg0.field17 - 1] * 128 + arg0.field54 * 64;
				int var6 = arg0.field38[arg0.field17 - 1] * 128 + arg0.field54 * 64;
				if (var5 - var3 <= 256 && var5 - var3 >= -256 && var6 - var4 <= 256 && var6 - var4 >= -256) {
					if (var3 < var5) {
						if (var4 < var6) {
							arg0.field66 = 1280;
						} else if (var4 > var6) {
							arg0.field66 = 1792;
						} else {
							arg0.field66 = 1536;
						}
					} else if (var3 > var5) {
						if (var4 < var6) {
							arg0.field66 = 768;
						} else if (var4 > var6) {
							arg0.field66 = 256;
						} else {
							arg0.field66 = 512;
						}
					} else if (var4 < var6) {
						arg0.field66 = 1024;
					} else {
						arg0.field66 = 0;
					}
					int var7 = arg0.field66 - arg0.field69 & 0x7FF;
					if (var7 > 1024) {
						var7 -= 2048;
					}
					int var8 = arg0.field21;
					if (var7 >= -256 && var7 <= 256) {
						var8 = arg0.field20;
					} else if (var7 >= 256 && var7 < 768) {
						var8 = arg0.field23;
					} else if (var7 >= -768 && var7 <= -256) {
						var8 = arg0.field22;
					}
					if (var8 == -1) {
						var8 = arg0.field20;
					}
					arg0.field43 = var8;
					int var9 = 4;
					if (arg0.field69 != arg0.field66 && arg0.field52 == -1 && arg0.field40 != 0) {
						var9 = 2;
					}
					if (arg0.field17 > 2) {
						var9 = 6;
					}
					if (arg0.field17 > 3) {
						var9 = 8;
					}
					if (arg0.field19 > 0 && arg0.field17 > 1) {
						var9 = 8;
						arg0.field19--;
					}
					if (arg0.field53[arg0.field17 - 1]) {
						var9 <<= 0x1;
					}
					if (var9 >= 8 && arg0.field43 == arg0.field20 && arg0.field18 != -1) {
						arg0.field43 = arg0.field18;
					}
					if (var3 < var5) {
						arg0.field67 += var9;
						if (arg0.field67 > var5) {
							arg0.field67 = var5;
						}
					} else if (var3 > var5) {
						arg0.field67 -= var9;
						if (arg0.field67 < var5) {
							arg0.field67 = var5;
						}
					}
					if (var4 < var6) {
						arg0.field68 += var9;
						if (arg0.field68 > var6) {
							arg0.field68 = var6;
						}
					} else if (var4 > var6) {
						arg0.field68 -= var9;
						if (arg0.field68 < var6) {
							arg0.field68 = var6;
						}
					}
					if (arg0.field67 == var5 && arg0.field68 == var6) {
						arg0.field17--;
						if (arg0.field65 > 0) {
							arg0.field65--;
							return;
						}
					}
				} else {
					arg0.field67 = var5;
					arg0.field68 = var6;
				}
			}
		} catch (RuntimeException var11) {
			signlink.reporterror("87391, " + 3 + ", " + arg0 + ", " + var11.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.b(ZLAPSQOGBV;)V")
	public void method140(class3 arg0) {
		try {
			if (arg0.field40 != 0) {
				if (arg0.field52 != -1 && arg0.field52 < 32768) {
					class43 var2 = this.field231[arg0.field52];
					if (var2 != null) {
						int var3 = arg0.field67 - var2.field67;
						int var4 = arg0.field68 - var2.field68;
						if (var3 != 0 || var4 != 0) {
							arg0.field66 = (int) (Math.atan2((double) var3, (double) var4) * 325.949D) & 0x7FF;
						}
					}
				}
				if (arg0.field52 >= 32768) {
					int var5 = arg0.field52 - 32768;
					if (var5 == this.field556) {
						var5 = this.field563;
					}
					class5 var6 = this.field564[var5];
					if (var6 != null) {
						int var7 = arg0.field67 - var6.field67;
						int var8 = arg0.field68 - var6.field68;
						if (var7 != 0 || var8 != 0) {
							arg0.field66 = (int) (Math.atan2((double) var7, (double) var8) * 325.949D) & 0x7FF;
						}
					}
				}
				if ((arg0.field41 != 0 || arg0.field42 != 0) && (arg0.field17 == 0 || arg0.field19 > 0)) {
					int var9 = arg0.field67 - (arg0.field41 - this.field609 - this.field609) * 64;
					int var10 = arg0.field68 - (arg0.field42 - this.field610 - this.field610) * 64;
					if (var9 != 0 || var10 != 0) {
						arg0.field66 = (int) (Math.atan2((double) var9, (double) var10) * 325.949D) & 0x7FF;
					}
					arg0.field41 = 0;
					arg0.field42 = 0;
				}
				int var11 = arg0.field66 - arg0.field69 & 0x7FF;
				if (var11 != 0) {
					if (var11 < arg0.field40 || var11 > 2048 - arg0.field40) {
						arg0.field69 = arg0.field66;
					} else if (var11 > 1024) {
						arg0.field69 -= arg0.field40;
					} else {
						arg0.field69 += arg0.field40;
					}
					arg0.field69 &= 0x7FF;
					if (arg0.field43 == arg0.field70 && arg0.field69 != arg0.field66) {
						if (arg0.field71 != -1) {
							arg0.field43 = arg0.field71;
							return;
						}
						arg0.field43 = arg0.field20;
						return;
					}
				}
			}
		} catch (RuntimeException var13) {
			signlink.reporterror("56126, " + false + ", " + arg0 + ", " + var13.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.a(BLAPSQOGBV;)V")
	public void method141(byte arg0, class3 arg1) {
		try {
			if (this.field572 == 5) {
				boolean var9 = false;
				arg1.field39 = false;
				if (arg1.field43 != -1) {
					class41 var3 = class41.field1184[arg1.field43];
					arg1.field45++;
					if (arg1.field44 < var3.field1185 && arg1.field45 > var3.method413(arg1.field44)) {
						arg1.field45 = 0;
						arg1.field44++;
					}
					if (arg1.field44 >= var3.field1185) {
						arg1.field45 = 0;
						arg1.field44 = 0;
					}
				}
				if (arg1.field27 != -1 && field553 >= arg1.field30) {
					if (arg1.field28 < 0) {
						arg1.field28 = 0;
					}
					class41 var4 = class55.field1367[arg1.field27].field1371;
					arg1.field29++;
					while (arg1.field28 < var4.field1185 && arg1.field29 > var4.method413(arg1.field28)) {
						arg1.field29 -= var4.method413(arg1.field28);
						arg1.field28++;
					}
					if (arg1.field28 >= var4.field1185 && (arg1.field28 < 0 || arg1.field28 >= var4.field1185)) {
						arg1.field27 = -1;
					}
				}
				if (arg1.field47 != -1 && arg1.field50 <= 1) {
					class41 var5 = class41.field1184[arg1.field47];
					if (var5.field1196 == 1 && arg1.field65 > 0 && arg1.field61 <= field553 && arg1.field62 < field553) {
						arg1.field50 = 1;
						return;
					}
				}
				if (arg1.field47 != -1 && arg1.field50 == 0) {
					class41 var6 = class41.field1184[arg1.field47];
					arg1.field49++;
					while (arg1.field48 < var6.field1185 && arg1.field49 > var6.method413(arg1.field48)) {
						arg1.field49 -= var6.method413(arg1.field48);
						arg1.field48++;
					}
					if (arg1.field48 >= var6.field1185) {
						arg1.field48 -= var6.field1189;
						arg1.field51++;
						if (arg1.field51 >= var6.field1195) {
							arg1.field47 = -1;
						}
						if (arg1.field48 < 0 || arg1.field48 >= var6.field1185) {
							arg1.field47 = -1;
						}
					}
					arg1.field39 = var6.field1191;
				}
				if (arg1.field50 > 0) {
					arg1.field50--;
				}
			}
		} catch (RuntimeException var8) {
			signlink.reporterror("86398, " + arg0 + ", " + arg1 + ", " + var8.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.H(I)V")
	public void method142() {
		try {
			if (this.field631 == -1 || this.field179 != 2 && super.field85 == null) {
				if (this.field399) {
					this.method105(this.field261);
					this.field399 = false;
					this.field204.method464(4, super.field84, 0);
					this.field205.method464(357, super.field84, 0);
					this.field206.method464(4, super.field84, 722);
					this.field207.method464(205, super.field84, 743);
					this.field208.method464(0, super.field84, 0);
					this.field209.method464(4, super.field84, 516);
					this.field210.method464(205, super.field84, 516);
					this.field211.method464(357, super.field84, 496);
					this.field212.method464(338, super.field84, 0);
					this.field541 = true;
					this.field642 = true;
					this.field264 = true;
					this.field474 = true;
					if (this.field179 != 2) {
						this.field490.method464(4, super.field84, 4);
						this.field489.method464(4, super.field84, 550);
					}
					field387++;
					if (field387 > 131) {
						field387 = 0;
						this.field623.method213(84);
						this.field623.method218(0);
					}
				}
				if (this.field179 == 2) {
					this.method94(this.field593);
				}
				if (this.field392 && this.field313 == 1) {
					this.field541 = true;
				}
				if (this.field519 != -1) {
					boolean var3 = this.method52(this.field519, this.field447);
					if (var3) {
						this.field541 = true;
					}
				}
				if (this.field503 == 2) {
					this.field541 = true;
				}
				if (this.field582 == 2) {
					this.field541 = true;
				}
				if (this.field541) {
					this.method170();
					this.field541 = false;
				}
				if (this.field499 == -1) {
					this.field372.field928 = this.field380 - this.field356 - 77;
					if (super.field92 > 448 && super.field92 < 560 && super.field93 > 332) {
						this.method62(this.field372, -1, this.field380, super.field92 - 17, 463, super.field93 - 357, 77, 0);
					}
					int var4 = this.field380 - this.field372.field928 - 77;
					if (var4 < 0) {
						var4 = 0;
					}
					if (var4 > this.field380 - 77) {
						var4 = this.field380 - 77;
					}
					if (this.field356 != var4) {
						this.field356 = var4;
						this.field642 = true;
					}
				}
				if (this.field499 != -1) {
					boolean var5 = this.method52(this.field499, this.field447);
					if (var5) {
						this.field642 = true;
					}
				}
				if (this.field503 == 3) {
					this.field642 = true;
				}
				if (this.field582 == 3) {
					this.field642 = true;
				}
				if (this.field321 != null) {
					this.field642 = true;
				}
				if (this.field392 && this.field313 == 2) {
					this.field642 = true;
				}
				if (this.field642) {
					this.method176();
					this.field642 = false;
				}
				if (this.field179 == 2) {
					this.method48();
					this.field489.method464(4, super.field84, 550);
				}
				if (this.field533 != -1) {
					this.field264 = true;
				}
				if (this.field264) {
					if (this.field533 != -1 && this.field533 == this.field365) {
						this.field533 = -1;
						this.field623.method213(225);
						this.field623.method214(this.field365);
					}
					this.field264 = false;
					this.field320.method463();
					this.field477.method270(0, this.field527, 0);
					if (this.field519 == -1) {
						if (this.field571[this.field365] != -1) {
							if (this.field365 == 0) {
								this.field535.method270(22, this.field527, 10);
							}
							if (this.field365 == 1) {
								this.field536.method270(54, this.field527, 8);
							}
							if (this.field365 == 2) {
								this.field536.method270(82, this.field527, 8);
							}
							if (this.field365 == 3) {
								this.field537.method270(110, this.field527, 8);
							}
							if (this.field365 == 4) {
								this.field539.method270(153, this.field527, 8);
							}
							if (this.field365 == 5) {
								this.field539.method270(181, this.field527, 8);
							}
							if (this.field365 == 6) {
								this.field538.method270(209, this.field527, 9);
							}
						}
						if (this.field571[0] != -1 && (this.field533 != 0 || field553 % 20 < 10)) {
							this.field495[0].method270(29, this.field527, 13);
						}
						if (this.field571[1] != -1 && (this.field533 != 1 || field553 % 20 < 10)) {
							this.field495[1].method270(53, this.field527, 11);
						}
						if (this.field571[2] != -1 && (this.field533 != 2 || field553 % 20 < 10)) {
							this.field495[2].method270(82, this.field527, 11);
						}
						if (this.field571[3] != -1 && (this.field533 != 3 || field553 % 20 < 10)) {
							this.field495[3].method270(115, this.field527, 12);
						}
						if (this.field571[4] != -1 && (this.field533 != 4 || field553 % 20 < 10)) {
							this.field495[4].method270(153, this.field527, 13);
						}
						if (this.field571[5] != -1 && (this.field533 != 5 || field553 % 20 < 10)) {
							this.field495[5].method270(180, this.field527, 11);
						}
						if (this.field571[6] != -1 && (this.field533 != 6 || field553 % 20 < 10)) {
							this.field495[6].method270(208, this.field527, 13);
						}
					}
					this.field320.method464(160, super.field84, 516);
					this.field319.method463();
					this.field476.method270(0, this.field527, 0);
					if (this.field519 == -1) {
						if (this.field571[this.field365] != -1) {
							if (this.field365 == 7) {
								this.field417.method270(42, this.field527, 0);
							}
							if (this.field365 == 8) {
								this.field418.method270(74, this.field527, 0);
							}
							if (this.field365 == 9) {
								this.field418.method270(102, this.field527, 0);
							}
							if (this.field365 == 10) {
								this.field419.method270(130, this.field527, 1);
							}
							if (this.field365 == 11) {
								this.field421.method270(173, this.field527, 0);
							}
							if (this.field365 == 12) {
								this.field421.method270(201, this.field527, 0);
							}
							if (this.field365 == 13) {
								this.field420.method270(229, this.field527, 0);
							}
						}
						if (this.field571[8] != -1 && (this.field533 != 8 || field553 % 20 < 10)) {
							this.field495[7].method270(74, this.field527, 2);
						}
						if (this.field571[9] != -1 && (this.field533 != 9 || field553 % 20 < 10)) {
							this.field495[8].method270(102, this.field527, 3);
						}
						if (this.field571[10] != -1 && (this.field533 != 10 || field553 % 20 < 10)) {
							this.field495[9].method270(137, this.field527, 4);
						}
						if (this.field571[11] != -1 && (this.field533 != 11 || field553 % 20 < 10)) {
							this.field495[10].method270(174, this.field527, 2);
						}
						if (this.field571[12] != -1 && (this.field533 != 12 || field553 % 20 < 10)) {
							this.field495[11].method270(201, this.field527, 2);
						}
						if (this.field571[13] != -1 && (this.field533 != 13 || field553 % 20 < 10)) {
							this.field495[12].method270(226, this.field527, 2);
						}
					}
					this.field319.method464(466, super.field84, 496);
					this.field490.method463();
					class21.field822 = this.field428;
				}
				if (this.field474) {
					this.field474 = false;
					this.field318.method463();
					this.field475.method270(0, this.field527, 0);
					this.field423.method374(55, "Public chat", 28, true, 16777215);
					if (this.field498 == 0) {
						this.field423.method374(55, "On", 41, true, 65280);
					}
					if (this.field498 == 1) {
						this.field423.method374(55, "Friends", 41, true, 16776960);
					}
					if (this.field498 == 2) {
						this.field423.method374(55, "Off", 41, true, 16711680);
					}
					if (this.field498 == 3) {
						this.field423.method374(55, "Hide", 41, true, 65535);
					}
					this.field423.method374(184, "Private chat", 28, true, 16777215);
					if (this.field355 == 0) {
						this.field423.method374(184, "On", 41, true, 65280);
					}
					if (this.field355 == 1) {
						this.field423.method374(184, "Friends", 41, true, 16776960);
					}
					if (this.field355 == 2) {
						this.field423.method374(184, "Off", 41, true, 16711680);
					}
					this.field423.method374(324, "Trade/compete", 28, true, 16777215);
					if (this.field386 == 0) {
						this.field423.method374(324, "On", 41, true, 65280);
					}
					if (this.field386 == 1) {
						this.field423.method374(324, "Friends", 41, true, 16776960);
					}
					if (this.field386 == 2) {
						this.field423.method374(324, "Off", 41, true, 16711680);
					}
					this.field423.method374(458, "Report abuse", 33, true, 16777215);
					this.field318.method464(453, super.field84, 0);
					this.field490.method463();
					class21.field822 = this.field428;
				}
				this.field447 = 0;
			} else {
				if (this.field179 == 2) {
					this.method52(this.field631, this.field447);
					if (this.field275 != -1) {
						this.method52(this.field275, this.field447);
					}
					this.field447 = 0;
					this.method116();
					super.field85.method463();
					class21.field822 = this.field429;
					class26.method313();
					this.field399 = true;
					class27 var1 = class27.method329(this.field631);
					if (var1.field932 == 512 && var1.field910 == 334 && var1.field922 == 0) {
						var1.field932 = 765;
						var1.field910 = 503;
					}
					this.method157(var1, 0, 0, 0);
					if (this.field275 != -1) {
						class27 var2 = class27.method329(this.field275);
						if (var2.field932 == 512 && var2.field910 == 334 && var2.field922 == 0) {
							var2.field932 = 765;
							var2.field910 = 503;
						}
						this.method157(var2, 0, 0, 0);
					}
					if (this.field392) {
						this.method49();
					} else {
						this.method158();
						this.method119();
					}
				}
				super.field85.method464(0, super.field84, 0);
			}
		} catch (RuntimeException var7) {
			signlink.reporterror("45808, " + -45619 + ", " + var7.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.c(IILEILHLJCE;)V")
	public void method143(int arg0, class17 arg1) {
		try {
			for (int var3 = 0; var3 < this.field567; var3++) {
				int var4 = this.field568[var3];
				class43 var5 = this.field231[var4];
				int var6 = arg1.method224();
				if ((var6 & 0x40) != 0) {
					var5.field46 = arg1.method231();
					var5.field26 = 100;
				}
				if ((var6 & 0x20) != 0) {
					var5.field41 = arg1.method252();
					var5.field42 = arg1.method226();
				}
				if ((var6 & 0x1) != 0) {
					int var7 = arg1.method244();
					int var8 = arg1.method244();
					var5.method9(field553, var8, var7);
					var5.field14 = field553 + 300;
					var5.field15 = arg1.method244();
					var5.field16 = arg1.method243();
				}
				if ((var6 & 0x2) != 0) {
					int var9 = arg1.method244();
					int var10 = arg1.method243();
					var5.method9(field553, var10, var9);
					var5.field14 = field553 + 300;
					var5.field15 = arg1.method245();
					var5.field16 = arg1.method224();
				}
				if ((var6 & 0x80) != 0) {
					var5.field27 = arg1.method253();
					int var11 = arg1.method260();
					var5.field31 = var11 >> 16;
					var5.field30 = field553 + (var11 & 0xFFFF);
					var5.field28 = 0;
					var5.field29 = 0;
					if (var5.field30 > field553) {
						var5.field28 = -1;
					}
					if (var5.field27 == 65535) {
						var5.field27 = -1;
					}
				}
				if ((var6 & 0x10) != 0) {
					var5.field1213 = class37.method393(arg1.method254());
					var5.field54 = var5.field1213.field1127;
					var5.field40 = var5.field1213.field1140;
					var5.field20 = var5.field1213.field1151;
					var5.field21 = var5.field1213.field1136;
					var5.field22 = var5.field1213.field1123;
					var5.field23 = var5.field1213.field1149;
					var5.field70 = var5.field1213.field1141;
				}
				if ((var6 & 0x4) != 0) {
					var5.field52 = arg1.method253();
					if (var5.field52 == 65535) {
						var5.field52 = -1;
					}
				}
				if ((var6 & 0x8) != 0) {
					int var12 = arg1.method252();
					if (var12 == 65535) {
						var12 = -1;
					}
					int var13 = arg1.method244();
					if (var12 == var5.field47 && var12 != -1) {
						int var14 = class41.field1184[var12].field1198;
						if (var14 == 1) {
							var5.field48 = 0;
							var5.field49 = 0;
							var5.field50 = var13;
							var5.field51 = 0;
						}
						if (var14 == 2) {
							var5.field51 = 0;
						}
					} else if (var12 == -1 || var5.field47 == -1 || class41.field1184[var12].field1192 >= class41.field1184[var5.field47].field1192) {
						var5.field47 = var12;
						var5.field48 = 0;
						var5.field49 = 0;
						var5.field50 = var13;
						var5.field51 = 0;
						var5.field65 = var5.field17;
					}
				}
			}
		} catch (RuntimeException var16) {
			signlink.reporterror("47140, " + arg0 + ", " + -459 + ", " + arg1 + ", " + var16.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.l(B)V")
	public void method144(byte arg0) {
		try {
			for (int var2 = -1; var2 < this.field565; var2++) {
				int var3;
				if (var2 == -1) {
					var3 = this.field563;
				} else {
					var3 = this.field566[var2];
				}
				class5 var4 = this.field564[var3];
				if (var4 != null && var4.field26 > 0) {
					var4.field26--;
					if (var4.field26 == 0) {
						var4.field46 = null;
					}
				}
			}
			if (arg0 != 4) {
				this.field270 = !this.field270;
			}
			for (int var5 = 0; var5 < this.field232; var5++) {
				int var6 = this.field233[var5];
				class43 var7 = this.field231[var6];
				if (var7 != null && var7.field26 > 0) {
					var7.field26--;
					if (var7.field26 == 0) {
						var7.field46 = null;
					}
				}
			}
		} catch (RuntimeException var9) {
			signlink.reporterror("78609, " + arg0 + ", " + var9.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.I(I)V")
	public void method145(int arg0) {
		try {
			try {
				this.field252 = -1;
				this.field308.method279();
				this.field260.method279();
				class21.method283();
				this.method76();
				this.field407.method528((byte) 9);
				System.gc();
				for (int var2 = 0; var2 < 4; var2++) {
					this.field385[var2].method200();
				}
				for (int var3 = 0; var3 < 4; var3++) {
					for (int var4 = 0; var4 < 104; var4++) {
						for (int var5 = 0; var5 < 104; var5++) {
							this.field238[var3][var4][var5] = 0;
						}
					}
				}
				class44 var6 = new class44(this.field622, 104, this.field350, this.field238, 104);
				int var7 = this.field416.length;
				this.field623.method213(58);
				if (!this.field509) {
					for (int var8 = 0; var8 < var7; var8++) {
						int var9 = (this.field189[var8] >> 8) * 64 - this.field609;
						int var10 = (this.field189[var8] & 0xFF) * 64 - this.field610;
						byte[] var11 = this.field416[var8];
						if (var11 != null) {
							var6.method435(var10, var11, (this.field472 - 6) * 8, this.field385, (this.field473 - 6) * 8, var9);
						}
					}
					for (int var12 = 0; var12 < var7; var12++) {
						int var13 = (this.field189[var12] >> 8) * 64 - this.field609;
						int var14 = (this.field189[var12] & 0xFF) * 64 - this.field610;
						byte[] var15 = this.field416[var12];
						if (var15 == null && this.field473 < 800) {
							var6.method423(var14, 64, 64, var13);
						}
					}
					this.field623.method213(58);
					for (int var16 = 0; var16 < var7; var16++) {
						byte[] var17 = this.field305[var16];
						if (var17 != null) {
							int var18 = (this.field189[var16] >> 8) * 64 - this.field609;
							int var19 = (this.field189[var16] & 0xFF) * 64 - this.field610;
							var6.method428(var18, var19, var17, this.field407, this.field385);
						}
					}
				}
				if (this.field509) {
					int var20 = 0;
					label250: while (true) {
						if (var20 >= 4) {
							for (int var30 = 0; var30 < 13; var30++) {
								for (int var31 = 0; var31 < 13; var31++) {
									int var32 = this.field494[0][var30][var31];
									if (var32 == -1) {
										var6.method423(var31 * 8, 8, 8, var30 * 8);
									}
								}
							}
							this.field623.method213(58);
							int var33 = 0;
							while (true) {
								if (var33 >= 4) {
									break label250;
								}
								for (int var34 = 0; var34 < 13; var34++) {
									for (int var35 = 0; var35 < 13; var35++) {
										int var36 = this.field494[var33][var34][var35];
										if (var36 != -1) {
											int var37 = var36 >> 24 & 0x3;
											int var38 = var36 >> 1 & 0x3;
											int var39 = var36 >> 14 & 0x3FF;
											int var40 = var36 >> 3 & 0x7FF;
											int var41 = (var39 / 8 << 8) + var40 / 8;
											for (int var42 = 0; var42 < this.field189.length; var42++) {
												if (this.field189[var42] == var41 && this.field305[var42] != null) {
													var6.method426(var34 * 8, var33, var37, this.field407, (var40 & 0x7) * 8, (var39 & 0x7) * 8, this.field305[var42], this.field385, var35 * 8, var38);
													break;
												}
											}
										}
									}
								}
								var33++;
							}
						}
						for (int var21 = 0; var21 < 13; var21++) {
							for (int var22 = 0; var22 < 13; var22++) {
								int var23 = this.field494[var20][var21][var22];
								if (var23 != -1) {
									int var24 = var23 >> 24 & 0x3;
									int var25 = var23 >> 1 & 0x3;
									int var26 = var23 >> 14 & 0x3FF;
									int var27 = var23 >> 3 & 0x7FF;
									int var28 = (var26 / 8 << 8) + var27 / 8;
									for (int var29 = 0; var29 < this.field189.length; var29++) {
										if (this.field189[var29] == var28 && this.field416[var29] != null) {
											var6.method434(var24, (var26 & 0x7) * 8, var25, var20, this.field385, (var27 & 0x7) * 8, this.field416[var29], var21 * 8, var22 * 8);
											break;
										}
									}
								}
							}
						}
						var20++;
					}
				}
				this.field623.method213(58);
				var6.method430(this.field385, this.field407);
				if (this.field490 != null) {
					this.field490.method463();
					class21.field822 = this.field428;
				}
				this.field623.method213(58);
				int var43 = class44.field1239;
				if (var43 > this.field180) {
					var43 = this.field180;
				}
				if (var43 < this.field180 - 1) {
					int var44 = this.field180 - 1;
				}
				if (field237) {
					this.field407.method529(this.field283, class44.field1239);
				} else {
					this.field407.method529(this.field283, 0);
				}
				for (int var45 = 0; var45 < 104; var45++) {
					for (int var46 = 0; var46 < 104; var46++) {
						this.method133(var45, var46);
					}
				}
				this.method118();
			} catch (Exception var60) {
			}
			class14.field735.method199();
			if (super.field87 != null) {
				this.field623.method213(173);
				this.field623.method218(1057001181);
			}
			if (field237 && signlink.cache_dat != null) {
				int var48 = this.field602.method588(0);
				for (int var49 = 0; var49 < var48; var49++) {
					int var50 = this.field602.method592(var49);
					if ((var50 & 0x79) == 0) {
						class31.method338(596, var49);
					}
				}
			}
			System.gc();
			int var62 = 58 / arg0;
			class21.method284();
			this.field602.method600();
			int var51 = (this.field472 - 6) / 8 - 1;
			int var52 = (this.field472 + 6) / 8 + 1;
			int var53 = (this.field473 - 6) / 8 - 1;
			int var54 = (this.field473 + 6) / 8 + 1;
			if (this.field628) {
				var51 = 49;
				var52 = 50;
				var53 = 49;
				var54 = 50;
			}
			for (int var55 = var51; var55 <= var52; var55++) {
				for (int var56 = var53; var56 <= var54; var56++) {
					if (var55 == var51 || var55 == var52 || var56 == var53 || var56 == var54) {
						int var57 = this.field602.method601(var56, var55, 0);
						if (var57 != -1) {
							this.field602.method598(var57, 3);
						}
						int var58 = this.field602.method601(var56, var55, 1);
						if (var58 != -1) {
							this.field602.method598(var58, 3);
						}
					}
				}
			}
		} catch (RuntimeException var61) {
			signlink.reporterror("69267, " + arg0 + ", " + var61.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.a(IZ)V")
	public void method146(int arg0) {
		try {
			class27.method324(arg0);
		} catch (RuntimeException var3) {
			signlink.reporterror("39400, " + arg0 + ", " + true + ", " + var3.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.J(I)V")
	public void method147() {
		try {
			this.field460 = 0;
			for (int var1 = -1; var1 < this.field565 + this.field232; var1++) {
				class3 var2;
				if (var1 == -1) {
					var2 = field299;
				} else if (var1 < this.field565) {
					var2 = this.field564[this.field566[var1]];
				} else {
					var2 = this.field231[this.field233[var1 - this.field565]];
				}
				if (var2 != null && var2.method10()) {
					if (var2 instanceof class43) {
						class37 var3 = ((class43) var2).field1213;
						if (var3.field1119 != null) {
							var3 = var3.method389();
						}
						if (var3 == null) {
							continue;
						}
					}
					if (var1 >= this.field565) {
						class37 var6 = ((class43) var2).field1213;
						if (var6.field1138 >= 0 && var6.field1138 < this.field366.length) {
							this.method102(var2.field36 + 15, var2);
							if (this.field390 > -1) {
								this.field366[var6.field1138].method404(this.field390 - 12, this.field527, this.field391 - 30);
							}
						}
						if (this.field281 == 1 && this.field570 == this.field233[var1 - this.field565] && field553 % 20 < 10) {
							this.method102(var2.field36 + 15, var2);
							if (this.field390 > -1) {
								this.field351[0].method404(this.field390 - 12, this.field527, this.field391 - 28);
							}
						}
					} else {
						int var4 = 30;
						class5 var5 = (class5) var2;
						if (var5.field134 != -1 || var5.field109 != -1) {
							this.method102(var2.field36 + 15, var2);
							if (this.field390 > -1) {
								if (var5.field134 != -1) {
									this.field301[var5.field134].method404(this.field390 - 12, this.field527, this.field391 - 30);
									var4 += 25;
								}
								if (var5.field109 != -1) {
									this.field366[var5.field109].method404(this.field390 - 12, this.field527, this.field391 - var4);
									var4 += 25;
								}
							}
						}
						if (var1 >= 0 && this.field281 == 10 && this.field245 == this.field566[var1]) {
							this.method102(var2.field36 + 15, var2);
							if (this.field390 > -1) {
								this.field351[1].method404(this.field390 - 12, this.field527, this.field391 - var4);
							}
						}
					}
					if (var2.field46 != null && (var1 >= this.field565 || this.field498 == 0 || this.field498 == 3 || this.field498 == 1 && this.method179(((class5) var2).field129))) {
						this.method102(var2.field36, var2);
						if (this.field390 > -1 && this.field460 < this.field461) {
							this.field465[this.field460] = this.field424.method376(var2.field46) / 2;
							this.field464[this.field460] = this.field424.field1103;
							this.field462[this.field460] = this.field390;
							this.field463[this.field460] = this.field391;
							this.field466[this.field460] = var2.field56;
							this.field467[this.field460] = var2.field24;
							this.field468[this.field460] = var2.field26;
							this.field469[this.field460++] = var2.field46;
							if (this.field624 == 0 && var2.field24 >= 1 && var2.field24 <= 3) {
								this.field464[this.field460] += 10;
								this.field463[this.field460] += 5;
							}
							if (this.field624 == 0 && var2.field24 == 4) {
								this.field465[this.field460] = 60;
							}
							if (this.field624 == 0 && var2.field24 == 5) {
								this.field464[this.field460] += 5;
							}
						}
					}
					if (var2.field14 > field553) {
						this.method102(var2.field36 + 15, var2);
						if (this.field390 > -1) {
							int var7 = var2.field15 * 30 / var2.field16;
							if (var7 > 30) {
								var7 = 30;
							}
							class26.method315(65280, this.field390 - 15, 99, var7, 5, this.field391 - 3);
							class26.method315(16711680, this.field390 + var7 - 15, 99, 30 - var7, 5, this.field391 - 3);
						}
					}
					for (int var8 = 0; var8 < 4; var8++) {
						if (var2.field35[var8] > field553) {
							this.method102(var2.field36 / 2, var2);
							if (this.field390 > -1) {
								if (var8 == 1) {
									this.field391 -= 20;
								}
								if (var8 == 2) {
									this.field390 -= 15;
									this.field391 -= 10;
								}
								if (var8 == 3) {
									this.field390 += 15;
									this.field391 -= 10;
								}
								this.field645[var2.field34[var8]].method404(this.field390 - 12, this.field527, this.field391 - 12);
								this.field422.method373(0, String.valueOf(var2.field33[var8]), this.field390, this.field391 + 4);
								this.field422.method373(16777215, String.valueOf(var2.field33[var8]), this.field390 - 1, this.field391 + 3);
							}
						}
					}
				}
			}
			for (int var9 = 0; var9 < this.field460; var9++) {
				int var10 = this.field462[var9];
				int var11 = this.field463[var9];
				int var12 = this.field465[var9];
				int var13 = this.field464[var9];
				boolean var14 = true;
				while (var14) {
					var14 = false;
					for (int var15 = 0; var15 < var9; var15++) {
						if (var11 + 2 > this.field463[var15] - this.field464[var15] && var11 - var13 < this.field463[var15] + 2 && var10 - var12 < this.field462[var15] + this.field465[var15] && var10 + var12 > this.field462[var15] - this.field465[var15] && this.field463[var15] - this.field464[var15] < var11) {
							var11 = this.field463[var15] - this.field464[var15];
							var14 = true;
						}
					}
				}
				this.field390 = this.field462[var9];
				this.field391 = this.field463[var9] = var11;
				String var16 = this.field469[var9];
				if (this.field624 == 0) {
					int var17 = 16776960;
					if (this.field466[var9] < 6) {
						var17 = this.field393[this.field466[var9]];
					}
					if (this.field466[var9] == 6) {
						var17 = this.field297 % 20 < 10 ? 16711680 : 16776960;
					}
					if (this.field466[var9] == 7) {
						var17 = this.field297 % 20 < 10 ? 255 : 65535;
					}
					if (this.field466[var9] == 8) {
						var17 = this.field297 % 20 < 10 ? 45056 : 8454016;
					}
					if (this.field466[var9] == 9) {
						int var18 = 150 - this.field468[var9];
						if (var18 < 50) {
							var17 = var18 * 1280 + 16711680;
						} else if (var18 < 100) {
							var17 = 16776960 - (var18 - 50) * 327680;
						} else if (var18 < 150) {
							var17 = (var18 - 100) * 5 + 65280;
						}
					}
					if (this.field466[var9] == 10) {
						int var19 = 150 - this.field468[var9];
						if (var19 < 50) {
							var17 = var19 * 5 + 16711680;
						} else if (var19 < 100) {
							var17 = 16711935 - (var19 - 50) * 327680;
						} else if (var19 < 150) {
							var17 = (var19 - 100) * 327680 + 255 - (var19 - 100) * 5;
						}
					}
					if (this.field466[var9] == 11) {
						int var20 = 150 - this.field468[var9];
						if (var20 < 50) {
							var17 = 16777215 - var20 * 327685;
						} else if (var20 < 100) {
							var17 = (var20 - 50) * 327685 + 65280;
						} else if (var20 < 150) {
							var17 = 16777215 - (var20 - 100) * 327680;
						}
					}
					if (this.field467[var9] == 0) {
						this.field424.method373(0, var16, this.field390, this.field391 + 1);
						this.field424.method373(var17, var16, this.field390, this.field391);
					}
					if (this.field467[var9] == 1) {
						this.field424.method378(this.field391 + 1, this.field390, this.field297, 0, var16);
						this.field424.method378(this.field391, this.field390, this.field297, var17, var16);
					}
					if (this.field467[var9] == 2) {
						this.field424.method379(this.field391 + 1, this.field390, 0, var16, this.field297);
						this.field424.method379(this.field391, this.field390, var17, var16, this.field297);
					}
					if (this.field467[var9] == 3) {
						this.field424.method380(150 - this.field468[var9], var16, this.field391 + 1, 0, this.field390, this.field297);
						this.field424.method380(150 - this.field468[var9], var16, this.field391, var17, this.field390, this.field297);
					}
					if (this.field467[var9] == 4) {
						int var21 = this.field424.method376(var16);
						int var22 = (150 - this.field468[var9]) * (var21 + 100) / 150;
						class26.method312(this.field390 + 50, 334, this.field390 - 50, this.field214, 0);
						this.field424.method377(var16, this.field391 + 1, this.field390 + 50 - var22, 0);
						this.field424.method377(var16, this.field391, this.field390 + 50 - var22, var17);
						class26.method311();
					}
					if (this.field467[var9] == 5) {
						int var23 = 150 - this.field468[var9];
						int var24 = 0;
						if (var23 < 25) {
							var24 = var23 - 25;
						} else if (var23 > 125) {
							var24 = var23 - 125;
						}
						class26.method312(512, this.field391 + 5, 0, this.field214, this.field391 - this.field424.field1103 - 1);
						this.field424.method373(0, var16, this.field390, this.field391 + var24 + 1);
						this.field424.method373(var17, var16, this.field390, this.field391 + var24);
						class26.method311();
					}
				} else {
					this.field424.method373(0, var16, this.field390, this.field391 + 1);
					this.field424.method373(16776960, var16, this.field390, this.field391);
				}
			}
		} catch (RuntimeException var26) {
			signlink.reporterror("24473, " + -670 + ", " + var26.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.a(B)V")
	@Override
	public void method21(byte arg0) {
		try {
			this.field399 = true;
		} catch (RuntimeException var3) {
			signlink.reporterror("37693, " + 6 + ", " + var3.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.K(I)V")
	public void method148() {
		try {
			if (this.field545 == 0 && this.field636 == 0) {
				this.field273[this.field412] = "Walk here";
				this.field348[this.field412] = 16;
				this.field346[this.field412] = super.field92;
				this.field347[this.field412] = super.field93;
				this.field412++;
			}
			int var1 = -1;
			for (int var2 = 0; var2 < class31.field1061; var2++) {
				int var3 = class31.field1062[var2];
				int var4 = var3 & 0x7F;
				int var5 = var3 >> 7 & 0x7F;
				int var6 = var3 >> 29 & 0x3;
				int var7 = var3 >> 14 & 0x7FFF;
				if (var3 != var1) {
					var1 = var3;
					if (var6 == 2 && this.field407.method558(this.field180, var4, var5, var3) >= 0) {
						class14 var8 = class14.method192(var7);
						if (var8.field726 != null) {
							var8 = var8.method194(this.field277);
						}
						if (var8 == null) {
							continue;
						}
						if (this.field545 == 1) {
							this.field273[this.field412] = "Use " + this.field549 + " with @cya@" + var8.field729;
							this.field348[this.field412] = 419;
							this.field349[this.field412] = var3;
							this.field346[this.field412] = var4;
							this.field347[this.field412] = var5;
							this.field412++;
						} else if (this.field636 != 1) {
							if (var8.field718 != null) {
								for (int var9 = 4; var9 >= 0; var9--) {
									if (var8.field718[var9] != null) {
										this.field273[this.field412] = var8.field718[var9] + " @cya@" + var8.field729;
										if (var9 == 0) {
											this.field348[this.field412] = 588;
										}
										if (var9 == 1) {
											this.field348[this.field412] = 256;
										}
										if (var9 == 2) {
											this.field348[this.field412] = 766;
										}
										if (var9 == 3) {
											this.field348[this.field412] = 985;
										}
										if (var9 == 4) {
											this.field348[this.field412] = 1577;
										}
										this.field349[this.field412] = var3;
										this.field346[this.field412] = var4;
										this.field347[this.field412] = var5;
										this.field412++;
									}
								}
							}
							this.field273[this.field412] = "Examine @cya@" + var8.field729;
							this.field348[this.field412] = 1327;
							this.field349[this.field412] = var8.field714 << 14;
							this.field346[this.field412] = var4;
							this.field347[this.field412] = var5;
							this.field412++;
						} else if ((this.field638 & 0x4) == 4) {
							this.field273[this.field412] = this.field639 + " @cya@" + var8.field729;
							this.field348[this.field412] = 157;
							this.field349[this.field412] = var3;
							this.field346[this.field412] = var4;
							this.field347[this.field412] = var5;
							this.field412++;
						}
					}
					if (var6 == 1) {
						class43 var10 = this.field231[var7];
						if (var10.field1213.field1127 == 1 && (var10.field67 & 0x7F) == 64 && (var10.field68 & 0x7F) == 64) {
							for (int var11 = 0; var11 < this.field232; var11++) {
								class43 var12 = this.field231[this.field233[var11]];
								if (var12 != null && var12 != var10 && var12.field1213.field1127 == 1 && var12.field67 == var10.field67 && var12.field68 == var10.field68) {
									this.method106(this.field233[var11], var12.field1213, var5, var4);
								}
							}
							for (int var13 = 0; var13 < this.field565; var13++) {
								class5 var14 = this.field564[this.field566[var13]];
								if (var14 != null && var14.field67 == var10.field67 && var14.field68 == var10.field68) {
									this.method98(var4, this.field566[var13], var5, var14);
								}
							}
						}
						this.method106(var7, var10.field1213, var5, var4);
					}
					if (var6 == 0) {
						class5 var15 = this.field564[var7];
						if ((var15.field67 & 0x7F) == 64 && (var15.field68 & 0x7F) == 64) {
							for (int var16 = 0; var16 < this.field232; var16++) {
								class43 var17 = this.field231[this.field233[var16]];
								if (var17 != null && var17.field1213.field1127 == 1 && var17.field67 == var15.field67 && var17.field68 == var15.field68) {
									this.method106(this.field233[var16], var17.field1213, var5, var4);
								}
							}
							for (int var18 = 0; var18 < this.field565; var18++) {
								class5 var19 = this.field564[this.field566[var18]];
								if (var19 != null && var19 != var15 && var19.field67 == var15.field67 && var19.field68 == var15.field68) {
									this.method98(var4, this.field566[var18], var5, var19);
								}
							}
						}
						this.method98(var4, var7, var5, var15);
					}
					if (var6 == 3) {
						class20 var20 = this.field406[this.field180][var4][var5];
						if (var20 != null) {
							for (class63 var21 = (class63) var20.method276(); var21 != null; var21 = (class63) var20.method278((byte) 3)) {
								class67 var22 = class67.method526(var21.field1444);
								if (this.field545 == 1) {
									this.field273[this.field412] = "Use " + this.field549 + " with @lre@" + var22.field1533;
									this.field348[this.field412] = 62;
									this.field349[this.field412] = var21.field1444;
									this.field346[this.field412] = var4;
									this.field347[this.field412] = var5;
									this.field412++;
								} else if (this.field636 != 1) {
									for (int var23 = 4; var23 >= 0; var23--) {
										if (var22.field1502 != null && var22.field1502[var23] != null) {
											this.field273[this.field412] = var22.field1502[var23] + " @lre@" + var22.field1533;
											if (var23 == 0) {
												this.field348[this.field412] = 184;
											}
											if (var23 == 1) {
												this.field348[this.field412] = 81;
											}
											if (var23 == 2) {
												this.field348[this.field412] = 98;
											}
											if (var23 == 3) {
												this.field348[this.field412] = 275;
											}
											if (var23 == 4) {
												this.field348[this.field412] = 689;
											}
											this.field349[this.field412] = var21.field1444;
											this.field346[this.field412] = var4;
											this.field347[this.field412] = var5;
											this.field412++;
										} else if (var23 == 2) {
											this.field273[this.field412] = "Take @lre@" + var22.field1533;
											this.field348[this.field412] = 98;
											this.field349[this.field412] = var21.field1444;
											this.field346[this.field412] = var4;
											this.field347[this.field412] = var5;
											this.field412++;
										}
									}
									this.field273[this.field412] = "Examine @lre@" + var22.field1533;
									this.field348[this.field412] = 1184;
									this.field349[this.field412] = var21.field1444;
									this.field346[this.field412] = var4;
									this.field347[this.field412] = var5;
									this.field412++;
								} else if ((this.field638 & 0x1) == 1) {
									this.field273[this.field412] = this.field639 + " @lre@" + var22.field1533;
									this.field348[this.field412] = 538;
									this.field349[this.field412] = var21.field1444;
									this.field346[this.field412] = var4;
									this.field347[this.field412] = var5;
									this.field412++;
								}
							}
						}
					}
				}
			}
		} catch (RuntimeException var25) {
			signlink.reporterror("23188, " + 47798 + ", " + var25.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.d(ZI)V")
	public void method149(boolean arg0) {
		try {
			this.method109();
			this.field330.method463();
			this.field253.method270(0, this.field527, 0);
			if (this.field178 == 0) {
				this.field422.method374(180, this.field602.field1664, 180, true, 7711145);
				byte var2 = 80;
				this.field424.method374(180, "Welcome to RuneScape", 80, true, 16776960);
				int var7 = var2 + 30;
				this.field254.method270(27, this.field527, 100);
				this.field424.method374(100, "New User", 125, true, 16777215);
				this.field254.method270(187, this.field527, 100);
				this.field424.method374(260, "Existing User", 125, true, 16777215);
			}
			if (this.field178 == 2) {
				byte var3 = 60;
				int var8;
				if (this.field512.length() > 0) {
					this.field424.method374(180, this.field512, 45, true, 16776960);
					this.field424.method374(180, this.field513, 60, true, 16776960);
					var8 = var3 + 30;
				} else {
					this.field424.method374(180, this.field513, 53, true, 16776960);
					var8 = var3 + 30;
				}
				this.field424.method381(90, 90, true, 16777215, "Username: " + this.field169 + (this.field291 == 0 & field553 % 40 < 20 ? "@yel@|" : ""));
				var8 += 15;
				this.field424.method381(92, 105, true, 16777215, "Password: " + class33.method371(this.field170) + (this.field291 == 1 & field553 % 40 < 20 ? "@yel@|" : ""));
				var8 += 15;
				if (!arg0) {
					this.field254.method270(27, this.field527, 130);
					this.field424.method374(100, "Login", 155, true, 16777215);
					this.field254.method270(187, this.field527, 130);
					this.field424.method374(260, "Cancel", 155, true, 16777215);
				}
			}
			if (this.field178 == 3) {
				this.field424.method374(180, "Create a free account", 40, true, 16776960);
				byte var4 = 65;
				this.field424.method374(180, "To create a new account you need to", 65, true, 16777215);
				int var9 = var4 + 15;
				this.field424.method374(180, "go back to the main RuneScape webpage", 80, true, 16777215);
				int var10 = var9 + 15;
				this.field424.method374(180, "and choose the 'create account'", 95, true, 16777215);
				int var11 = var10 + 15;
				this.field424.method374(180, "button near the top of that page.", 110, true, 16777215);
				int var12 = var11 + 15;
				this.field254.method270(107, this.field527, 130);
				this.field424.method374(180, "Cancel", 155, true, 16777215);
			}
			this.field330.method464(171, super.field84, 202);
			if (this.field399) {
				this.field399 = false;
				this.field328.method464(0, super.field84, 128);
				this.field329.method464(371, super.field84, 202);
				this.field333.method464(265, super.field84, 0);
				this.field334.method464(265, super.field84, 562);
				this.field335.method464(171, super.field84, 128);
				this.field336.method464(171, super.field84, 562);
			}
		} catch (RuntimeException var6) {
			signlink.reporterror("10605, " + arg0 + ", " + 326 + ", " + var6.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.d(IILEILHLJCE;)V")
	public void method150(int arg0, class17 arg1) {
		try {
			int var17 = arg0;
			int var3 = arg1.method235(8);
			if (var3 < this.field565) {
				for (int var4 = var3; var4 < this.field565; var4++) {
					this.field358[this.field357++] = this.field566[var4];
				}
			}
			if (var3 > this.field565) {
				signlink.reporterror(this.field169 + " Too many players");
				throw new RuntimeException("eek");
			}
			this.field565 = 0;
			for (int var5 = 0; var5 < var3; var5++) {
				int var6 = this.field566[var5];
				class5 var7 = this.field564[var6];
				int var8 = arg1.method235(1);
				if (var8 == 0) {
					this.field566[this.field565++] = var6;
					var7.field32 = field553;
				} else {
					int var9 = arg1.method235(2);
					if (var9 == 0) {
						this.field566[this.field565++] = var6;
						var7.field32 = field553;
						this.field568[this.field567++] = var6;
					} else if (var9 == 1) {
						this.field566[this.field565++] = var6;
						var7.field32 = field553;
						int var10 = arg1.method235(3);
						var7.method8(var10, false);
						int var11 = arg1.method235(1);
						if (var11 == 1) {
							this.field568[this.field567++] = var6;
						}
					} else if (var9 == 2) {
						this.field566[this.field565++] = var6;
						var7.field32 = field553;
						int var12 = arg1.method235(3);
						var7.method8(var12, true);
						int var13 = arg1.method235(3);
						var7.method8(var13, true);
						int var14 = arg1.method235(1);
						if (var14 == 1) {
							this.field568[this.field567++] = var6;
						}
					} else if (var9 == 3) {
						this.field358[this.field357++] = var6;
					}
				}
			}
		} catch (RuntimeException var16) {
			signlink.reporterror("77664, " + arg0 + ", " + ", " + arg1 + ", " + var16.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.a(ILAWOZVMFS;LEILHLJCE;IZ)V")
	public void method151(int arg0, class5 arg1, class17 arg2, int arg3) {
		try {
			if ((arg0 & 0x20) != 0) {
				int var5 = arg2.method243();
				byte[] var6 = new byte[var5];
				class17 var7 = new class17(var6, -26583);
				arg2.method233(var6, var5);
				this.field569[arg3] = var7;
				arg1.method27(var7, this.field342);
			}
			if ((arg0 & 0x100) != 0) {
				arg1.field27 = arg2.method254();
				int var8 = arg2.method260();
				arg1.field31 = var8 >> 16;
				arg1.field30 = field553 + (var8 & 0xFFFF);
				arg1.field28 = 0;
				arg1.field29 = 0;
				if (arg1.field30 > field553) {
					arg1.field28 = -1;
				}
				if (arg1.field27 == 65535) {
					arg1.field27 = -1;
				}
			}
			if ((arg0 & 0x1) != 0) {
				int var9 = arg2.method252();
				if (var9 == 65535) {
					var9 = -1;
				}
				int var10 = arg2.method243();
				if (var9 == arg1.field47 && var9 != -1) {
					int var11 = class41.field1184[var9].field1198;
					if (var11 == 1) {
						arg1.field48 = 0;
						arg1.field49 = 0;
						arg1.field50 = var10;
						arg1.field51 = 0;
					}
					if (var11 == 2) {
						arg1.field51 = 0;
					}
				} else if (var9 == -1 || arg1.field47 == -1 || class41.field1184[var9].field1192 >= class41.field1184[arg1.field47].field1192) {
					arg1.field47 = var9;
					arg1.field48 = 0;
					arg1.field49 = 0;
					arg1.field50 = var10;
					arg1.field51 = 0;
					arg1.field65 = arg1.field17;
				}
			}
			if ((arg0 & 0x2) != 0) {
				arg1.field41 = arg2.method226();
				arg1.field42 = arg2.method252();
			}
			if ((arg0 & 0x400) != 0) {
				arg1.field57 = arg2.method244();
				arg1.field59 = arg2.method245();
				arg1.field58 = arg2.method243();
				arg1.field60 = arg2.method243();
				arg1.field61 = arg2.method252() + field553;
				arg1.field62 = arg2.method253() + field553;
				arg1.field63 = arg2.method224();
				arg1.method7((byte) 4);
			}
			if ((arg0 & 0x8) != 0) {
				arg1.field46 = arg2.method231();
				if (arg1.field46.charAt(0) == '~') {
					arg1.field46 = arg1.field46.substring(1);
					this.method126(2, arg1.field46, arg1.field129);
				} else if (arg1 == field299) {
					this.method126(2, arg1.field46, arg1.field129);
				}
				arg1.field56 = 0;
				arg1.field24 = 0;
				arg1.field26 = 150;
			}
			if ((arg0 & 0x80) != 0) {
				arg1.field52 = arg2.method226();
				if (arg1.field52 == 65535) {
					arg1.field52 = -1;
				}
			}
			if ((arg0 & 0x200) != 0) {
				int var12 = arg2.method224();
				int var13 = arg2.method245();
				arg1.method9(field553, var13, var12);
				arg1.field14 = field553 + 300;
				arg1.field15 = arg2.method244();
				arg1.field16 = arg2.method245();
			}
			if ((arg0 & 0x40) != 0) {
				int var14 = arg2.method254();
				int var15 = arg2.method224();
				int var16 = arg2.method245();
				int var17 = arg2.field779;
				if (arg1.field129 != null && arg1.field132) {
					long var18 = class33.method366(arg1.field129);
					boolean var20 = false;
					if (var15 <= 1) {
						for (int var21 = 0; var21 < this.field225; var21++) {
							if (this.field577[var21] == var18) {
								var20 = true;
								break;
							}
						}
					}
					if (!var20 && this.field640 == 0) {
						try {
							this.field230.field779 = 0;
							arg2.method263(var16, this.field230.field778);
							this.field230.field779 = 0;
							String var22 = class39.method396(this.field230, var16);
							String var23 = class65.method486(this.field552, var22);
							arg1.field46 = var23;
							arg1.field56 = var14 >> 8;
							arg1.field24 = var14 & 0xFF;
							arg1.field26 = 150;
							if (var15 == 2 || var15 == 3) {
								this.method126(1, var23, "@cr2@" + arg1.field129);
							} else if (var15 == 1) {
								this.method126(1, var23, "@cr1@" + arg1.field129);
							} else {
								this.method126(2, var23, arg1.field129);
							}
						} catch (Exception var28) {
							signlink.reporterror("cde2");
						}
					}
				}
				arg2.field779 = var17 + var16;
			}
			if ((arg0 & 0x10) != 0) {
				int var25 = arg2.method245();
				int var26 = arg2.method243();
				arg1.method9(field553, var26, var25);
				arg1.field14 = field553 + 300;
				arg1.field15 = arg2.method224();
				arg1.field16 = arg2.method245();
			}
		} catch (RuntimeException var29) {
			signlink.reporterror("2515, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + false + ", " + var29.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.m(B)V")
	public void method152() {
		try {
			while (true) {
				int var1 = this.method16();
				if (var1 == -1) {
					return;
				}
				if (this.field265 != -1 && this.field265 == this.field608) {
					if (var1 == 8 && this.field597.length() > 0) {
						this.field597 = this.field597.substring(0, this.field597.length() - 1);
					}
					if ((var1 >= 97 && var1 <= 122 || var1 >= 65 && var1 <= 90 || var1 >= 48 && var1 <= 57 || var1 == 32) && this.field597.length() < 12) {
						this.field597 = this.field597 + (char) var1;
					}
				} else if (this.field614) {
					if (var1 >= 32 && var1 <= 122 && this.field244.length() < 80) {
						this.field244 = this.field244 + (char) var1;
						this.field642 = true;
					}
					if (var1 == 8 && this.field244.length() > 0) {
						this.field244 = this.field244.substring(0, this.field244.length() - 1);
						this.field642 = true;
					}
					if (var1 == 13 || var1 == 10) {
						this.field614 = false;
						this.field642 = true;
						if (this.field516 == 1) {
							long var2 = class33.method366(this.field244);
							this.method68(var2);
						}
						if (this.field516 == 2 && this.field173 > 0) {
							long var4 = class33.method366(this.field244);
							this.method61(var4);
						}
						if (this.field516 == 3 && this.field244.length() > 0) {
							this.field623.method213(168);
							this.field623.method214(0);
							int var6 = this.field623.field779;
							this.field623.method220(this.field193);
							class39.method397(this.field623, this.field244);
							this.field623.method223(this.field623.field779 - var6, this.field241);
							this.field244 = class39.method398(this.field552, this.field244);
							this.field244 = class65.method486(this.field552, this.field244);
							this.method126(6, this.field244, class33.method370(class33.method367(this.field193)));
							if (this.field355 == 2) {
								this.field355 = 1;
								this.field474 = true;
								this.field623.method213(124);
								this.field623.method214(this.field498);
								this.field623.method214(this.field355);
								this.field623.method214(this.field386);
							}
						}
						if (this.field516 == 4 && this.field225 < 100) {
							long var7 = class33.method366(this.field244);
							this.method57(var7);
						}
						if (this.field516 == 5 && this.field225 > 0) {
							long var9 = class33.method366(this.field244);
							this.method114(var9, this.field557);
						}
					}
				} else if (this.field630 == 1) {
					if (var1 >= 48 && var1 <= 57 && this.field195.length() < 10) {
						this.field195 = this.field195 + (char) var1;
						this.field642 = true;
					}
					if (var1 == 8 && this.field195.length() > 0) {
						this.field195 = this.field195.substring(0, this.field195.length() - 1);
						this.field642 = true;
					}
					if (var1 == 13 || var1 == 10) {
						if (this.field195.length() > 0) {
							int var11 = 0;
							try {
								var11 = Integer.parseInt(this.field195);
							} catch (Exception var22) {
							}
							this.field623.method213(86);
							this.field623.method218(var11);
						}
						this.field630 = 0;
						this.field642 = true;
					}
				} else if (this.field630 == 2) {
					if (var1 >= 32 && var1 <= 122 && this.field195.length() < 12) {
						this.field195 = this.field195 + (char) var1;
						this.field642 = true;
					}
					if (var1 == 8 && this.field195.length() > 0) {
						this.field195 = this.field195.substring(0, this.field195.length() - 1);
						this.field642 = true;
					}
					if (var1 == 13 || var1 == 10) {
						if (this.field195.length() > 0) {
							this.field623.method213(200);
							this.field623.method220(class33.method366(this.field195));
						}
						this.field630 = 0;
						this.field642 = true;
					}
				} else if (this.field499 == -1 && this.field631 == -1) {
					if (var1 >= 32 && var1 <= 122 && this.field441.length() < 80) {
						this.field441 = this.field441 + (char) var1;
						this.field642 = true;
					}
					if (var1 == 8 && this.field441.length() > 0) {
						this.field441 = this.field441.substring(0, this.field441.length() - 1);
						this.field642 = true;
					}
					if ((var1 == 13 || var1 == 10) && this.field441.length() > 0) {
						if (this.field181 == 2) {
							if (this.field441.equals("::clientdrop")) {
								this.method125();
							}
							if (this.field441.equals("::lag")) {
								this.method78();
							}
							if (this.field441.equals("::prefetchmusic")) {
								for (int var12 = 0; var12 < this.field602.method588(2); var12++) {
									this.field602.method584(var12, 2, (byte) 1);
								}
							}
							if (this.field441.equals("::fpson")) {
								field514 = true;
							}
							if (this.field441.equals("::fpsoff")) {
								field514 = false;
							}
							if (this.field441.equals("::noclip")) {
								for (int var13 = 0; var13 < 4; var13++) {
									for (int var14 = 1; var14 < 103; var14++) {
										for (int var15 = 1; var15 < 103; var15++) {
											this.field385[var13].field761[var14][var15] = 0;
										}
									}
								}
							}
						}
						if (this.field441.startsWith("::")) {
							this.field623.method213(230);
							this.field623.method214(this.field441.length() - 1);
							this.field623.method221(this.field441.substring(2));
						} else {
							String var16 = this.field441.toLowerCase();
							byte var17 = 0;
							if (var16.startsWith("yellow:")) {
								var17 = 0;
								this.field441 = this.field441.substring(7);
							} else if (var16.startsWith("red:")) {
								var17 = 1;
								this.field441 = this.field441.substring(4);
							} else if (var16.startsWith("green:")) {
								var17 = 2;
								this.field441 = this.field441.substring(6);
							} else if (var16.startsWith("cyan:")) {
								var17 = 3;
								this.field441 = this.field441.substring(5);
							} else if (var16.startsWith("purple:")) {
								var17 = 4;
								this.field441 = this.field441.substring(7);
							} else if (var16.startsWith("white:")) {
								var17 = 5;
								this.field441 = this.field441.substring(6);
							} else if (var16.startsWith("flash1:")) {
								var17 = 6;
								this.field441 = this.field441.substring(7);
							} else if (var16.startsWith("flash2:")) {
								var17 = 7;
								this.field441 = this.field441.substring(7);
							} else if (var16.startsWith("flash3:")) {
								var17 = 8;
								this.field441 = this.field441.substring(7);
							} else if (var16.startsWith("glow1:")) {
								var17 = 9;
								this.field441 = this.field441.substring(6);
							} else if (var16.startsWith("glow2:")) {
								var17 = 10;
								this.field441 = this.field441.substring(6);
							} else if (var16.startsWith("glow3:")) {
								var17 = 11;
								this.field441 = this.field441.substring(6);
							}
							String var18 = this.field441.toLowerCase();
							byte var19 = 0;
							if (var18.startsWith("wave:")) {
								var19 = 1;
								this.field441 = this.field441.substring(5);
							} else if (var18.startsWith("wave2:")) {
								var19 = 2;
								this.field441 = this.field441.substring(6);
							} else if (var18.startsWith("shake:")) {
								var19 = 3;
								this.field441 = this.field441.substring(6);
							} else if (var18.startsWith("scroll:")) {
								var19 = 4;
								this.field441 = this.field441.substring(7);
							} else if (var18.startsWith("slide:")) {
								var19 = 5;
								this.field441 = this.field441.substring(6);
							}
							this.field623.method213(169);
							this.field623.method214(0);
							int var20 = this.field623.field779;
							this.field230.field779 = 0;
							class39.method397(this.field230, this.field441);
							this.field623.method262(this.field230.field778, this.field230.field779);
							this.field623.method242(var19);
							this.field623.method214(var17);
							this.field623.method223(this.field623.field779 - var20, this.field241);
							this.field441 = class39.method398(this.field552, this.field441);
							this.field441 = class65.method486(this.field552, this.field441);
							field299.field46 = this.field441;
							field299.field56 = var17;
							field299.field24 = var19;
							field299.field26 = 150;
							if (this.field181 == 2) {
								this.method126(2, field299.field46, "@cr2@" + field299.field129);
							} else if (this.field181 == 1) {
								this.method126(2, field299.field46, "@cr1@" + field299.field129);
							} else {
								this.method126(2, field299.field46, field299.field129);
							}
							if (this.field498 == 2) {
								this.field498 = 3;
								this.field474 = true;
								this.field623.method213(124);
								this.field623.method214(this.field498);
								this.field623.method214(this.field355);
								this.field623.method214(this.field386);
							}
						}
						this.field441 = "";
						this.field642 = true;
					}
				}
			}
		} catch (RuntimeException var23) {
			signlink.reporterror("49054, " + 8 + ", " + var23.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.L(I)V")
	public void method153(int arg0) {
		try {
			int var11 = 8 / arg0;
			this.method100();
			if (this.field250 == 1) {
				this.field364[this.field249 / 100].method404(this.field247 - 8 - 4, this.field527, this.field248 - 8 - 4);
			}
			if (this.field250 == 2) {
				this.field364[this.field249 / 100 + 4].method404(this.field247 - 8 - 4, this.field527, this.field248 - 8 - 4);
			}
			if (this.field378 != -1) {
				this.method52(this.field378, this.field447);
				this.method157(class27.method329(this.field378), 0, 0, 0);
			}
			if (this.field265 != -1) {
				this.method52(this.field265, this.field447);
				this.method157(class27.method329(this.field265), 0, 0, 0);
			}
			this.method174();
			if (!this.field392) {
				this.method158();
				this.method119();
			} else if (this.field313 == 0) {
				this.method49();
			}
			if (this.field618 == 1) {
				this.field163.method404(472, this.field527, 296);
			}
			if (field514) {
				byte var2 = 20;
				int var3 = 16776960;
				if (super.field80 < 30 && field237) {
					var3 = 16711680;
				}
				if (super.field80 < 20 && !field237) {
					var3 = 16711680;
				}
				this.field423.method372(617, 20, var3, "Fps:" + super.field80);
				int var12 = var2 + 15;
				Runtime var4 = Runtime.getRuntime();
				int var5 = (int) ((var4.totalMemory() - var4.freeMemory()) / 1024L);
				if (var5 > 33554432 && field237) {
				}
				if (var5 > 67108864 && !field237) {
				}
				this.field423.method372(617, 35, 16776960, "Mem:" + var5 + "k");
				var12 += 15;
			}
			if (this.field470 != 0) {
				int var6 = this.field470 / 50;
				int var7 = var6 / 60;
				int var8 = var6 % 60;
				if (var8 < 10) {
					this.field423.method377("System update in: " + var7 + ":0" + var8, 329, 4, 16776960);
				} else {
					this.field423.method377("System update in: " + var7 + ":" + var8, 329, 4, 16776960);
				}
			}
		} catch (RuntimeException var10) {
			signlink.reporterror("1392, " + arg0 + ", " + var10.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.n(B)V")
	public void method154() {
		try {
			int var1 = this.field367 * 128 + 64;
			int var2 = this.field368 * 128 + 64;
			int var3 = this.method129(var1, var2, this.field180) - this.field369;
			if (this.field184 < var1) {
				this.field184 += this.field370 + (var1 - this.field184) * this.field371 / 1000;
				if (this.field184 > var1) {
					this.field184 = var1;
				}
			}
			if (this.field184 > var1) {
				this.field184 -= this.field370 + (this.field184 - var1) * this.field371 / 1000;
				if (this.field184 < var1) {
					this.field184 = var1;
				}
			}
			if (this.field185 < var3) {
				this.field185 += this.field370 + (var3 - this.field185) * this.field371 / 1000;
				if (this.field185 > var3) {
					this.field185 = var3;
				}
			}
			if (this.field185 > var3) {
				this.field185 -= this.field370 + (this.field185 - var3) * this.field371 / 1000;
				if (this.field185 < var3) {
					this.field185 = var3;
				}
			}
			if (this.field186 < var2) {
				this.field186 += this.field370 + (var2 - this.field186) * this.field371 / 1000;
				if (this.field186 > var2) {
					this.field186 = var2;
				}
			}
			if (this.field186 > var2) {
				this.field186 -= this.field370 + (this.field186 - var2) * this.field371 / 1000;
				if (this.field186 < var2) {
					this.field186 = var2;
				}
			}
			int var4 = this.field585 * 128 + 64;
			int var5 = this.field586 * 128 + 64;
			int var6 = this.method129(var4, var5, this.field180) - this.field587;
			int var7 = var4 - this.field184;
			int var8 = var6 - this.field185;
			int var9 = var5 - this.field186;
			int var10 = (int) Math.sqrt((double) (var7 * var7 + var9 * var9));
			int var11 = (int) (Math.atan2((double) var8, (double) var10) * 325.949D) & 0x7FF;
			int var12 = (int) (Math.atan2((double) var7, (double) var9) * -325.949D) & 0x7FF;
			if (var11 < 128) {
				var11 = 128;
			}
			if (var11 > 383) {
				var11 = 383;
			}
			if (this.field187 < var11) {
				this.field187 += this.field588 + (var11 - this.field187) * this.field589 / 1000;
				if (this.field187 > var11) {
					this.field187 = var11;
				}
			}
			if (this.field187 > var11) {
				this.field187 -= this.field588 + (this.field187 - var11) * this.field589 / 1000;
				if (this.field187 < var11) {
					this.field187 = var11;
				}
			}
			int var13 = var12 - this.field188;
			if (var13 > 1024) {
				var13 -= 2048;
			}
			if (var13 < -1024) {
				var13 += 2048;
			}
			if (var13 > 0) {
				this.field188 += this.field588 + var13 * this.field589 / 1000;
				this.field188 &= 0x7FF;
			}
			if (var13 < 0) {
				this.field188 -= this.field588 + -var13 * this.field589 / 1000;
				this.field188 &= 0x7FF;
			}
			int var14 = var12 - this.field188;
			if (var14 > 1024) {
				var14 -= 2048;
			}
			if (var14 < -1024) {
				var14 += 2048;
			}
			if (var14 < 0 && var13 > 0 || var14 > 0 && var13 < 0) {
				this.field188 = var12;
			}
		} catch (RuntimeException var16) {
			signlink.reporterror("29019, " + 8 + ", " + var16.toString());
			throw new RuntimeException();
		}
	}

	@Override
	public void init() {
		field234 = Integer.parseInt(this.getParameter("nodeid"));
		field235 = Integer.parseInt(this.getParameter("portoff"));
		String var1 = this.getParameter("lowmem");
		if (var1 != null && var1.equals("1")) {
			method130();
		} else {
			method171();
		}
		String var2 = this.getParameter("free");
		if (var2 != null && var2.equals("1")) {
			field236 = false;
		} else {
			field236 = true;
		}
		this.method13();
	}

	@ObfuscatedName("client.a(IBIIIIZIIIII)Z")
	public boolean method155(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
		try {
			for (int var13 = 0; var13 < 104; var13++) {
				for (int var14 = 0; var14 < 104; var14++) {
					this.field520[var13][var14] = 0;
					this.field542[var13][var14] = 99999999;
				}
			}
			int var15 = arg8;
			int var16 = arg5;
			this.field520[arg8][arg5] = 99;
			this.field542[arg8][arg5] = 0;
			byte var17 = 0;
			int var18 = 0;
			this.field175[0] = arg8;
			int var37 = var17 + 1;
			this.field176[0] = arg5;
			boolean var19 = false;
			int var20 = this.field175.length;
			int[][] var21 = this.field385[this.field180].field761;
			while (var18 != var37) {
				var15 = this.field175[var18];
				var16 = this.field176[var18];
				var18 = (var18 + 1) % var20;
				if (var15 == arg0 && var16 == arg2) {
					var19 = true;
					break;
				}
				if (arg11 != 0) {
					if ((arg11 < 5 || arg11 == 10) && this.field385[this.field180].method209(var15, arg0, arg11 - 1, arg2, var16, arg9)) {
						var19 = true;
						break;
					}
					if (arg11 < 10 && this.field385[this.field180].method210(arg9, arg2, arg11 - 1, arg0, this.field286, var16, var15)) {
						var19 = true;
						break;
					}
				}
				if (arg10 != 0 && arg4 != 0 && this.field385[this.field180].method211(arg0, var16, arg2, arg10, var15, arg4, arg7)) {
					var19 = true;
					break;
				}
				int var22 = this.field542[var15][var16] + 1;
				if (var15 > 0 && this.field520[var15 - 1][var16] == 0 && (var21[var15 - 1][var16] & 0x1280108) == 0) {
					this.field175[var37] = var15 - 1;
					this.field176[var37] = var16;
					var37 = (var37 + 1) % var20;
					this.field520[var15 - 1][var16] = 2;
					this.field542[var15 - 1][var16] = var22;
				}
				if (var15 < 103 && this.field520[var15 + 1][var16] == 0 && (var21[var15 + 1][var16] & 0x1280180) == 0) {
					this.field175[var37] = var15 + 1;
					this.field176[var37] = var16;
					var37 = (var37 + 1) % var20;
					this.field520[var15 + 1][var16] = 8;
					this.field542[var15 + 1][var16] = var22;
				}
				if (var16 > 0 && this.field520[var15][var16 - 1] == 0 && (var21[var15][var16 - 1] & 0x1280102) == 0) {
					this.field175[var37] = var15;
					this.field176[var37] = var16 - 1;
					var37 = (var37 + 1) % var20;
					this.field520[var15][var16 - 1] = 1;
					this.field542[var15][var16 - 1] = var22;
				}
				if (var16 < 103 && this.field520[var15][var16 + 1] == 0 && (var21[var15][var16 + 1] & 0x1280120) == 0) {
					this.field175[var37] = var15;
					this.field176[var37] = var16 + 1;
					var37 = (var37 + 1) % var20;
					this.field520[var15][var16 + 1] = 4;
					this.field542[var15][var16 + 1] = var22;
				}
				if (var15 > 0 && var16 > 0 && this.field520[var15 - 1][var16 - 1] == 0 && (var21[var15 - 1][var16 - 1] & 0x128010E) == 0 && (var21[var15 - 1][var16] & 0x1280108) == 0 && (var21[var15][var16 - 1] & 0x1280102) == 0) {
					this.field175[var37] = var15 - 1;
					this.field176[var37] = var16 - 1;
					var37 = (var37 + 1) % var20;
					this.field520[var15 - 1][var16 - 1] = 3;
					this.field542[var15 - 1][var16 - 1] = var22;
				}
				if (var15 < 103 && var16 > 0 && this.field520[var15 + 1][var16 - 1] == 0 && (var21[var15 + 1][var16 - 1] & 0x1280183) == 0 && (var21[var15 + 1][var16] & 0x1280180) == 0 && (var21[var15][var16 - 1] & 0x1280102) == 0) {
					this.field175[var37] = var15 + 1;
					this.field176[var37] = var16 - 1;
					var37 = (var37 + 1) % var20;
					this.field520[var15 + 1][var16 - 1] = 9;
					this.field542[var15 + 1][var16 - 1] = var22;
				}
				if (var15 > 0 && var16 < 103 && this.field520[var15 - 1][var16 + 1] == 0 && (var21[var15 - 1][var16 + 1] & 0x1280138) == 0 && (var21[var15 - 1][var16] & 0x1280108) == 0 && (var21[var15][var16 + 1] & 0x1280120) == 0) {
					this.field175[var37] = var15 - 1;
					this.field176[var37] = var16 + 1;
					var37 = (var37 + 1) % var20;
					this.field520[var15 - 1][var16 + 1] = 6;
					this.field542[var15 - 1][var16 + 1] = var22;
				}
				if (var15 < 103 && var16 < 103 && this.field520[var15 + 1][var16 + 1] == 0 && (var21[var15 + 1][var16 + 1] & 0x12801E0) == 0 && (var21[var15 + 1][var16] & 0x1280180) == 0 && (var21[var15][var16 + 1] & 0x1280120) == 0) {
					this.field175[var37] = var15 + 1;
					this.field176[var37] = var16 + 1;
					var37 = (var37 + 1) % var20;
					this.field520[var15 + 1][var16 + 1] = 12;
					this.field542[var15 + 1][var16 + 1] = var22;
				}
			}
			this.field414 = 0;
			boolean var36 = false;
			if (!var19) {
				if (arg6) {
					int var23 = 100;
					for (int var24 = 1; var24 < 2; var24++) {
						for (int var25 = arg0 - var24; var25 <= arg0 + var24; var25++) {
							for (int var26 = arg2 - var24; var26 <= arg2 + var24; var26++) {
								if (var25 >= 0 && var26 >= 0 && var25 < 104 && var26 < 104 && this.field542[var25][var26] < var23) {
									var23 = this.field542[var25][var26];
									var15 = var25;
									var16 = var26;
									this.field414 = 1;
									var19 = true;
								}
							}
						}
						if (var19) {
							break;
						}
					}
				}
				if (!var19) {
					return false;
				}
			}
			byte var27 = 0;
			this.field175[0] = var15;
			int var38 = var27 + 1;
			this.field176[0] = var16;
			int var28;
			int var29 = var28 = this.field520[var15][var16];
			while (var15 != arg8 || var16 != arg5) {
				if (var29 != var28) {
					var28 = var29;
					this.field175[var38] = var15;
					this.field176[var38++] = var16;
				}
				if ((var29 & 0x2) != 0) {
					var15++;
				} else if ((var29 & 0x8) != 0) {
					var15--;
				}
				if ((var29 & 0x1) != 0) {
					var16++;
				} else if ((var29 & 0x4) != 0) {
					var16--;
				}
				var29 = this.field520[var15][var16];
			}
			if (var38 > 0) {
				int var30 = var38;
				if (var38 > 25) {
					var30 = 25;
				}
				var38--;
				int var31 = this.field175[var38];
				int var32 = this.field176[var38];
				if (arg3 == 0) {
					this.field623.method213(246);
					this.field623.method214(var30 + var30 + 3);
				}
				if (arg3 == 1) {
					this.field623.method213(147);
					this.field623.method214(var30 + var30 + 3 + 14);
				}
				if (arg3 == 2) {
					this.field623.method213(216);
					this.field623.method214(var30 + var30 + 3);
				}
				this.field623.method240(super.field102[5] == 1 ? 1 : 0);
				this.field623.method249(var32 + this.field610);
				this.field438 = this.field175[0];
				this.field439 = this.field176[0];
				for (int var33 = 1; var33 < var30; var33++) {
					var38--;
					this.field623.method240(this.field175[var38] - var31);
					this.field623.method241(this.field176[var38] - var32);
				}
				this.field623.method249(var31 + this.field609);
				return true;
			} else if (arg3 == 1) {
				return false;
			} else {
				return true;
			}
		} catch (RuntimeException var35) {
			signlink.reporterror("28339, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + arg10 + ", " + arg11 + ", " + var35.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.e(II)V")
	public void method156(int arg0) {
		try {
			signlink.wavevol = arg0;
		} catch (RuntimeException var3) {
			signlink.reporterror("55068, " + -687 + ", " + arg0 + ", " + var3.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.a(LIRYXZZFE;IBII)V")
	public void method157(class27 arg0, int arg1, int arg2, int arg3) {
		try {
			if (arg0.field922 == 0 && arg0.field911 != null && (!arg0.field917 || this.field388 == arg0.field914 || this.field255 == arg0.field914 || this.field271 == arg0.field914)) {
				int var5 = class26.field881;
				int var6 = class26.field879;
				int var7 = class26.field882;
				int var8 = class26.field880;
				class26.method312(arg1 + arg0.field932, arg2 + arg0.field910, arg1, this.field214, arg2);
				int var9 = arg0.field911.length;
				for (int var10 = 0; var10 < var9; var10++) {
					int var11 = arg0.field933[var10] + arg1;
					int var12 = arg0.field960[var10] + arg2 - arg3;
					class27 var13 = class27.method329(arg0.field911[var10]);
					int var14 = var11 + var13.field937;
					int var15 = var12 + var13.field907;
					if (var13.field891 > 0) {
						this.method112(var13, this.field620);
					}
					if (var13.field922 == 0) {
						if (var13.field928 > var13.field921 - var13.field910) {
							var13.field928 = var13.field921 - var13.field910;
						}
						if (var13.field928 < 0) {
							var13.field928 = 0;
						}
						this.method157(var13, var14, var15, var13.field928);
						if (var13.field921 > var13.field910) {
							this.method55(var13.field928, var13.field910, var13.field921, var14 + var13.field932, var15);
						}
					} else if (var13.field922 != 1) {
						if (var13.field922 == 2) {
							int var16 = 0;
							for (int var17 = 0; var17 < var13.field910; var17++) {
								for (int var18 = 0; var18 < var13.field932; var18++) {
									int var19 = var14 + var18 * (var13.field942 + 32);
									int var20 = var15 + var17 * (var13.field915 + 32);
									if (var16 < 20) {
										var19 += var13.field935[var16];
										var20 += var13.field893[var16];
									}
									if (var13.field947[var16] > 0) {
										int var21 = 0;
										int var22 = 0;
										int var23 = var13.field947[var16] - 1;
										if (var19 > class26.field881 - 32 && var19 < class26.field882 && var20 > class26.field879 - 32 && var20 < class26.field880 || this.field582 != 0 && this.field581 == var16) {
											int var24 = 0;
											if (this.field545 == 1 && this.field546 == var16 && this.field547 == var13.field914) {
												var24 = 16777215;
											}
											class40 var25 = class67.method524(var23, var24, var13.field909[var16]);
											if (var25 != null) {
												if (this.field582 != 0 && this.field581 == var16 && this.field580 == var13.field914) {
													var21 = super.field92 - this.field583;
													var22 = super.field93 - this.field584;
													if (var21 < 5 && var21 > -5) {
														var21 = 0;
													}
													if (var22 < 5 && var22 > -5) {
														var22 = 0;
													}
													if (this.field444 < 5) {
														var21 = 0;
														var22 = 0;
													}
													var25.method406(var19 + var21, var20 + var22, this.field374);
													if (var20 + var22 < class26.field879 && arg0.field928 > 0) {
														int var26 = this.field447 * (class26.field879 - var20 - var22) / 3;
														if (var26 > this.field447 * 10) {
															var26 = this.field447 * 10;
														}
														if (var26 > arg0.field928) {
															var26 = arg0.field928;
														}
														arg0.field928 -= var26;
														this.field584 += var26;
													}
													if (var20 + var22 + 32 > class26.field880 && arg0.field928 < arg0.field921 - arg0.field910) {
														int var27 = this.field447 * (var20 + var22 + 32 - class26.field880) / 3;
														if (var27 > this.field447 * 10) {
															var27 = this.field447 * 10;
														}
														if (var27 > arg0.field921 - arg0.field910 - arg0.field928) {
															var27 = arg0.field921 - arg0.field910 - arg0.field928;
														}
														arg0.field928 += var27;
														this.field584 -= var27;
													}
												} else if (this.field503 != 0 && this.field502 == var16 && this.field501 == var13.field914) {
													var25.method406(var19, var20, this.field374);
												} else {
													var25.method404(var19, this.field527, var20);
												}
												if (var25.field1180 == 33 || var13.field909[var16] != 1) {
													int var28 = var13.field909[var16];
													this.field422.method377(method167(var28), var20 + var22 + 10, var19 + 1 + var21, 0);
													this.field422.method377(method167(var28), var20 + var22 + 9, var19 + var21, 16776960);
												}
											}
										}
									} else if (var13.field957 != null && var16 < 20) {
										class40 var29 = var13.field957[var16];
										if (var29 != null) {
											var29.method404(var19, this.field527, var20);
										}
									}
									var16++;
								}
							}
						} else if (var13.field922 == 3) {
							boolean var30 = false;
							if (this.field271 == var13.field914 || this.field255 == var13.field914 || this.field388 == var13.field914) {
								var30 = true;
							}
							int var31;
							if (this.method45(var13)) {
								var31 = var13.field900;
								if (var30 && var13.field940 != 0) {
									var31 = var13.field940;
								}
							} else {
								var31 = var13.field892;
								if (var30 && var13.field890 != 0) {
									var31 = var13.field890;
								}
							}
							if (var13.field913 == 0) {
								if (var13.field908) {
									class26.method315(var31, var14, 99, var13.field932, var13.field910, var15);
								} else {
									class26.method316(var15, var13.field932, var14, var13.field910, var31);
								}
							} else if (var13.field908) {
								class26.method314(var13.field910, var14, 256 - (var13.field913 & 0xFF), var15, var13.field932, var31);
							} else {
								class26.method317(var13.field932, var31, var14, var15, 256 - (var13.field913 & 0xFF), var13.field910);
							}
						} else if (var13.field922 == 4) {
							class34 var32 = var13.field953;
							String var33 = var13.field918;
							boolean var34 = false;
							if (this.field271 == var13.field914 || this.field255 == var13.field914 || this.field388 == var13.field914) {
								var34 = true;
							}
							int var35;
							if (this.method45(var13)) {
								var35 = var13.field900;
								if (var34 && var13.field940 != 0) {
									var35 = var13.field940;
								}
								if (var13.field954.length() > 0) {
									var33 = var13.field954;
								}
							} else {
								var35 = var13.field892;
								if (var34 && var13.field890 != 0) {
									var35 = var13.field890;
								}
							}
							if (var13.field934 == 6 && this.field446) {
								var33 = "Please wait...";
								var35 = var13.field892;
							}
							if (class26.field877 == 479) {
								if (var35 == 16776960) {
									var35 = 255;
								}
								if (var35 == 49152) {
									var35 = 16777215;
								}
							}
							int var36 = var15 + var32.field1103;
							while (var33.length() > 0) {
								if (var33.indexOf("%") != -1) {
									label386: while (true) {
										int var37 = var33.indexOf("%1");
										if (var37 == -1) {
											while (true) {
												int var38 = var33.indexOf("%2");
												if (var38 == -1) {
													while (true) {
														int var39 = var33.indexOf("%3");
														if (var39 == -1) {
															while (true) {
																int var40 = var33.indexOf("%4");
																if (var40 == -1) {
																	while (true) {
																		int var41 = var33.indexOf("%5");
																		if (var41 == -1) {
																			break label386;
																		}
																		var33 = var33.substring(0, var41) + this.method107(this.method44(var13, 4)) + var33.substring(var41 + 2);
																	}
																}
																var33 = var33.substring(0, var40) + this.method107(this.method44(var13, 3)) + var33.substring(var40 + 2);
															}
														}
														var33 = var33.substring(0, var39) + this.method107(this.method44(var13, 2)) + var33.substring(var39 + 2);
													}
												}
												var33 = var33.substring(0, var38) + this.method107(this.method44(var13, 1)) + var33.substring(var38 + 2);
											}
										}
										var33 = var33.substring(0, var37) + this.method107(this.method44(var13, 0)) + var33.substring(var37 + 2);
									}
								}
								int var42 = var33.indexOf("\\n");
								String var43;
								if (var42 == -1) {
									var43 = var33;
									var33 = "";
								} else {
									var43 = var33.substring(0, var42);
									var33 = var33.substring(var42 + 2);
								}
								if (var13.field936) {
									var32.method374(var14 + var13.field932 / 2, var43, var36, var13.field894, var35);
								} else {
									var32.method381(var14, var36, var13.field894, var35, var43);
								}
								var36 += var32.field1103;
							}
						} else if (var13.field922 == 5) {
							class40 var44;
							if (this.method45(var13)) {
								var44 = var13.field930;
							} else {
								var44 = var13.field927;
							}
							if (var44 != null) {
								var44.method404(var14, this.field527, var15);
							}
						} else if (var13.field922 == 6) {
							int var45 = class21.field816;
							int var46 = class21.field817;
							class21.field816 = var14 + var13.field932 / 2;
							class21.field817 = var15 + var13.field910 / 2;
							int var47 = class21.field820[var13.field950] * var13.field949 >> 16;
							int var48 = class21.field821[var13.field950] * var13.field949 >> 16;
							boolean var49 = this.method45(var13);
							int var50;
							if (var49) {
								var50 = var13.field899;
							} else {
								var50 = var13.field898;
							}
							class31 var51;
							if (var50 == -1) {
								var51 = var13.method326(-1, -1, var49);
							} else {
								class41 var52 = class41.field1184[var50];
								var51 = var13.method326(var52.field1186[var13.field948], var52.field1187[var13.field948], var49);
							}
							if (var51 != null) {
								var51.method360(var13.field951, 0, var13.field950, 0, var47, var48);
							}
							class21.field816 = var45;
							class21.field817 = var46;
						} else {
							if (var13.field922 == 7) {
								class34 var53 = var13.field953;
								int var54 = 0;
								for (int var55 = 0; var55 < var13.field910; var55++) {
									for (int var56 = 0; var56 < var13.field932; var56++) {
										if (var13.field947[var54] > 0) {
											class67 var57 = class67.method526(var13.field947[var54] - 1);
											String var58 = var57.field1533;
											if (var57.field1526 || var13.field909[var54] != 1) {
												var58 = var58 + " x" + method53(var13.field909[var54]);
											}
											int var59 = var14 + var56 * (var13.field942 + 115);
											int var60 = var15 + var55 * (var13.field915 + 12);
											if (var13.field936) {
												var53.method374(var59 + var13.field932 / 2, var58, var60, var13.field894, var13.field892);
											} else {
												var53.method381(var59, var60, var13.field894, var13.field892, var58);
											}
										}
										var54++;
									}
								}
							}
							if (var13.field922 == 8 && (this.field530 == var13.field914 || this.field203 == var13.field914 || this.field302 == var13.field914) && this.field278 == 100) {
								int var61 = 0;
								int var62 = 0;
								class34 var63 = this.field423;
								String var64 = var13.field918;
								while (var64.length() > 0) {
									int var65 = var64.indexOf("\\n");
									String var66;
									if (var65 == -1) {
										var66 = var64;
										var64 = "";
									} else {
										var66 = var64.substring(0, var65);
										var64 = var64.substring(var65 + 2);
									}
									int var67 = var63.method375(var66);
									if (var67 > var61) {
										var61 = var67;
									}
									var62 += var63.field1103 + 1;
								}
								var61 += 6;
								var62 += 7;
								int var68 = var14 + var13.field932 - var61 - 5;
								int var69 = var15 + var13.field910 + 5;
								if (var68 < var14 + 5) {
									var68 = var14 + 5;
								}
								if (var68 + var61 > arg1 + arg0.field932) {
									var68 = arg1 + arg0.field932 - var61;
								}
								class26.method315(16777120, var68, 99, var61, var62, var69);
								class26.method316(var69, var61, var68, var62, 0);
								String var70 = var13.field918;
								int var71 = var69 + var63.field1103 + 2;
								while (var70.length() > 0) {
									int var72 = var70.indexOf("\\n");
									String var73;
									if (var72 == -1) {
										var73 = var70;
										var70 = "";
									} else {
										var73 = var70.substring(0, var72);
										var70 = var70.substring(var72 + 2);
									}
									var63.method381(var68 + 3, var71, false, 0, var73);
									var71 += var63.field1103 + 1;
								}
							}
						}
					}
				}
				class26.method312(var7, var8, var5, this.field214, var6);
			}
		} catch (RuntimeException var75) {
			signlink.reporterror("1017, " + arg0 + ", " + arg1 + ", " + 79 + ", " + arg2 + ", " + arg3 + ", " + var75.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.o(B)V")
	public void method158() {
		try {
			if (this.field582 == 0) {
				this.field273[0] = "Cancel";
				this.field348[0] = 1921;
				this.field412 = 1;
				if (this.field631 == -1) {
					this.method47();
					this.field524 = 0;
					this.field394 = 0;
					if (super.field92 > 4 && super.field93 > 4 && super.field92 < 516 && super.field93 < 338) {
						if (this.field265 == -1) {
							this.method148();
						} else {
							this.method128(0, class27.method329(this.field265), 0, super.field93, super.field92, 4, 4);
						}
					}
					if (this.field524 != this.field388) {
						this.field388 = this.field524;
					}
					if (this.field394 != this.field302) {
						this.field302 = this.field394;
					}
					this.field524 = 0;
					this.field394 = 0;
					if (super.field92 > 553 && super.field93 > 205 && super.field92 < 743 && super.field93 < 466) {
						if (this.field519 != -1) {
							this.method128(0, class27.method329(this.field519), 1, super.field93, super.field92, 205, 553);
						} else if (this.field571[this.field365] != -1) {
							this.method128(0, class27.method329(this.field571[this.field365]), 1, super.field93, super.field92, 205, 553);
						}
					}
					if (this.field524 != this.field255) {
						this.field541 = true;
						this.field255 = this.field524;
					}
					if (this.field394 != this.field203) {
						this.field541 = true;
						this.field203 = this.field394;
					}
					this.field524 = 0;
					this.field394 = 0;
					if (super.field92 > 17 && super.field93 > 357 && super.field92 < 496 && super.field93 < 453) {
						if (this.field499 != -1) {
							this.method128(0, class27.method329(this.field499), 2, super.field93, super.field92, 357, 17);
						} else if (this.field629 != -1) {
							this.method128(0, class27.method329(this.field629), 3, super.field93, super.field92, 357, 17);
						} else if (super.field93 < 434 && super.field92 < 426) {
							this.method50(super.field93 - 357, super.field92 - 17);
						}
					}
					if ((this.field499 != -1 || this.field629 != -1) && this.field524 != this.field271) {
						this.field642 = true;
						this.field271 = this.field524;
					}
					if ((this.field499 != -1 || this.field629 != -1) && this.field394 != this.field530) {
						this.field642 = true;
						this.field530 = this.field394;
					}
					boolean var1 = false;
					while (!var1) {
						var1 = true;
						for (int var2 = 0; var2 < this.field412 - 1; var2++) {
							if (this.field348[var2] < 1000 && this.field348[var2 + 1] > 1000) {
								String var3 = this.field273[var2];
								this.field273[var2] = this.field273[var2 + 1];
								this.field273[var2 + 1] = var3;
								int var4 = this.field348[var2];
								this.field348[var2] = this.field348[var2 + 1];
								this.field348[var2 + 1] = var4;
								int var5 = this.field346[var2];
								this.field346[var2] = this.field346[var2 + 1];
								this.field346[var2 + 1] = var5;
								int var6 = this.field347[var2];
								this.field347[var2] = this.field347[var2 + 1];
								this.field347[var2 + 1] = var6;
								int var7 = this.field349[var2];
								this.field349[var2] = this.field349[var2 + 1];
								this.field349[var2 + 1] = var7;
								var1 = false;
							}
						}
					}
				} else {
					this.field524 = 0;
					this.field394 = 0;
					this.method128(0, class27.method329(this.field631), 0, super.field93, super.field92, 0, 0);
					if (this.field524 != this.field388) {
						this.field388 = this.field524;
					}
					if (this.field394 != this.field302) {
						this.field302 = this.field394;
					}
				}
			}
		} catch (RuntimeException var9) {
			signlink.reporterror("51850, " + -53 + ", " + var9.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.a(IZII)I")
	public int method159(int arg0, int arg1, int arg2) {
		try {
			int var4 = 256 - arg1;
			return ((arg2 & 0xFF00FF) * var4 + (arg0 & 0xFF00FF) * arg1 & 0xFF00FF00) + ((arg2 & 0xFF00) * var4 + (arg0 & 0xFF00) * arg1 & 0xFF0000) >> 8;
		} catch (RuntimeException var6) {
			signlink.reporterror("67098, " + arg0 + ", " + true + ", " + arg1 + ", " + arg2 + ", " + var6.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.a(ILHCPBXDEK;)V")
	public void method160(class23 arg0) {
		try {
			int var2 = 0;
			int var3 = -1;
			int var4 = 0;
			int var5 = 0;
			if (arg0.field853 == 0) {
				var2 = this.field407.method554(arg0.field852, arg0.field854, arg0.field855);
			}
			if (arg0.field853 == 1) {
				var2 = this.field407.method555(642, arg0.field852, arg0.field855, arg0.field854);
			}
			if (arg0.field853 == 2) {
				var2 = this.field407.method556(arg0.field852, arg0.field854, arg0.field855);
			}
			if (arg0.field853 == 3) {
				var2 = this.field407.method557(arg0.field852, arg0.field854, arg0.field855);
			}
			if (var2 != 0) {
				int var6 = this.field407.method558(arg0.field852, arg0.field854, arg0.field855, var2);
				var3 = var2 >> 14 & 0x7FFF;
				var4 = var6 & 0x1F;
				var5 = var6 >> 6;
			}
			arg0.field848 = var3;
			arg0.field850 = var4;
			arg0.field849 = var5;
		} catch (RuntimeException var8) {
			signlink.reporterror("15884, " + -905 + ", " + arg0 + ", " + var8.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.a(Ljava/lang/String;Ljava/lang/String;Z)V")
	public void method161(String arg0, String arg1, boolean arg2) {
		signlink.errorname = arg0;
		try {
			if (!arg2) {
				this.field512 = "";
				this.field513 = "Connecting to server...";
				this.method149(true);
			}
			this.field579 = new class1(0, this, this.method85(field235 + 43594));
			long var4 = class33.method366(arg0);
			int var6 = (int) (var4 >> 16 & 0x1FL);
			this.field623.field779 = 0;
			this.field623.method214(14);
			this.field623.method214(var6);
			this.field579.method5(this.field623.field778, 2, (byte) 1);
			for (int var7 = 0; var7 < 8; var7++) {
				this.field579.method2();
			}
			int var8 = this.field579.method2();
			int var9 = var8;
			if (var8 == 0) {
				this.field579.method4(this.field222.field778, 0, 8);
				this.field222.field779 = 0;
				this.field517 = this.field222.method230();
				int[] var10 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (this.field517 >> 32), (int) this.field517 };
				this.field623.field779 = 0;
				this.field623.method214(10);
				this.field623.method218(var10[0]);
				this.field623.method218(var10[1]);
				this.field623.method218(var10[2]);
				this.field623.method218(var10[3]);
				this.field623.method218(signlink.uid);
				this.field623.method221(arg0);
				this.field623.method221(arg1);
				this.field623.method239(this.field270, field401, field296);
				this.field621.field779 = 0;
				if (arg2) {
					this.field621.method214(18);
				} else {
					this.field621.method214(16);
				}
				this.field621.method214(this.field623.field779 + 36 + 1 + 1 + 2);
				this.field621.method214(255);
				this.field621.method215(349);
				this.field621.method214(field237 ? 1 : 0);
				for (int var11 = 0; var11 < 9; var11++) {
					this.field621.method218(this.field306[var11]);
				}
				this.field621.method222(this.field623.field779, this.field623.field778);
				this.field623.field783 = new class70(var10, 7);
				for (int var12 = 0; var12 < 4; var12++) {
					var10[var12] += 50;
				}
				this.field625 = new class70(var10, 7);
				this.field579.method5(this.field621.field778, this.field621.field779, (byte) 1);
				var8 = this.field579.method2();
			}
			if (var8 == 1) {
				try {
					Thread.sleep(2000L);
				} catch (Exception var22) {
				}
				this.method161(arg0, arg1, arg2);
			} else if (var8 == 2) {
				this.field181 = this.field579.method2();
				field377 = this.field579.method2() == 1;
				this.field298 = 0L;
				this.field218 = 0;
				this.field242.field1410 = 0;
				super.field89 = true;
				this.field486 = true;
				this.field578 = true;
				this.field623.field779 = 0;
				this.field222.field779 = 0;
				this.field434 = -1;
				this.field227 = -1;
				this.field228 = -1;
				this.field229 = -1;
				this.field433 = 0;
				this.field435 = 0;
				this.field470 = 0;
				this.field437 = 0;
				this.field281 = 0;
				this.field412 = 0;
				this.field392 = false;
				super.field90 = 0;
				for (int var13 = 0; var13 < 100; var13++) {
					this.field560[var13] = null;
				}
				this.field545 = 0;
				this.field636 = 0;
				this.field179 = 0;
				this.field615 = 0;
				this.field287 = (int) (Math.random() * 100.0D) - 50;
				this.field574 = (int) (Math.random() * 110.0D) - 55;
				this.field616 = (int) (Math.random() * 80.0D) - 40;
				this.field323 = (int) (Math.random() * 120.0D) - 60;
				this.field599 = (int) (Math.random() * 30.0D) - 20;
				this.field633 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
				this.field594 = 0;
				this.field252 = -1;
				this.field438 = 0;
				this.field439 = 0;
				this.field565 = 0;
				this.field232 = 0;
				for (int var14 = 0; var14 < this.field562; var14++) {
					this.field564[var14] = null;
					this.field569[var14] = null;
				}
				for (int var15 = 0; var15 < 16384; var15++) {
					this.field231[var15] = null;
				}
				field299 = this.field564[this.field563] = new class5();
				this.field260.method279();
				this.field308.method279();
				for (int var16 = 0; var16 < 4; var16++) {
					for (int var17 = 0; var17 < 104; var17++) {
						for (int var18 = 0; var18 < 104; var18++) {
							this.field406[var16][var17][var18] = null;
						}
					}
				}
				this.field525 = new class20(807);
				this.field174 = 0;
				this.field173 = 0;
				this.method146(this.field629);
				this.field629 = -1;
				this.method146(this.field499);
				this.field499 = -1;
				this.method146(this.field265);
				this.field265 = -1;
				this.method146(this.field631);
				this.field631 = -1;
				this.method146(this.field275);
				this.field275 = -1;
				this.method146(this.field519);
				this.field519 = -1;
				this.method146(this.field378);
				this.field378 = -1;
				this.field446 = false;
				this.field365 = 3;
				this.field630 = 0;
				this.field392 = false;
				this.field614 = false;
				this.field321 = null;
				this.field618 = 0;
				this.field533 = -1;
				this.field613 = true;
				this.method80();
				for (int var19 = 0; var19 < 5; var19++) {
					this.field646[var19] = 0;
				}
				for (int var20 = 0; var20 < 5; var20++) {
					this.field595[var20] = null;
					this.field596[var20] = false;
				}
				field526 = 0;
				field279 = 0;
				field201 = 0;
				field294 = 0;
				field246 = 0;
				field337 = 0;
				field395 = 0;
				this.method105(this.field261);
			} else if (var8 == 3) {
				this.field512 = "";
				this.field513 = "Invalid username or password.";
			} else if (var8 == 4) {
				this.field512 = "Your account has been disabled.";
				this.field513 = "Please check your message-centre for details.";
			} else if (var8 == 5) {
				this.field512 = "Your account is already logged in.";
				this.field513 = "Try again in 60 secs...";
			} else if (var8 == 6) {
				this.field512 = "RuneScape has been updated!";
				this.field513 = "Please reload this page.";
			} else if (var8 == 7) {
				this.field512 = "This world is full.";
				this.field513 = "Please use a different world.";
			} else if (var8 == 8) {
				this.field512 = "Unable to connect.";
				this.field513 = "Login server offline.";
			} else if (var8 == 9) {
				this.field512 = "Login limit exceeded.";
				this.field513 = "Too many connections from your address.";
			} else if (var8 == 10) {
				this.field512 = "Unable to connect.";
				this.field513 = "Bad session id.";
			} else if (var8 == 11) {
				this.field512 = "Login server rejected session.";
				this.field513 = "Please try again.";
			} else if (var8 == 12) {
				this.field512 = "You need a members account to login to this world.";
				this.field513 = "Please subscribe, or use a different world.";
			} else if (var8 == 13) {
				this.field512 = "Could not complete login.";
				this.field513 = "Please try using a different world.";
			} else if (var8 == 14) {
				this.field512 = "The server is being updated.";
				this.field513 = "Please wait 1 minute and try again.";
			} else if (var8 == 15) {
				this.field578 = true;
				this.field623.field779 = 0;
				this.field222.field779 = 0;
				this.field434 = -1;
				this.field227 = -1;
				this.field228 = -1;
				this.field229 = -1;
				this.field433 = 0;
				this.field435 = 0;
				this.field470 = 0;
				this.field412 = 0;
				this.field392 = false;
				this.field240 = System.currentTimeMillis();
			} else if (var8 == 16) {
				this.field512 = "Login attempts exceeded.";
				this.field513 = "Please wait 1 minute and try again.";
			} else if (var8 == 17) {
				this.field512 = "You are standing in a members-only area.";
				this.field513 = "To play on this world move to a free area first";
			} else if (var8 == 20) {
				this.field512 = "Invalid loginserver requested";
				this.field513 = "Please try using a different world.";
			} else if (var8 == 21) {
				int var21 = this.field579.method2();
				for (int var26 = var21 + 3; var26 >= 0; var26--) {
					this.field512 = "You have only just left another world";
					this.field513 = "Your profile will be transferred in: " + var26;
					this.method149(true);
					try {
						Thread.sleep(1200L);
					} catch (Exception var23) {
					}
				}
				this.method161(arg0, arg1, arg2);
			} else if (var8 == 22) {
				this.field512 = "Malformed login packet.";
				this.field513 = "Please try again.";
			} else if (var8 != -1) {
				System.out.println("response:" + var8);
				this.field512 = "Unexpected server response";
				this.field513 = "Please try using a different world.";
			} else if (var9 != 0) {
				this.field512 = "No response from server";
				this.field513 = "Please try using a different world.";
			} else if (this.field598 < 2) {
				try {
					Thread.sleep(2000L);
				} catch (Exception var24) {
				}
				this.field598++;
				this.method161(arg0, arg1, arg2);
			} else {
				this.field512 = "No response from loginserver";
				this.field513 = "Please wait 1 minute and try again.";
			}
		} catch (IOException var25) {
			this.field512 = "";
			this.field513 = "Error connecting to server.";
		}
	}

	@ObfuscatedName("client.M(I)V")
	public void method162(int arg0) {
		try {
			boolean var16 = false;
			if (this.field178 == 0) {
				int var2 = super.field82 / 2 - 80;
				int var3 = super.field83 / 2 + 20;
				int var17 = var3 + 20;
				if (super.field98 == 1 && super.field99 >= var2 - 75 && super.field99 <= var2 + 75 && super.field100 >= var17 - 20 && super.field100 <= var17 + 20) {
					this.field178 = 3;
					this.field291 = 0;
				}
				int var4 = super.field82 / 2 + 80;
				if (super.field98 == 1 && super.field99 >= var4 - 75 && super.field99 <= var4 + 75 && super.field100 >= var17 - 20 && super.field100 <= var17 + 20) {
					this.field512 = "";
					this.field513 = "Enter your username & password.";
					this.field178 = 2;
					this.field291 = 0;
				}
			} else if (this.field178 == 2) {
				int var5 = super.field83 / 2 - 40;
				int var18 = var5 + 30;
				int var19 = var18 + 25;
				if (super.field98 == 1 && super.field100 >= var19 - 15 && super.field100 < var19) {
					this.field291 = 0;
				}
				var5 = var19 + 15;
				if (super.field98 == 1 && super.field100 >= var5 - 15 && super.field100 < var5) {
					this.field291 = 1;
				}
				var5 += 15;
				int var6 = super.field82 / 2 - 80;
				int var7 = super.field83 / 2 + 50;
				int var20 = var7 + 20;
				if (super.field98 == 1 && super.field99 >= var6 - 75 && super.field99 <= var6 + 75 && super.field100 >= var20 - 20 && super.field100 <= var20 + 20) {
					this.field598 = 0;
					this.method161(this.field169, this.field170, false);
					if (this.field578) {
						return;
					}
				}
				int var8 = super.field82 / 2 + 80;
				if (super.field98 == 1 && super.field99 >= var8 - 75 && super.field99 <= var8 + 75 && super.field100 >= var20 - 20 && super.field100 <= var20 + 20) {
					this.field178 = 0;
					this.field169 = "";
					this.field170 = "";
				}
				while (true) {
					while (true) {
						int var9 = this.method16();
						if (var9 == -1) {
							return;
						}
						boolean var10 = false;
						for (int var11 = 0; var11 < field649.length(); var11++) {
							if (var9 == field649.charAt(var11)) {
								var10 = true;
								break;
							}
						}
						if (this.field291 == 0) {
							if (var9 == 8 && this.field169.length() > 0) {
								this.field169 = this.field169.substring(0, this.field169.length() - 1);
							}
							if (var9 == 9 || var9 == 10 || var9 == 13) {
								this.field291 = 1;
							}
							if (var10) {
								this.field169 = this.field169 + (char) var9;
							}
							if (this.field169.length() > 12) {
								this.field169 = this.field169.substring(0, 12);
							}
						} else if (this.field291 == 1) {
							if (var9 == 8 && this.field170.length() > 0) {
								this.field170 = this.field170.substring(0, this.field170.length() - 1);
							}
							if (var9 == 9 || var9 == 10 || var9 == 13) {
								this.field291 = 0;
							}
							if (var10) {
								this.field170 = this.field170 + (char) var9;
							}
							if (this.field170.length() > 20) {
								this.field170 = this.field170.substring(0, 20);
							}
						}
					}
				}
			} else if (this.field178 == 3) {
				int var12 = super.field82 / 2;
				int var13 = super.field83 / 2 + 50;
				int var21 = var13 + 20;
				if (super.field98 == 1 && super.field99 >= var12 - 75 && super.field99 <= var12 + 75 && super.field100 >= var21 - 20 && super.field100 <= var21 + 20) {
					this.field178 = 0;
					return;
				}
			}
		} catch (RuntimeException var15) {
			signlink.reporterror("47293, " + arg0 + ", " + var15.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.a(Ljava/lang/Runnable;I)V")
	@Override
	public void method23(Runnable arg0, int arg1) {
		if (arg1 > 10) {
			arg1 = 10;
		}
		if (signlink.mainapp == null) {
			super.method23(arg0, arg1);
		} else {
			signlink.startthread(arg0, arg1);
		}
	}

	@ObfuscatedName("client.e(ZI)V")
	public void method163(boolean arg0) {
		try {
			for (int var2 = 0; var2 < this.field232; var2++) {
				class43 var3 = this.field231[this.field233[var2]];
				int var4 = (this.field233[var2] << 14) + 536870912;
				if (var3 != null && var3.method10() && var3.field1213.field1145 == arg0 && var3.field1213.method392()) {
					int var5 = var3.field67 >> 7;
					int var6 = var3.field68 >> 7;
					if (var5 >= 0 && var5 < 104 && var6 >= 0 && var6 < 104) {
						if (var3.field54 == 1 && (var3.field67 & 0x7F) == 64 && (var3.field68 & 0x7F) == 64) {
							if (this.field409[var5][var6] == this.field297) {
								continue;
							}
							this.field409[var5][var6] = this.field297;
						}
						if (!var3.field1213.field1128) {
							var4 += Integer.MIN_VALUE;
						}
						this.field407.method539(var3.field67, var3.field69, this.field180, var3.field68, (var3.field54 - 1) * 64 + 60, var3, this.method129(var3.field67, var3.field68, this.field180), var3.field39, var4);
					}
				}
			}
		} catch (RuntimeException var8) {
			signlink.reporterror("18121, " + arg0 + ", " + ", " + var8.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.p(B)V")
	public void method164(byte arg0) {
		try {
			boolean var6 = false;
			if (this.field179 == 2) {
				for (class23 var2 = (class23) this.field525.method275(); var2 != null; var2 = (class23) this.field525.method277()) {
					if (var2.field851 > 0) {
						var2.field851--;
					}
					if (var2.field851 != 0) {
						if (var2.field856 > 0) {
							var2.field856--;
						}
						if (var2.field856 == 0 && var2.field854 >= 1 && var2.field855 >= 1 && var2.field854 <= 102 && var2.field855 <= 102 && (var2.field845 < 0 || class44.method436(var2.field847, var2.field845))) {
							this.method175(var2.field845, this.field290, var2.field846, var2.field852, var2.field853, var2.field854, var2.field855, var2.field847);
							var2.field856 = -1;
							if (var2.field845 == var2.field848 && var2.field848 == -1) {
								var2.method334();
							} else if (var2.field845 == var2.field848 && var2.field846 == var2.field849 && var2.field847 == var2.field850) {
								var2.method334();
							}
						}
					} else if (var2.field848 < 0 || class44.method436(var2.field850, var2.field848)) {
						this.method175(var2.field848, this.field290, var2.field849, var2.field852, var2.field853, var2.field854, var2.field855, var2.field850);
						var2.method334();
					}
				}
				field515++;
				if (field515 > 1896) {
					field515 = 0;
					this.field623.method213(119);
					this.field623.method214(0);
					int var3 = this.field623.field779;
					this.field623.method215((int) (Math.random() * 65536.0D));
					this.field623.method215((int) (Math.random() * 65536.0D));
					this.field623.method214(245);
					this.field623.method215(25901);
					this.field623.method214((int) (Math.random() * 256.0D));
					this.field623.method214(130);
					if ((int) (Math.random() * 2.0D) == 0) {
						this.field623.method214(74);
					}
					this.field623.method215(64410);
					this.field623.method214(239);
					if ((int) (Math.random() * 2.0D) == 0) {
						this.field623.method215(62571);
					}
					this.field623.method223(this.field623.field779 - var3, this.field241);
					return;
				}
			}
		} catch (RuntimeException var5) {
			signlink.reporterror("15250, " + arg0 + ", " + var5.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.a(LEILHLJCE;IB)V")
	public void method165(class17 arg0, int arg1) {
		try {
			arg0.method234();
			int var3 = arg0.method235(1);
			if (this.field309 != -24) {
				this.field434 = -1;
			}
			if (var3 != 0) {
				int var4 = arg0.method235(2);
				if (var4 == 0) {
					this.field568[this.field567++] = this.field563;
				} else if (var4 == 1) {
					int var5 = arg0.method235(3);
					field299.method8(var5, false);
					int var6 = arg0.method235(1);
					if (var6 == 1) {
						this.field568[this.field567++] = this.field563;
					}
				} else if (var4 == 2) {
					int var7 = arg0.method235(3);
					field299.method8(var7, true);
					int var8 = arg0.method235(3);
					field299.method8(var8, true);
					int var9 = arg0.method235(1);
					if (var9 == 1) {
						this.field568[this.field567++] = this.field563;
					}
				} else if (var4 == 3) {
					int var10 = arg0.method235(7);
					int var11 = arg0.method235(7);
					this.field180 = arg0.method235(2);
					int var12 = arg0.method235(1);
					int var13 = arg0.method235(1);
					if (var13 == 1) {
						this.field568[this.field567++] = this.field563;
					}
					field299.method11(var10, var11, var12 == 1);
				}
			}
		} catch (RuntimeException var15) {
			signlink.reporterror("90575, " + arg0 + ", " + arg1 + ", " + -24 + ", " + var15.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.q(B)V")
	public void method166() {
		try {
			if (super.field98 == 1) {
				if (super.field99 >= 6 && super.field99 <= 106 && super.field100 >= 467 && super.field100 <= 499) {
					this.field498 = (this.field498 + 1) % 4;
					this.field474 = true;
					this.field642 = true;
					this.field623.method213(124);
					this.field623.method214(this.field498);
					this.field623.method214(this.field355);
					this.field623.method214(this.field386);
				}
				if (super.field99 >= 135 && super.field99 <= 235 && super.field100 >= 467 && super.field100 <= 499) {
					this.field355 = (this.field355 + 1) % 3;
					this.field474 = true;
					this.field642 = true;
					this.field623.method213(124);
					this.field623.method214(this.field498);
					this.field623.method214(this.field355);
					this.field623.method214(this.field386);
				}
				if (super.field99 >= 273 && super.field99 <= 373 && super.field100 >= 467 && super.field100 <= 499) {
					this.field386 = (this.field386 + 1) % 3;
					this.field474 = true;
					this.field642 = true;
					this.field623.method213(124);
					this.field623.method214(this.field498);
					this.field623.method214(this.field355);
					this.field623.method214(this.field386);
				}
				if (super.field99 >= 412 && super.field99 <= 512 && super.field100 >= 467 && super.field100 <= 499) {
					if (this.field265 == -1) {
						this.method88();
						this.field597 = "";
						this.field487 = false;
						this.field608 = this.field265 = class27.field887;
						return;
					}
					this.method126(0, "Please close the interface you have open before using 'report abuse'", "");
					return;
				}
			}
		} catch (RuntimeException var2) {
			signlink.reporterror("31529, " + 9 + ", " + var2.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.N(I)V")
	public void method168() {
		try {
			for (class69 var1 = (class69) this.field308.method275(); var1 != null; var1 = (class69) this.field308.method277()) {
				if (var1.field1616 != this.field180 || var1.field1620) {
					var1.method334();
				} else if (field553 >= var1.field1627) {
					var1.method579(this.field447);
					if (var1.field1620) {
						var1.method334();
					} else {
						this.field407.method539(var1.field1617, 0, var1.field1616, var1.field1618, 60, var1, var1.field1619, false, -1);
					}
				}
			}
		} catch (RuntimeException var3) {
			signlink.reporterror("62870, " + -767 + ", " + var3.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.f(Z)V")
	public void method169() {
		try {
			if (this.field281 == 2) {
				this.method103((this.field165 - this.field610 << 7) + this.field168, this.field166 * 2, (this.field164 - this.field609 << 7) + this.field167);
				if (this.field390 > -1 && field553 % 20 < 10) {
					this.field351[0].method404(this.field390 - 12, this.field527, this.field391 - 28);
				}
			}
		} catch (RuntimeException var2) {
			signlink.reporterror("56932, " + false + ", " + var2.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.O(I)V")
	public void method170() {
		try {
			this.field488.method463();
			class21.field822 = this.field427;
			this.field430.method270(0, this.field527, 0);
			if (this.field519 != -1) {
				this.method157(class27.method329(this.field519), 0, 0, 0);
			} else if (this.field571[this.field365] != -1) {
				this.method157(class27.method329(this.field571[this.field365]), 0, 0, 0);
			}
			if (this.field392 && this.field313 == 1) {
				this.method49();
			}
			this.field488.method464(205, super.field84, 553);
			this.field490.method463();
			class21.field822 = this.field428;
		} catch (RuntimeException var2) {
			signlink.reporterror("94724, " + ", " + var2.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.a(LEILHLJCE;BI)V")
	public void method172(class17 arg0, int arg1) {
		try {
			for (int var3 = 0; var3 < this.field567; var3++) {
				int var4 = this.field568[var3];
				class5 var5 = this.field564[var4];
				int var6 = arg0.method224();
				if ((var6 & 0x4) != 0) {
					var6 += arg0.method224() << 8;
				}
				this.method151(var6, var5, arg0, var4);
			}
		} catch (RuntimeException var8) {
			signlink.reporterror("47938, " + arg0 + ", " + 8 + ", " + arg1 + ", " + var8.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.a([BZZ)V")
	public void method173(byte[] arg0, boolean arg1) {
		try {
			if (this.field379) {
				signlink.midifade = arg1 ? 1 : 0;
				signlink.midisave(arg0, arg0.length);
			}
		} catch (RuntimeException var4) {
			signlink.reporterror("43407, " + arg0 + ", " + false + ", " + arg1 + ", " + var4.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.Q(I)V")
	public void method174() {
		try {
			this.field640 = 0;
			int var1 = (field299.field67 >> 7) + this.field609;
			int var2 = (field299.field68 >> 7) + this.field610;
			if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
				this.field640 = 1;
			}
			if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
				this.field640 = 1;
			}
			if (this.field640 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
				this.field640 = 0;
			}
		} catch (RuntimeException var4) {
			signlink.reporterror("85572, " + 622 + ", " + var4.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.a(IZIIIIII)V")
	public void method175(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		try {
			if (!arg1) {
				this.field406 = null;
			}
			if (arg5 >= 1 && arg6 >= 1 && arg5 <= 102 && arg6 <= 102) {
				if (field237 && arg3 != this.field180) {
					return;
				}
				int var9 = 0;
				if (arg4 == 0) {
					var9 = this.field407.method554(arg3, arg5, arg6);
				}
				if (arg4 == 1) {
					var9 = this.field407.method555(642, arg3, arg6, arg5);
				}
				if (arg4 == 2) {
					var9 = this.field407.method556(arg3, arg5, arg6);
				}
				if (arg4 == 3) {
					var9 = this.field407.method557(arg3, arg5, arg6);
				}
				if (var9 != 0) {
					int var10 = this.field407.method558(arg3, arg5, arg6, var9);
					int var11 = var9 >> 14 & 0x7FFF;
					int var12 = var10 & 0x1F;
					int var13 = var10 >> 6;
					if (arg4 == 0) {
						this.field407.method545(arg5, arg3, arg6);
						class14 var14 = class14.method192(var11);
						if (var14.field698) {
							this.field385[arg3].method205(var12, arg5, var14.field705, var13, arg6);
						}
					}
					if (arg4 == 1) {
						this.field407.method546(arg3, arg6, arg5);
					}
					if (arg4 == 2) {
						this.field407.method547(arg6, arg5, arg3);
						class14 var15 = class14.method192(var11);
						if (arg5 + var15.field708 > 103 || arg6 + var15.field708 > 103 || arg5 + var15.field703 > 103 || arg6 + var15.field703 > 103) {
							return;
						}
						if (var15.field698) {
							this.field385[arg3].method206(arg6, this.field192, var15.field708, var15.field703, var13, arg5, var15.field705);
						}
					}
					if (arg4 == 3) {
						this.field407.method548(arg6, arg5, arg3);
						class14 var16 = class14.method192(var11);
						if (var16.field698 && var16.field699) {
							this.field385[arg3].method208(arg5, arg6);
						}
					}
				}
				if (arg0 >= 0) {
					int var17 = arg3;
					if (arg3 < 3 && (this.field238[1][arg5][arg6] & 0x2) == 2) {
						var17 = arg3 + 1;
					}
					class44.method424(this.field385[arg3], this.field407, arg0, arg5, arg7, this.field622, var17, arg6, arg2, arg3);
					return;
				}
			}
		} catch (RuntimeException var19) {
			signlink.reporterror("61995, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + var19.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.R(I)V")
	public void method176() {
		try {
			this.field491.method463();
			class21.field822 = this.field426;
			this.field432.method270(0, this.field527, 0);
			if (this.field614) {
				this.field424.method373(0, this.field648, 239, 40);
				this.field424.method373(128, this.field244 + "*", 239, 60);
			} else if (this.field630 == 1) {
				this.field424.method373(0, "Enter amount:", 239, 40);
				this.field424.method373(128, this.field195 + "*", 239, 60);
			} else if (this.field630 == 2) {
				this.field424.method373(0, "Enter name:", 239, 40);
				this.field424.method373(128, this.field195 + "*", 239, 60);
			} else if (this.field321 != null) {
				this.field424.method373(0, this.field321, 239, 40);
				this.field424.method373(128, "Click to continue", 239, 60);
			} else if (this.field499 != -1) {
				this.method157(class27.method329(this.field499), 0, 0, 0);
			} else if (this.field629 == -1) {
				class34 var1 = this.field423;
				int var2 = 0;
				class26.method312(463, 77, 0, this.field214, 0);
				for (int var3 = 0; var3 < 100; var3++) {
					if (this.field560[var3] != null) {
						int var4 = this.field558[var3];
						int var5 = this.field356 + 70 - var2 * 14;
						String var6 = this.field559[var3];
						byte var7 = 0;
						if (var6 != null && var6.startsWith("@cr1@")) {
							var6 = var6.substring(5);
							var7 = 1;
						}
						if (var6 != null && var6.startsWith("@cr2@")) {
							var6 = var6.substring(5);
							var7 = 2;
						}
						if (var4 == 0) {
							if (var5 > 0 && var5 < 110) {
								var1.method377(this.field560[var3], var5, 4, 0);
							}
							var2++;
						}
						if ((var4 == 1 || var4 == 2) && (var4 == 1 || this.field498 == 0 || this.field498 == 1 && this.method179(var6))) {
							if (var5 > 0 && var5 < 110) {
								int var8 = 4;
								if (var7 == 1) {
									this.field493[0].method270(4, this.field527, var5 - 12);
									var8 += 14;
								}
								if (var7 == 2) {
									this.field493[1].method270(var8, this.field527, var5 - 12);
									var8 += 14;
								}
								var1.method377(var6 + ":", var5, var8, 0);
								int var9 = var8 + var1.method375(var6) + 8;
								var1.method377(this.field560[var3], var5, var9, 255);
							}
							var2++;
						}
						if ((var4 == 3 || var4 == 7) && this.field243 == 0 && (var4 == 7 || this.field355 == 0 || this.field355 == 1 && this.method179(var6))) {
							if (var5 > 0 && var5 < 110) {
								var1.method377("From", var5, 4, 0);
								int var10 = var1.method375("From ") + 4;
								if (var7 == 1) {
									this.field493[0].method270(var10, this.field527, var5 - 12);
									var10 += 14;
								}
								if (var7 == 2) {
									this.field493[1].method270(var10, this.field527, var5 - 12);
									var10 += 14;
								}
								var1.method377(var6 + ":", var5, var10, 0);
								int var11 = var10 + var1.method375(var6) + 8;
								var1.method377(this.field560[var3], var5, var11, 8388608);
							}
							var2++;
						}
						if (var4 == 4 && (this.field386 == 0 || this.field386 == 1 && this.method179(var6))) {
							if (var5 > 0 && var5 < 110) {
								var1.method377(var6 + " " + this.field560[var3], var5, 4, 8388736);
							}
							var2++;
						}
						if (var4 == 5 && this.field243 == 0 && this.field355 < 2) {
							if (var5 > 0 && var5 < 110) {
								var1.method377(this.field560[var3], var5, 4, 8388608);
							}
							var2++;
						}
						if (var4 == 6 && this.field243 == 0 && this.field355 < 2) {
							if (var5 > 0 && var5 < 110) {
								var1.method377("To " + var6 + ":", var5, 4, 0);
								var1.method377(this.field560[var3], var5, var1.method375("To " + var6) + 12, 8388608);
							}
							var2++;
						}
						if (var4 == 8 && (this.field386 == 0 || this.field386 == 1 && this.method179(var6))) {
							if (var5 > 0 && var5 < 110) {
								var1.method377(var6 + " " + this.field560[var3], var5, 4, 8270336);
							}
							var2++;
						}
					}
				}
				class26.method311();
				this.field380 = var2 * 14 + 7;
				if (this.field380 < 78) {
					this.field380 = 78;
				}
				this.method55(this.field380 - this.field356 - 77, 77, this.field380, 463, 0);
				String var12;
				if (field299 == null || field299.field129 == null) {
					var12 = class33.method370(this.field169);
				} else {
					var12 = field299.field129;
				}
				var1.method377(var12 + ":", 90, 4, 0);
				var1.method377(this.field441 + "*", 90, var1.method375(var12 + ": ") + 6, 255);
				class26.method318(479, 77, 0, 0);
			} else {
				this.method157(class27.method329(this.field629), 0, 0, 0);
			}
			if (this.field392 && this.field313 == 2) {
				this.method49();
			}
			this.field491.method464(357, super.field84, 17);
			this.field490.method463();
			class21.field822 = this.field428;
		} catch (RuntimeException var14) {
			signlink.reporterror("83494, " + -27503 + ", " + var14.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.c(I)V")
	@Override
	public void method18() {
		try {
			if (!this.field543 && !this.field508 && !this.field408) {
				field553++;
				if (this.field578) {
					this.method73();
				} else {
					this.method162(390);
				}
				this.method177();
			}
		} catch (RuntimeException var2) {
			signlink.reporterror("17922, " + 107 + ", " + var2.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.g(Z)V")
	public void method177() {
		try {
			while (true) {
				class12 var1 = this.field602.method599();
				if (var1 == null) {
					return;
				}
				if (var1.field679 == 0) {
					class31.method337(var1.field680, var1.field678);
					if ((this.field602.method592(var1.field680) & 0x62) != 0) {
						this.field541 = true;
						if (this.field499 != -1 || this.field629 != -1) {
							this.field642 = true;
						}
					}
				}
				if (var1.field679 == 1 && var1.field678 != null) {
					class25.method306(var1.field678);
				}
				if (var1.field679 == 2 && var1.field680 == this.field452 && var1.field678 != null) {
					this.method173(var1.field678, this.field453);
				}
				if (var1.field679 == 3 && this.field179 == 1) {
					for (int var2 = 0; var2 < this.field416.length; var2++) {
						if (this.field190[var2] == var1.field680) {
							this.field416[var2] = var1.field678;
							if (var1.field678 == null) {
								this.field190[var2] = -1;
							}
							break;
						}
						if (this.field191[var2] == var1.field680) {
							this.field305[var2] = var1.field678;
							if (var1.field678 == null) {
								this.field191[var2] = -1;
							}
							break;
						}
					}
				}
				if (var1.field679 == 93 && this.field602.method590(var1.field680)) {
					class44.method417(new class17(var1.field678, -26583), this.field602);
				}
			}
		} catch (RuntimeException var4) {
			signlink.reporterror("9499, " + true + ", " + var4.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.b(LODBDSPMH;ZII)V")
	public void method178(class40 arg0, int arg1, int arg2) {
		try {
			int var4 = this.field633 + this.field323 & 0x7FF;
			int var5 = arg2 * arg2 + arg1 * arg1;
			if (var5 <= 6400) {
				int var6 = class31.field1063[var4];
				int var7 = class31.field1064[var4];
				int var8 = var6 * 256 / (this.field599 + 256);
				int var9 = var7 * 256 / (this.field599 + 256);
				int var10 = arg1 * var8 + arg2 * var9 >> 16;
				int var11 = arg1 * var9 - arg2 * var8 >> 16;
				if (var5 > 2500) {
					arg0.method410(var10 + 94 + 4 - arg0.field1180 / 2, this.field431, 83 - var11 - arg0.field1181 / 2 - 4);
				} else {
					arg0.method404(var10 + 94 + 4 - arg0.field1180 / 2, this.field527, 83 - var11 - arg0.field1181 / 2 - 4);
				}
			}
		} catch (RuntimeException var13) {
			signlink.reporterror("42219, " + arg0 + ", " + false + ", " + arg1 + ", " + arg2 + ", " + var13.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.a(Ljava/lang/String;I)Z")
	public boolean method179(String arg0) {
		try {
			if (arg0 == null) {
				return false;
			}
			for (int var2 = 0; var2 < this.field173; var2++) {
				if (arg0.equalsIgnoreCase(this.field523[var2])) {
					return true;
				}
			}
			return arg0.equalsIgnoreCase(field299.field129);
		} catch (RuntimeException var4) {
			signlink.reporterror("13059, " + arg0 + ", " + 4 + ", " + var4.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.S(I)V")
	public void method180(int arg0) {
		try {
			if (arg0 == 1) {
				signlink.midiplay = false;
				signlink.midifade = 0;
				signlink.midi = "stop";
			}
		} catch (RuntimeException var3) {
			signlink.reporterror("46799, " + arg0 + ", " + var3.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.T(I)V")
	public void method181() {
		try {
			if (super.field98 == 1) {
				if (super.field99 >= 539 && super.field99 <= 573 && super.field100 >= 169 && super.field100 < 205 && this.field571[0] != -1) {
					this.field541 = true;
					this.field365 = 0;
					this.field264 = true;
				}
				if (super.field99 >= 569 && super.field99 <= 599 && super.field100 >= 168 && super.field100 < 205 && this.field571[1] != -1) {
					this.field541 = true;
					this.field365 = 1;
					this.field264 = true;
				}
				if (super.field99 >= 597 && super.field99 <= 627 && super.field100 >= 168 && super.field100 < 205 && this.field571[2] != -1) {
					this.field541 = true;
					this.field365 = 2;
					this.field264 = true;
				}
				if (super.field99 >= 625 && super.field99 <= 669 && super.field100 >= 168 && super.field100 < 203 && this.field571[3] != -1) {
					this.field541 = true;
					this.field365 = 3;
					this.field264 = true;
				}
				if (super.field99 >= 666 && super.field99 <= 696 && super.field100 >= 168 && super.field100 < 205 && this.field571[4] != -1) {
					this.field541 = true;
					this.field365 = 4;
					this.field264 = true;
				}
				if (super.field99 >= 694 && super.field99 <= 724 && super.field100 >= 168 && super.field100 < 205 && this.field571[5] != -1) {
					this.field541 = true;
					this.field365 = 5;
					this.field264 = true;
				}
				if (super.field99 >= 722 && super.field99 <= 756 && super.field100 >= 169 && super.field100 < 205 && this.field571[6] != -1) {
					this.field541 = true;
					this.field365 = 6;
					this.field264 = true;
				}
				if (super.field99 >= 540 && super.field99 <= 574 && super.field100 >= 466 && super.field100 < 502 && this.field571[7] != -1) {
					this.field541 = true;
					this.field365 = 7;
					this.field264 = true;
				}
				if (super.field99 >= 572 && super.field99 <= 602 && super.field100 >= 466 && super.field100 < 503 && this.field571[8] != -1) {
					this.field541 = true;
					this.field365 = 8;
					this.field264 = true;
				}
				if (super.field99 >= 599 && super.field99 <= 629 && super.field100 >= 466 && super.field100 < 503 && this.field571[9] != -1) {
					this.field541 = true;
					this.field365 = 9;
					this.field264 = true;
				}
				if (super.field99 >= 627 && super.field99 <= 671 && super.field100 >= 467 && super.field100 < 502 && this.field571[10] != -1) {
					this.field541 = true;
					this.field365 = 10;
					this.field264 = true;
				}
				if (super.field99 >= 669 && super.field99 <= 699 && super.field100 >= 466 && super.field100 < 503 && this.field571[11] != -1) {
					this.field541 = true;
					this.field365 = 11;
					this.field264 = true;
				}
				if (super.field99 >= 696 && super.field99 <= 726 && super.field100 >= 466 && super.field100 < 503 && this.field571[12] != -1) {
					this.field541 = true;
					this.field365 = 12;
					this.field264 = true;
				}
				if (super.field99 >= 724 && super.field99 <= 758 && super.field100 >= 466 && super.field100 < 502 && this.field571[13] != -1) {
					this.field541 = true;
					this.field365 = 13;
					this.field264 = true;
					return;
				}
			}
		} catch (RuntimeException var2) {
			signlink.reporterror("82831, " + 8 + ", " + var2.toString());
			throw new RuntimeException();
		}
	}
}
