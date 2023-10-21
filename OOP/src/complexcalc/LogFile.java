package complexcalc;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

class LogFile extends LogFileFactory {
    private static LogFile instance;

    private LogFile() {

    }

    public static LogFile getInstance() {
        if (instance == null) {
            instance = new LogFile();
        }
        return instance;
    }

    public Boolean logger(String logstr) {
        try {
            Files.writeString(Path.of("logfile.txt"),  logstr + "\n", StandardOpenOption.APPEND);
            return true;
        } catch (IOException e) {
            return false;
        }
    }
}
