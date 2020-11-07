package com.ecommerce.microcommerce.model;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.validator.constraints.Length;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Min;

@Entity
//@JsonFilter("monFiltreDynamique")
public class Product {
    @Id
    @GeneratedValue
    private int id;

    @Length(min=3, max=20)
    private String name;

    @Min(value = 1)
    private int prix;
    //information que nous ne souhaitons pas exposer

    private int prixAchat;

    public int getId() {
        return id;
    }

    public void setId(int id) {

        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }

    public int getPrixAchat() {
        return prixAchat;
    }

    public void setPrixAchat(int prixAchat) {
        this.prixAchat = prixAchat;
    }

    @Override
    public String toString(){
        return "Product{"+
                "id=" + id +
                ", nom='"+ name + '\'' +
                ", prix=" + prix+ '}';
    }

    public Product() {
    }

    //constructeur pour nos tests
    public Product(int id, String name, int prix, int prixAchat) {
        this.id=id;
        this.name=name;
        this.prix=prix;
        this.prixAchat = prixAchat;
    }
}
