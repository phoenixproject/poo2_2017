
package mementoexamplo;


public class ConfigSOMain {

    /**
     * @param args the command line arguments
     * @throws java.lang.CloneNotSupportedException
     */
  public static void main(String[] args) throws CloneNotSupportedException {

       
       ConfiguracaoSO configuracao = new ConfiguracaoSO();
       configuracao.setUsb(false);
       configuracao.setVersaoSO(1.0);
       configuracao.setWifi(false);
       
       System.out.println("Iniciando sistema");
       System.out.println(" -- -- ");
       
       System.out.println("Implementação de USB: " + configuracao.isUsb());
       System.out.println("Versão do SO: " + configuracao.getVersaoSO());
       System.out.println("Implementação de Wifi: " + configuracao.isWifi());
       
       MementoArmazenaConfiguracao lembranca = new MementoArmazenaConfiguracao();
       lembranca.setState((ConfiguracaoSO) configuracao.clone());
       
       //utilize o padrão memento para restaurar as configurações do sistema
       //após realizada uma modificação
       
       System.out.println("Atualizando o sistema");
       System.out.println(" -- -- ");       

       configuracao.setVersaoSO(2.0);
       configuracao.setUsb(true);
       
       System.out.println("Implementação de USB: " + configuracao.isUsb());
       System.out.println("Versão do SO: " + configuracao.getVersaoSO());
       System.out.println("Implementação de Wifi: " + configuracao.isWifi());
       
       lembranca.restoreState();       
       
       System.out.println("Restaurando o sistema");
       System.out.println(" -- -- ");
       
       System.out.println("Implementação de USB: " + lembranca.getConfig().isUsb());
       System.out.println("Versão do SO: " + lembranca.getConfig().getVersaoSO());
       System.out.println("Implementação de Wifi: " + lembranca.getConfig().isWifi());
       
     
   }
    
}
