package navigationcomponentturtorialcom.example.musicapp.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import navigationcomponentturtorialcom.example.musicapp.fragment.music.AlbumsFragment
import navigationcomponentturtorialcom.example.musicapp.fragment.music.ArtistsFragment
import navigationcomponentturtorialcom.example.musicapp.fragment.music.PlaylistFragment

class MusicFragmentAdapter(fragmentManager: FragmentManager, lifecycle: Lifecycle) :
    FragmentStateAdapter(fragmentManager, lifecycle) {
    override fun getItemCount(): Int = 3

    override fun createFragment(position: Int): Fragment {
        // Return a NEW fragment instance in createFragment(int).
        return when (position) {
            0 -> PlaylistFragment()
            1 -> AlbumsFragment()
            else -> ArtistsFragment()
        }
    }
}