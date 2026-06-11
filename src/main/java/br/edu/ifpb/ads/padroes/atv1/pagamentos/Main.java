package br.edu.ifpb.ads.padroes.atv1.pagamentos;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Iniciando Pagamentos ---\n");

        // 1. Configurando e obtendo o serviço com PayPal
        Injector paypalInjector = Guice.createInjector(new PayPalModule());
        PagamentoService servicoPayPal = paypalInjector.getInstance(PagamentoService.class);
        System.out.print("Primeiro gasto: ");
        servicoPayPal.pagar(150.00);

        System.out.println("----------------------------------------");

        // 2. Obtendo um NOVO objeto com o gateway Stripe
        Injector stripeInjector = Guice.createInjector(new StripeModule());
        PagamentoService servicoStripe = stripeInjector.getInstance(PagamentoService.class);
        System.out.print("Segundo gasto: ");
        servicoStripe.pagar(250.50);

        System.out.println("----------------------------------------");

        // 3. Obtendo outro objeto com o gateway PagSeguro
        Injector pagSeguroInjector = Guice.createInjector(new PagSeguroModule());
        PagamentoService servicoPagSeguro = pagSeguroInjector.getInstance(PagamentoService.class);
        System.out.print("Terceiro gasto: ");
        servicoPagSeguro.pagar(99.90);
    }
}