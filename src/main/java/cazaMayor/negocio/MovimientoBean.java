package cazaMayor.negocio;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="movimientos")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class MovimientoBean {
	
	@Id
	@Column(name="Codigo")
	private int codigo;
	@Column(name="Hora")
	private String hora;
	@Column(name="Fecha")
	private String fecha;
	@Column(name="Tipo")
	private String tipo;
	
	@ManyToOne
	private IndividuoBean individuo;
	
	@ManyToOne
	private TorretaBean torreta;
	
	@ManyToMany(mappedBy="movimientos")
	private List <InformeBean> informes = new ArrayList <InformeBean>();
	
	
	
	public TorretaBean getTorreta() {
		return torreta;
	}
	public void setTorreta(TorretaBean torreta) {
		this.torreta = torreta;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getHora() {
		return hora;
	}
	public void setHora(String hora) {
		this.hora = hora;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public IndividuoBean getIndividuo() {
		return individuo;
	}
	public void setIndividuo(IndividuoBean individuo) {
		this.individuo = individuo;
	}
	public List<InformeBean> getInformes() {
		return informes;
	}
	public void setInformes(List<InformeBean> informes) {
		this.informes = informes;
	}
	
	
}
