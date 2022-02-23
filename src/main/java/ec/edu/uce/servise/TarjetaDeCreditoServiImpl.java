package ec.edu.uce.servise;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.TarjetaDeCredito;
import ec.edu.uce.repository.ITarjetaDeCreditoRepo;

@Service
public class TarjetaDeCreditoServiImpl implements ITarjetaDeCreditoServi {

	private static final Logger LOG = LoggerFactory.getLogger(TarjetaDeCreditoServiImpl.class);
	
	@Autowired
	private ITarjetaDeCreditoRepo tarjetaDeCreditoRepo;
		
	@Override
	public void insertarTarjetaDeCredito(TarjetaDeCredito tarjetaDeCredito) {
		// TODO Auto-generated method stub
		this.tarjetaDeCreditoRepo.insertarTarjetaDeCredito(tarjetaDeCredito);
	}

	@Override
	public void actualizarTarjetaDeCredito(TarjetaDeCredito tarjetaDeCredito) {
		// TODO Auto-generated method stub
		this.tarjetaDeCreditoRepo.actualizarTarjetaDeCredito(tarjetaDeCredito);
	}

	@Override
	public TarjetaDeCredito obtenerTarjetaDeCredito(Integer id) {
		// TODO Auto-generated method stub
		try {
			throw new RuntimeException();
		} catch (RuntimeException e) {
			// TODO: handle exception
			LOG.error("ERROR NO PROPAGADO");
		}
		return this.tarjetaDeCreditoRepo.obtenerTarjetaDeCredito(id);
	}

}
