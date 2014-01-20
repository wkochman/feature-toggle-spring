package eu.sii.pl.toggle.feature;

import org.springframework.stereotype.Service;

/**
 * Created by wkochman on 19.12.13.
 */
@Service
public class MyBean {
    public void featureTest() {
        for (int i = 0; i < 3; i++) {
            if (MyFeature.FIRST.isActive()) {
                System.out.println("Feature 1");
            }
            if (MyFeature.SECOND.isActive()) {
                System.out.println("Feature 2");
            }
            try {
                Thread.currentThread().sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
