package ec.edu.uce.servise;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.Consumo;
import ec.edu.uce.repository.IConsumoRepo;

@Service
public class ConsumoServiImpl implements IConsumoServi {

	@Autowired
	private IConsumoRepo consumoRepo;
	
	@Override
	public void insertarConsumo(Consumo consumo) {
		// TODO Auto-generated method stub
		this.consumoRepo.insertarConsumo(consumo);
	}

	@Override
	public void actualizarConsumo(Consumo consumo) {
		// TODO Auto-generated method stub
		this.consumoRepo.actualizarConsumo(consumo);
	}

}
