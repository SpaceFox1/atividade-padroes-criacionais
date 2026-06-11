package br.edu.ifpb.ads.padroes.atv2;

public class StripeAdapter implements PagamentoGateway {
    private final StripeSDK sdk = new StripeSDK();

    @Override
    public void processar(double valor) {
        // Stripe geralmente usa centavos
        sdk.createStripeCharge(valor * 100);
    }
}
