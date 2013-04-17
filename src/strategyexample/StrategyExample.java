/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package strategyexample;

import strategyexample.testSuite.TestSuite;
import java.io.IOException;


/**
 *
 * @author nuno
 */
public class StrategyExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IOException {
        TestSuite testSuite = new TestSuite();
        testSuite.run();
    }
}
