import iphone.Iphone;

public class App {
    public static void main(String[] args) {
        
        Iphone iphone = new Iphone();

        //iphone funcionando como Navegador de internet
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
        iphone.exibirPagina("São Carlos Agora");
        
        System.out.println("\n");
        //iphone funcionando como Telefone
        iphone.ligar("3333-3333");
        iphone.atender();
        iphone.iniciarCorreioVoz();

        System.out.println("\n");
        //iphone funcionando como Reprodutor Musical
        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica("Racionais Mc's");
    }
}
