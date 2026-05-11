package TesteCodigo;

public class ProcessarPagamento extends Pagamento {

    public ProcessarPagamento(int boleto, int cartao, int pix) {
        super(boleto, cartao, pix);

        System.out.println("Processando Pagamento");
        System.out.println("Boleto: " + getBoleto());
        System.out.println("Cartao: " + getCartao());
        System.out.println("Pix: " + getPix());
    }
}