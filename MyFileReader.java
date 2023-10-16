import java.io.*;
import java.util.ArrayList;
import java.util.List;
public class MyFileReader {
    public static void main (String[] args)throws IOException{
        List<String> studentNames = new ArrayList<String>();
        FileReader filereader = new FileReader("C:/Users/dell/Desktop/Java11_Assignments/StudentList.txt");
        BufferedReader reader = new BufferedReader(filereader);
        String line;
        while ((line = reader.readLine()) != null) {
            if (!line.isEmpty()) {
                studentNames.add(line);
            }
        }
        reader.close();
        int studentCount = studentNames.size();
        System.out.println("Student names:");
        for (String studentName : studentNames) {
            System.out.println(studentName);
        }
        System.out.println("Total count of students: " + studentCount);

    }

}
