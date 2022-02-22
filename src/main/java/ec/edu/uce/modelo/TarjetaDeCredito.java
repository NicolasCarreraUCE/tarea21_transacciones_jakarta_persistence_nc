package ec.edu.uce.modelo;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "tarjeta_credito")
public class TarjetaDeCredito {

	@Id
	@Column(name = "tacr_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_tarjeta_credito")
	@SequenceGenerator(name = "seq_tarjeta_credito", sequenceName = "seq_tarjeta_credito", allocationSize = 1)
	private Integer id;
	
	@Column(name = "tacr_numero")
	private String numero;
	
	@Column(name = "tacr_cedula_propietario")
	private String cedulaPropietario;
	
	@Column(name = "tacr_cupo")
	private BigDecimal cupo;
	
	
	@OneToMany(mappedBy = "tarjetaDeCredito", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private List<Consumo> consumo;

	// SET-GET
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getCedulaPropietario() {
		return cedulaPropietario;
	}

	public void setCedulaPropietario(String cedulaPropietario) {
		this.cedulaPropietario = cedulaPropietario;
	}

	public BigDecimal getCupo() {
		return cupo;
	}

	public void setCupo(BigDecimal cupo) {
		this.cupo = cupo;
	}

	public List<Consumo> getConsumo() {
		return consumo;
	}

	public void setConsumo(List<Consumo> consumo) {
		this.consumo = consumo;
	}
	
}
