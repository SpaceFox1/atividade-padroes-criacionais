package br.edu.ifpb.ads.padroes.atv1.rpg;

public class ElfoFactory implements PersonagemAbstractFactory {
    @Override
    public void moldarGuerreiro(PersonagemBuilder builder) {
        builder.setAtributos(12, 14, 16, 100, 60)
                .setEquipamentos(new Arma("Lâmina Élfica", 22, "Espada"), new Armadura("Cota de Malha Élfica", 15, "Média"))
                .setHabilidades(new String[]{"Dança das Lâminas", "Agilidade Élfica"});
    }

    @Override
    public void moldarMago(PersonagemBuilder builder) {
        builder.setAtributos(4, 20, 14, 70, 180)
                .setEquipamentos(new Arma("Cajado da Natureza", 18, "Cajado"), new Armadura("Mantos Élficos", 10, "Leve"))
                .setHabilidades(new String[]{"Magia da Natureza", "Teleporte"});
    }

    @Override
    public void moldarArqueiro(PersonagemBuilder builder) {
        builder.setAtributos(8, 16, 20, 90, 100)
                .setEquipamentos(new Arma("Arco Longo Élfico", 28, "Arco"), new Armadura("Armadura de Couro Élfico", 14, "Média"))
                .setHabilidades(new String[]{"Tiro Múltiplo", "Camuflagem"});
    }
}