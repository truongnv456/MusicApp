package navigationcomponentturtorialcom.example.musicapp.remote

import com.google.firebase.Firebase
import com.google.firebase.firestore.firestore
import kotlinx.coroutines.tasks.await
import navigationcomponentturtorialcom.example.musicapp.entity.Song

class MusicDatabase {
    private val firestore = Firebase.firestore
    private val songCollection = firestore.collection("songs")

    suspend fun getAllSongs(): List<Song> {
        return try {
            songCollection.get().await().toObjects(Song::class.java)
        } catch (e: Exception) {
            emptyList<Song>()
        }
    }
}