package loop;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("数字を入力してください: ");
		int a = sc.nextInt();
		sc.close();

		int keta = 0;
		while(a > 0) {
			keta ++;
			a = a / 10;
		}
		System.out.print("桁数: " + keta);
	}

}
