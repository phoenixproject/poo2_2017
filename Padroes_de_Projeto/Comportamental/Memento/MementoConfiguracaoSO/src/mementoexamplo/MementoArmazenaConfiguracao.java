
package mementoexamplo;

public class MementoArmazenaConfiguracao {
    
    private ConfiguracaoSO config;
    private ConfiguracaoSO state;

    public ConfiguracaoSO getConfig() {
        return config;
    }

    public void setConfig(ConfiguracaoSO config) {
        this.config = config;
    }

    public ConfiguracaoSO getState() {
        return state;
    }

    public void setState(ConfiguracaoSO state) {
        this.state = state;
    }
    
    public void restoreState(){
        this.config = this.state;
    }
    
}
