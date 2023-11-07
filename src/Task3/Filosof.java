package Task3;

public class Filosof extends Spartans {
    private String yearWork;
    private String age;

    public Filosof(String name, int count, String yearWork, String age) {
        super(name, count);
        this.yearWork = yearWork;
        this.age = age;
    }

    public String getYearWork() {
        return yearWork;
    }

    public void setYearWork(String yearWork) {
        this.yearWork = yearWork;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Filosof{" +
                "yearWork='" + yearWork + '\'' +
                ", age='" + age + '\'' +
                "} " + super.toString();
    }
}
