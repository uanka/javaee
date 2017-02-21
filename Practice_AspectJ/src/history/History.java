package history;

import java.time.Duration;
import java.time.temporal.Temporal;
import java.util.Calendar;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class History {
	
	public Calendar logged_in;
	
	@Pointcut(" execution(* history.User.chating(..)")
	public void pointcutName() {}
	
	@After("pointcutName()")
	public void logDate(JoinPoint jp) {
		System.out.println(Calendar.getInstance() + ": " + jp.getSignature().getName() );
	}
	
	public void loggedIn() {
		logged_in = Calendar.getInstance();
	}
 	
	public void wasOnline() {
		Calendar logged_out = Calendar.getInstance();
		System.out.println("Session closed. User was online from " + logged_in + " to " 
		+ logged_out + "( for" + Duration.between((Temporal)logged_in, (Temporal)logged_out) + ").");
	}
}
