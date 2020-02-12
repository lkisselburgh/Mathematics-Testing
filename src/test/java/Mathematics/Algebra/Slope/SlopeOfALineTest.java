package Mathematics.Algebra.Slope;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SlopeOfALineTest {

	@Test
	public void test1() { //true
		SlopeOfALine test = new SlopeOfALine();
		double slope = test.slope(0,0,1,1);
		assertEquals(1, 1);
	}

	@Test
	public void test2() { //fail
		SlopeOfALine test = new SlopeOfALine();
		double slope = test.slope(0,0,1,1);
		assertEquals(-1, -1);
	}
}