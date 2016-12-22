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
@Table(name="Personals")
public class Personals implements Serializable {
    private static final long serialVersionUID = 1L;
    
        @Id @GeneratedValue
        private long id;
        
       @Column (name="Position")
private String Position;
@Column (name="Surname")
private String Surname;
@Column (name="Name")
private String Name;
@Column (name="Patronymic")
private String Patronymic ;
@Column (name="Date_of_Birth")
private String Date_of_Birth;
@Column (name="Gender")
private String  Gender;
@Column (name="Address")
private String Address;
@Column (name="Phone")
private String Phone;

    public Personals(String Position, String Surname, String Name, String Patronymic, String Date_of_Birth, String Gender, String Address, String Phone) {
        this.Position = Position;
        this.Surname = Surname;
        this.Name = Name;
        this.Patronymic = Patronymic;
        this.Date_of_Birth = Date_of_Birth;
        this.Gender = Gender;
        this.Address = Address;
        this.Phone = Phone;
    }

    public Personals() {
    }

    public long getId() {
        return id;
    }

    public String getPosition() {
        return Position;
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

    public String getDate_of_Birth() {
        return Date_of_Birth;
    }

    public String getGender() {
        return Gender;
    }

    public String getAddress() {
        return Address;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPosition(String Position) {
        this.Position = Position;
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

    public void setDate_of_Birth(String Date_of_Birth) {
        this.Date_of_Birth = Date_of_Birth;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }



@Override
        public String toString() {
            return String.format("(%s, %s,%s,%s, %s,%s,%s,%s)",this.Address,this.Date_of_Birth,this.Gender,this.Name,this.Patronymic,this.Phone,this.Position,this.Surname);
        }
}
