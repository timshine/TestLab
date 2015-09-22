/**************************************
 *     Timothy Shine                  * 
 *     AP Lab 03 - Time Display       * 
 *     9/17/2015                      * 
 * 					                  *
 **************************************/



public class Lab03 {
	public static void main(String args[]){
		//Starting Milli-Seconds
		int startMilSec = 10000123;
		
		//Convert Milli seconds to seconds
		int startSec = startMilSec/1000;
		
		//Find remainder of Milli seconds after seconds conversion
		int remainderMilSec = startMilSec%1000;
		
		//Display the lab name
		System.out.println("Lab 03, 100 Point Version");
		System.out.println();
		
		//Display the amount of starting seconds
		System.out.println("Starting milli-seconds: " + startMilSec);
		
		//Display the amount of hours 
		int hours = startSec/3600;
		System.out.println("Hours:                  " + (hours));
		
		//Display the amount of minutes
		int minutes = (startSec%3600)/60;
		System.out.println("Minutes:                " + (minutes));
		
		//Display the amount of seconds
		int seconds = (startSec%3600)%60;
		System.out.println("Seconds:                " + (seconds));
		
		//Display the amount of milli seconds using the remainder from top
		System.out.println("Milli Seconds:          " + remainderMilSec);
		
	}
	
}
