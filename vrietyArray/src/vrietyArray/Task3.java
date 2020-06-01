package vrietyArray;

import java.util.HashMap;

public class Task3 {

	public static void main(String[] args) {
		HashMap<String,Integer> kudamono = new HashMap<>();
		kudamono.put("りんご",130);
		kudamono.put("みかん", 120);
		kudamono.put("バナナ", 98);
		kudamono.put("メロン", 6000);
		for(HashMap.Entry<String,Integer> a : kudamono.entrySet()) {
			System.out.println(a.getKey() + ":" + a.getValue() + "円");
		}
	}
}