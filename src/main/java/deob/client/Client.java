package deob.client;

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

import deob.*;
import jagex2.config.*;
import jagex2.dash3d.*;
import jagex2.datastruct.JString;
import jagex2.datastruct.LinkList;
import jagex2.graphics.*;
import jagex2.io.*;
import jagex2.sound.JagFX;
import jagex2.wordfilter.WordFilter;
import jagex2.wordfilter.WordPack;
import sign.signlink;

@ObfuscatedName("client")
public final class Client extends GameShell {

	@ObfuscatedName("client.Jb")
	public static final byte field215 = 28;

	@ObfuscatedName("client.cc")
	public static int nodeId = 10;

	@ObfuscatedName("client.dc")
	public static int portOffset;

	@ObfuscatedName("client.ec")
	public static boolean memServer = true;

	@ObfuscatedName("client.fc")
	public static boolean lowMem;

	@ObfuscatedName("client.md")
	public static final BigInteger field296 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

	@ObfuscatedName("client.of")
	public static final BigInteger field401 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@ObfuscatedName("client.sf")
	public static final byte field405 = 71;

	@ObfuscatedName("client.sg")
	public static final int[][] recol1d = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

	@ObfuscatedName("client.Lh")
	public static final int[] readbit = new int[32];

	@ObfuscatedName("client.ij")
	public static final int[] recol2d;

	@ObfuscatedName("client.ak")
	public static final int[] skillxp;

	@ObfuscatedName("client.ck")
	public static final String CHARSET;

	@ObfuscatedName("client.P")
	public String loginUser = "";

	@ObfuscatedName("client.Q")
	public String loginPass = "";

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
	public final int[] field213 = new int[Skills.count];

	@ObfuscatedName("client.Nb")
	public final boolean field219 = false;

	@ObfuscatedName("client.Ob")
	public final int field220 = -905;

	@ObfuscatedName("client.Qb")
	public Packet in = Packet.alloc(1, (byte) 9);

	@ObfuscatedName("client.Rb")
	public int nextMidiSong = -1;

	@ObfuscatedName("client.Yb")
	public Packet field230 = new Packet(new byte[5000], -26583);

	@ObfuscatedName("client.Zb")
	public ClientNpc[] npc = new ClientNpc[16384];

	@ObfuscatedName("client.bc")
	public int[] npcIds = new int[16384];

	@ObfuscatedName("client.jc")
	public final byte field241 = 1;

	@ObfuscatedName("client.mc")
	public String socialInput = "";

	@ObfuscatedName("client.uc")
	public int minimapLevel = -1;

	@ObfuscatedName("client.zc")
	public boolean idkDesignRedraw = false;

	@ObfuscatedName("client.Ac")
	public final int[] field258 = new int[] { 17, 24, 34, 40 };

	@ObfuscatedName("client.Bc")
	public final byte field259 = 4;

	@ObfuscatedName("client.Cc")
	public LinkList projectiles = new LinkList(807);

	@ObfuscatedName("client.Ec")
	public volatile boolean flamesThread = false;

	@ObfuscatedName("client.Fc")
	public final int field263 = 1;

	@ObfuscatedName("client.Gc")
	public boolean rewdrawIcons = false;

	@ObfuscatedName("client.Hc")
	public int mainModalId = -1;

	@ObfuscatedName("client.Ic")
	public boolean awaitingPlayerinfo = false;

	@ObfuscatedName("client.Jc")
	public final int[] waveDelay = new int[50];

	@ObfuscatedName("client.Kc")
	public volatile boolean flameThread = false;

	@ObfuscatedName("client.Mc")
	public boolean field270 = true;

	@ObfuscatedName("client.Oc")
	public final int field272 = 1914;

	@ObfuscatedName("client.Pc")
	public String[] menuOption = new String[500];

	@ObfuscatedName("client.Qc")
	public final boolean field274 = false;

	@ObfuscatedName("client.Rc")
	public int field275 = -1;

	@ObfuscatedName("client.Tc")
	public final int field277 = 31;

	@ObfuscatedName("client.Yc")
	public boolean waveEnabled = true;

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
	public int lastWaveLoops = -1;

	@ObfuscatedName("client.ld")
	public boolean cinemaCam = false;

	@ObfuscatedName("client.qd")
	public final int field300 = 5063219;

	@ObfuscatedName("client.rd")
	public Pix32[] headiconsPk = new Pix32[32];

	@ObfuscatedName("client.td")
	public final int[] waveLoops = new int[50];

	@ObfuscatedName("client.ud")
	public Pix8[] mapscene = new Pix8[100];

	@ObfuscatedName("client.wd")
	public final int[] field306 = new int[9];

	@ObfuscatedName("client.xd")
	public final int[] field307 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@ObfuscatedName("client.yd")
	public LinkList spotanims = new LinkList(807);

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
	public final int[] compassMaskLineLengths = new int[33];

	@ObfuscatedName("client.je")
	public final boolean[] camShake = new boolean[5];

	@ObfuscatedName("client.ke")
	public int[] menuParamB = new int[500];

	@ObfuscatedName("client.le")
	public int[] menuParamC = new int[500];

	@ObfuscatedName("client.me")
	public int[] menuAction = new int[500];

	@ObfuscatedName("client.ne")
	public int[] menuParamA = new int[500];

	@ObfuscatedName("client.oe")
	public final int field350 = 8;

	@ObfuscatedName("client.pe")
	public Pix32[] headiconsHint = new Pix32[32];

	@ObfuscatedName("client.re")
	public volatile boolean flameActive = false;

	@ObfuscatedName("client.se")
	public final int[] minimapMaskLineOffsets = new int[151];

	@ObfuscatedName("client.we")
	public int[] entityRemovalIds = new int[1000];

	@ObfuscatedName("client.xe")
	public final int field359 = 586;

	@ObfuscatedName("client.ye")
	public final int field360 = 2301979;

	@ObfuscatedName("client.Ae")
	public int[] field362 = new int[1000];

	@ObfuscatedName("client.Be")
	public int[] field363 = new int[1000];

	@ObfuscatedName("client.Ce")
	public Pix32[] cross = new Pix32[8];

	@ObfuscatedName("client.De")
	public int activeIcon = 3;

	@ObfuscatedName("client.Ee")
	public Pix32[] headiconsPrayer = new Pix32[32];

	@ObfuscatedName("client.Ke")
	public final IfType chatInterface = new IfType();

	@ObfuscatedName("client.Le")
	public Pix32[] field373 = new Pix32[1000];

	@ObfuscatedName("client.Me")
	public final int field374 = 3;

	@ObfuscatedName("client.Ne")
	public final boolean field375 = true;

	@ObfuscatedName("client.Qe")
	public int mainOverlayId = -1;

	@ObfuscatedName("client.Re")
	public boolean field379 = true;

	@ObfuscatedName("client.Se")
	public int scrollheight = 78;

	@ObfuscatedName("client.We")
	public Pix32[] mapfunction = new Pix32[100];

	@ObfuscatedName("client.Xe")
	public CollisionMap[] collision = new CollisionMap[4];

	@ObfuscatedName("client.bf")
	public final int[] idkDesignpart = new int[7];

	@ObfuscatedName("client.cf")
	public int field390 = -1;

	@ObfuscatedName("client.df")
	public int field391 = -1;

	@ObfuscatedName("client.ef")
	public boolean isMenuOpen = false;

	@ObfuscatedName("client.ff")
	public final int[] field393 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@ObfuscatedName("client.mf")
	public boolean redrawFrame = false;

	@ObfuscatedName("client.nf")
	public final int[] field400 = new int[5];

	@ObfuscatedName("client.rf")
	public final int[] compassMaskLineOffsets = new int[33];

	@ObfuscatedName("client.tf")
	public LinkList[][][] groundObj = new LinkList[4][104][104];

	@ObfuscatedName("client.vf")
	public boolean errorHost = false;

	@ObfuscatedName("client.wf")
	public int[][] field409 = new int[104][104];

	@ObfuscatedName("client.cg")
	public String chatInput = "";

	@ObfuscatedName("client.eg")
	public final int field443 = 435;

	@ObfuscatedName("client.gg")
	public final boolean field445 = true;

	@ObfuscatedName("client.hg")
	public boolean field446 = false;

	@ObfuscatedName("client.og")
	public boolean midiFading = true;

	@ObfuscatedName("client.pg")
	public final boolean field454 = false;

	@ObfuscatedName("client.qg")
	public final byte field455 = 4;

	@ObfuscatedName("client.rg")
	public int[] friendNodeId = new int[200];

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
	public boolean redrawChatMode = false;

	@ObfuscatedName("client.Sg")
	public boolean sendCamera = false;

	@ObfuscatedName("client.Vg")
	public boolean focusIn = true;

	@ObfuscatedName("client.Wg")
	public boolean reportAbuseMuteOption = false;

	@ObfuscatedName("client.bh")
	public boolean field492 = false;

	@ObfuscatedName("client.ch")
	public final Pix8[] modIcons = new Pix8[2];

	@ObfuscatedName("client.dh")
	public final int[][][] sceneMapRegion = new int[4][13][13];

	@ObfuscatedName("client.eh")
	public Pix8[] sideicons = new Pix8[13];

	@ObfuscatedName("client.fh")
	public final boolean field496 = false;

	@ObfuscatedName("client.ih")
	public int chatComId = -1;

	@ObfuscatedName("client.ph")
	public final byte field506 = 7;

	@ObfuscatedName("client.qh")
	public final boolean field507 = true;

	@ObfuscatedName("client.rh")
	public boolean errorLoading = false;

	@ObfuscatedName("client.sh")
	public boolean sceneInstanced = false;

	@ObfuscatedName("client.uh")
	public boolean jaggrabEnabled = false;

	@ObfuscatedName("client.vh")
	public String loginMes1 = "";

	@ObfuscatedName("client.wh")
	public String loginMes2 = "";

	@ObfuscatedName("client.Bh")
	public long[] friendUserhash = new long[200];

	@ObfuscatedName("client.Ch")
	public int sideModealId = -1;

	@ObfuscatedName("client.Dh")
	public int[][] field520 = new int[104][104];

	@ObfuscatedName("client.Eh")
	public final int field521 = 7759444;

	@ObfuscatedName("client.Gh")
	public String[] friendUsername = new String[200];

	@ObfuscatedName("client.Ih")
	public LinkList locChanges = new LinkList(807);

	@ObfuscatedName("client.Kh")
	public final int field527 = 665;

	@ObfuscatedName("client.Mh")
	public boolean field529 = true;

	@ObfuscatedName("client.Qh")
	public int tutFlashIcon = -1;

	@ObfuscatedName("client.Rh")
	public final int[] CamShakeRan = new int[5];

	@ObfuscatedName("client.Xh")
	public final int[] minimapMaskLineLengths = new int[151];

	@ObfuscatedName("client.Yh")
	public boolean redrawSidebar = false;

	@ObfuscatedName("client.Zh")
	public int[][] field542 = new int[104][104];

	@ObfuscatedName("client.ai")
	public boolean errorStarted = false;

	@ObfuscatedName("client.bi")
	public boolean field544 = false;

	@ObfuscatedName("client.ji")
	public final int field552 = -23379;

	@ObfuscatedName("client.li")
	public final FileStream[] fileStreams = new FileStream[5];

	@ObfuscatedName("client.mi")
	public final int[] waveIds = new int[50];

	@ObfuscatedName("client.ni")
	public int field556 = -1;

	@ObfuscatedName("client.pi")
	public final int[] chatType = new int[100];

	@ObfuscatedName("client.qi")
	public final String[] chatusername = new String[100];

	@ObfuscatedName("client.ri")
	public final String[] chatText = new String[100];

	@ObfuscatedName("client.ti")
	public final int field562 = 2048;

	@ObfuscatedName("client.ui")
	public final int LOCAL_PLAYER_INDEX = 2047;

	@ObfuscatedName("client.vi")
	public ClientPlayer[] players = new ClientPlayer[this.field562];

	@ObfuscatedName("client.xi")
	public int[] playerIds = new int[this.field562];

	@ObfuscatedName("client.zi")
	public int[] entityUpdateIds = new int[this.field562];

	@ObfuscatedName("client.Ai")
	public Packet[] playerAppearanceBuffer = new Packet[this.field562];

	@ObfuscatedName("client.Ci")
	public final int[] sideIcon = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

	@ObfuscatedName("client.Di")
	public final byte field572 = 5;

	@ObfuscatedName("client.Gi")
	public int field575 = 2;

	@ObfuscatedName("client.Ii")
	public final long[] ignoreUserhash = new long[100];

	@ObfuscatedName("client.Ji")
	public boolean ingame = false;

	@ObfuscatedName("client.Wi")
	public final int field591 = -618;

	@ObfuscatedName("client.Xi")
	public final int[] field592 = new int[5];

	@ObfuscatedName("client.Yi")
	public final int field593 = -347;

	@ObfuscatedName("client.aj")
	public final String[] playerOp = new String[5];

	@ObfuscatedName("client.bj")
	public final boolean[] playerOpPriority = new boolean[5];

	@ObfuscatedName("client.cj")
	public String reportAbuseInput = "";

	@ObfuscatedName("client.fj")
	public int field600 = 1;

	@ObfuscatedName("client.gj")
	public final int[] field601 = new int[Skills.count];

	@ObfuscatedName("client.kj")
	public int field605 = 292;

	@ObfuscatedName("client.lj")
	public int lastWaveId = -1;

	@ObfuscatedName("client.mj")
	public final byte field607 = 9;

	@ObfuscatedName("client.nj")
	public int reportAbuseComId = -1;

	@ObfuscatedName("client.sj")
	public boolean idkDesignGender = true;

	@ObfuscatedName("client.tj")
	public boolean socialInputOpen = false;

	@ObfuscatedName("client.wj")
	public int field617 = 1;

	@ObfuscatedName("client.zj")
	public final boolean field620 = false;

	@ObfuscatedName("client.Aj")
	public Packet loginout = Packet.alloc(1, (byte) 9);

	@ObfuscatedName("client.Cj")
	public Packet out = Packet.alloc(1, (byte) 9);

	@ObfuscatedName("client.Hj")
	public boolean field628 = false;

	@ObfuscatedName("client.Ij")
	public int field629 = -1;

	@ObfuscatedName("client.Kj")
	public int field631 = -1;

	@ObfuscatedName("client.Lj")
	public int orbitCameraPitch = 128;

	@ObfuscatedName("client.Uj")
	public final int[] field641 = new int[Skills.count];

	@ObfuscatedName("client.Vj")
	public boolean redrawChatback = false;

	@ObfuscatedName("client.Wj")
	public int[] var = new int[2000];

	@ObfuscatedName("client.Yj")
	public Pix32[] hitmarks = new Pix32[20];

	@ObfuscatedName("client.Zj")
	public final int[] idkDesignColour = new int[5];

	@ObfuscatedName("client.bk")
	public String socialInputHeader = "";

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
	public int runweight;

	@ObfuscatedName("client.T")
	public int friendCount;

	@ObfuscatedName("client.U")
	public int friendServerStatus;

	@ObfuscatedName("client.Y")
	public int loginscreen;

	@ObfuscatedName("client.Z")
	public int sceneState;

	@ObfuscatedName("client.ab")
	public int minusedlevel;

	@ObfuscatedName("client.bb")
	public int staffmodLevel;

	@ObfuscatedName("client.cb")
	public int field182;

	@ObfuscatedName("client.eb")
	public int camX;

	@ObfuscatedName("client.fb")
	public int camY;

	@ObfuscatedName("client.gb")
	public int camZ;

	@ObfuscatedName("client.hb")
	public int camPitch;

	@ObfuscatedName("client.ib")
	public int camYaw;

	@ObfuscatedName("client.mb")
	public int field192;

	@ObfuscatedName("client.vb")
	public static int field201;

	@ObfuscatedName("client.wb")
	public int lastWaveLength;

	@ObfuscatedName("client.xb")
	public int field203;

	@ObfuscatedName("client.Ib")
	public int field214;

	@ObfuscatedName("client.Mb")
	public int mouseTrackedDelta;

	@ObfuscatedName("client.Pb")
	public int field221;

	@ObfuscatedName("client.Sb")
	public int field224;

	@ObfuscatedName("client.Tb")
	public int ignoreCount;

	@ObfuscatedName("client.Ub")
	public int field226;

	@ObfuscatedName("client.Vb")
	public int ptype0;

	@ObfuscatedName("client.Wb")
	public int ptype1;

	@ObfuscatedName("client.Xb")
	public int ptype2;

	@ObfuscatedName("client.ac")
	public int npcCount;



	@ObfuscatedName("client.hc")
	public int runenergy;

	@ObfuscatedName("client.lc")
	public int splitPrivateChat;

	@ObfuscatedName("client.nc")
	public int field245;

	@ObfuscatedName("client.oc")
	public static int field246;

	@ObfuscatedName("client.pc")
	public int field247;

	@ObfuscatedName("client.qc")
	public int field248;

	@ObfuscatedName("client.rc")
	public int crossCycle;

	@ObfuscatedName("client.sc")
	public int crossMode;

	@ObfuscatedName("client.tc")
	public int unreadMessages;

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
	public int hintType;

	@ObfuscatedName("client.bd")
	public int field285;

	@ObfuscatedName("client.dd")
	public int macroCameraX;

	@ObfuscatedName("client.fd")
	public int field289;

	@ObfuscatedName("client.hd")
	public int loginSelect;

	@ObfuscatedName("client.kd")
	public static int field294;

	@ObfuscatedName("client.nd")
	public int sceneCycle;

	@ObfuscatedName("client.sd")
	public int field302;

	@ObfuscatedName("client.Dd")
	public int menuArea;

	@ObfuscatedName("client.Ed")
	public int field314;

	@ObfuscatedName("client.Fd")
	public int field315;

	@ObfuscatedName("client.Gd")
	public int field316;

	@ObfuscatedName("client.Hd")
	public int field317;

	@ObfuscatedName("client.Nd")
	public int macroMinimapAngle;

	@ObfuscatedName("client.Pd")
	public int cameraPitchClamp;

	@ObfuscatedName("client.be")
	public static int field337;

	@ObfuscatedName("client.ee")
	public static int field340;

	@ObfuscatedName("client.ie")
	public int field344;

	@ObfuscatedName("client.qe")
	public int field352;

	@ObfuscatedName("client.te")
	public int chatPrivatemode;

	@ObfuscatedName("client.ue")
	public int chatScrollPos;

	@ObfuscatedName("client.ve")
	public int entityRemovalCount;

	@ObfuscatedName("client.ze")
	public int field361;

	@ObfuscatedName("client.Fe")
	public int camMoveToLx;

	@ObfuscatedName("client.Ge")
	public int camMoveToLz;

	@ObfuscatedName("client.He")
	public int field369;

	@ObfuscatedName("client.Ie")
	public int camMoveToRate;

	@ObfuscatedName("client.Je")
	public int camMoveToRate2;

	@ObfuscatedName("client.Oe")
	public int field376;

	@ObfuscatedName("client.Ye")
	public int chatTradeMode;

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
	public int menuNumEntries;

	@ObfuscatedName("client.Af")
	public int field413;

	@ObfuscatedName("client.Bf")
	public int field414;

	@ObfuscatedName("client.Cf")
	public int scrollCycle;

	@ObfuscatedName("client.Uf")
	public int psize;

	@ObfuscatedName("client.Vf")
	public int ptype;

	@ObfuscatedName("client.Wf")
	public int timeoutTimer;

	@ObfuscatedName("client.Xf")
	public int field436;

	@ObfuscatedName("client.Yf")
	public int logoutTimer;

	@ObfuscatedName("client.Zf")
	public int minimapFlagX;

	@ObfuscatedName("client.ag")
	public int minimapFlagZ;

	@ObfuscatedName("client.dg")
	public int field442;

	@ObfuscatedName("client.fg")
	public int field444;

	@ObfuscatedName("client.ig")
	public int worldUpdateNum;

	@ObfuscatedName("client.ng")
	public int midiSong;

	@ObfuscatedName("client.vg")
	public int field460;

	@ObfuscatedName("client.Fg")
	public int rebootTimer;

	@ObfuscatedName("client.Hg")
	public int centerZoneX;

	@ObfuscatedName("client.Ig")
	public int centerZoneZ;

	@ObfuscatedName("client.Pg")
	public int field480;

	@ObfuscatedName("client.Qg")
	public int field481;

	@ObfuscatedName("client.Rg")
	public int sendCameraDelay;

	@ObfuscatedName("client.Tg")
	public int field484;

	@ObfuscatedName("client.Ug")
	public int field485;

	@ObfuscatedName("client.gh")
	public int field497;

	@ObfuscatedName("client.hh")
	public int chatPublicMode;

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
	public int socialInputType;

	@ObfuscatedName("client.Fh")
	public int nextMidiDelay;

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
	public int useMode;

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
	public static int loopCycle;

	@ObfuscatedName("client.oi")
	public int field557;

	@ObfuscatedName("client.si")
	public int field561;

	@ObfuscatedName("client.wi")
	public int playerCount;

	@ObfuscatedName("client.yi")
	public int entityUpdateCount;

	@ObfuscatedName("client.Bi")
	public int field570;

	@ObfuscatedName("client.Ei")
	public static int field573;

	@ObfuscatedName("client.Fi")
	public int macroCameraZ;

	@ObfuscatedName("client.Hi")
	public int field576;

	@ObfuscatedName("client.Li")
	public int field580;

	@ObfuscatedName("client.Mi")
	public int field581;

	@ObfuscatedName("client.Ni")
	public int objDragArea;

	@ObfuscatedName("client.Oi")
	public int field583;

	@ObfuscatedName("client.Pi")
	public int field584;

	@ObfuscatedName("client.Qi")
	public int camLookAtLx;

	@ObfuscatedName("client.Ri")
	public int camLookAtLz;

	@ObfuscatedName("client.Si")
	public int camLookAtHei;

	@ObfuscatedName("client.Ti")
	public int CamLookAtRate;

	@ObfuscatedName("client.Ui")
	public int camLookAtRate2;

	@ObfuscatedName("client.Vi")
	public static int field590;

	@ObfuscatedName("client.Zi")
	public int minimapState;

	@ObfuscatedName("client.dj")
	public int field598;

	@ObfuscatedName("client.ej")
	public int macroMinimapZoom;

	@ObfuscatedName("client.oj")
	public int mapBuildBaseX;

	@ObfuscatedName("client.pj")
	public int mapBuildBaseZ;

	@ObfuscatedName("client.qj")
	public int field611;

	@ObfuscatedName("client.rj")
	public int field612;

	@ObfuscatedName("client.uj")
	public int waveCount;

	@ObfuscatedName("client.vj")
	public int macroCameraAngle;

	@ObfuscatedName("client.xj")
	public int field618;

	@ObfuscatedName("client.Dj")
	public int field624;

	@ObfuscatedName("client.Jj")
	public int dialogueInputOpen;

	@ObfuscatedName("client.Mj")
	public int orbitCameraYaw;

	@ObfuscatedName("client.Nj")
	public int field634;

	@ObfuscatedName("client.Oj")
	public int field635;

	@ObfuscatedName("client.Pj")
	public int targetMode;

	@ObfuscatedName("client.Qj")
	public int field637;

	@ObfuscatedName("client.Rj")
	public int field638;

	@ObfuscatedName("client.Tj")
	public int chatDisabled;

	@ObfuscatedName("client.nb")
	public long field193;

	@ObfuscatedName("client.ic")
	public long sceneLoadStartTime;

	@ObfuscatedName("client.od")
	public long prevMouseClickTime;

	@ObfuscatedName("client.yf")
	public long lastWaveStartTime;

	@ObfuscatedName("client.Ah")
	public long loginSeed;

	@ObfuscatedName("client.Ki")
	public ClientStream stream;

	@ObfuscatedName("client.pd")
	public static ClientPlayer localPlayer;

	@ObfuscatedName("client.Md")
	public JagFile title;

	@ObfuscatedName("client.vc")
	public Pix8 titlebox;

	@ObfuscatedName("client.wc")
	public Pix8 titlebutton;

	@ObfuscatedName("client.Ef")
	public Pix8 redstone1v;

	@ObfuscatedName("client.Ff")
	public Pix8 redstone2v;

	@ObfuscatedName("client.Gf")
	public Pix8 restone3v;

	@ObfuscatedName("client.Hf")
	public Pix8 redstone1hv;

	@ObfuscatedName("client.If")
	public Pix8 redstone2hv;

	@ObfuscatedName("client.Rf")
	public Pix8 invback;

	@ObfuscatedName("client.Sf")
	public Pix8 mapback;

	@ObfuscatedName("client.Tf")
	public Pix8 chatback;

	@ObfuscatedName("client.Kg")
	public Pix8 backbase1;

	@ObfuscatedName("client.Lg")
	public Pix8 backbase2;

	@ObfuscatedName("client.Mg")
	public Pix8 backhmid1;

	@ObfuscatedName("client.Ng")
	public Pix8 scrollbar0;

	@ObfuscatedName("client.Og")
	public Pix8 scrollbar1;

	@ObfuscatedName("client.Sh")
	public Pix8 redstone1;

	@ObfuscatedName("client.Th")
	public Pix8 redstone2;

	@ObfuscatedName("client.Uh")
	public Pix8 redstone3;

	@ObfuscatedName("client.Vh")
	public Pix8 restone1h;

	@ObfuscatedName("client.Wh")
	public Pix8 redstone2h;

	@ObfuscatedName("client.Jf")
	public PixFont p11;

	@ObfuscatedName("client.Kf")
	public PixFont p12;

	@ObfuscatedName("client.Lf")
	public PixFont b12;

	@ObfuscatedName("client.Mf")
	public PixFont q8;

	@ObfuscatedName("client.J")
	public Pix32 overlayMultiway;

	@ObfuscatedName("client.qb")
	public Pix32 mapdots0;

	@ObfuscatedName("client.rb")
	public Pix32 mapdots1;

	@ObfuscatedName("client.sb")
	public Pix32 mapdots2;

	@ObfuscatedName("client.tb")
	public Pix32 mapdots3;

	@ObfuscatedName("client.ub")
	public Pix32 mapdots4;

	@ObfuscatedName("client.Wc")
	public Pix32 mapedge;

	@ObfuscatedName("client.Ad")
	public Pix32 mapmarker0;

	@ObfuscatedName("client.Bd")
	public Pix32 mapmarker1;

	@ObfuscatedName("client.Te")
	public Pix32 flameLeft;

	@ObfuscatedName("client.Ue")
	public Pix32 flameRight;

	@ObfuscatedName("client.bg")
	public Pix32 minimap;

	@ObfuscatedName("client.Fj")
	public Pix32 idkDesignButton1;

	@ObfuscatedName("client.Gj")
	public Pix32 idkDesignButton2;

	@ObfuscatedName("client.Xj")
	public Pix32 compass;

	@ObfuscatedName("client.yb")
	public PixMap areaBackleft1;

	@ObfuscatedName("client.zb")
	public PixMap areaBackleft2;

	@ObfuscatedName("client.Ab")
	public PixMap areaBackright1;

	@ObfuscatedName("client.Bb")
	public PixMap areaBackright2;

	@ObfuscatedName("client.Cb")
	public PixMap areaBacktop1;

	@ObfuscatedName("client.Db")
	public PixMap areaBackvmid1;

	@ObfuscatedName("client.Eb")
	public PixMap areaBackvmid2;

	@ObfuscatedName("client.Fb")
	public PixMap areaBackvmid3;

	@ObfuscatedName("client.Gb")
	public PixMap areaBackhmid2;

	@ObfuscatedName("client.Id")
	public PixMap areaBackbase1;

	@ObfuscatedName("client.Jd")
	public PixMap areaBackbase2;

	@ObfuscatedName("client.Kd")
	public PixMap areaBackhmid1;

	@ObfuscatedName("client.Sd")
	public PixMap field328;

	@ObfuscatedName("client.Td")
	public PixMap field329;

	@ObfuscatedName("client.Ud")
	public PixMap field330;

	@ObfuscatedName("client.Vd")
	public PixMap field331;

	@ObfuscatedName("client.Wd")
	public PixMap field332;

	@ObfuscatedName("client.Xd")
	public PixMap field333;

	@ObfuscatedName("client.Yd")
	public PixMap field334;

	@ObfuscatedName("client.Zd")
	public PixMap field335;

	@ObfuscatedName("client.ae")
	public PixMap field336;

	@ObfuscatedName("client.Xg")
	public PixMap field488;

	@ObfuscatedName("client.Yg")
	public PixMap areaMap;

	@ObfuscatedName("client.Zg")
	public PixMap areaGame;

	@ObfuscatedName("client.ah")
	public PixMap field491;

	@ObfuscatedName("client.kc")
	public MouseTracking mouseTracking;

	@ObfuscatedName("client.uf")
	public World world;

	@ObfuscatedName("client.Ej")
	public Isaac randomIn;

	@ObfuscatedName("client.hj")
	public OnDemand onDemand;

	@ObfuscatedName("client.Ld")
	public String field321;

	@ObfuscatedName("client.gi")
	public String objSelectedName;

	@ObfuscatedName("client.jj")
	public String field604;

	@ObfuscatedName("client.Sj")
	public String targetOp;

	@ObfuscatedName("client.X")
	public Socket jaggrabSocket;



	@ObfuscatedName("client.ad")
	public static boolean field284;

	@ObfuscatedName("client.Pe")
	public static boolean mouseTracked;

	@ObfuscatedName("client.xh")
	public static boolean field514;

	@ObfuscatedName("client.jb")
	public int[] mapBuildIndex;

	@ObfuscatedName("client.kb")
	public int[] mapBuildGroundFile;

	@ObfuscatedName("client.lb")
	public int[] mapBuildLocationFile;

	@ObfuscatedName("client.Kb")
	public int[] flameBuffer0;

	@ObfuscatedName("client.Lb")
	public int[] flameBuffer1;

	@ObfuscatedName("client.Nf")
	public int[] chatScanline;

	@ObfuscatedName("client.Of")
	public int[] field427;

	@ObfuscatedName("client.Pf")
	public int[] gameScanline;

	@ObfuscatedName("client.Qf")
	public int[] field429;

	@ObfuscatedName("client.jg")
	public int[] flameGradient;

	@ObfuscatedName("client.kg")
	public int[] flameGradient0;

	@ObfuscatedName("client.lg")
	public int[] flameGradient1;

	@ObfuscatedName("client.mg")
	public int[] flameGradient2;

	@ObfuscatedName("client.tg")
	public int[] flameBuffer3;

	@ObfuscatedName("client.ug")
	public int[] flameBuffer2;

	@ObfuscatedName("client.Ve")
	public Pix8[] runes;

	@ObfuscatedName("client.vd")
	public byte[][] mapBuildLocationData;

	@ObfuscatedName("client.Df")
	public byte[][] mapBuildGroundData;

	@ObfuscatedName("client.gc")
	public byte[][][] mapl;

	@ObfuscatedName("client.Bj")
	public int[][][] groundh;

	static {
		int var0 = 2;
		for (int var1 = 0; var1 < 32; var1++) {
			readbit[var1] = var0 - 1;
			var0 += var0;
		}
		recol2d = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };
		skillxp = new int[99];
		int var2 = 0;
		for (int var3 = 0; var3 < 99; var3++) {
			int var4 = var3 + 1;
			int var5 = (int) ((double) var4 + Math.pow(2.0D, (double) var4 / 7.0D) * 300.0D);
			var2 += var5;
			skillxp[var3] = var2 / 4;
		}
		CHARSET = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";
	}

	@ObfuscatedName("client.G(I)V")
	public static void setLowMem() {
		try {
			World.field1553 = true;
			Pix3D.lowMem = true;
			lowMem = true;
			ClientBuild.lowMem = true;
			LocType.field722 = true;
		} catch (RuntimeException var1) {
			signlink.reporterror("42903, " + 15665 + ", " + var1.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.P(I)V")
	public static void sethighmem() {
		try {
			World.field1553 = false;
			Pix3D.lowMem = false;
			lowMem = false;
			ClientBuild.lowMem = false;
			LocType.field722 = false;
		} catch (RuntimeException var1) {
			signlink.reporterror("93535, " + -229 + ", " + var1.toString());
			throw new RuntimeException();
		}
	}

	@Override
	public AppletContext getAppletContext() {
		return signlink.mainapp == null ? super.getAppletContext() : signlink.mainapp.getAppletContext();
	}

	@ObfuscatedName("client.a(Z)Ljava/awt/Component;")
	@Override
	public Component getBaseComponent() {
		try {
			if (signlink.mainapp == null) {
				return super.frame == null ? this : super.frame;
			} else {
				return signlink.mainapp;
			}
		} catch (RuntimeException var2) {
			signlink.reporterror("83026, " + true + ", " + var2.toString());
			throw new RuntimeException();
		}
	}

	@Override
	public URL getCodeBase() {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getCodeBase();
		}
		try {
			if (super.frame != null) {
				return new URL("http://127.0.0.1:" + (portOffset + 80));
			}
		} catch (Exception var1) {
		}
		return super.getCodeBase();
	}

	@ObfuscatedName("client.g(I)Ljava/lang/String;")
	public String getHost(int arg0) {
		try {
			boolean var4 = false;
			if (signlink.mainapp == null) {
				return super.frame == null ? super.getDocumentBase().getHost().toLowerCase() : "runescape.com";
			} else {
				return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
			}
		} catch (RuntimeException var3) {
			signlink.reporterror("4597, " + arg0 + ", " + var3.toString());
			throw new RuntimeException();
		}
	}

	@Override
	public String getParameter(String arg0) {
		return signlink.mainapp == null ? super.getParameter(arg0) : signlink.mainapp.getParameter(arg0);
	}

	@ObfuscatedName("client.a(Ljava/lang/Runnable;I)V")
	@Override
	public void startThread(Runnable arg0, int arg1) {
		if (arg1 > 10) {
			arg1 = 10;
		}
		if (signlink.mainapp == null) {
			super.startThread(arg0, arg1);
		} else {
			signlink.startthread(arg0, arg1);
		}
	}

	@ObfuscatedName("client.o(I)Ljava/net/Socket;")
	public Socket openSocket(int arg0) throws IOException {
		return signlink.mainapp == null ? new Socket(InetAddress.getByName(this.getCodeBase().getHost()), arg0) : signlink.opensocket(arg0);
	}

	@ObfuscatedName("client.b(Ljava/lang/String;)Ljava/io/DataInputStream;")
	public DataInputStream openUrl(String arg0) throws IOException {
		if (this.jaggrabEnabled) {
			if (this.jaggrabSocket != null) {
				try {
					this.jaggrabSocket.close();
				} catch (Exception var4) {
				}
				this.jaggrabSocket = null;
			}
			this.jaggrabSocket = this.openSocket(43595);
			this.jaggrabSocket.setSoTimeout(10000);
			InputStream var2 = this.jaggrabSocket.getInputStream();
			OutputStream var3 = this.jaggrabSocket.getOutputStream();
			var3.write(("JAGGRAB /" + arg0 + "\n\n").getBytes());
			return new DataInputStream(var2);
		} else if (signlink.mainapp == null) {
			return new DataInputStream((new URL(this.getCodeBase(), arg0)).openStream());
		} else {
			return signlink.openurl(arg0);
		}
	}

	@ObfuscatedName("client.a([BZZ)V")
	public void saveMidi(byte[] arg0, boolean arg1) {
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

	@ObfuscatedName("client.a(ZII)V")
	public void setMidiVolume(boolean arg0, int arg1, int arg2) {
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

	@ObfuscatedName("client.S(I)V")
	public void stopMidi(int arg0) {
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

	@ObfuscatedName("client.e(Z)Z")
	public boolean replayWave() {
		try {
			return signlink.wavereplay();
		} catch (RuntimeException var2) {
			signlink.reporterror("26925, " + true + ", " + var2.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.e(II)V")
	public void setWaveVolume(int arg0) {
		try {
			signlink.wavevol = arg0;
		} catch (RuntimeException var3) {
			signlink.reporterror("55068, " + -687 + ", " + arg0 + ", " + var3.toString());
			throw new RuntimeException();
		}
	}

	public static void main(String[] arg0) {
		try {
			System.out.println("RS2 user client - release #" + 349);
			if (arg0.length == 5) {
				nodeId = Integer.parseInt(arg0[0]);
				portOffset = Integer.parseInt(arg0[1]);
				if (arg0[2].equals("lowmem")) {
					setLowMem();
				} else if (arg0[2].equals("highmem")) {
					sethighmem();
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}
				if (arg0[3].equals("free")) {
					memServer = false;
				} else if (arg0[3].equals("members")) {
					memServer = true;
				} else {
					System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
					return;
				}
				signlink.storeid = Integer.parseInt(arg0[4]);
				signlink.startpriv(InetAddress.getLocalHost());
				Client var1 = new Client();
				var1.initApplication(765, (byte) 9, 503);
			} else {
				System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
			}
		} catch (Exception var3) {
		}
	}

	@Override
	public void init() {
		nodeId = Integer.parseInt(this.getParameter("nodeid"));
		portOffset = Integer.parseInt(this.getParameter("portoff"));
		String var1 = this.getParameter("lowmem");
		if (var1 != null && var1.equals("1")) {
			setLowMem();
		} else {
			sethighmem();
		}
		String var2 = this.getParameter("free");
		if (var2 != null && var2.equals("1")) {
			memServer = false;
		} else {
			memServer = true;
		}
		this.initApplet();
	}

	@ObfuscatedName("client.a()V")
	@Override
	public void maininit() {
		this.drawProgress("Starting up", (byte) 8, 20);
		if (signlink.sunjava) {
			super.mindel = 5;
		}
		if (field284) {
			this.errorStarted = true;
			return;
		}
		field284 = true;
		boolean var1 = false;
		String var2 = this.getHost(267);
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
			this.errorHost = true;
			return;
		}
		if (signlink.cache_dat != null) {
			for (int var3 = 0; var3 < 5; var3++) {
				this.fileStreams[var3] = new FileStream(signlink.cache_dat, (byte) 6, signlink.cache_idx[var3], var3 + 1, 500000);
			}
		}
		try {
			this.getJagChecksums();
			this.title = this.getJagFile("title screen", this.field306[1], "title", 25, 1);
			this.p11 = new PixFont(this.title, 2, "p11_full", false);
			this.p12 = new PixFont(this.title, 2, "p12_full", false);
			this.b12 = new PixFont(this.title, 2, "b12_full", false);
			this.q8 = new PixFont(this.title, 2, "q8_full", true);
			this.loadTitleBackground();
			this.loadTitleImages();
			JagFile var4 = this.getJagFile("config", this.field306[2], "config", 30, 2);
			JagFile var5 = this.getJagFile("interface", this.field306[3], "interface", 35, 3);
			JagFile var6 = this.getJagFile("2d graphics", this.field306[4], "media", 40, 4);
			JagFile var7 = this.getJagFile("textures", this.field306[6], "textures", 45, 6);
			JagFile var8 = this.getJagFile("chat system", this.field306[7], "wordenc", 50, 7);
			JagFile var9 = this.getJagFile("sound effects", this.field306[8], "sounds", 55, 8);
			this.mapl = new byte[4][104][104];
			this.groundh = new int[4][105][105];
			this.world = new World(104, 104, this.groundh, 4, -160);
			for (int var10 = 0; var10 < 4; var10++) {
				this.collision[var10] = new CollisionMap((byte) 6, 104, 104);
			}
			this.minimap = new Pix32(512, 512);
			JagFile var11 = this.getJagFile("update list", this.field306[5], "versionlist", 60, 5);
			this.drawProgress("Connecting to update server", (byte) 8, 60);
			this.onDemand = new OnDemand();
			this.onDemand.init(var11, this);
			AnimFrame.init(this.onDemand.getAnimFrameCount());
			Model.init(this.onDemand.getFileCount(0), this.onDemand);
			if (!lowMem) {
				this.midiSong = 0;
				this.midiFading = true;
				this.onDemand.request(2, this.midiSong);
				while (this.onDemand.remaining() > 0) {
					this.onDemandLoop();
					try {
						Thread.sleep(100L);
					} catch (Exception var71) {
					}
					if (this.onDemand.failCount > 3) {
						this.showLoadError("ondemand");
						return;
					}
				}
			}
			this.drawProgress("Requesting animations", (byte) 8, 65);
			int var12 = this.onDemand.getFileCount(1);
			for (int var13 = 0; var13 < var12; var13++) {
				this.onDemand.request(1, var13);
			}
			while (this.onDemand.remaining() > 0) {
				int var14 = var12 - this.onDemand.remaining();
				if (var14 > 0) {
					this.drawProgress("Loading animations - " + var14 * 100 / var12 + "%", (byte) 8, 65);
				}
				this.onDemandLoop();
				try {
					Thread.sleep(100L);
				} catch (Exception var70) {
				}
				if (this.onDemand.failCount > 3) {
					this.showLoadError("ondemand");
					return;
				}
			}
			this.drawProgress("Requesting models", (byte) 8, 70);
			int var15 = this.onDemand.getFileCount(0);
			for (int var16 = 0; var16 < var15; var16++) {
				int var17 = this.onDemand.getModelUse(var16);
				if ((var17 & 0x1) != 0) {
					this.onDemand.request(0, var16);
				}
			}
			int var18 = this.onDemand.remaining();
			while (this.onDemand.remaining() > 0) {
				int var19 = var18 - this.onDemand.remaining();
				if (var19 > 0) {
					this.drawProgress("Loading models - " + var19 * 100 / var18 + "%", (byte) 8, 70);
				}
				this.onDemandLoop();
				try {
					Thread.sleep(100L);
				} catch (Exception var69) {
				}
			}
			if (this.fileStreams[0] != null) {
				this.drawProgress("Requesting maps", (byte) 8, 75);
				this.onDemand.request(3, this.onDemand.getMapFile(48, 47, 0));
				this.onDemand.request(3, this.onDemand.getMapFile(48, 47, 1));
				this.onDemand.request(3, this.onDemand.getMapFile(48, 48, 0));
				this.onDemand.request(3, this.onDemand.getMapFile(48, 48, 1));
				this.onDemand.request(3, this.onDemand.getMapFile(48, 49, 0));
				this.onDemand.request(3, this.onDemand.getMapFile(48, 49, 1));
				this.onDemand.request(3, this.onDemand.getMapFile(47, 47, 0));
				this.onDemand.request(3, this.onDemand.getMapFile(47, 47, 1));
				this.onDemand.request(3, this.onDemand.getMapFile(47, 48, 0));
				this.onDemand.request(3, this.onDemand.getMapFile(47, 48, 1));
				this.onDemand.request(3, this.onDemand.getMapFile(148, 48, 0));
				this.onDemand.request(3, this.onDemand.getMapFile(148, 48, 1));
				int var20 = this.onDemand.remaining();
				while (this.onDemand.remaining() > 0) {
					int var21 = var20 - this.onDemand.remaining();
					if (var21 > 0) {
						this.drawProgress("Loading maps - " + var21 * 100 / var20 + "%", (byte) 8, 75);
					}
					this.onDemandLoop();
					try {
						Thread.sleep(100L);
					} catch (Exception var68) {
					}
				}
			}
			int var22 = this.onDemand.getFileCount(0);
			for (int var23 = 0; var23 < var22; var23++) {
				int var24 = this.onDemand.getModelUse(var23);
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
					this.onDemand.prefetchPriority(var23, 0, var25);
				}
			}
			this.onDemand.prefetchMaps(memServer);
			if (!lowMem) {
				int var26 = this.onDemand.getFileCount(2);
				for (int var27 = 1; var27 < var26; var27++) {
					if (this.onDemand.hasMidiJingle(var27)) {
						this.onDemand.prefetchPriority(var27, 2, (byte) 1);
					}
				}
			}
			this.drawProgress("Unpacking media", (byte) 8, 80);
			this.invback = new Pix8(var6, "invback", 0);
			this.chatback = new Pix8(var6, "chatback", 0);
			this.mapback = new Pix8(var6, "mapback", 0);
			this.backbase1 = new Pix8(var6, "backbase1", 0);
			this.backbase2 = new Pix8(var6, "backbase2", 0);
			this.backhmid1 = new Pix8(var6, "backhmid1", 0);
			for (int var28 = 0; var28 < 13; var28++) {
				this.sideicons[var28] = new Pix8(var6, "sideicons", var28);
			}
			this.compass = new Pix32(var6, "compass", 0);
			this.mapedge = new Pix32(var6, "mapedge", 0);
			this.mapedge.trim();
			for (int var29 = 0; var29 < 72; var29++) {
				this.mapscene[var29] = new Pix8(var6, "mapscene", var29);
			}
			for (int var30 = 0; var30 < 63; var30++) {
				this.mapfunction[var30] = new Pix32(var6, "mapfunction", var30);
			}
			for (int var31 = 0; var31 < 5; var31++) {
				this.hitmarks[var31] = new Pix32(var6, "hitmarks", var31);
			}
			for (int var32 = 0; var32 < 6; var32++) {
				this.headiconsPk[var32] = new Pix32(var6, "headicons_pk", var32);
			}
			for (int var33 = 0; var33 < 9; var33++) {
				this.headiconsPrayer[var33] = new Pix32(var6, "headicons_prayer", var33);
			}
			for (int var34 = 0; var34 < 6; var34++) {
				this.headiconsHint[var34] = new Pix32(var6, "headicons_hint", var34);
			}
			this.overlayMultiway = new Pix32(var6, "overlay_multiway", 0);
			this.mapmarker0 = new Pix32(var6, "mapmarker", 0);
			this.mapmarker1 = new Pix32(var6, "mapmarker", 1);
			for (int var35 = 0; var35 < 8; var35++) {
				this.cross[var35] = new Pix32(var6, "cross", var35);
			}
			this.mapdots0 = new Pix32(var6, "mapdots", 0);
			this.mapdots1 = new Pix32(var6, "mapdots", 1);
			this.mapdots2 = new Pix32(var6, "mapdots", 2);
			this.mapdots3 = new Pix32(var6, "mapdots", 3);
			this.mapdots4 = new Pix32(var6, "mapdots", 4);
			this.scrollbar0 = new Pix8(var6, "scrollbar", 0);
			this.scrollbar1 = new Pix8(var6, "scrollbar", 1);
			this.redstone1 = new Pix8(var6, "redstone1", 0);
			this.redstone2 = new Pix8(var6, "redstone2", 0);
			this.redstone3 = new Pix8(var6, "redstone3", 0);
			this.restone1h = new Pix8(var6, "redstone1", 0);
			this.restone1h.hflip();
			this.redstone2h = new Pix8(var6, "redstone2", 0);
			this.redstone2h.hflip();
			this.redstone1v = new Pix8(var6, "redstone1", 0);
			this.redstone1v.vflip();
			this.redstone2v = new Pix8(var6, "redstone2", 0);
			this.redstone2v.vflip();
			this.restone3v = new Pix8(var6, "redstone3", 0);
			this.restone3v.vflip();
			this.redstone1hv = new Pix8(var6, "redstone1", 0);
			this.redstone1hv.hflip();
			this.redstone1hv.vflip();
			this.redstone2hv = new Pix8(var6, "redstone2", 0);
			this.redstone2hv.hflip();
			this.redstone2hv.vflip();
			for (int var36 = 0; var36 < 2; var36++) {
				this.modIcons[var36] = new Pix8(var6, "mod_icons", var36);
			}
			Pix32 var37 = new Pix32(var6, "backleft1", 0);
			this.areaBackleft1 = new PixMap(var37.wi, false, this.getBaseComponent(), var37.hi);
			var37.quickPlotSprite(0, 0);
			Pix32 var38 = new Pix32(var6, "backleft2", 0);
			this.areaBackleft2 = new PixMap(var38.wi, false, this.getBaseComponent(), var38.hi);
			var38.quickPlotSprite(0, 0);
			Pix32 var39 = new Pix32(var6, "backright1", 0);
			this.areaBackright1 = new PixMap(var39.wi, false, this.getBaseComponent(), var39.hi);
			var39.quickPlotSprite(0, 0);
			Pix32 var40 = new Pix32(var6, "backright2", 0);
			this.areaBackright2 = new PixMap(var40.wi, false, this.getBaseComponent(), var40.hi);
			var40.quickPlotSprite(0, 0);
			Pix32 var41 = new Pix32(var6, "backtop1", 0);
			this.areaBacktop1 = new PixMap(var41.wi, false, this.getBaseComponent(), var41.hi);
			var41.quickPlotSprite(0, 0);
			Pix32 var42 = new Pix32(var6, "backvmid1", 0);
			this.areaBackvmid1 = new PixMap(var42.wi, false, this.getBaseComponent(), var42.hi);
			var42.quickPlotSprite(0, 0);
			Pix32 var43 = new Pix32(var6, "backvmid2", 0);
			this.areaBackvmid2 = new PixMap(var43.wi, false, this.getBaseComponent(), var43.hi);
			var43.quickPlotSprite(0, 0);
			Pix32 var44 = new Pix32(var6, "backvmid3", 0);
			this.areaBackvmid3 = new PixMap(var44.wi, false, this.getBaseComponent(), var44.hi);
			var44.quickPlotSprite(0, 0);
			Pix32 var45 = new Pix32(var6, "backhmid2", 0);
			this.areaBackhmid2 = new PixMap(var45.wi, false, this.getBaseComponent(), var45.hi);
			var45.quickPlotSprite(0, 0);
			int var46 = (int) (Math.random() * 21.0D) - 10;
			int var47 = (int) (Math.random() * 21.0D) - 10;
			int var48 = (int) (Math.random() * 21.0D) - 10;
			int var49 = (int) (Math.random() * 41.0D) - 20;
			for (int var50 = 0; var50 < 100; var50++) {
				if (this.mapfunction[var50] != null) {
					this.mapfunction[var50].rgbAdjust(var48 + var49, var46 + var49, var47 + var49);
				}
				if (this.mapscene[var50] != null) {
					this.mapscene[var50].rgbAdjust(var48 + var49, var46 + var49, var47 + var49);
				}
			}
			this.drawProgress("Unpacking textures", (byte) 8, 83);
			Pix3D.unpackTextures(var7);
			Pix3D.initColourTable(0.8D);
			Pix3D.initPool();
			this.drawProgress("Unpacking config", (byte) 8, 86);
			SeqType.init(var4);
			LocType.init(var4);
			FloType.init(var4);
			ObjType.init(var4);
			NpcType.init(var4);
			IdkType.init(var4);
			SpotType.init(var4);
			VarType.init(var4);
			VarbitType.init(var4);
			ObjType.memServer = memServer;
			if (!lowMem) {
				this.drawProgress("Unpacking sounds", (byte) 8, 90);
				byte[] var51 = var9.read("sounds.dat", null);
				Packet var52 = new Packet(var51, -26583);
				JagFX.init(var52);
			}
			this.drawProgress("Unpacking interfaces", (byte) 8, 95);
			PixFont[] var53 = new PixFont[] { this.p11, this.p12, this.b12, this.q8};
			IfType.unpack(var6, var5, var53);
			this.drawProgress("Preparing game engine", (byte) 8, 100);
			for (int var54 = 0; var54 < 33; var54++) {
				int var55 = 999;
				int var56 = 0;
				for (int var57 = 0; var57 < 34; var57++) {
					if (this.mapback.data[var57 + var54 * this.mapback.wi] == 0) {
						if (var55 == 999) {
							var55 = var57;
						}
					} else if (var55 != 999) {
						var56 = var57;
						break;
					}
				}
				this.compassMaskLineOffsets[var54] = var55;
				this.compassMaskLineLengths[var54] = var56 - var55;
			}
			for (int var58 = 5; var58 < 156; var58++) {
				int var59 = 999;
				int var60 = 0;
				for (int var61 = 25; var61 < 172; var61++) {
					if (this.mapback.data[var61 + var58 * this.mapback.wi] == 0 && (var61 > 34 || var58 > 34)) {
						if (var59 == 999) {
							var59 = var61;
						}
					} else if (var59 != 999) {
						var60 = var61;
						break;
					}
				}
				this.minimapMaskLineOffsets[var58 - 5] = var59 - 25;
				this.minimapMaskLineLengths[var58 - 5] = var60 - var59;
			}
			Pix3D.setClipping(477, 503, 765);
			this.field429 = Pix3D.scanline;
			Pix3D.setClipping(477, 96, 479);
			this.chatScanline = Pix3D.scanline;
			Pix3D.setClipping(477, 261, 190);
			this.field427 = Pix3D.scanline;
			Pix3D.setClipping(477, 334, 512);
			this.gameScanline = Pix3D.scanline;
			int[] var62 = new int[9];
			for (int var63 = 0; var63 < 9; var63++) {
				int var64 = var63 * 32 + 128 + 15;
				int var65 = var64 * 3 + 600;
				int var66 = Pix3D.sinTable[var64];
				var62[var63] = var65 * var66 >> 16;
			}
			World.resetVisCalc(var62);
			WordFilter.unpack(var8);
			this.mouseTracking = new MouseTracking(0, this);
			this.startThread(this.mouseTracking, 10);
			ClientLocAnim.field1395 = this;
			LocType.field700 = this;
			NpcType.varCache = this;
		} catch (Exception var72) {
			signlink.reporterror("loaderror " + this.field604 + " " + this.field256);
			this.errorLoading = true;
		}
	}

	@ObfuscatedName("client.c(I)V")
	@Override
	public void mainloop() {
		try {
			if (!this.errorStarted && !this.errorLoading && !this.errorHost) {
				loopCycle++;
				if (this.ingame) {
					this.gameLoop();
				} else {
					this.titleScreenLoop(390);
				}
				this.onDemandLoop();
			}
		} catch (RuntimeException var2) {
			signlink.reporterror("17922, " + 107 + ", " + var2.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.e(I)V")
	@Override
	public void mainredraw(int arg0) {
		try {
			if (this.errorStarted || this.errorLoading || this.errorHost) {
				this.drawError();
			} else {
				field505++;
				if (this.ingame) {
					this.gameDraw();
				} else {
					this.titleScreenDraw(false);
				}
				this.scrollCycle = 0;
				if (arg0 != -26684) {
					this.ptype = this.in.g1();
				}
			}
		} catch (RuntimeException var3) {
			signlink.reporterror("22595, " + arg0 + ", " + var3.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.a(B)V")
	@Override
	public void refresh(byte arg0) {
		try {
			this.redrawFrame = true;
		} catch (RuntimeException var3) {
			signlink.reporterror("37693, " + 6 + ", " + var3.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.d(I)V")
	@Override
	public void mainquit(int arg0) {
		try {
			signlink.reporterror = false;
			try {
				if (this.stream != null) {
					this.stream.close();
				}
			} catch (Exception var3) {
			}
			this.stream = null;
			this.stopMidi(this.field263);
			if (this.mouseTracking != null) {
				this.mouseTracking.active = false;
			}
			this.mouseTracking = null;
			this.onDemand.stop();
			this.onDemand = null;
			this.field230 = null;
			this.out = null;
			this.loginout = null;
			this.in = null;
			this.mapBuildIndex = null;
			this.mapBuildGroundData = null;
			this.mapBuildLocationData = null;
			this.mapBuildGroundFile = null;
			this.mapBuildLocationFile = null;
			this.groundh = null;
			this.mapl = null;
			this.world = null;
			this.collision = null;
			this.field520 = null;
			this.field542 = null;
			this.field175 = null;
			this.field176 = null;
			this.field471 = null;
			this.field488 = null;
			this.areaMap = null;
			this.areaGame = null;
			this.field491 = null;
			this.areaBackbase1 = null;
			this.areaBackbase2 = null;
			this.areaBackhmid1 = null;
			this.areaBackleft1 = null;
			this.areaBackleft2 = null;
			this.areaBackright1 = null;
			this.areaBackright2 = null;
			this.areaBacktop1 = null;
			this.areaBackvmid1 = null;
			this.areaBackvmid2 = null;
			this.areaBackvmid3 = null;
			this.areaBackhmid2 = null;
			this.invback = null;
			this.mapback = null;
			this.chatback = null;
			this.backbase1 = null;
			this.backbase2 = null;
			this.backhmid1 = null;
			this.sideicons = null;
			this.redstone1 = null;
			this.redstone2 = null;
			this.redstone3 = null;
			this.restone1h = null;
			this.redstone2h = null;
			this.redstone1v = null;
			this.redstone2v = null;
			this.restone3v = null;
			this.redstone1hv = null;
			this.redstone2hv = null;
			this.compass = null;
			this.hitmarks = null;
			this.headiconsPk = null;
			this.headiconsPrayer = null;
			this.headiconsHint = null;
			this.cross = null;
			this.overlayMultiway = null;
			this.mapdots0 = null;
			this.mapdots1 = null;
			this.mapdots2 = null;
			this.mapdots3 = null;
			this.mapdots4 = null;
			this.mapscene = null;
			this.mapfunction = null;
			this.field409 = null;
			this.players = null;
			this.playerIds = null;
			this.entityUpdateIds = null;
			this.playerAppearanceBuffer = null;
			this.entityRemovalIds = null;
			this.npc = null;
			this.npcIds = null;
			this.groundObj = null;
			this.locChanges = null;
			this.projectiles = null;
			this.spotanims = null;
			this.menuParamB = null;
			this.menuParamC = null;
			this.menuAction = null;
			this.menuParamA = null;
			this.menuOption = null;
			this.var = null;
			this.field362 = null;
			this.field363 = null;
			this.field373 = null;
			this.minimap = null;
			this.friendUsername = null;
			this.friendUserhash = null;
			this.friendNodeId = null;
			this.field331 = null;
			this.field332 = null;
			this.field328 = null;
			this.field329 = null;
			this.field330 = null;
			this.field333 = null;
			this.field334 = null;
			this.field335 = null;
			this.field336 = null;
			this.unloadTitle();
			LocType.method193();
			NpcType.method394();
			ObjType.unload();
			IfType.unload();
			FloType.list = null;
			IdkType.list = null;
			UnkType.field152 = null;
			SeqType.list = null;
			SpotType.list = null;
			SpotType.modelCache = null;
			VarType.list = null;
			super.drawArea = null;
			ClientPlayer.modelCache = null;
			Pix3D.unload();
			World.method527();
			Model.unload();
			AnimFrame.method307();
			System.gc();
			boolean var5 = false;
		} catch (RuntimeException var4) {
			signlink.reporterror("1923, " + arg0 + ", " + var4.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.a(Ljava/lang/String;BI)V")
	@Override
	public void drawProgress(String arg0, byte arg1, int arg2) {
		try {
			this.field256 = arg2;
			this.field604 = arg0;
			this.prepareTitleScreen();
			if (this.title == null) {
				super.drawProgress(arg0, (byte) 8, arg2);
			} else {
				this.field330.setPixels();
				this.b12.centreStringTag(16777215, "RuneScape is loading - please wait...", 180, 54);
				boolean var6 = false;
				Pix2D.drawRect(62, 304, 28, 34, 9179409);
				Pix2D.drawRect(63, 302, 29, 32, 0);
				Pix2D.fillrect(9179409, 30, 99, arg2 * 3, 30, 64);
				Pix2D.fillrect(0, arg2 * 3 + 30, 99, 300 - arg2 * 3, 30, 64);
				this.b12.centreStringTag(16777215, arg0, 180, 85);
				this.field330.draw(171, super.graphics, 202);
				if (this.redrawFrame) {
					this.redrawFrame = false;
					if (!this.flameActive) {
						this.field331.draw(0, super.graphics, 0);
						this.field332.draw(0, super.graphics, 637);
					}
					this.field328.draw(0, super.graphics, 128);
					this.field329.draw(371, super.graphics, 202);
					this.field333.draw(265, super.graphics, 0);
					this.field334.draw(265, super.graphics, 562);
					this.field335.draw(171, super.graphics, 128);
					this.field336.draw(171, super.graphics, 562);
				}
			}
		} catch (RuntimeException var5) {
			signlink.reporterror("44943, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + var5.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.q(I)V")
	public void drawError() {
		try {
			Graphics var1 = this.getBaseComponent().getGraphics();
			var1.setColor(Color.black);
			var1.fillRect(0, 0, 765, 503);
			this.setFramerate();
			if (this.errorLoading) {
				this.flameActive = false;
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
			if (this.errorHost) {
				this.flameActive = false;
				var1.setFont(new Font("Helvetica", 1, 20));
				var1.setColor(Color.white);
				var1.drawString("Error - unable to load game!", 50, 50);
				var1.drawString("To play RuneScape make sure you play from", 50, 100);
				var1.drawString("http://www.runescape.com", 50, 150);
			}
			if (this.errorStarted) {
				this.flameActive = false;
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

	@ObfuscatedName("client.j(B)V")
	public void getJagChecksums() {
		try {
			int var1 = 5;
			this.field306[8] = 0;
			int var2 = 0;
			while (this.field306[8] == 0) {
				String var3 = "Unknown problem";
				this.drawProgress("Connecting to web server", (byte) 8, 20);
				try {
					DataInputStream var4 = this.openUrl("crc" + (int) (Math.random() * 9.9999999E7D) + "-" + 349);
					Packet var5 = new Packet(new byte[40], -26583);
					var4.readFully(var5.data, 0, 40);
					var4.close();
					for (int var6 = 0; var6 < 9; var6++) {
						this.field306[var6] = var5.g4();
					}
					int var7 = var5.g4();
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
							this.drawProgress("Game updated - please reload page", (byte) 8, 10);
							var10 = 10;
						} else {
							this.drawProgress(var3 + " - Will retry in " + var10 + " secs.", (byte) 8, 10);
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
					this.jaggrabEnabled = !this.jaggrabEnabled;
				}
			}
		} catch (RuntimeException var16) {
			signlink.reporterror("32016, " + 8 + ", " + var16.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.a(Ljava/lang/String;ILjava/lang/String;IBI)LBBMKAXRK;")
	public JagFile getJagFile(String arg0, int arg1, String arg2, int arg3, int arg4) {
		try {
			byte[] var6 = null;
			int var7 = 5;
			try {
				if (this.fileStreams[0] != null) {
					var6 = this.fileStreams[0].readFromFile(arg4);
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
				return new JagFile((byte) 70, var6);
			}
			int var10 = 0;
			while (var6 == null) {
				String var11 = "Unknown error";
				this.drawProgress("Requesting " + arg0, (byte) 8, arg3);
				try {
					int var12 = 0;
					DataInputStream var13 = this.openUrl(arg2 + arg1);
					byte[] var14 = new byte[6];
					var13.readFully(var14, 0, 6);
					Packet var15 = new Packet(var14, -26583);
					var15.pos = 3;
					int var16 = var15.g3() + 6;
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
							this.drawProgress("Loading " + arg0 + " - " + var21 + "%", (byte) 8, arg3);
						}
						var12 = var21;
					}
					var13.close();
					try {
						if (this.fileStreams[0] != null) {
							this.fileStreams[0].writeToFile(var6.length, var6, arg4);
						}
					} catch (Exception var28) {
						this.fileStreams[0] = null;
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
							this.drawProgress("Game updated - please reload page", (byte) 8, arg3);
							var24 = 10;
						} else {
							this.drawProgress(var11 + " - Retrying in " + var24, (byte) 8, arg3);
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
					this.jaggrabEnabled = !this.jaggrabEnabled;
				}
			}
			return new JagFile((byte) 70, var6);
		} catch (RuntimeException var34) {
			signlink.reporterror("59950, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + -64 + ", " + arg4 + ", " + var34.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.g(Z)V")
	public void onDemandLoop() {
		try {
			while (true) {
				OnDemandRequest var1 = this.onDemand.loop();
				if (var1 == null) {
					return;
				}
				if (var1.archive == 0) {
					Model.unpack(var1.file, var1.data);
					if ((this.onDemand.getModelUse(var1.file) & 0x62) != 0) {
						this.redrawSidebar = true;
						if (this.chatComId != -1 || this.field629 != -1) {
							this.redrawChatback = true;
						}
					}
				}
				if (var1.archive == 1 && var1.data != null) {
					AnimFrame.unpack(var1.data);
				}
				if (var1.archive == 2 && var1.file == this.midiSong && var1.data != null) {
					this.saveMidi(var1.data, this.midiFading);
				}
				if (var1.archive == 3 && this.sceneState == 1) {
					for (int var2 = 0; var2 < this.mapBuildGroundData.length; var2++) {
						if (this.mapBuildGroundFile[var2] == var1.file) {
							this.mapBuildGroundData[var2] = var1.data;
							if (var1.data == null) {
								this.mapBuildGroundFile[var2] = -1;
							}
							break;
						}
						if (this.mapBuildLocationFile[var2] == var1.file) {
							this.mapBuildLocationData[var2] = var1.data;
							if (var1.data == null) {
								this.mapBuildLocationFile[var2] = -1;
							}
							break;
						}
					}
				}
				if (var1.archive == 93 && this.onDemand.hasMapLocFile(var1.file)) {
					ClientBuild.prefectLocations(new Packet(var1.data, -26583), this.onDemand);
				}
			}
		} catch (RuntimeException var4) {
			signlink.reporterror("9499, " + true + ", " + var4.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.a(Ljava/lang/String;)V")
	public void showLoadError(String arg0) {
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

	@ObfuscatedName("client.M(I)V")
	public void titleScreenLoop(int arg0) {
		try {
			boolean var16 = false;
			if (this.loginscreen == 0) {
				int var2 = super.sHei / 2 - 80;
				int var3 = super.sWid / 2 + 20;
				int var17 = var3 + 20;
				if (super.mouseClickButton == 1 && super.mouseClickX >= var2 - 75 && super.mouseClickX <= var2 + 75 && super.mouseClickY >= var17 - 20 && super.mouseClickY <= var17 + 20) {
					this.loginscreen = 3;
					this.loginSelect = 0;
				}
				int var4 = super.sHei / 2 + 80;
				if (super.mouseClickButton == 1 && super.mouseClickX >= var4 - 75 && super.mouseClickX <= var4 + 75 && super.mouseClickY >= var17 - 20 && super.mouseClickY <= var17 + 20) {
					this.loginMes1 = "";
					this.loginMes2 = "Enter your username & password.";
					this.loginscreen = 2;
					this.loginSelect = 0;
				}
			} else if (this.loginscreen == 2) {
				int var5 = super.sWid / 2 - 40;
				int var18 = var5 + 30;
				int var19 = var18 + 25;
				if (super.mouseClickButton == 1 && super.mouseClickY >= var19 - 15 && super.mouseClickY < var19) {
					this.loginSelect = 0;
				}
				var5 = var19 + 15;
				if (super.mouseClickButton == 1 && super.mouseClickY >= var5 - 15 && super.mouseClickY < var5) {
					this.loginSelect = 1;
				}
				var5 += 15;
				int var6 = super.sHei / 2 - 80;
				int var7 = super.sWid / 2 + 50;
				int var20 = var7 + 20;
				if (super.mouseClickButton == 1 && super.mouseClickX >= var6 - 75 && super.mouseClickX <= var6 + 75 && super.mouseClickY >= var20 - 20 && super.mouseClickY <= var20 + 20) {
					this.field598 = 0;
					this.login(this.loginUser, this.loginPass, false);
					if (this.ingame) {
						return;
					}
				}
				int var8 = super.sHei / 2 + 80;
				if (super.mouseClickButton == 1 && super.mouseClickX >= var8 - 75 && super.mouseClickX <= var8 + 75 && super.mouseClickY >= var20 - 20 && super.mouseClickY <= var20 + 20) {
					this.loginscreen = 0;
					this.loginUser = "";
					this.loginPass = "";
				}
				while (true) {
					while (true) {
						int var9 = this.pollKey();
						if (var9 == -1) {
							return;
						}
						boolean var10 = false;
						for (int var11 = 0; var11 < CHARSET.length(); var11++) {
							if (var9 == CHARSET.charAt(var11)) {
								var10 = true;
								break;
							}
						}
						if (this.loginSelect == 0) {
							if (var9 == 8 && this.loginUser.length() > 0) {
								this.loginUser = this.loginUser.substring(0, this.loginUser.length() - 1);
							}
							if (var9 == 9 || var9 == 10 || var9 == 13) {
								this.loginSelect = 1;
							}
							if (var10) {
								this.loginUser = this.loginUser + (char) var9;
							}
							if (this.loginUser.length() > 12) {
								this.loginUser = this.loginUser.substring(0, 12);
							}
						} else if (this.loginSelect == 1) {
							if (var9 == 8 && this.loginPass.length() > 0) {
								this.loginPass = this.loginPass.substring(0, this.loginPass.length() - 1);
							}
							if (var9 == 9 || var9 == 10 || var9 == 13) {
								this.loginSelect = 0;
							}
							if (var10) {
								this.loginPass = this.loginPass + (char) var9;
							}
							if (this.loginPass.length() > 20) {
								this.loginPass = this.loginPass.substring(0, 20);
							}
						}
					}
				}
			} else if (this.loginscreen == 3) {
				int var12 = super.sHei / 2;
				int var13 = super.sWid / 2 + 50;
				int var21 = var13 + 20;
				if (super.mouseClickButton == 1 && super.mouseClickX >= var12 - 75 && super.mouseClickX <= var12 + 75 && super.mouseClickY >= var21 - 20 && super.mouseClickY <= var21 + 20) {
					this.loginscreen = 0;
					return;
				}
			}
		} catch (RuntimeException var15) {
			signlink.reporterror("47293, " + arg0 + ", " + var15.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.d(ZI)V")
	public void titleScreenDraw(boolean arg0) {
		try {
			this.prepareTitleScreen();
			this.field330.setPixels();
			this.titlebox.plotSprite(0, this.field527, 0);
			if (this.loginscreen == 0) {
				this.p11.centreString(180, this.onDemand.field1664, 180, true, 7711145);
				byte var2 = 80;
				this.b12.centreString(180, "Welcome to RuneScape", 80, true, 16776960);
				int var7 = var2 + 30;
				this.titlebutton.plotSprite(27, this.field527, 100);
				this.b12.centreString(100, "New User", 125, true, 16777215);
				this.titlebutton.plotSprite(187, this.field527, 100);
				this.b12.centreString(260, "Existing User", 125, true, 16777215);
			}
			if (this.loginscreen == 2) {
				byte var3 = 60;
				int var8;
				if (this.loginMes1.length() > 0) {
					this.b12.centreString(180, this.loginMes1, 45, true, 16776960);
					this.b12.centreString(180, this.loginMes2, 60, true, 16776960);
					var8 = var3 + 30;
				} else {
					this.b12.centreString(180, this.loginMes2, 53, true, 16776960);
					var8 = var3 + 30;
				}
				this.b12.drawStringTag(90, 90, true, 16777215, "Username: " + this.loginUser + (this.loginSelect == 0 & loopCycle % 40 < 20 ? "@yel@|" : ""));
				var8 += 15;
				this.b12.drawStringTag(92, 105, true, 16777215, "Password: " + JString.getRepeatedCharacter(this.loginPass) + (this.loginSelect == 1 & loopCycle % 40 < 20 ? "@yel@|" : ""));
				var8 += 15;
				if (!arg0) {
					this.titlebutton.plotSprite(27, this.field527, 130);
					this.b12.centreString(100, "Login", 155, true, 16777215);
					this.titlebutton.plotSprite(187, this.field527, 130);
					this.b12.centreString(260, "Cancel", 155, true, 16777215);
				}
			}
			if (this.loginscreen == 3) {
				this.b12.centreString(180, "Create a free account", 40, true, 16776960);
				byte var4 = 65;
				this.b12.centreString(180, "To create a new account you need to", 65, true, 16777215);
				int var9 = var4 + 15;
				this.b12.centreString(180, "go back to the main RuneScape webpage", 80, true, 16777215);
				int var10 = var9 + 15;
				this.b12.centreString(180, "and choose the 'create account'", 95, true, 16777215);
				int var11 = var10 + 15;
				this.b12.centreString(180, "button near the top of that page.", 110, true, 16777215);
				int var12 = var11 + 15;
				this.titlebutton.plotSprite(107, this.field527, 130);
				this.b12.centreString(180, "Cancel", 155, true, 16777215);
			}
			this.field330.draw(171, super.graphics, 202);
			if (this.redrawFrame) {
				this.redrawFrame = false;
				this.field328.draw(0, super.graphics, 128);
				this.field329.draw(371, super.graphics, 202);
				this.field333.draw(265, super.graphics, 0);
				this.field334.draw(265, super.graphics, 562);
				this.field335.draw(171, super.graphics, 128);
				this.field336.draw(171, super.graphics, 562);
			}
		} catch (RuntimeException var6) {
			signlink.reporterror("10605, " + arg0 + ", " + 326 + ", " + var6.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.x(I)V")
	public void prepareTitleScreen() {
		try {
			if (this.field328 == null) {
				super.drawArea = null;
				this.field491 = null;
				this.areaMap = null;
				this.field488 = null;
				this.areaGame = null;
				this.areaBackbase1 = null;
				this.areaBackbase2 = null;
				this.areaBackhmid1 = null;
				this.field331 = new PixMap(128, false, this.getBaseComponent(), 265);
				Pix2D.cls();
				this.field332 = new PixMap(128, false, this.getBaseComponent(), 265);
				Pix2D.cls();
				this.field328 = new PixMap(509, false, this.getBaseComponent(), 171);
				Pix2D.cls();
				this.field329 = new PixMap(360, false, this.getBaseComponent(), 132);
				Pix2D.cls();
				this.field330 = new PixMap(360, false, this.getBaseComponent(), 200);
				Pix2D.cls();
				this.field333 = new PixMap(202, false, this.getBaseComponent(), 238);
				Pix2D.cls();
				this.field334 = new PixMap(203, false, this.getBaseComponent(), 238);
				Pix2D.cls();
				this.field335 = new PixMap(74, false, this.getBaseComponent(), 94);
				Pix2D.cls();
				this.field336 = new PixMap(75, false, this.getBaseComponent(), 94);
				Pix2D.cls();
				if (this.title != null) {
					this.loadTitleBackground();
					this.loadTitleImages();
				}
				this.redrawFrame = true;
			}
		} catch (RuntimeException var2) {
			signlink.reporterror("39265, " + 740 + ", " + var2.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.C(I)V")
	public void loadTitleBackground() {
		try {
			byte[] var1 = this.title.read("title.dat", null);
			Pix32 var2 = new Pix32(var1, this);
			this.field331.setPixels();
			var2.quickPlotSprite(0, 0);
			this.field332.setPixels();
			var2.quickPlotSprite(0, -637);
			this.field328.setPixels();
			var2.quickPlotSprite(0, -128);
			this.field329.setPixels();
			var2.quickPlotSprite(-371, -202);
			this.field330.setPixels();
			var2.quickPlotSprite(-171, -202);
			this.field333.setPixels();
			var2.quickPlotSprite(-265, 0);
			this.field334.setPixels();
			var2.quickPlotSprite(-265, -562);
			this.field335.setPixels();
			var2.quickPlotSprite(-171, -128);
			this.field336.setPixels();
			var2.quickPlotSprite(-171, -562);
			int[] var3 = new int[var2.wi];
			for (int var4 = 0; var4 < var2.hi; var4++) {
				for (int var5 = 0; var5 < var2.wi; var5++) {
					var3[var5] = var2.data[var2.wi + var2.wi * var4 - var5 - 1];
				}
				for (int var6 = 0; var6 < var2.wi; var6++) {
					var2.data[var6 + var2.wi * var4] = var3[var6];
				}
			}
			this.field331.setPixels();
			var2.quickPlotSprite(0, 382);
			this.field332.setPixels();
			var2.quickPlotSprite(0, -255);
			this.field328.setPixels();
			var2.quickPlotSprite(0, 254);
			this.field329.setPixels();
			var2.quickPlotSprite(-371, 180);
			this.field330.setPixels();
			var2.quickPlotSprite(-171, 180);
			this.field333.setPixels();
			var2.quickPlotSprite(-265, 382);
			this.field334.setPixels();
			var2.quickPlotSprite(-265, -180);
			this.field335.setPixels();
			var2.quickPlotSprite(-171, 254);
			this.field336.setPixels();
			var2.quickPlotSprite(-171, -180);
			Pix32 var7 = new Pix32(this.title, "logo", 0);
			this.field328.setPixels();
			var7.plotSprite(382 - var7.wi / 2 - 128, this.field527, 18);
			System.gc();
		} catch (RuntimeException var9) {
			signlink.reporterror("11391, " + -324 + ", " + var9.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.t(I)V")
	public void loadTitleImages() {
		try {
			this.titlebox = new Pix8(this.title, "titlebox", 0);
			this.titlebutton = new Pix8(this.title, "titlebutton", 0);
			this.runes = new Pix8[12];
			for (int var1 = 0; var1 < 12; var1++) {
				this.runes[var1] = new Pix8(this.title, "runes", var1);
			}
			this.flameLeft = new Pix32(128, 265);
			this.flameRight = new Pix32(128, 265);
			for (int var2 = 0; var2 < 33920; var2++) {
				this.flameLeft.data[var2] = this.field331.data[var2];
			}
			for (int var3 = 0; var3 < 33920; var3++) {
				this.flameRight.data[var3] = this.field332.data[var3];
			}
			this.flameGradient0 = new int[256];
			for (int var4 = 0; var4 < 64; var4++) {
				this.flameGradient0[var4] = var4 * 262144;
			}
			for (int var5 = 0; var5 < 64; var5++) {
				this.flameGradient0[var5 + 64] = var5 * 1024 + 16711680;
			}
			for (int var6 = 0; var6 < 64; var6++) {
				this.flameGradient0[var6 + 128] = var6 * 4 + 16776960;
			}
			for (int var7 = 0; var7 < 64; var7++) {
				this.flameGradient0[var7 + 192] = 16777215;
			}
			this.flameGradient1 = new int[256];
			for (int var8 = 0; var8 < 64; var8++) {
				this.flameGradient1[var8] = var8 * 1024;
			}
			for (int var9 = 0; var9 < 64; var9++) {
				this.flameGradient1[var9 + 64] = var9 * 4 + 65280;
			}
			for (int var10 = 0; var10 < 64; var10++) {
				this.flameGradient1[var10 + 128] = var10 * 262144 + 65535;
			}
			for (int var11 = 0; var11 < 64; var11++) {
				this.flameGradient1[var11 + 192] = 16777215;
			}
			this.flameGradient2 = new int[256];
			for (int var12 = 0; var12 < 64; var12++) {
				this.flameGradient2[var12] = var12 * 4;
			}
			for (int var13 = 0; var13 < 64; var13++) {
				this.flameGradient2[var13 + 64] = var13 * 262144 + 255;
			}
			for (int var14 = 0; var14 < 64; var14++) {
				this.flameGradient2[var14 + 128] = var14 * 1024 + 16711935;
			}
			for (int var15 = 0; var15 < 64; var15++) {
				this.flameGradient2[var15 + 192] = 16777215;
			}
			this.flameGradient = new int[256];
			this.flameBuffer0 = new int[32768];
			this.flameBuffer1 = new int[32768];
			this.generateFlameCoolingMap(null);
			this.flameBuffer3 = new int[32768];
			this.flameBuffer2 = new int[32768];
			this.drawProgress("Connecting to fileserver", (byte) 8, 10);
			if (!this.flameActive) {
				this.flamesThread = true;
				this.flameActive = true;
				this.startThread(this, 2);
			}
		} catch (RuntimeException var17) {
			signlink.reporterror("6714, " + -909 + ", " + var17.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.a(Ljava/lang/String;Ljava/lang/String;Z)V")
	public void login(String arg0, String arg1, boolean arg2) {
		signlink.errorname = arg0;
		try {
			if (!arg2) {
				this.loginMes1 = "";
				this.loginMes2 = "Connecting to server...";
				this.titleScreenDraw(true);
			}
			this.stream = new ClientStream(0, this, this.openSocket(portOffset + 43594));
			long var4 = JString.toUserhash(arg0);
			int var6 = (int) (var4 >> 16 & 0x1FL);
			this.out.pos = 0;
			this.out.p1(14);
			this.out.p1(var6);
			this.stream.write(this.out.data, 2, (byte) 1);
			for (int var7 = 0; var7 < 8; var7++) {
				this.stream.read();
			}
			int var8 = this.stream.read();
			int var9 = var8;
			if (var8 == 0) {
				this.stream.read(this.in.data, 0, 8);
				this.in.pos = 0;
				this.loginSeed = this.in.g8();
				int[] var10 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (this.loginSeed >> 32), (int) this.loginSeed};
				this.out.pos = 0;
				this.out.p1(10);
				this.out.p4(var10[0]);
				this.out.p4(var10[1]);
				this.out.p4(var10[2]);
				this.out.p4(var10[3]);
				this.out.p4(signlink.uid);
				this.out.pjstr(arg0);
				this.out.pjstr(arg1);
				this.out.rsaenc(this.field270, field401, field296);
				this.loginout.pos = 0;
				if (arg2) {
					this.loginout.p1(18);
				} else {
					this.loginout.p1(16);
				}
				this.loginout.p1(this.out.pos + 36 + 1 + 1 + 2);
				this.loginout.p1(255);
				this.loginout.p2(349);
				this.loginout.p1(lowMem ? 1 : 0);
				for (int var11 = 0; var11 < 9; var11++) {
					this.loginout.p4(this.field306[var11]);
				}
				this.loginout.pdata(this.out.pos, this.out.data);
				this.out.random = new Isaac(var10, 7);
				for (int var12 = 0; var12 < 4; var12++) {
					var10[var12] += 50;
				}
				this.randomIn = new Isaac(var10, 7);
				this.stream.write(this.loginout.data, this.loginout.pos, (byte) 1);
				var8 = this.stream.read();
			}
			if (var8 == 1) {
				try {
					Thread.sleep(2000L);
				} catch (Exception var22) {
				}
				this.login(arg0, arg1, arg2);
			} else if (var8 == 2) {
				this.staffmodLevel = this.stream.read();
				mouseTracked = this.stream.read() == 1;
				this.prevMouseClickTime = 0L;
				this.mouseTrackedDelta = 0;
				this.mouseTracking.length = 0;
				super.focus = true;
				this.focusIn = true;
				this.ingame = true;
				this.out.pos = 0;
				this.in.pos = 0;
				this.ptype = -1;
				this.ptype0 = -1;
				this.ptype1 = -1;
				this.ptype2 = -1;
				this.psize = 0;
				this.timeoutTimer = 0;
				this.rebootTimer = 0;
				this.logoutTimer = 0;
				this.hintType = 0;
				this.menuNumEntries = 0;
				this.isMenuOpen = false;
				super.idleTimer = 0;
				for (int var13 = 0; var13 < 100; var13++) {
					this.chatText[var13] = null;
				}
				this.useMode = 0;
				this.targetMode = 0;
				this.sceneState = 0;
				this.waveCount = 0;
				this.macroCameraX = (int) (Math.random() * 100.0D) - 50;
				this.macroCameraZ = (int) (Math.random() * 110.0D) - 55;
				this.macroCameraAngle = (int) (Math.random() * 80.0D) - 40;
				this.macroMinimapAngle = (int) (Math.random() * 120.0D) - 60;
				this.macroMinimapZoom = (int) (Math.random() * 30.0D) - 20;
				this.orbitCameraYaw = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
				this.minimapState = 0;
				this.minimapLevel = -1;
				this.minimapFlagX = 0;
				this.minimapFlagZ = 0;
				this.playerCount = 0;
				this.npcCount = 0;
				for (int var14 = 0; var14 < this.field562; var14++) {
					this.players[var14] = null;
					this.playerAppearanceBuffer[var14] = null;
				}
				for (int var15 = 0; var15 < 16384; var15++) {
					this.npc[var15] = null;
				}
				localPlayer = this.players[this.LOCAL_PLAYER_INDEX] = new ClientPlayer();
				this.projectiles.clear();
				this.spotanims.clear();
				for (int var16 = 0; var16 < 4; var16++) {
					for (int var17 = 0; var17 < 104; var17++) {
						for (int var18 = 0; var18 < 104; var18++) {
							this.groundObj[var16][var17][var18] = null;
						}
					}
				}
				this.locChanges = new LinkList(807);
				this.friendServerStatus = 0;
				this.friendCount = 0;
				this.unloadIf(this.field629);
				this.field629 = -1;
				this.unloadIf(this.chatComId);
				this.chatComId = -1;
				this.unloadIf(this.mainModalId);
				this.mainModalId = -1;
				this.unloadIf(this.field631);
				this.field631 = -1;
				this.unloadIf(this.field275);
				this.field275 = -1;
				this.unloadIf(this.sideModealId);
				this.sideModealId = -1;
				this.unloadIf(this.mainOverlayId);
				this.mainOverlayId = -1;
				this.field446 = false;
				this.activeIcon = 3;
				this.dialogueInputOpen = 0;
				this.isMenuOpen = false;
				this.socialInputOpen = false;
				this.field321 = null;
				this.field618 = 0;
				this.tutFlashIcon = -1;
				this.idkDesignGender = true;
				this.validateIdkDesign();
				for (int var19 = 0; var19 < 5; var19++) {
					this.idkDesignColour[var19] = 0;
				}
				for (int var20 = 0; var20 < 5; var20++) {
					this.playerOp[var20] = null;
					this.playerOpPriority[var20] = false;
				}
				field526 = 0;
				field279 = 0;
				field201 = 0;
				field294 = 0;
				field246 = 0;
				field337 = 0;
				field395 = 0;
				this.prepareGame(this.field261);
			} else if (var8 == 3) {
				this.loginMes1 = "";
				this.loginMes2 = "Invalid username or password.";
			} else if (var8 == 4) {
				this.loginMes1 = "Your account has been disabled.";
				this.loginMes2 = "Please check your message-centre for details.";
			} else if (var8 == 5) {
				this.loginMes1 = "Your account is already logged in.";
				this.loginMes2 = "Try again in 60 secs...";
			} else if (var8 == 6) {
				this.loginMes1 = "RuneScape has been updated!";
				this.loginMes2 = "Please reload this page.";
			} else if (var8 == 7) {
				this.loginMes1 = "This world is full.";
				this.loginMes2 = "Please use a different world.";
			} else if (var8 == 8) {
				this.loginMes1 = "Unable to connect.";
				this.loginMes2 = "Login server offline.";
			} else if (var8 == 9) {
				this.loginMes1 = "Login limit exceeded.";
				this.loginMes2 = "Too many connections from your address.";
			} else if (var8 == 10) {
				this.loginMes1 = "Unable to connect.";
				this.loginMes2 = "Bad session id.";
			} else if (var8 == 11) {
				this.loginMes1 = "Login server rejected session.";
				this.loginMes2 = "Please try again.";
			} else if (var8 == 12) {
				this.loginMes1 = "You need a members account to login to this world.";
				this.loginMes2 = "Please subscribe, or use a different world.";
			} else if (var8 == 13) {
				this.loginMes1 = "Could not complete login.";
				this.loginMes2 = "Please try using a different world.";
			} else if (var8 == 14) {
				this.loginMes1 = "The server is being updated.";
				this.loginMes2 = "Please wait 1 minute and try again.";
			} else if (var8 == 15) {
				this.ingame = true;
				this.out.pos = 0;
				this.in.pos = 0;
				this.ptype = -1;
				this.ptype0 = -1;
				this.ptype1 = -1;
				this.ptype2 = -1;
				this.psize = 0;
				this.timeoutTimer = 0;
				this.rebootTimer = 0;
				this.menuNumEntries = 0;
				this.isMenuOpen = false;
				this.sceneLoadStartTime = System.currentTimeMillis();
			} else if (var8 == 16) {
				this.loginMes1 = "Login attempts exceeded.";
				this.loginMes2 = "Please wait 1 minute and try again.";
			} else if (var8 == 17) {
				this.loginMes1 = "You are standing in a members-only area.";
				this.loginMes2 = "To play on this world move to a free area first";
			} else if (var8 == 20) {
				this.loginMes1 = "Invalid loginserver requested";
				this.loginMes2 = "Please try using a different world.";
			} else if (var8 == 21) {
				int var21 = this.stream.read();
				for (int var26 = var21 + 3; var26 >= 0; var26--) {
					this.loginMes1 = "You have only just left another world";
					this.loginMes2 = "Your profile will be transferred in: " + var26;
					this.titleScreenDraw(true);
					try {
						Thread.sleep(1200L);
					} catch (Exception var23) {
					}
				}
				this.login(arg0, arg1, arg2);
			} else if (var8 == 22) {
				this.loginMes1 = "Malformed login packet.";
				this.loginMes2 = "Please try again.";
			} else if (var8 != -1) {
				System.out.println("response:" + var8);
				this.loginMes1 = "Unexpected server response";
				this.loginMes2 = "Please try using a different world.";
			} else if (var9 != 0) {
				this.loginMes1 = "No response from server";
				this.loginMes2 = "Please try using a different world.";
			} else if (this.field598 < 2) {
				try {
					Thread.sleep(2000L);
				} catch (Exception var24) {
				}
				this.field598++;
				this.login(arg0, arg1, arg2);
			} else {
				this.loginMes1 = "No response from loginserver";
				this.loginMes2 = "Please wait 1 minute and try again.";
			}
		} catch (IOException var25) {
			this.loginMes1 = "";
			this.loginMes2 = "Error connecting to server.";
		}
	}

	@ObfuscatedName("client.i(I)V")
	public void unloadTitle() {
		try {
			this.flameActive = false;
			while (this.flameThread) {
				this.flameActive = false;
				try {
					Thread.sleep(50L);
				} catch (Exception var2) {
				}
			}
			this.titlebox = null;
			this.titlebutton = null;
			this.runes = null;
			this.flameGradient = null;
			this.flameGradient0 = null;
			this.flameGradient1 = null;
			this.flameGradient2 = null;
			this.flameBuffer0 = null;
			this.flameBuffer1 = null;
			this.flameBuffer3 = null;
			this.flameBuffer2 = null;
			this.flameLeft = null;
			this.flameRight = null;
		} catch (RuntimeException var3) {
			signlink.reporterror("1444, " + 978 + ", " + var3.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.w(I)V")
	public void prepareGame(int arg0) {
		try {
			if (this.field491 == null) {
				this.unloadTitle();
				super.drawArea = null;
				this.field328 = null;
				this.field329 = null;
				this.field330 = null;
				this.field331 = null;
				this.field332 = null;
				this.field333 = null;
				this.field334 = null;
				this.field335 = null;
				if (arg0 != 0) {
					this.groundObj = null;
				}
				this.field336 = null;
				this.field491 = new PixMap(479, false, this.getBaseComponent(), 96);
				this.areaMap = new PixMap(172, false, this.getBaseComponent(), 156);
				Pix2D.cls();
				this.mapback.plotSprite(0, this.field527, 0);
				this.field488 = new PixMap(190, false, this.getBaseComponent(), 261);
				this.areaGame = new PixMap(512, false, this.getBaseComponent(), 334);
				Pix2D.cls();
				this.areaBackbase1 = new PixMap(496, false, this.getBaseComponent(), 50);
				this.areaBackbase2 = new PixMap(269, false, this.getBaseComponent(), 37);
				this.areaBackhmid1 = new PixMap(249, false, this.getBaseComponent(), 45);
				this.redrawFrame = true;
				this.areaGame.setPixels();
				Pix3D.scanline = this.gameScanline;
			}
		} catch (RuntimeException var3) {
			signlink.reporterror("87295, " + arg0 + ", " + var3.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.b(B)V")
	public void gameLoop() {
		try {
			if (this.rebootTimer > 1) {
				this.rebootTimer--;
			}
			if (this.logoutTimer > 0) {
				this.logoutTimer--;
			}
			for (int var1 = 0; var1 < 5 && this.tcpIn(); var1++) {
			}
			if (this.ingame) {
				Object var2 = this.mouseTracking.lock;
				synchronized (this.mouseTracking.lock) {
					if (!mouseTracked) {
						this.mouseTracking.length = 0;
					} else if (super.mouseClickButton != 0 || this.mouseTracking.length >= 40) {
						this.out.p1enc(224);
						this.out.p1(0);
						int var3 = this.out.pos;
						int var4 = 0;
						for (int var5 = 0; var5 < this.mouseTracking.length && var3 - this.out.pos < 240; var5++) {
							var4++;
							int var6 = this.mouseTracking.y[var5];
							if (var6 < 0) {
								var6 = 0;
							} else if (var6 > 502) {
								var6 = 502;
							}
							int var7 = this.mouseTracking.x[var5];
							if (var7 < 0) {
								var7 = 0;
							} else if (var7 > 764) {
								var7 = 764;
							}
							int var8 = var6 * 765 + var7;
							if (this.mouseTracking.y[var5] == -1 && this.mouseTracking.x[var5] == -1) {
								var7 = -1;
								var6 = -1;
								var8 = 524287;
							}
							if (var7 != this.field550 || var6 != this.field551) {
								int var9 = var7 - this.field550;
								this.field550 = var7;
								int var10 = var6 - this.field551;
								this.field551 = var6;
								if (this.mouseTrackedDelta < 8 && var9 >= -32 && var9 <= 31 && var10 >= -32 && var10 <= 31) {
									var9 += 32;
									var10 += 32;
									this.out.p2((this.mouseTrackedDelta << 12) + (var9 << 6) + var10);
									this.mouseTrackedDelta = 0;
								} else if (this.mouseTrackedDelta < 8) {
									this.out.p3((this.mouseTrackedDelta << 19) + var8 + 8388608);
									this.mouseTrackedDelta = 0;
								} else {
									this.out.p4((this.mouseTrackedDelta << 19) + var8 - 1073741824);
									this.mouseTrackedDelta = 0;
								}
							} else if (this.mouseTrackedDelta < 2047) {
								this.mouseTrackedDelta++;
							}
						}
						this.out.psize1(this.out.pos - var3, this.field241);
						if (var4 >= this.mouseTracking.length) {
							this.mouseTracking.length = 0;
						} else {
							this.mouseTracking.length -= var4;
							for (int var11 = 0; var11 < this.mouseTracking.length; var11++) {
								this.mouseTracking.x[var11] = this.mouseTracking.x[var11 + var4];
								this.mouseTracking.y[var11] = this.mouseTracking.y[var11 + var4];
							}
						}
					}
				}
				if (super.mouseClickButton != 0) {
					long var12 = (super.mouseClickTime - this.prevMouseClickTime) / 50L;
					if (var12 > 4095L) {
						var12 = 4095L;
					}
					this.prevMouseClickTime = super.mouseClickTime;
					int var14 = super.mouseClickY;
					if (var14 < 0) {
						var14 = 0;
					} else if (var14 > 502) {
						var14 = 502;
					}
					int var15 = super.mouseClickX;
					if (var15 < 0) {
						var15 = 0;
					} else if (var15 > 764) {
						var15 = 764;
					}
					int var16 = var14 * 765 + var15;
					byte var17 = 0;
					if (super.mouseClickButton == 2) {
						var17 = 1;
					}
					int var18 = (int) var12;
					this.out.p1enc(150);
					this.out.p4((var18 << 20) + (var17 << 19) + var16);
				}
				if (this.sendCameraDelay > 0) {
					this.sendCameraDelay--;
				}
				if (super.keyHeld[1] == 1 || super.keyHeld[2] == 1 || super.keyHeld[3] == 1 || super.keyHeld[4] == 1) {
					this.sendCamera = true;
				}
				if (this.sendCamera && this.sendCameraDelay <= 0) {
					this.sendCameraDelay = 20;
					this.sendCamera = false;
					this.out.p1enc(130);
					this.out.p2_alt3(this.orbitCameraPitch);
					this.out.p2(this.orbitCameraYaw);
				}
				if (super.focus && !this.focusIn) {
					this.focusIn = true;
					this.out.p1enc(139);
					this.out.p1(1);
				}
				if (!super.focus && this.focusIn) {
					this.focusIn = false;
					this.out.p1enc(139);
					this.out.p1(0);
				}
				this.checkMinimap();
				this.locChangeDoQueue((byte) 4);
				this.soundsDoQueue();
				this.timeoutTimer++;
				if (this.timeoutTimer > 750) {
					this.lostCon();
				}
				this.movePlayers();
				this.moveNpcs();
				this.timeoutChat(this.field259);
				this.worldUpdateNum++;
				if (this.crossMode != 0) {
					this.crossCycle += 20;
					if (this.crossCycle >= 400) {
						this.crossMode = 0;
					}
				}
				if (this.field503 != 0) {
					this.field500++;
					if (this.field500 >= 15) {
						if (this.field503 == 2) {
							this.redrawSidebar = true;
						}
						if (this.field503 == 3) {
							this.redrawChatback = true;
						}
						this.field503 = 0;
					}
				}
				if (this.objDragArea != 0) {
					this.field444++;
					if (super.mouseX > this.field583 + 5 || super.mouseX < this.field583 - 5 || super.mouseY > this.field584 + 5 || super.mouseY < this.field584 - 5) {
						this.field544 = true;
					}
					if (super.mouseButton == 0) {
						if (this.objDragArea == 2) {
							this.redrawSidebar = true;
						}
						if (this.objDragArea == 3) {
							this.redrawChatback = true;
						}
						this.objDragArea = 0;
						if (this.field544 && this.field444 >= 5) {
							this.field532 = -1;
							this.buildMinimenu();
							if (this.field532 == this.field580 && this.field531 != this.field581) {
								IfType var19 = IfType.list(this.field580);
								byte var20 = 0;
								if (this.field410 == 1 && var19.clientCode == 206) {
									var20 = 1;
								}
								if (var19.linkObjType[this.field531] <= 0) {
									var20 = 0;
								}
								if (var19.objReplace) {
									int var21 = this.field581;
									int var22 = this.field531;
									var19.linkObjType[var22] = var19.linkObjType[var21];
									var19.linkObjNumber[var22] = var19.linkObjNumber[var21];
									var19.linkObjType[var21] = -1;
									var19.linkObjNumber[var21] = 0;
								} else if (var20 == 1) {
									int var23 = this.field581;
									int var24 = this.field531;
									while (var23 != var24) {
										if (var23 > var24) {
											var19.swapSlots(var23 - 1, var23);
											var23--;
										} else if (var23 < var24) {
											var19.swapSlots(var23 + 1, var23);
											var23++;
										}
									}
								} else {
									var19.swapSlots(this.field531, this.field581);
								}
								this.out.p1enc(109);
								this.out.p1(var20);
								this.out.p2_alt2(this.field580);
								this.out.p2_alt2(this.field531);
								this.out.p2_alt1(this.field581);
							}
						} else if ((this.field182 == 1 || this.isAddFriendOption(this.menuNumEntries - 1)) && this.menuNumEntries > 2) {
							this.openMenu(543);
						} else if (this.menuNumEntries > 0) {
							this.doAction(this.menuNumEntries - 1);
						}
						this.field500 = 10;
						super.mouseClickButton = 0;
					}
				}
				if (World.field1587 != -1) {
					int var25 = World.field1587;
					int var26 = World.field1588;
					boolean var27 = this.tryMove(var25, (byte) 6, var26, 0, 0, localPlayer.routeZ[0], true, 0, localPlayer.routeX[0], 0, 0, 0);
					World.field1587 = -1;
					if (var27) {
						this.field247 = super.mouseClickX;
						this.field248 = super.mouseClickY;
						this.crossMode = 1;
						this.crossCycle = 0;
					}
				}
				if (super.mouseClickButton == 1 && this.field321 != null) {
					this.field321 = null;
					this.redrawChatback = true;
					super.mouseClickButton = 0;
				}
				this.mouseLoop();
				if (this.field631 == -1) {
					this.minimapLoop((byte) 7);
					this.iconLoop();
					this.chatModeLoop();
				}
				if (super.mouseButton == 1 || super.mouseClickButton == 1) {
					this.scrollCycle++;
				}
				if (this.field530 == 0 && this.field203 == 0 && this.field302 == 0) {
					if (this.field278 > 0) {
						this.field278--;
					}
				} else if (this.field278 < 100) {
					this.field278++;
					if (this.field278 == 100) {
						if (this.field530 != 0) {
							this.redrawChatback = true;
						}
						if (this.field203 != 0) {
							this.redrawSidebar = true;
						}
					}
				}
				if (this.sceneState == 2) {
					this.followCamera();
				}
				if (this.sceneState == 2 && this.cinemaCam) {
					this.cinemaCamera();
				}
				for (int var28 = 0; var28 < 5; var28++) {
					int var10002 = this.field400[var28]++;
				}
				this.handleInputKey();
				field269++;
				if (field269 > 153) {
					field269 = 0;
					this.out.p1enc(1);
					this.out.p2(26173);
				}
				super.idleTimer++;
				if (super.idleTimer > 4500) {
					this.logoutTimer = 250;
					super.idleTimer -= 500;
					this.out.p1enc(63);
				}
				this.field276++;
				if (this.field276 > 500) {
					this.field276 = 0;
					int var29 = (int) (Math.random() * 8.0D);
					if ((var29 & 0x1) == 1) {
						this.macroCameraX += this.field288;
					}
					if ((var29 & 0x2) == 2) {
						this.macroCameraZ += this.field575;
					}
					if ((var29 & 0x4) == 4) {
						this.macroCameraAngle += this.field617;
					}
				}
				if (this.macroCameraX < -50) {
					this.field288 = 2;
				}
				if (this.macroCameraX > 50) {
					this.field288 = -2;
				}
				if (this.macroCameraZ < -55) {
					this.field575 = 2;
				}
				if (this.macroCameraZ > 55) {
					this.field575 = -2;
				}
				if (this.macroCameraAngle < -40) {
					this.field617 = 1;
				}
				if (this.macroCameraAngle > 40) {
					this.field617 = -1;
				}
				this.field398++;
				if (this.field398 > 500) {
					this.field398 = 0;
					int var30 = (int) (Math.random() * 8.0D);
					if ((var30 & 0x1) == 1) {
						this.macroMinimapAngle += this.field324;
					}
					if ((var30 & 0x2) == 2) {
						this.macroMinimapZoom += this.field600;
					}
				}
				if (this.macroMinimapAngle < -60) {
					this.field324 = 2;
				}
				if (this.macroMinimapAngle > 60) {
					this.field324 = -2;
				}
				if (this.macroMinimapZoom < -20) {
					this.field600 = 1;
				}
				if (this.macroMinimapZoom > 10) {
					this.field600 = -1;
				}
				this.field436++;
				if (this.field436 > 50) {
					this.out.p1enc(58);
				}
				try {
					if (this.stream != null && this.out.pos > 0) {
						this.stream.write(this.out.data, this.out.pos, (byte) 1);
						this.out.pos = 0;
						this.field436 = 0;
					}
				} catch (IOException var33) {
					this.lostCon();
				} catch (Exception var34) {
					this.logout();
				}
			}
		} catch (RuntimeException var36) {
			signlink.reporterror("49448, " + 4 + ", " + var36.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.H(I)V")
	public void gameDraw() {
		try {
			if (this.field631 == -1 || this.sceneState != 2 && super.drawArea == null) {
				if (this.redrawFrame) {
					this.prepareGame(this.field261);
					this.redrawFrame = false;
					this.areaBackleft1.draw(4, super.graphics, 0);
					this.areaBackleft2.draw(357, super.graphics, 0);
					this.areaBackright1.draw(4, super.graphics, 722);
					this.areaBackright2.draw(205, super.graphics, 743);
					this.areaBacktop1.draw(0, super.graphics, 0);
					this.areaBackvmid1.draw(4, super.graphics, 516);
					this.areaBackvmid2.draw(205, super.graphics, 516);
					this.areaBackvmid3.draw(357, super.graphics, 496);
					this.areaBackhmid2.draw(338, super.graphics, 0);
					this.redrawSidebar = true;
					this.redrawChatback = true;
					this.rewdrawIcons = true;
					this.redrawChatMode = true;
					if (this.sceneState != 2) {
						this.areaGame.draw(4, super.graphics, 4);
						this.areaMap.draw(4, super.graphics, 550);
					}
					field387++;
					if (field387 > 131) {
						field387 = 0;
						this.out.p1enc(84);
						this.out.p4(0);
					}
				}
				if (this.sceneState == 2) {
					this.gameDrawMain(this.field593);
				}
				if (this.isMenuOpen && this.menuArea == 1) {
					this.redrawSidebar = true;
				}
				if (this.sideModealId != -1) {
					boolean var3 = this.animateInterface(this.sideModealId, this.worldUpdateNum);
					if (var3) {
						this.redrawSidebar = true;
					}
				}
				if (this.field503 == 2) {
					this.redrawSidebar = true;
				}
				if (this.objDragArea == 2) {
					this.redrawSidebar = true;
				}
				if (this.redrawSidebar) {
					this.drawSide();
					this.redrawSidebar = false;
				}
				if (this.chatComId == -1) {
					this.chatInterface.scrollPos = this.scrollheight - this.chatScrollPos - 77;
					if (super.mouseX > 448 && super.mouseX < 560 && super.mouseY > 332) {
						this.doScrollbar(this.chatInterface, -1, this.scrollheight, super.mouseX - 17, 463, super.mouseY - 357, 77, 0);
					}
					int var4 = this.scrollheight - this.chatInterface.scrollPos - 77;
					if (var4 < 0) {
						var4 = 0;
					}
					if (var4 > this.scrollheight - 77) {
						var4 = this.scrollheight - 77;
					}
					if (this.chatScrollPos != var4) {
						this.chatScrollPos = var4;
						this.redrawChatback = true;
					}
				}
				if (this.chatComId != -1) {
					boolean var5 = this.animateInterface(this.chatComId, this.worldUpdateNum);
					if (var5) {
						this.redrawChatback = true;
					}
				}
				if (this.field503 == 3) {
					this.redrawChatback = true;
				}
				if (this.objDragArea == 3) {
					this.redrawChatback = true;
				}
				if (this.field321 != null) {
					this.redrawChatback = true;
				}
				if (this.isMenuOpen && this.menuArea == 2) {
					this.redrawChatback = true;
				}
				if (this.redrawChatback) {
					this.drawChat();
					this.redrawChatback = false;
				}
				if (this.sceneState == 2) {
					this.minimapDraw();
					this.areaMap.draw(4, super.graphics, 550);
				}
				if (this.tutFlashIcon != -1) {
					this.rewdrawIcons = true;
				}
				if (this.rewdrawIcons) {
					if (this.tutFlashIcon != -1 && this.tutFlashIcon == this.activeIcon) {
						this.tutFlashIcon = -1;
						this.out.p1enc(225);
						this.out.p1(this.activeIcon);
					}
					this.rewdrawIcons = false;
					this.areaBackhmid1.setPixels();
					this.backhmid1.plotSprite(0, this.field527, 0);
					if (this.sideModealId == -1) {
						if (this.sideIcon[this.activeIcon] != -1) {
							if (this.activeIcon == 0) {
								this.redstone1.plotSprite(22, this.field527, 10);
							}
							if (this.activeIcon == 1) {
								this.redstone2.plotSprite(54, this.field527, 8);
							}
							if (this.activeIcon == 2) {
								this.redstone2.plotSprite(82, this.field527, 8);
							}
							if (this.activeIcon == 3) {
								this.redstone3.plotSprite(110, this.field527, 8);
							}
							if (this.activeIcon == 4) {
								this.redstone2h.plotSprite(153, this.field527, 8);
							}
							if (this.activeIcon == 5) {
								this.redstone2h.plotSprite(181, this.field527, 8);
							}
							if (this.activeIcon == 6) {
								this.restone1h.plotSprite(209, this.field527, 9);
							}
						}
						if (this.sideIcon[0] != -1 && (this.tutFlashIcon != 0 || loopCycle % 20 < 10)) {
							this.sideicons[0].plotSprite(29, this.field527, 13);
						}
						if (this.sideIcon[1] != -1 && (this.tutFlashIcon != 1 || loopCycle % 20 < 10)) {
							this.sideicons[1].plotSprite(53, this.field527, 11);
						}
						if (this.sideIcon[2] != -1 && (this.tutFlashIcon != 2 || loopCycle % 20 < 10)) {
							this.sideicons[2].plotSprite(82, this.field527, 11);
						}
						if (this.sideIcon[3] != -1 && (this.tutFlashIcon != 3 || loopCycle % 20 < 10)) {
							this.sideicons[3].plotSprite(115, this.field527, 12);
						}
						if (this.sideIcon[4] != -1 && (this.tutFlashIcon != 4 || loopCycle % 20 < 10)) {
							this.sideicons[4].plotSprite(153, this.field527, 13);
						}
						if (this.sideIcon[5] != -1 && (this.tutFlashIcon != 5 || loopCycle % 20 < 10)) {
							this.sideicons[5].plotSprite(180, this.field527, 11);
						}
						if (this.sideIcon[6] != -1 && (this.tutFlashIcon != 6 || loopCycle % 20 < 10)) {
							this.sideicons[6].plotSprite(208, this.field527, 13);
						}
					}
					this.areaBackhmid1.draw(160, super.graphics, 516);
					this.areaBackbase2.setPixels();
					this.backbase2.plotSprite(0, this.field527, 0);
					if (this.sideModealId == -1) {
						if (this.sideIcon[this.activeIcon] != -1) {
							if (this.activeIcon == 7) {
								this.redstone1v.plotSprite(42, this.field527, 0);
							}
							if (this.activeIcon == 8) {
								this.redstone2v.plotSprite(74, this.field527, 0);
							}
							if (this.activeIcon == 9) {
								this.redstone2v.plotSprite(102, this.field527, 0);
							}
							if (this.activeIcon == 10) {
								this.restone3v.plotSprite(130, this.field527, 1);
							}
							if (this.activeIcon == 11) {
								this.redstone2hv.plotSprite(173, this.field527, 0);
							}
							if (this.activeIcon == 12) {
								this.redstone2hv.plotSprite(201, this.field527, 0);
							}
							if (this.activeIcon == 13) {
								this.redstone1hv.plotSprite(229, this.field527, 0);
							}
						}
						if (this.sideIcon[8] != -1 && (this.tutFlashIcon != 8 || loopCycle % 20 < 10)) {
							this.sideicons[7].plotSprite(74, this.field527, 2);
						}
						if (this.sideIcon[9] != -1 && (this.tutFlashIcon != 9 || loopCycle % 20 < 10)) {
							this.sideicons[8].plotSprite(102, this.field527, 3);
						}
						if (this.sideIcon[10] != -1 && (this.tutFlashIcon != 10 || loopCycle % 20 < 10)) {
							this.sideicons[9].plotSprite(137, this.field527, 4);
						}
						if (this.sideIcon[11] != -1 && (this.tutFlashIcon != 11 || loopCycle % 20 < 10)) {
							this.sideicons[10].plotSprite(174, this.field527, 2);
						}
						if (this.sideIcon[12] != -1 && (this.tutFlashIcon != 12 || loopCycle % 20 < 10)) {
							this.sideicons[11].plotSprite(201, this.field527, 2);
						}
						if (this.sideIcon[13] != -1 && (this.tutFlashIcon != 13 || loopCycle % 20 < 10)) {
							this.sideicons[12].plotSprite(226, this.field527, 2);
						}
					}
					this.areaBackbase2.draw(466, super.graphics, 496);
					this.areaGame.setPixels();
					Pix3D.scanline = this.gameScanline;
				}
				if (this.redrawChatMode) {
					this.redrawChatMode = false;
					this.areaBackbase1.setPixels();
					this.backbase1.plotSprite(0, this.field527, 0);
					this.p12.centreString(55, "Public chat", 28, true, 16777215);
					if (this.chatPublicMode == 0) {
						this.p12.centreString(55, "On", 41, true, 65280);
					}
					if (this.chatPublicMode == 1) {
						this.p12.centreString(55, "Friends", 41, true, 16776960);
					}
					if (this.chatPublicMode == 2) {
						this.p12.centreString(55, "Off", 41, true, 16711680);
					}
					if (this.chatPublicMode == 3) {
						this.p12.centreString(55, "Hide", 41, true, 65535);
					}
					this.p12.centreString(184, "Private chat", 28, true, 16777215);
					if (this.chatPrivatemode == 0) {
						this.p12.centreString(184, "On", 41, true, 65280);
					}
					if (this.chatPrivatemode == 1) {
						this.p12.centreString(184, "Friends", 41, true, 16776960);
					}
					if (this.chatPrivatemode == 2) {
						this.p12.centreString(184, "Off", 41, true, 16711680);
					}
					this.p12.centreString(324, "Trade/compete", 28, true, 16777215);
					if (this.chatTradeMode == 0) {
						this.p12.centreString(324, "On", 41, true, 65280);
					}
					if (this.chatTradeMode == 1) {
						this.p12.centreString(324, "Friends", 41, true, 16776960);
					}
					if (this.chatTradeMode == 2) {
						this.p12.centreString(324, "Off", 41, true, 16711680);
					}
					this.p12.centreString(458, "Report abuse", 33, true, 16777215);
					this.areaBackbase1.draw(453, super.graphics, 0);
					this.areaGame.setPixels();
					Pix3D.scanline = this.gameScanline;
				}
				this.worldUpdateNum = 0;
			} else {
				if (this.sceneState == 2) {
					this.animateInterface(this.field631, this.worldUpdateNum);
					if (this.field275 != -1) {
						this.animateInterface(this.field275, this.worldUpdateNum);
					}
					this.worldUpdateNum = 0;
					this.prepareFullGame();
					super.drawArea.setPixels();
					Pix3D.scanline = this.field429;
					Pix2D.cls();
					this.redrawFrame = true;
					IfType var1 = IfType.list(this.field631);
					if (var1.width == 512 && var1.height == 334 && var1.type == 0) {
						var1.width = 765;
						var1.height = 503;
					}
					this.drawInterface(var1, 0, 0, 0);
					if (this.field275 != -1) {
						IfType var2 = IfType.list(this.field275);
						if (var2.width == 512 && var2.height == 334 && var2.type == 0) {
							var2.width = 765;
							var2.height = 503;
						}
						this.drawInterface(var2, 0, 0, 0);
					}
					if (this.isMenuOpen) {
						this.drawMinimenu();
					} else {
						this.buildMinimenu();
						this.drawFeedback();
					}
				}
				super.drawArea.draw(0, super.graphics, 0);
			}
		} catch (RuntimeException var7) {
			signlink.reporterror("45808, " + -45619 + ", " + var7.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.l(I)V")
	public void logout() {
		try {
			try {
				if (this.stream != null) {
					this.stream.close();
				}
			} catch (Exception var3) {
			}
			this.stream = null;
			this.ingame = false;
			this.loginscreen = 0;
			this.loginUser = "";
			this.loginPass = "";
			this.clearCaches();
			this.world.resetMap((byte) 9);
			for (int var1 = 0; var1 < 4; var1++) {
				this.collision[var1].method200();
			}
			System.gc();
			this.stopMidi(this.field263);
			this.nextMidiSong = -1;
			this.midiSong = -1;
			this.nextMidiDelay = 0;
		} catch (RuntimeException var4) {
			signlink.reporterror("10013, " + 37121 + ", " + var4.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.m(I)V")
	public void clearCaches() {
		try {
			LocType.mc1.clear();
			LocType.mc2.clear();
			NpcType.modelCache.clear();
			ObjType.modelCache.clear();
			ObjType.spriteCache.clear();
			ClientPlayer.modelCache.clear();
			SpotType.modelCache.clear();
		} catch (RuntimeException var2) {
			signlink.reporterror("76175, " + ", " + var2.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.E(I)V")
	public void lostCon() {
		try {
			if (this.logoutTimer > 0) {
				this.logout();
			} else {
				this.showPopupMessage(this.field607, "Connection lost", "Please wait - attempting to reestablish");
				this.minimapState = 0;
				this.minimapFlagX = 0;
				ClientStream var1 = this.stream;
				this.ingame = false;
				this.field598 = 0;
				this.login(this.loginUser, this.loginPass, true);
				if (!this.ingame) {
					this.logout();
				}
				try {
					var1.close();
				} catch (Exception var3) {
				}
			}
		} catch (RuntimeException var4) {
			signlink.reporterror("24858, " + 38851 + ", " + var4.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.a(II[B)Z")
	public boolean saveWave(int arg0, byte[] arg1) {
		try {
			return arg1 == null ? true : signlink.wavesave(arg1, arg0);
		} catch (RuntimeException var4) {
			signlink.reporterror("99173, " + -275 + ", " + arg0 + ", " + arg1 + ", " + var4.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.o(B)V")
	public void buildMinimenu() {
		try {
			if (this.objDragArea == 0) {
				this.menuOption[0] = "Cancel";
				this.menuAction[0] = 1921;
				this.menuNumEntries = 1;
				if (this.field631 == -1) {
					this.addPrivateChatOptions();
					this.field524 = 0;
					this.field394 = 0;
					if (super.mouseX > 4 && super.mouseY > 4 && super.mouseX < 516 && super.mouseY < 338) {
						if (this.mainModalId == -1) {
							this.addWorldOptions();
						} else {
							this.addComponentOptions(0, IfType.list(this.mainModalId), 0, super.mouseY, super.mouseX, 4, 4);
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
					if (super.mouseX > 553 && super.mouseY > 205 && super.mouseX < 743 && super.mouseY < 466) {
						if (this.sideModealId != -1) {
							this.addComponentOptions(0, IfType.list(this.sideModealId), 1, super.mouseY, super.mouseX, 205, 553);
						} else if (this.sideIcon[this.activeIcon] != -1) {
							this.addComponentOptions(0, IfType.list(this.sideIcon[this.activeIcon]), 1, super.mouseY, super.mouseX, 205, 553);
						}
					}
					if (this.field524 != this.field255) {
						this.redrawSidebar = true;
						this.field255 = this.field524;
					}
					if (this.field394 != this.field203) {
						this.redrawSidebar = true;
						this.field203 = this.field394;
					}
					this.field524 = 0;
					this.field394 = 0;
					if (super.mouseX > 17 && super.mouseY > 357 && super.mouseX < 496 && super.mouseY < 453) {
						if (this.chatComId != -1) {
							this.addComponentOptions(0, IfType.list(this.chatComId), 2, super.mouseY, super.mouseX, 357, 17);
						} else if (this.field629 != -1) {
							this.addComponentOptions(0, IfType.list(this.field629), 3, super.mouseY, super.mouseX, 357, 17);
						} else if (super.mouseY < 434 && super.mouseX < 426) {
							this.addChatOptions(super.mouseY - 357, super.mouseX - 17);
						}
					}
					if ((this.chatComId != -1 || this.field629 != -1) && this.field524 != this.field271) {
						this.redrawChatback = true;
						this.field271 = this.field524;
					}
					if ((this.chatComId != -1 || this.field629 != -1) && this.field394 != this.field530) {
						this.redrawChatback = true;
						this.field530 = this.field394;
					}
					boolean var1 = false;
					while (!var1) {
						var1 = true;
						for (int var2 = 0; var2 < this.menuNumEntries - 1; var2++) {
							if (this.menuAction[var2] < 1000 && this.menuAction[var2 + 1] > 1000) {
								String var3 = this.menuOption[var2];
								this.menuOption[var2] = this.menuOption[var2 + 1];
								this.menuOption[var2 + 1] = var3;
								int var4 = this.menuAction[var2];
								this.menuAction[var2] = this.menuAction[var2 + 1];
								this.menuAction[var2 + 1] = var4;
								int var5 = this.menuParamB[var2];
								this.menuParamB[var2] = this.menuParamB[var2 + 1];
								this.menuParamB[var2 + 1] = var5;
								int var6 = this.menuParamC[var2];
								this.menuParamC[var2] = this.menuParamC[var2 + 1];
								this.menuParamC[var2 + 1] = var6;
								int var7 = this.menuParamA[var2];
								this.menuParamA[var2] = this.menuParamA[var2 + 1];
								this.menuParamA[var2 + 1] = var7;
								var1 = false;
							}
						}
					}
				} else {
					this.field524 = 0;
					this.field394 = 0;
					this.addComponentOptions(0, IfType.list(this.field631), 0, super.mouseY, super.mouseX, 0, 0);
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

	@ObfuscatedName("client.b(Z)V")
	public void addPrivateChatOptions() {
		try {
			if (this.splitPrivateChat != 0) {
				int var1 = 0;
				if (this.rebootTimer != 0) {
					var1 = 1;
				}
				for (int var2 = 0; var2 < 100; var2++) {
					if (this.chatText[var2] != null) {
						int var3 = this.chatType[var2];
						String var4 = this.chatusername[var2];
						if (var4 != null && var4.startsWith("@cr1@")) {
							var4 = var4.substring(5);
						}
						if (var4 != null && var4.startsWith("@cr2@")) {
							var4 = var4.substring(5);
						}
						if ((var3 == 3 || var3 == 7) && (var3 == 7 || this.chatPrivatemode == 0 || this.chatPrivatemode == 1 && this.isFriend(var4))) {
							int var5 = 329 - var1 * 13;
							if (super.mouseX > 4 && super.mouseY - 4 > var5 - 10 && super.mouseY - 4 <= var5 + 3) {
								int var6 = this.p12.stringWidTag("From:  " + var4 + this.chatText[var2]) + 25;
								if (var6 > 450) {
									var6 = 450;
								}
								if (super.mouseX < var6 + 4) {
									if (this.staffmodLevel >= 1) {
										this.menuOption[this.menuNumEntries] = "Report abuse @whi@" + var4;
										this.menuAction[this.menuNumEntries] = 2787;
										this.menuNumEntries++;
									}
									this.menuOption[this.menuNumEntries] = "Add ignore @whi@" + var4;
									this.menuAction[this.menuNumEntries] = 2379;
									this.menuNumEntries++;
									this.menuOption[this.menuNumEntries] = "Add friend @whi@" + var4;
									this.menuAction[this.menuNumEntries] = 2696;
									this.menuNumEntries++;
								}
							}
							var1++;
							if (var1 >= 5) {
								return;
							}
						}
						if ((var3 == 5 || var3 == 6) && this.chatPrivatemode < 2) {
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

	@ObfuscatedName("client.b(III)V")
	public void addChatOptions(int arg0, int arg1) {
		try {
			int var3 = 0;
			for (int var4 = 0; var4 < 100; var4++) {
				if (this.chatText[var4] != null) {
					int var5 = this.chatType[var4];
					int var6 = this.chatScrollPos + 70 + 4 - var3 * 14;
					if (var6 < -20) {
						break;
					}
					String var7 = this.chatusername[var4];
					if (var7 != null && var7.startsWith("@cr1@")) {
						var7 = var7.substring(5);
					}
					if (var7 != null && var7.startsWith("@cr2@")) {
						var7 = var7.substring(5);
					}
					if (var5 == 0) {
						var3++;
					}
					if ((var5 == 1 || var5 == 2) && (var5 == 1 || this.chatPublicMode == 0 || this.chatPublicMode == 1 && this.isFriend(var7))) {
						if (arg0 > var6 - 14 && arg0 <= var6 && !var7.equals(localPlayer.name)) {
							if (this.staffmodLevel >= 1) {
								this.menuOption[this.menuNumEntries] = "Report abuse @whi@" + var7;
								this.menuAction[this.menuNumEntries] = 787;
								this.menuNumEntries++;
							}
							this.menuOption[this.menuNumEntries] = "Add ignore @whi@" + var7;
							this.menuAction[this.menuNumEntries] = 379;
							this.menuNumEntries++;
							this.menuOption[this.menuNumEntries] = "Add friend @whi@" + var7;
							this.menuAction[this.menuNumEntries] = 696;
							this.menuNumEntries++;
						}
						var3++;
					}
					if ((var5 == 3 || var5 == 7) && this.splitPrivateChat == 0 && (var5 == 7 || this.chatPrivatemode == 0 || this.chatPrivatemode == 1 && this.isFriend(var7))) {
						if (arg0 > var6 - 14 && arg0 <= var6) {
							if (this.staffmodLevel >= 1) {
								this.menuOption[this.menuNumEntries] = "Report abuse @whi@" + var7;
								this.menuAction[this.menuNumEntries] = 787;
								this.menuNumEntries++;
							}
							this.menuOption[this.menuNumEntries] = "Add ignore @whi@" + var7;
							this.menuAction[this.menuNumEntries] = 379;
							this.menuNumEntries++;
							this.menuOption[this.menuNumEntries] = "Add friend @whi@" + var7;
							this.menuAction[this.menuNumEntries] = 696;
							this.menuNumEntries++;
						}
						var3++;
					}
					if (var5 == 4 && (this.chatTradeMode == 0 || this.chatTradeMode == 1 && this.isFriend(var7))) {
						if (arg0 > var6 - 14 && arg0 <= var6) {
							this.menuOption[this.menuNumEntries] = "Accept trade @whi@" + var7;
							this.menuAction[this.menuNumEntries] = 940;
							this.menuNumEntries++;
						}
						var3++;
					}
					if ((var5 == 5 || var5 == 6) && this.splitPrivateChat == 0 && this.chatPrivatemode < 2) {
						var3++;
					}
					if (var5 == 8 && (this.chatTradeMode == 0 || this.chatTradeMode == 1 && this.isFriend(var7))) {
						if (arg0 > var6 - 14 && arg0 <= var6) {
							this.menuOption[this.menuNumEntries] = "Accept challenge @whi@" + var7;
							this.menuAction[this.menuNumEntries] = 113;
							this.menuNumEntries++;
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

	@ObfuscatedName("client.f(B)V")
	public void minimapLoop(byte arg0) {
		try {
			boolean var16 = false;
			if (this.minimapState == 0 && super.mouseClickButton == 1) {
				int var2 = super.mouseClickX - 25 - 550;
				int var3 = super.mouseClickY - 5 - 4;
				if (var2 >= 0 && var3 >= 0 && var2 < 146 && var3 < 151) {
					var2 -= 73;
					var3 -= 75;
					int var4 = this.orbitCameraYaw + this.macroMinimapAngle & 0x7FF;
					int var5 = Pix3D.sinTable[var4];
					int var6 = Pix3D.cosTable[var4];
					int var7 = var5 * (this.macroMinimapZoom + 256) >> 8;
					int var8 = var6 * (this.macroMinimapZoom + 256) >> 8;
					int var9 = var3 * var7 + var2 * var8 >> 11;
					int var10 = var3 * var8 - var2 * var7 >> 11;
					int var11 = localPlayer.x + var9 >> 7;
					int var12 = localPlayer.z - var10 >> 7;
					boolean var13 = this.tryMove(var11, (byte) 6, var12, 1, 0, localPlayer.routeZ[0], true, 0, localPlayer.routeX[0], 0, 0, 0);
					if (var13) {
						this.out.p1(var2);
						this.out.p1(var3);
						this.out.p2(this.orbitCameraYaw);
						this.out.p1(57);
						this.out.p1(this.macroMinimapAngle);
						this.out.p1(this.macroMinimapZoom);
						this.out.p1(89);
						this.out.p2(localPlayer.x);
						this.out.p2(localPlayer.z);
						this.out.p1(this.field414);
						this.out.p1(63);
						return;
					}
				}
			}
		} catch (RuntimeException var15) {
			signlink.reporterror("11851, " + arg0 + ", " + var15.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.T(I)V")
	public void iconLoop() {
		try {
			if (super.mouseClickButton == 1) {
				if (super.mouseClickX >= 539 && super.mouseClickX <= 573 && super.mouseClickY >= 169 && super.mouseClickY < 205 && this.sideIcon[0] != -1) {
					this.redrawSidebar = true;
					this.activeIcon = 0;
					this.rewdrawIcons = true;
				}
				if (super.mouseClickX >= 569 && super.mouseClickX <= 599 && super.mouseClickY >= 168 && super.mouseClickY < 205 && this.sideIcon[1] != -1) {
					this.redrawSidebar = true;
					this.activeIcon = 1;
					this.rewdrawIcons = true;
				}
				if (super.mouseClickX >= 597 && super.mouseClickX <= 627 && super.mouseClickY >= 168 && super.mouseClickY < 205 && this.sideIcon[2] != -1) {
					this.redrawSidebar = true;
					this.activeIcon = 2;
					this.rewdrawIcons = true;
				}
				if (super.mouseClickX >= 625 && super.mouseClickX <= 669 && super.mouseClickY >= 168 && super.mouseClickY < 203 && this.sideIcon[3] != -1) {
					this.redrawSidebar = true;
					this.activeIcon = 3;
					this.rewdrawIcons = true;
				}
				if (super.mouseClickX >= 666 && super.mouseClickX <= 696 && super.mouseClickY >= 168 && super.mouseClickY < 205 && this.sideIcon[4] != -1) {
					this.redrawSidebar = true;
					this.activeIcon = 4;
					this.rewdrawIcons = true;
				}
				if (super.mouseClickX >= 694 && super.mouseClickX <= 724 && super.mouseClickY >= 168 && super.mouseClickY < 205 && this.sideIcon[5] != -1) {
					this.redrawSidebar = true;
					this.activeIcon = 5;
					this.rewdrawIcons = true;
				}
				if (super.mouseClickX >= 722 && super.mouseClickX <= 756 && super.mouseClickY >= 169 && super.mouseClickY < 205 && this.sideIcon[6] != -1) {
					this.redrawSidebar = true;
					this.activeIcon = 6;
					this.rewdrawIcons = true;
				}
				if (super.mouseClickX >= 540 && super.mouseClickX <= 574 && super.mouseClickY >= 466 && super.mouseClickY < 502 && this.sideIcon[7] != -1) {
					this.redrawSidebar = true;
					this.activeIcon = 7;
					this.rewdrawIcons = true;
				}
				if (super.mouseClickX >= 572 && super.mouseClickX <= 602 && super.mouseClickY >= 466 && super.mouseClickY < 503 && this.sideIcon[8] != -1) {
					this.redrawSidebar = true;
					this.activeIcon = 8;
					this.rewdrawIcons = true;
				}
				if (super.mouseClickX >= 599 && super.mouseClickX <= 629 && super.mouseClickY >= 466 && super.mouseClickY < 503 && this.sideIcon[9] != -1) {
					this.redrawSidebar = true;
					this.activeIcon = 9;
					this.rewdrawIcons = true;
				}
				if (super.mouseClickX >= 627 && super.mouseClickX <= 671 && super.mouseClickY >= 467 && super.mouseClickY < 502 && this.sideIcon[10] != -1) {
					this.redrawSidebar = true;
					this.activeIcon = 10;
					this.rewdrawIcons = true;
				}
				if (super.mouseClickX >= 669 && super.mouseClickX <= 699 && super.mouseClickY >= 466 && super.mouseClickY < 503 && this.sideIcon[11] != -1) {
					this.redrawSidebar = true;
					this.activeIcon = 11;
					this.rewdrawIcons = true;
				}
				if (super.mouseClickX >= 696 && super.mouseClickX <= 726 && super.mouseClickY >= 466 && super.mouseClickY < 503 && this.sideIcon[12] != -1) {
					this.redrawSidebar = true;
					this.activeIcon = 12;
					this.rewdrawIcons = true;
				}
				if (super.mouseClickX >= 724 && super.mouseClickX <= 758 && super.mouseClickY >= 466 && super.mouseClickY < 502 && this.sideIcon[13] != -1) {
					this.redrawSidebar = true;
					this.activeIcon = 13;
					this.rewdrawIcons = true;
					return;
				}
			}
		} catch (RuntimeException var2) {
			signlink.reporterror("82831, " + 8 + ", " + var2.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.q(B)V")
	public void chatModeLoop() {
		try {
			if (super.mouseClickButton == 1) {
				if (super.mouseClickX >= 6 && super.mouseClickX <= 106 && super.mouseClickY >= 467 && super.mouseClickY <= 499) {
					this.chatPublicMode = (this.chatPublicMode + 1) % 4;
					this.redrawChatMode = true;
					this.redrawChatback = true;
					this.out.p1enc(124);
					this.out.p1(this.chatPublicMode);
					this.out.p1(this.chatPrivatemode);
					this.out.p1(this.chatTradeMode);
				}
				if (super.mouseClickX >= 135 && super.mouseClickX <= 235 && super.mouseClickY >= 467 && super.mouseClickY <= 499) {
					this.chatPrivatemode = (this.chatPrivatemode + 1) % 3;
					this.redrawChatMode = true;
					this.redrawChatback = true;
					this.out.p1enc(124);
					this.out.p1(this.chatPublicMode);
					this.out.p1(this.chatPrivatemode);
					this.out.p1(this.chatTradeMode);
				}
				if (super.mouseClickX >= 273 && super.mouseClickX <= 373 && super.mouseClickY >= 467 && super.mouseClickY <= 499) {
					this.chatTradeMode = (this.chatTradeMode + 1) % 3;
					this.redrawChatMode = true;
					this.redrawChatback = true;
					this.out.p1enc(124);
					this.out.p1(this.chatPublicMode);
					this.out.p1(this.chatPrivatemode);
					this.out.p1(this.chatTradeMode);
				}
				if (super.mouseClickX >= 412 && super.mouseClickX <= 512 && super.mouseClickY >= 467 && super.mouseClickY <= 499) {
					if (this.mainModalId == -1) {
						this.closeModal();
						this.reportAbuseInput = "";
						this.reportAbuseMuteOption = false;
						this.reportAbuseComId = this.mainModalId = IfType.errrrrIdk;
						return;
					}
					this.addChat(0, "Please close the interface you have open before using 'report abuse'", "");
					return;
				}
			}
		} catch (RuntimeException var2) {
			signlink.reporterror("31529, " + 9 + ", " + var2.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.l(B)V")
	public void timeoutChat(byte arg0) {
		try {
			for (int var2 = -1; var2 < this.playerCount; var2++) {
				int var3;
				if (var2 == -1) {
					var3 = this.LOCAL_PLAYER_INDEX;
				} else {
					var3 = this.playerIds[var2];
				}
				ClientPlayer var4 = this.players[var3];
				if (var4 != null && var4.chatTimer > 0) {
					var4.chatTimer--;
					if (var4.chatTimer == 0) {
						var4.chatMessage = null;
					}
				}
			}
			if (arg0 != 4) {
				this.field270 = !this.field270;
			}
			for (int var5 = 0; var5 < this.npcCount; var5++) {
				int var6 = this.npcIds[var5];
				ClientNpc var7 = this.npc[var6];
				if (var7 != null && var7.chatTimer > 0) {
					var7.chatTimer--;
					if (var7.chatTimer == 0) {
						var7.chatMessage = null;
					}
				}
			}
		} catch (RuntimeException var9) {
			signlink.reporterror("78609, " + arg0 + ", " + var9.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.m(B)V")
	public void handleInputKey() {
		try {
			while (true) {
				int var1 = this.pollKey();
				if (var1 == -1) {
					return;
				}
				if (this.mainModalId != -1 && this.mainModalId == this.reportAbuseComId) {
					if (var1 == 8 && this.reportAbuseInput.length() > 0) {
						this.reportAbuseInput = this.reportAbuseInput.substring(0, this.reportAbuseInput.length() - 1);
					}
					if ((var1 >= 97 && var1 <= 122 || var1 >= 65 && var1 <= 90 || var1 >= 48 && var1 <= 57 || var1 == 32) && this.reportAbuseInput.length() < 12) {
						this.reportAbuseInput = this.reportAbuseInput + (char) var1;
					}
				} else if (this.socialInputOpen) {
					if (var1 >= 32 && var1 <= 122 && this.socialInput.length() < 80) {
						this.socialInput = this.socialInput + (char) var1;
						this.redrawChatback = true;
					}
					if (var1 == 8 && this.socialInput.length() > 0) {
						this.socialInput = this.socialInput.substring(0, this.socialInput.length() - 1);
						this.redrawChatback = true;
					}
					if (var1 == 13 || var1 == 10) {
						this.socialInputOpen = false;
						this.redrawChatback = true;
						if (this.socialInputType == 1) {
							long var2 = JString.toUserhash(this.socialInput);
							this.addFriend(var2);
						}
						if (this.socialInputType == 2 && this.friendCount > 0) {
							long var4 = JString.toUserhash(this.socialInput);
							this.delFriend(var4);
						}
						if (this.socialInputType == 3 && this.socialInput.length() > 0) {
							this.out.p1enc(168);
							this.out.p1(0);
							int var6 = this.out.pos;
							this.out.p8(this.field193);
							WordPack.pack(this.out, this.socialInput);
							this.out.psize1(this.out.pos - var6, this.field241);
							this.socialInput = WordPack.method398(this.field552, this.socialInput);
							this.socialInput = WordFilter.method486(this.field552, this.socialInput);
							this.addChat(6, this.socialInput, JString.toSentenceCase(JString.toRawUsername(this.field193)));
							if (this.chatPrivatemode == 2) {
								this.chatPrivatemode = 1;
								this.redrawChatMode = true;
								this.out.p1enc(124);
								this.out.p1(this.chatPublicMode);
								this.out.p1(this.chatPrivatemode);
								this.out.p1(this.chatTradeMode);
							}
						}
						if (this.socialInputType == 4 && this.ignoreCount < 100) {
							long var7 = JString.toUserhash(this.socialInput);
							this.addIgnore(var7);
						}
						if (this.socialInputType == 5 && this.ignoreCount > 0) {
							long var9 = JString.toUserhash(this.socialInput);
							this.delIgnore(var9, this.field557);
						}
					}
				} else if (this.dialogueInputOpen == 1) {
					if (var1 >= 48 && var1 <= 57 && this.field195.length() < 10) {
						this.field195 = this.field195 + (char) var1;
						this.redrawChatback = true;
					}
					if (var1 == 8 && this.field195.length() > 0) {
						this.field195 = this.field195.substring(0, this.field195.length() - 1);
						this.redrawChatback = true;
					}
					if (var1 == 13 || var1 == 10) {
						if (this.field195.length() > 0) {
							int var11 = 0;
							try {
								var11 = Integer.parseInt(this.field195);
							} catch (Exception var22) {
							}
							this.out.p1enc(86);
							this.out.p4(var11);
						}
						this.dialogueInputOpen = 0;
						this.redrawChatback = true;
					}
				} else if (this.dialogueInputOpen == 2) {
					if (var1 >= 32 && var1 <= 122 && this.field195.length() < 12) {
						this.field195 = this.field195 + (char) var1;
						this.redrawChatback = true;
					}
					if (var1 == 8 && this.field195.length() > 0) {
						this.field195 = this.field195.substring(0, this.field195.length() - 1);
						this.redrawChatback = true;
					}
					if (var1 == 13 || var1 == 10) {
						if (this.field195.length() > 0) {
							this.out.p1enc(200);
							this.out.p8(JString.toUserhash(this.field195));
						}
						this.dialogueInputOpen = 0;
						this.redrawChatback = true;
					}
				} else if (this.chatComId == -1 && this.field631 == -1) {
					if (var1 >= 32 && var1 <= 122 && this.chatInput.length() < 80) {
						this.chatInput = this.chatInput + (char) var1;
						this.redrawChatback = true;
					}
					if (var1 == 8 && this.chatInput.length() > 0) {
						this.chatInput = this.chatInput.substring(0, this.chatInput.length() - 1);
						this.redrawChatback = true;
					}
					if ((var1 == 13 || var1 == 10) && this.chatInput.length() > 0) {
						if (this.staffmodLevel == 2) {
							if (this.chatInput.equals("::clientdrop")) {
								this.lostCon();
							}
							if (this.chatInput.equals("::lag")) {
								this.lag();
							}
							if (this.chatInput.equals("::prefetchmusic")) {
								for (int var12 = 0; var12 < this.onDemand.getFileCount(2); var12++) {
									this.onDemand.prefetchPriority(var12, 2, (byte) 1);
								}
							}
							if (this.chatInput.equals("::fpson")) {
								field514 = true;
							}
							if (this.chatInput.equals("::fpsoff")) {
								field514 = false;
							}
							if (this.chatInput.equals("::noclip")) {
								for (int var13 = 0; var13 < 4; var13++) {
									for (int var14 = 1; var14 < 103; var14++) {
										for (int var15 = 1; var15 < 103; var15++) {
											this.collision[var13].flags[var14][var15] = 0;
										}
									}
								}
							}
						}
						if (this.chatInput.startsWith("::")) {
							this.out.p1enc(230);
							this.out.p1(this.chatInput.length() - 1);
							this.out.pjstr(this.chatInput.substring(2));
						} else {
							String var16 = this.chatInput.toLowerCase();
							byte var17 = 0;
							if (var16.startsWith("yellow:")) {
								var17 = 0;
								this.chatInput = this.chatInput.substring(7);
							} else if (var16.startsWith("red:")) {
								var17 = 1;
								this.chatInput = this.chatInput.substring(4);
							} else if (var16.startsWith("green:")) {
								var17 = 2;
								this.chatInput = this.chatInput.substring(6);
							} else if (var16.startsWith("cyan:")) {
								var17 = 3;
								this.chatInput = this.chatInput.substring(5);
							} else if (var16.startsWith("purple:")) {
								var17 = 4;
								this.chatInput = this.chatInput.substring(7);
							} else if (var16.startsWith("white:")) {
								var17 = 5;
								this.chatInput = this.chatInput.substring(6);
							} else if (var16.startsWith("flash1:")) {
								var17 = 6;
								this.chatInput = this.chatInput.substring(7);
							} else if (var16.startsWith("flash2:")) {
								var17 = 7;
								this.chatInput = this.chatInput.substring(7);
							} else if (var16.startsWith("flash3:")) {
								var17 = 8;
								this.chatInput = this.chatInput.substring(7);
							} else if (var16.startsWith("glow1:")) {
								var17 = 9;
								this.chatInput = this.chatInput.substring(6);
							} else if (var16.startsWith("glow2:")) {
								var17 = 10;
								this.chatInput = this.chatInput.substring(6);
							} else if (var16.startsWith("glow3:")) {
								var17 = 11;
								this.chatInput = this.chatInput.substring(6);
							}
							String var18 = this.chatInput.toLowerCase();
							byte var19 = 0;
							if (var18.startsWith("wave:")) {
								var19 = 1;
								this.chatInput = this.chatInput.substring(5);
							} else if (var18.startsWith("wave2:")) {
								var19 = 2;
								this.chatInput = this.chatInput.substring(6);
							} else if (var18.startsWith("shake:")) {
								var19 = 3;
								this.chatInput = this.chatInput.substring(6);
							} else if (var18.startsWith("scroll:")) {
								var19 = 4;
								this.chatInput = this.chatInput.substring(7);
							} else if (var18.startsWith("slide:")) {
								var19 = 5;
								this.chatInput = this.chatInput.substring(6);
							}
							this.out.p1enc(169);
							this.out.p1(0);
							int var20 = this.out.pos;
							this.field230.pos = 0;
							WordPack.pack(this.field230, this.chatInput);
							this.out.gdata_alt1(this.field230.data, this.field230.pos);
							this.out.p1_alt3(var19);
							this.out.p1(var17);
							this.out.psize1(this.out.pos - var20, this.field241);
							this.chatInput = WordPack.method398(this.field552, this.chatInput);
							this.chatInput = WordFilter.method486(this.field552, this.chatInput);
							localPlayer.chatMessage = this.chatInput;
							localPlayer.chatColour = var17;
							localPlayer.chatEffect = var19;
							localPlayer.chatTimer = 150;
							if (this.staffmodLevel == 2) {
								this.addChat(2, localPlayer.chatMessage, "@cr2@" + localPlayer.name);
							} else if (this.staffmodLevel == 1) {
								this.addChat(2, localPlayer.chatMessage, "@cr1@" + localPlayer.name);
							} else {
								this.addChat(2, localPlayer.chatMessage, localPlayer.name);
							}
							if (this.chatPublicMode == 2) {
								this.chatPublicMode = 3;
								this.redrawChatMode = true;
								this.out.p1enc(124);
								this.out.p1(this.chatPublicMode);
								this.out.p1(this.chatPrivatemode);
								this.out.p1(this.chatTradeMode);
							}
						}
						this.chatInput = "";
						this.redrawChatback = true;
					}
				}
			}
		} catch (RuntimeException var23) {
			signlink.reporterror("49054, " + 8 + ", " + var23.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.d(B)V")
	public void lag() {
		try {
			System.out.println("============");
			System.out.println("flame-cycle:" + this.field226);
			if (this.onDemand != null) {
				System.out.println("Od-cycle:" + this.onDemand.field1638);
			}
			System.out.println("loop-cycle:" + loopCycle);
			System.out.println("draw-cycle:" + field505);
			System.out.println("ptype:" + this.ptype);
			System.out.println("psize:" + this.psize);
			if (this.stream != null) {
				this.stream.debug();
			}
			super.debug = true;
		} catch (RuntimeException var2) {
			signlink.reporterror("42651, " + -34 + ", " + var2.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.u(I)V")
	public void followCamera() {
		try {
			try {
				int var1 = localPlayer.x + this.macroCameraX;
				int var2 = localPlayer.z + this.macroCameraZ;
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
				if (super.keyHeld[1] == 1) {
					this.field634 += (-this.field634 - 24) / 2;
				} else if (super.keyHeld[2] == 1) {
					this.field634 += (24 - this.field634) / 2;
				} else {
					this.field634 /= 2;
				}
				if (super.keyHeld[3] == 1) {
					this.field635 += (12 - this.field635) / 2;
				} else if (super.keyHeld[4] == 1) {
					this.field635 += (-this.field635 - 12) / 2;
				} else {
					this.field635 /= 2;
				}
				this.orbitCameraYaw = this.orbitCameraYaw + this.field634 / 2 & 0x7FF;
				this.orbitCameraPitch += this.field635 / 2;
				if (this.orbitCameraPitch < 128) {
					this.orbitCameraPitch = 128;
				}
				if (this.orbitCameraPitch > 383) {
					this.orbitCameraPitch = 383;
				}
				int var3 = this.field480 >> 7;
				int var4 = this.field481 >> 7;
				int var5 = this.getAvH(this.field480, this.field481, this.minusedlevel);
				int var6 = 0;
				if (var3 > 3 && var4 > 3 && var3 < 100 && var4 < 100) {
					for (int var7 = var3 - 4; var7 <= var3 + 4; var7++) {
						for (int var8 = var4 - 4; var8 <= var4 + 4; var8++) {
							int var9 = this.minusedlevel;
							if (var9 < 3 && (this.mapl[1][var7][var8] & 0x2) == 2) {
								var9++;
							}
							int var10 = var5 - this.groundh[var9][var7][var8];
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
				if (var11 > this.cameraPitchClamp) {
					this.cameraPitchClamp += (var11 - this.cameraPitchClamp) / 24;
				} else if (var11 < this.cameraPitchClamp) {
					this.cameraPitchClamp += (var11 - this.cameraPitchClamp) / 80;
				}
			} catch (Exception var13) {
				signlink.reporterror("glfc_ex " + localPlayer.x + "," + localPlayer.z + "," + this.field480 + "," + this.field481 + "," + this.centerZoneX + "," + this.centerZoneZ + "," + this.mapBuildBaseX + "," + this.mapBuildBaseZ);
				throw new RuntimeException("eek");
			}
		} catch (RuntimeException var14) {
			signlink.reporterror("53989, " + ", " + var14.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.n(B)V")
	public void cinemaCamera() {
		try {
			int var1 = this.camMoveToLx * 128 + 64;
			int var2 = this.camMoveToLz * 128 + 64;
			int var3 = this.getAvH(var1, var2, this.minusedlevel) - this.field369;
			if (this.camX < var1) {
				this.camX += this.camMoveToRate + (var1 - this.camX) * this.camMoveToRate2 / 1000;
				if (this.camX > var1) {
					this.camX = var1;
				}
			}
			if (this.camX > var1) {
				this.camX -= this.camMoveToRate + (this.camX - var1) * this.camMoveToRate2 / 1000;
				if (this.camX < var1) {
					this.camX = var1;
				}
			}
			if (this.camY < var3) {
				this.camY += this.camMoveToRate + (var3 - this.camY) * this.camMoveToRate2 / 1000;
				if (this.camY > var3) {
					this.camY = var3;
				}
			}
			if (this.camY > var3) {
				this.camY -= this.camMoveToRate + (this.camY - var3) * this.camMoveToRate2 / 1000;
				if (this.camY < var3) {
					this.camY = var3;
				}
			}
			if (this.camZ < var2) {
				this.camZ += this.camMoveToRate + (var2 - this.camZ) * this.camMoveToRate2 / 1000;
				if (this.camZ > var2) {
					this.camZ = var2;
				}
			}
			if (this.camZ > var2) {
				this.camZ -= this.camMoveToRate + (this.camZ - var2) * this.camMoveToRate2 / 1000;
				if (this.camZ < var2) {
					this.camZ = var2;
				}
			}
			int var4 = this.camLookAtLx * 128 + 64;
			int var5 = this.camLookAtLz * 128 + 64;
			int var6 = this.getAvH(var4, var5, this.minusedlevel) - this.camLookAtHei;
			int var7 = var4 - this.camX;
			int var8 = var6 - this.camY;
			int var9 = var5 - this.camZ;
			int var10 = (int) Math.sqrt((double) (var7 * var7 + var9 * var9));
			int var11 = (int) (Math.atan2((double) var8, (double) var10) * 325.949D) & 0x7FF;
			int var12 = (int) (Math.atan2((double) var7, (double) var9) * -325.949D) & 0x7FF;
			if (var11 < 128) {
				var11 = 128;
			}
			if (var11 > 383) {
				var11 = 383;
			}
			if (this.camPitch < var11) {
				this.camPitch += this.CamLookAtRate + (var11 - this.camPitch) * this.camLookAtRate2 / 1000;
				if (this.camPitch > var11) {
					this.camPitch = var11;
				}
			}
			if (this.camPitch > var11) {
				this.camPitch -= this.CamLookAtRate + (this.camPitch - var11) * this.camLookAtRate2 / 1000;
				if (this.camPitch < var11) {
					this.camPitch = var11;
				}
			}
			int var13 = var12 - this.camYaw;
			if (var13 > 1024) {
				var13 -= 2048;
			}
			if (var13 < -1024) {
				var13 += 2048;
			}
			if (var13 > 0) {
				this.camYaw += this.CamLookAtRate + var13 * this.camLookAtRate2 / 1000;
				this.camYaw &= 0x7FF;
			}
			if (var13 < 0) {
				this.camYaw -= this.CamLookAtRate + -var13 * this.camLookAtRate2 / 1000;
				this.camYaw &= 0x7FF;
			}
			int var14 = var12 - this.camYaw;
			if (var14 > 1024) {
				var14 -= 2048;
			}
			if (var14 < -1024) {
				var14 += 2048;
			}
			if (var14 < 0 && var13 > 0 || var14 > 0 && var13 < 0) {
				this.camYaw = var12;
			}
		} catch (RuntimeException var16) {
			signlink.reporterror("29019, " + 8 + ", " + var16.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.h(B)V")
	public void soundsDoQueue() {
		try {
			for (int var1 = 0; var1 < this.waveCount; var1++) {
				if (this.waveDelay[var1] <= 0) {
					boolean var2 = false;
					try {
						if (this.waveIds[var1] != this.lastWaveId || this.waveLoops[var1] != this.lastWaveLoops) {
							Packet var3 = JagFX.generate(this.waveLoops[var1], this.waveIds[var1]);
							if (System.currentTimeMillis() + (long) (var3.pos / 22) > this.lastWaveStartTime + (long) (this.lastWaveLength / 22)) {
								this.lastWaveLength = var3.pos;
								this.lastWaveStartTime = System.currentTimeMillis();
								if (this.saveWave(var3.pos, var3.data)) {
									this.lastWaveId = this.waveIds[var1];
									this.lastWaveLoops = this.waveLoops[var1];
								} else {
									var2 = true;
								}
							}
						} else if (!this.replayWave()) {
							var2 = true;
						}
					} catch (Exception var7) {
					}
					if (var2 && this.waveDelay[var1] != -5) {
						this.waveDelay[var1] = -5;
					} else {
						this.waveCount--;
						for (int var5 = var1; var5 < this.waveCount; var5++) {
							this.waveIds[var5] = this.waveIds[var5 + 1];
							this.waveLoops[var5] = this.waveLoops[var5 + 1];
							this.waveDelay[var5] = this.waveDelay[var5 + 1];
						}
						var1--;
					}
				} else {
					int var10002 = this.waveDelay[var1]--;
				}
			}
			if (this.nextMidiDelay > 0) {
				this.nextMidiDelay -= 20;
				if (this.nextMidiDelay < 0) {
					this.nextMidiDelay = 0;
				}
				if (this.nextMidiDelay == 0 && this.field379 && !lowMem) {
					this.midiSong = this.nextMidiSong;
					this.midiFading = true;
					this.onDemand.request(2, this.midiSong);
					return;
				}
			}
		} catch (RuntimeException var8) {
			signlink.reporterror("67142, " + 8 + ", " + var8.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.y(I)V")
	public void movePlayers() {
		try {
			for (int var1 = -1; var1 < this.playerCount; var1++) {
				int var2;
				if (var1 == -1) {
					var2 = this.LOCAL_PLAYER_INDEX;
				} else {
					var2 = this.playerIds[var1];
				}
				ClientPlayer var3 = this.players[var2];
				if (var3 != null) {
					this.moveEntity(var3, 1);
				}
			}
		} catch (RuntimeException var5) {
			signlink.reporterror("70999, " + 3 + ", " + var5.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.k(B)V")
	public void moveNpcs() {
		try {
			field573++;
			if (field573 > 179) {
				field573 = 0;
				this.out.p1enc(193);
				this.out.p4(0);
			}
			for (int var1 = 0; var1 < this.npcCount; var1++) {
				int var2 = this.npcIds[var1];
				ClientNpc var3 = this.npc[var2];
				if (var3 != null) {
					this.moveEntity(var3, var3.type.size);
				}
			}
		} catch (RuntimeException var5) {
			signlink.reporterror("16972, " + 65 + ", " + var5.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.a(LAPSQOGBV;II)V")
	public void moveEntity(ClientEntity arg0, int arg1) {
		try {
			if (arg0.x < 128 || arg0.z < 128 || arg0.x >= 13184 || arg0.z >= 13184) {
				arg0.primaryAnim = -1;
				arg0.spotanimId = -1;
				arg0.field61 = 0;
				arg0.field62 = 0;
				arg0.x = arg0.routeX[0] * 128 + arg0.field54 * 64;
				arg0.z = arg0.routeZ[0] * 128 + arg0.field54 * 64;
				arg0.method7((byte) 4);
			}
			if (arg0 == localPlayer && (arg0.x < 1536 || arg0.z < 1536 || arg0.x >= 11776 || arg0.z >= 11776)) {
				arg0.primaryAnim = -1;
				arg0.spotanimId = -1;
				arg0.field61 = 0;
				arg0.field62 = 0;
				arg0.x = arg0.routeX[0] * 128 + arg0.field54 * 64;
				arg0.z = arg0.routeZ[0] * 128 + arg0.field54 * 64;
				arg0.method7((byte) 4);
			}
			if (arg0.field61 > loopCycle) {
				this.exactMove1(arg0);
			} else if (arg0.field62 >= loopCycle) {
				this.exactMove2(arg0);
			} else {
				this.routeMove(arg0);
			}
			this.entityFace(arg0);
			this.entityAnim((byte) 5, arg0);
		} catch (RuntimeException var4) {
			signlink.reporterror("38054, " + arg0 + ", " + arg1 + ", " + -718 + ", " + var4.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.a(ZLAPSQOGBV;)V")
	public void exactMove1(ClientEntity arg0) {
		try {
			int var2 = arg0.field61 - loopCycle;
			int var3 = arg0.field57 * 128 + arg0.field54 * 64;
			int var4 = arg0.field59 * 128 + arg0.field54 * 64;
			arg0.x += (var3 - arg0.x) / var2;
			arg0.z += (var4 - arg0.z) / var2;
			arg0.field19 = 0;
			if (arg0.field63 == 0) {
				arg0.dstYaw = 1024;
			}
			if (arg0.field63 == 1) {
				arg0.dstYaw = 1536;
			}
			if (arg0.field63 == 2) {
				arg0.dstYaw = 0;
			}
			if (arg0.field63 == 3) {
				arg0.dstYaw = 512;
			}
		} catch (RuntimeException var6) {
			signlink.reporterror("72123, " + true + ", " + arg0 + ", " + var6.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.a(LAPSQOGBV;B)V")
	public void exactMove2(ClientEntity arg0) {
		try {
			if (arg0.field62 == loopCycle || arg0.primaryAnim == -1 || arg0.primaryAnimDelay != 0 || arg0.field49 + 1 > SeqType.list[arg0.primaryAnim].getDelay(arg0.primaryFrame)) {
				int var2 = arg0.field62 - arg0.field61;
				int var3 = loopCycle - arg0.field61;
				int var4 = arg0.field57 * 128 + arg0.field54 * 64;
				int var5 = arg0.field59 * 128 + arg0.field54 * 64;
				int var6 = arg0.field58 * 128 + arg0.field54 * 64;
				int var7 = arg0.field60 * 128 + arg0.field54 * 64;
				arg0.x = (var4 * (var2 - var3) + var6 * var3) / var2;
				arg0.z = (var5 * (var2 - var3) + var7 * var3) / var2;
			}
			arg0.field19 = 0;
			if (arg0.field63 == 0) {
				arg0.dstYaw = 1024;
			}
			if (arg0.field63 == 1) {
				arg0.dstYaw = 1536;
			}
			if (arg0.field63 == 2) {
				arg0.dstYaw = 0;
			}
			if (arg0.field63 == 3) {
				arg0.dstYaw = 512;
			}
			arg0.field69 = arg0.dstYaw;
		} catch (RuntimeException var9) {
			signlink.reporterror("43642, " + arg0 + ", " + 113 + ", " + var9.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.a(ILAPSQOGBV;)V")
	public void routeMove(ClientEntity arg0) {
		try {
			arg0.secondaryAnim = arg0.readyAnim;
			if (arg0.routeLength == 0) {
				arg0.field19 = 0;
			} else {
				if (arg0.primaryAnim != -1 && arg0.primaryAnimDelay == 0) {
					SeqType var2 = SeqType.list[arg0.primaryAnim];
					if (arg0.preanimRouteLength > 0 && var2.preanim_move == 0) {
						arg0.field19++;
						return;
					}
					if (arg0.preanimRouteLength <= 0 && var2.postanim_move == 0) {
						arg0.field19++;
						return;
					}
				}
				int var3 = arg0.x;
				int var4 = arg0.z;
				int var5 = arg0.routeX[arg0.routeLength - 1] * 128 + arg0.field54 * 64;
				int var6 = arg0.routeZ[arg0.routeLength - 1] * 128 + arg0.field54 * 64;
				if (var5 - var3 <= 256 && var5 - var3 >= -256 && var6 - var4 <= 256 && var6 - var4 >= -256) {
					if (var3 < var5) {
						if (var4 < var6) {
							arg0.dstYaw = 1280;
						} else if (var4 > var6) {
							arg0.dstYaw = 1792;
						} else {
							arg0.dstYaw = 1536;
						}
					} else if (var3 > var5) {
						if (var4 < var6) {
							arg0.dstYaw = 768;
						} else if (var4 > var6) {
							arg0.dstYaw = 256;
						} else {
							arg0.dstYaw = 512;
						}
					} else if (var4 < var6) {
						arg0.dstYaw = 1024;
					} else {
						arg0.dstYaw = 0;
					}
					int var7 = arg0.dstYaw - arg0.field69 & 0x7FF;
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
					arg0.secondaryAnim = var8;
					int var9 = 4;
					if (arg0.field69 != arg0.dstYaw && arg0.field52 == -1 && arg0.field40 != 0) {
						var9 = 2;
					}
					if (arg0.routeLength > 2) {
						var9 = 6;
					}
					if (arg0.routeLength > 3) {
						var9 = 8;
					}
					if (arg0.field19 > 0 && arg0.routeLength > 1) {
						var9 = 8;
						arg0.field19--;
					}
					if (arg0.routeRun[arg0.routeLength - 1]) {
						var9 <<= 0x1;
					}
					if (var9 >= 8 && arg0.secondaryAnim == arg0.field20 && arg0.field18 != -1) {
						arg0.secondaryAnim = arg0.field18;
					}
					if (var3 < var5) {
						arg0.x += var9;
						if (arg0.x > var5) {
							arg0.x = var5;
						}
					} else if (var3 > var5) {
						arg0.x -= var9;
						if (arg0.x < var5) {
							arg0.x = var5;
						}
					}
					if (var4 < var6) {
						arg0.z += var9;
						if (arg0.z > var6) {
							arg0.z = var6;
						}
					} else if (var4 > var6) {
						arg0.z -= var9;
						if (arg0.z < var6) {
							arg0.z = var6;
						}
					}
					if (arg0.x == var5 && arg0.z == var6) {
						arg0.routeLength--;
						if (arg0.preanimRouteLength > 0) {
							arg0.preanimRouteLength--;
							return;
						}
					}
				} else {
					arg0.x = var5;
					arg0.z = var6;
				}
			}
		} catch (RuntimeException var11) {
			signlink.reporterror("87391, " + 3 + ", " + arg0 + ", " + var11.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.b(ZLAPSQOGBV;)V")
	public void entityFace(ClientEntity arg0) {
		try {
			if (arg0.field40 != 0) {
				if (arg0.field52 != -1 && arg0.field52 < 32768) {
					ClientNpc var2 = this.npc[arg0.field52];
					if (var2 != null) {
						int var3 = arg0.x - var2.x;
						int var4 = arg0.z - var2.z;
						if (var3 != 0 || var4 != 0) {
							arg0.dstYaw = (int) (Math.atan2((double) var3, (double) var4) * 325.949D) & 0x7FF;
						}
					}
				}
				if (arg0.field52 >= 32768) {
					int var5 = arg0.field52 - 32768;
					if (var5 == this.field556) {
						var5 = this.LOCAL_PLAYER_INDEX;
					}
					ClientPlayer var6 = this.players[var5];
					if (var6 != null) {
						int var7 = arg0.x - var6.x;
						int var8 = arg0.z - var6.z;
						if (var7 != 0 || var8 != 0) {
							arg0.dstYaw = (int) (Math.atan2((double) var7, (double) var8) * 325.949D) & 0x7FF;
						}
					}
				}
				if ((arg0.field41 != 0 || arg0.field42 != 0) && (arg0.routeLength == 0 || arg0.field19 > 0)) {
					int var9 = arg0.x - (arg0.field41 - this.mapBuildBaseX - this.mapBuildBaseX) * 64;
					int var10 = arg0.z - (arg0.field42 - this.mapBuildBaseZ - this.mapBuildBaseZ) * 64;
					if (var9 != 0 || var10 != 0) {
						arg0.dstYaw = (int) (Math.atan2((double) var9, (double) var10) * 325.949D) & 0x7FF;
					}
					arg0.field41 = 0;
					arg0.field42 = 0;
				}
				int var11 = arg0.dstYaw - arg0.field69 & 0x7FF;
				if (var11 != 0) {
					if (var11 < arg0.field40 || var11 > 2048 - arg0.field40) {
						arg0.field69 = arg0.dstYaw;
					} else if (var11 > 1024) {
						arg0.field69 -= arg0.field40;
					} else {
						arg0.field69 += arg0.field40;
					}
					arg0.field69 &= 0x7FF;
					if (arg0.secondaryAnim == arg0.readyAnim && arg0.field69 != arg0.dstYaw) {
						if (arg0.field71 != -1) {
							arg0.secondaryAnim = arg0.field71;
							return;
						}
						arg0.secondaryAnim = arg0.field20;
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
	public void entityAnim(byte arg0, ClientEntity arg1) {
		try {
			if (this.field572 == 5) {
				boolean var9 = false;
				arg1.field39 = false;
				if (arg1.secondaryAnim != -1) {
					SeqType var3 = SeqType.list[arg1.secondaryAnim];
					arg1.field45++;
					if (arg1.secondaryFrame < var3.numFrames && arg1.field45 > var3.getDelay(arg1.secondaryFrame)) {
						arg1.field45 = 0;
						arg1.secondaryFrame++;
					}
					if (arg1.secondaryFrame >= var3.numFrames) {
						arg1.field45 = 0;
						arg1.secondaryFrame = 0;
					}
				}
				if (arg1.spotanimId != -1 && loopCycle >= arg1.field30) {
					if (arg1.spotanimFrame < 0) {
						arg1.spotanimFrame = 0;
					}
					SeqType var4 = SpotType.list[arg1.spotanimId].seq;
					arg1.field29++;
					while (arg1.spotanimFrame < var4.numFrames && arg1.field29 > var4.getDelay(arg1.spotanimFrame)) {
						arg1.field29 -= var4.getDelay(arg1.spotanimFrame);
						arg1.spotanimFrame++;
					}
					if (arg1.spotanimFrame >= var4.numFrames && (arg1.spotanimFrame < 0 || arg1.spotanimFrame >= var4.numFrames)) {
						arg1.spotanimId = -1;
					}
				}
				if (arg1.primaryAnim != -1 && arg1.primaryAnimDelay <= 1) {
					SeqType var5 = SeqType.list[arg1.primaryAnim];
					if (var5.preanim_move == 1 && arg1.preanimRouteLength > 0 && arg1.field61 <= loopCycle && arg1.field62 < loopCycle) {
						arg1.primaryAnimDelay = 1;
						return;
					}
				}
				if (arg1.primaryAnim != -1 && arg1.primaryAnimDelay == 0) {
					SeqType var6 = SeqType.list[arg1.primaryAnim];
					arg1.field49++;
					while (arg1.primaryFrame < var6.numFrames && arg1.field49 > var6.getDelay(arg1.primaryFrame)) {
						arg1.field49 -= var6.getDelay(arg1.primaryFrame);
						arg1.primaryFrame++;
					}
					if (arg1.primaryFrame >= var6.numFrames) {
						arg1.primaryFrame -= var6.loops;
						arg1.field51++;
						if (arg1.field51 >= var6.maxloops) {
							arg1.primaryAnim = -1;
						}
						if (arg1.primaryFrame < 0 || arg1.primaryFrame >= var6.numFrames) {
							arg1.primaryAnim = -1;
						}
					}
					arg1.field39 = var6.reachforward;
				}
				if (arg1.primaryAnimDelay > 0) {
					arg1.primaryAnimDelay--;
				}
			}
		} catch (RuntimeException var8) {
			signlink.reporterror("86398, " + arg0 + ", " + arg1 + ", " + var8.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.s(I)V")
	public void gameDrawMain(int arg0) {
		try {
			this.sceneCycle++;
			this.addPlayers(true);
			this.addNpcs(true);
			this.addPlayers(false);
			this.addNpcs(false);
			this.addProjectiles();
			this.addMapAnim();
			if (!this.cinemaCam) {
				int var2 = this.orbitCameraPitch;
				if (this.cameraPitchClamp / 256 > var2) {
					var2 = this.cameraPitchClamp / 256;
				}
				if (this.camShake[4] && this.CamShakeRan[4] + 128 > var2) {
					var2 = this.CamShakeRan[4] + 128;
				}
				int var3 = this.orbitCameraYaw + this.macroCameraAngle & 0x7FF;
				this.camFollow(this.field480, var2, var3, var2 * 3 + 600, this.field481, this.getAvH(localPlayer.x, localPlayer.z, this.minusedlevel) - 50);
			}
			int var4;
			if (this.cinemaCam) {
				var4 = this.roofCheck2();
			} else {
				var4 = this.roofCheck();
			}
			int var5 = this.camX;
			int var6 = this.camY;
			int var7 = this.camZ;
			int var8 = this.camPitch;
			int var9 = this.camYaw;
			for (int var10 = 0; var10 < 5; var10++) {
				if (this.camShake[var10]) {
					int var11 = (int) (Math.random() * (double) (this.field592[var10] * 2 + 1) + Math.sin((double) this.field400[var10] * ((double) this.field183[var10] / 100.0D)) * (double) this.CamShakeRan[var10] - (double) this.field592[var10]);
					if (var10 == 0) {
						this.camX += var11;
					}
					if (var10 == 1) {
						this.camY += var11;
					}
					if (var10 == 2) {
						this.camZ += var11;
					}
					if (var10 == 3) {
						this.camYaw = this.camYaw + var11 & 0x7FF;
					}
					if (var10 == 4) {
						this.camPitch += var11;
						if (this.camPitch < 128) {
							this.camPitch = 128;
						}
						if (this.camPitch > 383) {
							this.camPitch = 383;
						}
					}
				}
			}
			int var12 = Pix3D.cycle;
			Model.mouseCheck = true;
			Model.pickedCount = 0;
			Model.mouseX = super.mouseX - 4;
			Model.mouseY = super.mouseY - 4;
			Pix2D.cls();
			this.world.renderAll(this.camY, this.camX, this.camZ, var4, this.camPitch, this.camYaw);
			this.world.removeSprites();
			this.entityOverlays();
			this.coordArrow();
			this.textureRunAnims((byte) 7, var12);
			this.otherOverlays(this.field359);
			this.areaGame.draw(4, super.graphics, 4);
			this.camX = var5;
			this.camY = var6;
			this.camZ = var7;
			this.camPitch = var8;
			while (arg0 >= 0) {
				this.field605 = this.randomIn.takeNextValue();
			}
			this.camYaw = var9;
		} catch (RuntimeException var14) {
			signlink.reporterror("61951, " + arg0 + ", " + var14.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.b(ZI)V")
	public void addPlayers(boolean arg0) {
		try {
			if (localPlayer.x >> 7 == this.minimapFlagX && localPlayer.z >> 7 == this.minimapFlagZ) {
				this.minimapFlagX = 0;
				field340++;
				if (field340 > 96) {
					field340 = 0;
					this.out.p1enc(35);
				}
			}
			int var2 = this.playerCount;
			if (arg0) {
				var2 = 1;
			}
			for (int var3 = 0; var3 < var2; var3++) {
				ClientPlayer var4;
				int var5;
				if (arg0) {
					var4 = localPlayer;
					var5 = this.LOCAL_PLAYER_INDEX << 14;
				} else {
					var4 = this.players[this.playerIds[var3]];
					var5 = this.playerIds[var3] << 14;
				}
				if (var4 != null && var4.isReady()) {
					var4.field113 = false;
					if ((lowMem && this.playerCount > 50 || this.playerCount > 200) && !arg0 && var4.secondaryAnim == var4.readyAnim) {
						var4.field113 = true;
					}
					int var6 = var4.x >> 7;
					int var7 = var4.z >> 7;
					if (var6 >= 0 && var6 < 104 && var7 >= 0 && var7 < 104) {
						if (var4.locModel == null || loopCycle < var4.locStartCycle || loopCycle >= var4.locStopCycle) {
							if ((var4.x & 0x7F) == 64 && (var4.z & 0x7F) == 64) {
								if (this.field409[var6][var7] == this.sceneCycle) {
									continue;
								}
								this.field409[var6][var7] = this.sceneCycle;
							}
							var4.y = this.getAvH(var4.x, var4.z, this.minusedlevel);
							this.world.addDynamic(var4.x, var4.field69, this.minusedlevel, var4.z, 60, var4, var4.y, var4.field39, var5);
						} else {
							var4.field113 = false;
							var4.y = this.getAvH(var4.x, var4.z, this.minusedlevel);
							this.world.addDynamic2(var4.x, var4.field69, var4.y, var5, var4.field118, var4.z, this.minusedlevel, var4.field117, var4, var4.field116, this.field443, var4.field115);
						}
					}
				}
			}
		} catch (RuntimeException var9) {
			signlink.reporterror("87461, " + arg0 + ", " + 1 + ", " + var9.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.e(ZI)V")
	public void addNpcs(boolean arg0) {
		try {
			for (int var2 = 0; var2 < this.npcCount; var2++) {
				ClientNpc var3 = this.npc[this.npcIds[var2]];
				int var4 = (this.npcIds[var2] << 14) + 536870912;
				if (var3 != null && var3.isReady() && var3.type.alwaysontop == arg0 && var3.type.method392()) {
					int var5 = var3.x >> 7;
					int var6 = var3.z >> 7;
					if (var5 >= 0 && var5 < 104 && var6 >= 0 && var6 < 104) {
						if (var3.field54 == 1 && (var3.x & 0x7F) == 64 && (var3.z & 0x7F) == 64) {
							if (this.field409[var5][var6] == this.sceneCycle) {
								continue;
							}
							this.field409[var5][var6] = this.sceneCycle;
						}
						if (!var3.type.active) {
							var4 += Integer.MIN_VALUE;
						}
						this.world.addDynamic(var3.x, var3.field69, this.minusedlevel, var3.z, (var3.field54 - 1) * 64 + 60, var3, this.getAvH(var3.x, var3.z, this.minusedlevel), var3.field39, var4);
					}
				}
			}
		} catch (RuntimeException var8) {
			signlink.reporterror("18121, " + arg0 + ", " + ", " + var8.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.r(I)V")
	public void addProjectiles() {
		try {
			for (ClientProj var1 = (ClientProj) this.projectiles.head(); var1 != null; var1 = (ClientProj) this.projectiles.next()) {
				if (var1.level != this.minusedlevel || loopCycle > var1.t2) {
					var1.unlink();
				} else if (loopCycle >= var1.t1) {
					if (var1.target > 0) {
						ClientNpc var2 = this.npc[var1.target - 1];
						if (var2 != null && var2.x >= 0 && var2.x < 13312 && var2.z >= 0 && var2.z < 13312) {
							var1.setTarget(var2.z, loopCycle, var2.x, this.getAvH(var2.x, var2.z, var1.level) - var1.h2);
						}
					}
					if (var1.target < 0) {
						int var3 = -var1.target - 1;
						ClientPlayer var4;
						if (var3 == this.field556) {
							var4 = localPlayer;
						} else {
							var4 = this.players[var3];
						}
						if (var4 != null && var4.x >= 0 && var4.x < 13312 && var4.z >= 0 && var4.z < 13312) {
							var1.setTarget(var4.z, loopCycle, var4.x, this.getAvH(var4.x, var4.z, var1.level) - var1.h2);
						}
					}
					var1.move(this.worldUpdateNum);
					this.world.addDynamic((int) var1.field1278, var1.yaw, this.minusedlevel, (int) var1.field1279, 60, var1, (int) var1.field1280, false, -1);
				}
			}
		} catch (RuntimeException var6) {
			signlink.reporterror("50208, " + 623 + ", " + var6.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.N(I)V")
	public void addMapAnim() {
		try {
			for (MapSpotAnim var1 = (MapSpotAnim) this.spotanims.head(); var1 != null; var1 = (MapSpotAnim) this.spotanims.next()) {
				if (var1.field1616 != this.minusedlevel || var1.animComplete) {
					var1.unlink();
				} else if (loopCycle >= var1.startCycle) {
					var1.method579(this.worldUpdateNum);
					if (var1.animComplete) {
						var1.unlink();
					} else {
						this.world.addDynamic(var1.field1617, 0, var1.field1616, var1.field1618, 60, var1, var1.field1619, false, -1);
					}
				}
			}
		} catch (RuntimeException var3) {
			signlink.reporterror("62870, " + -767 + ", " + var3.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.a(IIIIIII)V")
	public void camFollow(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		try {
			int var7 = 2048 - arg1 & 0x7FF;
			int var8 = 2048 - arg2 & 0x7FF;
			int var9 = 0;
			int var10 = 0;
			int var11 = arg3;
			if (var7 != 0) {
				int var12 = Model.sinTable[var7];
				int var13 = Model.cosTable[var7];
				int var14 = var13 * 0 - arg3 * var12 >> 16;
				var11 = var12 * 0 + arg3 * var13 >> 16;
				var10 = var14;
			}
			if (var8 != 0) {
				int var15 = Model.sinTable[var8];
				int var16 = Model.cosTable[var8];
				int var17 = var11 * var15 + var16 * 0 >> 16;
				var11 = var11 * var16 - var15 * 0 >> 16;
				var9 = var17;
			}
			this.camX = arg0 - var9;
			this.camY = arg5 - var10;
			this.camZ = arg4 - var11;
			this.camPitch = arg1;
			this.camYaw = arg2;
		} catch (RuntimeException var19) {
			signlink.reporterror("67404, " + arg0 + ", " + arg1 + ", " + 8 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + var19.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.d(Z)I")
	public int roofCheck2() {
		try {
			int var1 = this.getAvH(this.camX, this.camZ, this.minusedlevel);
			return var1 - this.camY >= 800 || (this.mapl[this.minusedlevel][this.camX >> 7][this.camZ >> 7] & 0x4) == 0 ? 3 : this.minusedlevel;
		} catch (RuntimeException var3) {
			signlink.reporterror("93689, " + true + ", " + var3.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.g(B)I")
	public int roofCheck() {
		try {
			if (this.field455 != 4) {
				this.field289 = 101;
			}
			int var1 = 3;
			if (this.camPitch < 310) {
				int var2 = this.camX >> 7;
				int var3 = this.camZ >> 7;
				int var4 = localPlayer.x >> 7;
				int var5 = localPlayer.z >> 7;
				if ((this.mapl[this.minusedlevel][var2][var3] & 0x4) != 0) {
					var1 = this.minusedlevel;
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
						if ((this.mapl[this.minusedlevel][var2][var3] & 0x4) != 0) {
							var1 = this.minusedlevel;
						}
						var9 += var8;
						if (var9 >= 65536) {
							var9 -= 65536;
							if (var3 < var5) {
								var3++;
							} else if (var3 > var5) {
								var3--;
							}
							if ((this.mapl[this.minusedlevel][var2][var3] & 0x4) != 0) {
								var1 = this.minusedlevel;
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
						if ((this.mapl[this.minusedlevel][var2][var3] & 0x4) != 0) {
							var1 = this.minusedlevel;
						}
						var11 += var10;
						if (var11 >= 65536) {
							var11 -= 65536;
							if (var2 < var4) {
								var2++;
							} else if (var2 > var4) {
								var2--;
							}
							if ((this.mapl[this.minusedlevel][var2][var3] & 0x4) != 0) {
								var1 = this.minusedlevel;
							}
						}
					}
				}
			}
			if ((this.mapl[this.minusedlevel][localPlayer.x >> 7][localPlayer.z >> 7] & 0x4) != 0) {
				var1 = this.minusedlevel;
			}
			return var1;
		} catch (RuntimeException var13) {
			signlink.reporterror("55441, " + 4 + ", " + var13.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.J(I)V")
	public void entityOverlays() {
		try {
			this.field460 = 0;
			for (int var1 = -1; var1 < this.playerCount + this.npcCount; var1++) {
				ClientEntity var2;
				if (var1 == -1) {
					var2 = localPlayer;
				} else if (var1 < this.playerCount) {
					var2 = this.players[this.playerIds[var1]];
				} else {
					var2 = this.npc[this.npcIds[var1 - this.playerCount]];
				}
				if (var2 != null && var2.isReady()) {
					if (var2 instanceof ClientNpc) {
						NpcType var3 = ((ClientNpc) var2).type;
						if (var3.multinpc != null) {
							var3 = var3.method389();
						}
						if (var3 == null) {
							continue;
						}
					}
					if (var1 >= this.playerCount) {
						NpcType var6 = ((ClientNpc) var2).type;
						if (var6.headicon >= 0 && var6.headicon < this.headiconsPrayer.length) {
							this.getOverlayPos(var2.height + 15, var2);
							if (this.field390 > -1) {
								this.headiconsPrayer[var6.headicon].plotSprite(this.field390 - 12, this.field527, this.field391 - 30);
							}
						}
						if (this.hintType == 1 && this.field570 == this.npcIds[var1 - this.playerCount] && loopCycle % 20 < 10) {
							this.getOverlayPos(var2.height + 15, var2);
							if (this.field390 > -1) {
								this.headiconsHint[0].plotSprite(this.field390 - 12, this.field527, this.field391 - 28);
							}
						}
					} else {
						int var4 = 30;
						ClientPlayer var5 = (ClientPlayer) var2;
						if (var5.field134 != -1 || var5.field109 != -1) {
							this.getOverlayPos(var2.height + 15, var2);
							if (this.field390 > -1) {
								if (var5.field134 != -1) {
									this.headiconsPk[var5.field134].plotSprite(this.field390 - 12, this.field527, this.field391 - 30);
									var4 += 25;
								}
								if (var5.field109 != -1) {
									this.headiconsPrayer[var5.field109].plotSprite(this.field390 - 12, this.field527, this.field391 - var4);
									var4 += 25;
								}
							}
						}
						if (var1 >= 0 && this.hintType == 10 && this.field245 == this.playerIds[var1]) {
							this.getOverlayPos(var2.height + 15, var2);
							if (this.field390 > -1) {
								this.headiconsHint[1].plotSprite(this.field390 - 12, this.field527, this.field391 - var4);
							}
						}
					}
					if (var2.chatMessage != null && (var1 >= this.playerCount || this.chatPublicMode == 0 || this.chatPublicMode == 3 || this.chatPublicMode == 1 && this.isFriend(((ClientPlayer) var2).name))) {
						this.getOverlayPos(var2.height, var2);
						if (this.field390 > -1 && this.field460 < this.field461) {
							this.field465[this.field460] = this.b12.stringWid(var2.chatMessage) / 2;
							this.field464[this.field460] = this.b12.height;
							this.field462[this.field460] = this.field390;
							this.field463[this.field460] = this.field391;
							this.field466[this.field460] = var2.chatColour;
							this.field467[this.field460] = var2.chatEffect;
							this.field468[this.field460] = var2.chatTimer;
							this.field469[this.field460++] = var2.chatMessage;
							if (this.field624 == 0 && var2.chatEffect >= 1 && var2.chatEffect <= 3) {
								this.field464[this.field460] += 10;
								this.field463[this.field460] += 5;
							}
							if (this.field624 == 0 && var2.chatEffect == 4) {
								this.field465[this.field460] = 60;
							}
							if (this.field624 == 0 && var2.chatEffect == 5) {
								this.field464[this.field460] += 5;
							}
						}
					}
					if (var2.field14 > loopCycle) {
						this.getOverlayPos(var2.height + 15, var2);
						if (this.field390 > -1) {
							int var7 = var2.field15 * 30 / var2.field16;
							if (var7 > 30) {
								var7 = 30;
							}
							Pix2D.fillrect(65280, this.field390 - 15, 99, var7, 5, this.field391 - 3);
							Pix2D.fillrect(16711680, this.field390 + var7 - 15, 99, 30 - var7, 5, this.field391 - 3);
						}
					}
					for (int var8 = 0; var8 < 4; var8++) {
						if (var2.damageCycles[var8] > loopCycle) {
							this.getOverlayPos(var2.height / 2, var2);
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
								this.hitmarks[var2.damageTypes[var8]].plotSprite(this.field390 - 12, this.field527, this.field391 - 12);
								this.p11.centreStringTag(0, String.valueOf(var2.damageValues[var8]), this.field390, this.field391 + 4);
								this.p11.centreStringTag(16777215, String.valueOf(var2.damageValues[var8]), this.field390 - 1, this.field391 + 3);
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
						var17 = this.sceneCycle % 20 < 10 ? 16711680 : 16776960;
					}
					if (this.field466[var9] == 7) {
						var17 = this.sceneCycle % 20 < 10 ? 255 : 65535;
					}
					if (this.field466[var9] == 8) {
						var17 = this.sceneCycle % 20 < 10 ? 45056 : 8454016;
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
						this.b12.centreStringTag(0, var16, this.field390, this.field391 + 1);
						this.b12.centreStringTag(var17, var16, this.field390, this.field391);
					}
					if (this.field467[var9] == 1) {
						this.b12.centreStringWave(this.field391 + 1, this.field390, this.sceneCycle, 0, var16);
						this.b12.centreStringWave(this.field391, this.field390, this.sceneCycle, var17, var16);
					}
					if (this.field467[var9] == 2) {
						this.b12.centreStringWave2(this.field391 + 1, this.field390, 0, var16, this.sceneCycle);
						this.b12.centreStringWave2(this.field391, this.field390, var17, var16, this.sceneCycle);
					}
					if (this.field467[var9] == 3) {
						this.b12.centreStringWave3(150 - this.field468[var9], var16, this.field391 + 1, 0, this.field390, this.sceneCycle);
						this.b12.centreStringWave3(150 - this.field468[var9], var16, this.field391, var17, this.field390, this.sceneCycle);
					}
					if (this.field467[var9] == 4) {
						int var21 = this.b12.stringWid(var16);
						int var22 = (150 - this.field468[var9]) * (var21 + 100) / 150;
						Pix2D.setClipping(this.field390 + 50, 334, this.field390 - 50, this.field214, 0);
						this.b12.drawString(var16, this.field391 + 1, this.field390 + 50 - var22, 0);
						this.b12.drawString(var16, this.field391, this.field390 + 50 - var22, var17);
						Pix2D.resetClipping();
					}
					if (this.field467[var9] == 5) {
						int var23 = 150 - this.field468[var9];
						int var24 = 0;
						if (var23 < 25) {
							var24 = var23 - 25;
						} else if (var23 > 125) {
							var24 = var23 - 125;
						}
						Pix2D.setClipping(512, this.field391 + 5, 0, this.field214, this.field391 - this.b12.height - 1);
						this.b12.centreStringTag(0, var16, this.field390, this.field391 + var24 + 1);
						this.b12.centreStringTag(var17, var16, this.field390, this.field391 + var24);
						Pix2D.resetClipping();
					}
				} else {
					this.b12.centreStringTag(0, var16, this.field390, this.field391 + 1);
					this.b12.centreStringTag(16776960, var16, this.field390, this.field391);
				}
			}
		} catch (RuntimeException var26) {
			signlink.reporterror("24473, " + -670 + ", " + var26.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.f(Z)V")
	public void coordArrow() {
		try {
			if (this.hintType == 2) {
				this.getOverlayPos((this.field165 - this.mapBuildBaseZ << 7) + this.field168, this.field166 * 2, (this.field164 - this.mapBuildBaseX << 7) + this.field167);
				if (this.field390 > -1 && loopCycle % 20 < 10) {
					this.headiconsHint[0].plotSprite(this.field390 - 12, this.field527, this.field391 - 28);
				}
			}
		} catch (RuntimeException var2) {
			signlink.reporterror("56932, " + false + ", " + var2.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.b(BI)V")
	public void textureRunAnims(byte arg0, int arg1) {
		try {
			if (this.field506 == 7) {
				boolean var13 = false;
			} else {
				this.maininit();
			}
			if (!lowMem) {
				for (int var3 = 0; var3 < this.field258.length; var3++) {
					int var4 = this.field258[var3];
					if (Pix3D.texCycle[var4] >= arg1) {
						Pix8 var5 = Pix3D.textures[var4];
						int var6 = var5.wi * var5.hi - 1;
						int var7 = var5.wi * this.worldUpdateNum * 2;
						byte[] var8 = var5.data;
						byte[] var9 = this.field471;
						for (int var10 = 0; var10 <= var6; var10++) {
							var9[var10] = var8[var10 - var7 & var6];
						}
						var5.data = var9;
						this.field471 = var8;
						Pix3D.pushTexture(var4);
					}
				}
			}
		} catch (RuntimeException var12) {
			signlink.reporterror("18603, " + arg0 + ", " + arg1 + ", " + var12.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.L(I)V")
	public void otherOverlays(int arg0) {
		try {
			int var11 = 8 / arg0;
			this.drawPrivateMessages();
			if (this.crossMode == 1) {
				this.cross[this.crossCycle / 100].plotSprite(this.field247 - 8 - 4, this.field527, this.field248 - 8 - 4);
			}
			if (this.crossMode == 2) {
				this.cross[this.crossCycle / 100 + 4].plotSprite(this.field247 - 8 - 4, this.field527, this.field248 - 8 - 4);
			}
			if (this.mainOverlayId != -1) {
				this.animateInterface(this.mainOverlayId, this.worldUpdateNum);
				this.drawInterface(IfType.list(this.mainOverlayId), 0, 0, 0);
			}
			if (this.mainModalId != -1) {
				this.animateInterface(this.mainModalId, this.worldUpdateNum);
				this.drawInterface(IfType.list(this.mainModalId), 0, 0, 0);
			}
			this.getSpecialArea();
			if (!this.isMenuOpen) {
				this.buildMinimenu();
				this.drawFeedback();
			} else if (this.menuArea == 0) {
				this.drawMinimenu();
			}
			if (this.field618 == 1) {
				this.overlayMultiway.plotSprite(472, this.field527, 296);
			}
			if (field514) {
				byte var2 = 20;
				int var3 = 16776960;
				if (super.fps < 30 && lowMem) {
					var3 = 16711680;
				}
				if (super.fps < 20 && !lowMem) {
					var3 = 16711680;
				}
				this.p12.drawStringRight(617, 20, var3, "Fps:" + super.fps);
				int var12 = var2 + 15;
				Runtime var4 = Runtime.getRuntime();
				int var5 = (int) ((var4.totalMemory() - var4.freeMemory()) / 1024L);
				if (var5 > 33554432 && lowMem) {
				}
				if (var5 > 67108864 && !lowMem) {
				}
				this.p12.drawStringRight(617, 35, 16776960, "Mem:" + var5 + "k");
				var12 += 15;
			}
			if (this.rebootTimer != 0) {
				int var6 = this.rebootTimer / 50;
				int var7 = var6 / 60;
				int var8 = var6 % 60;
				if (var8 < 10) {
					this.p12.drawString("System update in: " + var7 + ":0" + var8, 329, 4, 16776960);
				} else {
					this.p12.drawString("System update in: " + var7 + ":" + var8, 329, 4, 16776960);
				}
			}
		} catch (RuntimeException var10) {
			signlink.reporterror("1392, " + arg0 + ", " + var10.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.v(I)V")
	public void drawPrivateMessages() {
		try {
			if (this.splitPrivateChat != 0) {
				PixFont var1 = this.p12;
				int var2 = 0;
				if (this.rebootTimer != 0) {
					var2 = 1;
				}
				for (int var3 = 0; var3 < 100; var3++) {
					if (this.chatText[var3] != null) {
						int var4 = this.chatType[var3];
						String var5 = this.chatusername[var3];
						byte var6 = 0;
						if (var5 != null && var5.startsWith("@cr1@")) {
							var5 = var5.substring(5);
							var6 = 1;
						}
						if (var5 != null && var5.startsWith("@cr2@")) {
							var5 = var5.substring(5);
							var6 = 2;
						}
						if ((var4 == 3 || var4 == 7) && (var4 == 7 || this.chatPrivatemode == 0 || this.chatPrivatemode == 1 && this.isFriend(var5))) {
							int var7 = 329 - var2 * 13;
							var1.drawString("From", var7, 4, 0);
							var1.drawString("From", var7 - 1, 4, 65535);
							int var8 = var1.stringWidTag("From ") + 4;
							if (var6 == 1) {
								this.modIcons[0].plotSprite(var8, this.field527, var7 - 12);
								var8 += 14;
							}
							if (var6 == 2) {
								this.modIcons[1].plotSprite(var8, this.field527, var7 - 12);
								var8 += 14;
							}
							var1.drawString(var5 + ": " + this.chatText[var3], var7, var8, 0);
							var1.drawString(var5 + ": " + this.chatText[var3], var7 - 1, var8, 65535);
							var2++;
							if (var2 >= 5) {
								return;
							}
						}
						if (var4 == 5 && this.chatPrivatemode < 2) {
							int var9 = 329 - var2 * 13;
							var1.drawString(this.chatText[var3], var9, 4, 0);
							var1.drawString(this.chatText[var3], var9 - 1, 4, 65535);
							var2++;
							if (var2 >= 5) {
								return;
							}
						}
						if (var4 == 6 && this.chatPrivatemode < 2) {
							int var10 = 329 - var2 * 13;
							var1.drawString("To " + var5 + ": " + this.chatText[var3], var10, 4, 0);
							var1.drawString("To " + var5 + ": " + this.chatText[var3], var10 - 1, 4, 65535);
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

	@ObfuscatedName("client.Q(I)V")
	public void getSpecialArea() {
		try {
			this.chatDisabled = 0;
			int var1 = (localPlayer.x >> 7) + this.mapBuildBaseX;
			int var2 = (localPlayer.z >> 7) + this.mapBuildBaseZ;
			if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
				this.chatDisabled = 1;
			}
			if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
				this.chatDisabled = 1;
			}
			if (this.chatDisabled == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
				this.chatDisabled = 0;
			}
		} catch (RuntimeException var4) {
			signlink.reporterror("85572, " + 622 + ", " + var4.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.a(IILAPSQOGBV;)V")
	public void getOverlayPos(int arg0, ClientEntity arg1) {
		try {
			this.getOverlayPos(arg1.z, arg0, arg1.x);
		} catch (RuntimeException var4) {
			signlink.reporterror("10202, " + -14612 + ", " + arg0 + ", " + arg1 + ", " + var4.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.b(IIII)V")
	public void getOverlayPos(int arg0, int arg1, int arg2) {
		try {
			if (arg2 >= 128 && arg0 >= 128 && arg2 <= 13056 && arg0 <= 13056) {
				int var4 = this.getAvH(arg2, arg0, this.minusedlevel) - arg1;
				int var17 = arg2 - this.camX;
				int var5 = var4 - this.camY;
				int var14 = arg0 - this.camZ;
				int var6 = Model.sinTable[this.camPitch];
				int var7 = Model.cosTable[this.camPitch];
				int var8 = Model.sinTable[this.camYaw];
				int var9 = Model.cosTable[this.camYaw];
				int var10 = var14 * var8 + var17 * var9 >> 16;
				int var15 = var14 * var9 - var17 * var8 >> 16;
				int var11 = var5 * var7 - var15 * var6 >> 16;
				int var16 = var5 * var6 + var15 * var7 >> 16;
				if (var16 >= 50) {
					this.field390 = Pix3D.originX + (var10 << 9) / var16;
					this.field391 = Pix3D.originY + (var11 << 9) / var16;
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

	@ObfuscatedName("client.a(IIBI)I")
	public int getAvH(int arg0, int arg1, int arg2) {
		try {
			int var4 = arg0 >> 7;
			int var5 = arg1 >> 7;
			if (var4 < 0 || var5 < 0 || var4 > 103 || var5 > 103) {
				return 0;
			}
			int var6 = arg2;
			if (arg2 < 3 && (this.mapl[1][var4][var5] & 0x2) == 2) {
				var6 = arg2 + 1;
			}
			int var7 = arg0 & 0x7F;
			int var8 = arg1 & 0x7F;
			int var9 = this.groundh[var6][var4][var5] * (128 - var7) + this.groundh[var6][var4 + 1][var5] * var7 >> 7;
			int var10 = this.groundh[var6][var4][var5 + 1] * (128 - var7) + this.groundh[var6][var4 + 1][var5 + 1] * var7 >> 7;
			return var9 * (128 - var8) + var10 * var8 >> 7;
		} catch (RuntimeException var12) {
			signlink.reporterror("84376, " + arg0 + ", " + arg1 + ", " + 111 + ", " + arg2 + ", " + var12.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.i(B)V")
	public void checkMinimap() {
		try {
			if (lowMem && this.sceneState == 2 && ClientBuild.minusedLevel != this.minusedlevel) {
				this.showPopupMessage(this.field607, "Loading - please wait.", null);
				this.sceneState = 1;
				this.sceneLoadStartTime = System.currentTimeMillis();
			}
			if (this.sceneState == 1) {
				int var1 = this.checkScene();
				if (var1 != 0 && System.currentTimeMillis() - this.sceneLoadStartTime > 360000L) {
					signlink.reporterror(this.loginUser + " glcfb " + this.loginSeed + "," + var1 + "," + lowMem + "," + this.fileStreams[0] + "," + this.onDemand.remaining() + "," + this.minusedlevel + "," + this.centerZoneX + "," + this.centerZoneZ);
					this.sceneLoadStartTime = System.currentTimeMillis();
				}
			}
			if (this.sceneState == 2 && this.minusedlevel != this.minimapLevel) {
				this.minimapLevel = this.minusedlevel;
				this.minimapBuildBuffer(this.minusedlevel);
			}
		} catch (RuntimeException var3) {
			signlink.reporterror("50214, " + 16 + ", " + var3.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.D(I)I")
	public int checkScene() {
		try {
			for (int var1 = 0; var1 < this.mapBuildGroundData.length; var1++) {
				if (this.mapBuildGroundData[var1] == null && this.mapBuildGroundFile[var1] != -1) {
					return -1;
				}
				if (this.mapBuildLocationData[var1] == null && this.mapBuildLocationFile[var1] != -1) {
					return -2;
				}
			}
			boolean var2 = true;
			for (int var3 = 0; var3 < this.mapBuildGroundData.length; var3++) {
				byte[] var4 = this.mapBuildLocationData[var3];
				if (var4 != null) {
					int var5 = (this.mapBuildIndex[var3] >> 8) * 64 - this.mapBuildBaseX;
					int var6 = (this.mapBuildIndex[var3] & 0xFF) * 64 - this.mapBuildBaseZ;
					if (this.sceneInstanced) {
						var5 = 10;
						var6 = 10;
					}
					var2 &= ClientBuild.checkLocations(var4, var5, var6);
				}
			}
			if (!var2) {
				return -3;
			} else if (this.awaitingPlayerinfo) {
				return -4;
			} else {
				this.sceneState = 2;
				ClientBuild.minusedLevel = this.minusedlevel;
				this.mapBuild(this.field605);
				this.out.p1enc(210);
				return 0;
			}
		} catch (RuntimeException var8) {
			signlink.reporterror("60186, " + -417 + ", " + var8.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.I(I)V")
	public void mapBuild(int arg0) {
		try {
			try {
				this.minimapLevel = -1;
				this.spotanims.clear();
				this.projectiles.clear();
				Pix3D.clearTexels();
				this.clearCaches();
				this.world.resetMap((byte) 9);
				System.gc();
				for (int var2 = 0; var2 < 4; var2++) {
					this.collision[var2].method200();
				}
				for (int var3 = 0; var3 < 4; var3++) {
					for (int var4 = 0; var4 < 104; var4++) {
						for (int var5 = 0; var5 < 104; var5++) {
							this.mapl[var3][var4][var5] = 0;
						}
					}
				}
				ClientBuild var6 = new ClientBuild(this.groundh, 104, this.field350, this.mapl, 104);
				int var7 = this.mapBuildGroundData.length;
				this.out.p1enc(58);
				if (!this.sceneInstanced) {
					for (int var8 = 0; var8 < var7; var8++) {
						int var9 = (this.mapBuildIndex[var8] >> 8) * 64 - this.mapBuildBaseX;
						int var10 = (this.mapBuildIndex[var8] & 0xFF) * 64 - this.mapBuildBaseZ;
						byte[] var11 = this.mapBuildGroundData[var8];
						if (var11 != null) {
							var6.method435(var10, var11, (this.centerZoneX - 6) * 8, this.collision, (this.centerZoneZ - 6) * 8, var9);
						}
					}
					for (int var12 = 0; var12 < var7; var12++) {
						int var13 = (this.mapBuildIndex[var12] >> 8) * 64 - this.mapBuildBaseX;
						int var14 = (this.mapBuildIndex[var12] & 0xFF) * 64 - this.mapBuildBaseZ;
						byte[] var15 = this.mapBuildGroundData[var12];
						if (var15 == null && this.centerZoneZ < 800) {
							var6.fadeAdjacent(var14, 64, 64, var13);
						}
					}
					this.out.p1enc(58);
					for (int var16 = 0; var16 < var7; var16++) {
						byte[] var17 = this.mapBuildLocationData[var16];
						if (var17 != null) {
							int var18 = (this.mapBuildIndex[var16] >> 8) * 64 - this.mapBuildBaseX;
							int var19 = (this.mapBuildIndex[var16] & 0xFF) * 64 - this.mapBuildBaseZ;
							var6.loadLocations(var18, var19, var17, this.world, this.collision);
						}
					}
				}
				if (this.sceneInstanced) {
					int var20 = 0;
					label250: while (true) {
						if (var20 >= 4) {
							for (int var30 = 0; var30 < 13; var30++) {
								for (int var31 = 0; var31 < 13; var31++) {
									int var32 = this.sceneMapRegion[0][var30][var31];
									if (var32 == -1) {
										var6.fadeAdjacent(var31 * 8, 8, 8, var30 * 8);
									}
								}
							}
							this.out.p1enc(58);
							int var33 = 0;
							while (true) {
								if (var33 >= 4) {
									break label250;
								}
								for (int var34 = 0; var34 < 13; var34++) {
									for (int var35 = 0; var35 < 13; var35++) {
										int var36 = this.sceneMapRegion[var33][var34][var35];
										if (var36 != -1) {
											int var37 = var36 >> 24 & 0x3;
											int var38 = var36 >> 1 & 0x3;
											int var39 = var36 >> 14 & 0x3FF;
											int var40 = var36 >> 3 & 0x7FF;
											int var41 = (var39 / 8 << 8) + var40 / 8;
											for (int var42 = 0; var42 < this.mapBuildIndex.length; var42++) {
												if (this.mapBuildIndex[var42] == var41 && this.mapBuildLocationData[var42] != null) {
													var6.loadLocations(var34 * 8, var33, var37, this.world, (var40 & 0x7) * 8, (var39 & 0x7) * 8, this.mapBuildLocationData[var42], this.collision, var35 * 8, var38);
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
								int var23 = this.sceneMapRegion[var20][var21][var22];
								if (var23 != -1) {
									int var24 = var23 >> 24 & 0x3;
									int var25 = var23 >> 1 & 0x3;
									int var26 = var23 >> 14 & 0x3FF;
									int var27 = var23 >> 3 & 0x7FF;
									int var28 = (var26 / 8 << 8) + var27 / 8;
									for (int var29 = 0; var29 < this.mapBuildIndex.length; var29++) {
										if (this.mapBuildIndex[var29] == var28 && this.mapBuildGroundData[var29] != null) {
											var6.method434(var24, (var26 & 0x7) * 8, var25, var20, this.collision, (var27 & 0x7) * 8, this.mapBuildGroundData[var29], var21 * 8, var22 * 8);
											break;
										}
									}
								}
							}
						}
						var20++;
					}
				}
				this.out.p1enc(58);
				var6.finishBuild(this.collision, this.world);
				if (this.areaGame != null) {
					this.areaGame.setPixels();
					Pix3D.scanline = this.gameScanline;
				}
				this.out.p1enc(58);
				int var43 = ClientBuild.field1239;
				if (var43 > this.minusedlevel) {
					var43 = this.minusedlevel;
				}
				if (var43 < this.minusedlevel - 1) {
					int var44 = this.minusedlevel - 1;
				}
				if (lowMem) {
					this.world.method529(this.field283, ClientBuild.field1239);
				} else {
					this.world.method529(this.field283, 0);
				}
				for (int var45 = 0; var45 < 104; var45++) {
					for (int var46 = 0; var46 < 104; var46++) {
						this.showObj(var45, var46);
					}
				}
				this.locChangePostBuildCorrect();
			} catch (Exception var60) {
			}
			LocType.mc1.clear();
			if (super.frame != null) {
				this.out.p1enc(173);
				this.out.p4(1057001181);
			}
			if (lowMem && signlink.cache_dat != null) {
				int var48 = this.onDemand.getFileCount(0);
				for (int var49 = 0; var49 < var48; var49++) {
					int var50 = this.onDemand.getModelUse(var49);
					if ((var50 & 0x79) == 0) {
						Model.unload(596, var49);
					}
				}
			}
			System.gc();
			int var62 = 58 / arg0;
			Pix3D.initPool();
			this.onDemand.clearPrefetches();
			int var51 = (this.centerZoneX - 6) / 8 - 1;
			int var52 = (this.centerZoneX + 6) / 8 + 1;
			int var53 = (this.centerZoneZ - 6) / 8 - 1;
			int var54 = (this.centerZoneZ + 6) / 8 + 1;
			if (this.field628) {
				var51 = 49;
				var52 = 50;
				var53 = 49;
				var54 = 50;
			}
			for (int var55 = var51; var55 <= var52; var55++) {
				for (int var56 = var53; var56 <= var54; var56++) {
					if (var55 == var51 || var55 == var52 || var56 == var53 || var56 == var54) {
						int var57 = this.onDemand.getMapFile(var56, var55, 0);
						if (var57 != -1) {
							this.onDemand.prefetch(var57, 3);
						}
						int var58 = this.onDemand.getMapFile(var56, var55, 1);
						if (var58 != -1) {
							this.onDemand.prefetch(var58, 3);
						}
					}
				}
			}
		} catch (RuntimeException var61) {
			signlink.reporterror("69267, " + arg0 + ", " + var61.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.c(II)V")
	public void minimapBuildBuffer(int arg0) {
		try {
			int[] var2 = this.minimap.data;
			int var3 = var2.length;
			for (int var4 = 0; var4 < var3; var4++) {
				var2[var4] = 0;
			}
			for (int var5 = 1; var5 < 103; var5++) {
				int var6 = (103 - var5) * 512 * 4 + 24628;
				for (int var7 = 1; var7 < 103; var7++) {
					if ((this.mapl[arg0][var7][var5] & 0x18) == 0) {
						this.world.render2DGround(var2, var6, arg0, var7, var5);
					}
					if (arg0 < 3 && (this.mapl[arg0 + 1][var7][var5] & 0x8) != 0) {
						this.world.render2DGround(var2, var6, arg0 + 1, var7, var5);
					}
					var6 += 4;
				}
			}
			int var8 = ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + (int) (Math.random() * 20.0D) + 238 - 10;
			int var9 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
			this.minimap.setPixels();
			for (int var10 = 1; var10 < 103; var10++) {
				for (int var11 = 1; var11 < 103; var11++) {
					if ((this.mapl[arg0][var11][var10] & 0x18) == 0) {
						this.drawDetail(var8, arg0, var10, var11, var9);
					}
					if (arg0 < 3 && (this.mapl[arg0 + 1][var11][var10] & 0x8) != 0) {
						this.drawDetail(var8, arg0 + 1, var10, var11, var9);
					}
				}
			}
			if (this.areaGame != null) {
				this.areaGame.setPixels();
				Pix3D.scanline = this.gameScanline;
			}
			this.field361 = 0;
			for (int var12 = 0; var12 < 104; var12++) {
				for (int var13 = 0; var13 < 104; var13++) {
					int var14 = this.world.gdType(this.minusedlevel, var12, var13);
					if (var14 != 0) {
						int var15 = var14 >> 14 & 0x7FFF;
						int var16 = LocType.list(var15).mapfunction;
						if (var16 >= 0) {
							int var17 = var12;
							int var18 = var13;
							if (var16 != 22 && var16 != 29 && var16 != 34 && var16 != 36 && var16 != 46 && var16 != 47 && var16 != 48) {
								int[][] var19 = this.collision[this.minusedlevel].flags;
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
							this.field373[this.field361] = this.mapfunction[var16];
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

	@ObfuscatedName("client.a(IBIIII)V")
	public void drawDetail(int arg0, int arg1, int arg2, int arg3, int arg4) {
		try {
			int var6 = this.world.wallType(arg1, arg3, arg2);
			if (var6 != 0) {
				int var7 = this.world.typeCode2(arg1, arg3, arg2, var6);
				int var8 = var7 >> 6 & 0x3;
				int var9 = var7 & 0x1F;
				int var10 = arg0;
				if (var6 > 0) {
					var10 = arg4;
				}
				int[] var11 = this.minimap.data;
				int var12 = arg3 * 4 + (103 - arg2) * 512 * 4 + 24624;
				int var13 = var6 >> 14 & 0x7FFF;
				LocType var14 = LocType.list(var13);
				if (var14.mapscene == -1) {
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
					Pix8 var15 = this.mapscene[var14.mapscene];
					if (var15 != null) {
						int var16 = (var14.width * 4 - var15.wi) / 2;
						int var17 = (var14.length * 4 - var15.hi) / 2;
						var15.plotSprite(arg3 * 4 + var16 + 48, this.field527, (104 - arg2 - var14.length) * 4 + var17 + 48);
					}
				}
			}
			int var18 = this.world.sceneType(arg1, arg3, arg2);
			if (var18 != 0) {
				int var19 = this.world.typeCode2(arg1, arg3, arg2, var18);
				int var20 = var19 >> 6 & 0x3;
				int var21 = var19 & 0x1F;
				int var22 = var18 >> 14 & 0x7FFF;
				LocType var23 = LocType.list(var22);
				if (var23.mapscene != -1) {
					Pix8 var24 = this.mapscene[var23.mapscene];
					if (var24 != null) {
						int var25 = (var23.width * 4 - var24.wi) / 2;
						int var26 = (var23.length * 4 - var24.hi) / 2;
						var24.plotSprite(arg3 * 4 + var25 + 48, this.field527, (104 - arg2 - var23.length) * 4 + var26 + 48);
					}
				} else if (var21 == 9) {
					int var27 = 15658734;
					if (var18 > 0) {
						var27 = 15597568;
					}
					int[] var28 = this.minimap.data;
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
			int var30 = this.world.gdType(arg1, arg3, arg2);
			if (var30 != 0) {
				int var31 = var30 >> 14 & 0x7FFF;
				LocType var32 = LocType.list(var31);
				if (var32.mapscene != -1) {
					Pix8 var33 = this.mapscene[var32.mapscene];
					if (var33 != null) {
						int var34 = (var32.width * 4 - var33.wi) / 2;
						int var35 = (var32.length * 4 - var33.hi) / 2;
						var33.plotSprite(arg3 * 4 + var34 + 48, this.field527, (104 - arg2 - var32.length) * 4 + var35 + 48);
						return;
					}
				}
			}
		} catch (RuntimeException var37) {
			signlink.reporterror("69809, " + arg0 + ", " + 30 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + var37.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.a(IIII)Z")
	public boolean interactWithLoc(int arg0, int arg1, int arg2) {
		try {
			int var4 = arg1 >> 14 & 0x7FFF;
			int var5 = this.world.typeCode2(this.minusedlevel, arg0, arg2, arg1);
			if (var5 == -1) {
				return false;
			}
			int var6 = var5 & 0x1F;
			int var7 = var5 >> 6 & 0x3;
			field590++;
			if (field590 > 1184) {
				field590 = 0;
				this.out.p1enc(127);
				this.out.p1(0);
				int var8 = this.out.pos;
				this.out.p2(8709);
				this.out.p2(18795);
				if ((int) (Math.random() * 2.0D) == 0) {
					this.out.p1(235);
				}
				this.out.p1(38);
				if ((int) (Math.random() * 2.0D) == 0) {
					this.out.p2(55800);
				}
				if ((int) (Math.random() * 2.0D) == 0) {
					this.out.p2(42667);
				}
				if ((int) (Math.random() * 2.0D) == 0) {
					this.out.p1(1);
				}
				this.out.p1(163);
				this.out.p2(42960);
				if ((int) (Math.random() * 2.0D) == 0) {
					this.out.p1(194);
				}
				this.out.psize1(this.out.pos - var8, this.field241);
			}
			if (var6 == 10 || var6 == 11 || var6 == 22) {
				LocType var9 = LocType.list(var4);
				int var10;
				int var11;
				if (var7 == 0 || var7 == 2) {
					var10 = var9.width;
					var11 = var9.length;
				} else {
					var10 = var9.length;
					var11 = var9.width;
				}
				int var12 = var9.forceapproach;
				if (var7 != 0) {
					var12 = (var12 << var7 & 0xF) + (var12 >> 4 - var7);
				}
				this.tryMove(arg0, (byte) 6, arg2, 2, var11, localPlayer.routeZ[0], false, var12, localPlayer.routeX[0], 0, var10, 0);
			} else {
				this.tryMove(arg0, (byte) 6, arg2, 2, 0, localPlayer.routeZ[0], false, 0, localPlayer.routeX[0], var7, 0, var6 + 1);
			}
			this.field247 = super.mouseClickX;
			this.field248 = super.mouseClickY;
			this.crossMode = 2;
			this.crossCycle = 0;
			return true;
		} catch (RuntimeException var14) {
			signlink.reporterror("93382, " + 1 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + var14.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.a(IBIIIIZIIIII)Z")
	public boolean tryMove(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
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
			int[][] var21 = this.collision[this.minusedlevel].flags;
			while (var18 != var37) {
				var15 = this.field175[var18];
				var16 = this.field176[var18];
				var18 = (var18 + 1) % var20;
				if (var15 == arg0 && var16 == arg2) {
					var19 = true;
					break;
				}
				if (arg11 != 0) {
					if ((arg11 < 5 || arg11 == 10) && this.collision[this.minusedlevel].testWall(var15, arg0, arg11 - 1, arg2, var16, arg9)) {
						var19 = true;
						break;
					}
					if (arg11 < 10 && this.collision[this.minusedlevel].testWDecor(arg9, arg2, arg11 - 1, arg0, this.field286, var16, var15)) {
						var19 = true;
						break;
					}
				}
				if (arg10 != 0 && arg4 != 0 && this.collision[this.minusedlevel].testLoc(arg0, var16, arg2, arg10, var15, arg4, arg7)) {
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
					this.out.p1enc(246);
					this.out.p1(var30 + var30 + 3);
				}
				if (arg3 == 1) {
					this.out.p1enc(147);
					this.out.p1(var30 + var30 + 3 + 14);
				}
				if (arg3 == 2) {
					this.out.p1enc(216);
					this.out.p1(var30 + var30 + 3);
				}
				this.out.p1_alt1(super.keyHeld[5] == 1 ? 1 : 0);
				this.out.p2_alt1(var32 + this.mapBuildBaseZ);
				this.minimapFlagX = this.field175[0];
				this.minimapFlagZ = this.field176[0];
				for (int var33 = 1; var33 < var30; var33++) {
					var38--;
					this.out.p1_alt1(this.field175[var38] - var31);
					this.out.p1_alt2(this.field176[var38] - var32);
				}
				this.out.p2_alt1(var31 + this.mapBuildBaseX);
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

	@ObfuscatedName("client.h(I)Z")
	public boolean tcpIn() {
		try {
			if (this.stream == null) {
				return false;
			}
			try {
				int var1 = this.stream.available();
				if (var1 == 0) {
					return false;
				}
				if (this.ptype == -1) {
					this.stream.read(this.in.data, 0, 1);
					this.ptype = this.in.data[0] & 0xFF;
					if (this.randomIn != null) {
						this.ptype = this.ptype - this.randomIn.takeNextValue() & 0xFF;
					}
					this.psize = Protocol.SERVERPROT_SIZE[this.ptype];
					var1--;
				}
				if (this.psize == -1) {
					if (var1 <= 0) {
						return false;
					}
					this.stream.read(this.in.data, 0, 1);
					this.psize = this.in.data[0] & 0xFF;
					var1--;
				}
				if (this.psize == -2) {
					if (var1 <= 1) {
						return false;
					}
					this.stream.read(this.in.data, 0, 2);
					this.in.pos = 0;
					this.psize = this.in.g2();
					var1 -= 2;
				}
				if (var1 < this.psize) {
					return false;
				}
				this.in.pos = 0;
				this.stream.read(this.in.data, 0, this.psize);
				this.timeoutTimer = 0;
				this.ptype2 = this.ptype1;
				this.ptype1 = this.ptype0;
				this.ptype0 = this.ptype;

				if (this.ptype == 46) {
					// IF_SETCOLOUR
					int var2 = this.in.g2();
					int var3 = this.in.g2_alt1();
					int var4 = var2 >> 10 & 0x1F;
					int var5 = var2 >> 5 & 0x1F;
					int var6 = var2 & 0x1F;
					IfType.list(var3).colour = (var4 << 19) + (var5 << 11) + (var6 << 3);
					this.ptype = -1;
					return true;
				}
				if (this.ptype == 152 || this.ptype == 20) {
					int var7 = this.centerZoneX;
					int var8 = this.centerZoneZ;
					if (this.ptype == 152) {
						// REBUILD_NORMAL
						var8 = this.in.g2_alt3();
						var7 = this.in.g2_alt3();
						this.sceneInstanced = false;
					}
					if (this.ptype == 20) {
						// REBUILD_REGION
						this.in.gbitstart();
						int var9 = 0;
						while (true) {
							if (var9 >= 4) {
								this.in.gbitend();
								var7 = this.in.g2();
								var8 = this.in.g2_alt1();
								this.sceneInstanced = true;
								break;
							}
							for (int var10 = 0; var10 < 13; var10++) {
								for (int var11 = 0; var11 < 13; var11++) {
									int var12 = this.in.gbit(1);
									if (var12 == 1) {
										this.sceneMapRegion[var9][var10][var11] = this.in.gbit(26);
									} else {
										this.sceneMapRegion[var9][var10][var11] = -1;
									}
								}
							}
							var9++;
						}
					}
					if (this.centerZoneX == var7 && this.centerZoneZ == var8 && this.sceneState == 2) {
						this.ptype = -1;
						return true;
					}
					this.centerZoneX = var7;
					this.centerZoneZ = var8;
					this.mapBuildBaseX = (this.centerZoneX - 6) * 8;
					this.mapBuildBaseZ = (this.centerZoneZ - 6) * 8;
					this.field628 = false;
					if ((this.centerZoneX / 8 == 48 || this.centerZoneX / 8 == 49) && this.centerZoneZ / 8 == 48) {
						this.field628 = true;
					}
					if (this.centerZoneX / 8 == 48 && this.centerZoneZ / 8 == 148) {
						this.field628 = true;
					}
					this.sceneState = 1;
					this.sceneLoadStartTime = System.currentTimeMillis();
					this.showPopupMessage(this.field607, "Loading - please wait.", null);
					if (this.ptype == 152) {
						int var13 = 0;
						int var14 = (this.centerZoneX - 6) / 8;
						label1241: while (true) {
							if (var14 > (this.centerZoneX + 6) / 8) {
								this.mapBuildGroundData = new byte[var13][];
								this.mapBuildLocationData = new byte[var13][];
								this.mapBuildIndex = new int[var13];
								this.mapBuildGroundFile = new int[var13];
								this.mapBuildLocationFile = new int[var13];
								int var16 = 0;
								int var17 = (this.centerZoneX - 6) / 8;
								while (true) {
									if (var17 > (this.centerZoneX + 6) / 8) {
										break label1241;
									}
									for (int var18 = (this.centerZoneZ - 6) / 8; var18 <= (this.centerZoneZ + 6) / 8; var18++) {
										this.mapBuildIndex[var16] = (var17 << 8) + var18;
										if (this.field628 && (var18 == 49 || var18 == 149 || var18 == 147 || var17 == 50 || var17 == 49 && var18 == 47)) {
											this.mapBuildGroundFile[var16] = -1;
											this.mapBuildLocationFile[var16] = -1;
											var16++;
										} else {
											int var19 = this.mapBuildGroundFile[var16] = this.onDemand.getMapFile(var18, var17, 0);
											if (var19 != -1) {
												this.onDemand.request(3, var19);
											}
											int var20 = this.mapBuildLocationFile[var16] = this.onDemand.getMapFile(var18, var17, 1);
											if (var20 != -1) {
												this.onDemand.request(3, var20);
											}
											var16++;
										}
									}
									var17++;
								}
							}
							for (int var15 = (this.centerZoneZ - 6) / 8; var15 <= (this.centerZoneZ + 6) / 8; var15++) {
								var13++;
							}
							var14++;
						}
					}
					if (this.ptype == 20) {
						int var21 = 0;
						int[] var22 = new int[676];
						int var23 = 0;
						label1200: while (true) {
							if (var23 >= 4) {
								this.mapBuildGroundData = new byte[var21][];
								this.mapBuildLocationData = new byte[var21][];
								this.mapBuildIndex = new int[var21];
								this.mapBuildGroundFile = new int[var21];
								this.mapBuildLocationFile = new int[var21];
								int var31 = 0;
								while (true) {
									if (var31 >= var21) {
										break label1200;
									}
									int var32 = this.mapBuildIndex[var31] = var22[var31];
									int var33 = var32 >> 8 & 0xFF;
									int var34 = var32 & 0xFF;
									int var35 = this.mapBuildGroundFile[var31] = this.onDemand.getMapFile(var34, var33, 0);
									if (var35 != -1) {
										this.onDemand.request(3, var35);
									}
									int var36 = this.mapBuildLocationFile[var31] = this.onDemand.getMapFile(var34, var33, 1);
									if (var36 != -1) {
										this.onDemand.request(3, var36);
									}
									var31++;
								}
							}
							for (int var24 = 0; var24 < 13; var24++) {
								for (int var25 = 0; var25 < 13; var25++) {
									int var26 = this.sceneMapRegion[var23][var24][var25];
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
					int var37 = this.mapBuildBaseX - this.field611;
					int var38 = this.mapBuildBaseZ - this.field612;
					this.field611 = this.mapBuildBaseX;
					this.field612 = this.mapBuildBaseZ;
					for (int var39 = 0; var39 < 16384; var39++) {
						ClientNpc var40 = this.npc[var39];
						if (var40 != null) {
							for (int var41 = 0; var41 < 10; var41++) {
								var40.routeX[var41] -= var37;
								var40.routeZ[var41] -= var38;
							}
							var40.x -= var37 * 128;
							var40.z -= var38 * 128;
						}
					}
					for (int var42 = 0; var42 < this.field562; var42++) {
						ClientPlayer var43 = this.players[var42];
						if (var43 != null) {
							for (int var44 = 0; var44 < 10; var44++) {
								var43.routeX[var44] -= var37;
								var43.routeZ[var44] -= var38;
							}
							var43.x -= var37 * 128;
							var43.z -= var38 * 128;
						}
					}
					this.awaitingPlayerinfo = true;
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
									this.groundObj[var55][var51][var52] = this.groundObj[var55][var53][var54];
								} else {
									this.groundObj[var55][var51][var52] = null;
								}
							}
						}
					}
					for (LocChange var56 = (LocChange) this.locChanges.head(); var56 != null; var56 = (LocChange) this.locChanges.next()) {
						var56.field854 -= var37;
						var56.field855 -= var38;
						if (var56.field854 < 0 || var56.field855 < 0 || var56.field854 >= 104 || var56.field855 >= 104) {
							var56.unlink();
						}
					}
					if (this.minimapFlagX != 0) {
						this.minimapFlagX -= var37;
						this.minimapFlagZ -= var38;
					}
					this.cinemaCam = false;
					this.ptype = -1;
					return true;
				}
				if (this.ptype == 5) {
					// LOGOUT
					this.logout();
					this.ptype = -1;
					return false;
				}
				if (this.ptype == 106) {
					// IF_SETOBJECT
					int var57 = this.in.g2_alt1();
					int var58 = this.in.g2();
					int var59 = this.in.g2();
					if (var57 == 65535) {
						IfType.list(var58).model1Type = 0;
						this.ptype = -1;
						return true;
					}
					ObjType var60 = ObjType.list(var57);
					IfType.list(var58).model1Type = 4;
					IfType.list(var58).model1Id = var57;
					IfType.list(var58).modelXAn = var60.xan2d;
					IfType.list(var58).modelYAn = var60.yan2d;
					IfType.list(var58).modelZoom = var60.zoom2d * 100 / var59;
					this.ptype = -1;
					return true;
				}
				if (this.ptype == 53) {
					int var61 = this.in.g2_alt3();
					int var62 = this.in.g2_alt1();
					IfType.list(var62).model1Type = 2;
					IfType.list(var62).model1Id = var61;
					this.ptype = -1;
					return true;
				}
				if (this.ptype == 192) {
					for (int var63 = 0; var63 < this.var.length; var63++) {
						if (this.var[var63] != this.field312[var63]) {
							this.var[var63] = this.field312[var63];
							this.clientVar(var63);
							this.redrawSidebar = true;
						}
					}
					this.ptype = -1;
					return true;
				}
				if (this.ptype == 16) {
					this.field485 = this.in.g1_alt1();
					this.field484 = this.in.g1_alt3();
					while (this.in.pos < this.psize) {
						int var64 = this.in.g1();
						this.zonePacket(398, var64, this.in);
					}
					this.ptype = -1;
					return true;
				}
				if (this.ptype == 128) {
					// UPDATE_STAT
					this.redrawSidebar = true;
					int var65 = this.in.g4_alt1();
					int var66 = this.in.g1_alt1();
					int var67 = this.in.g1_alt3();
					this.field213[var67] = var65;
					this.field601[var67] = var66;
					this.field641[var67] = 1;
					for (int var68 = 0; var68 < 98; var68++) {
						if (var65 >= skillxp[var68]) {
							this.field641[var67] = var68 + 2;
						}
					}
					this.ptype = -1;
					return true;
				}
				if (this.ptype == 205) {
					// LAST_LOGIN_INFO
					this.field352 = this.in.g4_alt1();
					this.field504 = this.in.g2();
					this.field510 = this.in.g2_alt1();
					this.unreadMessages = this.in.g2();
					this.field221 = this.in.g2_alt3();
					this.field344 = this.in.g1_alt1();
					this.field402 = this.in.g2_alt1();
					this.field376 = this.in.g2();
					this.field224 = this.in.g2_alt3();
					this.field413 = this.in.g2_alt2();
					this.field285 = this.in.g2();
					signlink.dnslookup(JString.formatIPv4(this.field352));
					this.ptype = -1;
					return true;
				}
				if (this.ptype == 125) {
					// IF_SETTAB_ACTIVE
					this.activeIcon = this.in.g1_alt1();
					this.redrawSidebar = true;
					this.rewdrawIcons = true;
					this.ptype = -1;
					return true;
				}
				if (this.ptype == 14) {
					int var69 = this.in.g2();
					this.ifAnimReset(var69);
					if (this.sideModealId != -1) {
						this.unloadIf(this.sideModealId);
						this.sideModealId = -1;
						this.redrawSidebar = true;
						this.rewdrawIcons = true;
					}
					if (this.chatComId != -1) {
						this.unloadIf(this.chatComId);
						this.chatComId = -1;
						this.redrawChatback = true;
					}
					if (this.field631 != -1) {
						this.unloadIf(this.field631);
						this.field631 = -1;
						this.redrawFrame = true;
					}
					if (this.field275 != -1) {
						this.unloadIf(this.field275);
						this.field275 = -1;
					}
					if (this.mainModalId != var69) {
						this.unloadIf(this.mainModalId);
						this.mainModalId = var69;
					}
					if (this.dialogueInputOpen != 0) {
						this.dialogueInputOpen = 0;
						this.redrawChatback = true;
					}
					this.field446 = false;
					this.ptype = -1;
					return true;
				}
				if (this.ptype == 129) {
					// TUT_FLASH
					this.tutFlashIcon = this.in.g1();
					if (this.tutFlashIcon == this.activeIcon) {
						if (this.tutFlashIcon == 3) {
							this.activeIcon = 1;
						} else {
							this.activeIcon = 3;
						}
						this.redrawSidebar = true;
					}
					this.ptype = -1;
					return true;
				}
				if (this.ptype == 136) {
					boolean var70 = this.in.g1_alt3() == 1;
					int var71 = this.in.g2();
					IfType.list(var71).hide = var70;
					this.ptype = -1;
					return true;
				}
				if (this.ptype == 15) {
					int var72 = this.in.g2();
					int var73 = this.in.g2_alt2();
					this.ifAnimReset(var72);
					if (var73 != -1) {
						this.ifAnimReset(var73);
					}
					if (this.mainModalId != -1) {
						this.unloadIf(this.mainModalId);
						this.mainModalId = -1;
					}
					if (this.sideModealId != -1) {
						this.unloadIf(this.sideModealId);
						this.sideModealId = -1;
					}
					if (this.chatComId != -1) {
						this.unloadIf(this.chatComId);
						this.chatComId = -1;
					}
					if (this.field631 != var72) {
						this.unloadIf(this.field631);
						this.field631 = var72;
					}
					if (this.field275 != var72) {
						this.unloadIf(this.field275);
						this.field275 = var73;
					}
					this.dialogueInputOpen = 0;
					this.field446 = false;
					this.ptype = -1;
					return true;
				}
				if (this.ptype == 104) {
					// SYNTH_SOUND
					int var74 = this.in.g2();
					int var75 = this.in.g1();
					int var76 = this.in.g2();
					if (this.waveEnabled && !lowMem && this.waveCount < 50) {
						this.waveIds[this.waveCount] = var74;
						this.waveLoops[this.waveCount] = var75;
						this.waveDelay[this.waveCount] = var76 + JagFX.delays[var74];
						this.waveCount++;
					}
					this.ptype = -1;
					return true;
				}
				if (this.ptype == 181) {
					// CAM_MOVETO
					this.cinemaCam = true;
					this.camMoveToLx = this.in.g1();
					this.camMoveToLz = this.in.g1();
					this.field369 = this.in.g2();
					this.camMoveToRate = this.in.g1();
					this.camMoveToRate2 = this.in.g1();
					if (this.camMoveToRate2 >= 100) {
						this.camX = this.camMoveToLx * 128 + 64;
						this.camZ = this.camMoveToLz * 128 + 64;
						this.camY = this.getAvH(this.camX, this.camZ, this.minusedlevel) - this.field369;
					}
					this.ptype = -1;
					return true;
				}
				if (this.ptype == 56) {
					int var77 = this.in.g2_alt2();
					int var78 = this.in.g2_alt1();
					int var79 = this.in.g2();
					int var80 = this.in.g2_alt3();
					IfType.list(var79).modelXAn = var78;
					IfType.list(var79).modelYAn = var77;
					IfType.list(var79).modelZoom = var80;
					this.ptype = -1;
					return true;
				}
				if (this.ptype == 40 || this.ptype == 2 || this.ptype == 255 || this.ptype == 65 || this.ptype == 175 || this.ptype == 146 || this.ptype == 121 || this.ptype == 250 || this.ptype == 126 || this.ptype == 164 || this.ptype == 198) {
					this.zonePacket(398, this.ptype, this.in);
					this.ptype = -1;
					return true;
				}
				if (this.ptype == 158) {
					int var81 = this.in.g2();
					int var82 = this.in.g2_alt3();
					int var83 = this.in.g2_alt1();
					IfType.list(var81).field912 = (var83 << 16) + var82;
					this.ptype = -1;
					return true;
				}
				if (this.ptype == 114) {
					this.socialInputOpen = false;
					this.dialogueInputOpen = 1;
					this.field195 = "";
					this.redrawChatback = true;
					this.ptype = -1;
					return true;
				}
				if (this.ptype == 251) {
					this.field556 = this.in.g2_alt1();
					this.field403 = this.in.g1_alt3();
					this.ptype = -1;
					return true;
				}
				if (this.ptype == 150) {
					byte var84 = this.in.g1b();
					int var85 = this.in.g2();
					this.field312[var85] = var84;
					if (this.var[var85] != var84) {
						this.var[var85] = var84;
						this.clientVar(var85);
						this.redrawSidebar = true;
						if (this.field629 != -1) {
							this.redrawChatback = true;
						}
					}
					this.ptype = -1;
					return true;
				}
				if (this.ptype == 216) {
					// SET_PLAYER_OP
					int var86 = this.in.g1();
					int var87 = this.in.g1_alt3();
					String var88 = this.in.gstr();
					if (var86 >= 1 && var86 <= 5) {
						if (var88.equalsIgnoreCase("null")) {
							var88 = null;
						}
						this.playerOp[var86 - 1] = var88;
						this.playerOpPriority[var86 - 1] = var87 == 0;
					}
					this.ptype = -1;
					return true;
				}
				if (this.ptype == 179) {
					// UPDATE_RUNWEIGHT
					if (this.activeIcon == 12) {
						this.redrawSidebar = true;
					}
					this.runweight = this.in.g2b();
					this.ptype = -1;
					return true;
				}
				if (this.ptype == 35) {
					int var89 = this.in.g2_alt2();
					int var90 = this.in.g2();
					IfType var91 = IfType.list(var90);
					if (var91 != null && var91.type == 0) {
						if (var89 < 0) {
							var89 = 0;
						}
						if (var89 > var91.scrollheight - var91.height) {
							var89 = var91.scrollheight - var91.height;
						}
						var91.scrollPos = var89;
					}
					this.ptype = -1;
					return true;
				}
				if (this.ptype == 137) {
					this.cinemaCam = false;
					for (int var92 = 0; var92 < 5; var92++) {
						this.camShake[var92] = false;
					}
					this.ptype = -1;
					return true;
				}
				if (this.ptype == 124) {
					this.socialInputOpen = false;
					this.dialogueInputOpen = 2;
					this.field195 = "";
					this.redrawChatback = true;
					this.ptype = -1;
					return true;
				}
				if (this.ptype == 253) {
					if (this.sideModealId != -1) {
						this.unloadIf(this.sideModealId);
						this.sideModealId = -1;
						this.redrawSidebar = true;
						this.rewdrawIcons = true;
					}
					if (this.chatComId != -1) {
						this.unloadIf(this.chatComId);
						this.chatComId = -1;
						this.redrawChatback = true;
					}
					if (this.field631 != -1) {
						this.unloadIf(this.field631);
						this.field631 = -1;
						this.redrawFrame = true;
					}
					if (this.field275 != -1) {
						this.unloadIf(this.field275);
						this.field275 = -1;
					}
					if (this.mainModalId != -1) {
						this.unloadIf(this.mainModalId);
						this.mainModalId = -1;
					}
					if (this.dialogueInputOpen != 0) {
						this.dialogueInputOpen = 0;
						this.redrawChatback = true;
					}
					this.field446 = false;
					this.ptype = -1;
					return true;
				}
				if (this.ptype == 100) {
					this.field618 = this.in.g1();
					this.ptype = -1;
					return true;
				}
				if (this.ptype == 241) {
					// UPDATE_ZONE_FULL_FOLLOWS
					this.field484 = this.in.g1_alt2();
					this.field485 = this.in.g1_alt2();
					for (int var93 = this.field484; var93 < this.field484 + 8; var93++) {
						for (int var94 = this.field485; var94 < this.field485 + 8; var94++) {
							if (this.groundObj[this.minusedlevel][var93][var94] != null) {
								this.groundObj[this.minusedlevel][var93][var94] = null;
								this.showObj(var93, var94);
							}
						}
					}
					for (LocChange var95 = (LocChange) this.locChanges.head(); var95 != null; var95 = (LocChange) this.locChanges.next()) {
						if (var95.field854 >= this.field484 && var95.field854 < this.field484 + 8 && var95.field855 >= this.field485 && var95.field855 < this.field485 + 8 && var95.field852 == this.minusedlevel) {
							var95.endTime = 0;
						}
					}
					this.ptype = -1;
					return true;
				}
				if (this.ptype == 172) {
					// NPC_INFO
					this.getNpcPos(this.psize, this.in);
					this.ptype = -1;
					return true;
				}
				if (this.ptype == 219) {
					// MINIMAP_TOGGLE
					this.minimapState = this.in.g1();
					this.ptype = -1;
					return true;
				}
				if (this.ptype == 148) {
					// CHAT_FILTER_SETTINGS
					this.chatPublicMode = this.in.g1();
					this.chatPrivatemode = this.in.g1();
					this.chatTradeMode = this.in.g1();
					this.redrawChatMode = true;
					this.redrawChatback = true;
					this.ptype = -1;
					return true;
				}
				if (this.ptype == 49) {
					int var96 = this.in.g1_alt1();
					int var97 = this.in.g2();
					if (var97 == 65535) {
						var97 = -1;
					}
					if (this.sideIcon[var96] != var97) {
						this.unloadIf(this.sideIcon[var96]);
						this.sideIcon[var96] = var97;
					}
					this.redrawSidebar = true;
					this.rewdrawIcons = true;
					this.ptype = -1;
					return true;
				}
				if (this.ptype == 52) {
					this.minimapFlagX = 0;
					this.ptype = -1;
					return true;
				}
				if (this.ptype == 223) {
					String var98 = this.in.gstr();
					int var99 = this.in.g2_alt1();
					IfType.list(var99).text = var98;
					int var10001 = this.sideIcon[this.activeIcon];
					if (IfType.list(var99).layerId == var10001) {
						this.redrawSidebar = true;
					}
					this.ptype = -1;
					return true;
				}
				if (this.ptype == 206) {
					// UPDATE_INV_FULL
					this.redrawSidebar = true;
					int var100 = this.in.g2();
					IfType var101 = IfType.list(var100);
					int var102 = this.in.g2();
					for (int var103 = 0; var103 < var102; var103++) {
						var101.linkObjType[var103] = this.in.g2();
						int var104 = this.in.g1_alt1();
						if (var104 == 255) {
							var104 = this.in.g4();
						}
						var101.linkObjNumber[var103] = var104;
					}
					for (int var105 = var102; var105 < var101.linkObjType.length; var105++) {
						var101.linkObjType[var105] = 0;
						var101.linkObjNumber[var105] = 0;
					}
					this.ptype = -1;
					return true;
				}
				if (this.ptype == 84) {
					int var106 = this.in.g2_alt2();
					int var107 = this.in.g2();
					IfType.list(var107).model1Type = 1;
					IfType.list(var107).model1Id = var106;
					this.ptype = -1;
					return true;
				}
				if (this.ptype == 96) {
					// CAM_LOOKAT
					this.cinemaCam = true;
					this.camLookAtLx = this.in.g1();
					this.camLookAtLz = this.in.g1();
					this.camLookAtHei = this.in.g2();
					this.CamLookAtRate = this.in.g1();
					this.camLookAtRate2 = this.in.g1();
					if (this.camLookAtRate2 >= 100) {
						int var108 = this.camLookAtLx * 128 + 64;
						int var109 = this.camLookAtLz * 128 + 64;
						int var110 = this.getAvH(var108, var109, this.minusedlevel) - this.camLookAtHei;
						int var111 = var108 - this.camX;
						int var112 = var110 - this.camY;
						int var113 = var109 - this.camZ;
						int var114 = (int) Math.sqrt((double) (var111 * var111 + var113 * var113));
						this.camPitch = (int) (Math.atan2((double) var112, (double) var114) * 325.949D) & 0x7FF;
						this.camYaw = (int) (Math.atan2((double) var111, (double) var113) * -325.949D) & 0x7FF;
						if (this.camPitch < 128) {
							this.camPitch = 128;
						}
						if (this.camPitch > 383) {
							this.camPitch = 383;
						}
					}
					this.ptype = -1;
					return true;
				}
				if (this.ptype == 86) {
					int var115 = this.in.g1();
					int var116 = this.in.g1();
					int var117 = this.in.g1();
					int var118 = this.in.g1();
					this.camShake[var115] = true;
					this.field592[var115] = var116;
					this.CamShakeRan[var115] = var117;
					this.field183[var115] = var118;
					this.field400[var115] = 0;
					this.ptype = -1;
					return true;
				}
				if (this.ptype == 32) {
					int var119 = this.in.g2();
					int var120 = this.in.g4_alt3(this.field326);
					this.field312[var119] = var120;
					if (this.var[var119] != var120) {
						this.var[var119] = var120;
						this.clientVar(var119);
						this.redrawSidebar = true;
						if (this.field629 != -1) {
							this.redrawChatback = true;
						}
					}
					this.ptype = -1;
					return true;
				}
				if (this.ptype == 197) {
					// UPDATE_FRIENDLIST
					long var121 = this.in.g8();
					int var123 = this.in.g1();
					String var124 = JString.toSentenceCase(JString.toRawUsername(var121));
					for (int var125 = 0; var125 < this.friendCount; var125++) {
						if (var121 == this.friendUserhash[var125]) {
							if (this.friendNodeId[var125] != var123) {
								this.friendNodeId[var125] = var123;
								this.redrawSidebar = true;
								if (var123 > 0) {
									this.addChat(5, var124 + " has logged in.", "");
								}
								if (var123 == 0) {
									this.addChat(5, var124 + " has logged out.", "");
								}
							}
							var124 = null;
							break;
						}
					}
					if (var124 != null && this.friendCount < 200) {
						this.friendUserhash[this.friendCount] = var121;
						this.friendUsername[this.friendCount] = var124;
						this.friendNodeId[this.friendCount] = var123;
						this.friendCount++;
						this.redrawSidebar = true;
					}
					boolean var126 = false;
					while (!var126) {
						var126 = true;
						for (int var127 = 0; var127 < this.friendCount - 1; var127++) {
							if (this.friendNodeId[var127] != nodeId && this.friendNodeId[var127 + 1] == nodeId || this.friendNodeId[var127] == 0 && this.friendNodeId[var127 + 1] != 0) {
								int var128 = this.friendNodeId[var127];
								this.friendNodeId[var127] = this.friendNodeId[var127 + 1];
								this.friendNodeId[var127 + 1] = var128;
								String var129 = this.friendUsername[var127];
								this.friendUsername[var127] = this.friendUsername[var127 + 1];
								this.friendUsername[var127 + 1] = var129;
								long var130 = this.friendUserhash[var127];
								this.friendUserhash[var127] = this.friendUserhash[var127 + 1];
								this.friendUserhash[var127 + 1] = var130;
								this.redrawSidebar = true;
								var126 = false;
							}
						}
					}
					this.ptype = -1;
					return true;
				}
				if (this.ptype == 71) {
					int var132 = this.in.g2_alt1();
					this.ifAnimReset(var132);
					if (this.chatComId != -1) {
						this.unloadIf(this.chatComId);
						this.chatComId = -1;
						this.redrawChatback = true;
					}
					if (this.field631 != -1) {
						this.unloadIf(this.field631);
						this.field631 = -1;
						this.redrawFrame = true;
					}
					if (this.field275 != -1) {
						this.unloadIf(this.field275);
						this.field275 = -1;
					}
					if (this.mainModalId != -1) {
						this.unloadIf(this.mainModalId);
						this.mainModalId = -1;
					}
					if (this.sideModealId != var132) {
						this.unloadIf(this.sideModealId);
						this.sideModealId = var132;
					}
					if (this.dialogueInputOpen != 0) {
						this.dialogueInputOpen = 0;
						this.redrawChatback = true;
					}
					this.redrawSidebar = true;
					this.rewdrawIcons = true;
					this.field446 = false;
					this.ptype = -1;
					return true;
				}
				if (this.ptype == 229) {
					int var133 = this.in.g2();
					if (var133 == 65535) {
						var133 = -1;
					}
					if (var133 != this.nextMidiSong && this.field379 && !lowMem && this.nextMidiDelay == 0) {
						this.midiSong = var133;
						this.midiFading = true;
						this.onDemand.request(2, this.midiSong);
					}
					this.nextMidiSong = var133;
					this.ptype = -1;
					return true;
				}
				if (this.ptype == 22) {
					int var134 = this.in.g3_alt3();
					int var135 = this.in.g2_alt1();
					if (this.field379 && !lowMem) {
						this.midiSong = var135;
						this.midiFading = false;
						this.onDemand.request(2, this.midiSong);
						this.nextMidiDelay = var134;
					}
					this.ptype = -1;
					return true;
				}
				if (this.ptype == 66) {
					int var136 = this.in.g2();
					IfType var137 = IfType.list(var136);
					for (int var138 = 0; var138 < var137.linkObjType.length; var138++) {
						var137.linkObjType[var138] = -1;
						var137.linkObjType[var138] = 0;
					}
					this.ptype = -1;
					return true;
				}
				if (this.ptype == 165) {
					// UPDATE_RUNENERGY
					if (this.activeIcon == 12) {
						this.redrawSidebar = true;
					}
					this.runenergy = this.in.g1();
					this.ptype = -1;
					return true;
				}
				if (this.ptype == 118) {
					int var139 = this.in.g2_alt2();
					this.ifAnimReset(var139);
					if (this.sideModealId != -1) {
						this.unloadIf(this.sideModealId);
						this.sideModealId = -1;
						this.redrawSidebar = true;
						this.rewdrawIcons = true;
					}
					if (this.field631 != -1) {
						this.unloadIf(this.field631);
						this.field631 = -1;
						this.redrawFrame = true;
					}
					if (this.field275 != -1) {
						this.unloadIf(this.field275);
						this.field275 = -1;
					}
					if (this.mainModalId != -1) {
						this.unloadIf(this.mainModalId);
						this.mainModalId = -1;
					}
					if (this.chatComId != var139) {
						this.unloadIf(this.chatComId);
						this.chatComId = var139;
					}
					this.field446 = false;
					this.redrawChatback = true;
					this.ptype = -1;
					return true;
				}
				if (this.ptype == 168) {
					for (int var140 = 0; var140 < this.players.length; var140++) {
						if (this.players[var140] != null) {
							this.players[var140].primaryAnim = -1;
						}
					}
					for (int var141 = 0; var141 < this.npc.length; var141++) {
						if (this.npc[var141] != null) {
							this.npc[var141].primaryAnim = -1;
						}
					}
					this.ptype = -1;
					return true;
				}
				if (this.ptype == 25) {
					this.friendServerStatus = this.in.g1();
					this.redrawSidebar = true;
					this.ptype = -1;
					return true;
				}
				if (this.ptype == 242) {
					// MESSAGE_GAME
					String var142 = this.in.gstr();
					if (var142.endsWith(":tradereq:")) {
						String var143 = var142.substring(0, var142.indexOf(":"));
						long var144 = JString.toUserhash(var143);
						boolean var146 = false;
						for (int var147 = 0; var147 < this.ignoreCount; var147++) {
							if (this.ignoreUserhash[var147] == var144) {
								var146 = true;
								break;
							}
						}
						if (!var146 && this.chatDisabled == 0) {
							this.addChat(4, "wishes to trade with you.", var143);
						}
					} else if (var142.endsWith(":duelreq:")) {
						String var148 = var142.substring(0, var142.indexOf(":"));
						long var149 = JString.toUserhash(var148);
						boolean var151 = false;
						for (int var152 = 0; var152 < this.ignoreCount; var152++) {
							if (this.ignoreUserhash[var152] == var149) {
								var151 = true;
								break;
							}
						}
						if (!var151 && this.chatDisabled == 0) {
							this.addChat(8, "wishes to duel with you.", var148);
						}
					} else if (var142.endsWith(":chalreq:")) {
						String var153 = var142.substring(0, var142.indexOf(":"));
						long var154 = JString.toUserhash(var153);
						boolean var156 = false;
						for (int var157 = 0; var157 < this.ignoreCount; var157++) {
							if (this.ignoreUserhash[var157] == var154) {
								var156 = true;
								break;
							}
						}
						if (!var156 && this.chatDisabled == 0) {
							String var158 = var142.substring(var142.indexOf(":") + 1, var142.length() - 9);
							this.addChat(8, var158, var153);
						}
					} else {
						this.addChat(0, var142, "");
					}
					this.ptype = -1;
					return true;
				}
				if (this.ptype == 62) {
					int var159 = this.in.g2();
					int var160 = this.in.g2_alt2();
					if (this.chatComId != -1) {
						this.unloadIf(this.chatComId);
						this.chatComId = -1;
						this.redrawChatback = true;
					}
					if (this.field631 != -1) {
						this.unloadIf(this.field631);
						this.field631 = -1;
						this.redrawFrame = true;
					}
					if (this.field275 != -1) {
						this.unloadIf(this.field275);
						this.field275 = -1;
					}
					if (this.mainModalId != var160) {
						this.unloadIf(this.mainModalId);
						this.mainModalId = var160;
					}
					if (this.sideModealId != var159) {
						this.unloadIf(this.sideModealId);
						this.sideModealId = var159;
					}
					if (this.dialogueInputOpen != 0) {
						this.dialogueInputOpen = 0;
						this.redrawChatback = true;
					}
					this.redrawSidebar = true;
					this.rewdrawIcons = true;
					this.field446 = false;
					this.ptype = -1;
					return true;
				}
				if (this.ptype == 190) {
					// UPDATE_REBOOT_TIMER
					this.rebootTimer = this.in.g2_alt3() * 30;
					this.ptype = -1;
					return true;
				}
				if (this.ptype == 30) {
					// IF_SETPLAYERHEAD
					int var161 = this.in.g2_alt2();
					IfType.list(var161).model1Type = 3;
					if (localPlayer.transmog == null) {
						IfType.list(var161).model1Id = (localPlayer.field112[0] << 25) + (localPlayer.field112[4] << 20) + (localPlayer.appearance[0] << 15) + (localPlayer.appearance[8] << 10) + (localPlayer.appearance[11] << 5) + localPlayer.appearance[1];
					} else {
						IfType.list(var161).model1Id = (int) (localPlayer.transmog.id + 305419896L);
					}
					this.ptype = -1;
					return true;
				}
				if (this.ptype == 144) {
					int var162 = this.in.g2b_alt1();
					if (var162 != this.field629) {
						this.unloadIf(this.field629);
						this.field629 = var162;
					}
					this.redrawChatback = true;
					this.ptype = -1;
					return true;
				}
				if (this.ptype == 60) {
					int var163 = this.in.g2b_alt2();
					if (var163 >= 0) {
						this.ifAnimReset(var163);
					}
					if (var163 != this.mainOverlayId) {
						this.unloadIf(this.mainOverlayId);
						this.mainOverlayId = var163;
					}
					this.ptype = -1;
					return true;
				}
				if (this.ptype == 58) {
					// UPDATE_IGNORELIST
					this.ignoreCount = this.psize / 8;
					for (int var164 = 0; var164 < this.ignoreCount; var164++) {
						this.ignoreUserhash[var164] = this.in.g8();
					}
					this.ptype = -1;
					return true;
				}
				if (this.ptype == 37) {
					// PLAYER_INFO
					this.getPlayerPos(this.in, this.psize);
					this.awaitingPlayerinfo = false;
					this.ptype = -1;
					return true;
				}
				if (this.ptype == 64) {
					int var165 = this.in.g2();
					int var166 = this.in.g2b_alt1();
					int var167 = this.in.g2b_alt3();
					IfType var168 = IfType.list(var165);
					var168.field937 = var166;
					var168.field907 = var167;
					this.ptype = -1;
					return true;
				}
				if (this.ptype == 153) {
					// HINT_ARROW
					this.hintType = this.in.g1();
					if (this.hintType == 1) {
						this.field570 = this.in.g2();
					}
					if (this.hintType >= 2 && this.hintType <= 6) {
						if (this.hintType == 2) {
							this.field167 = 64;
							this.field168 = 64;
						}
						if (this.hintType == 3) {
							this.field167 = 0;
							this.field168 = 64;
						}
						if (this.hintType == 4) {
							this.field167 = 128;
							this.field168 = 64;
						}
						if (this.hintType == 5) {
							this.field167 = 64;
							this.field168 = 0;
						}
						if (this.hintType == 6) {
							this.field167 = 64;
							this.field168 = 128;
						}
						this.hintType = 2;
						this.field164 = this.in.g2();
						this.field165 = this.in.g2();
						this.field166 = this.in.g1();
					}
					if (this.hintType == 10) {
						this.field245 = this.in.g2();
					}
					this.ptype = -1;
					return true;
				}
				if (this.ptype == 1) {
					int var169 = this.in.g2b_alt1();
					int var170 = this.in.g2_alt1();
					IfType var171 = IfType.list(var170);
					if (var171.modelAnim != var169 || var169 == -1) {
						var171.modelAnim = var169;
						var171.animFrame = 0;
						var171.animCycle = 0;
					}
					this.ptype = -1;
					return true;
				}
				if (this.ptype == 243) {
					this.field485 = this.in.g1();
					this.field484 = this.in.g1_alt1();
					this.ptype = -1;
					return true;
				}
				if (this.ptype == 176) {
					// MESSAGE_PRIVATE
					long var172 = this.in.g8();
					int var174 = this.in.g4();
					int var175 = this.in.g1();
					boolean var176 = false;
					for (int var177 = 0; var177 < 100; var177++) {
						if (this.field339[var177] == var174) {
							var176 = true;
							break;
						}
					}
					if (var175 <= 1) {
						for (int var178 = 0; var178 < this.ignoreCount; var178++) {
							if (this.ignoreUserhash[var178] == var172) {
								var176 = true;
								break;
							}
						}
					}
					if (!var176 && this.chatDisabled == 0) {
						try {
							this.field339[this.field497] = var174;
							this.field497 = (this.field497 + 1) % 100;
							String var179 = WordPack.unpack(this.in, this.psize - 13);
							if (var175 != 3) {
								var179 = WordFilter.method486(this.field552, var179);
							}
							if (var175 == 2 || var175 == 3) {
								this.addChat(7, var179, "@cr2@" + JString.toSentenceCase(JString.toRawUsername(var172)));
							} else if (var175 == 1) {
								this.addChat(7, var179, "@cr1@" + JString.toSentenceCase(JString.toRawUsername(var172)));
							} else {
								this.addChat(3, var179, JString.toSentenceCase(JString.toRawUsername(var172)));
							}
						} catch (Exception var190) {
							signlink.reporterror("cde1");
						}
					}
					this.ptype = -1;
					return true;
				}
				if (this.ptype == 89) {
					// UPDATE_INV_PARTIAL
					this.redrawSidebar = true;
					int var181 = this.in.g2();
					IfType var182 = IfType.list(var181);
					while (this.in.pos < this.psize) {
						int var183 = this.in.gsmart();
						int var184 = this.in.g2();
						int var185 = this.in.g1();
						if (var185 == 255) {
							var185 = this.in.g4();
						}
						if (var183 >= 0 && var183 < var182.linkObjType.length) {
							var182.linkObjType[var183] = var184;
							var182.linkObjNumber[var183] = var185;
						}
					}
					this.ptype = -1;
					return true;
				}
				signlink.reporterror("T1 - " + this.ptype + "," + this.psize + " - " + this.ptype1 + "," + this.ptype2);
				this.logout();
			} catch (IOException var191) {
				this.lostCon();
			} catch (Exception var192) {
				String var187 = "T2 - " + this.ptype + "," + this.ptype1 + "," + this.ptype2 + " - " + this.psize + "," + (this.mapBuildBaseX + localPlayer.routeX[0]) + "," + (this.mapBuildBaseZ + localPlayer.routeZ[0]) + " - ";
				for (int var188 = 0; var188 < this.psize && var188 < 50; var188++) {
					var187 = var187 + this.in.data[var188] + ",";
				}
				signlink.reporterror(var187);
				this.logout();
			}
			return true;
		} catch (RuntimeException var193) {
			signlink.reporterror("43573, " + ", " + var193.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.b(IILEILHLJCE;)V")
	public void zonePacket(int arg0, int arg1, Packet arg2) {
		try {
			boolean var125 = false;
			if (arg1 == 126) {
				int var4 = arg2.g2();
				int var5 = arg2.g1_alt2();
				int var6 = var5 >> 2;
				int var7 = var5 & 0x3;
				int var8 = this.field307[var6];
				int var9 = arg2.g1_alt1();
				int var10 = this.field484 + (var9 >> 4 & 0x7);
				int var11 = this.field485 + (var9 & 0x7);
				if (var10 >= 0 && var11 >= 0 && var10 < 103 && var11 < 103) {
					int var12 = this.groundh[this.minusedlevel][var10][var11];
					int var13 = this.groundh[this.minusedlevel][var10 + 1][var11];
					int var14 = this.groundh[this.minusedlevel][var10 + 1][var11 + 1];
					int var15 = this.groundh[this.minusedlevel][var10][var11 + 1];
					if (var8 == 0) {
						Wall var16 = this.world.method550(this.minusedlevel, var10, var11);
						if (var16 != null) {
							int var17 = var16.field1163 >> 14 & 0x7FFF;
							if (var6 == 2) {
								var16.field1161 = new ClientLocAnim(var17, 2, var13, var4, var15, false, var7 + 4, var14, (byte) -59, var12);
								var16.field1162 = new ClientLocAnim(var17, 2, var13, var4, var15, false, var7 + 1 & 0x3, var14, (byte) -59, var12);
							} else {
								var16.field1161 = new ClientLocAnim(var17, var6, var13, var4, var15, false, var7, var14, (byte) -59, var12);
							}
						}
					}
					if (var8 == 1) {
						Decor var18 = this.world.method551(var11, this.minusedlevel, var10);
						if (var18 != null) {
							var18.model = new ClientLocAnim(var18.field1112 >> 14 & 0x7FFF, 4, var13, var4, var15, false, 0, var14, (byte) -59, var12);
						}
					}
					if (var8 == 2) {
						Sprite var19 = this.world.method552(this.minusedlevel, var10, var11);
						if (var6 == 11) {
							var6 = 10;
						}
						if (var19 != null) {
							var19.model = new ClientLocAnim(var19.field1311 >> 14 & 0x7FFF, var6, var13, var4, var15, false, var7, var14, (byte) -59, var12);
						}
					}
					if (var8 == 3) {
						GroundDecor var20 = this.world.method553(var11, this.minusedlevel, this.field272, var10);
						if (var20 != null) {
							var20.model = new ClientLocAnim(var20.field982 >> 14 & 0x7FFF, 22, var13, var4, var15, false, var7, var14, (byte) -59, var12);
						}
					}
				}
			} else if (arg1 == 121) {
				int var21 = arg2.g1_alt3();
				int var22 = this.field484 + (var21 >> 4 & 0x7);
				int var23 = this.field485 + (var21 & 0x7);
				int var24 = arg2.g2_alt3();
				if (var22 >= 0 && var23 >= 0 && var22 < 104 && var23 < 104) {
					LinkList var25 = this.groundObj[this.minusedlevel][var22][var23];
					if (var25 != null) {
						for (ClientObj var26 = (ClientObj) var25.head(); var26 != null; var26 = (ClientObj) var25.next()) {
							if (var26.id == (var24 & 0x7FFF)) {
								var26.unlink();
								break;
							}
						}
						if (var25.head() == null) {
							this.groundObj[this.minusedlevel][var22][var23] = null;
						}
						this.showObj(var22, var23);
					}
				}
			} else if (arg1 == 2) {
				int var27 = arg2.g1();
				int var28 = this.field484 + (var27 >> 4 & 0x7);
				int var29 = this.field485 + (var27 & 0x7);
				int var30 = arg2.g2();
				int var31 = arg2.g2();
				int var32 = arg2.g2();
				if (var28 >= 0 && var29 >= 0 && var28 < 104 && var29 < 104) {
					LinkList var33 = this.groundObj[this.minusedlevel][var28][var29];
					if (var33 != null) {
						for (ClientObj var34 = (ClientObj) var33.head(); var34 != null; var34 = (ClientObj) var33.next()) {
							if (var34.id == (var30 & 0x7FFF) && var34.count == var31) {
								var34.count = var32;
								break;
							}
						}
						this.showObj(var28, var29);
					}
				}
			} else if (arg1 == 198) {
				int var35 = arg2.g1_alt3();
				int var36 = this.field484 + (var35 >> 4 & 0x7);
				int var37 = this.field485 + (var35 & 0x7);
				int var38 = arg2.g2();
				int var39 = arg2.g1_alt2();
				int var40 = var39 >> 2;
				int var41 = var39 & 0x3;
				int var42 = this.field307[var40];
				if (var36 >= 0 && var37 >= 0 && var36 < 104 && var37 < 104) {
					this.locChangeCreate(var37, var36, this.minusedlevel, var42, var38, var41, -1, 0, var40);
				}
			} else if (arg1 == 146) {
				int var43 = arg2.g1();
				int var44 = this.field484 + (var43 >> 4 & 0x7);
				int var45 = this.field485 + (var43 & 0x7);
				int var46 = var44 + arg2.g1b();
				int var47 = var45 + arg2.g1b();
				int var48 = arg2.g2b();
				int var49 = arg2.g2();
				int var50 = arg2.g1() * 4;
				int var51 = arg2.g1() * 4;
				int var52 = arg2.g2();
				int var53 = arg2.g2();
				int var54 = arg2.g1();
				int var55 = arg2.g1();
				if (var44 >= 0 && var45 >= 0 && var44 < 104 && var45 < 104 && var46 >= 0 && var47 >= 0 && var46 < 104 && var47 < 104 && var49 != 65535) {
					int var56 = var44 * 128 + 64;
					int var57 = var45 * 128 + 64;
					int var58 = var46 * 128 + 64;
					int var59 = var47 * 128 + 64;
					ClientProj var60 = new ClientProj(var51, var53 + loopCycle, var54, var48, var55, this.minusedlevel, 922, var56, var52 + loopCycle, this.getAvH(var56, var57, this.minusedlevel) - var50, var57, var49);
					var60.setTarget(var59, var52 + loopCycle, var58, this.getAvH(var58, var59, this.minusedlevel) - var51);
					this.projectiles.push(var60);
				}
			} else {
				if (arg1 == 255) {
					int var61 = arg2.g2_alt1();
					byte var62 = arg2.g1b_alt2();
					int var63 = arg2.g2_alt2();
					byte var64 = arg2.g1b_alt3();
					byte var65 = arg2.g1b_alt3();
					int var66 = arg2.g1();
					int var67 = this.field484 + (var66 >> 4 & 0x7);
					int var68 = this.field485 + (var66 & 0x7);
					int var69 = arg2.g2_alt3();
					int var70 = arg2.g1_alt3();
					int var71 = var70 >> 2;
					int var72 = var70 & 0x3;
					int var73 = this.field307[var71];
					byte var74 = arg2.g1b_alt1();
					int var75 = arg2.g2_alt3();
					ClientPlayer var76;
					if (var61 == this.field556) {
						var76 = localPlayer;
					} else {
						var76 = this.players[var61];
					}
					if (var76 != null) {
						LocType var77 = LocType.list(var75);
						int var78 = this.groundh[this.minusedlevel][var67][var68];
						int var79 = this.groundh[this.minusedlevel][var67 + 1][var68];
						int var80 = this.groundh[this.minusedlevel][var67 + 1][var68 + 1];
						int var81 = this.groundh[this.minusedlevel][var67][var68 + 1];
						Model var82 = var77.getModel(var71, var72, var78, var79, var80, var81, -1);
						if (var82 != null) {
							this.locChangeCreate(var68, var67, this.minusedlevel, var73, -1, 0, var69 + 1, var63 + 1, 0);
							var76.locStartCycle = var63 + loopCycle;
							var76.locStopCycle = var69 + loopCycle;
							var76.locModel = var82;
							int var83 = var77.width;
							int var84 = var77.length;
							if (var72 == 1 || var72 == 3) {
								var83 = var77.length;
								var84 = var77.width;
							}
							var76.field123 = var67 * 128 + var83 * 64;
							var76.field125 = var68 * 128 + var84 * 64;
							var76.field124 = this.getAvH(var76.field123, var76.field125, this.minusedlevel);
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
					int var87 = arg2.g1_alt2();
					int var88 = this.field484 + (var87 >> 4 & 0x7);
					int var89 = this.field485 + (var87 & 0x7);
					int var90 = arg2.g1();
					int var91 = var90 >> 2;
					int var92 = var90 & 0x3;
					int var93 = this.field307[var91];
					if (var88 >= 0 && var89 >= 0 && var88 < 104 && var89 < 104) {
						this.locChangeCreate(var89, var88, this.minusedlevel, var93, -1, var92, -1, 0, var91);
					}
				} else if (arg1 == 250) {
					int var94 = arg2.g1();
					int var95 = this.field484 + (var94 >> 4 & 0x7);
					int var96 = this.field485 + (var94 & 0x7);
					int var97 = arg2.g2_alt2();
					int var98 = arg2.g2_alt3();
					if (var95 >= 0 && var96 >= 0 && var95 < 104 && var96 < 104) {
						ClientObj var99 = new ClientObj();
						var99.id = var97;
						var99.count = var98;
						if (this.groundObj[this.minusedlevel][var95][var96] == null) {
							this.groundObj[this.minusedlevel][var95][var96] = new LinkList(807);
						}
						this.groundObj[this.minusedlevel][var95][var96].push(var99);
						this.showObj(var95, var96);
					}
				} else {
					if (arg1 == 40) {
						int var100 = arg2.g1();
						int var101 = this.field484 + (var100 >> 4 & 0x7);
						int var102 = this.field485 + (var100 & 0x7);
						int var103 = arg2.g2();
						int var104 = arg2.g1();
						int var105 = var104 >> 4 & 0xF;
						int var106 = var104 & 0x7;
						if (localPlayer.routeX[0] >= var101 - var105 && localPlayer.routeX[0] <= var101 + var105 && localPlayer.routeZ[0] >= var102 - var105 && localPlayer.routeZ[0] <= var102 + var105 && this.waveEnabled && !lowMem && this.waveCount < 50) {
							this.waveIds[this.waveCount] = var103;
							this.waveLoops[this.waveCount] = var106;
							this.waveDelay[this.waveCount] = JagFX.delays[var103];
							this.waveCount++;
						}
					}
					if (arg1 == 65) {
						int var107 = arg2.g1();
						int var108 = this.field484 + (var107 >> 4 & 0x7);
						int var109 = this.field485 + (var107 & 0x7);
						int var110 = arg2.g2_alt2();
						int var111 = arg2.g2();
						int var112 = arg2.g2();
						if (var108 >= 0 && var109 >= 0 && var108 < 104 && var109 < 104 && var111 != this.field556) {
							ClientObj var113 = new ClientObj();
							var113.id = var112;
							var113.count = var110;
							if (this.groundObj[this.minusedlevel][var108][var109] == null) {
								this.groundObj[this.minusedlevel][var108][var109] = new LinkList(807);
							}
							this.groundObj[this.minusedlevel][var108][var109].push(var113);
							this.showObj(var108, var109);
						}
					} else if (arg1 == 175) {
						int var114 = arg2.g1();
						int var115 = this.field484 + (var114 >> 4 & 0x7);
						int var116 = this.field485 + (var114 & 0x7);
						int var117 = arg2.g2();
						int var118 = arg2.g1();
						int var119 = arg2.g2();
						if (var115 >= 0 && var116 >= 0 && var115 < 104 && var116 < 104) {
							int var120 = var115 * 128 + 64;
							int var121 = var116 * 128 + 64;
							MapSpotAnim var122 = new MapSpotAnim(var121, this.getAvH(var120, var121, this.minusedlevel) - var118, var117, this.field529, loopCycle, this.minusedlevel, var119, var120);
							this.spotanims.push(var122);
						}
					}
				}
			}
		} catch (RuntimeException var124) {
			signlink.reporterror("74758, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + var124.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.a(IBIIIIIIII)V")
	public void locChangeCreate(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		try {
			LocChange var10 = null;
			for (LocChange var11 = (LocChange) this.locChanges.head(); var11 != null; var11 = (LocChange) this.locChanges.next()) {
				if (var11.field852 == arg2 && var11.field854 == arg1 && var11.field855 == arg0 && var11.layer == arg3) {
					var10 = var11;
					break;
				}
			}
			if (var10 == null) {
				var10 = new LocChange();
				var10.field852 = arg2;
				var10.layer = arg3;
				var10.field854 = arg1;
				var10.field855 = arg0;
				this.locChangeSetOld(var10);
				this.locChanges.push(var10);
			}
			var10.field845 = arg4;
			var10.field847 = arg8;
			var10.field846 = arg5;
			var10.startTime = arg7;
			var10.endTime = arg6;
		} catch (RuntimeException var13) {
			signlink.reporterror("25554, " + arg0 + ", " + 1 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + var13.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.A(I)V")
	public void locChangePostBuildCorrect() {
		try {
			for (LocChange var1 = (LocChange) this.locChanges.head(); var1 != null; var1 = (LocChange) this.locChanges.next()) {
				if (var1.endTime == -1) {
					var1.startTime = 0;
					this.locChangeSetOld(var1);
				} else {
					var1.unlink();
				}
			}
		} catch (RuntimeException var3) {
			signlink.reporterror("79592, " + 159 + ", " + var3.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.a(ILHCPBXDEK;)V")
	public void locChangeSetOld(LocChange arg0) {
		try {
			int var2 = 0;
			int var3 = -1;
			int var4 = 0;
			int var5 = 0;
			if (arg0.layer == 0) {
				var2 = this.world.wallType(arg0.field852, arg0.field854, arg0.field855);
			}
			if (arg0.layer == 1) {
				var2 = this.world.decorType(642, arg0.field852, arg0.field855, arg0.field854);
			}
			if (arg0.layer == 2) {
				var2 = this.world.sceneType(arg0.field852, arg0.field854, arg0.field855);
			}
			if (arg0.layer == 3) {
				var2 = this.world.gdType(arg0.field852, arg0.field854, arg0.field855);
			}
			if (var2 != 0) {
				int var6 = this.world.typeCode2(arg0.field852, arg0.field854, arg0.field855, var2);
				var3 = var2 >> 14 & 0x7FFF;
				var4 = var6 & 0x1F;
				var5 = var6 >> 6;
			}
			arg0.oldType = var3;
			arg0.oldShape = var4;
			arg0.oldAngle = var5;
		} catch (RuntimeException var8) {
			signlink.reporterror("15884, " + -905 + ", " + arg0 + ", " + var8.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.p(B)V")
	public void locChangeDoQueue(byte arg0) {
		try {
			boolean var6 = false;
			if (this.sceneState == 2) {
				for (LocChange var2 = (LocChange) this.locChanges.head(); var2 != null; var2 = (LocChange) this.locChanges.next()) {
					if (var2.endTime > 0) {
						var2.endTime--;
					}
					if (var2.endTime != 0) {
						if (var2.startTime > 0) {
							var2.startTime--;
						}
						if (var2.startTime == 0 && var2.field854 >= 1 && var2.field855 >= 1 && var2.field854 <= 102 && var2.field855 <= 102 && (var2.field845 < 0 || ClientBuild.changeLocAvailable(var2.field847, var2.field845))) {
							this.locChangeUnchecked(var2.field845, this.field290, var2.field846, var2.field852, var2.layer, var2.field854, var2.field855, var2.field847);
							var2.startTime = -1;
							if (var2.field845 == var2.oldType && var2.oldType == -1) {
								var2.unlink();
							} else if (var2.field845 == var2.oldType && var2.field846 == var2.oldAngle && var2.field847 == var2.oldShape) {
								var2.unlink();
							}
						}
					} else if (var2.oldType < 0 || ClientBuild.changeLocAvailable(var2.oldShape, var2.oldType)) {
						this.locChangeUnchecked(var2.oldType, this.field290, var2.oldAngle, var2.field852, var2.layer, var2.field854, var2.field855, var2.oldShape);
						var2.unlink();
					}
				}
				field515++;
				if (field515 > 1896) {
					field515 = 0;
					this.out.p1enc(119);
					this.out.p1(0);
					int var3 = this.out.pos;
					this.out.p2((int) (Math.random() * 65536.0D));
					this.out.p2((int) (Math.random() * 65536.0D));
					this.out.p1(245);
					this.out.p2(25901);
					this.out.p1((int) (Math.random() * 256.0D));
					this.out.p1(130);
					if ((int) (Math.random() * 2.0D) == 0) {
						this.out.p1(74);
					}
					this.out.p2(64410);
					this.out.p1(239);
					if ((int) (Math.random() * 2.0D) == 0) {
						this.out.p2(62571);
					}
					this.out.psize1(this.out.pos - var3, this.field241);
					return;
				}
			}
		} catch (RuntimeException var5) {
			signlink.reporterror("15250, " + arg0 + ", " + var5.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.a(IZIIIIII)V")
	public void locChangeUnchecked(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		try {
			if (!arg1) {
				this.groundObj = null;
			}
			if (arg5 >= 1 && arg6 >= 1 && arg5 <= 102 && arg6 <= 102) {
				if (lowMem && arg3 != this.minusedlevel) {
					return;
				}
				int var9 = 0;
				if (arg4 == 0) {
					var9 = this.world.wallType(arg3, arg5, arg6);
				}
				if (arg4 == 1) {
					var9 = this.world.decorType(642, arg3, arg6, arg5);
				}
				if (arg4 == 2) {
					var9 = this.world.sceneType(arg3, arg5, arg6);
				}
				if (arg4 == 3) {
					var9 = this.world.gdType(arg3, arg5, arg6);
				}
				if (var9 != 0) {
					int var10 = this.world.typeCode2(arg3, arg5, arg6, var9);
					int var11 = var9 >> 14 & 0x7FFF;
					int var12 = var10 & 0x1F;
					int var13 = var10 >> 6;
					if (arg4 == 0) {
						this.world.method545(arg5, arg3, arg6);
						LocType var14 = LocType.list(var11);
						if (var14.blockwalk) {
							this.collision[arg3].delWall(var12, arg5, var14.blockrange, var13, arg6);
						}
					}
					if (arg4 == 1) {
						this.world.method546(arg3, arg6, arg5);
					}
					if (arg4 == 2) {
						this.world.method547(arg6, arg5, arg3);
						LocType var15 = LocType.list(var11);
						if (arg5 + var15.width > 103 || arg6 + var15.width > 103 || arg5 + var15.length > 103 || arg6 + var15.length > 103) {
							return;
						}
						if (var15.blockwalk) {
							this.collision[arg3].method206(arg6, this.field192, var15.width, var15.length, var13, arg5, var15.blockrange);
						}
					}
					if (arg4 == 3) {
						this.world.delGroundDecor(arg6, arg5, arg3);
						LocType var16 = LocType.list(var11);
						if (var16.blockwalk && var16.active) {
							this.collision[arg3].method208(arg5, arg6);
						}
					}
				}
				if (arg0 >= 0) {
					int var17 = arg3;
					if (arg3 < 3 && (this.mapl[1][arg5][arg6] & 0x2) == 2) {
						var17 = arg3 + 1;
					}
					ClientBuild.addLoc(this.collision[arg3], this.world, arg0, arg5, arg7, this.groundh, var17, arg6, arg2, arg3);
					return;
				}
			}
		} catch (RuntimeException var19) {
			signlink.reporterror("61995, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + var19.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.d(II)V")
	public void showObj(int arg0, int arg1) {
		LinkList var3 = this.groundObj[this.minusedlevel][arg0][arg1];
		if (var3 == null) {
			this.world.delObj(this.minusedlevel, arg0, arg1);
			return;
		}
		int var4 = -99999999;
		ClientObj var5 = null;
		for (ClientObj var6 = (ClientObj) var3.head(); var6 != null; var6 = (ClientObj) var3.next()) {
			ObjType var7 = ObjType.list(var6.id);
			int var8 = var7.cost;
			if (var7.stackable) {
				var8 *= var6.count + 1;
			}
			if (var8 > var4) {
				var4 = var8;
				var5 = var6;
			}
		}
		var3.pushFront(var5);
		ClientObj var9 = null;
		ClientObj var10 = null;
		for (ClientObj var11 = (ClientObj) var3.head(); var11 != null; var11 = (ClientObj) var3.next()) {
			if (var11.id != var5.id && var9 == null) {
				var9 = var11;
			}
			if (var11.id != var5.id && var11.id != var9.id && var10 == null) {
				var10 = var11;
			}
		}
		int var12 = arg0 + (arg1 << 7) + 1610612736;
		this.world.method535(var10, this.minusedlevel, this.getAvH(arg0 * 128 + 64, arg1 * 128 + 64, this.minusedlevel), arg1, arg0, var9, var5, var12);
	}

	@ObfuscatedName("client.a(ILEILHLJCE;I)V")
	public void getPlayerPos(Packet arg0, int arg1) {
		try {
			this.entityRemovalCount = 0;
			this.entityUpdateCount = 0;
			this.getPlayerPosLocal(arg0, arg1);
			this.getPlayerPosOldVis(arg1, arg0);
			this.getPlayerPosNewVis(arg0, arg1);
			this.getPlayerPosExtended(arg0, arg1);
			for (int var3 = 0; var3 < this.entityRemovalCount; var3++) {
				int var4 = this.entityRemovalIds[var3];
				if (this.players[var4].cycle != loopCycle) {
					this.players[var4] = null;
				}
			}
			if (arg0.pos != arg1) {
				signlink.reporterror("Error packet size mismatch in getplayer pos:" + arg0.pos + " psize:" + arg1);
				throw new RuntimeException("eek");
			}
			for (int var5 = 0; var5 < this.playerCount; var5++) {
				if (this.players[this.playerIds[var5]] == null) {
					signlink.reporterror(this.loginUser + " null entry in pl list - pos:" + var5 + " size:" + this.playerCount);
					throw new RuntimeException("eek");
				}
			}
		} catch (RuntimeException var7) {
			signlink.reporterror("85573, " + -938 + ", " + arg0 + ", " + arg1 + ", " + var7.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.a(LEILHLJCE;IB)V")
	public void getPlayerPosLocal(Packet arg0, int arg1) {
		try {
			arg0.gbitstart();
			int var3 = arg0.gbit(1);
			if (this.field309 != -24) {
				this.ptype = -1;
			}
			if (var3 != 0) {
				int var4 = arg0.gbit(2);
				if (var4 == 0) {
					this.entityUpdateIds[this.entityUpdateCount++] = this.LOCAL_PLAYER_INDEX;
				} else if (var4 == 1) {
					int var5 = arg0.gbit(3);
					localPlayer.method8(var5, false);
					int var6 = arg0.gbit(1);
					if (var6 == 1) {
						this.entityUpdateIds[this.entityUpdateCount++] = this.LOCAL_PLAYER_INDEX;
					}
				} else if (var4 == 2) {
					int var7 = arg0.gbit(3);
					localPlayer.method8(var7, true);
					int var8 = arg0.gbit(3);
					localPlayer.method8(var8, true);
					int var9 = arg0.gbit(1);
					if (var9 == 1) {
						this.entityUpdateIds[this.entityUpdateCount++] = this.LOCAL_PLAYER_INDEX;
					}
				} else if (var4 == 3) {
					int var10 = arg0.gbit(7);
					int var11 = arg0.gbit(7);
					this.minusedlevel = arg0.gbit(2);
					int var12 = arg0.gbit(1);
					int var13 = arg0.gbit(1);
					if (var13 == 1) {
						this.entityUpdateIds[this.entityUpdateCount++] = this.LOCAL_PLAYER_INDEX;
					}
					localPlayer.teleport(var10, var11, var12 == 1);
				}
			}
		} catch (RuntimeException var15) {
			signlink.reporterror("90575, " + arg0 + ", " + arg1 + ", " + -24 + ", " + var15.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.d(IILEILHLJCE;)V")
	public void getPlayerPosOldVis(int arg0, Packet arg1) {
		try {
			int var17 = arg0;
			int var3 = arg1.gbit(8);
			if (var3 < this.playerCount) {
				for (int var4 = var3; var4 < this.playerCount; var4++) {
					this.entityRemovalIds[this.entityRemovalCount++] = this.playerIds[var4];
				}
			}
			if (var3 > this.playerCount) {
				signlink.reporterror(this.loginUser + " Too many players");
				throw new RuntimeException("eek");
			}
			this.playerCount = 0;
			for (int var5 = 0; var5 < var3; var5++) {
				int var6 = this.playerIds[var5];
				ClientPlayer var7 = this.players[var6];
				int var8 = arg1.gbit(1);
				if (var8 == 0) {
					this.playerIds[this.playerCount++] = var6;
					var7.cycle = loopCycle;
				} else {
					int var9 = arg1.gbit(2);
					if (var9 == 0) {
						this.playerIds[this.playerCount++] = var6;
						var7.cycle = loopCycle;
						this.entityUpdateIds[this.entityUpdateCount++] = var6;
					} else if (var9 == 1) {
						this.playerIds[this.playerCount++] = var6;
						var7.cycle = loopCycle;
						int var10 = arg1.gbit(3);
						var7.method8(var10, false);
						int var11 = arg1.gbit(1);
						if (var11 == 1) {
							this.entityUpdateIds[this.entityUpdateCount++] = var6;
						}
					} else if (var9 == 2) {
						this.playerIds[this.playerCount++] = var6;
						var7.cycle = loopCycle;
						int var12 = arg1.gbit(3);
						var7.method8(var12, true);
						int var13 = arg1.gbit(3);
						var7.method8(var13, true);
						int var14 = arg1.gbit(1);
						if (var14 == 1) {
							this.entityUpdateIds[this.entityUpdateCount++] = var6;
						}
					} else if (var9 == 3) {
						this.entityRemovalIds[this.entityRemovalCount++] = var6;
					}
				}
			}
		} catch (RuntimeException var16) {
			signlink.reporterror("77664, " + arg0 + ", " + ", " + arg1 + ", " + var16.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.a(BLEILHLJCE;I)V")
	public void getPlayerPosNewVis(Packet arg0, int arg1) {
		try {
			while (true) {
				if (arg0.bitpos + 10 < arg1 * 8) {
					int var3 = arg0.gbit(11);
					if (var3 != 2047) {
						if (this.players[var3] == null) {
							this.players[var3] = new ClientPlayer();
							if (this.playerAppearanceBuffer[var3] != null) {
								this.players[var3].setAppearance(this.playerAppearanceBuffer[var3], this.field342);
							}
						}
						this.playerIds[this.playerCount++] = var3;
						ClientPlayer var4 = this.players[var3];
						var4.cycle = loopCycle;
						int var5 = arg0.gbit(5);
						if (var5 > 15) {
							var5 -= 32;
						}
						int var6 = arg0.gbit(1);
						if (var6 == 1) {
							this.entityUpdateIds[this.entityUpdateCount++] = var3;
						}
						int var7 = arg0.gbit(5);
						if (var7 > 15) {
							var7 -= 32;
						}
						int var8 = arg0.gbit(1);
						var4.teleport(localPlayer.routeX[0] + var7, localPlayer.routeZ[0] + var5, var8 == 1);
						continue;
					}
				}
				arg0.gbitend();
				return;
			}
		} catch (RuntimeException var10) {
			signlink.reporterror("95535, " + 103 + ", " + arg0 + ", " + arg1 + ", " + var10.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.a(ILAWOZVMFS;LEILHLJCE;IZ)V")
	public void getPlayerPosExtended(int arg0, ClientPlayer arg1, Packet arg2, int arg3) {
		try {
			if ((arg0 & 0x20) != 0) {
				int var5 = arg2.g1_alt1();
				byte[] var6 = new byte[var5];
				Packet var7 = new Packet(var6, -26583);
				arg2.gdata(var6, var5);
				this.playerAppearanceBuffer[arg3] = var7;
				arg1.setAppearance(var7, this.field342);
			}
			if ((arg0 & 0x100) != 0) {
				arg1.spotanimId = arg2.g2_alt3();
				int var8 = arg2.g4_alt2();
				arg1.field31 = var8 >> 16;
				arg1.field30 = loopCycle + (var8 & 0xFFFF);
				arg1.spotanimFrame = 0;
				arg1.field29 = 0;
				if (arg1.field30 > loopCycle) {
					arg1.spotanimFrame = -1;
				}
				if (arg1.spotanimId == 65535) {
					arg1.spotanimId = -1;
				}
			}
			if ((arg0 & 0x1) != 0) {
				int var9 = arg2.g2_alt1();
				if (var9 == 65535) {
					var9 = -1;
				}
				int var10 = arg2.g1_alt1();
				if (var9 == arg1.primaryAnim && var9 != -1) {
					int var11 = SeqType.list[var9].duplicatebehavior;
					if (var11 == 1) {
						arg1.primaryFrame = 0;
						arg1.field49 = 0;
						arg1.primaryAnimDelay = var10;
						arg1.field51 = 0;
					}
					if (var11 == 2) {
						arg1.field51 = 0;
					}
				} else if (var9 == -1 || arg1.primaryAnim == -1 || SeqType.list[var9].priority >= SeqType.list[arg1.primaryAnim].priority) {
					arg1.primaryAnim = var9;
					arg1.primaryFrame = 0;
					arg1.field49 = 0;
					arg1.primaryAnimDelay = var10;
					arg1.field51 = 0;
					arg1.preanimRouteLength = arg1.routeLength;
				}
			}
			if ((arg0 & 0x2) != 0) {
				arg1.field41 = arg2.g2();
				arg1.field42 = arg2.g2_alt1();
			}
			if ((arg0 & 0x400) != 0) {
				arg1.field57 = arg2.g1_alt2();
				arg1.field59 = arg2.g1_alt3();
				arg1.field58 = arg2.g1_alt1();
				arg1.field60 = arg2.g1_alt1();
				arg1.field61 = arg2.g2_alt1() + loopCycle;
				arg1.field62 = arg2.g2_alt2() + loopCycle;
				arg1.field63 = arg2.g1();
				arg1.method7((byte) 4);
			}
			if ((arg0 & 0x8) != 0) {
				arg1.chatMessage = arg2.gstr();
				if (arg1.chatMessage.charAt(0) == '~') {
					arg1.chatMessage = arg1.chatMessage.substring(1);
					this.addChat(2, arg1.chatMessage, arg1.name);
				} else if (arg1 == localPlayer) {
					this.addChat(2, arg1.chatMessage, arg1.name);
				}
				arg1.chatColour = 0;
				arg1.chatEffect = 0;
				arg1.chatTimer = 150;
			}
			if ((arg0 & 0x80) != 0) {
				arg1.field52 = arg2.g2();
				if (arg1.field52 == 65535) {
					arg1.field52 = -1;
				}
			}
			if ((arg0 & 0x200) != 0) {
				int var12 = arg2.g1();
				int var13 = arg2.g1_alt3();
				arg1.addHitMark(loopCycle, var13, var12);
				arg1.field14 = loopCycle + 300;
				arg1.field15 = arg2.g1_alt2();
				arg1.field16 = arg2.g1_alt3();
			}
			if ((arg0 & 0x40) != 0) {
				int var14 = arg2.g2_alt3();
				int var15 = arg2.g1();
				int var16 = arg2.g1_alt3();
				int var17 = arg2.pos;
				if (arg1.name != null && arg1.ready) {
					long var18 = JString.toUserhash(arg1.name);
					boolean var20 = false;
					if (var15 <= 1) {
						for (int var21 = 0; var21 < this.ignoreCount; var21++) {
							if (this.ignoreUserhash[var21] == var18) {
								var20 = true;
								break;
							}
						}
					}
					if (!var20 && this.chatDisabled == 0) {
						try {
							this.field230.pos = 0;
							arg2.gdata_alt2(var16, this.field230.data);
							this.field230.pos = 0;
							String var22 = WordPack.unpack(this.field230, var16);
							String var23 = WordFilter.method486(this.field552, var22);
							arg1.chatMessage = var23;
							arg1.chatColour = var14 >> 8;
							arg1.chatEffect = var14 & 0xFF;
							arg1.chatTimer = 150;
							if (var15 == 2 || var15 == 3) {
								this.addChat(1, var23, "@cr2@" + arg1.name);
							} else if (var15 == 1) {
								this.addChat(1, var23, "@cr1@" + arg1.name);
							} else {
								this.addChat(2, var23, arg1.name);
							}
						} catch (Exception var28) {
							signlink.reporterror("cde2");
						}
					}
				}
				arg2.pos = var17 + var16;
			}
			if ((arg0 & 0x10) != 0) {
				int var25 = arg2.g1_alt3();
				int var26 = arg2.g1_alt1();
				arg1.addHitMark(loopCycle, var26, var25);
				arg1.field14 = loopCycle + 300;
				arg1.field15 = arg2.g1();
				arg1.field16 = arg2.g1_alt3();
			}
		} catch (RuntimeException var29) {
			signlink.reporterror("2515, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + false + ", " + var29.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.a(LEILHLJCE;BI)V")
	public void getPlayerPosExtended(Packet arg0, int arg1) {
		try {
			for (int var3 = 0; var3 < this.entityUpdateCount; var3++) {
				int var4 = this.entityUpdateIds[var3];
				ClientPlayer var5 = this.players[var4];
				int var6 = arg0.g1();
				if ((var6 & 0x4) != 0) {
					var6 += arg0.g1() << 8;
				}
				this.getPlayerPosExtended(var6, var5, arg0, var4);
			}
		} catch (RuntimeException var8) {
			signlink.reporterror("47938, " + arg0 + ", " + 8 + ", " + arg1 + ", " + var8.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.a(ILEILHLJCE;B)V")
	public void getNpcPos(int arg0, Packet arg1) {
		try {
			this.entityRemovalCount = 0;
			this.entityUpdateCount = 0;
			this.getNpcPosOldVis(arg0, arg1);
			this.getNpcPosNewVis(arg0, arg1);
			this.getNpcPosExtended(arg0, arg1);
			for (int var3 = 0; var3 < this.entityRemovalCount; var3++) {
				int var4 = this.entityRemovalIds[var3];
				if (this.npc[var4].cycle != loopCycle) {
					this.npc[var4].type = null;
					this.npc[var4] = null;
				}
			}
			if (arg1.pos != arg0) {
				signlink.reporterror(this.loginUser + " size mismatch in getnpcpos - pos:" + arg1.pos + " psize:" + arg0);
				throw new RuntimeException("eek");
			}
			for (int var5 = 0; var5 < this.npcCount; var5++) {
				if (this.npc[this.npcIds[var5]] == null) {
					signlink.reporterror(this.loginUser + " null entry in npc list - pos:" + var5 + " size:" + this.npcCount);
					throw new RuntimeException("eek");
				}
			}
		} catch (RuntimeException var7) {
			signlink.reporterror("12694, " + arg0 + ", " + arg1 + ", " + ", " + var7.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.a(IILEILHLJCE;)V")
	public void getNpcPosOldVis(int arg0, Packet arg1) {
		try {
			arg1.gbitstart();
			int var3 = arg1.gbit(8);
			if (var3 < this.npcCount) {
				for (int var4 = var3; var4 < this.npcCount; var4++) {
					this.entityRemovalIds[this.entityRemovalCount++] = this.npcIds[var4];
				}
			}
			if (var3 > this.npcCount) {
				signlink.reporterror(this.loginUser + " Too many npcs");
				throw new RuntimeException("eek");
			}
			this.npcCount = 0;
			for (int var5 = 0; var5 < var3; var5++) {
				int var6 = this.npcIds[var5];
				ClientNpc var7 = this.npc[var6];
				int var8 = arg1.gbit(1);
				if (var8 == 0) {
					this.npcIds[this.npcCount++] = var6;
					var7.cycle = loopCycle;
				} else {
					int var9 = arg1.gbit(2);
					if (var9 == 0) {
						this.npcIds[this.npcCount++] = var6;
						var7.cycle = loopCycle;
						this.entityUpdateIds[this.entityUpdateCount++] = var6;
					} else if (var9 == 1) {
						this.npcIds[this.npcCount++] = var6;
						var7.cycle = loopCycle;
						int var10 = arg1.gbit(3);
						var7.method8(var10, false);
						int var11 = arg1.gbit(1);
						if (var11 == 1) {
							this.entityUpdateIds[this.entityUpdateCount++] = var6;
						}
					} else if (var9 == 2) {
						this.npcIds[this.npcCount++] = var6;
						var7.cycle = loopCycle;
						int var12 = arg1.gbit(3);
						var7.method8(var12, true);
						int var13 = arg1.gbit(3);
						var7.method8(var13, true);
						int var14 = arg1.gbit(1);
						if (var14 == 1) {
							this.entityUpdateIds[this.entityUpdateCount++] = var6;
						}
					} else if (var9 == 3) {
						this.entityRemovalIds[this.entityRemovalCount++] = var6;
					}
				}
			}
		} catch (RuntimeException var16) {
			signlink.reporterror("59473, " + arg0 + ", " + 9848 + ", " + arg1 + ", " + var16.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.a(IZLEILHLJCE;)V")
	public void getNpcPosNewVis(int arg0, Packet arg1) {
		try {
			while (true) {
				if (arg1.bitpos + 21 < arg0 * 8) {
					int var3 = arg1.gbit(14);
					if (var3 != 16383) {
						if (this.npc[var3] == null) {
							this.npc[var3] = new ClientNpc();
						}
						ClientNpc var4 = this.npc[var3];
						this.npcIds[this.npcCount++] = var3;
						var4.cycle = loopCycle;
						int var5 = arg1.gbit(1);
						var4.type = NpcType.list(arg1.gbit(13));
						int var6 = arg1.gbit(1);
						if (var6 == 1) {
							this.entityUpdateIds[this.entityUpdateCount++] = var3;
						}
						int var7 = arg1.gbit(5);
						if (var7 > 15) {
							var7 -= 32;
						}
						int var8 = arg1.gbit(5);
						if (var8 > 15) {
							var8 -= 32;
						}
						var4.field54 = var4.type.size;
						var4.field40 = var4.type.turnspeed;
						var4.field20 = var4.type.walkanim;
						var4.field21 = var4.type.walkanim_b;
						var4.field22 = var4.type.walkanim_r;
						var4.field23 = var4.type.walkanim_l;
						var4.readyAnim = var4.type.readyanim;
						var4.teleport(localPlayer.routeX[0] + var8, localPlayer.routeZ[0] + var7, var5 == 1);
						continue;
					}
				}
				arg1.gbitend();
				return;
			}
		} catch (RuntimeException var10) {
			signlink.reporterror("60000, " + arg0 + ", " + true + ", " + arg1 + ", " + var10.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.c(IILEILHLJCE;)V")
	public void getNpcPosExtended(int arg0, Packet arg1) {
		try {
			for (int var3 = 0; var3 < this.entityUpdateCount; var3++) {
				int var4 = this.entityUpdateIds[var3];
				ClientNpc var5 = this.npc[var4];
				int var6 = arg1.g1();
				if ((var6 & 0x40) != 0) {
					var5.chatMessage = arg1.gstr();
					var5.chatTimer = 100;
				}
				if ((var6 & 0x20) != 0) {
					var5.field41 = arg1.g2_alt1();
					var5.field42 = arg1.g2();
				}
				if ((var6 & 0x1) != 0) {
					int var7 = arg1.g1_alt2();
					int var8 = arg1.g1_alt2();
					var5.addHitMark(loopCycle, var8, var7);
					var5.field14 = loopCycle + 300;
					var5.field15 = arg1.g1_alt2();
					var5.field16 = arg1.g1_alt1();
				}
				if ((var6 & 0x2) != 0) {
					int var9 = arg1.g1_alt2();
					int var10 = arg1.g1_alt1();
					var5.addHitMark(loopCycle, var10, var9);
					var5.field14 = loopCycle + 300;
					var5.field15 = arg1.g1_alt3();
					var5.field16 = arg1.g1();
				}
				if ((var6 & 0x80) != 0) {
					var5.spotanimId = arg1.g2_alt2();
					int var11 = arg1.g4_alt2();
					var5.field31 = var11 >> 16;
					var5.field30 = loopCycle + (var11 & 0xFFFF);
					var5.spotanimFrame = 0;
					var5.field29 = 0;
					if (var5.field30 > loopCycle) {
						var5.spotanimFrame = -1;
					}
					if (var5.spotanimId == 65535) {
						var5.spotanimId = -1;
					}
				}
				if ((var6 & 0x10) != 0) {
					var5.type = NpcType.list(arg1.g2_alt3());
					var5.field54 = var5.type.size;
					var5.field40 = var5.type.turnspeed;
					var5.field20 = var5.type.walkanim;
					var5.field21 = var5.type.walkanim_b;
					var5.field22 = var5.type.walkanim_r;
					var5.field23 = var5.type.walkanim_l;
					var5.readyAnim = var5.type.readyanim;
				}
				if ((var6 & 0x4) != 0) {
					var5.field52 = arg1.g2_alt2();
					if (var5.field52 == 65535) {
						var5.field52 = -1;
					}
				}
				if ((var6 & 0x8) != 0) {
					int var12 = arg1.g2_alt1();
					if (var12 == 65535) {
						var12 = -1;
					}
					int var13 = arg1.g1_alt2();
					if (var12 == var5.primaryAnim && var12 != -1) {
						int var14 = SeqType.list[var12].duplicatebehavior;
						if (var14 == 1) {
							var5.primaryFrame = 0;
							var5.field49 = 0;
							var5.primaryAnimDelay = var13;
							var5.field51 = 0;
						}
						if (var14 == 2) {
							var5.field51 = 0;
						}
					} else if (var12 == -1 || var5.primaryAnim == -1 || SeqType.list[var12].priority >= SeqType.list[var5.primaryAnim].priority) {
						var5.primaryAnim = var12;
						var5.primaryFrame = 0;
						var5.field49 = 0;
						var5.primaryAnimDelay = var13;
						var5.field51 = 0;
						var5.preanimRouteLength = var5.routeLength;
					}
				}
			}
		} catch (RuntimeException var16) {
			signlink.reporterror("47140, " + arg0 + ", " + -459 + ", " + arg1 + ", " + var16.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.F(I)V")
	public void mouseLoop() {
		try {
			if (this.objDragArea == 0) {
				int var1 = super.mouseClickButton;
				if (this.targetMode == 1 && super.mouseClickX >= 516 && super.mouseClickY >= 160 && super.mouseClickX <= 765 && super.mouseClickY <= 205) {
					var1 = 0;
				}
				if (this.isMenuOpen) {
					if (var1 != 1) {
						int var2 = super.mouseX;
						int var3 = super.mouseY;
						if (this.menuArea == 0) {
							var2 -= 4;
							var3 -= 4;
						}
						if (this.menuArea == 1) {
							var2 -= 553;
							var3 -= 205;
						}
						if (this.menuArea == 2) {
							var2 -= 17;
							var3 -= 357;
						}
						if (var2 < this.field314 - 10 || var2 > this.field314 + this.field316 + 10 || var3 < this.field315 - 10 || var3 > this.field315 + this.field317 + 10) {
							this.isMenuOpen = false;
							if (this.menuArea == 1) {
								this.redrawSidebar = true;
							}
							if (this.menuArea == 2) {
								this.redrawChatback = true;
							}
						}
					}
					if (var1 == 1) {
						int var4 = this.field314;
						int var5 = this.field315;
						int var6 = this.field316;
						int var7 = super.mouseClickX;
						int var8 = super.mouseClickY;
						if (this.menuArea == 0) {
							var7 -= 4;
							var8 -= 4;
						}
						if (this.menuArea == 1) {
							var7 -= 553;
							var8 -= 205;
						}
						if (this.menuArea == 2) {
							var7 -= 17;
							var8 -= 357;
						}
						int var9 = -1;
						for (int var10 = 0; var10 < this.menuNumEntries; var10++) {
							int var11 = var5 + (this.menuNumEntries - 1 - var10) * 15 + 31;
							if (var7 > var4 && var7 < var4 + var6 && var8 > var11 - 13 && var8 < var11 + 3) {
								var9 = var10;
							}
						}
						if (var9 != -1) {
							this.doAction(var9);
						}
						this.isMenuOpen = false;
						if (this.menuArea == 1) {
							this.redrawSidebar = true;
						}
						if (this.menuArea == 2) {
							this.redrawChatback = true;
							return;
						}
					}
				} else {
					if (var1 == 1 && this.menuNumEntries > 0) {
						int var12 = this.menuAction[this.menuNumEntries - 1];
						if (var12 == 391 || var12 == 377 || var12 == 277 || var12 == 281 || var12 == 485 || var12 == 181 || var12 == 946 || var12 == 152 || var12 == 1 || var12 == 530 || var12 == 963 || var12 == 1870) {
							int var13 = this.menuParamB[this.menuNumEntries - 1];
							int var14 = this.menuParamC[this.menuNumEntries - 1];
							IfType var15 = IfType.list(var14);
							if (var15.objSwap || var15.objReplace) {
								this.field544 = false;
								this.field444 = 0;
								this.field580 = var14;
								this.field581 = var13;
								this.objDragArea = 2;
								this.field583 = super.mouseClickX;
								this.field584 = super.mouseClickY;
								if (IfType.list(var14).layerId == this.mainModalId) {
									this.objDragArea = 1;
								}
								if (IfType.list(var14).layerId == this.chatComId) {
									this.objDragArea = 3;
								}
								return;
							}
						}
					}
					if (var1 == 1 && (this.field182 == 1 || this.isAddFriendOption(this.menuNumEntries - 1)) && this.menuNumEntries > 2) {
						var1 = 2;
					}
					if (var1 == 1 && this.menuNumEntries > 0) {
						this.doAction(this.menuNumEntries - 1);
					}
					if (var1 != 2 || this.menuNumEntries <= 0) {
						return;
					}
					this.openMenu(543);
				}
			}
		} catch (RuntimeException var17) {
			signlink.reporterror("94924, " + -813 + ", " + var17.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.f(I)V")
	public void drawMinimenu() {
		try {
			int var1 = this.field314;
			int var2 = this.field315;
			int var3 = this.field316;
			int var4 = this.field317;
			Pix2D.fillrect(6116423, var1, 99, var3, var4, var2);
			Pix2D.fillrect(0, var1 + 1, 99, var3 - 2, 16, var2 + 1);
			Pix2D.drawRect(var2 + 18, var3 - 2, var1 + 1, var4 - 19, 0);
			this.b12.drawString("Choose Option", var2 + 14, var1 + 3, 6116423);
			int var5 = super.mouseX;
			int var6 = super.mouseY;
			if (this.menuArea == 0) {
				var5 -= 4;
				var6 -= 4;
			}
			if (this.menuArea == 1) {
				var5 -= 553;
				var6 -= 205;
			}
			if (this.menuArea == 2) {
				var5 -= 17;
				var6 -= 357;
			}
			for (int var7 = 0; var7 < this.menuNumEntries; var7++) {
				int var8 = var2 + (this.menuNumEntries - 1 - var7) * 15 + 31;
				int var9 = 16777215;
				if (var5 > var1 && var5 < var1 + var3 && var6 > var8 - 13 && var6 < var8 + 3) {
					var9 = 16776960;
				}
				this.b12.drawStringTag(var1 + 3, var8, true, var9, this.menuOption[var7]);
			}
		} catch (RuntimeException var11) {
			signlink.reporterror("46965, " + 6 + ", " + var11.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.B(I)V")
	public void drawFeedback() {
		try {
			if (this.menuNumEntries >= 2 || this.useMode != 0 || this.targetMode != 0) {
				String var1;
				if (this.useMode == 1 && this.menuNumEntries < 2) {
					var1 = "Use " + this.objSelectedName + " with...";
				} else if (this.targetMode == 1 && this.menuNumEntries < 2) {
					var1 = this.targetOp + "...";
				} else {
					var1 = this.menuOption[this.menuNumEntries - 1];
				}
				if (this.menuNumEntries > 2) {
					var1 = var1 + "@whi@ / " + (this.menuNumEntries - 2) + " more options";
				}
				this.b12.drawStringAntiMacro(16777215, var1, 15, loopCycle / 1000, 4);
			}
		} catch (RuntimeException var3) {
			signlink.reporterror("48009, " + 5 + ", " + var3.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.j(I)V")
	public void openMenu(int arg0) {
		try {
			int var2 = this.b12.stringWidTag("Choose Option");
			for (int var3 = 0; var3 < this.menuNumEntries; var3++) {
				int var4 = this.b12.stringWidTag(this.menuOption[var3]);
				if (var4 > var2) {
					var2 = var4;
				}
			}
			var2 += 8;
			boolean var14 = false;
			int var5 = this.menuNumEntries * 15 + 21;
			if (super.mouseClickX > 4 && super.mouseClickY > 4 && super.mouseClickX < 516 && super.mouseClickY < 338) {
				int var6 = super.mouseClickX - var2 / 2 - 4;
				if (var6 + var2 > 512) {
					var6 = 512 - var2;
				}
				if (var6 < 0) {
					var6 = 0;
				}
				int var7 = super.mouseClickY - 4;
				if (var7 + var5 > 334) {
					var7 = 334 - var5;
				}
				if (var7 < 0) {
					var7 = 0;
				}
				this.isMenuOpen = true;
				this.menuArea = 0;
				this.field314 = var6;
				this.field315 = var7;
				this.field316 = var2;
				this.field317 = this.menuNumEntries * 15 + 22;
			}
			if (super.mouseClickX > 553 && super.mouseClickY > 205 && super.mouseClickX < 743 && super.mouseClickY < 466) {
				int var8 = super.mouseClickX - var2 / 2 - 553;
				if (var8 < 0) {
					var8 = 0;
				} else if (var8 + var2 > 190) {
					var8 = 190 - var2;
				}
				int var9 = super.mouseClickY - 205;
				if (var9 < 0) {
					var9 = 0;
				} else if (var9 + var5 > 261) {
					var9 = 261 - var5;
				}
				this.isMenuOpen = true;
				this.menuArea = 1;
				this.field314 = var8;
				this.field315 = var9;
				this.field316 = var2;
				this.field317 = this.menuNumEntries * 15 + 22;
			}
			if (super.mouseClickX > 17 && super.mouseClickY > 357 && super.mouseClickX < 496 && super.mouseClickY < 453) {
				int var10 = super.mouseClickX - var2 / 2 - 17;
				if (var10 < 0) {
					var10 = 0;
				} else if (var10 + var2 > 479) {
					var10 = 479 - var2;
				}
				int var11 = super.mouseClickY - 357;
				if (var11 < 0) {
					var11 = 0;
				} else if (var11 + var5 > 96) {
					var11 = 96 - var5;
				}
				this.isMenuOpen = true;
				this.menuArea = 2;
				this.field314 = var10;
				this.field315 = var11;
				this.field316 = var2;
				this.field317 = this.menuNumEntries * 15 + 22;
			}
		} catch (RuntimeException var13) {
			signlink.reporterror("58819, " + arg0 + ", " + var13.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.b(II)Z")
	public boolean isAddFriendOption(int arg0) {
		try {
			if (arg0 < 0) {
				return false;
			}
			int var2 = this.menuAction[arg0];
			if (var2 >= 2000) {
				var2 -= 2000;
			}
			return var2 == 696;
		} catch (RuntimeException var4) {
			signlink.reporterror("68055, " + ", " + arg0 + ", " + var4.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.a(II)V")
	public void doAction(int arg0) {
		try {
			if (arg0 >= 0) {
				if (this.dialogueInputOpen != 0) {
					this.dialogueInputOpen = 0;
					this.redrawChatback = true;
				}
				int var2 = this.menuParamB[arg0];
				int var3 = this.menuParamC[arg0];
				int var4 = this.menuAction[arg0];
				int var5 = this.menuParamA[arg0];
				if (var4 >= 2000) {
					var4 -= 2000;
				}
				if (var4 == 281) {
					field395 += var3;
					if (field395 >= 82) {
						this.out.p1enc(182);
						field395 = 0;
					}
					this.out.p1enc(255);
					this.out.p2(var2);
					this.out.p2_alt2(var5);
					this.out.p2_alt2(var3);
					this.field500 = 0;
					this.field501 = var3;
					this.field502 = var2;
					this.field503 = 2;
					if (IfType.list(var3).layerId == this.mainModalId) {
						this.field503 = 1;
					}
					if (IfType.list(var3).layerId == this.chatComId) {
						this.field503 = 3;
					}
				}
				if (var4 == 946) {
					this.out.p1enc(17);
					this.out.p2_alt2(var2);
					this.out.p2_alt2(var5);
					this.out.p2(var3);
					this.field500 = 0;
					this.field501 = var3;
					this.field502 = var2;
					this.field503 = 2;
					if (IfType.list(var3).layerId == this.mainModalId) {
						this.field503 = 1;
					}
					if (IfType.list(var3).layerId == this.chatComId) {
						this.field503 = 3;
					}
				}
				if (var4 == 1335) {
					ClientNpc var6 = this.npc[var5];
					if (var6 != null) {
						NpcType var7 = var6.type;
						if (var7.multinpc != null) {
							var7 = var7.method389();
						}
						if (var7 != null) {
							String var8;
							if (var7.desc == null) {
								var8 = "It's a " + var7.name + ".";
							} else {
								var8 = new String(var7.desc);
							}
							this.addChat(0, var8, "");
						}
					}
				}
				if (var4 == 426) {
					IfType var9 = IfType.list(var3);
					boolean var10 = true;
					if (var9.clientCode > 0) {
						var10 = this.clientButton(var9);
					}
					if (var10) {
						this.out.p1enc(208);
						this.out.p2(var3);
					}
				}
				if (var4 == 377) {
					this.out.p1enc(226);
					this.out.p2_alt3(var2);
					this.out.p2(var5);
					this.out.p2_alt1(var3);
					this.field500 = 0;
					this.field501 = var3;
					this.field502 = var2;
					this.field503 = 2;
					if (IfType.list(var3).layerId == this.mainModalId) {
						this.field503 = 1;
					}
					if (IfType.list(var3).layerId == this.chatComId) {
						this.field503 = 3;
					}
				}
				if (var4 == 405 && !this.field446) {
					this.out.p1enc(154);
					this.out.p2(var3);
					this.field446 = true;
				}
				if (var4 == 275) {
					boolean var11 = this.tryMove(var2, (byte) 6, var3, 2, 0, localPlayer.routeZ[0], false, 0, localPlayer.routeX[0], 0, 0, 0);
					if (!var11) {
						this.tryMove(var2, (byte) 6, var3, 2, 1, localPlayer.routeZ[0], false, 0, localPlayer.routeX[0], 0, 1, 0);
					}
					this.field247 = super.mouseClickX;
					this.field248 = super.mouseClickY;
					this.crossMode = 2;
					this.crossCycle = 0;
					this.out.p1enc(143);
					this.out.p2_alt1(var3 + this.mapBuildBaseZ);
					this.out.p2_alt2(var5);
					this.out.p2_alt1(var2 + this.mapBuildBaseX);
				}
				if (var4 == 515) {
					ClientNpc var13 = this.npc[var5];
					if (var13 != null) {
						this.tryMove(var13.routeX[0], (byte) 6, var13.routeZ[0], 2, 1, localPlayer.routeZ[0], false, 0, localPlayer.routeX[0], 0, 1, 0);
						this.field247 = super.mouseClickX;
						this.field248 = super.mouseClickY;
						this.crossMode = 2;
						this.crossCycle = 0;
						this.out.p1enc(16);
						this.out.p2_alt2(var5);
					}
				}
				if (var4 == 951) {
					this.out.p1enc(208);
					this.out.p2(var3);
					IfType var14 = IfType.list(var3);
					if (var14.scripts != null && var14.scripts[0][0] == 5) {
						int var15 = var14.scripts[0][1];
						if (this.var[var15] != var14.scriptOperand[0]) {
							this.var[var15] = var14.scriptOperand[0];
							this.clientVar(var15);
							this.redrawSidebar = true;
						}
					}
				}
				if (var4 == 983) {
					ClientNpc var16 = this.npc[var5];
					if (var16 != null) {
						this.tryMove(var16.routeX[0], (byte) 6, var16.routeZ[0], 2, 1, localPlayer.routeZ[0], false, 0, localPlayer.routeX[0], 0, 1, 0);
						this.field247 = super.mouseClickX;
						this.field248 = super.mouseClickY;
						this.crossMode = 2;
						this.crossCycle = 0;
						this.out.p1enc(158);
						this.out.p2_alt1(var5);
					}
				}
				if (var4 == 646) {
					ClientNpc var17 = this.npc[var5];
					if (var17 != null) {
						this.tryMove(var17.routeX[0], (byte) 6, var17.routeZ[0], 2, 1, localPlayer.routeZ[0], false, 0, localPlayer.routeX[0], 0, 1, 0);
						this.field247 = super.mouseClickX;
						this.field248 = super.mouseClickY;
						this.crossMode = 2;
						this.crossCycle = 0;
						this.out.p1enc(48);
						this.out.p2(this.field547);
						this.out.p2_alt1(this.field548);
						this.out.p2_alt1(var5);
						this.out.p2_alt1(this.field546);
					}
				}
				if (var4 == 1) {
					this.out.p1enc(73);
					this.out.p2_alt2(var3);
					this.out.p2_alt2(var5);
					this.out.p2(var2);
					this.field500 = 0;
					this.field501 = var3;
					this.field502 = var2;
					this.field503 = 2;
					if (IfType.list(var3).layerId == this.mainModalId) {
						this.field503 = 1;
					}
					if (IfType.list(var3).layerId == this.chatComId) {
						this.field503 = 3;
					}
				}
				if (var4 == 98) {
					boolean var18 = this.tryMove(var2, (byte) 6, var3, 2, 0, localPlayer.routeZ[0], false, 0, localPlayer.routeX[0], 0, 0, 0);
					if (!var18) {
						this.tryMove(var2, (byte) 6, var3, 2, 1, localPlayer.routeZ[0], false, 0, localPlayer.routeX[0], 0, 1, 0);
					}
					this.field247 = super.mouseClickX;
					this.field248 = super.mouseClickY;
					this.crossMode = 2;
					this.crossCycle = 0;
					this.out.p1enc(105);
					this.out.p2_alt3(var3 + this.mapBuildBaseZ);
					this.out.p2_alt1(var5);
					this.out.p2_alt2(var2 + this.mapBuildBaseX);
				}
				if (var4 == 582) {
					IfType var20 = IfType.list(var3);
					this.targetMode = 1;
					this.field637 = var3;
					this.field638 = var20.targetMask;
					this.useMode = 0;
					this.redrawSidebar = true;
					String var21 = var20.targetVerb;
					if (var21.indexOf(" ") != -1) {
						var21 = var21.substring(0, var21.indexOf(" "));
					}
					String var22 = var20.targetVerb;
					if (var22.indexOf(" ") != -1) {
						var22 = var22.substring(var22.indexOf(" ") + 1);
					}
					this.targetOp = var21 + " " + var20.targetBase + " " + var22;
					if (this.field638 == 16) {
						this.redrawSidebar = true;
						this.activeIcon = 3;
						this.rewdrawIcons = true;
					}
				} else {
					if (var4 == 403) {
						ClientNpc var23 = this.npc[var5];
						if (var23 != null) {
							this.tryMove(var23.routeX[0], (byte) 6, var23.routeZ[0], 2, 1, localPlayer.routeZ[0], false, 0, localPlayer.routeX[0], 0, 1, 0);
							this.field247 = super.mouseClickX;
							this.field248 = super.mouseClickY;
							this.crossMode = 2;
							this.crossCycle = 0;
							this.out.p1enc(21);
							this.out.p2_alt1(var5);
							this.out.p2_alt1(this.field637);
						}
					}
					if (var4 == 703) {
						ClientPlayer var24 = this.players[var5];
						if (var24 != null) {
							this.tryMove(var24.routeX[0], (byte) 6, var24.routeZ[0], 2, 1, localPlayer.routeZ[0], false, 0, localPlayer.routeX[0], 0, 1, 0);
							this.field247 = super.mouseClickX;
							this.field248 = super.mouseClickY;
							this.crossMode = 2;
							this.crossCycle = 0;
							this.out.p1enc(189);
							this.out.p2_alt2(var5);
							this.out.p2(this.field547);
							this.out.p2_alt2(this.field546);
							this.out.p2_alt1(this.field548);
						}
					}
					if (var4 == 419 && this.interactWithLoc(var2, var5, var3)) {
						this.out.p1enc(18);
						this.out.p2_alt3(this.field548);
						this.out.p2_alt2(var5 >> 14 & 0x7FFF);
						this.out.p2(this.field546);
						this.out.p2_alt1(var2 + this.mapBuildBaseX);
						this.out.p2_alt3(this.field547);
						this.out.p2(var3 + this.mapBuildBaseZ);
					}
					if (var4 == 621) {
						ClientPlayer var25 = this.players[var5];
						if (var25 != null) {
							this.tryMove(var25.routeX[0], (byte) 6, var25.routeZ[0], 2, 1, localPlayer.routeZ[0], false, 0, localPlayer.routeX[0], 0, 1, 0);
							this.field247 = super.mouseClickX;
							this.field248 = super.mouseClickY;
							this.crossMode = 2;
							this.crossCycle = 0;
							this.out.p1enc(170);
							this.out.p2_alt2(this.field637);
							this.out.p2(var5);
						}
					}
					if (var4 == 184) {
						boolean var26 = this.tryMove(var2, (byte) 6, var3, 2, 0, localPlayer.routeZ[0], false, 0, localPlayer.routeX[0], 0, 0, 0);
						if (!var26) {
							this.tryMove(var2, (byte) 6, var3, 2, 1, localPlayer.routeZ[0], false, 0, localPlayer.routeX[0], 0, 1, 0);
						}
						this.field247 = super.mouseClickX;
						this.field248 = super.mouseClickY;
						this.crossMode = 2;
						this.crossCycle = 0;
						this.out.p1enc(41);
						this.out.p2(var5);
						this.out.p2_alt3(var3 + this.mapBuildBaseZ);
						this.out.p2(var2 + this.mapBuildBaseX);
					}
					if (var4 == 985) {
						field337 += var3;
						if (field337 >= 145) {
							this.out.p1enc(100);
							field337 = 0;
						}
						this.interactWithLoc(var2, var5, var3);
						this.out.p1enc(59);
						this.out.p2(var5 >> 14 & 0x7FFF);
						this.out.p2_alt1(var3 + this.mapBuildBaseZ);
						this.out.p2_alt2(var2 + this.mapBuildBaseX);
					}
					if (var4 == 883) {
						ClientPlayer var28 = this.players[var5];
						if (var28 != null) {
							this.tryMove(var28.routeX[0], (byte) 6, var28.routeZ[0], 2, 1, localPlayer.routeZ[0], false, 0, localPlayer.routeX[0], 0, 1, 0);
							this.field247 = super.mouseClickX;
							this.field248 = super.mouseClickY;
							this.crossMode = 2;
							this.crossCycle = 0;
							this.out.p1enc(99);
							this.out.p2_alt3(var5);
						}
					}
					if (var4 == 16) {
						if (this.isMenuOpen) {
							this.world.method566(var2 - 4, var3 - 4);
						} else {
							this.world.method566(super.mouseClickX - 4, super.mouseClickY - 4);
						}
					}
					if (var4 == 208) {
						this.closeModal();
					}
					if (var4 == 1577) {
						this.interactWithLoc(var2, var5, var3);
						this.out.p1enc(206);
						this.out.p2_alt3(var2 + this.mapBuildBaseX);
						this.out.p2_alt1(var3 + this.mapBuildBaseZ);
						this.out.p2(var5 >> 14 & 0x7FFF);
					}
					if (var4 == 787) {
						String var29 = this.menuOption[arg0];
						int var30 = var29.indexOf("@whi@");
						if (var30 != -1) {
							if (this.mainModalId == -1) {
								this.closeModal();
								this.reportAbuseInput = var29.substring(var30 + 5).trim();
								this.reportAbuseMuteOption = false;
								this.reportAbuseComId = this.mainModalId = IfType.errrrrIdk;
							} else {
								this.addChat(0, "Please close the interface you have open before using 'report abuse'", "");
							}
						}
					}
					if (var4 == 157 && this.interactWithLoc(var2, var5, var3)) {
						this.out.p1enc(90);
						this.out.p2(var3 + this.mapBuildBaseZ);
						this.out.p2_alt2(var5 >> 14 & 0x7FFF);
						this.out.p2(var2 + this.mapBuildBaseX);
						this.out.p2_alt3(this.field637);
					}
					if (var4 == 62) {
						boolean var31 = this.tryMove(var2, (byte) 6, var3, 2, 0, localPlayer.routeZ[0], false, 0, localPlayer.routeX[0], 0, 0, 0);
						if (!var31) {
							this.tryMove(var2, (byte) 6, var3, 2, 1, localPlayer.routeZ[0], false, 0, localPlayer.routeX[0], 0, 1, 0);
						}
						this.field247 = super.mouseClickX;
						this.field248 = super.mouseClickY;
						this.crossMode = 2;
						this.crossCycle = 0;
						this.out.p1enc(113);
						this.out.p2_alt2(this.field546);
						this.out.p2_alt1(var3 + this.mapBuildBaseZ);
						this.out.p2_alt2(this.field548);
						this.out.p2_alt3(this.field547);
						this.out.p2(var2 + this.mapBuildBaseX);
						this.out.p2(var5);
					}
					if (var4 == 391) {
						this.out.p1enc(174);
						this.out.p2_alt2(var2);
						this.out.p2_alt3(var5);
						this.out.p2_alt1(var3);
						this.field500 = 0;
						this.field501 = var3;
						this.field502 = var2;
						this.field503 = 2;
						if (IfType.list(var3).layerId == this.mainModalId) {
							this.field503 = 1;
						}
						if (IfType.list(var3).layerId == this.chatComId) {
							this.field503 = 3;
						}
					}
					if (var4 == 233) {
						ClientPlayer var33 = this.players[var5];
						if (var33 != null) {
							this.tryMove(var33.routeX[0], (byte) 6, var33.routeZ[0], 2, 1, localPlayer.routeZ[0], false, 0, localPlayer.routeX[0], 0, 1, 0);
							this.field247 = super.mouseClickX;
							this.field248 = super.mouseClickY;
							this.crossMode = 2;
							this.crossCycle = 0;
							this.out.p1enc(190);
							this.out.p2(var5);
						}
					}
					if (var4 == 81) {
						boolean var34 = this.tryMove(var2, (byte) 6, var3, 2, 0, localPlayer.routeZ[0], false, 0, localPlayer.routeX[0], 0, 0, 0);
						if (!var34) {
							this.tryMove(var2, (byte) 6, var3, 2, 1, localPlayer.routeZ[0], false, 0, localPlayer.routeX[0], 0, 1, 0);
						}
						this.field247 = super.mouseClickX;
						this.field248 = super.mouseClickY;
						this.crossMode = 2;
						this.crossCycle = 0;
						this.out.p1enc(12);
						this.out.p2_alt2(var5);
						this.out.p2(var3 + this.mapBuildBaseZ);
						this.out.p2_alt3(var2 + this.mapBuildBaseX);
					}
					if (var4 == 696 || var4 == 379 || var4 == 526 || var4 == 212) {
						String var36 = this.menuOption[arg0];
						int var37 = var36.indexOf("@whi@");
						if (var37 != -1) {
							long var38 = JString.toUserhash(var36.substring(var37 + 5).trim());
							if (var4 == 696) {
								this.addFriend(var38);
							}
							if (var4 == 379) {
								this.addIgnore(var38);
							}
							if (var4 == 526) {
								this.delFriend(var38);
							}
							if (var4 == 212) {
								this.delIgnore(var38, this.field557);
							}
						}
					}
					if (var4 == 1184) {
						ObjType var40 = ObjType.list(var5);
						String var41;
						if (var40.desc == null) {
							var41 = "It's a " + var40.name + ".";
						} else {
							var41 = new String(var40.desc);
						}
						this.addChat(0, var41, "");
					}
					if (var4 == 963) {
						this.useMode = 1;
						this.field546 = var2;
						this.field547 = var3;
						this.field548 = var5;
						this.objSelectedName = ObjType.list(var5).name;
						this.targetMode = 0;
						this.redrawSidebar = true;
					} else {
						if (var4 == 447) {
							ClientNpc var42 = this.npc[var5];
							if (var42 != null) {
								this.tryMove(var42.routeX[0], (byte) 6, var42.routeZ[0], 2, 1, localPlayer.routeZ[0], false, 0, localPlayer.routeX[0], 0, 1, 0);
								this.field247 = super.mouseClickX;
								this.field248 = super.mouseClickY;
								this.crossMode = 2;
								this.crossCycle = 0;
								this.out.p1enc(163);
								this.out.p2_alt2(var5);
							}
						}
						if (var4 == 940 || var4 == 113) {
							String var43 = this.menuOption[arg0];
							int var44 = var43.indexOf("@whi@");
							if (var44 != -1) {
								String var45 = var43.substring(var44 + 5).trim();
								String var46 = JString.toSentenceCase(JString.toRawUsername(JString.toUserhash(var45)));
								boolean var47 = false;
								for (int var48 = 0; var48 < this.playerCount; var48++) {
									ClientPlayer var49 = this.players[this.playerIds[var48]];
									if (var49 != null && var49.name != null && var49.name.equalsIgnoreCase(var46)) {
										this.tryMove(var49.routeX[0], (byte) 6, var49.routeZ[0], 2, 1, localPlayer.routeZ[0], false, 0, localPlayer.routeX[0], 0, 1, 0);
										if (var4 == 940) {
											this.out.p1enc(162);
											this.out.p2(this.playerIds[var48]);
										}
										if (var4 == 113) {
											this.out.p1enc(99);
											this.out.p2_alt3(this.playerIds[var48]);
										}
										var47 = true;
										break;
									}
								}
								if (!var47) {
									this.addChat(0, "Unable to find " + var46, "");
								}
							}
						}
						if (var4 == 482) {
							this.unloadIf(this.field629);
							this.field629 = -1;
							this.redrawChatback = true;
						}
						if (var4 == 896) {
							ClientPlayer var50 = this.players[var5];
							if (var50 != null) {
								this.tryMove(var50.routeX[0], (byte) 6, var50.routeZ[0], 2, 1, localPlayer.routeZ[0], false, 0, localPlayer.routeX[0], 0, 1, 0);
								this.field247 = super.mouseClickX;
								this.field248 = super.mouseClickY;
								this.crossMode = 2;
								this.crossCycle = 0;
								this.out.p1enc(162);
								this.out.p2(var5);
							}
						}
						if (var4 == 789) {
							this.out.p1enc(14);
							this.out.p2_alt3(this.field637);
							this.out.p2(var5);
							this.out.p2_alt1(var3);
							this.out.p2_alt2(var2);
							this.field500 = 0;
							this.field501 = var3;
							this.field502 = var2;
							this.field503 = 2;
							if (IfType.list(var3).layerId == this.mainModalId) {
								this.field503 = 1;
							}
							if (IfType.list(var3).layerId == this.chatComId) {
								this.field503 = 3;
							}
						}
						if (var4 == 766) {
							this.interactWithLoc(var2, var5, var3);
							this.out.p1enc(217);
							this.out.p2_alt3(var2 + this.mapBuildBaseX);
							this.out.p2_alt1(var3 + this.mapBuildBaseZ);
							this.out.p2_alt1(var5 >> 14 & 0x7FFF);
						}
						if (var4 == 247) {
							String var51 = this.menuOption[arg0];
							int var52 = var51.indexOf("@whi@");
							if (var52 != -1) {
								long var53 = JString.toUserhash(var51.substring(var52 + 5).trim());
								int var55 = -1;
								for (int var56 = 0; var56 < this.friendCount; var56++) {
									if (this.friendUserhash[var56] == var53) {
										var55 = var56;
										break;
									}
								}
								if (var55 != -1 && this.friendNodeId[var55] > 0) {
									this.redrawChatback = true;
									this.dialogueInputOpen = 0;
									this.socialInputOpen = true;
									this.socialInput = "";
									this.socialInputType = 3;
									this.field193 = this.friendUserhash[var55];
									this.socialInputHeader = "Enter message to send to " + this.friendUsername[var55];
								}
							}
						}
						if (var4 == 277) {
							field201++;
							if (field201 >= 132) {
								this.out.p1enc(95);
								this.out.p4(0);
								field201 = 0;
							}
							this.out.p1enc(93);
							this.out.p2_alt2(var3);
							this.out.p2_alt2(var2);
							this.out.p2(var5);
							this.field500 = 0;
							this.field501 = var3;
							this.field502 = var2;
							this.field503 = 2;
							if (IfType.list(var3).layerId == this.mainModalId) {
								this.field503 = 1;
							}
							if (IfType.list(var3).layerId == this.chatComId) {
								this.field503 = 3;
							}
						}
						if (var4 == 359) {
							ClientPlayer var57 = this.players[var5];
							if (var57 != null) {
								this.tryMove(var57.routeX[0], (byte) 6, var57.routeZ[0], 2, 1, localPlayer.routeZ[0], false, 0, localPlayer.routeX[0], 0, 1, 0);
								this.field247 = super.mouseClickX;
								this.field248 = super.mouseClickY;
								this.crossMode = 2;
								this.crossCycle = 0;
								this.out.p1enc(134);
								this.out.p2_alt1(var5);
							}
						}
						if (var4 == 530) {
							this.out.p1enc(19);
							this.out.p2_alt1(var3);
							this.out.p2_alt1(var2);
							this.out.p2_alt3(var5);
							this.field500 = 0;
							this.field501 = var3;
							this.field502 = var2;
							this.field503 = 2;
							if (IfType.list(var3).layerId == this.mainModalId) {
								this.field503 = 1;
							}
							if (IfType.list(var3).layerId == this.chatComId) {
								this.field503 = 3;
							}
						}
						if (var4 == 485) {
							this.out.p1enc(117);
							this.out.p2_alt3(var5);
							this.out.p2_alt1(var2);
							this.out.p2_alt3(var3);
							this.field500 = 0;
							this.field501 = var3;
							this.field502 = var2;
							this.field503 = 2;
							if (IfType.list(var3).layerId == this.mainModalId) {
								this.field503 = 1;
							}
							if (IfType.list(var3).layerId == this.chatComId) {
								this.field503 = 3;
							}
						}
						if (var4 == 538) {
							boolean var58 = this.tryMove(var2, (byte) 6, var3, 2, 0, localPlayer.routeZ[0], false, 0, localPlayer.routeX[0], 0, 0, 0);
							if (!var58) {
								this.tryMove(var2, (byte) 6, var3, 2, 1, localPlayer.routeZ[0], false, 0, localPlayer.routeX[0], 0, 1, 0);
							}
							this.field247 = super.mouseClickX;
							this.field248 = super.mouseClickY;
							this.crossMode = 2;
							this.crossCycle = 0;
							this.out.p1enc(104);
							this.out.p2_alt2(var2 + this.mapBuildBaseX);
							this.out.p2(var3 + this.mapBuildBaseZ);
							this.out.p2_alt1(this.field637);
							this.out.p2(var5);
						}
						if (var4 == 689) {
							boolean var60 = this.tryMove(var2, (byte) 6, var3, 2, 0, localPlayer.routeZ[0], false, 0, localPlayer.routeX[0], 0, 0, 0);
							if (!var60) {
								this.tryMove(var2, (byte) 6, var3, 2, 1, localPlayer.routeZ[0], false, 0, localPlayer.routeX[0], 0, 1, 0);
							}
							this.field247 = super.mouseClickX;
							this.field248 = super.mouseClickY;
							this.crossMode = 2;
							this.crossCycle = 0;
							field246 += var3;
							if (field246 >= 102) {
								this.out.p1enc(30);
								this.out.p4(0);
								field246 = 0;
							}
							this.out.p1enc(57);
							this.out.p2(var5);
							this.out.p2(var2 + this.mapBuildBaseX);
							this.out.p2_alt2(var3 + this.mapBuildBaseZ);
						}
						if (var4 == 790) {
							this.out.p1enc(208);
							this.out.p2(var3);
							IfType var62 = IfType.list(var3);
							if (var62.scripts != null && var62.scripts[0][0] == 5) {
								int var63 = var62.scripts[0][1];
								this.var[var63] = 1 - this.var[var63];
								this.clientVar(var63);
								this.redrawSidebar = true;
							}
						}
						if (var4 == 1870) {
							ObjType var64 = ObjType.list(var5);
							IfType var65 = IfType.list(var3);
							String var66;
							if (var65 != null && var65.linkObjNumber[var2] >= 100000) {
								var66 = var65.linkObjNumber[var2] + " x " + var64.name;
							} else if (var64.desc == null) {
								var66 = "It's a " + var64.name + ".";
							} else {
								var66 = new String(var64.desc);
							}
							this.addChat(0, var66, "");
						}
						if (var4 == 256) {
							this.interactWithLoc(var2, var5, var3);
							this.out.p1enc(102);
							this.out.p2_alt1(var2 + this.mapBuildBaseX);
							this.out.p2_alt2(var3 + this.mapBuildBaseZ);
							this.out.p2_alt2(var5 >> 14 & 0x7FFF);
						}
						if (var4 == 588) {
							this.interactWithLoc(var2, var5, var3);
							this.out.p1enc(9);
							this.out.p2_alt1(var3 + this.mapBuildBaseZ);
							this.out.p2_alt2(var5 >> 14 & 0x7FFF);
							this.out.p2_alt3(var2 + this.mapBuildBaseX);
						}
						if (var4 == 152) {
							if ((var2 & 0x3) == 0) {
								field526++;
							}
							if (field526 >= 129) {
								this.out.p1enc(87);
								this.out.p2(37562);
								field526 = 0;
							}
							this.out.p1enc(176);
							this.out.p2(var3);
							this.out.p2(var2);
							this.out.p2(var5);
							this.field500 = 0;
							this.field501 = var3;
							this.field502 = var2;
							this.field503 = 2;
							if (IfType.list(var3).layerId == this.mainModalId) {
								this.field503 = 1;
							}
							if (IfType.list(var3).layerId == this.chatComId) {
								this.field503 = 3;
							}
						}
						if (var4 == 145) {
							ClientPlayer var67 = this.players[var5];
							if (var67 != null) {
								this.tryMove(var67.routeX[0], (byte) 6, var67.routeZ[0], 2, 1, localPlayer.routeZ[0], false, 0, localPlayer.routeX[0], 0, 1, 0);
								this.field247 = super.mouseClickX;
								this.field248 = super.mouseClickY;
								this.crossMode = 2;
								this.crossCycle = 0;
								field294 += var5;
								if (field294 >= 50) {
									this.out.p1enc(164);
									this.out.p3(3839761);
									field294 = 0;
								}
								this.out.p1enc(54);
								this.out.p2_alt2(var5);
							}
						}
						if (var4 == 1327) {
							int var68 = var5 >> 14 & 0x7FFF;
							LocType var69 = LocType.list(var68);
							String var70;
							if (var69.desc == null) {
								var70 = "It's a " + var69.name + ".";
							} else {
								var70 = new String(var69.desc);
							}
							this.addChat(0, var70, "");
						}
						if (var4 == 24) {
							ClientNpc var71 = this.npc[var5];
							if (var71 != null) {
								this.tryMove(var71.routeX[0], (byte) 6, var71.routeZ[0], 2, 1, localPlayer.routeZ[0], false, 0, localPlayer.routeX[0], 0, 1, 0);
								this.field247 = super.mouseClickX;
								this.field248 = super.mouseClickY;
								this.crossMode = 2;
								this.crossCycle = 0;
								this.out.p1enc(76);
								this.out.p2_alt3(var5);
							}
						}
						if (var4 == 851) {
							ClientNpc var72 = this.npc[var5];
							if (var72 != null) {
								this.tryMove(var72.routeX[0], (byte) 6, var72.routeZ[0], 2, 1, localPlayer.routeZ[0], false, 0, localPlayer.routeX[0], 0, 1, 0);
								this.field247 = super.mouseClickX;
								this.field248 = super.mouseClickY;
								this.crossMode = 2;
								this.crossCycle = 0;
								if ((var5 & 0x3) == 0) {
									field279++;
								}
								if (field279 >= 111) {
									this.out.p1enc(199);
									this.out.p4(0);
									field279 = 0;
								}
								this.out.p1enc(37);
								this.out.p2(var5);
							}
						}
						if (var4 == 395) {
							this.out.p1enc(137);
							this.out.p2_alt1(var3);
							this.out.p2(this.field547);
							this.out.p2_alt1(this.field548);
							this.out.p2_alt2(this.field546);
							this.out.p2_alt2(var2);
							this.out.p2_alt1(var5);
							this.field500 = 0;
							this.field501 = var3;
							this.field502 = var2;
							this.field503 = 2;
							if (IfType.list(var3).layerId == this.mainModalId) {
								this.field503 = 1;
							}
							if (IfType.list(var3).layerId == this.chatComId) {
								this.field503 = 3;
							}
						}
						if (var4 == 181) {
							this.out.p1enc(140);
							this.out.p2_alt1(var2);
							this.out.p2_alt2(var3);
							this.out.p2_alt3(var5);
							this.field500 = 0;
							this.field501 = var3;
							this.field502 = var2;
							this.field503 = 2;
							if (IfType.list(var3).layerId == this.mainModalId) {
								this.field503 = 1;
							}
							if (IfType.list(var3).layerId == this.chatComId) {
								this.field503 = 3;
							}
						}
						this.useMode = 0;
						this.targetMode = 0;
						this.redrawSidebar = true;
					}
				}
			}
		} catch (RuntimeException var74) {
			signlink.reporterror("34192, " + arg0 + ", " + -44 + ", " + var74.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.K(I)V")
	public void addWorldOptions() {
		try {
			if (this.useMode == 0 && this.targetMode == 0) {
				this.menuOption[this.menuNumEntries] = "Walk here";
				this.menuAction[this.menuNumEntries] = 16;
				this.menuParamB[this.menuNumEntries] = super.mouseX;
				this.menuParamC[this.menuNumEntries] = super.mouseY;
				this.menuNumEntries++;
			}
			int var1 = -1;
			for (int var2 = 0; var2 < Model.pickedCount; var2++) {
				int var3 = Model.pickedEntityTypecode[var2];
				int var4 = var3 & 0x7F;
				int var5 = var3 >> 7 & 0x7F;
				int var6 = var3 >> 29 & 0x3;
				int var7 = var3 >> 14 & 0x7FFF;
				if (var3 != var1) {
					var1 = var3;
					if (var6 == 2 && this.world.typeCode2(this.minusedlevel, var4, var5, var3) >= 0) {
						LocType var8 = LocType.list(var7);
						if (var8.multiloc != null) {
							var8 = var8.method194(this.field277);
						}
						if (var8 == null) {
							continue;
						}
						if (this.useMode == 1) {
							this.menuOption[this.menuNumEntries] = "Use " + this.objSelectedName + " with @cya@" + var8.name;
							this.menuAction[this.menuNumEntries] = 419;
							this.menuParamA[this.menuNumEntries] = var3;
							this.menuParamB[this.menuNumEntries] = var4;
							this.menuParamC[this.menuNumEntries] = var5;
							this.menuNumEntries++;
						} else if (this.targetMode != 1) {
							if (var8.op != null) {
								for (int var9 = 4; var9 >= 0; var9--) {
									if (var8.op[var9] != null) {
										this.menuOption[this.menuNumEntries] = var8.op[var9] + " @cya@" + var8.name;
										if (var9 == 0) {
											this.menuAction[this.menuNumEntries] = 588;
										}
										if (var9 == 1) {
											this.menuAction[this.menuNumEntries] = 256;
										}
										if (var9 == 2) {
											this.menuAction[this.menuNumEntries] = 766;
										}
										if (var9 == 3) {
											this.menuAction[this.menuNumEntries] = 985;
										}
										if (var9 == 4) {
											this.menuAction[this.menuNumEntries] = 1577;
										}
										this.menuParamA[this.menuNumEntries] = var3;
										this.menuParamB[this.menuNumEntries] = var4;
										this.menuParamC[this.menuNumEntries] = var5;
										this.menuNumEntries++;
									}
								}
							}
							this.menuOption[this.menuNumEntries] = "Examine @cya@" + var8.name;
							this.menuAction[this.menuNumEntries] = 1327;
							this.menuParamA[this.menuNumEntries] = var8.id << 14;
							this.menuParamB[this.menuNumEntries] = var4;
							this.menuParamC[this.menuNumEntries] = var5;
							this.menuNumEntries++;
						} else if ((this.field638 & 0x4) == 4) {
							this.menuOption[this.menuNumEntries] = this.targetOp + " @cya@" + var8.name;
							this.menuAction[this.menuNumEntries] = 157;
							this.menuParamA[this.menuNumEntries] = var3;
							this.menuParamB[this.menuNumEntries] = var4;
							this.menuParamC[this.menuNumEntries] = var5;
							this.menuNumEntries++;
						}
					}
					if (var6 == 1) {
						ClientNpc var10 = this.npc[var7];
						if (var10.type.size == 1 && (var10.x & 0x7F) == 64 && (var10.z & 0x7F) == 64) {
							for (int var11 = 0; var11 < this.npcCount; var11++) {
								ClientNpc var12 = this.npc[this.npcIds[var11]];
								if (var12 != null && var12 != var10 && var12.type.size == 1 && var12.x == var10.x && var12.z == var10.z) {
									this.addNpcOptions(this.npcIds[var11], var12.type, var5, var4);
								}
							}
							for (int var13 = 0; var13 < this.playerCount; var13++) {
								ClientPlayer var14 = this.players[this.playerIds[var13]];
								if (var14 != null && var14.x == var10.x && var14.z == var10.z) {
									this.addPlayerOptions(var4, this.playerIds[var13], var5, var14);
								}
							}
						}
						this.addNpcOptions(var7, var10.type, var5, var4);
					}
					if (var6 == 0) {
						ClientPlayer var15 = this.players[var7];
						if ((var15.x & 0x7F) == 64 && (var15.z & 0x7F) == 64) {
							for (int var16 = 0; var16 < this.npcCount; var16++) {
								ClientNpc var17 = this.npc[this.npcIds[var16]];
								if (var17 != null && var17.type.size == 1 && var17.x == var15.x && var17.z == var15.z) {
									this.addNpcOptions(this.npcIds[var16], var17.type, var5, var4);
								}
							}
							for (int var18 = 0; var18 < this.playerCount; var18++) {
								ClientPlayer var19 = this.players[this.playerIds[var18]];
								if (var19 != null && var19 != var15 && var19.x == var15.x && var19.z == var15.z) {
									this.addPlayerOptions(var4, this.playerIds[var18], var5, var19);
								}
							}
						}
						this.addPlayerOptions(var4, var7, var5, var15);
					}
					if (var6 == 3) {
						LinkList var20 = this.groundObj[this.minusedlevel][var4][var5];
						if (var20 != null) {
							for (ClientObj var21 = (ClientObj) var20.tail(); var21 != null; var21 = (ClientObj) var20.prev((byte) 3)) {
								ObjType var22 = ObjType.list(var21.id);
								if (this.useMode == 1) {
									this.menuOption[this.menuNumEntries] = "Use " + this.objSelectedName + " with @lre@" + var22.name;
									this.menuAction[this.menuNumEntries] = 62;
									this.menuParamA[this.menuNumEntries] = var21.id;
									this.menuParamB[this.menuNumEntries] = var4;
									this.menuParamC[this.menuNumEntries] = var5;
									this.menuNumEntries++;
								} else if (this.targetMode != 1) {
									for (int var23 = 4; var23 >= 0; var23--) {
										if (var22.op != null && var22.op[var23] != null) {
											this.menuOption[this.menuNumEntries] = var22.op[var23] + " @lre@" + var22.name;
											if (var23 == 0) {
												this.menuAction[this.menuNumEntries] = 184;
											}
											if (var23 == 1) {
												this.menuAction[this.menuNumEntries] = 81;
											}
											if (var23 == 2) {
												this.menuAction[this.menuNumEntries] = 98;
											}
											if (var23 == 3) {
												this.menuAction[this.menuNumEntries] = 275;
											}
											if (var23 == 4) {
												this.menuAction[this.menuNumEntries] = 689;
											}
											this.menuParamA[this.menuNumEntries] = var21.id;
											this.menuParamB[this.menuNumEntries] = var4;
											this.menuParamC[this.menuNumEntries] = var5;
											this.menuNumEntries++;
										} else if (var23 == 2) {
											this.menuOption[this.menuNumEntries] = "Take @lre@" + var22.name;
											this.menuAction[this.menuNumEntries] = 98;
											this.menuParamA[this.menuNumEntries] = var21.id;
											this.menuParamB[this.menuNumEntries] = var4;
											this.menuParamC[this.menuNumEntries] = var5;
											this.menuNumEntries++;
										}
									}
									this.menuOption[this.menuNumEntries] = "Examine @lre@" + var22.name;
									this.menuAction[this.menuNumEntries] = 1184;
									this.menuParamA[this.menuNumEntries] = var21.id;
									this.menuParamB[this.menuNumEntries] = var4;
									this.menuParamC[this.menuNumEntries] = var5;
									this.menuNumEntries++;
								} else if ((this.field638 & 0x1) == 1) {
									this.menuOption[this.menuNumEntries] = this.targetOp + " @lre@" + var22.name;
									this.menuAction[this.menuNumEntries] = 538;
									this.menuParamA[this.menuNumEntries] = var21.id;
									this.menuParamB[this.menuNumEntries] = var4;
									this.menuParamC[this.menuNumEntries] = var5;
									this.menuNumEntries++;
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

	@ObfuscatedName("client.a(ZILNPWLDXJE;II)V")
	public void addNpcOptions(int arg0, NpcType arg1, int arg2, int arg3) {
		try {
			if (this.menuNumEntries < 400) {
				if (arg1.multinpc != null) {
					arg1 = arg1.method389();
				}
				if (arg1 != null && arg1.active) {
					String var5 = arg1.name;
					if (arg1.vislevel != 0) {
						var5 = var5 + combatColourCode(arg1.vislevel, localPlayer.combatLevel) + " (level-" + arg1.vislevel + ")";
					}
					if (this.useMode == 1) {
						this.menuOption[this.menuNumEntries] = "Use " + this.objSelectedName + " with @yel@" + var5;
						this.menuAction[this.menuNumEntries] = 646;
						this.menuParamA[this.menuNumEntries] = arg0;
						this.menuParamB[this.menuNumEntries] = arg3;
						this.menuParamC[this.menuNumEntries] = arg2;
						this.menuNumEntries++;
					} else if (this.targetMode != 1) {
						if (arg1.op != null) {
							for (int var6 = 4; var6 >= 0; var6--) {
								if (arg1.op[var6] != null && !arg1.op[var6].equalsIgnoreCase("attack")) {
									this.menuOption[this.menuNumEntries] = arg1.op[var6] + " @yel@" + var5;
									if (var6 == 0) {
										this.menuAction[this.menuNumEntries] = 447;
									}
									if (var6 == 1) {
										this.menuAction[this.menuNumEntries] = 24;
									}
									if (var6 == 2) {
										this.menuAction[this.menuNumEntries] = 851;
									}
									if (var6 == 3) {
										this.menuAction[this.menuNumEntries] = 515;
									}
									if (var6 == 4) {
										this.menuAction[this.menuNumEntries] = 983;
									}
									this.menuParamA[this.menuNumEntries] = arg0;
									this.menuParamB[this.menuNumEntries] = arg3;
									this.menuParamC[this.menuNumEntries] = arg2;
									this.menuNumEntries++;
								}
							}
						}
						if (arg1.op != null) {
							for (int var7 = 4; var7 >= 0; var7--) {
								if (arg1.op[var7] != null && arg1.op[var7].equalsIgnoreCase("attack")) {
									short var8 = 0;
									if (arg1.vislevel > localPlayer.combatLevel) {
										var8 = 2000;
									}
									this.menuOption[this.menuNumEntries] = arg1.op[var7] + " @yel@" + var5;
									if (var7 == 0) {
										this.menuAction[this.menuNumEntries] = var8 + 447;
									}
									if (var7 == 1) {
										this.menuAction[this.menuNumEntries] = var8 + 24;
									}
									if (var7 == 2) {
										this.menuAction[this.menuNumEntries] = var8 + 851;
									}
									if (var7 == 3) {
										this.menuAction[this.menuNumEntries] = var8 + 515;
									}
									if (var7 == 4) {
										this.menuAction[this.menuNumEntries] = var8 + 983;
									}
									this.menuParamA[this.menuNumEntries] = arg0;
									this.menuParamB[this.menuNumEntries] = arg3;
									this.menuParamC[this.menuNumEntries] = arg2;
									this.menuNumEntries++;
								}
							}
						}
						this.menuOption[this.menuNumEntries] = "Examine @yel@" + var5;
						this.menuAction[this.menuNumEntries] = 1335;
						this.menuParamA[this.menuNumEntries] = arg0;
						this.menuParamB[this.menuNumEntries] = arg3;
						this.menuParamC[this.menuNumEntries] = arg2;
						this.menuNumEntries++;
					} else if ((this.field638 & 0x2) == 2) {
						this.menuOption[this.menuNumEntries] = this.targetOp + " @yel@" + var5;
						this.menuAction[this.menuNumEntries] = 403;
						this.menuParamA[this.menuNumEntries] = arg0;
						this.menuParamB[this.menuNumEntries] = arg3;
						this.menuParamC[this.menuNumEntries] = arg2;
						this.menuNumEntries++;
						return;
					}
				}
			}
		} catch (RuntimeException var10) {
			signlink.reporterror("49426, " + true + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + var10.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.a(IIILAWOZVMFS;I)V")
	public void addPlayerOptions(int arg0, int arg1, int arg2, ClientPlayer arg3) {
		try {
			if (arg3 != localPlayer && this.menuNumEntries < 400) {
				String var5;
				if (arg3.skillLevel == 0) {
					var5 = arg3.name + combatColourCode(arg3.combatLevel, localPlayer.combatLevel) + " (level-" + arg3.combatLevel + ")";
				} else {
					var5 = arg3.name + " (skill-" + arg3.skillLevel + ")";
				}
				if (this.useMode == 1) {
					this.menuOption[this.menuNumEntries] = "Use " + this.objSelectedName + " with @whi@" + var5;
					this.menuAction[this.menuNumEntries] = 703;
					this.menuParamA[this.menuNumEntries] = arg1;
					this.menuParamB[this.menuNumEntries] = arg0;
					this.menuParamC[this.menuNumEntries] = arg2;
					this.menuNumEntries++;
				} else if (this.targetMode != 1) {
					for (int var6 = 4; var6 >= 0; var6--) {
						if (this.playerOp[var6] != null) {
							this.menuOption[this.menuNumEntries] = this.playerOp[var6] + " @whi@" + var5;
							short var7 = 0;
							if (this.playerOp[var6].equalsIgnoreCase("attack")) {
								if (arg3.combatLevel > localPlayer.combatLevel) {
									var7 = 2000;
								}
								if (localPlayer.field130 != 0 && arg3.field130 != 0) {
									if (localPlayer.field130 == arg3.field130) {
										var7 = 2000;
									} else {
										var7 = 0;
									}
								}
							} else if (this.playerOpPriority[var6]) {
								var7 = 2000;
							}
							if (var6 == 0) {
								this.menuAction[this.menuNumEntries] = var7 + 883;
							}
							if (var6 == 1) {
								this.menuAction[this.menuNumEntries] = var7 + 145;
							}
							if (var6 == 2) {
								this.menuAction[this.menuNumEntries] = var7 + 359;
							}
							if (var6 == 3) {
								this.menuAction[this.menuNumEntries] = var7 + 896;
							}
							if (var6 == 4) {
								this.menuAction[this.menuNumEntries] = var7 + 233;
							}
							this.menuParamA[this.menuNumEntries] = arg1;
							this.menuParamB[this.menuNumEntries] = arg0;
							this.menuParamC[this.menuNumEntries] = arg2;
							this.menuNumEntries++;
						}
					}
				} else if ((this.field638 & 0x8) == 8) {
					this.menuOption[this.menuNumEntries] = this.targetOp + " @whi@" + var5;
					this.menuAction[this.menuNumEntries] = 621;
					this.menuParamA[this.menuNumEntries] = arg1;
					this.menuParamB[this.menuNumEntries] = arg0;
					this.menuParamC[this.menuNumEntries] = arg2;
					this.menuNumEntries++;
				}
				for (int var8 = 0; var8 < this.menuNumEntries; var8++) {
					if (this.menuAction[var8] == 16) {
						this.menuOption[var8] = "Walk here @whi@" + var5;
						return;
					}
				}
			}
		} catch (RuntimeException var10) {
			signlink.reporterror("64356, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 3 + ", " + var10.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.a(ILIRYXZZFE;IIIIII)V")
	public void addComponentOptions(int arg0, IfType arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		try {
			if (arg1.type == 0 && arg1.children != null && !arg1.hide && (arg4 >= arg6 && arg3 >= arg5 && arg4 <= arg6 + arg1.width && arg3 <= arg5 + arg1.height)) {
				int var8 = arg1.children.length;
				for (int var9 = 0; var9 < var8; var9++) {
					int var10 = arg1.childX[var9] + arg6;
					int var11 = arg1.childY[var9] + arg5 - arg0;
					IfType var12 = IfType.list(arg1.children[var9]);
					int var13 = var10 + var12.field937;
					int var14 = var11 + var12.field907;
					if ((var12.overlayId >= 0 || var12.colourOver != 0) && arg4 >= var13 && arg3 >= var14 && arg4 < var13 + var12.width && arg3 < var14 + var12.height) {
						if (var12.overlayId >= 0) {
							this.field524 = var12.overlayId;
						} else {
							this.field524 = var12.id;
						}
					}
					if (var12.type == 8 && arg4 >= var13 && arg3 >= var14 && arg4 < var13 + var12.width && arg3 < var14 + var12.height) {
						this.field394 = var12.id;
					}
					if (var12.type == 0) {
						this.addComponentOptions(var12.scrollPos, var12, arg2, arg3, arg4, var14, var13);
						if (var12.scrollheight > var12.height) {
							this.doScrollbar(var12, arg2, var12.scrollheight, arg4, var13 + var12.width, arg3, var12.height, var14);
						}
					} else {
						if (var12.buttonType == 1 && arg4 >= var13 && arg3 >= var14 && arg4 < var13 + var12.width && arg3 < var14 + var12.height) {
							boolean var15 = false;
							if (var12.clientCode != 0) {
								var15 = this.addSocialOptions(var12);
							}
							if (!var15) {
								this.menuOption[this.menuNumEntries] = var12.buttonText;
								this.menuAction[this.menuNumEntries] = 426;
								this.menuParamC[this.menuNumEntries] = var12.id;
								this.menuNumEntries++;
							}
						}
						if (var12.buttonType == 2 && this.targetMode == 0 && arg4 >= var13 && arg3 >= var14 && arg4 < var13 + var12.width && arg3 < var14 + var12.height) {
							String var16 = var12.targetVerb;
							if (var16.indexOf(" ") != -1) {
								var16 = var16.substring(0, var16.indexOf(" "));
							}
							this.menuOption[this.menuNumEntries] = var16 + " @gre@" + var12.targetBase;
							this.menuAction[this.menuNumEntries] = 582;
							this.menuParamC[this.menuNumEntries] = var12.id;
							this.menuNumEntries++;
						}
						if (var12.buttonType == 3 && arg4 >= var13 && arg3 >= var14 && arg4 < var13 + var12.width && arg3 < var14 + var12.height) {
							this.menuOption[this.menuNumEntries] = "Close";
							if (arg2 == 3) {
								this.menuAction[this.menuNumEntries] = 482;
							} else {
								this.menuAction[this.menuNumEntries] = 208;
							}
							this.menuParamC[this.menuNumEntries] = var12.id;
							this.menuNumEntries++;
						}
						if (var12.buttonType == 4 && arg4 >= var13 && arg3 >= var14 && arg4 < var13 + var12.width && arg3 < var14 + var12.height) {
							this.menuOption[this.menuNumEntries] = var12.buttonText;
							this.menuAction[this.menuNumEntries] = 790;
							this.menuParamC[this.menuNumEntries] = var12.id;
							this.menuNumEntries++;
						}
						if (var12.buttonType == 5 && arg4 >= var13 && arg3 >= var14 && arg4 < var13 + var12.width && arg3 < var14 + var12.height) {
							this.menuOption[this.menuNumEntries] = var12.buttonText;
							this.menuAction[this.menuNumEntries] = 951;
							this.menuParamC[this.menuNumEntries] = var12.id;
							this.menuNumEntries++;
						}
						if (var12.buttonType == 6 && !this.field446 && arg4 >= var13 && arg3 >= var14 && arg4 < var13 + var12.width && arg3 < var14 + var12.height) {
							this.menuOption[this.menuNumEntries] = var12.buttonText;
							this.menuAction[this.menuNumEntries] = 405;
							this.menuParamC[this.menuNumEntries] = var12.id;
							this.menuNumEntries++;
						}
						if (var12.type == 2) {
							int var17 = 0;
							for (int var18 = 0; var18 < var12.height; var18++) {
								for (int var19 = 0; var19 < var12.width; var19++) {
									int var20 = var13 + var19 * (var12.marginX + 32);
									int var21 = var14 + var18 * (var12.marginY + 32);
									if (var17 < 20) {
										var20 += var12.invBackgroundX[var17];
										var21 += var12.invBackgroundY[var17];
									}
									if (arg4 >= var20 && arg3 >= var21 && arg4 < var20 + 32 && arg3 < var21 + 32) {
										this.field531 = var17;
										this.field532 = var12.id;
										if (var12.linkObjType[var17] > 0) {
											ObjType var22 = ObjType.list(var12.linkObjType[var17] - 1);
											if (this.useMode == 1 && var12.objOps) {
												if (var12.id != this.field547 || var17 != this.field546) {
													this.menuOption[this.menuNumEntries] = "Use " + this.objSelectedName + " with @lre@" + var22.name;
													this.menuAction[this.menuNumEntries] = 395;
													this.menuParamA[this.menuNumEntries] = var22.id;
													this.menuParamB[this.menuNumEntries] = var17;
													this.menuParamC[this.menuNumEntries] = var12.id;
													this.menuNumEntries++;
												}
											} else if (this.targetMode != 1 || !var12.objOps) {
												if (var12.objOps) {
													for (int var23 = 4; var23 >= 3; var23--) {
														if (var22.iop != null && var22.iop[var23] != null) {
															this.menuOption[this.menuNumEntries] = var22.iop[var23] + " @lre@" + var22.name;
															if (var23 == 3) {
																this.menuAction[this.menuNumEntries] = 1;
															}
															if (var23 == 4) {
																this.menuAction[this.menuNumEntries] = 530;
															}
															this.menuParamA[this.menuNumEntries] = var22.id;
															this.menuParamB[this.menuNumEntries] = var17;
															this.menuParamC[this.menuNumEntries] = var12.id;
															this.menuNumEntries++;
														} else if (var23 == 4) {
															this.menuOption[this.menuNumEntries] = "Drop @lre@" + var22.name;
															this.menuAction[this.menuNumEntries] = 530;
															this.menuParamA[this.menuNumEntries] = var22.id;
															this.menuParamB[this.menuNumEntries] = var17;
															this.menuParamC[this.menuNumEntries] = var12.id;
															this.menuNumEntries++;
														}
													}
												}
												if (var12.objUse) {
													this.menuOption[this.menuNumEntries] = "Use @lre@" + var22.name;
													this.menuAction[this.menuNumEntries] = 963;
													this.menuParamA[this.menuNumEntries] = var22.id;
													this.menuParamB[this.menuNumEntries] = var17;
													this.menuParamC[this.menuNumEntries] = var12.id;
													this.menuNumEntries++;
												}
												if (var12.objOps && var22.iop != null) {
													for (int var24 = 2; var24 >= 0; var24--) {
														if (var22.iop[var24] != null) {
															this.menuOption[this.menuNumEntries] = var22.iop[var24] + " @lre@" + var22.name;
															if (var24 == 0) {
																this.menuAction[this.menuNumEntries] = 181;
															}
															if (var24 == 1) {
																this.menuAction[this.menuNumEntries] = 946;
															}
															if (var24 == 2) {
																this.menuAction[this.menuNumEntries] = 152;
															}
															this.menuParamA[this.menuNumEntries] = var22.id;
															this.menuParamB[this.menuNumEntries] = var17;
															this.menuParamC[this.menuNumEntries] = var12.id;
															this.menuNumEntries++;
														}
													}
												}
												if (var12.iop != null) {
													for (int var25 = 4; var25 >= 0; var25--) {
														if (var12.iop[var25] != null) {
															this.menuOption[this.menuNumEntries] = var12.iop[var25] + " @lre@" + var22.name;
															if (var25 == 0) {
																this.menuAction[this.menuNumEntries] = 391;
															}
															if (var25 == 1) {
																this.menuAction[this.menuNumEntries] = 377;
															}
															if (var25 == 2) {
																this.menuAction[this.menuNumEntries] = 277;
															}
															if (var25 == 3) {
																this.menuAction[this.menuNumEntries] = 281;
															}
															if (var25 == 4) {
																this.menuAction[this.menuNumEntries] = 485;
															}
															this.menuParamA[this.menuNumEntries] = var22.id;
															this.menuParamB[this.menuNumEntries] = var17;
															this.menuParamC[this.menuNumEntries] = var12.id;
															this.menuNumEntries++;
														}
													}
												}
												this.menuOption[this.menuNumEntries] = "Examine @lre@" + var22.name;
												this.menuAction[this.menuNumEntries] = 1870;
												this.menuParamA[this.menuNumEntries] = var22.id;
												this.menuParamB[this.menuNumEntries] = var17;
												this.menuParamC[this.menuNumEntries] = var12.id;
												this.menuNumEntries++;
											} else if ((this.field638 & 0x10) == 16) {
												this.menuOption[this.menuNumEntries] = this.targetOp + " @lre@" + var22.name;
												this.menuAction[this.menuNumEntries] = 789;
												this.menuParamA[this.menuNumEntries] = var22.id;
												this.menuParamB[this.menuNumEntries] = var17;
												this.menuParamC[this.menuNumEntries] = var12.id;
												this.menuNumEntries++;
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

	@ObfuscatedName("client.a(LIRYXZZFE;Z)Z")
	public boolean addSocialOptions(IfType arg0) {
		try {
			int var2 = arg0.clientCode;
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
				this.menuOption[this.menuNumEntries] = "Remove @whi@" + this.friendUsername[var2];
				this.menuAction[this.menuNumEntries] = 526;
				this.menuNumEntries++;
				this.menuOption[this.menuNumEntries] = "Message @whi@" + this.friendUsername[var2];
				this.menuAction[this.menuNumEntries] = 247;
				this.menuNumEntries++;
				return true;
			} else if (var2 >= 401 && var2 <= 500) {
				this.menuOption[this.menuNumEntries] = "Remove @whi@" + arg0.text;
				this.menuAction[this.menuNumEntries] = 212;
				this.menuNumEntries++;
				return true;
			} else {
				return false;
			}
		} catch (RuntimeException var4) {
			signlink.reporterror("47613, " + arg0 + ", " + false + ", " + var4.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.b(IBI)Ljava/lang/String;")
	public static String combatColourCode(int arg0, int arg1) {
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

	@ObfuscatedName("client.a(LIRYXZZFE;IBII)V")
	public void drawInterface(IfType arg0, int arg1, int arg2, int arg3) {
		try {
			if (arg0.type == 0 && arg0.children != null && (!arg0.hide || this.field388 == arg0.id || this.field255 == arg0.id || this.field271 == arg0.id)) {
				int var5 = Pix2D.clipMinX;
				int var6 = Pix2D.clipMinY;
				int var7 = Pix2D.clipMaxX;
				int var8 = Pix2D.clipMaxY;
				Pix2D.setClipping(arg1 + arg0.width, arg2 + arg0.height, arg1, this.field214, arg2);
				int var9 = arg0.children.length;
				for (int var10 = 0; var10 < var9; var10++) {
					int var11 = arg0.childX[var10] + arg1;
					int var12 = arg0.childY[var10] + arg2 - arg3;
					IfType var13 = IfType.list(arg0.children[var10]);
					int var14 = var11 + var13.field937;
					int var15 = var12 + var13.field907;
					if (var13.clientCode > 0) {
						this.clientComponent(var13, this.field620);
					}
					if (var13.type == 0) {
						if (var13.scrollPos > var13.scrollheight - var13.height) {
							var13.scrollPos = var13.scrollheight - var13.height;
						}
						if (var13.scrollPos < 0) {
							var13.scrollPos = 0;
						}
						this.drawInterface(var13, var14, var15, var13.scrollPos);
						if (var13.scrollheight > var13.height) {
							this.drawScrollbar(var13.scrollPos, var13.height, var13.scrollheight, var14 + var13.width, var15);
						}
					} else if (var13.type != 1) {
						if (var13.type == 2) {
							int var16 = 0;
							for (int var17 = 0; var17 < var13.height; var17++) {
								for (int var18 = 0; var18 < var13.width; var18++) {
									int var19 = var14 + var18 * (var13.marginX + 32);
									int var20 = var15 + var17 * (var13.marginY + 32);
									if (var16 < 20) {
										var19 += var13.invBackgroundX[var16];
										var20 += var13.invBackgroundY[var16];
									}
									if (var13.linkObjType[var16] > 0) {
										int var21 = 0;
										int var22 = 0;
										int var23 = var13.linkObjType[var16] - 1;
										if (var19 > Pix2D.clipMinX - 32 && var19 < Pix2D.clipMaxX && var20 > Pix2D.clipMinY - 32 && var20 < Pix2D.clipMaxY || this.objDragArea != 0 && this.field581 == var16) {
											int var24 = 0;
											if (this.useMode == 1 && this.field546 == var16 && this.field547 == var13.id) {
												var24 = 16777215;
											}
											Pix32 var25 = ObjType.getSprite(var23, var24, var13.linkObjNumber[var16]);
											if (var25 != null) {
												if (this.objDragArea != 0 && this.field581 == var16 && this.field580 == var13.id) {
													var21 = super.mouseX - this.field583;
													var22 = super.mouseY - this.field584;
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
													var25.transPlotSprite(var19 + var21, var20 + var22, this.field374);
													if (var20 + var22 < Pix2D.clipMinY && arg0.scrollPos > 0) {
														int var26 = this.worldUpdateNum * (Pix2D.clipMinY - var20 - var22) / 3;
														if (var26 > this.worldUpdateNum * 10) {
															var26 = this.worldUpdateNum * 10;
														}
														if (var26 > arg0.scrollPos) {
															var26 = arg0.scrollPos;
														}
														arg0.scrollPos -= var26;
														this.field584 += var26;
													}
													if (var20 + var22 + 32 > Pix2D.clipMaxY && arg0.scrollPos < arg0.scrollheight - arg0.height) {
														int var27 = this.worldUpdateNum * (var20 + var22 + 32 - Pix2D.clipMaxY) / 3;
														if (var27 > this.worldUpdateNum * 10) {
															var27 = this.worldUpdateNum * 10;
														}
														if (var27 > arg0.scrollheight - arg0.height - arg0.scrollPos) {
															var27 = arg0.scrollheight - arg0.height - arg0.scrollPos;
														}
														arg0.scrollPos += var27;
														this.field584 -= var27;
													}
												} else if (this.field503 != 0 && this.field502 == var16 && this.field501 == var13.id) {
													var25.transPlotSprite(var19, var20, this.field374);
												} else {
													var25.plotSprite(var19, this.field527, var20);
												}
												if (var25.owi == 33 || var13.linkObjNumber[var16] != 1) {
													int var28 = var13.linkObjNumber[var16];
													this.p11.drawString(invNumber(var28), var20 + var22 + 10, var19 + 1 + var21, 0);
													this.p11.drawString(invNumber(var28), var20 + var22 + 9, var19 + var21, 16776960);
												}
											}
										}
									} else if (var13.invBackground != null && var16 < 20) {
										Pix32 var29 = var13.invBackground[var16];
										if (var29 != null) {
											var29.plotSprite(var19, this.field527, var20);
										}
									}
									var16++;
								}
							}
						} else if (var13.type == 3) {
							boolean var30 = false;
							if (this.field271 == var13.id || this.field255 == var13.id || this.field388 == var13.id) {
								var30 = true;
							}
							int var31;
							if (this.getIfActive(var13)) {
								var31 = var13.colour2;
								if (var30 && var13.colour2Over != 0) {
									var31 = var13.colour2Over;
								}
							} else {
								var31 = var13.colour;
								if (var30 && var13.colourOver != 0) {
									var31 = var13.colourOver;
								}
							}
							if (var13.trans == 0) {
								if (var13.fill) {
									Pix2D.fillrect(var31, var14, 99, var13.width, var13.height, var15);
								} else {
									Pix2D.drawRect(var15, var13.width, var14, var13.height, var31);
								}
							} else if (var13.fill) {
								Pix2D.fillRectTrans(var13.height, var14, 256 - (var13.trans & 0xFF), var15, var13.width, var31);
							} else {
								Pix2D.drawRectTrans(var13.width, var31, var14, var15, 256 - (var13.trans & 0xFF), var13.height);
							}
						} else if (var13.type == 4) {
							PixFont var32 = var13.font;
							String var33 = var13.text;
							boolean var34 = false;
							if (this.field271 == var13.id || this.field255 == var13.id || this.field388 == var13.id) {
								var34 = true;
							}
							int var35;
							if (this.getIfActive(var13)) {
								var35 = var13.colour2;
								if (var34 && var13.colour2Over != 0) {
									var35 = var13.colour2Over;
								}
								if (var13.text2.length() > 0) {
									var33 = var13.text2;
								}
							} else {
								var35 = var13.colour;
								if (var34 && var13.colourOver != 0) {
									var35 = var13.colourOver;
								}
							}
							if (var13.buttonType == 6 && this.field446) {
								var33 = "Please wait...";
								var35 = var13.colour;
							}
							if (Pix2D.width == 479) {
								if (var35 == 16776960) {
									var35 = 255;
								}
								if (var35 == 49152) {
									var35 = 16777215;
								}
							}
							int var36 = var15 + var32.height;
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
																		var33 = var33.substring(0, var41) + this.inf(this.getIfVar(var13, 4)) + var33.substring(var41 + 2);
																	}
																}
																var33 = var33.substring(0, var40) + this.inf(this.getIfVar(var13, 3)) + var33.substring(var40 + 2);
															}
														}
														var33 = var33.substring(0, var39) + this.inf(this.getIfVar(var13, 2)) + var33.substring(var39 + 2);
													}
												}
												var33 = var33.substring(0, var38) + this.inf(this.getIfVar(var13, 1)) + var33.substring(var38 + 2);
											}
										}
										var33 = var33.substring(0, var37) + this.inf(this.getIfVar(var13, 0)) + var33.substring(var37 + 2);
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
								if (var13.centre) {
									var32.centreString(var14 + var13.width / 2, var43, var36, var13.shadow, var35);
								} else {
									var32.drawStringTag(var14, var36, var13.shadow, var35, var43);
								}
								var36 += var32.height;
							}
						} else if (var13.type == 5) {
							Pix32 var44;
							if (this.getIfActive(var13)) {
								var44 = var13.graphic2;
							} else {
								var44 = var13.graphic;
							}
							if (var44 != null) {
								var44.plotSprite(var14, this.field527, var15);
							}
						} else if (var13.type == 6) {
							int var45 = Pix3D.originX;
							int var46 = Pix3D.originY;
							Pix3D.originX = var14 + var13.width / 2;
							Pix3D.originY = var15 + var13.height / 2;
							int var47 = Pix3D.sinTable[var13.modelXAn] * var13.modelZoom >> 16;
							int var48 = Pix3D.cosTable[var13.modelXAn] * var13.modelZoom >> 16;
							boolean var49 = this.getIfActive(var13);
							int var50;
							if (var49) {
								var50 = var13.modelAnim2;
							} else {
								var50 = var13.modelAnim;
							}
							Model var51;
							if (var50 == -1) {
								var51 = var13.getTempModel(-1, -1, var49);
							} else {
								SeqType var52 = SeqType.list[var50];
								var51 = var13.getTempModel(var52.frames[var13.animFrame], var52.iframes[var13.animFrame], var49);
							}
							if (var51 != null) {
								var51.objRender(var13.modelYAn, 0, var13.modelXAn, 0, var47, var48);
							}
							Pix3D.originX = var45;
							Pix3D.originY = var46;
						} else {
							if (var13.type == 7) {
								PixFont var53 = var13.font;
								int var54 = 0;
								for (int var55 = 0; var55 < var13.height; var55++) {
									for (int var56 = 0; var56 < var13.width; var56++) {
										if (var13.linkObjType[var54] > 0) {
											ObjType var57 = ObjType.list(var13.linkObjType[var54] - 1);
											String var58 = var57.name;
											if (var57.stackable || var13.linkObjNumber[var54] != 1) {
												var58 = var58 + " x" + niceNumber(var13.linkObjNumber[var54]);
											}
											int var59 = var14 + var56 * (var13.marginX + 115);
											int var60 = var15 + var55 * (var13.marginY + 12);
											if (var13.centre) {
												var53.centreString(var59 + var13.width / 2, var58, var60, var13.shadow, var13.colour);
											} else {
												var53.drawStringTag(var59, var60, var13.shadow, var13.colour, var58);
											}
										}
										var54++;
									}
								}
							}
							if (var13.type == 8 && (this.field530 == var13.id || this.field203 == var13.id || this.field302 == var13.id) && this.field278 == 100) {
								int var61 = 0;
								int var62 = 0;
								PixFont var63 = this.p12;
								String var64 = var13.text;
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
									int var67 = var63.stringWidTag(var66);
									if (var67 > var61) {
										var61 = var67;
									}
									var62 += var63.height + 1;
								}
								var61 += 6;
								var62 += 7;
								int var68 = var14 + var13.width - var61 - 5;
								int var69 = var15 + var13.height + 5;
								if (var68 < var14 + 5) {
									var68 = var14 + 5;
								}
								if (var68 + var61 > arg1 + arg0.width) {
									var68 = arg1 + arg0.width - var61;
								}
								Pix2D.fillrect(16777120, var68, 99, var61, var62, var69);
								Pix2D.drawRect(var69, var61, var68, var62, 0);
								String var70 = var13.text;
								int var71 = var69 + var63.height + 2;
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
									var63.drawStringTag(var68 + 3, var71, false, 0, var73);
									var71 += var63.height + 1;
								}
							}
						}
					}
				}
				Pix2D.setClipping(var7, var8, var5, this.field214, var6);
			}
		} catch (RuntimeException var75) {
			signlink.reporterror("1017, " + arg0 + ", " + arg1 + ", " + 79 + ", " + arg2 + ", " + arg3 + ", " + var75.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.f(II)Ljava/lang/String;")
	public static String invNumber(int arg0) {
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

	@ObfuscatedName("client.a(BI)Ljava/lang/String;")
	public static String niceNumber(int arg0) {
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

	@ObfuscatedName("client.a(ILIRYXZZFE;IIIIIII)V")
	public void doScrollbar(IfType arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		try {
			if (this.field492) {
				this.field442 = 32;
			} else {
				this.field442 = 0;
			}
			this.field492 = false;
			if (arg3 >= arg4 && arg3 < arg4 + 16 && arg5 >= arg7 && arg5 < arg7 + 16) {
				arg0.scrollPos -= this.scrollCycle * 4;
				if (arg1 == 1) {
					this.redrawSidebar = true;
				}
				if (arg1 == 2 || arg1 == 3) {
					this.redrawChatback = true;
				}
			} else if (arg3 >= arg4 && arg3 < arg4 + 16 && arg5 >= arg7 + arg6 - 16 && arg5 < arg7 + arg6) {
				arg0.scrollPos += this.scrollCycle * 4;
				if (arg1 == 1) {
					this.redrawSidebar = true;
				}
				if (arg1 == 2 || arg1 == 3) {
					this.redrawChatback = true;
				}
			} else if (arg3 >= arg4 - this.field442 && arg3 < arg4 + this.field442 + 16 && arg5 >= arg7 + 16 && arg5 < arg7 + arg6 - 16 && this.scrollCycle > 0) {
				int var9 = (arg6 - 32) * arg6 / arg2;
				if (var9 < 8) {
					var9 = 8;
				}
				int var10 = arg5 - arg7 - var9 / 2 - 16;
				int var11 = arg6 - var9 - 32;
				arg0.scrollPos = (arg2 - arg6) * var10 / var11;
				if (arg1 == 1) {
					this.redrawSidebar = true;
				}
				if (arg1 == 2 || arg1 == 3) {
					this.redrawChatback = true;
				}
				this.field492 = true;
			}
		} catch (RuntimeException var13) {
			signlink.reporterror("67196, " + 1456 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + var13.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.a(IIIIZI)V")
	public void drawScrollbar(int arg0, int arg1, int arg2, int arg3, int arg4) {
		try {
			this.scrollbar0.plotSprite(arg3, this.field527, arg4);
			this.scrollbar1.plotSprite(arg3, this.field527, arg4 + arg1 - 16);
			Pix2D.fillrect(this.field360, arg3, 99, 16, arg1 - 32, arg4 + 16);
			int var6 = (arg1 - 32) * arg1 / arg2;
			if (var6 < 8) {
				var6 = 8;
			}
			int var7 = (arg1 - var6 - 32) * arg0 / (arg2 - arg1);
			Pix2D.fillrect(this.field300, arg3, 99, 16, var6, arg4 + var7 + 16);
			Pix2D.vline(arg3, this.field521, arg4 + var7 + 16, var6);
			Pix2D.vline(arg3 + 1, this.field521, arg4 + var7 + 16, var6);
			Pix2D.hline(16, arg4 + var7 + 16, arg3, this.field521);
			Pix2D.hline(16, arg4 + var7 + 17, arg3, this.field521);
			Pix2D.vline(arg3 + 15, this.field292, arg4 + var7 + 16, var6);
			Pix2D.vline(arg3 + 14, this.field292, arg4 + var7 + 17, var6 - 1);
			Pix2D.hline(16, arg4 + var7 + var6 + 15, arg3, this.field292);
			Pix2D.hline(15, arg4 + var7 + var6 + 14, arg3 + 1, this.field292);
		} catch (RuntimeException var9) {
			signlink.reporterror("96836, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + false + ", " + arg4 + ", " + var9.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.b(IB)Ljava/lang/String;")
	public String inf(int arg0) {
		try {
			return arg0 < 999999999 ? String.valueOf(arg0) : "*";
		} catch (RuntimeException var3) {
			signlink.reporterror("90576, " + arg0 + ", " + 93 + ", " + var3.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.a(LIRYXZZFE;B)Z")
	public boolean getIfActive(IfType arg0) {
		try {
			if (arg0.scriptComparator == null) {
				return false;
			}
			for (int var2 = 0; var2 < arg0.scriptComparator.length; var2++) {
				int var3 = this.getIfVar(arg0, var2);
				int var4 = arg0.scriptOperand[var2];
				if (arg0.scriptComparator[var2] == 2) {
					if (var3 >= var4) {
						return false;
					}
				} else if (arg0.scriptComparator[var2] == 3) {
					if (var3 <= var4) {
						return false;
					}
				} else if (arg0.scriptComparator[var2] == 4) {
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

	@ObfuscatedName("client.a(LIRYXZZFE;II)I")
	public int getIfVar(IfType arg0, int arg1) {
		try {
			if (arg0.scripts == null || arg1 >= arg0.scripts.length) {
				return -2;
			}
			try {
				int[] var3 = arg0.scripts[arg1];
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
						IfType var10 = IfType.list(var3[var5++]);
						int var11 = var3[var5++];
						if (var11 >= 0 && var11 < ObjType.numDefinitions && (!ObjType.list(var11).members || memServer)) {
							for (int var12 = 0; var12 < var10.linkObjType.length; var12++) {
								if (var10.linkObjType[var12] == var11 + 1) {
									var8 += var10.linkObjNumber[var12];
								}
							}
						}
					}
					if (var7 == 5) {
						var8 = this.var[var3[var5++]];
					}
					if (var7 == 6) {
						var8 = skillxp[this.field641[var3[var5++]] - 1];
					}
					if (var7 == 7) {
						var8 = this.var[var3[var5++]] * 100 / 46875;
					}
					if (var7 == 8) {
						var8 = localPlayer.combatLevel;
					}
					if (var7 == 9) {
						for (int var13 = 0; var13 < Skills.count; var13++) {
							if (Skills.used[var13]) {
								var8 += this.field641[var13];
							}
						}
					}
					if (var7 == 10) {
						IfType var14 = IfType.list(var3[var5++]);
						int var15 = var3[var5++] + 1;
						if (var15 >= 0 && var15 < ObjType.numDefinitions && (!ObjType.list(var15).members || memServer)) {
							for (int var16 = 0; var16 < var14.linkObjType.length; var16++) {
								if (var14.linkObjType[var16] == var15) {
									var8 = 999999999;
									break;
								}
							}
						}
					}
					if (var7 == 11) {
						var8 = this.runenergy;
					}
					if (var7 == 12) {
						var8 = this.runweight;
					}
					if (var7 == 13) {
						int var17 = this.var[var3[var5++]];
						int var18 = var3[var5++];
						var8 = (var17 & 0x1 << var18) == 0 ? 0 : 1;
					}
					if (var7 == 14) {
						int var19 = var3[var5++];
						VarbitType var20 = VarbitType.list[var19];
						int var21 = var20.basevar;
						int var22 = var20.startbit;
						int var23 = var20.endbit;
						int var24 = readbit[var23 - var22];
						var8 = this.var[var21] >> var22 & var24;
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
						var8 = (localPlayer.x >> 7) + this.mapBuildBaseX;
					}
					if (var7 == 19) {
						var8 = (localPlayer.z >> 7) + this.mapBuildBaseZ;
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

	@ObfuscatedName("client.a(IB)V")
	public void ifAnimReset(int arg0) {
		try {
			IfType var2 = IfType.list(arg0);
			for (int var3 = 0; var3 < var2.children.length && var2.children[var3] != -1; var3++) {
				IfType var4 = IfType.list(var2.children[var3]);
				if (var4.type == 1) {
					this.ifAnimReset(var4.id);
				}
				var4.animFrame = 0;
				var4.animCycle = 0;
			}
		} catch (RuntimeException var6) {
			signlink.reporterror("19367, " + arg0 + ", " + 5 + ", " + var6.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.c(III)Z")
	public boolean animateInterface(int arg0, int arg1) {
		try {
			boolean var3 = false;
			IfType var4 = IfType.list(arg0);
			for (int var5 = 0; var5 < var4.children.length && var4.children[var5] != -1; var5++) {
				IfType var6 = IfType.list(var4.children[var5]);
				if (var6.type == 1) {
					var3 |= this.animateInterface(var6.id, arg1);
				}
				if (var6.type == 6 && (var6.modelAnim != -1 || var6.modelAnim2 != -1)) {
					boolean var7 = this.getIfActive(var6);
					int var8;
					if (var7) {
						var8 = var6.modelAnim2;
					} else {
						var8 = var6.modelAnim;
					}
					if (var8 != -1) {
						SeqType var9 = SeqType.list[var8];
						var6.animCycle += arg1;
						while (var6.animCycle > var9.getDelay(var6.animFrame)) {
							var6.animCycle -= var9.getDelay(var6.animFrame) + 1;
							var6.animFrame++;
							if (var6.animFrame >= var9.numFrames) {
								var6.animFrame -= var9.loops;
								if (var6.animFrame < 0 || var6.animFrame >= var9.numFrames) {
									var6.animFrame = 0;
								}
							}
							var3 = true;
						}
					}
				}
				if (var6.type == 6 && var6.field912 != 0) {
					int var10 = var6.field912 >> 16;
					int var11 = var6.field912 << 16 >> 16;
					int var12 = var10 * arg1;
					int var13 = var11 * arg1;
					var6.modelXAn = var6.modelXAn + var12 & 0x7FF;
					var6.modelYAn = var6.modelYAn + var13 & 0x7FF;
					var3 = true;
				}
			}
			return var3;
		} catch (RuntimeException var15) {
			signlink.reporterror("98044, " + arg0 + ", " + 1 + ", " + arg1 + ", " + var15.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.c(ZI)V")
	public void clientVar(int arg0) {
		try {
			int var2 = VarType.list[arg0].field971;
			if (var2 != 0) {
				int var3 = this.var[arg0];
				if (var2 == 1) {
					if (var3 == 1) {
						Pix3D.initColourTable(0.9D);
					}
					if (var3 == 2) {
						Pix3D.initColourTable(0.8D);
					}
					if (var3 == 3) {
						Pix3D.initColourTable(0.7D);
					}
					if (var3 == 4) {
						Pix3D.initColourTable(0.6D);
					}
					ObjType.spriteCache.clear();
					this.redrawFrame = true;
				}
				if (var2 == 3) {
					boolean var4 = this.field379;
					if (var3 == 0) {
						this.setMidiVolume(this.field379, this.field576, 0);
						this.field379 = true;
					}
					if (var3 == 1) {
						this.setMidiVolume(this.field379, this.field576, -400);
						this.field379 = true;
					}
					if (var3 == 2) {
						this.setMidiVolume(this.field379, this.field576, -800);
						this.field379 = true;
					}
					if (var3 == 3) {
						this.setMidiVolume(this.field379, this.field576, -1200);
						this.field379 = true;
					}
					if (var3 == 4) {
						this.field379 = false;
					}
					if (this.field379 != var4 && !lowMem) {
						if (this.field379) {
							this.midiSong = this.nextMidiSong;
							this.midiFading = true;
							this.onDemand.request(2, this.midiSong);
						} else {
							this.stopMidi(this.field263);
						}
						this.nextMidiDelay = 0;
					}
				}
				if (var2 == 4) {
					if (var3 == 0) {
						this.waveEnabled = true;
						this.setWaveVolume(0);
					}
					if (var3 == 1) {
						this.waveEnabled = true;
						this.setWaveVolume(-400);
					}
					if (var3 == 2) {
						this.waveEnabled = true;
						this.setWaveVolume(-800);
					}
					if (var3 == 3) {
						this.waveEnabled = true;
						this.setWaveVolume(-1200);
					}
					if (var3 == 4) {
						this.waveEnabled = false;
					}
				}
				if (var2 == 5) {
					this.field182 = var3;
				}
				if (var2 == 6) {
					this.field624 = var3;
				}
				if (var2 == 8) {
					this.splitPrivateChat = var3;
					this.redrawChatback = true;
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

	@ObfuscatedName("client.b(LIRYXZZFE;Z)V")
	public void clientComponent(IfType arg0, boolean arg1) {
		try {
			int var3 = arg0.clientCode;
			if (arg1) {
				this.field529 = !this.field529;
			}
			if ((var3 < 1 || var3 > 100) && (var3 < 701 || var3 > 800)) {
				if (var3 >= 101 && var3 <= 200 || var3 >= 801 && var3 <= 900) {
					int var5 = this.friendCount;
					if (this.friendServerStatus != 2) {
						var5 = 0;
					}
					if (var3 > 800) {
						var3 -= 701;
					} else {
						var3 -= 101;
					}
					if (var3 >= var5) {
						arg0.text = "";
						arg0.buttonType = 0;
					} else {
						if (this.friendNodeId[var3] == 0) {
							arg0.text = "@red@Offline";
						} else if (this.friendNodeId[var3] < 200) {
							if (this.friendNodeId[var3] == nodeId) {
								arg0.text = "@gre@World" + (this.friendNodeId[var3] - 9);
							} else {
								arg0.text = "@yel@World" + (this.friendNodeId[var3] - 9);
							}
						} else if (this.friendNodeId[var3] == nodeId) {
							arg0.text = "@gre@Classic" + (this.friendNodeId[var3] - 219);
						} else {
							arg0.text = "@yel@Classic" + (this.friendNodeId[var3] - 219);
						}
						arg0.buttonType = 1;
					}
				} else if (var3 == 203) {
					int var6 = this.friendCount;
					if (this.friendServerStatus != 2) {
						var6 = 0;
					}
					arg0.scrollheight = var6 * 15 + 20;
					if (arg0.scrollheight <= arg0.height) {
						arg0.scrollheight = arg0.height + 1;
					}
				} else if (var3 >= 401 && var3 <= 500) {
					var3 -= 401;
					if (var3 == 0 && this.friendServerStatus == 0) {
						arg0.text = "Loading ignore list";
						arg0.buttonType = 0;
					} else if (var3 == 1 && this.friendServerStatus == 0) {
						arg0.text = "Please wait...";
						arg0.buttonType = 0;
					} else {
						int var7 = this.ignoreCount;
						if (this.friendServerStatus == 0) {
							var7 = 0;
						}
						if (var3 >= var7) {
							arg0.text = "";
							arg0.buttonType = 0;
						} else {
							arg0.text = JString.toSentenceCase(JString.toRawUsername(this.ignoreUserhash[var3]));
							arg0.buttonType = 1;
						}
					}
				} else if (var3 == 503) {
					arg0.scrollheight = this.ignoreCount * 15 + 20;
					if (arg0.scrollheight <= arg0.height) {
						arg0.scrollheight = arg0.height + 1;
					}
				} else if (var3 == 327) {
					arg0.modelXAn = 150;
					arg0.modelYAn = (int) (Math.sin((double) loopCycle / 40.0D) * 256.0D) & 0x7FF;
					if (this.idkDesignRedraw) {
						for (int var8 = 0; var8 < 7; var8++) {
							int var9 = this.idkDesignpart[var8];
							if (var9 >= 0 && !IdkType.list[var9].checkModel()) {
								return;
							}
						}
						this.idkDesignRedraw = false;
						Model[] var10 = new Model[7];
						int var11 = 0;
						for (int var12 = 0; var12 < 7; var12++) {
							int var13 = this.idkDesignpart[var12];
							if (var13 >= 0) {
								var10[var11++] = IdkType.list[var13].getModelNoCheck();
							}
						}
						Model var14 = new Model(var11, var10, 5);
						for (int var15 = 0; var15 < 5; var15++) {
							if (this.idkDesignColour[var15] != 0) {
								var14.recolour(recol1d[var15][0], recol1d[var15][this.idkDesignColour[var15]]);
								if (var15 == 1) {
									var14.recolour(recol2d[0], recol2d[this.idkDesignColour[var15]]);
								}
							}
						}
						var14.prepareAnim(311);
						var14.animate(SeqType.list[localPlayer.readyAnim].frames[0]);
						var14.calculateNormals(64, 850, -30, -50, -30, true);
						arg0.model1Type = 5;
						arg0.model1Id = 0;
						IfType.cacheModel(var14, this.field445);
					}
				} else if (var3 == 324) {
					if (this.idkDesignButton1 == null) {
						this.idkDesignButton1 = arg0.graphic;
						this.idkDesignButton2 = arg0.graphic2;
					}
					if (this.idkDesignGender) {
						arg0.graphic = this.idkDesignButton2;
					} else {
						arg0.graphic = this.idkDesignButton1;
					}
				} else if (var3 == 325) {
					if (this.idkDesignButton1 == null) {
						this.idkDesignButton1 = arg0.graphic;
						this.idkDesignButton2 = arg0.graphic2;
					}
					if (this.idkDesignGender) {
						arg0.graphic = this.idkDesignButton1;
					} else {
						arg0.graphic = this.idkDesignButton2;
					}
				} else if (var3 == 600) {
					arg0.text = this.reportAbuseInput;
					if (loopCycle % 20 < 10) {
						arg0.text = arg0.text + "|";
					} else {
						arg0.text = arg0.text + " ";
					}
				} else {
					if (var3 == 620) {
						if (this.staffmodLevel < 1) {
							arg0.text = "";
						} else if (this.reportAbuseMuteOption) {
							arg0.colour = 16711680;
							arg0.text = "Moderator option: Mute player for 48 hours: <ON>";
						} else {
							arg0.colour = 16777215;
							arg0.text = "Moderator option: Mute player for 48 hours: <OFF>";
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
						arg0.text = "You last logged in @red@" + var17 + "@bla@ from: @red@" + signlink.dns;
					}
					if (var3 == 661) {
						if (this.field413 == 0) {
							arg0.text = "\\nYou have not yet set any recovery questions.\\nIt is @lre@strongly@yel@ recommended that you do so.\\n\\nIf you don't you will be @lre@unable to recover your\\n@lre@password@yel@ if you forget it, or it is stolen.";
						} else if (this.field413 <= this.field510) {
							arg0.text = "\\n\\nRecovery Questions Last Set:\\n@gre@" + this.getDateString(this.field413);
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
							arg0.text = var19 + " you requested@lre@ new recovery\\n@lre@questions.@yel@ The requested change will occur\\non: @lre@" + this.getDateString(this.field413) + "\\n\\nIf you do not remember making this request\\ncancel it immediately, and change your password.";
						}
					}
					if (var3 == 662) {
						String var20;
						if (this.unreadMessages == 0) {
							var20 = "@yel@0 unread messages";
						} else if (this.unreadMessages == 1) {
							var20 = "@gre@1 unread message";
						} else {
							var20 = "@gre@" + this.unreadMessages + " unread messages";
						}
						arg0.text = "You have " + var20 + "\\nin your message centre.";
					}
					if (var3 == 663) {
						if (this.field402 > 0 && this.field402 <= this.field510 + 10) {
							arg0.text = "Last password change:\\n@gre@" + this.getDateString(this.field402);
						} else {
							arg0.text = "Last password change:\\n@gre@Never changed";
						}
					}
					if (var3 == 664) {
						if (this.field344 == 0) {
							arg0.text = "You have not yet set\\nany contact details.";
						}
						if (this.field344 == 1) {
							arg0.text = "Contact Details Last Set:\\n@gre@" + this.getDateString(this.field376);
						}
						if (this.field344 == 2) {
							arg0.text = "You need to set\\nnew contact details.";
						}
					}
					if (var3 == 665) {
						if (this.field224 > 2 && !memServer) {
							arg0.text = "This is a non-members\\nworld. To enjoy your\\nmembers benefits we\\nrecommend you play on a\\nmembers world instead.";
						} else if (this.field224 > 2) {
							arg0.text = "\\n\\nYou have @gre@" + this.field224 + "@yel@ days of\\nmember credit remaining.";
						} else if (this.field224 > 0) {
							arg0.text = "You have @gre@" + this.field224 + "@yel@ days of\\nmember credit remaining.\\n\\n@lre@Credit low! Renew now\\n@lre@to avoid losing members.";
						} else {
							arg0.text = "You are not a member.\\n\\nChoose to subscribe and\\nyou'll get loads of extra\\nbenefits and features.";
						}
					}
					if (var3 == 667) {
						if (this.field224 > 2 && !memServer) {
							arg0.text = "To switch to a members-only world:\\n1) Logout and return to the world selection page.\\n2) Choose one of the members world with a gold star next to it's name.\\n\\nIf you prefer you can continue to use this world,\\nbut members only features will be unavailable here.";
						} else if (this.field224 > 0) {
							arg0.text = "To extend or cancel a subscription:\\n1) Logout and return to the frontpage of this website.\\n2)Choose the relevant option from the 'membership' section.\\n\\nNote: If you are a credit card subscriber a top-up payment will\\nautomatically be taken when 3 days credit remain.\\n(unless you cancel your subscription, which can be done at any time.)";
						} else {
							arg0.text = "To start a subscripton:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Start a new subscription'";
						}
					}
					if (var3 == 668) {
						if (this.field413 > this.field510) {
							arg0.text = "To cancel this request:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Cancel recovery questions'.";
						} else {
							arg0.text = "To change your recovery questions:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Set new recovery questions'.";
						}
					}
				}
			} else if (var3 == 1 && this.friendServerStatus == 0) {
				arg0.text = "Loading friend list";
				arg0.buttonType = 0;
			} else if (var3 == 1 && this.friendServerStatus == 1) {
				arg0.text = "Connecting to friendserver";
				arg0.buttonType = 0;
			} else if (var3 == 2 && this.friendServerStatus != 2) {
				arg0.text = "Please wait...";
				arg0.buttonType = 0;
			} else {
				int var4 = this.friendCount;
				if (this.friendServerStatus != 2) {
					var4 = 0;
				}
				if (var3 > 700) {
					var3 -= 601;
				} else {
					var3--;
				}
				if (var3 >= var4) {
					arg0.text = "";
					arg0.buttonType = 0;
				} else {
					arg0.text = this.friendUsername[var3];
					arg0.buttonType = 1;
				}
			}
		} catch (RuntimeException var22) {
			signlink.reporterror("72466, " + arg0 + ", " + arg1 + ", " + var22.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.p(I)V")
	public void closeModal() {
		try {
			this.out.p1enc(211);
			if (this.sideModealId != -1) {
				this.unloadIf(this.sideModealId);
				this.sideModealId = -1;
				this.redrawSidebar = true;
				this.field446 = false;
				this.rewdrawIcons = true;
			}
			if (this.chatComId != -1) {
				this.unloadIf(this.chatComId);
				this.chatComId = -1;
				this.redrawChatback = true;
				this.field446 = false;
			}
			if (this.field631 != -1) {
				this.unloadIf(this.field631);
				this.field631 = -1;
				this.redrawFrame = true;
			}
			if (this.field275 != -1) {
				this.unloadIf(this.field275);
				this.field275 = -1;
			}
			if (this.mainModalId != -1) {
				this.unloadIf(this.mainModalId);
				this.mainModalId = -1;
			}
		} catch (RuntimeException var2) {
			signlink.reporterror("90701, " + ", " + var2.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.a(BLIRYXZZFE;)Z")
	public boolean clientButton(IfType arg0) {
		try {
			int var2 = arg0.clientCode;
			if (this.friendServerStatus == 2) {
				if (var2 == 201) {
					this.redrawChatback = true;
					this.dialogueInputOpen = 0;
					this.socialInputOpen = true;
					this.socialInput = "";
					this.socialInputType = 1;
					this.socialInputHeader = "Enter name of friend to add to list";
				}
				if (var2 == 202) {
					this.redrawChatback = true;
					this.dialogueInputOpen = 0;
					this.socialInputOpen = true;
					this.socialInput = "";
					this.socialInputType = 2;
					this.socialInputHeader = "Enter name of friend to delete from list";
				}
			}
			if (var2 == 205) {
				this.logoutTimer = 250;
				return true;
			}
			if (var2 == 501) {
				this.redrawChatback = true;
				this.dialogueInputOpen = 0;
				this.socialInputOpen = true;
				this.socialInput = "";
				this.socialInputType = 4;
				this.socialInputHeader = "Enter name of player to add to list";
			}
			if (var2 == 502) {
				this.redrawChatback = true;
				this.dialogueInputOpen = 0;
				this.socialInputOpen = true;
				this.socialInput = "";
				this.socialInputType = 5;
				this.socialInputHeader = "Enter name of player to delete from list";
			}
			if (var2 >= 300 && var2 <= 313) {
				int var3 = (var2 - 300) / 2;
				int var4 = var2 & 0x1;
				int var5 = this.idkDesignpart[var3];
				if (var5 != -1) {
					while (true) {
						if (var4 == 0) {
							var5--;
							if (var5 < 0) {
								var5 = IdkType.numDefinitions - 1;
							}
						}
						if (var4 == 1) {
							var5++;
							if (var5 >= IdkType.numDefinitions) {
								var5 = 0;
							}
						}
						if (!IdkType.list[var5].disable && IdkType.list[var5].part == var3 + (this.idkDesignGender ? 0 : 7)) {
							this.idkDesignpart[var3] = var5;
							this.idkDesignRedraw = true;
							break;
						}
					}
				}
			}
			if (var2 >= 314 && var2 <= 323) {
				int var6 = (var2 - 314) / 2;
				int var7 = var2 & 0x1;
				int var8 = this.idkDesignColour[var6];
				if (var7 == 0) {
					var8--;
					if (var8 < 0) {
						var8 = recol1d[var6].length - 1;
					}
				}
				if (var7 == 1) {
					var8++;
					if (var8 >= recol1d[var6].length) {
						var8 = 0;
					}
				}
				this.idkDesignColour[var6] = var8;
				this.idkDesignRedraw = true;
			}
			if (var2 == 324 && !this.idkDesignGender) {
				this.idkDesignGender = true;
				this.validateIdkDesign();
			}
			if (var2 == 325 && this.idkDesignGender) {
				this.idkDesignGender = false;
				this.validateIdkDesign();
			}
			if (var2 == 326) {
				this.out.p1enc(205);
				this.out.p1(this.idkDesignGender ? 0 : 1);
				for (int var9 = 0; var9 < 7; var9++) {
					this.out.p1(this.idkDesignpart[var9]);
				}
				for (int var10 = 0; var10 < 5; var10++) {
					this.out.p1(this.idkDesignColour[var10]);
				}
				return true;
			}
			if (var2 == 620) {
				this.reportAbuseMuteOption = !this.reportAbuseMuteOption;
			}
			if (var2 >= 601 && var2 <= 613) {
				this.closeModal();
				if (this.reportAbuseInput.length() > 0) {
					this.out.p1enc(3);
					this.out.p8(JString.toUserhash(this.reportAbuseInput));
					this.out.p1(var2 - 601);
					this.out.p1(this.reportAbuseMuteOption ? 1 : 0);
				}
			}
			return false;
		} catch (RuntimeException var12) {
			signlink.reporterror("88209, " + 53 + ", " + arg0 + ", " + var12.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.n(I)V")
	public void validateIdkDesign() {
		try {
			this.idkDesignRedraw = true;
			for (int var1 = 0; var1 < 7; var1++) {
				this.idkDesignpart[var1] = -1;
				for (int var2 = 0; var2 < IdkType.numDefinitions; var2++) {
					if (!IdkType.list[var2].disable && IdkType.list[var2].part == var1 + (this.idkDesignGender ? 0 : 7)) {
						this.idkDesignpart[var1] = var2;
						break;
					}
				}
			}
		} catch (RuntimeException var4) {
			signlink.reporterror("59, " + -279 + ", " + var4.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.O(I)V")
	public void drawSide() {
		try {
			this.field488.setPixels();
			Pix3D.scanline = this.field427;
			this.invback.plotSprite(0, this.field527, 0);
			if (this.sideModealId != -1) {
				this.drawInterface(IfType.list(this.sideModealId), 0, 0, 0);
			} else if (this.sideIcon[this.activeIcon] != -1) {
				this.drawInterface(IfType.list(this.sideIcon[this.activeIcon]), 0, 0, 0);
			}
			if (this.isMenuOpen && this.menuArea == 1) {
				this.drawMinimenu();
			}
			this.field488.draw(205, super.graphics, 553);
			this.areaGame.setPixels();
			Pix3D.scanline = this.gameScanline;
		} catch (RuntimeException var2) {
			signlink.reporterror("94724, " + ", " + var2.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.R(I)V")
	public void drawChat() {
		try {
			this.field491.setPixels();
			Pix3D.scanline = this.chatScanline;
			this.chatback.plotSprite(0, this.field527, 0);
			if (this.socialInputOpen) {
				this.b12.centreStringTag(0, this.socialInputHeader, 239, 40);
				this.b12.centreStringTag(128, this.socialInput + "*", 239, 60);
			} else if (this.dialogueInputOpen == 1) {
				this.b12.centreStringTag(0, "Enter amount:", 239, 40);
				this.b12.centreStringTag(128, this.field195 + "*", 239, 60);
			} else if (this.dialogueInputOpen == 2) {
				this.b12.centreStringTag(0, "Enter name:", 239, 40);
				this.b12.centreStringTag(128, this.field195 + "*", 239, 60);
			} else if (this.field321 != null) {
				this.b12.centreStringTag(0, this.field321, 239, 40);
				this.b12.centreStringTag(128, "Click to continue", 239, 60);
			} else if (this.chatComId != -1) {
				this.drawInterface(IfType.list(this.chatComId), 0, 0, 0);
			} else if (this.field629 == -1) {
				PixFont var1 = this.p12;
				int var2 = 0;
				Pix2D.setClipping(463, 77, 0, this.field214, 0);
				for (int var3 = 0; var3 < 100; var3++) {
					if (this.chatText[var3] != null) {
						int var4 = this.chatType[var3];
						int var5 = this.chatScrollPos + 70 - var2 * 14;
						String var6 = this.chatusername[var3];
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
								var1.drawString(this.chatText[var3], var5, 4, 0);
							}
							var2++;
						}
						if ((var4 == 1 || var4 == 2) && (var4 == 1 || this.chatPublicMode == 0 || this.chatPublicMode == 1 && this.isFriend(var6))) {
							if (var5 > 0 && var5 < 110) {
								int var8 = 4;
								if (var7 == 1) {
									this.modIcons[0].plotSprite(4, this.field527, var5 - 12);
									var8 += 14;
								}
								if (var7 == 2) {
									this.modIcons[1].plotSprite(var8, this.field527, var5 - 12);
									var8 += 14;
								}
								var1.drawString(var6 + ":", var5, var8, 0);
								int var9 = var8 + var1.stringWidTag(var6) + 8;
								var1.drawString(this.chatText[var3], var5, var9, 255);
							}
							var2++;
						}
						if ((var4 == 3 || var4 == 7) && this.splitPrivateChat == 0 && (var4 == 7 || this.chatPrivatemode == 0 || this.chatPrivatemode == 1 && this.isFriend(var6))) {
							if (var5 > 0 && var5 < 110) {
								var1.drawString("From", var5, 4, 0);
								int var10 = var1.stringWidTag("From ") + 4;
								if (var7 == 1) {
									this.modIcons[0].plotSprite(var10, this.field527, var5 - 12);
									var10 += 14;
								}
								if (var7 == 2) {
									this.modIcons[1].plotSprite(var10, this.field527, var5 - 12);
									var10 += 14;
								}
								var1.drawString(var6 + ":", var5, var10, 0);
								int var11 = var10 + var1.stringWidTag(var6) + 8;
								var1.drawString(this.chatText[var3], var5, var11, 8388608);
							}
							var2++;
						}
						if (var4 == 4 && (this.chatTradeMode == 0 || this.chatTradeMode == 1 && this.isFriend(var6))) {
							if (var5 > 0 && var5 < 110) {
								var1.drawString(var6 + " " + this.chatText[var3], var5, 4, 8388736);
							}
							var2++;
						}
						if (var4 == 5 && this.splitPrivateChat == 0 && this.chatPrivatemode < 2) {
							if (var5 > 0 && var5 < 110) {
								var1.drawString(this.chatText[var3], var5, 4, 8388608);
							}
							var2++;
						}
						if (var4 == 6 && this.splitPrivateChat == 0 && this.chatPrivatemode < 2) {
							if (var5 > 0 && var5 < 110) {
								var1.drawString("To " + var6 + ":", var5, 4, 0);
								var1.drawString(this.chatText[var3], var5, var1.stringWidTag("To " + var6) + 12, 8388608);
							}
							var2++;
						}
						if (var4 == 8 && (this.chatTradeMode == 0 || this.chatTradeMode == 1 && this.isFriend(var6))) {
							if (var5 > 0 && var5 < 110) {
								var1.drawString(var6 + " " + this.chatText[var3], var5, 4, 8270336);
							}
							var2++;
						}
					}
				}
				Pix2D.resetClipping();
				this.scrollheight = var2 * 14 + 7;
				if (this.scrollheight < 78) {
					this.scrollheight = 78;
				}
				this.drawScrollbar(this.scrollheight - this.chatScrollPos - 77, 77, this.scrollheight, 463, 0);
				String var12;
				if (localPlayer == null || localPlayer.name == null) {
					var12 = JString.toSentenceCase(this.loginUser);
				} else {
					var12 = localPlayer.name;
				}
				var1.drawString(var12 + ":", 90, 4, 0);
				var1.drawString(this.chatInput + "*", 90, var1.stringWidTag(var12 + ": ") + 6, 255);
				Pix2D.hline(479, 77, 0, 0);
			} else {
				this.drawInterface(IfType.list(this.field629), 0, 0, 0);
			}
			if (this.isMenuOpen && this.menuArea == 2) {
				this.drawMinimenu();
			}
			this.field491.draw(357, super.graphics, 17);
			this.areaGame.setPixels();
			Pix3D.scanline = this.gameScanline;
		} catch (RuntimeException var14) {
			signlink.reporterror("83494, " + -27503 + ", " + var14.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.c(Z)V")
	public void minimapDraw() {
		try {
			this.areaMap.setPixels();
			if (this.minimapState == 2) {
				byte[] var1 = this.mapback.data;
				int[] var2 = Pix2D.pixels;
				int var3 = var1.length;
				for (int var4 = 0; var4 < var3; var4++) {
					if (var1[var4] == 0) {
						var2[var4] = 0;
					}
				}
				this.compass.scanlineRotatePlotSprite(256, 33, this.orbitCameraYaw, 33, 25, this.compassMaskLineOffsets, 0, this.compassMaskLineLengths, 0, 25);
				this.areaGame.setPixels();
				Pix3D.scanline = this.gameScanline;
			} else {
				int var5 = this.orbitCameraYaw + this.macroMinimapAngle & 0x7FF;
				int var6 = localPlayer.x / 32 + 48;
				int var7 = 464 - localPlayer.z / 32;
				this.minimap.scanlineRotatePlotSprite(this.macroMinimapZoom + 256, 146, var5, 151, var6, this.minimapMaskLineOffsets, 5, this.minimapMaskLineLengths, 25, var7);
				this.compass.scanlineRotatePlotSprite(256, 33, this.orbitCameraYaw, 33, 25, this.compassMaskLineOffsets, 0, this.compassMaskLineLengths, 0, 25);
				for (int var8 = 0; var8 < this.field361; var8++) {
					int var9 = this.field362[var8] * 4 + 2 - localPlayer.x / 32;
					int var10 = this.field363[var8] * 4 + 2 - localPlayer.z / 32;
					this.minimapDrawDot(this.field373[var8], var10, var9);
				}
				for (int var11 = 0; var11 < 104; var11++) {
					for (int var12 = 0; var12 < 104; var12++) {
						LinkList var13 = this.groundObj[this.minusedlevel][var11][var12];
						if (var13 != null) {
							int var14 = var11 * 4 + 2 - localPlayer.x / 32;
							int var15 = var12 * 4 + 2 - localPlayer.z / 32;
							this.minimapDrawDot(this.mapdots0, var15, var14);
						}
					}
				}
				for (int var16 = 0; var16 < this.npcCount; var16++) {
					ClientNpc var17 = this.npc[this.npcIds[var16]];
					if (var17 != null && var17.isReady()) {
						NpcType var18 = var17.type;
						if (var18.multinpc != null) {
							var18 = var18.method389();
						}
						if (var18 != null && var18.minimap && var18.active) {
							int var19 = var17.x / 32 - localPlayer.x / 32;
							int var20 = var17.z / 32 - localPlayer.z / 32;
							this.minimapDrawDot(this.mapdots1, var20, var19);
						}
					}
				}
				for (int var21 = 0; var21 < this.playerCount; var21++) {
					ClientPlayer var22 = this.players[this.playerIds[var21]];
					if (var22 != null && var22.isReady()) {
						int var23 = var22.x / 32 - localPlayer.x / 32;
						int var24 = var22.z / 32 - localPlayer.z / 32;
						boolean var25 = false;
						long var26 = JString.toUserhash(var22.name);
						for (int var28 = 0; var28 < this.friendCount; var28++) {
							if (var26 == this.friendUserhash[var28] && this.friendNodeId[var28] != 0) {
								var25 = true;
								break;
							}
						}
						boolean var29 = false;
						if (localPlayer.field130 != 0 && var22.field130 != 0 && localPlayer.field130 == var22.field130) {
							var29 = true;
						}
						if (var25) {
							this.minimapDrawDot(this.mapdots3, var24, var23);
						} else if (var29) {
							this.minimapDrawDot(this.mapdots4, var24, var23);
						} else {
							this.minimapDrawDot(this.mapdots2, var24, var23);
						}
					}
				}
				if (this.hintType != 0 && loopCycle % 20 < 10) {
					if (this.hintType == 1 && this.field570 >= 0 && this.field570 < this.npc.length) {
						ClientNpc var30 = this.npc[this.field570];
						if (var30 != null) {
							int var31 = var30.x / 32 - localPlayer.x / 32;
							int var32 = var30.z / 32 - localPlayer.z / 32;
							this.minimapDrawArrow(this.mapmarker1, this.field496, var32, var31);
						}
					}
					if (this.hintType == 2) {
						int var33 = (this.field164 - this.mapBuildBaseX) * 4 + 2 - localPlayer.x / 32;
						int var34 = (this.field165 - this.mapBuildBaseZ) * 4 + 2 - localPlayer.z / 32;
						this.minimapDrawArrow(this.mapmarker1, this.field496, var34, var33);
					}
					if (this.hintType == 10 && this.field245 >= 0 && this.field245 < this.players.length) {
						ClientPlayer var35 = this.players[this.field245];
						if (var35 != null) {
							int var36 = var35.x / 32 - localPlayer.x / 32;
							int var37 = var35.z / 32 - localPlayer.z / 32;
							this.minimapDrawArrow(this.mapmarker1, this.field496, var37, var36);
						}
					}
				}
				if (this.minimapFlagX != 0) {
					int var38 = this.minimapFlagX * 4 + 2 - localPlayer.x / 32;
					int var39 = this.minimapFlagZ * 4 + 2 - localPlayer.z / 32;
					this.minimapDrawDot(this.mapmarker0, var39, var38);
				}
				Pix2D.fillrect(16777215, 97, 99, 3, 3, 78);
				this.areaGame.setPixels();
				Pix3D.scanline = this.gameScanline;
			}
		} catch (RuntimeException var41) {
			signlink.reporterror("48319, " + false + ", " + var41.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.a(LODBDSPMH;ZII)V")
	public void minimapDrawArrow(Pix32 arg0, boolean arg1, int arg2, int arg3) {
		try {
			int var5 = arg3 * arg3 + arg2 * arg2;
			if (arg1) {
				this.maininit();
			}
			if (var5 > 4225 && var5 < 90000) {
				int var6 = this.orbitCameraYaw + this.macroMinimapAngle & 0x7FF;
				int var7 = Model.sinTable[var6];
				int var8 = Model.cosTable[var6];
				int var9 = var7 * 256 / (this.macroMinimapZoom + 256);
				int var10 = var8 * 256 / (this.macroMinimapZoom + 256);
				int var11 = arg2 * var9 + arg3 * var10 >> 16;
				int var12 = arg2 * var10 - arg3 * var9 >> 16;
				double var13 = Math.atan2((double) var11, (double) var12);
				int var15 = (int) (Math.sin(var13) * 63.0D);
				int var16 = (int) (Math.cos(var13) * 57.0D);
				this.mapedge.rotatePlotSprite(var15 + 94 + 4 - 10, var13, 83 - var16 - 20);
			} else {
				this.minimapDrawDot(arg0, arg2, arg3);
			}
		} catch (RuntimeException var18) {
			signlink.reporterror("27897, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + var18.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.b(LODBDSPMH;ZII)V")
	public void minimapDrawDot(Pix32 arg0, int arg1, int arg2) {
		try {
			int var4 = this.orbitCameraYaw + this.macroMinimapAngle & 0x7FF;
			int var5 = arg2 * arg2 + arg1 * arg1;
			if (var5 <= 6400) {
				int var6 = Model.sinTable[var4];
				int var7 = Model.cosTable[var4];
				int var8 = var6 * 256 / (this.macroMinimapZoom + 256);
				int var9 = var7 * 256 / (this.macroMinimapZoom + 256);
				int var10 = arg1 * var8 + arg2 * var9 >> 16;
				int var11 = arg1 * var9 - arg2 * var8 >> 16;
				if (var5 > 2500) {
					arg0.scanlinePlotSprite(var10 + 94 + 4 - arg0.owi / 2, this.mapback, 83 - var11 - arg0.ohi / 2 - 4);
				} else {
					arg0.plotSprite(var10 + 94 + 4 - arg0.owi / 2, this.field527, 83 - var11 - arg0.ohi / 2 - 4);
				}
			}
		} catch (RuntimeException var13) {
			signlink.reporterror("42219, " + arg0 + ", " + false + ", " + arg1 + ", " + arg2 + ", " + var13.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.a(ILjava/lang/String;Ljava/lang/String;I)V")
	public void addChat(int arg0, String arg1, String arg2) {
		try {
			if (arg0 == 0 && this.field629 != -1) {
				this.field321 = arg1;
				super.mouseClickButton = 0;
			}
			if (this.chatComId == -1) {
				this.redrawChatback = true;
			}
			for (int var4 = 99; var4 > 0; var4--) {
				this.chatType[var4] = this.chatType[var4 - 1];
				this.chatusername[var4] = this.chatusername[var4 - 1];
				this.chatText[var4] = this.chatText[var4 - 1];
			}
			this.chatType[0] = arg0;
			this.chatusername[0] = arg2;
			this.chatText[0] = arg1;
		} catch (RuntimeException var6) {
			signlink.reporterror("69775, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + ", " + var6.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.a(Ljava/lang/String;I)Z")
	public boolean isFriend(String arg0) {
		try {
			if (arg0 == null) {
				return false;
			}
			for (int var2 = 0; var2 < this.friendCount; var2++) {
				if (arg0.equalsIgnoreCase(this.friendUsername[var2])) {
					return true;
				}
			}
			return arg0.equalsIgnoreCase(localPlayer.name);
		} catch (RuntimeException var4) {
			signlink.reporterror("13059, " + arg0 + ", " + 4 + ", " + var4.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.a(JI)V")
	public void addFriend(long arg0) {
		try {
			if (arg0 != 0L) {
				if (this.friendCount >= 100 && this.field403 != 1) {
					this.addChat(0, "Your friendlist is full. Max of 100 for free users, and 200 for members", "");
				} else if (this.friendCount >= 200) {
					this.addChat(0, "Your friendlist is full. Max of 100 for free users, and 200 for members", "");
				} else {
					String var3 = JString.toSentenceCase(JString.toRawUsername(arg0));
					for (int var4 = 0; var4 < this.friendCount; var4++) {
						if (this.friendUserhash[var4] == arg0) {
							this.addChat(0, var3 + " is already on your friend list", "");
							return;
						}
					}
					for (int var5 = 0; var5 < this.ignoreCount; var5++) {
						if (this.ignoreUserhash[var5] == arg0) {
							this.addChat(0, "Please remove " + var3 + " from your ignore list first", "");
							return;
						}
					}
					if (!var3.equals(localPlayer.name)) {
						this.friendUsername[this.friendCount] = var3;
						this.friendUserhash[this.friendCount] = arg0;
						this.friendNodeId[this.friendCount] = 0;
						this.friendCount++;
						this.redrawSidebar = true;
						this.out.p1enc(167);
						this.out.p8(arg0);
					}
				}
			}
		} catch (RuntimeException var7) {
			signlink.reporterror("35870, " + arg0 + ", " + -20952 + ", " + var7.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.a(ZJ)V")
	public void addIgnore(long arg0) {
		try {
			if (arg0 != 0L) {
				if (this.ignoreCount >= 100) {
					this.addChat(0, "Your ignore list is full. Max of 100 hit", "");
				} else {
					String var3 = JString.toSentenceCase(JString.toRawUsername(arg0));
					for (int var4 = 0; var4 < this.ignoreCount; var4++) {
						if (this.ignoreUserhash[var4] == arg0) {
							this.addChat(0, var3 + " is already on your ignore list", "");
							return;
						}
					}
					for (int var5 = 0; var5 < this.friendCount; var5++) {
						if (this.friendUserhash[var5] == arg0) {
							this.addChat(0, "Please remove " + var3 + " from your friend list first", "");
							return;
						}
					}
					this.ignoreUserhash[this.ignoreCount++] = arg0;
					this.redrawSidebar = true;
					this.out.p1enc(71);
					this.out.p8(arg0);
				}
			}
		} catch (RuntimeException var7) {
			signlink.reporterror("37193, " + false + ", " + arg0 + ", " + var7.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.a(JZ)V")
	public void delFriend(long arg0) {
		try {
			if (arg0 != 0L) {
				for (int var3 = 0; var3 < this.friendCount; var3++) {
					if (this.friendUserhash[var3] == arg0) {
						this.friendCount--;
						this.redrawSidebar = true;
						for (int var4 = var3; var4 < this.friendCount; var4++) {
							this.friendUsername[var4] = this.friendUsername[var4 + 1];
							this.friendNodeId[var4] = this.friendNodeId[var4 + 1];
							this.friendUserhash[var4] = this.friendUserhash[var4 + 1];
						}
						this.out.p1enc(223);
						this.out.p8(arg0);
						return;
					}
				}
			}
		} catch (RuntimeException var6) {
			signlink.reporterror("72079, " + arg0 + ", " + true + ", " + var6.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.b(JI)V")
	public void delIgnore(long arg0, int arg1) {
		try {
			if (arg1 != 0) {
				this.groundObj = null;
			}
			if (arg0 != 0L) {
				for (int var4 = 0; var4 < this.ignoreCount; var4++) {
					if (this.ignoreUserhash[var4] == arg0) {
						this.ignoreCount--;
						this.redrawSidebar = true;
						for (int var5 = var4; var5 < this.ignoreCount; var5++) {
							this.ignoreUserhash[var5] = this.ignoreUserhash[var5 + 1];
						}
						this.out.p1enc(146);
						this.out.p8(arg0);
						return;
					}
				}
			}
		} catch (RuntimeException var7) {
			signlink.reporterror("92832, " + arg0 + ", " + arg1 + ", " + var7.toString());
			throw new RuntimeException();
		}
	}

	@Override
	public void run() {
		if (this.flamesThread) {
			this.renderFlames();
		} else {
			super.run();
		}
	}

	@ObfuscatedName("client.c(B)V")
	public void renderFlames() {
		try {
			this.flameThread = true;
			try {
				long var1 = System.currentTimeMillis();
				int var3 = 0;
				int var4 = 20;
				while (this.flameActive) {
					this.field226++;
					this.updateFlames();
					this.updateFlames();
					this.drawFlames();
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
			this.flameThread = false;
		} catch (RuntimeException var11) {
			signlink.reporterror("78651, " + -31 + ", " + var11.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.e(B)V")
	public void updateFlames() {
		try {
			for (int var1 = 10; var1 < 117; var1++) {
				int var2 = (int) (Math.random() * 100.0D);
				if (var2 < 50) {
					this.flameBuffer3[var1 + 32512] = 255;
				}
			}
			for (int var3 = 0; var3 < 100; var3++) {
				int var4 = (int) (Math.random() * 124.0D) + 2;
				int var5 = (int) (Math.random() * 128.0D) + 128;
				int var6 = var4 + (var5 << 7);
				this.flameBuffer3[var6] = 192;
			}
			for (int var7 = 1; var7 < 255; var7++) {
				for (int var8 = 1; var8 < 127; var8++) {
					int var9 = var8 + (var7 << 7);
					this.flameBuffer2[var9] = (this.flameBuffer3[var9 - 1] + this.flameBuffer3[var9 + 1] + this.flameBuffer3[var9 - 128] + this.flameBuffer3[var9 + 128]) / 4;
				}
			}
			this.field561 += 128;
			if (this.field561 > this.flameBuffer0.length) {
				this.field561 -= this.flameBuffer0.length;
				int var10 = (int) (Math.random() * 12.0D);
				this.generateFlameCoolingMap(this.runes[var10]);
			}
			for (int var11 = 1; var11 < 255; var11++) {
				for (int var12 = 1; var12 < 127; var12++) {
					int var13 = var12 + (var11 << 7);
					int var14 = this.flameBuffer2[var13 + 128] - this.flameBuffer0[var13 + this.field561 & this.flameBuffer0.length - 1] / 5;
					if (var14 < 0) {
						var14 = 0;
					}
					this.flameBuffer3[var13] = var14;
				}
			}
			for (int var15 = 0; var15 < 255; var15++) {
				this.field341[var15] = this.field341[var15 + 1];
			}
			this.field341[255] = (int) (Math.sin((double) loopCycle / 14.0D) * 16.0D + Math.sin((double) loopCycle / 15.0D) * 14.0D + Math.sin((double) loopCycle / 16.0D) * 12.0D);
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

	@ObfuscatedName("client.k(I)V")
	public void drawFlames() {
		try {
			if (this.field396 > 0) {
				for (int var1 = 0; var1 < 256; var1++) {
					if (this.field396 > 768) {
						this.flameGradient[var1] = this.titleFlamesMerge(this.flameGradient1[var1], 1024 - this.field396, this.flameGradient0[var1]);
					} else if (this.field396 > 256) {
						this.flameGradient[var1] = this.flameGradient1[var1];
					} else {
						this.flameGradient[var1] = this.titleFlamesMerge(this.flameGradient0[var1], 256 - this.field396, this.flameGradient1[var1]);
					}
				}
			} else if (this.field397 > 0) {
				for (int var2 = 0; var2 < 256; var2++) {
					if (this.field397 > 768) {
						this.flameGradient[var2] = this.titleFlamesMerge(this.flameGradient2[var2], 1024 - this.field397, this.flameGradient0[var2]);
					} else if (this.field397 > 256) {
						this.flameGradient[var2] = this.flameGradient2[var2];
					} else {
						this.flameGradient[var2] = this.titleFlamesMerge(this.flameGradient0[var2], 256 - this.field397, this.flameGradient2[var2]);
					}
				}
			} else {
				for (int var3 = 0; var3 < 256; var3++) {
					this.flameGradient[var3] = this.flameGradient0[var3];
				}
			}
			for (int var4 = 0; var4 < 33920; var4++) {
				this.field331.data[var4] = this.flameLeft.data[var4];
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
					int var11 = this.flameBuffer3[var5++];
					if (var11 == 0) {
						var6++;
					} else {
						int var13 = 256 - var11;
						int var14 = this.flameGradient[var11];
						int var15 = this.field331.data[var6];
						this.field331.data[var6++] = ((var14 & 0xFF00FF) * var11 + (var15 & 0xFF00FF) * var13 & 0xFF00FF00) + ((var14 & 0xFF00) * var11 + (var15 & 0xFF00) * var13 & 0xFF0000) >> 8;
					}
				}
				var6 += var9;
			}
			this.field331.draw(0, super.graphics, 0);
			for (int var16 = 0; var16 < 33920; var16++) {
				this.field332.data[var16] = this.flameRight.data[var16];
			}
			int var17 = 0;
			int var18 = 1176;
			for (int var19 = 1; var19 < 255; var19++) {
				int var20 = this.field341[var19] * (256 - var19) / 256;
				int var21 = 103 - var20;
				int var22 = var18 + var20;
				for (int var23 = 0; var23 < var21; var23++) {
					int var24 = this.flameBuffer3[var17++];
					if (var24 == 0) {
						var22++;
					} else {
						int var26 = 256 - var24;
						int var27 = this.flameGradient[var24];
						int var28 = this.field332.data[var22];
						this.field332.data[var22++] = ((var27 & 0xFF00FF) * var24 + (var28 & 0xFF00FF) * var26 & 0xFF00FF00) + ((var27 & 0xFF00) * var24 + (var28 & 0xFF00) * var26 & 0xFF0000) >> 8;
					}
				}
				var17 += 128 - var21;
				var18 = var22 + 128 - var21 - var20;
			}
			this.field332.draw(0, super.graphics, 637);
		} catch (RuntimeException var30) {
			signlink.reporterror("42725, " + 4 + ", " + var30.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.a(ILFCRLGSQA;)V")
	public void generateFlameCoolingMap(Pix8 arg0) {
		try {
			for (int var2 = 0; var2 < this.flameBuffer0.length; var2++) {
				this.flameBuffer0[var2] = 0;
			}
			for (int var3 = 0; var3 < 5000; var3++) {
				int var4 = (int) (Math.random() * 128.0D * (double) 256);
				this.flameBuffer0[var4] = (int) (Math.random() * 256.0D);
			}
			for (int var5 = 0; var5 < 20; var5++) {
				for (int var6 = 1; var6 < 255; var6++) {
					for (int var7 = 1; var7 < 127; var7++) {
						int var8 = var7 + (var6 << 7);
						this.flameBuffer1[var8] = (this.flameBuffer0[var8 - 1] + this.flameBuffer0[var8 + 1] + this.flameBuffer0[var8 - 128] + this.flameBuffer0[var8 + 128]) / 4;
					}
				}
				int[] var9 = this.flameBuffer0;
				this.flameBuffer0 = this.flameBuffer1;
				this.flameBuffer1 = var9;
			}
			if (arg0 != null) {
				int var10 = 0;
				for (int var11 = 0; var11 < arg0.hi; var11++) {
					for (int var12 = 0; var12 < arg0.wi; var12++) {
						if (arg0.data[var10++] != 0) {
							int var13 = var12 + arg0.xof + 16;
							int var14 = var11 + arg0.yof + 16;
							int var15 = var13 + (var14 << 7);
							this.flameBuffer0[var15] = 0;
						}
					}
				}
			}
		} catch (RuntimeException var17) {
			signlink.reporterror("2212, " + ", " + arg0 + ", " + var17.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.a(IZII)I")
	public int titleFlamesMerge(int arg0, int arg1, int arg2) {
		try {
			int var4 = 256 - arg1;
			return ((arg2 & 0xFF00FF) * var4 + (arg0 & 0xFF00FF) * arg1 & 0xFF00FF00) + ((arg2 & 0xFF00) * var4 + (arg0 & 0xFF00) * arg1 & 0xFF0000) >> 8;
		} catch (RuntimeException var6) {
			signlink.reporterror("67098, " + arg0 + ", " + true + ", " + arg1 + ", " + arg2 + ", " + var6.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.a(BLjava/lang/String;Ljava/lang/String;)V")
	public void showPopupMessage(byte arg0, String arg1, String arg2) {
		try {
			if (arg0 == 9) {
				boolean var8 = false;
			} else {
				this.ptype = this.in.g1();
			}
			if (this.areaGame != null) {
				this.areaGame.setPixels();
				Pix3D.scanline = this.gameScanline;
				int var4 = 151;
				if (arg2 != null) {
					var4 -= 7;
				}
				this.p12.centreStringTag(0, arg1, 257, var4);
				this.p12.centreStringTag(16777215, arg1, 256, var4 - 1);
				var4 += 15;
				if (arg2 != null) {
					this.p12.centreStringTag(0, arg2, 257, var4);
					this.p12.centreStringTag(16777215, arg2, 256, var4 - 1);
				}
				this.areaGame.draw(4, super.graphics, 4);
			} else if (super.drawArea != null) {
				super.drawArea.setPixels();
				Pix3D.scanline = this.field429;
				int var5 = 251;
				Pix2D.fillrect(0, 233, 99, 300, 50, 221);
				Pix2D.drawRect(221, 300, 233, 50, 16777215);
				if (arg2 != null) {
					var5 -= 7;
				}
				this.p12.centreStringTag(0, arg1, 383, var5);
				this.p12.centreStringTag(16777215, arg1, 382, var5 - 1);
				var5 += 15;
				if (arg2 != null) {
					this.p12.centreStringTag(0, arg2, 383, var5);
					this.p12.centreStringTag(16777215, arg2, 382, var5 - 1);
				}
				super.drawArea.draw(0, super.graphics, 0);
			}
		} catch (RuntimeException var7) {
			signlink.reporterror("78163, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + var7.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.c(BI)Ljava/lang/String;")
	public String getDateString(int arg0) {
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

	@ObfuscatedName("client.z(I)V")
	public void prepareFullGame() {
		try {
			if (super.drawArea == null) {
				this.unloadTitle();
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
				this.areaMap = null;
				this.field488 = null;
				this.areaGame = null;
				this.areaBackbase1 = null;
				this.areaBackbase2 = null;
				this.areaBackhmid1 = null;
				super.drawArea = new PixMap(765, false, this.getBaseComponent(), 503);
				this.redrawFrame = true;
			}
		} catch (RuntimeException var2) {
			signlink.reporterror("87483, " + 5 + ", " + var2.toString());
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("client.a(IZ)V")
	public void unloadIf(int arg0) {
		try {
			IfType.unloadIf(arg0);
		} catch (RuntimeException var3) {
			signlink.reporterror("39400, " + arg0 + ", " + true + ", " + var3.toString());
			throw new RuntimeException();
		}
	}
}
