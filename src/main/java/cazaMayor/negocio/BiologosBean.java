package cazaMayor.negocio;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="Biologos")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class BiologosBean {
	
	@Id
	@Column(name="Codigo")
	private int codigo;
	@Column(name ="Nombre")
	private String nombre;
	@Column(name ="Direccion")
	private String direccion;
	@Column(name ="Provincia")
	private String provincia;
	@Column(name ="Fecha")
	private String fecha;
	
	@ManyToMany(mappedBy="biologos")
	private List <InformeBean> informes = new ArrayList <InformeBean>();

	
	
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

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public List<InformeBean> getInformes() {
		return informes;
	}

	public void setInformes(List<InformeBean> informes) {
		this.informes = informes;
	}
	
	
}
