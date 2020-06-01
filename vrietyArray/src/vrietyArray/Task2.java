package vrietyArray;

import java.util.ArrayList;

public class Task2 {

	public static void main(String[] args) {
		int[] array = {21, 3, 32, 6, 99, 72, 78, 51, 1, 26, 87, 11, 48, 60};
		ArrayList<Integer> evenList = new ArrayList<>();
		ArrayList<Integer> oddList = new ArrayList<>();

		for(int i = 0; i < array.length; i++) {
			if(array[i] % 2 == 0) {
				evenList.add(array[i]);
			}else {
				oddList.add(array[i]);
			}
		}
		System.out.println("奇数: "+ oddList);
		System.out.println("偶数: "+ evenList);
	}
}