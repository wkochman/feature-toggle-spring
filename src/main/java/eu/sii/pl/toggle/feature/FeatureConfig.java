package eu.sii.pl.toggle.feature;

import org.springframework.stereotype.Component;
import org.togglz.core.Feature;
import org.togglz.core.manager.TogglzConfig;
import org.togglz.core.repository.StateRepository;
import org.togglz.core.repository.file.FileBasedStateRepository;
import org.togglz.core.user.NoOpUserProvider;
import org.togglz.core.user.UserProvider;

import java.io.File;

/**
 * Created by wkochman on 19.12.13.
 */
public class FeatureConfig implements TogglzConfig{
    @Override
    public Class<? extends Feature> getFeatureClass() {
        return MyFeature.class;
    }

    @Override
    public StateRepository getStateRepository() {
        return new FileBasedStateRepository(new File("/tmp/features.properties"));
    }

    @Override
    public UserProvider getUserProvider() {
        return new NoOpUserProvider();
    }
}
