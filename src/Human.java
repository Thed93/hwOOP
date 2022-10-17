public class Human {
    int yearOfBirth;
    String name;
    String city;

    String job;

    public Human(int yearOfBirth, String name, String city, String job) {
        if (yearOfBirth < 0) {
            this.yearOfBirth = Math.abs(yearOfBirth);
        } else {
            this.yearOfBirth = yearOfBirth;
        }
        if (name == null) {
            this.name = "Данные не указаны.";
        } else {
            this.name = name;
        }
        if (city == null) {
            this.city = "Данные не указаны.";
        } else {
            this.city = city;
        }
        if (job == null) {
            this.job = "Данные не указаны.";
        } else {
            this.job = job;
        }
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
