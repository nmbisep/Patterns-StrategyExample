/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package strategyexample.testSuite;

import java.io.IOException;
import strategyexample.testSuite.predictionsGeneratorStrategy.ITestsuitePreditionsGeneratorStrategy;
import strategyexample.testSuite.predictionsGeneratorStrategy.TestsuitePredictionsGeneratorStrategyFactory;

/**
 *
 * @author nuno
 */
public class TestSuite {

    public void setInput() {
    }

    public void run() throws ClassNotFoundException, InstantiationException, IllegalAccessException, IOException {
        //Este seria por exemplo o código que existia antes e que passou para a estratégia de props
        //PredictionsGenerator predictionsGenerator = new PredictionsGenerator();
        //Properties properties = new Properties();
        //properties.setProperty("teste", "olá a partir das propriedades - sem estratégias");
        //predictionsGenerator.setProperties(properties);
        //predictionsGenerator.run();

        //Para usar a estratégia, apenas é necessário alterar nos ficheiros de propriedades correspondesntes a chave "predictionsGenerator.strategy" para Properties ou HashMap
        ITestsuitePreditionsGeneratorStrategy predictionsGeneratorStrategy = (ITestsuitePreditionsGeneratorStrategy) TestsuitePredictionsGeneratorStrategyFactory.getInstance().getPredictionsGeneratorStrategy();
        predictionsGeneratorStrategy.run(this);
    }
}
