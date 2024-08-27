/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.PII_1_2024.modelo;

/**
 *
 * @author anton
 */
public class Turma{

    int codigoTurma;
    String nome;

    public Turma(int codigoTurma, String nome) {
        this.codigoTurma = codigoTurma;
        this.nome = nome;
    }
    public Turma(String nome) {
        this.nome = nome;
    }
    
    public Turma (int codigoTurma){
        this.codigoTurma = codigoTurma;
    }


    @Override
    public String toString() {
        return this.nome;
    }

    public int getCodigoTurma() {
        return codigoTurma;
    }

    public void setCodigoTurma(int codigoTurma) {
        this.codigoTurma = codigoTurma;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
