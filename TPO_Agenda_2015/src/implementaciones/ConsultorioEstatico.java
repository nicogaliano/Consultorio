package implementaciones;

import tda.ColaPrioridadTDA;
import tda.ConjuntoTDA;
import tda.ConsultorioTDA;

public class ConsultorioEstatico implements ConsultorioTDA {

	@Override
	public void inicializar() {
		// TODO Auto-generated method stub

	}

	@Override
	public void agregar(String medico, String fecha, String hora,
			String paciente) {
		// TODO Auto-generated method stub

	}

	@Override
	public void eliminarTurno(String medico, String fecha, String turno,
			String paciente) {
		// TODO Auto-generated method stub

	}

	@Override
	public void eliminarFecha(String medico, String fecha) {
		// TODO Auto-generated method stub

	}

	@Override
	public void eliminarMedico(String medico) {
		// TODO Auto-generated method stub

	}

	@Override
	public ConjuntoTDA medicos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ConjuntoTDA fechas(String medico) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ColaPrioridadTDA turnos(String medico, String fecha) {
		// TODO Auto-generated method stub
		return null;
	}

}
