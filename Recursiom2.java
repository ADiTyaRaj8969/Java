import java.util.HashSet;

public class Recursiom2 {

    public static int first=-1;
    public static int last=-1;

    public static String[] keypad={".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static void printComb(String str,int idx,String comb){
        if(idx==str.length()){
            System.out.println(comb);
            return;
        }
        char currChar=str.charAt(idx);
        String mapping=keypad[currChar-'0'];
        for(int i=0;i<mapping.length();i++){
            printComb(str, idx+1, comb+mapping.charAt(i));
        }
    }
    public static boolean[] map=new boolean[26];
    public static void CreatSubseq(String str,int idx,String newstr){
        if(idx==str.length()){
            System.out.println(newstr);
            return;
        }
        char curr=str.charAt(idx);
        CreatSubseq(str, idx+1, newstr+curr);
        CreatSubseq(str, idx+1, newstr);
    }
    public static void CreatSubseqNodup(String str,int idx,String newstr,HashSet<String> set){
        if(idx==str.length()){
            if(set.contains(newstr)){
                return;
            }
            else{
                System.out.println(newstr);
                set.add(newstr);
            }
            return;
        }
        char curr=str.charAt(idx);
        CreatSubseqNodup(str, idx+1, newstr+curr,set);
        CreatSubseqNodup(str, idx+1, newstr,set);
    }
    public static void RemoveDupli(String str,int idx,String newstr){
        if(idx==str.length()){
            System.out.println(newstr);
            return;
        }
        char curr=str.charAt(idx);
        if(map[curr-'a']){
            RemoveDupli(str, idx+1, newstr);

        }
        else{
            newstr+=curr;
            map[curr-'a']=true;
            RemoveDupli(str, idx+1, newstr);

        }

    }

    public static void FindOccurence(String st,int index,char ele){
        if(index==st.length()){
            System.out.println("Firstly Found at "+first+" and lastly found at "+last);
            return;
        }
        char currentchar=st.charAt(index);
        if(currentchar==ele){
            if(first==-1){
                first=index;
            }
            else{
                last =index;
            }
        }
        FindOccurence(st,index+1,ele);
    }
    public static boolean IsSorted(int arr[],int index){
        if(index==arr.length-1){
            return true;
        }
        if(arr[index]>=arr[index+1]){
            
            return false;

        }
        else{
            IsSorted(arr, index+1); 
            
        }
        return IsSorted(arr, index+1); 
    }
    public static void PrintReverseString(String st,int index){
        if(index==0){
            System.out.print(st.charAt(index));
            return;
        }
        System.out.print(st.charAt(index));
        PrintReverseString(st,index-1);
    }
    public static void MoveAllX(String str,int idx,int cou,String newstr){
        char current=str.charAt(idx);
        if(idx==str.length()-1){
            for(int i=0;i<cou;i++){
                newstr+='x';
            }
            System.out.println(newstr);
            return;
        }
        if(current=='x'){
            cou++;
            MoveAllX(str, idx+1, cou, newstr);

        }
        else{
            newstr+=current;
            MoveAllX(str, idx+1, cou, newstr);
        }
    }
    public static void main(String[] args) {
        //PrintReverseString("Ansh", 3);
        //FindOccurence("anshraythatha", 0, 'a');
    //     int array[]={1,2,3,4,5};
    //    System.out.println(IsSorted(array, 0)); 
    //MoveAllX("abxxcxd ", 0, 0, "");
    //RemoveDupli("abbacde", 0, "");
        CreatSubseq("abc", 0, "");
        // HashSet<String> set =new HashSet<>();
        // CreatSubseqNodup("abc", 0, "",set);
        // String str="23";
        // printComb(str, 0, "");
        // char String ='A';
        // System.out.println(String);


    }
}
