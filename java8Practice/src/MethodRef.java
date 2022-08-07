import java.util.ArrayList;
import java.util.List;

public class MethodRef {
    public static void main(String args[]) {
        List list = new ArrayList();
        list.add("tushar");
        list.add("bike");
        list.add("car");
        list.add("rmgx");

        list.forEach(System.out::println);
    }
}
