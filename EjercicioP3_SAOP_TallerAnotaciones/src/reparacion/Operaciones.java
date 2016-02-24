package reparacion;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;


@Aspect
@Component
public class Operaciones {

	@Pointcut("execution(* reparacion.Taller.arreglarCoche(..))")
	public void arreglarCoche() {}
	
	@Before("arreglarCoche()")
	public void a_comprobarCliente() {
        System.out.println("Comprueba Cliente");
    }
	
	@AfterReturning("arreglarCoche()")
	public void a_emitirFactura() {
        System.out.println("Emite factura");
    }
	
	@Before("arreglarCoche()")
	public void b_asignarCita() {
        System.out.println("Asignar Citas");
    }
	
	@AfterReturning("arreglarCoche()")
	public void b_guardarHistorial() {
        System.out.println("Guardar Historial");
    }
	
	@AfterThrowing(throwing="ex", pointcut="arreglarCoche()")
	public void devolucionPieza() {
        System.out.println("Devolución de Piezas.... Procedemos a su devolucion");
    }
	
	@AfterReturning("arreglarCoche()")
	public void c_encuestaCliente() {
        System.out.println("Encuesta Cliente");
    }
	
	@After("arreglarCoche()")
	public void recogerCoche() {
        System.out.println("Recoger Coche");
    }
	
//	@Around("arreglarCoche()")
//	public void medirTiempo(ProceedingJoinPoint delegar)  throws Throwable{
//		long tiempoInicio = System.currentTimeMillis();
//        Object obj = delegar.proceed();
//        long tiempoFin = System.currentTimeMillis();
//        System.out.println("La duracion de la reparación " +
//                              (tiempoFin - tiempoInicio) + "mseg.");
//    }
	

}
