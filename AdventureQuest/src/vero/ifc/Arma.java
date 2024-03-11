package vero.ifc;

public class Arma implements Coletavel{

	private boolean usando = false;
	
	public void usar() {
		this.usando = true;
	}


	public void descartar() {
		this.usando = false;
	}

}
