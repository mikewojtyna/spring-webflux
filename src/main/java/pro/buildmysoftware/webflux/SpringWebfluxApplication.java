package pro.buildmysoftware.webflux;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.mongo.embedded.EmbeddedMongoAutoConfiguration;

/**
 * Application bootstrapper.
 *
 * @author goobar
 *
 */
@SpringBootApplication
@EnableAutoConfiguration(exclude = EmbeddedMongoAutoConfiguration.class)
public class SpringWebfluxApplication
{
	/**
	 * Bootstraps the application.
	 *
	 * @param args
	 *                args
	 */
	public static void main(String[] args)
	{
		SpringApplication.run(SpringWebfluxApplication.class, args);
	}

}
