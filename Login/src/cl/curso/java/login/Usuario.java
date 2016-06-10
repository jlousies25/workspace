
package cl.curso.java.login;


public class Usuario {

	private String usuario;
	private String password;
	private int intentosFallidos;

	public Usuario() {
	}


	public Usuario(String usuario, String password, int intentosFallidos) {
		super();
		this.usuario = usuario;
		this.password = password;
		this.intentosFallidos = intentosFallidos;
	}

	public String getUsuario() {
		return usuario;
	}


	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	
	public String getPassword() {
		return password;
	}

	
	public void setPassword(String password) {
		this.password = password;
	}


	public int getIntentosFallidos() {
		return intentosFallidos;
	}

	/**
	 * @param intentosFallidos
	 *            the intentosFallidos to set
	 */
	public void setIntentosFallidos(int intentosFallidos) {
		this.intentosFallidos = intentosFallidos;
	}

	/**
	 * 
	 * @throws AutenticacionException
	 * @throws CuentaBloqueadaException
	 */
	public void login() throws AutenticacionException, CuentaBloqueadaException {
		final String USER = "jmaldonado";
		final String PASS = "1234567890";

		if (this.getIntentosFallidos() >= 3) {
			throw new CuentaBloqueadaException("La cuenta ha sido bloqueada");
		}
		if (!(this.getUsuario().equals(USER) && this.getPassword().equals(PASS))) {
			this.intentosFallidos++;
			throw new AutenticacionException("Usuario y/o Pass incorrectos");
		}

	}
}
