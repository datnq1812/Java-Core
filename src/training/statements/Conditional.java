package training.statements;

import training.entity.Person;

public class Conditional extends Person {
    public void demoIfElse (){
        int a = 10;
        if(a < 20){
            System.out.println(true);
        }
        if(a > 20){
            System.out.println(true);
        }else{
            System.out.println(false);
        }

        Student student = new Student("1", "CNTT", 8);
        if("A".equals(student.getName())){
            System.out.println("Name student: " +student.getName());
        }else if(8 == student.getAge()){
            System.out.println("Age student: " +student.getAge());
        }

        if("A".equals(student.getName())){
            System.out.println("Name student: " +student.getName());
        }else {
            System.out.println("Age student: " +student.getAge());
        }
    }

    public void demoSwitchCase(int a){
        switch (a){
            case 1:
                System.out.println(a);
            case 10:
                System.out.println(10);
                break;
            case 15:
            case 20:
                System.out.println(a);
                break;
            default:
                System.out.println("Default");
                break;
        }
    }
}
