package practicum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class AlgorithmsDecisions {

    public static void main(String[] args) {
//        System.out.println("removeVowels(\"мАма Мыла раму\") = " + removeVowels("мама мыла раму"));
//        System.out.println("removeVowels(\"мАма Мыла раму\") = " + removeVowels("мАмА мЫлА рАмУ"));
//        System.out.println("removeVowels(\"мАма Мыла раму\") = " + removeVowels("мАма мЫла рамУ"));
//        System.out.println("removeVowels(\"мАма Мыла раму\") = " + removeVowels("аааауууу"));
//        System.out.println("removeVowels(\"мАма Мыла раму\") = " + removeVowels("ААААуууу"));
//        System.out.println("removeVowels(\"мАма Мыла раму\") = " + removeVowels("аааааУУУ"));
//        System.out.println("removeVowels(\"мАма Мыла раму\") = " + removeVowels(""));
//        System.out.println("removeVowels(\"мАма Мыла раму\") = " + removeVowels("К Л М Н"));
//        System.out.println("removeVowels(\"мАма Мыла раму\") = " + removeVowels("Just do it!"));
//        System.out.println("removeVowels(\"мАма Мыла раму\") = " + removeVowels("jUST DO IT!"));
//        System.out.println("removeVowels(\"мАма Мыла раму\") = " + removeVowels("КЛМН"));
//        System.out.println("removeVowels(\"мАма Мыла раму\") = " + removeVowels("JUSTDOIT!"));

//        System.out.println("isPalindrom(\"топот\") = " + isPalindrom("топот"));
//        System.out.println("isPalindrom(\"ропот\") = " + isPalindrom("ропот"));
//        System.out.println("isPalindrom(\"А роза упала на лапу Азора\") = " + isPalindrom("А роза упала на лапу Азора"));
//        System.out.println("isPalindrom(\"а роза упала на лапу Азора\") = " + isPalindrom("А Роза Упала На Лапу Азора"));
//        System.out.println("isPalindrom(\"Ад - жажда!\") = " + isPalindrom("Ад - жажда!"));
//        System.out.println("isPalindrom(\"Ад и жажда!\") = " + isPalindrom("Ад и жажда!"));
//        System.out.println("isPalindrom(\"Ад - жар, вражда!\") = " + isPalindrom("Ад - жар, вражда!"));
//        System.out.println("isPalindrom(\"Madam, I'm Adam.\") = " + isPalindrom("Madam, I'm Adam."));
//        System.out.println("isPalindrom(\"Madam, I'm Adammmm.\") = " + isPalindrom("Madam, I'm Adammmm."));
//        System.out.println("isPalindrom(\" \") = " + isPalindrom(" "));
//        System.out.println("isPalindrom(\"\") = " + isPalindrom(""));



//        System.out.println("sortSymbols(new char[]{'c', 'a', 'b', 'd'}) = " + Arrays.toString(sortSymbols(new char[]{'c', 'a', 'b', 'd'})));
//        System.out.println("sortSymbols(new char[]{'a'}) = " + Arrays.toString(sortSymbols(new char[]{'a'})));
//        System.out.println("sortSymbols(new char[]{'a', 'a','a', 'a'}) = " + Arrays.toString(sortSymbols(new char[]{'a', 'a','a', 'a'})));
//        System.out.println("sortSymbols(new char[]{}) = " + Arrays.toString(sortSymbols(new char[]{})));
//        System.out.println("sortSymbols(new char[]{'г','а','в','у','б','c', 'a', 'b', 'd'}) = " + Arrays.toString(sortSymbols(new char[]{'г','а','в','у','б','c', 'a', 'b', 'd'})));


//        System.out.println("isAnogramOf(\"кот\", \"ток\") = " + isAnogramOf("кот", "ток"));
//        System.out.println("isAnogramOf(\"кот\", \"кит\") = " + isAnogramOf("кот", "кит"));
//        System.out.println("isAnogramOf(\"бокал\", \"калоба\") = " + isAnogramOf("бокал", "калоба"));
//        System.out.println("isAnogramOf(\"бокал\", \"колба\") = " + isAnogramOf("бокал", "колба"));
//        System.out.println("isAnogramOf(\"\", \"\") = " + isAnogramOf("", ""));
//        System.out.println("isAnogramOf(\" \", \"\") = " + isAnogramOf(" ", ""));
//        System.out.println("isAnogramOf(\"\", \" \") = " + isAnogramOf("", " "));
//        System.out.println("isAnogramOf(\"утончённость\", \"уточнённость\") = " + isAnogramOf("утончённость", "уточнённость"));
//        System.out.println("isAnogramOf(\"выборочность\", \"обрывочность\") = " + isAnogramOf("выборочность", "обрывочность"));


//        System.out.println("reverseWordsInSentence(\"жара\") = " + reverseWordsInSentence("жара"));
//        System.out.println("reverseWordsInSentence(\"был месяц май\") = " + reverseWordsInSentence("был месяц май"));
//        System.out.println("reverseWordsInSentence(\" \") = " + reverseWordsInSentence(" "));
//        System.out.println("reverseWordsInSentence(\"\") = " + reverseWordsInSentence(""));
//        System.out.println("reverseWordsInSentence(\"Мой дядя самых честных правил...\") = " + reverseWordsInSentence("Мой дядя самых честных правил..."));
//        System.out.println("reverseWordsInSentence(\"Ад - жар, вражда!\") = " + reverseWordsInSentence("Ад - жар, вражда!"));

//        System.out.println("putInOrder(\"молоко\") = " + removeDublicates("молоко"));
//        System.out.println("putInOrder(\"молокооо\") = " + removeDublicates("молокооо"));
//        System.out.println("putInOrder(\"мммммолокооо\") = " + removeDublicates("мммммолокооо"));
//        System.out.println("putInOrder(\"мама мыла раму\") = " + removeDublicates("мама   мыла   раму"));
//        System.out.println("putInOrder(\"(кто? мыл? мама.)\") = " + removeDublicates("((кто??? мыл??? мама....))"));
//        System.out.println("putInOrder(\"JJUUSSTT  DDOO IITT!!!\") = " + removeDublicates("JJUUSSTT  DDOO IITT!!!"));
//        System.out.println("putInOrder(\" \") = " + removeDublicates(" "));
//        System.out.println("putInOrder(\"Я\") = " + removeDublicates("Я"));
//        System.out.println("putInOrder(\"\") = " + removeDublicates(""));




//        System.out.println("zipStr(\"панорама\") = " + zipStr("панорама"));
//        System.out.println("zipStr(\"ппппанорама\") = " + zipStr("ппппанорама"));
//        System.out.println("zipStr(\"панорамааааа\") = " + zipStr("панорамааааа"));
//        System.out.println("zipStr(\"пппаааннноорррррамааааа\") = " + zipStr("пппаааннноорррррамааааа"));
//        System.out.println("zipStr(\"мммооойй   дядяяя ссааамых    честттнных...\") = " + zipStr("мммооойй   дядяяя ссааамых    честттнных..."));

//        System.out.println("max2(List.of(12,23,65,87,9,3,5,77,43,32,77)) = " + max2(List.of(1, 2, 3, 4, 5, 6, 7 )));
//        System.out.println("removeElementFromArray(new int[]{0, 2, 4, 5, 0, 6, 0}, 0)) = " + Arrays.toString(removeElementFromArray(new int[]{0, 2, 4, 5, 0, 6, 0}, 0)));


        System.out.println("hasUniqueChars(\"\") = " + hasUniqueChars(""));
        System.out.println("hasUniqueChars(\"t\") = " + hasUniqueChars("t"));
        System.out.println("hasUniqueChars(\"tt\") = " + hasUniqueChars("tt"));
        System.out.println("hasUniqueChars(\"я\") = " + hasUniqueChars("я"));
        System.out.println("hasUniqueChars(\"tя\") = " + hasUniqueChars("tя"));
        System.out.println("hasUniqueChars(\" maslo \") = " + hasUniqueChars("maslo"));
        System.out.println("hasUniqueChars(\"масло\") = " + hasUniqueChars("масло"));
        System.out.println("hasUniqueChars(\"панорама\") = " + hasUniqueChars("панорама"));
        System.out.println("hasUniqueChars(\"panorama\") = " + hasUniqueChars("panorama"));
        System.out.println("hasUniqueChars(\" \") = " + hasUniqueChars(" "));
    }


    /**
     *
     * В задачах, в которых заранее не оговорен состав символов в строках,
     * строки могут содержать русские и английские буквы,
     * а также пробелы, знаки препинания, кавычки и скобки.
     *
     * Не использовать при решении регулярные выражения, методы стандартных библиотек
     * java.util.Collections, java.util.Arrays, java.lang.Math, а также методы
     * replace и replaceAll, reverce, equals, indexOf, toLowerCase, toUpperCase
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
     */
    public static double maxMinAvr (List<Double> numbers) {
        Double max = Double.MIN_VALUE;
        Double min = Double.MAX_VALUE;
        double avr = 0;
        for (int i = 0; i < numbers.size(); i++) {
            if(max < numbers.get(i))
                max = numbers.get(i);
            if(min > numbers.get(i))
                min = numbers.get(i);
            avr += numbers.get(i)/numbers.size();
        }
        return max + min + avr;
    }


    /**
     * Найдите второе максимальное значение в массиве,
     * если такого нет, то вернуть первое
     * Массив гарантировано содержит элементы
     */
    public static Integer max2 (List<Integer> list) {

        if (list.size() == 1)
            return list.get(0);
        else if (list.size() == 2) {
            return list.get(0)>=list.get(0) ? list.get(0): list.get(1);
        }

        List<Integer> numbers = new ArrayList(list);

        for (int i = 0; i < numbers.size(); i++) {
            for (int j = 0; j < numbers.size() - i - 1; j++) {
                if (numbers.get(j) > numbers.get(j + 1)) {
                    Integer temp = numbers.get(j);
                    numbers.set(j, numbers.get(j + 1));
                    numbers.set(j + 1, temp);
                }
            }
        }
        for (int i = numbers.size() - 1; i > 0; i--) {
            if (numbers.get(i -1 ) == numbers.get(i)) {
                continue;
            }
            else {
                return numbers.get(i -1);
            }
        }
        return numbers.get(numbers.size() - 1);
    }

    /**
     * Удалите число из массива.
     * Верните массив не содержащий этого элемента,
     * но и не содержащий "пропусков" на месте удаленных элементов
     * Например, если из массива [0, 6, 0 ,5, 0] нужно удалить элемент 0,
     * то возвращаться должен массив содержащий два элемента [6, 5]
     */
    public static int[] removeElementFromArray(int[] numbers, int value) {

        int offset = 0;
        for(int i = 0; i< numbers.length; i++){
            if(numbers[i] == value){
                offset++;
            } else{
                numbers[i - offset] = numbers[i];
            }
        }

        int[] result = new int[numbers.length - offset];
        for(int i = 0; i < result.length; i++){
            result[i] = numbers[i];
        }
        return result;
    }


    /**
     * Удалите все гласные из строки.
     * Например, "мАма Мыла раму" -> "мм Мл рм"
     */

    public static String removeVowels(String str) {
        String vowels = "аеёиоуэюяыАЕЁИОУЭЮЯЫaeiouAEIOU";
        String newstr = "";
        int len = str.length();
        for(int i = 0; i < len; i++) {
            char ch = str.charAt(i);
            int idx = -1;
            for(int j = 0; j < vowels.length(); j++) {
                if(vowels.charAt(j) == ch) {
                    idx = j;
                    break;
                }
            }
            if (idx > -1)
                continue;
            newstr += ch;
        }
        return newstr;
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

        StringBuilder newStr = new StringBuilder();

        for (int i = 0; i < str.length(); i++){
            if ( i==0 ){
                newStr.append(str.charAt(i));
                continue;
            }

            char actual = Character.toLowerCase(str.charAt(i));
            char prev =  Character.toLowerCase(str.charAt(i - 1));
            if( actual != prev )
                newStr.append(str.charAt(i));
        }
        return newStr.toString();
    }

    /**
     * Сжать строку, удаляя повторяющиеся символы
     * и указывая количество повторов для каждого символа
     * например "мооолооооккооо" -> "м1о3л1о4к2о2"
     */
    public static String zipStr(String str) {

        if (str.length() == 1)
            return str + "1";
        StringBuilder newStr = new StringBuilder();

        int count = 1;
        for (int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if ( i == 0 )
                continue;
            else if (i == str.length()-1 ) {
                if ( ch == str.charAt(i - 1)) {
                    count++;
                    newStr.append(str.charAt(i - 1) + "" + count);
                }
                else {
                    newStr.append(str.charAt(i - 1) + "" + count);
                    newStr.append(str.charAt(i) + "" + 1);
                }
            }
            else {

                if ( ch == str.charAt(i - 1))
                    count++;
                else {
                    newStr.append(str.charAt(i - 1) + "" + count);
                    count = 1;
                }
            }
        }
        return newStr.toString();
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
        StringBuilder cleanStr = new StringBuilder( str );
        for (int i = 0; i < cleanStr.length(); i++) {
            if( cleanStr.charAt(i) == ' ' ||
                    !(cleanStr.charAt(i) >= 1040 &&  cleanStr.charAt(i) <= 1143 ||
                            cleanStr.charAt(i) >= 65 &&  cleanStr.charAt(i) <= 90 ||
                            cleanStr.charAt(i) >= 97 &&  cleanStr.charAt(i) <= 122) ) {
                cleanStr.deleteCharAt(i);
                i--;
            }
            else if (Character.isUpperCase(cleanStr.charAt(i)))
                cleanStr.setCharAt(i, Character.toLowerCase(cleanStr.charAt(i)));
        }
        str = cleanStr.toString();
        StringBuilder reverseStr = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--)
            reverseStr.append(str.charAt(i));

        return str.equals(reverseStr.toString());
    }


    /**
     * Перевернуть все слова в предложении
     * "Кот лакал молоко" -> "тоК лакал околом"
     */
    public static String reverseWordsInSentence(String sentence) {
        StringBuilder sb = new StringBuilder();
        String word = "";

        for(int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);
            if( ch == ' ' || ch == '!' || ch == '?' || ch == '.' || ch == '-' || ch == ',' ) {
                sb.append(word + ch);
                word = "";
            }
            else
                word = ch + word;
        }
        sb.append(word);
        return sb.toString();
    }

    /**
     * Отсортируйте символы в массиве,
     * не используйте дополнительные структуры данных.
     * При вводе массива символов {'c', 'a', 'b'},
     * возвращаться должен тот же отсортированный массив {'a', 'b', 'c'}
     */
    public static char[] sortSymbols(char[] symbols) {
        int len = symbols.length;
        for (int i = 0; i < len; i++) {
            int j = i;
            char y = symbols[i];
            while(j > 0 && symbols[j - 1] > y ) {
                symbols[j] = symbols[j - 1];
                j--;
            }
            symbols[j] = y;
        }
        return symbols;
    }



    /**
     *
     * Выясните являются ли две строки анограммами.
     * Строки являются анограммами, если они состоят из одних и тех же букв
     * Например, слова "кот" и "ток" анограммы, а слова "кот" и  "кит" нет.
     */
    public static boolean isAnogramOf(String word, String anogram) {

        if (word.length() == anogram.length()) {
            char[] sortedWord = sortSymbols(word.toCharArray());
            char[] sortedAnogram = sortSymbols(anogram.toCharArray());

            for (int i = 0; i < word.length() ; i++ ) {
                if (sortedAnogram[i] != sortedWord[i])
                    return false;
            }
            return true;
        }
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
        if (str.length() > 127 )  return false;

        boolean [] chars = new boolean[127];
        for (int i = 0; i < str.length(); i++) {
            int v = str.charAt(i);
            if (v > 127) return false;
            if ( chars[v] )
                return false;
            chars[v] = true;
        }
        return true;
    }

}
