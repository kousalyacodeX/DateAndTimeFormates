package new_javaAdvance;
import java.time.*;
import java.time.format.DateTimeFormatter;
public class TimeDateExample {
	 public static void main(String[] args) {
		        // Get the current date
		        LocalDate currentDate = LocalDate.now();
		        System.out.println("Current Date: " + currentDate);

		        // Get the current time
		        LocalTime currentTime = LocalTime.now();
		        System.out.println("Current Time: " + currentTime);

		        // Get the current date and time
		        LocalDateTime currentDateTime = LocalDateTime.now();
		        System.out.println("Current Date and Time: " + currentDateTime);

		        // Create a specific date
		        LocalDate specificDate = LocalDate.of(2024, Month.APRIL, 24);
		        System.out.println("Specific Date: " + specificDate);

		        // Create a specific time
		        LocalTime specificTime = LocalTime.of(12, 30, 15);
		        System.out.println("Specific Time: " + specificTime);

		        // Create a specific date and time
		        LocalDateTime specificDateTime = LocalDateTime.of(2024, Month.APRIL, 24, 12, 30, 15);
		        System.out.println("Specific Date and Time: " + specificDateTime);

		        // Format a date using a custom pattern
		        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		        String formattedDateTime = currentDateTime.format(formatter);
		        System.out.println("Formatted Date and Time: " + formattedDateTime);

		        // Manipulate date and time objects
		        LocalDateTime futureDateTime = currentDateTime.plusDays(7).plusHours(3);
		        System.out.println("Future Date and Time: " + futureDateTime);

		        // Get local time in a different time zone
		        ZoneId newYorkZone = ZoneId.of("America/New_York");
		        LocalTime newYorkTime = LocalTime.now(newYorkZone);
		        System.out.println("Current Time in New York: " + newYorkTime);

		        // Get the duration between two times
		        Duration duration = Duration.between(currentTime, newYorkTime);
		        System.out.println("Duration between current time and New York time: " + duration);
		    }
		}


		
