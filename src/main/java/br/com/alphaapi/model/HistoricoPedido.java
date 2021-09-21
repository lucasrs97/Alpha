package br.com.alphaapi.model;

import java.util.GregorianCalendar;

public class HistoricoPedido extends Pedido{

	private static final long serialVersionUID = -5570216424673351707L;
	
	private GregorianCalendar horaEncerramento;

	public GregorianCalendar getHoraEncerramento() {
		return horaEncerramento;
	}

	public void setHoraEncerramento(GregorianCalendar horaEncerramento) {
		this.horaEncerramento = horaEncerramento;
	}
}
