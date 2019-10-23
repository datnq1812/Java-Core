package training.statements;

import training.entity.Person;

public class Student extends Person {
    private String id;

    private String classes;

    private Integer point;

    public Student(String id, String classes, Integer point) {
        this.id = id;
        this.classes = classes;
        this.point = point;
    }

    public Student (){

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public Integer getPoint() {
        return point;
    }

    public void setPoint(Integer point) {
        this.point = point;
    }

    public static void main(String[] args) {
        Student student = new Student();
    }

    @Override
    public void demoProtected(){
        System.out.println("Student protected");
    }
}
