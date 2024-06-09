public class Person {

    private String name;
    private String surname;
    private String email;


    public Person(String name,String surname,String email){

        this.name = name;
        this.surname =surname;
        this.email = email;
    }

    public String getName(){return name;}//get name
    public void setName(String name){
        this.name=name;
    }//set name
    public String getSurname(){return surname;}//get name

    public void setSurname(String surname){
        this.surname=surname;
    }//set Surname
    public String getEmail(){return email;}//get email

    public void setEmail(String email){
        this.email= email;
    }//set email

}
