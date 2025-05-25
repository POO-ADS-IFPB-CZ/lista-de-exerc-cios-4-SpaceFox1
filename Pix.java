public class Pix extends Pagamento {
    @Override
    public void processar(double valor) {
        System.out.println("Pagamento via PIX: " + valor);
    }
}
