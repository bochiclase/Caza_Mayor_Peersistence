package cazaMayor.negocio;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Torreta")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class TorretaBean {
	@Id
	@Column(name="Codigo")
	private int codigo;
	@Column(name="Ubicacion")
	private String ubicacion;
	@Column(name="nombre")
	private String nombre;
	
	
	
	@OneToMany(mappedBy="torreta")
	List <MovimientoBean> movimientos = new ArrayList<MovimientoBean>();

	
	public void addMovimientos(MovimientoBean movimiento) {
		if(!movimientos.contains(movimiento)) {
			movimientos.add(movimiento);
			movimiento.setTorreta(this);
		}
	}


	public int getCodigo() {
		return codigo;
	}


	public void setCodigo(int
			codigo) {
		this.codigo = codigo;
	}


	public String getUbicacion() {
		return ubicacion;
	}


	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public List<MovimientoBean> getMovimientos() {
		return movimientos;
	}


	public void setMovimientos(List<MovimientoBean> movimientos) {
		this.movimientos = movimientos;
	}
	
	
}
