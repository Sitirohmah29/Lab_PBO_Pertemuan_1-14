package Enkripsi;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Chat_AppDao {
	private String queryInsert  = "insert into starter(username, password)" + "values(?,?)";
	private String querySelectAll = "select * from starter";
	private String queryUpdate = "update starter set username=?, password=? where id = ?";
	private String queryRemoveById = "delete from starter where id = ?";
	private String queryFindById = "select * from starter where id = ?";
	private String queryByUsername = "select * from starter where username = ?";
	
	public void saved(Chat_App chat_app) throws Exception{
		Connection c = new ConnectionDB().connect();
		
		PreparedStatement psInsert = c.prepareStatement(queryInsert);
		
		psInsert.setString(1, chat_app.getUsername());
		psInsert.setString(2, chat_app.getPassword());
		
		psInsert.executeUpdate();
		
		c.close();
	}
	
	public List<Chat_App> findAll() throws Exception{
		List<Chat_App> hasil = new ArrayList<>();
		Connection c = new ConnectionDB().connect();
		PreparedStatement psCariSemuaProduk  = c.prepareStatement(querySelectAll);
		ResultSet rs = psCariSemuaProduk.executeQuery();
		
		while(rs.next()) {
			Chat_App chat_app = konversiResultSet(rs);
			hasil.add(chat_app);
		}
		
		c.close();
		return hasil;
	}
	
	private Chat_App konversiResultSet(ResultSet rs) throws SQLException{
		Chat_App chat_app = new Chat_App();
		chat_app.setUsername(rs.getString("username"));
		chat_app.setPassword(rs.getString("password"));
		return chat_app;
	}
	
	public void updated(Chat_App chat_app) throws Exception{
		Connection c = new ConnectionDB().connect();
		PreparedStatement psUpdate = c.prepareStatement(queryUpdate);
		
		psUpdate.setString(1, chat_app.getUsername());
		psUpdate.setString(2, chat_app.getPassword());
		
		psUpdate.executeUpdate();
		
		c.close();
	}
	
	public void removed(Integer id) throws Exception{
		if(id == null) {
			return;
		}
		
		Connection c = new ConnectionDB().connect();
		PreparedStatement psHapusById = c.prepareStatement(queryRemoveById);
		psHapusById.setInt(1, id);
		
		psHapusById.executeUpdate();
		
		c.close();
	}
	
	public Chat_App findById(int id) throws Exception{
		Connection c = new ConnectionDB().connect();
		PreparedStatement psFindById = c.prepareStatement(queryFindById);
		psFindById.setInt(1, id);
		
		ResultSet rs = psFindById.executeQuery();
		
		Chat_App chat_app = null;
		if(rs.next()) {
			chat_app = konversiResultSet(rs);
		}
		
		c.close();
		return chat_app;
	}
	
	public Chat_App getByUsername(String username, String
			password) throws Exception {
	    Connection c = new ConnectionDB().connect();
	    PreparedStatement psByUsername = c.prepareStatement(queryByUsername);
	    psByUsername.setString(1, username);

	    ResultSet rs = psByUsername.executeQuery();

	    Chat_App chat_app = null;
	    if (rs.next()) {
	        // Bandingkan password yang ditemukan di database dengan password yang diinputkan
	        String storedPassword = rs.getString("password");
	        if (storedPassword.equals(password)) {
	            chat_app = konversiResultSet(rs);
	        }
	    }

	    c.close();
	    return chat_app;
	}

}

