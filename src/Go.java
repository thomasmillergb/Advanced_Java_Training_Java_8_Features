import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by G710 on 05/12/2016.
 */
public class Go {
    private int int_;


    public static void main(String[] args) {
        List<Integer> x = new LinkedList<>();

        x.add(30);
        x.add(1);
        x.add(20);
        x.add(3);
        x.add(35);
        x.add(63);
//        System.out.println(maxed(x));
//        System.out.println(avg(x));
//        System.out.println(sortN(x));
//        System.out.println(sortC(x));
        System.out.println(sqaureMe(x));
    }


    public static void printList(List<Integer> x){
        x.forEach(System.out::println);
    }

    static Integer maxed(List<Integer> x){
        return x.stream().max(Integer::compareTo).get();
    }

    static double avg(List<Integer> x){
        IntSummaryStatistics collect = x.stream().collect(Collectors.summarizingInt(value -> value));
        return collect.getAverage();

//        int sum = x.stream().mapToInt(Integer::intValue).sum();
//        return sum/x.size();
    }

    static List<Integer> sortN(List<Integer> x){
        return x.stream().sorted().collect(Collectors.toList());
    }

    static List<Integer> sortC(List<Integer> x ){
        x.sort(Comparator.comparingInt(o -> o));
        return x;
    }

    static Map<Integer, Integer> sqaureMe (List<Integer> x ){
        return x.stream().collect(Collectors.toMap(Integer::intValue , y -> y * y));
    }

    static Integer sum (List<Integer> x ){
        return x.stream().reduce(Integer::compareTo).get();
    }
    static Integer sumC (List<Integer> x ){
        return x.stream().mapToInt(Integer::intValue).sum();
    }

}
