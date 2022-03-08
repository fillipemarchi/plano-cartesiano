
public class Main {

	public static void main(String[] args) {
		
		
		
		Ponto ponto1 = new Ponto (5,8);
		Ponto ponto2 = new Ponto ();
		
		ponto2.setX(3);
		ponto2.setY(5);
		
		
	
		
		System.out.println(ponto1.verificacao(ponto2));
		System.out.println(ponto2.verificacao(3,5));
		System.out.println(ponto1.distancia(ponto2));
		System.out.println(ponto1.distancia(3,5));
	}

}
