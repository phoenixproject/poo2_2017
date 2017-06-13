/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifes.movarquivoscomthread;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author pchan
 */
public class MoverArquivoThreadRunnable implements Runnable {

    private static File listaFiles[] = null;
    String threadName;
    
    public MoverArquivoThreadRunnable(String threadName)
    {
        this.threadName = threadName;
    } 
        
    @Override
    public void run() {
        
        int i =0;
        
        while(i<10)//cada execucao vai imprimir 10 vezes o uuid
        {
            try {
                Thread.sleep(400);
            } catch (InterruptedException ex) {
                Logger.getLogger(MoverArquivoThreadRunnable.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            i++;
            System.out.println(UUID.randomUUID() + "-" +threadName);
        }
    }
    
    public static synchronized File[] getSingleTonListaFiles() throws IOException
    {        
        if(listaFiles == null){
            String current = new java.io.File(".").getCanonicalPath();
            File file = new File(current + "\\src\\main\\java\\br\\edu\\ifes\\movarquivoscomthread\\origem");
            listaFiles = file.listFiles();                      
        }
        return listaFiles;        
    }
    
    public static void copyFile(File sourceFile, File destFile) throws IOException {

        if (!sourceFile.exists()) {
            return;
        }
        if (!destFile.exists()) {
            destFile.createNewFile();
        }
        FileChannel source = null;
        FileChannel destination = null;
        source = new FileInputStream(sourceFile).getChannel();
        destination = new FileOutputStream(destFile).getChannel();
        if (destination != null && source != null) {
            destination.transferFrom(source, 0, source.size());
        }
        if (source != null) {
            source.close();
        }
        if (destination != null) {
            destination.close();
        }
    }    
    
}
