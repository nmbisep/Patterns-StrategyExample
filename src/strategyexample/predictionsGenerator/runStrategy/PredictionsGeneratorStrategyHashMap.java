/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package strategyexample.predictionsGenerator.runStrategy;

import strategyexample.predictionsGenerator.PredictionsGenerator;

/**
 *
 * @author nuno
 */
public class PredictionsGeneratorStrategyHashMap implements IPredictionsGeneratorStrategy{

    @Override
    public void run(PredictionsGenerator predictionsGenerator) {
        System.out.println(predictionsGenerator.getHashMap().get("teste"));
    }
    
}
