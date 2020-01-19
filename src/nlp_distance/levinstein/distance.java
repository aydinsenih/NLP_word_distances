/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package nlp_distance.levinstein;

/**
 *
 * @author NOTEBOOK
 */
public class distance {
    public static int buyuk,kucuk;
    
    public static void minMax(int s1,int s2){
        if(s1<s2){
            buyuk=s2;
            kucuk=s1;
        }
        else{
            buyuk=s1;
            kucuk=s2;
        }
    }
    
    public static int hamming(String k1,String k2){
        int dis=0;
        minMax(k1.length(), k2.length());
        for (int i = 0; i < kucuk; i++) {
            if(!(k1.charAt(i)==k2.charAt(i))){
                dis++;
            }
        }
        return dis+buyuk-kucuk;
    }
    public static int editdistance(String k1,String k2){
        int dis=0;
        minMax(k1.length(),k2.length());
        for (int i = 0; i < kucuk; i++) {
            if(!(k1.charAt(i)==k2.charAt(i))){
                dis+=2;
            }
        }
        return dis=dis+buyuk-kucuk;
    }
    
    public static int levinstein(String k1,String k2,int m,int n){
        int matris[][] = new int[m+1][n+1];
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                if(i==0)matris[i][j]=j;
                if(j==0)matris[i][j]=i;
            }
        }
        
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                int a=matris[i-1][j]+1;
                int b=matris[i][j-1]+1;
                int c=matris[i-1][j-1];
                if(!(k1.charAt(i-1)==k2.charAt(j-1))){
                c+=2;
                }
                matris[i][j]=Math.min(a, Math.min(b, c));
            }
            
        }
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                System.out.print(matris[i][j]+"  ");
            }
            System.out.println("");
        }
        return matris[m][n];
    }
}
