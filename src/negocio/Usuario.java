package negocio;

public class Usuario {
	private int id;
	private String nome;
	private String email;
	private String senha;
	private int idade;
	
	public Usuario() {
		
	}
	
	public Usuario(int id,String nome, String email, String senha, int idade) {
		this.setId(id);
		this.setNome(nome);
		this.setEmail(email);
		this.setSenha(senha);
		this.setIdade(idade);
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
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
	
	

}
