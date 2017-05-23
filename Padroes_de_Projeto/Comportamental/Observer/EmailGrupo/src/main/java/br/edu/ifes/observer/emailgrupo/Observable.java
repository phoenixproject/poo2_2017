/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifes.observer.emailgrupo;

import java.util.ArrayList;

/**
 *
 * @author pchan
 */
public class Observable {
    
    private ArrayList<Observer> monitores = new ArrayList();
    
    public void addObserver(Observer ob){
        this.monitores.add(ob);
    }
    
    public void deleteObserver(Observer ob){
        this.monitores.remove(ob);
    }
    
    public void notifyObserver(){
        for(Observer ob : monitores){
            ob.update(this);
        }
    }
    
}
