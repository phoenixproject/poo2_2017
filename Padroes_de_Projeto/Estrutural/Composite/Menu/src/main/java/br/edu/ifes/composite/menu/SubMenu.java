/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifes.composite.menu;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pchan
 */
public class SubMenu extends Item {

    private List<Item> itens;
    
    public SubMenu(String descricao) {
        super(descricao);
        itens = new ArrayList<Item>();
    }

    @Override
    public void addItem(Item item) {
        this.itens.add(item);
    }

    @Override
    public void removeItem(Item item) {
        this.itens.remove(item);
    }

    @Override
    public Item[] getItens() {
        return itens.toArray(new Item[itens.size()]);
    }
    
    
    
}
