package practicum;

public class Main{
    public static void main(String[] args) {
        String a="abcb";
        char remove = 'b';
        char temp[]=new char[a.length()];
        for(int i=0;i<a.length();i++) {
            if(a.charAt(i)==remove) {
                continue;
            } else {
                temp[i]=a.charAt(i);
            }
        }
        a=new String(temp);

        System.out.println("After remove a character from string " + a);
}
}