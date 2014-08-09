package com.ephemeral;

import com.collect.Calculator;
import com.collect.ListDemo;
import com.collect.StackReverse;
import com.collect.StackReverseDigit;
import com.inquire.*;
import com.invest.*;
import com.look.MergeSorter;
import com.look.Selection_Sort;
import com.registrar.CashRegister;
import com.who.*;
import com.recursion.*;

import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 * @version 0.0.1
 * Created by MDCCLXXVI on 5/27/14.
 */
public class Main extends JFrame { // we use sxtends to create more specialised classes

    /**
     * constructor used as way to avoid creating an object of the class..
     */
    Main (){ //build construc


    }

    public static void main(String[] args) throws FileNotFoundException {
	// write your code here


        //new Main();
        final Aguatic  a = new Aguatic(9.0, 3.0);
        final Tile stewie = new Tile();

        ListDemo.main_2();
        ListDemo.main_3();
        StackReverse.main();
        StackReverseDigit.main();
        Calculator.main();
        ListDemo.main();
        Selection_Sort.main();
        MergeSorter.main();
        Tri_1.main();
        Invoice.main();
        CashRegister.main(4.91);
        CashRegister.main(1.60);
        CashRegister.main(3.47);
        CashRegister.main(1.21);
        CashRegister.main(1.99);
        CashRegister.main(2.42);



        Person sansa = new Person("Stark", "Sansa", 5.6);

        //
        ChoiceQuestion kay = new AnyCorrectChoiceQuestion(4);
        kay.setTxt("In which country was the inventor of Java born?");
        kay.addChoice();
        kay.saySomething();
        Scanner inlet = new Scanner(System.in);
        System.out.println("Please enter your choice here: ");
        System.out.println("Expected: "+ kay.getAnswer());

        System.out.println("Selected answer is "+ String.valueOf(kay.checkAns(inlet.nextLine())));
        //System.out.println("Expected: "+ kay.getAnswer());



        NumericQuestion nero = new NumericQuestion();
        nero.setTxt("Evaluate 1 / 3");
        nero.setAnswer("1.333");
        System.out.println(nero.getTxt());
        System.out.println("Answer: ");
        inlet = new Scanner(System.in);
        System.out.println("Selected answer is "+ String.valueOf(nero.checkAns(inlet.nextLine())));
        System.out.println("Expected:\n"+ nero.getAnswer());






        FillInQuestion trist = new FillInQuestion();
        trist.setTxt("The inventor of Java was");
        trist.setAnswer("James Gosling");
        System.out.println(trist.getTxt());
        System.out.println("Answer: ");
        inlet = new Scanner(System.in);

        System.out.println("Selected answer is "+ String.valueOf(trist.checkAns(inlet.nextLine())));
        System.out.println("Expected:\n"+ trist.getAnswer());



        Account aircraftcarrier;
        aircraftcarrier = new SavingsAccount(100);
        aircraftcarrier.deposit(823);
        aircraftcarrier.deposit(13);
        aircraftcarrier.deposit(242);
        aircraftcarrier.month_end(aircraftcarrier);

        CheckingAccount predator = new CheckingAccount(200);
        predator.withdrawal(50);
        predator.withdrawal(3);
        predator.withdrawal(73.32);
        predator.withdrawal(5);
        predator.deposit(200);
        predator.month_end(predator);
        System.out.println("toString()-> " + predator.toString());
        System.out.println(String.format("\n\n\n"));

        ChoiceQuestion terry = new ChoiceQuestion(4);
        terry.setTxt("In which country was the inventor of Java born?");
        terry.addChoice();
        terry.saySomething();
        Scanner checking = new Scanner(System.in);
        System.out.println("Please enter your choice here: ");
        System.out.println("Selected answer is "+ String.valueOf(terry.checkAns(checking.nextLine())));
        System.out.println("Expected: "+ terry.getAnswer());



        Fish nemo = new Fish();
        nemo.move();
        nemo.move();
        nemo.move();



        MenuClass aria = new MenuClass();
        aria.selectChoice();


        final Main c = new Main(); //c.lever();// lever();



        JavaRecursion selma = new JavaRecursion();
        int n = selma.getTriNumber(6);
        System.out.println("getTriNumber(6) " + n);
        System.out.println("selma.factorial(6) "+selma.factorial(6));


        Counter jackson = new Counter();
        jackson.increment();jackson.increment();jackson.increment();jackson.increment();
        System.out.println("Count is now: "+jackson.getMarker());
        String callhome = c.reverse_REC("HELLOWORLD");
        System.out.println(String.format("%s\n\n",callhome));



        reverse$d$();
        c.DogTrack(47);



        double[] isImport = c.decide();
        //c.tictactoe();

        for (int i = 0; i < isImport.length; i++) {
            System.out.println("decide is " + isImport[i]);

        }
        stewie.tile(12, 123);
        //stewie.tile(5, 100);

        int []autonomous = c.vending_machine();
        int $d = autonomous[0];
        int $c = autonomous[1];

        System.out.printf("c.vending_machine()[0] $d is %d\n",$d);
        System.out.printf("c.vending_machine()[1] $c is %d\n\n",$c);





        //c.decide();

        //int run = c.firstDigit(19932);
        String []toolshed = c.frequencey(c.arrLab(8, 7.2, 8.5, 9.5, 7.2, 7.2, 7.2, 7.2, 7, 4, 10));
        System.out.println("frequency "+ toolshed[0]);
        System.out.println("frequented # "+ toolshed[1]);
        String []llama = {"Tom", "Dick", "Harry", "Ellen", "Sue", "Jane", "Jack", "Rose"};
        String names[] = c.change(llama);
        //System.out.println("names.length is " +names.length);

        System.out.println("\n"+Arrays.toString(names));
        System.out.println("score [" + c.score(arrLab(8, 7, 8.5, 9.5, 7, 4, 10))+"]");
        System.out.println(c.scramble("Worlding"));
        System.out.println(c.scramble("Worlding"));
        System.out.println(c.scramble("Worlding"));
        System.out.println(c.scramble("Worlding"));
        System.out.println(c.scramble("Worlding"));
        System.out.println(c.reader("Mary had a little lamb"));
        System.out.println(c.reader("I don't give a damn for a man that can only spell a word one way. Mark Twain"));
        System.out.println(c.reader("I don't give a damn for a man that can only spell a word one way. Mark Twain"));
        System.out.println(c.reader("I don't give a damn for a man that can only spell a word one way. Mark Twain"));
        System.out.println(c.reader("I don't give a damn for a man that can only spell a word one way. Mark Twain"));





        System.out.println("First digit is "+c.firstDigit(19932));
        System.out.println("First digit is "+c.firstDigit(784535));
        int fibonacci = c.fibonacci(13);
        //ArrayList<String> str = c.diamond(4);



        String[] lengths = c.diamond(9);
        System.out.println("fibonacci "+fibonacci);

        String re = c.reverse("Hello World");
        System.out.println(re);
        String maura[] =c.permuting("Harry");
        for (int i = 0; i < maura.length; i++) {
            System.out.println(i+". " + maura[i]);
        }

        String[] little = c.temper();
        System.out.printf("\nwarmest temp so far: %s\nwhen? %s\n\n", little[0], little[1]);

        String [][]rome = c.roman(1978);

        for (int i = 0; i < rome[7].length; i++) {
            if(!rome[7][i].isEmpty()){
                System.out.printf("%s", rome[7][i]);
            }
        }
        System.out.println();

        String []sortN = c.sort("numeric","entered", "value");
        System.out.println("sorted: ");
        for (int i = 0; i < sortN.length; i++) {
            System.out.println(sortN[i]);
        }

        String []$gradebook = c.translate(2.7);
        System.out.println("the numeric value entered: " + $gradebook[0]);
        System.out.println("letter grade is "+$gradebook[1]);

        String []gradebook = c.grades($gradebook[1]);
        System.out.println("letter grade entered: " + gradebook[0]);
        System.out.println("the numeric value is " + gradebook[1]);

        System.out.println("expected: increasing - " + c.order(1.0,2.0,3.0));
        System.out.println("expected: decreasing - " + c.order(3.0, 2.0, 1.0));
        System.out.println("expected: no order - " + c.order(2.0, 1.0, 3.0));

        System.out.println("output: " + c.number(0));
        double []accounting = c.tax_rate('M', 80000);
        System.out.printf("%.2f\n\n\n",accounting[0]);

        ArrayList<String> search = c.extract("public");
        System.out.println("middle " + search.get(0));

        int [] ledger = c.military(1730,900);
        System.out.println("Hour(s) "+ledger[1]);
        System.out.println("Minutes(s) "+ledger[2]);

        int []dates = c.$Easter_Sunday(2001);
        System.out.println("Month " + dates[0]);
        System.out.println("Day " + dates[1]);

        c.name();
        c.sodaPop();
        //c.dia();






        System.out.printf("Width in millimeters from inches %9.2f\n", c.dimensional(8.5, 11.0)[0]);
        System.out.printf("Length in millimeters from inches %8.2f\n\n",c.dimensional(8.5, 11.0)[1]);



        System.out.println(c.invest());
        System.out.printf("%.2f\n", c.carrier_c(299));
        System.out.printf("%d\n", c.tally(10));
        System.out.println(c.box("James"));
        final String b = String.format("%.2f\n\t\t\t\t%s", a.chance(a), c.toString());
        System.out.print(b);
        double t = a.chance(a) + c.lever();
        //System.out.println("ephemeral << " + track);

        new Main() { //why use anonymous classing?
            {
                String alpha = b;
                System.out.println(alpha);
            }
        };


    }


