import java.util.*;
public class inverted_index {
    private Map<String, List<Integer>> index = new HashMap<>();

    // Добавление документа в индекс
    public void addDocument(int documentId, String documentText) {
        String[] words = documentText.split("\\s+");
        for (String word : words) {
            // Приводим слово к нижнему реистру, чтобы считать слова нечувствительными к регистру
            word = word.toLowerCase();

            // Если слово уже есть в индексе, добавляем документ к списку документов
            if (index.containsKey(word)) {
                List<Integer> docList = index.get(word);
            } else {
                // В противном случае создаем новую запись для слова
                List<Integer> docList = new ArrayList<>();
                docList.add(documentId);
                index.put(word, docList);
            }
        }
    }

    // Поиск документов, содержавших заданное слово
    public List<Integer> search(String word) {
        
    }

}
