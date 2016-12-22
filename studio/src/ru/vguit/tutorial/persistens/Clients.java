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
@Table(name="Clients")
public class Clients implements Serializable {
    private static final long serialVersionUID = 1L;
    
        @Id @GeneratedValue
        private long id;
        
       @Column (name="Number_clients")
private int Number_clients;
@Column (name="Surname")
private String Surname;
@Column (name="Name")
private String Name;
@Column (name="Patronymic")
private String Patronymic ;
@Column (name="Phone")
private String Phone;

    public Clients(int Number_clients, String Surname, String Name, String Patronymic, String Phone) {
        this.Number_clients = Number_clients;
        this.Surname = Surname;
        this.Name = Name;
        this.Patronymic = Patronymic;
        this.Phone = Phone;
    }

    public Clients() {
    }

    public long getId() {
        return id;
    }

    public int getNumber_clients() {
        return Number_clients;
    }

    public String getSurname() {
        return Surname;
    }

    public String getName() {
        return Name;
    }

    public String getPatronymic() {
        return Patronymic;
    }

    public String getPhone() {
        return Phone;
    }

    public void setNumber_clients(int Number_clients) {
        this.Number_clients = Number_clients;
    }

    public void setSurname(String Surname) {
        this.Surname = Surname;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setPatronymic(String Patronymic) {
        this.Patronymic = Patronymic;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }



@Override
        public String toString() {
            return String.format("(%s, %s,%s,%s, %s)",this.Name,this.Number_clients,this.Patronymic,this.Phone,this.Surname);
        }
}
