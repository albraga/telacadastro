package ads.telacadastro;

import android.content.Context;
import android.database.Cursor;
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
    private EditText idsIdEditText;
    private DBHelper meudb;

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
        idsIdEditText = (EditText) findViewById(R.id.idsIdEditText);
        meudb = new DBHelper(this);
    }

    public void salvar(View view) {
        meudb.inserir(nomeEditText.getText().toString());
        Context context = getApplicationContext();
        CharSequence text = "Salvo com succecsso!";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
        limpar();
    }

    public void buscar(View view) {
        int id = Integer.parseInt(idsIdEditText.getText().toString());
        Cursor cursor = meudb.getData(id);
        cursor.moveToFirst();
        String nam = cursor.getString(cursor.getColumnIndex(DBHelper.CONTACTS_COLUMN_NAME));
        nomeEditText.setText(nam);
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
