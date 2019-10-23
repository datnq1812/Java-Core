package training.statements;

import java.util.ArrayList;
import java.util.List;

public class Loop {
    public void demoFor (){
        int[] arrInt = {1,2,3,4,5,6,7,8};
        List lst = new ArrayList();
        for (int i = 0; i < 5; i++){
            System.out.println(i);
            lst.add(i);
        }

        System.out.println("========== Normal for-loop ============");
        for(int a: arrInt){
            System.out.println(a);
        }

        System.out.println("========== Use Lambda =============");
        lst.forEach(i -> {
            System.out.println(i);
        });

        System.out.println("=========== Use Stream =============");
        lst.stream().forEach(System.out::println);
    }

    public void demoDoWhile(){
        int a = 10;
        int b = 10;
        System.out.println("======= WHILE ========");
        while (a < 10){
            System.out.println(a);
            a++;
        }

        System.out.println("======= DO...WHILE ========");
        do{
            System.out.println(b);
            b++;
        }while (b < 10);
    }
}
