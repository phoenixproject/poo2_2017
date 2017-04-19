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
public class Main {
    
    public static void main(String[] args) {
        
        Item item1 = new ItemMenu("Roteador");
        Item item2 = new ItemMenu("Switch");
        Item item3 = new ItemMenu("Repetidor");
        
        Item item4 = new ItemMenu("Windows 95");
        Item item5 = new ItemMenu("Windows 98");
        
        Item item6 = new ItemMenu("Angular JS");
        
        Item item7 = new ItemMenu("PC");
        
        Item submenu1 = new SubMenu("Informática");
        Item submenu2 = new SubMenu("Software");
        Item submenu3 = new SubMenu("Ativos de Rede");
        Item submenu4 = new SubMenu("Linguagens de Programação");
        
        
        Item menuPrincipal = new SubMenu("Caderno de Informática");
        
        submenu1.addItem(item7);
        
        submenu2.addItem(item4);
        submenu2.addItem(item5);
        
        submenu3.addItem(item1);
        submenu3.addItem(item2);
        submenu3.addItem(item3);
        
        submenu3.addItem(item3);
        
        submenu4.addItem(item6);
        
        menuPrincipal.addItem(submenu1);
        menuPrincipal.addItem(submenu2);
        menuPrincipal.addItem(submenu3);
        menuPrincipal.addItem(submenu4);
        
        
        menuPrincipal.addItem(submenu1);
    }
    
}
