package br.edu.ifpb.ads.padroes.atv2;

public class PayPalAdapter implements PagamentoGateway {
    private final PayPalSDK sdk = new PayPalSDK();

    @Override
    public void processar(double valor) {
        sdk.enviarPagamentoPayPal(valor);
    }
}

