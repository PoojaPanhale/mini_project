package facadedesignpattren;

public class Iphone implements MobileShop {

	@Override
	public void modelNo() {
		System.out.println("Iphone");
		
	}

	@Override
	public void price() {
		System.out.println(65000);
		
	}

}
