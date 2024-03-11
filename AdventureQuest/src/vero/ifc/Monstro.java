package vero.ifc;

public class Monstro extends Personagem {

	public Monstro(double vida, double dano, int nivel, Coletavel c) {
		super(vida, dano, nivel, c);
	}

	public void atacar(Personagem inimigo) {
		this.setDano(getDano());
		defender(inimigo);
	}

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
