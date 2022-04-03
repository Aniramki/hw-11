import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class NameZA {


    public static void main(String[] str) throws IOException {

        List<String> names = Arrays.asList("John", "Bill", "Jhon", "Peter", "Sergey", "Andrey", "Anton", "Ioann", "Max");

        List<String> sortedList = names.stream()
                .sorted(Collections.reverseOrder())
                .collect(Collectors.toList());

        System.out.println(sortedList.toString().toUpperCase(Locale.ROOT));
    }}