    int[] vending_machine(){
        int[] autonomous = new int[2];
        Scanner in = new Scanner(System.in);
        System.out.print("Please insert $1 or 5$ or $10 only: ");
        final int bill = in.nextInt();
        System.out.print("Select\n1) Candybar: $1.25\n2) Mint $0.75\n3) Trail Mix $2.00\n\nChoice? ");
        final int choice = in.nextInt();
        double price = 0;
        final int to_pennies = 100;


        int quantify = to_pennies * bill;
        //System.out.println("quantify IS " + quantify);

        int change;
        int dollars = 0;
        int quarters = 0;

        switch (choice){
            case 1:
                price = 1.25 * to_pennies;
                break;
            case 2:
                price = 0.75 * to_pennies;
                break;
            case 3:
                price = 2.00 * to_pennies;
                break;
        }
        change = (int)(quantify - price);

        CashRegister.main((double)change/100);
        dollars = (int)change / 100;
        quarters = (int)change % 100;

        autonomous[0] = dollars;
        autonomous[1] = quarters;


        return autonomous;
    }


    void sodaPop(){
        double twelve_ounce_can = 0.355, two_liter_bottle = 2, six_pack_v;
        final int SIX = 6;
        six_pack_v = SIX * twelve_ounce_can;
        System.out.println(String.format("six pack volume is %.2f liters", six_pack_v));
        System.out.println(String.format("two liter volume is %.2f liters", two_liter_bottle));
        //return 0;
    }

