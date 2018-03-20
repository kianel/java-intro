package lesson02;

public class strTask {

    public static void eachNth(String instr,int n){

    int i = 0;
        while (i<instr.length())
        {
            char letter = instr.charAt(i);
            System.out.printf(Character.toString(letter));
            i=i+n;
        }
    }

    public static void main(String[] args) {
        eachNth("Opera",2);
        System.out.println("");
        eachNth("territory",3);
        System.out.println("");
        eachNth("success",1);
    }

}


