public class Soldier extends Human {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void canFight() {
        super.canFight();
    }

    @Override
    public void canReport() {
        super.canReport();
    }
}
