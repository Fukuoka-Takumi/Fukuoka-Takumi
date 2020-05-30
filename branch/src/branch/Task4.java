package branch;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("numA:");
		int numA = sc.nextInt();
		System.out.print("numB:");
		int numB = sc.nextInt();
		int c = 0;

		if (numA <= c || numB <= c) {
			System.out.println("正の整数を入力してください。");
		}
		else if (c == numA % numB) {
			System.out.println("numBはrumAの約数です。");
		}
		else {
			System.out.println("numBはrumAの約数ではありません。");
		}
		sc.close();
	}
}