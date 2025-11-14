public class Singer {
    private String name;
    private int age;
    private Boolean professional;

    Singer(String name, int age) {
        this.name = name;
        this.age = age;
        this.professional = true;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Boolean getProfessional() {
        return professional;
    }

    public void setAge(int newAge) {
        if (newAge > age) {
            age = newAge;
        } 
    }

    public void reverseProfessional() {
        professional = !professional;
    }

    public Boolean isAdult() {
        if (age >= 18) {
            return true;
        }
        else {
            return false;
        }
    }
}
