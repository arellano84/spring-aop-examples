package reparacion;

import org.aspectj.lang.ProceedingJoinPoint;

public class Operaciones {

	public void comprobarCliente() {
        System.out.println("Comprueba Cliente");
    }
	
	public void emitirFactura() {
        System.out.println("Emite factura");
    }
	
	public void asignarCita() {
        System.out.println("Asignar Citas");
    }
	
	public void guardarHistorial() {
        System.out.println("Guardar Historial");
    }
	
	public void devolucionPieza() {
        System.out.println("Devolución de Piezas.... Procedemos a su devolucion");
    }
	
	public void encuestaCliente() {
        System.out.println("Encuesta Cliente");
    }
	
	public void recogerCoche() {
        System.out.println("Recoger Coche");
    }
	
//	public void medirTiempo(ProceedingJoinPoint delegar)  throws Throwable{
//		long tiempoInicio = System.currentTimeMillis();
//        Object obj = delegar.proceed();
//        long tiempoFin = System.currentTimeMillis();
//        System.out.println("La duracion de la reparación " +
//                              (tiempoFin - tiempoInicio) + "mseg.");
//    }
	

}
