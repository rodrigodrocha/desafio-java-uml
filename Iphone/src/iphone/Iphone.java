package iphone;

import javax.sound.midi.Soundbank;

import NavegadorInternet.NavegadorInternet;
import ReprodutorMusical.ReprodutorMusical;
import Telefone.AparelhoTelefonico;

public class Iphone implements NavegadorInternet, ReprodutorMusical, AparelhoTelefonico {

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova Aba da internet com Iphone");
        
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página da internet do iphone");
        
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página " + url + " da internet no iphone");
        
    }

    @Override
    public void pausar() {
        System.out.println("Pausando música do iphone");
        
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.printf("Selecionando música %s no iphone \n", musica);
        
    }

    @Override
    public void tocar() {
        System.out.println("Tocando música no iphone");
        
    }

    @Override
    public void atender() {
        System.out.println("Atendendo ligação no iphone");
        
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz no iphone");
        
    }

    @Override
    public void ligar(String numero) {
        System.out.printf("Ligando para o numero %s\n", numero);
        
    }
    
}
