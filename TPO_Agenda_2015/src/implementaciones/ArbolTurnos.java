package implementaciones;

import tda.ABBTurnosTDA;
import algoritmos.Util;

public class ArbolTurnos implements ABBTurnosTDA {
	NodoABBTurno raizTurno;

	@Override
	public void inicializar() {
		raizTurno = null;
	}

	@Override
	public void agregar(String turno, String paciente) {
		if(raizTurno == null){
			raizTurno = new NodoABBTurno();
			raizTurno.hora 		= turno;
			raizTurno.paciente	= paciente;
			
			raizTurno.hijoIzq = new ArbolTurnos();
			raizTurno.hijoIzq.inicializar();
			
			raizTurno.hijoDer = new ArbolTurnos();
			raizTurno.hijoDer.inicializar();
			
		}else if(Util.secuenciaTurno(raizTurno.hora) > Util.secuenciaTurno(turno)){
			raizTurno.hijoIzq.agregar(turno,paciente);
		}else if(Util.secuenciaTurno(raizTurno.hora) < Util.secuenciaTurno(turno)){
			raizTurno.hijoDer.agregar(turno,paciente);
		}
	}

	@Override
	public void eliminar(String turno, String paciente) {
		if(raizTurno != null){
			if(raizTurno.hora == turno && raizTurno.paciente == paciente && raizTurno.hijoIzq.arbolVacio() && raizTurno.hijoDer.arbolVacio()){
				
				raizTurno = null;
				
			}else if(raizTurno.hora == turno && raizTurno.paciente == paciente && !raizTurno.hijoIzq.arbolVacio()){
				
				raizTurno.hora = mayorTurno(raizTurno.hijoIzq);
				raizTurno.hijoIzq.eliminar(raizTurno.hora, paciente);
				
			}else if(raizTurno.hora == turno && raizTurno.paciente == paciente && raizTurno.hijoIzq.arbolVacio()){
				
				raizTurno.hora = menorTurno(raizTurno.hijoDer);
				raizTurno.hijoDer.eliminar(raizTurno.hora,paciente);
				
			}else if(Util.secuenciaTurno(raizTurno.hora) > Util.secuenciaTurno(turno)){
				
						raizTurno.hijoIzq.eliminar(turno,paciente);
						
			}else if(Util.secuenciaTurno(raizTurno.hora) < Util.secuenciaTurno(turno)){	
				
						raizTurno.hijoDer.eliminar(turno,paciente);
						
			}
		}
	}

	@Override
	public String turno() {
		return raizTurno.hora;
	}

	@Override
	public String paciente() {
		return raizTurno.paciente;
	}

	@Override
	public ABBTurnosTDA hijoIzq() {
		return raizTurno.hijoIzq;
	}

	@Override
	public ABBTurnosTDA hijoDer() {
		return raizTurno.hijoDer;
	}

	@Override
	public boolean arbolVacio() {
		return raizTurno == null;
	}
	
	private String mayorTurno(ABBTurnosTDA arbol){
		if(arbol.hijoDer().arbolVacio()){
			return arbol.turno();
		}else{
			return mayorTurno(arbol.hijoDer());
		}
	}
	
	private String menorTurno(ABBTurnosTDA arbol){
		if(arbol.hijoIzq().arbolVacio()){
			return arbol.turno();
		}else{
			return menorTurno(arbol.hijoIzq());
		}
	}

}
