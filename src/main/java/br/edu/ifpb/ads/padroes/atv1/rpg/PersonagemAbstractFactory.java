package br.edu.ifpb.ads.padroes.atv1.rpg;

// Abstract Factory contract
public interface PersonagemAbstractFactory {
    void moldarGuerreiro(PersonagemBuilder builder);
    void moldarMago(PersonagemBuilder builder);
    void moldarArqueiro(PersonagemBuilder builder);
}