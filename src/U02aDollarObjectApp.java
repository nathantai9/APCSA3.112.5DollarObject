public class U02aDollarObjectApp {
    public static void main(String[] args){
        System.out.println("PART 1 -=-=- Using doubles");
        // Calculate the following currency problems using doubles

        System.out.println("Q1)   $0.70 + $0.10 = ");

        // TODO print what you EXPECT the answer SHOULD be
        System.out.println("EXPECT $0.80");

        // TODO print the ACTUAL result using doubles
        double answer = 0.70 + 0.20;
        System.out.println("ACTUAL " + answer);

        System.out.println("Q2)   $0.10 + $0.20 = ");
        // TODO print what you EXPECT the answer SHOULD be
        System.out.println("EXPECT $0.30");

        // TODO print the ACTUAL result using doubles
        answer = 0.10 + 0.20;
        System.out.println("ACTUAL " + answer);

        // Notice that Mr Riley has given you a partial Dollar class.
        // Here is the documentation for the Dollar class: https://bradleycodeu.github.io/apcsa/112_using_objects/U02aDollarObject/doc/Dollar.html
        // Read the documentation for the Dollar class and answer the following questions.
        // Use the Dollar class for the following quesions

        System.out.println("Q3)   How many Constructors does the Dollar class have?");

        System.out.println("3"); // TODO Your answer goes here

        System.out.println("Q4)   How many Accessor methods does the Dollar class have?");

        System.out.println("3"); // TODO Your answer goes here

        System.out.println("Q5)   How many Mutator methods does the Dollar class have?");

        System.out.println("0"); // TODO Your answer goes here

        System.out.println("Q6)   What is an immutable class? (Note: you ARE allowed to Google it & then answer in your own words)");

        System.out.println("It means that it cannot be changed once created"); // TODO Your answer goes here

        System.out.println("PART 2 -=-=- Using Dollar objects");
        System.out.println("Q7)   Using Dollar objects... $0.70 + $0.10 = ");

        // TODO print the ACTUAL result using Dollar objects and the add() method

        Dollar dollar1 = new Dollar(0.70);
        Dollar dollar2 = new Dollar(0.10);
        Dollar result = dollar1.add(dollar2);
        System.out.println("ACTUAL: " + result);

        System.out.println("Q8)   Using Dollar objects... $0.10 + $0.20 = ");

        // TODO print the ACTUAL result using Dollar objects and the add() method

        dollar1 = new Dollar(0.10);
        dollar2 = new Dollar(0.20);
        result = dollar1.add(dollar2);
        System.out.println("ACTUAL: " + result);
    }
}