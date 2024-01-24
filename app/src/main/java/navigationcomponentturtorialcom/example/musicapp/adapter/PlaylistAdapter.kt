package navigationcomponentturtorialcom.example.musicapp.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import navigationcomponentturtorialcom.example.musicapp.R
import navigationcomponentturtorialcom.example.musicapp.entity.Playlist

class PlaylistAdapter(private val mPlaylistUsers: List<Playlist>) :
    RecyclerView.Adapter<PlaylistAdapter.PlayListViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlayListViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.item_playlist, parent, false)
        return PlayListViewHolder(view)
    }

    override fun onBindViewHolder(holder: PlayListViewHolder, position: Int) {
        holder.imgPlayList?.setImageResource(mPlaylistUsers[position].imageUrl)
        holder.tvTitlePlaylist?.text = mPlaylistUsers[position].title
        holder.tvSubtitlePlaylist?.text = mPlaylistUsers[position].subtitle
    }

    override fun getItemCount(): Int {
        return mPlaylistUsers.size
    }

    inner class PlayListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imgPlayList: ImageView? = null
        var tvTitlePlaylist: TextView? = null
        var tvSubtitlePlaylist: TextView? = null

        init {
            imgPlayList = itemView.findViewById(R.id.img_playlist)
            tvTitlePlaylist = itemView.findViewById(R.id.tv_title_playlist)
            tvSubtitlePlaylist = itemView.findViewById(R.id.tv_subtitle_playlist)
        }
    }
}