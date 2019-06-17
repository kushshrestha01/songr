# Lab 12: Spring MVC with Databases
This lab consist of basic setup for spring boot application

## Setup
1. Lab 11 code was used
2. Following dependencies were added:<br/>
dependencies {<br/>
	compile 'org.springframework.boot:spring-boot-starter-data-jpa'
	implementation('org.springframework.boot:spring-boot-starter-thymeleaf')
	implementation('org.springframework.boot:spring-boot-starter-web')
	runtimeOnly('org.postgresql:postgresql')
	testImplementation('org.springframework.boot:spring-boot-starter-test')
}

## Feature Tasks 

### Create an Album Model
Album model was created. Album properties has a title, an artist, a songCount, a length (in seconds), and an imageUrl that is a link to that album’s art.

### Album data render to front end
A data base was created with the Album properties

### A user should be able to add albums to the site.
Form was created for user to add the Album properties then it was saved to album repository. Then the data was saved to songr database and rendered to front end. 


## Instructions to run the app
1. In terminal run ./gradlew bootrun
2. Go to localhost:8080/albums should return all the album data with a form to add new Album properties
3. If new Album data is submitted it will display with other album data. 
4. localhost:8080/songs will show all the songs and form to add new song
5. localhost:8080/albums/{album} where{album} is a album name will show the album with all the songs in it.