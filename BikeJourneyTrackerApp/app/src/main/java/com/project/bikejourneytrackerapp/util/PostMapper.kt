package com.project.bikejourneytrackerapp.util

import com.project.bikejourneytrackerapp.model.data.Post
import com.project.bikejourneytrackerapp.model.data.RedditResponse

class PostMapper {

    fun map(redditResponse: RedditResponse): List<Post> {
        val post = ArrayList<Post>()

        for ((data, _) in redditResponse.data.children) {
            post.add(Post(data.id, data.title, data.thumbnail, data.author, Common().secondsToDays(data.created.toInt()),data.created.toInt(), data.link_flair_text, data.ups.toString(), data.downs.toString(), data.num_comments.toString()))
        }
        return post
    }
}