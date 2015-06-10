package algoritmos;

public final class Util {
	
	/**
	 * Recibe un turno en formato HH:MM y devuelve un id
	 * @param turno
	 * @return secuenciaTurno
	 */
	public static int secuenciaTurno(String turno){
		int id = 0;
		int i = 0;
		String[] turnos = {"08:00","08:30","09:00","09:30","10:00","10:30",
						   "11:00","11:30","12:00","12:30","13:00","13:30",
						   "14:00","14:30","15:00","15:30","16:00","16:30",
						   "17:00","17:30","18:00","18:30","19:00","19:30"};
		
		while(turnos.length > i){
			if(turnos[i] == turno){
				id = i;
				break;
			}
			i++;
		}	
		return id;
	}

}
