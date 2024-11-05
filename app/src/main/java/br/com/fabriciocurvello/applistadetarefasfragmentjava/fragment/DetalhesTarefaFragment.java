package br.com.fabriciocurvello.applistadetarefasfragmentjava.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import br.com.fabriciocurvello.applistadetarefasfragmentjava.R;
import br.com.fabriciocurvello.applistadetarefasfragmentjava.model.Tarefa;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link DetalhesTarefaFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class DetalhesTarefaFragment extends Fragment {

    private Tarefa tarefa;

    private TextView tvNomeTarefa;
    private TextView tvDataTarefa;
    private TextView tvLocalTarefa;
    private TextView tvDescricaoTarefa;
    private Button btVoltar;

    // TOD0: Rename and change types and number of parameters
    public static DetalhesTarefaFragment newInstance(Tarefa tarefa) {
        DetalhesTarefaFragment fragment = new DetalhesTarefaFragment();
        Bundle args = new Bundle();
        args.putSerializable("tarefa", tarefa);
        fragment.setArguments(args);
        return fragment;
    }

    public DetalhesTarefaFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_detalhes_tarefa, container, false);
        tvNomeTarefa = view.findViewById(R.id.tv_nome_tarefa);
        tvDataTarefa = view.findViewById(R.id.tv_data_tarefa);
        tvLocalTarefa = view.findViewById(R.id.tv_local_tarefa);
        tvDescricaoTarefa = view.findViewById(R.id.tv_descricao_tarefa);
        btVoltar = view.findViewById(R.id.bt_voltar);

        if (getArguments() != null) {
            tarefa = (Tarefa) getArguments().getSerializable("tarefa");

            tvNomeTarefa.setText(tarefa.getNomeTarefa());
            tvDataTarefa.setText(tarefa.getData());
            tvLocalTarefa.setText(tarefa.getLocal());
            tvDescricaoTarefa.setText(tarefa.getDescricao());
        }

        btVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Volta para o fragmento anterior na pilha
                getActivity().getSupportFragmentManager().popBackStack();
            }
        });

        return view;

//        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_detalhes_tarefa, container, false);
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
//     * @return A new instance of fragment DetalhesTarefaFragment.
//     */


//    @Override
//    public void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        if (getArguments() != null) {
//            mParam1 = getArguments().getString(ARG_PARAM1);
//            mParam2 = getArguments().getString(ARG_PARAM2);
//        }
//    }


}