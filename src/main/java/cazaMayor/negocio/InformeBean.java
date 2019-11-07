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
@Table(name="Informes")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class InformeBean {

	@Id
	@Column(name="Codigo")
	private int codigo;
	@Column(name="fecha")
	private String fecha;
	
	@ManyToMany
	private List <MovimientoBean> movimientos = new ArrayList <MovimientoBean>();
	
	public void addMovimientos(MovimientoBean movi) {
		if(!movimientos.contains(movi)) {
			movimientos.add(movi);
			List <InformeBean> informes = movi.getInformes();
			if(!informes.contains(this)) {
				informes.add(this);
				movi.setInformes(informes);
				
			}
		}
	}
	
	@ManyToMany
	private List <BiologosBean> biologos= new ArrayList <BiologosBean>();
	
	public void addBiologos(BiologosBean biologo) {
		if (!biologos.contains(biologo)) {
			 biologos.add(biologo);
			 List <InformeBean> info= biologo.getInformes();
			 if(!info.contains(this)) {
				 info.add(this);
				 biologo.setInformes(info);
			 }
			 
		}
	}
	
	
	public List<BiologosBean> getBiologos() {
		return biologos;
	}


	public void setBiologos(List<BiologosBean> biologos) {
		this.biologos = biologos;
	}


	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public List<MovimientoBean> getMovimientos() {
		return movimientos;
	}

	public void setMovimientos(List<MovimientoBean> movimientos) {
		this.movimientos = movimientos;
	}
	
	
}
