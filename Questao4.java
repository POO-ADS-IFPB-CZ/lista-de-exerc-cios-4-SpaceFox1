public class Questao4 {
    public static void main(String[] args) {
        Pagamento formaDePagamento = new Boleto();
        formaDePagamento.processar(15);

        formaDePagamento = new Pix();
        formaDePagamento.processar(15);

        formaDePagamento = new CartaoCredito();
        formaDePagamento.processar(15);
    }
}
