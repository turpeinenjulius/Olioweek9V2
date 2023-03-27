package fi.keimoraimo.olioweek9v2.olioweek9;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import fi.keimoraimo.olioweek9v2.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        UserStorage userStorage = UserStorage.getInstance();
    }

    public void switchToUser(View view){
        Intent intent = new Intent(this, UserActivity.class);
        startActivity(intent);
    }
    public void switchToUserStorage(View view){
        Intent intent = new Intent(this, UserStorageActivity.class);
        startActivity(intent);
    }

}