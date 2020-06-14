
public class Task5 {

	public static void main(String[] args) {
		String str = "cat_mouse_mouse_cat_cat";
		String[] array = str.split("_");
		int neko = 0;
		int nezu = 0;
		for(String trial : array) {
			if ("cat".equals(trial)) {
				neko++;
			}else {
				nezu++;
			}
		}
		if(neko > nezu) {
			System.out.println("catの方が多い");
		}else{
			System.out.println("mouseの方が多い");
		}
	}
}