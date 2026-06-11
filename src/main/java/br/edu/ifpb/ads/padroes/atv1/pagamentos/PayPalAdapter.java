package br.edu.ifpb.ads.padroes.atv1.pagamentos;

public class PayPalAdapter implements PagamentoGateway {
    private final PayPalSDK sdk = new PayPalSDK();

    @Override
    public void processar(double valor) {
        sdk.enviarPagamentoPayPal(valor);
    }
}

