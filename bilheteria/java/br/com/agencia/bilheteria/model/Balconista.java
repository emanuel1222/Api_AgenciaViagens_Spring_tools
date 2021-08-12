package br.com.agencia.bilheteria.model;

public class Balconista extends Pessoa{

    private double salario;
    private boolean deFerias;

    public void setSalario(double salario){
        this.salario = salario;
    }

    public double getSalario(){
        return salario;
    }

    public void setDeFerias(boolean deFerias){
        this.deFerias = deFerias;
    }

    public boolean getDeFerias(){
        return deFerias;
    }

}