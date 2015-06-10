package test.implementaciones;

import implementaciones.ArbolTurnos;
import implementaciones.ColaPrioridadEstatica;
import implementaciones.ConjuntoEstatico;
import tda.ABBTurnosTDA;
import tda.ColaPrioridadTDA;
import tda.ConjuntoTDA;

public class Testing {

	public static void main(String[] args) {
		/* ColaPrioridadEstatica */
		T1();
		
		/* ArbolTurnos */
		//T2();
		
		/* ConjuntoEstatico */
		//T3();
		
	}
	
	public static void T1(){
		ColaPrioridadTDA colaP = new ColaPrioridadEstatica();
		
		colaP.inicializar();
		
		System.out.println("*** Carga de pacientes y turnos ***");
		colaP.acolar("Juan", "08:00");
		colaP.acolar("Luis", "08:30");
		colaP.acolar("Mario", "09:00");
		colaP.acolar("Romina", "09:30");
		
		System.out.println("*** Listado de pacientes y turnos ***");
		while(!colaP.colaVacia()){
			System.out.println(colaP.paciente() + " - " + colaP.turno());
			colaP.dasacolar();
		}
	}
	
	public static void T2(){
		ABBTurnosTDA arbolB = new ArbolTurnos();
		
		arbolB.inicializar();
		
		System.out.println("*** Carga de pacientes y turnos ***");
		arbolB.agregar("08:00", "Juan");
		arbolB.agregar("08:30", "Maria");
		arbolB.agregar("10:30", "Luis");
		
		listarArbol(arbolB);
		
		System.out.println("** Elimina turno de 8:00 **");
		//TODO verificar porque no elimina el nodo, sólo reasigna el valor de la raiz
		arbolB.eliminar("08:00","Juan");
		
		listarArbol(arbolB);

	}
	
	public static void listarArbol (ABBTurnosTDA arbol){
		 if(!arbol.arbolVacio()){
			   listarArbol(arbol.hijoIzq());
			   System.out.println(arbol.paciente() + " - " + arbol.turno());
			   listarArbol(arbol.hijoDer());
		  }
	}
	
	public static void T3(){
		ConjuntoTDA conjunto = new ConjuntoEstatico();
		conjunto.inicializar();
		
		System.out.println("*** Carga conjunto ***");
		conjunto.agregar("a");
		conjunto.agregar("b");
		conjunto.agregar("c");
		
		System.out.println("*** Imprime conjunto ***");
		while(!conjunto.conjuntoVacio()){
			String valor;
			valor = conjunto.elegir();
			if(conjunto.pertenece(valor)){
				System.out.println(valor);
				conjunto.sacar(valor);	
			}
		}
		
	}

}
