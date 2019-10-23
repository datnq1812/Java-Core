package training.dataTypes;

import training.statements.Student;

public class DataTypes {
    public void demoDataJava(){
        int a = 3;
        int b = a;

        a += 3;
        System.out.println(a + " và " +b);

        Student studentFirst = new Student();
        Student studentSecond = studentFirst;
        studentFirst.setName("Nguyen Van A");
        studentSecond.setName("Nguyen Van B");
        System.out.println(studentFirst.getName());
        System.out.println(studentSecond.getName());

    }
}
