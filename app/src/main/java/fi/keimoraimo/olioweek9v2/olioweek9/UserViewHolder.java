package fi.keimoraimo.olioweek9v2.olioweek9;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import fi.keimoraimo.olioweek9v2.R;

public class UserViewHolder extends RecyclerView.ViewHolder {
    TextView fullName, email, degreeProgram;

    public UserViewHolder(@NonNull View itemView){
        super(itemView);
        fullName = itemView.findViewById(R.id.userViewFullName);
        email = itemView.findViewById(R.id.userViewEmail);
        degreeProgram = itemView.findViewById(R.id.userViewDegreeProgram);
    }

}
