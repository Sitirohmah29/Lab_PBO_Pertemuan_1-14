package com.ibik.pbo.Pembelajaran;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class StudentsDao {
	private String queryInsert = "insert into students(npm,fullname,email,phone,gender,citizenship)"+"values(?,?,?,?,?,?)";
	
	private String querySelectAll = "select * from students"; 
	
	private String queryUpdate = "update students set email=?, npm=?, fullname=?,   phone=?, gender=?, citizenship=?,  where id = ?";

	private String queryRemoveById = "delete from students where id = ?";
	
	private String queryFindById = "select * from students where id = ?";
	
	private String queryByEmail = "select * from students where email = ?";
	
	public void saved(Students students) throws Exception  {
		Connection c = new ConnectionDB().connect();
		
		PreparedStatement psInsert = c.prepareStatement(queryInsert);
		
		
		psInsert.setString(1, students.getNpm());   
		psInsert.setString(2, students.getEmail());
		psInsert.setString(3, students.getFullName());
		psInsert.setString(4, students.getPhone());
		psInsert.setString(5, students.getGender());
		psInsert.setString(6, students.getCitizenship());
		
		
		psInsert.executeUpdate();
		
		c.close();
	}
	
	public List<Students> findAll() throws Exception {
	    List<Students> hasil = new ArrayList<>();
	    Connection c = new ConnectionDB().connect();
	    PreparedStatement psCariSemuaProduk = c.prepareStatement(querySelectAll);
	    ResultSet rs = psCariSemuaProduk.executeQuery();

	    while (rs.next()) {
	        Students students = konversiResultSet(rs);
	        hasil.add(students);
	    }

	    c.close();
	    return hasil;
	}

	private Students konversiResultSet(ResultSet rs) throws SQLException {
	    Students students = new Students();
	    students.setId(rs.getInt("id"));
	    students.setFullname(rs.getString("fullname"));
	    students.setNpm(rs.getString("npm"));
	    students.setEmail(rs.getString("email"));
	    students.setPhone(rs.getString("phone"));
	    students.setGender(rs.getString("gender"));
	    students.setCitizenship(rs.getString("citizenship"));
	    
	    return students;
	}
	
	public void updated(Students students) throws Exception {
	    Connection c = new ConnectionDB().connect();
	    PreparedStatement psUpdate = c.prepareStatement(queryUpdate);
	    
	    
	    psUpdate.setString(1, students.getNpm());
	    psUpdate.setString(2, students.getEmail());
	    psUpdate.setString(3, students.getFullName());
	    psUpdate.setString(4, students.getPhone());
	    psUpdate.setString(5, students.getGender());
	    psUpdate.setString(6, students.getCitizenship());
	    psUpdate.setInt(7, students.getId());
	    	    
	    psUpdate.executeUpdate();
	    
	    c.close();
	}

	public void removed(Integer id) throws Exception {
	    if (id == null) {
	        return;
	    }
	    
	    Connection c = new ConnectionDB().connect();
	    PreparedStatement psHapusById = c.prepareStatement(queryRemoveById);
	    psHapusById.setInt(1, id);
	    
	    psHapusById.executeUpdate();
	    
	    c.close();
	}
	
	public Students findById(int id) throws Exception {
        Connection c = new ConnectionDB().connect();
        PreparedStatement psFindById = c.prepareStatement(queryFindById);
        psFindById.setInt(1, id);

        ResultSet rs = psFindById.executeQuery();

        Students student = null;
        if (rs.next()) {
            student = konversiResultSet(rs);
        }

        c.close();
        return student;
    }
	
	public Students getByEmail(String email) throws Exception {
	    Connection c = new ConnectionDB().connect();
	    PreparedStatement psByEmail = c.prepareStatement(queryByEmail);
	    psByEmail.setString(1, email);

	    ResultSet rs = psByEmail.executeQuery();

	    Students students = null;
	    if (rs.next()) {
	        // Ganti pengecekan dengan menggunakan NPM sebagai password
	        String storedNpm = rs.getString("npm");
	        if (storedNpm.equals(email)) {
	            students = konversiResultSet(rs);
	        }
	    }

	    c.close();
	    return students;
	}


}