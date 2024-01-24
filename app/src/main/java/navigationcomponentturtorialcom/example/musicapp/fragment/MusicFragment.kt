package navigationcomponentturtorialcom.example.musicapp.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import navigationcomponentturtorialcom.example.musicapp.R
import navigationcomponentturtorialcom.example.musicapp.adapter.MusicFragmentAdapter


class MusicFragment : Fragment() {
    private lateinit var musicTabLayout: TabLayout
    private lateinit var musicViewPager2: ViewPager2

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_music, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        musicTabLayout = view.findViewById(R.id.music_tab_layout)
        musicViewPager2 = view.findViewById(R.id.music_viewpager2)

        val musicAdapter = MusicFragmentAdapter(requireActivity().supportFragmentManager, lifecycle)
        musicViewPager2.adapter = musicAdapter

        TabLayoutMediator(musicTabLayout,musicViewPager2) { tab, pos ->
            when(pos) {
                0 -> {tab.text = "Playlist"}
                1 -> {tab.text = "Albums"}
                else -> {tab.text = "Artists"}
            }
        }.attach()
    }
}

