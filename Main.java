import java.sql.*;
public class Main {
    private static  final String url="jdbc:mysql://localhost:3306/mydb";
    private static  final String username="root";
    private static  final String password="Anandita@1Mysql";
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj,jdbc.Driver");
        }
        catch (ClassNotFoundException e){
            System.out.println(e.getMessage());
        }
        try{
            Connection connection = DriverManager.getConnection(url,username,password);
            Statement statement = connection.createStatement();

             /*SELECT STATEMENT
            String query ="select * from students";
            ResultSet resultSet = statement.executeQuery(query);
            while(resultSet.next()){
                int id = resultSet.getInt("id");
                String name= resultSet.getString("name");
                int age = resultSet.getInt("age");
                double marks = resultSet.getDouble("marks");
                System.out.println("ID: "+id);
                System.out.println("NAME: "+name);
                System.out.println("AGE: "+age);
                System.out.println("MARKS: "+marks);

            }*/
            /*INSERT QUERY
            String query =String.format("INSERT INTO students(name,age,marks) VALUES('%s',%d,%f)","Anandita",23,85.5);
            int rowsAffected =statement.executeUpdate(query);
            if(rowsAffected>0)
            {
                System.out.println("Data inserted successfully");

            }
            else {
                System.out.println("Data not inserted");
            }*/

            /*UPDATE QUERY
            String query =String.format("UPDATE students SET marks = %f WHERE id = %d",60.0,2);
            int rowsAffected =statement.executeUpdate(query);
            if(rowsAffected>0)
            {
                System.out.println("Data Updated successfully");

            }
            else {
                System.out.println("Data not Updated");
            }*/
            //DELETE QUERY
            String query =String.format("DELETE FROM students WHERE id =2");
            int rowsAffected =statement.executeUpdate(query);
            if(rowsAffected>0)
            {
                System.out.println("Data Deleted successfully");

            }
            else {
                System.out.println("Data not Deleted");
            }




        }// End of try
        catch (SQLException e){
            System.out.println(e.getMessage());
        }

    }

}
