cd into project root directory, then run `docker compose up`

Above will create postgress db and pgvector databases and bring them up

Then run below to start llama3 AI model in local docker environment

`docker pull ollama/ollama`

`CPU Only: docker run -d -v ollama:/root/.ollama -p 11434:11434 --name ollama ollama/ollama`

`docker exec -it ollama ollama arun llama3`
