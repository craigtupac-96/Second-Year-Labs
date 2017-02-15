/*
 * Author: Craig Lawlor
 * C00184465
 */
package Lab10;
import java.util.Calendar;

public class Clock {
	public static void main(String[] args){
		Calendar cal = Calendar.getInstance();
		Time myTime = new Time (cal.get(Calendar.HOUR_OF_DAY), cal.get(Calendar.MINUTE), cal.get(Calendar.SECOND));
		System.out.println(myTime.toString());
		
		long startTime = System.currentTimeMillis();
		long currentTime = startTime;
		int oldMin = cal.get(Calendar.MINUTE);
		int newMin = oldMin;
		while(newMin == oldMin){
			while((currentTime - startTime) < 1000){
				currentTime = System.currentTimeMillis();
			}
			myTime.tick();
			System.out.println(myTime.toString());
			newMin = myTime.getMinute();
			startTime = System.currentTimeMillis();
			currentTime = startTime;
		}
	}
}
