package br.com.agencia.bilheteria.model;

public class Agencia{
    private String nome;
    private String endereco;
    private boolean estahAberta;
    
    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getEndereco(){
        return endereco;
    }

    public void setEndereco(String endereco){
        this.endereco = endereco;
    }

    public boolean getEstarAberta(){
        return estahAberta;
    }

    public void setEstahAberta(boolean estahAberta){
        this.estahAberta = estahAberta;
    }

    public boolean statusFuncionamentoAgencia(){
        //funcao a ser construida
        return true;
    }
}