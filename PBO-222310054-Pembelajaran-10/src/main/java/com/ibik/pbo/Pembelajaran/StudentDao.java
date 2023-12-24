package com.ibik.pbo.Pembelajaran;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentDao {
	private String queryInsert = "INSERT INTO students (npm, firstname, middlename, lastname) VALUES (?, ?, ?, ?)";
	private String querySelectAll = "SELECT * FROM students";
	private String queryUpdate = "UPDATE students SET npm = ?, firstname = ?, middlename = ?, lastname = ? WHERE id = ?";
	private String queryRemoveById = "DELETE FROM students WHERE id = ? LIMIT 1";
	private String queryFindById = "SELECT * FROM students WHERE id = ?";

	public void saved(Students students) throws Exception {
		Connection c = new ConnectionDB().connect();
		PreparedStatement psInsert = c.prepareStatement(queryInsert);
		psInsert.setString(1, students.getNpm());
		psInsert.setString(2, students.getFirstname());
		psInsert.setString(3, students.getMiddlename());
		psInsert.setString(4, students.getLastname());
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
	   return students;
	}

	public void updated(Students students) throws Exception {
	   Connection c = new ConnectionDB().connect();
	   PreparedStatement psUpdate = c.prepareStatement(queryUpdate);
	   psUpdate.setString(1, students.getNpm());
	   psUpdate.setString(2, students.getFirstname());
	   psUpdate.setString(3, students.getMiddlename());
	   psUpdate.setString(4, students.getLastname());
	   psUpdate.setInt(5, students.getId());
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
