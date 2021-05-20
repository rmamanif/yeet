package tecsup.edu.l10;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import tecsup.edu.l10.message.Info;

@SpringBootApplication
public class L10Application implements CommandLineRunner {
	
	@Autowired
	
	private Info mensaje;
	
	public static void main(String[] args) {
		SpringApplication app=new SpringApplication(L10Application.class);
		app.run();		
	}

	@Override
	public void run(String... args) throws Exception {
		if(args.length>0) {
			System.out.println(mensaje.ApeNom(args[0], args[1]));
		}else {
			System.out.println(mensaje.ApeNom());
		}
		
	}

}
