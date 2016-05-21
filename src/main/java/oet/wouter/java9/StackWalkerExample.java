package oet.wouter.java9;

import java.util.List;
import java.util.stream.Collectors;

public class StackWalkerExample {

    public static void main(String[] args) {
        List<String> classNamesStartingWithOet = StackWalker.getInstance().walk(s ->
            s.map(StackWalker.StackFrame::getClassName)
                    .filter(name -> name.startsWith("oet"))
                    .limit(10)
                    .collect(Collectors.toList())
        );

        classNamesStartingWithOet.stream().forEach(System.out::println);
    }

}
