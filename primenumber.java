package classroom;

public class primenumber {

	public static void main(String[] args) {
		int a = 35;
		boolean prime  = true;
		for(int i=2;i<a;i++)
		{
			if(a%i==0)
			{
				prime =false;
				System.out.println(a+ "is prime number");
				break;
			}
		else
			{
				System.out.println(a+ "is not  prime number");
				break;
			}
	

	}

}
}