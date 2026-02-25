public class linearscoop {
//     public static void main(String[] args) {
//         int[] nums={23,45,1,2,8,199,-3,16,11,28};//[return boolean expression]
//         int target =19;
//         boolean ans=linearsearch(nums,target);
//         System.out.println(ans);
        
//     }
//     static boolean linearsearch(int[] arr,int target)
//     {
//         if(arr.length==0)
//         {
//             return false;
//         }
    
//     for(int element : arr)
//     {
        
//         if(element==target)
//         {
//             return true;
//         }
//     }
//     return false;
// }
// }

// public static void main(String[] args)//[returning array index]
// {
//     int[] nums={12,34,56,-1,23,98,34,56};
//     int target=23
//     ;
//     System.out.println(linearSearch(nums,target));
// }

// static int linearSearch(int[] arr,int target)
// {
//     if(arr.length==0)
//     {
//         return -1;
//     }
//     for(int i=0;i<arr.length;i++)
//     {
//         if(arr[i]==target)
//         {
//             return i;
//         }
//     }
//     return -1;
// }
// }

public static void main(String[] args) {
    int[] nums={12,23,4,5,67,89,36,-45};
    int target=34;
    System.out.println(linearSearch(nums,target));
    
}
static int  linearSearch(int[] arr,int target)
{
    if(arr.length==0)
    {
        return -1;
    }

for(int i=0;i<arr.length;i++)
{
    if(arr[i]==target)
    {
        return i;
    }


}
return -1;
}}