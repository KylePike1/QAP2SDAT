
Features:

Member Management
- Add a new member
- Retrieve all member details
- Delete a member

Search members by:
- Id
- Name
- Membership type
- Phone number
- List all members by a tournaments name
- List all members by a tournaments start date

Tournament Management
- Add a new tournament
- Retrieve all tournament details
- Delete a tournament

Search tournaments by:
- Id
- Start date
- Location
- List all members in a tournament


Running the Project with Docker:
- Docker installed on your machine
- MySQL configured

Set up Enivornment
- Create your DockerFile
- Create your docker-compose.yml file and configure the image name for your api, 
your MySQL database name, and your password.

Build and Run Docker Containers

Step 1: Build the Docker Images:
- docker build -t golf-club-api .

Step 2: Run the Docker Containers:
- docker compose up
