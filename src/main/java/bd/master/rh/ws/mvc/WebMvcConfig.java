package bd.master.rh.ws.mvc;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;


@EnableWebMvc
@Configuration
@ComponentScan(basePackages={"bd.master.rh.ws.mvc"})

public class WebMvcConfig extends WebMvcConfigurerAdapter{

}
