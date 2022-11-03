public class Main {
    public static void main(String[] args) {
// Write a class with the name Person. The class needs three fields (instance variables) with the names firstName, lastName of type String and age of type int.
// Write the following methods (instance methods):
// Method named getFirstName without any parameters, it needs to return the value of the firstName field.
// Method named getLastName without any parameters, it needs to return the value of the lastName field.
// Method named getAge without any parameters, it needs to return the value of the age field.
// Method named setFirstName with one parameter of type String, it needs to set the value of the firstName field.
// Method named setLastName with one parameter of type String, it needs to set the value of the lastName field.
// Method named setAge with one parameter of type int, it needs to set the value of the age field. If the parameter is less than 0 or greater than 100, it needs to set the age field value to 0.
// Method named isTeen without any parameters, it needs to return true if the value of the age field is greater than 12 and less than 20, otherwise, return false.
// Method named getFullName without any parameters, it needs to return the full name of the person.
// In case both firstName and lastName fields are empty, Strings return an empty String.
// In case lastName is an empty String, return firstName.
// In case firstName is an empty String, return lastName.
// To check if s String is empty, use the method isEmpty from the String class. For example,firstName.isEmpty() returns true if the String is empty or in other words, when the String does not contain any characters.
        var person = new Person();
        person.setAge(22);
        System.out.println(person.isTeen());
    }
}