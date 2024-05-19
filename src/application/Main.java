package application;

import entities.Jogador;
import entities.Jogadores;
import entities.Posicao;

public class Main {

	public static void main(String[] args) {
		Jogadores realMadrid = new Jogadores();
		Jogador navas = new Jogador("Navas", 1.85, 80, 1, 1);
        Jogador ramos = new Jogador("Ramos", 1.83, 75, 4, 2);
        Jogador marcelo = new Jogador("Marcelo", 1.74, 80, 12, 3);
        Jogador carvajal = new Jogador("Carvajal" , 1.72, 73, 2, 3);
        Jogador modric = new Jogador("Modric", 1.72, 68, 9, 4);
        Jogador kroos = new Jogador("Kroos", 1.83, 78, 8, 4);
        Jogador casemiro = new Jogador("Casemiro", 1.85, 84, 14, 8);
        Jogador isco = new Jogador("Isco", 1.76, 75, 22, 9);
        Jogador benzema = new Jogador("Benzema", 1.87, 79, 9, 7);
        Jogador ronaldo = new Jogador("Ronaldo", 1.87, 84, 7, 5);
        Jogador bale = new Jogador("Bale", 1.85, 82, 11, 6);
		realMadrid.adicionarJogador(navas);
		realMadrid.adicionarJogador(ramos);
		realMadrid.adicionarJogador(carvajal);
		realMadrid.adicionarJogador(marcelo);
		realMadrid.adicionarJogador(kroos);
		realMadrid.adicionarJogador(modric);
		realMadrid.adicionarJogador(casemiro);
		realMadrid.adicionarJogador(isco);
		realMadrid.adicionarJogador(bale);
		realMadrid.adicionarJogador(ronaldo);
		realMadrid.adicionarJogador(benzema);
		
		System.out.println(realMadrid.tamanhoDoTime());
		realMadrid.listarJogadores();
		System.out.println("----------------------------");
		System.out.println("Procurando os meias!");
		System.out.println(realMadrid.pesquisarJogadoresPorPosicao( Posicao.MEIO_CAMPO));
		System.out.println("----------------------------");
		
		
	}
	
}
