
public class ConexionCerrada extends EstadoConexion {

	@Override
	public void abrir(Conexion conexion) {
		conexion.setEstadoConexion(new ConexionAbierta());

	}

	@Override
	public void cerrar(Conexion conexion) {
		
		throw new ConexionCerradaException("La Conexion se ecuentra Cerrada");

	}

}
