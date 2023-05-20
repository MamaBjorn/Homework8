import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Луффи", new Address("Какой еще город? он на корабле живет", "Грантлайн"));
        Student student2 = new Student("нн");
        printStudentInfo(student1);
        printStudentInfo(student2);
        List<String> words = Arrays.asList("я", "очень", "хочу", "спать", "и", "есть");
        words.forEach(System.out::println);
        System.out.println(words.stream().reduce("", (a, b) -> a + b + ' ').trim() + '.');
    }
    public static void printStudentInfo(Student student) {
        System.out.print(student.getName());

        if(student.getAddress().isPresent())
            System.out.println(". " + student.getAddress().get().getCity() +
                    ". " + student.getAddress().get().getRegion());
        else System.out.println();
    }
}