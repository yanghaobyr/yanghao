import javax.servlet.http.HttpServletRequest;

/** 
* @author 作者 :yh 
* @version 创建时间：2018年5月23日 下午3:22:23 
* 类说明 
*/
public class ip {
	public static String getIpAddr(HttpServletRequest request) {     
	     String ip = request.getHeader("x-forwarded-for");     
	     if(ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {     
	         ip = request.getHeader("Proxy-Client-IP");     
	     }     
	      if(ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {     
	         ip = request.getHeader("WL-Proxy-Client-IP");     
	      }     
	     if(ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {     
	          ip = request.getRemoteAddr();     
	     }     
	     return ip;     
	}  
}
