package co.edu.escuelaing.sparkd.MicroSprint;

import co.edu.escuelaing.sparkd.httpserver.HttpServer;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MicroSpringBoot {
	public static void main(String[] args){
		System.out.println("Leegue perra");
		args=new String[]{"co.edu.escuelaing.sparkd.MicroSprint.HelloContoller"};
		System.out.println("Leegue perra1");

		try{
			MicroSpring iocServer = new MicroSpring();
			System.out.println("Leegue perra2");
			iocServer.start(args);
			System.out.println("Leegue perra3");
			HttpServer server =  new HttpServer(iocServer);
			System.out.println("Leegue perra4");
			server.start();
			System.out.println("Leegue perra5");
		}catch(Exception ex){
			Logger.getLogger(MicroSpringBoot.class.getName()).log(Level.SEVERE, null, ex);
		}


	}
}