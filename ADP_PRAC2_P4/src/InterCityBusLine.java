import java.util.ArrayList;

public class InterCityBusLine extends BusLine {

	ArrayList<City> cities;

	public InterCityBusLine(String name) {
		super(name);
		cities = new ArrayList<City>();
	}

	public void addCity(String name, int population) {
		cities.add(new City(name, population));
	}

	@Override
	protected void getNumberCities() {
		totalCities = cities.size();
	}

}
