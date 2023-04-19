package fakemedia.backend.graphqlapi.controler;

import fakemedia.backend.graphqlapi.entities.Author;
import fakemedia.backend.graphqlapi.entities.Post;
import fakemedia.backend.graphqlapi.entities.PostInfo;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;

@Controller
public class PostController {

    @QueryMapping
    public Post getposts(@Argument String id) {
        System.out.println("get-posts    " + id);
        return Post.getById(id);
    }

    @SchemaMapping
    public PostInfo followed(Post post) {
        System.out.println("get-followed    " + post.followedId());
        return PostInfo.getById(post.followedId());
    }

    @SchemaMapping
    public PostInfo popular(Post post) {
        System.out.println("get-popular    " + post.popularId());
        return PostInfo.getById(post.popularId());
    }

    @SchemaMapping
    public PostInfo relatedToInterests(Post post) {
        System.out.println("get-relatedToInterests    " + post.relatedId());
        return PostInfo.getById(post.relatedId());
    }

    @SchemaMapping
    public Author author(PostInfo post) {
        System.out.println("get-author    " + post.authorId());
        return Author.getById(post.authorId());
    }
}
