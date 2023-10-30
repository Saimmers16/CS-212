public class RomanNumeral {
    private String RomanN;

    public RomanNumeral(String RN){
        RomanN = RN;
    }

    public String getRomanNumeral(){
        return RomanN;
    }

    public void setRomanNumeral(String RN){
        RomanN = RN;
    }

    public int getArabicNumeral(){
        int AN = 0;
        char[] letterArray = RomanN.toCharArray(); 
        for(int i = 0; i < letterArray.length; i++){
            if(letterArray[i]== 'I'){
                AN++;
            } 
            if(letterArray[i]=='V'){
                AN = AN + 5;
                if( i > 0 && letterArray[i-1]== 'I'){
                    AN = AN - 2;
                }
            }
            if(letterArray[i]=='X'){
                AN = AN + 10;
                if( i > 0 && letterArray[i-1]== 'I'){
                    AN = AN - 2;
                }
            }
            if(letterArray[i]=='L'){
                AN = AN + 50;
                if( i > 0 && letterArray[i - 1] == 'X'){
                    AN = AN - 20;
                }
            }
            if(letterArray[i]=='C'){
                AN = AN + 100;
                if( i > 0 && letterArray[i-1]== 'X'){
                    AN = AN - 20;
                }
            }
            if(letterArray[i]=='D'){
                AN = AN + 500;
                if( i > 0 && letterArray[i-1]== 'C'){
                    AN = AN - 200;
                }
            }
            if (letterArray[i]=='M'){
                AN = AN + 1000;
                if( i > 0 && letterArray[i-1]== 'C'){
                    AN = AN - 200;
                }
            }
        }
        return AN;
    }

    public boolean equals(String RN){
        if(getRomanNumeral() == RN){
        return true;
        }
        else {
            return false;
        }
    }

    public int compareTo(RomanNumeral RN){
        if(getArabicNumeral() == RN.getArabicNumeral()){
            return 0;
        }
        else
            return getArabicNumeral() - RN.getArabicNumeral();
    }
    
    @Override
    public String toString(){
        return getRomanNumeral();
    }

    
}

