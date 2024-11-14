package br.com.fabriciocurvello.applistadetarefasfragmentjava.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

import java.util.ArrayList;

import br.com.fabriciocurvello.applistadetarefasfragmentjava.R;
import br.com.fabriciocurvello.applistadetarefasfragmentjava.activity.MainActivity;
import br.com.fabriciocurvello.applistadetarefasfragmentjava.model.Tarefa;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ListaTarefasFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ListaTarefasFragment extends Fragment {

    private Button btAdicionarTarefa;

    public ListaTarefasFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_lista_tarefas,container,false);

        // Botão para adicionar nova tarefa
        btAdicionarTarefa = view.findViewById(R.id.bt_adicionar_tarefa);
        btAdicionarTarefa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Abre o fragmento de cadastro de tarefa
                CadastroTarefaFragment cadastroTarefaFragment = new CadastroTarefaFragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fragment_container, cadastroTarefaFragment)
                        .addToBackStack(null)
                        .commit();
            }
        });


        LinearLayout layoutListaTarefas = view.findViewById(R.id.layout_lista_tarefas);

        // List com todas as tarefas cadastradas
        ArrayList<Tarefa> tarefas = ((MainActivity) getActivity()).getListaTarefas();


        layoutListaTarefas.removeAllViews(); // Esvazia o que estiver no LinearLayout

        // para cada item da lista tarefas, um botão será criado exibindo o nome da tarefa.
        for (Tarefa tarefa : tarefas) {
            Button btTarefa = new Button(getActivity());
            btTarefa.setText(tarefa.getNomeTarefa());
            btTarefa.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    // Se um botão de tarefa for clicado, um DetalhesTarefaFragment é criado e exibido
                    // e o objeto tarefa (que foi clicado) é passado como argumento ao acionar o newInstance()
                    DetalhesTarefaFragment detalhesTarefaFragment = DetalhesTarefaFragment.newInstance(tarefa);
                    getActivity().getSupportFragmentManager().beginTransaction()
                            .replace(R.id.fragment_container, detalhesTarefaFragment)
                            .addToBackStack(null)
                            .commit();
                }
            });
            layoutListaTarefas.addView(btTarefa);
        }

        return view;

//        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_lista_tarefas, container, false);
    }

//    // TOD0: Rename parameter arguments, choose names that match
//    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
//    private static final String ARG_PARAM1 = "param1";
//    private static final String ARG_PARAM2 = "param2";
//
//    // TOD0: Rename and change types of parameters
//    private String mParam1;
//    private String mParam2;


//    /**
//     * Use this factory method to create a new instance of
//     * this fragment using the provided parameters.
//     *
//     * @param param1 Parameter 1.
//     * @param param2 Parameter 2.
//     * @return A new instance of fragment ListaTarefasFragment.
//     */
//    // TOD0: Rename and change types and number of parameters
//    public static ListaTarefasFragment newInstance(String param1, String param2) {
//        ListaTarefasFragment fragment = new ListaTarefasFragment();
//        Bundle args = new Bundle();
//        args.putString(ARG_PARAM1, param1);
//        args.putString(ARG_PARAM2, param2);
//        fragment.setArguments(args);
//        return fragment;
//    }
//
//    @Override
//    public void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        if (getArguments() != null) {
//            mParam1 = getArguments().getString(ARG_PARAM1);
//            mParam2 = getArguments().getString(ARG_PARAM2);
//        }
//    }

}