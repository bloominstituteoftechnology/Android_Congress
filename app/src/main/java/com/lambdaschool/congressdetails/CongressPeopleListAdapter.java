package com.lambdaschool.congressdetails;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.lambdaschool.congressdataapiaccess.CongresspersonOverview;

import java.util.ArrayList;

public class CongressPeopleListAdapter extends RecyclerView.Adapter<CongressPeopleListAdapter.ViewHolder> {
    ArrayList<CongresspersonOverview> dataList;

    public CongressPeopleListAdapter(ArrayList<CongresspersonOverview> dataList) {
        this.dataList = dataList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.congress_people_list_item, viewGroup, false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder vh, int i) {
        CongresspersonOverview data = dataList.get(i);
        String displayDOB = "DOB: " + data.getDateOfBirth();
        String displayGender = "Gender: " + data.getGender();
        String displayState = "State: " + data.getState();
        String displayFacebook = "Facebook: " + data.getFacebookAccount();
        String displayTwitter = "Twitter: " + data.getTwitterAccount();
        String displayYoutube = "Youtube: " + data.getYoutubeAccount();
        String displayTitle = data.getFirstName() + " " + data.getLastName();

        vh.textDOB.setText(displayDOB);
        vh.textFacebook.setText(displayFacebook);
        vh.textGender.setText(displayGender);
        vh.textParty.setText(data.getParty());
        vh.textState.setText(displayState);
        vh.textTwitter.setText(displayTwitter);
        vh.textYoutube.setText(displayYoutube);
        vh.textTitle.setText(displayTitle);
    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView textTitle;
        TextView textParty;
        TextView textDOB;
        TextView textGender;
        TextView textState;
        TextView textFacebook;
        TextView textTwitter;
        TextView textYoutube;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textTitle = itemView.findViewById(R.id.text_title);
            textParty = itemView.findViewById(R.id.text_party);
            textDOB = itemView.findViewById(R.id.text_dob);
            textGender = itemView.findViewById(R.id.text_gender);
            textState = itemView.findViewById(R.id.text_state);
            textFacebook = itemView.findViewById(R.id.text_facebook);
            textTwitter = itemView.findViewById(R.id.text_twitter);
            textYoutube = itemView.findViewById(R.id.text_youtube);
        }
    }
}
