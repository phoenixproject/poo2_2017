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
public class MetodoFabrica {
    
    public static void main(String[] args) {
        Formato formato;
        
        formato = FabricaFormato.geraFormato("metodoestatico.fabrica.FormatoPng");
        formato.gera();
        
        formato = FabricaFormato.geraFormato("metodoestatico.fabrica.FormatoJpeg");
        formato.gera();
        
        formato = FabricaFormato.geraFormato("metodoestatico.fabrica.FormatoGif");
        formato.gera();
        
        formato = FabricaFormato.geraFormato("metodoestatico.fabrica.FormatoBmp");
        formato.gera();
    }      
    
}
