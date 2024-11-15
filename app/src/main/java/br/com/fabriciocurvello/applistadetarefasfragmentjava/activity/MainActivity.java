package br.com.fabriciocurvello.applistadetarefasfragmentjava.activity;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

import br.com.fabriciocurvello.applistadetarefasfragmentjava.fragment.ListaTarefasFragment;
import br.com.fabriciocurvello.applistadetarefasfragmentjava.R;
import br.com.fabriciocurvello.applistadetarefasfragmentjava.model.Tarefa;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Tarefa> listaTarefas = new ArrayList<>();

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

        // Adiciona uma tarefa de teste
        listaTarefas.add(new Tarefa("Estudar Mobile", "14/11/2024", "Aula Remota Anima", "Estudar Mobile Android Nativo com Java"));


        // Carregar o fragmento de lista de tarefas inicialmente
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new ListaTarefasFragment()).commit();
        }
    } // fim do onCreate()



    public ArrayList<Tarefa> getListaTarefas() {
        return listaTarefas;
    }

    public void adicionarTarefa(Tarefa tarefa) {
        listaTarefas.add(tarefa);
    }
}