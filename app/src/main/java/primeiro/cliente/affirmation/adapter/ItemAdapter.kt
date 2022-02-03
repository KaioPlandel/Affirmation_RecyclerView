package primeiro.cliente.affirmation.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import primeiro.cliente.affirmation.R
import primeiro.cliente.affirmation.model.Affirmation

class ItemAdapter(val context: Context, private val dataSet: List<Affirmation>):
    RecyclerView.Adapter<ItemAdapter.itemViewHolder>() {


    class itemViewHolder(private val view: View): RecyclerView.ViewHolder(view){

        val textView: TextView = view.findViewById(R.id.item_title)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): itemViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context).inflate(R.layout.list_item,parent,false)

        return itemViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: itemViewHolder, position: Int) {
        val item = dataSet[position]
        holder.textView.text = context.resources.getString(item.StringResourceId)
    }

    override fun getItemCount(): Int {
        return dataSet.size
    }
}