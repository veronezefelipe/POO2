package dec;

import music.Musica;

public class AgudoDecorator extends Decorator{

	public AgudoDecorator(Musica musicaDecorator) {
		super(musicaDecorator);
	}
	
	@Override
    public void tocar() {
        super.tocar();
        adicionarAgudo();
    }

    private void adicionarAgudo() {
        System.out.println("Agudo!");
    }

}