    String invest()
    {
        int oInvestment = 10000, count = 0; double growth = 0, i=0;
        for (i = oInvestment; i < (oInvestment*2)+1 ; i+=growth) {

            growth = i * .05;
            count++;
        }
        String terms = String.format("It will take %d year(s) to achieve an accrued\n" +
                "yield of double the initial. Threshold is \nvalued currently at %.2f.\n\n", count, i );
        //System.out.println(terms);
        return terms;
    }

    double carrier_c(int minutes){

        double bill = 0, tax = 0.08, fees = 0;

        bill = (minutes <= 300) ? 29.95 + (29.95 * tax) + fees :

                (29.95 + (0.45*minutes)) +((29.95 + (0.45*minutes)) * tax) + fees ;

        return bill;
    }

    int tally(int limilal){
        int i;
        int count = 0;
        for (i = 0; i <= limilal ; i++) {
            if(i%2 == 0){
                count = count + i;
            }//end if

        }//end for
        return count;

    }

    String box(String name){
        name = String.format("--------------\n" +
                             "|\t%s\t|\n" +
                             "--------------\n", name);

        return name;
    }



    void name(){
        String p =  "*****\t" + "*****\t\t" +"*     *\n" +
                    "  *\t\t" +"*   *\t\t" +"*     *\n" +
                    "  *\t\t" +  "*****\t\t" +"*******\n" +
                    "  *\t\t" + "*\t\t\t" +"*     *\n" +
                    "*****\t"+  "*     *\t\t"+"*     *\n";

        String h =  "*    *\n" +
                    "*    *\n" +
                    "******\n" +
                    "*    *\n" +
                    "*    *\n";
        String term = String.format("%s",p);
        System.out.println(term);

    }

    void dia(){
        JOptionPane.showMessageDialog(null, "[self saySomething]");
    }

    double  lever(){
        Aguatic b = new Aguatic(10.0, 2.5);
        return b.chance(b);

    }

    @Override
    public String toString() {
        Aguatic b = new Aguatic(10.0, 2.5);
        return String.format("%.2f",b.chance(b));
    }

    double [] dimensional (double w, double l){
        double [] convert = new double[2];
        final double M_PER_I = 25.4;
        convert[0] = w * M_PER_I;
        convert[1] = l * M_PER_I;

        return convert;
    }

    String[] details(){
        String []inputs = new String[5];
        inputs[0] = "15000.0";//JOptionPane.showInputDialog("Enter price");
        inputs[1] = "15000.0";//JOptionPane.showInputDialog("Enter estimated miles driven per year"); //15,000
        inputs[2] = "3.49";//JOptionPane.showInputDialog("Enter estimated gas price"); //3.50
        inputs[3] = "40.0";//JOptionPane.showInputDialog("Enter effiency in miles per gallon"); // how many miles
        inputs[4] = "10999.0";//JOptionPane.showInputDialog("Enter estimated resale value after 5 years");
        return inputs;
    }

    /**
     *
     * @return Compute the total cost of owning the car for five years.
     */
    double []decide(){//(double []hybrid_data){
        String []hybrid_data = details();
        double []results = new double[6];

        double price = Double.parseDouble(hybrid_data[0]);
        double the_m_driven_per_y = Double.parseDouble(hybrid_data[1]); //15,000
        double gas_price = Double.parseDouble(hybrid_data[2]); //3.50
        double how_many_miles_per_gallon = Double.parseDouble(hybrid_data[3]);
        double valuey5 = Double.parseDouble(hybrid_data[4]);

        results[0] = price;
        results[1] = the_m_driven_per_y;
        results[2] = gas_price;
        results[3] = how_many_miles_per_gallon;
        results[4] = valuey5;

        //TODO Compute the total cost of owning the car for five years.
        results[5] = (((results[1] / results[3])*results[2])*5)+results[0];
        results[5] = ((the_m_driven_per_y / how_many_miles_per_gallon)/*<---get the gallon quantity*/*gas_price)*5
        /*owning for 5 years + init cost*/ + (price - valuey5);


        return results;
    }

    int []military(int first, int second){
        int clocks [] = new int[3];
        clocks[0] = second - first;
        clocks[0] = (second < first) ? first - second: second - first;
        clocks[1] = clocks[0] / 100;
        clocks[2] = clocks[0] % 100;


        return clocks;
    }

