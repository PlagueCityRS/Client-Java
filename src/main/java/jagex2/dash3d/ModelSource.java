package jagex2.dash3d;

import deob.ObfuscatedName;
import jagex2.datastruct.Linkable2;
import sign.signlink;

@ObfuscatedName("XHDBBLMT")
public class ModelSource extends Linkable2 {

	@ObfuscatedName("XHDBBLMT.i")
	public int minY = 1000;

	@ObfuscatedName("XHDBBLMT.h")
	public PointNormal[] pointNormal;

	@ObfuscatedName("XHDBBLMT.a(IIIIIIIII)V")
	public void worldRender(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		Model var10 = this.getTempModel();
		if (var10 != null) {
			this.minY = var10.minY;
			var10.worldRender(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		}
	}

	@ObfuscatedName("XHDBBLMT.a(I)LKBEXSZSN;")
	public Model getTempModel() {
		try {
			return null;
		} catch (RuntimeException var2) {
			signlink.reporterror("61881, " + ", " + var2.toString());
			throw new RuntimeException();
		}
	}
}
