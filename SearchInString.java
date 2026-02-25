public class SearchInString {
    public static void main(String[] args) {
        String name="raksha";
        char target='k';
        System.out.println(search(name, target));
    }
    static char search(String str,char target)
    {
        if(str.length()==0)
        {
            return -1;
        }
    
    for(int i=0;i<str.length();i++)
    {
        if(target==str.charAt(i))
        {
            return str.charAt(i);
        }
    }
    
}
}