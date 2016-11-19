package mock;

import objects.Hotel;

public class MockHotel36 extends Hotel {
	double lowscore;
	double highscore;
	public MockHotel36(double lowscore, double highscore) {
		this.lowscore = lowscore;
		this.highscore = highscore;
	}
	public double getLowscore() {
		return lowscore;
	}
	public double getHighscore() {
		return highscore;
	}

}
