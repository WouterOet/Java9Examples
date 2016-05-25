# Java 9 Examples

This project demonstrates some of the new features of Java 9. 

## Compiling

Make sure Java 9 is on your path. Check with javac -version. It should be java 9-ea.

javac -cp src/main/java -d target/classes $(find src -name *.java)

## Running

java -cp target/classes oet.wouter.java9.\<ClassName\>

## Interesting stuff

* [Microbenchmarking](https://www.youtube.com/watch?v=VaWgOCDBxYw&list=PLklQqdqnBkPjdiPGnXK-Yxc5WMLEyK1Ho&index=26)