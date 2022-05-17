package classroom;

public class arithmaticcalculator {
	public void add() {
		
		int a =10,b=5,c=a+b;
		System.out.println(c);
		
	}
	public void sub(int a, int b) {
		int c=a-b;
		System.out.println(c);
	}
	
	public static void main(String[] args) {
		arithmaticcalculator calc=new arithmaticcalculator();
		 calc.add();
		 calc.sub(25, 5);
	}

}

