public class Contact {
    // Variables declaration
    static int contact_nbr = 0;

    private String fname, lname, fullName, email, tel;
    private int age, order;
    private char gender;

    // Class Constructor 
    public Contact(String fname, String lname, String email, String tel, int age, char gender){
        setFname(fname);
        setLname(lname);
        setFullNme(this.getFname(), this.getLname());
        setTel(tel);
        setEmail(email);
        setAge(age);
        setGender(gender);
        setOrder(contact_nbr);
        
        contact_nbr++;
    }

    // Class Setters
    public void setFname(String fname){
        this.fname = fname;
    }

    public void setLname(String lname){
        this.lname = lname;
    }

    public void setFullNme(String fname, String lname){
        this.fullName = lname + ", " + fname;
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
    public String getFname(){
        return this.fname;
    }

    public String getLname(){
        return this.lname;
    }

    public String getFullName(){
        return this.fullName;
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
        "\t*** " + this.getFullName() + " ***\n\n" +
        "First name: " + this.getFname() + "\n" +
        "Last name: " + this.getLname() + "\n" +
        "Tel: " + this.getTel() + "\n" +
        "Email: " + this.getEmail() + "\n" +
        "Age: " + this.getAge() + "\n" +
        "Gender: " + this.getGender() + "\n";
    }
}