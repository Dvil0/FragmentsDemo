package dv.android.com.fragmentsdemo.fragmentDinamico;

import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import dv.android.com.fragmentsdemo.R;

public class FragmentDynamicActivity extends AppCompatActivity implements
        BlueFragment.OnFragmentInteractionListener,
        RedFragment.OnFragmentInteractionListener,
        GreenFragment.OnFragmentInteractionListener{

    private BlueFragment blueFragment;
    private RedFragment redFragment;
    private GreenFragment greenFragment;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dinamico);

        blueFragment = new BlueFragment();
        redFragment = new RedFragment();
        greenFragment = new GreenFragment();

        getSupportFragmentManager().beginTransaction()
        .add(R.id.contenedorFragments, redFragment).commit();
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }

    public void onClick(View view){
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        switch (view.getId()){
            case R.id.btnAzul:
                transaction.replace(R.id.contenedorFragments, blueFragment);
                break;
            case R.id.btnRojo:
                transaction.replace(R.id.contenedorFragments, redFragment);
                break;
            case R.id.btnVerde:
                transaction.replace(R.id.contenedorFragments, greenFragment);
                break;
        }
        transaction.commit();
    }
}
