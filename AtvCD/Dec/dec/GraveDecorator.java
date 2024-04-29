package dec;

import music.Musica;

public class GraveDecorator extends Decorator{

	public GraveDecorator(Musica musicaDecorator) {
		super(musicaDecorator);
	}
	
	@Override
    public void tocar() {
        super.tocar();
        adicionarGrave();
    }

    private void adicionarGrave() {
        System.out.println("Com grave!");
    }

}
