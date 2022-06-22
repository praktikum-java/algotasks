package practicum;

import org.junit.Test;

import java.util.List;
import static org.junit.Assert.*;

public class AlgorithmsTest {

    @Test
    public void maxMinAvrTest() {
        assertEquals(3, Algorithms.maxMinAvr(List.of(1 )), 0.0);
        assertEquals(3, Algorithms.maxMinAvr(List.of(1, 1, 1 )), 0.0);
        assertEquals(-3, Algorithms.maxMinAvr(List.of(-1 )), 0.0);
        assertEquals(-3, Algorithms.maxMinAvr(List.of(-1,-1,-1 )), 0.0);
        assertEquals(0, Algorithms.maxMinAvr(List.of(0)), 0.01);
        assertEquals(3, Algorithms.maxMinAvr(List.of(1, 1)), 0.0);
        assertEquals(0, Algorithms.maxMinAvr(List.of(1, -1)), 0.0);
        assertEquals(4.33, Algorithms.maxMinAvr(List.of( 1, 1, 2 )), 0.01);
        assertEquals(1.66, Algorithms.maxMinAvr(List.of( 1, -1, 2 )), 0.01);
        assertEquals(4.66, Algorithms.maxMinAvr(List.of( 1, 2, 2 )), 0.01);
        assertEquals(0.33, Algorithms.maxMinAvr(List.of( 1, -2, 2 )), 0.01);
        assertEquals(6, Algorithms.maxMinAvr(List.of( 2, 2, 2 )), 0.0);
        assertEquals(0, Algorithms.maxMinAvr(List.of( -2, 2, -2, 2 )), 0.0);
        assertEquals(13.22, Algorithms.maxMinAvr(List.of( 1, 2, 5, 5, 6, 7, 7, 7, 7 )), 0.01);
    }
    @Test
    public void max2Test() {
        assertEquals(1, Algorithms.max2(List.of( 1 )).intValue());
        assertEquals(1, Algorithms.max2(List.of( 1, 2 )).intValue());
        assertEquals(6, Algorithms.max2(List.of( 1, 2, 3, 4, 5, 6, 7 )).intValue());
        assertEquals(1, Algorithms.max2(List.of( 1, 1 )).intValue());
        assertEquals(1, Algorithms.max2(List.of( 1, 1, 2 )).intValue());
        assertEquals(1, Algorithms.max2(List.of( 1, 2, 2 )).intValue());
        assertEquals(2, Algorithms.max2(List.of( 2, 2, 2 )).intValue());
        assertEquals(6, Algorithms.max2(List.of( 1, 2, 5, 5, 6, 7, 7, 7, 7 )).intValue());
    }


    @Test
    public void removeElementFromArrayTest() {
        assertArrayEquals(new int[]{1, 2, 4, 5, 1, 6, 1}, Algorithms.removeElementFromArray(new int[]{1, 2, 4, 5, 1, 6, 1}, 0));
        assertArrayEquals(new int[]{1, 2, 4, 5, 6, 1}, Algorithms.removeElementFromArray(new int[]{1, 2, 4, 5, 0, 6, 1}, 0));
        assertArrayEquals(new int[]{1, 2, 4, 5, 6}, Algorithms.removeElementFromArray(new int[]{1, 2, 4, 5, 0, 6, 0}, 0));
        assertArrayEquals(new int[]{2, 4, 5, 6}, Algorithms.removeElementFromArray(new int[]{0, 2, 4, 5, 0, 6, 0}, 0));
        assertArrayEquals(new int[]{2, 2}, Algorithms.removeElementFromArray(new int[]{2, 2}, 0));
        assertArrayEquals(new int[]{2}, Algorithms.removeElementFromArray(new int[]{2}, 0));
        assertArrayEquals(new int[]{2}, Algorithms.removeElementFromArray(new int[]{0, 0, 2}, 0));
        assertArrayEquals(new int[]{2}, Algorithms.removeElementFromArray(new int[]{2, 0, 0}, 0));
        assertArrayEquals(new int[]{}, Algorithms.removeElementFromArray(new int[]{0}, 0));
        assertArrayEquals(new int[]{}, Algorithms.removeElementFromArray(new int[]{0, 0, 0, 0}, 0));
        assertArrayEquals(new int[]{}, Algorithms.removeElementFromArray(new int[]{}, 0));

        assertArrayEquals(new int[]{2, 4, 5, 6}, Algorithms.removeElementFromArray(new int[]{1, 2, 4, 5, 1, 6, 1}, 1));
        assertArrayEquals(new int[]{1, 2, 5, 0, 6, 1}, Algorithms.removeElementFromArray(new int[]{1, 2, 4, 5, 0, 6, 1}, 4));
        assertArrayEquals(new int[]{1, 2, 4, 5, 0, 6, 0}, Algorithms.removeElementFromArray(new int[]{1, 2, 4, 5, 0, 6, 0}, -1));
        assertArrayEquals(new int[]{0, 2, 4, 0, 6, 0}, Algorithms.removeElementFromArray(new int[]{5, 0, 2, 4, 5, 0, 6, 0, 5}, 5));
        assertArrayEquals(new int[]{}, Algorithms.removeElementFromArray(new int[]{2, 2, 2, 2, 2, 2}, 2));
        assertArrayEquals(new int[]{2}, Algorithms.removeElementFromArray(new int[]{2}, 3));
        assertArrayEquals(new int[]{}, Algorithms.removeElementFromArray(new int[]{-9}, -9));
        assertArrayEquals(new int[]{2, 0, 0, 0}, Algorithms.removeElementFromArray(new int[]{2, 3, 3, 0, 0, 0}, 3));
        assertArrayEquals(new int[]{}, Algorithms.removeElementFromArray(new int[]{}, 9));
    }


