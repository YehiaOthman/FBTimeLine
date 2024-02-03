package com.yothman.fbtimeline

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class PostsAdapter(val postslist:List<Post>) :RecyclerView.Adapter<PostsAdapter.viewHolder>() {

    class viewHolder(viewposts:View) : RecyclerView.ViewHolder(viewposts){
        val profilepic = viewposts.findViewById<ImageView>(R.id.iv_profilepic)
        val profilename = viewposts.findViewById<TextView>(R.id.tv_username)
        val postDate = viewposts.findViewById<TextView>(R.id.tv_posttime)
        val postcontent = viewposts.findViewById<TextView>(R.id.tv_post)
        val postPic = viewposts.findViewById<ImageView>(R.id.iv_postpic)

        fun bind(post: Post){
            profilename.text = post.name.name
            profilepic.setImageResource(R.drawable._742242)
            postDate.text = post.date
            postcontent.text = post.content
            postPic.setImageResource(R.drawable.palestine)
        }



    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): viewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.timelinedata,parent,false)
        return viewHolder(view)

    }

    override fun getItemCount()  = postslist.size



    override fun onBindViewHolder(holder: viewHolder, position: Int) {
        val post = postslist.get(position)
        holder.bind(post)


    }


}