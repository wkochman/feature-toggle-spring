package eu.sii.pl.toggle.feature;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

/**
 * Created by wkochman on 19.12.13.
 */
@Component
public class FeatureTest {
    @Autowired
    MyBean bean;
    public static void main(String[] args) {
        final ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
        final FeatureTest app = ctx.getBean(FeatureTest.class);
        app.featureTest();

    }

    void featureTest(){
        bean.featureTest();
    }
}
