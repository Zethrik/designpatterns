package pl.sda.design.pattern.composite.school;

public class SchoolClass implements SchoolUnit{

    private int numberOfKids;
    private String className;

    public SchoolClass(int numberOfKids, String className) {
        this.numberOfKids = numberOfKids;
        this.className = className;
    }

    @Override
    public int kidsInClass() {
        return numberOfKids;
    }
}