import java.util.*;
import java.util.stream.Collectors;

public class AverageStudentsGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, ArrayList<Double>> grades = new TreeMap<>();

        int n = Integer.parseInt(scanner.nextLine());
        while (n-- > 0) {
            String[] tokens = scanner.nextLine().split("\\s+");
            String name = tokens[0];
            Double grade = Double.parseDouble(tokens[1]);
            if(!grades.containsKey(name)){
                grades.put(name, new ArrayList<>());
                grades.get(name).add(grade);
            }else{
                grades.get(name).add(grade);
            }
        }
        for (Map.Entry<String, ArrayList<Double>> entry : grades.entrySet()) {
            double average = entry.getValue().stream().mapToDouble(Double::doubleValue).average().getAsDouble();
            ArrayList<Double> gradeList = entry.getValue();
            String joinedGrades = gradeList.stream()
                    .map(value -> String.format("%.2f", value))
                    .collect(Collectors.joining(" "));
            //worst example in the GitHub probably but couldn't figure it out
            System.out.printf("%s -> %s (avg: %.2f)%n", entry.getKey(),joinedGrades, average);
        }
    }
}
