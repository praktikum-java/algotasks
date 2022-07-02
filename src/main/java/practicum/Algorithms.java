package practicum;

import java.util.*;

public class Algorithms {

    /**
     *
     * В задачах, в которых заранее не оговорен состав символов в строках,
     * строки могут содержать русские и английские буквы,
     * а также пробелы, знаки препинания, кавычки и скобки.
     *
     * Не использовать при решении регулярные выражения, методы стандартных библиотек
     * java.util.Collections, java.util.Arrays, java.lang.Math, а также методы
     * replace и replaceAll, reverse, equals, indexOf, toLowerCase, toUpperCase
     * split, substring из java.lang.String.
     * Можете использовать циклы, условные операторы,
     * простые типы данных и их обертки.
     *
     * Как изменится сложность ваших решений, если убрать
     * ограничения по использованию функций Java API?
     */

    /**
     * Вычислите максимальное, минимальное и среднее число для списка чисел
     * Верните их сумму
     * Список гарантированно содежит элементы
     */
     public static double maxMinAvr (List<Integer> numbers) {
         int max = numbers.get(0);
         int min = numbers.get(0);
         double middle = 0;
        for (int i : numbers) {
            System.out.println(i);
            middle += i;
            if (i >= max) {
                max = i;
            }
            if (i <= min){
                min = i;
            }
        }
         middle /= numbers.size();
        return max + min + middle;
    }


    /**
     * Найдите второе максимальное значение в массиве,
     * если такого нет, то вернуть первое
     * Массив гарантировано содержит элементы
     */
    public static Integer max2 (List<Integer> list) {
        int max = 0;
        int max2 = 0;
        for (int i : list ) {
            if (i > max) {
                max = i;
            }
        }
        if (list.contains(max) && list.size() > 1) {
            for (int i : list) {
                if (i > max2 && i < max) {
                    max2 = i;
                }
            }
        }
        if (max2 != 0) {
            max = max2;
        }
        return max;
    }

    /**
     * Удалите число из массива.
     * Верните массив не содержащий этого элемента,
     * но и не содержащий "пропусков" на месте удаленных элементов
     * Например, если из массива [0, 6, 0 ,5, 0] нужно удалить элемент 0,
     * то возвращаться должен массив содержащий два элемента [6, 5]
     */
    public static int[] removeElementFromArray(int[] numbers, int value) {
        ArrayList<Integer> newNumbers = new ArrayList<>();
        for (int i : numbers) {
            if (i != value) {
                newNumbers.add(i);
            }
        }
        int[] toReturn = new int[newNumbers.size()];
        int count = 0;
        for (int i : newNumbers) {
            toReturn[count] = i;
            count++;
        }
        return toReturn;
    }


    /**
     * Удалите все гласные из строки.
     * Например, "мАма Мыла раму" -> "мм Мл рм"
     */
    public static String removeVowels(String str) {
        String[] glasnie = {"у", "е", "ы", "а", "о", "э", "я", "и", "ю", "ё", "У", "Е", "Ы", "А", "О", "Э", "Я", "И",
                "Ю", "Ё", "e", "y", "u", "i", "o", "a", "E", "Y", "U", "I", "O", "A"};
        for (String g : glasnie) {
            str = fastReplaceForVowels(str, g, " ".trim());
        }
        return str;
    }

