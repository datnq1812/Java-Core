package training;

import training.dataTypes.DataTypes;
import training.exception.ExceptionDemo;
import training.statements.Conditional;
import training.statements.Loop;
import training.statements.Student;

public class Main {

    public static void main(String[] args) {
        Conditional conditional = new Conditional();
//        conditional.demoIfElse();
//        conditional.demoSwitchCase(100);

        Loop loop = new Loop();
//        loop.demoFor();
//        loop.demoDoWhile();

        DataTypes dataTypes = new DataTypes();
//        dataTypes.demoDataJava();

        Student student = new Student();
//        student.demoProtected();

        ExceptionDemo exceptionDemo = new ExceptionDemo();
//        exceptionDemo.exception();
        exceptionDemo.nonException();
//        exceptionDemo.throwException();
    }
}
