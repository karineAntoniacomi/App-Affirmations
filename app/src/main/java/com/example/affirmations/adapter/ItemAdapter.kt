package com.example.affirmations.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.affirmations.R
import com.example.affirmations.model.Affirmation

// Adapter for the [RecyclerView] in [MainActivity]. Displays [Affirmation] data object.
class ItemAdapter(
    private val context: Context,
    private val dataset: List<Affirmation>
) : RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {

    // Provide a reference to the views for each data item. Complex data items may
    // need more than one view per item, and you provide access to all the views
    // for a data item in a view holder. Each data item is just an Affirmation object.
    // Classe aninhada - usada apenas pelo ItemAdapter
    class ItemViewHolder(private val view: View): RecyclerView.ViewHolder(view) {
        val textView: TextView = view.findViewById(R.id.item_title)
        val imageView: ImageView = view.findViewById(R.id.item_image)
    }

    // Create new views (invoked by the layout manager)
    // método onCreateViewHolder() é chamado pelo gerenciador de layout para
    // criar novos armazenadores de visualização para o RecyclerView
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        //  instância do LayoutInflater com o contexto (context do parent)
        // create a new view
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item, parent, false)

        // método onCreateViewHolder(), retorna uma nova instância do
        // ItemViewHolder em que a visualização raiz seja o adapterLayout
        return ItemViewHolder(adapterLayout)
    }

    // Replace the contents of a view (invoked by the layout manager)
    //  método chamado pelo gerenciador de layout para substituir o
    //  conteúdo de uma visualização de item de lista.
    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        // val que acessa o item na position especificada no dataset
        val item = dataset[position]

        // atualiza o armazenador de visualização para mostrar a string de afirmação
        holder.textView.text = context.resources.getString(item.stringResourceId)

        // define o imageResourceId do item da afirmação no ImageView da visualização do item da lista
        holder.imageView.setImageResource(item.imageResourceId)
    }

    // Return the size of your dataset (invoked by the layout manager)
    //  método getItemCount() precisa retornar o tamanho do conjunto de dados
    // que estão na propriedade dataset transmitida ao construtor do ItemAdapter
    override fun getItemCount(): Int {
        return dataset.size
    }
}