package lk.ijse.dep13.spring.config;

import lk.ijse.dep13.spring.AppInitializer;
import lk.ijse.dep13.spring.bean.Abc;
import lk.ijse.dep13.spring.bean.SpringBean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Service;

//@ComponentScan(basePackages = {"lk.ijse.dep13.spring.bean", "lk.ijse.dep13.spring.config"})
//@ComponentScan(basePackages = "lk.ijse.dep13.spring")
//@ComponentScan(basePackages = "lk.ijse")
//@ComponentScan(basePackageClasses = AppConfig.class)
//@ComponentScan(basePackageClasses = Abc.class)
//@ComponentScan(basePackageClasses = AppInitializer.class,

//excludeFilters = @ComponentScan.Filter(type = FilterType.REGEX,
//        pattern = "lk[.]ijse[.]dep13[.]spring[.]config[.].+"))

//@ComponentScan(basePackageClasses = AppInitializer.class,
//excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION,
//value = Service.class))

@ComponentScan(basePackageClasses = AppInitializer.class)
@Configuration
public class AppConfig {

    public AppConfig() {
        System.out.println("AppConfig()");
    }
}
