package branch;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		
		int numA =sc.nextInt();
		int numB =sc.nextInt();
		int c = 0;
		
		if (numA>0 && numB>0)
		if(c==numA/numB) {
	     System.out.println("numA:"+numA);
		 System.out.println("numB:"+numB);
	     System.out.println("numBはrumAの約数です。");
		}
		if (numA>0 && numB>0)
		if (c!=numA/numB) {
		 System.out.println("numA:"+numA);
		 System.out.println("numB:"+numB);
		 System.out.println("numBはrumAの約数ではありません。");
		}
		if (numA>numB)
		if (c>=numB) {
		 System.out.println("numA:"+numA);
		 System.out.println("numB:"+numB);
		 System.out.println("正の整数を入力してください。");
		}
		sc.close();
	}
}