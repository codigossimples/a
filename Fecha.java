package Agenda;

import java.text.SimpleDateFormat;
import java.util.*;

public class Fecha {
    GregorianCalendar fecha;
    
    public Fecha(int dia, int mes, int a�o) {
    	fecha = new GregorianCalendar(a�o, mes-1, dia);
    }

	/**
	 * @return el dia
	 */
	public int getDia() {
		return fecha.get(fecha.DAY_OF_MONTH);
	}

	/**
	 * @param dia el dia a establecer
	 */
	public void setDia(int dia) {
		this.fecha.set(Calendar.DAY_OF_MONTH, dia); 
	}

	/**
	 * @return el mes
	 */
	public int getMes() {
		return this.fecha.get(fecha.MONTH);
		
	}

	/**
	 * @param mes el mes a establecer
	 */
	public void setMes(int mes) {
		this.fecha.set(Calendar.MONTH, mes);
	}

	/**
	 * @return el a�o
	 */
	public int getA�o() {
		return this.fecha.get(fecha.YEAR);
	}

	/**
	 * @param a�o el a�o a establecer
	 */
	public void setA�o(int a�o) {
		this.fecha.set(Calendar.YEAR, a�o); 
	}
    
    public String getFechaFormateada() {
    	SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
    	return formato.format(fecha.getTime());
    }
}

