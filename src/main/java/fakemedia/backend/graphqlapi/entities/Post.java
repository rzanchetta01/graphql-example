package fakemedia.backend.graphqlapi.entities;

import java.util.Arrays;
import java.util.List;

public record Post (String id, String followedId, String popularId, String relatedId){
    private static final List<Post> postList = Arrays.asList(
            new Post("post-1","followed-1", "popular-1", "related-1"),
            new Post("post-2","followed-2", "popular-2", "related-2"),
            new Post("post-3","followed-3", "popular-3", "related-2")
    );

    public static Post getById(String id) {
        return postList.stream()
                .filter(p -> p.id().equalsIgnoreCase(id))
                .findFirst()
                .orElse(postList.get(0));
    }
}
