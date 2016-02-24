package reparacion;

import org.aspectj.lang.ProceedingJoinPoint;

public class Operaciones {

	public void comprobarCliente(String matricula, String nombreCliente) {
        System.out.println("Comprueba Cliente" + ". Matricula:" + matricula + ". NombreCliente:" + nombreCliente);
    }
	
	public void emitirFactura(String matricula, String nombreCliente) {
        System.out.println("Emite factura" + ". Matricula:" + matricula + ". NombreCliente:" + nombreCliente);
    }
	
	public void asignarCita(String matricula, String nombreCliente) {
        System.out.println("Asignar Citas" + ". Matricula:" + matricula + ". NombreCliente:" + nombreCliente);
    }
	
	public void guardarHistorial(String matricula, String nombreCliente) {
        System.out.println("Guardar Historial" + ". Matricula:" + matricula + ". NombreCliente:" + nombreCliente);
    }
	
	public void devolucionPieza() {
        System.out.println("Devolución de Piezas.... Procedemos a su devolucion");
    }
	
	public void encuestaCliente(String matricula, String nombreCliente) {
        System.out.println("Encuesta Cliente" + ". Matricula:" + matricula + ". NombreCliente:" + nombreCliente);
    }
	
	public void recogerCoche(String matricula, String nombreCliente) {
        System.out.println("Recoger Coche" + ". Matricula:" + matricula + ". NombreCliente:" + nombreCliente);
    }
}