    int []$Easter_Sunday(int year){
        int []when = new int[2];

        int a = year%19;
        int b = year/100;
        int c = year%100;
        int d = b/4;
        int e = b%4;
        int g = (8*b+13)/25;
        int h = (19*a+b-d-g+15)%30;
        int j = c/4;
        int k = c%4;
        int m = (a+11*h)/319;
        int r = (2*e+2*j-k-h+m+32)%7;
        when[0] = (h-m+r+90)/25;
        when[1] = (h - m +r + when[0] + 19)%32;
        //System.out.printf("%d\n%d\n%d\n%d\n%d\n%d\n%d\n%d\n%d\n%d\n%d\n%d\n%d\n",a,b,c,d,e,g,h,j,k,m,r,n,p);

        return when;
    }

    //String[]
    ArrayList<String> extract(String s){
        ArrayList<String> a = new ArrayList<String>();

        String middle = (s.length()%2==1) ? s.substring(s.length()/2, s.length()/2+1) :
                s.substring((s.length() / 2)-1, s.length() / 2 + 1);

        a.add(middle);
        return a;
    }

    double []tax_rate(char status, int income){
        double []ledger = new double[2];
        //String norma = String.format("%s",status);
        //ledger[0] = (String.format("%s",status).toLowerCase().equals("s")) ? income < 32000 ? .10*32000 : 3200 +
        // (income * .25):2;
        if (String.format("%s",status).toLowerCase().equals("s")) {
            ledger[0] = income <= 32000 ? .10*32000 : ((income - 32000)*.25) +(3200);// : 2;
        }
        else if (String.format("%s",status).toLowerCase().equals("m")) {
            ledger[0] = income <= 64000 ? .10*64000 : ((income - 64000)*.25) +(6400);// : 2;
        }

        return ledger;
    }

    String number(int number){
        String classify = null;
        if (number!=0){
            classify = number<0 ? "negative" : "positive";
        } else
        classify = "zero";

        return classify;
    }

    String order(double x, double y, double z ){
        String classify = null;
        double []store = new double[3];
        store[0] = x; store[1] = y; store[2] = z;

        classify = (store[0] < store[1] && store[1] < store[2] || store[2] < store[1] && store[1] < store[0]) ?
                store[0] < store[1] && store[1] < store[2] ? "increasing" : "decreasing": "no order";
        return classify;
    }

    String[] grades(String letter){
        String[] ledger = new String[2];
        double []precision = new double [1];
        int []match = {0, 1, 2, 3, 4};
        double grade = 0;
        if(letter.length()==2){
            if(letter.charAt(1) == '-'){
                //ledger[1] = String.format("%d%f", + (- 0.3));
                precision[0] = - 0.3;
            }
            else if (letter.charAt(1) == '+'){
                //ledger[1] = String.format("%d%f", + (+ 0.3));
                precision[0] = + 0.3;
        }}

        if(letter.charAt(0)=='A'){
            grade = match[4];
        }
        else if(letter.charAt(0)=='B'){
            grade = match[3];}
        else if(letter.charAt(0)=='C'){
            grade = match[2];}
        else if(letter.charAt(0)=='D'){
            grade = match[1];}
        else if(letter.charAt(0)=='F'){
            grade = match[0];}

        ledger[0] = String.format("%s", letter);
        ledger[1] = String.format("%.2f", grade + precision[0]);

        return ledger;
    }

    String []translate(double grade){
        String []ledger = new String[2];
        String precision = "";
        char []match = {'F', 'D', 'C', 'B', 'A'};

        if(grade%1!=0){
            precision = grade%1 >= 0.5? "-":"+";
        }

        if(grade == 4.0){
            ledger[1] = match[4] + precision;
        }
        else if(grade < 4.0 && grade >= 3.7){
            ledger[1] = match[4] + precision;
        }
        else if(grade < 3.7 && grade >= 2.7){
            ledger[1] = match[3] + precision;
        }
        else if(grade < 2.7 && grade >= 1.7){
            ledger[1] = match[2] + precision;
        }
        else if(grade < 1.7 && grade >= 1.0){
            ledger[1] = match[1] + precision;
        }
        else if(grade < 1.0){
            ledger[1] = match[0] + precision;
        }
        ledger[0] = String.format("%.2f", grade);

        return ledger;
    }

    String[] sort(String a, String b, String c){
        String []ledger = new String[3];
        String swap, greatest ="";
        if(a.compareTo(b) < 0){
            greatest = b;
            ledger[0] = a;
        }
        else {
            greatest = a;
            ledger[0] = b;
        }

        if(greatest.compareTo(c) < 0){
            ledger[2] = c;
            ledger[1] = greatest;
            if(ledger[2].compareTo(ledger[0])<0){
                swap = ledger[1];
                ledger[1] = ledger[0];
                ledger[0] = swap;
            }
        }
        else{
            ledger[2] = greatest;
            ledger[1] = c;
            if(ledger[1].compareTo(ledger[0])<0){
                swap = ledger[1];
                ledger[1] = ledger[0];
                ledger[0] = swap;
            }
        }


        return ledger;

    }

