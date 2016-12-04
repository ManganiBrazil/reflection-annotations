package com.mangani.refletion.annotations.main;

import java.util.Map;

import com.mangani.refletion.annotations.GeradorMapa;
import com.mangani.refletion.annotations.beans.Produto;

public class MainProduto {
	
	public static void main(String[] args) {
		Produto produto = new Produto("Design Patterns", "LIVRO", 59.9, "Publicado por Mangani TI");
		Map<String, Object> props = GeradorMapa.gerarMapa(produto);
		for (String prop : props.keySet()) {
			System.out.println(prop + " = " + props.get(prop));
		}
				
	}

}
