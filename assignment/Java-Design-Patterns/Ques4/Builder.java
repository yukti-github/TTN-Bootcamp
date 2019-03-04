//QUES 4- Implement Builder pattern to create a student object with more than 6 fields.

package Ques4;

class Student{
    private String name;
    private Integer rollNumber;
    private Integer className;
    private boolean isOptedForBus;
    private String section;
    private boolean livesInDelhi;
    private String fatherName;

    public Student(StudentBuilder studentBuilder) {

        name= studentBuilder.getName();
        rollNumber= studentBuilder.getRollNumber();
        className= studentBuilder.getClassName();
        isOptedForBus= studentBuilder.isOptedForBus();
        section=studentBuilder.getSection();
        livesInDelhi=studentBuilder.isLivesInDelhi();
        fatherName=studentBuilder.getFatherName();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(Integer rollNumber) {
        this.rollNumber = rollNumber;
    }

    public Integer getClassName() {
        return className;
    }

    public void setClassName(Integer className) {
        this.className = className;
    }

    public boolean isOptedForBus() {
        return isOptedForBus;
    }

    public void setOptedForBus(boolean optedForBus) {
        isOptedForBus = optedForBus;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public boolean isLivesInDelhi() {
        return livesInDelhi;
    }

    public void setLivesInDelhi(boolean livesInDelhi) {
        this.livesInDelhi = livesInDelhi;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    @Override
    public String toString() {
        return "Student { " +
                "name='" + name + '\'' +
                ", rollNumber=" + rollNumber +
                ", className=" + className +
                ", isOptedForBus=" + isOptedForBus +
                ", section='" + section + '\'' +
                ", livesInDelhi=" + livesInDelhi +
                ", fatherName='" + fatherName + '\'' +
                '}';
    }
}

class StudentBuilder{
    private String name;
    private Integer rollNumber;
    private Integer className;
    private boolean isOptedForBus;
    private String section;
    private boolean livesInDelhi;
    private String fatherName;

    public StudentBuilder(String name, Integer rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    public String getName() {
        return name;
    }

    public Integer getRollNumber() {
        return rollNumber;
    }

    public Integer getClassName() {
        return className;
    }

    public StudentBuilder withClassName(Integer className){
        this.className=className;
        return this;
    }

    public boolean isOptedForBus() {
        return isOptedForBus;
    }

    public StudentBuilder hasOptedForBus(boolean optedForBus) {
        isOptedForBus = optedForBus;
        return this;
    }

    public String getSection() {
        return section;
    }

    public StudentBuilder setSection(String section) {
        this.section = section;
        return this;
    }

    public boolean isLivesInDelhi() {
        return livesInDelhi;
    }

    public StudentBuilder doLivesInDelhi(boolean livesInDelhi) {
        this.livesInDelhi = livesInDelhi;
        return this;
    }

    public String getFatherName() {
        return fatherName;
    }

    public StudentBuilder setFatherName(String fatherName) {
        this.fatherName = fatherName;
        return this;
    }

    public Student build(){
        return new Student(this);

    }
}

public class Builder {

    public static void main(String[] args) {
        Student student= new StudentBuilder("Yukti",3262)
                .setFatherName("Alok Sharma").doLivesInDelhi(true)
                .withClassName(12).setSection("C").hasOptedForBus(true).build();

        System.out.println(student);

        Student student2= new StudentBuilder("Mansi",3282)
                .setFatherName("Vinay").doLivesInDelhi(true)
                .withClassName(10).setSection("B").hasOptedForBus(true).build();
        System.out.println(student2);

    }
}