    String [][]roman(int y){
        String [][]ledger = new String[8][1];
        String []rome = new String[4];
        ledger[7] = rome;
        for (int i = 0; i < ledger[7].length; i++) {
            ledger[7][i] = String.format("%s", "");
        }

        ledger[1][0] = String.format("%d",y/1000); //thousands
        ledger[2][0] = String.format("%d",y%1000);
        ledger[3][0] = String.format("%d",Integer.parseInt(ledger[2][0])/100); //hundreds
        ledger[4][0] = String.format("%d",Integer.parseInt(ledger[2][0])%100);
        ledger[5][0] = String.format("%d",Integer.parseInt(ledger[4][0])/10); //tens
        ledger[6][0] = String.format("%d",Integer.parseInt(ledger[4][0])%10); //ones
        ledger[0][0] = String.format("%d",y);

        if(Integer.parseInt(ledger[1][0]) >= 0 && Integer.parseInt(ledger[1][0]) <= 3) {
            switch (Integer.parseInt(ledger[1][0])){
                case 1: rome[0] = "M"; break;
                case 2: rome[0] = "MM"; break;
                case 3: rome[0] = "MMM"; break;
                case 0: rome[0] = ""; break;
            }


            if (Integer.parseInt(ledger[3][0]) >= 1 && Integer.parseInt(ledger[3][0]) <= 9) {
                switch (Integer.parseInt(ledger[3][0])) {
                    case 1: rome[1] = "C"; break;
                    case 2: rome[1] = "CC"; break;
                    case 3: rome[1] = "CCC"; break;
                    case 4: rome[1] = "CD"; break;
                    case 5: rome[1] = "D"; break;
                    case 6: rome[1] = "DC";  break;
                    case 7: rome[1] = "DCC"; break;
                    case 8: rome[1] = "DCCC";  break;
                    case 9: rome[1] = "CM"; break;
                }
            }

            if (Integer.parseInt(ledger[5][0]) >= 1 && Integer.parseInt(ledger[5][0]) <= 9) {
                switch (Integer.parseInt(ledger[5][0])) {
                    case 1: rome[2] = "X"; break;
                    case 2: rome[2] = "XX"; break;
                    case 3: rome[2] = "XXX"; break;
                    case 4: rome[2] = "XL"; break;
                    case 5: rome[2] = "L"; break;
                    case 6: rome[2] = "LX"; break;
                    case 7: rome[2] = "LXX"; break;
                    case 8: rome[2] = "LXXX"; break;
                    case 9: rome[2] = "XC"; break;
                }
            }

            if (Integer.parseInt(ledger[6][0]) >= 1 && Integer.parseInt(ledger[6][0]) <= 9) {
                switch (Integer.parseInt(ledger[6][0])) {
                    case 1: rome[3] = "I";  break;
                    case 2: rome[3] = "II"; break;
                    case 3: rome[3] = "III"; break;
                    case 4: rome[3] = "IV"; break;
                    case 5: rome[3] = "V"; break;
                    case 6: rome[3] = "VI";  break;
                    case 7: rome[3] = "VII"; break;
                    case 8: rome[3] = "VIII"; break;
                    case 9: rome[3] = "IX"; break;
                }
            }
        }
        else System.out.println("Error (>3999): Invalid input.");



        return ledger;
    }

    String []temper() throws FileNotFoundException {
        String path = "/Users/MDCCLXXVI/Documents/workspace/apostrophize/src/main/java/com/ephemeral/floating.txt";

        File infile = new File(path);
        Scanner in = new Scanner(infile);
        int i = 0, month_count = 0; double greatness = 0; String month = "";

        ArrayList<Double> currNumber = new ArrayList<Double>();

        currNumber.add(in.nextDouble());
        greatness = currNumber.get(0);
        while (in.hasNextDouble()){
            i++;
            currNumber.add(in.nextDouble());
            if(greatness<currNumber.get(i)){
                greatness = currNumber.get(i);
                month_count = i;
            }
        }
        switch (month_count+1){
            case 1:month = "JAN"; break;
            case 2:month = "FEB";break;
            case 3:month = "MAR";break;
            case 4:month = "APR";break;
            case 5:month = "MAY";break;
            case 6:month = "JUN";break;
            case 7:month = "JUL";break;
            case 8:month = "AUG";break;
            case 9:month = "SEP";break;
            case 10:month = "OCT";break;
            case 11:month = "NOV";break;
            case 12:month = "DEC";break;
        }

        String []ledger = new String[2];
        ledger[0] = String.format("%.2f",greatness);
        ledger[1] = month;
        return ledger;
    }

    double []randomness (){
        double []n = new double[10];
        for (int i = 0; i<n.length; i++) {
            n[i] = Math.random();
        }
        return n;
    }

    /**
     * Translate the following pseudocode for randomly permuting the characters in a string into a Java program.
     Read a word.
     Repeat word.length() times
     Pick a random position i in the word, but not the last position. Pick a random position j > i in the word.
     Swap the letters at positions j and i.
     Print the word.
     To swap the letters, construct substrings as follows:
     first i middle j last
     Then replace the string with
     first + word.charAt(j) + middle + word.charAt(i) + last

     * @param str
     * @return
     */
    String []permuting(String str){
        int i = 0, j = 0, l, m , n, p, a, b;

        String []fables = new String[str.length()];
        for (int k = 0; k < str.length() ; k++) {

            i = (int)(Math.random()*str.length()-1);
            do {
                j = (int)(Math.random()*str.length());

                }while(i>=j);

            l = (int)(Math.random()*str.length()-1);
            do {
                m = (int)(Math.random()*str.length());

            }while(l>=m);
            n = (int)(Math.random()*str.length()-1);
            do {
                p = (int)(Math.random()*str.length());

            }while(n>=p);
            a = (int)(Math.random()*str.length()-1);
            do {
                b = (int)(Math.random()*str.length());

            }while(a>=b);

            fables[k] = conform(str, i, j);
            fables[k] = conform(fables[k], l, m);
            fables[k] = conform(fables[k], n, p);
            fables[k] = conform(fables[k], a, b);
            // values of randomly generated characters in the string
            //System.out.print(String.format("%s%s  ",temp1,temp2));
            System.out.println(String.format("%d %d %d %d %d %d %d %d",i,j, l, m, n, p, a, b));

        }

        return fables;
    }

