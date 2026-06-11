package br.edu.ifpb.ads.padroes.atv1.rpg;

public class PersonagemBuilder {
    private String nome;
    private String raca;
    private String classe;
    private int forca;
    private int inteligencia;
    private int agilidade;
    private int vida;
    private int mana;
    private Arma arma;
    private Armadura armadura;
    private String[] habilidades;

    public PersonagemBuilder setNome(String nome) { this.nome = nome; return this; }
    public PersonagemBuilder setRaca(String raca) { this.raca = raca; return this; }
    public PersonagemBuilder setClasse(String classe) { this.classe = classe; return this; }

    public PersonagemBuilder setAtributos(int forca, int inteligencia, int agilidade, int vida, int mana) {
        this.forca = forca;
        this.inteligencia = inteligencia;
        this.agilidade = agilidade;
        this.vida = vida;
        this.mana = mana;
        return this;
    }

    public PersonagemBuilder setEquipamentos(Arma arma, Armadura armadura) {
        this.arma = arma;
        this.armadura = armadura;
        return this;
    }

    public PersonagemBuilder setHabilidades(String[] habilidades) {
        this.habilidades = habilidades;
        return this;
    }

    public Personagem build() {
        return new Personagem(nome, raca, classe, forca, inteligencia, agilidade, vida, mana, arma, armadura, habilidades);
    }
}