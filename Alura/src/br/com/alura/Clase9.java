package br.com.alura;

import java.util.ArrayList;

import java.util.Collections;
import java.util.Comparator;

import javax.naming.ldap.SortControl;

import model.Aula;
import model.Curso;

public class Clase9 {

	public static void main(String[] args) {
	
		Curso curso1=new Curso("java",30,new ArrayList<>());
		curso1.addAula(new Aula("ArrayList", 10));
		curso1.addAula(new Aula("List", 10));
		curso1.addAula(new Aula("LinkedList", 10));
		curso1.addAula(new Aula("Inmodificable",20));
		
		ArrayList<Curso> cursos=new ArrayList<>();
		
		cursos.add(curso1);
		
		
		System.out.println(cursos.get(0).getAulaList());
		

	
		
		
		
		
		
		
	}
	
}
