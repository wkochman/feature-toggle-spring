package eu.sii.pl.toggle.feature;

import org.springframework.stereotype.Service;

/**
 * Created by wkochman on 19.12.13.
 */
@Service
public class MyBean {
    public void featureTest(){
        if(MyFeature.FIRST.isActive()){
            System.out.println("Feature 1");
        }
    }
}
