package reparacion;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author arellano84
 * 
 * Spring AOP. 
 */

public class Main {
	
	public static void main(String[] args) {
		ApplicationContext contenedor =
                new ClassPathXmlApplicationContext("spring.xml");

		Taller taller = contenedor.getBean("taller", Taller.class);
		taller.arreglarCoche("ABC-123","Luis");
	}

}
