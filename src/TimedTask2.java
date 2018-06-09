import java.text.SimpleDateFormat;  
import java.util.Calendar;  
import java.util.Date;  
import java.util.Timer;  
import java.util.TimerTask;
public class TimedTask2 {
	public static void cronJob(int shi, int fen, int miao) {  
        Calendar cal = Calendar.getInstance();  
        // 每天定点执行  
        cal.set(Calendar.HOUR_OF_DAY, shi);  
        cal.set(Calendar.MINUTE, fen);  
        cal.set(Calendar.SECOND, miao);  
  
        Timer timer = new Timer();  
        timer.schedule(new TimerTask() {  
  
            public void run() {  
                // 把run方法里的内容换成你要执行的内容  
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  
                System.out.println("当前的系统时间为：" + sdf.format(new Date()));  
            }  
        }, cal.getTime(), 24 * 60 * 60 * 1000);  
    }  
  
     
      public static void main(String[] args) {  
      cronJob(18, 30, 0); //24小时制 时分秒  
      } 
      
}
