package com.prank_celebrats.praank_celebraty_call;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class Character_adapter extends ArrayAdapter<MainActivity.Character> {

    public Character_adapter(Context context, MainActivity.Character[] characters) {
        super(context, 0, characters);
    }

    @Override
    public MainActivity.Character getItem(int position) {
        return super.getItem(position);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        MainActivity.Character character = getItem(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item_character, parent, false);
        }

        ImageView characterImage = convertView.findViewById(R.id.characterImage);
        TextView characterName = convertView.findViewById(R.id.characterName);

        characterImage.setImageResource(character.imageResource);
        characterName.setText(character.name);

        return convertView;
    }
}
