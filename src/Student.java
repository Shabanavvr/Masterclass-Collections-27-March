import java.util.Comparator;

public class Student implements Comparable<Student> {
    String name;
    int rollNo;
    String batch;
    int gradYear;

    Student(String name, int rollNo , int gradYear , String batch){
        this.name  = name;
        this.rollNo = rollNo;
        this.gradYear = gradYear;
        this.batch = batch;
    }

    @Override
    public int compareTo(Student o) {
        // this : called this function
        // o : passed

        // this obj to come before o obj : return -1;
        // o to come before : return 1
        // equal return 0

        if(this.rollNo < o.rollNo){
            return -1;
        } else if(this.rollNo > o.rollNo){
            return 1;
        }
        return 0;
    }
}
