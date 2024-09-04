public class DocumentoEstadoAprovado implements DocumentoEstado {

	private DocumentoEstadoAprovado() {};
	private static DocumentoEstadoAprovado instance = new DocumentoEstadoAprovado();

	public static DocumentoEstadoAprovado getInstance() {
		return instance;
	}

	public String getNomeEstado() {
		return "Aprovado";
	}
}
