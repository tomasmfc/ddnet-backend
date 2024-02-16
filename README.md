# ddnet-backend

Backend for a custom, better-looking and modified version of the [`DDNet`](https://ddnet.org/) website.

## Requirements

In order to run the backend, you will need to have installed:

* [JDK 17](https://www.oracle.com/uk/java/technologies/downloads/) (_Required for Maven_)
* [Apache Maven](https://maven.apache.org/download.cgi)
---
You can follow this guide for [installing Apache Maven](https://maven.apache.org/install.html).

To setup the environment variables mentioned in the guide, follow these steps:

1. Type `environment variables` in the search bar.

2. A small window should pop up called `System Properties`, navigate to the `Advanced` tab and click on the `Environment Variables...` button at the bottom.

3. Under `System variables`, locate the variable `Path` and double click on it to edit.

4. In the `Edit environment variable` window that pops up, click on `New`, then click on `Browse` and select the `bin` directory as mentioned in the guide.

5. Press `OK` if you see the correct directory in the list, and press `OK` again to exit.

## Setting Up Guide

1. Clone this repository into a local directory.

2. Navigate to this directory and run:

    ```bash
    mvn clean install
    ```
    to install dependencies for the project.

3. Then, to run the backend development server:

    ```bash
    mvn spring-boot:run
    ```

4. When both the frontend and backend servers are running, you can open [`http://localhost:3000`](http://localhost:3000) using your browser to see the result.

5. To close the backend, you can use `Ctrl+C` in the shell it's running from.

## Downloading DDNet Data

Currently, this project imports the whole DDNet database through an [SQLite](https://www.sqlite.org/index.html) file into the backend. This method is sufficient for now, but we could get a connection in real time to the DDNet database in the future.

Here are the steps for downloading and installing the DDNet database into this project:

1. Navigate to the backend directory and create a new folder called `data`.
2. Download the [DDNet database file](https://ddnet.org/stats/sql.js/) and extract it.
3. Cut the `ddnet.sqlite` SQLITE file from the extracted folder and paste it directly inside the `data` folder.

## Learn More

This project is built on [Spring Boot](https://spring.io/projects/spring-boot).

To learn more about Spring Boot, take a look at the following resources:

* [Spring Boot GitHub repository](https://github.com/spring-projects/spring-boot/) - the official Spring Boot repository.
* [Spring Boot Documentation](https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/) - learn more about Spring Boot.
* [Spring website](https://spring.io/) - contains several guides that show how to use Spring Boot step-by-step.
