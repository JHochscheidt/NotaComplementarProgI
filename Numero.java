class Numero{
	private int valor;
	
	
	public Numero(){
	
	}
	
	
	public Numero(int v){
		this.valor = v;
	}
	
	
	public void setValor(int v){
		this.valor = v;
	}
	
	public int getValor(){
		return this.valor;
	}
		
	public void setValor(String s){
		if(s.equals("zero")){
			this.valor = 0;
		}
		
		if(s.equals("um")){
			this.valor = 1;
		}
		if(s.equals("dois")){
			this.valor = 2;
		}
		
	}
	public Numero(String s){
		if(s.equals("zero")){
			this.valor = 0;
		}
		
		if(s.equals("um")){
			this.valor = 1;
		}
		if(s.equals("dois")){
			this.valor = 2;
		}
		
	}
	
	
	
	
	
	


}
