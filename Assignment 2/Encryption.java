package RanasiaC;

import java.util.ArrayList;

public class Encryption {
    ArrayList<Character> symbols = new ArrayList<Character>();
    ArrayList<Character> alphabets = new ArrayList<Character>();

    public Encryption(){
        symbols.add('!');
        symbols.add('@');
        symbols.add('#');
        symbols.add('$');
        symbols.add('^');
        symbols.add('&');
        symbols.add('*');
        symbols.add('(');
        symbols.add(')');
        symbols.add('_');
        symbols.add('-');
        symbols.add('+');
        symbols.add('=');
        symbols.add('?');
        symbols.add(',');
        symbols.add('{');
        symbols.add('}');
        symbols.add('[');
        symbols.add(']');
        symbols.add('/');
        symbols.add('|');
        symbols.add(';');
        symbols.add(':');
        symbols.add('.');
        symbols.add('<');
        symbols.add('>');
        for(char letter='a';letter<='z';letter++)
        {
            alphabets.add(letter);
        }
    }

    char return_alphabet(int alphabetNum){
        return alphabets.get(alphabetNum);
    }

    int return_alphabet_index(char alphabet){
        int i;
        for (i=0;i<alphabets.size();i++) {
            if (alphabets.get(i) == alphabet) {
                break;
            }
        }
        return i;
    }

    char return_symbol(int symbolNum){
        return symbols.get(symbolNum);
    }

    int return_symbol_index(char symbol){
        int j;
        for (j=0;j<symbols.size();j++) {
            if (symbols.get(j) ==symbol) {
                break;
            }
        }
        return j;
    }

    String encrypt_message(String userTextNeedEncrypt){
        String returning = " ";
        userTextNeedEncrypt=userTextNeedEncrypt.toLowerCase();
        char [] userTextToArray = userTextNeedEncrypt.toCharArray();
        boolean testing=false;
        for (char character: userTextToArray) {
            for (char character2 : alphabets) {
                if (character == character2) {
                    testing=true;
                    break;
                }
            }
            if(!testing){
                returning="Error: Invalid Character";
                break;
            }
        }
        if(testing){
        for (int i=0;i<userTextToArray.length;i++) {
            int userArrayIndexInAlphabet=return_alphabet_index(userTextToArray[i]);
            char userArraySymbolChanging=return_symbol(userArrayIndexInAlphabet);
            userTextToArray[i]=userArraySymbolChanging;
            returning+=userTextToArray[i];
        }
        }
        return "Encrypted Msg: "+returning;
    }

    String decrypt_message(String userTextNeedDecrypt){
        String returning=" ";
        char [] userSymbolsToArray=userTextNeedDecrypt.toCharArray();
        boolean testing=false;
        for (char symbol: userSymbolsToArray) {
            for (char symbol2 : symbols) {
                if (symbol == symbol2) {
                    testing=true;
                    break;
                }
            }
            if(!testing){
                returning="Error: Invalid Symbol";
                break;
            }
        }
        if(testing){
            for(int j=0;j< userSymbolsToArray.length;j++){
                int userArrayIndexInSymbol=return_symbol_index(userSymbolsToArray[j]);
                char  userArrayAlphabetChanging=return_alphabet(userArrayIndexInSymbol);
                userSymbolsToArray[j]=userArrayAlphabetChanging;
                returning+=userSymbolsToArray[j];
            }
        }
        return "Decrypted Msg: "+returning;
    }
}
