package br.senai.jandira.sp.model;

import br.senai.jandira.sp.Jogador;

public class App {
    public static void main(String[] args) {
        Jogador jogador = new Jogador();
        jogador.cadastrarJogador();
        jogador.andar();
    }
}
