import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Writer {
    public void write (FIO fio) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fio.firstName + ".txt", true));) {
            writer.write(fio.toString());
        } catch (IOException e) {
            throw new RuntimeException("Файл недоступен");
        }
    }
}

