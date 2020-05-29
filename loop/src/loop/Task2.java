package loop;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("数字を入力してください: ");
		int a = sc.nextInt();
		int sum = 0;

		for(int i = 1; i < a; i++) {
			System.out.print(i + " + ");
			sum = i + sum;
		}
		System.out.print(a + " = " + (sum + a));
		sc.close();
	}
}