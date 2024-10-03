package com.example.app_busmap;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class login extends AppCompatActivity {

    private TextView text_tela_cadastro;
    private Button bt_entrar; // Adicionando a variável para o botão

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        // Inicializando os componentes
        IniciarComponents();

        // Configurando o click listener para o text_tela_cadastro
        text_tela_cadastro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(login.this, cadastro.class);
                startActivity(intent);
            }
        });

        // Configurando o click listener para o botão bt_entrar
        bt_entrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                abrindo_home(view); // Chamando o método para abrir a Home Activity
            }
        });
    }

    private void IniciarComponents(){
        text_tela_cadastro = findViewById(R.id.text_tela_cadastro);
        bt_entrar = findViewById(R.id.bt_entrar); // Inicializando o botão
    }

    public void abrindo_home(View view) {
        // Lógica para abrir a Home Activity
        Intent intent = new Intent(this, home.class);
        startActivity(intent);
    }

    public void abrindo_esqueci(View view) {
        // Lógica para abrir a Home Activity
        Intent intent = new Intent(this, esquecisenha.class);
        startActivity(intent);
    }
}