    static String fastReplaceForVowels(String str, String target, String replacement ) {
        int targetLength = target.length();
        if( targetLength == 0 ) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str);
        int idx2 = sb.indexOf( target );
        if( idx2 < 0 ) {
            return str;
        }
        StringBuilder buffer = new StringBuilder( targetLength > replacement.length() ? str.length() : str.length() * 2 );
        int idx1 = 0;
        do {
            buffer.append( str, idx1, idx2 );
            buffer.append( replacement );
            idx1 = idx2 + targetLength;
            idx2 = str.indexOf( target, idx1 );
        } while( idx2 > 0 );
        buffer.append( str, idx1, str.length() );
        return buffer.toString();
    }
    public static String toLowerCase(String str) {
        StringBuffer res = new StringBuffer();
        for(int i=0;i<str.length();i++)
            if(str.charAt(i)>='A' && str.charAt(i)<='Z')
                res.append((char)(str.charAt(i) + ('a' - 'A')));
            else
                res.append(str.charAt(i));
        return res.toString();
    }

    /**
     * Убрать повторяющиеся подряд символы в строке
     * например "ммммоолллокко" -> "молоко"
     * (*) - в этой задаче нужно учитывать сочетания
     * повторяющихся букв разного регистра,
     * при этом в выходной строке остается первая буква,
     * например, "мМммооЛллокКОоо" -> "моЛокО",
    */
    public static String removeDublicates(String str) {
        StringBuilder sb = new StringBuilder(str);
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length - 1; i++) {
            char c = chars[i];
            System.out.println(sb);
            StringBuilder s1 = new StringBuilder(toLowerCase(String.valueOf(c)));
            StringBuilder s2 = new StringBuilder(toLowerCase(String.valueOf(chars[i+1])));
            if (s1.compareTo(s2) == 0) {
                sb.deleteCharAt(i+1);
                chars = String.valueOf(sb).toCharArray();
                i--;
            }
        }
        StringBuilder s1 = new StringBuilder(toLowerCase(String.valueOf(chars[chars.length - 2])));
        StringBuilder s2 = new StringBuilder(toLowerCase(String.valueOf(chars[chars.length -1])));
        if (s1.compareTo(s2) == 0) {
            sb.deleteCharAt(chars.length -1);
        }
        return sb.toString();
    }

    /**
     * Сжать строку, удаляя повторяющиеся символы
     * и указывая количество повторов для каждого символа
     * например "мооолооооккооо" -> "м1о3л1о4к2о2"
     */
    public static String zipStr(String str) {
        return new String();
    }


    /**
     * Выяснить является ли строка палиндромом,
     * то есть  одинаково читается в обоих направлениях.
     * Например, слово "топот" - палиндром, а слово "топор" нет.
     * Строка "А роза упала на лапу Азора" тоже палиндром,
     * а строка "А роза уколола лапу Азора" нет.
     * "A man, a plan, a canal-Panama", тоже палиндром
     *
     * (!) Так как запрещены регулярные выражения
     * и методы преобразования регистра символов из java.lang.String
     * обратите внимание таблицу кодов символов UTF-8
     * (лучше убрать эту подсказку и выдать ее в процессе)
     */
    public static boolean isPalindrom(String str) {

        return false;
    }


    /**
     * Перевернуть все слова в предложении
     * "Кот лакал молоко" -> "тоК лакал околом"
     */
    public static String reverseWordsInSentence(String sentence) {

        return new String();
    }

    /**
     * Отсортируйте символы в массиве,
     * не используйте дополнительные структуры данных.
     * При вводе массива символов {'c', 'a', 'b'},
     * возвращаться должен тот же отсортированный массив {'a', 'b', 'c'}
     */
    public static char[] sortSymbols(char[] symbols) {

        return new char[]{};
    }



    /**
     *
     * Выясните являются ли две строки анограммами.
     * Строки являются анограммами, если они состоят из одних и тех же букв
     * Например, слова "кот" и "ток" анограммы, а слова "кот" и  "кит" нет.
    */
    public static boolean isAnogramOf(String word, String anogram) {

        return false;
    }

    /**
    * Выясните, все ли символы в строке встречаются один раз.
     * Если строка содержит повторябщиеся символы,
     * то возвращать false, если не содержит - true
     * Нельзя использовать дополнительные структуры данных.
     *
     * (!) В этой задаче строка может содержать
     * любой символ из таблицы ASCII (127 символов)
     *
     * (!!) Сложность - O(n)
    * */

    public static boolean hasUniqueChars(String str) {

        return false;
    }

}
