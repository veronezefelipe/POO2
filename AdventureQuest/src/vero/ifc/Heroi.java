package vero.ifc;

public class Heroi extends Personagem {
	
	
	public Heroi(double vida, double dano, int nivel, Coletavel c) {
		super(vida, dano, nivel, c);
	}
	
	@Override
	public void atacar(Personagem inimigo) {
	
		this.setDano(getDano() );
		defender(inimigo);
	}

	
	@Override
	public void defender(Personagem inimigo) {
		
		double danoAdc = 0;
		
		if (this.getC() != null)
			danoAdc = 20;
			
		if(inimigo.getNivel() > getNivel())
			inimigo.setVida(inimigo.getVida() - (getDano() + danoAdc) * .1);
		else if(inimigo.getNivel() == getNivel())
			inimigo.setVida(inimigo.getVida() - (getDano() + danoAdc) * .3);
		else
			inimigo.setVida(inimigo.getVida() - (getDano() + danoAdc) * .5);
	}


}
