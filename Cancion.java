package clases;
/*
 * Creador: Dealbera Juan Pablo
 * */
public class Cancion {
	//Atributos 
	private String nombre;
	private float duracion;
	private float ponderacion;
	
	//Constructor con parametros nombre y duracion, ademas la ponderacion se inicia en 1
	public Cancion (String nombre, float duracion) {
		this.nombre = nombre;
		this.duracion = duracion;
		this.ponderacion = 1;
	}
	//Getters
	public String getNombre() {
		return nombre;
	}

	public float getDuracion() {
		return duracion;
	}

	public float getPonderacion() {
		return ponderacion;
	}
	//Aumentar ponderacion que dererminara la probabilidad
	public void aumentarPonderacion (float p) {
		this.ponderacion += p;
	}

	

}
