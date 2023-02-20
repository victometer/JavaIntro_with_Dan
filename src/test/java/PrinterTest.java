import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {
    Printer printer;

    @Before
    public void before(){
        printer = new Printer();
    }
    @Test
    public void hasPaper(){
        assertEquals(5, printer.checkTray());
    }
    @Test
    public void canPrint(){
        assertEquals("Done", printer.print(1,0));
    }
    @Test
    public void canPrintWithToner(){
        assertEquals("Please load 1", printer.print(1,5));
    }

}
