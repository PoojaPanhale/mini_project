package chaindesignpattern;

public class AddNumber implements Chain{
	private Chain nextChain;
	
	public void setNextChain(Chain nextChain) {
		this.nextChain=nextChain;
		
	}



	@Override
	public void calculate(Number request) {
		// TODO Auto-generated method stub
		if(request.getCalwanted()== "add")
		{
			System.out.println(request.getNumber1()+"+"+request.getNumber2()+"="+(request.getNumber1()+request.getNumber2()));
		}
		else
		{
			nextChain.calculate(request);
		}
	}


	

}
