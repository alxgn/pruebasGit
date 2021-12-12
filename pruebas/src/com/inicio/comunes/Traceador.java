package com.inicio.comunes;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Traceador {
	private String getFechaHoraActual() {
		String fechaHora = "";
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        fechaHora=dtf.format(LocalDateTime.now());
        return fechaHora;
	}
	
	public void tracea(String texto) {
		System.out.println(getFechaHoraActual().concat(" ").concat(texto));
	}
}
