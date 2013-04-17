/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package strategyexample.testSuite.predictionsGeneratorStrategy;

import strategyexample.testSuite.TestSuite;
import java.io.IOException;
import strategyexample.testSuite.TestSuite;

/**
 *
 * @author nuno
 */
public interface ITestsuitePreditionsGeneratorStrategy {

    public void run(TestSuite testsuite) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IOException;
}
