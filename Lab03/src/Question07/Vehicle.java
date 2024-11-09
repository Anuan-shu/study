package Question07;

class Vehicle {
    private int numWheels;
    private String color;
    private Wheel wheel;
    private engine engine;

    public void setNumWheels(int numWheels) {
        if (numWheels < 0) {
            throw new IllegalArgumentException("numWheels set error");
        }
        this.numWheels = numWheels;
    }

    public void setColor(String color) {
        if (color == null) {
            throw new IllegalArgumentException("color set error");
        }
        this.color = color;
    }

    public void setWheel(Wheel wheel) {
        if (wheel == null) {
            throw new IllegalArgumentException("wheel set error");
        }
        this.wheel = wheel;
    }

    public void setEngine(engine engine) {
        if (engine == null) {
            throw new IllegalArgumentException("engine set error");
        }
        this.engine = engine;
    }

    public int getNumWheels() {
        return numWheels;
    }

    public String getColor() {
        return color;
    }

    public Wheel getWheel() {
        return wheel;
    }

    public engine getEngine() {
        return engine;
    }

    public void show() {
        System.out.println("Number of wheels: " + getNumWheels());
        System.out.println("Color: " + getColor());
        wheel.showWheel();
        engine.showEngine();
    }
}

class Wheel {
    private int size;
    private String material;

    public Wheel() {
    }

    public Wheel(int size, String material) {
        this.size = size;
        this.material = material;
    }

    public void setSize(int size) {
        if (size < 0) {
            throw new IllegalArgumentException("size set error");
        }
        this.size = size;
    }

    public void setMaterial(String material) {
        if (material == null) {
            throw new IllegalArgumentException("material set error");
        }
        this.material = material;
    }

    public int getSize() {
        return size;
    }

    public String getMaterial() {
        return material;
    }

    public void showWheel() {
        System.out.println("Size: " + getSize());
        System.out.println("Material: " + getMaterial());
    }
}

class engine {
    private double power;

    public engine() {
    }

    public engine(double power) {
        this.power = power;
    }

    public void setPower(double power) {
        if (power < 0) {
            throw new IllegalArgumentException("power set error");
        }
        this.power = power;
    }

    public double getPower() {
        return power;
    }

    public void showEngine() {
        System.out.println("Power: " + getPower());
    }
}

class Motorbike extends Vehicle {
    private String type;
    private Person driver;
    private Person passenger;

    public Motorbike() {
        super.setNumWheels(2);
        super.setColor("red");
        super.setWheel(new Wheel(20, "rubber"));
        super.setEngine(new engine(10000));
    }

    public void setType(String type) {
        if (type == null) {
            throw new IllegalArgumentException("type set error");
        }
        this.type = type;
    }

    public void setDriver(Person driver) {
        if (driver == null) {
            throw new IllegalArgumentException("driver set error");
        }
        this.driver = driver;
    }

    public void setPassenger(Person passenger) {
        if (passenger == null) {
            throw new IllegalArgumentException("passenger set error");
        }
        this.passenger = passenger;
    }

    public String getType() {
        return type;
    }

    public Person getDriver() {
        return driver;
    }

    public Person getPassenger() {
        return passenger;
    }

    public void show() {
        super.show();
        System.out.println("Type: " + getType());
        if (getDriver() != null) {
            System.out.println("Driver: " + getDriver().getName());
        }
        if (getPassenger() != null) {
            System.out.println("Passenger: " + getPassenger().getName());
        }
    }
}

class Car extends Vehicle {
    private String type;

    public Car() {
        super.setNumWheels(4);
        super.setColor("blue");
        super.setWheel(new Wheel(30, "rubber"));
        super.setEngine(new engine(200));
    }

    public void setType(String type) {
        if (type == null) {
            throw new IllegalArgumentException("type set error");
        }
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void show() {
        super.show();
        System.out.println("Type: " + getType());
    }
}

class Tank extends Vehicle {
    private String type;

    public Tank() {
        super.setNumWheels(6);
        super.setColor("green");
        super.setWheel(new Wheel(40, "iron"));
        super.setEngine(new engine(300));
    }

    public void setType(String type) {
        if (type == null) {
            throw new IllegalArgumentException("type set error");
        }
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void show() {
        super.show();
        System.out.println("Type: " + getType());
    }
}