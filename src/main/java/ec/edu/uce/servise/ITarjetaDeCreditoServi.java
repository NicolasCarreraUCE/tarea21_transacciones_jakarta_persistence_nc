package ec.edu.uce.servise;

import ec.edu.uce.modelo.TarjetaDeCredito;

public interface ITarjetaDeCreditoServi {
	void insertarTarjetaDeCredito(TarjetaDeCredito tarjetaDeCredito);
	void actualizarTarjetaDeCredito(TarjetaDeCredito tarjetaDeCredito);
	TarjetaDeCredito obtenerTarjetaDeCredito(Integer id);
}
