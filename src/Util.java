import java.text.SimpleDateFormat;
import java.util.Date;

public class Util {
	/**
	 * 현재 날짜와 시간 리턴
	 * @return
	 */
	    public static String getNowDateStr() {
	        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	        Date now = new Date();
	        String nowTime = sdf1.format(now);
	 
	    return nowTime;
	    }
	}
