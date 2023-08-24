package forum.dao;

import forum.model.Post;

import java.time.LocalDate;

public class ForumImpl implements Forum{

    Post[] posts;
    int size;

    public ForumImpl(){
        posts = new Post[0];
    }

    @Override
    public boolean addPost(Post post) {
        return false;
    }

    @Override
    public boolean removePost(int postId) {
        return false;
    }

    @Override
    public boolean updatePost(int postId, String content) {
        return false;
    }

    @Override
    public Post getPostById(int postId) {
        return null;
    }

    @Override
    public Post[] getPostsByAuthor(String author) {
        return new Post[0];
    }

    @Override
    public Post[] getPostsByAuthor(String author, LocalDate dateFrom, LocalDate dateTo) {
        return new Post[0];
    }

    @Override
    public int size() {
        return 0;
    }
}
