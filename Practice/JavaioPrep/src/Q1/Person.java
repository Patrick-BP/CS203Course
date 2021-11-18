package Q1;

public class Person implements Comparable<Person> {
    private String name;
    private int num;

    public Person(String name, int num) {
        this.name = name;
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public int getNum() {
        return num;
    }

    @Override
    public String toString() {
        return "[" + name +" ,"+ num +" ]" ;
    }



    @Override
    public int compareTo(Person o) {
        return (this.num - o.getNum())*-1;
    }
}
