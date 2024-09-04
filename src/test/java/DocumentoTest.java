import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DocumentoTest {

	@Test
	void deveArmazenarEstados() {
		Documento documento = new Documento();
		documento.setEstado(DocumentoEstadoEmEdicao.getInstance());
		documento.setEstado(DocumentoEstadoRevisao.getInstance());
		assertEquals(2, documento.getEstados().size());
	}

	@Test
	void deveRetornarEstadoInicial() {
		Documento documento = new Documento();
		documento.setEstado(DocumentoEstadoEmEdicao.getInstance());
		documento.setEstado(DocumentoEstadoRevisao.getInstance());
		documento.restauraEstado(0);
		assertEquals(DocumentoEstadoEmEdicao.getInstance(), documento.getEstado());
	}

	@Test
	void deveRetornarEstadoAnterior() {
		Documento documento = new Documento();
		documento.setEstado(DocumentoEstadoEmEdicao.getInstance());
		documento.setEstado(DocumentoEstadoAprovado.getInstance());
		documento.setEstado(DocumentoEstadoEmEdicao.getInstance());
		documento.setEstado(DocumentoEstadoPublicado.getInstance());
		documento.restauraEstado(2);
		assertEquals(DocumentoEstadoEmEdicao.getInstance(), documento.getEstado());
	}

	@Test
	void deveRetornarExcecaoIndiceInvalido() {
		try {
			Documento documento = new Documento();
			documento.restauraEstado(0);
			fail();
		} catch (IllegalArgumentException e) {
			assertEquals("Índice inválido", e.getMessage());
		}
	}
}