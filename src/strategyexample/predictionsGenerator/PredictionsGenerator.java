/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package strategyexample.predictionsGenerator;

import java.io.IOException;
import java.util.HashMap;
import java.util.Properties;

/**
 *
 * @author nuno
 */
public class PredictionsGenerator {

    private HashMap hashMap = null;

    public void setHashMap(HashMap hashMap) {
        this.hashMap = hashMap;
    }

    /**
     *
     * @param hashMap
     * @return
     */
    public HashMap getHashMap() {
        assert hashMap != null;
        return hashMap;
    }

    public void setProperties(Properties prop) {

        System.setProperties(prop);
    }

    public void run() throws ClassNotFoundException, InstantiationException, IllegalAccessException, IOException {
        //método que era executado quando não existiam estratégias
        System.out.println(System.getProperty("teste"));

        //Para usar a estratégia, apenas é necessário alterar nos ficheiros de propriedades correspondesntes a chave "predictionsGenerator.strategy" para Properties ou HashMap
        //IPredictionsGeneratorStrategy predictionsGeneratorStrategy = (IPredictionsGeneratorStrategy) PredictionsGeneratorStrategyFactory.getInstance().getPredictionsGeneratorStrategy();
        //predictionsGeneratorStrategy.run(this);

    }
}
