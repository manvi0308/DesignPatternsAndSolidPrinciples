package designpattern.adapterdesignpattern;

public class CollegeStudent {
    private String name;
    private String emailId;
    private String  address;
    public CollegeStudent(String name, String emailId, String address){
        this.name = name;
        this.address = address;
        this.emailId = emailId;
    }
    public String getStudentName(){
        return name;
    }

    public String getStudentEmail(){
        return emailId;
    }

    public String getStudentAddress(){
        return address;
    }
}
