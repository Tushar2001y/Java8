import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class FunInterface {
    public static void eval(List<Integer> list, Predicate<Integer> predicate){
        for(int n:list){
            if(predicate.test(n)){
                System.out.println(n);
            }
        }
    }
    public static void main(String args[]){
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        System.out.println("Printing all numbers");
        eval(list,n->true);
        System.out.println("Printing even numbers");
        eval(list,n->n%2==0);
        System.out.println("Printing numbers bw 4 & 9");
        eval(list,n->n>3&&n<10);
    }
}
