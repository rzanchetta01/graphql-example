package fakemedia.backend.graphqlapi.entities;

import java.util.Arrays;
import java.util.List;

public record Author(String id, String name) {
    private static final List<Author> authorList = Arrays.asList(
      new Author("author-1", "author one"),
      new Author("author-2", "author two")
    );

    public static Author getById(String id) {
        return  authorList.stream()
                .filter(a -> a.id().equalsIgnoreCase(id))
                .findFirst()
                .orElse(null);
    }
}
