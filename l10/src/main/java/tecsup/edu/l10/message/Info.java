package tecsup.edu.l10.message;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class Info {
		@Value("${nombre:x}")
		public String nombre;
		@Value("${apellido:y}")
		public String apellido;
		
		public String ApeNom() {
			return ApeNom(this.nombre,this.apellido);
		}
		
		public String ApeNom(String nombre, String apellido) {
			return "Hola " + nombre + " " + apellido;
		}
		
}
