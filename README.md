
# Alchemy Game API
## Overview
This application will is for users to choose form different games and play.
We will build a fullstack application with 
this serving as the backend portion of the project. The API portion will handle many of the CRUD operations and will handle the task of establishing a connection to the database.

# Alchemy Gaming
## Overview 
Alchemy Gaming aims to create a one stop shop that meets the needs of all gamers. Players will need to create an account and login before they are able to access more features. Once logged in, players will be able to make the site their own as they select themes and customize their profiles. The site will have a vareiety of games for players to choose between to allow everyone a chance at a high leaderboard ranking.Each game will have various difficulty levels to choose from and upon winning a game, players will be rewarded with experience and tokens, Experience will be used to level up and tokens will be displayed on the players profile. Games can be quit and restarted at any point and players are encouraged to try increasing difficulties since tokens rewarded scale with difficulty. 

The backend of this application will use RESTful Java API to leverage the Spring Framework while the frontend UI will be built with React.

Some notable frameworks include: Spring (Spring MVC, Spring DATA JPA, Spring Web, Spring Boot DEV Tools, Spring Security) Log4J, JUnit, and OpenAPI

## User Stories
- [ ] Non-Users can create a user, employee or admin account.
- [ ] Signed in users can view the leaderboard.
- [ ] Signed in users can view which game they want to play.
- [ ] Select Game
- [ ] Players can pick difficulty(easy, medium, hard)
- [ ] Players can be upgraded to another level.
- [ ] Players type in chat while playing.
- [ ] Players can quit game.
- [ ] Players can win tokens after winning games.
- [ ] Players can level up in games.

## Stretch Goals

- [ ] Reward Nth user (100th player get a free level. up)
- [ ] Track players best game to display on profile.

- [ ] Reward Nth user (100th player get a free level up)
- [ ] Track players best game to display on profile
- [ ] Allow players to select themes for the site
- [ ] increase tokens depending on difficulty


## Data Models
### Leaderboard
- leaderboard Id
- title
- leaderboard Rank(User's rank on leaderboard)
- userName (User's username)
- Score (User's score)
- level (user's level)

### User
- userId
- userRole
- firstName
- lastName
- userName
- Password
- AuthToken

### Player
- playerId
- firstName
- lastName
- userName
- password
- rank
- tokens

### Game
- gameId
- Name
- Description


