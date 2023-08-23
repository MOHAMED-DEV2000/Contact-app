public class Contact {
    // Variables declaration
    static int contact_nbr = 0;

    private String name, email, tel;
    private int age, order;
    private char gender;

    // Class Constructor 
    public Contact(String name, String email, String tel, int age, char gender){
        setName(name);
        setTel(tel);
        setEmail(email);
        setAge(age);
        setGender(gender);
        setOrder(contact_nbr);
        
        contact_nbr++;
    }

    // Class Setters
    public void setName(String name){

        // Make sure it's a real name (valid)
        if(name.matches("[a-zA-Z]+"))
            this.name = name;
        else
            System.out.println("Invalid name\n");
    }

    public void setTel(String  tel){
        
        // Make sure it's a moroccan tel
        if (tel.length() == 10 && tel.startsWith("06"))
            this.tel = tel;
        else
            System.out.println("Invalid Tel\n");

    }

    public void setEmail(String email){

        // Make sure it's a valid email address
        if (email.endsWith("@gmail.com"))
            this.email = email;
        else
            System.out.println("Invalid email\n");
        
    }

    public void setAge(int age){
        
        // Make sure the age is for teenagers-adults only
        if (age >= 18){
            this.age = age;
        }else{
            System.out.println("Invalid age\n");
        }
    }

    public void setGender(char gender){
        
        // Make sure the gender is either a Female or Male
        if (gender == 'F' || gender == 'M')
            this.gender = gender;
        else
            System.out.println("Invalid gender\n");

    }

    public void setOrder(int contact_nbr){

        // Make sure it's always positive number
        if (contact_nbr >= 0)
            this.order = contact_nbr;
        else
            System.out.println("Invalid Order number\n");
    }

    // Class Getters
    public String getName(){
        return this.name;
    }

    public String getTel(){
        return this.tel;
    }

    public String getEmail(){
        return this.email;
    }

    public int getAge(){
        return this.age;
    }

    public char getGender(){
        return this.gender;
    }

    public int getOrder(){
        return this.order;
    }

    public String toString(){
        return 
        "\t*** " + this.getName() + " ***\n\n" +
        "Tel: " + this.getTel() + "\n" +
        "Email: " + this.getEmail() + "\n" +
        "Age: " + this.getAge() + "\n" +
        "Gender: " + this.getGender() + "\n";
    }

    public void modify(){

    }

    public void delete(){
        
    }

    public void addToGroup(){

    }

    public void share(){

    }
    
    public void call(){
        System.out.println("Calling " + this.getName() + " .......\n");
    }

    public void sendSMS(String message){
        System.out.println("'Message" + message + "'\n\n");
        System.out.println("Message was sent to " + this.getName() + " Successfully.\n");
    }
}