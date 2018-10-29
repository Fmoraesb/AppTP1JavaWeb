package teste;

import negocio.Usuario;

public class TestaUsuario {

	public static void main(String[] args) {
	Usuario usuario = new Usuario();
	
	usuario.setNome("Klaus Augusto");
	usuario.setEmail("klaus@klauscorp.com");
	
	System.out.println(usuario.toString());

	}

}
