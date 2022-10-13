package Practice.exception;

public class ExceptionHandlingInJava {

    public void noExceptionHandling(){
        int q=30,sum;
        sum=q/0;
    }

    public void ExceptionHandlingWithTryCatchBlock()
    {
        try {
            int q=30,sum;
            sum=q/0;
            try {
            }
            catch (ArithmeticException e){
            System.out.println("Exception Handled");
            e.printStackTrace();
        }
            catch (NullPointerException e){
                System.out.println("Exception Handled");
                e.printStackTrace();
            }
        }
        finally{

            System.out.println("Finally block executed");
        }
    };
    public static void main(String[] args) {

        ExceptionHandlingInJava exceptionHandlingInJava=new ExceptionHandlingInJava();
        //exceptionHandlingInJava.noExceptionHandling();
        exceptionHandlingInJava.ExceptionHandlingWithTryCatchBlock();
    }
}
