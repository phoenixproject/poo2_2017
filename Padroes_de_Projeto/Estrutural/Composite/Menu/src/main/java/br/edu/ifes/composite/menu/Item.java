/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifes.composite.menu;

/**
 *
 * @author pchan
 */
public abstract class Item {
    
    private String descricao;
    
    public Item(String descricao){
        
        this.descricao = descricao;        
    }
    
    public String getDescription(){
        return this.descricao;
    }
    
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    
    public abstract void addItem(Item item);
    public abstract void removeItem(Item item);
    public abstract Item[] getItens();
    
    public String toString(){
        return descricao;
    }
}
