public class DocumentoEstadoRevisao implements DocumentoEstado {

	private DocumentoEstadoRevisao() {};
	private static DocumentoEstadoRevisao instance = new DocumentoEstadoRevisao();

	public static DocumentoEstadoRevisao getInstance() {
		return instance;
	}

	public String getNomeEstado() {
		return "Revisão";
	}
}