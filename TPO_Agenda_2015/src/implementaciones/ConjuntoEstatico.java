package implementaciones;

import tda.ConjuntoTDA;

public class ConjuntoEstatico implements ConjuntoTDA {
	String[] conjunto;
	int cantidad;

	@Override
	public void inicializar() {
		conjunto = new String[100];
		cantidad = 0;
	}

	@Override
	public boolean conjuntoVacio() {
		return cantidad ==0;
	}

	@Override
	public void agregar(String valor) {
		if(!this.pertenece(valor)){
			conjunto[cantidad]=valor;
			cantidad++;
		}
	}

	@Override
	public String elegir() {
		return conjunto[cantidad - 1];
	}

	@Override
	public void sacar(String valor) {
		int i = 0;
		while(i < cantidad && conjunto[i] != valor){
			i++;
		}
		if(i < cantidad){
			conjunto[i] = conjunto[cantidad - 1];
			cantidad--;
		}
	}

	@Override
	public boolean pertenece(String valor) {
		int i = 0;
		while(i < cantidad && conjunto[i] != valor){
			i++;
		}
		return (i < cantidad);
	}

}
