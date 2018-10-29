package negocio;

public class Usuario {
	
	private String nome;
	private String email;
	private String senha;
	
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

	@Override
	public String toString() {
		
		return String.format("Usuario: %s "  
				+ "E-mail cadastrado: %s \n" +
				"Senha: %s", 
				this.getNome(),
				this.getEmail(),
				this.getSenha());
	}
}
