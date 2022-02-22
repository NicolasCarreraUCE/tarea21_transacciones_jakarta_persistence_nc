package ec.edu.uce.servise;

import java.math.BigDecimal;

import ec.edu.uce.modelo.TarjetaDeCredito;

public interface IGestorTransaccionServi {
	void transaccionCompraConTarjeta(TarjetaDeCredito tarjetaDeCredito, BigDecimal valorConsumo);
}
