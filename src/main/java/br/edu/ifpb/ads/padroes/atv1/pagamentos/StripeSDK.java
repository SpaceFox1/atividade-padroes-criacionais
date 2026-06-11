package br.edu.ifpb.ads.padroes.atv1.pagamentos;

public class StripeSDK {
    public void createStripeCharge(double amountInCents) {
        System.out.println("[Stripe SDK] Cobrando R$ " + (amountInCents / 100) + " do crédito.");
    }
}
