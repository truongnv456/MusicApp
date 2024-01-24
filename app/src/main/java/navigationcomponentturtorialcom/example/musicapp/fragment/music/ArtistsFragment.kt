package navigationcomponentturtorialcom.example.musicapp.fragment.music

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import navigationcomponentturtorialcom.example.musicapp.R
import navigationcomponentturtorialcom.example.musicapp.adapter.ArtistAdapter
import navigationcomponentturtorialcom.example.musicapp.entity.Artists

class ArtistsFragment : Fragment() {
    private lateinit var rcvArtists: RecyclerView
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_artists, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val mArtists = mutableListOf<Artists>()
        mArtists.add(Artists(R.drawable.img, "Sing 1"))
        mArtists.add(Artists(R.drawable.img, "Sing 2"))
        mArtists.add(Artists(R.drawable.img, "Sing 3"))
        mArtists.add(Artists(R.drawable.img, "Sing 4"))
        mArtists.add(Artists(R.drawable.img, "Sing 5"))
        mArtists.add(Artists(R.drawable.img, "Sing 6"))

        rcvArtists = view.findViewById(R.id.rcv_artists)
        val artistAdapter = ArtistAdapter(mArtists)
        rcvArtists.adapter = artistAdapter
        rcvArtists.layoutManager = GridLayoutManager(requireActivity(), 2)
    }
}