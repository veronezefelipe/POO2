package vero.ifc;

public class Main {

	public static void main(String[] args) {
		
		
		Personagem h = new Heroi(100, 30, 2, null);
		Personagem m = new Monstro(100, 20, 3, null);
		
		
		Arma a = new Arma();
		Pocao p = new Pocao();
		
		
		h.pegarItem(a);
		h.atacar(m);
		
		h.soltarItem();
		h.atacar(m);
		
		
		System.out.println(m.getVida());

	}

}
