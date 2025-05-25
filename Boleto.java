public class Boleto extends Pagamento {

    @Override
    public void processar(double valor) {
        // R$ 7,00 de tarifa em cima do processamento
        int tarifa = 7;
        System.out.println("Pagamento via Boleto: " + (valor - tarifa));
    }
}
