// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

//Filter:
//        Оң сандарды жаны тизмеге которуп алыныз.
//        Узундугу 5 символдон коп болгон создорду фильтирлеп алыныз.
public class Main {
    public static void main(String[] args) {


        List<Person> name = new ArrayList<>(List.of(new Person(23,"Mirlan"),new Person(19,"Nurlan"),new Person(12,"Ajybek"),new Person(25,"Jigit")));
        List<Integer> num = new ArrayList<>(List.of(1,-34,67,-7,-88,7,66));
        List<String> nnn = new ArrayList<>(List.of("Urmat","Jigit","Mirlan","Kuba","Nurlan","Ajybek"));

        System.out.println("************Filter***********");
        num.stream().filter(p->p >= 0).forEach(p-> System.out.print(p+" "));
        System.out.println();
        nnn.stream().filter(e-> e.length() > 5).forEach(E -> System.out.println(E+" "));
        System.out.println("********** Sorted***************");

        nnn.stream().sorted((o1, o2) -> o1.length() - o2.length()).forEach(x-> System.out.print(x+" "));
        System.out.println();
        num.stream().sorted((o1, o2) -> o2-o1).forEach(x-> System.out.print(x+" "));
        System.out.println();
        name.stream().sorted((o1, o2) -> o1.getName().compareTo(o2.getName())).forEach(x-> System.out.print(x+ " "));
        System.out.println();
        name.stream().sorted((o1, o2) -> o1.getAge() - o2.getAge()).forEach(x-> System.out.print(x+ " "));
        System.out.println();
        System.out.println("*********** Map ***********");
        nnn.stream().map(String::toUpperCase).forEach(x-> System.out.println( x+ " "));
        System.out.println();
        List<Integer> list = num.stream().map(o -> o * o).toList();
        System.out.println(list);
        List<String> list1 = name.stream().map(x-> x.getName()).toList();
        System.out.println(list1);
        System.out.println("************* Skip***********");
        nnn.stream().skip(3).forEach(x-> System.out.println(x+ " "));
        System.out.println();
        nnn.stream().filter(x -> !x.startsWith("A")).forEach(s -> System.out.println(s+ " "));
        System.out.println();
        System.out.println("************ Distinct*****************");
        System.out.println(num.stream().distinct().toList());
        System.out.println("********* Peek ***************");
        nnn.stream().toList().forEach(s-> System.out.println(s+ " "));


    }
}