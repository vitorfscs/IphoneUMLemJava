import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) {
    }
}

public class iPhone {
    public static void Tela() {
        System.out.println("TELA FRONTAL");
    }

    public static void Botoes() {
        System.out.println("Botões");
    }
}

public class Reprodutor {
    public static void main(String[] args) {
        iPhone.Tela();
        iPhone.Botoes();
        playMusic();
        Notificacao.checkNotifications();
    }

    public static void playMusic() {
        String[] musicas = {"System Of Down", "MC Kevinho", "Charlie Brown JR"};

        for (String musica : musicas) {
            System.out.println("Reproduzindo: " + musica);
        }
    }
}

public class Notificacao {
    public static void checkNotifications() {
        String[] notificacoes = {"WhatsApp", "Facebook", "SnapChat"};

        if (notificacoes.length > 0) {
            System.out.println("Você tem uma notificação");
            for (String notificacao : notificacoes) {
                System.out.println("Notificação de: " + notificacao);
            }
        } else {
            System.out.println("Não há nenhuma notificação no momento.");
        }
    }
}


