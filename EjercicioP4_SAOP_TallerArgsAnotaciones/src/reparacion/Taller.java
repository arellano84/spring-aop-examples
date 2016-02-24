package reparacion;

import org.springframework.stereotype.Component;

@Component
public class Taller {

	public void arreglarCoche(String matricula, String nombreCliente) {
        System.out.println("Arreglando Coche en el Taller..." + ". Matricula:" + matricula + ". NombreCliente:" + nombreCliente);
        //throw new RuntimeException();
    }
	
}
