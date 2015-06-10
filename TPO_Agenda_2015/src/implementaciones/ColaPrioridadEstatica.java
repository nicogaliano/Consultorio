package implementaciones;

import algoritmos.Util;
import tda.ColaPrioridadTDA;

public class ColaPrioridadEstatica implements ColaPrioridadTDA {
	private int cantidad;
	private String[] pacientes;
	private String[] turnos;

	@Override
	public void inicializar() {
		cantidad 	= 0;
		pacientes 	= new String[100];
		turnos		= new String[100];
	}

	@Override
	public void acolar(String paciente, String turno) {
		 int j = cantidad;
		 for(; j > 0 && Util.secuenciaTurno(turnos[j - 1]) >=Util.secuenciaTurno(turno); j--){
			 pacientes[j] 	= pacientes[j - 1];
			 turnos[j] 		= turnos[j - 1];
		 }
		 pacientes[j] 	= paciente;
		 turnos[j]		= turno;
		 cantidad++;
	}

	@Override
	public void dasacolar() {
		for(int i =0;i < cantidad - 1;i++){
			pacientes[i] 	= pacientes[i + 1];
			turnos[i]		= turnos[i+1];
		}
		cantidad--;
	}

	@Override
	public String paciente() {
		return pacientes[0];
	}

	@Override
	public String turno() {
		return turnos[0];
	}

	@Override
	public boolean colaVacia() {
		return cantidad == 0;
	}

}
