package Movist;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RegularJavaTest {

    @Test
    void testTask1() {
        RegularJava regularJava = new RegularJava();
        assertTrue(regularJava.task1("Завтрак в 09:00"));
        assertTrue(regularJava.task1("14:59"));
        assertTrue(regularJava.task1("00:00"));
        assertTrue(regularJava.task1("01:23"));
        assertTrue(regularJava.task1("23:50"));
        assertTrue(regularJava.task1("19:29"));

        assertFalse(regularJava.task1("37:98"));
        assertFalse(regularJava.task1("24:00"));
        assertFalse(regularJava.task1("25:04"));
        assertFalse(regularJava.task1("23 44"));
        assertFalse(regularJava.task1("Обед в 10:61"));
        assertFalse(regularJava.task1("Ужин в десять"));
    }

    @Test
    void testTask2() {
        RegularJava regularJava = new RegularJava();
        assertTrue(regularJava.task2("aE:dC:cA:56:76:54"));//abcdef
        assertTrue(regularJava.task2("aa:bb:cc:dd:ee:ff"));
        assertTrue(regularJava.task2("ab:cd:ef:AB:CD:E1"));
        assertTrue(regularJava.task2("ba:c4:f3:88:55:1A"));
        assertTrue(regularJava.task2("DD:EE:FF:33:44:F1"));
        assertTrue(regularJava.task2("Ab:Cd:Ef:Ca:A5:67"));

        assertFalse(regularJava.task2("ab:cd:ef:AB:CD:EG"));
        assertFalse(regularJava.task2("01:23:45:67:89:Az"));
        assertFalse(regularJava.task2("aE:dC:cP:56:76:54"));
        assertFalse(regularJava.task2("Ab:Cd:Ef:Gc:A5:67"));
        assertFalse(regularJava.task2("DD:EE:rr:33:44:F1"));
        assertFalse(regularJava.task2("ba:c4:f3:88:55:101"));
    }

    @Test
    void testTask3() {
        RegularJava regularJava = new RegularJava();
        assertTrue(regularJava.task3("root@localhost"));
        assertTrue(regularJava.task3("user@example.com"));
        assertTrue(regularJava.task3("sfdfrdfdk@google.ru"));
        assertTrue(regularJava.task3("asqqw@yandex.ru"));
        assertTrue(regularJava.task3("sddfx@google.com"));
        assertTrue(regularJava.task3("data@localhost"));

        assertFalse(regularJava.task3("bug@@@com.ru"));
        assertFalse(regularJava.task3("@val.ru"));
        assertFalse(regularJava.task3("Just Text2"));
        assertFalse(regularJava.task3("sd fe asqsq data"));
        assertFalse(regularJava.task3("incorrect@yandex. dsw"));
        assertFalse(regularJava.task3("sdd.ru"));
    }

    @Test
    void testTask4() {
        RegularJava regularJava = new RegularJava();
        assertTrue(regularJava.task4("C00l_Pass"));
        assertTrue(regularJava.task4("SupperPas1"));
        assertTrue(regularJava.task4("Shtigun1999Movist2033"));
        assertTrue(regularJava.task4("sdsfQWQ123"));
        assertTrue(regularJava.task4("lgffdfs_23_AS"));
        assertTrue(regularJava.task4("FGLK343smkkm__12"));

        assertFalse(regularJava.task4("Cool_pass"));
        assertFalse(regularJava.task4("C00l"));
        assertFalse(regularJava.task4("MaksimMaks"));
        assertFalse(regularJava.task4("_____Pass"));
        assertFalse(regularJava.task4("234510030453"));
        assertFalse(regularJava.task4("qwertyuiop123"));
    }
}