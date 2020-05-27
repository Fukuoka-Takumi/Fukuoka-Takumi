package loop;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.close();
		System.out.println("数字を入力してください: " + a);

		int keta = 0;
		while(a > 0) {
			keta ++;
			a = a / 10;
		}
		System.out.print("桁数: " + keta);
	}

}
