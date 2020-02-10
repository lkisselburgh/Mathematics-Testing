package Mathematics;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SlopeOfALineTest {
	@Test
	public void test1() {
		Count test1 = new SlopeOfALine();
		double slope = test1.slope(0,0,1,1);
		assertEquals(1, slope);
	}
}