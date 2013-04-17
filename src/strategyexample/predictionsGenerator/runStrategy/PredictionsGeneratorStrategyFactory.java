/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package strategyexample.predictionsGenerator.runStrategy;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 *
 * @author nuno
 */
public class PredictionsGeneratorStrategyFactory {

    private static PredictionsGeneratorStrategyFactory theSingleton = null;
    private String propertiesFileName = "PredictionsGenerator.properties";

    public static synchronized PredictionsGeneratorStrategyFactory getInstance() {
        if (theSingleton == null) {
            theSingleton = new PredictionsGeneratorStrategyFactory();
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

    public IPredictionsGeneratorStrategy getPredictionsGeneratorStrategy() throws ClassNotFoundException, InstantiationException, IllegalAccessException, IOException {
        loadProperties();

        String className = System.getProperty("predictionsGenerator.strategy");

        return (IPredictionsGeneratorStrategy) Class.forName("strategyexample.predictionsGenerator.PredictionsGeneratorStrategy" + className).newInstance();
    }
}
