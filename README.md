# spring-aop-examples
Ejemplos de Spring AOP.

EJERCICIO 1
Vamos a crear la clase Taller con un método arreglarCoche().
En otra clase Operaciones crearemos los siguientes métodos para recoger las operaciones transversales:
	 comprobarCliente(); para saber si es antiguo cliente o hay que darlo de alta.
	 emitirFactura(); con el total de horas que dura la reparación emitiremos la factura correspondiente.
	 asignarCita(); se anotará en la agenda la cita para la reparación
	 guardarHistorial(); si el coche se repara en el taller se guarda constancia de la reparación efectuada.
	 devolucionPieza(); cuando la pieza es defectuosa y no se puede reparar el coche procedemos a su devolución.
	 encuestaCliente(); Todo cliente debe rellenar una encuesta al recoger el coche en el taller.
	 recogerCoche(); Los coches son retirados tras su reparación.
Utilizamos AOP para ejecutar los métodos anteriores.

EJERCICIO 2
Modificamos el ejercicio anterior incorporando los siguientes parámetros al método arreglarCoche:
	String matrícula
	String nombreCliente
Estos datos deben utilizarse en los métodos de la clase Operaciones.

EJERCICIO 3
Rehacer el ejercicio 1 utilizando anotaciones.

EJERCICIO 4
Rehacer el ejercicio 2 utilizando anotaciones.
