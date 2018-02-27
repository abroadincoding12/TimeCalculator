import javax.swing.JOptionPane;

public class TimeCalculator
{
	public static void main(String[] args)
	{
		double seconds; // The number of seconds
		String input;   // To hold keyboard input

		//Constants
		final double SECONDS_PER_MINUTE = 60.0; // Seconds in a minute
		final double SECONDS_PER_HOUR = 3600.0; // Seconds in a hour
		final double SECONDS_PER_DAY = 86400.0; // Seconds in a day

		// Get the number of seconds
		input = JOptionPane.showInputDialog("Enter the number of seconds ");
		seconds = Double.parseDouble(input);

		// Display the number of minutes.
		if (seconds >= SECONDS_PER_MINUTE)
		{
			// Calculate the number of minutes
			double minute = seconds / SECONDS_PER_MINUTE;

			// Display the number of minutes
			JOptionPane.showMessageDialog(null, "There are " + minute + " minutes in " + seconds + " seconds ");

		// Display the number of hours. if any.
		if (seconds >= SECONDS_PER_HOUR)
		{
			// Calculate the number of hours.
			double hours = seconds / SECONDS_PER_HOUR;

			// Display the number of hours
			JOptionPane.showMessageDialog(null, "There are " + hours + " hours in " + seconds + " seconds ");
		}

		// Display the number of days. if any.
		if (seconds >= SECONDS_PER_DAY)
		{
			// Calculate the number of days.
			double days = seconds/SECONDS_PER_DAY;

			// Display the number of days
			JOptionPane.showMessageDialog(null, "There are " + (int)days + " days in " + seconds + " seconds ");
		}

		// Exit the application
			System.exit(0);
		}
	}
}