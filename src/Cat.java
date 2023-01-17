public class Cat {
    String name;
    private int age;
    Cat[] friends;

    Cat(String name, int age){
        this.name = name;

        if(age >= 0){
            this.age = age;
        } else {
            this.age = Math.abs(age);
        }

        friends = new Cat[0];
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setName(int age){
        this.age = age;
    }
    void meow(){
        System.out.println("Meow!");
        System.out.println("My name is " + name);
        System.out.println("I am " + age + " years old");
    }
}
