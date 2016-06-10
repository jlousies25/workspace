package cl.curso.java.abstract_factory;

public class MsWindowsWidgetFactory implements AbstractWidgetFactory {

	public Window createWindow() {
		return new MacOSWindow();
	}

}
