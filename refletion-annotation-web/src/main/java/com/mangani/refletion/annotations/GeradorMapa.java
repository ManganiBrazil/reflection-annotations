package com.mangani.refletion.annotations;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class GeradorMapa {
	
	public static Map<String, Object> gerarMapa(Object o){
		Class<?> classe = o.getClass();
		Map<String, Object> mapa = new HashMap<String, Object>();
		
		try {
			for (Method m : classe.getMethods()) {
				if(isGetter(m)){
					String propriedade = deGetterParaPropriedade(m.getName());
					Object valor = m.invoke(o);
					mapa.put(propriedade, valor);
				}
			}
		} catch (Exception e) {
			throw new RuntimeException(e);
		} 
		
		return mapa;
	}
	
	private static String deGetterParaPropriedade(String name) {
		StringBuilder retorno = new StringBuilder();
		retorno.append(name.substring(3, 4).toLowerCase());
		retorno.append(name.substring(4));
		return retorno.toString();
	}

	private static boolean isGetter(Method m){
		return m.getName().startsWith("get") &&
				m.getReturnType() != void.class &&
				m.getParameterTypes().length == 0;
	}

}
