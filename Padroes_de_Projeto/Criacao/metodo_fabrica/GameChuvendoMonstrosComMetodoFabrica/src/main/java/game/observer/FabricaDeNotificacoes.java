package game.observer;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

public class FabricaDeNotificacoes {
    
    private Image imagem;    
    String filePath;
    
    FabricaDeNotificacoes() {
        try {
            File file = new File(".");
            filePath = file.getCanonicalPath();
        } catch (IOException ex) {
            Logger.getLogger(FabricaDeNotificacoes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Image criarImagensNotificacao(String tipo) throws SlickException {        
                        
        switch(tipo){
            
            case "gameover" :
                this.imagem = new Image(filePath + "\\src\\main\\java\\br\\edu\\ifes\\gamechuvendomonstroscommetodofabrica\\gameover.png");
                break;
            case "land" :
                this.imagem = new Image(filePath + "\\src\\main\\java\\br\\edu\\ifes\\gamechuvendomonstroscommetodofabrica\\bg.png");
                break;
            case "ganhouJogo" :
                this.imagem = new Image(filePath + "\\src\\main\\java\\br\\edu\\ifes\\gamechuvendomonstroscommetodofabrica\\ganhou.png");
                break;
            default:
                break;
            
        }
        
    return this.imagem;
    }
}
