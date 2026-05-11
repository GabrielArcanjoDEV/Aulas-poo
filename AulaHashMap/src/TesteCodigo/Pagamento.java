package TesteCodigo;

public class Pagamento {
    private int boleto;
    private int cartao;
    private int pix;

    public Pagamento(int boleto, int cartao, int pix) {
        this.boleto = boleto;
        this.cartao = cartao;
        this.pix = pix;
    }

    public int getBoleto() {
        return boleto;
    }

    public int getCartao() {
        return cartao;
    }

    public int getPix() {
        return pix;
    }

    public void setBoleto(int boleto) {
        this.boleto = boleto;
    }

    public void setCartao(int cartao) {
        this.cartao = cartao;
    }

    public void setPix(int pix) {
        this.pix = pix;
    }

    @Override
    public String toString() {
        return "Pagamento{" +
                "boleto=" + boleto +
                ", cartao=" + cartao +
                ", pix=" + pix +
                '}';
    }
}