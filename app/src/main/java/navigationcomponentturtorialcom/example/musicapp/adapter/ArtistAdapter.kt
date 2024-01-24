package navigationcomponentturtorialcom.example.musicapp.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import navigationcomponentturtorialcom.example.musicapp.R
import navigationcomponentturtorialcom.example.musicapp.entity.Artists

class ArtistAdapter(private val mArtists: List<Artists>) :
    RecyclerView.Adapter<ArtistAdapter.ArtistViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ArtistViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.item_artist, parent, false)
        return ArtistViewHolder(view)
    }

    override fun onBindViewHolder(holder: ArtistViewHolder, position: Int) {
        holder.imgArtist?.setImageResource(mArtists[position].imgUrl)
        holder.tvArtistName?.text = mArtists[position].tvName
    }

    override fun getItemCount(): Int {
        return mArtists.size
    }

    inner class ArtistViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imgArtist: ImageView? = null
        var tvArtistName: TextView? = null

        init {
            imgArtist = itemView.findViewById(R.id.img_artist)
            tvArtistName = itemView.findViewById(R.id.tv_artist)
        }
    }
}