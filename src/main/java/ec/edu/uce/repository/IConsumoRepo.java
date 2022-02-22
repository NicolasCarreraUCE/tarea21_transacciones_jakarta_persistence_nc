package ec.edu.uce.repository;


import ec.edu.uce.modelo.Consumo;

public interface IConsumoRepo {
	void insertarConsumo(Consumo consumo);
	void actualizarConsumo(Consumo consumo);
}
