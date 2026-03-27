import org.junit.jupiter.api.Test;
import ru.mirea.NumberParser;
import ru.mirea.TextNumberReplacer;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestNumberParser {

    @Test
    public void test() {
        String text = "сто одиннадцать тысяч фиолетовых оленей";

        NumberParser parser = new NumberParser();
        TextNumberReplacer replacer = new TextNumberReplacer(parser);

        String result = replacer.replaceWrittenNumbers(text);

        assertEquals("111 000 фиолетовых оленей", result);
    }
}
