import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Stream {
    public static void main(String args[]){
//forEach & sorted
        Random random = new Random();
        random.ints().limit(10).sorted().forEach(System.out::println);
//map
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8);
        List<Integer> squares = list.stream().map(i->i*i).collect(Collectors.toList());
        System.out.println(squares);
//statistics
        IntSummaryStatistics stats = squares.stream().mapToInt(x -> x).summaryStatistics();
        System.out.println("max: "+stats.getMax());
        System.out.println("min: "+stats.getMin());
        System.out.println("average "+stats.getAverage());
//Collectors
        List<String> strings = Arrays.asList("abc","","vdsd","tudsj","ygufhdkf","fwse");
        List<String> filtered = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());
        System.out.println(filtered);

        String mergedString = strings.stream().filter(string->!string.isEmpty()).collect(Collectors.joining(", "));
        System.out.println("merged string : "+mergedString);
//parallel processing
        long count = strings.parallelStream().filter(string->string.isEmpty()).count();
        System.out.println("count of empty strings :"+count);

    }
}
