import java.util.ArrayList;
import java.util.Scanner;

public class game{

    //TRAITS GUESSER
    public static void testGuess(Celebrity celeb, Scanner guess){
    
        System.out.println("enter trait guess");
        String answer = guess.nextLine();
            
        
        if(answer.equals(celeb.getHairColor())){
            System.out.println("hair color matches the guess");
        }
        else if(answer.equals(celeb.getEyeColor())){
            System.out.println("eye color matches the guess");
        }
        else if(answer.equals(celeb.getAge())){
            System.out.println("the age matches your guess");
        }
        else if(answer.equals(celeb.getProfession())){
            System.out.println("the profession matches the guess");
        }
        else if(answer.equals(celeb.getDeadOrAlive())){
            System.out.println("the mortality matches your guess");
        }
        else if(answer.equals(celeb.getGender())){
            System.out.println("your celebrity is the guessed gender");
        }
        else if(answer.equals(celeb.getHeight())){
            System.out.println("your celebrity is the guessed height");
        }
        else if(answer.equals(celeb.getNationality())){
            System.out.println("your celebrity is guessed nationality");
        }
        else if(answer.equals(celeb.getRace())){
            System.out.println("your clebrity is guessed race");
        }
        else{
            System.out.println("celebrity does not have this trait");
            

        }
    }
    //PRINTS OUT ALL POSSIBLE TRAITS
    public static void guessableTraits(){
        System.out.println("hairColor");
        System.out.println("eyeColor");
        System.out.println("age");
        System.out.println("profession");
        System.out.println("deadOrAlive");
        System.out.println("gender");
        System.out.println("height");
        System.out.println("nationality");
        System.out.println("race");
    }
    


    //CHECKS A CELEBRITY GUESS
    public static boolean testCeleb(Celebrity celebAct, Scanner read){
        System.out.println("enter celebrity");
        String celeb = read.nextLine();
        
            if(celeb.equals(celebAct.getName())){
                System.out.println("you win, congratulations!!!");
                return true;
            }

            else{
                System.out.println("that is not the right celebrity");
                return false;
            }
    }

    //ADDS CELEBRITYS TO AN ARRAYLIST - CELEBRITY
    public static void addCeleb(ArrayList<Celebrity> celebList){
        Celebrity taylorSwift = new Celebrity("Taylor Swift", "blonde", "blue", "33", "musician", "alive", "female", "5.875", "American", "white");
        Celebrity lebronJames = new Celebrity("Lebron James", "black", "dark brown", "33", "basketball player", "alive", "male", "6.8", "American", "African American");
        Celebrity michaelJordan = new Celebrity("Micheal Jordan", "black", "yellow", "59", "basketball player", "alive", "male", "6.6", "American", "African American");
        Celebrity elonMusk = new Celebrity("Elon Musk", "brown", "green", "59", "entrepreneur", "alive", "male",  "6.15", "South African", "white");
        Celebrity joeBiden = new Celebrity("Joe Biden", "white", "blue", "80", "politician", "alive", "male", "6'0", "american", "white" );
        Celebrity donaldTrump = new Celebrity("Donald Trump", "blonde", "blue", "76", "politician", "alive", "male", "6'3", "american", "white" );
        Celebrity paulChelimo= new Celebrity("Paul Chelimo", "black", "dark brown", "32", "track athlete", "alive", "male", "5'9", "american", "African American" );
        Celebrity michaelJackson= new Celebrity("Michael Jacskons", "black", "dark brown", "50", "musician", "dead", "male", "5'9", "american", "African American" );
        Celebrity dwayneJohnson= new Celebrity(" Dwayne Johnson", "bald", "brown", "50", "actor", "alive", "male", "6'5", "american", "Somaon" );
        Celebrity cristianoRonaldo = new Celebrity("Cristaino Rondaldo", "brown", "brown", "38", "soccer player", "alive", "male", "6'2", "portuguese", "white" );
    
        celebList.add(taylorSwift);
        celebList.add(lebronJames);
        celebList.add(michaelJordan);
        celebList.add(elonMusk);
        celebList.add(joeBiden);
        celebList.add(donaldTrump);
        celebList.add(paulChelimo);
        celebList.add(michaelJackson);
        celebList.add(dwayneJohnson);
        celebList.add(cristianoRonaldo);

        
    }

public static void main(String[] args){
    
    Scanner guess = new Scanner(System.in);
    ArrayList<Celebrity> celebList = new ArrayList<Celebrity>();
    addCeleb(celebList);
    int celebs = (int)(Math.random() * celebList.size());
    Celebrity genCeleb = celebList.get(celebs);
    boolean win = false;
    while(win == false){
        guessableTraits();
        testGuess(genCeleb, guess);
        win = testCeleb(genCeleb, guess);
    }
    
    guess.close();

}
}
