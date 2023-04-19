package fakemedia.backend.graphqlapi.entities;

import java.util.Arrays;
import java.util.List;

public record PostInfo(String id, String title, String content, String authorId) {
    private static final List<PostInfo> postInfoList = Arrays.asList(
            new PostInfo("followed-1", "title-1", "content-1", "author-1"),
            new PostInfo("followed-2", "title-2", "content-2", "author-2"),
            new PostInfo("followed-3", "title-3", "content-3", "author-1"),
            new PostInfo("popular-1", "title-4", "content-4", "author-2"),
            new PostInfo("popular-2", "title-5", "content-5", "author-1"),
            new PostInfo("popular-3", "title-6", "content-6", "author-2"),
            new PostInfo("related-1", "title-7", "content-7", "author-2"),
            new PostInfo("related-2", "title-8", "content-8", "author-1")
    );

    public static PostInfo getById(String id) {
        return postInfoList.stream()
                .filter(p -> p.id().equalsIgnoreCase(id))
                .findFirst()
                .orElse(null);
    }
}
