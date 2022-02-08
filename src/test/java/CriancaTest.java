import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CriancaTest {

    @Test
    void deveRetornarBrinquedoCarrinho() {
        Crianca crianca = new Crianca();
        crianca.brincarCarrinho();
        assertEquals("Brincar de Carrinho", crianca.getBrinquedo());
    }

    @Test
    void deveRetornarBrinquedoBoneca() {
        Crianca crianca = new Crianca();
        crianca.brincarBoneca();
        assertEquals("Brincar de Boneca", crianca.getBrinquedo());
    }

    @Test
    void deveRetornarBrinquedoLego() {
        Crianca crianca = new Crianca();
        crianca.brincarLego();
        assertEquals("Brincar de Lego", crianca.getBrinquedo());
    }

    @Test
    void deveRetornarBrinquedoBola() {
        Crianca crianca = new Crianca();
        crianca.brincarBola();
        assertEquals("Brincar de Bola", crianca.getBrinquedo());
    }

    @Test
    void deveRetornarBrinquedoPelucia() {
        Crianca crianca = new Crianca();
        crianca.brincarPelucia();
        assertEquals("Brincar de Pelúcia ", crianca.getBrinquedo());
    }
}