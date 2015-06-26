class Colecao{
	
	public Numero[] numeros; 
	public int n;
	
	public Colecao(){
		numeros = new Numero[10000];
	}
	
	public void addNumero(int a){
		numeros[n].setValor(a); 
		n++;
	}
	
	public int getValor(){
		if(n == 0) return 0;
		n--;
		return numeros[n].getValor();
	}
	
	
	public void imprimeColecao(){
		
	}
	
	
}
