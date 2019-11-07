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
@Table(name="Especies")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)

public class EspecieBean {
	@Id
	@Column(name="Codigo")
	private int codigo;
	@Column(name="Nombre")
	private String nombre;
	@Column(name="Tipo")
	private String tipo;
	@Column(name="Periodos")
	private String periodos;
	@Column(name="Caracteristicas")
	private String caracteristicas;
	
	
	
	@OneToMany(mappedBy="especie")
	private List <IndividuoBean> personajes = new ArrayList<IndividuoBean>();
	
	public void addIndividuo(IndividuoBean personaje) {
		if(!personajes.contains(personaje)) {
			personajes.add(personaje);
			personaje.setEspecie(this);
		}
	}
	
	
	
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getPeriodos() {
		return periodos;
	}
	public void setPeriodos(String periodos) {
		this.periodos = periodos;
	}
	public String getCaracteristicas() {
		return caracteristicas;
	}
	public void setCaracteristicas(String caracteristicas) {
		this.caracteristicas = caracteristicas;
	}

	public List<IndividuoBean> getPersonajes() {
		return personajes;
	}


	public void setPersonajes(List<IndividuoBean> personajes) {
		this.personajes = personajes;
	}
}
