class Cat {
    String name;
    int age;
    public static int counter = 0;
    // write static and instance variables


    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
        if(counter >= 5){
            System.out.println("You have too many cats");
        }
        counter++;
    }

    public static int getNumberOfCats() {
    return counter;
    }
}