    String conform(String s, int i, int j){

        char temp1 = (s.charAt(i));
        char temp2 = (s.charAt(j));
//            temp3 = (str.charAt(l));

        // <! ----->
        String first = s.substring(0, i);
        String middle = s.substring(i +1, j);
        String last = s.substring(j +1);

        //fables[k] =
        return first + temp2 + middle + temp1 + last;
    }
    
    public static String reverse(String snore){

        char []expa = new char[snore.length()];

        int count = 0;
        for (int i = snore.length()-1; i >= 0; i--) {
            expa[count] = snore.charAt(i);
            count++;
        }

        return String.valueOf(expa);
    }



    public static String reverse_REP(String str){ //recursive methods
        char []book = new char[str.length()];



        String strike = str;
        int number = strike.length()-1;


        if(number == 0){
            return str;//String.valueOf(strike.substring(0,1));
        }
        number--;

        return reverse_REP(strike.substring(number - 1, number));
        //return str.
    }

    int fibonacci(int n){
        int sum = 0, previous = 0, next = 1;

        for (int i = 0; i < n; i++) {
            sum = previous + next;
            next = previous;
            previous = sum;

        }

        return sum;

    }



    String [] diamond(int limit){
        int count = limit -1;

        String [] process = new String[limit+(count)];
        String k ="";
        String c ="";

        int i = 0;

        for (int j = 0; j <= count ; j++) {
            c+= " ";
        }

        for (; i < limit; i++) {
            if (i==0){
                k += "*";
            }
            else{
            k += "**";
            }
            process[i] = c+k; System.out.printf("%s\n",process[i]);
            c = c.substring(0, count--);

        }
        k="";
        //c=" ";
        count = limit -1;
        for (; i < limit+(limit-1); i++) {
            count --;
            k = process[count]; process[i] = k;//c+= " ";

            System.out.printf("%s\n",process[i]);
        }

        return  process;
    }

    public static boolean allTheSame(double x, double y, double z){
        boolean verify = false;
        if(x == y && x == z){
            verify = true;
        }
        return verify;
    }

    public static int firstDigit(int n){
        String str = String.format("%d",n).charAt(0)+"";
        //String str = String.format("%s",m);

        return Integer.parseInt(str);
    }

    public static String reader(String line){
        String currLine="";
        Scanner in = new Scanner(line);
        while(in.hasNext()){
            currLine += String.format("%s ", scramble(in.next()));//+=

        }
        return currLine;
    }

    /**
     * constructs a scrambled version of a given word.
     * @param word user input
     * @return scrambled
     */
    public static String scramble(String word){
        if(word.length()<=3){
            return word;
        }

        String eggs = "";
        String first, last;
        String theScramble_A = "";
        String theScramble_B = "";
        int r = (int)(Math.random() * (word.length())-1);//+ 1;;
        while( r == 0){
            r = (int)(Math.random() * (word.length()-1));//+ 1;
        }
        if(r == word.length()-2){
            theScramble_A = word.substring(r-1, r);
            theScramble_B = word.substring(r, r+1);
             first = word.substring(0,r-1);
             last = word.substring(r+1);

        }
        else{
            theScramble_A = word.substring(r, r+1);
            theScramble_B = word.substring(r+1, r+2);
             first = word.substring(0,r);
             last = word.substring(r+2);
        }



        System.out.println("r is :::: [" + r+"]");


        //String first = word.substring(0,1);
        //String last = word.substring(word.length()-1);

        eggs = first + theScramble_B + theScramble_A + last;
        return eggs;

    }



    public static void write_binarysort(int[] array, int searched){
        //int []sorted = new int[array.length];

        boolean found = false;
        int low = 0;
        int high = array.length-1;
        int curr = 0;

        while(low<=high){ //true now, becomes false // basically WHILE TRUE. DO>
            curr = (low + high) /2;
            if(array[curr] == searched){
                found = true;
            } else if(array[curr] < searched){
                low = curr + 1;
            }
            else {high = curr - 1;} //Look @ first half.

        }

        if(found){
            System.out.println("Found at postion: "+ curr);
        }else System.out.println("Not found. Insert before position: "+ curr); //<--- how/
        //return sorted;
    }

    public static double[] arrLab(double...num){
        double tools[] = num;
        /**
        for (int i = 0; i < tools.length; i++) {
            //System.out.println("tools is now " + tools[i]);
        }
         **/
        return tools;
    }

