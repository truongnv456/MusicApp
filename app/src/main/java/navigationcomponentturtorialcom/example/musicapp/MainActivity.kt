package navigationcomponentturtorialcom.example.musicapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.core.view.GravityCompat
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import navigationcomponentturtorialcom.example.musicapp.fragment.HomeFragment
import navigationcomponentturtorialcom.example.musicapp.fragment.MusicFragment
import navigationcomponentturtorialcom.example.musicapp.fragment.PersonFragment
import navigationcomponentturtorialcom.example.musicapp.fragment.SearchFragment

class MainActivity : AppCompatActivity() {
    private lateinit var bottomNavigationView: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bottomNavigationView = findViewById(R.id.bottom_navigation_view)
        bottomNavigationView.setOnItemSelectedListener { menuItem ->
            handleNavigationItemSelected(menuItem)
            true
        }

        replaceFragment(HomeFragment())
        bottomNavigationView.menu.findItem(R.id.action_home).setChecked(true)
    }

    private fun handleNavigationItemSelected(item: MenuItem) {
        // lấy ID mục đã chọn
        val itemId = item.itemId

        // Xử lý tương ứng với ID của mục được chọn
        when (itemId) {
            R.id.action_home -> {
                // Xử lý khi chọn mục 1
                replaceFragment(HomeFragment())
            }

            R.id.action_music -> {
                // Xử lý khi chọn mục 2
                replaceFragment(MusicFragment())
            }

            R.id.action_search -> {
                // Xử lý khi chọn mục 3
                replaceFragment(SearchFragment())
            }

            R.id.action_person -> {
                // Xử lý khi chọn action person
                replaceFragment(PersonFragment())
            }
        }
    }

    private fun replaceFragment(fragment: Fragment): Boolean {
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, fragment)
            .addToBackStack(null)
            .commit()

        return true
    }
}