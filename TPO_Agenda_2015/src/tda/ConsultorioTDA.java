package tda;

public interface ConsultorioTDA {
	
	/**
	 * inicializa la estructura
	 * */
	public void inicializar();
	
	/**
	 * No debe existir el turno para poder agregarlo.
	 * Agrega un turno para un paciente determinado para un medico determinado en una fecha determinada
	 * y en el horario solicitado siempre que el mismo sea v�lido. De no ser as� no hace nada.
	 * Si el medico no existe lo agrega y agrega la fecha y despues el turno y paciente para esa fecha
	 * Si existe el m�dico y no la fecha agrega la fecha y despues el turno y paciente para esa fecha
	 * Si existe el m�dico y la fecha, agrega el turno y paciente para esa fecha.
	 * */
	public void agregar(String medico, String fecha, String hora, String paciente);
	
	/**
	 * Debe existir el turno y estar asociado a ese paciente para poder eliminarlo.
	 * */
	public void eliminarTurno(String medico, String fecha, String turno, String paciente);

	/**
	 * Si el m�dico o la fecha no existe no hace nada. Si existen borra la fecha de ese m�dico con todos 
	 * los turnos aociados.
	 * */
	public void eliminarFecha(String medico, String fecha);
	
	/**
	 * Si el m�dico no existe no hace nada. Si existe elimina al medico con todas las fechas y 
	 * turnos asociados.
	 * */
	public void eliminarMedico(String medico);
	
	/**
	 * Devuelve el conjunto de todos los m�dicos en la estrctura 
	 * */
	public ConjuntoTDA medicos();
	
	/**
	 * Devuelve el conjunto de todas las fechas de un m�dico en la estrctura 
	 * */
	public ConjuntoTDA fechas(String medico);
	
	/**
	 * Devuelve todos los turnos de un medico en una fecha ordenados cronologicamente
	 * como valor de la cola con prioridad coloque al paciente y como prioridad al turno 
	 * */
	public ColaPrioridadTDA turnos(String medico, String fecha);
		
}
