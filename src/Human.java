public class Human {
    int yearOfBirth;
    String name;
    String city;

    String job;

    public Human(int yearOfBirth, String name, String city, String job) {
        this.yearOfBirth = yearOfBirth;
        this.name = name;
        this.city = city;
        this.job = job;
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

    public String getJob() {
        return job;
    }

    @Override
    public String toString() {
        return "Привет! Меня зовут " + getName() + ". Я из города " + getCity() + ".Я родился в " + getYearOfBirth() +
                " году. Я работаю на должности " + getJob() + ". Будем знакомы!";
    }
}
