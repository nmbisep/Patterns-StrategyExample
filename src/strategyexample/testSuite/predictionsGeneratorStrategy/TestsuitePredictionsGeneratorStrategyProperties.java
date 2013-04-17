/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package strategyexample.testSuite.predictionsGeneratorStrategy;

import strategyexample.predictionsGenerator.PredictionsGenerator;
import java.io.IOException;
import java.util.Properties;
import strategyexample.testSuite.TestSuite;

/**
 *
 * @author nuno
 */
public class TestsuitePredictionsGeneratorStrategyProperties implements ITestsuitePreditionsGeneratorStrategy {

    @Override
    public void run(TestSuite testsuite) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IOException {
        PredictionsGenerator predictionsGenerator = new PredictionsGenerator();
        Properties properties = new Properties();
        properties.setProperty("teste", "olá a partir das propriedades - usando estratégia de Properties");
        predictionsGenerator.setProperties(properties);
        predictionsGenerator.run();
    }
}
