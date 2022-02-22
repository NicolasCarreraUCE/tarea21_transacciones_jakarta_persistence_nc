package ec.edu.uce.servise;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.TarjetaDeCredito;
import ec.edu.uce.repository.ITarjetaDeCreditoRepo;

@Service
public class TarjetaDeCreditoServiImpl implements ITarjetaDeCreditoServi {

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
		return this.tarjetaDeCreditoRepo.obtenerTarjetaDeCredito(id);
	}

}
