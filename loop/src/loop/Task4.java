package loop;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("正の整数を入力してください: ");
		int a = sc.nextInt();

		System.out.print(a + "の約数: ");
		for(int i = 1; i <= a; i++) {
			if(a % i == 0 && a != i) {
				System.out.print(i + ",");
			}else if(a == i) {
				System.out.print(a);
			}
		}
		sc.close();
	}
}