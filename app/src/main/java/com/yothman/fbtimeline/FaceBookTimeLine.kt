package com.yothman.fbtimeline

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.yothman.fbtimeline.databinding.ActivityFaceBookTimeLineBinding

class FaceBookTimeLine : AppCompatActivity() {
    lateinit var binding: ActivityFaceBookTimeLineBinding
    val postlist = mutableListOf<Post>()
    lateinit var adapter:PostsAdapter



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityFaceBookTimeLineBinding.inflate(layoutInflater);
        setContentView(binding.root)

        createPostList()
        adapter = PostsAdapter(postlist)

        binding.rcTimeLinePosts.adapter = adapter
    }

    private fun createPostList() {
        for(i in 1..10){
            postlist.add(Post(User(" YehiaOthman", R.drawable._742242), "#FREE PALESTINE", R.drawable.palestine, "21Hrs"))

    }
    }
}