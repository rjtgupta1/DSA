
class VowelConsonant {
    public static void checkCount(String str,int index,int[] count){
        if(str.length()==index){
            return;
        }
        
        if(isVowel(str.charAt(index))){
            count[0]++;
        }else{
            count[1]++;
        }
        
        checkCount(str,index+1,count);
        
    }
    
    public static boolean isVowel(char ch){
        ch = Character.toLowerCase(ch);
        return (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u');
    }
    public static void main(String[] args) {
    String str = "My name is rajat";
    int[] count = new int[2];
    checkCount(str,0,count);
    
    System.out.println("Vowel count is : "+ count[0]);
    System.out.println("Consonant count is : "+ count[1]);
    
    }
}