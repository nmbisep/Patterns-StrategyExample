/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package strategyexample.testSuite.predictionsGeneratorStrategy;

import strategyexample.predictionsGenerator.PredictionsGenerator;
import java.io.IOException;
import java.util.HashMap;
import strategyexample.testSuite.TestSuite;

/**
 *
 * @author nuno
 */
public class TestsuitePredictionsGeneratorStrategyHashMap implements ITestsuitePreditionsGeneratorStrategy {

    @Override
    public void run(TestSuite testsuite) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IOException {
        PredictionsGenerator predictionsGenerator = new PredictionsGenerator();
        HashMap hashMap = new HashMap();
        hashMap.put("teste", "olá a partir dos hashmaps- usando estratégia de HashMap");
        predictionsGenerator.setHashMap(hashMap);
        predictionsGenerator.run();
    }
}
