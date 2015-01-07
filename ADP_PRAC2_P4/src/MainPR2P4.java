public class MainPR2P4 {

	public static void main(String[] args) {
		CityBusLine b49 = new CityBusLine("BCN49");
		b49.setKmsAnada(11f);
		b49.setKmsTornada(10.5f);
		Tupla t49 = b49.busLineData();

		InterCityBusLine b32 = new InterCityBusLine("BCN32");
		b32.setKmsAnada(25.6f);
		b32.setKmsTornada(28.8f);
		b32.addCity("Santa Coloma", 12000);
		b32.addCity("Cerdanyola", 57000);
		b32.addCity("Barberà", 32500);
		b32.addCity("Sabadell", 207000);
		Tupla t32 = b32.busLineData();

		System.out.println("Linea Urbana BCN49: Total Kms=" + t49.x + "  - -  Total Ciudades=" + t49.y);

		System.out.println("Linea InterUrbana BCN32: Total Kms=" + t32.x + "  - -  Total Ciudades=" + t32.y);
	}
}
