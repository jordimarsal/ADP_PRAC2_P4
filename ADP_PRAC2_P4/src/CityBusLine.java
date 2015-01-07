public class CityBusLine extends BusLine {

	public CityBusLine(String name) {
		super(name);
	}

	@Override
	protected void getNumberCities() {
		totalCities = 1;
	}
}
