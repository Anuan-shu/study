import java.util.*;

public class Room {
    //1.准备54张牌，定义一个集合容器
    private List<Card> allCards = new ArrayList<Card>();

    //2.初始化牌（创建房间时就要）
    {
        //3.准备点数
        String[] nums = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};

        //4.准备花色
        String[] colors = {"♠", "♥", "♣", "♦"};

        //5.组装牌
        for (String num : nums) {
            for (String color : colors) {
                allCards.add(new Card(num, color));
            }
        }

        //6.加入大小王
        Collections.addAll(allCards, new Card("小王", "小王"), new Card("大王", "大王"));
        System.out.println("新牌:" + allCards);
    }

    public void start() {
        //7.洗牌
        Collections.shuffle(allCards);
        System.out.println("洗牌:" + allCards);

        //8.发牌:定义三个玩家,每个玩家17张牌，剩余三张底牌
        Map<String, List<Card>> plauers = new HashMap<>();
        List<Card> player1 = new ArrayList<>();
        List<Card> player2 = new ArrayList<>();
        List<Card> player3 = new ArrayList<>();
        plauers.put("玩家1", player1);
        plauers.put("玩家2", player2);
        plauers.put("玩家3", player3);

        //9.发牌
        for (int i = 0; i < allCards.size() - 3; i++) {
            if (i % 3 == 0) {
                player1.add(allCards.get(i));
            } else if (i % 3 == 1) {
                player2.add(allCards.get(i));
            } else {
                player3.add(allCards.get(i));
            }
        }

        //10.获取底牌-----------------subList(i,j)方法,截取i到j的元素
        List<Card> bottomCards = allCards.subList(allCards.size() - 3, allCards.size());

        //11.排序
        SortCard(player1);
        SortCard(player2);
        SortCard(player3);

        //12.看牌
        for (Map.Entry<String, List<Card>> entry : plauers.entrySet()) {
            String name = entry.getKey();
            List<Card> cards = entry.getValue();
            System.out.println(name + "的牌是:" + cards);
        }

    }

    public void SortCard(List<Card> cards) {
        Collections.sort(cards, new Comparator<Card>() {
            @Override
            public int compare(Card o1, Card o2) {
                return o1.getNum() - o2.getNum();
            }
        });

    }
}
