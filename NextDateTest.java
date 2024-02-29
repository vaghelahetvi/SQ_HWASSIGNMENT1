import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class NextDateTest {

    @Test
    public void testCalculateNextDate() {
        // Test Case 1: Middle of a month
        assertEquals("13-7-2023", NextDate.calculateNextDate(12, 7, 2023));

        // Test Case 2: Last day of a 30-day month
        assertEquals("1-10-2023", NextDate.calculateNextDate(30, 9, 2023));

        // Test Case 3: Day before Valentine's Day
        assertEquals("14-2-2025", NextDate.calculateNextDate(13, 2, 2025));

        // Test Case 4: Transition from November to December
        assertEquals("1-12-2024", NextDate.calculateNextDate(30, 11, 2024));

        // Test Case 5: Leap year, day before leap day
        assertEquals("29-2-2028", NextDate.calculateNextDate(28, 2, 2028));

        // Test Case 6: Day after leap day in a leap year
        assertEquals("1-3-2028", NextDate.calculateNextDate(29, 2, 2028));

        // Test Case 7: End of a leap year
        assertEquals("1-1-2029", NextDate.calculateNextDate(31, 12, 2028));

        // Test Case 8: First day of the year
        assertEquals("2-1-2027", NextDate.calculateNextDate(1, 1, 2027));

        // Test Case 9: Transition from July to August
        assertEquals("1-8-2026", NextDate.calculateNextDate(31, 7, 2026));

        // Test Case 10: Random regular day increment
        assertEquals("23-4-2022", NextDate.calculateNextDate(22, 4, 2022));
    }
}
