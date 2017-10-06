package com.example.admin.fragmentsrecycler;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements AddFragment.OnFragmentInteractionListener, ListFragment.OnFragmentInteractionListener2{

    List<Car> carList = new ArrayList<>();
    public static final String ADD_FRAG_TAG = "addFragmentTag";
    public static final String LIST_FRAG_TAG = "listFragmentTag";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AddFragment addFragment = AddFragment.newInstance("first", "second");
        getSupportFragmentManager().beginTransaction().add(R.id.flAdd, addFragment, ADD_FRAG_TAG).addToBackStack(ADD_FRAG_TAG).commit();

        ListFragment listFragment = ListFragment.newInstance("first", "second");
        getSupportFragmentManager().beginTransaction().add(R.id.flList, listFragment, LIST_FRAG_TAG).addToBackStack(LIST_FRAG_TAG).commit();


    }

    @Override
    public void onFragmentInteraction(String s1, String s2, String s3) {

        carList.add(new Car(s1, s2, s3));
        //Toast.makeText(this, s1 + " " + " " + s2 + " " + s3 + " Added to list", Toast.LENGTH_SHORT).show();

        ListFragment listFragment = (ListFragment) getSupportFragmentManager().findFragmentByTag(LIST_FRAG_TAG);

        listFragment.updateList(carList);

        getSupportFragmentManager().beginTransaction().remove(listFragment).commit();
        getSupportFragmentManager().beginTransaction().add(R.id.flList, listFragment, LIST_FRAG_TAG).addToBackStack(LIST_FRAG_TAG).commit();
    }

    @Override
    public void onFragmentInteraction2(String s) {

    }
}
