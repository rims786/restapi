package team;

import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClient;

import java.util.List;

@RestController
@Log4j2
public class TeamController {

    private final RestClient restClient;

    public TeamController(RestClient.Builder restClient) {
        this.restClient = restClient
                .baseUrl("http://localhost:8081")
                .build();
        System.out.println("Team Controller");
    }

    @GetMapping("/")
    public List<String> getTeam() {
        log.info("Running on {}", Thread.currentThread().getName());
        System.out.println("Geting External API: Player");
        return restClient
                .get()
                .uri("/player")
                .retrieve()
                .toEntity(List.class)
                .getBody();

    }
}
