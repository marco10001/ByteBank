package br.com.alura;

import java.util.ArrayList;

import java.util.Collections;
import java.util.Comparator;

import javax.naming.ldap.SortControl;

import model.Curso;

public class Ejemplo4 {

	public static void main(String[] args) {
	
		Curso curso1=new Curso("java",30);
		Curso curso2=new Curso("php",29);
		Curso curso3=new Curso("haskell",40);
		Curso curso4=new Curso("ruby",15);
		
		
		ArrayList<Curso> cursos=new ArrayList<>();
		
		cursos.add(curso1);
		cursos.add(curso2);
		cursos.add(curso3);
		cursos.add(curso4);
		
		System.out.println(cursos);
		
		Collections.sort(cursos);
		
		System.out.println(cursos);
		
		
		
		
		
		
		
		
	}
	
}
