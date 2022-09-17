package pruebas_ps;

public class ComparadorNumeros {
	
	//atributos
	private float numero1;
	private float numero2;
	private float numero3;
	
	//inicializar atributos
	public ComparadorNumeros() {
		super();
		this.numero1 = 0;
		this.numero2 = 0;
		this.numero3 = 0;
	}
	
	//Recibe objeto de tipo Triangulo para obtener su lado mayor
	public ComparadorNumeros(Triangulo tg) {
		super();
		this.numero1 = tg.getLadoA();
		this.numero2 = tg.getLadoB();
		this.numero3 = tg.getLadoC();
	}
	
	// ---------- getters and setters ---------
	public float getNumero1() {
		return numero1;
	}

	public void setNumero1(float numero1) {
		this.numero1 = numero1;
	}

	public float getNumero2() {
		return numero2;
	}

	public void setNumero2(float numero2) {
		this.numero2 = numero2;
	}

	public float getNumero3() {
		return numero3;
	}

	public void setNumero3(float numero3) {
		this.numero3 = numero3;
	}
	
	
	//----- class methods ---
	
	public float CalcularMenor() {
		//metodo para calcular el menor de tres numeros
		float menor = 0;
		if(this.numero1 <= this.numero2) {
			if(this.numero1 <= this.numero3) {
				menor = this.numero1;
			}else {
				menor = this.numero3;
			}
		}
		else if(this.numero2 <= this.numero3) {
			menor = this.numero2;
			
		}else {
			menor = this.numero3;
		}
		return menor;
	}

	public float CalcularMayor() {
		//metodo para calcular el mayor de tres numeros
		float mayor = 0;
		if(this.numero1 >= this.numero2) {
			if(this.numero1 >= this.numero3) {
				mayor = this.numero1;
			}else {
				mayor = this.numero3;
			}
		}
		else if(this.numero2 >= this.numero3) {
			mayor = this.numero2;
		}
		else {
			mayor = this.numero3;
		}
		return mayor;
	}
}