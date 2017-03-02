package config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Created by antonio on 01/03/17.
 */
@Configuration
@Import(PersistanceContext.class)  //Import config class from spring-data
@ComponentScan(basePackages = "com.accenture.service")
public class ServiceContext {

}