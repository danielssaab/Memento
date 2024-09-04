public class DocumentoEstadoPublicado implements DocumentoEstado {

	private DocumentoEstadoPublicado() {};
	private static DocumentoEstadoPublicado instance = new DocumentoEstadoPublicado();

	public static DocumentoEstadoPublicado getInstance() {
		return instance;
	}

	public String getNomeEstado() {
		return "Publicado";
	}
}