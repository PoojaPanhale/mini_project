package facadedesignpattren;

public class ShopKeeper {
private MobileShop Iphone;
private MobileShop Samsung;
private MobileShop BlackBerry;
public ShopKeeper()
{
	Iphone=new Iphone();
	Samsung=new Samsung();
	BlackBerry=new BlackBerry();
	}
public void IphoneSal()
{
	Iphone.modelNo();
	Iphone.price();
	}
public void SamsungSal()
{
	Samsung.modelNo();
	Samsung.price();
	}
public void BlackBerry()
{
	BlackBerry.modelNo();
	BlackBerry.price();
}
}
