//prova

package it.unipd.mtss;

import org.junit.Before;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;
public class RomanPrinterTest {

    @Test
    public void testIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> RomanPrinter.print(0));
        assertThrows(IllegalArgumentException.class, () -> RomanPrinter.print(1001));
        assertThrows(IllegalArgumentException.class, () -> RomanPrinter.print(-1));
    } 

    @Test
    public void testPrint() {
         RomanPrinter rp = new RomanPrinter();
        String ascii = rp.print(1);

        assertEquals(" _____  \n" +
                "|_   _| \n" +
                "  | |   \n" +
                "  | |   \n" +
                " _| |_  \n" +
                "|_____| \n", ascii);
        assertEquals(" _____  " + " _____  \n" +
                "|_   _| " + "|_   _| \n" +
                "  | |   " + "  | |   \n" +
                "  | |   " + "  | |   \n" +
                " _| |_  " + " _| |_  \n" +
                "|_____| " + "|_____| \n", RomanPrinter.print(2));
        assertEquals(" _____  " + " _____  " + " _____  \n" +
                "|_   _| " + "|_   _| " + "|_   _| \n" +
                "  | |   " + "  | |   " + "  | |   \n" +
                "  | |   " + "  | |   " + "  | |   \n" +
                " _| |_  " + " _| |_  " + " _| |_  \n" +
                "|_____| " + "|_____| " + "|_____| \n", RomanPrinter.print(3));
	assertEquals(" _____  " + "__      __ \n" +
                "|_   _| " + "\\ \\    / / \n" +
                "  | |   " + " \\ \\  / /  \n" +
                "  | |   " + "  \\ \\/ /   \n" +
                " _| |_  " + "   \\  /    \n" +
                "|_____| " + "    \\/     \n", RomanPrinter.print(4));
        assertEquals("__      __ \n" +
                "\\ \\    / / \n" +
                " \\ \\  / /  \n" +
                "  \\ \\/ /   \n" +
                "   \\  /    \n" +
                "    \\/     \n", RomanPrinter.print(5));
        assertEquals("__      __ " + " _____  \n" +
                "\\ \\    / / " + "|_   _| \n" +
                " \\ \\  / /  " + "  | |   \n" +
                "  \\ \\/ /   " + "  | |   \n" +
                "   \\  /    " + " _| |_  \n" +
                "    \\/     " + "|_____| \n", RomanPrinter.print(6));
	assertEquals("__      __ " + " _____  " + " _____  \n" +
                "\\ \\    / / " + "|_   _| " + "|_   _| \n" +
                " \\ \\  / /  " + "  | |   " + "  | |   \n" +
                "  \\ \\/ /   " + "  | |   " + "  | |   \n" +
                "   \\  /    " + " _| |_  " + " _| |_  \n" +
                "    \\/     " + "|_____| " + "|_____| \n", RomanPrinter.print(7));
        assertEquals(" _____  " + "__   __ \n" +
                "|_   _| " + "\\ \\ / / \n" +
                "  | |   " + " \\ V /  \n" +
                "  | |   " + "  > <   \n" +
                " _| |_  " + " / . \\  \n" +
                "|_____| " + "/_/ \\_\\ \n", RomanPrinter.print(9));
        assertEquals("__   __ \n" +
                "\\ \\ / / \n" +
                " \\ V /  \n" +
                "  > <   \n" +
                " / . \\  \n" +
                "/_/ \\_\\ \n", RomanPrinter.print(10));
	assertEquals("__   __ " + "__      __ \n" +
                "\\ \\ / / " + "\\ \\    / / \n" +
                " \\ V /  " + " \\ \\  / /  \n" +
                "  > <   " + "  \\ \\/ /   \n" +
                " / . \\  " + "   \\  /    \n" +
                "/_/ \\_\\ " + "    \\/     \n", RomanPrinter.print(15));
        assertEquals("__   __ " + " _____  " + "__   __ \n" +
                "\\ \\ / / " + "|_   _| " + "\\ \\ / / \n" +
                " \\ V /  " + "  | |   " + " \\ V /  \n" +
                "  > <   " + "  | |   " + "  > <   \n" +
                " / . \\  " + " _| |_  " + " / . \\  \n" +
                "/_/ \\_\\ " + "|_____| " + "/_/ \\_\\ \n", RomanPrinter.print(19));
        assertEquals("__   __ " + "__   __ \n" +
                "\\ \\ / / " + "\\ \\ / / \n" +
                " \\ V /  " + " \\ V /  \n" +
                "  > <   " + "  > <   \n" +
                " / . \\  " + " / . \\  \n" +
                "/_/ \\_\\ " + "/_/ \\_\\ \n", RomanPrinter.print(20));
	assertEquals("__   __ " + "__   __ " + "__   __ \n" +
                "\\ \\ / / " + "\\ \\ / / " + "\\ \\ / / \n" +
                " \\ V /  " + " \\ V /  " + " \\ V /  \n" +
                "  > <   " + "  > <   " + "  > <   \n" +
                " / . \\  " + " / . \\  " + " / . \\  \n" +
                "/_/ \\_\\ " + "/_/ \\_\\ " + "/_/ \\_\\ \n", RomanPrinter.print(30));
        assertEquals("__   __ " + " _       \n" +
                "\\ \\ / / " + "| |      \n" +
                " \\ V /  " + "| |      \n" +
                "  > <   " + "| |      \n" +
                " / . \\  " + "| |____  \n" +
                "/_/ \\_\\ " + "|______| \n", RomanPrinter.print(40));
        assertEquals(" _       \n" +
                "| |      \n" +
                "| |      \n" +
                "| |      \n" +
                "| |____  \n" +
                "|______| \n", RomanPrinter.print(50));
	assertEquals(" _       " + "__   __ \n" +
                "| |      " + "\\ \\ / / \n" +
                "| |      " + " \\ V /  \n" +
                "| |      " + "  > <   \n" +
                "| |____  " + " / . \\  \n" +
                "|______| " + "/_/ \\_\\ \n", RomanPrinter.print(60));
        assertEquals("__   __ " + "  _____  \n" +
                "\\ \\ / / " + " / ____| \n" +
                " \\ V /  " + "| |      \n" +
                "  > <   " + "| |      \n" +
                " / . \\  " + "| |____  \n" +
                "/_/ \\_\\ " + " \\_____| \n", RomanPrinter.print(90));
        assertEquals("  _____  \n" +
                " / ____| \n" +
                "| |      \n" +
                "| |      \n" +
                "| |____  \n" +
                " \\_____| \n", RomanPrinter.print(100));
	assertEquals("  _____  " + "  _____  \n" +
                " / ____| " + " / ____| \n" +
                "| |      " + "| |      \n" +
                "| |      " + "| |      \n" +
                "| |____  " + "| |____  \n" +
                " \\_____| " + " \\_____| \n", RomanPrinter.print(200));
        assertEquals("  _____  " + " _____   \n" +
                " / ____| " + "|  __ \\  \n" +
                "| |      " + "| |  | | \n" +
                "| |      " + "| |  | | \n" +
                "| |____  " + "| |__| | \n" +
                " \\_____| " + "|_____/  \n", RomanPrinter.print(400));
        assertEquals(" _____   \n" +
                "|  __ \\  \n" +
                "| |  | | \n" +
                "| |  | | \n" +
                "| |__| | \n" +
                "|_____/  \n", RomanPrinter.print(500));
	assertEquals(" _____   " + "  _____  \n" +
                "|  __ \\  " + " / ____| \n" +
                "| |  | | " + "| |      \n" +
                "| |  | | " + "| |      \n" +
                "| |__| | " + "| |____  \n" +
                "|_____/  " + " \\_____| \n", RomanPrinter.print(600));
        assertEquals("  _____  " + " __  __  \n" +
                " / ____| " + "|  \\/  | \n" +
                "| |      " + "| \\  / | \n" +
                "| |      " + "| |\\/| | \n" +
                "| |____  " + "| |  | | \n" +
                " \\_____| " + "|_|  |_| \n", RomanPrinter.print(900));
        assertEquals("  _____  " + " __  __  " + "__   __ " + " _       " + " _____  " + "__      __ \n" +
                " / ____| " + "|  \\/  | " + "\\ \\ / / " + "| |      " + "|_   _| " + "\\ \\    / / \n" +
                "| |      " + "| \\  / | " + " \\ V /  " + "| |      " + "  | |   " + " \\ \\  / /  \n" +
                "| |      " + "| |\\/| | " + "  > <   " + "| |      " + "  | |   " + "  \\ \\/ /   \n" +
                "| |____  " + "| |  | | " + " / . \\  " + "| |____  " + " _| |_  " + "   \\  /    \n" +
                " \\_____| " + "|_|  |_| " + "/_/ \\_\\ " + "|______| " + "|_____| " + "    \\/     \n", RomanPrinter.print(944));
        assertEquals("  _____  " + " __  __  " + "__   __ " + "  _____  " + " _____  " + "__   __ \n" +
                " / ____| " + "|  \\/  | " + "\\ \\ / / " + " / ____| " + "|_   _| " + "\\ \\ / / \n" +
                "| |      " + "| \\  / | " + " \\ V /  " + "| |      " + "  | |   " + " \\ V /  \n" +
                "| |      " + "| |\\/| | " + "  > <   " + "| |      " + "  | |   " + "  > <   \n" +
                "| |____  " + "| |  | | " + " / . \\  " + "| |____  " + " _| |_  " + " / . \\  \n" +
                " \\_____| " + "|_|  |_| " + "/_/ \\_\\ " + " \\_____| " + "|_____| " + "/_/ \\_\\ \n", RomanPrinter.print(999));
        assertEquals(" __  __  \n" +
                "|  \\/  | \n" +
                "| \\  / | \n" +
                "| |\\/| | \n" +
                "| |  | | \n" +
                "|_|  |_| \n", RomanPrinter.print(1000));
    }
}
