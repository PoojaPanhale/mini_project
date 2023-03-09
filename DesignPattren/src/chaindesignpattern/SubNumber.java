package chaindesignpattern;

public class SubNumber implements Chain
{
private Chain nextChain;
@Override
public void setNextChain(Chain nextChain) {
this.nextChain=nextChain;
	
}




@Override
public void calculate(Number request) {
	// TODO Auto-generated method stub
	if(request.getCalwanted()=="sub")
	{
		System.out.println(request.getNumber1()+"-"+request.getNumber2()+"="+(request.getNumber1()-request.getNumber2()));
	}
	else
	{
		nextChain.calculate(request);
	}
	
}
}
