package cazaMayor.negocio;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Individuos")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class IndividuoBean {
	@Id
	@Column(name="Codigo")
	private int codigo;
	@Column(name="Peso")
	private float peso;
	@Column(name="Dimensiones")
	private String dimensiones;
	
	@ManyToOne
	private EspecieBean especie;
	
	@OneToMany(mappedBy="individuo")
	private List <MovimientoBean> movimientos = new ArrayList<MovimientoBean>();
	
	
	public void addMovimientos(MovimientoBean movi) {
		if(!movimientos.contains(movi)) {
			movimientos.add(movi);
			movi.setIndividuo(this);
		}
	}
	
	
	public List<MovimientoBean> getMovimientos() {
		return movimientos;
	}


	public void setMovimientos(List<MovimientoBean> movimientos) {
		this.movimientos = movimientos;
	}


	public EspecieBean getEspecie() {
		return especie;
	}
	public void setEspecie(EspecieBean especie) {
		this.especie = especie;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public String getDimensiones() {
		return dimensiones;
	}
	public void setDimensiones(String dimensiones) {
		this.dimensiones = dimensiones;
	}
	
	
}
