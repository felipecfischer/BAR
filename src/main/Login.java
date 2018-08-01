package main;

import conn.Conn;

import java.sql.Connection;
import java.sql.PreparedStatement;
//import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Login {

	public static boolean entrar(String login, String senha){
		return verifLogin(login, senha);
	}	
	
	private static boolean verifLogin(String login, String senha){
		boolean k_ok;
		String sql =  "SELECT * "
					+ "FROM usuario "
					+ "WHERE usuario = ? "
					  + "AND senha = ? "
					  + "AND situacao = 'A'";
		
		Connection conn = Conn.connOpen();
		k_ok = true;
		
		try (PreparedStatement pstmt  = conn.prepareStatement(sql)){
			pstmt.setString(1,login);
			pstmt.setString(2,senha);
			
			ResultSet rs  = pstmt.executeQuery();
            if ( !rs.next() ) {
            	k_ok = false;	
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        	k_ok = false;
        }
		
		return k_ok;
	}
}
