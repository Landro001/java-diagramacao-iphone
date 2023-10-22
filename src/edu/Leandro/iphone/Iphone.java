package edu.Leandro.iphone;

import edu.Leandro.funcionalidades.AparelhoTelefonico;
import edu.Leandro.funcionalidades.NavegadorInternet;
import edu.Leandro.funcionalidades.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {
    public void ligar(int numero) {
        System.out.println("Ligando para o número " + numero);
    }

    public void atender() {
        System.out.println("Ligação antedida");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Reproduzindo seu correio de voz");
    }

    public void exibirPagina(String url) {
        System.out.println("A página desejada está sendo exibida");
    }

    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada");
    }

    public void atualizarPagina() {
        System.out.println("Página atualizada");
    }

    public void selecionarMusica(String musica) {
        System.out.println("A música " + musica + " foi selecionada");
    }

    public void tocarMusica() {
        System.out.println("Tocando a música selecionada");
    }

    public void pausarMusica() {
        System.out.println("Pausando a música selecionada");
    }

    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        iphone.ligar(40028922);
        iphone.atender();
        iphone.iniciarCorreioVoz();

        iphone.exibirPagina("web.DIO.me");
        iphone.atualizarPagina();
        iphone.adicionarNovaAba();

        iphone.selecionarMusica("Can't you feel my heart");
        iphone.tocarMusica();
        iphone.pausarMusica();
    }
}
