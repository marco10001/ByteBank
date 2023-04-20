package br.com.alura;

import java.util.ArrayList;

import java.util.Collections;
import java.util.Comparator;

public class Ejemplo2 {

	public static void main(String[] args) {
		String clase1="Geometria";
		String clase2="Fisica";
		String clase3="Historia";
		String clase4="Matematica";
		
		ArrayList<String> list= new ArrayList<>();
		list.add(clase1);
		list.add(clase2);
		list.add(clase3);
		list.add(clase4);
		
		System.out.println(list);
		System.out.println("ahora la lista ordenada de manera descendente");
		Collections.sort(list,Collections.reverseOrder());
		System.out.println(list);
		System.out.println("ahora la lista ordenada de manera ascendente");
		list.sort(Comparator.naturalOrder());
		System.out.println(list);
	}
	
}
