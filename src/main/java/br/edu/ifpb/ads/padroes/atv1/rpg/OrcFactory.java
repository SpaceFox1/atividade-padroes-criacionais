package br.edu.ifpb.ads.padroes.atv1.rpg;

public class OrcFactory implements PersonagemAbstractFactory {
    @Override
    public void moldarGuerreiro(PersonagemBuilder builder) {
        builder.setAtributos(20, 6, 8, 150, 20)
                .setEquipamentos(new Arma("Machado de Guerra", 30, "Machado"), new Armadura("Armadura Brutal", 25, "Pesada"))
                .setHabilidades(new String[]{"Fúria", "Pancada Devastadora"});
    }

    @Override
    public void moldarMago(PersonagemBuilder builder) {
        builder.setAtributos(10, 14, 6, 100, 120)
                .setEquipamentos(new Arma("Cajado Tribal", 12, "Cajado"), new Armadura("Vestes Xamânicas", 6, "Leve"))
                .setHabilidades(new String[]{"Magia Sombria", "Invocação"});
    }

    @Override
    public void moldarArqueiro(PersonagemBuilder builder) {
        builder.setAtributos(14, 8, 12, 120, 40)
                .setEquipamentos(new Arma("Arco de Osso", 24, "Arco"), new Armadura("Couro de Besta", 16, "Média"))
                .setHabilidades(new String[]{"Tiro Brutal", "Intimidação"});
    }
}