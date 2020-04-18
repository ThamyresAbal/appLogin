package negocio;

public class Login {
	
	private String email;
	private String senha;
	
	public Login(String nome, String email, String senha) {
		
		this.setEmail(email);
		this.setSenha(senha);
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
	
	

}
