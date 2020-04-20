import javax.swing.*;
import java.sql.*;
import java.sql.ResultSet;



public class DBConnection {
	
	public static void main(String[] args) {
		
		
	}

	public static String marieDBConnGetFrage(int id)
	{
		Connection Conn =null;
		try {
			
			Class.forName("org.mariadb.jdbc.Driver");
			Conn = DriverManager.getConnection("jdbc:mariadb://46.38.234.175:3342/ProjektQ11?user=ProjektQ11&password=Q11Projekt");

		
			PreparedStatement Stmt = Conn.prepareStatement("SELECT Frage FROM Fragen where idFragen="+id);
			ResultSet result = Stmt.executeQuery();
			
				
				
				
			while(result.next()) {
				System.out.println(""+result.getString("Frage"));
				return result.getString("Frage");
			}
			
			return null;
			
		
		}
		catch (Exception E)
		{
			JOptionPane.showMessageDialog(null, E);
			return null;
		}
		
		
		
		
	}
	
	public static String marieDBConnGetAntwort(int id, int antwort)
	{
		Connection Conn =null;
		try {
			
			Class.forName("org.mariadb.jdbc.Driver");
			Conn = DriverManager.getConnection("jdbc:mariadb://46.38.234.175:3342/ProjektQ11?user=ProjektQ11&password=Q11Projekt");

		
			PreparedStatement Stmt = Conn.prepareStatement("SELECT Antw"+antwort+" FROM Fragen where idFragen="+id);
			ResultSet result = Stmt.executeQuery();
			
				
				
				
			while(result.next()) {
				
			
				System.out.println(""+result.getString("Antw"+antwort));
				return result.getString("Antw"+antwort);
			}
			
			return null;
			
		
		}
		catch (Exception E)
		{
			JOptionPane.showMessageDialog(null, E);
			return null;
		}
	
	
	
	

	}
	public static String marieDBConnGetFach(int id)
	{
		Connection Conn =null;
		try {
			
			Class.forName("org.mariadb.jdbc.Driver");
			Conn = DriverManager.getConnection("jdbc:mariadb://46.38.234.175:3342/ProjektQ11?user=ProjektQ11&password=Q11Projekt");

		
			PreparedStatement Stmt = Conn.prepareStatement("SELECT Fach FROM Fragen where idFragen="+id);
			ResultSet result = Stmt.executeQuery();
			
				
				
				
			while(result.next()) {
				System.out.println(""+result.getString("Fach"));
				return result.getString("Fach");
			}
			
			return null;
			
		
		}
		catch (Exception E)
		{
			JOptionPane.showMessageDialog(null, E);
			return null;
		}
}
	public static int marieDBConnGetJahr(int id)
	{
		Connection Conn =null;
		try {
			
			Class.forName("org.mariadb.jdbc.Driver");
			Conn = DriverManager.getConnection("jdbc:mariadb://46.38.234.175:3342/ProjektQ11?user=ProjektQ11&password=Q11Projekt");

		
			PreparedStatement Stmt = Conn.prepareStatement("SELECT Jahrgangsstufe FROM Fragen where idFragen="+id);
			ResultSet result = Stmt.executeQuery();
			
				
				
				
			while(result.next()) {
				System.out.println(""+result.getInt("Jahrgangsstufe"));
				return result.getInt("Jahrgangsstufe");
			}
			
			return 0;
			
		
		}
		catch (Exception E)
		{
			JOptionPane.showMessageDialog(null, E);
			return 0;
		}
}
}