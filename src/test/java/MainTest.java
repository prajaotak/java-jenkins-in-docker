import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class MainTest {

    @Test
    void checkIfInputIsAnEvenNumber() {
        assertTrue(Main.checkIfInputIsAnEvenNumber(23));
    }
}