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
public interface IPredictionsGeneratorStrategy {

    public void run(PredictionsGenerator predictionsGenerator);
}
