package chaindesignpattern;

public class TestMain {

	public static void main(String[] args) {
		Chain addchain=new AddNumber();
		Chain subchain=new SubNumber();
		
			addchain.setNextChain(subchain);
			Number requst=new Number(4, 2, "sub");
            addchain.calculate(requst);


	}

}
