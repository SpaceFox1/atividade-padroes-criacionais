package br.edu.ifpb.ads.padroes.atv2;

public class PagSeguroAdapter implements PagamentoGateway {
    private final PagSeguroSDK sdk = new PagSeguroSDK();

    @Override
    public void processar(double valor) {
        sdk.executarTransacaoPagSeguro(valor);
    }
}
