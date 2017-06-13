package br.edu.ifes.movarquivoscomthread;


/*
     Copia arquivos de uma pasta para outra pasta
 */
import java.io.*;
import java.nio.channels.FileChannel;

/**
 *
 * @author felipe
 */
public class MoveFile {

    

    public static void main(String args[]) throws IOException, InterruptedException {

        final long startTime = System.currentTimeMillis();// tempo incial
        listaFiles = MoveFile.getSingleTonListaFiles(); //le arquivos do diretorio e coloca na listaFiles                
        System.out.println("Iniciando copiar de arquivos");
        
        for(int i = 0; i < listaFiles.length; i++) {
            File origem = new File(listaFiles[i].getAbsolutePath());
            String destinationFile = listaFiles[i].getAbsolutePath();
            destinationFile = destinationFile.replace("origem", "destino");
            copyFile(origem, new File(destinationFile));
        }      
        
        Runnable runUUID1 = new MoverArquivoThreadRunnable("Thread1");
        Thread thread1 = new Thread(runUUID1);      
        thread1.start();
            
        Runnable runUUID2 = new MoverArquivoThreadRunnable("Thread2");
        Thread thread2 = new Thread(runUUID2);      
        thread2.start();
        
        final long elapsedTimeMillis = System.currentTimeMillis() - startTime; //tempo total de execução do programa
        System.out.println("Time:" + elapsedTimeMillis);

    }
    
    
    
   


   
}
