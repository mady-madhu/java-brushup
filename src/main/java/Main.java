import java.util.List;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException {

        List<Integer> list = List.of(1,2,3,4,5);
        Stream<Integer> integerStream = list.stream();
        integerStream.mapToInt(Integer::intValue).sum();
        integerStream.mapToInt(Integer::intValue).max();

    }
}
