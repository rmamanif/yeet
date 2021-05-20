package tecsup.edu.l10.controlador;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RequestMapping(value="/producto")
@RestController
public class Controlador {
	@RequestMapping(value="/detalle", method= RequestMethod.GET)
	
	public @ResponseBody String getProducto(@RequestParam("codigo") Long codigo, 
			@RequestParam("nombre") String nombre,
			@RequestParam("precio") double precio ) {
				
			return "Codigo: "+codigo+" Descripcion: "+nombre+" Precio "+precio;
				
		
	}
}
