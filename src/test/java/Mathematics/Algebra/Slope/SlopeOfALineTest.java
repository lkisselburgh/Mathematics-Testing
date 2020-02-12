package Mathematics.Algebra.Slope;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SlopeOfALineTest {
	@Test
	public void test1() {
		SlopeOfALine test = new SlopeOfALine();
		double slope = test.slope(0,0,1,1);
		assertEquals(1, slope);
	}
	@Test
	public void test2() {
		SlopeOfALine test = new SlopeOfALine();
		double slope = test.slope(0,0,1,1);
		assertEquals(-1, slope);
	}
}