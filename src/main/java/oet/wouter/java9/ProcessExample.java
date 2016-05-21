package oet.wouter.java9;

import java.io.IOException;

public class ProcessExample {

    public static void main(String[] args) throws IOException {
        Process process = new ProcessBuilder("ls").inheritIO().start(); // Change ls to dir on Windows
        process.onExit().thenRun(() -> System.out.println("Done")); // CompletableFuture :)
        System.out.println(process.getPid());
    }

}
