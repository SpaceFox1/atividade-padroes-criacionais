package br.edu.ifpb.ads.padroes.atv2;

public class StripeSDK {
    public void createStripeCharge(double amountInCents) {
        System.out.println("[Stripe SDK] Cobrando R$ " + (amountInCents / 100) + " do crédito.");
    }
}
