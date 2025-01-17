package devandroid.rosaneto.applistacurso.view;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import devandroid.rosaneto.applistacurso.R;
import devandroid.rosaneto.applistacurso.model.Pessoa;

public class MainActivity extends AppCompatActivity {
    Pessoa pessoa;
    Pessoa outraPessoa;
    String dadosPessoa;
    String dadosOutraPessoa;

    EditText editPrimeiroNome;
    EditText editSobrenome;
    EditText editCursoDesejado;
    EditText editTelefoneContato;
    Button btnLimpar;
    Button btnSalvar;
    Button btnFinalizar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        pessoa = new Pessoa();
        pessoa.setPrimeiroNome("Alceu");
        pessoa.setSobreNome("Rosa");
        pessoa.setCursoDesejado("Android");
        pessoa.setTelefoneContato("19 996087124");

        outraPessoa = new Pessoa();
        outraPessoa.setPrimeiroNome("ze");
        outraPessoa.setSobreNome("felipe");
        outraPessoa.setCursoDesejado("java");
        outraPessoa.setTelefoneContato("11 11111111111");

        editPrimeiroNome = findViewById(R.id.editPrimeiroNome);
        editSobrenome = findViewById(R.id.editSobrenome);
        editCursoDesejado = findViewById(R.id.editCursoDesejado);
        editTelefoneContato = findViewById(R.id.editTelefoneContato);
        btnLimpar = findViewById(R.id.btnLimpar);
        btnSalvar = findViewById(R.id.btnSalvar);
        btnFinalizar = findViewById(R.id.btnFinalizar);


        editPrimeiroNome.setText(pessoa.getPrimeiroNome());
        editSobrenome.setText(pessoa.getSobreNome());
        editCursoDesejado.setText(pessoa.getCursoDesejado());
        editTelefoneContato.setText(pessoa.getTelefoneContato());



        /*
        dadosPessoa = "Primeiro nome: ";
        dadosPessoa += pessoa.getPrimeiroNome();
        dadosPessoa += "Sobrenome: ";
        dadosPessoa += pessoa.getSobreNome();
        dadosPessoa += "Curso Desejado: ";
        dadosPessoa += pessoa.getCursoDesejado();
        dadosPessoa += "Telefone de Contato: ";
        dadosPessoa += pessoa.getTelefoneContato();

        dadosOutraPessoa = "Primeiro nome: ";
        dadosOutraPessoa += pessoa.getPrimeiroNome();
        dadosOutraPessoa += "Sobrenome: ";
        dadosOutraPessoa += pessoa.getSobreNome();
        dadosOutraPessoa += "Curso Desejado: ";
        dadosOutraPessoa += pessoa.getCursoDesejado();
        dadosOutraPessoa += "Telefone de Contato: ";
        dadosOutraPessoa += pessoa.getTelefoneContato();
        */

        Log.i("POOAndroid", pessoa.toString());
        Log.i("POOAndroid", outraPessoa.toString());


    }
}