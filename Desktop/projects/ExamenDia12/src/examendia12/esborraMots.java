
package examendia12;


public class esborraMots {
    public static String subText(String text, String subText){
        
        int cops = 0;
        boolean trobat = false;
        int desp = 1;
        char[] frase = new char[text.length()];
        char[] mot = new char[subText.length()];
        
        String senseText = "";
        
        for( int k = 0; k < text.length(); k++) {
            frase[k] = text.charAt(k);
            }
        
        for( int k = 0; k < subText.length(); k++) {
            frase[k] = subText.charAt(k);
            }
        
        for( int k = 0; k < frase.length; k = k + desp) {
            
            trobat = true;
            
            for( int r = 0; r < mot.length; r++) {
                
                if( mot[r] != frase[k+r]) {
                    
                    trobat = false;
                    
                    break;
                }
            }
        }
        
        if( trobat){
            desp = mot.length;
        }else{
            desp = 1;
        }
        return senseText;
    }
    
    public static void main(String[] args) {
        
    }  
}
