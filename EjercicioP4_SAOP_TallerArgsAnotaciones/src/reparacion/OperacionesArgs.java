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
public class OperacionesArgs {
	
	@Pointcut("execution(* *.Taller..arreglarCoche(..)) && args(matricula,nombreCliente)")
	public void arreglarCoche(String matricula, String nombreCliente){}
	
	@Before("arreglarCoche(matricula,nombreCliente)")
	public void comprobarCliente(String matricula, String nombreCliente) {
        System.out.println("Comprueba Cliente" + ". Matricula:" + matricula + ". NombreCliente:" + nombreCliente);
    }
	
	@AfterReturning("arreglarCoche(matricula,nombreCliente)")
	public void emitirFactura(String matricula, String nombreCliente) {
        System.out.println("Emite factura" + ". Matricula:" + matricula + ". NombreCliente:" + nombreCliente);
    }
	
	@Before("arreglarCoche(matricula,nombreCliente)")
	public void asignarCita(String matricula, String nombreCliente) {
        System.out.println("Asignar Citas" + ". Matricula:" + matricula + ". NombreCliente:" + nombreCliente);
    }
	
	@AfterReturning("arreglarCoche(matricula,nombreCliente)")
	public void guardarHistorial(String matricula, String nombreCliente) {
        System.out.println("Guardar Historial" + ". Matricula:" + matricula + ". NombreCliente:" + nombreCliente);
    }
	
	@AfterReturning("arreglarCoche(matricula,nombreCliente)")
	public void encuestaCliente(String matricula, String nombreCliente) {
        System.out.println("Encuesta Cliente" + ". Matricula:" + matricula + ". NombreCliente:" + nombreCliente);
    }
	
	@After("arreglarCoche(matricula,nombreCliente)")
	public void recogerCoche(String matricula, String nombreCliente) {
        System.out.println("Recoger Coche" + ". Matricula:" + matricula + ". NombreCliente:" + nombreCliente);
    }
}
