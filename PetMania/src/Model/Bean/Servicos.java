/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Bean;

/**
 *
 * @author Aline
 */
public class Servicos {


    private int id;
    private String nome,especie,altura,servico,sexo,animal,obs;
    private double valorserv;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
     
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getServico() {
        return servico;
    }

    public void setServico(String servico) {
        this.servico = servico;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getAnimal() {
        return animal;
    }

    public void setAnimal(String animal) {
        this.animal = animal;
    }


    public double getValorserv() {
        return valorserv;
    }

    public void setValorserv(double valorserv) {
        this.valorserv = valorserv;
    }
    
    
    
}
