package ec.edu.uce.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.TarjetaDeCredito;

@Repository
@Transactional
public class TarjetaDeCreditoRepoImpl implements ITarjetaDeCreditoRepo {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertarTarjetaDeCredito(TarjetaDeCredito tarjetaDeCredito) {
		// TODO Auto-generated method stub
		this.entityManager.persist(tarjetaDeCredito);
	}

	@Override
	public void actualizarTarjetaDeCredito(TarjetaDeCredito tarjetaDeCredito) {
		// TODO Auto-generated method stub
		this.entityManager.merge(tarjetaDeCredito);
	}

	@Override
	public TarjetaDeCredito obtenerTarjetaDeCredito(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(TarjetaDeCredito.class, id);
	}
	
}
