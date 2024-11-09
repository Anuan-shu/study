package Question07;

class Person {
    private String name;
    private int age;
    private String sex;

    public void setName(String name) {
        if (name == null) {
            throw new IllegalArgumentException("name set error");
        }
        this.name = name;
    }

    public void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("age set error");
        }
        this.age = age;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSex() {
        return sex.toString();
    }
}

class Brother extends Person {
    public void drive() {
        System.out.println("开车");
    }

    public void eat() {
        System.out.println("呲溜");
    }
}

class Sister extends Person {

    public void eat() {
        System.out.println("呲溜");
    }

    public void say() {
        System.out.println("不像我，我只会心疼 giegie~");
    }
}
