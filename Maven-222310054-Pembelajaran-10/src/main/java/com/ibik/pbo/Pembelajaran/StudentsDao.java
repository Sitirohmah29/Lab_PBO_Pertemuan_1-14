package com.ibik.pbo.Pembelajaran;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentsDao {
	private String queryInsert = "insert into students(npm,firstname,middlename,lastname,"
			+ "email,birthdate)"+"values(?,?,?,?,?,?)";
	
	private String querySelectAll = "select * from students"; 
	
	private String queryUpdate = "update students set npm=?, firstname=?, middlename=?, lastname=?, email=?, birthdate=? where id = ?";

	private String queryRemoveById = "delete from students where id = ?";
	
	private String queryFindById = "select * from students where id = ?";
	
	public void saved(Students students) throws Exception  {
		Connection c = new ConnectionDB().connect();
		
		PreparedStatement psInsert = c.prepareStatement(queryInsert);
		
		psInsert.setString(1, students.getNpm());
		psInsert.setString(2, students.getFirstname());
		psInsert.setString(3, students.getMiddlename());
		psInsert.setString(4, students.getLastname());
		psInsert.setString(5, students.getEmail());
		psInsert.setString(6, students.getBirthdate());
		
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
	    students.setNpm(rs.getString("npm"));
	    students.setFirstname(rs.getString("firstname"));
	    students.setMiddlename(rs.getString("middlename"));
	    students.setLastname(rs.getString("lastname"));
	    students.setEmail(rs.getString("email"));
	    students.setBirthdate(rs.getString("birthdate"));
	    return students;
	}
	
	public void updated(Students students) throws Exception {
	    Connection c = new ConnectionDB().connect();
	    PreparedStatement psUpdate = c.prepareStatement(queryUpdate);
	    
	    psUpdate.setString(1, students.getNpm());
	    psUpdate.setString(2, students.getFirstname());
	    psUpdate.setString(3, students.getMiddlename());
	    psUpdate.setString(4, students.getLastname());
	    psUpdate.setString(5, students.getEmail());
	    psUpdate.setString(6, students.getBirthdate());
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

}