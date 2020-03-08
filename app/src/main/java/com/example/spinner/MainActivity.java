package com.example.spinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;

import static android.widget.Toast.LENGTH_LONG;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner spinner=findViewById(R.id.spinner1);
        ArrayAdapter<CharSequence> adapter= ArrayAdapter.createFromResource(this, R.array.numbers, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);


    }




    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String text= parent.getItemAtPosition(position).toString();
        Toast.makeText(parent.getContext(),text, Toast.LENGTH_SHORT).show();
        double[] values={0.595266279,
                0.422787964,
                0.37052249,
                0.517443119,
                0.487297092,
                0.367765624,
                0.413776868,
                0.294720751,
                0.313323304,
                0.408076192,
                0.376108052,
                0.457694916,
                0.542856795,
                0.380922887,
                0.341580254,
                0.360913968,
                0.474098476,
                0.573781702,
                0.492636989,
                0.459961835,
                0.370750224,
                0.470928576,
                0.380520405,
                0.395034552,
                0.344119624,
                0.572455643,
                0.580995695,
                0.517469011,
                0.482688638,
                0.295850875,
                0.579679015,
                0.650809897,
                0.344563804,
                0.388597692,
                0.38826635,
                0.479212739,
                0.518306979,
                0.588175118,
                0.389337667,
                0.514397492,
                0.38720318,
                0.428395377,
                0.359748806,
                0.309574293,
                0.343884026,
                0.499673316,
                0.402800564,
                0.431543643,
                0.446357424,
                0.426281848,
                0.448212171,
                0.479497916,
                0.595884936,
                0.375545539,
                0.565721486,
                0.452490876,
                0.307714105,
                0.296253387,
                0.439743332,
                0.538610833,
                0.409665732,
                0.292013239,
                0.46838701,
                0.346123115,
                0.391041978,
                0.457399021,
                0.54324196,
                0.625645835,
                0.479821409,
                0.556109873,
                0.461677186,
                0.365010344,
                0.312354832,
                0.502345763,
                0.445285279,
                0.387024804,
                0.4359084,
                0.344952415,
                0.336136651,
                0.319973741,
                0.433067083,
                0.371541731,
                0.376908072,
                0.335898028,
                0.545857342,
                0.375432169,
                0.433910927,
                0.390684152,
                0.536551146,
                0.392850048,
                0.40789546,
                0.508848403,
                0.616751775,
                0.381915945,
                0.387905308,
                0.285452572,
                0.366026409,
                0.584138074,
                0.549780137,
                0.37740958,
                0.55969604,
                0.609321229,
                0.356006966,
                0.56734861,
                0.437823601,
                0.381857423,
                0.637534877,
                0.417353786,
                0.406527776,
                0.388119799,
                0.378055677,
                0.540818133,
                0.542107306,
                0.490828617,
                0.515563782,
                0.35141926,
                0.331357325,
                0.452991695,
                0.670315892,
                0.489134956,
                0.277731984,
                0.416074773,
                0.507073982,
                0.406366676,
                0.573111198,
                0.384742649,
                0.426492503,
                0.458675874,
                0.323555655,
                0.347449554,
                0.374887967,
                0.411465913,
                0.334638712,
                0.554624365,
                0.418194455,
                0.391240949,
                0.378149291,
                0.482758247,
                0.477817092,
                0.388308473,
                0.535324485,
                0.409479964,
                0.471773393,
                0.557202255,
                0.415254971,
                0.364406868,
                0.33933371,
                0.658078109,
                0.677505966,
                0.398329339,
                0.307705757,
                0.470445463,
                0.622806633,
                0.404186885,
                0.546407412,
                0.301165076,
                0.273541874,
                0.439831356,
                0.438093254,
                0.550542829,
                0.408654573,
                0.557770449,
                0.539234023,
                0.573114514,
                0.404695858,
                0.394034014,
                0.338112499,
                0.425093859,
                0.580261529,
                0.366893924,
                0.378405035,
                0.298680816,
                0.338694215,
                0.382811397,
                0.3884987,
                0.568615674,
                0.34711368,
                0.476697243,
                0.554577335,
                0.542427386,
                0.543401148
        };
        Toast.makeText(this, String.valueOf(values[position]), LENGTH_LONG).show();
        CharSequence message1 = "country volatile to climate change";
        CharSequence message2="be cautious but go ahead";
        CharSequence message3="You're okay migrating here, for now...";
        if(values[position]>=.509){
            Toast.makeText(this,message1, LENGTH_LONG).show();
        }
        else if(values[position]<.509 && values[position]>.40948){
            Toast.makeText(this,message2, LENGTH_LONG).show();
        }
        else{
            Toast.makeText(this,message3, LENGTH_LONG).show();
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
