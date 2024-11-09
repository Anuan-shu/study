package Question07;

public class test {
    public static void main(String[] args) {
        Motorbike motorbike = new Motorbike();
        motorbike.setType("雅迪");

        Car car = new Car();
        car.setType("凯美瑞");

        Tank tank = new Tank();
        tank.setType("T-34");

        System.out.println("------------Motorbike------------");
        motorbike.show();
        System.out.println("------------Car------------");
        car.show();
        System.out.println("------------Tank------------");
        tank.show();

        Brother brother = new Brother();
        brother.setName("张三");
        brother.setAge(20);
        brother.setSex("男");

        Sister sister = new Sister();
        sister.setName("小红");
        sister.setAge(18);
        sister.setSex("女");

        motorbike.setDriver(brother);
        motorbike.setPassenger(sister);

        System.out.println("------------Motorbike------------");
        motorbike.show();

        System.out.println("------------Dialogue------------");
        sister.say();
    }
}
