package br.edu.ifpb.ads.padroes.atv1.pagamentos;

public class PagSeguroAdapter implements PagamentoGateway {
    private final PagSeguroSDK sdk = new PagSeguroSDK();

    @Override
    public void processar(double valor) {
        sdk.executarTransacaoPagSeguro(valor);
    }
}
