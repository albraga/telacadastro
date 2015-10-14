package ads.telacadastro;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText nomeEditText;
    private EditText empresaEditText;
    private EditText cargoEditText;
    private EditText emailEditText;
    private EditText telcomercialEditText;
    private EditText celularEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout);
        nomeEditText = (EditText) findViewById(R.id.nomeEditText);
        empresaEditText = (EditText) findViewById(R.id.empresaEditText);
        cargoEditText = (EditText) findViewById(R.id.cargoEditText);
        emailEditText = (EditText) findViewById(R.id.emailEditText);
        telcomercialEditText = (EditText) findViewById(R.id.telcomercialEditText);
        celularEditText = (EditText) findViewById(R.id.celularEditText);
    }

    public void salvar(View view) {
        Context context = getApplicationContext();
        CharSequence text = "Hello toast!";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
        limpar();
    }

    private void limpar() {
        nomeEditText.setText("");
        empresaEditText.setText("");
        cargoEditText.setText("");
        emailEditText.setText("");
        telcomercialEditText.setText("");
        celularEditText.setText("");
    }
}
