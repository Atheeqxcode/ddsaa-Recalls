import java.util.HashMap;

public class RomanToInteger {
    
    public static void main(String[] args) {
        String s="lmcvv";
        System.out.println(romanToInt(s));

    }

  
    public static int romanToInt(String s) {
        s=s.toUpperCase();
 HashMap<Character,Integer> Hm=new HashMap<Character,Integer> ();
 Hm.put('I',1);
 Hm.put('V',5);
 Hm.put('X',10);
 Hm.put('L',50);
 Hm.put('C',100);
 Hm.put('D',500);
 Hm.put('M',1000);

 int result= Hm.get(s.charAt(s.length()-1));

 for(int i=s.length()-2;i>=0;i--){
    if(Hm.get(s.charAt(i))<Hm.get(s.charAt(i+1))){
        result=result-Hm.get(s.charAt(i));

    }
    else{
        result=result+Hm.get(s.charAt(i));
    }
    
    }
 


return result;

    }
}


