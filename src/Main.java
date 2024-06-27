import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7, 9, 7, 7, 10, 12, 22, 8));
        List<String> words = new ArrayList<>(List.of("apple", "banana", "apple", "orange", "banana", "grape", "pear",
                "grape"));
        List<String> strings = new ArrayList<>(List.of("один", "два", "два", "три", "три", "три"));


        //printNums(nums);
        //printNums2(nums);
        duplicateWords(strings);
        uniqueWords(words);

    }

    //Задача 1
    public static void printNums(List<Integer> _nums) {
        for (Integer number : _nums) {
            if (number % 2 != 0) {
                System.out.println(number);
            }
        }
    }

    //Задача 2
    public static void printNums2(List<Integer> _nums2) {
        Set<Integer> numbers = new TreeSet<>();
        for (Integer number : _nums2) {
            if (number % 2 == 0) {
                numbers.add(number);
            }
        }
        for (Integer number : numbers) {
            System.out.println(number);
        }
    }

    //Задача 3
    public static void uniqueWords(List<String> _words) {
        Set<String> uniWords = new HashSet<>(_words); //а вот если бы надо было сохранить последовательность можно было
        for (String word : uniWords) { //LinkedHashSet использовать
            System.out.println(word);
        }
    }


    public static void duplicateWords(List<String> _strings) {
        Map<String, Integer> wordCounts = new LinkedHashMap<>();
        for (String word : _strings) {
            wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
        }
        for (Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
            System.out.println(entry.getValue());
        }

    }

}