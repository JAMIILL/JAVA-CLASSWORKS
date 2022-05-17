package classroom;

public class variables {
	String text = "hi";
	char c = 'q';
	boolean isVariables = true ;
	double value;
	
	public void add() {
		int a = 0;
		System.out.println( " a value" + a);
		int b=4;
		int c= a+b;
		System.out.println(c);
	}
	public void drive()
	{
		System.out.println("drive car");	
	}
	
	public static void main(String[] args) {
		variables var=new variables();
		System.out.println(var.text);
		System.out.println(var.c);
		System.out.println(var.isVariables);
		System.out.println(var.value);
	var.add();
	var.drive();
	}
	
}