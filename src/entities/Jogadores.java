package entities;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Jogadores {
	List<Jogador> jogadores;
	
	public Jogadores() {
		jogadores = new ArrayList<>();
	}
	
	public void adicionarJogador(Jogador jogador) {
		jogadores.add(jogador);
	}
	public void removerJogadorPeloNome(String nome) {
		jogadores.removeIf(jogador -> jogador.getNome().equalsIgnoreCase(nome));
	}
	public void listarJogadores() {
		for(Jogador jogador : jogadores) {
			System.out.println("--------------------------");
			System.out.println(jogador);
		}
	}
	public int tamanhoDoTime() {
		int tamanhoDoTime = jogadores.size();
		return tamanhoDoTime;
	}
//	public List<Jogador> pesquisarJogadorPorNome(String nomeDoJogador){
//		List<Jogador> jogadoresEncontrados = new ArrayList<>();
//		if(!jogadores.isEmpty()) {
//			for(Jogador jogador: jogadores) {
//				jogadoresEncontrados.add(jogador);
//			}
//		}
//		return jogadoresEncontrados;
//	}
	public List<Jogador> pesquisarJogadorPorNome(String nomeDoJogador) { 
		return jogadores.stream()
                .filter(jogador -> jogador.getNome().equalsIgnoreCase(nomeDoJogador))
                .collect(Collectors.toList());
    }
	public List<Jogador> pesquisarJogadoresPorPosicao(Posicao posicao){	
		return jogadores.stream()
				.filter(jogador -> jogador.getPosicao() == posicao)
				.collect(Collectors.toList());
	}
	public List<Jogador> pesquisarJogadoresPorNumeroDaCamisa(int numeroDaCamisa){
		return jogadores.stream()
				.filter(jogador -> jogador.getNumeroDaCamisa() == String.valueOf(numeroDaCamisa) )
				.collect(Collectors.toList());
	}
	
	
	}
	
	

