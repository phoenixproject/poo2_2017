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
public class ItemMenu extends Item {
    
    public ItemMenu(String descricao) {
        super(descricao);
    }
    
        
    @Override
    public void addItem(Item item) {
        setDescricao(item.getDescription());
    }

    @Override
    public void removeItem(Item item) {
        setDescricao("Item vazio");
    }

    @Override
    public Item[] getItens() {
        throw new UnsupportedOperationException("Não suportado"); 
    }
    
    
    
}
