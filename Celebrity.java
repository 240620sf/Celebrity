public class Celebrity {
    
    private String hairColor;
    private String eyeColor;
    private int age;
    private String profession;
    private String deadOrAlive;
    private String gender;
    private double height;
    private String nationality;
    private String race;

    public Celebrity(String hairColor, String eyeColor, int age, String profession, String deadOrAlive, String gender, double height, String nationality, String race){
        this.hairColor = hairColor;
        this.eyeColor = eyeColor;
        this.age = age;
        this.profession = profession;
        this.deadOrAlive = deadOrAlive;
        this.gender = gender;
        this.height = height;
        this.nationality = nationality;
        this.race = race;
    }
    public String hairColor(){
        return this.hairColor;
    }
    public String eyeColor (){
        return this.eyeColor;
    }
    public int age (){
        return this.age;
    }
    public String profession (){
        return this.profession;
    }
    public String deadOrAlive(){
        return this.deadOrAlive;
    }
    public String gender (){
        return this.gender;
    }
    public double height (){
        return this.height;
    }
    public String nationality(){
        return this.nationality;
    }
    public String race(){
        return this.race;
    }
}