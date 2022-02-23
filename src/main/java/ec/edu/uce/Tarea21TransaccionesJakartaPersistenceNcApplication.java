package ec.edu.uce;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ec.edu.uce.modelo.TarjetaDeCredito;
import ec.edu.uce.servise.IGestorTransaccionServi;
import ec.edu.uce.servise.ITarjetaDeCreditoServi;

@SpringBootApplication
public class Tarea21TransaccionesJakartaPersistenceNcApplication implements CommandLineRunner {

	@Autowired
	private ITarjetaDeCreditoServi tarjetaDeCreditoServi;
	
	@Autowired
	private IGestorTransaccionServi gestorTransaccionServi;
	
	public static void main(String[] args) {
		SpringApplication.run(Tarea21TransaccionesJakartaPersistenceNcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		TarjetaDeCredito targeta = new TarjetaDeCredito();
		targeta.setId(1);
		targeta.setNumero("123456789");
		targeta.setCedulaPropietario("1727450684");
		targeta.setCupo(new BigDecimal("600"));
		
		//this.tarjetaDeCreditoServi.insertarTarjetaDeCredito(targeta);
		
		this.gestorTransaccionServi.transaccionCompraConTarjeta(targeta, new BigDecimal("100"));
	}

}
