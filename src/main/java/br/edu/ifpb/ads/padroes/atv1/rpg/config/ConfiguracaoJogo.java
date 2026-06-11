package br.edu.ifpb.ads.padroes.atv1.rpg.config;

public class ConfiguracaoJogo {
    private static ConfiguracaoJogo instance;
    private int nivelDificuldade;

    public static synchronized ConfiguracaoJogo getInstance() {
        if (instance == null) {
            instance = new ConfiguracaoJogo();
        }
        return instance;
    }

    public ConfiguracaoJogo() {
        this.nivelDificuldade = 1;
    }

    public int getNivelDificuldade() {
        return nivelDificuldade;
    }

    public void setNivelDificuldade(int nivel) {
        this.nivelDificuldade = nivel;
    }

}
