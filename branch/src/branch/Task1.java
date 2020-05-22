package branch;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
       Scanner sc = new Scanner(System.in);
       
        System.out.println("10以上の数字を入力してください");
        int data = sc.nextInt();
        
        if(data>=10)
        System.out.println("値:"+data);
        if(data<10)
        System.out.println("値:"+data*10);
        sc.close();
	}

}