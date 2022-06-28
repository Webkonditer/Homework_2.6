import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>(List.of(6000, 8, 1, 2, 3, 12, 4, 4, 5, 5, 6, 7));

        //Задание 1
        for (Integer num : nums) {
            if (num % 2 != 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();

        //Задание 2
        Set<Integer> setOfNums = new TreeSet<>();
        for (Integer num : nums) {
            if (num % 2 == 0) {
                setOfNums.add(num);
            }
        }
        System.out.println(setOfNums);

        //Задание 3
        List<String> words = new ArrayList<>(List.of("Напишите", "код", "который", "выводит", "консоль", "все",
                "уникальные", "слова", "Напишите", "код", "который", "выводит", "консоль", "все", "уникальные", "слова"));
        Set<String> setOfWords = new HashSet<>();
        for (String word : words) {
            setOfWords.add(word);
        }
        System.out.println(setOfWords);

        //Задание 4
        List<String> words2 = new ArrayList<>(List.of("Напишите", "код", "который", "выводит", "консоль", "все",
                "уникальные", "слова", "Напишите", "который", "выводит", "все", "уникальные", "который"));
        Map<String, Integer> mapOfWords = new HashMap();
        for (String word : words2) {
            if(mapOfWords.containsKey(word)){
                mapOfWords.put(word, mapOfWords.get(word) + 1);
            } else {
                mapOfWords.put(word, 1);
            }
        }
        System.out.println(mapOfWords);

    }
}