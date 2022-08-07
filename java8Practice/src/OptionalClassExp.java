import java.util.Optional;

public class OptionalClassExp {
    public static void main(String args[]){
        OptionalClassExp optionalClassExp = new OptionalClassExp();
        Integer val1 = null;
        Integer val2 = 10;

        // Optional ofNullable
        Optional<Integer> a = Optional.ofNullable(val1);
        // Optional.of
        Optional<Integer> b = Optional.of(val2);
        System.out.println(optionalClassExp.sum(a,b));
    }
    public Integer sum(Optional<Integer> a,Optional<Integer> b){
        System.out.println("Is first parameter present: "+a.isPresent());
        System.out.println("Is second parameter present: "+b.isPresent());

        Integer val1 = a.orElse(0);
        Integer val2 = b.get();
        return val1+val2;
    }
}
