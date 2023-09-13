public class LearnStringBuffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Patan Multiple Campus ");
        StringBuffer sb1 =new StringBuffer();
        System.out.println("Length of StringBuffer:-"+sb.length());
        System.out.println("Capacity of StringBuffer:-"+sb.capacity());
        System.out.println("Appending in String:-"+sb.append("Lalitpur"));
        sb1.insert(0,"Nepal");
        System.out.println("Sb1 after inserition:-"+sb1);
        // System.out.println("Reverse of string:-"+sb.reverse());
        // System.out.println("Deleting from String:-"+sb.delete(2, 5));
        System.out.println("Deleting specific Character:-"+sb.deleteCharAt(6));
        System.out.println("Replacing Characters:-"+sb.replace(5, 8, "pmc"));
    }
    
}