    @Test
    public void removeVowelsTest() {
        assertEquals("мм мл рм", Algorithms.removeVowels("мама мыла раму"));
        assertEquals("мм мл рм", Algorithms.removeVowels("мАма мЫла рамУ"));
        assertEquals("мм мл рм", Algorithms.removeVowels("мАмА мЫлА рАмУ"));
        assertEquals(" ", Algorithms.removeVowels("аааа уууу"));
        assertEquals("", Algorithms.removeVowels("ААААуууу"));
        assertEquals("", Algorithms.removeVowels("аааааУУУ"));
        assertEquals("", Algorithms.removeVowels(""));
        assertEquals("К Л М Н", Algorithms.removeVowels("К Л М Н"));
        assertEquals("КЛМН", Algorithms.removeVowels("КЛМН"));
        assertEquals("Jst d t!", Algorithms.removeVowels("Just do it!"));
        assertEquals("jST D T!", Algorithms.removeVowels("jUST DO IT!"));
        assertEquals("JSTDT!", Algorithms.removeVowels("JUSTDOIT!"));
    }


    @Test
    public void removeDublicatesTest() {
        assertEquals("молоко", Algorithms.removeDublicates("молоко"));
        assertEquals("молоко", Algorithms.removeDublicates("молокооо"));
        assertEquals("молоко", Algorithms.removeDublicates("мммммолоко"));
        assertEquals("молоко", Algorithms.removeDublicates("мммммолокооо"));
        assertEquals("молоко", Algorithms.removeDublicates("мммммооолллллооооккккооо"));
        assertEquals("мама мыла раму", Algorithms.removeDublicates("мама   мыла   раму"));
        assertEquals("(Кто? мыл? мама.)", Algorithms.removeDublicates("(((Ккто???   мМыл???   мМама...)))"));
        assertEquals("jUST DO IT!", Algorithms.removeDublicates("jJUuSsTt DO IT!"));
        assertEquals("моЛокО", Algorithms.removeDublicates("мМммооЛллокКОоо"));
        assertEquals(" ", Algorithms.removeDublicates(" "));
        assertEquals("Я", Algorithms.removeDublicates("Я"));
        assertEquals("", Algorithms.removeDublicates(""));
    }


    @Test
    public void zipStrTest() {
        assertEquals("п1а1н1о1р1а1м1а1", Algorithms.zipStr("панорама"));
        assertEquals("п4а1н1о1р1а1м1а1", Algorithms.zipStr("ппппанорама"));
        assertEquals("п1а1н1о1р1а1м1а5", Algorithms.zipStr("панорамааааа"));
        assertEquals("п3а3н3о2р5а1м1а5", Algorithms.zipStr("пппаааннноорррррамааааа"));
        assertEquals("П1п2А1а2Н1н2О1о2Р1р2А1а2М1м2А1а2", Algorithms.zipStr("ПппАааНннОооРррАааМммАаа"));
        assertEquals("м3о3й2 3д1я1д1я3 1с2а3м1ы1х1 4ч1е1с1т3н2ы1х1.3", Algorithms.zipStr("мммооойй   дядяяя ссааамых    честттнных..."));
        assertEquals("", Algorithms.zipStr(""));
        assertEquals(" 1", Algorithms.zipStr(" "));
        assertEquals("а1", Algorithms.zipStr("а"));
    }


