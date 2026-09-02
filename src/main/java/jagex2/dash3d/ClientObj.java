package jagex2.dash3d;

import deob.ObfuscatedName;
import jagex2.config.ObjType;
import sign.signlink;

@ObfuscatedName("VQCXWNRE")
public final class ClientObj extends ModelSource {

	@ObfuscatedName("VQCXWNRE.k")
	public int id;

	@ObfuscatedName("VQCXWNRE.l")
	public int count;

	@ObfuscatedName("VQCXWNRE.a(I)LKBEXSZSN;")
	@Override
	public Model getTempModel() {
		try {
			ObjType var1 = ObjType.list(this.id);
			return var1.getModelLit(this.count);
		} catch (RuntimeException var3) {
			signlink.reporterror("49276, " + ", " + var3.toString());
			throw new RuntimeException();
		}
	}
}
