# Alchemy Game API
## Overview
This application will is for users to choose form different games and play.
We will build a fullstack application with 
this serving as the backend portion of the project. The API portion will handle many of the CRUD operations and will handle the task of establishing a connection to the database.

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


