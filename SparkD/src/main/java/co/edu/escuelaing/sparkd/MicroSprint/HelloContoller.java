package co.edu.escuelaing.sparkd.MicroSprint;

public class HelloContoller {
	@RequestMapping("/")
	static public String index() {
		return "Greetings from Micro Spring Boot!";
	}
}
