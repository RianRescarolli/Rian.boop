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

public class Estudante {
    Estudante estudante = new Estudante();
    private String CPF;
    private String Nome;
    private Date DataNascimento;
    private char Genero;
    private String Email;
    private String NivelEnsino;
    private String Telefone;
    private int NumeroMatricula;
    private int AnosEgresso;
    private int SemestreIngresso;
    private String SituacaoAcademica;
       public String nivel(){
       int c=0;
       //interaçao com usuario
       return SituacaoAcademica;
    }

    public Estudante() {
        this.Nome = "Nobody";
    }

    public int obterIdade(Date hoje) {
        int idade = 0;
        // calcular idade
        return idade;
    }

    public String getNome() {
        obterIdade(new Date());
        return this.Nome;
    }

    public void setNome(String nome) {
        this.Nome = nome;
    }
   
    public int getanoEgresso(){
        return AnosEgresso;
    }
    
    public void setAnoEgresso(int anoEgresso){
        this.AnosEgresso = AnosEgresso;
    }
   
    public int setsemestreIngresso(){
        return this.SemestreIngresso;
    }
    
    public void setsemestreIngresso(int Semestre){
       this.SemestreIngresso=Semestre;
   }
    public int codigomatricula(){
        String.valueOf(AnosEgresso) + String.valueOf(SemestreIngresso);
        return NumeroMatricula;
    }

    private void obteranoEgresso(Date date) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
