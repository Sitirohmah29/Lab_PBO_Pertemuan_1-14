package com.ibik.pbo.Pembelajaran;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class StudentsScoreDao {
	private String queryInsert = "insert into students_score(npm,nama,nilai)"+"values(?,?,?)";
	
	private String querySelectAll = "select * from students_score"; 
	
	private String queryUpdate = "update students_score set npm=?, nama=?,   nama=?, where id = ?";

	private String queryRemoveByNpm = "delete from students_score where npm = ?";
	
	private String queryFindById = "select * from students_score where id = ?";
	
	private String queryRemoveAllByNpm = "delete from students_score where npm = ?";
	
//	private String queryByNpm = "select * from students_score where npm = ?";
	
	public void saved(StudentsScore students) throws Exception  {
		Connection c = new ConnectionDB().connect();
		
		PreparedStatement psInsert = c.prepareStatement(queryInsert);
		
		
		psInsert.setString(1, students.getNpm());   
		psInsert.setString(2, students.getNama());
		psInsert.setString(3, students.getNilai());		
		psInsert.executeUpdate();
		
		c.close();
	}
	
	public List<StudentsScore> findAll() throws Exception {
	    List<StudentsScore> hasil = new ArrayList<>();
	    Connection c = new ConnectionDB().connect();
	    PreparedStatement psCariSemuaProduk = c.prepareStatement(querySelectAll);
	    ResultSet rs = psCariSemuaProduk.executeQuery();

	    while (rs.next()) {
	        StudentsScore students = konversiResultSet(rs);
	        hasil.add(students);
	    }

	    c.close();
	    return hasil;
	}

	private StudentsScore konversiResultSet(ResultSet rs) throws SQLException {
	    StudentsScore students = new StudentsScore();
	    students.setId(rs.getInt("id"));
	    students.setNpm(rs.getString("npm"));
	    students.setNama(rs.getString("nama"));
	    students.setNilai(rs.getString("nilai"));
	
	    return students;
	}
	
	public void updated(StudentsScore students) throws Exception {
	    Connection c = new ConnectionDB().connect();
	    PreparedStatement psUpdate = c.prepareStatement(queryUpdate);
	    
	    
	    psUpdate.setString(1, students.getNpm());
	    psUpdate.setString(2, students.getNama());
	    psUpdate.setString(3, students.getNilai());
	    psUpdate.setInt(4, students.getId());
	    	    
	    psUpdate.executeUpdate();
	    
	    c.close();
	}

	public void removed(String npm) throws Exception {
	    if (npm == null || npm.isEmpty()) {
	        return;
	    }

	    Connection c = new ConnectionDB().connect();
	    PreparedStatement psHapusByNpm = c.prepareStatement(queryRemoveByNpm);
	    psHapusByNpm.setString(1, npm);

	    psHapusByNpm.executeUpdate();

	    c.close();
	}
	
	public StudentsScore findById(int id) throws Exception {
        Connection c = new ConnectionDB().connect();
        PreparedStatement psFindById = c.prepareStatement(queryFindById);
        psFindById.setInt(1, id);

        ResultSet rs = psFindById.executeQuery();

        StudentsScore student = null;
        if (rs.next()) {
            student = konversiResultSet(rs);
        }

        c.close();
        return student;
    }
	
	public void removeAllByNpm(String npm) throws Exception {
	       if (npm == null || npm.isEmpty()) {
	           return;
	       }

	       Connection c = new ConnectionDB().connect();
	       PreparedStatement psRemoveAllByNpm = c.prepareStatement(queryRemoveAllByNpm);
	       psRemoveAllByNpm.setString(1, npm);

	       psRemoveAllByNpm.executeUpdate();

	       c.close();
	   }
}