public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName(){
        return this.firstName;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getLastName(){
        return this.lastName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public int getAge(){
        return this.age;
    }

    public void setAge(int age){
        if (age < 0 || age > 100){
            this.age = 0;
        }
        else {
            this.age = age;
        }
    }

    public boolean isTeen(){
        return (this.getAge() > 12 && this.getAge() < 20) ? true : false;
    }

    public String getFullName(){
        if (!this.getFirstName().isEmpty() && !this.getLastName().isEmpty()){
            return this.getFirstName() + " " + this.getLastName();
        } else if (this.getFirstName().isEmpty() && !this.getLastName().isEmpty()) {
            return this.getLastName();
        }
        else if (!this.getFirstName().isEmpty() && this.getLastName().isEmpty()){
            return this.getFirstName();
        }
        else {
            return null;
        }
    }
}
