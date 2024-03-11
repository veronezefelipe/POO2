package vero.ifc;

public abstract class Personagem {
	private double vida;
	private double dano;
	private int nivel;
	private Coletavel c; 
	
	public Personagem(double vida, double dano, int nivel, Coletavel c) {
		super();
		this.vida = vida;
		this.dano = dano;
		this.nivel = nivel;
		this.c = c;
	}
	
	
	public Coletavel getC() {
		return c;
	}

	public void setC(Coletavel c) {
		this.c = c;
	}

	public int getNivel() {
		return nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}

	public double getVida() {
		return vida;
	}

	
	public void setVida(double vida) {
		this.vida = vida;
	}

	
	public double getDano() {
		return dano;
	}

	public void setDano(double dano) {
		this.dano = dano;
	}
	
	public void pegarItem(Coletavel c) {
		this.c = c;
		this.c.usar();
	}
	
	public void soltarItem() {
		this.c = null;

	}


	public abstract void atacar(Personagem inimigo);
	public abstract void defender(Personagem inimigo);

}
