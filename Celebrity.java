public class Celebrity {

    private String name;
    private String hairColor;
    private String eyeColor;
    private String age;
    private String profession;
    private String deadOrAlive;
    private String gender;
    private String height;
    private String nationality;
    private String race;

    public Celebrity(String name, String hairColor, String eyeColor, String age, String profession, String deadOrAlive, String gender, String height, String nationality, String race){
        this.name = name;
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
    public String getName(){
        return this.name;
    }
    public String getHairColor(){
        return this.hairColor;
    }
    public String getEyeColor (){
        return this.eyeColor;
    }
    public String getAge (){
        return this.age;
    }
    public String getProfession (){
        return this.profession;
    }
    public String getDeadOrAlive(){
        return this.deadOrAlive;
    }
    public String getGender (){
        return this.gender;
    }
    public String getHeight (){
        return this.height;
    }
    public String getNationality(){
        return this.nationality;
    }
    public String getRace(){
        return this.race;
    }
}