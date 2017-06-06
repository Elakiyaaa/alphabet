package number;
import java.util.Scanner;

public class number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("ENTER THE VALUE A B C:");
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		if(a>b && a>c)
			System.out.print("A is larger");
		
		if(b>c&&b>a)
			System.out.print("B is larger");
		
		if(c>a&&c>b)
			System.out.print("C is larger");
	


	}

}
