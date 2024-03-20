# Simple-springboot-GitHubActions-CICD

This repository covers the main steps of the orchestration of a Docker Container of a very simple Spring Boot Application using the following DevOps technologies: <br>

<ul>
  <li> <b>Maven: </b>For compiling and building the application.</li>
  <li> <b>Docker: </b>For the containerization of the application using a <b><a href = "https://github.com/khadijaelm24/Simple-springboot-GitHubActions-CICD/blob/master/Dockerfile">Dockerfile</a></b> and <b>DockerHub account</b> for the management of repository and its tags.</li>
  <li> <b>Kubernetes: </b>For the orchestration of the Docker Container using a Kubernetes Cluster.</li>
  <li> <b>GitHub Actions: </b>For the automation of the workflow's execution using the file <a href = "https://github.com/khadijaelm24/Simple-springboot-GitHubActions-CICD/blob/master/.github/workflows/maven.yml">maven.yml</a> that contains all steps of the creation of a CI/CD pipeline, from building to deployment.</li>
</ul>
