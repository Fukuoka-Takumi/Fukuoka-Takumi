import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Task6 {
	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年MM月dd日HH時mm分");
		try {
			Date date = sdf.parse("2019年09月09日");
			Date date2 = sdf2.parse("2019年09月09日12時13分");
			System.out.println(sdf.format(date));
			System.out.println(sdf2.format(date2));
		}catch(ParseException e){
			e.printStackTrace();
		}
	}
}
