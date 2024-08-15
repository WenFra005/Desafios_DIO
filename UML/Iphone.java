package Desafios_dio.UML;
public class Iphone implements NavegadorInternet, Telefone, TocadorMusica{

    public void abrirPagina(String url) {
        System.out.println("A pagina " + url + " foi aberta");
        
    }

    public void adicionarAba() {
        System.out.println("Aba adicionada");
        
    }

    public void recarregarPagina() {
        System.out.println("Pagina recarregada");
        
    }

    public void correioVoz() {
        System.out.println("Correio de voz");
    }

    public void fazerChamada(String numeroDestino) {
        System.out.println("Ligando para " + numeroDestino);
    }

    public void receberChamada(String numeroOrigem) {
        System.out.println("Recebendo ligação de " + numeroOrigem);
    }

    public void pausarMusica() {
        System.out.println("Musica pausada");
    }

    public void selecionarMusica(String musica) {
        System.out.println(musica + " selecionada");
    }

    public void tocarMusica() {
        System.out.println("Tocando musica");
        
    }
    public static void main(String[] args) {
              
        Iphone meuIphone = new Iphone();
        //Interface NavegadorInternet
        meuIphone.abrirPagina("www.exemplo.com");
        meuIphone.adicionarAba();
        meuIphone.recarregarPagina();
        //Interface Telefone
        meuIphone.fazerChamada("(11)91236-7890");;
        meuIphone.receberChamada("(11)91236-7890");;
        meuIphone.correioVoz();
        //Interface TocadorMusica
        meuIphone.selecionarMusica("'Som legal'");
        meuIphone.tocarMusica();
        meuIphone.pausarMusica();
    }
}