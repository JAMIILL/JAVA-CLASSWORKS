package classroom;

public class primenumber2 {
	
	public static void main(String[] args) {
		
		
		int a=5;
	    int b=0;
	for (int i = 1; i <=a; i++) {
		if(a%i==0){ 
	b++;
		
	}
	}
	if (b==2) {
		System.out.println("it is prime number");
	}
	else {
		System.out.println("it is not prime number");
	}
	}

}
