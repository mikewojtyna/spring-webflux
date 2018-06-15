package pro.buildmysoftware.webflux;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Application bootstrapper.
 *
 * @author goobar
 *
 */
@SpringBootApplication
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
