package dec;

import music.Musica;

public class EcoDecorator extends Decorator{

	public EcoDecorator(Musica musicaDecorator) {
		super(musicaDecorator);
	}
	
	@Override
    public void tocar() {
        super.tocar();
        adicionarEco();
    }

    private void adicionarEco() {
        System.out.println("Com eco!");
    }

}
