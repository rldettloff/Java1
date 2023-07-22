class Animal {
    private int Age;
    private String Name;

    void setName(String inputName) {
        Name = inputName;

    }
    String getName() {
        return Name;
    }
    void setAge(int inputAge) {
        Age = inputAge;

    }
    int getAge() {
        return Age;
    }

}

class Dog extends Animal {
   
    public void bark() {
        System.out.println("bark bark!");
    }
}
class Jindo extends Dog {
    private String origin;

void setOrigin(String inputOrigin) {
    origin = inputOrigin;
}

public String getOrigin() {
    return origin;
}
}