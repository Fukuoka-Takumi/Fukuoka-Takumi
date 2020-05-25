package branch;

import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		sc.close();

		System.out.println("numA:" + a);
		System.out.println("numB:" + b);
		System.out.println("numC:" + c);

		if(a >= b && a >= c) {
			System.out.println("最大値:" + a);
		}else if(b >= a && b >= c) {
			System.out.println("最大値:" + b);
		}else if(c >= a && c >= b) {
			System.out.println("最大値:" + c);
		}
	}
}