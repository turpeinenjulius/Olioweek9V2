package fi.keimoraimo.olioweek9v2.olioweek9;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import fi.keimoraimo.olioweek9v2.R;

public class UserStorageActivity extends AppCompatActivity {

    private UserStorage us;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_storage);

        us = UserStorage.getInstance();

        recyclerView = findViewById(R.id.rvUserList);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new UserListAdapter(getApplicationContext(), us.getUsers()));

    }

}
