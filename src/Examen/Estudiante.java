package Examen;

public class Estudiante {
	private String matricula;
	private String apellidos;
	private String nombres;
	private int edad;
	private char sexo;
	private String carrera;
	private int nivel;
	private int creditos;

	// Constructor por defecto
	public Estudiante() {
		this.matricula = "";
		this.apellidos = "";
		this.nombres = "";
		this.edad = 0;
		this.sexo = 'H';
		this.carrera = "";
		this.nivel = 0;
		this.creditos = 0;
	}

	public Estudiante(String matricula, String apellidos, String nombres, int edad, char sexo, String carrera,
			int nivel, int creditos) {
		this.matricula = matricula;
		this.apellidos = apellidos;
		this.nombres = nombres;
		this.edad = edad;
		this.sexo = sexo;
		this.carrera = carrera;
		this.nivel = nivel;
		this.creditos = creditos;
	}

	// Métodos set
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public void setSexo(char sexo) {
		comprobarSexo();
		this.sexo = sexo;
	}

	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}

	public void setCreditos(int creditos) {
		this.creditos = creditos;
	}

	// Método calcularValorpagar
	public double calcularValorpagar() {
		double valorCredito;
		if (this.creditos <= 10) {
			valorCredito = 60;
		} else {
			valorCredito = 55;
		}
		return this.creditos * valorCredito;
	}

	// Método comprobarHorario
	public int comprobarHorario() {
		if (this.nivel >= 1 && this.nivel <= 3) {
			return 0;
		} else if (this.nivel >= 4 && this.nivel <= 8) {
			return 1;
		} else {
			return -1;
		}
	}

	// Método esMayorDeEdad
	public boolean esMayorDeEdad() {
		return this.edad >= 18;
	}

	// Método comprobarSexo
	public void comprobarSexo() {
		if (this.sexo != 'H' || this.sexo != 'M' || this.sexo != 'h' || this.sexo != 'm') {
			this.sexo = 'H';
		}
	}

	// Método toString
	@Override
	public String toString() {
		return "Estudiante [matricula=" + matricula + ", apellidos=" + apellidos + ", nombres=" + nombres + ", edad="
				+ edad + ", sexo=" + sexo + ", carrera=" + carrera + ", nivel=" + nivel + ", creditos=" + creditos
				+ "]";
	}

}