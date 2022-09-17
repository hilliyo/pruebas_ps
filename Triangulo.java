package pruebas_ps;

public class Triangulo {
	
	private float ladoA;
	private float ladoB;
	private float ladoC;
	private ComparadorNumeros comparador;
	
	//inicializar atributos
	public Triangulo() {
		super();
		this.ladoA = 0;
		this.ladoB = 0;
		this.ladoC = 0;
	}
	
	//-----getters and setters
	
	public float getLadoA() {
		return ladoA;
	}
	public void setLadoA(float ladoA) {
		this.ladoA = ladoA;
	}
	public float getLadoB() {
		return ladoB;
	}
	public void setLadoB(float ladoB) {
		this.ladoB = ladoB;
	}
	public float getLadoC() {
		return ladoC;
	}
	public void setLadoC(float ladoC) {
		this.ladoC = ladoC;
	}
	
	// --- class methods
	public float obtenerLadoMayor() {
		float mayor;
		comparador = new ComparadorNumeros(this);
		mayor = comparador.CalcularMayor();
		return mayor;
	}
	
	public boolean esEquilatero() {
		boolean esEquilatero = false;
		if(this.ladoA == this.ladoB && this.ladoA == this.ladoC) {
			esEquilatero = true;
		}
		return esEquilatero;
	}
	
}
