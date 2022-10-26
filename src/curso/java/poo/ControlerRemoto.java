package curso.java.poo;

public class ControlerRemoto implements Controlador {

	private int volume;
	private boolean ligado;
	private boolean tocando;
	
	public ControlerRemoto() {
		this.volume = 50;
		this.ligado = true;
		this.tocando = true;
	}

	private int getVolume() {
		return volume;
	}

	private void setVolume(int volume) {
		this.volume = volume;
	}

	private boolean getLigado() {
		return ligado;
	}

	private void setLigado(boolean ligado) {
		this.ligado = ligado;
	}

	private boolean getTocando() {
		return tocando;
	}

	private void setTocando(boolean tocando) {
		this.tocando = tocando;
	}
	
	// Métodos abstratos:
	@Override
	public void ligar() {
		this.setLigado(true);
		
	}

	@Override
	public void desligar() {
		this.setLigado(false);
		
	}

	@Override
	public void abrirMenu() {
		System.out.println("Ligado? " + this.getLigado());
		System.out.println("Tocando? " + this.getTocando());
		System.out.print("Volume " + this.getVolume());
		
		for(int i = 0; i <= this.getVolume(); i+=10 ) {
			System.out.print(" | ");
		}
		
		System.out.println(getTocando());
	}

	@Override
	public void fecharMenu() {
		System.out.println("Fechando Menu...");
		
	}

	@Override
	public void maisVolume() {
		if(this.getLigado()) {
			this.setVolume(this.getVolume() + 5);
		}else {
			System.out.println("Impossivel aumentar volume");
		}
		
	}

	@Override
	public void menosVolume() {
		if(this.getLigado()) {
			this.setVolume(this.getVolume() - 5);
		}else {
			System.out.println("Impossivel diminuir volume");
		}
		
	}

	@Override
	public void ligarMudo() {
		if (this.getLigado() && this.getVolume() > 0) {
			this.setVolume(0);
		}
		
	}

	@Override
	public void desligarMudo() {
		if(this.getLigado() && this.getVolume() == 0) {
			this.setVolume(volume);
		}
		
	}

	@Override
	public void play() {
		if(this.getTocando() == false && this.getLigado() == true) {	
			System.out.println("PLAY Ativo!");
		}else {
			System.out.println("Nao foi possivel dar play.");
		}
			
		
		
	}

	@Override
	public void pause() {
		if(this.getLigado() && this.getTocando()) {
			this.setTocando(false);
			System.out.println("Aparelho pausado!");
		}else {
			System.out.println("Não foi possível pausar. Ligue o aparelho!");
		}
		
	}


}
