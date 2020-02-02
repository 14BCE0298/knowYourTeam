# knowYourTeam
A REST based Web-Project to let users query Data about their favorite teams and players.The project is created using:
- JAVA 8
- MAVEN
- SPRING-BOOT
- MONGO DB
- SPRING

# APIs added
- GET: /knowYourTeam/{userId} -> Returns associated user
- POST: /knowYourTeam/ -> Takes in Body of details and saves it to DB, returns the saved data

# Running locally
1. Run docker container to get Mongo DB up: *docker run -d -p 27017-27019:27017-27019 --name mongodb mongo*
2. Run Application.java
