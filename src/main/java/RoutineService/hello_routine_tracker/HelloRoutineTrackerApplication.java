package RoutineService.hello_routine_tracker;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class HelloRoutineTrackerApplication {

	public static void main(String[] args) {
        Dotenv env = Dotenv.configure().ignoreIfMissing().load();
        env.entries().forEach((entry) -> {
            System.setProperty(entry.getKey(), entry.getValue());
        });
		SpringApplication.run(HelloRoutineTrackerApplication.class, args);
	}

}
