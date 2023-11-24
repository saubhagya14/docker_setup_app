package ed.admin.server;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerController {
	@GetMapping("/greet")
	public String greet() {
		return "Hello Saubhagya Good morning Welcome to the docker application.";
	}
}
