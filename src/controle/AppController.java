package controle;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UsuarioDao;
import negocio.Usuario;
public class AppController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
    public AppController() {
    	
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.getRequestDispatcher("login.jsp").forward(request, response);	
		
		Usuario usuario = new Usuario();
		usuario.setNome(request.getParameter("nome"));
		usuario.setEmail(request.getParameter("email"));
		
		request.setAttribute("printUsuario", usuario);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Usuario usuario = new Usuario();
		
		//pegar campos da tela
		usuario.setEmail(request.getParameter("email"));
		usuario.setSenha(request.getParameter("senha"));
		
		if(UsuarioDao.validarAcesso(usuario)) {
			request.getRequestDispatcher("main.jsp").forward(request, response);
		}else {
			String mensagem = String.format(
					"O usuário %s não existe!",
					usuario.getEmail());
			
			request.setAttribute("msg", mensagem );
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}
		
	}

}
