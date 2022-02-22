package ec.edu.uce.servise;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.Consumo;
import ec.edu.uce.modelo.TarjetaDeCredito;

@Service
public class GestorTransaccionServiImpl implements IGestorTransaccionServi {

	@Autowired
	private IConsumoServi consumoServi;
	
	@Autowired
	private ITarjetaDeCreditoServi tarjetaDeCreditoServi;
	
	@Override
	@Transactional
	public void transaccionCompraConTarjeta(TarjetaDeCredito tarjetaDeCredito, BigDecimal valorConsumo) {
		// TODO Auto-generated method stub
		TarjetaDeCredito tarjeta = this.tarjetaDeCreditoServi.obtenerTarjetaDeCredito(tarjetaDeCredito.getId());
		
		Consumo consumo = new Consumo();
		consumo.setValor(valorConsumo);
		consumo.setFecha(LocalDateTime.now());
		consumo.setTarjetaDeCredito(tarjeta);
		
		this.consumoServi.insertarConsumo(consumo);
		
		tarjeta.setCupo(tarjeta.getCupo().subtract(valorConsumo));
		tarjeta.getConsumo().add(consumo);
		
		this.tarjetaDeCreditoServi.actualizarTarjetaDeCredito(tarjeta);
	}
	
}
