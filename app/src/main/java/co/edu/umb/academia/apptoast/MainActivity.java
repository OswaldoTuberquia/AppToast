package co.edu.umb.academia.apptoast;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText txtName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtName = (EditText)findViewById(R.id.inputTextData);
    }

    public void opAccept(View view){
        Context context = getApplicationContext();
        CharSequence text = "";
        int duration = Toast.LENGTH_SHORT;
        if(!txtName.getText().toString().trim().isEmpty()){
            text = "Hola, " + txtName.getText().toString().trim()+"!";
        }else{
            text = "Por favor ingresa tu nombre!";
        }
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }


}