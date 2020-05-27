package loop;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int sum = 0;
		sc.close();
		System.out.println("数字を入力してください: " + a);

		for(int i = 1; i < a; i++) {
			System.out.print(i + " + ");
			sum = i + sum;
		}
		System.out.print(a +" = " + sum );

	}

}