import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Practicum {

    public static void main(String[] args) throws IOException {
        Map<String, Integer> frequencyMap = new HashMap<>();

        FileReader reader = new FileReader("/run/media/hamidulin.rr/Data/Programming/Projects/Java/Yandex-Practicum-7Sprint/src/result.txt");
        BufferedReader br = new BufferedReader(reader);

        // читайте файл построчно и сразу обновляйте frequencyMap.

        // выведите результат в формате "<буква>: <количество>".
        while (br.ready()) {
            var test = br.readLine();
            if (frequencyMap.containsKey(test) && frequencyMap!=null) {
                frequencyMap.put(test, frequencyMap.get(test) + 1);
            } else {
                frequencyMap.put(test, 1);
            }
        }
        br.close();
        for (Map.Entry<String, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}