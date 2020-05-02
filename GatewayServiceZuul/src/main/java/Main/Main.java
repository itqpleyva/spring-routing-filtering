package Main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import Main.Filters.FilterPre;

@EnableZuulProxy
@SpringBootApplication
public class Main {

	public static void main(String[] args) {
		
		SpringApplication.run(Main.class, args);
	
	}
	
	  @Bean
	  public FilterPre simpleFilter() {
	    return new FilterPre();
	  }
}
