/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package strategyexample.testSuite.predictionsGeneratorStrategy;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author nuno
 */
public class TestsuitePredictionsGeneratorStrategyFactory {

    private static TestsuitePredictionsGeneratorStrategyFactory theSingleton = null;
    private String propertiesFileName = "TestSuite.properties";

    public static synchronized TestsuitePredictionsGeneratorStrategyFactory getInstance() {
        if (theSingleton == null) {
            theSingleton = new TestsuitePredictionsGeneratorStrategyFactory();
        }
        return theSingleton;
    }

    /**
     * Este Load não é necessário que esteja aqui, apenas está pois não utilizo
     * propriedades noutro sítio
     *
     * @throws IOException
     */
    private void loadProperties() throws IOException {
        Properties systemProperties;
        Properties properties;
        try (InputStream in = getClass().getResourceAsStream(propertiesFileName)) {
            assert propertiesFileName != null;
            systemProperties = (Properties) System.getProperties().clone();
            properties = new Properties();
            properties.load(in);
        }

        properties.putAll(systemProperties);
        System.setProperties(properties);

    }

    public ITestsuitePreditionsGeneratorStrategy getPredictionsGeneratorStrategy() throws ClassNotFoundException, InstantiationException, IllegalAccessException, IOException {
        loadProperties();

        String className = System.getProperty("testSuite.predictionsGenerator.strategy");

        return (ITestsuitePreditionsGeneratorStrategy) Class.forName("strategyexample.testSuite.predictionsGeneratorStrategy.TestsuitePredictionsGeneratorStrategy" + className).newInstance();
    }
}
