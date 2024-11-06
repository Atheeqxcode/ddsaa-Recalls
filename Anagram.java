public class Anagram {
    public static void main(String[] args) {
        System.out.print(Anu("Atheeq","qeehta"));
        
    }

    public static boolean Anu(String s , String t){
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==t.charAt(i)){
                return true;
                

            }
        }return false;
    }
    
}
