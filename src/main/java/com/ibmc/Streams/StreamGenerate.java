package com.ibmc.Streams;

import java.util.stream.Stream;

public class StreamGenerate {
    public static void main(String[] args) {


        Stream<String> streamGenerated =
                Stream.generate(() -> "element").limit(10);
    }
}
