package cl.simulacion5.RestComponent;

import java.util.List;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import cl.simulacion5.entity.Comment;

@Component
public class CommentRestComponent {

	public List<Comment> getComments() {
		
		List<Comment> p = null;
		
		final String uri = "https://jsonplaceholder.typicode.com/comments";
		RestTemplate restTemplate = new RestTemplate();

		ResponseEntity<List<Comment>> commentResponse = restTemplate.exchange(uri, HttpMethod.GET, null,
				new ParameterizedTypeReference<List<Comment>>()  {
				});
		p = commentResponse.getBody();
		
		return p;
		
	}
	
}
