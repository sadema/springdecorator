package nl.kristalsoftware.springdecorator.springdecorator;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@Slf4j
@SpringBootApplication
public class SpringdecoratorApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringdecoratorApplication.class, args);
	}


	@Bean(name = "zeza_toggle_on")
	public InsuranceMapper create() {
		log.info("create InsuranceService");
		return new InsuranceMapper();
	}

	@Bean(name = "zeza_toggle_off")
	public InsuranceMapper createDecorator() {
		log.info("create InsuranceDecoratorService");
		return new InsuranceDecoratorMapper();
	}

}
