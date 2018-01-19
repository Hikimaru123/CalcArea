import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class CalcAreaTest {

	@Test
	public void calcTriangleTest底辺10cm_高さ5cmで25cm2() {
		double actual	= CalcArea.calcTriangleArea(10,5);
		double expected	 = 25;
		assertThat(actual,is(expected));
	}


	@Test
	public void calcCircleTes半径5cmで78_5cm2() {
		double actual	= CalcArea.calcCircleArea(5);
		double expected	 = 78.5;
		assertThat(actual,is(expected));
	}

}
