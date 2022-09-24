package set;

import java.util.*;

public class TReeSet {
    public static void main(String[] args) {
        TreeSet<Student> s = new TreeSet<>();
        s.add(new Student(1,"narayan", "prajapati"));
        s.add(new Student(8,"sanjay", "ata nahi"));
        s.add(new Student(3,"mayank", "sharma"));
        s.add(new Student(5,"kishan", "sudarshan"));
        s.add(new Student(9,"nirbhay", "singh"));

        Iterator<Student> it = s.iterator();
        while (it.hasNext()){
            Student st = it.next();
            System.out.println(st.rollNo +" " + st.fName + " "+ st.lName);

        }

    }
}

class Student implements Comparable<Student> {
    int rollNo;
    String fName;
    String lName;

    public Student(int rollNo, String fName, String lName) {
        this.rollNo = rollNo;
        this.fName = fName;
        this.lName = lName;
    }


    @Override
    public int compareTo(Student o) {
//        if(rollNo > o.rollNo){
//            return 1;
//        } else if (rollNo < o.rollNo) {
//            return -1;
//        }else {
//            return 0;
//        }
        return Integer.compare( rollNo,o.rollNo);
    }
}
