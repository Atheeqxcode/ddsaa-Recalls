public class AddingSpaces {
    public static void main(String[] args) {
        String s = "Atheeqacchabachahai";
        int[] spaces = {6,11,16};
        System.out.println(AddingSpaces(s, spaces)); // Output: "le et code"
    }
        public  static String AddingSpaces(String s, int[] spaces) {
         int m=s.length();
         int n=spaces.length;  
         StringBuilder res=new StringBuilder();
         int first=0;
         int second=0;
    
         while(first<m){
            if(second<n && first == spaces[second]){
                res.append(' ');
                second++;
    
            }res.append(s.charAt(first));
            first++;
         }return res.toString(); 
        }
    }

