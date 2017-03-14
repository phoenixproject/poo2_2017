/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifes.metodofabrica.estatico;

/**
 *
 * @author 20101bsi0453
 */
public class FabricaFormato {
    public static Formato geraFormato(String classe){
        Formato formato;
        Object classeReflection = null;
	try {
            classeReflection = Class.forName(classe).newInstance();            
	    } catch (InstantiationException e) {
	    e.printStackTrace();
	} catch (IllegalAccessException e) {
            e.printStackTrace();
	} catch (ClassNotFoundException e) {
	    e.printStackTrace();
	}        
        formato = (Formato) classeReflection;
        return formato;
    }    
}
