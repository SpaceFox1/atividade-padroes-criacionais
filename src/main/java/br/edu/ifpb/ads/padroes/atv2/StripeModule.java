package br.edu.ifpb.ads.padroes.atv2;

import com.google.inject.AbstractModule;

public class StripeModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(PagamentoGateway.class).to(StripeAdapter.class);
    }
}
