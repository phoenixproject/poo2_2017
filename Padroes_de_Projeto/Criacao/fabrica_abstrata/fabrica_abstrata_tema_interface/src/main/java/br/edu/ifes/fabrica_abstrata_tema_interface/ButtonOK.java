package br.edu.ifes.fabrica_abstrata_tema_interface;


import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author felip
 */
public class ButtonOK extends JButton {
    
    public ButtonOK(){
        
     Image img = null;
        try {
            img = ImageIO.read(getClass().getResource("/Ok-icon.png"));
            //img = ImageIO.read(getClass().getResource(filePath + "\\src\\Ok-icon.jpg"));
        } catch (IOException ex) {
            Logger.getLogger(ButtonOK.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.setIcon(new ImageIcon(img));
    }
    
}
