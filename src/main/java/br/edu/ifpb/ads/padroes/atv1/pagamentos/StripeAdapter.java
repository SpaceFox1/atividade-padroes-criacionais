package br.edu.ifpb.ads.padroes.atv1.pagamentos;

public class StripeAdapter implements PagamentoGateway {
    private final StripeSDK sdk = new StripeSDK();

    @Override
    public void processar(double valor) {
        // Stripe geralmente usa centavos
        sdk.createStripeCharge(valor * 100);
    }
}
