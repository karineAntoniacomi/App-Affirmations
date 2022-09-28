package com.example.affirmations

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.affirmations.adapter.ItemAdapter
import com.example.affirmations.data.Datasource
import com.example.affirmations.model.Affirmation

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize data.
        // instância da Datasource que chama o método loadAffirmations()
        // Armazene a lista retornada de afirmações em uma val com o nome myDataset.
        val myDataset = Datasource().loadAffirmations()

        // variável com o nome recyclerView. findViewById() para
        // encontrar uma referência ao RecyclerView no layout
        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)

        // nova instância ItemAdapter - espera dois parâmetros: o contexto (this) da atividade e as
        // afirmações em myDataset. Atribui o objeto ItemAdapter à propriedade adapter do recyclerView
        recyclerView.adapter = ItemAdapter(this, myDataset)

        // Use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        //  tamanho do layout do RecyclerView é fixo no layout da atividade, é possível
        //  definir o parâmetro setHasFixedSize do RecyclerView como true
        recyclerView.setHasFixedSize(true)
    }

}