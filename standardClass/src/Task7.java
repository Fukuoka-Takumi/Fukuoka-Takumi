import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
public class Task7 {
	public static void main(String[] args) {
		Date now = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
		System.out.println("現在時刻: " + sdf.format(now));
		
		Calendar cal =Calendar.getInstance();
		cal.add(Calendar.DATE, 7);
		Date d1 = cal.getTime();
		System.out.println("１週間後: " + sdf.format(d1));
		
		cal.set(2021,5,16);
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年MM月dd日(E)");
		System.out.println("１年後　: " + sdf2.format(cal.getTime())); 
}
}