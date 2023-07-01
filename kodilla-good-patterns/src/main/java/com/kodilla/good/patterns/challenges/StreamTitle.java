package com.kodilla.good.patterns.challenges;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamTitle {
    public static void main(String[] args) throws IOException {

        MovieStore movieStore = new MovieStore();
        Map<String, List<String>> moviesMap = movieStore.getMovies();

        String allTitles = moviesMap.values().stream()
                .flatMap(List::stream)
                .collect(Collectors.joining(" ! "));

        PrintStream out = new PrintStream(System.out, true, "UTF-8");
        OutputStreamWriter writer = new OutputStreamWriter(out, "UTF-8");
        writer.write(allTitles);
        writer.flush();
        System.out.println();
        System.out.println(allTitles);

    }
}