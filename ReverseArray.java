public class ReverseArray{

    static String reverseWord(String str)
    {
        String op = "";
        for(int i = str.length()-1 ; i>=0; i--)
        {
            op += str.charAt(i);
        }
        return op;
    }
    public static void main(String[] args) {
        String str = "abc";
        String output = reverseWord(str);
        System.out.println(output);
    }
}