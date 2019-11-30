package pk.com.rest.restcontroller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/test/*")
public class RestTest {

	@GetMapping(value = "hello")
	public ResponseEntity<String> sayHello() {
		System.out.println("Hello from Service");
		return new ResponseEntity<String>("Hello from Service", HttpStatus.OK);
	}

}
