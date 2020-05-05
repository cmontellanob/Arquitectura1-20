package com.mitocode;

import com.mitocode.strategy.AntivirusAvanzado;
import com.mitocode.strategy.AntivirusSimple;
import com.mitocode.strategy.Contexto;

public class App {
	
	public static void main(String[] args) {
		Contexto contexto = new Contexto(new AntivirusSimple());
		contexto.ejecutar();
	}

}
