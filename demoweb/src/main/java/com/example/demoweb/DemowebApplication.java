package com.example.demoweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemowebApplication {

	//test để coi dữ liệu có vào không - hiện tại đang fail
	/*
	private final PostRepository repo;

	@Autowired
	public DemowebApplication(PostRepository repo) {
		this.repo = repo;
	}

	public void run(String...args) throws Exception{
		repo.save(new Post("a","d","d", new String[]{"1","d"}));

		for(Post post : repo. findAll())
		{
			System.out.println("post");
		}
	}*/

	public static void main(String[] args) {
		SpringApplication.run(DemowebApplication.class, args);
	}
}
