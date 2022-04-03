package task4;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
        import java.util.stream.Stream;

public class RandomAlgorytmStream {
    public static void main(String[] args) {
        RandomAlgoritm r = new RandomAlgoritm(11, (long) Math.pow(2, 48));
        //List<Integer> names =  Arrays.asList(r);

        Stream<Long> stream =
                Stream.iterate(25214903917L, (seed) -> r.a(seed).next());

                stream
                .limit(20)
                .peek(System.out::println)
                .collect(Collectors.toList());
    }
}
