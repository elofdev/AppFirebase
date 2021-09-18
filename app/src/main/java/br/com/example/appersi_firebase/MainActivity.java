package br.com.example.appersi_firebase;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {


    EditText id_txt;
    EditText nome_txt;
    EditText bloco_txt;
    EditText ap_txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //colocar os campos do formulário

        id_txt = findViewById(R.id.id_txt);
        nome_txt = findViewById(R.id.nome_txt);
        bloco_txt = findViewById(R.id.bloco_txt);
        ap_txt = findViewById(R.id.ap_txt);

        /*// Write a message to the database
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("mensagem"); //Nome do campo
        myRef.setValue("UniCuritiba2!"); // valores do campo

        // cadastrar um objeto no firebase

        //cria novo pridugto com seus atributos
        DatabaseReference myRefDados = database.getReference();
        Clientes clientes1 = new Clientes("1","João", 17);
        myRefDados.child("cliente").setValue(clientes1);


        //criando ramificações(nós no firebase )
        //myRef = database.getReference();
        //myRef.child("Valores").child("id").setValue("1");

        // ler os valores do banco de dados firebase

        // Read from the database
        //EventListener fica monitorando o banco de dados
        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                // This method is called once with the initial value and again
                // whenever data at this location is updated.
                String value = dataSnapshot.getValue(String.class);
                System.out.println(">>>>>> valor:" + value);

            }

            @Override
            public void onCancelled(DatabaseError error) {
                // Failed to read value
                System.out.println("falha na leitura:");
            }
        });



    }*/


    }

    //método Onclick
    public void cadastrarMoradores(View v) {
        try {
            FirebaseDatabase database = FirebaseDatabase.getInstance();
            DatabaseReference inserir_morador = database.getReference();

            System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<: " + id_txt + nome_txt + bloco_txt + ap_txt);


            Moradores morador = new Moradores(
                    id_txt.getText().toString(),
                    nome_txt.getText().toString(),
                    bloco_txt.getText().toString(),
                    ap_txt.getText().toString());

            inserir_morador.child("Moradores").child(morador.getId_txt()).setValue(morador);

            System.out.println(">>>>>> id:   " + id_txt);
//            inserir_morador.child("Moradores").child(morador.getNome()).setValue(morador);
  //          inserir_morador.child("Moradores").child(morador.getBloco()).setValue(morador);
    //        inserir_morador.child("Moradores").child(morador.getAp()).setValue(morador);

            //Msagem se confirmação cadastro
            Toast.makeText(this, "Morador Cadastrado!", Toast.LENGTH_SHORT).show();
            // limpa os campos para novo cadastro
            id_txt.setText("");
            nome_txt.setText("");
            bloco_txt.setText("");
            ap_txt.setText("");

        } catch (Exception e) {
            e.printStackTrace();
            //Msagem se falha cadastro
            Toast.makeText(this, "FALHA NO CADASTRO!", Toast.LENGTH_SHORT).show();
        }
    }
}