    public static double score (double []array){
        double score =0;
        double low = array[0];
        int tracker = 0;


        for (int i = 1; i < array.length; i++) {
            if(array[i] <= low){
                low = array[i];
                tracker = i;
            }
            //System.out.println("low is ===> "+low);
            //System.out.println("tracker is "+tracker);
        }

        while(tracker < array.length){
            array[tracker] = array[tracker + 1];
            System.out.println("array[" +tracker+"]"+" is NOW "+ array[tracker++]);
            tracker++;
        }

        array = Arrays.copyOf(array, array.length-1);

        for (int i = 0; i < array.length; i++) {
            score += array[i];
        }



        return score;
    }

    String []change (String names[]){
        int half = names.length /2;
        String[] temp = new String[half];

        for (int i = 0; i < temp.length; i++) {
            temp[i] = names[half];
            half++;

        }
        System.out.println("Arrays.toString(temp) "+Arrays.toString(temp));

        names = Arrays.copyOf(names, names.length/2);
        int value = names.length*2;
        String complete[] = new String[value]; half = 0;
        //System.out.println("NAMES.length is " +value);
        for (int i = 0; i < complete.length; i++) {
            if(i>=names.length){
                complete[i] = names[half];
                half++;
            }else{complete[i] = temp[i];}

        }
        System.out.println("Arrays.toString(names) "+Arrays.toString(names));

        return complete;
    }

    String []frequencey(double array[]){ // find mode.
        int [][]tools = new int[array.length][2];
        String shed[] = new String [2];
        double []check = array;
        int big = 0;
        ArrayList<Integer> counter = new ArrayList<Integer>();
        int count  = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < check.length; j++) {
                if(array[i] == check[j]){
                    count++;
                }


            }//counter.add(count); count =0;
            tools[i][0] = count;
            tools[i][1] = i;
            //big = tools[0][0];
            if(i > 0){
                if(tools[i-1][0]< tools[i][0]){
                    big = tools[i][0];
                    shed[1] = Integer.toString(tools[i][1]);
                }
            }
            count =0;
        }

//        int largest= tools[0][0];
//        for (int i = 0; i < tools.length; i++) {
//            if(largest< tools[i][0]){
//                largest = tools[i][0];
//            }
//        }

        shed[0] = Integer.toString(big);
