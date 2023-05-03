package main;
//cuer´po de la clase
public class metodos {
	int num1;//atributos de la clase operaciones
	int num2;
	public metodos() {//constructor
		
	}
	public metodos(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	// metodos getter and setter
	public int getNum1() {
		return num1;
	}
	public void setNum1(int num1){
		this.num1 = num1;
	}
	public int getNum2() {
		return num2;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	public static int suma(int num1,int num2) {
		int suma= num1+num2;
		return suma;
	}
	public static int resta(int num1,int num2)
	 {
		int resta = num1-num2;
		return resta;
	}
	
}

