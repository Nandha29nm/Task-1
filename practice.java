package newPack;
import java.util.Scanner;

public class practice {

	public static void main(String[] args) {
		//10 to 50
		for (int i=10;i<=50;i++) {
			System.out.println(i);
		}
			
        int i=10;
        while (i<=50) {
        	System.out.println(i);
        	i++;
        }
        //positive or negative
		Scanner obj=new Scanner(System.in);
		int n=obj.nextInt();
		if (n<0)
			System.out.println("negative");
		else
			System.out.println("positive");
		
		//reverse
		int rev=0;
		while(n!=0) {
			int di=n%10;
			rev=rev*10+di;
			n=n/10;
		}
		System.out.println(rev);
			
	}
	
	// smallest among 3 number
		Scanner obj=new Scanner(System.in);
	int a=obj.nextInt();
	int b=obj.nextInt();
	int c=obj.nextInt();
	if ((a<b)&&(a<c)){
		System.out.println("a is smallest");
	}
	else if ((b<a)&&(b<c)) {
		System.out.println("b is smallest");
	}
	else {
		System.out.println("c is smallest");
	}
		//discount q5
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the purchase amount:");
	double purchase=sc.nextDouble();
	double discount=0.0;
	double finalAmount;
	if(purchase>=500 && purchase<=1000) {
		discount=0.10;
	}
	else if(purchase>1000) {
		discount=0.20;
	}
	finalAmount =purchase-(purchase*discount);
	System.out.println(finalAmount);
	

}
	
	
	
}
