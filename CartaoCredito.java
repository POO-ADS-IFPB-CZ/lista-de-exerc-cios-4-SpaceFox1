public class CartaoCredito extends Pagamento {
    @Override
    public void processar(double valor) {
        float taxa = 0.15f;
        System.out.printf("Pagamento via Cartão de credito: R$ %.2f\n", valor - (valor * taxa));
    }
}
