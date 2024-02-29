public class NextDate {
    // Method to calculate the next date
    public static String calculateNextDate(int day, int month, int year) {
        // Adjust the month lengths considering leap years
        int[] monthLengths = { 31, (isLeapYear(year) ? 29 : 28), 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        // Proceed if the date is valid
        if (day > 0 && day <= monthLengths[month - 1] && month > 0 && month <= 12) {
            day++; // Move to the next day

            // Check if the day exceeds the month's maximum days
            if (day > monthLengths[month - 1]) {
                day = 1; // Reset to the first day
                month++; // Move to the next month
                if (month > 12) { // Check if the month exceeds the year
                    month = 1; // Reset to January
                    year++; // Move to the next year
                }
            }

            // Return the next date in the specified format
            return formatNextDate(day, month, year);
        } else {
            return "Invalid Input"; // Handle invalid dates
        }
    }

    // Helper method to determine if a year is a leap year
    private static boolean isLeapYear(int year) {
        return ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);
    }

    // Helper method to format the next date
    private static String formatNextDate(int day, int month, int year) {
        return String.format("%d-%d-%d", day, month, year);
    }
}
