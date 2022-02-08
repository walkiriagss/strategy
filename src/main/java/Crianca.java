public class Crianca {

    private String brinquedo;

    public String getBrinquedo() {
        return brinquedo;
    }

    public void brincarCarrinho() {
        Brincadeira brincadeira = new Brincadeira();
        this.brinquedo = brincadeira.brincar(new Carrinho());
    }
    public void brincarBoneca() {
        Brincadeira brincadeira = new Brincadeira();
        this.brinquedo = brincadeira.brincar(new Boneca());
    }

    public void brincarLego() {
        Brincadeira brincadeira = new Brincadeira();
        this.brinquedo = brincadeira.brincar(new Lego());
    }

    public void brincarBola() {
        Brincadeira brincadeira = new Brincadeira();
        this.brinquedo = brincadeira.brincar(new Bola());
    }
    public void brincarPelucia() {
        Brincadeira brincadeira = new Brincadeira();
        this.brinquedo = brincadeira.brincar(new Pelucia());
    }
}
