import java.util.*;

public class Fight {
    public static void main(String[] args) {
        int index = 0;
        Map<Integer, String> poker = new HashMap<>();
        List<String> colors = new ArrayList<>();
        List<String> number = new ArrayList<>();
        Collections.addAll(colors, "♠", "♥", "♦", "♣");
        Collections.addAll(number, "3-4-5-6-7-8-9-10-J-Q-K-A-2".split("-"));
        for (String s : number) {
            for (String color : colors) {
                poker.put(index, color + s);
                index++;
            }
        }
        poker.put(index++, "小王");
        poker.put(index, "大王");
        Set<Integer> integers = poker.keySet(); //获取键值
        List<Integer> list = new ArrayList<>(integers);
        Collections.shuffle(list);               //洗牌后的牌堆
        List<Integer> p1 = new ArrayList<>();      //玩家一
        List<Integer> p2 = new ArrayList<>();     //玩家二
        List<Integer> p3 = new ArrayList<>();      //玩家三
        List<Integer> bottom = new ArrayList<>();  //底牌
        for (int i = 0; i < list.size(); i++) {
            if (i > 50)
                bottom.add(list.get(i));
            else if (i % 3 == 0)
                p1.add(list.get(i));
            else if (i % 3 == 1)
                p2.add(list.get(i));
            else if (i % 3 == 2)
                p3.add(list.get(i));
        }
        lookPoker("张三", p1, poker);
        lookPoker("李四", p2, poker);
        lookPoker("王五", p3, poker);
        lookPoker("底牌", bottom, poker);

    }

    public static void lookPoker(String name, List<Integer> list, Map<Integer, String> map) {   //看牌方法

        System.out.println(name + "的牌：");
        System.out.print("[");
        Collections.sort(list);
        for (Integer integer : list) {
            String s = map.get(integer);
            System.out.print(s + " ");
        }

        System.out.println("]");
    }
}
