package designpattern.adapterdesignpattern;

public class StudentAdapter implements Student{
    private final CollegeStudent student;
    public StudentAdapter(CollegeStudent student){
        this.student = student;
    }
    @Override
    public String getStudentName(){
        return student.getStudentName();
    }

    @Override
    public String getStudentEmail(){
        return student.getStudentEmail();
    }

    @Override
    public String getStudentAddress(){
        return student.getStudentAddress();
    }
}
