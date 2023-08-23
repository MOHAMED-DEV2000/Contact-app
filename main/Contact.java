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
        this.name = name;
    }

    public void setTel(String  tel){
        // Tel Must be 10 digits/characters begin with country code
        this.tel = tel;
    }

    public void setEmail(String email){
        // Email entered Must be in xxx@yyyy.com format
        this.email = email;
    }

    public void setAge(int age){
        // Make sure it's a reasonable age
        if (age > 10){
            this.age = age;
        }else{
            System.out.println("Invalid age\n");
        }
    }

    public void setGender(char gender){
        // Make sure the gender is either a Femal or Male
        this.gender = gender;

    }

    public void setOrder(int contact_nbr){
        // Make sure it's always positive number
        this.order = contact_nbr;
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

    public void Modify(){

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