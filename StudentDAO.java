import java.sql.*;
import java.util.*;

public class StudentDAO {
	private Connection con;

    public StudentDAO() {
        con = DBConnection.getConnection();
    }

    // Insert
    public void addStudent(Student student) {
        String sql = "INSERT INTO students(name, age, course, grade) VALUES(?,?,?,?)";
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, student.getName());
            ps.setInt(2, student.getAge());
            ps.setString(3, student.getCourse());
            ps.setString(4, student.getGrade());
            ps.executeUpdate();
            System.out.println("✅ Student Added!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Read
    public List<Student> getAllStudents() {
        List<Student> list = new ArrayList<>();
        String sql = "SELECT * FROM students";
        try (Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                list.add(new Student(
                    rs.getInt("id"),
                    rs.getString("name"),
                    rs.getInt("age"),
                    rs.getString("course"),
                    rs.getString("grade")
                ));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    // Update
    public void updateStudent(int id, String grade) {
        String sql = "UPDATE students SET grade=? WHERE id=?";
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, grade);
            ps.setInt(2, id);
            int rows = ps.executeUpdate();
            System.out.println(rows > 0 ? "✅ Updated!" : "❌ No student found!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Delete
    public void deleteStudent(int id) {
        String sql = "DELETE FROM students WHERE id=?";
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, id);
            int rows = ps.executeUpdate();
            System.out.println(rows > 0 ? "✅ Deleted!" : "❌ No student found!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
