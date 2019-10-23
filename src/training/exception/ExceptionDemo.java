package training.exception;

public class ExceptionDemo {
    public void exception(){
        int a = 1;
        int b = 0;
        System.out.println(a/b);
        System.out.println("Continue code");
    }

    public void nonException(){
        try{
            int a = 1;
            int b = 0;
            System.out.println(a/b);
        }catch (Exception e){
            System.out.println("Have error");
//            e.printStackTrace();
        }
        System.out.println("Continue code");
    }

    public void throwsException() throws Exception{
        int a = 1;
        int b = 0;
        System.out.println(a/b);
        System.out.println("Continue code");
        throw new Exception();
    }
}
