
public class ConexionAbierta extends EstadoConexion {

	@Override
	public void abrir(Conexion conexion) {
		throw new ConexionAbiertaException("Conexion ya esta abierta)");

	}

	@Override
	public void cerrar(Conexion conexion) {
		conexion.setEstadoConexion(new ConexionCerrada());

	}

}
