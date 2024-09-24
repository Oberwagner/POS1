import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Demo demo = new Demo();
        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("C#");

        for (int i = 0; i < list.size(); i++){ // 1. Klasse Ding
            System.out.println(list.get(i));
        }

        list.forEach(System.out::println); //item -> System.out.println(item)

        TextFormater ask = text -> text + "?";
        TextFormater shout = text -> text + "!";

        demo.setTextFormater(ask);
        String formatted = demo.formatText("Was ist das");
        System.out.println(formatted);
    }
}
