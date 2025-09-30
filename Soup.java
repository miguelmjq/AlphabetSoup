//Name: Miguel Mirabal
//Date: 09/28/25
//Description: This program will insert a company name into a string of letters provided by the user, it can also remove some of the letters, remove a vowel, remove a specific
//word from the string, and get a random char from the string.


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

    //precondition- the input can be anything
    //poscondition- returns the string 'letters' with the input added to the string
    //adds a word to the pool of letters known as "letters"
    public void add(String word){
        letters += word;
    }

    //precondition- no input 
    //poscondition- returns a random character from the string 
    //Use Math.random() to get a random character from the letters string and return it.
    public char randomLetter(){
       char temp= letters.charAt((int)(Math.random()*(letters.length()-1)));
       System.out.println("rl check");
        return temp;
    }


    //precondition- no input needed
    //poscondition- returns the string of letters with the company name added in the center of it
    public String companyCentered(){
        String temp1 = letters.substring(0,(letters.length()-1)/2);
        String temp2 = letters.substring((letters.length()-1)/2,letters.length()-1);
        String temp3 = ""+temp1+company+temp2;
       letters = temp3;
        System.out.println("cc check");
        return letters;
    }


    //precondition- no input needed
    //poscondition- returns the string letters with the first vowel removed
    public void removeFirstVowel(){
        letters = letters.replaceFirst("[AEIOUaeiou]", "");
        System.out.println("rfv check ");
        }

    //precondition- a num that is less than the total length of the string letters
    //poscondition- returns the string letters with num amount of characters removed from a random spot
    public void removeSome(int num){
        int m = (int)(Math.random()*(letters.length()-1));
        if (m+num>letters.length()-1){
            num = (letters.length()-1)-m;
        }
        String c = letters.substring(0,m);
        String c2 = letters.substring(m+num, letters.length()-1); 
        letters =c+c2;
        System.out.println(letters);
    }

    //precondition- a word
    //poscondition- returns the string letters with the word specified removed 
    public void removeWord(String word){
        if (letters.contains(word)){
            letters = letters.replaceAll(word, "");
            System.out.println(word+ " removed");                                                                          
        }
        else {
            System.out.println(word+ " not in string");
        }
    }
}
