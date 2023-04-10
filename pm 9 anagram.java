import java.util.*;

 // Compiler version JDK 11.0.2

 class Dcoder
 {
   public static void main(String args[])
   { 
    int i,j,flag=0,len,len1,len2;
    String str1,str2;
    Scanner sn=new Scanner(System.in);
    System.out.println("Enter first string :");
    str1=sn.nextLine();
    System.out.println("Enter second string :");
    str2=sn.nextLine();
    len1=str1.length();
    len2=str2.length();
    if(len1==len2)
    {
      len=len1;
      for(i=0;i<len;i++)
      {
        flag=0;
        for(j=0;j<len;j++)
        {
          if(str1.charAt(i)==str2.charAt(j))
            {
              flag=1;
              break;
            }
        }
         if(flag==0)
            break;
      }
      
     if(flag==0)
        System.out.println("Strings are not anagram");
     else 
        System.out.println("String are anagram");
     }
     else
        System.out.println("Length must be equal");
   }
 }

