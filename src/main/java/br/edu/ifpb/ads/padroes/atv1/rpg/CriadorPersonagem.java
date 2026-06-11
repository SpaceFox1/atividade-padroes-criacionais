package br.edu.ifpb.ads.padroes.atv1.rpg;

import java.util.HashMap;
import java.util.Map;

public class CriadorPersonagem {

    private static final Map<String, Personagem> cachePrototipos = new HashMap<>();

    public static PersonagemAbstractFactory obterFactory(String raca) {
        if (raca.equalsIgnoreCase("Humano")) return new HumanoFactory();
        if (raca.equalsIgnoreCase("Elfo")) return new ElfoFactory();
        if (raca.equalsIgnoreCase("Orc")) return new OrcFactory();
        return null;
    }

    public static Personagem criarPersonagem(String nome, String raca, String classe) {
        PersonagemAbstractFactory factory = obterFactory(raca);
        if (factory == null) {
            System.out.println("Raça desconhecida no território: " + raca);
            return null;
        }

        PersonagemBuilder builder = new PersonagemBuilder()
                .setNome(nome)
                .setRaca(raca)
                .setClasse(classe);

        // Map class selection dynamically
        if (classe.equalsIgnoreCase("Guerreiro")) factory.moldarGuerreiro(builder);
        else if (classe.equalsIgnoreCase("Mago")) factory.moldarMago(builder);
        else if (classe.equalsIgnoreCase("Arqueiro")) factory.moldarArqueiro(builder);
        else {
            System.out.println("Classe não reconhecida pela matilha: " + classe);
            return null;
        }

        return builder.build();
    }

    // Handles special/legendary characters utilizing our Prototype cloning mechanism
    public static Personagem criarPersonagemEspecial(String nome, String raca, String classe) {
        String chaveCache = raca + "_" + classe;

        // Populate our clone den if empty
        if (!cachePrototipos.containsKey(chaveCache)) {
            Personagem base = criarPersonagem("Base_" + chaveCache, raca, classe);
            if (base != null) {
                cachePrototipos.put(chaveCache, base);
            }
        }

        Personagem prototipoBase = cachePrototipos.get(chaveCache);
        if (prototipoBase == null) return null;

        // --- PROTOTYPE AT WORK ---
        // Instantly duplicate the base model instead of calculating stats from scratch
        Personagem heroiEspecial = prototipoBase.clone();
        heroiEspecial.setNome(nome);

        // Customize the specific Legendary Human Warrior mutant
        if (raca.equalsIgnoreCase("Humano") && classe.equalsIgnoreCase("Guerreiro")) {
            heroiEspecial.setNome(nome + " o Lendário");
            heroiEspecial.setAtributosEspeciais(18, 10, 12, 140, 40);
            heroiEspecial.setArma(new Arma("Excalibur", 35, "Espada"));
            heroiEspecial.setArmadura(new Armadura("Armadura do Rei", 30, "Pesada"));
            heroiEspecial.setHabilidades(new String[]{"Investida", "Bloqueio", "Liderança"});
        }

        return heroiEspecial;
    }
}
