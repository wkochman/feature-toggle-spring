package eu.sii.pl.toggle.feature;

import org.togglz.core.manager.FeatureManager;
import org.togglz.core.manager.FeatureManagerBuilder;
import org.togglz.core.spi.FeatureManagerProvider;

public class SingletonFeatureManagerProvider implements FeatureManagerProvider {

    private static FeatureManager featureManager;


    @Override
    public int priority() {
        return 10;
    }

    @Override
    public synchronized FeatureManager getFeatureManager() {

        // lazy initialization
        if (featureManager == null) {

            // custom configuration class

            // build FeatureManager
            featureManager = new FeatureManagerBuilder().togglzConfig(new FeatureConfig()).build();

        }

        return featureManager;

    }

}
