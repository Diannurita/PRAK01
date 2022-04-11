package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String kalimat = sc.nextLine();
        int pindah = sc.nextInt();
        ubah(kalimat, pindah);
    }
    public static void ubah (String a, int b){
        String kata = "";
        char langkah;
        int i = 0;
        do{
            langkah = a.charAt(i);
            if(langkah>='a'&& langkah<='z'){
                langkah=(char)(langkah+b);
                if(langkah>'z'){
                    langkah = (char)(langkah+'a'-'z'-1);
                }
                kata = kata + langkah;
            }
            else if(langkah>='A'&& langkah<='Z'){
                langkah=(char)(langkah+b);
                if(langkah>'Z'){
                    langkah = (char)(langkah+'A'-'Z'-1);
                }
                kata = kata + langkah;
            }
            else {
                kata = kata + langkah;
            }i++;
        }while(i<a.length());
        System.out.println(kata);
    }
}