    @Test
    public void isPalindromTest() {
        assertTrue( Algorithms.isPalindrom("топот"));
        assertFalse(Algorithms.isPalindrom("ропот"));
        assertTrue(Algorithms.isPalindrom("А роза упала на лапу Азора"));
        assertTrue(Algorithms.isPalindrom("а роза упала на лапу Азора"));
        assertTrue(Algorithms.isPalindrom("Ад - жажда!"));
        assertTrue(Algorithms.isPalindrom("Ад - жар, вражда!"));
        assertTrue(Algorithms.isPalindrom("Madam, I'm Adam."));
        assertTrue(Algorithms.isPalindrom("A man, a plan, a canal-Panama."));
        assertTrue(Algorithms.isPalindrom("Was it a car or a cat I saw?"));
        assertTrue(Algorithms.isPalindrom("\"Not New York\", – Roy went on"));
        assertTrue(Algorithms.isPalindrom(" "));
        assertTrue(Algorithms.isPalindrom(""));
    }


    @Test
    public void reverseWordsInSentenceTest() {
        assertEquals("араж", Algorithms.reverseWordsInSentence("жара"));
        assertEquals("лыб цясем йам", Algorithms.reverseWordsInSentence("был месяц май"));
        assertEquals(" ", Algorithms.reverseWordsInSentence(" "));
        assertEquals("", Algorithms.reverseWordsInSentence(""));
        assertEquals("йоМ ядяд хымас хынтсеч ливарп...", Algorithms.reverseWordsInSentence("Мой дядя самых честных правил..."));
        assertEquals("дА - раж, аджарв!", Algorithms.reverseWordsInSentence("Ад - жар, вражда!"));
    }


    @Test
    public void sortSymbolsTest() {
        assertArrayEquals(new char[]{'a', 'b', 'c', 'd'}, Algorithms.sortSymbols(new char[]{'c', 'a', 'b', 'd'}));
        assertArrayEquals(new char[]{'a'}, Algorithms.sortSymbols(new char[]{'a'}));
        assertArrayEquals(new char[]{'a', 'a','a', 'a'}, Algorithms.sortSymbols(new char[]{'a', 'a','a', 'a'}));
        assertArrayEquals(new char[]{'a', 'b', 'c', 'd', 'а', 'б', 'в', 'г', 'у'}, Algorithms.sortSymbols(new char[]{'г','а','в','у','б','c', 'a', 'b', 'd'}));
    }


    @Test
    public void isAnogramOfTest() {
        assertTrue(Algorithms.isAnogramOf("кот", "ток"));
        assertFalse(Algorithms.isAnogramOf("кот", "кит"));
        assertFalse(Algorithms.isAnogramOf("бокал", "калоба"));
        assertTrue(Algorithms.isAnogramOf("бокал", "колба"));
        assertTrue(Algorithms.isAnogramOf("", ""));
        assertFalse(Algorithms.isAnogramOf(" ", ""));
        assertFalse(Algorithms.isAnogramOf("", " "));
        assertTrue(Algorithms.isAnogramOf("утончённость", "уточнённость"));
        assertTrue(Algorithms.isAnogramOf("выборочность", "обрывочность"));
    }


    @Test
    public void hasUniqueCharsTest() {
        assertTrue(Algorithms.hasUniqueChars(""));
        assertTrue(Algorithms.hasUniqueChars("t"));
        assertFalse(Algorithms.hasUniqueChars("tt"));
        assertFalse(Algorithms.hasUniqueChars("я"));
        assertFalse(Algorithms.hasUniqueChars("tя"));
        assertTrue(Algorithms.hasUniqueChars("maslo"));
        assertTrue(Algorithms.hasUniqueChars(""));
        assertFalse(Algorithms.hasUniqueChars(" maslo "));
        assertFalse(Algorithms.hasUniqueChars("масло"));
        assertFalse(Algorithms.hasUniqueChars("panorama"));
        assertTrue(Algorithms.hasUniqueChars(" "));
    }
}
