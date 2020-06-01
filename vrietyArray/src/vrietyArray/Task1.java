package vrietyArray;

import java.util.ArrayList;

public class Task1 {

	public static void main(String[] args) {
		ArrayList<String> strList1 = new ArrayList<String>();
		strList1.add("北海道");
		strList1.add("東北");
		strList1.add("関東");
		strList1.add("中部");
		strList1.add("近畿");
		strList1.add("中国");
		strList1.add("九州");
		for(String kubun : strList1) {
			System.out.println(kubun);
		}
	}

}
