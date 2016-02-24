package reparacion;

import org.springframework.stereotype.Component;

@Component
public class Taller {

	public void arreglarCoche() {
        System.out.println("Arreglando Coche en el Taller...");
        //throw new RuntimeException();
    }
	
}
