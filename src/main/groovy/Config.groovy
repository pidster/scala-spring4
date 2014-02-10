
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.boot.builder.SpringApplicationBuilder
import org.springframework.boot.web.SpringBootServletInitializer
import org.springframework.context.annotation.*


@EnableAutoConfiguration
@Configuration
@ComponentScan
class Config extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(Config, args)
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		application.sources(Config)
	}

}
