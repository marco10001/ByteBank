package br.com.alura;

import java.util.ArrayList;

public class Ejemplo1 {

	public static void main(String[] args) {
		String variable1="ejemplo1";
		String variable2="ejemplo2";
		String variable3="ejemplo3";
		String variable4="ejemplo4";
		
		ArrayList<String> list= new ArrayList<>();
		list.add(variable1);
		list.add(variable2);
		list.add(variable3);
		list.add(variable4);
		list.remove(2);
		System.out.println(list);
		
	}
	
}
