package br.com.agencia.bilheteria.model;

public class Bilhete{

    private String numBilhete;
    private String itinerario;
    private String data;
    private double valor;
    
    public String getNumBilhete(){
        return numBilhete;
    }

    public void setNumBilhete(String numBilhete){
        this.numBilhete = numBilhete;
    }

    public String getItinerario(){
        return itinerario;
    }

    public void setItinerario(String itinerario){
        this.itinerario = itinerario;
    }

    public String getData(){
        return data;
    }

    public void setData(String data){
        this.data = data;
    }

    public double getValor(){
        return valor;
    }

    public void setValor(double valor){
        this.valor = valor;
    }

    public Bilhete registrarBilhete(){
        Bilhete bilhete = new Bilhete();
        //funcao a ser construida
        return bilhete;
    }



}