package andbook.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SentenceCreateActivity extends AppCompatActivity {

    TextView text = findViewById(R.id.DiaryMade);
    TheSentences sentences = new TheSentences();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sentence_create);


        /*Intent intent = getIntent();
        int weatherIndex = intent.getExtras().getInt("weather");
        int emotionIndex = intent.getExtras().getInt("emotion");
        String foodName = intent.getExtras().getString("foodName");
        text.setText(sentences.makeEmotionSentence(*//*emotionIndex*//*) + sentences.makeWeatherSentence(*//*weatherIndex*//*) + sentences.makeFoodSentence(foodName));
        finish();*/

    }
}
