package ec.edu.uce.repository;

import ec.edu.uce.modelo.TarjetaDeCredito;

public interface ITarjetaDeCreditoRepo {
	void insertarTarjetaDeCredito(TarjetaDeCredito tarjetaDeCredito);
	void actualizarTarjetaDeCredito(TarjetaDeCredito tarjetaDeCredito);
	TarjetaDeCredito obtenerTarjetaDeCredito(Integer id);
}
