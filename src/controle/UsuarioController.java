package controle;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UsuarioDao;
import negocio.Usuario;

public class UsuarioController extends HttpServlet {
   
	private static final long serialVersionUID = 1L;
	public UsuarioController() {
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("usuarioDetalhe.jsp").forward(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//instanciar um usuario
		Usuario usuario = new Usuario();
		
		//pegar campos da tela
		usuario.setNome(request.getParameter("nome"));
		usuario.setEmail(request.getParameter("email"));
		usuario.setSenha(request.getParameter("senha"));
		usuario.setIdade(Integer.valueOf(request.getParameter("idade")));
		
		//chamar metodo DAO
		UsuarioDao.incluir(usuario);
		
		//Usuario já está instanciado acima
		String mensagem = String.format(
				"Usuário %s cadastrado com sucesso!", 
				usuario.getNome());
		
		request.setAttribute("msg", mensagem);

		//chamar tela de login
		request.getRequestDispatcher("login.jsp").forward(request, response);
	}

}
 