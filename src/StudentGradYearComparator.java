import java.util.Comparator;

public class StudentGradYearComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        // o1 should come before : return -1;
        // o2 should come before : return 1
        // return 0
        // desc order
        if(o1.gradYear < o2.gradYear){
            return 1;
        } else if (o1.gradYear > o2.gradYear){
            return -1;
        }
        return 0;
    }
}
