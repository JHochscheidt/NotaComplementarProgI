import java.util.Scanner;


class Exercicio2 {


	public static void main(String[] args){
		
		
		int n;
		Scanner s = new Scanner(System.in);
		Numero cont = new Numero();
		Numero um = new Numero("um");
		Colecao c = new Colecao();
		
		System.out.println("Informe N");
		n = s.nextInt();
		
		for( ; cont.getValor() < n; cont.setValor(cont.getValor() + um.getValor())){
			c.addNumero(s.nextInt());		
		}
		for( ; cont.getValor() < n; cont.setValor(cont.getValor() + um.getValor())){
			System.out.println(c.getValor());
		}
		
		
		
		
	
	
	}

}
