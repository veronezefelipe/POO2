package vero.ifc;

public class Pocao implements Coletavel{
	
	private boolean usando = false;

	@Override
	public void usar() {
		this.usando = true;
		
	}

	@Override
	public void descartar() {
		this.usando = false;
		
	}

}
