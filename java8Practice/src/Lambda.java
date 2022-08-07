public class Lambda {
    interface MathOperation{
        int operation(int a,int b);
    }
    interface GreetingService{
        void sayMessage(String message);
    }
    private int operate(int a,int b,MathOperation mathOperation){
        return mathOperation.operation(a,b);
    }
    public static void main(String args[]){
        Lambda tester = new Lambda();

        MathOperation additon = (a,b)->a+b;
        MathOperation sub = (int a,int b)->{return a-b;};
        MathOperation multiply = (a,b)-> a*b;
        MathOperation divide = (a,b)->a/b;
        System.out.println("a = 10, b = 5");
        System.out.println(tester.operate(10,5,additon));
        System.out.println(tester.operate(10,5,sub));
        System.out.println(tester.operate(10,5,multiply));
        System.out.println(tester.operate(10,5,divide));

        GreetingService greetingService = message -> System.out.println("hello "+message);
        greetingService.sayMessage("Tushar");
    }
}
