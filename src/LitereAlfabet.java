public class LitereAlfabet {
    public static void main(String[] args) {
        int n='z'-'a';
        char c='a';
        char alf []=new char[n];
        for(int i=0;i<n;i++){
            alf[i]=c++;
        }
        String s=new String(alf);

        System.out.println(alf);
    }
}
