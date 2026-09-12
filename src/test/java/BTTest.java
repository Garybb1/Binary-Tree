import com.inflectra.spiratest.addons.junitextension.SpiraTestCase;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class BTTest {


    BT bt;
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();


    @BeforeEach
    public void setup() {
        this.bt = new BT();
        System.setOut(new PrintStream(outContent));
    }

    @Test
    @SpiraTestCase(testCaseId = 48364)
    void isEmpty(){

    }

    @Test
    @SpiraTestCase(testCaseId = 48363)
    public void search() {
    }

    @Test
    public void countOneNodeTreeTest() {
    }

    @Test
    public void countMultiNodesTreeTest() {
    }

    @Test
    void inorderEmptyTree() {
    }

}