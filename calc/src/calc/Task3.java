package calc;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int num_1 = sc.nextInt();
		int num_2 = sc.nextInt();
		int num_3 = sc.nextInt();
		int x = (num_1+num_2+num_3);
		int y = (x/3);
		double z =(x/3.0);
		sc.close();
		
		System.out.println(num_1);
		System.out.println(num_2);
		System.out.println(num_3);
		System.out.println("合計:"+x);
		System.out.println("平均(3で割った時):"+y);
		System.out.println("平均(3.0で割った時):"+z);
	}
}