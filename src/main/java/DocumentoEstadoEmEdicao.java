public class DocumentoEstadoEmEdicao implements DocumentoEstado {

	private DocumentoEstadoEmEdicao() {};
	private static DocumentoEstadoEmEdicao instance = new DocumentoEstadoEmEdicao();

	public static DocumentoEstadoEmEdicao getInstance() {
		return instance;
	}

	public String getNomeEstado() {
		return "Em Edição";
	}
}