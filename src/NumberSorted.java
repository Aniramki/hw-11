import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class NumberSorted {


    public static void main(String[] args) throws IOException {
               String[] str = {"1, 2, 0", "4, 5"};
       List<String> names =  Arrays.asList(str);

        Stream<Integer> chars = names.stream()
                .map(x -> x.split(", "))
               .flatMap(Arrays::stream)
                .map(Integer::valueOf)
                        .sorted();

        chars.forEach(System.out::println);
    }}
