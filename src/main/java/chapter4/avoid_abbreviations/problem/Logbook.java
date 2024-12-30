package chapter4.avoid_abbreviations.problem;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Logbook {
    static final Path DIR = Paths.get("/var/log");
    static final Path CSV = DIR.resolve("stats.csv");
    static final String GLOB = "*.log";

    void createStats() throws IOException {
        try (DirectoryStream<Path> dirStr =
                     Files.newDirectoryStream(DIR, GLOB);
             BufferedWriter bufW = Files.newBufferedWriter(CSV)) {
            for (Path lFile : dirStr) {
                String csvLn = String.format("%s,%d,%s",
                        lFile,
                        Files.size(lFile),
                        Files.getLastModifiedTime(lFile));
                bufW.write(csvLn);
                bufW.newLine();
            }
        }
    }
}
