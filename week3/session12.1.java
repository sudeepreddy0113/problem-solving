import java.time.LocalDate;

class Solution {
    public int dayOfYear(String date) {
        return LocalDate.parse(date).getDayOfYear();
    }
}
Output
9
Expected
9