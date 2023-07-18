package sg.edu.rp.c346.id22022416.myndpsongs;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lv;
    ArrayList<SecondActivity> songs;
    CustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = findViewById(R.id.lv);
        songs = new ArrayList<>();

        SecondActivity song1 = new SecondActivity("Home", "1998","   * * * * *","Kit Chan");
        SecondActivity song2 = new SecondActivity("Our Singapore","2015","   * * * * *", "JJ Lin/Dick Lee");
        SecondActivity song3 = new SecondActivity("We Will Get There","2002","   * * * * *","Stefanie Sun");

        songs.add(song1);
        songs.add(song2);
        songs.add(song3);

        adapter = new CustomAdapter(this, R.layout.row, songs);
        lv.setAdapter(adapter);
    }
}