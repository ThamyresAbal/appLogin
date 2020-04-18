package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import conexao.Conexao;
import negocio.Usuario;

public class UsuarioDao {
		public static Usuario obterPorId(int id) {
		String sql = "SELECT * FROM TUsuario WHERE id = ?";
		
		PreparedStatement ps = null;
		
		try {			
			ps = Conexao.obterConexao().prepareStatement(sql);
			ps.setLong(1, id);
			
			ResultSet rs = null;
			
			rs = ps.executeQuery();
			
			if(rs.next()){
				Usuario u = new Usuario();
				
				u.setId(rs.getInt("id"));
				u.setNome(rs.getString("nome"));
				u.setEmail(rs.getString("email"));
				u.setSenha(rs.getString("senha"));
				u.setIdade(rs.getInt("idade"));
				
				return u;
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return null;		
}

		public static boolean validarAcesso(Usuario usuario) {
			String sql = "SELECT * FROM TUsuario WHERE email = ? AND senha = ?";
			
			PreparedStatement ps = null;
			
			try {			
				ps = Conexao.obterConexao().prepareStatement(sql);
				ps.setString(1, usuario.getEmail());
				ps.setString(2, usuario.getSenha());
				
				ResultSet rs = null;
				
				rs = ps.executeQuery();
				
				if(rs.next()){
					
					
					return true;
				}
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
			return false;		
		}

		public static boolean incluir(Usuario usuario){
			String sql = "INSERT INTO TUSUARIO(nome, email, senha, idade) VALUES (?, ?, ?, ?)";
			
			PreparedStatement ps = null;
			
			try {			
				ps = Conexao.obterConexao().prepareStatement(sql);
				ps.setString(1, usuario.getNome());
				ps.setString(2, usuario.getEmail());
				ps.setString(3, usuario.getSenha());
				ps.setInt(4, usuario.getIdade());			
				ps.execute();
				
				return true;
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
			return false;
		}	
}