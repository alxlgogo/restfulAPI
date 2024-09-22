# Step 1: Clean and build the project
./mvnw clean package -DskipTests

# Step 2: Build the Docker image
docker build -t restfullap1:0.0.2 .

# Step 3: Stop and remove any existing container running the same app
docker stop restfullap1-002 || true
docker rm restfullap1-002 || true

# Step 4: Run the Docker container
docker run -d --name restfullap1-002 -p 8081:8081 restfullap1:0.0.2

# Display running containers
docker ps

