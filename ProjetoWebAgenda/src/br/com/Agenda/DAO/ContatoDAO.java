package br.com.Agenda.DAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import br.com.Agenda.Modelo.Contato;

public class ContatoDAO {
	private Connection connection;
	
		public ContatoDAO() throws SQLException{
			this.connection  = new ConnectionFactory().getConnection();
		}
		
		public void adiciona (Contato contato){
			String sql = "insert into contatos" +
					"(nome, email, endereco, dataNascimento)" + 
					"values (?,?,?,?)";
			try {
				//prepare statement para inserção
				PreparedStatement stmt = connection.prepareStatement(sql);
				//seta os valores
				stmt.setString(1, contato.getNome().toLowerCase());
				stmt.setString(2, contato.getEmail().toLowerCase());
				stmt.setString(3,contato.getEndereco().toLowerCase());
				stmt.setDate(4, new Date( 
						contato.getDataNascimento().getTimeInMillis())); 
				
				stmt.execute();
				stmt.close();
			} catch (SQLException e){
				throw new RuntimeException(e);
			}
		}
		
		public List<Contato> getLista(){
			try{
				List<Contato> contatos = new ArrayList<Contato>();
				
				
				
				PreparedStatement stmt = this.connection.prepareStatement("Select * from contatos" );
				ResultSet rs = stmt.executeQuery();
				
			while (rs.next()){
				//Criando objeto contato
				Contato contato  = new Contato();
				contato.setId(rs.getLong("id"));
				contato.setNome(rs.getString("Nome"));
				contato.setEmail(rs.getString("Email"));
				contato.setEndereco(rs.getString("endereco"));
				
				//mostrar Data atraves do Calendar
				Calendar data = Calendar.getInstance(); 
				data.setTime(rs.getDate("dataNascimento"));
				contato.setDataNascimento(data);
				
				// adicionar objetos na lista
				contatos.add(contato);
			}
			rs.close();
			stmt.close();
			return contatos;
			} catch (SQLException e){
				throw new RuntimeException(e);
			}
			
		}
		
		public Contato GetContatoForId(long id){
			try{
				Contato contato = new Contato();
				/*PreparedStatement stmt = this.connection.prepareStatement("select * from contatos where"
																						+ " id = ? " + id + ";");*/
				String sql = "select * from contatos where id = " + id;
				PreparedStatement stmt =  connection.prepareStatement(sql);
				ResultSet rs = stmt.executeQuery();
				
				while (rs.next()){
				/*Contato contato = new Contato();*/
				contato.setId(rs.getLong("id"));
				contato.setNome(rs.getString("nome"));
				contato.setEmail(rs.getString("email"));
				contato.setEndereco(rs.getString("endereco"));
				
				Calendar data = Calendar.getInstance();
				data.setTime(rs.getDate("dataNascimento"));
				contato.setDataNascimento(data);
				
				/*contatos.add(contato);*/
				
				}
				rs.close();
				stmt.close();
				return contato;
			
				
			}catch (SQLException e){
				throw new RuntimeException(e);
			}
			
		}
		
		public List<Contato> GetContatosForName(String nome){
			try{
				List<Contato> contatos = new ArrayList<Contato>();
				PreparedStatement stmt = this.connection.prepareStatement("select * from contatos where nome like '"+nome+"%';" );
				ResultSet rs = stmt.executeQuery();
				
				while (rs.next()){
					Contato contato = new Contato();
					contato.setId(rs.getLong("id"));
					contato.setNome(rs.getString("nome"));
					contato.setEmail(rs.getString("email"));
					contato.setEndereco(rs.getString("endereco"));
					
					Calendar data = Calendar.getInstance();
					data.setTime(rs.getDate("dataNascimento"));
					contato.setDataNascimento(data);
					
					contatos.add(contato);
					
				}
				
				rs.close();
				stmt.close();
				return contatos;
				
			}catch (SQLException e){
				
				throw new RuntimeException(e);
			}
			
		}
		
		public void alterar (Contato contato){
			String sql = "update caontatos  set nome=?, email=?, endereco=?,datanascimento=? +"
						+ "where id=?";
			
			try{
				PreparedStatement stmt =  connection.prepareStatement(sql);
				stmt.setString(1, contato.getNome());
				stmt.setString(1, contato.getEmail());
				stmt.setString(3,contato.getEndereco());
				stmt.setDate(4, new Date( 
						contato.getDataNascimento().getTimeInMillis())); 
				stmt.setLong(5, contato.getId());
					stmt.execute();
					stmt.close();
				
			}catch (SQLException e){
				throw new RuntimeException(e);
			}
			
		}
		
		
		public void remove(Contato contato){
			String sql ="delete from contatos where id = ?";
			try{
				PreparedStatement stmt = connection.prepareStatement(sql);
				stmt.setLong(1, contato.getId());
				stmt. executeUpdate();
				stmt.close();
				
			} catch(SQLException e){
				throw new RuntimeException(e);
			}
				
			
		}
		
	
}
