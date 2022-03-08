
public class Ponto {

	private int x;
	private int y;
	
	// Métodos Getters e Setters
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	// Métodos construtores
	
	public Ponto() {
		this.x = 0;
		this.y = 0;
	
	}
	
	public Ponto (int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	// Métodos de comparação entre os valores dos pontos
	
	public boolean verificacao(Ponto ponto) {
		if (this.x == ponto.x && this.y  == ponto.y) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean verificacao(int x , int y) {
		if (this.x == x && this.y ==y) {
			return true;
		} else {
			return false;
		}
	}
	
	// Métodos de calculo da distancia entre os pontos
	
	public double distancia(Ponto ponto) {
		double distanciaxy = Math.sqrt(Math.pow(this.x - this.y, 2) + Math.pow(ponto.x - ponto.y, 2));
		return distanciaxy;
	}
	
	public double distancia(int x, int y) {
		double distanciaxy = Math.sqrt(Math.pow(this.x - this.y, 2) + Math.pow(x - y, 2));
		return distanciaxy;
	}
	
}
