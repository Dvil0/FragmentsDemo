package dv.android.com.fragmentsdemo.fragmentEstatico;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import dv.android.com.fragmentsdemo.R;


public class FragmentStaticActivity extends AppCompatActivity
    implements fragmentRojo.OnFragmentInteractionListener, fragmentVerde.OnFragmentInteractionListener{

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
