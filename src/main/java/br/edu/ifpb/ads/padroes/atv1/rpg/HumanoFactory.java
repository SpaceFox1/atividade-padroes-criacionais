package br.edu.ifpb.ads.padroes.atv1.rpg;

public class HumanoFactory implements PersonagemAbstractFactory {
    @Override
    public void moldarGuerreiro(PersonagemBuilder builder) {
        builder.setAtributos(15, 8, 10, 120, 30)
                .setEquipamentos(new Arma("Espada de Ferro", 25, "Espada"), new Armadura("Armadura de Placas", 20, "Pesada"))
                .setHabilidades(new String[]{"Investida", "Bloqueio"});
    }

    @Override
    public void moldarMago(PersonagemBuilder builder) {
        builder.setAtributos(6, 18, 8, 80, 150)
                .setEquipamentos(new Arma("Cajado Mágico", 15, "Cajado"), new Armadura("Vestes Mágicas", 8, "Leve"))
                .setHabilidades(new String[]{"Bola de Fogo", "Cura"});
    }

    @Override
    public void moldarArqueiro(PersonagemBuilder builder) {
        builder.setAtributos(10, 12, 16, 100, 70)
                .setEquipamentos(new Arma("Arco Élfico", 20, "Arco"), new Armadura("Armadura de Couro", 12, "Média"))
                .setHabilidades(new String[]{"Tiro Certeiro", "Chuva de Flechas"});
    }
}