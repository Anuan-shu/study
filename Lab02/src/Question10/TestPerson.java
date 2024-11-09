package Question10;

public class TestPerson {
    public static void main(String[] args) {
        Person person = new Person("小明", 20, "男");
        person.setAge(21);
        int age = person.getAge();
        Person person2 = new Person("小红", 22, "女");
        person2.setAge(23);
        int age2 = person2.getAge();
    }

}
