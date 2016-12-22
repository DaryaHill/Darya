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
@Table(name="Projects")
public class Projects implements Serializable {
    private static final long serialVersionUID = 1L;
    
        @Id @GeneratedValue
        private long id;
        
        @Column (name="Number_project")
private int Number_project;
@Column (name="Name_project")
private String Name_project;
@Column (name="Address")
private String Address;
@Column (name="Budget")
private int Budget ;
@Column (name="Date_stert_work")
private String Date_stert_work;
@Column (name="Date_finish")
private String Date_finish;
@Column (name="Responsible")
private String Responsible;

    public Projects(int Number_project, String Name_project, String Address, int Budget, String Date_stert_work, String Date_finish, String Responsible) {
        this.Number_project = Number_project;
        this.Name_project = Name_project;
        this.Address = Address;
        this.Budget = Budget;
        this.Date_stert_work = Date_stert_work;
        this.Date_finish = Date_finish;
        this.Responsible = Responsible;
    }

    public Projects() {
    }

    public long getId() {
        return id;
    }

    public int getNumber_project() {
        return Number_project;
    }

    public String getName_project() {
        return Name_project;
    }

    public String getAddress() {
        return Address;
    }

    public int getBudget() {
        return Budget;
    }

    public String getDate_stert_work() {
        return Date_stert_work;
    }

    public String getDate_finish() {
        return Date_finish;
    }

    public String getResponsible() {
        return Responsible;
    }

    public void setNumber_project(int Number_project) {
        this.Number_project = Number_project;
    }

    public void setName_project(String Name_project) {
        this.Name_project = Name_project;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public void setBudget(int Budget) {
        this.Budget = Budget;
    }

    public void setDate_stert_work(String Date_stert_work) {
        this.Date_stert_work = Date_stert_work;
    }

    public void setDate_finish(String Date_finish) {
        this.Date_finish = Date_finish;
    }

    public void setResponsible(String Responsible) {
        this.Responsible = Responsible;
    }



@Override
        public String toString() {
            return String.format("(%s, %s,%s,%s, %s,%s,%s)",this.Address,this.Budget,this.Date_finish,this.Date_stert_work,this.Name_project,this.Number_project,this.Responsible);
        }
}
