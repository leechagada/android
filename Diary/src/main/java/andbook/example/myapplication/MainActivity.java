package andbook.example.myapplication;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView editFoodText, textMade;
    Button DiaryMakingButton;
    LinearLayout linearl;
    String foodName;//전역변수로 사용
  /*  Button emoBtn1 = findViewById(R.id.emotion1);
    Button emoBtn2 = findViewById(R.id.emotion2);
    Button emoBtn3 = findViewById(R.id.emotion3);
    Button emoBtn4 = findViewById(R.id.emotion4);
    Button emoBtn5 = findViewById(R.id.emotion5);
    Button emoBtn6 = findViewById(R.id.emotion6);
    Button emoBtn7 = findViewById(R.id.emotion7);
    Button emoBtn8 = findViewById(R.id.emotion8);
    Button emoBtn9 = findViewById(R.id.emotion9);
    Button emoBtn10 = findViewById(R.id.emotion10);

    Button weaBtn1 = findViewById(R.id.wSunny);
    Button weaBtn2 = findViewById(R.id.wLilCloudy);
    Button weaBtn3 = findViewById(R.id.wCloudy);
    Button weaBtn4 = findViewById(R.id.wRainy);
    Button weaBtn5 = findViewById(R.id.wSnowy);*/


    private Button[] btn = new Button[10];
    //private Button btn_unfocus;
    private int weatherBtnindex;
    private int emotionBtnindex;
    //private int[] emoBtn_id = {R.id.emotion1, R.id.emotion2, R.id.emotion3, R.id.emotion4, R.id.emotion5, R.id.emotion6, R.id.emotion7, R.id.emotion8, R.id.emotion9, R.id.emotion10};
    TheSentences sentences;
//    private boolean emoBtn0Pressed, emoBtn1Pressed, emoBtn2Pressed, emoBtn3Pressed, emoBtn4Pressed, emoBtn5Pressed, emoBtn6Pressed, emoBtn7Pressed, emoBtn8Pressed, emoBtn9Pressed;
//    private boolean weaBtn0Pressed, weaBtn1Pressed, weaBtn2Pressed, weaBtn3Pressed, weaBtn4Pressed;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editFoodText = (TextView) findViewById(R.id.editFoodText);
        DiaryMakingButton = (Button) findViewById(R.id.DiaryMakingButton);
        linearl = (LinearLayout) findViewById(R.id.linearl);
        textMade = (TextView) findViewById(R.id.textMade);

    }

//    public boolean onTouchEvent(View v, MotionEvent event) {
//        switch (event.getAction()){
//            case MotionEvent.ACTION_DOWN:
//                if (!emoBtn1Pressed && !emoBtn2Pressed && !emoBtn3Pressed && !emoBtn4Pressed && !emoBtn5Pressed && !emoBtn6Pressed && !emoBtn7Pressed && !emoBtn8Pressed && !emoBtn9Pressed) {
//
//                }
//        }
//        return super.onTouchEvent(event);
//    }

/*
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.emotion1:
                setFocus(btn_unfocus, btn[0]);
                emotionBtnindex = 0;
                break;

            case R.id.emotion2:
                setFocus(btn_unfocus, btn[1]);
                emotionBtnindex = 1;
                break;

            case R.id.emotion3:
                setFocus(btn_unfocus, btn[2]);
                emotionBtnindex = 2;
                break;

            case R.id.emotion4:
                setFocus(btn_unfocus, btn[3]);
                emotionBtnindex = 3;
                break;

            case R.id.emotion5:
                setFocus(btn_unfocus, btn[4]);
                emotionBtnindex = 4;
                break;

            case R.id.emotion6:
                setFocus(btn_unfocus, btn[5]);
                emotionBtnindex = 5;
                break;

            case R.id.emotion7:
                setFocus(btn_unfocus, btn[6]);
                emotionBtnindex = 6;
                break;

            case R.id.emotion8:
                setFocus(btn_unfocus, btn[7]);
                emotionBtnindex = 7;
                break;
            case R.id.emotion9:
                setFocus(btn_unfocus, btn[8]);
                emotionBtnindex = 8;
                break;
            case R.id.emotion10:
                setFocus(btn_unfocus, btn[9]);
                emotionBtnindex = 9;
                break;
        }
    }
*/

    public void mOnClick(View v) {
//        sentences = new TheSentences();
        foodName = editFoodText.getEditableText().toString();//음식 이름을 editText에서 가져온 string 값으로 설정
        /*foodWJS = KoreanUtil.getCompleteWordByJongSung(foodName, "을", "를");
        textMade.setText(foodWJS + " 먹었다." + );*/
       textMade.setText(TheSentences.makeEmotionSentence()+TheSentences.makeWeatherSentence()+TheSentences.makeFoodSentence(foodName));
        //textMade.setText(sentences.makeEmotionSentence() + sentences.makeWeatherSentence() + sentences.makeFoodSentence(foodName));

/*        //일기 생성 액티비티 호출(선택된 값들을 넘겨서 sentenceCreateActivity에서 인텐트 완성하기)
        Intent intent = new Intent(this, SentenceCreateActivity.class);
        //다른 액티비티로 넘길 값 입력.
        intent.putExtra("weather", weatherBtnindex);
        intent.putExtra("emotion", emotionBtnindex);
        intent.putExtra("foodName", foodName);
        startActivity(intent);*/

    }
    //버튼 선택 포커스 처리할 부분.
/*    private void setFocus(Button btn_unfocus, Button btn_focus) {
        btn_unfocus.setTextColor(Color.rgb(49, 50, 51));
        btn_unfocus.setBackgroundColor(Color.rgb(207, 207, 207));
        btn_focus.setTextColor(Color.rgb(255, 255, 255));
        btn_focus.setBackgroundColor(Color.rgb(3, 106, 150));
        this.btn_unfocus = btn_focus;
    }*/


}
