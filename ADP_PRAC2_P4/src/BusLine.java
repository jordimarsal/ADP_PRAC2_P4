public abstract class BusLine {

	private Route[] routes;

	private String name;
	private String comments;

	protected int totalKms;
	protected int totalCities;

	public BusLine(String name) {
		this.name = name;
		routes = new Route[2];
		routes[0] = new Route(name + " ANADA");
		routes[1] = new Route(name + " TORNADA");
	}

	public void setKmsAnada(float kms) {
		routes[0].setKms(kms);
	}

	public void setKmsTornada(float kms) {
		routes[1].setKms(kms);
	}

	public Tupla busLineData() {
		Tupla ret = null;
		calcTotalKms();
		getNumberCities();
		ret = new Tupla(totalKms, totalCities);
		return ret;
	}

	abstract protected void getNumberCities();

	private void calcTotalKms() {
		totalKms += routes[0].getTotalKms();
		totalKms += routes[1].getTotalKms();
	}
}
