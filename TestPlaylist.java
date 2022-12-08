package clases;

public class TestPlaylist {

/*
 * Creador: Dealbera Juan Pablo
 * */	
	
	public static void main(String[] args) {

		//Instancio la playlist
		Playlist playList = new Playlist ();
		
		//Instancio algunas canciones
		Cancion c1 = new Cancion ("La melodia de dios",120);
		Cancion c2 = new Cancion ("Pastillitas del olvido",120);
		Cancion c3 = new Cancion ("Arruinarse",120);
		Cancion c4 = new Cancion ("Yendo a la casa de damian",120);
		Cancion c5 = new Cancion ("Bipolar",120);
		Cancion c6 = new Cancion ("Buen dia benito",120);
		Cancion c7 = new Cancion ("Dale union",120);
		Cancion c8 = new Cancion ("Viejo y glorioso union",120);
		
		//Guardo las canciones en la playlist
		playList.agregarCancion(c1);
		playList.agregarCancion(c2);
		playList.agregarCancion(c3);
		playList.agregarCancion(c4);
		playList.agregarCancion(c5);
		playList.agregarCancion(c6);
		playList.agregarCancion(c7);
		playList.agregarCancion(c8);
		
		//Escucho canciones
		for (int i = 0; i <20;i++) {
			playList.seleccionaSeudoAleatoria();
		}
		
		playList.resultados();
		
		for (int i = 0; i <20;i++) {
			playList.seleccionaSeudoAleatoria();
		}
		
		playList.resultados();
		
		for (int i = 0; i <20;i++) {
			playList.seleccionaSeudoAleatoria();
		}
		
		playList.resultados();
		
		for (int i = 0; i <20;i++) {
			playList.seleccionaSeudoAleatoria();
		}
		
		playList.resultados();
	
		for (int i = 0; i <20;i++) {
			playList.seleccionaSeudoAleatoria();
		}
		
		playList.resultados();
		
		

	}
	

}
