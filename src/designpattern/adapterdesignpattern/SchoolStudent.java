package designpattern.adapterdesignpattern;

public class SchoolStudent implements Student{
    private String name;
    private String emailId;
    private String  address;
    public SchoolStudent(String name, String emailId, String address){
        this.name = name;
        this.address = address;
        this.emailId = emailId;
    }
    @Override
    public String getStudentName(){
        return name;
    }

    @Override
    public String getStudentEmail(){
        return emailId;
    }

    @Override
    public String getStudentAddress(){
        return address;
    }
}