//        for (int i = 0; i < tools.length; i++) {
//            if(big== tools[i][0]){
//                shed[1] = Integer.toString(tools[i][1]);
//            }
//        }
        shed[1] = Double.toString(array[Integer.parseInt(shed[1])]);
        return shed;
    }

    public static void tictactoe(){
        String [][]tic = new String[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tic[i][j] ="";
            }
        }
        for (int i = 0; i < 3; i++) {
            //String.format(" %s | %s | %s \n", [i][0], [i][1], [i][2]);
            for (int j = 0; j < 3; j++) {


            } if(i!=2) {System.out.println("___ ___ ___");}
        }
    }

    public static void DogTrack(int N) throws FileNotFoundException {
        String []track = new String [N];
        String []autofill = {"F", "S", "R"};
        DogTag []dogArray = new DogTag[autofill.length];
        String []imagination = reimagine(autofill);
        int adv_lngth = 0;

        System.out.println(Arrays.toString(imagination)+"\n");

        boolean HALT = false;



        for (int i = 0; i < N; i++) { //initialize array with
            track[i] = "o";
        }


        for (int i = 0; i < dogArray.length; i++) { // automate creation of ∑i DogTag objects
            int advance =(int)((Math.random() * N)/4)+1; //new position created
            dogArray[i] = new DogTag(advance, N, imagination[i], track);
            dogArray[0].accountant.println(String.format("\n**ADVANCE (dogArray[ %s ]) =  %d \n", dogArray[i].init, dogArray[i].lucky));

            adv_lngth =(int)((String.format("\n**ADVANCE (dogArray[ %s ]) =  %d \n", dogArray[i].init, dogArray[i].lucky).length()) * 1.62) ;



            drone(dogArray, i);
        }


        while (dogArray[0].lucky < N || dogArray[1].lucky < N || dogArray[2].lucky < N){ draw(dogArray, adv_lngth);



            for (int i = 0; i < dogArray.length;  i++) {

                       if ( central_intelligence(dogArray, i) ){HALT = true;break;}

            }
            if(HALT){
                break;



        }
        }dogArray[0].accountant.close();
    }

    /**
     * Executes movement of object to new location. Sets initials
     * at new position (only after lucky updates its count).
     *
     * (external)
     * //@param lucky is an argument of -> track[lucky: new position created]
     *
     * @param dogArray collection of dog objects
     * @param i represents a specific canine at ith index
     */
    private static void drone(DogTag []dogArray, int i){
        if(!dogArray[i].track[reset(dogArray[i].lucky, dogArray[i].x)].equals("o")){dogArray[i].track[reset(dogArray[i].lucky, dogArray[i].x)] += dogArray[i].init;}
        else{dogArray[i].track[reset(dogArray[i].lucky, dogArray[i].x)] = dogArray[i].init;}
        System.out.println(Arrays.toString(dogArray[i].track));
    }

    private static boolean central_intelligence(DogTag[] dogArray, int i) throws FileNotFoundException {
        boolean fall = false;
        int advance = (int)((Math.random() * dogArray[i].x)/4)+1;
        int capture = dogArray[i].lucky;
        //PrintWriter ledger = new PrintWriter("movement.txt");


        dogArray[i].lucky += advance; //new position created
        dogArray[0].accountant.println("\n**ADVANCE (dogArray["+ dogArray[i].init + "]) += "+ advance + " equates to: "+capture +" + " +advance + "->"+dogArray[i].lucky+"\n");

        if(dogArray[i].lucky <dogArray[i].x){

            drone(dogArray, i);

        }
        else if (dogArray[i].lucky >=dogArray[i].x){
            // if new position is greater than array size, return true to stop advancements
            // immediately: object at ith element wins.
            dogArray[i].track[dogArray[i].x -1] = dogArray[i].init;
            System.out.println(Arrays.toString(dogArray[i].track));
            initToName(dogArray, i); fall = true; }//break;}


        return fall;
    }


    private static int reset (int lucky, int x){
        if(lucky == x/3 || lucky == (2*x)/3){ lucky = 0;}
        return lucky;
    }

    private static String[] reimagine(String []autofill){
        int random = (int)(Math.random() * autofill.length);
        int random_2 = (int)(Math.random() * autofill.length);
        int random_3 = (int)(Math.random() * autofill.length);

        while (random == random_2){
            random_2 = (int)(Math.random() * autofill.length);
        }


        String replacements[]= new String[autofill.length];
        replacements[0] = autofill[random];
        replacements[1] = autofill[random_2];
        replacements[2] = autofill[autofill.length - (random +random_2)];

        return replacements;
    }

    private static void initToName(DogTag[] dogArray, int i){
        if(dogArray[i].init.equals("F")){
            dogArray[i].init += "ido";
        } else if(dogArray[i].init.equals("S")){
            dogArray[i].init += "pot";
        } else if(dogArray[i].init.equals("R")){
            dogArray[i].init += "over";
        }
        System.out.println(dogArray[i].init+" wins!");
    }

    private static void draw(DogTag[] dogArray, int adv_lngth){
        String line="";
        for (int i = 0; i < adv_lngth; i++) {
            line+="_";
        }

        dogArray[0].accountant.print(line+"\n");
    }

    public static void url() throws IOException {
        String str = "https://www.google.com/search?q=hello+world";
        URL go = new URL(str);
        Scanner in = new Scanner(go.openStream());
    }

    public static double[] readFile(String files_name) throws IOException {
        File infile = new File(files_name);
        Scanner in = new Scanner(infile);

        try{
            int SIZE = 0;
            while(in.hasNextInt()){
                SIZE = in.nextInt(); // May throw NoSuchElementException
            }

            double[] ledger = new double[SIZE];
            int i = 0;
            while (in.hasNextDouble()) {
            ledger[i] = in.nextDouble(); // May throw NoSuchElementException
            i++;
            }

            if(in.hasNext()){
                throw new IOException("End of file expected");
            }

            return ledger;
        }
        finally {
            in.close();
        }
    }

    public static void p7_1 () throws FileNotFoundException {
        boolean track = false;
        while(!track) {
            try {
                String filename = "hello.txt";
                PrintWriter write = new PrintWriter(filename);

                try {
                    write.println("Hello World!");
                } finally {
                    write.close();
                }
            } catch (FileNotFoundException exception) {
                System.out.println(exception.getMessage());
            }
            track = true;
        }

        try {
            String filename = "hello.txt";
            File infile = new File(filename);
            Scanner in = new Scanner(infile);
            try {
                while (in.hasNextLine()) {
                    System.out.println(in.hasNext());
                }
            } finally {
                in.close();
            }
        }
        catch(FileNotFoundException exception){
            System.out.println(exception.getMessage());
        }
        catch(NoSuchElementException exception){
            System.out.println(exception.getMessage());
        }
    }

    public static void p7_2() throws FileNotFoundException {
        try{
            String filename = "fables.txt";
            Scanner in = new Scanner(new File(filename));
            PrintWriter write = new PrintWriter("edit.dat");
            int i = 1;
            while(in.hasNextLine()){
                write.println(String.format("/* %d */ %s",i,in.nextLine()));
                i++;
            }

            write.close();
            in.close();
        }
        catch (FileNotFoundException exception){
            System.out.println(exception.getMessage());
        }


    }

    public static void reverse$d$() throws FileNotFoundException {

        String fn = "carbon.txt";
        Scanner in = new Scanner(new File (fn));

        try{
            run_through_file_lines(in);
        }
        finally{
           closed(in);
        }

        //run




    }

    public static void run_through_file_lines(Scanner in){
        while(in.hasNextLine()){
            System.out.println(String.format("%s",reverse(in.nextLine())));
        }
    }
    public static void closed(Scanner in){
        in.close();
    }

    public static String reverse_REC(String str){ //recursive methods
        if(str.length() == 1){
            return str;
        }
        return str.charAt(str.length() - 1) + reverse(str.substring(0, str.length() - 1));
    }

    public static String recursively_reverse(String thread){
        if(thread.length() ==1){ // the LENGTH of thread will decrement by ONE each call until ONE REMAINS.
            return "";
        }
        return thread.charAt(thread.length() - 1) + recursively_reverse(
                                                                            thread.substring(
                                                                                                0,thread.length()-1));
                                                                                                // each recursive call:
                                                                                                // 0 ==> the NEW LENGTH
    }






    /**

    class MyClass{
    public static void main(String[] args){


    }
    }
     *
     */
}
