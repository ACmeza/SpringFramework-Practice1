package config;

import com.accenture.spring.PersitanceContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
/**
 * Created by antonio on 01/03/17.
 */
@Configuration
@Import(PersitanceContext.class)  //Import config class from spring-data
@ComponentScan(basePackages = "com.accenture.service")
public class ServiceContext {

}