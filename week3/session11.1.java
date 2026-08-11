import java.io.*;
class Result {
public static String findDay(int month, int day, int year) {
    Calendar cal = Calendar.getInstance();
    cal.set(year, month - 1, day);

    return cal.getDisplayName(
        Calendar.DAY_OF_WEEK,
        Calendar.LONG,
        Locale.ENGLISH
    ).toUpperCase();
}
Input (stdin)
08 05 2015
Your Output (stdout)
WEDNESDAY
Expected Output
WEDNESDAY