package reparacion;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

/**
 * @author arellano84
 * 
 * Spring AOP. 
 */

@Component
public class Main {
	
	public static void main(String[] args) {
		
		System.out.println("EjercicioP3_SAOP_TallerAnotaciones");
		
		ApplicationContext contenedor =
                new ClassPathXmlApplicationContext("spring.xml");

		Taller taller = contenedor.getBean("taller", Taller.class);
		taller.arreglarCoche();
	}

}
