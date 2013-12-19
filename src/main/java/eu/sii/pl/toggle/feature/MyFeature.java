package eu.sii.pl.toggle.feature;

import org.togglz.core.Feature;
import org.togglz.core.annotation.EnabledByDefault;
import org.togglz.core.annotation.Label;

/**
 * Created by wkochman on 19.12.13.
 */
public enum MyFeature implements Feature {
    @Label("First")
    @EnabledByDefault
    FIRST,

    @Label("Second")
    SECOND;

    public boolean isActive(){
        return new SingletonFeatureManagerProvider().getFeatureManager().isActive(this);
    }
}


