package alphabet;

import java.util.Scanner;

public class alphabet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		char ch=s.next().charAt(0);
		if(ch>='a'&&ch<='z'||ch>='A'&&ch<='Z')
			System.out.println("alphabet");
		else
			System.out.println("not alphabet");

	}

}
