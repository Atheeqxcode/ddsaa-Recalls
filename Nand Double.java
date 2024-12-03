class Solution {
    public boolean checkIfExist(int[] arr) {
       HashSet <Integer> Hm = new HashSet<>();
       
        for(int i:arr){
            
            if(Hm.contains (2*i) ||( i%2 == 0 && Hm.contains(i/2))){
              return true;

                }
                Hm.add(i);
            }
            return false;
        

    }
}