package classroom;

public class calculator22 {

	public int add(int a,int b) {
		int total=a+b;
	System.out.println("1 is"   +   total);
	return total;
}

	public void sub(int totalValues ,int d) {
	int z=totalValues-d;
	System.out.println( "2  is  " + z);
}
public static void main(String[] args) {
	calculator22 cal=new calculator22();
	int totalValues = cal.add(100, 100);
	System.out.println("3 is   "+totalValues);
	cal.sub(totalValues,100);
}
}