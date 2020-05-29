package array;

import java.util.Random;

public class Task3 {

	public static void main(String[] args) {
		System.out.print("[");
		Random rnd = new Random();
		int[] b = new int[6];
		for(int i = 0; i < b.length; i++) {
			b[i] = rnd.nextInt(10);
		}
		int max = b[0];
		int min = b[0];
		for(int i = 0; i < b.length; i++) {
			if(i < b.length - 1) {
				System.out.print(b[i] + ",");
			}else {
				System.out.println(b[i] + "]");
			}
			if(max < b[i]) {
				max = b[i];
			}
			if(min > b[i]) {
				min = b[i];
			}
		}
		System.out.println("最大値: " + max);
		System.out.println("最大値: " + min);
	}
}