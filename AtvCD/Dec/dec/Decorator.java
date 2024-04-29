package dec;

import music.Musica;

public abstract class Decorator implements Musica {
	protected Musica musicaDecorator;
	
	public Decorator(Musica musicaDecorator) {
		this.musicaDecorator = musicaDecorator;
	}
	
	 @Override
	 public void tocar() {
		 musicaDecorator.tocar();
	 }
}
