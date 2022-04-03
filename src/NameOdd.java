import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class NameOdd {


    public static void main(String[] str) throws IOException {

        List<String> names = Arrays.asList("John", "Bill", "Jhon", "Peter", "Sergey", "Andrey", "Anton", "Ioann", "Max");

        String collect = IntStream.range(1, names.size() + 1)
                .filter(x -> x % 2 != 0)
                .mapToObj(x -> x + ". " + names.get(x - 1))
                //.reduce((s, s2) -> s + ", " + s2)
                .collect(Collectors.joining(", "));

        System.out.println(collect);


    }
}