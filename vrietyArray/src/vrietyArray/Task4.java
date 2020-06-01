package vrietyArray;

import java.util.ArrayList;
import java.util.HashMap;

public class Task4 {

	public static void main(String[] args) {
		int[] array = {21, 3, 32, 6, 99, 72, 78, 51, 1, 26, 87, 11, 48, 60, 29, 5, 46, 74, 14, 193, 215, 83};
		ArrayList<Integer> evenList = new ArrayList<>();
		ArrayList<Integer> oddList = new ArrayList<>();

		for(int i = 0; i < array.length; i++) {
			if(array[i] % 2 == 0) {
				evenList.add(array[i]);
			}else {
				oddList.add(array[i]);
			}
		}
		HashMap<String, ArrayList<Integer>> label = new HashMap<>();
		label.put("奇数: ",oddList);
		label.put("偶数: ", evenList);
		System.out.print(label);
	}
}
