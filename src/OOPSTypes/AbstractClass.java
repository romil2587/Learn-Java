package OOPSTypes;

public class AbstractClass {

	public static void main(String[] args) {
		AnyMobile a1 = new AnyMobile();
		a1.goodfeatures();
		a1.UI();
	}
}

abstract class Android{
	public void goodfeatures() {
		System.out.println("Good features from Android");
	}
	public abstract void UI();
}

class AnyMobile extends Android{
	public void UI() {
		System.out.println("UI of other mobile");
	}
}