package reparacion;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Operaciones {
	
	@Pointcut("execution(* *.Taller..arreglarCoche(..))")
	public void arreglarCoche(){}
	
	@AfterThrowing(throwing="ex",pointcut="arreglarCoche()")
	public void devolucionPieza() {
        System.out.println("Devolución de Piezas.... Procedemos a su devolucion");
    }
	
}
