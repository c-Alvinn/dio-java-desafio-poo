package Estabelecimento;

import Celular.Iphone;
import Funcoes.Musica.ReproduzirMusica;
import Funcoes.Navegador.NavegadorInternet;
import Funcoes.Telefone.Ligacao;

public class Fabrica {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();
        ReproduzirMusica musica = (ReproduzirMusica) iphone;
        Ligacao telefonico = (Ligacao) iphone;
        NavegadorInternet internet = (NavegadorInternet) iphone;


        System.out.println("Musica");
        musica.selecionarMusica();
        musica.tocar();
        musica.pausar();
        System.out.println(" xD \n");

        System.out.println("Telefone");
        telefonico.ligar();
        telefonico.atender();
        telefonico.iniciarCorreioVoz();
        System.out.println(" xD \n");

        System.out.println("Internet");
        internet.pagina();
        internet.adicionandoNovaPagina();
        internet.atualizaPagina();
        System.out.println(" xD  ");
    }
}
