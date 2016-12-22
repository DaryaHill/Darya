/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.vguit.tutorial;

import ru.vguit.tutorial.db.DBDerby;
import ru.vguit.tutorial.persistens.Clients;
import ru.vguit.tutorial.persistens.Inventars;
import ru.vguit.tutorial.persistens.Personals;
import ru.vguit.tutorial.persistens.Projects;

/**
 * Главный класс программы, представляет собой точку входа в программу
 *
 * @author a.pleshkanev
 */
public class Tutorial {

    
    public static void main(String[] args) {
        
        Projects project=new Projects(1,"sdfs","dfs",2,"afa","afa","afa");
        DBDerby dbproject = new DBDerby();
        dbproject.addProjects(project);
       // Client clientqwerty=(Client)dbclient.find(1L);
        
        Clients client=new Clients(24,"asda","aada","ada","dada");
        DBDerby dbclients = new DBDerby();
        dbclients.addClients(client);
       // Itemsatstore itemqwe=(Itemsatstore)dbitem.find(1L);
        Inventars inventar=new Inventars("adsa","adas",2,"asda",2,2);
        DBDerby dbinventar = new DBDerby();
        dbinventar.addInventars(inventar);
       // Order_items orderqwe=(Order_items)dborder.find(1L);
        
        Personals personal =new Personals("asda","adsa","asda","asdaa","asda","adsa","asda","asdaa");        DBDerby dbprovider = new DBDerby();
        DBDerby dbpersonal = new DBDerby();
        dbpersonal.addPersonals(personal);
       // Provider providerrqwe=(Provider)dbprovider.find(1L);
        
    }

}
