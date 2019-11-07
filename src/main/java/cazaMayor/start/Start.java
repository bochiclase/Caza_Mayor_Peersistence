package cazaMayor.start;

import cazaMayor.modelo.biologos.CreateBiologos;
import cazaMayor.modelo.especie.CreateEspecie;
import cazaMayor.modelo.individuo.CreateIndividuo;
import cazaMayor.modelo.informe.CreateInforme;
import cazaMayor.modelo.movimiento.CreateMovimiento;
import cazaMayor.modelo.torreta.CreateTorreta;
import cazaMayor.negocio.BiologosBean;
import cazaMayor.negocio.EspecieBean;
import cazaMayor.negocio.IndividuoBean;
import cazaMayor.negocio.InformeBean;
import cazaMayor.negocio.MovimientoBean;
import cazaMayor.negocio.TorretaBean;

public class Start {

	public static void main(String[] args) {
		
	
		
		MovimientoBean mov1 = new MovimientoBean();
		mov1.setCodigo(1);
		mov1.setHora("12:50");
		mov1.setFecha("31-08-19");
		mov1.setTipo("Rapido");
		
		MovimientoBean mov2 = new MovimientoBean();
		mov2.setCodigo(2);
		mov2.setHora("14:40");
		mov2.setFecha("2-2-19");
		mov2.setTipo("Lento");
		
		TorretaBean tor1 = new TorretaBean();
		tor1.setCodigo(1);
		tor1.setUbicacion("Zona1");
		tor1.setNombre("Les Praderes");
		
		TorretaBean tor2 = new TorretaBean();
		tor2.setCodigo(2);
		tor2.setUbicacion("Zona2");
		tor2.setNombre("Fumarea");
		/*Lleva métodos*/
		
		tor1.addMovimientos(mov1);
		tor2.addMovimientos(mov2);

		
		
		
		
		BiologosBean bio1 = new BiologosBean();
		bio1.setCodigo(1);
		bio1.setNombre("Fernando");
		bio1.setDireccion("Siero");
		bio1.setProvincia("Asturias");
		bio1.setFecha("12-7-89");
		
		BiologosBean bio2 = new BiologosBean();
		bio2.setCodigo(2);
		bio1.setNombre("Alicia");
		bio1.setDireccion("Gijón");
		bio1.setProvincia("Asturias");
		bio1.setFecha("3-4-78");
		
		
		InformeBean info1 = new InformeBean();
		info1.setCodigo(1);
		info1.setFecha("12-8-20");
		
		InformeBean info2 = new InformeBean();
		info2.setCodigo(2);
		info2.setFecha("14-9-19");
		/*Lleva métodos*/
		
		info1.addBiologos(bio1);
		info2.addBiologos(bio2);
		
		info1.addMovimientos(mov1);
		info2.addMovimientos(mov2);
		
		
		IndividuoBean perso1 = new IndividuoBean();
		perso1.setCodigo(1);
		perso1.setPeso(12);
		perso1.setDimensiones("2x2");
		
		IndividuoBean perso2 = new IndividuoBean();
		perso2.setCodigo(2);
		perso2.setPeso(12);
		perso2.setDimensiones("2x2");
		/*Lleva metodos*/
		
		perso1.addMovimientos(mov1);
		perso2.addMovimientos(mov2);
		
		EspecieBean especie1 = new EspecieBean();
		especie1.setCodigo(1);
		especie1.setNombre("Felino");
		especie1.setTipo("Salvaje");
		especie1.setPeriodos("Primavera-Verano");
		especie1.setCaracteristicas("Son cazadores");
		
		
		EspecieBean especie2 = new EspecieBean();
		especie2.setCodigo(2);
		especie2.setNombre("Roedor");
		especie2.setTipo("Salvaje");
		especie2.setPeriodos("Todo el año");
		especie2.setCaracteristicas("Se alimentan de frutas");
		/*Lleva metodos*/
		
		especie1.addIndividuo(perso1);
		especie2.addIndividuo(perso2);
		
		
		
		
		
		
		
		CreateTorreta insertar_torretas = new CreateTorreta();
		insertar_torretas.create(tor1);
		insertar_torretas.create(tor2);
		
		CreateEspecie insertar_especies = new CreateEspecie();
		insertar_especies.create(especie1);
		insertar_especies.create(especie2);
		
		CreateIndividuo insertar_individuos = new CreateIndividuo();
		insertar_individuos.create(perso1);
		insertar_individuos.create(perso2);
		
		
		CreateBiologos insertar_biologos = new CreateBiologos();
		insertar_biologos.create(bio1);
		insertar_biologos.create(bio2);
		
		
		CreateMovimiento insertar_movimientos = new CreateMovimiento();
		insertar_movimientos.create(mov1);
		insertar_movimientos.create(mov2);
		
		CreateInforme insertar_informes = new CreateInforme();
		insertar_informes.create(info1);
		insertar_informes.create(info2);
		
		
		
		
		
		
		
		
		
		
	}

}
