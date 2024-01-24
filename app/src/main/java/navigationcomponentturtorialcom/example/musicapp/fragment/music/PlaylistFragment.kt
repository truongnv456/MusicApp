package navigationcomponentturtorialcom.example.musicapp.fragment.music

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import navigationcomponentturtorialcom.example.musicapp.R
import navigationcomponentturtorialcom.example.musicapp.adapter.PlaylistAdapter
import navigationcomponentturtorialcom.example.musicapp.entity.Playlist

class PlaylistFragment : Fragment() {
    private lateinit var rcvPlaylist: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_playlist, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        rcvPlaylist = view.findViewById(R.id.rcv_playlist)
        val mPlaylist = mutableListOf<Playlist>()
        mPlaylist.add(Playlist(R.drawable.img,"Con mua ngang qua","Son Tung MTP"))
        mPlaylist.add(Playlist(R.drawable.img,"Con mua ngang qua","Son Tung MTP"))
        mPlaylist.add(Playlist(R.drawable.img,"Con mua ngang qua","Son Tung MTP"))
        mPlaylist.add(Playlist(R.drawable.img,"Con mua ngang qua","Son Tung MTP"))
        mPlaylist.add(Playlist(R.drawable.img,"Con mua ngang qua","Son Tung MTP"))
        mPlaylist.add(Playlist(R.drawable.img,"Con mua ngang qua","Son Tung MTP"))
        mPlaylist.add(Playlist(R.drawable.img,"Con mua ngang qua","Son Tung MTP"))

        val playlistAdapter = PlaylistAdapter(mPlaylist)
        rcvPlaylist.adapter = playlistAdapter
        rcvPlaylist.layoutManager = LinearLayoutManager(requireActivity())
    }
}