package main;

import dec.AgudoDecorator;
import dec.EcoDecorator;
import dec.GraveDecorator;
import music.Musica;
import music.MusicaNormal;

public class main {
	public static void main(String[] args) {
		
		Musica musica = new MusicaNormal();
		
		musica.tocar();
		
		musica = new GraveDecorator(musica);
		
		musica.tocar();
		
		musica = new EcoDecorator(musica);
		
		musica.tocar();
		
		musica = new AgudoDecorator(musica);
		
		musica.tocar();
		
	}
}
