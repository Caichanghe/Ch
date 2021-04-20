package StudentDemo;

public class Student {
    public String name ;
    public Student(String inName){
        this.name=inName;
        System.out.println("原名为"+name);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}