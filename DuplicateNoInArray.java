public class DuplicateNoInArray{
    public static void main(String[]args){
        String arr[]={"java","c","java","c++","phyton","c"};
        
        boolean flag=false;//flag is variable
        for(int i=0;i<=arr.length;i++){//for first variable which have to compared with other variable
            for(int j=i+1;j<arr.length;j++){//other variable to compared
                if(arr[i]==arr[j]){
                    System.out.println("found duplicate element  "+arr[i]);
                    flag = true; 
                }
                
            }
        }
        if(flag==false)
        {
            System.out.println("duplicate element not found");
        }

    }

}

 
    

