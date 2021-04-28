/*
Your task in order to complete this Kata is to write a function which formats a duration, 
given as a number of seconds, in a human-friendly way.

The function must accept a non-negative integer. If it is zero, 
it just returns "now". Otherwise, the duration is expressed as 
a combination of years, days, hours, minutes and seconds.

It is much easier to understand with an example:
TimeFormatter.formatDuration(62)   //returns "1 minute and 2 seconds"
TimeFormatter.formatDuration(3662) //returns "1 hour, 1 minute and 2 seconds"
For the purpose of this Kata, a year is 365 days and a day is 24 hours.

Note that spaces are important.
*/
public class TimeFormatter {
	public static String formatDuration(int seconds) {
		if(seconds == 0){
			return "now";
		}
		StringBuilder print = new StringBuilder();
		int year = seconds/31536000;
		if(year != 0){
			print.append(year + (year > 1 ? " years" : " year"));
			seconds %= 31536000;
		}
		int day = seconds/86400;
		if(day != 0){
			if(year != 0){
				print.append(seconds % 86400 > 0 ? ", " : " and ");
			}
			print.append(day + (day > 1 ? " days" :" day"));
			seconds %= 86400;
		}
		int hour = seconds/3600;
		if(hour != 0){
			if(day != 0){
				print.append(seconds % 3600 > 0 ? ", " : " and ");
			}
			print.append(hour + (hour < 2 ? " hour" : " hours"));
			seconds %= 3600;
		}
		int minute = seconds/60;
		if(minute != 0 ){
			if(hour != 0 || day !=0){
				print.append(seconds % 60 > 0 ? ", " : " and ");
			}
			print.append(minute + (minute < 2 ? " minute" :  " minutes"));
			seconds %= 60;
		}
		if(seconds != 0){
			if(minute != 0 || hour !=0){
				print.append(" and ");
			}
			print.append( seconds + " " + (seconds < 2 ? "second" : "seconds"));
		}
		return print.toString();
	}
}