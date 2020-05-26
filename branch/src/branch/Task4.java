package branch;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int numA = sc.nextInt();
		int numB = sc.nextInt();
		int c = 0;

		if (numA > c && numB > c && c == numA % numB) {
			System.out.println("numA:" + numA);
			System.out.println("numB:" + numB);
			System.out.println("numBはrumAの約数です。");
		}
		else if (numA > c && numB > c && c != numA % numB) {
			System.out.println("numA:" + numA);
			System.out.println("numB:" + numB);
			System.out.println("numBはrumAの約数ではありません。");
		}
		else {
			System.out.println("numA:" + numA);
			System.out.println("numB:" + numB);
			System.out.println("正の整数を入力してください。");
		}
		sc.close();
	}
}