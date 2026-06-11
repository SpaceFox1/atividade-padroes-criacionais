package br.edu.ifpb.ads.padroes.atv1.pagamentos;

import com.google.inject.AbstractModule;

public class StripeModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(PagamentoGateway.class).to(StripeAdapter.class);
    }
}
