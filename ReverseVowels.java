public class ReverseVowels {
  public static void main(String[] args) {
    System.out.println(rev("atheeqoui"));
  } 
  
  public static String rev(String s){
 char []chars= s.toCharArray();
 String Vowels="aeiouAEIOU";
    int start=0;
        int end=s.length()-1;
 while(start<end){
    while(start<end && Vowels.indexOf(chars[start])==-1){
        start++;
    }
    while(start<end && Vowels.indexOf(chars[end])==-1){
        end--;
    }
 
    
    
        char temp=chars[start];
        chars[start]=chars[end];
        chars[end]=temp;
        start++;
        end--;

    }
return new String(chars);

  }
}
