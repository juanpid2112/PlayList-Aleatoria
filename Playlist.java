package clases;

import java.util.ArrayList;
/*
 * Creador: Dealbera Juan Pablo
 * */
public class Playlist {
	//Lista que contendra las canciones
	private ArrayList<Cancion> lista;
	
	//Constructor con parametros, el cual inicia la lista
	public Playlist () {
		lista = new ArrayList<Cancion>();
	}
	//Metodo que recibe una cancion por parametro y si no se encuentra la agrega
	public void agregarCancion (Cancion c) {
		if (lista.indexOf(c) == -1) {
			lista.add(c);
		}
	}
	//Metodo que recibe una cancion por parametro, y el porcentaje de reproduccion de la misma (Tiempo escuchado/Duracion de la cancion)
	public void escucharCancion (Cancion c, float porcentajeEscuchado) {
		if (lista.indexOf(c) != -1) {
			if (porcentajeEscuchado > 0.5) {
				c.aumentarPonderacion(2);
			}else {
				c.aumentarPonderacion(1);
			}
		}
	}
	//Metodo que selecciona una cancion aleatoria, pero cada cancion cuenta con su probabilidad correspondiente
	//Esta probabilidad aumenta cuando una cancion es escuchada, mientras mas escuchada es mas probabilidades de 
	//ser elegida tiene.
	public void seleccionaSeudoAleatoria () {
		ArrayList <Cancion> listaAux = new ArrayList<Cancion> ();
		for (Cancion c: this.lista) {
			for (int i = 0; i < c.getPonderacion(); i++) {
				listaAux.add(c);
			}
		}
		int numero = (int)(Math.random()*(listaAux.size()));
		System.out.println("Seleccion: "+listaAux.get(numero).getNombre());
		escucharCancion (listaAux.get(numero),(float)Math.random());
	}
	//Metodo que imprime los resultados, de cada cancion y su probabilidad  asociada
	public void resultados () {
		int ponderacionTotal = 0;
		for (Cancion c: lista) {
			ponderacionTotal += c.getPonderacion(); 
		}
		System.out.println("Resultados: ");
		for (Cancion c: lista) {
			System.out.println("Cancion: "+c.getNombre()+ " Probabilidad asociada: "+(c.getPonderacion()/ponderacionTotal)*100+"%");
		}
		
	}
}
