# graphql-querry example

### query postDetails {
	getposts(id: "post-1") {
	    id
		followed {
			id
			title
			content
			author {
				id
				name
			}
		}
		popular {
			id
			title
			content
			author {
				id
				name
			}
		}
		relatedToInterests {
			id
			title
			content
			author {
				id
				name
			}
		}
	}


# output expected
### output {
	"data": {
		"getposts": {
			"id": "post-1",
			"followed": {
				"id": "followed-1",
				"title": "title-1",
				"content": "content-1",
				"author": {
					"id": "author-1",
					"name": "author one"
				}
			},
			"popular": {
				"id": "popular-1",
				"title": "title-4",
				"content": "content-4",
				"author": {
					"id": "author-2",
					"name": "author two"
				}
			},
			"relatedToInterests": {
				"id": "related-1",
				"title": "title-7",
				"content": "content-7",
				"author": {
					"id": "author-2",
					"name": "author two"
				}
			}
		}
	}
