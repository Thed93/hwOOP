public class Human {
    int yearOfBirth;
    String name;
    String city;

    public Human(int yearOfBirth, String name, String city) {
        this.yearOfBirth = yearOfBirth;
        this.name = name;
        this.city = city;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }



    public String getName() {
        return name;
    }



    public String getCity() {
        return city;
    }



    @Override
    public String toString() {
        return "Привет! Меня зовут " + getName() + ". Я из города " + getCity() + ".Я родился в " + getYearOfBirth() +
                " году. Будем знакомы!";
    }
}
