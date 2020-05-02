package Main.Controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class Controller {

	
	
	  @RequestMapping(value = "/in")
	  public String In() {
	    return "You go in";
	  }

	  @RequestMapping(value = "/out")
	  public String Out() {
	    return "You go out";
	  }

	public static void main(String[] args) {
		SpringApplication.run(Controller.class, args);
	}

}
