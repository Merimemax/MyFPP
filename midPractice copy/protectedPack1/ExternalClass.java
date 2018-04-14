package protectedPack1;

import protectedPack2.Subclass;

public class ExternalClass {
	
	public String readVal() {
		Subclass cl = new Subclass();
		return cl.getVal(); // produces a compiler error -- how to fix?
	}
}

