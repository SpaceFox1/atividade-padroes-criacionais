package br.edu.ifpb.ads.padroes.atv1.rpg;

import java.util.Arrays;

public class Personagem implements Cloneable {

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

    public Personagem(String nome, String raca, String classe, int forca,
                      int inteligencia, int agilidade, int vida, int mana,
                      Arma arma, Armadura armadura, String[] habilidades) {
        this.nome = nome;
        this.raca = raca;
        this.classe = classe;
        this.forca = forca;
        this.inteligencia = inteligencia;
        this.agilidade = agilidade;
        this.vida = vida;
        this.mana = mana;
        this.arma = arma;
        this.armadura = armadura;
        this.habilidades = habilidades;
    }

    // Getters e Setters básicos
    public String getNome() {
        return nome;
    }

    public String getRaca() {
        return raca;
    }

    public String getClasse() {
        return classe;
    }

    public int getForca() {
        return forca;
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public int getAgilidade() {
        return agilidade;
    }

    public int getVida() {
        return vida;
    }

    public int getMana() {
        return mana;
    }

    public Arma getArma() {
        return arma;
    }

    public Armadura getArmadura() {
        return armadura;
    }

    public String[] getHabilidades() {
        return habilidades;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setArma(Arma arma) { this.arma = arma; }
    public void setArmadura(Armadura armadura) { this.armadura = armadura; }
    public void setHabilidades(String[] habilidades) { this.habilidades = habilidades; }
    public void setAtributosEspeciais(int f, int i, int a, int v, int m) {
        this.forca = f; this.inteligencia = i; this.agilidade = a; this.vida = v; this.mana = m;
    }

    @Override
    public Personagem clone() {
        try {
            Personagem clonado = (Personagem) super.clone();
            // Deep copy of objects to avoid shared state across instances
            if (this.arma != null) {
                clonado.arma = new Arma(this.arma.getNome(), this.arma.getDano(), this.arma.getTipo());
            }
            if (this.armadura != null) {
                clonado.armadura = new Armadura(this.armadura.getNome(), this.armadura.getDefesa(), this.armadura.getTipo());
            }
            if (this.habilidades != null) {
                clonado.habilidades = Arrays.copyOf(this.habilidades, this.habilidades.length);
            }
            return clonado;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError("Festa de clonagem falhou!");
        }
    }

    @Override
    public String toString() {
        return String.format("%s - %s %s (F:%d, I:%d, A:%d, V:%d, M:%d)",
                nome, raca, classe, forca, inteligencia, agilidade, vida, mana);
    }

}
