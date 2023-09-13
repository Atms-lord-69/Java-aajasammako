class LearnStringHandling{
    public static void main(String[] args) {
        String str1 ="Patan Multiple Campus";
        String Str2 = new String("PatanDhoka,Lalitpur");
         System.out.println(str1);
         System.out.println(Str2);
         System.out.println("Length of str1:-"+str1.length());
         System.out.println("Comparison:-"+str1.equals(Str2));
         System.out.println("Concatenation:-"+str1+Str2);
         System.out.println("Checking Empty:-"+str1.isEmpty());
        // System.out.println("Triming String:-"+str1.trim());
         System.out.println("To Uppercase:-"+str1.toUpperCase());
         System.out.println("To Lowercase:-"+str1.toLowerCase());
        // System.out.println("Charater at Index 4:-"+str1.charAt(4));
        // System.out.println("Index of Char t:-"+str1.indexOf('P'));
        // System.out.println("Index of last Char t:-"+str1.lastIndexOf('t'));
        // char temp[]=new char[10];
        // str1.getChars(2, 7, temp, 0);
        // System.out.println("new string =" +new String(temp.toString()));
        
    }
}