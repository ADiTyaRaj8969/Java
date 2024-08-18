public class BubbleSorting {
    public static void main(String[] args) {
        
        int array[]={7,5,3,2,4};
        //bubble
        for(int i=0;i<5;i++){
            for(int x=0;x<4-i;x++){
                if(array[x]>array[x+1]){
                    int one=array[x];
                    int two=array[x+1];
                    array[x]=two;
                    array[x+1]=one;
                }
            }
        }
        for(int i=0;i<5;i++){
            System.out.print("\t"+array[i]);
        }
        System.out.println();
        //selection
        int array2[]={5,2,4,6,8};
        for(int i=0;i<5;i++){
            int small=i;
            for(int j=i+1;j<5;j++){
                if(array2[small]>array2[j]){
                    small=j;
                }
            }
            int flag=array2 [i];
            array2[i]=array2[small];
            array2[small]=flag;

        }
        for(int i=0;i<5;i++){
            System.out.print("\t"+array2[i]);
        }
        //insertion 
        System.out.println();
        int array3[]={8,7,1,2,3};
        for(int i=0;i<5;i++){
            int sorted=array3[i];
            int j=i-1;
            while (j>=0&&sorted<array3[j]) {
                array3[j+1]=array3[j];
                j--;
                
            }
            array3[j+1]=sorted;
        }
        for(int i=0;i<5;i++){
            System.out.print("\t"+array3[i]);
        }

    }
}
