import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
public class Task7 {
	public static void main(String[] args) {
		Date now = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
		System.out.println("現在時刻: " + sdf.format(now));
		
		Calendar cal =Calendar.getInstance();
		cal.setTime(now);
		cal.add(Calendar.DATE, 7);
		Date d1 = cal.getTime();
		System.out.println("１週間後: " + sdf.format(d1));
		
		cal.set(2021,5,15);
		Date d2 = cal.getTime();
		System.out.print("１年後  : " + sdf.format(d2));
		String[] week = new String[7];
		week[0] = "日";
		week[1] = "月";
		week[2] = "火";
		week[3] = "水";
		week[4] = "木";
		week[5] = "金";
		week[6] = "土";
		int week_int = cal.get(Calendar.DAY_OF_WEEK);
		System.out.println("(" + week[week_int - 1]  + ")");
	}
}