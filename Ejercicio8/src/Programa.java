
public class Programa {

	public static void main(String[] args) {
		
		Asiento[] asientos = {new Asiento (), new Asiento(), new Asiento()};
		Bus bus = new Bus ( "k1000-O", asientos);
		ReservaThread hilo1 = new ReservaThread(bus, 2);
		ReservaThread hilo2 = new ReservaThread(bus, 2);
		
		hilo1.start();
		hilo2.start();
		bus.reservarAsiento(2);
		
	}

}
