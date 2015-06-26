// Faça um programa que imprima na tela os N primeiros numeros primos existentes.
// O usuário informa N. 

import java.util.Scanner;

class Exercicio1 {
	
	
	
		
		public static void main(String[] args){
		
			Scanner s = new Scanner(System.in);
			Numero n1 = new Numero();
			Numero n2 = new Numero();
			Numero n = new Numero();
			Numero cont = new Numero();
			Numero quantos = new Numero();
			Numero i = new Numero("dois");
			Numero dois = new Numero("dois");
			Numero um = new Numero("um");
			Numero zero = new Numero();
			Numero valor = new Numero();
			
		
			
						
			System.out.println("Informe um intervalo de valores e N, respectivamente");
			n1.setValor(s.nextInt());
			n2.setValor(s.nextInt());
			n.setValor(s.nextInt());
			
			
			for(; i.getValor() < n2.getValor();i.setValor(i.getValor()+ um.getValor())){
				cont.setValor("zero");
				if(i.getValor()>= n1.getValor()){ // eh maior que A -- n1
					valor.setValor(i.getValor());
					while(valor.getValor() > zero.getValor()){
						if(i.getValor()%valor.getValor() == zero.getValor()){
							cont.setValor(cont.getValor() + um.getValor());
						}
						valor.setValor(valor.getValor() - um.getValor());
					}
					if(cont.getValor() <= dois.getValor()){
						quantos.setValor(quantos.getValor()+ um.getValor());
						System.out.println("é primo" + i.getValor());
					}
				}
				
				if(quantos.getValor() == n.getValor()){
					break;	
				}
				
			}
	}
}

