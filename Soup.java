public class Soup {
    //these are instance variables 
    private String letters;
    private String company;

    //this is a constructor it sets the instance variables (more on this later in the year)
    public Soup(){
        letters ="";
        company = "none";
    }


    //sets the name of the company to the provided name
    public void setCompany(String company){
        this.company = company;
    }

    //returns the company name
    public String getCompany(){
        return company;
    }

    //returns letters
    public String getLetters(){
        return letters;
    }

//below are the functions you'll be writing.

    //adds a word to the pool of letters known as "letters"
    public void add(String word){
        letters += word;
    }


    //Use Math.random() to get a random character from the letters string and return it.
    public char randomLetter(){
       char temp= letters.charAt((int)(Math.random()*(letters.length()-1)));
        return temp;
    }


    //returns the letters currently stored with the company name placed directly in the center of all
    //the letters
    public String companyCentered(){
        String temp1 = letters.substring(0,(letters.length()-1)/2);
        String temp2 = letters.substring((letters.length()-1)/2,letters.length()-1);
        String temp3 = temp1+company+temp2;
        System.out.println(temp3);
        return temp3;
    }


    //should remove the first available vowel from letters. If there are no vowels this method has no effect.
    public void removeFirstVowel(){
        
    }

    //should remove "num" letters from a random spot in the string letters. You may assume num never exceeds the length of the string.
    public void removeSome(int num){

    }

    //should remove the word "word" from the string letters. If the word is not found in letters then it does nothing.
    public void removeWord(String word){
        
    }
}
