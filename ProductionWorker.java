public class ProductionWorker extends Employee {
	private int hours;
	private double rate;

	public ProductionWorker(String name, String num, String hire, int time, double payRate) {
		super(name, num, hire);
		hours = time;
		rate = payRate;
	}

	public ProductionWorker() {
		hours = 0;
		rate = 0;
	}

	public int getHours() {
		return hours;
	}

	public double getRate() {
		return rate;
	}

	public void setHours(int time) {
		hours = time;
	}

	public void setRate(double payRate) {
		rate = payRate;
	}
}
