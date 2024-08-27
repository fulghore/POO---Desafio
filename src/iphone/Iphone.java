package iphone;
import aparelho_telefonico.AparelhoTelefonico;
import navegador_internet.NavegadorInternet;
import reprodutor_musical.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical{

	//Aparelho Telefônico
	@Override
	public void ligar(String numero) {
		System.out.println("Ligando para " + numero);
	}

	@Override
	public void atender() {
		System.out.println("Atendendo ligação.");
	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("Iniciando correio de voz.");
	}

	//Navegador de Internet
	@Override
	public void exibirPagina(String url) {
		System.out.println("Exibindo página " + url);
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Nova aba adicionada.");
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Página atualizada.");
	}

	//Reprodutor Musical
	@Override
	public void tocar() {
		System.out.println("Reproduzindo música...");
	}

	@Override
	public void pausar() {
		System.out.println("Música pausada.");
	}

	@Override
	public void selecionarMusica(String musica) {
		System.out.println("Música selecionada " + musica);
	}

	//Método main
	public static void main(String[] args) {
		Iphone meuIphone = new Iphone();

			//Testando funcionalidades do aparelho telefônico
			meuIphone.ligar("319999999");
			meuIphone.atender();
			meuIphone.iniciarCorreioVoz();

			//Testando funcionalidades do navegador de internet
			meuIphone.exibirPagina("web.dio.me");
			meuIphone.atualizarPagina();
			meuIphone.adicionarNovaAba();

			//Testando funcionalidades do reprodutor musical
			meuIphone.selecionarMusica("Slipknot - Before I Forget");
			meuIphone.tocar();
			meuIphone.pausar();
			
	}
	

	
}
