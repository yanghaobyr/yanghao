import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Test01 {
	public static void main(String[] args) {

		String currentTime=time1(0);

		String changeTime=time1(-30);//前三十分钟

		System.out.println("当前时间 --："+currentTime+"\n提前三十分钟\n更改后的时间---："+changeTime);

		}



		public static  String time1(int a) {

		String currentTime="";//当前时间

		Calendar cal=Calendar.getInstance();

		//这里用的是分钟，也可以用小时，或者是天...

		cal.set(Calendar.MINUTE , Calendar.MINUTE +a); //当前分钟的前后分钟，

		//格式化指定形式的时间

		    currentTime =  new SimpleDateFormat( "yyyy-MM-dd HH:mm:ss" ).format(cal.getTime());//获取到完整的时间

		    return  currentTime;
		}
}
