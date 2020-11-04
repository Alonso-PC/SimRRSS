package cl.simulacion5.RestComponent;

import java.util.List;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import cl.simulacion5.entity.Post;

@Component
public class PostRestComponent {

	public List<Post> getPosts() {
		
		List<Post> p = null;
		
		final String uri = "https://jsonplaceholder.typicode.com/posts";
		RestTemplate restTemplate = new RestTemplate();

		ResponseEntity<List<Post>> postResponse = restTemplate.exchange(uri, HttpMethod.GET, null,
				new ParameterizedTypeReference<List<Post>>()  {
				});
		p = postResponse.getBody();
		
		return p;
		
	}
	
}
