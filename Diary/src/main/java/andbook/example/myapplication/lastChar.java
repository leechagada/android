package andbook.example.myapplication;

public class lastChar {
    public static void main(String[] args) {

        String name = " ";

        String name1=KoreanUtil.getCompleteWordByJongSung(name,"을","를");
        String name2=KoreanUtil.getCompleteWordByJongSung(name,"이","가");
        String name3=KoreanUtil.getCompleteWordByJongSung(name,"은","는");

    }
}


class KoreanUtil {
    public static final String getCompleteWordByJongSung(String name, String firstValue, String secondValue) {
        char lastName = name.charAt(name.length()-1);

        //한글의 제일 처음과 끝 범위 밖인 경우는 오류!
        if(lastName < 0xAC00 || lastName > 0xD7A3){
            return name;
        }
        String selectedValue = (lastName - 0xAC00) % 28 > 0 ? firstValue : secondValue;

        return name+selectedValue;
    }
}
