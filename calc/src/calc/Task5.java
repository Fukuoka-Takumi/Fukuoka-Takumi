package calc;

import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {

		String a = "ノートPCの値段:";
		final int b = 89800;
		char c = '円';
		System.out.println(a + b + c);

		Scanner sc = new Scanner(System.in);
		String d = sc.nextLine();
		String e = sc.nextLine();
		sc.close();

		System.out.println(d);
		System.out.println(e);
		System.out.println(d + e);
	}
}
