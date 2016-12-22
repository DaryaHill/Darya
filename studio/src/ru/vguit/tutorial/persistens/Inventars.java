/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.vguit.tutorial.persistens;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="Inventars")
public class Inventars implements Serializable {
    private static final long serialVersionUID = 1L;
    
        @Id @GeneratedValue
        private long id;
        
       @Column (name="Code_inventar")
private String Code_inventar;
@Column (name="Name")
private String Name;
@Column (name="Price")
private int Price;
@Column (name="Code_provider")
private String Code_provider ;
@Column (name="Number_project")
private int Number_project;
@Column (name="Quantum")
private int Quantum;

    public Inventars(String Code_inventar, String Name, int Price, String Code_provider, int Number_project, int Quantum) {
        this.Code_inventar = Code_inventar;
        this.Name = Name;
        this.Price = Price;
        this.Code_provider = Code_provider;
        this.Number_project = Number_project;
        this.Quantum = Quantum;
    }

    public Inventars() {
    }

    public long getId() {
        return id;
    }

    public String getCode_inventar() {
        return Code_inventar;
    }

    public String getName() {
        return Name;
    }

    public int getPrice() {
        return Price;
    }

    public String getCode_provider() {
        return Code_provider;
    }

    public int getNumber_project() {
        return Number_project;
    }

    public int getQuantum() {
        return Quantum;
    }

    public void setCode_inventar(String Code_inventar) {
        this.Code_inventar = Code_inventar;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setPrice(int Price) {
        this.Price = Price;
    }

    public void setCode_provider(String Code_provider) {
        this.Code_provider = Code_provider;
    }

    public void setNumber_project(int Number_project) {
        this.Number_project = Number_project;
    }

    public void setQuantum(int Quantum) {
        this.Quantum = Quantum;
    }



@Override
        public String toString() {
            return String.format("(%s, %s,%s,%s, %s,%s)",this.Code_inventar,this.Code_provider,this.Name,this.Number_project,this.Price,this.Quantum);
        }
}
