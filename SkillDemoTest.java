import static org.junit.Assert.*;
import org.junit.*;

public class SkillDemoTest {
    @Test
    public void substraction() {
        assertEquals(1, SkillDemo.subtract(3, 1)); //bad test that fails
    }
}
