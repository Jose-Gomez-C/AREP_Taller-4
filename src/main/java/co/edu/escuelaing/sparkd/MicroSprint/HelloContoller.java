package co.edu.escuelaing.sparkd.MicroSprint;

public class HelloContoller {
	@RequestMapping(value = "/hola")
	static public String hola() {
		return "Greetings from Micro Spring Boot!";
	}
}
