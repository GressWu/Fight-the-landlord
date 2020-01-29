import java.util.*;

public class Fight {
    public static void main(String[] args) {
        int index=0;
        Map<Integer,String> poker=new HashMap<>();
        List<String> colors=new ArrayList<>();
        List<String> number=new ArrayList<>();
        Collections.addAll(colors,"♠","♥","♦","♣");
        Collections.addAll(number,"3-4-5-6-7-8-9-10-J-Q-K-A-2".split("-"));
        for (String s : number) {
            for (String color : colors) {
                poker.put(index,color+number);
                index++;
            }



        }
        poker.put(index++,"小王");
        poker.put(index,"大王");
        System.out.println(poker);
        System.out.println(poker.size());
    }
}
