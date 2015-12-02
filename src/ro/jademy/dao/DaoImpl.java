package ro.jademy.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import ro.jademy.domain.User;

public class DaoImpl implements Dao {

	Connection connection = null;
	Statement statement = null;
	PreparedStatement preparedStatement = null;
	ResultSet resultSet = null;
	String query = null;
	
	User user = null;
	
	public void createConnection(){
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection(
					"jdbc:mysql://127.0.0.1/project_manager", 
					"root", 
					""); 
			
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}		
	}
	
	
	private void inchideResurse(){
		
		try {

			if (connection != null) {
				connection.close();
			}
			if (statement != null) {
				statement.close();
			}
			if (preparedStatement != null) {
				preparedStatement.close();
			}
			if (resultSet != null) {
				resultSet.close();
			}

		} catch (SQLException sqle) {
			System.out.println("Am incercat sa inchid resursele, dar nu am reusit.");
		}
		
	}
	
	
	@Override
	public boolean addUser(User user) {
		
		createConnection();
		
		query = "INSERT INTO  user VALUES (null, ?, ?, ?, ?, ?,null,null,null);";
		
		
		try {
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, user.getPrenume());
			preparedStatement.setString(2, user.getNume());
			preparedStatement.setString(3, user.getEmail());
			preparedStatement.setString(4, user.getPassword());
			preparedStatement.setString(5, user.getTelefon());
		

			preparedStatement.executeUpdate();
			
			return true;
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		} finally {
			inchideResurse();
		}
		
		
		return false;
	}

	@Override
	public User getUser(String email, String password) {

		createConnection();
		
		query = "SELECT * FROM user "
				+ "WHERE email = ? AND password = ?;";
		
		try {
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, email);
			preparedStatement.setString(2, password);
			
			resultSet = preparedStatement.executeQuery();
			
			// avem cel mult un singur rezultat in ResuoltSet.
			if (resultSet.next()){
				user = new User(resultSet.getString("prenume"), 
						resultSet.getString("nume"),
						resultSet.getString("email"),
						resultSet.getString("password"),
						resultSet.getString("telefon"),
						resultSet.getString(""));
				
			}
			return user;
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			inchideResurse();
		}
				
		return null;
	}


	@Override
	public boolean resetPass(String password,String codReset,String email) {
	createConnection();
		
		query = "UPDATE project_manager.user SET password=? WHERE cod_resetare_parola=? AND email=?;";		
		
		try {
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1,password);
			preparedStatement.setString(2,codReset);
			preparedStatement.setString(3,email);

			preparedStatement.executeUpdate();
			
			return true;
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		} finally {
			inchideResurse();
		}
		
		return false;
	}




	
	









}
