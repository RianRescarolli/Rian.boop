/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ifc.rianrescarolli;
import java.util.Date;
/**
 *
 * @author aluno
 */

import java.util.ArrayList;
import java.util.List;

public class Professor {

    private String nomeCompleto;
    private String siape;
    private String email;
    private String telefone;
    private String titulacao;
    private String areaAtuacao;
    private String regimeTrabalho;
    private String dataIngresso;

    // Lista de formações
    private List<String> formacoes;

    // Construtor
    public Professor(String nomeCompleto, String siape, String email, String telefone,
                     String titulacao, String areaAtuacao, String regimeTrabalho, String dataIngresso) {
        this.nomeCompleto = nomeCompleto;
        this.siape = siape;
        this.email = email;
        this.telefone = telefone;
        this.titulacao = titulacao;
        this.areaAtuacao = areaAtuacao;
        this.regimeTrabalho = regimeTrabalho;
        this.dataIngresso = dataIngresso;
        this.formacoes = new ArrayList<>();
    }

    // Método para adicionar formação
    public void adicionarFormacao(String formacao) {
        formacoes.add(formacao);
    }

    // Método para exibir dados
    public void exibirDados() {
        System.out.println("Nome: " + nomeCompleto);
        System.out.println("SIAPE: " + siape);
        System.out.println("Email: " + email);
        System.out.println("Telefone: " + telefone);
        System.out.println("Titulação: " + titulacao);
        System.out.println("Área de Atuação: " + areaAtuacao);
        System.out.println("Regime de Trabalho: " + regimeTrabalho);
        System.out.println("Data de Ingresso: " + dataIngresso);

        System.out.println("Formações:");
        for (String f : formacoes) {
            System.out.println("- " + f);
        }
    }

    // Getters e Setters (exemplo de alguns)

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getSiape() {
        return siape;
    }

    public void setSiape(String siape) {
        this.siape = siape;
    }
}

