package cliente;

import java.util.ArrayList;
import java.util.Scanner;

public class Usuario {
	private String nome;
	private String email;
	private String nacionalidade;
	private ArrayList<String> postagens;
	private int quantidadeDePostagens;
	private int pontuacao;
	
	public Usuario(String nome, String email, String nacionalidade) {
		this.nome = nome;
		this.email = email;
		this.nacionalidade = nacionalidade;
		postagens = new ArrayList<String>();
		quantidadeDePostagens = 0;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getNacionalidade() {
		return nacionalidade;
	}
	
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	
	public ArrayList<String> getPostagens() {
		return postagens;
	}
	
	public int getQuantidadeDePostagens() {
		return quantidadeDePostagens;
	}

	public int getPontuacao() {
		return pontuacao;
	}

	public void adicionaPostagem(String post) {
		this.postagens.add(post);
		this.quantidadeDePostagens++;
	}
	
	public void listarPostagens() {
		for(int i = 0; i < postagens.size(); i++) {
			System.out.println(postagens.get(i));
		}
	}
	
	public void alteraPontuacao(int delta) {
		this.pontuacao += delta;
		if(pontuacao < 0) this.pontuacao = 0;
	}
	
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		Usuario usuario = new Usuario();
//		String nome, email, nacionalidade;
//		System.out.print("Digite o nome: ");
//		nome = sc.nextLine();
//		System.out.print("Digite o email: ");
//		email = sc.nextLine();
//		System.out.print("Digite a nacionalidade: ");
//		nacionalidade = sc.nextLine();
//		
//		usuario.setNome(nome);
//		usuario.setEmail(email);
//		usuario.setNacionalidade(nacionalidade);
//		
//		for(int i = 0; i < 3; i++) {
//			System.out.println("Digite a postagem:");
//			String post = sc.nextLine();
//			usuario.adicionaPostagem(post);
//		}
//		System.out.print("Informe uma pontuacao: ");
//		int pontos = sc.nextInt();
//		usuario.alteraPontuacao(pontos);
//		
//		System.out.println("Usuario: " + usuario.getNome());
//		System.out.println("Email: " + usuario.getEmail());
//		System.out.println("Nacionalidade: " + usuario.getNacionalidade());
//		System.out.println("Postagens:");
//		for(String post : usuario.getPostagens()) {
//			System.out.println("-----------------------------");
//			System.out.println(post);
//		}
//		System.out.println("Quantidade de posts: " + usuario.getQuantidadeDePostagens());
//		System.out.println("Pontuacao: " + usuario.getPontuacao());
		
		ArrayList<Usuario> listaUsuarios = new ArrayList<Usuario>();
		Scanner sc = new Scanner(System.in);
		String sn = "s";
		do {
			String nome, email, nacionalidade;
			System.out.println("Dados do usuario:");
			System.out.print("Nome: ");
			nome = sc.nextLine();
			System.out.print("Email: ");
			email = sc.nextLine();
			System.out.print("Nacionalidade: ");
			nacionalidade = sc.nextLine();
			Usuario usuario = new Usuario(nome, email, nacionalidade);
			listaUsuarios.add(usuario);
			System.out.println("Deseja inserir outro usuario?");
			System.out.print("Resposta: ");
			sn = sc.nextLine();
			
		} while(sn != "s");
		
		
	}
	
}
