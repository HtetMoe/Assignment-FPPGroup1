package assignment9.Prob1;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Admin {
    public static HashMap<Key, Student> processStudents(List<Student> students) {
        HashMap<Key, Student> studentMap = new HashMap<>();

        for (Student student : students) {
            Key key = new Key(student.getFirstName(), student.getLastName());
            studentMap.put(key, student);
        }
        return studentMap;
    }

    //Hash map to String
    public static String mapToString(HashMap<Key, Student> map) {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<Key, Student> entry : map.entrySet()) {
            Key key = entry.getKey();
            Student student = entry.getValue();
            sb.append("Key: ").append(key.getFirstName()).append(", ").append(key.getLastName())
                    .append(" -> ").append(student).append("\n");
        }
        return sb.toString();
    }
}
