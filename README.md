### About ###
This is a multi repo project, with each one serving single responsibility as a service.

### REPOS ###
[Back-End](https://github.com/jhost94/TwitchRewardTracker-BackEnd)

[Front End - Twitch middleman](https://github.com/jhost94/)

[Front End - User management/dashboard](https://github.com/jhost94/)

[Front End - Application consumer/OBS browser source](https://github.com/jhost94/)

### Back End ###
The brains of the app.

# Tech trace
Java, Maven, Spring boot, Docker

### Front End ###

## Twitch middleman ##
This "speaks" directly with twitch, recives its callbacks, and its waiting for the webhooks responses

## User management/dashboard ##
This is where the user can manage its settings and/or account.
This is the user's "main hub".

## Application consumer/OBS browser source ##
Its only responsibility is to consume the backend and show what it has to show to the OBS.
