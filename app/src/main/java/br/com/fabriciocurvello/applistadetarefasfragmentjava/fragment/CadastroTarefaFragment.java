package br.com.fabriciocurvello.applistadetarefasfragmentjava.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import br.com.fabriciocurvello.applistadetarefasfragmentjava.R;
import br.com.fabriciocurvello.applistadetarefasfragmentjava.activity.MainActivity;
import br.com.fabriciocurvello.applistadetarefasfragmentjava.model.Tarefa;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link CadastroTarefaFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class CadastroTarefaFragment extends Fragment {

    private EditText etNomeTarefa;
    private EditText etDataTarefa;
    private EditText etLocalTarefa;
    private EditText etDescricaoTarefa;
    Button btCadastrarTarefa;
    Button btVoltarSemCadastrar;

    public CadastroTarefaFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_cadastro_tarefa, container, false);

        etNomeTarefa = view.findViewById(R.id.et_nome_tarefa);
        etDataTarefa = view.findViewById(R.id.et_data_tarefa);
        etLocalTarefa = view.findViewById(R.id.et_local_tarefa);
        etDescricaoTarefa = view.findViewById(R.id.et_descricao_tarefa);
        btCadastrarTarefa = view.findViewById(R.id.bt_cadastrar_tarefa);
        btVoltarSemCadastrar = view.findViewById(R.id.bt_voltar_sem_cadastrar);

        btCadastrarTarefa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nome = etNomeTarefa.getText().toString();
                String data = etDataTarefa.getText().toString();
                String local = etLocalTarefa.getText().toString();
                String descricao = etDescricaoTarefa.getText().toString();

                if (!nome.isEmpty()) {
                    Tarefa tarefa = new Tarefa(nome, data, local, descricao);
                    ((MainActivity) getActivity()).adicionarTarefa(tarefa);

                    // Volta para o fragmento anterior sem cadastrar a tarefa
                    getActivity().getSupportFragmentManager().popBackStack();
                }
            }
        });

        btVoltarSemCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Volta para o fragmento anterior sem cadastrar a tarefa
                getActivity().getSupportFragmentManager().popBackStack();
            }
        });

        return view;

        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_cadastro_tarefa, container, false);
    }


    /*
    Explicação do Código Gerado ao criar o Fragment (Blank)
        1 - Parâmetros e Método newInstance:
            - ARG_PARAM1 e ARG_PARAM2: Esses são parâmetros criados para permitir que o Fragment receba argumentos na sua criação. Eles são úteis quando queremos passar dados ao Fragment, mas não são necessários para o seu exemplo.
            - newInstance: Este é um método de fábrica que facilita a criação de uma nova instância do Fragment com argumentos. Como não precisamos de argumentos no momento, podemos removê-lo para simplificar.

        2 - Construtor Vazio:
            - Tod0 Fragment precisa de um construtor público vazio. Este é mantido na simplificação.

        3 - Método onCreateView:
            - Este método infla o layout XML associado ao Fragment. Isso é essencial, pois define como a interface do Fragment será exibida.
     */

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
//     * @return A new instance of fragment CadastroTarefaFragment.
//     */
//    // TOD0: Rename and change types and number of parameters
//    public static CadastroTarefaFragment newInstance(String param1, String param2) {
//        CadastroTarefaFragment fragment = new CadastroTarefaFragment();
//        Bundle args = new Bundle();
//        args.putString(ARG_PARAM1, param1);
//        args.putString(ARG_PARAM2, param2);
//        fragment.setArguments(args);
//        return fragment;
//    }

//    @Override
//    public void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        if (getArguments() != null) {
//            mParam1 = getArguments().getString(ARG_PARAM1);
//            mParam2 = getArguments().getString(ARG_PARAM2);
//        }
//    }


}