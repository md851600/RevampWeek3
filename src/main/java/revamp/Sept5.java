package revamp;

public class Sept5 {
//this file is under main only visible under Packages
    //Sept 18 use this to illustration inheritance, called by Runner
int numberInA;
    public Sept5() {
        numberInA = 22;
    }

   int j =  getConstantCharCounting("wh");

 public Sept5(int NumberInA)  {
     this();
     //.numInA = numInA;
    }

    //cannot locate this method in Sept18 but here ok see Runner
    public static int getConstantCharCounting(String str) {
        if(str.length()==0) {
            return str.length()+1;
        }
        return str.length();
    }

    public  int getNumInA(String pswd){
        if (pswd == "TEK") {
            return numberInA;
        } else {
            System.out.println(("wrong password"));
            return 0;
        }
    }

    public void setNumInA(int NumberInA) {
        NumberInA = numberInA;
    }
}